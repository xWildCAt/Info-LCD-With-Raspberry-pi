import I2C_LCD_driver
import sys
import datetime
from time import *

mylcd=I2C_LCD_driver.lcd()

currentDT = datetime.datetime.now()

#print (currentDT.strftime("%H:%M"))

mylcd.lcd_display_string(currentDT.strftime("%H:%M"), 1)
mylcd.lcd_display_string(sys.argv[1], 2)