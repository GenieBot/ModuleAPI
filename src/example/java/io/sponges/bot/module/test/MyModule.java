package io.sponges.bot.module.test;

import io.sponges.bot.api.cmd.Command;
import io.sponges.bot.api.cmd.CommandRequest;
import io.sponges.bot.api.event.events.ChatMessageEvent;
import io.sponges.bot.api.module.Module;

public class MyModule extends Module {

    public MyModule() {
        super("TestModule", "1.0-SNAPSHOT");
    }

    @Override
    public void onEnable() {
        getLogger().log("Starting...");

        getEventManager().register(ChatMessageEvent.class, event -> {
            getLogger().log("OMG A MESSAGE: " + event.getContent());
        });

        getCommandManager().registerCommand(new Command("gives danke memes", "memes", "m", "danks") {
            @Override
            public void onCommand(CommandRequest request, String[] args) {
                request.reply("Here, 1x free danke meme");
            }
        });
    }

    @Override
    public void onDisable() {
        getLogger().log("Stopping...");
    }

}
