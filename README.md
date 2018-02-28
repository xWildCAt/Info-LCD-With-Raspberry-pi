# Overview

This projects aim is to make a program which will show info on L2C 1602 screen using Raspberry Pi.
There will be three "screens" changing one another with different info.
* 1st screen: Time and date
* 2nd screen: Weather ouside
* 3rd screen: Raspberry Pi CPU and GPU temps

# How does it work
* Small java program which is running in the background and launching python scripts when timers are set and managing data.
* Python scripts are used to: 
1) Get weather info from API. In this case it's https://darksky.net/
2) Display info on the LCD 


# Credits
Using L2C_LCD_driver for python. Found at:

http://www.circuitbasics.com/raspberry-pi-i2c-lcd-set-up-and-programming/

More info inside driver.
