public class SurvivalEssentials implements ModInitializer {

    public static final String MOD_ID = "novesues";

    @Override
    public void onInitialize() {
        //Initializers
        WeaponsAndTools.initialize();
        Mobs.initialize();
        Blocks.initialize();
        FoodAndCooking.initialize();
        MiscItems.initialize();
        ItemGroups.initialize();
        FeaturesInitializer.initialize();
        ModFluidsInitializer.initialize();
        //Tells you if this shit actually worked
        System.out.println("The main mod initialization sections initialized fine™️.");
    }
}
