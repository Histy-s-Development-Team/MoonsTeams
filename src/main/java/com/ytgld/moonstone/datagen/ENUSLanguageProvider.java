package com.ytgld.moonstone.datagen;

import com.ytgld.moonstone.enttiy.EntityTs;
import net.minecraft.data.PackOutput;

import static com.ytgld.moonstone.item.InitItems.*;

public class ENUSLanguageProvider extends LanguageProviderBase {
    public ENUSLanguageProvider(PackOutput output) {
        super(output, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Advancements
        addAdvancement("ectoplasmstone", "ectoplasm", "Obtain the stone at the beginning of the game");
        addAdvancement("twistedstone", "twisted", "Obtain the stone at the beginning of the game\"");
        addAdvancement("ectoplasmball", "ectoplasm ball", "KILL SOME MOB");
        addAdvancement("ectoplasmcloub", "ectoplasm cloub", "The die of monsters");
        addAdvancement("ectoplasmprism", "ectoplasm prism", "A prism formed by the accumulation of corpses in the mountains");
        addAdvancement("ectoplasmcube", "ectoplasm cube", "A cube formed by the accumulation of corpses");
        addAdvancement("maxamout", "max amout", "Kill the Ancient Guardians while possessing red, blue, and green stones");
        addAdvancement("wind_and_rain", "wind and rain", "Open the box of the ancient city while possessing the Heart of the Seven Swords Shura and a sudden rain!");
        addAdvancement("nightmareeye", "nightmare eye", "Open dungeons, mines, and ancient city boxes while wearing the Eye of the Abyss to obtain future items...");
        addAdvancement("medicinebox", " medicine box", "Complete some boring tasks while wearing this item");
        addAdvancement("calcification", "calcification", "Suffer 350 damage attempts");
        addAdvancement("masticatory", "masticatory", "eat 8 gold apple");
        addAdvancement("polyphagia", "masticatory", "eat enchanted gold apple");
        addAdvancement("quadriceps", "quadriceps", "jump:500");
        addAdvancement("reanimation", "reanimation", "die");
        addAdvancement("necora", "necora", "Open the dungeon box while wearing this item");
        addAdvancement("botton", "botton", "Use Shadow Plague Right Click Medicine Box");
        addAdvancement("catalyzer", "catalyzer", "Kill the Last Shadow Dragon after completing all the tasks of the medicine box");
        addAdvancement("bloodvirus", "blood virus", "Use Shadow Plague Right Click necora");
        addAdvancement("ectoplasmstar", "ectoplasm star", "do not eat");
        addAdvancement("ectoplasmsoul", "ectoplasm soul", "look");
        addAdvancement("ectoplasmtree", "ectoplasm tree", "Heart Tree");
        addAdvancement("brain", "love brain", "I think you should love me");
        addAdvancement("beacon", "nano beacon", "Now, we truly share weal and woe.");
        addAdvancement("mhead", "m head", "fear");
        addAdvancement("max_eye", "with no chink in one's armour！", "The blood eye");
        addAdvancement("max_sword", "Eat me an axe！", "Max Sword");
        addAdvancement("blood_snake", "blood snake", "sweet snake");
        addAdvancement("max_blood_eye", "max blood eye", "out");
        addAdvancement("the_prison_of_sin", "Sin", "");
        addAdvancement("max_blood_cube", "see me！", "max blood cube");
        addAdvancement("blood", "", "=");
        addAdvancement("blood_magic_box", "", "");
        addAdvancement("blood_sun", "", "");
        addAdvancement("wolf", "One Leaf Boat", "Obtain this item");
        addAdvancement("nightmare_base_stone", "Obelisk of Nightmares", "Obtain the Obelisk of Death");
        addAdvancement("nightmare_base_black_eye_heart", "Endless pain", "Obtain the Embryo of Death");
        addAdvancement("nightmare_base_black_eye_eye", "Unknown factor", "Get sarcoma");
        addAdvancement("nightmare_base_black_eye_red", "That's exciting!", "Get this lipstick");
        addAdvancement("nightmare_base_stone_meet", "Nightmare descends", "Get Desperate Resonance");
        addAdvancement("nightmare_base_stone_brain", "Crazy Brain", "Get the Brain of the End Times");
        addAdvancement("nightmare_base_black_eye", "Forever Staring", "Gain the Eyes of Evil Thoughts");
        addAdvancement("nightmare_base_stone_virus", "fusion", "Get Nightecora virus");
        addAdvancement("nightmare_base_redemption", "Rumor", "Obtain this item");
        addAdvancement("nightmare_base_redemption_deception", "Sealed Rumor", "Obtain this item");
        addAdvancement("nightmare_base_redemption_degenerate", "Song of Shadows", "Obtain this item");
        addAdvancement("nightmare_base_redemption_down_and_out", "River of History", "Obtain this item");
        addAdvancement("nightmare_base_reversal_card", "Reversal Reversal", "Obtain this item");
        addAdvancement("nightmare_base_reversal_mysterious", "Mysterious Corpse", "Obtain this item");
        addAdvancement("nightmare_base_reversal_orb", "Poor Acting", "Obtain this item");
        addAdvancement("nightmare_base_reversal", "Reincarnation", "Obtain this item");
        addAdvancement("end_bone", "Unbreakable!", "Obtain this item");
        addAdvancement("nightmare_base_fool", "Choice", "Obtain this item");
        addAdvancement("nightmare_base_fool_betray", "Why is this", "Obtain this item");
        addAdvancement("nightmare_base_fool_bone", "Do slimes have bones?", "Obtain this item");
        addAdvancement("nightmare_base_fool_soul", "River of History", "Obtain this item");
        addAdvancement("nightmare_base_insight", "The Pain of Stagnation", "Obtain this item");
        addAdvancement("nightmare_base_insight_drug", "Eternal Life", "Obtain this item");
        addAdvancement("nightmare_base_insight_insane", "War God Stone", "Obtain this item");
        addAdvancement("nightmare_base_insight_collapse", "Strength of Collapse", "Obtain this item");
        addAdvancement("tricky_puppets", "Creak", "Obtain this item");
        addAdvancement("apple", "Skewed Scale", "Obtain this item");
        addAdvancement("ring", "An inch of time is worth an inch of gold", "Obtain this item");
        addAdvancement("immortal", "Step into reincarnation", "“I've long been tired of reincarnation again and again”");
        addAdvancement("candle", "Eternal Agony", "Fix Death Omen's curse, but at what cost?");
        addAdvancement("falling_immortals", "希望之火的熄灭", "Obtain this item");
        addAdvancement("hypocritical_self_esteem", "Do not destroy the self-esteem of the weak", "Obtain this item");
        addAdvancement("nightmare_base_start", "The 'Immortal'", "Obtain this item");
        addAdvancement("nightmare_base_start_pod", "Immortal Flower, Immortal Fruit", "Obtain this item");
        addAdvancement("disintegrating_stone", "The sky is falling apart", "Get this item");
        addAdvancement("nightmare_base_start_egg", "A lazy egg", "Obtain this item");
        addAdvancement("nightmare_base_start_power", "Strength of Collapse", "Obtain this item");
        addAdvancement("nightmare_base", "Beginning", "Obtain this item");
        addAdvancement("hidden_blade", "Unknown Blade", "Obtain this item");

        // Item names
        addItem(Book_, "Moon Stone Guide");
        addItem(ectoplasmball, "Ectoplasm Ball");
        addItem(ectoplasmcloub, "Ectoplasm Cloud");
        addItem(ectoplasmcube, "Ectoplasm Cube");
        addItem(ectoplasmhorseshoe, "Ectoplasm Horseshoe");
        addItem(ectoplasmapple, "Ectoplasm Apple");
        addItem(ectoplasmprism, "Ectoplasm Prism");
        addItem(ectoplasmshild, "Ectoplasm Shield");
        addItem(ectoplasmbattery, "Ectoplasm Battery");
        addItem(badgeofthedead, "Badge of the Dead");
        addItem(battery, "Battery");
        addItem(biggreedcrystal, "Big Greed Crystal");
        addItem(bigwarcrystal, "Big War Crystal");
        addItem(blackeorb, "Black Magic Orb");
        addItem(blueamout, "Blue Runestone");
        addItem(greedamout, "Green Runestone");
        addItem(greedcrystal, "Greed Crystal");
        addItem(redamout, "Red Runestone");
        addItem(warcrystal, "War Crystal");
        addItem(whiteorb, "White Magic Orb");
        addItem(mbattery, "Morris's Battery");
        addItem(mblock, "Morris's Cube");
        addItem(mbottle, "Morris's Medicine");
        addItem(mbox, "Morris's Box");
        addItem(meye, "Morris's Eye");
        addItem(mkidney, "Morris's Glass Kidney Stone");
        addItem(morb, "Morris's Pearl");
        addItem(mring, "Morris's Ring");
        addItem(mshell, "Morris's Shell");
        addItem(magiceye, "Mechanical Eye");
        addItem(magicstone, "Magic Stone");
        addItem(nanocube, "Nano Cube");
        addItem(nanorobot, "Nano Robot");
        addItem(thedoomstone, "Doom Stone");
        addItem(thefruit, "Ancient Fruit");
        addItem(evilcandle, "Evil Candle");
        addItem(obsidianring, "Obsidian Ring");
        addItem(soulbattery, "Soul Battery");
        addItem(soulcube, "Soul Cube");
        addItem(necora, "necora");
        addItem(atpoverdose, "atpoverdose");
        addItem(autolytic, "autolytic");
        addItem(putrefactive, "putrefactive");
        addItem(ambush, "ambush");
        addItem(fermentation, "fermentation");
        addItem(calcification, "calcification");
        addItem(masticatory, "masticatory");
        addItem(polyphagia, "polyphagia");
        addItem(quadriceps, "quadriceps");
        addItem(reanimation, "reanimation");
        addItem(regenerative, "regenerative");
        addItem(medicinebox, "medicine box");
        addItem(maxamout, "Primordial Crest");
        addItem(fortunecrystal, "Fortune Crystal");
        addItem(mayhemcrystal, "Mayhem Crystal");
        addItem(doomeye, "Heart of the Seven Swords of Asura");
        addItem(doomswoud, "Downpour");
        addItem(wind, "Gale");
        addItem(ectoplasmstar, "Ectoplasm Lucky Star");
        addItem(ectoplasmsoul, "Soulless Ectoplasm Cube");
        addItem(ectoplasmtree, "Ectoplasm Tree");
        addItem(brain, "Morris's Brain");
        addItem(beacon, "Ectoplasm Beacon");
        addItem(mhead, "Morris's Head");
        addItem(cell, "cell");
        addItem(adrenaline, "adrenaline");
        addItem(cell_mummy, "cell mummy");
        addItem(cell_boom, "cell boom");
        addItem(cell_calcification, "cell calcification");
        addItem(cell_blood, "cell blood");
        addItem(motor, "motor");
        addItem(air, "air");
        addItem(watergen, "water");
        addItem(giant, "giant cell");
        addItem(the_heart, "Heart of Abundance");
        addItem(giant_nightmare, "giant nightmare");
        addItem(sword_amout, "Chapter of Sword Shadows");
        addItem(nano_box, "Box of Heavenly Secrets");
        addItem(bone_cell, "bone cell");
        addItem(parasitic_cell, "parasitic cell");
        addItem(mother_cell, "mother cell");
        addItem(disgusting_cells, "disgusting cells");
        addItem(twistedamout, "Noxian Crest");
        addItem(max_eye, "Flawless Eye");
        addItem(the_prison_of_sin, "Prison of Sin");
        addItem(blood_amout, "Blood Talisman");
        addItem(blood_snake, "Snake Blood Talisman");
        addItem(blood_magic_box, "Blood Magic Box");
        addItem(blood, "Blood Orb");
        addItem(blood_candle, "Sealing Candelabra");
        addItem(the_blood_book, "Sealing Record");
        addItem(evil_mob, "Malice Entity");
        addItem(god_lead, "Lead of Blood Torment");
        addItem(malice_die, "Malice's Demise");
        addItem(blood_jelly, "Plasma Jelly");
        addItem(luck_ring, "Lucky Ring");
        addItem(as_amout, "Seven Swords of Asura: Sword Array");
        addItem(million, "Seven Swords of Asura: All Methods");
        addItem(owner_blood_eye, "Desecrator");
        addItem(owner_blood_attack_eye, "Blood Curse");
        addItem(owner_blood_speed_eye, "Scribe");
        addItem(owner_blood_boom_eye, "Laborer");
        addItem(owner_blood_effect_eye, "Judge");
        addItem(owner_blood_vex, "Wraith");
        addItem(owner_blood_earth, "Heaven and Earth");
        addItem(killer, "Terminator's Skull");
        addItem(twelve_sword, "Twelve Gods Sword Array");
        addItem(rage_crystal, "Wrath Crystal");
        addItem(rage_crystal_big, "Big Wrath Crystal");
        addItem(rage_crystal_max, "War God Crystal");
        addItem(magnet, "Magnet");
        addItem(undead_blood_charm, "Decider's Charm");
        addItem(luck_stone, "Lucky Stone");
        addItem(wolf, "Lonely Wolf");
        addItem(NightmareBaseItem_, "Nightmare Base");
        addItem(nightmare_base_stone, "Deadly Obelisk");
        addItem(nightmare_base_stone_meet, "Despair Resonance");
        addItem(nightmare_base_stone_virus, "Nightecora Virus");
        addItem(nightmare_base_stone_brain, "Apocalypse Brain");
        addItem(nightmare_base_black_eye, "Evil Eye of Insight");
        addItem(nightmare_base_black_eye_eye, "Dreadful Tumor");
        addItem(nightmare_base_black_eye_red, "Sinful Red Lip");
        addItem(nightmare_base_black_eye_heart, "Heart of Despair");
        addItem(NightmareVirus_, "nightmare virus");
        addItem(nightmare_base_reversal, "Reversal Object");
        addItem(nightmare_base_reversal_orb, "Reversal Orb");
        addItem(nightmare_base_reversal_card, "Unstable Card");
        addItem(nightmare_base_reversal_mysterious, "Mysterious Object");
        addItem(nightmare_base_redemption, "'Redemption'");
        addItem(nightmare_base_redemption_deception, "Deception");
        addItem(nightmare_base_redemption_degenerate, "Degeneration");
        addItem(nightmare_base_redemption_down_and_out, "Down and Out");
        addItem(end_bone, "End Bone");
        addItem(nightmare_base_fool, "Fool's Danger");
        addItem(nightmare_base_fool_betray, "Possession Pendant");
        addItem(nightmare_base_fool_bone, "Dangerous Skull");
        addItem(nightmare_base_fool_soul, "Wraith Soul");
        addItem(nightmare_base_insight, "Nightmare Insight");
        addItem(nightmare_base_insight_drug, "Madness Potion");
        addItem(nightmare_base_insight_insane, "Insanity Stone");
        addItem(nightmare_base_insight_collapse, "Destruction Mirror");
        addItem(tricky_puppets, "Tricky Puppet");
        addItem(apple, "Skewed Fruit");
        addItem(ring, "Soul Memory Potion Ring");
        addItem(immortal, " Seal of Immortal Reincarnation");
        addItem(candle, "Evil Ancient Candle");
        addItem(hypocritical_self_esteem, "Hypocritical Self-Esteem");
        addItem(nightmare_base_start, "Beginning of Nightmare");
        addItem(nightmare_base_start_pod, "Immortal Bud");
        addItem(blood_god, " Divine Blood Ancestor Talisman");
        addItem(defend_against_runestone, " Defend against runestones");
        addItem(revive_runestone, " Revive Runestone");
        addItem(strengthen_runestone, " Strengthening Runestone");
        addItem(nightmare_base_start_egg, "Origin Egg");
        addItem(lead, "Wind heavy lead");
        addItem(bone_or_god, " Blood Sacrifice Skull");
        addItem(nightmare_base_start_power, "Astonishing Power");
        addItem(the_divine_fall_ring, " Divine Fall: Ring of Apocalypse");
        addItem(hidden_blade, " Hidden Blade");
        addItem(GodAmbush, "Drift Fermentation");
        addItem(GodAtpoverdose, "ATP Overdose");
        addItem(GodPutrefactive, "Putrefactive Resistance");
        addItem(GodFermentation, "Ambush Hunting");
        addItem(GodAutolytic, "Autolysis Inhibition");
        addItem(consciousness, "Fused Consciousness");
        addItem(dead_drder, "Death Decree");
        addItem(rotten_gourd, "Rotten Gourd");
        addItem(supreme_power, "The Ruler");
        addItem(nightmare_clay, "Nightmare Clay");
        addItem(flag_of_protest, "Defiance of Death");
        addItem(WarmApproachable, "Atmospheric Affinity");
        addItem(OceanAffinity, "Ocean Affinity");
        addItem(EarthAffinity, "Land Affinity");
        addItem(calcareous, "Calcification");
        addItem(frontal_lobe, "Frontal Lobe Mutation");
        addItem(high_energy, "ATP High Energy");
        addItem(surge, "Adrenaline Surge");
        addItem(peptide_surge, "Enhanced Peptide Synthesis");
        addItem(god_peptide_surge, "Enhanced Peptide Synthesis");
        addItem(acidic_reflux, "Acidic Reflux");
        addItem(god_acidic_reflux, "Acidic Reflux");
        addItem(hypertrophy, "Vermiform Muscle Enhancement");
        addItem(god_hypertrophy, "Vermiform Muscle Enhancement");
        addItem(naja_mortis, "Cobra Lock-On");
        addItem(god_naja_mortis, "Cobra Lock-On");
        addItem(cytopathic_boost, "Cytopathic Boost");
        addItem(spliced_activation, "Spliced Activation");
        addItem(thermo_necro, "Thermal Decomposition Inhibition");
        addItem(GodRegenerative, "Regenerative Vitalization");

        // Item tooltips
        addItemTooltip(ectoplasmapple, "Injury causes surrounding creatures to take 2% of their maximum life value in damage");
        addItemTooltip(ectoplasmhorseshoe, "Reduces damage from falls by 90%");
        addItemTooltip(mbattery,
                "Zombies are afraid of you!",
                "Attacking zombies deals an additional 50% more damage",
                "+2 Fortune",
                "+2 Looting");
        addItemTooltip(mblock,
                "+1 Fortune",
                "+1 Looting");
        addItemTooltip(mbottle,
                "While you have Weakness:",
                "+2 Looting",
                "While you have Mining Fatigue:",
                "+2 Fortune");
        addItemTooltip(meye, "Makes undead creatures within 10 blocks glow");
        addItemTooltip(mkidney,
                "Probability of not taking this damage when injured",
                "First 100%, second 50%, third 25%.",
                "And so on",
                "If immunity to damage fails, you take an additional 33% of your maximum life damage",
                "At the same time this item will go on a 10 second cooldown");
        addItemTooltip(morb,
                "+1 Experience drop",
                "+50% Extra experience drops");
        addItemTooltip(mring,
                "+100% Knockback taken",
                "+40% Healing");
        addItemTooltip(mshell,
                "-25% Damage taken from undead creatures",
                "-10% Damage dealt");
        addItemTooltip(magiceye,
                "All creatures within 4 blocks of the creature you attack",
                "take 50% area damage");
        addItemTooltip(nanocube,
                "Repairs 30 durability on each armor piece every 30 seconds",
                "*Cooldown reduced by 30% while wearing a battery");
        addItemTooltip(nanorobot,
                "Repairs 30 durability on your main-hand item every 30 seconds",
                "*Cooldown reduced by 30% while wearing a battery");
        addItemTooltip(thedoomstone,
                "Your attacks inflict Darkness",
                "Centered on the creature you attack, creatures with Darkness are hit by a Sonic Boom",
                "Creatures caught in the blast keep suffering negative effects");
        addItemTooltip(thefruit,
                "After eating:",
                "Not subject to luminous effects",
                "The Warden feels close to you!",
                "-99% attack of Warden damage");
        addItemTooltip(badgeofthedead, "25% more damage against undead creatures");
        addItemTooltip(biggreedcrystal, "+2 Fortune");
        addItemTooltip(greedcrystal, "+1 Fortune");
        addItemTooltip(blueamout,
                "Attacks have a chance to weaken enemies",
                "Probability of getting Resistance II when injured");
        addItemTooltip(greedamout,
                "Attacks have a chance to draw life",
                "Probability of getting Absorption when injured");
        addItemTooltip(redamout,
                "Attacks have a chance to send enemies flying",
                "and briefly grant you Strength II");
        addItemTooltip(medicinebox,
                "If you find some good pills…",
                "*That way I can build you a whole new body.",
                "Wearing this item allows you to obtain pills in certain ways",
                "You can choose to fuse the found pills or just wear the",
                "This item must be worn in order to discover the pill!",
                "",
                "",
                "",
                "Can eat");
        addItemTooltip(calcification,
                "*Calcifies the experimenter's skin and enhances the experimenter's ability to fight",
                "Increases damage resistance by 11",
                "Suffer 350 damage attempts");
        addItemTooltip(masticatory,
                "*Strengthening of the experimenter's occlusal muscles to the point of enhancing the experimenter's chewing ability",
                "50% reduction in eating time",
                "eat 8 gold apple");
        addItemTooltip(polyphagia,
                "eat enchanted gold apple",
                "when eat food you will heal 10% max health");
        addItemTooltip(quadriceps,
                "*Strengthening of the experimenter's quadriceps muscles to the point of enhancing the experimenter's locomotor ability",
                "Increases movement speed by 20%",
                "Increases jump height by 50%",
                "jump 500");
        addItemTooltip(reanimation,
                "*Activate the experimenter's cells to the point of enhancing the experimenter's ability to regenerate cells",
                "Simultaneous restoration of basic functions of vital organs",
                "Resurrect！",
                "300 seconds cooldown",
                "die");
        addItemTooltip(autolytic, "Suppresses the swimming speed reduction effect from the Necora virus");
        addItemTooltip(fermentation,
                "10 seconds cooldown",
                "During cooldown, damage is reduced by 70%",
                "Increases damage by 300% after cooldown",
                "*Pathogens still retain their hunting instincts, which allows them to wait patiently and deliver the killing blow!");
        addItemTooltip(putrefactive, "Increases the effect caused by carrion");
        addItemTooltip(regenerative,
                "Restores 1 life point every 1.5 seconds",
                "*The cells of pathogens are more vibrant than in the past");
        addItemTooltip(necora,
                "5 curses that come with zombification:",
                "*You are terrified of the water; swimming speed is drastically reduced",
                "*You'll burn in the sun; maybe wearing something on your head will solve the problem for a while",
                "*Your body gradually reeks of rot; Human Villagers fear you, and Iron golems see you as an enemy.",
                "*Ability to recognize one's own kind; damage dealt to undead reduced by 20 percent",
                "*Once the virus is implanted, there will be no turning back!",
                "5 enhancements from zombification:",
                "*Your body is harder; damage increased by 3 points, armor value increased by 4 points",
                "*Difficult to be affected by the elements; 70% less magical damage taken",
                "*Any creature will be torn to carrion by you, eat them and you will gain additional effects!",
                "*You are considered a lord by your own kind; reduces damage dealt to you by undead creatures by 50%",
                "*Significant increase in cellular activity; 50% increase in life recovery",
                "The pathogen has not been classified",
                "and early medical reports indicate that it has",
                "Strong regeneration and an unending need to eat",
                "But much of its genetic structure remains an unsolved mystery...");
        addItemTooltip(soulbattery, "+25% Critical Damage");
        addItemTooltip(blackeorb, "Boosts the White Magic Orb's attributes");
        addItemTooltip(evilcandle,
                "Lava Walker",
                "Resists 80% lava damage",
                "Quickly extinguish the flames on your body");
        addItemTooltip(maxamout,
                "Gains all the abilities of the three-color Runestones!",
                "Reduces damage taken by 15%",
                "Chance to gain Absorption when hurt",
                "+5% Lifesteal",
                "There is a probability that during an attack, the enemy will be knocked away and slowed down.",
                "And obtain the power effect",
                "Reflects 20% of damage taken back to the attacker",
                "Immune to Mining Fatigue",
                "Increases swimming speed by 75%");
        addItemTooltip(ambush, "Can walk on liquid surfaces");
        addItemTooltip(fortunecrystal, "+3 fortune");
        addItemTooltip(doomeye, "Summon 7 flying swords to attack enemies when injured");
        addItemTooltip(doomswoud,
                "Hitting a creature summons 2 flying swords",
                "+1 flying sword for every 20% bonus speed",
                "Killing a creature immediately summons 4 flying swords");
        addItemTooltip(wind, "Continuous running increases speed");
        addItemTooltip(ectoplasmstar,
                "Every 1 point of luck increases attack speed by 1% and damage by 0.5%",
                "+20 Luck");
        addItemTooltip(brain, "After hitting a creature 5 times, your 6th hit deals 2.25x damage");
        addItemTooltip(beacon,
                "Every 30 seconds, clear all the effects of your own potion and synchronously add the potion effects to all creatures within the surrounding 5 grid range.",
                "Copies your potion effects onto the creature you attack as an area effect");
        addItemTooltip(mhead,
                "Causing fear towards a wide range of creatures after killing them",
                "Target speed increases and recovers after taking your damage");
        addItemTooltip(adrenaline,
                "Summoned zombies inherit your attack power",
                "And movement speed");
        addItemTooltip(cell_mummy, "Effectively reducing the decay rate of generated zombies");
        addItemTooltip(cell_boom, "You and the zombies will experience a violent explosion after death");
        addItemTooltip(cell_calcification, "Zombies receive 50% armor and health bonus from you");
        addItemTooltip(cell_blood, "Zombies gain the ability to suck blood and each attack prolongs their lifespan");
        addItemTooltip(motor, "Increase by 15% in air, underwater, and land");
        addItemTooltip(air, "Increase resistance by 20% while in the air");
        addItemTooltip(watergen, "Increase resistance by 15% in water");
        addItemTooltip(the_heart,
                "Right-click an item to store it in the heart (up to 4 kinds, not stackable)",
                "If a creature drops one of the items in the heart,",
                "that drop's count is multiplied by 3",
                "Items stored in the heart cannot be removed");
        addItemTooltip(giant_nightmare,
                "Killing creatures has a chance to summon the Nightmare Giant",
                "Increase cooling time");
        addItemTooltip(sword_amout,
                "Your attack speed will increase with the number of slashes, but it will not exceed 100%",
                "But your damage will gradually decrease, at most to 33% of its original level",
                "When attacking with full force, it will not cause invincible frame protection",
                "When your slash count reaches 10, each attack will cause a range effect");
        addItemTooltip(nano_box,
                "in shift ， you will summon light bolt",
                "Can be retrofitted with batteries");
        addItemTooltip(bone_cell, "Giant cell zombies will receive 70% of the summoner's armor value when summoned");
        addItemTooltip(parasitic_cell, "Giant cell zombies give birth to 5 cell zombies after death");
        addItemTooltip(mother_cell, "Giant cell zombies will generate an additional 2 cell zombies when summoned, with a 50% chance of summoning another giant zombie");
        addItemTooltip(disgusting_cells, "The survival time of giant cell zombies is increased by 100%");
        addItemTooltip(twistedamout,
                "Each attack has a chance to create a Blood Orb that circles you",
                "When you have more than 8 Blood Orbs,",
                "your next slash deals 4x damage",
                "Blood Orbs are absorbed by you over time",
                "Each absorption restores a percentage of your health",
                "Each Blood Orb grants +5% damage",
                "Exploding Blood Orbs poison creatures within 3 blocks",
                "Killing a creature grants 1-3 more Blood Orbs");
        addItemTooltip(max_eye,
                "Kill creatures to collect blood",
                "Stores up to 4 points",
                "While you have blood, damage taken is reduced by 90%",
                "But each time you are hurt, you lose a drop of blood",
                "Over time you absorb the blood, restoring 10% of your max health");
        addItemTooltip(the_prison_of_sin,
                "Since wearing it, you have killed:",
                "-80% Armor and Max Health",
                "+10% All Attributes",
                "Each different creature type you kill increases this bonus",
                "Cannot be removed",
                "Attributes increased by: ",
                "You cannot yet grasp its true nature",
                "Unlimited growth and extreme adaptability",
                "But... at what cost?");
        addItemTooltip(blood_amout, "Summons a Blood Spirit when you are hurt");
        addItemTooltip(blood_snake,
                "Killing a creature launches 3 Blood Snakes that deal 150% damage",
                "The number of Blood Snakes grows with the creature's max health",
                "Up to 10",
                "-20% Damage");
        addItemTooltip(blood_magic_box, "Kill creatures to collect their blood");
        addItemTooltip(the_blood_book,
                "Blood Spirit Proliferator damage +200%",
                "Blood Spirit Proliferator orb speed +100%",
                "Blood Spirit Proliferator orbs explode",
                "Blood Spirit Proliferator fire rate +100%",
                "Blood Spirit Proliferator orb lifespan -70%",
                "Includes every effect of the Scribe and the Desecrator",
                "Every Blood Spirit Proliferator hit counts as an attack from you");
        addItemTooltip(blood_candle,
                "Press the bound key to summon a giant Blood Spirit Proliferator to fight for you",
                "If it goes missing, re-equip this item or press the bound key",
                "Blood Spirit Proliferator attacks deal damage based on 10% of your max health and attack");
        addItemTooltip(Book_, "See what's in the book! +1 accessory slot after wearing!");
        addItemTooltip(magnet, "Attracts dropped items within an 8-block radius");
        addItemTooltip(god_sword_,
                "A floating Sword God soul appears behind you",
                "It slowly restores energy shield, with a maximum storage of 12 shields",
                "When the shield is attacked, it consumes energy and deals 250% equivalent damage to the attacker, causing numerous negative effects",
                "The player gains numerous beneficial effects",
                "Each shield restores 1% of the player's maximum health per second",
                "The soul targets nearby targets and deals damage equivalent to 10% of the player's attack power",
                "The damage gradually increases, and the soul's laser damage is equivalent to the player initiating an attack");
        addItemTooltip(wolf,
                "Killing each type of creature will increase your life and armor by 1 point",
                "You deal an additional 25% damage to creatures you have previously killed",
                "Mark nearby units that you have patrolled",
                "Each time you are injured, the damage is transferred to them; if a unit dies, the item enters a 5-second cooldown");
        addItemTooltip(NightmareBaseItem_,
                "-15% damage,health,armor",
                "Evil Thought Antimony, Blood Cruel Lead, Malicious Mourning Nullification");
        addItemTooltip(nightmare_base_stone,
                "Damage taken increases by 500% when health is full",
                "But you can unlock the following items",
                "10 seconds cooling");
        addItemTooltip(nightmare_base_stone_virus,
                "Damage increases by 100%",
                "Healing increases by 100%",
                "Critical hit chance increases by 100%",
                "Any damage received will additionally inflict a penalty of 25% of the maximum health, unaffected by any bonuses");
        addItemTooltip(nightmare_base_stone_brain,
                "Damage reduced by 100% when at full health",
                "Damage increased by 50% when not at full health",
                "Resistance increased by 50% when not at full health");
        addItemTooltip(nightmare_base_black_eye,
                "Blurred vision from the injury that recovers over time",
                "But you can unlock the following items");
        addItemTooltip(nightmare_base_black_eye_eye,
                "Creatures under your gaze will be unable to move",
                "They will also receive a large amount of negative BUFFs",
                "When you look at any creature, you will gain a 100% damage bonus");
        addItemTooltip(nightmare_base_black_eye_red,
                "Killing creatures increases all attributes by 5%",
                "Up to a maximum increase of 50%",
                "These attributes will decrease over time");
        addItemTooltip(nightmare_base_black_eye_heart,
                "Nearby creatures take 25% more damage",
                "They will restore health to you",
                "And they will no longer receive any healing");
        addItemTooltip(nightmare_base_reversal_mysterious, "Suppress the negative effects of the Nightmare Base at the cost of reducing all attributes by 10%");
        addItemTooltip(nightmare_base_redemption, "Increase 15% decay of Nightmare Base attributes");
        addItemTooltip(nightmare_base_redemption_deception,
                "Resist lethal damage, restore all health",
                "And gain 7 seconds of invincibility and calm the rage of nearby creatures, cooldown 60 seconds");
        addItemTooltip(nightmare_base_redemption_degenerate,
                "Immune to magic damage",
                "Immune to fall damage",
                "Immune to fire damage");
        addItemTooltip(nightmare_base_redemption_down_and_out, "Reduce 35% decay of Nightmare Base attributes, if it drops to negative, it turns into a positive attribute increase");
        addItemTooltip(end_bone,
                "Reduces speed by 50% and damage received by 80% when at full health",
                "When at full health, damage received is reflected back to the attacker at 700% of the original amount");
        addItemTooltip(nightmare_base_fool,
                "Starting from 2 pieces, each additional accessory will reduce health by 1%",
                "Starting from 5 pieces, each additional accessory will reduce damage by 2%",
                "Damage and health penalty of 50% or less.");
        addItemTooltip(nightmare_base_fool_betray,
                "Makes some types of nearby creatures actively ally with you",
                "Allying creatures gain positive BUFFs consistent with you",
                "The master of the possessed servant loses 10% of maximum health",
                "Cooldown increases by 5 seconds for each target possessed");
        addItemTooltip(nightmare_base_fool_bone,
                "If a creature's attack target is you",
                "Then your damage to it is doubled",
                "And attacks have a 30% chance to break the invincibility frame");
        addItemTooltip(nightmare_base_fool_soul,
                "Fool's Danger damage penalty judgment increased from 5 to 14",
                "Fool's Danger life penalty judgment increased from 2 to 9",
                "Each accessory worn increases healing by 3%",
                "Each Nightmare accessory increases health by 6");
        addItemTooltip(nightmare_base_insight,
                "Reduce the enchantment level of enchanted items by 1",
                "Reduce the enchantment level of enchanted items by 50%");
        addItemTooltip(nightmare_base_insight_drug,
                "Damage, armor, health increase by 100%",
                "But for each accessory worn, this bonus will decrease by 8%");
        addItemTooltip(nightmare_base_insight_insane,
                "When you slay a creature",
                "Restore health based on the intensity of the slain creature",
                "And the damage of the next attack increases by 150%");
        addItemTooltip(nightmare_base_insight_collapse, "Double the number of universal accessory slots");
        addItemTooltip(tricky_puppets,
                "Allows you to mark container blocks within a radius of 20 blocks",
                "Marked blocks will emit light as you get closer to them",
                "You can see through blocks to them");
        addItemTooltip(apple,
                "Max Health is fixed at 30",
                "Damage taken is fixed at 2",
                "Attack damage is fixed at 10");
        addItemTooltip(ring,
                "Eternal Power, Resistance, Health Regeneration, Urgency, Health Boost",
                "For every 3rd level or higher potion effect obtained",
                "Reduce potion duration by 10%",
                "When any potion effect ends, you will recover 4 health points",
                "If the potion effect is negative, recover 10% of your max health");
        addItemTooltip(immortal,
                "80% chance to evade and reflect 50% of damage to the attacker",
                "If the attacker is >70%, reflect 150% of the damage and break the invincibility frame",
                "Apply a Withered Buff to nearby mobs every 5 seconds, up to a maximum of level 5",
                "Applied creatures have 20% less Resistance, Armor, Heal, and 5% Damage, Movement Speed, Attack Speed per level",
                "If you are killed, deal 20% of the attacker's current health as piercing damage and add level 10 Wither (10s)",
                "Abyss and Nightmare items neutralized",
                "It is rumored that a person who wields the power of the cycle of life and death...",
                "Простовання простовання...",
                "But... At what cost? ");
        addItemTooltip(candle,
                "Increases damage taken by 1000% when at full health",
                "But always retains 1 health point",
                "Gains invincibility protection based on damage taken at full health",
                "Gain 0.05 seconds of invincibility for every 10 health points (not exceeding 5 seconds)",
                "During any period of invincibility protection",
                "Increases damage and healing by 100%",
                "Exempts from injury penalties of the Death Omen Obelisk");
        addItemTooltip(hypocritical_self_esteem,
                "You will gain the following boosts for each entity nearby.",
                "If you have suffered the curse of Malevolent Gaze.. then:",
                "   Bite nearby creatures, dealing 20% of your displayed damage every 0.5 seconds",
                "   Damage increases by 20% for each additional target",
                "   Each bite will absorb health from the target and weaken them");
        addItemTooltip(nightmare_base_start,
                "Armor is nullified",
                "Every time you take damage, it forcibly reduces 1 health point",
                "Does not trigger when the health is below 10");
        addItemTooltip(nightmare_base_start_pod, "Resistance increased by 20%");
        addItemTooltip(nightmare_base_start_egg,
                "Luck +10",
                "All damage +20%",
                "Healing +50%");
        addItemTooltip(nightmare_base_start_power,
                "For each positive potion effect present",
                "All your attributes increase by 2%");
        addItemTooltip(GodAmbush, "Increases 10% resistance");
        addItemTooltip(GodPutrefactive,
                "Eating food gains significant benefit buffs",
                "Eating food restores 10% of max health");
        addItemTooltip(GodRegenerative, "Restores 1 health point every 0.75 seconds");

        // Entities
        addEntityType(EntityTs.cell_giant, "cell giant");
        addEntityType(EntityTs.cell_zombie, "cell zombie");
        addEntityType(EntityTs.flysword, "fly sword");
        addEntityType(EntityTs.owner_blood_, "owner blood");

        // Curio slots
        addCurioLang("medicine", "medicine", "medicine");
        addCurioLang("man", "Player Genes");
        addCurioLang("necora", "DNA", "when necora");
        addCurioLang("ncrdna", "ncr dna", "necora");
        addCurioLang("dna", "dna", "DNA");
        addCurioLang("dnabush", "Segmented Genome", "Segmented Genome");
        addCurioLang("crystal", "crystal", "佩戴水晶时");
        addCurioLang("stone", "stone", "佩戴符石后");
        addCurioLang("zombie", "zombie", "zombie");
        addCurioLang("nightmare", "Nightmare Slot", "When undergoing the Nightmare Baptism");

        // Everything else
        add("tooltip.moonstone.abyss_blessing", "Abyss's Blessing:");
        add("item.nightmare_base_black_eye.blessing.1", "Immune to Darkness");
        add("item.nightmare_base_black_eye.blessing.2", "Immune to Blindness");
        add("item.nightmare_base_redemption.blessing.1", "Lord, grant me strength");
        add("item.nightmare_base_redemption.blessing.2", "+10 damage, health, armor");
        add("item.nightmare_base_reversal.blessing.1", "Rebirth is a rough road");
        add("item.nightmare_base_reversal.blessing.2", "10s invincible on respawn");
        add("item.nightmare_base_fool.blessing.1", "You seem to have Fortune II");
        add("item.nightmare_base_fool.blessing.2", "You seem to have Looting II");
        add("item.nightmare_base_start.blessing.1", "Blessed with odd regeneration");
        add("item.nightmare_base_start.blessing.2", "+50% healing");
        add("item.nightmare_base_insight.blessing.1", "You sense a strange aura");
        add("item.nightmare_base_insight.blessing.2", "+100% XP drops");
        add("item.nightmare_base_stone.blessing.1", "A trial to temper your will");
        add("item.nightmare_base_stone.blessing.2", "Lower health, higher stats");
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
        add("moonstone.config.GodAcidicReflux", "Acidic Reflux attribute multiplier");
        add("moonstone.config.GodHypertrophy", "Vermiform Muscle Enhancement crit chance is multiplied by this value");
        add("moonstone.config.GodNajaMortis", "Cobra Lock-On max damage is multiplied by this value");
        add("moonstone.config.GodPeptideSurge", "Enhanced Peptide Synthesis attribute multiplier");
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
        add("moonstone.configuration.Brain", "莫里斯脑子");
        add("moonstone.configuration.Brain2", "莫里斯脑子2");
        add("moonstone.configuration.Candle", "古蜡烛");
        add("moonstone.configuration.EctoplasmStar", "幸运星");
        add("moonstone.configuration.EctoplasmStar2", "幸运星2");
        add("moonstone.configuration.EndBone", "末世脊骨");
        add("moonstone.configuration.Fermentation", "埋伏狩猎");
        add("moonstone.configuration.Fermentation2", "埋伏狩猎2");
        add("moonstone.configuration.FoolBone", "危险的头骨");
        add("moonstone.configuration.FoolSoul", "灵魂");
        add("moonstone.configuration.FoolSoul2", "灵魂2");
        add("moonstone.configuration.GodAcidicReflux", "Acidic Reflux");
        add("moonstone.configuration.GodHypertrophy", "Vermiform Muscle Enhancement");
        add("moonstone.configuration.GodNajaMortis", "Cobra Lock-On");
        add("moonstone.configuration.GodPeptideSurge", "Enhanced Peptide Synthesis");
        add("moonstone.configuration.HypocriticalSelfEsteem", "虚伪自尊");
        add("moonstone.configuration.InsightDrug", "疯狂药剂");
        add("moonstone.configuration.InsightDrug2", "疯狂药剂");
        add("moonstone.configuration.InsightInsane", "战神石");
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
        add("key.moonstone.y", "skill");
        add("key.category.moonstone.moonstone", "月之石");
        add("moonstone.book.error", "you need patchouli mod");
        add("item.moonstone.tool.string.sword", "Right-click to toggle this ability");
        add("item.moonstone.tooltips.off", "Ability enabled");
        add("item.moonstone.tooltips.on", "Ability disabled");
        add("moonstone.configuration.BloodItem", "血魔");
        add("moonstone.configuration.Ectoplasm", "灵质");
        add("moonstone.configuration.TheNecora", "Necora");
        add("moonstone.configuration.ITEMCategoryMLS", "莫里斯");
        add("moonstone.configuration.Nightmare", "噩梦");
        add("moonstone.configuration.BloodItem.tooltip", "血魔");
        add("moonstone.configuration.Ectoplasm.tooltip", "灵质");
        add("moonstone.configuration.TheNecora.tooltip", "Necora");
        add("moonstone.configuration.ITEMCategoryMLS.tooltip", "莫里斯");
        add("moonstone.configuration.Nightmare.tooltip", "噩梦");
        add("moonstone.configuration.BloodItem.button", "血魔");
        add("moonstone.configuration.Ectoplasm.button", "灵质");
        add("moonstone.configuration.TheNecora.button", "Necora");
        add("moonstone.configuration.ITEMCategoryMLS.button", "莫里斯");
        add("moonstone.configuration.Nightmare.button", "噩梦");
        add("moonstone.tool.youcannot", "你必须将重复物品取出才能使用");
        add("moonstone.translation.nightmare", "你感受到了强烈的不安与恐惧");
        add("moonstone.translation.nightmare.1", "你真的要佩戴它吗");
        add("moonstone.nightmare.name", "这个物品只能在佩戴深渊之眼的情况下使用");
        add("item.moonstone.key", "Bound key: %s");
        add("itemGroup.tabmoonstone", "Moon Stone");
        add("itemGroup.tabmoonstone.necora", "Moon Stone:DNA");
        add("moonstone.attribute.name.ectoplasm", "ectoplasm");
        add("moonstone.attribute.name.nano", "nano");
        add("moonstone.attribute.name.meet", "meet");
        add("moonstone.attribute.name.mysterious", "mysterious");
        add("moonstone.attribute.name.reality", "reality");
        add("moonstone.attribute.name.twisted", "twisted");
        add("item.moonstone.ectoplasmslate", "ectoplasm slate");
        add("item.moonstone.ectoplasmbadge", "ectoplasm badge");
        add("item.moonstone.ectoplasmstone", "ectoplasm stone");
        add("item.moonstone.ectoplasmfood", "ectoplasm food");
        add("item.moonstone.ectoplasmcharm", "ectoplasm charm");
        add("item.moonstone.ectoplasmcharmstone", "ectoplasm charm stone");
        add("item.moonstone.nightmareanchor", "nightmare anchors");
        add("item.moonstone.nightmarecharm", "nightmare amulet");
        add("item.moonstone.nightmareeye", "nightmare eye");
        add("item.moonstone.nightmaremoai", "nightmare stone ball");
        add("item.moonstone.nightmarerotten", "nightmare rotten Heart");
        add("item.moonstone.nightmarestone", "nightmare stone");
        add("item.moonstone.nightmaretreasure", "nightmare treasure");
        add("item.moonstone.nightmarewater", "nightmare chalice");
        add("item.ectoplasmshild.tool.string", "Continuous Resistance boost");
        add("item.ectoplasmshild.tool.string.2", "Reduces damage from explosions by 30%");
        add("item.ectoplasmshild.tool.string.3", "Every 5 hits taken, you are immune to the next attack");
        add("item.nightmareanchor.tool.string", "Died while wearing it.");
        add("item.nightmareanchor.tool.string.1", "Record the location of this death.");
        add("item.nightmareanchor.tool.string.2", "Right click to teleport to the previous record point");
        add("item.nightmareanchor.tool.string.3", "But you have to be in the same dimension");
        add("item.nightmareanchor.tool.string.4", "while wearing:");
        add("item.nightmareanchor.tool.string.5", "Reduces curse from the Nightmare by 5%");
        add("item.nightmareanchor.tool.string.6", "");
        add("item.nightmareanchor.tool.string.7", "");
        add("item.nightmarecharm.tool.string", "Reduces curses from Nightmare-eye by 15%");
        add("item.nightmarecharm.tool.string.1", "*overlay calculation");
        add("item.nightmarecharm.tool.string.2", "+1 curios slot");
        add("item.nightmarecharm.tool.string.3", "");
        add("item.nightmarecharm.tool.string.4", "");
        add("item.nightmareeye.tool.string", "Increase damage taken by 33%");
        add("item.nightmareeye.tool.string.1", "Most of your attributes will be reduced by 25%");
        add("item.nightmaremoai.tool.string", "+2 Enchantment level of the enchanted product");
        add("item.nightmaremoai.tool.string.1", "");
        add("item.nightmaremoai.tool.string.2", "");
        add("item.nightmarerotten.tool.string", "+33％ All Attributes");
        add("item.nightmarerotten.tool.string.1", "But for every additional 1 attribute");
        add("item.nightmarerotten.tool.string.2", "Curses from the Nightmare will increase by 1.1%");
        add("item.nightmarerotten.tool.string.3", "");
        add("item.nightmarerotten.tool.string.4", "");
        add("item.nightmarestone.tool.string", "For each debuff that exists on you:");
        add("item.nightmarestone.tool.string.1", "+4％ Damage, Speed, Armor");
        add("item.nightmarestone.tool.string.2", "+7％ Regeneration, Knockback Resistance");
        add("item.nightmarestone.tool.string.3", "+10％Breaking speed、Experience Drops");
        add("item.nightmarestone.tool.string.4", " Damage, Speed, Armor");
        add("item.nightmarestone.tool.string.5", " Life Restoration, Knockback Resistance");
        add("item.nightmarestone.tool.string.6", " Breaking speed、Experience Drops");
        add("item.nightmarestone.tool.string.7", "Double the duration of any debuffs on you");
        add("item.nightmarestone.tool.string.8", "Taking damage from any source gains a random debuff");
        add("item.nightmarestone.tool.string.9", "");
        add("item.nightmarestone.tool.string.10", "");
        add("item.nightmaretreasure.tool.string", "Reduces damage dealt by 50%");
        add("item.nightmaretreasure.tool.string.1", "Loot gained from kills has a 33% chance of getting triple");
        add("item.nightmaretreasure.tool.string.2", "Each increase of 1 in luck increases the probability by 3%");
        add("item.nightmaretreasure.tool.string.3", "Maximum 66%");
        add("item.nightmaretreasure.tool.string.4", "");
        add("item.nightmaretreasure.tool.string.5", "");
        add("item.nightmaretreasure.tool.string.6", "-33% looting");
        add("item.moonstone.diemug", "Death Cask");
        add("item.moonstone.evilmug", "Evil Cask");
        add("item.nightmarewater.tool.string", "Defeat...Frailty ......");
        add("item.nightmarewater.tool.string.1", "Nightmare…Eternity……");
        add("key.moonstone.r", "技能");
        add("key.categories.moonstone.moonstone", "月之石");
        add("item.moonstone.germ", "germ");
        add("item.moonstone.fungus", "fungus");
        add("item.moonstone.parasite", "parasite");
        add("item.moonstone.virus", "virus");
        add("item.fungus.tool.string", "Gain a life Restoration bonus based on the number of pets around you");
        add("item.fungus.tool.string.1", "Each pet boosts this bonus by 25%");
        add("item.fungus.tool.string.2", "Maximum 150%");
        add("item.fungus.tool.string.3", "Convert the Grass cubes under your feet");
        add("item.fungus.tool.string.4", "Gain life restoration on Mycelium cubes");
        add("item.fungus.tool.string.5", "Unaffected by effects including Wither, Weakness, Slowness, Poison generation");
        add("item.fungus.tool.string.6", "You burn in the sun, even if you wear a hat.");
        add("item.fungus.tool.string.7", "Strengthen nearby pets");
        add("item.germ.tool.string", "Increases the adaptation value of Germ when digging cubes:");
        add("item.germ.tool.string.1", "Additional attributes can be gained from Germ for every 250 points of adaptation value");
        add("item.parasite.tool.string", "Elevated Parasite activity based on the nutritional value of the food");
        add("item.parasite.tool.string.1", "The more active the Parasite, the stronger your attributes.");
        add("item.parasite.tool.string.2", "The higher the Parasite activity, the less activity can be increased");
        add("item.parasite.tool.string.3", "As the Parasites become more active, it will become increasingly difficult for you to get enough to eat");
        add("item.parasite.tool.string.4", "In moments of necessity, parasites will sacrifice activity to preserve their host!");
        add("item.parasite.tool.string.5", "You become weak when your Hunger Value is less than 50%.");
        add("item.virus.tool.string", "Killing creatures to take their DNA!");
        add("item.virus.tool.string.1", "Every 10 points of DNA taken deals an additional 2.5% damage to this type of creature.");
        add("item.virus.tool.string.2", "Maximum 50%");
        add("item.botton.tool.string", "*If you find some unspecified gene...");
        add("item.botton.tool.string.1", "*That way I can build you a whole new body.");
        add("item.botton.tool.string.2", "Wearing this item and opening loot boxes in Mordor may reveal some genomes");
        add("item.catalyzer.tool.string", "Right-click to use to infect some special items");
        add("item.batskill.tool.string", "Attacks have a 15% chance of summoning 3 bats");
        add("item.batskill.tool.string.1", "And within a radius of 12 squares");
        add("item.batskill.tool.string.2", "For each bat present, your damage is reduced by 5%.");
        add("item.batskill.tool.string.3", "Maximum 80%");
        add("item.batskill.tool.string.4", "Surrounding bats lose 10% of their life every 1 second.");
        add("item.batskill.tool.string.5", "Can be implanted in Bloodvirus");
        add("item.batgene.tool.string", "Bats in your vicinity take 60% less damage");
        add("item.batgene.tool.string.1", "For each bat present, you deal 10% more damage.");
        add("item.batgene.tool.string.2", "10% Damage reduction");
        add("item.batgene.tool.string.3", "The maximum damage does not exceed 200%");
        add("item.flygene.tool.string", "13% increase in speed while flying");
        add("item.flygene.tool.string.1", "When gliding, use the arrow keys to accelerate or decelerate in the air.");
        add("item.ragegene.tool.string", "When your Attack Stamina Bar is at 100 percent");
        add("item.ragegene.tool.string.1", "Increases damage by 5% with each attack");
        add("item.ragegene.tool.string.2", "Maximum 100%");
        add("item.ragegene.tool.string.3", "Recalculated after taking damage");
        add("item.sleepgene.tool.string", "Doesn't get negative effects during the day");
        add("item.sleepgene.tool.string.1", "Can't get gain effects at night");
        add("item.medicinebox.tool.string.eat", "you: +1 slot");
        add("item.bloodvirus.tool.string", "Increases damage against non-undead creatures by 25");
        add("item.bloodvirus.tool.string.1", "Increase speed at night by 17%");
        add("item.bloodvirus.tool.string.2", "When gliding, you can use the forward button to sprint");
        add("item.bloodvirus.tool.string.3", "In the dark, you'll get Night vision");
        add("item.bloodvirus.tool.string.4", "Increases life steal by 10%");
        add("item.bloodvirus.tool.string.5", "*feed on souls");
        add("item.bloodvirus.tool.string.6", "Reduces life restoration effects from any source by 30%");
        add("item.bloodvirus.tool.string.7", "You will burn in the sun and become extremely weak!");
        add("item.bloodvirus.tool.string.8", "Increases knockback distance by 100%");
        add("item.bloodvirus.tool.string.9", "Reduces life cap by 25%");
        add("item.bloodvirus.tool.string.10", "You can only eat meat.");
        add("item.bloodvirus.tool.string.11", "*Mutagenic parasites with sensory abilities which stimulate bloodlust in their hosts!");
        add("item.bloodvirus.tool.string.12", "It can also be implanted:");
        add("item.moonstone.dna", "dna");
        add("item.moonstone.botton", "botton");
        add("item.moonstone.catalyzer", "catalyzer");
        add("item.moonstone.batskill", "batskill");
        add("item.moonstone.batgene", "batgene");
        add("item.moonstone.bloodgene", "bloodgene");
        add("item.moonstone.flygene", "flygene");
        add("item.moonstone.heathgene", "heathgene");
        add("item.moonstone.ragegene", "ragegene");
        add("item.moonstone.sleepgene", "sleepgene");
        add("item.moonstone.twistedstone", "twisted stone");
        add("item.moonstone.bloodvirus", "blood virus");
        add("item.diemug.tool.string", "Right click on this Holy Grail with the potion");
        add("item.diemug.tool.string.1", "ou can store the effect of the potion (there can be 8 types)");
        add("item.diemug.tool.string.2", "Obtain all medicinal effects after drinking");
        add("item.evilmug.tool.string", "Empty");
        add("item.evilmug.tool.string.1", "Replenish the fresh blood in the barrel (secondary hand) from the damage caused during the attack");
        add("item.evilmug.tool.string.2", "And you can extract your own blood");
        add("item.evilmug.tool.string.3", "Drink！");
        add("item.heathgene.tool.string", "+10 heath");
        add("item.heathgene.tool.string.1", "+10% heath");
        add("allevent.moonstone.virus", "DNA has been collected : ");
        add("item.bloodgene.tool.string", "Basic damage, reduced attack speed by 50% ");
        add("item.bloodgene.tool.string.1", "Every time you take damage, you will receive an improvement");
        add("item.bloodgene.tool.string.2", "The maximum is 200% of the original");
        add("item.bloodgene.tool.string.3", "Increase damage taken by 10%");
        add("item.moonstone.flyeye", "fly eye");
        add("item.flyeye.tool.string", "+300% repelled");
        add("item.flyeye.tool.string.1", "+25% Invincible Frame");
        add("item.flyeye.tool.string.2", "Cause damage to surrounding creatures during invincibility");
        add("item.moonstone.plague", "plague");
        add("item.moonstone.plagues", "plague");
        add("item.plague.s.tool.string", "这个物品已经没有任何用处了");
        add("item.plague.tool.string", "研究点数");
        add("item.plague.tool.string.un", "use nightmare eye Can Un equip plague");
        add("item.plague.tool.string.1", "Virus progress");
        add("item.plague.tool.string.2", "Reverse research progress");
        add("item.plague.tool.string.3", "Kill creatures to obtain points");
        add("item.plague.tool.string.4", "You must study the points to 100%");
        add("item.plague.tool.string.5", "The number of points affects the attributes, and it is best to complete it within the specified time");
        add("item.plague.tool.string.6", "Can you dominate the world?");
        add("item.plague.tool.string.8", "+50% MAX_HEALTH");
        add("item.plague.tool.string.9", "+25% MOVEMENT_SPEED");
        add("item.plague.tool.string.10", "+66% ARMOR");
        add("item.plague.tool.string.11", "+90% KNOCKBACK_RESISTANCE");
        add("item.plague.tool.string.12", "+70% ATTACK_SPEED");
        add("item.plague.tool.string.13", "+70% ATTACK_DAMAGE");
        add("item.plague.tool.string.14", "+70% SWIM_SPEED");
        add("item.plague.tool.string.15", "+100% MOB DAMAGE");
        add("item.plague.tool.string.16", "+150% BOSS DAMAGE");
        add("item.plague.tool.string.17", "+100% HEAL");
        add("item.plague.tool.string.18", "+70% DIG SPEED");
        add("item.moonstone.soulbook", "a book");
        add("item.moonstone.wind_and_rain", "wind and rain");
        add("item.wind_and_rain.tool.string", "Drag this item and right-click on sword weapons to enchant souls");
        add("item.wind_and_rain.tool.string.1", "Afterwards, use the soul possessed weapon and long press the right button to summon the flying sword");
        add("item.wind_and_rain.tool.string.2", "But each summon has a 1.5% chance of entering an 8-second cooldown");
        add("item.wind_and_rain.tool.string.3", "And it will consume durability");
        add("item.wind_and_rain.tool.string.4", "ou must possess both the Heart of Seven Swords and the Rain to use it properly");
        add("item.cell.tool.string", "Kill creatures to summon zombies");
        add("advancements.tooltip.cell.all.text", "Treasure loot");
        add("advancements.tooltip.nightmare.all.text", "Treasure loot");
        add("advancements.tooltip.necora.all.text", "Treasure loot");
        add("item.moonstone.slime", "slime");
        add("item.giant.tool.string", "Kill creatures to summon cell zombie (5%)");
        add("item.slime.tool.string", "Kill creatures to summon slime zombie (33%)");
        add("advancements.tooltip.giant.text", "Wearing NECORA virus, killing Warden");
        add("entity.moonstone.nightmare_entity", "nightmare entity");
        add("entity.moonstone.nightmare_giant", "nightmare giant");
        add("entity.moonstone.cell_slime", "cell slime");
        add("entity.moonstone.suddenrain", "sudden rain");
        add("item.moonstone.gorillacake", "gorilla cake");
        add("item.moonstone.gorilladna", "gorilla dna");
        add("item.gorillacake.tool.string", "");
        add("item.gorilladna.tool.string", "Enable pathogens to modify chimpanzee genes and significantly improve their intelligence");
        add("item.gorilladna.tool.string.1", "And make the iris of the gorilla's eyes appear green without triggering any immune response\n");
        add("item.gorilladna.tool.string.2", "  This is the time when chimpanzees are rising!");
        add("advancements.tooltip.dna.text", "dna?");
        add("advancements.tooltip.germ.text", "Wear a culture dish and find it in the AncientCity");
        add("advancements.tooltip.fungus.text", "Kill mushroom cattle while wearing a culture dish and having a weak effect,");
        add("advancements.tooltip.virus.text", "When wearing a culture dish and experiencing weak effects, being hit by a withered skull");
        add("advancements.tooltip.parasite.text", "Wear a petri dish and eat: raw cod, raw salmon, raw beef, raw mutton, raw pork, raw rabbit meat, tropical fish, chicken, and eat any food");
        add("advancements.tooltip.the_heart.text", "treasure item");
        add("item.moonstone.nightmare_orb", "nightmare_orb");
        add("item.moonstone.nightmare_heart", "nightmare heart");
        add("item.nightmare_heart.tool.string", "Kill creatures and summon the Abyss Cube");
        add("item.nightmare_orb.tool.string", "When your health is below 33%");
        add("item.nightmare_orb.tool.string.1", "All curses from the Abyss will be reversed into gains for you");
        add("item.nightmare_orb.tool.string.2", "But deal 1% maximum health damage per second");
        add("item.nightmare_orb.tool.string.3", "And unable to receive treatment during this period");
        add("item.moonstone.nightmare_head", "nightmare orb");
        add("item.moonstone.nightmare_cube", "nightmare cube");
        add("item.moonstone.speed_seed", "speed seed");
        add("item.speed_seed.tool.string", "Fixed speed to 120% of normal value");
        add("item.moonstone.light_amout", "light amout");
        add("item.light_amout.tool.string", "If the distance of a single fall is greater than 2");
        add("item.light_amout.tool.string.1", "So the next all-out strike will be accompanied by a large-scale lightning attack");
        add("item.light_amout.tool.string.2", "The damage of lightning will increase with the increase of its own attack damage and fall distance");
        add("item.light_amout.tool.string.3", "For every additional grid, there will be a 10% increase in damage");
        add("item.moonstone.anaerobic_cell", "anaerobic cell");
        add("item.anaerobic_cell.tool.string", "Nightmare Giant's Survival Time Increases by 50%");
        add("item.moonstone.giant_boom_cell", "giant boom cell");
        add("item.giant_boom_cell.tool.string", "Nightmare giant's death leads to devastating explosion");
        add("item.moonstone.not_blood_cell", "not blood cell");
        add("item.not_blood_cell.tool.string", " Nightmare Giant's ranged attacks will not cause damage to summoners");
        add("item.moonstone.subspace_cell", "subspace cell");
        add("item.subspace_cell.tool.string", "Summon Nightmare Giant to no longer consume health points");
        add("item.moonstone.bat_cell", "bat cell");
        add("item.bat_cell.tool.string", "Summon a Shadow Bat with 15% health loss");
        add("item.bat_cell.tool.string.1", "Reduce current health by 15% after summoning");
        add("item.bat_cell.tool.string.2", "The more health points lost, the higher the damage dealt by the Shadow Bat");
        add("item.moonstone.cell_doctor", "cell doctor");
        add("item.cell_doctor.tool.string", "You and the Shadow Bat will gain 20% of their bloodsucking ability");
        add("item.moonstone.cell_desecrate", "cell desecrate");
        add("item.cell_desecrate.tool.string", "You and Shadow Bat deal 40% more damage to non undead creatures");
        add("item.moonstone.cell_harvest", "cell harvest");
        add("item.cell_harvest.tool.string", "The probability of summoning Shadow Bat increases by 35%, but the cooldown time doubles");
        add("item.moonstone.cell_scientist", "cell scientist");
        add("item.cell_scientist.tool.string", "When summoning the Shadow Bat, the amount of blood sacrificed doubles, and the Shadow Bat's health and attack power increase according to the amount of blood sacrificed");
        add("item.moonstone.cell_immortal", "cell Immortal");
        add("item.cell_immortal.tool.string", "Your and Shadow Bat's armor value increases by 10 points");
        add("item.moonstone.cell_rage", "cell rage");
        add("item.cell_rage.tool.string", "Your attack damage increases by 25%, and Shadow Bat's damage is halved");
        add("item.moonstone.cell_blood_attack", "cell blood attack");
        add("item.cell_blood_attack.tool.string", "The Shadow Bat will restore 10% of the Sacrifice's health based on the damage it causes");
        add("item.moonstone.cell_fear", "cell fear");
        add("item.cell_fear.tool.string", "Increase the survival time of Shadow Bat by 50%");
        add("item.moonstone.cell_not_do", "cell not do");
        add("item.cell_not_do.tool.string", "Shadow bats no longer need to sacrifice health points");
        add("entity.moonstone.small_zombie", "small zombie");
        add("item.moonstone.small.all", "Right click to equip the attendant");
        add("item.moonstone.acid", "acid");
        add("item.acid.tool.string", "Your attendants are more prone to death, but each death earns the master a large amount of buff");
        add("item.moonstone.zombie_box", "zombie box");
        add("item.moonstone.zombie_box_nobo", "zombie box not");
        add("item.moonstone.compression", "compression");
        add("item.compression.tool.string", "Your servant zombies are more vulnerable to damage, but each attack restores their own health");
        add("item.moonstone.zombie_ring", "zombie ring");
        add("item.moonstone.atrophy", "atrophy");
        add("item.atrophy.tool.string", "Make zombie attendants highly aggressive");
        add("item.moonstone.enhancemen", "enhancemen");
        add("item.enhancemen.tool.string", "Can equip zombie attendants with gene fragments and segmented genomes");
        add("item.moonstone.at_a_book", "at_a_book");
        add("item.at_a_book.tool.string.lvl.1", "仙尊");
        add("item.at_a_book.tool.string.lvl.2", "金仙");
        add("item.at_a_book.tool.string.lvl.3", "仙尊");
        add("item.at_a_book.tool.string.lvl.4", "仙帝");
        add("item.at_a_book.tool.string.lvl.5", "炼神");
        add("item.at_a_book.tool.string.lvl.6", "天神");
        add("item.at_a_book.tool.string.lvl.7", "主神");
        add("item.at_a_book.tool.string.lvl.8", "天劫");
        add("item.at_a_book.tool.string.lvl.9", "合道");
        add("item.at_a_book.tool.string.lvl.10", "圣玄");
        add("item.at_a_book.tool.string.lvl.11", "圣君");
        add("item.at_a_book.tool.string.lvl.12", "圣尊");
        add("item.at_a_book.tool.string.2", "每秒有30%的概率增加1点修行值");
        add("item.moonstone.the_pain_stone", "the pain stone");
        add("item.the_pain_stone.tool.string.1", "After killing a creature, convert 50% of its maximum health to the next additional attack damage");
        add("item.the_pain_stone.tool.string.2", "If the next damage caused exceeds the maximum health of the creature");
        add("item.the_pain_stone.tool.string.3", "So the additional damage will proportionally restore one's own health");
        add("item.the_pain_stone.tool.string.4", "-15% of any damage");
        add("item.the_pain_stone.tool.string.5", "next");
        add("item.moonstone.pain_candle", "the pain candle");
        add("item.pain_candle.tool.string", "When restoring health,+1% of damage is taken");
        add("item.pain_candle.tool.string.1", "Until it returns to full health status");
        add("item.pain_candle.tool.string.2", "+1. Life recovery");
        add("item.pain_candle.tool.string.3", "+33% Life Recovery");
        add("item.pain_candle.tool.string.4", "Hurt");
        add("item.moonstone.pain_ring", "the pain candle");
        add("item.pain_ring.tool.string", "When restoring health, increase damage by 1% (not exceeding 100%)");
        add("item.pain_ring.tool.string.1", "Until it returns to full health status");
        add("item.pain_ring.tool.string.2", "-50% heal");
        add("item.moonstone.max_sword", "max sword");
        add("effect.moonstone.rage", "rage");
        add("effect.moonstone.fear", "fear");
        add("effect.moonstone.pain", "pain");
        add("effect.moonstone.blood", "blood");
        add("effect.moonstone.elements", "elements");
        add("item.max_sword.tool.string", "Each attack has a probability of generating a blood cell to rotate around you");
        add("item.max_sword.tool.string.1", "When the number of blood cells exceeds 8,");
        add("item.max_sword.tool.string.2", "The next slash will deal triple damage");
        add("item.max_sword.tool.string.3", "Blood cells will be absorbed by you over time");
        add("item.max_sword.tool.string.4", "Each absorption will restore a certain percentage of health");
        add("item.max_sword.tool.string.5", "Each blood cell provides a 5% damage bonus");
        add("item.max_sword.tool.string.6", "Blood cell explosion causes bleeding effect on organisms within 3 cells");
        add("item.max_sword.tool.string.7", "Kill the creature and obtain 1-3 blood cells");
        add("item.moonstone.max_blood_eye", "max blood eye");
        add("item.max_blood_eye.tool.string", "Every time you strike with all your might, you will experience bleeding");
        add("item.max_blood_eye.tool.string.1", "When the number of bleeding organisms in the vicinity exceeds 3");
        add("item.max_blood_eye.tool.string.2", "Generate a blood explosion and cause damage based on the number of organisms");
        add("item.max_blood_eye.tool.string.3", "The affected person will bleed, and if the condition already exists, it will be converted to serious injury");
        add("item.max_blood_eye.tool.string.4", "Cooling time 5 seconds");
        add("item.moonstone.tooltip.battery", "Can be retrofitted with Nano");
        add("moonstone.string.cooling", "time:");
        add("tool.string.ectoplasmball", "");
        add("tool.string.ectoplasmball.1", "");
        add("tool.string.ectoplasmball.2", "");
        add("tool.string.ectoplasmball.3", "");
        add("item.nightmare_cube.tool.string", "You can press Shift while approaching the creature and release the dark dye thread");
        add("item.moonstone.max_blood_cube", "max blood cube");
        add("item.max_blood_cube.tool.string", "Aim at the creature and stealth, then long press and right-click to release the skill");
        add("item.max_blood_cube.tool.string.1", "Cannot attack during skill period");
        add("item.blood.tool.string.evil", "evil");
        add("item.blood.tool.string.evil.1", "There is a 33% chance that killing a creature will regenerate into a blood cell");
        add("item.blood.tool.string.evil.2", "Harvest blood cells to restore 4 health points");
        add("item.blood.tool.string.evil.3", "If you wear Shadow Plague, the health value restored by Evil Mind Demon will be changed to percentage form");
        add("item.blood.tool.string.sword.1", "Summon 1 Flying Sword for every 10% loss of health");
        add("item.blood.tool.string.sword.2", " If you wear the Seven Swords of Asura Heart or Sudden Rain, you will lose 50% of your health");
        add("item.blood.tool.string.sword", "sword");
        add("attribute.name.moonstone.break_speed", "Mining Speed");
        add("attribute.name.moonstone.all_attack", "Universal Damage");
        add("attribute.name.moonstone.hurt", "Damage Taken");
        add("item.moonstone.evil_blood", "evil blood");
        add("item.evil_blood.tool.string", "Summon a ？ to assist you in battle");
        add("advancements.tooltip.evil_blood.text", "evil blood");
        add("entity.moonstone.blood_orb_owner", "blood orb owner");
        add("entity.moonstone.line", "blood line");
        add("item.evil_mob.tool.string.1", "Allow you to use and discover corresponding items without wearing Abyss Eye or Necrora virus");
        add("item.evil_mob.tool.string.2", "null");
        add("item.evil_mob.tool.string.3", "null");
        add("item.evil_mob.tool.string.4", "与Necora病毒，深渊之眼，暗影瘟疫无法相同佩戴");
        add("item.god_lead.tool.string.1", "When you take fatal damage, it is transferred to a nearby creature (10 second cooldown)");
        add("item.god_lead.tool.string.2", "If that creature dies, the cooldown is reset");
        add("item.god_lead.tool.string.3", "+150% Damage taken");
        add("item.malice_die.tool.string.1", "For every nearby creature targeting you:");
        add("item.malice_die.tool.string.2", "+3.3% Damage");
        add("item.malice_die.tool.string.3", "+3% Healing");
        add("item.malice_die.tool.string.4", "+2.7% Speed");
        add("item.malice_die.tool.string.5", "+2.5% Attack Speed");
        add("item.malice_die.tool.string.6", "+2% Armor");
        add("item.malice_die.tool.string.7", "+1.7% Critical Damage");
        add("item.malice_die.tool.string.8", "Attacking makes creatures within 8 blocks of the target attack you");
        add("item.malice_die.tool.string.9", "-15% All Damage");
        add("item.malice_die.tool.string.10", "If the number of targets is less than 3, the damage you cause will be reduced by 35%");
        add("item.nine_sword_book.tool.string.all", "After reaching the [Sword Emperor] and [Sword Ancestor] levels, attribute growth is reduced by 22.5%");
        add("item.moonstone.blood_stasis", "Blood Stasis");
        add("item.blood_stasis.tool.string", "Restores 10% of the summoner's maximum health after a zombie dies");
        add("item.moonstone.bone_structure", "Abnormal Bone Structure");
        add("item.bone_structure.tool.string", "The zombie inherits 70% of the player's armor value and 30% of their maximum health");
        add("item.moonstone.mummification", "Mummification");
        add("item.mummification.tool.string", "Effectively suppresses the zombie's corruption speed, but reduces attack damage by 20%");
        add("item.organizational_regeneration.tool.string", "Zombies slowly restore health and increase corruption speed");
        add("item.moonstone.tumour", "Tumor");
        add("item.tumour.tool.string", "Halves the zombie's damage but doubles their health");
        add("item.moonstone.bloodstain", "Bloodstain");
        add("item.bloodstain.tool.string", "Causes an explosion when picking up blood orbs, but does not destroy blocks");
        add("item.moonstone.detect", "Element Detection");
        add("item.detect.tool.string", "Creatures locked by zombies will glow");
        add("item.moonstone.exercise_reinforcement", "Exercise Reinforcement");
        add("item.exercise_reinforcement.tool.string", "Zombies gain 60% of the summoner's movement speed");
        add("item.moonstone.plague_book", "Plague");
        add("item.plague_book.tool.string", "Creatures attacked by zombies will receive an additional 33% damage for a short period");
        add("item.moonstone.spore_outbreak", "Spore Outbreak");
        add("item.spore_outbreak.tool.string", "Picking up blood orbs restores 20% of the maximum health");
        add("item.moonstone.weak", "Nervous Weakness");
        add("item.weak.tool.string", "Immediately loses 10% health when picking up blood orbs to obtain 5 yellow hearts");
        add("moonstone.use.dna", "Hint: Crush with a medicine grinder");
        add("item.moonstone.deceased_contract", "deceased contract");
        add("item.moonstone.blood_sun", "blood sun");
        add("item.deceased_contract.tool.string.0", "There is a 15% chance to obtain their blood when killing creatures");
        add("item.deceased_contract.tool.string.1", "Picking up blood restores 15% of maximum health");
        add("item.deceased_contract.tool.string.2", "-20% damage, -25% resistance, -15% critical hit, -30% healing");
        add("item.deceased_contract.tool.string.3", "There is a chance to summon zombies when killing creatures");
        add("item.deceased_contract.tool.string.4", "Summoned zombies gain a 50% boost to the summoner's damage, speed, defense, and maximum health");
        add("item.deceased_contract.tool.string.5", "Summoned zombies gain all positive potion effects currently present in the summoner");
        add("item.deceased_contract.tool.string.6", "Neutralizes the Necora virus, Shadow Plague, and its associated items");
        add("item.deceased_contract.tool.string.7", "You must wear");
        add("item.deceased_contract.tool.string.8", "seconds before you can remove it");
        add("item.deceased_contract.tool.string.9", "Currently, it can be removed");
        add("item.moonstone.ytgld_virus", "ytgld virus");
        add("item.ytgld_virus.tool.string.1", "Can you really dominate the world?");
        add("item.ytgld_virus.tool.string.2", "Research points:");
        add("item.ytgld_virus.tool.string.3", "Virus points:");
        add("item.ytgld_virus.tool.string.4", "This is an extremely dangerous virus");
        add("item.ytgld_virus.tool.string.5", "You must reach 100% research points within the designated time");
        add("item.ytgld_virus.tool.string.6", "To unlock the ultimate annihilation gene");
        add("item.ytgld_virus.tool.string.7", "Research points will affect your normal physiological state");
        add("item.ytgld_virus.tool.string.8", "The virus will replicate in your body and affect your normal vital signs");
        add("item.ytgld_virus.tool.string.9", "So you must race against time");
        add("item.ytgld_virus.tool.string.10", "Negative effects of obtained research points:");
        add("item.ytgld_virus.tool.string.11", "Health:");
        add("item.ytgld_virus.tool.string.12", "Armor:");
        add("item.ytgld_virus.tool.string.13", "Melee damage:");
        add("item.ytgld_virus.tool.string.14", "Negative effects brought by the virus:");
        add("item.ytgld_virus.tool.string.15", "Speed:");
        add("item.ytgld_virus.tool.string.16", "Healing:");
        add("item.ytgld_virus.tool.string.17", "Resistance:");
        add("item.ytgld_virus.tool.string.18", "Attack speed:");
        add("item.ytgld_virus.tool.string.19", "Dominating ruler, bring eternal ultimate darkness to the world!");
        add("item.ytgld_virus.tool.string.20", "You have obtained:");
        add("item.ytgld_virus.tool.string.21", "+300% damage to high health creatures");
        add("item.ytgld_virus.tool.string.22", "+250% damage to monsters");
        add("item.ytgld_virus.tool.string.23", "+225% damage to friendly creatures");
        add("item.ytgld_virus.tool.string.24", "+200% damage to players");
        add("item.ytgld_virus.tool.string.25", "+150% armor");
        add("item.ytgld_virus.tool.string.26", "+100% knockback resistance");
        add("item.ytgld_virus.tool.string.27", "+100% underwater speed");
        add("item.ytgld_virus.tool.string.28", "+80% health");
        add("item.ytgld_virus.tool.string.29", "+70% attack speed");
        add("item.ytgld_virus.tool.string.30", "+65% healing");
        add("item.ytgld_virus.tool.string.31", "+20% speed");
        add("item.ytgld_virus.tool.string.32", "+50% reach distance");
        add("item.ytgld_virus.tool.string.33", "+25% attack distance");
        add("item.ytgld_virus.tool.string.34", "+20% resistance");
        add("item.ytgld_virus.tool.string.35", "Each death reduces research progress by 1%");
        add("item.ytgld_virus.tool.string.36", "Eat Spirit Cubes to suppress the virus replication speed");
        add("item.ytgld_virus.tool.string.eat", "Eat Spirit Cubes to activate the virus!");
        add("item.ytgld_virus.tool.string.37", "In the first phase, players need to kill creatures to increase points");
        add("item.ytgld_virus.tool.string.38", "Golden Apples can be eaten to reduce the virus increase speed");
        add("item.ytgld_virus.tool.string.39", "Virus increase speed is 100%");
        add("item.ytgld_virus.tool.string.40", "When research points reach the threshold, Wither needs to be killed to evolve!");
        add("item.ytgld_virus.tool.string.41", "In the second phase, players can only obtain points by killing Wither Skeletons");
        add("item.ytgld_virus.tool.string.42", "Only Spirit Cubes can be eaten to reduce the virus increase speed");
        add("item.ytgld_virus.tool.string.43", "Each death reduces research points by 1%");
        add("item.ytgld_virus.tool.string.44", "Virus increase speed is 150%");
        add("item.ytgld_virus.tool.string.45", "When research points reach the threshold, Ender Dragon needs to be killed to evolve!");
        add("item.ytgld_virus.tool.string.46", "In this phase, players can kill any creature to obtain points");
        add("item.ytgld_virus.tool.string.47", "Players can no longer reduce the virus increase speed");
        add("item.ytgld_virus.tool.string.48", "All property declines from the virus increase by 50%");
        add("item.ytgld_virus.tool.string.49", "Virus increase speed is 200%");
        add("item.dnas.tool.string", "Hint: Crush gene items with a medicine grinder");
        add("item.blood_sun.tool.string", "kill the mob");
        add("item.moonstone.dna_box", "dna box");
        add("item.moonstone.medicinebox.tool.2", "");
        add("item.moonstone.cell_disorder.tool", "Clear all BUFFs every (number) turns");
        add("item.moonstone.cell_god.tool", "Restore (number) health points when killing a creature");
        add("item.moonstone.cell_inheritance.tool", "Increase (number) damage resistance");
        add("item.moonstone.cell_big_boom.tool", "Increase (number) eating speed");
        add("item.moonstone.cell_darwin.tool", "Restore or deduct (number) health points when killing a creature");
        add("item.moonstone.speed_metabolism.tool", "Consume 1 hunger point when satiety is less than (number)");
        add("item.moonstone.cell_acid.tool", "Corrode the equipment of (number) attacked creatures");
        add("item.moonstone.cell_eyes.tool", "Make creatures within a radius of (number) glow");
        add("item.moonstone.cell_digestion.tool", "Increase (number) food satiety and hunger points");
        add("item.moonstone.cell_cranial.tool", "Increase (number) head damage resistance");
        add("item.moonstone.cell_compress.tool", "Increase (number) damage reflection");
        add("item.moonstone.cell_flu.tool", "Weaken creatures within a radius of (number)");
        add("item.moonstone.cell_constant.tool", "Increase (number) invincibility frames");
        add("error.moonstone.dna_box", "Unknown item ID detected");
        add("item.moonstone.atp_height", "ATP High Energy");
        add("item.moonstone.cell_god", "Creationism");
        add("item.moonstone.cell_ground", "Land Affinity");
        add("item.moonstone.cell_inheritance", "Simulated Hereditary Genes");
        add("item.moonstone.cell_oxygen", "Alkaline Oxidation");
        add("item.moonstone.cell_big_boom", "Cytochrome Burst");
        add("item.moonstone.cell_break_down_water", "Alkaline Hydrolysis");
        add("item.moonstone.cell_darwin", "Darwinism");
        add("item.moonstone.cell_disorder", "Metabolic Disorder");
        add("item.moonstone.cell_in_air", "Atmospheric Affinity");
        add("item.moonstone.cell_in_water", "Ocean Affinity");
        add("item.moonstone.cell_off_on", "Catalyst Switch");
        add("item.moonstone.speed_metabolism", "Rapid Metabolism");
        add("item.moonstone.cell_necrosis", "Liquefactive Necrosis");
        add("item.moonstone.cell_digestion", "Epidermal Digestion");
        add("item.moonstone.cell_acid", "Acidic Reflux");
        add("item.moonstone.cell_eyes", "Cobra Lock-On");
        add("item.moonstone.cell_bone_add", "Skeletal Structure Mutation");
        add("item.moonstone.cell_sense", "Sensory System Enhancement");
        add("item.moonstone.cell_cranial", "Brain Tissue Transfer");
        add("item.moonstone.cell_dna_suppression", "Neurotransmitter Inhibition");
        add("item.moonstone.cell_putrefactive", "Thermal Decomposition Inhibition");
        add("item.moonstone.cell_synthesis", "Enhanced Peptide Synthesis");
        add("item.moonstone.cell_compress", "Lethal Gene Compression");
        add("item.moonstone.cell_preferential", "Selective Evolution");
        add("item.moonstone.cell_flu", "Viral Influenza");
        add("item.moonstone.cell_constant", "Constant Factor Surge");
        add("item.moonstone.cell_chromosome", "Chromosomal Structural Variation");
        add("item.moonstone.medicinebox.tool", "");
        add("moonstone.difficulty.name.all", " DNA");
        add("moonstone.difficulty.name.true_god", "deified");
        add("moonstone.curse.name.all.this", "this item is");
        add("moonstone.curse.name.meet", "meet");
        add("moonstone.curse.name.all", "curse");
        add("moonstone.difficulty.name.peaceful", "peaceful");
        add("moonstone.difficulty.name.easy", "easy");
        add("moonstone.difficulty.name.normal", "normal");
        add("moonstone.difficulty.name.hard", "hard");
        add("moonstone.difficulty.name.god_loot_a", "mutated");
        add("moonstone.difficulty.name.god_loot_b", "divine");
        add("moonstone.difficulty.name.god_loot_c", "unknown");
        add("moonstone.curse.name.die", "die");
        add("moonstone.curse.name.doctor", "doctor");
        add("moonstone.curse.name.cell_cell", "cell ");
        add("moonstone.curse.name.chromosome", "chromosome");
        add("item.deceased_contract.tool.string", "you can find in curse item");
        add("moonstone.curse.name.bone", "bone");
        add("moonstone.curse.name.die_body", "die body");
        add("moonstone.difficulty.name.god", "god");
        add("item.blood.tool.string.winds.1", "5% speed bonus converted to attack damage");
        add("item.blood.tool.string.winds.2", "If you wear a nightmare item, the damage doubles");
        add("item.blood.tool.string.winds", "winds");
        add("item.moonstone.body_stone", "body stone");
        add("item.probability.tool.string.1", "Your attack damage will fluctuate between 10% and 400%,");
        add("item.probability.tool.string.2", "The damage you receive will fluctuate between 25% and 200%,");
        add("item.probability.tool.string.3", "Every bit of luck adds 1% to the minimum value,");
        add("item.probability.tool.string.4", "For the Wanmo Stone,");
        add("item.probability.tool.string.5", "Add 400% to the maximum and minimum values of the curse attribute obtained,");
        add("item.probability.tool.string.6", "Every bit of luck adds 5% to the maximum and minimum values,");
        add("item.body_stone.tool.string", "This item will curse all the accessories in the box");
        add("item.body_stone.tool.string.1", "And randomly add 1-2 negative enchantments");
        add("item.body_stone.tool.string.2", "As compensation, every item with negative enchantments will receive powerful gains");
        add("item.body_stone.tool.string.3", "Each level of enchantment:");
        add("item.body_stone.tool.string.4", "+0.1 damage, critical strike, maximum life");
        add("item.body_stone.tool.string.5", "+0.002 treatment");
        add("item.body_stone.tool.string.6", "+2% excavation speed");
        add("item.body_stone.tool.string.7", "+3% resistance and retreat");
        add("item.body_stone.tool.string.8", "+0.4% speed, melee damage, attack speed");
        add("item.luck_ring.tool.string.1", "Every 5 experience levels:");
        add("item.luck_ring.tool.string.2", "+1 Luck");
        add("item.moonstone.probability_stone", "probability stone");
        add("item.probability_stone.tool.string.1", "击中生物立即触发所有的斩杀效果，冷却20秒");
        add("item.as_amout.tool.string.1", "Launches 7 flying swords from behind the target when attacking");
        add("item.as_amout.tool.string.2", "The flying swords can exist for 20 seconds");
        add("item.as_amout.tool.string.3", "In the first 10 seconds, they will attempt to attack creatures");
        add("item.as_amout.tool.string.4", "In the last 10 seconds, they will attempt to fly towards players");
        add("item.as_amout.tool.string.5", "These flying swords come with 10% of the player's attack attributes");
        add("item.as_amout.tool.string.6", "If a flying sword is picked up, it restores 5% of maximum health");
        add("item.as_amout.tool.string.7", "5 second cooldown");
        add("item.moonstone.necora_baby", "necora baby");
        add("item.necora_baby.tool.string", "Summon a corrupt soul");
        add("item.necora_baby.tool.string.1", "You can implant gene fragments into it");
        add("item.necora_baby.tool.string.2", "If the Soul of Corruption dies/is lost, you can re equip this item");
        add("item.necora_baby.tool.string.3", "The soul of corruption will also teleport items to your side after death");
        add("item.million.tool.string.1", "This box stores 15 flying swords");
        add("item.million.tool.string.2", "Each fully charged slash summons 3 of them");
        add("item.million.tool.string.3", "Each time a flying sword is picked up, 1 will be restored");
        add("item.million.tool.string.4", "Each flying sword picked up grants a 1% damage boost");
        add("item.million.tool.string.5", "Lasts 10 seconds, stacks up to 50%");
        add("item.million.tool.string.6", "Shift");
        add("item.million.tool.string.7", "Gain boost:");
        add("item.million.tool.string.8", "Stored flying sword count:");
        add("item.moonstone.nine_sword_book", "Nine Swords Return to One Spell");
        add("item.nine_sword_book.tool.string.1", "For each sword-type weapon in the quick slot:");
        add("item.nine_sword_book.tool.string.2", "Damage");
        add("item.nine_sword_book.tool.string.3", "Attack Speed");
        add("item.nine_sword_book.tool.string.4", "Speed");
        add("item.nine_sword_book.tool.string.5", "Healing");
        add("item.nine_sword_book.tool.string.6", "Flying Sword");
        add("item.nine_sword_book.tool.string.9", "When dealing damage, there is a 5% (x number of flying swords) chance to release all flying swords");
        add("item.nine_sword_book.tool.string.10", "Flying swords slowly restore over time");
        add("item.nine_sword_book.tool.string.11", "Flying swords restore 1% of their current health after hitting");
        add("item.nine_sword_book.tool.string.12", "-25% all damage");
        add("item.nine_sword_book.tool.string.13", "-50% maximum health");
        add("item.nine_sword_book.tool.string.14", "You cannot use non-sword type weapons");
        add("item.nine_sword_books.tool.string.14", "Can only use sword type weapons");
        add("item.nine_sword_book_skill.tool.string.1", "Sword Immortal");
        add("item.nine_sword_book_skill.tool.string.2", "Sword God");
        add("item.nine_sword_book_skill.tool.string.3", "Sword Saint");
        add("item.nine_sword_book_skill.tool.string.4", "剑帝");
        add("item.nine_sword_book_skill.tool.string.5", "剑祖");
        add("sword.moonstone.lvl", "Heavy");
        add("item.nine_sword_book_lvl.tool.string.1", "Sword Immortal");
        add("item.nine_sword_book_lvl.tool.string.2", "Cultivation - Basic");
        add("item.nine_sword_book_lvl.tool.string.4", "Cultivation - Damage");
        add("item.nine_sword_book_lvl.tool.string.3", "Cultivation - Attack Speed");
        add("moonstone.jei.ectoplasmstone", "One of the random amulets at the start of the game");
        add("moonstone.jei.twistedstone", "One of the random amulets at the start of the game");
        add("moonstone.jei.necora.all", "Requires wearing Necora virus to be found in dungeons and mines");
        add("moonstone.jei.necora.treasure.all", "Requires wearing Necora virus to be found in treasure loot");
        add("moonstone.jei.necora.bnabush.all", "Requires wearing Necora virus to be found in treasure loot");
        add("moonstone.jei.giant", "Requires wearing Necora virus to be found in treasure loot");
        add("moonstone.jei.giant_nightmare", "Requires wearing Giant Zombie genetic fragment and Nightmare Eye, then kill the Guardian for a chance to drop");
        add("moonstone.jei.cell", "Requires wearing Necora virus to be found in treasure loot, once worn it cannot be obtained again");
        add("moonstone.jei.cell.all", "Requires wearing Cell Rebirth gene to be found in treasure loot");
        add("moonstone.jei.maulice.all", "Killing zombies may drop");
        add("moonstone.jei.blood", "Requires wearing Blood Magic Box to acquire by killing creatures");
        add("moonstone.jei.bloodvirus.all", "Requires wearing Shadow Plague to be found in dungeons and mines");
        add("moonstone.jei.bloodvirus", "Requires wearing a medical kit that unlocks all medications and killing the Ender Dragon to obtain Shadow Gene, then using the Shadow Gene on Necora virus to get Shadow Plague");
        add("moonstone.jei.bloodvirus.treasure.all", "Requires wearing Shadow Plague to be found in treasures");
        add("moonstone.jei.ectoplasm.all", "Most ectoplasmic items can be eaten, recovering a large amount of hunger");
        add("moonstone.jei.ectoplasm.ectoplasmcloub", "Can be obtained by killing creatures, or it can be crafted");
        add("moonstone.jei.ectoplasm.ectoplasmball", "Can be obtained by killing creatures, there is a very high chance to find it in loot chests");
        add("moonstone.jei.loot.all", "Has a chance to be found in loot chests");
        add("moonstone.jei.maxamout", "Wear three colors of runes, then kill the Ancient Guardian");
        add("moonstone.jei.pain.all", "Found in the Nether");
        add("moonstone.jei.nanodoom.all", "Found in ancient cities");
        add("moonstone.jei.wind_and_rain", "Wear Seven Swords of Asura and Sudden Rain, then touch dungeon/mines/treasures/city type chests");
        add("moonstone.jei.calcification", ": Take 350 damage, requires wearing a medical kit");
        add("moonstone.jei.masticatory", ": Die once, requires wearing a medical kit");
        add("moonstone.jei.polyphagia", ": Eat an enchanted golden apple, requires wearing a medical kit");
        add("moonstone.jei.quadriceps", ": Jump 500 times, requires wearing a medical kit");
        add("moonstone.jei.reanimation", ": Eat 8 golden apples, requires wearing a medical kit");
        add("moonstone.jei.nightmare_cube", ": ");
        add("moonstone.jei.nightmare_head", ": ");
        add("moonstone.jei.nightmare_heart", ": ");
        add("moonstone.jei.nightmare_orb", ": ");
        add("moonstone.jei.nightmareanchor", ": ");
        add("moonstone.jei.nightmarecharm", ": ");
        add("moonstone.jei.nightmareeye", ": ");
        add("moonstone.jei.nightmaremoai", ": ");
        add("moonstone.jei.nightmarerotten", ": ");
        add("moonstone.jei.nightmarestone", ": ");
        add("moonstone.jei.nightmaretreasure", ": ");
        add("moonstone.jei.nightmarewater", ": ");
        add("moonstone.jei.item.moonstone.owner_blood_eye", "It is found in ancient cities but requires wearing the Sealing Candelabra to be discovered.\n\nReduces the attack interval of Blood Spawn by 20%.");
        add("moonstone.jei.item.moonstone.owner_blood_attack_eye", "It is found in ancient cities but requires wearing the Sealing Candelabra to be discovered.\n\nIncreases the attack interval of Blood Spawn by 10%.\nIncreases Blood Damage by 20%.");
        add("moonstone.jei.item.moonstone.owner_blood_speed_eye", "It is found in ancient cities but requires wearing the Sealing Candelabra to be discovered.\n\nReduces the attack interval of Blood Spawn by 50%.\nIncreases Blood Orb speed by 300%.\nHowever, the launched Blood Orbs will no longer track entities.");
        add("moonstone.jei.item.moonstone.owner_blood_boom_eye", "It is found in ancient cities but requires wearing the Sealing Candelabra to be discovered.\n\nBlood Orbs will explode on impact.\nReduces Blood Orb speed by 20%.\nIncreases the attack interval of Blood Spawn by 200%.");
        add("moonstone.jei.item.moonstone.owner_blood_effect_eye", "It is found in ancient cities but requires wearing the Sealing Candelabra to be discovered.\n\nBlood Orbs will apply a large amount of negative effects upon impact.\nReduces Blood Damage by 50%.");
        add("moonstone.jei.item.moonstone.owner_blood_vex", "It is found in ancient cities, but requires wearing the Sealing Candelabra to be discovered.\n\nBlood Orbs will not disappear upon hitting and will penetrate entities.\nEach penetration increases damage and speed by 50%,\nbut reduces base speed and damage by 50%.");
        add("moonstone.jei.item.moonstone.owner_blood_earth", "它发现于古城，但是需要佩戴封魔烛台才能发现\n\n血灵增生体不会再攻击\n但会变成一个超级磁铁，它不仅可以吸引生物和掉落物并且还可以吸引然后吞噬弹射物\n吞噬弹射物恢复主人生命值\n\n你可以用来运送村民或者干什么别的");
        add("item.book.tool.string.nine_sword", "The power of the sword");
        add("item.book.tool.string.modi_blood", "Blood Demon Overlord");
        add("item.killer.tool.string.1", "For every 1% loss of health:");
        add("item.killer.tool.string.2", "+1.25% Healing");
        add("item.killer.tool.string.3", "+0.8% Speed");
        add("item.killer.tool.string.4", "+0.75% Damage");
        add("item.killer.tool.string.5", "+0.5% Attack Speed");
        add("item.killer.tool.string.6", "+0.35% Armor");
        add("item.killer.tool.string.7", "Current");
        add("item.killer.tool.string.8", "Healing: ");
        add("item.killer.tool.string.9", "Speed: ");
        add("item.killer.tool.string.10", "Damage: ");
        add("item.killer.tool.string.11", "Attack Speed: ");
        add("item.killer.tool.string.12", "Armor: ");
        add("item.nine_sword_book_skill.tool.string.attack_damage", "all damage");
        add("item.twelve_sword.tool.string.1", "Killing creatures summons the sword array");
        add("item.twelve_sword.tool.string.2", "Gain +10% to +120% damage near the sword array");
        add("item.twelve_sword.tool.string.3", "Creatures inside the sword array are struck by falling Death Realm swords");
        add("item.twelve_sword.tool.string.4", "The number depends on the number of zodiac items you have");
        add("item.moonstone.belt", "belt");
        add("item.moonstone.rage_eye", "Thief's Wrathful Eye");
        add("item.rage_eye.tool.string", "Left-clicking a creature with the eye steals 10% of its base attributes");
        add("item.rage_eye.tool.string.4", "The stolen attributes do not exceed 25% of yours");
        add("item.moonstone.rage_charm", "Wrathful Ruler's Charm");
        add("item.rage_charm.tool.string", "Killing creatures grants attribute bonuses");
        add("item.rage_charm.tool.string.1", "Decreases over time");
        add("item.moonstone.rage_magnet", "Wrathful Magnet");
        add("item.rage_magnet.tool.string", "Attracts dropped items and restores health");
        add("item.moonstone.rage_stone", "Nether Rock");
        add("item.rage_stone.tool.string", "Converts nearby Nether rock drops into experience orbs");
        add("item.moonstone.rage_lock", "Wrathful Lock");
        add("item.rage_lock.tool.string", "-75% healing");
        add("item.rage_lock.tool.string.1", "+25% full health resistance");
        add("item.rage_lock.tool.string.2", "+10% all damage");
        add("item.rage_lock.tool.string.3", "+15% lifesteal");
        add("item.rage_lock.tool.string.4", "+40% killing lifesteal");
        add("item.moonstone.universe", "Universe Template");
        add("item.universe.tool.string", "没造成1中不同类型的伤害（例如弹射物，荆棘）");
        add("item.universe.tool.string.1", "你都会提高10%的所有伤害");
        add("item.universe.tool.string.2", "+20% 所有伤害");
        add("item.universe.tool.null", "Empty");
        add("attribute.name.moonstone.zombie_attack_damage", "Zombie's Damage");
        add("item.moonstone.muscle_conversion", "Muscle Conversion");
        add("item.muscle_conversion.tool.string", "Player's base damage is reduced by 20%");
        add("item.muscle_conversion.tool.string.1", "Summoned zombies inherit 50% of the player's attack power");
        add("item.muscle_conversion.tool.string.2", "Summoned zombies deal 30% more damage");
        add("item.moonstone.skin_glucose_fermentation", "Muscle Glycogen Fermentation");
        add("item.skin_glucose_fermentation.tool.string", "When summoned zombies are killed");
        add("item.skin_glucose_fermentation.tool.string.1", "The attacker takes damage based on 50% of the zombie's maximum health and total armor");
        add("item.moonstone.white_blood_cells_are_abruptly_reduced", "Sudden Reduction of White Blood Cells");
        add("item.white_blood_cells_are_abruptly_reduced.tool.string", "Summoned zombies will transfer 15% of the restored health to the player");
        add("item.white_blood_cells_are_abruptly_reduced.tool.string.1", "Summoned zombies no longer restore health");
        add("item.moonstone.raw", "The Wrath of Primitive Man");
        add("item.raw.tool.string", "Nullify all cosmetic items for all mods");
        add("item.moonstone.the_god_sword", "Malicious Cube");
        add("item.moonstone.the_owner_blood_stone", "Chain Bloodstone");
        add("item.the_owner_blood_stone.tool.string", "Killing creatures produces blood orbs");
        add("item.the_owner_blood_stone.tool.string.1", "Blood orbs deal 125% damage based on the killed creature's health");
        add("item.the_owner_blood_stone.tool.string.2", "And they charge towards nearby creatures");
        add("item.the_owner_blood_stone.tool.string.3", "Blood orbs act as if you initiated an attack");
        add("item.moonstone.phosphate_bond", "High Energy Phosphate Bond Breakdown");
        add("item.phosphate_bond.tool.string", "Restores the player 10% of their maximum health when summoned zombies die");
        add("item.phosphate_bond.tool.string.1", "Summoned zombies can withstand at least 6 hits");
        add("item.phosphate_bond.tool.string.2", "Summoned zombies do not restore health");
        add("item.moonstone.chemical_compound", "Compound Synthesis");
        add("item.chemical_compound.tool.string", "For every Cell Zombie, healing increases by 25%");
        add("item.chemical_compound.tool.string.1", "For every Giant Cell Zombie, damage increases by 20%");
        add("item.chemical_compound.tool.string.2", "There is a 5% chance for the master to take 50% of the equivalent damage when zombies are injured");
        add("item.chemical_compound.tool.string.3", "The master's attacks do not trigger this");
        add("item.undead_blood_charm.tool.string.1", "Marks the attacker, dealing 150% of the restored amount of health to them each time you restore health");
        add("item.undead_blood_charm.tool.string.2", "Marks creatures with hatred towards you, dealing 50% of the restored amount of health to them each time you restore health");
        add("item.undead_blood_charm.tool.string.3", "Deals an additional 50% damage to undead creatures");
        add("item.undead_blood_charm.tool.string.4", "Increases healing by 50%");
        add("item.undead_blood_charm.tool.string.5", "Increases damage taken by 40%");
        add("moonstone.twelve.1", "Rat");
        add("moonstone.twelve.2", "Ox");
        add("moonstone.twelve.3", "Tiger");
        add("moonstone.twelve.4", "Rabbit");
        add("moonstone.twelve.5", "Dragon");
        add("moonstone.twelve.6", "Snake");
        add("moonstone.twelve.7", "Horse");
        add("moonstone.twelve.8", "Sheep");
        add("moonstone.twelve.9", "Monkey");
        add("moonstone.twelve.10", "Rooster");
        add("moonstone.twelve.11", "Dog");
        add("moonstone.twelve.12", "Pig");
        add("item.nine_sword_book.tool.string.7", "The next strike will deal damage equal to the sum of the damage of all sword weapons in your quickbar");
        add("item.nine_sword_book.tool.string.8", "冷却");
        add("item.moonstone.nine_sword_books", "nine_sword_books");
        add("item.luck_stone.tool.string.1", "Every 10 Luck:");
        add("item.luck_stone.tool.string.2", "+1 Looting and Fortune");
        add("enchantment.moonstone.terror", "terror");
        add("enchantment.moonstone.malice", "malice");
        add("enchantment.moonstone.threat", "threat");
        add("item.moonstone.probability", "probability stone");
        add("item.nightmare_head.tool.string", "Immune to all non biological injuries");
        add("item.nightmare_head.tool.string.1", "Damage reduction from any source is ineffective and the damage taken is fixed at 1 point, with a maximum health value fixed at 10 points");
        add("item.nightmare_head.tool.string.2", "Restores 0.2 health point per second, unaffected by any bonuses");
        add("item.nightmare_head.tool.string.3", "Bounce 50% penetration damage to the attacker");
        add("item.nightmare_head.tool.string.4", "And every time you wear this item and die, it will reduce your health by 10% and cause the item to fall off");
        add("item.nightmare_head.tool.string.5", "Maximum health restored after wearing");
        add("item.nightmare_head.tool.string.6", "Reduce the curse of the abyss by 100%");
        add("item.nightmare_head.tool.string.7", "Unable to remove normally");
        add("item.nightmare_head.tool.string.8", "And there will always be a ratio between your health and maximum health");
        add("moonstone.nine_sword_books.tool", "你必须使用剑类武器才能造成伤害");
        add("death.attack.abyss.message", "You have been eroded by the abyss");
        add("death.attack.sword_damage.message", "You have been pierced by a flying sword");
        add("itemGroup.moonstone", "Seeking Immortals: Nightmare Chapter");
        add("attrib.moonstone.critical", "Critical Hit");
        add("moonstone.jei.necora.giant_nightmare.all", "Requires wearing Nightmare Giant genetic fragment to be found in treasure loot");
        add("moonstone.jei.nightmare", ": Requires wearing nightmare eye to be found in dungeons and mines");
        add("moonstone.super_nightmare.name", "Only those wearing the Nightmare Base");
        add("moonstone.super_nightmare.name.1", "can use this item");
        add("item.nightmareeye.tool.string.2", "Cannot be removed");
        add("attribute.name.moonstone.allattack", "Universal Damage");
        add("attribute.name.moonstone.cit", "Critical Damage");
        add("attribute.name.moonstone.heal", "Healing");
        add("attribute.name.moonstone.dig", "Mining Speed");
        add("moonstone.item.kill", "You haven't worn it yet, you haven't killed a creature");
        add("moonstone.jei.item.moonstone.wolf", "Have your wolf kill the Warden");
        add("item.nightmare_base_stone_meet.tool.string.1", "Enhance the following accessories");
        add("item.moonstone.ectoplasmstar.nightmare_base_stone_meet", "Double luck, and each point of luck increases healing by 2.5%");
        add("item.moonstone.ectoplasmstar.mayhemcrystal", "Damage amplification increases by 50%");
        add("item.moonstone.ectoplasmstar.maxamout", "All effect BUFF levels increase by 2");
        add("item.moonstone.ectoplasmstar.maxamout.1", "All trigger effects add 100%");
        add("item.moonstone.ectoplasmstar.maxamout.2", "Reflection damage increase by 400%");
        add("item.nightmare_base_reversal.tool.string", "Every death reduces attributes to 0%");
        add("item.nightmare_base_reversal.tool.string.2", "Attributes gradually recover at a rate of 4% per second after resurrection");
        add("item.nightmare_base_reversal.tool.string.3", "Poison is fatal for you");
        add("item.nightmare_base_reversal_orb.tool.string", "Healing will only reduce health");
        add("item.nightmare_base_reversal_orb.tool.string.2", "Resets health to full every 10 seconds");
        add("item.nightmare_base_reversal_card.tool.string", "The speed of attribute recovery during each resurrection is reduced to 2%");
        add("item.nightmare_base_reversal_card.tool.string.2", "But can only recover up to 150% of the original");
        add("moonstone.jei.item.moonstone.nightmare_base.all", ", requires wearing:");
        add("moonstone.jei.item.moonstone.nightmare_base_black_eye_heart", "Trigger the Undying Totem acquisition when the following conditions are met: Poisoned, Withering, Slowness, Blindness, and on Fire");
        add("moonstone.jei.item.moonstone.nightmare_base_black_eye_eye", "Kill the Guardian");
        add("moonstone.jei.item.moonstone.nightmare_base_black_eye_red", "Found in Ancient Cities, about 5% chance");
        add("moonstone.jei.item.moonstone.nightmare_base_stone_brain", "Kill Zombies to obtain materials, but only one of this material can be obtained");
        add("moonstone.jei.item.moonstone.nightmare_base_stone_meet", "Kill the Ender Dragon");
        add("moonstone.jei.item.moonstone.nightmare_base_stone_virus", "Triggered by receiving Withering damage to get an Undying Totem");
        add("moonstone.jei.item.moonstone.nightmare_base_reversal_card", "Kill the Ender Dragon");
        add("moonstone.jei.item.moonstone.nightmare_base_reversal_mysterious", "Open chests in Ancient Cities while wearing Reversal Orb, 100% chance, but can only obtain one");
        add("moonstone.jei.item.moonstone.nightmare_base_reversal_orb", "Kill yourself with poison damage from the Reversal Object");
        add("moonstone.jei.item.moonstone.nightmare_base_redemption_deception", "Kill 100 Pillagers under an ominous sign");
        add("moonstone.jei.item.moonstone.nightmare_base_redemption_degenerate", "Kill 100 Villagers under the Village Hero effect");
        add("moonstone.jei.item.moonstone.nightmare_base_redemption_down_and_out", "Complete a failed raid");
        add("moonstone.jei.item.moonstone.end_bone", "Obtained by killing the Guardian, one player can only get one");
        add("moonstone.jei.item.moonstone.nightmare_base_fool_betray", "Kill the Ender Dragon");
        add("moonstone.jei.item.moonstone.nightmare_base_fool_bone", "Kill the Guardian");
        add("moonstone.jei.item.moonstone.nightmare_base_fool_soul", "Kill the Wither");
        add("moonstone.jei.item.moonstone.nightmare_base_insight_drug", "Given when the player has 9 different positive potion statuses");
        add("moonstone.jei.item.moonstone.nightmare_base_insight_insane", "Die or jump into the End portal to return to the Overworld");
        add("moonstone.jei.item.moonstone.nightmare_base_insight_collapse", "Kill the Ender Dragon");
        add("moonstone.jei.item.moonstone.tricky_puppets", "Found in Woodland Mansions, probability 75%, one player can only obtain one");
        add("moonstone.jei.item.moonstone.apple", "Obtained by killing a creature with health greater than 30 times your max health, only one per player");
        add("moonstone.jei.item.moonstone.ring", "Triggers the Totem of the Undead when more than 10 negative buffs are obtained, only one per player");
        add("effect.moonstone.dead", "枯朽");
        add("moonstone.jei.item.moonstone.candle", "Crafting to obtain");
        add("item.moonstone.nightmare_axe", "nightmare axe");
        add("item.nightmare_axe.tool.string", "Kill creatures to summon the Chaos Battle Axe");
        add("item.nightmare_axe.tool.string.1", "For each nearby Chaos Waraxe:");
        add("item.nightmare_axe.tool.string.2", "+25% damage");
        add("item.nightmare_axe.tool.string.3", "+25% heal");
        add("item.moonstone.falling_immortals", "Falling Immortals");
        add("item.falling_immortals.tool.string.1", "You will no longer be subject to any form of property bonus or reduction");
        add("item.falling_immortals.tool.string.2", "damage fixed at 15");
        add("item.falling_immortals.tool.string.3", "Attack speed fixed at 4");
        add("item.falling_immortals.tool.string.4", "Max health is fixed at 30");
        add("item.falling_immortals.tool.string.5", "Damage taken is fixed at 2");
        add("item.falling_immortals.tool.string.6", "Armor is fixed at 10");
        add("item.falling_immortals.tool.string.7", "你每秒最多受到一次伤害");
        add("moonstone.jei.item.moonstone.falling_immortals", "在佩戴倾斜异果的情况下主手手持末影之眼杀死凋零获取（实际上它会直接替换倾斜异果为坠仙）");
        add("moonstone.jei.item.moonstone.hypocritical_self_esteem", "In the presence of withered state, deliver the final blow to the Ender Dragon with an empty hand; only one player can obtain it");
        add("item.moonstone.disintegrating_stone", " Split Stone");
        add("item.disintegrating_stone.tool.string", "This item's stats increase as you install more mods");
        add("item.disintegrating_stone.tool.string.1", "Cosmetic items from any mod will be neutralized");
        add("item.disintegrating_stone.tool.string.2", "The upper limit is 1800%");
        add("item.blood_god.tool.string.1", "Increases maximum health by 25%");
        add("item.blood_god.tool.string.2", "Increases health regeneration by 40%");
        add("item.blood_god.tool.string.3", "Increases the speed of drinking potions by 25%");
        add("item.blood_god.tool.string.4", "You take up to 5 damage");
        add("item.blood_god.tool.string.5", "Damage over 5 will be converted to an equal amount of bleeding");
        add("item.blood_god.tool.string.6", "Drinking healing potions reduces bleeding damage to 50% of its original value");
        add("item.blood_god.tool.string.7", "Drinking potion reduces bleed damage to 95% of its original size");
        add("item.blood_god.tool.string.8", "30 second cooldown");
        add("moonstone.jei.item.moonstone.blood_god", "Requires 500 kills, 5000 healing, 10000 damage dealt");
        add("item.defend_against_runestone.tool.string.1", "Chance to gain Resistance II when hit");
        add("item.defend_against_runestone.tool.string.2", "There is a chance to inflict weakness II on the target when attacking");
        add("item.revive_runestone.tool.string.1", "Injury has a chance to absorb damage");
        add("item.revive_runestone.tool.string.2", "Attack has a chance to drain life");
        add("item.strengthen_runestone.tool.string.1", "Attack has a chance to gain Strength II");
        add("item.strengthen_runestone.tool.string.2", "Injury has a chance to bounce back");
        add("moonstone.jei.item.moonstone.defend_against_runestone", "Found in dungeons and mines, 10% chance, one player can only get one");
        add("moonstone.jei.item.moonstone.revive_runestone", "Found in dungeons and mines, 10% chance, one player can only get one");
        add("moonstone.jei.item.moonstone.strengthen_runestone", "Found in dungeons and mines, 10% chance, only one player can get one");
        add("effect.moonstone.invulnerable", "invulnerable");
        add("effect.moonstone.life", "life");
        add("effect.moonstone.life_apple", "锁血");
        add("item.lead.tool.string.1", "Gradually increases resistance when taking damage in a row");
        add("item.lead.tool.string.2", "3% per boost, but not more than 30%");
        add("item.lead.tool.string.3", "If no damage is taken for 10 seconds");
        add("item.lead.tool.string.4", "Then restores the body shield at a speed of 20 points per second");
        add("item.lead.tool.string.5", "Restores up to 50% of maximum health");
        add("item.lead.tool.string.6", "Injury prioritizes loss of energy over health");
        add("item.lead.tool.string.7", "Damage to attackers when the shield is shattered");
        add("moonstone.jei.item.moonstone.lead", "Die 200 times");
        add("item.bone_or_god.tool.string.2", "Pet attacks add 10% of the owner's panel damage");
        add("item.bone_or_god.tool.string.3", "Pet damage increased by 200%");
        add("item.bone_or_god.tool.string.4", "Pet resistance increased by 50%");
        add("item.bone_or_god.tool.string.5", "If the pet attached object does not attack the target, it will slowly restore health");
        add("moonstone.jei.item.moonstone.nightmare_base_start_power", "Kill the Guardian");
        add("moonstone.jei.item.moonstone.nightmare_base_start_egg", "Kill the Sniffer");
        add("moonstone.jei.item.moonstone.nightmare_base_start_pod", "Open dungeon chests, 25% chance, can only get one");
        add("item.the_divine_fall_ring.tool.string.1", "Take it and you will be immune to darkness");
        add("item.the_divine_fall_ring.tool.string.2", "Take it and you will be immune to blindness");
        add("item.the_divine_fall_ring.tool.string.3", "Increase experience drops by 100%");
        add("item.the_divine_fall_ring.tool.string.4", "Increases damage by ten Life Armor");
        add("item.the_divine_fall_ring.tool.string.5", "Grant 10 seconds of invincibility on revive");
        add("item.the_divine_fall_ring.tool.string.6", "increase healing by 50%");
        add("item.the_divine_fall_ring.tool.string.7", "The lower the health, the higher the stats in all aspects");
        add("item.hidden_blade.tool.string.1", "Strike back when hit");
        add("item.hidden_blade.tool.string.2", "Critical Hit for 3 seconds after attack");
        add("item.hidden_blade.tool.string.3", "Attack Speed Increases Gradually While Dealing Non-Critical Damage");
        add("item.hidden_blade.tool.string.4", "Damage gradually increases as critical damage is dealt");
        add("item.obsidianring.tool", "Immune to knockback");
        add("moonstone.jei.god_dna", "Synthesize by using two identical 'God-like gene sequences' DNA items");
        add("item.moonstone.seven_star", "七星炼体诀");
        add("item.moonstone.seven_star.string.1", "一星——神陨：\n   免疫负面状态，但是杀死凋零后此星消亡");
        add("item.moonstone.seven_star.string.2", "二星——苍戮：\n   增加30%伤害和护甲，但是杀死高于400点生命值的生物后此星消亡");
        add("item.moonstone.seven_star.string.3", "三星——天屠：\n   受到致命伤害时恢复50%生命值，但是死亡真正死亡10次后此星消亡");
        add("item.moonstone.seven_star.string.4", "四星——刑阎：\n   减少90%村民交易的价格，但是交易超过100次后此星消亡");
        add("item.moonstone.seven_star.string.5", "五星——血煞：\n   增加25%所有速度和100%跳跃高度，但是使用鞘翅或类似物品后此星消亡");
        add("item.moonstone.seven_star.string.6", "六星——天神：\n   宠物没有攻击目标时无敌且恢复生命，但是损失30只宠物后此星消亡");
        add("item.moonstone.seven_star.string.7", "七星——诛圣：\n   获得6级的时运和抢夺等级，但是累计消亡5星后，此星消亡");
        add("item.moonstone.seven_star.string.8", "此法诀会在七星全灭时消失");
        add("effect.moonstone.meet", "增生");
        add("effect.moonstone.debilitating", "衰弱");
        add("item.moonstone.soul_apple", "灵魂之果");
        add("item.soul_apple.tool.string.1", "食用后永久+1通用饰品栏");
        add("moonstone.life.error", "你无法在拥有锁血的情况下使用 洞悉者的邪术法球 ");
        add("item.moonstone.meet_heart", "增生之心");
        add("item.meet_heart.tool.string", "拾取飞行中的血球获得额外生命值");
        add("item.meet_heart.tool.string.1", "若未能获得血液，则获得持续饥饿");
        add("item.cell.tool.string.2", "Press the bound key to summon multiple zombies at once. Press it again to recall them.");
        add("item.cell.tool.string.3", "However, this will trigger a 30-second cooldown during which you cannot summon zombies.");
        add("item.giant.tool.string.2", "Press the bound key to summon multiple zombies at once. Press it again to recall them.");
        add("item.giant.tool.string.3", "However, this will trigger a 30-second cooldown during which you cannot summon zombies.");
        add("item.consciousness.tool.string.1", "This item allows you to trigger the Blood Spirit Proliferator's attacks by manually attacking.");
        add("item.consciousness.tool.string.2", "Each trigger generates 7 additional Blood Orbs, but the Blood Spirit Proliferator will no longer attack automatically.");
        add("key.moonstone.zombie", "Summon Zombies / Recall");
        add("item.moonstone.big_heart", "Giant Heart");
        add("item.big_heart.tool.string", "Increases the positive and negative modifiers of maximum health by 50%.");
        add("item.dead_drder.tool.string.1", "Grants a large amount of Nightmare Shield.");
        add("item.dead_drder.tool.string.2", "Nightmare Shield can absorb all incoming damage.");
        add("attribute.name.moonstone.nightmare_stronger", "Nightmare Shield Strength");
        add("attribute.name.moonstone.nightmare_shield", "Nightmare Shield Capacity");
        add("item.moonstone.rotten_gourd.string.1", "Your decaying body is ignored by the cycle of reincarnation.");
        add("item.moonstone.rotten_gourd.string.2", "This allows you to erase the negative curse of the \"Upside-Down One\".");
        add("item.moonstone.rotten_gourd.string.3", "Your rotten body halves your swimming speed.");
        add("item.moonstone.supreme_power.string.1", "Your mutated brain keeps your consciousness exceptionally clear.");
        add("item.moonstone.supreme_power.string.2", "This halves the armor curse of the \"Beginning of Nightmare\".");
        add("item.moonstone.supreme_power.string.3", "Excessive wakefulness prevents you from sleeping.");
        add("item.moonstone.nightmare_clay.string.1", "Your limbs are covered in high-density Nightmare Clay.");
        add("item.moonstone.nightmare_clay.string.2", "You are almost completely immune to the injury curse of the \"Death Omen Obelisk\".");
        add("item.moonstone.nightmare_clay.string.3", "However, this clay is highly flammable, causing you to take double damage from fire-based sources.");
        add("item.moonstone.flag_of_protest.string.1", "Dying multiple times within a short period makes you increasingly stronger, stacking up to 10 times.");
        add("item.moonstone.flag_of_protest.string.2", "Right-click this item in the inventory to activate it.");
        add("item.moonstone.flag_of_protest.string.3", "Once activated, you can teleport back to your last death location after respawning.");
        add("item.moonstone.flag_of_protest.string.4", "Current Status: Activated");
        add("moonstone.use.dna.attribute", "This item can support the insertion of the following components.");
        add("moonstone.reanimation.modify", "Allows you to revive in place after taking fatal damage.");
        add("moonstone.polyphagia.modify", "Eating food restores 6 health.");
        add("moonstone.masticatory.modify", "Increases eating speed by 25%.");
        add("moonstone.calcareous.modify", "Zombies/Pets gain 8 armor.");
        add("moonstone.frontal_lobe.modify", "Zombies/Pets gain 30% movement speed.");
        add("moonstone.high_energy.modify", "Zombies/Pets gain 10 health and naturally regenerate health.");
        add("moonstone.surge.modify", "Increases damage dealt by Zombies/Pets by 20%.");
        add("item.moonstone.peptide_surge.string.1", "Attacks consume additional hunger.");
        add("item.moonstone.peptide_surge.string.2", "Increases damage dealt by %s%%.");
        add("item.moonstone.acidic_reflux.string.1", "Attacks corrode the target's armor.");
        add("item.moonstone.acidic_reflux.string.2", "If the target has little or no armor, deals an additional %s%% damage.");
        add("item.moonstone.hypertrophy.string.1", "Attacks no longer cause knockback.");
        add("item.moonstone.hypertrophy.string.2", "Attacks have a %s%% chance to deal double damage.");
        add("item.moonstone.naja_mortis.string.1", "Damage gradually increases when attacking the same target, up to %s%%.");
        add("item.moonstone.naja_mortis.string.2", "This effect fades over time.");
        add("moonstone.cytopathic_boost.modify", "Zombies gain 40% of their summoner's damage, speed, and armor.");
        add("moonstone.spliced_activation.modify", "Zombies gain 50% max health and regenerate health quickly.");
        add("moonstone.thermo_necro.modify", "Reduces zombie decay speed by 60%.");
        add("moonstone.warm_approachable.modify", "Increases movement speed.");
        add("moonstone.ocean_affinity.modify", "Increases swimming speed.");
        add("moonstone.earth_affinity.modify", "Increases knockback resistance.");
        add("attribute.name.moonstone.owner_blood_attack_speed", "Blood Spirit Attack Interval");
        add("attribute.name.moonstone.owner_blood_attack_damage", "Blood Spirit Attack Damage");
        add("attribute.name.moonstone.owner_blood_blood_speed", "Blood Spirit Orb Speed");
        add("moonstone.owner_blood_eye.modify", "Increases Blood Spirit orb speed.");
        add("moonstone.owner_blood_attack_eye.modify", "Increases Blood Spirit orb speed.");
        add("moonstone.owner_blood_speed_eye.modify", "Shortens the Blood Spirit's attack interval.");
        add("moonstone.owner_blood_boom_eye.modify", "Increases your critical damage.");
        add("moonstone.owner_blood_effect_eye.modify", "Increases your speed.");
        add("moonstone.owner_blood_vex.modify", "Increases your healing.");
        add("moonstone.owner_blood_earth.modify", "Increases your knockback resistance.");
        add("moonstone.book.not", "Right-click to close the details");
        add("moonstone.book.mouse", "Click for details");
        add("moonstone.book.test.main", "Into the Dream");
        add("moonstone.book.test.1", "Author: YTGLD");
        add("moonstone.book.test.2", "Contributor: 秋季");
        add("moonstone.book.chaos", "Nightmare");
        add("item.moonstone.love_charm", "朋友的礼物!");
        add("attribute.name.moonstone.speed", "Universal Speed");
        add("effect.moonstone.blade", "edge");
        add("effect.moonstone.hidden", "hidden");
        add("moonstone.book.ectoplasmball.1", "Found in dungeon loot chests and similar places");
        add("moonstone.book.ectoplasmball.2", "A key material in this mod");
        add("moonstone.book.ectoplasmcloub.1", "A material for crafting higher-tier items");
        add("moonstone.book.ectoplasmcloub.2", "Crafted from Ectoplasm Balls");
        add("moonstone.book.ectoplasmcube.1", "One of the materials for top-tier items");
        add("moonstone.book.ectoplasmcube.2", "Crafted from Ectoplasm Balls/Clouds and diamonds");
        add("moonstone.book.ectoplasmprism.1", "One of the materials for ultimate items");
        add("moonstone.book.ectoplasmprism.2", "Crafted from Ectoplasm Cubes and diamonds");
        add("moonstone.book.beacon.1", "An accessory that passes on your potion effects");
        add("moonstone.book.beacon.2", "Can be very useful in the right situation");
        add("moonstone.book.ectoplasmapple.1", "Damages nearby creatures when you are hurt");
        add("moonstone.book.ectoplasmapple.2", "but the damage is capped");
        add("moonstone.book.ectoplasmbattery.1", "Grants a lot of health");
        add("moonstone.book.ectoplasmbattery.2", "The Battery's twin");
        add("moonstone.book.ectoplasmhorseshoe.1", "Grants bonus health");
        add("moonstone.book.ectoplasmhorseshoe.2", "and reduces fall damage");
        add("moonstone.book.ectoplasmshild.1", "After taking a certain number of hits,");
        add("moonstone.book.ectoplasmshild.2", "you are immune to the next attack");
        add("moonstone.book.ectoplasmstar.1", "Grants Luck");
        add("moonstone.book.ectoplasmstar.2", "Luck boosts damage and attack speed");
        add("moonstone.book.ectoplasmtree.1", "Immune to fire damage (effect)");
        add("moonstone.book.ectoplasmtree.2", "The go-to choice for exploring the Nether early on");
        add("moonstone.book.redamout.1", "Dealing damage has a chance to grant Strength");
        add("moonstone.book.redamout.2", "Can be crafted or found in loot chests");
        add("moonstone.book.greedamout.1", "Dealing damage may restore health");
        add("moonstone.book.greedamout.2", "Taking damage may grant Absorption");
        add("moonstone.book.blueamout.1", "Dealing damage may weaken the target");
        add("moonstone.book.blueamout.2", "Taking damage may grant Resistance");
        add("moonstone.book.greedcrystal.1", "Grants a little Fortune");
        add("moonstone.book.greedcrystal.2", "Craftable");
        add("moonstone.book.biggreedcrystal.1", "Grants Fortune");
        add("moonstone.book.biggreedcrystal.2", "Crafted from Greed Crystals");
        add("moonstone.book.fortunecrystal.1", "Grants a lot of Fortune");
        add("moonstone.book.fortunecrystal.2", "Crafted from Big Greed Crystals");
        add("moonstone.book.warcrystal.1", "Grants a little damage");
        add("moonstone.book.warcrystal.2", "Craftable");
        add("moonstone.book.bigwarcrystal.1", "Grants melee damage");
        add("moonstone.book.bigwarcrystal.2", "Crafted from War Crystals");
        add("moonstone.book.mayhemcrystal.1", "Grants a lot of damage");
        add("moonstone.book.mayhemcrystal.2", "Crafted from Big War Crystals");
        add("moonstone.book.rage_crystal.1", "Grants a little damage and health");
        add("moonstone.book.rage_crystal.2", "Craftable");
        add("moonstone.book.rage_crystal_big.1", "Grants melee damage and health");
        add("moonstone.book.rage_crystal_big.2", "Crafted from Wrath Crystals");
        add("moonstone.book.rage_crystal_max.1", "Grants a lot of damage and health");
        add("moonstone.book.rage_crystal_max.2", "Crafted from Big Wrath Crystals");
        add("moonstone.book.maxamout.1", "A fusion of the three Runestones");
        add("moonstone.book.maxamout.2", "Combines every ability of the three-color Runestones");
        add("moonstone.book.loot.blood", "Found in Ancient Cities; requires wearing the Sealing Candelabra");
        add("moonstone.book.owner_blood_eye.1", "-20% Blood Spirit Proliferator attack interval");
        add("moonstone.book.owner_blood_attack_eye.1", "+10% Blood Spirit Proliferator attack interval");
        add("moonstone.book.owner_blood_attack_eye.2", "+20% Blood Spirit damage");
        add("moonstone.book.owner_blood_speed_eye.1", "-50% Blood Spirit Proliferator attack interval");
        add("moonstone.book.owner_blood_speed_eye.2", "+300% Blood Orb speed");
        add("moonstone.book.owner_blood_speed_eye.3", "but its Blood Orbs no longer home in on creatures");
        add("moonstone.book.owner_blood_boom_eye.1", "Blood Orbs explode on hit");
        add("moonstone.book.owner_blood_boom_eye.2", "-20% Blood Orb speed");
        add("moonstone.book.owner_blood_boom_eye.3", "+200% Blood Spirit Proliferator attack interval");
        add("moonstone.book.owner_blood_effect_eye.1", "Blood Orbs apply many negative effects on hit");
        add("moonstone.book.owner_blood_earth.1", "The Blood Spirit Proliferator no longer attacks");
        add("moonstone.book.owner_blood_earth.2", "It attracts creatures and drops (becomes a magnet)");
        add("moonstone.book.owner_blood_vex.1", "Blood Orbs heal their owner on hit");
        add("moonstone.book.owner_blood_vex.2", "The amount depends on the Blood Spirit Proliferator's damage");
        add("moonstone.book.owner_blood_vex.3", "-3 Blood Spirit Proliferator damage");
        add("moonstone.book.the_blood_book.1", "Combines every ability of the blood books");
        add("moonstone.book.blood_candle.1", "Wear it and press the bound key to summon the Blood Spirit Proliferator");
        add("moonstone.book.blood_candle.2", "The Blood Spirit Proliferator automatically attacks nearby creatures");
        add("moonstone.book.blood_candle.3", "Some items can strengthen its attacks or abilities");
        add("moonstone.book.necora.1", "Wear it to start finding gene items");
        add("moonstone.book.cytopathic_boost.1", "Zombies gain 40% of their summoner's damage, speed, and armor");
        add("moonstone.book.spliced_activation.1", "Zombies gain 50% max health and regenerate health quickly");
        add("moonstone.book.thermo_necro.1", "Reduces zombie decay speed by 60%");
        add("moonstone.book.warm_approachable.1", "Increases movement speed");
        add("moonstone.book.ocean_affinity.1", "Increases swimming speed");
        add("moonstone.book.earth_affinity.1", "Increases knockback resistance");
        add("moonstone.book.calcareous.1", "Zombies/Pets gain 8 armor");
        add("moonstone.book.frontal_lobe.1", "Zombies/Pets gain 30% movement speed");
        add("moonstone.book.high_energy.1", "Zombies/Pets gain 10 health and naturally regenerate health");
        add("moonstone.book.surge.1", "Increases damage dealt by Zombies/Pets by 20%");
        add("moonstone.book.loot.has.2", "Requires wearing a Necora item to obtain");
        add("moonstone.book.loot.has.3", "Found in most loot chests");
        add("moonstone.book.nda.main", "Right-click to implant into a compatible item");
        add("moonstone.book.loot.necora", "Found in most chests (requires wearing Necora virus)");
        add("moonstone.book.loot.has.1", "Requires wearing certain items to obtain");
        add("moonstone.book.ectoplasm.main", "Restores a little hunger when eaten");
        add("moonstone.book.loot.not", "Currently not dropped by mobs");
        add("moonstone.book.loot.craft", "Crafting only");
        add("moonstone.book.loot.not.1", "Unobtainable");
        add("moonstone.book.loot.dungeon", "Found in loot chests in dungeons, mineshafts, and similar places");
        add("moonstone.book.loot.clear", "Right-click to close");
        add("moonstone.book.nightmare_base.main", "Nightmare Base");
        add("moonstone.book.nightmare_base.1", "The origin of malice, the other side of light\n\nWear it to take on sins: Peeking Eye, Death Omen, Reversal, Redemption,\nFool, Insight, Beginning\nOnce the Base bonds with you, it cannot be removed");
    }
}
