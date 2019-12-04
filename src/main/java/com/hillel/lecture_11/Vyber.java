package com.hillel.lecture_11;

import com.hillel.lecture_13.UserOfflineException;

public class Vyber implements ITextMessenger, ICallMessenger {
    @Override
    public String sendMessage(String text) {
        return "You've got Vyber message '" + text + "'";
    }

    @Override
    public String call(Contact contact) {
        if(contact.isOffline()){
            throw new UserOfflineException(contact);
        }
        return "You've got Vyber call @" + contact;
    }
}
