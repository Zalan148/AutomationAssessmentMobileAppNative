Android mobile device used and application tested is Waterstones application
1) Install node.js and npm if not already installed
2) Install Appium CLI server with node.js by doing following:
   npm install -g appium
3) Install driver for Android:
   appium driver install uiautomator2
4) Install wait plugin:
   appium plugin install --source=npm appium-wait-plugin
5) Install dashboard:
   appium plugin install --source=npm appium-dashboard
6) Download and install Appium Inspector
7) Download and install Android Studio for emulator
8) In Android Studio navigate to File -> Settings -> Language and Frameworks -> Android SDK -> check the required installations are there
9) Appium Client - used Intellij IDE, Java and Page Object Model 
10) Start appium server and activate wait plugin
   appium server --use-plugins=element-wait
11) Launch Appium Inspector and construct the JSON
    {
  "appium:deviceName": "AnyDeviceName",
  "appium:automationName": "UiAutomator2",
  "appium:app": "/Users/ZalanWadood/IdeaProjects/AutomationAssessmentMobileAppNative/apps/Waterstones_4.7.0 (#36466)_Apkpure.apk",
  "platformName": "Android"
}
12) Launch Android Studio and add virtual device. Turn the emulator on e.g. Pixel 7 Pro device.
13) Might need to include a configuration settings file in the folder .android
14) Path to android SDK location will need to be added to environment variables
15) Start session in Appium Inspector
16) Highlight TestRunner class -> right click 'Run TestRunner'

If only need to run tests do following:
1) Launch Intellij
2) cmd prompt -> appium --address 127.0.0.1 --port 4723 --base-path /wd/hub --use-plugins=element-wait
3) Launch appium inspector but don't start session yet
4) Launch Android Studio  and start virtual device
5) In appium inspector make sure 127.0.0.1, 4723 and /wd/hub are included
6) Start session in appium inspector
7) Don't need to uninstall the app if already present in device and don't need to close everything down in device
8) In intellij right click TestRunner class -> Run 'TestRunner'. All scenarios tagged will run.
9) For reporting of results go to target folder -> HTMLReports -> right click report.html -> open in explorer -> double click file
