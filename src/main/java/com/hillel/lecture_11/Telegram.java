package com.hillel.lecture_11;

public class Telegram implements IVideoCallMessenger{

    @Override
    public String videoCall(Contact contact) {
        return "You've got Telegram video call @" + contact ;
    }

    @Override
    public String call(Contact contact) {
        return "You've got Telegram call @" + contact;
    }
}
