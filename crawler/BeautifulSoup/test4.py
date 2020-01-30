import urllib.request
from bs4 import BeautifulSoup

#baseUrl =>  'https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query='
baseUrl = 'https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query='
plusUrl = input('검색어를 입력하세요:')
url = baseUrl + plusUrl
html = urllib.request.urlopen(url).read()
soup = BeautifulSoup(html,'html.parser')

title=soup.find_all(class_='sh_blog_title')


for i in title:
    print(i.attrs['title'])
    print(i.attrs['href'])
    print()

