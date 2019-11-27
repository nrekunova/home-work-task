package com.hillel.lecture_11;

public class Skype implements IVideoCallMessenger, ITextAndSmileMessenger{

    @Override
    public String sendTextAndSmile(String textAndSmile) {
        return "You've got Skype message with Smile '" + textAndSmile + "'";
    }

    @Override
    public String sendMessage(String text) {
        return "You've got Skype message '" + text + "'";
    }

    @Override
    public String videoCall(String contact) {
        return "You've got Skype video call @" + contact ;
    }

    @Override
    public String call(String contact) {
        return "You've got Skype call @" + contact;
    }
}
