import urllib.request
from bs4 import BeautifulSoup

url = 'https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=hip&oquery=hi&tqi=Um1fbwprvmsssiDilxKssssss6N-028756' 
html = urllib.request.urlopen(url).read()
soup = BeautifulSoup(html,'html.parser')

title=soup.find_all(class_='sh_blog_title')


for i in title:
    print(i.attrs['title'])
    print(i.attrs['href'])
    print()
    
    
