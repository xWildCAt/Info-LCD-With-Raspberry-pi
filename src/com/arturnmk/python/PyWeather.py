import requests
import json
import datetime
import subprocess
import config as cfg

currentDT = datetime.datetime.now()

import config as cfg

restString='https://api.darksky.net/forecast/'+ cfg.data['apikey'] + '/' + cfg.data['latitude']+','+cfg.data['longitude'] + '?exclude=minutely,hourly,daily,alerts,flags&units=si'

response = requests.get(
    restString)
data = response.json()
print(data["currently"]["summary"], " ", data["currently"]["temperature"])


#https://www.cyberciti.biz/faq/python-run-external-command-and-get-output/
#subprocess.call("./my-pi-temp-simple.sh")