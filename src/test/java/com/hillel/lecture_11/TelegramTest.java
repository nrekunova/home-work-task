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
        Assert.assertEquals(telegram.call("Moscow calling"), "You've got Telegram call @Moscow calling");
    }

    @Test
    public void videoCallTest() {
        Assert.assertEquals(telegram.videoCall("Moscow calling"), "You've got Telegram video call @Moscow calling");

    }
}
