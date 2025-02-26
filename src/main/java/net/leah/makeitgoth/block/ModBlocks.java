package net.leah.makeitgoth.block;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.leah.makeitgoth.MakeItGoth;
import net.leah.makeitgoth.block.custom.FogThingy;
import net.leah.makeitgoth.block.custom.SteelBars;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //foggythingy
    public static final Block FogThingyBlock = registerBlock("fog_thingy_block",
            new FogThingy(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),Boolean.TRUE));

   //gothstone blocks

    public static final Block GOTHSTONE_BRICKS = registerBlock("gothstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).nonOpaque()));

    public static final Block SHADED_GOTHSTONE_BRICKS = registerBlock("shaded_gothstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).nonOpaque()));

    public static final Block GOTHSTONE = registerBlock("gothstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).nonOpaque()));

    // steel related blocks

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    public static final Block STEEL_GRATE = registerBlock("steel_grate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    public static final Block STEEL_BARS = registerBlock("steel_bars",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).nonOpaque()));


   // rotwood blocks
    public static final Block ROTWOOD_PLANKS = registerBlock("rotwood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block ROTWOOD_LOG = registerBlock("rotwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).nonOpaque()));

    public static final Block ROTWOOD_WOOD = registerBlock("rotwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_ROTWOOD_LOG = registerBlock("stripped_rotwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));

    public static final Block STRIPPED_ROTWOOD_WOOD = registerBlock("stripped_rotwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block ROTWOOD_STAIRS = registerBlock("rotwood_stairs",
            new StairsBlock(ModBlocks.ROTWOOD_PLANKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));

    public static final Block ROTWOOD_SLAB = registerBlock("rotwood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));

    public static final Block ROTWOOD_FENCE = registerBlock("rotwood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));

    public static final Block ROTWOOD_FENCE_GATE = registerBlock("rotwood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block ROTWOOD_PRESSURE_PLATE = registerBlock("rotwood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));

    public static final Block ROTWOOD_BUTTON = registerBlock("rotwood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));

    public static final Block GOTHSTONE_BRICK_STAIRS = registerBlock("gothstone_brick_stairs",
            new StairsBlock(ModBlocks.GOTHSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block GOTHSTONE_BRICK_SLAB = registerBlock("gothstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block GOTHSTONE_BRICK_BUTTON = registerBlock("gothstone_brick_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, true));

    public static final Block GOTHSTONE_BRICK_WALL = registerBlock("gothstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block GOTHSTONE_STAIRS = registerBlock("gothstone_stairs",
            new StairsBlock(ModBlocks.GOTHSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));

    public static final Block GOTHSTONE_SLAB = registerBlock("gothstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block GOTHSTONE_BUTTON = registerBlock("gothstone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, true));

    public static final Block GOTHSTONE_WALL = registerBlock("gothstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MakeItGoth.MOD_ID, name), block);
    }
    private static Item registerBlockItem (String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MakeItGoth.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));


    }

    public static void registerModBlock() {
        MakeItGoth.LOGGER.info("Registering ModBlocks for "+ MakeItGoth.MOD_ID);
    }
}




