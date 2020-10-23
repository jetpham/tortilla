package com.github.jetpham;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

//https://discord.gg/eKmFVw7

public class Main {
    public static void main(String[] args) {
        DiscordApi api = new DiscordApiBuilder()


                .addServerBecomesAvailableListener(event -> {
                    System.out.println("Loaded " + event.getServer().getName());
                })
                // A listener in their own class
                .addListener(new MyListener())
                // Alternative syntax that can be used for classes that require a DiscordApi parameter in their constructor
                .setToken("NzYxNzIzNzAxNTY1NDU2NDQ0.X3eweg.viX6x6B9hteARPc7Omh8IVpKR2I")
                .setWaitForServersOnStartup(false)
                .login()
                .join();

    }
}


