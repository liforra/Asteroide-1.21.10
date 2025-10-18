package spigey.asteroide.modules;

import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.movement.HighJump;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.StairsBlock;
import spigey.asteroide.AsteroideAddon;
import net.minecraft.registry.Registries;

public class FastStaircaseModule extends Module {
    public FastStaircaseModule() {super(AsteroideAddon.CATEGORY, "Fast-Staircase", "Makes you walk up stairs quickly");}
    // For some time I actually thought this doesn't work, until I played on a server with AC, and I was so fast that I flagged the anticheat
    @EventHandler
    private void onTick(TickEvent.Post event){
        // TODO: Disabled - Input.movementForward field doesn't exist in 1.21.10
        // Need to find correct field name for forward movement input
    }
}
