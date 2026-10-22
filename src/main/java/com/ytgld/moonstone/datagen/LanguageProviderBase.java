package com.ytgld.moonstone.datagen;

import com.ytgld.moonstone.Moonstone;
import net.minecraft.data.PackOutput;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredHolder;

public abstract class LanguageProviderBase extends LanguageProvider {
    public LanguageProviderBase(PackOutput output, String langCode) {
        super(output, Moonstone.MODID, langCode);
    }

    protected <T extends Item> void addItem(DeferredHolder<Item, T> item, String lang) {
        add(item.value(), lang);
    }

    public void addItemTooltip(DeferredHolder<Item, ? extends Item> itemHolder, String firstLine, String... additionalLines) {
        var id = "item." + itemHolder.getId().getPath();

        var toolTipBase = id + ".tool.string";

        add(toolTipBase, firstLine);

        for (int i = 0; i < additionalLines.length; i++) {
            add(id + toolTipBase + "." + (i + 1) , additionalLines[i]);
        }
    }

    public void addCurioLang(String unique, String identifiervalue, String modifiervalue) {
        add("curios.identifier." + unique, identifiervalue);
        if(modifiervalue != null) {
            add("curios.modifier." + unique, modifiervalue);
        }
    }
    public void addCurioLang(String unique, String identifiervalue) {
        addCurioLang(unique, identifiervalue, null);
    }

    protected <T extends EntityType<?>> void addEntityType(DeferredHolder<EntityType<?>, T> entityTypeTDeferredHolder, String lang) {
        add(entityTypeTDeferredHolder.get(), lang);
    }

}
