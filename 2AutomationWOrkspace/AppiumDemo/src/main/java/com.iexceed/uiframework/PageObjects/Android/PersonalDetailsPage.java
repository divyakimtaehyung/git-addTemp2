package com.iexceed.uiframework.PageObjects.Android;

import com.iexceed.uiframework.implementations.CommonElements;
import com.iexceed.uiframework.implementations.TextBoxControls;
import com.iexceed.uiframework.utilites.WaitUtility;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.net.MalformedURLException;
import java.util.List;
import static com.iexceed.uiframework.PageObjects.Android.AndroidCabilities.driver;

public class PersonalDetailsPage {

    @AndroidFindBy(xpath="//*[@text='First Name *']")
    AndroidElement first_Name;
    @AndroidFindBy(xpath="//*[@text='Last Name *']")
    AndroidElement last_Name;
    @AndroidFindBy(xpath="//*[contains(@text,\"Father's Name\")]")
    AndroidElement father_Name;
    @AndroidFindBy(xpath ="//*[contains(@text,\"Mother's Name\")]")
    AndroidElement mother_Name;
    @AndroidFindBy(xpath="//*[@text='Female']")
    AndroidElement femaleGenderBtn;


 //scrolling untill fathers name visible

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Gender *\").instance(0))")
    public AndroidElement scroll_Gender_Name;

    //select birthplace
    @AndroidFindBy(xpath="//*[@text='Birth Country *']")
    AndroidElement birthCountry;
    @AndroidFindBy(xpath="//*[@text='Search']")
    AndroidElement searchBox;
    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.iexceed.retailonboarding:id/list_textview']")
    List<AndroidElement> searchList;
    @AndroidFindBy(xpath="//*[@text='Birth City *']")
    AndroidElement birthCity;
    @AndroidFindBy(xpath="//*[@text='Citizenship Country *']")
    AndroidElement citizenCountryDD;

    @AndroidFindBy(xpath ="//*[@text='Continue']")
    AndroidElement ContinueBtn;


    private CommonElements commonElements;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;




    public PersonalDetailsPage() throws MalformedURLException {


        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        commonElements = new CommonElements();
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();

    }

    public void hideKeybooard(){

        driver.hideKeyboard();
    }

    public void fillPersonalDetails(String firstname,String lastname) throws Exception {
         waitUtility.waitForSeconds(7);
        first_Name.click();
        first_Name.clear();
        first_Name.sendKeys(firstname);
        last_Name.click();
        last_Name.clear();
        last_Name.sendKeys(lastname);
        hideKeybooard();
    }




    public void enterParenName(String fathername,String mothername) throws Exception {

        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Gender *\").instance(0))"));
        waitUtility.waitForSeconds(4);
        femaleGenderBtn.click();
        father_Name.click();
        father_Name.sendKeys(fathername);
        mother_Name.click();
        mother_Name.sendKeys(mothername);


    }

    public void selectBirthPlace(String BirthCountry,String BirthCity) throws Exception {
        hideKeybooard();
        waitUtility.waitForSeconds(3);
        birthCountry.click();
        waitUtility.waitForSeconds(3);
        searchBox.click();
        searchBox.sendKeys(BirthCountry);
        System.out.println(searchList.size());
        selectionOfDropdown(BirthCountry,searchList);

        try{
            hideKeybooard();
        }catch(Exception e){

        }

        birthCity.click();
        birthCity.sendKeys(BirthCity);
        waitUtility.waitForSeconds(2);
        hideKeybooard();

    }

    public void selectCitizenCountry(String citizecCountry) throws Exception {
        citizenCountryDD.click();
        waitUtility.waitForSeconds(2);
        searchBox.click();
        searchBox.sendKeys(citizecCountry);
        System.out.println(searchList.size());
        selectionOfDropdown(citizecCountry,searchList);
        hideKeybooard();
        continueApp();
    }

    public void selectionOfDropdown (String itemType, List <AndroidElement> type){
        for (AndroidElement name : type) {
            if (name.getText().equals(itemType)) {
                name.click();
                break;
            }
        }
    }

    public void continueApp() throws Exception {
        waitUtility.waitForSeconds(2);
        ContinueBtn.click();
    }

}
