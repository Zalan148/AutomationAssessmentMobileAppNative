package org.waterstones;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;
import java.net.URL;


public class Hooks {

    public static AndroidDriver androidDriver;
    @Before
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("AnyDeviceName");
        options.setApp(System.getProperty("user.dir")+"/apps/Waterstones_4.7.0 (#36466)_Apkpure.apk");
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    }

    @After
    public void teardown() {
        String currentPackage = androidDriver.getCurrentPackage();
        androidDriver.removeApp(currentPackage);
        androidDriver.quit();
    }
}
