package com.hillel.lecture_11;

public class Vyber implements ITextMessenger, ICallMessenger {
    @Override
    public String sendMessage(String text) {
        return "You've got Vyber message '" + text + "'";
    }

    @Override
    public String call(String contact) {
        return "You've got Vyber call @" + contact;
    }
}
