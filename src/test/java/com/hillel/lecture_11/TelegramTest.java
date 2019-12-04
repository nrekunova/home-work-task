package com.hillel.lecture_11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TelegramTest {
    private Telegram telegram = new Telegram();

    @Test
    public void instanceOffTest() {

        Assert.assertTrue(telegram instanceof ICallMessenger, "Telegram should be instanceof ICallMessenger");
        Assert.assertTrue(telegram instanceof IVideoCallMessenger, "Telegram should be instanceof IVideoCallMessenger");
    }

    @Test
    public void callTest() {
        Assert.assertEquals(telegram.call(Contact.ADMIN), "You've got Telegram call @ADMIN");
    }

    @Test
    public void videoCallTest() {
        Assert.assertEquals(telegram.videoCall(Contact.PETYA), "You've got Telegram video call @PETYA");

    }
}
