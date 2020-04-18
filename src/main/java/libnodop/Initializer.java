package libnodop;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Initializer implements ModInitializer {
	@Override
	public void onInitialize() {
		System.out.println("Loading libNodop!");
		System.out.println("Done with libNodop!");
	}

	public void registerItem(String namespace, String path, Item itemToRegister) {
		Registry.register(Registry.ITEM, new Identifier(namespace, path), itemToRegister);
	}

	public void registerBlock(String namespace, String path, Block blockToRegister) {
		Registry.register(Registry.BLOCK, new Identifier(namespace, path), blockToRegister);
	}

	public void registerCrop(String namespace, String path, Block cropToRegister) {
		registerBlock(namespace, path, cropToRegister);
		BlockRenderLayerMap.INSTANCE.putBlock(cropToRegister, RenderLayer.getTranslucent());
	}
}
