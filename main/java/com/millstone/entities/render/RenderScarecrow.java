package com.millstone.entities.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.millstone.lib.References;

public class RenderScarecrow extends RenderLiving
{
    private static final ResourceLocation Your_Texture = new ResourceLocation(References.MODID + ":" + "textures/models/scarecrowtesting.png");  //refers to:assets/yourmod/textures/entity/yourtexture.png

    public RenderScarecrow(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return Your_Texture;
    }
}