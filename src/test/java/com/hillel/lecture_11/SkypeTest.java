package com.hillel.lecture_11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SkypeTest {
    private Skype skype = new Skype();
    @Test
    public void instanceOffTest(){
        Assert.assertTrue(skype instanceof ITextAndSmileMessenger, "Skype should be instanceof ITextAndSmileMessenger");
        Assert.assertTrue(skype instanceof ITextMessenger, "Skype should be instanceof ITextMessenger");
        Assert.assertTrue(skype instanceof ICallMessenger, "Skype should be instanceof ICallMessenger");
        Assert.assertTrue(skype instanceof IVideoCallMessenger, "Skype should be instanceof IVideoCallMessenger");


    }
    @Test
    public void sendTextTest(){
        Assert.assertEquals(skype.sendMessage("Test message"), "You've got Skype message 'Test message'");
    }
    @Test
    public  void sendTextAndSmileTest(){
        Assert.assertEquals(skype.sendTextAndSmile("Test", Smile.FACE_PALM), "You've got Skype message 'Test' with Smile 8<");
    }
    @Test
    public  void callTest(){
        Assert.assertEquals(skype.call(Contact.ADMIN), "You've got Skype call @ADMIN");
    }
    @Test
    public  void videoCallTest(){
        Assert.assertEquals(skype.videoCall(Contact.PETYA), "You've got Skype video call @PETYA");
    }
}
