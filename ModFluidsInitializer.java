public class ModFluidsInitializer {

    public static FlowableFluid STILL_ROTTING;
    public static FlowableFluid FLOWING_ROTTING;

    public static Item ROTTING_BUCKET;

    public static Block ROTTING;

    public static void initialize() {
        STILL_ROTTING = Registry.register(Registry.FLUID, new Identifier(MOD_ID, "rotting"), new RottingFluid.Still());

        FLOWING_ROTTING = Registry.register(Registry.FLUID, new Identifier(MOD_ID, "flowing_rot"), new RottingFluid.Flowing());

        ROTTING_BUCKET = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rotting_bucket"), new BucketItem(STILL_ROTTING,
                new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1).group(MISC_GROUP)));
        ROTTING = Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rotting"), new FluidBlock(STILL_ROTTING,
                FabricBlockSettings.copy(net.minecraft.block.Blocks.WATER)){});
    }
}
