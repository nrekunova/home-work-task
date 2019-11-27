package com.hillel.lecture_11;

public class Telegram implements IVideoCallMessenger{

    @Override
    public String videoCall(String contact) {
        return "You've got Telegram video call @" + contact ;
    }

    @Override
    public String call(String contact) {
        return "You've got Telegram call @" + contact;
    }
}
