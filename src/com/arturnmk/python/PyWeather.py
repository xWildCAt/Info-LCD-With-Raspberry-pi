import requests
import json
import datetime
import subprocess

currentDT = datetime.datetime.now()



response = requests.get(
    'https://api.darksky.net/forecast/YOUR-API-KEY/CITY_LATITUDE-COMA-CITY_LONGITUDE/?exclude=minutely,hourly,daily,alerts,flags&units=si')

data = response.json()
print(data["currently"]["summary"], " ", data["currently"]["temperature"])


#https://www.cyberciti.biz/faq/python-run-external-command-and-get-output/
#subprocess.call("./my-pi-temp-simple.sh")
