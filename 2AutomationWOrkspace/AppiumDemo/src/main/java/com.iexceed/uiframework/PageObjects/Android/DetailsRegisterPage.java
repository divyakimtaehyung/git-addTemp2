package com.iexceed.uiframework.PageObjects.Android;

import com.iexceed.uiframework.utilites.WaitUtility;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static com.iexceed.uiframework.PageObjects.Android.AndroidCabilities.driver;

public class DetailsRegisterPage  {

    //Registeration page

    @AndroidFindBy(id="com.iexceed.retailonboarding:id/edittext")
    WebElement Email_Id;
    @AndroidFindBy(xpath="//*[@text='Mobile Number *']")
    WebElement Mob_Num;


    //date picker
    @AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.iexceed.retailonboarding:id/dob_edittext']")
    WebElement DateField;
    @AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.iexceed.retailonboarding:id/month_navigation_fragment_toggle']")
    WebElement monthToggleBar;
    @AndroidFindBy(className="android.widget.TextView")
    List<AndroidElement> dateFrameList;
    @AndroidFindBy(className="android.widget.TextView")
    List<AndroidElement> yearFrameList;
    @AndroidFindBy(xpath="//android.widget.Button[@content-desc='Change to previous month']")
    WebElement forwardMonthYear;

    @AndroidFindBy(xpath="//*[@text='CANCEL']")
    WebElement CancelBtn;
    @AndroidFindBy(xpath="//*[@text='OK']")
    WebElement OkBtn;


    //Policy checkbox
    @AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='com.iexceed.retailonboarding:id/createaccount_checkbox']")
    WebElement policyCheckBox;
    @AndroidFindBy(xpath="//*[@text='Submit']")
    WebElement submitBtn;



    private WaitUtility waitUtility;
    public DetailsRegisterPage() {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        waitUtility= new WaitUtility();
    }






    public void hideKeybooard(){

        driver.hideKeyboard();
    }
    public void FillEmailDetails(String email) throws Exception {
        waitUtility.waitForSeconds(10);
        Email_Id.click();
        Email_Id.sendKeys(email);
        hideKeybooard();

    }

    public void FillMobNum(String mobNo) throws Exception {
           waitUtility.waitForSeconds(2);
           Mob_Num.click();
           hideKeybooard();
           waitUtility.waitForSeconds(2);
           Mob_Num.sendKeys(mobNo);


    }


    public void DatePick(String year) throws Exception {
        DateField.click();
        waitUtility.waitForSeconds(2);
        CancelBtn.click();
        DateField.sendKeys(year);

//        YearToggleBar.click();
//        List<MobileElement> tempList=YearFrameList;
//        for (MobileElement TempYear : YearFrameList) {
//            if (TempYear.getText().equals(year)) {
//                TempYear.click();
//                break;
//            }
//        }
//        YearClkOkBtn.click();
//        int yearConvert=Integer.parseInt(year);
//        int Agevalidation=2021-yearConvert;
//        if(Agevalidation>18){
//            System.out.println("user is above 18");
//        }
//        else if(Agevalidation>=18){
//            System.out.println("user is  18  year old");
//
//        }
//        else{
//            System.out.println("user is below  18  year old");
//        }

    }


    public void datePicker(String DOB) throws Exception {


        waitUtility.waitForSeconds(2);
        String tempDate=DOB;
        String dateArr[]=tempDate.split("/");
        String date=dateArr[0];
        String month=dateArr[1];
        String year=dateArr[2];
        int userPassed_year=Integer.parseInt(year);
        int Currentyear= Calendar.getInstance().get(Calendar.YEAR);
        int year_Validation=(Currentyear-userPassed_year);

        if(year_Validation>=18) {
            DateField.click();
            if (monthToggleBar.getText().contains(month)) {
                waitUtility.waitForSeconds(2);
                monthToggleBar.click();
                System.out.println(yearFrameList.size());
                System.out.println(yearFrameList.get(0).getText());
                selectionOfDropdown(year, yearFrameList);
                waitUtility.waitForSeconds(2);
                selectionOfDropdown(date, dateFrameList);
                OkBtn.click();
            } else {
                try {
                    for (int i = 0; i <= 12; i++) {
                        forwardMonthYear.click();
                        System.out.println(monthToggleBar.getText());
                        if (monthToggleBar.getText().contains(month)) {
                            waitUtility.waitForSeconds(2);
                            monthToggleBar.click();
                            selectionOfDropdown(year, yearFrameList);
                            waitUtility.waitForSeconds(2);
                            selectionOfDropdown(date, dateFrameList);
                            OkBtn.click();
                            break;
                        }

                    }
                } catch (Exception e) {

                }
            }
        }
        else{

             System.out.println("Age should be greater then 18");
            Assert.assertEquals(year_Validation,18);

        }


    }

    public void selectionOfDropdown (String itemType, List <AndroidElement> type){
        for (AndroidElement name : type) {
            if (name.getText().equals(itemType)) {
                name.click();
                break;
            }
        }
    }



    public void ClickPolicAcceptCheckBox(){
     policyCheckBox.click();

    }

    public void clickSubmitBtn(){
        submitBtn.click();
    }

}
