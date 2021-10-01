package com.iexceed.uiframework.PageObjects.Gmail;

import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.By;
import static com.iexceed.uiframework.PageObjects.Gmail.GmailAppCabilities.driver;

public class gmailLoginpage {

    By gotIt           =By.xpath("//*[@text='GOT IT']");
    By tameMeGmailTxt  =By.xpath("//*[@text='TAKE ME TO GMAIL']");


    private WaitUtility waitUtility;
    public gmailLoginpage(){
        waitUtility= new WaitUtility();
    }

    public void clickGotIt() throws Exception {

        try {
            driver.findElement(gotIt).click();
            waitUtility.waitForSeconds(2);
            driver.findElement(tameMeGmailTxt).click();
                   }catch(Exception e){}
    }






}
