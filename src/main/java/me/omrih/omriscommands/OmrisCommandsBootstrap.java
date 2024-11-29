package me.omrih.omriscommands;

import io.papermc.paper.command.brigadier.Commands;
import io.papermc.paper.plugin.bootstrap.BootstrapContext;
import io.papermc.paper.plugin.bootstrap.PluginBootstrap;
import io.papermc.paper.plugin.lifecycle.event.LifecycleEventManager;
import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents;
import me.omrih.omriscommands.commands.FlyCommand;
import me.omrih.omriscommands.commands.HugCommand;
import me.omrih.omriscommands.commands.VelocityCommand;

public class OmrisCommandsBootstrap implements PluginBootstrap {
    @Override
    public void bootstrap(BootstrapContext context) {
        LifecycleEventManager<BootstrapContext> manager = context.getLifecycleManager();
        manager.registerEventHandler(LifecycleEvents.COMMANDS, event -> {
            final Commands commands = event.registrar();
            commands.register("velocity", "Modify the player's velocity", new VelocityCommand());
            commands.register("fly","Toggle flying", new FlyCommand());
            commands.register("hug","Send a hug to a player", new HugCommand());
        });
    }
}
