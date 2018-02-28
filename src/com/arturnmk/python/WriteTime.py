import datetime
import I2C_LCD_driver
from time import *


currentDT = datetime.datetime.now()

print (currentDT.strftime("%H:%M"))