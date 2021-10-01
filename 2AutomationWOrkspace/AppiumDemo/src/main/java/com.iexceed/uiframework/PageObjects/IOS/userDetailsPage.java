package com.iexceed.uiframework.PageObjects.IOS;

import com.iexceed.uiframework.PageObjects.Android.AndroidCabilities;
import com.iexceed.uiframework.utilites.WaitUtility;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.HideKeyboardStrategy;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import static com.iexceed.uiframework.PageObjects.IOS.IOSCabilities.driver;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class userDetailsPage {

    By first_name = By.xpath("//XCUIElementTypeTextField[@name='FirstNameTextField']");
    By last_name = By.xpath("//XCUIElementTypeTextField[@name='LastNameTextField']");
    By Email = By.xpath("//*[@name='Entered email.']");
    By father_Name = By.xpath("//XCUIElementTypeTextField[@name='FatherNameTextField']");
    By mothe_Name = By.xpath("//XCUIElementTypeTextField[@name='MotherNameTextField']");
    By gender_Btn = By.xpath("//XCUIElementTypeButton[@name='MaleButton']");
    By birthCountry_DD = By.xpath("//XCUIElementTypeStaticText[@name='Please select']");
    By searchField = By.xpath("//XCUIElementTypeSearchField");
    By countryList = By.xpath("//XCUIElementTypeCell");
    By countryList1 = By.xpath("////XCUIElementTypeStaticText");
    By birth_city = By.xpath("//XCUIElementTypeTextField[@name='BirthCityTextField']");
    By dateOfBirthField = By.xpath("//XCUIElementTypeOther[@name='DateOfBirthView']");
    By calenderBar = By.xpath("//XCUIElementTypePickerWheel");
    By calenderFrame = By.xpath("//XCUIElementTypePicker");

    private WaitUtility waitUtility;

    public userDetailsPage() {
        waitUtility = new WaitUtility();
    }

    public void fillingUserDetails(String fName, String lName, String email, String fatherName, String motherName, String bithCity,
                                   String country) throws Exception {

        waitUtility.waitForSeconds(3);
        driver.findElement(first_name).click();
        driver.findElement(first_name).sendKeys(fName);
        driver.findElement(last_name).click();
        driver.findElement(last_name).sendKeys(lName);
        driver.findElementByXPath(String.format("//XCUIElementTypeButton[@name='%s']", "Done")).click();
        driver.findElement(father_Name).click();
        driver.findElement(father_Name).sendKeys(fatherName);
        driver.findElementByXPath(String.format("//XCUIElementTypeButton[@name='%s']", "Done")).click();
        driver.findElement(mothe_Name).click();
        driver.findElement(mothe_Name).clear();
        driver.findElement(mothe_Name).sendKeys(motherName);
        driver.findElementByXPath(String.format("//XCUIElementTypeButton[@name='%s']", "Done")).click();
        driver.findElement(gender_Btn).click();

        TouchAction swipe = new TouchAction(driver)
                .press(element(driver.findElement(birth_city)))
                .waitAction(waitOptions(ofSeconds(2)))
                .moveTo(element(driver.findElement(gender_Btn)))
                .release()
                .perform();

        driver.findElement(birth_city).click();
        driver.findElement(birth_city).sendKeys(bithCity);
        driver.findElementByXPath(String.format("//XCUIElementTypeButton[@name='%s']", "Done")).click();
        System.out.println(driver.findElements(birthCountry_DD).size());
        driver.findElements(birthCountry_DD).get(0).click();
        waitUtility.waitForSeconds(3);
        driver.findElement(searchField).click();
        driver.findElement(searchField).sendKeys(country);

    }

    public void selectingCitizenShipCountry(String country) throws Exception {
        driver.findElements(birthCountry_DD).get(0).click();
        waitUtility.waitForSeconds(2);
        driver.findElement(searchField).click();
        driver.findElement(searchField).sendKeys(country);
        selectingcountry(country);
    }

    public void selectingcountry(String country) {
        List<WebElement> Country_List = (List<WebElement>) driver.findElements(countryList1);
        System.out.println(driver.findElements(countryList1).size());
        driver.findElements(countryList1).get(1).getAttribute("name");
        selectionOf_Dropdown(country, Country_List);
    }

    public void selectDOB(String DOB) throws Exception {
        waitUtility.waitForSeconds(2);
        String tempDate = DOB;
        String dateArr[] = tempDate.split("/");
        String date = dateArr[0];
        String month = dateArr[1];
        String year = dateArr[2];
        int userPassed_year = Integer.parseInt(year);
        int Currentyear = Calendar.getInstance().get(Calendar.YEAR);
        int year_Validation = (Currentyear - userPassed_year);
        driver.findElement(dateOfBirthField).click();
        driver.findElements(calenderBar).get(0).click();
        System.out.println(driver.findElements(calenderBar).get(0).getAttribute("value"));
        String temp = driver.findElements(calenderBar).get(0).getAttribute("value");
        List<WebElement> dateValue = (List<WebElement>) driver.findElements(calenderBar);
//        for (int i = 0; i < dateValue.size(); i++) {
//            System.out.println(dateValue.get(i).getText());
//        }
        try {
            dateValue.get(0).sendKeys(month);
            dateValue.get(1).sendKeys(date);
            dateValue.get(2).sendKeys(year);
            driver.findElementByXPath(String.format("//XCUIElementTypeButton[@name='%s']", "Done")).click();
            HashMap<String, Object> params = new HashMap<>();
            params.put("order", "next");
            params.put("offset", 0.15);
            params.put("element", ((RemoteWebElement) dateValue.get(0)).getId());
            driver.executeScript("mobile: selectPickerWheelValue", params);
            params.put("order", "previous");
            params.put("element", ((RemoteWebElement) dateValue.get(1)).getId());
            driver.executeScript("mobile: selectPickerWheelValue", params);
        }catch(Exception e){

        }
    }


    public void selectionOf_Dropdown(String itemType, List<WebElement> type) {
        for (WebElement countryname : type) {
            if ((countryname.getAttribute("name")).equalsIgnoreCase(itemType)) {
                countryname.click();
                System.out.println("you are my universe");
//                TouchAction touchAction = new TouchAction(driver);
//                touchAction.tap(tapOptions()
//                                .withElement(element(name)))
//                        .perform();
                break;
            }
        }
    }
}

