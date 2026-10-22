package com.ytgld.moonstone.datagen;

import com.ytgld.moonstone.enttiy.EntityTs;
import net.minecraft.data.PackOutput;

import static com.ytgld.moonstone.item.InitItems.*;

public class ZHCNLanguageProvider extends LanguageProviderBase {
    public ZHCNLanguageProvider(PackOutput output) {
        super(output, "zh_cn");
    }



    @Override
    protected void addTranslations() {
        // Advancements
        addAdvancement("apple", "倾斜的天平", "获得这个物品");
        addAdvancement("beacon", "灵质信标", "现在，我们真正荣辱与共了。");
        addAdvancement("blood", "一血", "获得血球");
        addAdvancement("blood_magic_box", "魔物末日", "获得血之魔盒");
        addAdvancement("blood_snake", "血之审判", "获得蛇血魔符");
        addAdvancement("blood_sun", "血日东升", "获得血日");
        addAdvancement("bloodvirus", "暗影瘟疫", "使用暗影基因右键necora病毒,之后在开取末地的箱子获取之后的物品");
        addAdvancement("botton", "铁罐子", "使用暗影基因右键医药箱");
        addAdvancement("brain", "莫里斯的脑子", "冒心的脑子");
        addAdvancement("calcification", "皮肤质钙化", "受到350次伤害");
        addAdvancement("candle", "永恒的痛苦", "修正死兆的诅咒，但代价是什么？");
        addAdvancement("catalyzer", "暗影基因", "在完成所有医药箱的任务后杀死末影龙");
        addAdvancement("disintegrating_stone", "The sky is falling apart", "Get this item");
        addAdvancement("ectoplasmball", "灵质球", "杀死怪物");
        addAdvancement("ectoplasmcloub", "灵质云", "怪物的末日");
        addAdvancement("ectoplasmcube", "灵质立方", "用尸体堆积成的棱镜");
        addAdvancement("ectoplasmprism", "灵质棱镜", "成山的尸体堆积成的棱镜");
        addAdvancement("ectoplasmsoul", "没有灵魂的灵质立方", "那还叫灵质立方吗");
        addAdvancement("ectoplasmstar", "灵质幸运星", "神话直呼内行");
        addAdvancement("ectoplasmstone", "灵质！", "获得开局的灵质石头");
        addAdvancement("ectoplasmtree", "灵质树", "心中的树");
        addAdvancement("end_bone", "坚不可摧！", "获得这个物品");
        addAdvancement("falling_immortals", "希望之火的熄灭", "获得这个物品");
        addAdvancement("hidden_blade", "未知的刀锋", "获得这个物品");
        addAdvancement("hypocritical_self_esteem", "不要摧毁弱者的自尊", "获得这个物品");
        addAdvancement("immortal", "步入轮回", "“当你获得了这无与伦比的神力...你会选择去结束一切...还是承受无尽的轮回之苦?”");
        addAdvancement("masticatory", "咬合肌强化", "吃8金苹果");
        addAdvancement("max_blood_cube", "注视我！", "制作复仇之骰");
        addAdvancement("max_blood_eye", "总有改变的时候", "制作校准之眼");
        addAdvancement("max_eye", "无懈可击！", "获得无懈之眼");
        addAdvancement("max_sword", "吃我一斧！", "获得诺克萨斯纹章");
        addAdvancement("maxamout", "原始纹章", "在拥有红色，蓝色，绿色符石的情况下杀死远古守卫者!");
        addAdvancement("medicinebox", " 医药箱", "佩戴此物品的情况下完成一些无聊的任务");
        addAdvancement("mhead", "莫里斯头颅", "绝对的虚无缥缈与边缘化");
        addAdvancement("necora", "僵尸病毒", "在佩戴此物品的情况下开取地牢箱子");
        addAdvancement("nightmare_base", "噩梦基座", "最好是佩戴它");
        addAdvancement("nightmare_base_black_eye", "永远凝视", "获得邪念之窥眸");
        addAdvancement("nightmare_base_black_eye_eye", "不详因子", "获得肉瘤");
        addAdvancement("nightmare_base_black_eye_heart", "无休止的痛苦", "获得死心之胚");
        addAdvancement("nightmare_base_black_eye_red", "真刺激啊！", "获得这个口红");
        addAdvancement("nightmare_base_fool", "抉择", "获得这个物品");
        addAdvancement("nightmare_base_fool_betray", "为什么会这样", "获得这个物品");
        addAdvancement("nightmare_base_fool_bone", "史莱姆有骨头吗", "获得这个物品");
        addAdvancement("nightmare_base_fool_soul", "历史长河", "获得这个物品");
        addAdvancement("nightmare_base_insight", "蹉跎之苦", "获得这个物品");
        addAdvancement("nightmare_base_insight_collapse", "崩解之力", "获得这个物品");
        addAdvancement("nightmare_base_insight_drug", "长生者", "获得这个物品");
        addAdvancement("nightmare_base_insight_insane", "战神之石", "获得这个物品");
        addAdvancement("nightmare_base_redemption", "谣言", "获得这个物品");
        addAdvancement("nightmare_base_redemption_deception", "尘封的谣言", "获得这个物品");
        addAdvancement("nightmare_base_redemption_degenerate", "暗影的赞歌", "获得这个物品");
        addAdvancement("nightmare_base_redemption_down_and_out", "历史长河", "获得这个物品");
        addAdvancement("nightmare_base_reversal", "轮回", "获得这个物品");
        addAdvancement("nightmare_base_reversal_card", "反转再反转", "获得这个物品");
        addAdvancement("nightmare_base_reversal_mysterious", "神秘的尸体", "获得这个物品");
        addAdvancement("nightmare_base_reversal_orb", "拙劣的演技", "获得这个物品");
        addAdvancement("nightmare_base_start", "”仙人“", "获得这个物品");
        addAdvancement("nightmare_base_start_egg", "懒蛋一个", "获得这个物品");
        addAdvancement("nightmare_base_start_pod", "不灭花，不灭果", "获得这个物品");
        addAdvancement("nightmare_base_start_power", "崩解之力", "获得这个物品");
        addAdvancement("nightmare_base_stone", "噩梦的方尖碑", "获得死兆方尖碑");
        addAdvancement("nightmare_base_stone_brain", "疯狂大脑", "获得末世之脑");
        addAdvancement("nightmare_base_stone_meet", "噩梦降至", "获得绝望共鸣");
        addAdvancement("nightmare_base_stone_virus", "融合体", "获得Nightecora病毒");
        addAdvancement("nightmareeye", "深渊之眼", "佩戴深渊之眼的情况下开取地牢，矿井，远古城市的箱子来获取之后的物品.....");
        addAdvancement("polyphagia", "食欲亢进", "吃附魔金苹果");
        addAdvancement("quadriceps", "四头肌强化", "跳跃500次");
        addAdvancement("reanimation", "细胞重生", "死掉");
        addAdvancement("ring", "一寸光阴一寸金", "获得这个物品");
        addAdvancement("the_prison_of_sin", "好奇心害死猫", "获得罪孽囚笼");
        addAdvancement("tricky_puppets", "咯咯吱吱", "获得这个物品");
        addAdvancement("twistedstone", "扭曲。。。", "获得开局的扭曲石头");
        addAdvancement("wind_and_rain", "疾风骤雨", "在拥有七剑修罗之心和骤雨的情况下开取远古城市的箱子！");
        addAdvancement("wolf", "一叶孤舟", "获得这个物品");

        // Item names
        addItem(acidic_reflux, "酸性液体逆流");
        addItem(adrenaline, "肾上腺素激增");
        addItem(air, "大气亲和性");
        addItem(ambush, "漂流发酵");
        addItem(apple, "倾斜异果");
        addItem(as_amout, "七剑修罗·剑阵之章");
        addItem(atpoverdose, "ATP 过量");
        addItem(autolytic, "自溶性抑制");
        addItem(badgeofthedead, "亡灵徽章");
        addItem(battery, "电池");
        addItem(beacon, "灵质信标");
        addItem(biggreedcrystal, "大贪婪水晶");
        addItem(bigwarcrystal, "大战争水晶");
        addItem(blackeorb, "黑魔球");
        addItem(blood, "血球");
        addItem(blood_amout, "血符");
        addItem(blood_candle, "封魔烛台");
        addItem(blood_god, "神血祖符");
        addItem(blood_jelly, "血浆果冻");
        addItem(blood_magic_box, "血之魔盒");
        addItem(blood_snake, "蛇血魔符");
        addItem(blueamout, "蓝色符石");
        addItem(bone_cell, "骨细胞增生");
        addItem(bone_or_god, "血祭神颅");
        addItem(Book_, "月之石指南");
        addItem(brain, "莫里斯的脑子");
        addItem(calcareous, "钙质化");
        addItem(calcification, "药物 - 皮肤质钙化");
        addItem(candle, "邪异古烛");
        addItem(cell, "细胞重生");
        addItem(cell_blood, "嗜血性饥渴");
        addItem(cell_boom, "自爆");
        addItem(cell_calcification, "皮肤钙质化");
        addItem(cell_mummy, "木乃伊干尸化");
        addItem(consciousness, "融合意识");
        addItem(cytopathic_boost, "细胞变性促进");
        addItem(dead_drder, "死亡之令");
        addItem(defend_against_runestone, "抵御符石");
        addItem(disgusting_cells, "厌氧细胞");
        addItem(doomeye, "七剑修罗之心");
        addItem(doomswoud, "骤雨");
        addItem(EarthAffinity, "土地亲和");
        addItem(ectoplasmapple, "灵质果");
        addItem(ectoplasmball, "灵质球");
        addItem(ectoplasmbattery, "灵质电池");
        addItem(ectoplasmcloub, "灵质云");
        addItem(ectoplasmcube, "灵质立方");
        addItem(ectoplasmhorseshoe, "灵质马蹄");
        addItem(ectoplasmprism, "灵质棱镜");
        addItem(ectoplasmshild, "灵质盾牌");
        addItem(ectoplasmsoul, "没有灵魂的灵质立方");
        addItem(ectoplasmstar, "灵质幸运星");
        addItem(ectoplasmtree, "灵质树");
        addItem(end_bone, "末世脊骨");
        addItem(evil_mob, "邪念体");
        addItem(evilcandle, "邪恶蜡烛");
        addItem(fermentation, "埋伏性狩猎");
        addItem(flag_of_protest, "死亡抗拒");
        addItem(fortunecrystal, "财富水晶");
        addItem(frontal_lobe, "额叶突变");
        addItem(giant, "巨人僵尸基因片段");
        addItem(giant_nightmare, "梦魇巨人基因片段");
        addItem(god_acidic_reflux, "酸性液体逆流");
        addItem(GodAmbush, "漂流发酵");
        addItem(GodAtpoverdose, "ATP过量");
        addItem(GodAutolytic, "自溶性抑制");
        addItem(GodFermentation, "埋伏性狩猎");
        addItem(god_hypertrophy, "蚓状肌强化");
        addItem(god_lead, "血虐之铅");
        addItem(god_naja_mortis, "眼镜蛇式锁定");
        addItem(god_peptide_surge, "肽合成增强");
        addItem(GodPutrefactive, "腐败抗性");
        addItem(GodRegenerative, "再生活性化");
        addItem(greedamout, "绿色符石");
        addItem(greedcrystal, "贪婪水晶");
        addItem(hidden_blade, "归隐刀锋之刃");
        addItem(high_energy, "ATP高能量");
        addItem(hypertrophy, "蚓状肌强化");
        addItem(hypocritical_self_esteem, "虚伪的自尊");
        addItem(immortal, "不朽轮回之印章");
        addItem(killer, "终结者头骨");
        addItem(lead, "罡风重铅");
        addItem(luck_ring, "幸运魔戒");
        addItem(luck_stone, "幸运石头");
        addItem(magiceye, "机械眼");
        addItem(magicstone, "神奇石头");
        addItem(magnet, "磁铁");
        addItem(malice_die, "恶意之殇");
        addItem(masticatory, "药物 - 咬合肌强化");
        addItem(max_eye, "无懈之眼");
        addItem(maxamout, "原始纹章");
        addItem(mayhemcrystal, "混乱水晶");
        addItem(mbattery, "莫里斯电池");
        addItem(mblock, "莫里斯方块");
        addItem(mbottle, "莫里斯药品");
        addItem(mbox, "莫里斯盒子");
        addItem(medicinebox, "医药箱");
        addItem(meye, "莫里斯眼睛");
        addItem(mhead, "莫里斯头颅");
        addItem(million, "七剑修罗·万法");
        addItem(mkidney, "莫里斯的玻璃肾结石");
        addItem(morb, "莫里斯珍珠");
        addItem(mother_cell, "子母细胞");
        addItem(motor, "运动控制强化");
        addItem(mring, "莫里斯戒指");
        addItem(mshell, "莫里斯贝壳");
        addItem(naja_mortis, "眼镜蛇式锁定");
        addItem(nano_box, "天机魔盒");
        addItem(nanocube, "纳米立方");
        addItem(nanorobot, "纳米机器人");
        addItem(necora, "Necora病毒");
        addItem(NightmareBaseItem_, "噩梦基座");
        addItem(nightmare_base_black_eye, "邪念之窥眸");
        addItem(nightmare_base_black_eye_eye, "惶恐肉瘤");
        addItem(nightmare_base_black_eye_heart, "死心之胚");
        addItem(nightmare_base_black_eye_red, "罪恶之红唇");
        addItem(nightmare_base_fool, "愚者之危");
        addItem(nightmare_base_fool_betray, "夺舍挂坠");
        addItem(nightmare_base_fool_bone, "危险的头骨");
        addItem(nightmare_base_fool_soul, "幽怨之魂");
        addItem(nightmare_base_insight, "噩梦洞悉者");
        addItem(nightmare_base_insight_collapse, "瓦解魔镜");
        addItem(nightmare_base_insight_drug, "疯狂灵药");
        addItem(nightmare_base_insight_insane, "癫狂之石");
        addItem(nightmare_base_redemption, "“救赎”");
        addItem(nightmare_base_redemption_deception, "欺骗");
        addItem(nightmare_base_redemption_degenerate, "堕落");
        addItem(nightmare_base_redemption_down_and_out, "落魄");
        addItem(nightmare_base_reversal, "颠倒之物");
        addItem(nightmare_base_reversal_card, "不稳卡片");
        addItem(nightmare_base_reversal_mysterious, "神秘之物");
        addItem(nightmare_base_reversal_orb, "反转球体");
        addItem(nightmare_base_start, "噩梦之起始");
        addItem(nightmare_base_start_egg, "起源卵蛋");
        addItem(nightmare_base_start_pod, "不灭苞荚");
        addItem(nightmare_base_start_power, "愕然的权力");
        addItem(nightmare_base_stone, "死兆方尖碑");
        addItem(nightmare_base_stone_brain, "末世之脑");
        addItem(nightmare_base_stone_meet, "绝望共鸣");
        addItem(nightmare_base_stone_virus, "Nightecora病毒");
        addItem(nightmare_clay, "梦魇粘土");
        addItem(NightmareVirus_, "噩梦之霍乱");
        addItem(obsidianring, "黑曜石戒指");
        addItem(OceanAffinity, "海洋亲和");
        addItem(owner_blood_attack_eye, "血灵咒");
        addItem(owner_blood_boom_eye, "苦力");
        addItem(owner_blood_earth, "乾坤");
        addItem(owner_blood_effect_eye, "判官");
        addItem(owner_blood_eye, "渎圣者");
        addItem(owner_blood_speed_eye, "刻画者");
        addItem(owner_blood_vex, "鬼者");
        addItem(parasitic_cell, "寄生性僵尸细胞");
        addItem(peptide_surge, "肽合成增强");
        addItem(polyphagia, "药物 - 食欲亢进");
        addItem(putrefactive, "腐败抗性");
        addItem(quadriceps, "药物 - 四头肌强化");
        addItem(rage_crystal, "血怒水晶");
        addItem(rage_crystal_big, "大血怒水晶");
        addItem(rage_crystal_max, "战神晶体");
        addItem(reanimation, "药物 - 细胞重生");
        addItem(redamout, "红色符石");
        addItem(regenerative, "再生活性化");
        addItem(revive_runestone, "复苏符石");
        addItem(ring, "灵念药戒");
        addItem(rotten_gourd, "腐香芦");
        addItem(soulbattery, "灵魂电池");
        addItem(soulcube, "灵魂立方");
        addItem(spliced_activation, "活性化叠接");
        addItem(strengthen_runestone, "强化符石");
        addItem(supreme_power, "掌权者");
        addItem(surge, "肾上腺素激增");
        addItem(sword_amout, "剑影之章");
        addItem(the_blood_book, "封魔录");
        addItem(the_divine_fall_ring, "神陨·天启之戒");
        addItem(the_heart, "富饶之心");
        addItem(the_prison_of_sin, "罪孽囚笼");
        addItem(thedoomstone, "末日之石");
        addItem(thefruit, "上古果实");
        addItem(thermo_necro, "热力分解抑制");
        addItem(tricky_puppets, "诡响木偶");
        addItem(twelve_sword, "诸神剑阵");
        addItem(twistedamout, "诺克萨斯纹章");
        addItem(undead_blood_charm, "决裁者徽章");
        addItem(warcrystal, "战争水晶");
        addItem(WarmApproachable, "大气亲和");
        addItem(watergen, "海洋亲和性");
        addItem(whiteorb, "白魔球");
        addItem(wind, "疾风");
        addItem(wolf, "孤狼");

        // Item tooltips
        addItemTooltip(adrenaline,
                "召唤的僵尸继承你的攻击力",
                "和移动速度");
        addItemTooltip(air, "在空中时增加20%的抗性");
        addItemTooltip(ambush, "可以行走在液体表面");
        addItemTooltip(apple,
                "最大生命值固定为%s",
                "受到的伤害固定为%s",
                "攻击伤害固定为%s");
        addItemTooltip(autolytic, "抑制Necora病毒带来的游泳速度减少效果");
        addItemTooltip(badgeofthedead, "对亡灵生物的伤害提高25％");
        addItemTooltip(beacon,
                "Every 30 seconds, clear all the effects of your own potion and synchronously add the potion effects to all creatures within the surrounding 5 grid range.",
                "把药水效果同步添加给攻击目标,并造成范围效果");
        addItemTooltip(biggreedcrystal, "+2 时运");
        addItemTooltip(blackeorb, "增加白魔球的属性");
        addItemTooltip(blood_amout, "受伤召唤血灵");
        addItemTooltip(blood_candle,
                "按下绑定按键召唤一个巨型血灵增生体协助你作战",
                "如果丢失/失踪，请重新佩戴此物品或按下快捷键",
                "血灵增生体的攻击会造成基于你10%最大生命值和攻击属性的伤害");
        addItemTooltip(blood_magic_box, "杀死生物获得它们的血液");
        addItemTooltip(blood_snake,
                "杀死生物发射3条会造成150%伤害的血蛇",
                "血蛇数量会随着生物的最大生命值来增加",
                "但不超过10条",
                "-20% 伤害");
        addItemTooltip(blueamout,
                "攻击时有概率削弱敌人",
                "受伤时有概率获得抗性提升II效果");
        addItemTooltip(bone_cell, "巨型细胞僵尸在召唤时会获得召唤者70%的护甲值");
        addItemTooltip(Book_, "看看书里有什么！佩戴后+1饰品栏！");
        addItemTooltip(brain, "攻击一个生物5次后，第六次造成2.25倍的伤害");
        addItemTooltip(calcification,
                "*使实验者的皮肤钙化，增强实验者的战斗能力",
                "增加11％伤害抵抗",
                "受到350次伤害");
        addItemTooltip(candle,
                "满生命值时受到的伤害增加1000%",
                "但是始终保留1点生命值",
                "根据满生命值时受到的伤害获得无敌保护",
                "每10点生命值获得0.05秒（不超过5秒）",
                "在任何无敌保护期间",
                "伤害和治疗提高%s%%",
                "免除死兆方尖碑的受伤处罚");
        addItemTooltip(cell_blood, "僵尸获得吸血能力，并且每次攻击都会延长自身寿命");
        addItemTooltip(cell_boom, "你和和僵尸在死后会产生一次剧烈爆炸");
        addItemTooltip(cell_calcification, "僵尸获得你50%的护甲和生命值加成");
        addItemTooltip(cell_mummy, "有效降低生成的僵尸其腐化速度");
        addItemTooltip(disgusting_cells, "巨型细胞僵尸的存活时间提高100%");
        addItemTooltip(doomeye, "受伤召唤7把飞剑攻击敌人");
        addItemTooltip(doomswoud,
                "击中生物造成2把飞剑",
                "每增加20%的速度增加1把飞剑",
                "杀死生物立即召唤4把飞剑");
        addItemTooltip(ectoplasmapple, "受到攻击会使周围生物受到2%最大生命值的伤害");
        addItemTooltip(ectoplasmhorseshoe, "减少90%来自摔落的伤害");
        addItemTooltip(ectoplasmstar,
                "每1点幸运增加1%的攻速和0.5%的伤害",
                "+20 幸运");
        addItemTooltip(end_bone,
                "满血时速度减少50%，受到的伤害减少80%",
                "满血时受到的伤害会以%s%%的比例反弹给攻击者");
        addItemTooltip(evilcandle,
                "熔岩行者",
                "抵挡80%熔岩伤害",
                "快速熄灭你身上火焰");
        addItemTooltip(fermentation,
                "10秒冷却",
                "冷却期间，伤害降低70％",
                "冷却结束后，伤害提升300％",
                "*病原体依然保有狩猎的本能，这使它们能耐心等待，并给予致命一击！");
        addItemTooltip(fortunecrystal, "+3 时运");
        addItemTooltip(giant_nightmare,
                "杀死生物有概率召唤梦魇巨人",
                "增加冷却时间,召唤的一瞬间你将损失50%当前生命值");
        addItemTooltip(GodAmbush, "增加10%抗性");
        addItemTooltip(GodPutrefactive,
                "食用食物获得大量增益BUFF",
                "食用食物恢复10%最大生命值");
        addItemTooltip(GodRegenerative, "每隔0.75秒恢复1点生命值");
        addItemTooltip(god_sword_,
                "在你的后面将漂浮神者剑魂",
                "他会缓慢恢复能量护盾，最大存储12面护盾",
                "护盾遭受攻击时，消耗能量并对攻击者造成250%的当量伤害并造成大量负面效果",
                "玩家将获得大量增益效果",
                "每有一面护盾都将每秒恢复玩家1%的最大生命值",
                "剑魂会附近目标并每次造成10%玩家攻击属性的伤害",
                "伤害会逐渐增加，剑魂的激光造成伤害相当于玩家发起了攻击");
        addItemTooltip(greedamout,
                "攻击时有概率吸取生命",
                "受伤时有概率获得伤害吸收效果");
        addItemTooltip(greedcrystal, "+1 时运");
        addItemTooltip(hypocritical_self_esteem,
                "附近每存在一个实体你都会获得下列加强",
                "如果你承受了邪念之窥眸的诅咒..那么：",
                "   撕咬附近的生物，每0.5秒造成20%你的面板伤害",
                "   每多一个目标，伤害提高20%",
                "   每次撕咬都会吸取生命值并对目标造成削弱");
        addItemTooltip(immortal,
                "受到攻击有80%的概率规避并反弹50%的伤害给攻击者",
                "如果攻击者生命值大于70%，则反弹150%的伤害并破除无敌帧",
                "每隔5秒对周围生物施加一层枯朽Buff，最多达到5级",
                "被施加的生物每级减少20%抗性,护甲,治疗和5%的伤害,移速,攻速",
                "若你被杀死，则对攻击者造成20%当前生命值的穿透伤害并附加10级枯朽（10秒）",
                "深渊和噩梦物品无效化",
                "传闻掌握生死轮回之力的人...",
                "即可规避因果的反噬...",
                "但...代价是什么？");
        addItemTooltip(magiceye,
                "在你攻击生物的半径四格内的所有生物",
                "将受到50％的范围伤害");
        addItemTooltip(magnet, "吸引半径8格内的掉落物");
        addItemTooltip(masticatory,
                "*使实验者咬合肌强化，增强实验者的咀嚼能力",
                "减少50％进食时长",
                "吃8个金苹果");
        addItemTooltip(max_eye,
                "杀死生物获得血液",
                "最多储存4点",
                "当你拥有血液时，你将减少90%受到伤害",
                "但每次受到伤害你都会减少一滴血液、",
                "时间推移，血量也会被你吸收并恢复10%最大生命值");
        addItemTooltip(maxamout,
                "获得三色符石的所有能力！",
                "减少15%受到伤害",
                "受伤时有概率获得伤害吸收效果",
                "增加5%吸血",
                "There is a probability that during an attack, the enemy will be knocked away and slowed down.",
                "And obtain the power effect",
                "受到伤害后将返还20%给进攻者",
                "免疫挖掘疲劳效果",
                "增加75%游泳速度");
        addItemTooltip(mbattery,
                "僵尸害怕你",
                "对僵尸的伤害提高50%",
                "+2 时运",
                "+2 抢夺");
        addItemTooltip(mblock,
                "+1 时运",
                "+1 抢夺");
        addItemTooltip(mbottle,
                "存在虚弱时：",
                "+2 抢夺",
                "存在挖掘疲劳时",
                "+2 时运");
        addItemTooltip(medicinebox,
                "如果你找到一些好的药物…",
                "或许我可以给你打造一个全新的身体…",
                "佩戴此物品，可以通过一些方式获取药物",
                "你可以选择将发现的药物融合或直接佩戴",
                "*必须佩戴此物品才能发现药物！",
                "我感受到强烈的嗜血欲望......",
                "我想我得杀死一头末影龙......",
                "尝尝医药箱的味道如何！你会+1药物栏位！！",
                "佩戴时可在战利品箱子里发现独特的嵌入基因");
        addItemTooltip(meye, "使半径10格内的亡灵生物发光");
        addItemTooltip(mhead,
                "多数生物不会主动攻击你",
                "Target speed increases and recovers after taking your damage");
        addItemTooltip(mkidney,
                "受伤时有概率免除伤害",
                "第一次百分百，第二次百分之五十，第三次百分之二十五",
                "以此类推",
                "免除失败你将额外受到最大生命33%的伤害",
                "同时此物品将进入10秒的冷却");
        addItemTooltip(morb,
                "+1 经验掉落",
                "+50% 额外经验掉落");
        addItemTooltip(mother_cell, "巨型细胞僵尸在召唤时会额外产生2个细胞僵尸，并有50%的概率再召唤一个巨人僵尸");
        addItemTooltip(motor, "增加15%在空中，水下，陆地的所有速度");
        addItemTooltip(mring,
                "+100% 被击退距离",
                "+40% 治疗");
        addItemTooltip(mshell,
                "-25% 来自亡灵生物的伤害",
                "-10% 造成的伤害");
        addItemTooltip(nano_box,
                "Shift状态下，对周围生物造成闪电攻击",
                "可以使用电池增幅或改装");
        addItemTooltip(nanocube,
                "每隔30秒修复自身盔甲30点耐久值",
                "佩戴电池后冷却减少30%");
        addItemTooltip(nanorobot,
                "每隔30秒修复主手手持物品30点耐久",
                "佩戴电池后冷却减少30%");
        addItemTooltip(necora,
                "丧尸化带来的5条诅咒：",
                "*你对水感到恐惧；游泳速度大幅降低",
                "*阳光下你将燃烧；或许戴点什么在头上能暂时解决这个麻烦",
                "*你的身躯逐渐散发腐臭；人类村民惧怕你，铁傀儡视你为敌人",
                "*能够辨别同类；对亡灵造成的伤害减少20％",
                "*一旦植入该病毒，将没有回头路！",
                "丧尸化带来的5条强化：",
                "*你的身躯更加坚硬了；伤害增加3点、抗性增加10%",
                "*难以被元素影响；受到的魔法伤害减少70％",
                "*任何生物都将被你撕碎成腐肉，吃下它们，你会获得额外的效果！",
                "*你被同类视为领主；亡灵生物对你造成的伤害减少50％",
                "*细胞活性大大提高；提高50％生命恢复",
                "该病原体尚未被归类",
                "且早期医学报告中，表明它具有",
                "强大的再生能力和无休止的进食需求",
                "但是它的大部分基因结构仍然是未解之谜");
        addItemTooltip(NightmareBaseItem_,
                "攻击伤害,生命值,护甲减少30%",
                "邪念体，血虐之铅，恶意之殇无效化");
        addItemTooltip(nightmare_base_black_eye,
                "看向生物视力模糊，随时间恢复",
                "但是你可以解锁下列物品");
        addItemTooltip(nightmare_base_black_eye_eye,
                "被注视的生物会无法移动",
                "同时他会获得大量负面BUFF",
                "当你看向任意生物时，你会获得%s%%的伤害加成");
        addItemTooltip(nightmare_base_black_eye_heart,
                "附近的生物受到的伤害提高至%s%%",
                "他们恢复的生命值会到你身上",
                "且他们不再会受到任何治疗");
        addItemTooltip(nightmare_base_black_eye_red,
                "每次杀死生物都会使所有属性增加3%",
                "最多增加%s%%",
                "这些属性会随时间减少");
        addItemTooltip(nightmare_base_fool,
                "从2件开始，每多佩戴一件饰品都会使生命值减少1%",
                "从5件开始，每多佩戴一件饰品都会使伤害减少2%",
                "伤害和生命值惩罚不高于50%");
        addItemTooltip(nightmare_base_fool_betray,
                "使附近的部分类型生物主动投靠于你",
                "投靠的生物获得与你一致的正面BUFF",
                "被夺舍侍从的主人将损失10%最大生命值",
                "每夺舍一个目标，冷却增加5秒");
        addItemTooltip(nightmare_base_fool_bone,
                "如果一个生物的攻击目标是你",
                "那么你对他的伤害增加%s%%",
                "并且攻击有30%的概率破除无敌帧");
        addItemTooltip(nightmare_base_fool_soul,
                "愚者之危的伤害处罚判定由5提高到14",
                "愚者之危的生命处罚判定由2提高到9",
                "每佩戴一件饰品，治疗增加%s%%",
                "每佩戴一件噩梦饰品，生命值增加%s");
        addItemTooltip(nightmare_base_insight,
                "附魔台附魔等级减少1级",
                "附魔台附魔等级减少50%");
        addItemTooltip(nightmare_base_insight_collapse, "通用饰品栏的数量加倍");
        addItemTooltip(nightmare_base_insight_drug,
                "伤害,护甲,生命值提高100%",
                "但是每佩戴一件饰品，此奖励都将减少8%");
        addItemTooltip(nightmare_base_insight_insane,
                "当你斩杀生物时",
                "根据死亡的生物的强度恢复生命值",
                "并且下一击的伤害提高%s%%");
        addItemTooltip(nightmare_base_redemption, "增加15%噩梦基座的属性衰败");
        addItemTooltip(nightmare_base_redemption_deception,
                "抵御必死伤害，恢复所有生命值",
                "并获得7秒的无敌和平息附近生物的怒火，冷却60秒");
        addItemTooltip(nightmare_base_redemption_degenerate,
                "免疫魔法伤害",
                "免疫坠落伤害",
                "免疫火焰伤害");
        addItemTooltip(nightmare_base_redemption_down_and_out, "减少%s%%噩梦基座的属性衰败，若减少至负数，则转变成正属性加成");
        addItemTooltip(nightmare_base_reversal_mysterious, "以减少10%全属性的代价抑制噩梦基座的负面效果");
        addItemTooltip(nightmare_base_start,
                "护甲无效化",
                "每次受伤都会强制减少1点生命值",
                "生命值低于10点时不会触发");
        addItemTooltip(nightmare_base_start_egg,
                "幸运加%s",
                "所有伤害加%s%%",
                "治疗加%s%%");
        addItemTooltip(nightmare_base_start_pod, "抗性提高20%");
        addItemTooltip(nightmare_base_start_power,
                "每存在一个正面药水状态",
                "你的所有属性提高%s%%");
        addItemTooltip(nightmare_base_stone,
                "满生命值时受到的伤害增加500%",
                "但是你可以解锁下列物品",
                "10秒冷却");
        addItemTooltip(nightmare_base_stone_brain,
                "满血时伤害减少100%",
                "非满血状态伤害提高50%",
                "非满血状态抗性提高50%");
        addItemTooltip(nightmare_base_stone_virus,
                "伤害增加%s%%",
                "治疗增加%s%%",
                "暴击增加%s%%",
                "受到任意伤害都会额外附加10%最大生命值的惩罚,不受任何加成影响");
        addItemTooltip(parasitic_cell, "巨型细胞僵尸在死后诞生5个细胞僵尸");
        addItemTooltip(polyphagia,
                "吃一个附魔金苹果",
                "吃下食物恢复7%最大生命值");
        addItemTooltip(putrefactive, "增加腐肉的效果");
        addItemTooltip(quadriceps,
                "*使实验者四头肌强化，增强实验者的运动能力",
                "增加20％移动速度",
                "增加50％跳跃高度",
                "跳 500 次");
        addItemTooltip(reanimation,
                "*使实验者细胞强化，增强实验者的细胞重生能力",
                "同时恢复重要器官的低等功能",
                "复活",
                "300秒冷却",
                "死掉");
        addItemTooltip(redamout,
                "攻击时有概率击飞敌人",
                "然后暂时获得力量II的效果");
        addItemTooltip(regenerative,
                "每1.5秒恢复一点生命值",
                "*病原体的细胞比过去更加鲜活");
        addItemTooltip(ring,
                "永恒的力量,抗性.生命恢复,急迫,生命提升",
                "每获得一种3级及以上的药水状态",
                "减少10%药水持续时间",
                "任何药水效果结束，你将恢复4点生命值",
                "若药水状态为负面，则恢复10%最大生命值");
        addItemTooltip(soulbattery, "+25％ 暴击伤害");
        addItemTooltip(sword_amout,
                "你的攻击速度会随着斩击次数的增加而增加，但不会超过100%",
                "但是你的伤害会逐渐减少，最多降低到原先的33%",
                "全力攻击时不会造成无敌帧保护",
                "当你的斩击次数到达10时，每次攻击都会造成范围效果");
        addItemTooltip(the_blood_book,
                "血灵增生体的伤害增加200%",
                "血灵增生体的血珠速度增加100%",
                "血灵增生体的血珠会爆炸",
                "血灵增生体的射击速度增加100%",
                "血灵增生体的血珠寿命降低70%",
                "自带刻画者和渎圣者的所有功能",
                "血灵增生体每次命中都相当于你发起了一次攻击");
        addItemTooltip(the_heart,
                "右键物品存入心脏当中，可存入4种(不可叠加)",
                "如果生物的掉落物是心脏里物品的某一项",
                "那么该掉落物数量乘以3",
                "不可以移除心脏内部物品");
        addItemTooltip(the_prison_of_sin,
                "自佩戴以来，你杀死了：",
                "-80% 护甲，最大生命值",
                "+10% 全部属性",
                "每杀死1种不同的生物，此奖励都将有所增加",
                "无法取下",
                "属性提高了：",
                "你还无法参悟它的本质",
                "无限制的能力增长和超强的适应能力",
                "但...代价是什么?");
        addItemTooltip(thedoomstone,
                "你的攻击将施加黑暗效果",
                "将以攻击生物为中心，对存在黑暗效果的生物造成音爆攻击",
                "被波及的生物将持续受到负面效果的影响");
        addItemTooltip(thefruit,
                "食用后：",
                "免疫发光效果",
                "监守者感觉你很亲近！",
                "深渊之眼将克服这些效果");
        addItemTooltip(tricky_puppets,
                "允许你标记半径20格内的容器方块",
                "被标记的方块会随着你与其距离的减少而发出光照",
                "你可以穿透方块看到它们");
        addItemTooltip(twistedamout,
                "每次攻击都有概率生成一个血球围绕你旋转",
                "当血球数量超过8时",
                "下一次斩击将造成4倍伤害",
                "血球会随着时间的流失而被你吸收",
                "每次吸收都会恢复一定的百分比生命值",
                "每颗血球提供5%的伤害加成",
                "血球爆炸时对3格内的生物造成中毒效果",
                "杀死生物后再获得1~3颗血球");
        addItemTooltip(watergen, "在水中时增加15%的抗性");
        addItemTooltip(wind, "连续奔跑增加速度");
        addItemTooltip(wolf,
                "每杀死一种生物都会增加一定的生命和伤害",
                "你对曾被你杀死的生物造成额外25%的伤害",
                "标记附近被你巡抚的单位",
                "每次受伤都会转移到它们身上，若单位死亡则物品进入5秒冷却");

        // Entities
        addEntityType(EntityTs.cell_giant, "巨型细胞僵尸");
        addEntityType(EntityTs.cell_zombie, "细胞僵尸");
        addEntityType(EntityTs.flysword, "飞剑");
        addEntityType(EntityTs.owner_blood_, "巨型血灵增生体");

        // Abyss blessing tooltips
        add("tooltip.moonstone.abyss_blessing", "深渊的赐福：");
        add("item.nightmare_base_black_eye.blessing.1", "带上它 你将免疫黑暗");
        add("item.nightmare_base_black_eye.blessing.2", "带上它 你将免疫失明");
        add("item.nightmare_base_redemption.blessing.1", "主啊 请赐予我力量");
        add("item.nightmare_base_redemption.blessing.2", "增加十的伤害 生命 护甲");
        add("item.nightmare_base_reversal.blessing.1", "轮回之路注定坎坷");
        add("item.nightmare_base_reversal.blessing.2", "复活时给予十秒无敌");
        add("item.nightmare_base_fool.blessing.1", "你似乎得到了两级的时运加成");
        add("item.nightmare_base_fool.blessing.2", "你似乎得到了两级的抢夺加成");
        add("item.nightmare_base_start.blessing.1", "你被赐予了异常的恢复能力");
        add("item.nightmare_base_start.blessing.2", "增加百分之五十治疗");
        add("item.nightmare_base_insight.blessing.1", "你感受到了另类的气息");
        add("item.nightmare_base_insight.blessing.2", "增加百分之百经验掉落");
        add("item.nightmare_base_stone.blessing.1", "这是试炼  磨练你的意志");
        add("item.nightmare_base_stone.blessing.2", "生命值越低 各方面属性越高");

        // Curio slots
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

        // Everything else
        add("advancements.tooltip.cell.all.text", "宝藏战利品，需要佩戴Necora病毒");
        add("advancements.tooltip.dna.text", "又是无聊的事情");
        add("advancements.tooltip.evil_blood.text", "打开深渊的媒介");
        add("advancements.tooltip.fungus.text", "在佩戴培养皿并有虚弱效果的情况下杀蘑菇牛");
        add("advancements.tooltip.germ.text", "佩戴培养皿在远古城市找到");
        add("advancements.tooltip.giant.text", "装备necora病毒并杀死监守者");
        add("advancements.tooltip.necora.all.text", "地牢/矿井战利品类型，需要佩戴Necora病毒");
        add("advancements.tooltip.nightmare.all.text", "地牢战利品类型，需要佩戴深渊之眼");
        add("advancements.tooltip.parasite.text", "佩戴培养皿并吃下：生鳕鱼，生鲑鱼，生牛肉，生羊肉，生猪肉，生兔子肉，热带鱼，鸡肉，在吃下任意食物");
        add("advancements.tooltip.the_heart.text", "宝藏物品");
        add("advancements.tooltip.virus.text", "佩戴培养皿并存在虚弱效果时被凋零骷髅击打");
        add("allevent.moonstone.virus", "已采集DNA : ");
        add("attrib.moonstone.critical", "暴击");
        add("attribute.name.moonstone.all_attack", "通用伤害");
        add("attribute.name.moonstone.allattack", "通用伤害");
        add("attribute.name.moonstone.break_speed", "挖掘速度");
        add("attribute.name.moonstone.cit", "暴击伤害");
        add("attribute.name.moonstone.dig", "挖掘速度");
        add("attribute.name.moonstone.heal", "治疗");
        add("attribute.name.moonstone.hurt", "受到伤害");
        add("attribute.name.moonstone.nightmare_shield", "梦魇护盾容量");
        add("attribute.name.moonstone.nightmare_stronger", "梦魇护盾强度");
        add("attribute.name.moonstone.owner_blood_attack_damage", "血灵攻击伤害");
        add("attribute.name.moonstone.owner_blood_attack_speed", "血灵攻击间隔");
        add("attribute.name.moonstone.owner_blood_blood_speed", "血灵血珠速度");
        add("attribute.name.moonstone.speed", "通用速度");
        add("attribute.name.moonstone.zombie_attack_damage", "僵尸的伤害");
        add("death.attack.abyss.message", "你受到了深渊的侵蚀");
        add("death.attack.sword_damage.message", "你被飞剑刺穿了");
        add("effect.moonstone.blade", "锋芒");
        add("effect.moonstone.blood", "流血");
        add("effect.moonstone.dead", "枯朽");
        add("effect.moonstone.debilitating", "衰弱");
        add("effect.moonstone.elements", "元素");
        add("effect.moonstone.fear", "恐惧");
        add("effect.moonstone.hidden", "隐藏");
        add("effect.moonstone.invulnerable", "无懈可击");
        add("effect.moonstone.life", "锁血");
        add("effect.moonstone.life_apple", "锁血");
        add("effect.moonstone.meet", "增生");
        add("effect.moonstone.pain", "痛苦");
        add("effect.moonstone.rage", "重伤");
        add("enchantment.moonstone.malice", "恶意");
        add("enchantment.moonstone.terror", "恐怖");
        add("enchantment.moonstone.threat", "威胁");
        add("entity.moonstone.blood_bat", "暗影蝠");
        add("entity.moonstone.blood_orb_owner", "怨念合并体");
        add("entity.moonstone.cell_slime", "史莱姆细胞僵尸");
        add("entity.moonstone.line", "血灵之线");
        add("entity.moonstone.nightmare_entity", "深渊立方");
        add("entity.moonstone.nightmare_giant", "梦魇巨人");
        add("entity.moonstone.small_zombie", "僵尸侍从");
        add("entity.moonstone.suddenrain", "雨刃");
        add("entity.moonstone.sun", "末日之灵");
        add("error.moonstone.dna_box", "检测到未知物品ID");
        add("item.acid.tool.string", "你的侍从更容易死亡，但是每次死亡都会使主人获得大量buff");
        add("item.anaerobic_cell.tool.string", "梦魇巨人的存活时间提高50%");
        add("item.as_amout.tool.string.1", "攻击时从目标背后发射7把飞剑");
        add("item.as_amout.tool.string.2", "飞剑可以存在20秒");
        add("item.as_amout.tool.string.3", "前10秒会尝试攻击生物");
        add("item.as_amout.tool.string.4", "后10秒会尝试飞向玩家");
        add("item.as_amout.tool.string.5", "这些飞剑附带10%玩家攻击属性");
        add("item.as_amout.tool.string.6", "若拾取飞剑，则恢复5%最大生命值");
        add("item.as_amout.tool.string.7", "冷却5秒");
        add("item.at_a_book.tool.string.2", "每秒有30%的概率增加1点修行值");
        add("item.at_a_book.tool.string.lvl.1", "金仙");
        add("item.at_a_book.tool.string.lvl.10", "圣玄");
        add("item.at_a_book.tool.string.lvl.11", "圣君");
        add("item.at_a_book.tool.string.lvl.12", "圣尊");
        add("item.at_a_book.tool.string.lvl.2", "金仙");
        add("item.at_a_book.tool.string.lvl.3", "仙尊");
        add("item.at_a_book.tool.string.lvl.4", "仙帝");
        add("item.at_a_book.tool.string.lvl.5", "炼神");
        add("item.at_a_book.tool.string.lvl.6", "天神");
        add("item.at_a_book.tool.string.lvl.7", "主神");
        add("item.at_a_book.tool.string.lvl.8", "天劫");
        add("item.at_a_book.tool.string.lvl.9", "合道");
        add("item.atrophy.tool.string", "使僵尸侍从具有极强的攻击性");
        add("item.bat_cell.tool.string", "损失生命值时有15%召唤一只暗影蝠");
        add("item.bat_cell.tool.string.1", "召唤后减少15%的当前生命值");
        add("item.bat_cell.tool.string.2", "损失的生命值越多，暗影蝠的伤害越高");
        add("item.batgene.tool.string", "你附近的蝙蝠受到的伤害减少60％");
        add("item.batgene.tool.string.1", "每存在一只蝙蝠、你造成的伤害增加10％");
        add("item.batgene.tool.string.2", "减少10％伤害");
        add("item.batgene.tool.string.3", "最大伤害不超过200%");
        add("item.batskill.tool.string", "攻击有15％的概率召唤3只蝙蝠");
        add("item.batskill.tool.string.1", "并且在半径12格内");
        add("item.batskill.tool.string.2", "每存在一只蝙蝠、你受到的伤害减少5％");
        add("item.batskill.tool.string.3", "最多不超过80％");
        add("item.batskill.tool.string.4", "周围的蝙蝠每过1秒减少10％的生命值");
        add("item.batskill.tool.string.5", "可植入暗影瘟疫之内");
        add("item.big_heart.tool.string", "Increases the positive and negative modifiers of maximum health by 50%.");
        add("item.blood.tool.string.evil", "evil");
        add("item.blood.tool.string.evil.1", "There is a 33% chance that killing a creature will regenerate into a blood cell");
        add("item.blood.tool.string.evil.2", "Harvest blood cells to restore 4 health points");
        add("item.blood.tool.string.evil.3", "If you wear Shadow Plague, the health value restored by Evil Mind Demon will be changed to percentage form");
        add("item.blood.tool.string.sword", "sword");
        add("item.blood.tool.string.sword.1", "Summon 1 Flying Sword for every 10% loss of health");
        add("item.blood.tool.string.sword.2", " If you wear the Seven Swords of Asura Heart or Sudden Rain, you will lose 50% of your health");
        add("item.blood.tool.string.winds", "winds");
        add("item.blood.tool.string.winds.1", "  50%的速度加成转换成攻击伤害");
        add("item.blood.tool.string.winds.2", "  如果你佩戴了 梦魇之眼 物品，则伤害加倍");
        add("item.blood_god.tool.string.1", "增加25%最大生命值");
        add("item.blood_god.tool.string.2", "增加40%生命恢复");
        add("item.blood_god.tool.string.3", "饮用药水的速度增加25%");
        add("item.blood_god.tool.string.4", "你最高受到5点伤害");
        add("item.blood_god.tool.string.5", "超过5点的伤害将转换成等数值的流血");
        add("item.blood_god.tool.string.6", "饮用治疗药水使流血伤害削弱至原先的50%");
        add("item.blood_god.tool.string.7", "饮用药水使流血伤害削弱至原先的95%");
        add("item.blood_god.tool.string.8", "30秒冷却");
        add("item.blood_stasis.tool.string", "僵尸死亡后恢复召唤者10%的最大生命值");
        add("item.blood_sun.tool.string", "杀死生物召唤末日之灵");
        add("item.bloodgene.tool.string", "基础伤害，攻速降低50%");
        add("item.bloodgene.tool.string.1", "每次受到伤害都会获得提升");
        add("item.bloodgene.tool.string.2", "最大是原来的200%");
        add("item.bloodgene.tool.string.3", "增加10%受到伤害");
        add("item.bloodstain.tool.string", "拾取血球发生爆炸，但不会破坏方块");
        add("item.bloodvirus.tool.string", "增加25％对非亡灵生物的伤害");
        add("item.bloodvirus.tool.string.1", "增加17％在夜晚的速度");
        add("item.bloodvirus.tool.string.10", "你只能吃肉");
        add("item.bloodvirus.tool.string.11", "*感知型诱变寄生体，激发宿主嗜血欲望！");
        add("item.bloodvirus.tool.string.12", "还可以植入：");
        add("item.bloodvirus.tool.string.2", "滑翔时，可以单击前进键来冲刺");
        add("item.bloodvirus.tool.string.3", "在黑暗中，你将获得夜视");
        add("item.bloodvirus.tool.string.4", "增加10％的生命偷取");
        add("item.bloodvirus.tool.string.5", "*以灵魂为食粮");
        add("item.bloodvirus.tool.string.6", "减少30％任何来源的生命恢复效果");
        add("item.bloodvirus.tool.string.7", "阳光下你将燃烧，且变得极度弱小！");
        add("item.bloodvirus.tool.string.8", "增加100％被击退距离");
        add("item.bloodvirus.tool.string.9", "减少25％生命上限");
        add("item.body_stone.tool.string", "这个物品有概率使箱子里的饰品附加负面附魔");
        add("item.body_stone.tool.string.1", "并且随机附加1~2个负面附魔");
        add("item.body_stone.tool.string.2", "作为补偿，每个具有负面附魔的物品，都会获得强大的增益");
        add("item.body_stone.tool.string.3", "每级附魔：");
        add("item.body_stone.tool.string.4", "  +0.45%伤害，最大生命; +0.1%暴击");
        add("item.body_stone.tool.string.5", "  +1%护甲");
        add("item.body_stone.tool.string.6", "  +2%挖掘速度");
        add("item.body_stone.tool.string.7", "  +1%抗击退");
        add("item.body_stone.tool.string.8", "  +0.15%速度，近战伤害，攻速");
        add("item.bone_or_god.tool.string.2", "宠物攻击会附加10%主人的面板伤害");
        add("item.bone_or_god.tool.string.3", "宠物伤害提高200%");
        add("item.bone_or_god.tool.string.4", "宠物抗性提高50%");
        add("item.bone_or_god.tool.string.5", "若宠附近没有攻击目标，则缓慢恢复生命值");
        add("item.bone_structure.tool.string", "僵尸继承玩家70%的护甲值和30%最大生命值");
        add("item.book.tool.string.modi_blood", "血魔霸体");
        add("item.book.tool.string.nine_sword", "剑骨之力");
        add("item.botton.tool.string", "*如果你找到一些不详的基因…");
        add("item.botton.tool.string.1", "*或许我可以给你打造一个全新的身体…");
        add("item.botton.tool.string.2", "佩戴此物品，在末地中开启战利品箱可能会发现一些基因体");
        add("item.catalyzer.tool.string", "右键使用可感染一些特殊物品");
        add("item.cell.tool.string", "杀死生物有可能将尸体转化为僵尸");
        add("item.cell.tool.string.2", "可以按下绑定键来一次召唤多个僵尸，再次按下则回收");
        add("item.cell.tool.string.3", "但是会进入无法召唤僵尸的30秒冷却");
        add("item.cell_blood_attack.tool.string", "暗影蝠会恢复献祭者10%基于自身造成伤害的血量");
        add("item.cell_desecrate.tool.string", "你和暗影蝠对非亡灵生物造成的伤害提高40%");
        add("item.cell_doctor.tool.string", "你和暗影蝠将获得20%的吸血能力");
        add("item.cell_fear.tool.string", "增加50%暗影蝠的生存时间");
        add("item.cell_harvest.tool.string", "召唤暗影蝠的概率提高10%");
        add("item.cell_immortal.tool.string", "你和暗影蝠的护甲值增加10点");
        add("item.cell_not_do.tool.string", "暗影蝠不再需要献祭生命值");
        add("item.cell_rage.tool.string", "你的攻击伤害增加25%，暗影蝠的伤害减半");
        add("item.cell_scientist.tool.string", "召唤暗影蝠时献祭的血量加倍，同时暗影蝠的生命值和攻击力会根据献祭的血量来增加");
        add("item.chemical_compound.tool.string", "每存在一只细胞僵尸，治疗增加25%");
        add("item.chemical_compound.tool.string.1", "每存在一只巨型细胞僵尸，伤害提高20%");
        add("item.chemical_compound.tool.string.2", "僵尸受伤有5%的概率使主人受到50%的当量伤害");
        add("item.chemical_compound.tool.string.3", "主人的攻击不会触发");
        add("item.compression.tool.string", "你的侍从僵尸更容易受到伤害，但是每次攻击都会恢复自身生命值");
        add("item.consciousness.tool.string.1", "此物品允许你手动攻击来触发血灵增生体的攻击");
        add("item.consciousness.tool.string.2", "每次触发额外生成7个血球，但是血灵增生体不再主动攻击");
        add("item.dead_drder.tool.string.1", "给予大量的梦魇护盾");
        add("item.dead_drder.tool.string.2", "梦魇护盾可为你吸收全部伤害");
        add("item.deceased_contract.tool.string", "你可以在箱子里找到被诅咒的饰品");
        add("item.deceased_contract.tool.string.0", "杀死生物有15%的概率获得它们的血液");
        add("item.deceased_contract.tool.string.1", "拾取血液恢复15%最大生命值");
        add("item.deceased_contract.tool.string.2", "-20%伤害\n-25%抗性\n-15%暴击\n-30%治疗");
        add("item.deceased_contract.tool.string.3", "杀死生物有30%的概率召唤一只僵尸\n杀死生物有15%的概率召唤一只巨人僵尸\n召唤的僵尸最大生命值为20%");
        add("item.deceased_contract.tool.string.4", "召唤的僵尸获得50%召唤者的伤害，速度，防御，最大生命值的加成");
        add("item.deceased_contract.tool.string.5", "召唤的僵尸获得获得召唤者目前存在的所有正面药水状态");
        add("item.deceased_contract.tool.string.6", "Necora病毒及其附属物品无效化\n暗影瘟疫及其附属物品无效化");
        add("item.deceased_contract.tool.string.7", "你必须佩戴");
        add("item.deceased_contract.tool.string.8", "秒后才能取下");
        add("item.deceased_contract.tool.string.9", "目前，它是可以被取下的");
        add("item.defend_against_runestone.tool.string.1", "受击时有概率获得抗性II");
        add("item.defend_against_runestone.tool.string.2", "攻击时有概率对目标造成虚弱II");
        add("item.detect.tool.string", "被僵尸锁定的生物会发光");
        add("item.diemug.tool.string", "使用药水右键此圣杯");
        add("item.diemug.tool.string.1", "即可储存药水效果(可存在8种)");
        add("item.diemug.tool.string.2", "饮用后获得所有药水效果");
        add("item.disintegrating_stone.tool.string", "此物品的属性会随着你安装模组的数量的增加而增加");
        add("item.disintegrating_stone.tool.string.1", "来自任何模组的饰品都可能无效化");
        add("item.disintegrating_stone.tool.string.2", "上限为1800%");
        add("item.dnas.tool.string", "提示：使用药物粉碎盒粉碎基因物品");
        add("item.ectoplasmshild.tool.string", "持续的抗性提升");
        add("item.ectoplasmshild.tool.string.2", "减少30%来自爆炸的伤害");
        add("item.ectoplasmshild.tool.string.3", "每受到5次伤害，都将免疫下一次的攻击");
        add("item.enhancemen.tool.string", "可使僵尸侍从装备基因片段和分段基因组，但是装备的基因片段不会死亡掉落");
        add("item.evil_blood.tool.string", "召唤一个怨念合并体协助你作战");
        add("item.evil_mob.tool.string.1", "允许你在不佩戴深渊之眼,necora病毒，暗影瘟疫的情况下使用和发现相应的物品");
        add("item.evil_mob.tool.string.2", "佩戴后，自动获得深渊之眼，necora病毒，暗影瘟疫的一些特殊能力");
        add("item.evil_mob.tool.string.3", "null");
        add("item.evil_mob.tool.string.4", "与Necora病毒，深渊之眼，暗影瘟疫无法相同佩戴");
        add("item.evilmug.tool.string", "空的");
        add("item.evilmug.tool.string.1", "由攻击时造成的伤害来补充酒桶内的鲜血（副手）");
        add("item.evilmug.tool.string.2", "并且可以提取你自己的血");
        add("item.evilmug.tool.string.3", "喝！");
        add("item.exercise_reinforcement.tool.string", "僵尸获得60%召唤者移动速度");
        add("item.falling_immortals.tool.string.1", "你将不再受到任何形式的属性加成和减少");
        add("item.falling_immortals.tool.string.2", "伤害固定为%s");
        add("item.falling_immortals.tool.string.3", "攻速固定为4");
        add("item.falling_immortals.tool.string.4", "最大生命值固定为%s");
        add("item.falling_immortals.tool.string.5", "受到伤害固定为%s");
        add("item.falling_immortals.tool.string.6", "护甲固定为10");
        add("item.falling_immortals.tool.string.7", "你每秒最多受到一次伤害");
        add("item.flyeye.tool.string", "+300% 被击退");
        add("item.flyeye.tool.string.1", "+25% 无敌帧");
        add("item.flyeye.tool.string.2", "无敌期间对周围生物造成伤害");
        add("item.flygene.tool.string", "飞行速度增加13％");
        add("item.flygene.tool.string.1", "滑翔时，在空中以方向键可以实现加速或减速");
        add("item.fungus.tool.string", "根据周围宠物的数量获得生命恢复加成");
        add("item.fungus.tool.string.1", "每个生物可提升该加成25％");
        add("item.fungus.tool.string.2", "最高不超过150％");
        add("item.fungus.tool.string.3", "转换脚下的草方块");
        add("item.fungus.tool.string.4", "在菌丝方块上获得生命恢复效果");
        add("item.fungus.tool.string.5", "免疫凋零、虚弱、缓慢、中毒");
        add("item.fungus.tool.string.6", "在阳光下你会燃烧，哪怕你戴着帽子");
        add("item.fungus.tool.string.7", "强化附近宠物");
        add("item.germ.tool.string", "挖掘方块时增加细菌的适应值：");
        add("item.germ.tool.string.1", "每250点适应值都可以从细菌上获取额外属性");
        add("item.giant.tool.string", "杀死生物有些许概率使尸体诱变成巨型细胞僵尸");
        add("item.giant.tool.string.2", "可以按下绑定键来一次召唤多个僵尸，再次按下则回收");
        add("item.giant.tool.string.3", "但是会进入无法召唤僵尸的30秒冷却");
        add("item.giant_boom_cell.tool.string", "梦魇巨人死亡后产生毁灭性爆炸");
        add("item.god_lead.tool.string.1", "受到致命伤害时，伤害转移到附近的生物身上(冷却10秒)");
        add("item.god_lead.tool.string.2", "如果此生物死亡，那么冷却清除");
        add("item.god_lead.tool.string.3", "+150%受到伤害");
        add("item.gorillacake.tool.string", "检查你目前的排斥反应");
        add("item.gorilladna.tool.string", "使病原体能够修改你的基因进而显著提高智商");
        add("item.gorilladna.tool.string.1", "并使双眼虹膜呈现绿色而不会触发任何免疫反应");
        add("item.gorilladna.tool.string.2", "  瘟疫虹膜");
        add("item.heathgene.tool.string", "+10 最大生命值");
        add("item.heathgene.tool.string.1", "+10% 额外生命值");
        add("item.hidden_blade.tool.string.1", "受击时发动猛烈反击");
        add("item.hidden_blade.tool.string.2", "受击后的3秒内暴击伤害翻倍");
        add("item.hidden_blade.tool.string.3", "造成非暴击伤害时攻速逐渐增加");
        add("item.hidden_blade.tool.string.4", "造成暴击伤害时伤害逐渐增加");
        add("item.killer.tool.string.1", "每损失1%的生命值：");
        add("item.killer.tool.string.10", "伤害: ");
        add("item.killer.tool.string.11", "攻速: ");
        add("item.killer.tool.string.12", "护甲: ");
        add("item.killer.tool.string.2", "+1.25%治疗");
        add("item.killer.tool.string.3", "+0.8%速度");
        add("item.killer.tool.string.4", "+0.75%伤害");
        add("item.killer.tool.string.5", "+0.5%攻速");
        add("item.killer.tool.string.6", "+0.35%护甲");
        add("item.killer.tool.string.7", "现在");
        add("item.killer.tool.string.8", "治疗: ");
        add("item.killer.tool.string.9", "速度: ");
        add("item.lead.tool.string.1", "连续受到伤害时逐渐提高抗性");
        add("item.lead.tool.string.2", "每次提升3%，但不超过30%");
        add("item.lead.tool.string.3", "若10秒未受到伤害");
        add("item.lead.tool.string.4", "则以每秒20点的速度恢复护体罡气");
        add("item.lead.tool.string.5", "最多恢复至最大生命值的50%");
        add("item.lead.tool.string.6", "受伤优先损耗罡气而非生命值");
        add("item.lead.tool.string.7", "护体结界崩碎时对攻击者造成伤害");
        add("item.light_amout.tool.string", "如果单次坠落距离大于2");
        add("item.light_amout.tool.string.1", "那么接下来的全力一击将附带大范围的闪电攻击");
        add("item.light_amout.tool.string.2", "闪电的伤害会随着自身攻击伤害和摔落距离的增加而增加");
        add("item.light_amout.tool.string.3", "每增加1格，都会增加10%的伤害");
        add("item.luck_ring.tool.string.1", "每5级经验");
        add("item.luck_ring.tool.string.2", "+1 幸运");
        add("item.luck_stone.tool.string.1", "每10幸运：");
        add("item.luck_stone.tool.string.2", "+1 抢夺和时运");
        add("item.malice_die.tool.string.1", "如果附近生物的攻击目标是你，那么每增加一个生物：");
        add("item.malice_die.tool.string.10", "如果目标数量少于3，那么你造成的伤害减35%");
        add("item.malice_die.tool.string.2", "+3.3%伤害");
        add("item.malice_die.tool.string.3", "+3%生命恢复");
        add("item.malice_die.tool.string.4", "+2.7%速度");
        add("item.malice_die.tool.string.5", "+2.5%攻击速度");
        add("item.malice_die.tool.string.6", "+2%护甲");
        add("item.malice_die.tool.string.7", "+1.7%暴击");
        add("item.malice_die.tool.string.8", "攻击会使目标8格半径内的生物主动攻击你");
        add("item.malice_die.tool.string.9", "-15% 所有伤害");
        add("item.max_blood_cube.tool.string", "拿着任意物品对准生物潜行并长按右键释放技能");
        add("item.max_blood_cube.tool.string.1", "技能期间无法移动");
        add("item.max_blood_eye.tool.string", "每次全力攻击都会施加流血（叠加）");
        add("item.max_blood_eye.tool.string.1", "当流血层数超过3时");
        add("item.max_blood_eye.tool.string.2", "产生一次血爆造成伤害,并清除流血状态");
        add("item.max_blood_eye.tool.string.3", "被波及者获得流血，如果状态已存在，则转换成重伤");
        add("item.max_blood_eye.tool.string.4", "冷却时间1秒");
        add("item.max_sword.tool.string", "每次攻击都有概率生成一个血球围绕你旋转");
        add("item.max_sword.tool.string.1", "当血球数量超过8时");
        add("item.max_sword.tool.string.2", "下一次斩击将造成4倍伤害");
        add("item.max_sword.tool.string.3", "血球会随着时间的流失而被你吸收");
        add("item.max_sword.tool.string.4", "每次吸收都会恢复一定的百分比生命值");
        add("item.max_sword.tool.string.5", "每颗血球提供5%的伤害加成");
        add("item.max_sword.tool.string.6", "血球爆炸时对3格内的生物造成流血效果");
        add("item.max_sword.tool.string.7", "杀死生物后再获得1~3颗血球");
        add("item.medicinebox.tool.string.eat", "you: +1 slot");
        add("item.meet_heart.tool.string", "拾取飞行中的血球获得额外生命值");
        add("item.meet_heart.tool.string.1", "若未能获得血液，则获得持续饥饿");
        add("item.million.tool.string.1", "这个盒子里存储了15把飞剑");
        add("item.million.tool.string.2", "每次全力斩击都会召唤3把");
        add("item.million.tool.string.3", "每当飞剑被拾取时都会恢复1把");
        add("item.million.tool.string.4", "每次拾取飞剑都会获得1%的伤害加成");
        add("item.million.tool.string.5", "持续10秒，最多叠加到50%");
        add("item.million.tool.string.6", "Shift");
        add("item.million.tool.string.7", "获得的加成：");
        add("item.million.tool.string.8", "储存的飞剑数量：");
        add("item.moonstone.acid", "核酸中和");
        add("item.moonstone.acidic_reflux.string.1", "攻击腐蚀目标护甲");
        add("item.moonstone.acidic_reflux.string.2", "若目标护甲较少或不存在，则造成额外%s%%伤害");
        add("item.moonstone.anaerobic_cell", "无氧呼吸");
        add("item.moonstone.at_a_book", "很普通的书");
        add("item.moonstone.atp_height", "ATP高能量");
        add("item.moonstone.atrophy", "神经萎缩");
        add("item.moonstone.bat_cell", "血色暗影基因片段");
        add("item.moonstone.batgene", "夜行蝙蝠基因");
        add("item.moonstone.batskill", "基因片段");
        add("item.moonstone.belt", "珠宝腰带");
        add("item.moonstone.big_heart", "Giant Heart");
        add("item.moonstone.blood_stasis", "瘀血");
        add("item.moonstone.blood_sun", "血日");
        add("item.moonstone.bloodgene", "自适应强化基因");
        add("item.moonstone.bloodstain", "血污");
        add("item.moonstone.bloodvirus", "暗影瘟疫");
        add("item.moonstone.body_stone", "万魔石");
        add("item.moonstone.bone_structure", "骨结构异常");
        add("item.moonstone.botton", "铁罐子");
        add("item.moonstone.catalyzer", "暗影基因");
        add("item.moonstone.cell_acid", "酸性液体逆流");
        add("item.moonstone.cell_acid.tool", "腐蚀（数量）的被攻击生物装备");
        add("item.moonstone.cell_big_boom", "细胞色素爆发");
        add("item.moonstone.cell_big_boom.tool", "加（数量）吃东西的速度");
        add("item.moonstone.cell_blood_attack", "血腥收割");
        add("item.moonstone.cell_bone_add", "骨骼结构异化");
        add("item.moonstone.cell_break_down_water", "碱性水解");
        add("item.moonstone.cell_chromosome", "染色体结构变异");
        add("item.moonstone.cell_compress", "致命基因压缩");
        add("item.moonstone.cell_compress.tool", "加（数量）的伤害反弹");
        add("item.moonstone.cell_constant", "常量因子激增");
        add("item.moonstone.cell_constant.tool", "加（数量）的无敌帧");
        add("item.moonstone.cell_cranial", "脑组织转移");
        add("item.moonstone.cell_cranial.tool", "加（数量）对头部伤害的抗性");
        add("item.moonstone.cell_darwin", "达尔文主义");
        add("item.moonstone.cell_darwin.tool", "杀死生物回复或者扣除（数量）生命值");
        add("item.moonstone.cell_desecrate", "渎圣机组");
        add("item.moonstone.cell_digestion", "表皮消化");
        add("item.moonstone.cell_digestion.tool", "加（数量）食物饱食度和饥饿值");
        add("item.moonstone.cell_disorder", "代谢紊乱");
        add("item.moonstone.cell_disorder.tool", "每隔（数量）清除所有BUFF");
        add("item.moonstone.cell_dna_suppression", "神经递质抑制");
        add("item.moonstone.cell_doctor", "巫医");
        add("item.moonstone.cell_eyes", "眼镜蛇式锁定");
        add("item.moonstone.cell_eyes.tool", "使半径（数量）的生物发光");
        add("item.moonstone.cell_fear", "高空恐惧");
        add("item.moonstone.cell_flu", "病毒性流感");
        add("item.moonstone.cell_flu.tool", "使半径（数量）的生物虚弱");
        add("item.moonstone.cell_god", "神创论");
        add("item.moonstone.cell_god.tool", "杀死生物回复（数量）生命值");
        add("item.moonstone.cell_ground", "大地亲和性");
        add("item.moonstone.cell_harvest", "简制增收");
        add("item.moonstone.cell_immortal", "不朽之身");
        add("item.moonstone.cell_in_air", "大气亲和性");
        add("item.moonstone.cell_in_water", "海洋亲和性");
        add("item.moonstone.cell_inheritance", "模拟遗传基因");
        add("item.moonstone.cell_inheritance.tool", "加（数量）伤害抗性");
        add("item.moonstone.cell_necrosis", "液化性坏死");
        add("item.moonstone.cell_not_do", "群居抗拒");
        add("item.moonstone.cell_off_on", "催化剂开关");
        add("item.moonstone.cell_oxygen", "碱性氧化");
        add("item.moonstone.cell_preferential", "择优进化论");
        add("item.moonstone.cell_putrefactive", "热分解抑制");
        add("item.moonstone.cell_rage", "狂暴战士");
        add("item.moonstone.cell_scientist", "疯子科学家");
        add("item.moonstone.cell_sense", "感官系统强化");
        add("item.moonstone.cell_synthesis", "肽合成增强");
        add("item.moonstone.chemical_compound", "化合物合成");
        add("item.moonstone.compression", "致命基因压缩");
        add("item.moonstone.deceased_contract", "死灵契约");
        add("item.moonstone.detect", "要素察觉");
        add("item.moonstone.diemug", "死亡酒桶");
        add("item.moonstone.disintegrating_stone", "裂天石");
        add("item.moonstone.dna", "培养皿");
        add("item.moonstone.dna_box", "药物回收盒");
        add("item.moonstone.ectoplasmbadge", "灵质徽章");
        add("item.moonstone.ectoplasmcharm", "灵质护符");
        add("item.moonstone.ectoplasmcharmstone", "灵质石头护符");
        add("item.moonstone.ectoplasmfood", "灵质食物");
        add("item.moonstone.ectoplasmslate", "灵质石板");
        add("item.moonstone.ectoplasmstar.maxamout", "所有效果BUFF等级加%s");
        add("item.moonstone.ectoplasmstar.maxamout.1", "所有触发概加200%");
        add("item.moonstone.ectoplasmstar.maxamout.2", "反伤效果增加400%");
        add("item.moonstone.ectoplasmstar.mayhemcrystal", "伤害增幅增加至%s%%");
        add("item.moonstone.ectoplasmstar.nightmare_base_stone_meet", "幸运值加倍，且每点幸运加%s治疗");
        add("item.moonstone.ectoplasmstone", "灵质石头");
        add("item.moonstone.enhancemen", "神经强化");
        add("item.moonstone.evil_blood", "渎圣玩偶");
        add("item.moonstone.evilmug", "邪恶酒桶");
        add("item.moonstone.exercise_reinforcement", "运动强化");
        add("item.moonstone.falling_immortals", "坠仙");
        add("item.moonstone.flag_of_protest.string.1", "短时间内多次死亡会使你越来越强，最多叠加10层");
        add("item.moonstone.flag_of_protest.string.2", "背包界面右键此物品来激活");
        add("item.moonstone.flag_of_protest.string.3", "激活后可在重生后传送回上一个死亡点");
        add("item.moonstone.flag_of_protest.string.4", "目前状态已激活");
        add("item.moonstone.flyeye", "飞翔的眼睛");
        add("item.moonstone.flygene", "夜行蝠突变基因");
        add("item.moonstone.fungus", "真菌");
        add("item.moonstone.germ", "细菌");
        add("item.moonstone.giant_boom_cell", "甲烷囊肿");
        add("item.moonstone.gorillacake", "观察者种子");
        add("item.moonstone.gorilladna", "猩猩流感");
        add("item.moonstone.heathgene", "生命强化基因");
        add("item.moonstone.hypertrophy.string.1", "攻击不会再造成击退");
        add("item.moonstone.hypertrophy.string.2", "攻击有%s%%的概率使伤害翻倍");
        add("item.moonstone.key", "绑定按键：%s");
        add("item.moonstone.light_amout", "雷鸣之章");
        add("item.moonstone.love_charm", "朋友的礼物!");
        add("item.moonstone.max_blood_cube", "复仇之骰");
        add("item.moonstone.max_blood_eye", "校准之眼");
        add("item.moonstone.max_sword", "诺克萨斯纹章");
        add("item.moonstone.medicinebox.tool", "用于粉碎药物或任意基因物品");
        add("item.moonstone.medicinebox.tool.2", "你需要右键这个物品来存入，然后长按右键咀嚼，直到下方的红色字体消失");
        add("item.moonstone.meet_heart", "增生之心");
        add("item.moonstone.mummification", "干尸化");
        add("item.moonstone.muscle_conversion", "肌肉转化");
        add("item.moonstone.naja_mortis.string.1", "攻击同一个目标时伤害逐渐增加，最多增加%s%%");
        add("item.moonstone.naja_mortis.string.2", "此效果随时间流逝");
        add("item.moonstone.necora_baby", "necora baby");
        add("item.moonstone.nightmare_axe", "混沌战斧");
        add("item.moonstone.nightmare_clay.string.1", "你的四肢被高强度的梦魇粘土覆盖");
        add("item.moonstone.nightmare_clay.string.2", "几乎完全免疫“死兆方尖碑”的受伤诅咒");
        add("item.moonstone.nightmare_clay.string.3", "但这种粘土极易点燃，这使你受到的火焰类型伤害加倍");
        add("item.moonstone.nightmare_cube", "窥眸者的暗染之眼");
        add("item.moonstone.nightmare_head", "洞悉者的邪术法球");
        add("item.moonstone.nightmare_heart", "万贯者的悲哀");
        add("item.moonstone.nightmare_orb", "共鸣者法球");
        add("item.moonstone.nightmareanchor", "虚伪锚");
        add("item.moonstone.nightmarecharm", "深渊护符");
        add("item.moonstone.nightmareeye", "深渊之眼");
        add("item.moonstone.nightmaremoai", "深渊石球");
        add("item.moonstone.nightmarerotten", "万腐之心");
        add("item.moonstone.nightmarestone", "深渊方尖碑");
        add("item.moonstone.nightmaretreasure", "魔鬼的财宝");
        add("item.moonstone.nightmarewater", "卑微之酿");
        add("item.moonstone.nine_sword_book", "九剑归一诀");
        add("item.moonstone.nine_sword_books", "九剑归一诀");
        add("item.moonstone.not_blood_cell", "非嗜血性病变");
        add("item.moonstone.pain_candle", "污秽蜡烛");
        add("item.moonstone.pain_ring", "邪祟之戒");
        add("item.moonstone.parasite", "寄生虫");
        add("item.moonstone.peptide_surge.string.1", "攻击消耗额外的饥饿值");
        add("item.moonstone.peptide_surge.string.2", "并使造成的伤害提高%s%%");
        add("item.moonstone.phosphate_bond", "高能磷酸键断裂");
        add("item.moonstone.plague", "亚特格拉德病毒");
        add("item.moonstone.plague_book", "瘟疫");
        add("item.moonstone.plagues", "亚特格拉德病毒-重生");
        add("item.moonstone.probability", "机运之石");
        add("item.moonstone.probability_stone", "月之石");
        add("item.moonstone.rage_charm", "狂暴统治者徽章");
        add("item.moonstone.rage_eye", "偷盗者的狂暴之眼");
        add("item.moonstone.rage_lock", "狂暴锁");
        add("item.moonstone.rage_magnet", "狂暴磁铁");
        add("item.moonstone.rage_stone", "下界岩石");
        add("item.moonstone.ragegene", "自修正强化基因");
        add("item.moonstone.raw", "原始人的愤怒");
        add("item.moonstone.rotten_gourd.string.1", "你的残躯将被轮回的因果无视");
        add("item.moonstone.rotten_gourd.string.2", "因此得以抹去“颠倒之物”的负面诅咒");
        add("item.moonstone.rotten_gourd.string.3", "腐烂的躯体使你游泳速度减半");
        add("item.moonstone.seven_star", "七星炼体诀");
        add("item.moonstone.seven_star.string.1", "一星——神陨：\n   免疫负面状态，但是杀死凋零后此星消亡");
        add("item.moonstone.seven_star.string.2", "二星——苍戮：\n   增加30%伤害和护甲，但是杀死高于400点生命值的生物后此星消亡");
        add("item.moonstone.seven_star.string.3", "三星——天屠：\n   受到致命伤害时恢复50%生命值，但是死亡真正死亡10次后此星消亡");
        add("item.moonstone.seven_star.string.4", "四星——刑阎：\n   减少90%村民交易的价格，但是交易超过100次后此星消亡");
        add("item.moonstone.seven_star.string.5", "五星——血煞：\n   增加25%所有速度和100%跳跃高度，但是使用鞘翅或类似物品后此星消亡");
        add("item.moonstone.seven_star.string.6", "六星——天神：\n   宠物没有攻击目标时无敌且恢复生命，但是损失30只宠物后此星消亡");
        add("item.moonstone.seven_star.string.7", "七星——诛圣：\n   获得6级的时运和抢夺等级，但是累计消亡5星后，此星消亡");
        add("item.moonstone.seven_star.string.8", "此法诀会在七星全灭时消失");
        add("item.moonstone.skin_glucose_fermentation", "肌糖原酵解");
        add("item.moonstone.sleepgene", "适应性休眠基因");
        add("item.moonstone.slime", "史莱姆细胞");
        add("item.moonstone.small.all", "右键装备到僵尸侍从上, Shift+右键在潜行时取出");
        add("item.moonstone.soul_apple", "灵魂之果");
        add("item.moonstone.soulbook", "一本书");
        add("item.moonstone.speed_metabolism", "极速代谢");
        add("item.moonstone.speed_metabolism.tool", "饱食度小于（数量）时消耗1点饥饿值");
        add("item.moonstone.speed_seed", "限流种子");
        add("item.moonstone.spore_outbreak", "孢子喷发");
        add("item.moonstone.subspace_cell", "子空间细胞病变");
        add("item.moonstone.supreme_power.string.1", "异变的大脑使你的意识格外清醒");
        add("item.moonstone.supreme_power.string.2", "这使得“噩梦之起始”的护甲诅咒降低一半");
        add("item.moonstone.supreme_power.string.3", "过度的清醒使你无法入眠");
        add("item.moonstone.the_god_sword", "恶意立方体");
        add("item.moonstone.the_owner_blood_stone", "连锁血石");
        add("item.moonstone.the_pain_stone", "痛苦游离石");
        add("item.moonstone.tool.string.sword", "右键开启或者关闭功能");
        add("item.moonstone.tooltip.battery", "可以改装或者增幅纳米科技");
        add("item.moonstone.tooltips.off", "功能已开启");
        add("item.moonstone.tooltips.on", "功能已关闭");
        add("item.moonstone.tumour", "肿瘤");
        add("item.moonstone.twistedstone", "扭曲石头");
        add("item.moonstone.universe", "万象模板");
        add("item.moonstone.virus", "病毒");
        add("item.moonstone.weak", "神经衰弱");
        add("item.moonstone.white_blood_cells_are_abruptly_reduced", "白细胞骤减");
        add("item.moonstone.wind_and_rain", "疾风骤雨");
        add("item.moonstone.ytgld_virus", "远古病毒");
        add("item.moonstone.zombie_box", "僵尸的小盒子");
        add("item.moonstone.zombie_box_nobo", "坏掉的僵尸盒子");
        add("item.moonstone.zombie_ring", "僵尸召集之戒");
        add("item.mummification.tool.string", "有效抑制僵尸的腐化速度，但是会减低20%的攻击伤害");
        add("item.muscle_conversion.tool.string", "玩家本体伤害降低20%");
        add("item.muscle_conversion.tool.string.1", "召唤的僵尸继承玩家50%的攻击力");
        add("item.muscle_conversion.tool.string.2", "召唤的僵尸伤害提高30%");
        add("item.necora_baby.tool.string", "Summon a corrupt soul");
        add("item.necora_baby.tool.string.1", "You can implant gene fragments into it");
        add("item.necora_baby.tool.string.2", "If the Soul of Corruption dies/is lost, you can re equip this item");
        add("item.necora_baby.tool.string.3", "The soul of corruption will also teleport items to your side after death");
        add("item.nightmare_axe.tool.string", "杀死生物召唤混沌战斧，落下造成300%你的攻击伤害");
        add("item.nightmare_axe.tool.string.1", "附近每有一把混沌战斧：");
        add("item.nightmare_axe.tool.string.2", "+25%伤害");
        add("item.nightmare_axe.tool.string.3", "+25%治疗");
        add("item.nightmare_base_reversal.tool.string", "每次死亡都会使属性降至0%");
        add("item.nightmare_base_reversal.tool.string.2", "复活后属性以每秒4%的速度逐渐恢复");
        add("item.nightmare_base_reversal.tool.string.3", "中毒对于你来说是致命的");
        add("item.nightmare_base_reversal_card.tool.string", "每次复活时属性恢复速度减少至2%");
        add("item.nightmare_base_reversal_card.tool.string.2", "但是最多恢复到原先的%s%%");
        add("item.nightmare_base_reversal_orb.tool.string", "治疗只会减少生命值");
        add("item.nightmare_base_reversal_orb.tool.string.2", "每隔10秒重置生命值至满血");
        add("item.nightmare_base_stone_meet.tool.string.1", "强化下列饰品");
        add("item.nightmare_cube.tool.string", "靠近生物下按下Shift释放暗染丝线，这些丝线会继承你的伤害");
        add("item.nightmare_head.tool.string", "免疫所有非生物伤害");
        add("item.nightmare_head.tool.string.1", "任何来源的伤害减免失效并且受到伤害固定为1点");
        add("item.nightmare_head.tool.string.2", "每5秒恢复1点生命值，不受任何加成影响");
        add("item.nightmare_head.tool.string.3", "反弹50%的伤害给攻击者");
        add("item.nightmare_head.tool.string.4", "并且每次佩戴此物品死亡都会降低1%对深渊的抵抗力");
        add("item.nightmare_head.tool.string.5", "Maximum health restored after wearing");
        add("item.nightmare_head.tool.string.6", "减少100%深渊的诅咒");
        add("item.nightmare_head.tool.string.7", "无法取下");
        add("item.nightmare_head.tool.string.8", "永远不会判定你为满血状态");
        add("item.nightmare_heart.tool.string", "杀死生物召唤深渊立方");
        add("item.nightmare_orb.tool.string", "当你的生命值低于33%时");
        add("item.nightmare_orb.tool.string.1", "所有来自深渊的诅咒都会反转成对你的增益");
        add("item.nightmare_orb.tool.string.2", "但是每秒受到1%最大生命值的伤害");
        add("item.nightmare_orb.tool.string.3", "并且在此期间无法受到治疗");
        add("item.nightmareanchor.tool.string", "佩戴它并死亡");
        add("item.nightmareanchor.tool.string.1", "可记录这一次的死亡地点");
        add("item.nightmareanchor.tool.string.2", "右键传送到上个记录点");
        add("item.nightmareanchor.tool.string.3", "但你必须在同一维度内");
        add("item.nightmareanchor.tool.string.4", "佩戴时:");
        add("item.nightmareanchor.tool.string.5", "减少5％来自深渊的诅咒");
        add("item.nightmareanchor.tool.string.6", "唯有承受深渊之恐的人");
        add("item.nightmareanchor.tool.string.7", "才有资格使用此道具");
        add("item.nightmarecharm.tool.string", "减少15％来自深渊之眼的诅咒");
        add("item.nightmarecharm.tool.string.1", "加法计算");
        add("item.nightmarecharm.tool.string.2", "+1饰品槽位");
        add("item.nightmarecharm.tool.string.3", "唯有承受深渊之恐的人");
        add("item.nightmarecharm.tool.string.4", "才有资格使用此道具");
        add("item.nightmareeye.tool.string", "受到伤害增加33％");
        add("item.nightmareeye.tool.string.1", "你大部分属性都会降低25%");
        add("item.nightmareeye.tool.string.2", "不可取下");
        add("item.nightmaremoai.tool.string", "+2 附魔产物的附魔等级");
        add("item.nightmaremoai.tool.string.1", "唯有承受深渊之恐的人");
        add("item.nightmaremoai.tool.string.2", "才有资格使用此道具");
        add("item.nightmarerotten.tool.string", "+10％ 所有属性");
        add("item.nightmarerotten.tool.string.1", "但是每增加1种属性");
        add("item.nightmarerotten.tool.string.2", "来自深渊的诅咒都会增加0.2％");
        add("item.nightmarerotten.tool.string.3", "唯有承受深渊之恐的人");
        add("item.nightmarerotten.tool.string.4", "才有资格使用此道具");
        add("item.nightmarestone.tool.string", "你的身上每存在一个负面效果：");
        add("item.nightmarestone.tool.string.1", "+4％伤害、移速、护甲");
        add("item.nightmarestone.tool.string.10", "才有资格使用此道具");
        add("item.nightmarestone.tool.string.2", "+7％生命回复、击退抗性");
        add("item.nightmarestone.tool.string.3", "+10％挖掘速度、经验掉落");
        add("item.nightmarestone.tool.string.4", "伤害、移速、护甲");
        add("item.nightmarestone.tool.string.5", "生命回复、击退抗性");
        add("item.nightmarestone.tool.string.6", "挖掘速度、经验掉落");
        add("item.nightmarestone.tool.string.7", "你身上的任何负面效果时长翻倍");
        add("item.nightmarestone.tool.string.8", "受到任何来源的伤害都会获得一个随机负面效果");
        add("item.nightmarestone.tool.string.9", "唯有承受深渊之恐的人");
        add("item.nightmaretreasure.tool.string", "你造成的伤害降低50％");
        add("item.nightmaretreasure.tool.string.1", "击杀获得的战利品有1/3的概率获取三倍");
        add("item.nightmaretreasure.tool.string.2", "每增加1的幸运，都会提高3％的概率");
        add("item.nightmaretreasure.tool.string.3", "不超过66％");
        add("item.nightmaretreasure.tool.string.4", "唯有承受深渊之恐的人");
        add("item.nightmaretreasure.tool.string.5", "才有资格使用此道具");
        add("item.nightmaretreasure.tool.string.6", "-33% 抢夺等级");
        add("item.nightmarewater.tool.string", "腐朽…虚弱……");
        add("item.nightmarewater.tool.string.1", "深渊…永恒……");
        add("item.nine_sword_book.tool.string.1", "快捷栏内每存在一把剑类武器：");
        add("item.nine_sword_book.tool.string.10", "飞剑会随着时间缓慢恢复");
        add("item.nine_sword_book.tool.string.11", "飞剑击中后恢复自身1%当前生命值");
        add("item.nine_sword_book.tool.string.12", "-25%所有伤害");
        add("item.nine_sword_book.tool.string.13", "-50%最大生命值");
        add("item.nine_sword_book.tool.string.14", "你无法使用非剑类武器");
        add("item.nine_sword_book.tool.string.2", "伤害");
        add("item.nine_sword_book.tool.string.3", "攻速");
        add("item.nine_sword_book.tool.string.4", "速度");
        add("item.nine_sword_book.tool.string.5", "治疗");
        add("item.nine_sword_book.tool.string.6", "飞剑");
        add("item.nine_sword_book.tool.string.7", "下一次攻击将造成等于快速栏中所有剑武器伤害总和的伤害");
        add("item.nine_sword_book.tool.string.8", "冷却");
        add("item.nine_sword_book.tool.string.9", "造成伤害时有5%（x飞剑数量）的概率释放所有飞剑");
        add("item.nine_sword_book.tool.string.all", "修炼到[剑帝][剑祖]级别后，属性增长降低22.5%”");
        add("item.nine_sword_book_lvl.tool.string.1", "剑仙");
        add("item.nine_sword_book_lvl.tool.string.2", "修炼-基础");
        add("item.nine_sword_book_lvl.tool.string.3", "修炼-攻速");
        add("item.nine_sword_book_lvl.tool.string.4", "修炼-攻伤");
        add("item.nine_sword_book_skill.tool.string.1", "剑仙");
        add("item.nine_sword_book_skill.tool.string.2", "剑神");
        add("item.nine_sword_book_skill.tool.string.3", "剑圣");
        add("item.nine_sword_book_skill.tool.string.4", "剑帝");
        add("item.nine_sword_book_skill.tool.string.5", "剑祖");
        add("item.nine_sword_book_skill.tool.string.attack_damage", "所有剑类斩击的伤害");
        add("item.nine_sword_books.tool.string.14", "只能使用剑类武器");
        add("item.not_blood_cell.tool.string", " 梦魇巨人的远程攻击不会对召唤者造成伤害");
        add("item.obsidianring.tool", "免疫击退");
        add("item.organizational_regeneration.tool.string", "僵尸会缓慢恢复生命值，并提高腐化速度");
        add("item.pain_candle.tool.string", "恢复血量时+2%受到伤害");
        add("item.pain_candle.tool.string.1", "直到恢复至满血状态");
        add("item.pain_candle.tool.string.2", "+1 生命恢复");
        add("item.pain_candle.tool.string.3", "+33% 生命恢复");
        add("item.pain_candle.tool.string.4", "受到伤害: ");
        add("item.pain_ring.tool.string", "恢复血量时+1%伤害（不超过100%）");
        add("item.pain_ring.tool.string.1", "直到恢复至满血状态");
        add("item.pain_ring.tool.string.2", "-50% 生命恢复");
        add("item.parasite.tool.string", "根据食物的营养价值增加寄生虫的活性");
        add("item.parasite.tool.string.1", "寄生虫活性越高，你的属性越强");
        add("item.parasite.tool.string.2", "寄生虫活性越高，可增加的活性也会变少");
        add("item.parasite.tool.string.3", "随着寄生虫活性的提高，你将越来越难以饱腹");
        add("item.parasite.tool.string.4", "在必要时刻，寄生虫会牺牲活性来保全他们的宿主！");
        add("item.parasite.tool.string.5", "饥饿值少于50％时，你将变得虚弱");
        add("item.phosphate_bond.tool.string", "召唤的僵尸死亡后回复玩家10%最大生命值");
        add("item.phosphate_bond.tool.string.1", "召唤的僵尸最少能承受6次伤害");
        add("item.phosphate_bond.tool.string.2", "召唤的僵尸不会恢复生命值");
        add("item.plague.s.tool.string", "这个物品已经没有任何用处了");
        add("item.plague.tool.string", "研究点数");
        add("item.plague.tool.string.1", "病毒点数");
        add("item.plague.tool.string.10", "+66% 护甲");
        add("item.plague.tool.string.11", "+90% 击退抗性");
        add("item.plague.tool.string.12", "+70% 攻速");
        add("item.plague.tool.string.13", "+70% 伤害");
        add("item.plague.tool.string.14", "+70% 水下速度");
        add("item.plague.tool.string.15", "+100% 对怪物伤害");
        add("item.plague.tool.string.16", "+150% 对高生命值生物的伤害");
        add("item.plague.tool.string.17", "+100% 治疗");
        add("item.plague.tool.string.18", "+70% 挖掘速度");
        add("item.plague.tool.string.2", "反研究点数");
        add("item.plague.tool.string.3", "杀死生物获得点数");
        add("item.plague.tool.string.4", "你必须把点数研究到100%");
        add("item.plague.tool.string.5", "点数影响属性，并且最好在规定时间内完成........");
        add("item.plague.tool.string.6", "你真的能主宰世界吗？");
        add("item.plague.tool.string.8", "+50% 生命");
        add("item.plague.tool.string.9", "+25% 速度");
        add("item.plague.tool.string.un", "使用 深渊之眼 取下");
        add("item.plague_book.tool.string", "被僵尸攻击的生物会在短时间内受到额外33%的伤害");
        add("item.probability.tool.string.1", "你的攻击伤害将在10%~200%之间浮动");
        add("item.probability.tool.string.2", "你受到的伤害将在25%~200%之间浮动");
        add("item.probability.tool.string.3", "每一点幸运，都会使最小值加1%");
        add("item.probability.tool.string.4", "对于万魔石");
        add("item.probability.tool.string.5", "获得的诅咒的最大和最小值加1");
        add("item.probability.tool.string.6", "每一点幸运都会使最大和最小值加5%");
        add("item.probability_stone.tool.string.1", "击中生物立即触发所有的斩杀效果，冷却20秒");
        add("item.rage_charm.tool.string", "杀死生物获得属性加成");
        add("item.rage_charm.tool.string.1", "随时间减少");
        add("item.rage_eye.tool.string", "手持眼睛左键生物偷取10%基础属性");
        add("item.rage_eye.tool.string.4", "盗取的属性最大值不超过你的25%");
        add("item.rage_lock.tool.string", "-75%治疗");
        add("item.rage_lock.tool.string.1", "+25%满血抗性");
        add("item.rage_lock.tool.string.2", "+10%所有伤害");
        add("item.rage_lock.tool.string.3", "+15%吸血");
        add("item.rage_lock.tool.string.4", "+40%杀戮吸血");
        add("item.rage_magnet.tool.string", "吸引掉落物时恢复生命值");
        add("item.rage_stone.tool.string", "将附近掉落物形式的下界岩转换成经验球");
        add("item.ragegene.tool.string", "当你的攻击蓄力条为100％时");
        add("item.ragegene.tool.string.1", "每次攻击都会增加5％的伤害");
        add("item.ragegene.tool.string.2", "最多不超过100％");
        add("item.ragegene.tool.string.3", "受到伤害后重新计算");
        add("item.raw.tool.string", "所有模组的所有饰品无效化");
        add("item.revive_runestone.tool.string.1", "受伤有概率吸收伤害");
        add("item.revive_runestone.tool.string.2", "攻击有概率吸取生命");
        add("item.skin_glucose_fermentation.tool.string", "召唤的僵尸被杀死时");
        add("item.skin_glucose_fermentation.tool.string.1", "攻击者会受到基于僵尸50%最大生命值和护甲总和的伤害");
        add("item.sleepgene.tool.string", "白天不会获得负面效果");
        add("item.sleepgene.tool.string.1", "夜晚无法获得增益效果");
        add("item.slime.tool.string", "杀死生物有概率召唤史莱姆细胞僵尸，可兼容任何召唤类基因，召唤后的5秒内无法再次召唤任何僵尸");
        add("item.soul_apple.tool.string.1", "食用后永久+1通用饰品栏");
        add("item.speed_seed.tool.string", "速度固定到正常值的120%");
        add("item.spore_outbreak.tool.string", "拾取血球恢复20%的最大生命值");
        add("item.strengthen_runestone.tool.string.1", "攻击有概率获得力量II");
        add("item.strengthen_runestone.tool.string.2", "受伤有概率反弹伤害");
        add("item.subspace_cell.tool.string", "召唤梦魇巨人不再消耗生命值");
        add("item.the_divine_fall_ring.tool.string.1", "带上它 你将免疫黑暗");
        add("item.the_divine_fall_ring.tool.string.2", "带上它 你将免疫失明");
        add("item.the_divine_fall_ring.tool.string.3", "增加百分之百经验掉落");
        add("item.the_divine_fall_ring.tool.string.4", "增加十的伤害 生命 护甲");
        add("item.the_divine_fall_ring.tool.string.5", "复活时给予十秒无敌");
        add("item.the_divine_fall_ring.tool.string.6", "增加百分之五十治疗");
        add("item.the_divine_fall_ring.tool.string.7", "生命值越低 各方面属性越高");
        add("item.the_owner_blood_stone.tool.string", "杀死生物产生血球");
        add("item.the_owner_blood_stone.tool.string.1", "血球将造成125%被杀生物生命值的伤害");
        add("item.the_owner_blood_stone.tool.string.2", "并冲向附近的生物");
        add("item.the_owner_blood_stone.tool.string.3", "血球相当于你发起了一次攻击");
        add("item.the_pain_stone.tool.string.1", "杀死生物后将其50%的最大生命值转换成下一次的额外攻击伤害");
        add("item.the_pain_stone.tool.string.2", "如果下次造成的伤害大于该生物的最大生命值");
        add("item.the_pain_stone.tool.string.3", "那么额外伤害将等比例恢复自身血量");
        add("item.the_pain_stone.tool.string.4", "-15%任何伤害");
        add("item.the_pain_stone.tool.string.5", "下一次: ");
        add("item.tumour.tool.string", "僵尸伤害减半，但是生命值加倍");
        add("item.twelve_sword.tool.string.1", "杀死生物召唤剑阵");
        add("item.twelve_sword.tool.string.2", "在剑阵附近获得10%~120%的伤害加成");
        add("item.twelve_sword.tool.string.3", "剑阵内的生物会被死界剑坠落攻击");
        add("item.twelve_sword.tool.string.4", "数量取决于你生肖物品的数量");
        add("item.undead_blood_charm.tool.string.1", "标记攻击者，每次你恢复生命值都会对他造成150%恢复量的伤害");
        add("item.undead_blood_charm.tool.string.2", "标记对你有仇恨的生物，每次恢复生命都会对他造成50%恢复量的伤害");
        add("item.undead_blood_charm.tool.string.3", "对亡灵造成额外50%的伤害");
        add("item.undead_blood_charm.tool.string.4", "治疗增加50%");
        add("item.undead_blood_charm.tool.string.5", "受到伤害增加40%");
        add("item.universe.tool.null", "空的");
        add("item.universe.tool.string", "每造成1种不同类型的伤害（例如弹射物，荆棘）");
        add("item.universe.tool.string.1", "你都会提高5%的所有伤害");
        add("item.universe.tool.string.2", "+10% 所有伤害");
        add("item.virus.tool.string", "杀死生物夺取它们的DNA！");
        add("item.virus.tool.string.1", "每夺取10点DNA都会对此类型生物额外造成2.5％伤害");
        add("item.virus.tool.string.2", "最多不超过50％");
        add("item.weak.tool.string", "拾取血球立即损失10%的生命值获得5颗黄心");
        add("item.white_blood_cells_are_abruptly_reduced.tool.string", "召唤的僵尸会将15%恢复的生命值附加的玩家身上");
        add("item.white_blood_cells_are_abruptly_reduced.tool.string.1", "召唤的僵尸不再会恢复生命值");
        add("item.wind_and_rain.tool.string", "拖动此物品右键剑类武器来进行附魂");
        add("item.wind_and_rain.tool.string.1", "之后使用附魂的武器长按右键召唤飞剑");
        add("item.wind_and_rain.tool.string.2", "但每次召唤都会有2%的概率进入8秒的冷却");
        add("item.wind_and_rain.tool.string.3", "连续召唤会消耗耐久");
        add("item.wind_and_rain.tool.string.4", "");
        add("item.ytgld_virus.tool.string.1", "你真的能主宰世界吗？");
        add("item.ytgld_virus.tool.string.10", "已获得研究点数的负面效果：");
        add("item.ytgld_virus.tool.string.11", "生命值:");
        add("item.ytgld_virus.tool.string.12", "护甲值:");
        add("item.ytgld_virus.tool.string.13", "近战伤害:");
        add("item.ytgld_virus.tool.string.14", "病毒带来的负面效果：");
        add("item.ytgld_virus.tool.string.15", "速度:");
        add("item.ytgld_virus.tool.string.16", "治疗:");
        add("item.ytgld_virus.tool.string.17", "抗性:");
        add("item.ytgld_virus.tool.string.18", "攻击速度:");
        add("item.ytgld_virus.tool.string.19", "主宰者啊，为世界带来永恒的终极黑暗吧！");
        add("item.ytgld_virus.tool.string.2", "研究点数：");
        add("item.ytgld_virus.tool.string.20", "你获得了：");
        add("item.ytgld_virus.tool.string.21", "+300% 对高生命值生物的伤害");
        add("item.ytgld_virus.tool.string.22", "+250% 对怪物的伤害");
        add("item.ytgld_virus.tool.string.23", "+225% 对友好生物的伤害");
        add("item.ytgld_virus.tool.string.24", "+200% 对玩家的伤害");
        add("item.ytgld_virus.tool.string.25", "+150% 护甲");
        add("item.ytgld_virus.tool.string.26", "+100% 击退抗性");
        add("item.ytgld_virus.tool.string.27", "+100% 水下速度");
        add("item.ytgld_virus.tool.string.28", "+80% 生命值");
        add("item.ytgld_virus.tool.string.29", "+70% 攻速");
        add("item.ytgld_virus.tool.string.3", "病毒点数：");
        add("item.ytgld_virus.tool.string.30", "+65% 治疗");
        add("item.ytgld_virus.tool.string.31", "+20% 速度");
        add("item.ytgld_virus.tool.string.32", "+50% 触及距离");
        add("item.ytgld_virus.tool.string.33", "+25% 攻击距离");
        add("item.ytgld_virus.tool.string.34", "+20% 抗性");
        add("item.ytgld_virus.tool.string.35", "每次死亡都会减少1%研究进度");
        add("item.ytgld_virus.tool.string.36", "吃下灵质立方来抑制病毒的复制速度");
        add("item.ytgld_virus.tool.string.37", "在第一个阶段玩家需要杀死生物来增加点数");
        add("item.ytgld_virus.tool.string.38", "可以食用金苹果来降低病毒的增值速度");
        add("item.ytgld_virus.tool.string.39", "病毒增值速度为100%");
        add("item.ytgld_virus.tool.string.4", "这是一个极为危险的病毒");
        add("item.ytgld_virus.tool.string.40", "研究点数达到阈值，需要杀死凋零来进化！");
        add("item.ytgld_virus.tool.string.41", "在第二个阶段玩家只能杀死亡灵来获取点数");
        add("item.ytgld_virus.tool.string.42", "只可以食用灵质立方来降低病毒的增值速度");
        add("item.ytgld_virus.tool.string.43", "每次死亡都会减少1%的研究点数");
        add("item.ytgld_virus.tool.string.44", "病毒增值速度为150%");
        add("item.ytgld_virus.tool.string.45", "研究点数达到阈值，需要杀死末影龙来进化！");
        add("item.ytgld_virus.tool.string.46", "这个阶段玩家可以杀死任何生物来获得点数");
        add("item.ytgld_virus.tool.string.47", "玩家不再可以减少病毒增值速度");
        add("item.ytgld_virus.tool.string.48", "来自病毒的所有属性衰败增加50%");
        add("item.ytgld_virus.tool.string.49", "病毒增值速度为200%");
        add("item.ytgld_virus.tool.string.5", "你必须在规定时间内将研究点数达到100%");
        add("item.ytgld_virus.tool.string.6", "来解锁终极湮灭基因");
        add("item.ytgld_virus.tool.string.7", "研究点数会影响你的正常生理状态");
        add("item.ytgld_virus.tool.string.8", "病毒也会在你的体内复制影响正常生命体征");
        add("item.ytgld_virus.tool.string.9", "所以你必须与时间赛跑");
        add("item.ytgld_virus.tool.string.eat", "吃下灵质立方来激活病毒！");
        add("itemGroup.moonstone", "月之石：噩梦之章");
        add("itemGroup.tabmoonstone", "月之石");
        add("itemGroup.tabmoonstone.necora", "月之石:基因");
        add("key.categories.moonstone.moonstone", "月之石");
        add("key.category.moonstone.moonstone", "月之石");
        add("key.moonstone.r", "技能");
        add("key.moonstone.y", "skill");
        add("key.moonstone.zombie", "释放僵尸/收回");
        add("moonstone.attribute.name.ectoplasm", "灵质");
        add("moonstone.attribute.name.meet", "血肉");
        add("moonstone.attribute.name.mysterious", "神秘");
        add("moonstone.attribute.name.nano", "机械");
        add("moonstone.attribute.name.reality", "现实");
        add("moonstone.attribute.name.twisted", "扭曲");
        add("moonstone.book.beacon.1", "一个可以反射药水效果的饰品");
        add("moonstone.book.beacon.2", "在某些情况下可能会有大用处");
        add("moonstone.book.biggreedcrystal.1", "提供时运效果");
        add("moonstone.book.biggreedcrystal.2", "可以由贪婪水晶合成");
        add("moonstone.book.bigwarcrystal.1", "提供近战伤害");
        add("moonstone.book.bigwarcrystal.2", "可以由战争水晶合成");
        add("moonstone.book.blood_candle.1", "佩戴按下绑定键召唤血灵增生体");
        add("moonstone.book.blood_candle.2", "血灵增生体会自动攻击附近的生物");
        add("moonstone.book.blood_candle.3", "可以使用一些物品来增强它的攻击或能力");
        add("moonstone.book.blueamout.1", "造成伤害有可能虚弱目标");
        add("moonstone.book.blueamout.2", "受到伤害有可能获得抗性");
        add("moonstone.book.calcareous.1", "僵尸/宠物单位增加8点护甲");
        add("moonstone.book.chaos", "噩梦");
        add("moonstone.book.cytopathic_boost.1", "僵尸获得40%召唤者的伤害，速度，护甲");
        add("moonstone.book.earth_affinity.1", "增加击退抗性");
        add("moonstone.book.ectoplasm.main", "食用后恢复少量饥饿值");
        add("moonstone.book.ectoplasmapple.1", "受到伤害后对周围生物造成伤害");
        add("moonstone.book.ectoplasmapple.2", "但是伤害存在一定的上限");
        add("moonstone.book.ectoplasmball.1", "灵质球发现在地牢等战利品箱子里");
        add("moonstone.book.ectoplasmball.2", "是模组里的重要材料");
        add("moonstone.book.ectoplasmbattery.1", "提供大量的生命值");
        add("moonstone.book.ectoplasmbattery.2", "是电池的孪生兄弟");
        add("moonstone.book.ectoplasmcloub.1", "这个物品是合成更高阶物品的材料");
        add("moonstone.book.ectoplasmcloub.2", "可以通过灵质球合成获取");
        add("moonstone.book.ectoplasmcube.1", "合成顶级物品的材料之一");
        add("moonstone.book.ectoplasmcube.2", "可以通过灵质球/云以及钻石合成获取");
        add("moonstone.book.ectoplasmhorseshoe.1", "提供生命值加成");
        add("moonstone.book.ectoplasmhorseshoe.2", "并且减少衰落伤害");
        add("moonstone.book.ectoplasmprism.1", "合成极限物品的材料之一");
        add("moonstone.book.ectoplasmprism.2", "可以通过灵质立方以及钻石合成获取");
        add("moonstone.book.ectoplasmshild.1", "没受到一定次数的伤害");
        add("moonstone.book.ectoplasmshild.2", "下一次受到攻击即可免疫");
        add("moonstone.book.ectoplasmstar.1", "提供幸运值");
        add("moonstone.book.ectoplasmstar.2", "幸运值可提供伤害功速加成");
        add("moonstone.book.ectoplasmtree.1", "免疫火焰伤害（Buff）");
        add("moonstone.book.ectoplasmtree.2", "前期探索地狱的不二选择");
        add("moonstone.book.error", "你需要安装帕秋莉手册");
        add("moonstone.book.fortunecrystal.1", "提供大量时运效果");
        add("moonstone.book.fortunecrystal.2", "可以由大贪婪水晶合成");
        add("moonstone.book.frontal_lobe.1", "僵尸/宠物单位增加30%速度");
        add("moonstone.book.greedamout.1", "造成伤害有可能恢复生命值");
        add("moonstone.book.greedamout.2", "受到伤害有可能吸收伤害");
        add("moonstone.book.greedcrystal.1", "提供些许时运效果");
        add("moonstone.book.greedcrystal.2", "可以合成");
        add("moonstone.book.high_energy.1", "僵尸/宠物单位增加10点生命值且自然恢复");
        add("moonstone.book.loot.blood", "发现在远古城市里，需要佩戴封魔烛台才能获取");
        add("moonstone.book.loot.clear", "右键关闭界面");
        add("moonstone.book.loot.craft", "只能合成获取");
        add("moonstone.book.loot.dungeon", "发现在地牢矿井之类的战利品箱子里");
        add("moonstone.book.loot.has.1", "需要佩戴一些物品才能获取");
        add("moonstone.book.loot.has.2", "需要佩戴Necora物品才能获取");
        add("moonstone.book.loot.has.3", "发现在多数战利品箱子里");
        add("moonstone.book.loot.necora", "发现在多数箱子里（需佩戴Necora病毒）");
        add("moonstone.book.loot.not", "目前无法从身上怪物上掉落");
        add("moonstone.book.loot.not.1", "无法获取");
        add("moonstone.book.maxamout.1", "三种符石的融合版本");
        add("moonstone.book.maxamout.2", "聚集了三色符石的所有能力");
        add("moonstone.book.mayhemcrystal.1", "提供大量的伤害");
        add("moonstone.book.mayhemcrystal.2", "可以由大战争水晶合成");
        add("moonstone.book.mouse", "点击查看详情");
        add("moonstone.book.nda.main", "需要右键植入到相关物品内使用");
        add("moonstone.book.necora.1", "需要佩戴它才开始基因类型物品的获取");
        add("moonstone.book.nightmare_base.1", "恶念的起始，光明的另一面\n\n佩戴获取一些罪孽：窥眸，死兆，颠倒，救赎\n愚者，洞悉，起始\n基座一旦与你建立联系，将无法取下");
        add("moonstone.book.nightmare_base.main", "噩梦基座");
        add("moonstone.book.not", "右键关闭详细界面");
        add("moonstone.book.ocean_affinity.1", "增加游泳速度");
        add("moonstone.book.owner_blood_attack_eye.1", "增加10%血灵增生体的攻击间隔");
        add("moonstone.book.owner_blood_attack_eye.2", "增加20%血灵伤害");
        add("moonstone.book.owner_blood_boom_eye.1", "血球会在击中时爆炸");
        add("moonstone.book.owner_blood_boom_eye.2", "减少20%血珠速度");
        add("moonstone.book.owner_blood_boom_eye.3", "增加200%血灵增生体的攻击间隔");
        add("moonstone.book.owner_blood_earth.1", "血灵增生体不会再攻击");
        add("moonstone.book.owner_blood_earth.2", "吸引生物和掉落物（变成磁铁）");
        add("moonstone.book.owner_blood_effect_eye.1", "血球会在击中时附加大量的负面效果");
        add("moonstone.book.owner_blood_eye.1", "减少20%血灵增生体的攻击间隔");
        add("moonstone.book.owner_blood_speed_eye.1", "减少50%血灵增生体的攻击间隔");
        add("moonstone.book.owner_blood_speed_eye.2", "增加300%血珠速度");
        add("moonstone.book.owner_blood_speed_eye.3", "但是发射的血珠不再会追踪生物");
        add("moonstone.book.owner_blood_vex.1", "血珠击中后会恢复主人的生命值");
        add("moonstone.book.owner_blood_vex.2", "其数值取决于血灵增生体的伤害");
        add("moonstone.book.owner_blood_vex.3", "血灵增生体的伤害降低3点");
        add("moonstone.book.rage_crystal.1", "提供些许伤害和生命值");
        add("moonstone.book.rage_crystal.2", "可以合成");
        add("moonstone.book.rage_crystal_big.1", "提供近战伤害和生命值");
        add("moonstone.book.rage_crystal_big.2", "可以由血怒水晶合成");
        add("moonstone.book.rage_crystal_max.1", "提供大量的伤害和生命值");
        add("moonstone.book.rage_crystal_max.2", "可以由大血怒水晶合成");
        add("moonstone.book.redamout.1", "造成伤害会有概率获得力量效果");
        add("moonstone.book.redamout.2", "可以合成获取，也可以出现在战利品箱子里");
        add("moonstone.book.spliced_activation.1", "僵尸的最大生命值提高50%，且快速恢复生命值");
        add("moonstone.book.surge.1", "僵尸/宠物单位造成的伤害提高20%");
        add("moonstone.book.test.1", "作者：亚特格拉德（YTGLD）");
        add("moonstone.book.test.2", "贡献者：秋季");
        add("moonstone.book.test.main", "坠入梦乡");
        add("moonstone.book.the_blood_book.1", "融合所有血之书籍的所有能力");
        add("moonstone.book.thermo_necro.1", "降低60%僵尸的腐烂速度");
        add("moonstone.book.warcrystal.1", "提供些许伤害");
        add("moonstone.book.warcrystal.2", "可以合成");
        add("moonstone.book.warm_approachable.1", "增加移速");
        add("moonstone.calcareous.modify", "僵尸/宠物单位增加8点护甲");
        add("moonstone.config.Apple", "锁血果生命");
        add("moonstone.config.Apple2", "锁血果2受伤");
        add("moonstone.config.Apple3", "锁血果3伤害");
        add("moonstone.config.BlackEyeEye", "惶恐肉瘤伤害");
        add("moonstone.config.BlackEyeHeart", "死心伤害");
        add("moonstone.config.BlackEyeRed", "口红最大属性");
        add("moonstone.config.BlackEyeRed2", "口红2黑名单属性");
        add("moonstone.config.Brain", "莫里斯脑子次数");
        add("moonstone.config.Brain2", "莫里斯脑子2伤害");
        add("moonstone.config.Candle", "古蜡烛伤害");
        add("moonstone.config.EctoplasmStar", "幸运星最大转换幸运值");
        add("moonstone.config.EctoplasmStar2", "幸运星2最大治疗属性");
        add("moonstone.config.EndBone", "末世脊骨伤害倍率");
        add("moonstone.config.Fermentation", "埋伏狩猎最小伤害");
        add("moonstone.config.Fermentation2", "埋伏狩猎2致命一击伤害");
        add("moonstone.config.FoolBone", "危险的头骨伤害");
        add("moonstone.config.FoolSoul", "灵魂生命");
        add("moonstone.config.FoolSoul2", "灵魂2受伤");
        add("moonstone.config.GodAcidicReflux", "酸性液体逆流属性倍率");
        add("moonstone.config.GodHypertrophy", "蚓状肌强化暴击概率会乘以这个值");
        add("moonstone.config.GodNajaMortis", "眼镜蛇式锁定最大伤害会乘以这个值");
        add("moonstone.config.GodPeptideSurge", "肽合成增强属性倍率");
        add("moonstone.config.HypocriticalSelfEsteem", "虚伪自尊黑名单");
        add("moonstone.config.InsightDrug", "疯狂药剂属性");
        add("moonstone.config.InsightDrug2", "疯狂药剂每次装备物品减少的属性");
        add("moonstone.config.InsightInsane", "战神石伤害");
        add("moonstone.config.NightmareBaseFool", "愚者之危属性衰败");
        add("moonstone.config.NightmareBaseItem", "噩梦基座开局基于几个物品");
        add("moonstone.config.NightmareBaseItemReversal", "颠倒之物属性减少的值的黑名单");
        add("moonstone.config.NightmareBaseItemReversal2", "颠倒之物2死亡时跌的属性");
        add("moonstone.config.NightmareBaseStart", "噩梦之起始治疗");
        add("moonstone.config.NightmareBaseStone", "死兆方尖碑伤害倍数");
        add("moonstone.config.PrisonOfSin", "罪孽囚笼罪孽囚笼的属性增长倍数");
        add("moonstone.config.PrisonOfSin2", "罪孽囚笼2罪孽囚笼的属性增长最大值，单位是“%”，（因为默认罪孽囚笼给予了10%，所以应该比默认值高10%）");
        add("moonstone.config.PrisonOfSin3", "罪孽囚笼3罪孽囚笼的生命值和护甲的属性衰败");
        add("moonstone.config.PrisonOfSin4", "罪孽囚笼4属性黑名单");
        add("moonstone.config.RedemptionDeception", "欺骗生命值");
        add("moonstone.config.RedemptionDownAndOut", "这什么属性");
        add("moonstone.config.ReversalCard", "卡片最大属性");
        add("moonstone.config.ReversalMysterious", "神秘之物黑名单");
        add("moonstone.config.StartPower", "权力属性减少的值的黑名单");
        add("moonstone.config.StartPower2", "权力2死亡时跌的属性");
        add("moonstone.config.StoneVirus", "融合病毒属性");
        add("moonstone.config.StoneVirus2", "融合病毒2生命值");
        add("moonstone.configuration.Apple", "锁血果");
        add("moonstone.configuration.Apple2", "锁血果2");
        add("moonstone.configuration.Apple3", "锁血果3");
        add("moonstone.configuration.BlackEyeEye", "惶恐肉瘤");
        add("moonstone.configuration.BlackEyeHeart", "死心");
        add("moonstone.configuration.BlackEyeRed", "口红");
        add("moonstone.configuration.BlackEyeRed2", "口红2");
        add("moonstone.configuration.BloodItem", "血魔");
        add("moonstone.configuration.BloodItem.button", "血魔");
        add("moonstone.configuration.BloodItem.tooltip", "血魔");
        add("moonstone.configuration.Brain", "莫里斯脑子");
        add("moonstone.configuration.Brain2", "莫里斯脑子2");
        add("moonstone.configuration.Candle", "古蜡烛");
        add("moonstone.configuration.Ectoplasm", "灵质");
        add("moonstone.configuration.Ectoplasm.button", "灵质");
        add("moonstone.configuration.Ectoplasm.tooltip", "灵质");
        add("moonstone.configuration.EctoplasmStar", "幸运星");
        add("moonstone.configuration.EctoplasmStar2", "幸运星2");
        add("moonstone.configuration.EndBone", "末世脊骨");
        add("moonstone.configuration.Fermentation", "埋伏狩猎");
        add("moonstone.configuration.Fermentation2", "埋伏狩猎2");
        add("moonstone.configuration.FoolBone", "危险的头骨");
        add("moonstone.configuration.FoolSoul", "灵魂");
        add("moonstone.configuration.FoolSoul2", "灵魂2");
        add("moonstone.configuration.GodAcidicReflux", "酸性液体逆流");
        add("moonstone.configuration.GodHypertrophy", "蚓状肌强化");
        add("moonstone.configuration.GodNajaMortis", "眼镜蛇式锁定");
        add("moonstone.configuration.GodPeptideSurge", "肽合成增强");
        add("moonstone.configuration.HypocriticalSelfEsteem", "虚伪自尊");
        add("moonstone.configuration.ITEMCategoryMLS", "莫里斯");
        add("moonstone.configuration.ITEMCategoryMLS.button", "莫里斯");
        add("moonstone.configuration.ITEMCategoryMLS.tooltip", "莫里斯");
        add("moonstone.configuration.InsightDrug", "疯狂药剂");
        add("moonstone.configuration.InsightDrug2", "疯狂药剂");
        add("moonstone.configuration.InsightInsane", "战神石");
        add("moonstone.configuration.Nightmare", "噩梦");
        add("moonstone.configuration.Nightmare.button", "噩梦");
        add("moonstone.configuration.Nightmare.tooltip", "噩梦");
        add("moonstone.configuration.NightmareBaseFool", "愚者之危");
        add("moonstone.configuration.NightmareBaseItem", "噩梦基座");
        add("moonstone.configuration.NightmareBaseItemReversal", "颠倒之物");
        add("moonstone.configuration.NightmareBaseItemReversal2", "颠倒之物2");
        add("moonstone.configuration.NightmareBaseStart", "噩梦之起始");
        add("moonstone.configuration.NightmareBaseStone", "死兆方尖碑");
        add("moonstone.configuration.PrisonOfSin", "罪孽囚笼");
        add("moonstone.configuration.PrisonOfSin2", "罪孽囚笼2");
        add("moonstone.configuration.PrisonOfSin3", "罪孽囚笼3");
        add("moonstone.configuration.PrisonOfSin4", "罪孽囚笼4");
        add("moonstone.configuration.RedemptionDeception", "欺骗");
        add("moonstone.configuration.RedemptionDownAndOut", "这什么");
        add("moonstone.configuration.ReversalCard", "卡片");
        add("moonstone.configuration.ReversalMysterious", "神秘之物");
        add("moonstone.configuration.StartPower", "权力");
        add("moonstone.configuration.StartPower2", "权力2");
        add("moonstone.configuration.StoneVirus", "融合病毒");
        add("moonstone.configuration.StoneVirus2", "融合病毒2");
        add("moonstone.configuration.TheNecora", "僵尸");
        add("moonstone.configuration.TheNecora.button", "僵尸");
        add("moonstone.configuration.TheNecora.tooltip", "僵尸");
        add("moonstone.curse.name.all", "施加了诅咒[Ctrl]");
        add("moonstone.curse.name.all.this", "这个物品被");
        add("moonstone.curse.name.bone", "骨头");
        add("moonstone.curse.name.cell_cell", "细胞");
        add("moonstone.curse.name.chromosome", "染色体");
        add("moonstone.curse.name.die", "死灵");
        add("moonstone.curse.name.die_body", "尸体");
        add("moonstone.curse.name.doctor", "巫医");
        add("moonstone.curse.name.meet", "肉瘤");
        add("moonstone.cytopathic_boost.modify", "僵尸获得40%召唤者的伤害，速度，护甲");
        add("moonstone.difficulty.name.all", "的DNA序列");
        add("moonstone.difficulty.name.easy", "普通");
        add("moonstone.difficulty.name.god", "类神");
        add("moonstone.difficulty.name.god_loot_a", "异变");
        add("moonstone.difficulty.name.god_loot_b", "神创");
        add("moonstone.difficulty.name.god_loot_c", "未知");
        add("moonstone.difficulty.name.hard", "极度复杂");
        add("moonstone.difficulty.name.normal", "复杂");
        add("moonstone.difficulty.name.peaceful", "简单");
        add("moonstone.difficulty.name.true_god", "神化");
        add("moonstone.earth_affinity.modify", "增加击退抗性");
        add("moonstone.frontal_lobe.modify", "僵尸/宠物单位增加30%速度");
        add("moonstone.high_energy.modify", "僵尸/宠物单位增加10点生命值且自然恢复");
        add("moonstone.item.kill", "你还没有佩戴它没有杀死过生物");
        add("moonstone.jei.blood", "需要佩戴血之魔盒杀死生物获取");
        add("moonstone.jei.bloodvirus", "需要佩戴一个解锁所有药物的医药箱杀死末影龙来获取暗影基因，之后使用暗影基因右键Necora病毒获得暗影瘟疫");
        add("moonstone.jei.bloodvirus.all", "需要佩戴暗影瘟疫才能发现于地牢，矿井之中");
        add("moonstone.jei.bloodvirus.treasure.all", "需要佩戴暗影瘟疫才能发现于宝藏之中");
        add("moonstone.jei.calcification", "： 受到350次伤害，需要佩戴医药箱");
        add("moonstone.jei.cell", "需要佩戴Necora病毒才能发现于宝藏战利品之中，佩戴后将无法再次获得");
        add("moonstone.jei.cell.all", "需要佩戴细胞重生基因佩戴才能发现于宝藏战利品之中");
        add("moonstone.jei.ectoplasm.all", "大部分灵质物品都可以吃，恢复大量饥饿值");
        add("moonstone.jei.ectoplasm.ectoplasmball", "可通过杀死生物获取，有极高的概率发现于战利品箱子里");
        add("moonstone.jei.ectoplasm.ectoplasmcloub", "可通过杀死生物获取，也可合成");
        add("moonstone.jei.ectoplasmstone", "开局的随机护身符之一");
        add("moonstone.jei.giant", "需要佩戴Necora病毒才能发现于宝藏战利品之中");
        add("moonstone.jei.giant_nightmare", "需要佩戴巨人僵尸基因片段和梦魇之眼再杀死坚守者有概率掉落");
        add("moonstone.jei.god_dna", "使用两个“类神的基因序列”的相同DNA物品合成");
        add("moonstone.jei.item.moonstone.apple", "杀死血量大于自身30倍最大生命值的生物获取，一个玩家只能获得一个");
        add("moonstone.jei.item.moonstone.blood_god", "需要500击杀数，5000治疗量，10000造成伤害获取");
        add("moonstone.jei.item.moonstone.candle", "合成获取");
        add("moonstone.jei.item.moonstone.defend_against_runestone", "发现在地牢和矿井，概率10%，一个玩家只能获得一个");
        add("moonstone.jei.item.moonstone.end_bone", "杀死坚守者获取，一个玩家只能获得一个");
        add("moonstone.jei.item.moonstone.falling_immortals", "在佩戴倾斜异果的情况下主手手持末影之眼杀死凋零获取（实际上它会直接替换倾斜异果为坠仙）");
        add("moonstone.jei.item.moonstone.hypocritical_self_esteem", "在存在凋零状态的情况下，使用空手给末影龙最后一击，一个玩家只能获得一个");
        add("moonstone.jei.item.moonstone.lead", "死亡200次");
        add("moonstone.jei.item.moonstone.nightmare_base.all", "，需要佩戴:");
        add("moonstone.jei.item.moonstone.nightmare_base_black_eye_eye", "杀死坚守者");
        add("moonstone.jei.item.moonstone.nightmare_base_black_eye_heart", "在同时满足下列条件时触发不死图腾获取：中毒,凋零,缓慢并且着火");
        add("moonstone.jei.item.moonstone.nightmare_base_black_eye_red", "发现在古城，概率在5%左右");
        add("moonstone.jei.item.moonstone.nightmare_base_fool_betray", "杀死末影龙");
        add("moonstone.jei.item.moonstone.nightmare_base_fool_bone", "杀死坚守者");
        add("moonstone.jei.item.moonstone.nightmare_base_fool_soul", "杀死凋灵");
        add("moonstone.jei.item.moonstone.nightmare_base_insight_collapse", "杀死末影龙");
        add("moonstone.jei.item.moonstone.nightmare_base_insight_drug", "玩家身上存在9种不同的正面药水状态时给予");
        add("moonstone.jei.item.moonstone.nightmare_base_insight_insane", "死掉或者跳入末地传送门回主世界");
        add("moonstone.jei.item.moonstone.nightmare_base_redemption_deception", "在有不详之兆的情况下杀死100个掠夺者");
        add("moonstone.jei.item.moonstone.nightmare_base_redemption_degenerate", "在有村庄英雄的情况下杀死100个村民");
        add("moonstone.jei.item.moonstone.nightmare_base_redemption_down_and_out", "完成一次失败的袭击");
        add("moonstone.jei.item.moonstone.nightmare_base_reversal_card", "杀死末影龙");
        add("moonstone.jei.item.moonstone.nightmare_base_reversal_mysterious", "在佩戴反转球体的情况下开古城的箱子，概率100%，但是只能获得一个");
        add("moonstone.jei.item.moonstone.nightmare_base_reversal_orb", "使用颠倒之物的中毒扣血杀死自己");
        add("moonstone.jei.item.moonstone.nightmare_base_start_egg", "杀死嗅探兽");
        add("moonstone.jei.item.moonstone.nightmare_base_start_pod", "开地牢的箱子，概率25%，只能获取一个");
        add("moonstone.jei.item.moonstone.nightmare_base_start_power", "杀死坚守者");
        add("moonstone.jei.item.moonstone.nightmare_base_stone_brain", "杀死僵尸，获取材料，不过这种材料只能获得一个");
        add("moonstone.jei.item.moonstone.nightmare_base_stone_meet", "杀死末影龙");
        add("moonstone.jei.item.moonstone.nightmare_base_stone_virus", "被凋零攻击触发不死图腾");
        add("moonstone.jei.item.moonstone.owner_blood_attack_eye", "它发现于古城，但是需要佩戴封魔烛台才能发现\n\n增加10%血灵增生体的攻击间隔\n增加20%血灵伤害");
        add("moonstone.jei.item.moonstone.owner_blood_boom_eye", "它发现于古城，但是需要佩戴封魔烛台才能发现\n\n血球会在击中时爆炸\n减少20%血珠速度\n增加200%血灵增生体的攻击间隔\n每次爆炸都相当于你发起了攻击\n\n我觉得你应该穿点防爆的东西....");
        add("moonstone.jei.item.moonstone.owner_blood_earth", "它发现于古城，但是需要佩戴封魔烛台才能发现\n\n血灵增生体不会再攻击\n但会变成一个超级磁铁，它不仅可以吸引生物和掉落物并且还可以吸引然后吞噬弹射物\n吞噬弹射物恢复主人生命值\n\n你可以用来运送村民或者干什么别的");
        add("moonstone.jei.item.moonstone.owner_blood_effect_eye", "它发现于古城，但是需要佩戴封魔烛台才能发现\n\n血球会在击中时附加大量的负面效果\n减少50%血珠伤害");
        add("moonstone.jei.item.moonstone.owner_blood_eye", "它发现于古城，但是需要佩戴封魔烛台才能发现\n\n减少20%血灵增生体的攻击间隔”");
        add("moonstone.jei.item.moonstone.owner_blood_speed_eye", "它发现于古城，但是需要佩戴封魔烛台才能发现\n\n减少50%血灵增生体的攻击间隔\n增加300%血珠速度\n但是发射的血珠不再会追踪生物");
        add("moonstone.jei.item.moonstone.owner_blood_vex", "它发现于古城，但是需要佩戴封魔烛台才能发现\n\n血珠击中后会恢复主人的生命值\n其数值取决于血灵增生体的伤害\n血灵增生体的伤害降低3点");
        add("moonstone.jei.item.moonstone.revive_runestone", "发现在地牢和矿井，概率10%，一个玩家只能获得一个");
        add("moonstone.jei.item.moonstone.ring", "获得超过10种负面BUFF的情况下触发不死图腾，一个玩家只能获得一个");
        add("moonstone.jei.item.moonstone.strengthen_runestone", "发现在地牢和矿井，概率10%，一个玩家只能获得一个");
        add("moonstone.jei.item.moonstone.tricky_puppets", "发现于林地府邸，概率75%，一个玩家只能获得一个");
        add("moonstone.jei.item.moonstone.wolf", "让你的狼杀死监守者");
        add("moonstone.jei.loot.all", "有概率发现于战利品箱子里");
        add("moonstone.jei.masticatory", "： 吃8个金苹果，需要佩戴医药箱");
        add("moonstone.jei.maulice.all", "杀死僵尸有可能掉落");
        add("moonstone.jei.maxamout", "佩戴三种颜色的符石，然后杀死远古守卫者");
        add("moonstone.jei.nanodoom.all", "发现在古城");
        add("moonstone.jei.necora.all", "需要佩戴Necora病毒才能发现于地牢，矿井之中");
        add("moonstone.jei.necora.bnabush.all", "需要佩戴Necora病毒才能发现于宝藏战利品之中");
        add("moonstone.jei.necora.giant_nightmare.all", "需要佩戴梦魇巨人基因片段后才能发现于宝藏战利品之中");
        add("moonstone.jei.necora.treasure.all", "需要佩戴Necora病毒才能发现于宝藏战利品之中");
        add("moonstone.jei.nightmare", ": Requires wearing nightmare eye to be found in dungeons and mines");
        add("moonstone.jei.nightmare_cube", "： ");
        add("moonstone.jei.nightmare_head", "： ");
        add("moonstone.jei.nightmare_heart", "： ");
        add("moonstone.jei.nightmare_orb", "： ");
        add("moonstone.jei.nightmareanchor", "： ");
        add("moonstone.jei.nightmarecharm", "： ");
        add("moonstone.jei.nightmareeye", "： ");
        add("moonstone.jei.nightmaremoai", "： ");
        add("moonstone.jei.nightmarerotten", "： ");
        add("moonstone.jei.nightmarestone", "： ");
        add("moonstone.jei.nightmaretreasure", "： ");
        add("moonstone.jei.nightmarewater", "： ");
        add("moonstone.jei.pain.all", "发现于下界");
        add("moonstone.jei.polyphagia", "： 吃个附魔金苹果，需要佩戴医药箱");
        add("moonstone.jei.quadriceps", "： 跳500次，需要佩戴医药箱");
        add("moonstone.jei.reanimation", "： 死掉一次，需要佩戴医药箱");
        add("moonstone.jei.twistedstone", "开局的随机护身符之一");
        add("moonstone.jei.wind_and_rain", "同时带上七剑修罗和骤雨然后摸地牢/矿井/宝藏/城市类型箱子");
        add("moonstone.life.error", "你无法在拥有锁血的情况下使用 洞悉者的邪术法球 ");
        add("moonstone.masticatory.modify", "进食速度提高25%");
        add("moonstone.nightmare.name", "这个物品只能在佩戴深渊之眼的情况下使用");
        add("moonstone.nine_sword_books.tool", "你必须使用剑类武器才能造成伤害");
        add("moonstone.ocean_affinity.modify", "增加游泳速度");
        add("moonstone.owner_blood_attack_eye.modify", "增加血灵的血珠速度");
        add("moonstone.owner_blood_boom_eye.modify", "增加自身暴击伤害");
        add("moonstone.owner_blood_earth.modify", "增加自身击退抗性");
        add("moonstone.owner_blood_effect_eye.modify", "增加自身速度");
        add("moonstone.owner_blood_eye.modify", "增加血灵的血珠速度");
        add("moonstone.owner_blood_speed_eye.modify", "缩短血灵的攻击间隔");
        add("moonstone.owner_blood_vex.modify", "增加自身治疗");
        add("moonstone.polyphagia.modify", "吃下食物恢复6点生命值");
        add("moonstone.reanimation.modify", "允许受到致命伤害后原地复活");
        add("moonstone.spliced_activation.modify", "僵尸的最大生命值提高50%，且快速恢复生命值");
        add("moonstone.string.cooling", "冷却时间：");
        add("moonstone.super_nightmare.name", "只有佩戴噩梦基座的人");
        add("moonstone.super_nightmare.name.1", "才可以使用这个物品");
        add("moonstone.surge.modify", "僵尸/宠物单位造成的伤害提高20%");
        add("moonstone.thermo_necro.modify", "降低60%僵尸的腐烂速度");
        add("moonstone.tool.youcannot", "你必须将重复物品取出才能使用");
        add("moonstone.translation.nightmare", "你感受到了强烈的不安与恐惧");
        add("moonstone.translation.nightmare.1", "你真的要佩戴它吗");
        add("moonstone.twelve.1", "生肖：子");
        add("moonstone.twelve.10", "生肖：酉");
        add("moonstone.twelve.11", "生肖：戌");
        add("moonstone.twelve.12", "生肖：亥");
        add("moonstone.twelve.2", "生肖：丑");
        add("moonstone.twelve.3", "生肖：寅");
        add("moonstone.twelve.4", "生肖：卯");
        add("moonstone.twelve.5", "生肖：辰");
        add("moonstone.twelve.6", "生肖：巳");
        add("moonstone.twelve.7", "生肖：午");
        add("moonstone.twelve.8", "生肖：未");
        add("moonstone.twelve.9", "生肖：申");
        add("moonstone.use.dna", "Hint: Crush with a medicine grinder");
        add("moonstone.use.dna.attribute", "此物品可支持嵌入下列物件");
        add("moonstone.warm_approachable.modify", "增加移速");
        add("sword.moonstone.lvl", "重");
        add("tool.string.ectoplasmball", "这个物品是这个模组的核心内容");
        add("tool.string.ectoplasmball.1", "通过杀死僵尸,骷髅等常见生物获取");
        add("tool.string.ectoplasmball.2", "也可以通过和牧师交易获取");
        add("tool.string.ectoplasmball.3", "可用于合成灵质云");
    }
}
