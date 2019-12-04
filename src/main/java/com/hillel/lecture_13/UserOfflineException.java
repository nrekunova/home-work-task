package com.hillel.lecture_13;

import com.hillel.lecture_11.Contact;

public class UserOfflineException extends RuntimeException {
    public UserOfflineException (Contact contact) {
        super("Could not call, @" + contact + " is offline");
    }
}

