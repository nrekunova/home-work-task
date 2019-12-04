package com.hillel.lecture_13;

import com.hillel.lecture_11.Contact;
import com.hillel.lecture_11.Skype;
import com.hillel.lecture_11.Smile;
import com.hillel.lecture_11.Vyber;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorTest {


    @Test
    public void testError() {
        Skype skype = new Skype();
        try {
            skype.sendTextAndSmile("throw error", Smile.FACE_PALM);
            Assert.fail("no error");
        } catch (ErrorAsError error){
            Assert.assertEquals(error.getMessage(), "it is Skype error");
        }

    }
    @Test
    public void testUserIsOflineException() {
        Vyber vyber = new Vyber();
        try {
            vyber.call(Contact.VASYA);
            Assert.fail("no exception");
        } catch (UserOfflineException exce){
            Assert.assertEquals(exce.getMessage(), "Could not call, @VASYA is offline");
        }

    }
}
