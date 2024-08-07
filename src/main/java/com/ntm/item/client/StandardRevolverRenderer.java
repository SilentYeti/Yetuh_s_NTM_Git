package com.ntm.item.client;

import com.ntm.core.NTM;
import com.ntm.item.custom.StandardRevolver;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class StandardRevolverRenderer extends GeoItemRenderer<StandardRevolver> {
    public StandardRevolverRenderer(){
        super(new StandardRevolverModel());
    }
}