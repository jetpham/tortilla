package com.github.jetpham;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class MyListener implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        System.out.println(event.getMessageAuthor().asUser() + ":      " + event.getMessageContent());
        if (event.getMessageContent().equalsIgnoreCase("hey there")) {
            String Message = new Pickupline().getPickupLine();
            event.getChannel().sendMessage(Message);
        }
        if (event.getMessageContent().equalsIgnoreCase("hello there")) {
            event.getChannel().sendMessage("General " + event.getMessageAuthor().asUser());
        }
        if (event.getMessageContent().equalsIgnoreCase("yes") || event.getMessageContent().equalsIgnoreCase("no")) {
            event.getChannel().sendMessage("liar liar pants on fire <:Ebola:761722757472845834>");
        }
    }
}
