package com.hillel.lecture_11;

public class WhatsApp implements ITextAndSmileMessenger {
    public String sendTextAndSmile (String text, Smile smile){
        return "You've got WhatsApp message '" + text + "' with Smile " + smile;
    }

    @Override
    public String sendMessage(String text) {
        return "You've got WhatsApp message '" + text + "'";
    }
}
