package com.iexceed.uiframework.PageObjects.Gmail;

import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.iexceed.uiframework.PageObjects.Gmail.GmailAppCabilities.driver;

public class GmailDashboardPage {

    By gotIt           =By.xpath("//*[@text='Got it']");
    By composeBtn      =By.xpath("//*[@text='Compose']");
    By toMailField     =By.xpath("//android.widget.EditText");
    By subjectField    =By.xpath("//*[@text='Subject']");
    By compoMsg_field1 =By.id("com.google.android.gm:id/body_wrapper");
    By compoMsg_field  =By.xpath("//*[@text='Compose email']");
    By sendIcon        =By.xpath("//android.widget.TextView[@content-desc='Send']");
    By peopleMailList  =By.xpath("//android.widget.RelativeLayout[@resource-id='com.google.android.gm:id/peoplekit_listview_flattened_row']");
    By navigationMenuBtn=By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']");
    By outBoxMsg          =By.xpath("//*[@text='Outbox']");
    By conversationItem=By.xpath("//android.view.ViewGroup[@resource-id='com.google.android.gm:id/viewified_conversation_item_view']");
    By inboxMsgContent =By.xpath("//android.view.View");
    By inboxContent2   =By.xpath("//android.view.View[@resource-id='conversation-footer']");


    private WaitUtility waitUtility;
    public GmailDashboardPage(){
        waitUtility= new WaitUtility();
    }

    public void clickGotIt_Dashboard() throws Exception {

    try {
    waitUtility.waitForSeconds(2);
    driver.findElement(gotIt).click();
        }catch(Exception e){

     }


   }


     public void clickComposeBtn() throws Exception {
         waitUtility.waitForSeconds(4);
         driver.findElement(composeBtn).click();
              }

     public void msgComposing(String tomailId,String subject,String composeMsg) throws Exception {
        waitUtility.waitForSeconds(3);
        driver.findElement(gotIt).click();
        waitUtility.waitForSeconds(2);
        driver.findElement(toMailField).click();
        driver.findElement(toMailField).sendKeys(tomailId);
        driver.findElement(peopleMailList).click();
        driver.findElement(subjectField).click();
        driver.findElement(subjectField).sendKeys(subject);
        waitUtility.waitForSeconds(2);
        driver.findElement(compoMsg_field).sendKeys(composeMsg);
        driver.findElement(sendIcon).click();

              }


        public void clickNavigationMenu(String subject,String msgcontent) throws Exception {
        waitUtility.waitForSeconds(5);
        driver.findElement(navigationMenuBtn).click();
        waitUtility.waitForSeconds(2);
        driver.findElement(outBoxMsg).click();
        waitUtility.waitForSeconds(2);
         System.out.println(driver.findElements(conversationItem).size());
         System.out.println(driver.findElements(conversationItem).get(0).getText());
         List<WebElement> tempConversationList= (List<WebElement>) driver.findElements(conversationItem);
         selectionOfDropdown(subject,tempConversationList);
         System.out.println(driver.findElements(inboxMsgContent).size());
            List<WebElement> text = (List<WebElement>) driver.findElements(inboxMsgContent);
            for (int i = 0; i < text.size(); i++) {
               String temp = text.get(i).getText();
                System.out.println(temp);
            }

            closeDriver();


        }



        public void closeDriver(){
        driver.quit();

        }

     public void selectionOfDropdown (String itemType, List<WebElement> type){
        for (WebElement name : type) {
            if ((name.getText()).contains(itemType)) {
                name.click();
                break;
            }
        }
    }
}
