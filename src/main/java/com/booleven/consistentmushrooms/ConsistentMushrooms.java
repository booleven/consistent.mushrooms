package com.booleven.consistentmushrooms;

import com.booleven.consistentmushrooms.core.registry.CMBlockEntities;
import com.booleven.consistentmushrooms.core.registry.CMBlockProperties;
import com.booleven.consistentmushrooms.core.registry.CMBlocks;
import com.booleven.consistentmushrooms.core.registry.CMItems;
import com.booleven.consistentmushrooms.core.util.CMWoodType;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ConsistentMushrooms.MOD_ID)
public class ConsistentMushrooms {
    public static final String MOD_ID = "consistent_mushrooms";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ConsistentMushrooms() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CMItems.register(modEventBus);
        CMBlocks.register(modEventBus);
        CMBlockEntities.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLCommonSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(CMBlocks.BROWN_MUSHROOM_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CMBlocks.BROWN_MUSHROOM_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CMBlocks.RED_MUSHROOM_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CMBlocks.RED_MUSHROOM_TRAPDOOR.get(), RenderType.cutout());

        WoodType.register(CMWoodType.BROWN_MUSHROOM);
        WoodType.register(CMWoodType.RED_MUSHROOM);
        BlockEntityRenderers.register(CMBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        CMBlockProperties.registerFlammables();
        event.enqueueWork(() -> {
            Sheets.addWoodType(CMWoodType.BROWN_MUSHROOM);
            Sheets.addWoodType(CMWoodType.RED_MUSHROOM);
        });
    }

    public static ResourceLocation createLocation(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static ResourceLocation createLocation(ResourceKey<?> path) {
        return path.location();
    }

    public static ResourceLocation createLocation(Holder<?> holder) {
        return createLocation(holder.unwrapKey().orElseThrow());
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }

}
