package com.iexceed.uiframework.steps.IOS;

import com.iexceed.uiframework.PageObjects.IOS.IOSCabilities;

import java.net.MalformedURLException;

public class IOSCapabilityActions {


    IOSCabilities iosCabilities=new IOSCabilities();

    public void launchIOsApp() throws MalformedURLException {
        iosCabilities.IOSAppCapability();

    }
}
