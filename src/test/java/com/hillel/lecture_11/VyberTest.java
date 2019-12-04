package com.hillel.lecture_11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VyberTest {
    private Vyber vyber = new Vyber();

    @Test
    public void instanceOffTest(){

        Assert.assertTrue(vyber instanceof ICallMessenger, "Viber should be instanceof ICallMessenger");
        Assert.assertTrue(vyber instanceof ITextMessenger, "Viber should be instanceof ITextMessenger");
    }
    @Test
    public void sendTextTest(){
        Assert.assertEquals(vyber.sendMessage("Test message"), "You've got Vyber message 'Test message'");
    }
    @Test
    public  void callTest(){
        Assert.assertEquals(vyber.call(Contact.PETYA), "You've got Vyber call @PETYA");
    }
}
