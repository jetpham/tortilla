package com.github.jetpham;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {

    public static void main(String[] args) {
        // Insert your bot's token here
        String token = "your token";

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();

                .addServerBecomesAvailableListener(event -> {
                    System.out.println("Loaded " + event.getServer().getName());
                })
                // A listener in their own class
                .addListener(new MyListener())
                // Alternative syntax that can be used for classes that require a DiscordApi parameter in their constructor
                .setToken("Censored")
                .setWaitForServersOnStartup(false)
                .login()
                .join();

        // Print the invite url of your bot
        System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());
    }

}
