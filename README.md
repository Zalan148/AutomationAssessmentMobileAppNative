Android mobile device tested and application tested is Waterstones application
1) Install node.js and npm if not already installed
2) Install appium CLI server with node.js by doing following:
   npm install -g appium
3) Install driver for android:
   appium driver install uiautomator2
4) Install wait plugin:
   appium plugin install --source=npm appium-wait-plugin
5) Install dashboard:
   appium plugin install --source=npm appium-dashboard
6) Install appium inspector
7) Install android studio to use emulator
8) In android studio navigate to File -> Settings -> Language and Frameworks -> Android SDK -> check installations
9) Appium Client - used Intellij IDE, Java and Page Object Model 
10) Start appium server and activate wait plugin
   appium server --use-plugins=element-wait
