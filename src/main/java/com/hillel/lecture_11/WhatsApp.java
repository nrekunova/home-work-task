package com.hillel.lecture_11;

public class WhatsApp implements ITextAndSmileMessenger {
    public String sendTextAndSmile (String textAndSmile){
        return "You've got WhatsApp message with Smile '" + textAndSmile + "'";
    }

    @Override
    public String sendMessage(String text) {
        return "You've got WhatsApp message '" + text + "'";
    }
}
