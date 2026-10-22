package com.ytgld.moonstone.datagen;

import net.minecraft.data.PackOutput;
import static com.ytgld.moonstone.item.InitItems.*;

public class ZHCNLanguageProvider extends LanguageProviderBase {
    public ZHCNLanguageProvider(PackOutput output) {
        super(output, "zh_cn");
    }



    @Override
    protected void addTranslations() {
        addCurioLang("man", "玩家基因");
        addCurioLang("crystal", "水晶","佩戴水晶时");
        addCurioLang("dna", "基因", "植入DNA时");
        addCurioLang("dnabush", "分段基因组", "分段基因组");
        addCurioLang("medicine", "药物", "佩戴时");
        addCurioLang("ncrdna", "基因片段", "佩戴时");
        addCurioLang("necora", "异种基因", "佩戴时");
        addCurioLang("stone", "符石", "佩戴符石后");
        addCurioLang("nightmare", "噩梦之槽", "佩戴物品时：");
        addCurioLang("zombie", "僵尸侍从插槽", "装备侍从饰品时");
        addItem(nightmare_base_fool, "愚者之危");
        addItemTooltip(nightmare_base_fool, "愚者之危的伤害处罚判定由5提高到14", "愚者之危的生命处罚判定由2提高到9", "每佩戴一件饰品，治疗增加%d%%", "每佩戴一件噩梦饰品，生命值增加%d");
    }
}
