import requests
import json
import datetime
import subprocess

currentDT = datetime.datetime.now()

response = requests.get(
    'https://api.darksky.net/forecast/5eb223d2eb8b6e2357ea1cc151a84ba8/54.6872,25.2797?exclude=minutely,hourly,daily,alerts,flags&units=si')
data = response.json()
print(data["currently"]["summary"], " ", data["currently"]["temperature"])


#https://www.cyberciti.biz/faq/python-run-external-command-and-get-output/
#subprocess.call("./my-pi-temp-simple.sh")