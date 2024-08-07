package net.t3ddyofficial.ic2.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.t3ddyofficial.ic2.Main;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MODID);

    public static final RegistryObject<CreativeModeTab> IC_TAB = CREATIVE_TABS.register("ic_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NONEXISTENT.get())).title(Component.translatable("creativetab.ic_tab")).displayItems((pParameters, pOutput) -> {
        pOutput.accept(ModItems.ADVANCED_CIRCUIT.get());
    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
