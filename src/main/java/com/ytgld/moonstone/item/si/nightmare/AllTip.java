package com.ytgld.moonstone.item.si.nightmare;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

import java.util.Map;

public interface AllTip {
    Map<Integer, Component> tooltip();

    Map<Integer, String> element(ItemStack stack);

}
