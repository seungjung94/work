
import scrapy

class Newsbot2Spider(scrapy.Spider):
	name = 'newsbot2'

	def start_requests(self):
		yield scrapy.Request('http://news.naver.com/main/list.nhn?mode=LSD&mid=sec&sid1=001', callback=self.parse)
		
	def parse(self, response):
		titles=response.xpath('//*[@id="main_content"]/div[2]/ul[1]/li/dl/dt/a/text()').extract()
		authors=response.css('.writing::text').extract()
        
		for item in zip(titles,authors):
			scraped_info={
				'title' : item[0].strip(),
				'author' : item[1].strip()
			}
			print(scraped_info)