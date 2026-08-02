package net.mcreator.wayoftheninjaforge.client.model.animations;

import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;

// Save this class in your mod and generate all required imports
/**
 * Made with Blockbench 4.12.6 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class kleiders_logAnimation {
	public static final AnimationDefinition log_test = AnimationDefinition.Builder.withLength(0.5F)
			.addAnimation("log",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(27.9871F, 31.8543F, -10.8219F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("log", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 14.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)))
			.build();
}
