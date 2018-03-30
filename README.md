# Overview

**v0.1** - 2018-02-28 - Kinda running, no LCD

**v0.2** - 2018-03-17 - Shows weather and on LCD

**v0.21** - - 2018-03-30 - Usable config for API

**IMPORTANT NOTE: project is under development**

This projects aim is to make a program which will show info on L2C 1602 screen using Raspberry Pi.
There will be three "screens" changing one another with different info.
* 1st screen: Time and date
* 2nd screen: Weather outside using REST API
* 3rd screen: Raspberry Pi CPU and GPU temps

## Hardware needed
* Raspberry Pi
* 1602 LCD screen with I2C interface

# How does it work
Small java program which is running in the background and launching python scripts when timers are set and managing data. Weather information is updated every 10 minutes using DarkSky API.
* Python scripts are used to: 
1) Get weather info from API. 
2) Display info on the LCD 

# Setup and config

1) Clone the repo / download the files 
2) Run command `sudo i2cdetect -y 1` in your terminal to find the LCD address or `sudo i2cdetect -y 0` if you're running older Pi
3) Find `I2C_LCD_driver.py` file and edit 19 line with 0 if you're running older Pi. Replace line 22 with your address
4) Find `config.py` file and fill it with your info  
5) Open `src` folder and run following command in terminal to compile the project: `javac com/arturnmk/java/*.java`
6) From `src` folder in terminal type `java com.arturnmk.java.Main` to run the program 




# Credits
[Powered by Dark Sky](https://darksky.net/poweredby/)

Using L2C_LCD_driver for python. Found at:

http://www.circuitbasics.com/raspberry-pi-i2c-lcd-set-up-and-programming/

More info inside driver.
