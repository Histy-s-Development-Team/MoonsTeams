package com.ytgld.moonstone.item.si.nightmare;

import com.mojang.blaze3d.vertex.PoseStack;
import com.ytgld.moonstone.event.NewEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ToolTip implements ClientTooltipComponent, TooltipComponent {
    private static final int CJK_GLYPH_WIDTH = 9;
    private final AllTip allTip;
    private final ItemStack stack;

    public ToolTip(AllTip contents, ItemStack stack) {
        this.allTip = contents;
        this.stack = stack;
    }

    @Override
    public int getHeight() {
        return this.backgroundHeight() + 6;
    }

    @Override
    public int getWidth(@NotNull Font font) {
        return Math.max(this.backgroundWidth(), this.textWidth(font));
    }

    public static boolean useCjkLayout() {
        return "zh_cn".equals(Minecraft.getInstance().getLanguageManager().getSelected());
    }

    private int textWidth(Font font) {
        int width = font.width(Component.translatable("tooltip.moonstone.abyss_blessing"));
        Map<Integer, Component> stringMap = allTip.tooltip();
        if (stringMap != null) {
            for (Component component : stringMap.values()) {
                width = Math.max(width, font.width(component));
            }
        }
        return width;
    }

    private int backgroundWidth() {
        return this.gridSizeX() * 64;
    }

    private int backgroundHeight() {
        Map<Integer, String> map = allTip.element(stack);
        if (map != null) {
            return map.size() * 16;
        } else {
            return 32;

        }
    }

    @Override
    public void renderImage(Font font, int x, int y, GuiGraphics guiGraphics) {
        int i = this.gridSizeX();
        int j = this.gridSizeY();
        int s = 0;
        int us = 0;
        for (int l = 0; l < j; ++l) {
            for (int i1 = 0; i1 < i; ++i1) {
                int k1 = y + l * 32;
                s++;
                us += 10;
                this.renderSlot(font, x, k1, guiGraphics, s, us);
            }
        }
    }
    private void renderSlot(Font font, int x, int y, GuiGraphics guiGraphics, int ss, int yOFfSize) {
        drString(font, x, y, guiGraphics, ss, yOFfSize, 255, 1, Component.translatable("tooltip.moonstone.abyss_blessing"));
        for (int i = 0; i < 10; i++) {
            drString(font, x, y, guiGraphics, ss, yOFfSize, 100 - i * 10, 1 + i / 25f, Component.empty());
        }
    }

    private void drString(Font font, int x, int y, GuiGraphics guiGraphics, int i, int yOFfSize, int a, float size, Component hand) {
        i--;
        int frameCounter = (int) NewEvent.time;
        Map<Integer, Component> stringMap = allTip.tooltip();
        PoseStack poseStack = guiGraphics.pose();
        guiGraphics.drawString(font, hand, x, y, ARGB.color(255, 255, 50, 50), false);
        poseStack.pushPose();
        if (stringMap != null) {
            Integer integer = stringMap.keySet().stream().toList().get(i);
            Component component = stringMap.get(integer);

            List<Component> chars = new ArrayList<>();
            component.visit((style, text) -> {
                text.codePoints().forEach(cp -> chars.add(Component.literal(Character.toString(cp)).withStyle(style)));
                return Optional.empty();
            }, Style.EMPTY);

            boolean cjk = useCjkLayout();
            int cursorX = 0;
            for (int j = 0; j < chars.size(); j++) {
                Component character = chars.get(j);
                int charWidth = font.width(character);
                int glyphX = cjk ? j * charWidth : cursorX;
                cursorX += charWidth;
                float step = cjk ? j : glyphX / (float) CJK_GLYPH_WIDTH;
                float angle = (frameCounter % 360 + step * 10) * (float) Math.PI / 180;
                float scale = size + 0.1f * (float) Math.sin(angle);
                float offsetX = (float) Math.sin(angle) * 0.65f;
                float offsetY = (float) Math.cos(angle) * 0.65f;
                float pivotX = x + glyphX + (cjk ? 0 : charWidth / 2f);
                float pivotY = y + yOFfSize + (cjk ? 0 : font.lineHeight / 2f);

                poseStack.pushPose();
                poseStack.translate(pivotX, pivotY, 0);
                poseStack.translate(offsetX, offsetY, 0);
                poseStack.scale(scale, scale, 0);
                poseStack.translate(-pivotX, -pivotY, 0);
                int b = (int) (step * 22);
                if (b > 255) {
                    b = 255;
                }

                guiGraphics.drawString(font, character,
                        (int) (x + glyphX + offsetX),
                        (int) (y + yOFfSize + offsetY),
                        ARGB.color(a, 255, b / 4, b),
                        false);
                poseStack.popPose();
            }
        }
        poseStack.popPose();
    }

    private int gridSizeX() {
        Map<Integer, String> map = allTip.element(stack);
        if (map != null) {
            return map.size();
        } else return 0;
    }

    public static class ARGB {
        public static int color(int alpha, int red, int green, int blue) {
            return (alpha << 24) | (red << 16) | (green << 8) | blue;
        }
    }

    private int gridSizeY() {
        return 1;
    }
}
