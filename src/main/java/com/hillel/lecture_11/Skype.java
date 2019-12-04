package com.hillel.lecture_11;

import com.hillel.lecture_13.ErrorAsError;

public class Skype implements IVideoCallMessenger, ITextAndSmileMessenger{

    @Override
    public String sendTextAndSmile(String text, Smile smile) {

        if(text.contains("throw error")){
//            throw new ErrorAsError("it is Skype error");
            ErrorAsError err = new ErrorAsError("it is Skype error");
            throw err;
        }
        return "You've got Skype message '" + text + "' with Smile " + smile;
    }

    @Override
    public String sendMessage(String text) {
        return "You've got Skype message '" + text + "'";
    }

    @Override
    public String videoCall(Contact contact) {
        return "You've got Skype video call @" + contact ;
    }

    @Override
    public String call(Contact contact) {
        return "You've got Skype call @" + contact;
    }
}
