package me.Anar_9686.examplemod.Util;

import me.Anar_9686.examplemod.ExampleMod;
import me.Anar_9686.examplemod.Items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static void init(){

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    //Items  Only
    public static RegistryObject<Item> RUBY = ITEMS.register("Ruby", ItemBase::new);
}
