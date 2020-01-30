import requests
from bs4 import BeautifulSoup

req = requests.get('https://www.naver.com/')
source = req.text
soup = BeautifulSoup(source, 'html.parser')
top_list = soup.select("#NM_RTK_ROLLING_WRAP > ul > li > a > span.ah_k")

for top in top_list:
    print(top.text)

