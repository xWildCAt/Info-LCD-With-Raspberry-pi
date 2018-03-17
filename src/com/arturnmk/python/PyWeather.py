import requests
import json
import datetime
import subprocess

currentDT = datetime.datetime.now()

response = requests.get(
    'https://api.darksky.net/forecast/YOUR-API-TOKEN-GOES-HERE/LATITIDE.LONGITUDE?exclude=minutely,hourly,daily,alerts,flags&units=si')
data = response.json()
print(data["currently"]["temperature"], data["currently"]["summary"])


#https://www.cyberciti.biz/faq/python-run-external-command-and-get-output/
#subprocess.call("./my-pi-temp-simple.sh")