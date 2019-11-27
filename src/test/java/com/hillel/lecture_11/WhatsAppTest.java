package com.hillel.lecture_11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WhatsAppTest {
    private WhatsApp whatsApp = new WhatsApp();

    @Test
    public void instanceOffTest(){

        Assert.assertTrue(whatsApp instanceof ITextAndSmileMessenger, "whatsApp should be instanceof ITextAndSmileMessenger");
        Assert.assertTrue(whatsApp instanceof ITextMessenger, "whatsApp should be instanceof ITextMessenger");
    }
    @Test
    public void sendTextTest(){
        Assert.assertEquals(whatsApp.sendMessage("Test message"), "You've got WhatsApp message 'Test message'");
    }
    @Test
    public  void sendTextAndSmileTest(){
        Assert.assertEquals(whatsApp.sendTextAndSmile("Test :)"), "You've got WhatsApp message with Smile 'Test :)'");
    }
}
