package com.ytgld.moonstone.item;

import com.ytgld.moonstone.Book;
import com.ytgld.moonstone.Moonstone;
import com.ytgld.moonstone.item.ms.BloodItem;
import com.ytgld.moonstone.item.ms.CommonItem;
import com.ytgld.moonstone.item.ms.blood.*;
import com.ytgld.moonstone.item.ms.blood.magic.*;
import com.ytgld.moonstone.item.ms.ectoplasm.*;
import com.ytgld.moonstone.item.ms.ectoplasm.soul.SoulBattery;
import com.ytgld.moonstone.item.ms.ectoplasm.soul.SoulCube;
import com.ytgld.moonstone.item.ms.maulice.*;
import com.ytgld.moonstone.item.ms.maxitem.*;
import com.ytgld.moonstone.item.ms.maxitem.uncommon.*;
import com.ytgld.moonstone.item.ms.maxitem.uncommon.common.*;
import com.ytgld.moonstone.item.ms.nanodoom.*;
import com.ytgld.moonstone.item.ms.necora.EmbeddedDNA;
import com.ytgld.moonstone.item.ms.necora.Necora;
import com.ytgld.moonstone.item.ms.necora.dna.*;
import com.ytgld.moonstone.item.ms.necora.dna.god.*;
import com.ytgld.moonstone.item.ms.necora.dnabush.GianNnightmare;
import com.ytgld.moonstone.item.ms.necora.dnabush.giant_dna.BoneCell;
import com.ytgld.moonstone.item.ms.necora.dnabush.giant_dna.DisgustingCells;
import com.ytgld.moonstone.item.ms.necora.dnabush.giant_dna.MotherCell;
import com.ytgld.moonstone.item.ms.necora.dnabush.giant_dna.ParasiticCell;
import com.ytgld.moonstone.item.ms.necora.dnabush.me.Air;
import com.ytgld.moonstone.item.ms.necora.dnabush.me.Motor;
import com.ytgld.moonstone.item.ms.necora.dnabush.me.Watergen;
import com.ytgld.moonstone.item.ms.necora.dnabush.small.*;
import com.ytgld.moonstone.item.ms.necora.medicine.MedicineBox;
import com.ytgld.moonstone.item.ms.necora.medicine.med.*;
import com.ytgld.moonstone.item.si.fall.DivineFallRing;
import com.ytgld.moonstone.item.si.nightmare.base.*;
import com.ytgld.moonstone.item.si.nightmare.eye.BlackEyeEye;
import com.ytgld.moonstone.item.si.nightmare.eye.BlackEyeHeart;
import com.ytgld.moonstone.item.si.nightmare.eye.BlackEyeRed;
import com.ytgld.moonstone.item.si.nightmare.eye.TrickyPuppets;
import com.ytgld.moonstone.item.si.nightmare.fool.Apple;
import com.ytgld.moonstone.item.si.nightmare.fool.FoolBetray;
import com.ytgld.moonstone.item.si.nightmare.fool.FoolBone;
import com.ytgld.moonstone.item.si.nightmare.fool.FoolSoul;
import com.ytgld.moonstone.item.si.nightmare.insight.*;
import com.ytgld.moonstone.item.si.nightmare.other.*;
import com.ytgld.moonstone.item.si.nightmare.redemption.HypocriticalSelfEsteem;
import com.ytgld.moonstone.item.si.nightmare.redemption.RedemptionDeception;
import com.ytgld.moonstone.item.si.nightmare.redemption.RedemptionDegenerate;
import com.ytgld.moonstone.item.si.nightmare.redemption.RedemptionDownAndOut;
import com.ytgld.moonstone.item.si.nightmare.reversal.*;
import com.ytgld.moonstone.item.si.nightmare.start.*;
import com.ytgld.moonstone.item.si.nightmare.stone.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;
import java.util.function.Supplier;

public class InitItems {
    public static final Item.Properties singleItem = new Item.Properties().stacksTo(1);
    public static final Item.Properties eightStack = new Item.Properties().stacksTo(8);
    public static final Item.Properties fullStack = new Item.Properties().stacksTo(64);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Moonstone.MODID);
    public static final DeferredItem<@NotNull Item> nightmare_base_fool = register("nightmare_base_fool", singleItem, NightmareBaseFool::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_insight = register("nightmare_base_insight", singleItem, NightmareBaseInsight::new);
    public static final DeferredItem<@NotNull Item> NightmareBaseItem_ = register("nightmare_base", singleItem, NightmareBaseItem::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_black_eye = register("nightmare_base_black_eye", singleItem, NightmareBaseBlackEye::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_redemption = register("nightmare_base_redemption", singleItem, NightmareBaseRedemption::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_reversal = register("nightmare_base_reversal", singleItem, NightmareBaseItemReversal::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_start = register("nightmare_base_start", singleItem, NightmareBaseStart::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_stone = register("nightmare_base_stone", singleItem, NightmareBaseStone::new);
    public static final DeferredItem<@NotNull Item> end_bone = register("end_bone", singleItem, EndBone::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_stone_brain = register("nightmare_base_stone_brain", singleItem, StoneBrain::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_stone_meet = register("nightmare_base_stone_meet", singleItem, StoneMeat::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_stone_virus = register("nightmare_base_stone_virus", singleItem, StoneVirus::new);
    public static final DeferredItem<@NotNull Item> NightmareVirus_ = register("nightmare_virus", singleItem, NightmareVirus::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_black_eye_eye = register("nightmare_base_black_eye_eye", singleItem, BlackEyeEye::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_black_eye_heart = register("nightmare_base_black_eye_heart", singleItem, BlackEyeHeart::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_black_eye_red = register("nightmare_base_black_eye_red", singleItem, BlackEyeRed::new);
    public static final DeferredItem<@NotNull Item> tricky_puppets = register("tricky_puppets", singleItem, TrickyPuppets::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_redemption_deception = register("nightmare_base_redemption_deception", singleItem, RedemptionDeception::new);
    public static final DeferredItem<@NotNull Item> hypocritical_self_esteem = register("hypocritical_self_esteem", singleItem, HypocriticalSelfEsteem::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_redemption_down_and_out = register("nightmare_base_redemption_down_and_out", singleItem, RedemptionDownAndOut::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_redemption_degenerate = register("nightmare_base_redemption_degenerate", singleItem, RedemptionDegenerate::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_insight_insane = register("nightmare_base_insight_insane", singleItem, InsightInsane::new);
    public static final DeferredItem<@NotNull Item> ring = register("ring", singleItem, Ring::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_insight_drug = register("nightmare_base_insight_drug", singleItem, InsightDrug::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_insight_collapse = register("nightmare_base_insight_collapse", singleItem, InsightCollapse::new);
    public static final DeferredItem<@NotNull Item> hidden_blade = register("hidden_blade", singleItem, HiddenBlade::new);
    public static final DeferredItem<@NotNull Item> candle = register("candle", singleItem, Candle::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_reversal_card = register("nightmare_base_reversal_card", singleItem, ReversalCard::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_reversal_mysterious = register("nightmare_base_reversal_mysterious", singleItem, ReversalMysterious::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_reversal_orb = register("nightmare_base_reversal_orb", singleItem, ReversalOrb::new);
    public static final DeferredItem<@NotNull Item> apple = register("apple", singleItem, Apple::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_fool_betray = register("nightmare_base_fool_betray", singleItem, FoolBetray::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_fool_bone = register("nightmare_base_fool_bone", singleItem, FoolBone::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_fool_soul = register("nightmare_base_fool_soul", singleItem, FoolSoul::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_start_egg = register("nightmare_base_start_egg", singleItem, StartEgg::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_start_pod = register("nightmare_base_start_pod", singleItem, StartPod::new);
    public static final DeferredItem<@NotNull Item> nightmare_base_start_power = register("nightmare_base_start_power", singleItem, StartPower::new);
    public static final DeferredItem<@NotNull Item> wolf = register("wolf", singleItem, Wolf::new);
    public static final DeferredItem<@NotNull Item> the_divine_fall_ring = register("the_divine_fall_ring", singleItem, DivineFallRing::new);
    //-------------------------------------common---------------------------------------------------------------------------------------------------------//
    public static final DeferredItem<@NotNull Item> soulbattery = register("soulbattery", singleItem, SoulBattery::new);
    public static final DeferredItem<@NotNull Item> soulcube = register("soulcube", singleItem, SoulCube::new);
    public static final DeferredItem<@NotNull Item> beacon = register("beacon", singleItem, Beacon::new);
    public static final DeferredItem<@NotNull Item> ectoplasmapple = register("ectoplasmapple", singleItem, EctoplasmApple::new);
    public static final DeferredItem<@NotNull Item> ectoplasmball = register("ectoplasmball", fullStack, EctoplasmBall::new);
    public static final DeferredItem<@NotNull Item> ectoplasmbattery = register("ectoplasmbattery", singleItem, EctoplasmBattery::new);
    public static final DeferredItem<@NotNull Item> ectoplasmcloub = register("ectoplasmcloub", fullStack, EctoplasmCloub::new);
    public static final DeferredItem<@NotNull Item> ectoplasmcube = register("ectoplasmcube", fullStack, EctoplasmCube::new);
    public static final DeferredItem<@NotNull Item> ectoplasmhorseshoe = register("ectoplasmhorseshoe", singleItem, EctoplasmHorseshoe::new);
    public static final DeferredItem<@NotNull Item> ectoplasmprism = register("ectoplasmprism", fullStack, EctoplasmPrism::new);
    public static final DeferredItem<@NotNull Item> ectoplasmshild = register("ectoplasmshild", singleItem, EctoplasmShild::new);
    public static final DeferredItem<@NotNull Item> ectoplasmsoul = register("ectoplasmsoul", singleItem, EctoplasmSoul::new);
    public static final DeferredItem<@NotNull Item> ectoplasmstar = register("ectoplasmstar", singleItem, EctoplasmStar::new);
    public static final DeferredItem<@NotNull Item> ectoplasmtree = register("ectoplasmtree", singleItem, EctoplasmtTee::new);
    public static final DeferredItem<@NotNull Item> brain = register("brain", singleItem, Brain::new);
    public static final DeferredItem<@NotNull Item> mblock = register("mblock", singleItem, MBlock::new);
    public static final DeferredItem<@NotNull Item> mbox = register("mbox", singleItem, MBox::new);
    public static final DeferredItem<@NotNull Item> mbattery = register("mbattery", singleItem, MBattery::new);
    public static final DeferredItem<@NotNull Item> mbottle = register("mbottle", singleItem, MBottle::new);
    public static final DeferredItem<@NotNull Item> meye = register("meye", singleItem, MEye::new);
    public static final DeferredItem<@NotNull Item> mhead = register("mhead", singleItem, MHead::new);
    public static final DeferredItem<@NotNull Item> mkidney = register("mkidney", singleItem, MKidney::new);
    public static final DeferredItem<@NotNull Item> morb = register("morb", singleItem, MOrb::new);
    public static final DeferredItem<@NotNull Item> mring = register("mring", singleItem, MRing::new);
    public static final DeferredItem<@NotNull Item> mshell = register("mshell", singleItem, MShell::new);
    public static final DeferredItem<@NotNull Item> blood_candle = register("blood_candle", singleItem, BloodCandle::new);
    public static final DeferredItem<@NotNull Item> blood_magic_box = register("blood_magic_box", singleItem, BloodMagicBox::new);
    public static final DeferredItem<@NotNull Item> the_blood_book = register("the_blood_book", singleItem, TheBloodBook::new);
    public static final DeferredItem<@NotNull Item> undead_blood_charm = register("undead_blood_charm", singleItem, UndeadBloodCharm::new);
    public static final DeferredItem<@NotNull Item> blood_amout = register("blood_amout", singleItem, BloodAmout::new);
    public static final DeferredItem<@NotNull Item> blood_jelly = register("blood_jelly", singleItem, BloodJelly::new);
    public static final DeferredItem<@NotNull Item> blood_snake = register("blood_snake", singleItem, BloodSnake::new);
    public static final DeferredItem<@NotNull Item> killer = register("killer", singleItem, Killer::new);
    public static final DeferredItem<@NotNull Item> max_eye = register("max_eye", singleItem, MaxEye::new);
    public static final DeferredItem<@NotNull Item> the_prison_of_sin = register("the_prison_of_sin", singleItem, PrisonOfSin::new);
    public static final DeferredItem<@NotNull Item> blood = register("blood", fullStack, BloodItem::new);
    public static final DeferredItem<@NotNull Item> owner_blood_eye = register("owner_blood_eye", eightStack, BloodItem::new);
    public static final DeferredItem<@NotNull Item> owner_blood_attack_eye = register("owner_blood_attack_eye", eightStack, BloodItem::new);
    public static final DeferredItem<@NotNull Item> owner_blood_speed_eye = register("owner_blood_speed_eye", eightStack, BloodItem::new);
    public static final DeferredItem<@NotNull Item> owner_blood_boom_eye = register("owner_blood_boom_eye", eightStack, BloodItem::new);
    public static final DeferredItem<@NotNull Item> owner_blood_effect_eye = register("owner_blood_effect_eye", eightStack, BloodItem::new);
    public static final DeferredItem<@NotNull Item> owner_blood_vex = register("owner_blood_vex", eightStack, BloodItem::new);
    public static final DeferredItem<@NotNull Item> owner_blood_earth = register("owner_blood_earth", eightStack, BloodItem::new);
    //public static final DeferredItem<@NotNull Item> necora = register("necora", singleItem, (identifier) -> new Necora(identifier())); old version turned into the lambda.
    public static final DeferredItem<@NotNull Item> necora = register("necora", singleItem, Necora::new);
    public static final DeferredItem<@NotNull Item> ambush = register("ambush", singleItem, Ambush::new);
    public static final DeferredItem<@NotNull Item> atpoverdose = register("atpoverdose", singleItem, Atpoverdose::new);
    public static final DeferredItem<@NotNull Item> autolytic = register("autolytic", singleItem, Autolytic::new);
    public static final DeferredItem<@NotNull Item> fermentation = register("fermentation", singleItem, Fermentation::new);
    public static final DeferredItem<@NotNull Item> putrefactive = register("putrefactive", singleItem, Putrefactive::new);
    public static final DeferredItem<@NotNull Item> regenerative = register("regenerative", singleItem, Regenerative::new);
    public static final DeferredItem<@NotNull Item> GodAmbush = register("god_ambush", singleItem, GodAmbush::new);
    public static final DeferredItem<@NotNull Item> GodAtpoverdose = register("god_atpoverdose", singleItem, GodAtpoverdose::new);
    public static final DeferredItem<@NotNull Item> GodAutolytic = register("god_autolytic", singleItem, GodAutolytic::new);
    public static final DeferredItem<@NotNull Item> GodFermentation = register("god_fermentation", singleItem, GodFermentation::new);
    public static final DeferredItem<@NotNull Item> GodPutrefactive = register("god_putrefactive", singleItem, GodPutrefactive::new);
    public static final DeferredItem<@NotNull Item> GodRegenerative = register("god_regenerative", singleItem, GodRegenerative::new);
    public static final DeferredItem<@NotNull Item> air = register("air", singleItem, Air::new);
    public static final DeferredItem<@NotNull Item> motor = register("motor", singleItem, Motor::new);
    public static final DeferredItem<@NotNull Item> watergen = register("watergen", singleItem, Watergen::new);
    public static final DeferredItem<@NotNull Item> adrenaline = register("adrenaline", singleItem, Adrenaline::new);
    public static final DeferredItem<@NotNull Item> cell = register("cell", singleItem, Cell::new);
    public static final DeferredItem<@NotNull Item> cell_blood = register("cell_blood", singleItem, CellBlood::new);
    public static final DeferredItem<@NotNull Item> cell_boom = register("cell_boom", singleItem, CellBoom::new);
    public static final DeferredItem<@NotNull Item> cell_calcification = register("cell_calcification", singleItem, cell_calcification::new);
    public static final DeferredItem<@NotNull Item> cell_mummy = register("cell_mummy", singleItem, cell_mummy::new);
    public static final DeferredItem<@NotNull Item> giant = register("giant", singleItem, Biant::new);
    public static final DeferredItem<@NotNull Item> giant_nightmare = register("giant_nightmare", singleItem, GianNnightmare::new);
    public static final DeferredItem<@NotNull Item> bone_cell = register("bone_cell", singleItem, BoneCell::new);
    public static final DeferredItem<@NotNull Item> disgusting_cells = register("disgusting_cells", singleItem, DisgustingCells::new);
    public static final DeferredItem<@NotNull Item> mother_cell = register("mother_cell", singleItem, MotherCell::new);
    public static final DeferredItem<@NotNull Item> parasitic_cell = register("parasitic_cell", singleItem, ParasiticCell::new);
    public static final DeferredItem<@NotNull Item> badgeofthedead = register("badgeofthedead", singleItem, BadgeOfTheDead::new);
    public static final DeferredItem<@NotNull Item> battery = register("battery", singleItem, Battery::new);
    public static final DeferredItem<@NotNull Item> biggreedcrystal = register("biggreedcrystal", singleItem, BigGreedcCystal::new);
    public static final DeferredItem<@NotNull Item> bigwarcrystal = register("bigwarcrystal", singleItem, BigWarcrystal::new);
    public static final DeferredItem<@NotNull Item> blackeorb = register("blackeorb", singleItem, Blackeorb::new);
    public static final DeferredItem<@NotNull Item> blueamout = register("blueamout", singleItem, BlueAmout::new);
    public static final DeferredItem<@NotNull Item> greedamout = register("greedamout", singleItem, GreedAmout::new);
    public static final DeferredItem<@NotNull Item> greedcrystal = register("greedcrystal", singleItem, GreedCrystal::new);
    public static final DeferredItem<@NotNull Item> redamout = register("redamout", singleItem, RedAmout::new);
    public static final DeferredItem<@NotNull Item> warcrystal = register("warcrystal", singleItem, WarCrystal::new);
    public static final DeferredItem<@NotNull Item> whiteorb = register("whiteorb", singleItem, WhiteOrb::new);
    public static final DeferredItem<@NotNull Item> evilcandle = register("evilcandle", singleItem, EvilCandle::new);
    public static final DeferredItem<@NotNull Item> luck_ring = register("luck_ring", singleItem, LuckRing::new);
    public static final DeferredItem<@NotNull Item> luck_stone = register("luck_stone", singleItem, LuckSone::new);
    public static final DeferredItem<@NotNull Item> magnet = register("magnet", singleItem, Magnet::new);
    public static final DeferredItem<@NotNull Item> obsidianring = register("obsidianring", singleItem, ObsidianRing::new);
    public static final DeferredItem<@NotNull Item> evil_mob = register("evil_mob", singleItem, EvilMob::new);
    public static final DeferredItem<@NotNull Item> fortunecrystal = register("fortunecrystal", singleItem, Fortunecrystal::new);
    public static final DeferredItem<@NotNull Item> god_lead = register("god_lead", singleItem, GodLead::new);
    public static final DeferredItem<@NotNull Item> malice_die = register("malice_die", singleItem, MaliceDie::new);
    public static final DeferredItem<@NotNull Item> maxamout = register("maxamout", singleItem, Maxamout::new);
    public static final DeferredItem<@NotNull Item> mayhemcrystal = register("mayhemcrystal", singleItem, Mayhemcrystal::new);
    public static final DeferredItem<@NotNull Item> rage_crystal = register("rage_crystal", singleItem, RageCrystal::new);
    public static final DeferredItem<@NotNull Item> rage_crystal_big = register("rage_crystal_big", singleItem, RageCrystalBig::new);
    public static final DeferredItem<@NotNull Item> rage_crystal_max = register("rage_crystal_max", singleItem, RageCystalMax::new);
    public static final DeferredItem<@NotNull Item> the_heart = register("the_heart", singleItem, TheHeart::new);
    public static final DeferredItem<@NotNull Item> twelve_sword = register("twelve_sword", singleItem, TwelveSword::new);
    public static final DeferredItem<@NotNull Item> as_amout = register("as_amout", singleItem, AsAmout::new);
    public static final DeferredItem<@NotNull Item> doomeye = register("doomeye", singleItem, SevenSword::new);
    public static final DeferredItem<@NotNull Item> doomswoud = register("doomswoud", singleItem, RineSword::new);
    public static final DeferredItem<@NotNull Item> magiceye = register("magiceye", singleItem, MagicEye::new);
    public static final DeferredItem<@NotNull Item> magicstone = register("magicstone", singleItem, MagicStone::new);
    public static final DeferredItem<@NotNull Item> million = register("million", singleItem, Million::new);
    public static final DeferredItem<@NotNull Item> nano_box = register("nano_box", singleItem, NanoBox::new);
    public static final DeferredItem<@NotNull Item> nanocube = register("nanocube", singleItem, NanoCube::new);
    public static final DeferredItem<@NotNull Item> nanorobot = register("nanorobot", singleItem, NanoRbot::new);
    public static final DeferredItem<@NotNull Item> sword_amout = register("sword_amout", singleItem, SwordAmout::new);
    public static final DeferredItem<@NotNull Item> thedoomstone = register("thedoomstone", singleItem, Thedoomstone::new);
    public static final DeferredItem<@NotNull Item> thefruit = register("thefruit", singleItem, TheFruit::new);
    public static final DeferredItem<@NotNull Item> wind = register("wind", singleItem, Wind::new);
    public static final DeferredItem<@NotNull Item> god_sword_ = register("god_sword", singleItem, CommonItem::new);
    public static final DeferredItem<@NotNull Item> at_sword_ = register("at_sword", singleItem, CommonItem::new);
    public static final DeferredItem<@NotNull Item> sword = register("sword", singleItem, CommonItem::new);
    public static final DeferredItem<@NotNull Item> calcification = register("calcification", eightStack, Calcification::new);
    public static final DeferredItem<@NotNull Item> masticatory = register("masticatory", eightStack, Masticatory::new);
    public static final DeferredItem<@NotNull Item> polyphagia = register("polyphagia", eightStack, Polyphagia::new);
    public static final DeferredItem<@NotNull Item> quadriceps = register("quadriceps", eightStack, Quadriceps::new);
    public static final DeferredItem<@NotNull Item> reanimation = register("reanimation", eightStack, Reanimation::new);
    public static final DeferredItem<@NotNull Item> medicinebox = register("medicinebox", singleItem, MedicineBox::new);
    public static final DeferredItem<@NotNull Item> blood_god = register("blood_god", singleItem, BloodGod::new);
    public static final DeferredItem<@NotNull Item> bone_or_god = register("bone_or_god", singleItem, BoneOrGod::new);
    public static final DeferredItem<@NotNull Item> defend_against_runestone = register("defend_against_runestone", singleItem, DefendAgainstRunestone::new);
    public static final DeferredItem<@NotNull Item> lead = register("lead", singleItem, com.ytgld.moonstone.item.si.nightmare.other.lead::new);
    public static final DeferredItem<@NotNull Item> revive_runestone = register("revive_runestone", singleItem, ReviveRunestone::new);
    public static final DeferredItem<@NotNull Item> strengthen_runestone = register("strengthen_runestone", singleItem, StrengthenRunestone::new);
    public static final DeferredItem<@NotNull Item> immortal = register("immortal", singleItem, Immortal::new);
    public static final DeferredItem<@NotNull Item> dead_drder = register("dead_drder", singleItem, DeadOrder::new);
    public static final DeferredItem<@NotNull Item> flag_of_protest = register("flag_of_protest", singleItem, FlagOfProtest::new);
    public static final DeferredItem<@NotNull Item> consciousness = register("consciousness", singleItem, Consciousness::new);
    public static final DeferredItem<@NotNull Item> rotten_gourd = register("rotten_gourd", singleItem, RottenGourd::new);
    public static final DeferredItem<@NotNull Item> supreme_power = register("supreme_power", singleItem, SupremePower::new);
    public static final DeferredItem<@NotNull Item> nightmare_clay = register("nightmare_clay", singleItem, NightmareClay::new);
    public static final DeferredItem<@NotNull Item> twistedamout = register("twistedamout", singleItem, TwistedAmout::new);
    public static final DeferredItem<@NotNull Item> god_peptide_surge = register("god_peptide_surge", singleItem, GodPeptideSurge::new);
    public static final DeferredItem<@NotNull Item> peptide_surge = register("peptide_surge", singleItem, GodPeptideSurge.PeptideSurge::new);
    public static final DeferredItem<@NotNull Item> god_acidic_reflux = register("god_acidic_reflux", singleItem, GodAcidicReflux::new);
    public static final DeferredItem<@NotNull Item> acidic_reflux = register("acidic_reflux", singleItem, GodAcidicReflux.AcidicReflux::new);
    public static final DeferredItem<@NotNull Item> god_hypertrophy = register("god_hypertrophy", singleItem, GodHypertrophy::new);
    public static final DeferredItem<@NotNull Item> hypertrophy = register("hypertrophy", singleItem, GodHypertrophy.Hypertrophy::new);
    public static final DeferredItem<@NotNull Item> god_naja_mortis = register("god_naja_mortis", singleItem, GodNajaMortis::new);
    public static final DeferredItem<@NotNull Item> naja_mortis = register("naja_mortis", singleItem, GodNajaMortis.NajaMortis::new);
    public static final DeferredItem<@NotNull Item> WarmApproachable = register("warm_approachable", fullStack, EmbeddedDNA::new);
    public static final DeferredItem<@NotNull Item> OceanAffinity = register("ocean_affinity", fullStack, EmbeddedDNA::new);
    public static final DeferredItem<@NotNull Item> EarthAffinity = register("earth_affinity", fullStack, EmbeddedDNA::new);
    public static final DeferredItem<@NotNull Item> calcareous  = register("calcareous", fullStack, EmbeddedDNA::new);
    public static final DeferredItem<@NotNull Item> frontal_lobe = register("frontal_lobe", singleItem, EmbeddedDNA::new);
    public static final DeferredItem<@NotNull Item> high_energy = register("high_energy", fullStack, EmbeddedDNA::new);
    public static final DeferredItem<@NotNull Item> surge = register("surge", fullStack, EmbeddedDNA::new);
    public static final DeferredItem<@NotNull Item> cytopathic_boost = register("cytopathic_boost", fullStack, EmbeddedDNA::new);
    public static final DeferredItem<@NotNull Item> spliced_activation = register("spliced_activation", fullStack, EmbeddedDNA::new);
    public static final DeferredItem<@NotNull Item> thermo_necro = register("thermo_necro", fullStack, EmbeddedDNA::new);
    public static final DeferredItem<@NotNull Item> Book_ = register("book", singleItem, Book::new);


    public static class TabChestItem {
        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Moonstone.MODID);
        public static final DeferredHolder<CreativeModeTab, CreativeModeTab> dna = CREATIVE_MODE_TABS.register(Moonstone.MODID + "_dna", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.tabmoonstone.necora"))
                .icon(() -> necora.asItem().getDefaultInstance())
                .displayItems((parameters, output) -> {
                    output.accept(necora);
                    output.accept(cytopathic_boost);
                    output.accept(spliced_activation);
                    output.accept(thermo_necro);

                    output.accept(WarmApproachable);
                    output.accept(OceanAffinity);
                    output.accept(EarthAffinity);

                    output.accept(calcareous);
                    output.accept(frontal_lobe);
                    output.accept(high_energy);
                    output.accept(surge);

                    output.accept(ambush);
                    output.accept(atpoverdose);
                    output.accept(autolytic);
                    output.accept(fermentation);
                    output.accept(putrefactive);
                    output.accept(regenerative);
                    output.accept(GodAmbush);
                    output.accept(GodAtpoverdose);
                    output.accept(GodAutolytic);
                    output.accept(GodFermentation);
                    output.accept(GodPutrefactive);
                    output.accept(GodRegenerative);

                    output.accept(god_peptide_surge);
                    output.accept(peptide_surge);
                    output.accept(god_acidic_reflux);
                    output.accept(acidic_reflux);
                    output.accept(god_hypertrophy);
                    output.accept(hypertrophy);
                    output.accept(god_naja_mortis);
                    output.accept(naja_mortis);


                    output.accept(air);
                    output.accept(motor);
                    output.accept(watergen);
                    output.accept(adrenaline);
                    output.accept(cell);
                    output.accept(cell_blood);
                    output.accept(cell_boom);
                    output.accept(cell_calcification);
                    output.accept(cell_mummy);
                    output.accept(giant);

                    output.accept(bone_cell);
                    output.accept(disgusting_cells);
                    output.accept(mother_cell);
                    output.accept(parasitic_cell);

                    output.accept(calcification);
                    output.accept(masticatory);
                    output.accept(polyphagia);
                    output.accept(quadriceps);
                    output.accept(reanimation);
                    output.accept(medicinebox);



                }).build());

        public static final DeferredHolder<CreativeModeTab, CreativeModeTab> common = CREATIVE_MODE_TABS.register(Moonstone.MODID + "_common", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.tabmoonstone"))
                .icon(() -> ectoplasmball.asItem().getDefaultInstance())
                .displayItems((parameters, output) -> {
                    output.accept(Book_);
                    output.accept(soulbattery);
                    output.accept(soulcube);
                    output.accept(beacon);
                    output.accept(ectoplasmapple);
                    output.accept(ectoplasmball);
                    output.accept(ectoplasmbattery);
                    output.accept(ectoplasmcloub);
                    output.accept(ectoplasmcube);
                    output.accept(ectoplasmhorseshoe);
                    output.accept(ectoplasmprism);
                    output.accept(ectoplasmshild);
                    output.accept(ectoplasmsoul);
                    output.accept(ectoplasmstar);
                    output.accept(ectoplasmtree);


                    output.accept(brain);
                    output.accept(mbattery);
                    output.accept(mblock);
                    output.accept(mbottle);
                    output.accept(mbox);
                    output.accept(meye);
                    output.accept(mhead);
                    output.accept(mkidney);
                    output.accept(morb);
                    output.accept(mring);
                    output.accept(mshell);

                    output.accept(blood_candle);
                    output.accept(blood_magic_box);
                    output.accept(the_blood_book);
                    output.accept(undead_blood_charm);
                    output.accept(blood_amout);
                    output.accept(blood_jelly);
                    output.accept(blood_snake);
                    output.accept(killer);
                    output.accept(max_eye);
                    output.accept(the_prison_of_sin);
                    output.accept(blood);
                    output.accept(blood);

                    output.accept(owner_blood_eye);
                    output.accept(owner_blood_attack_eye);
                    output.accept(owner_blood_speed_eye);
                    output.accept(owner_blood_boom_eye);
                    output.accept(owner_blood_effect_eye);
                    output.accept(owner_blood_vex);
                    output.accept(owner_blood_earth);
                    output.accept(consciousness);
                    output.accept(twistedamout);

                    output.accept(badgeofthedead);
                    output.accept(battery);
                    output.accept(biggreedcrystal);
                    output.accept(bigwarcrystal);
                    output.accept(blackeorb);
                    output.accept(blueamout);
                    output.accept(greedamout);
                    output.accept(redamout);
                    output.accept(greedcrystal);
                    output.accept(warcrystal);
                    output.accept(whiteorb);
                    output.accept(evilcandle);
                    output.accept(luck_ring);
                    output.accept(luck_stone);
                    output.accept(magnet);
                    output.accept(obsidianring);
                    output.accept(evil_mob);
                    output.accept(fortunecrystal);
                    output.accept(god_lead);
                    output.accept(malice_die);
                    output.accept(maxamout);
                    output.accept(mayhemcrystal);
                    output.accept(rage_crystal);
                    output.accept(rage_crystal_big);
                    output.accept(rage_crystal_max);
                    output.accept(the_heart);
                    output.accept(twelve_sword);


                    output.accept(as_amout);
                    output.accept(doomeye);
                    output.accept(doomswoud);
                    output.accept(magiceye);
                    output.accept(magicstone);
                    output.accept(million);
                    output.accept(nano_box);
                    output.accept(nanocube);
                    output.accept(nanorobot);
                    output.accept(sword_amout);
                    output.accept(thedoomstone);
                    output.accept(thefruit);
                    output.accept(wind);

                }).build());


        public static final DeferredHolder<CreativeModeTab, CreativeModeTab> tab = CREATIVE_MODE_TABS.register(Moonstone.MODID + "_nightmare", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.moonstone"))
                .icon(() -> NightmareBaseItem_.asItem().getDefaultInstance())
                .displayItems((parameters, output) -> {
                    output.accept(NightmareBaseItem_);
                    output.accept(nightmare_base_black_eye);
                    output.accept(nightmare_base_fool);
                    output.accept(nightmare_base_insight);
                    output.accept(nightmare_base_redemption);
                    output.accept(nightmare_base_reversal);
                    output.accept(nightmare_base_start);
                    output.accept(nightmare_base_stone);

                    output.accept(end_bone);
                    output.accept(nightmare_base_stone_brain);
                    output.accept(nightmare_base_stone_meet);
                    output.accept(nightmare_base_stone_virus);
                    output.accept(NightmareVirus_);

                    output.accept(nightmare_base_black_eye_eye);
                    output.accept(nightmare_base_black_eye_heart);
                    output.accept(nightmare_base_black_eye_red);
                    output.accept(tricky_puppets);

                    output.accept(nightmare_base_redemption_deception);
                    output.accept(hypocritical_self_esteem);
                    output.accept(nightmare_base_redemption_down_and_out);
                    output.accept(nightmare_base_redemption_degenerate);
                    output.accept(nightmare_base_insight_insane);

                    output.accept(ring);
                    output.accept(nightmare_base_insight_drug);
                    output.accept(nightmare_base_insight_collapse);
                    output.accept(hidden_blade);


                    output.accept(candle);
                    output.accept(nightmare_base_reversal_card);
                    output.accept(nightmare_base_reversal_mysterious);
                    output.accept(nightmare_base_reversal_orb);

                    output.accept(apple);
                    output.accept(nightmare_base_fool_betray);
                    output.accept(nightmare_base_fool_bone);
                    output.accept(nightmare_base_fool_soul);

                    output.accept(nightmare_base_start_egg);
                    output.accept(nightmare_base_start_pod);
                    output.accept(nightmare_base_start_power);
                    output.accept(wolf);

                    output.accept(blood_god);
                    output.accept(bone_or_god);
                    output.accept(defend_against_runestone);
                    output.accept(lead);
                    output.accept(revive_runestone);
                    output.accept(strengthen_runestone);


                    output.accept(immortal);
                    output.accept(dead_drder);
                    output.accept(flag_of_protest);
                    output.accept(the_divine_fall_ring);
                    output.accept(rotten_gourd);
                    output.accept(supreme_power);
                    output.accept(nightmare_clay);

                }).build());

    }
    public static DeferredItem<@NotNull Item> register(String name, Item.Properties properties, Function<Item.Properties, ? extends Item> func) {
        return ITEMS.register(name, () -> func.apply(properties));
    }
}
