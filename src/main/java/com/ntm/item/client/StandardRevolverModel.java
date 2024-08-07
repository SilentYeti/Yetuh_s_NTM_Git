package com.ntm.item.client;

import com.ntm.core.NTM;
import com.ntm.item.custom.StandardRevolver;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class StandardRevolverModel extends GeoModel<StandardRevolver> {
    @Override
    public ResourceLocation getModelResource(StandardRevolver standardRevolver) {
        return ResourceLocation.fromNamespaceAndPath(NTM.MOD_ID, "geo/standard_revolver.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(StandardRevolver standardRevolver) {
        return ResourceLocation.fromNamespaceAndPath(NTM.MOD_ID, "textures/weapons/s_revolver.png");
    }

    @Override
    public ResourceLocation getAnimationResource(StandardRevolver standardRevolver) {
        return ResourceLocation.fromNamespaceAndPath(NTM.MOD_ID, "animations/weapons/model.animation.s_revolver.json");
    }
}

