
import scrapy

class NewsbotSpider(scrapy.Spider):
	name = 'newsbot'

	def start_requests(self):
		yield scrapy.Request('http://news.naver.com/main/list.nhn?mode=LSD&mid=sec&sid1=001', callback=self.parse)
		
	def parse(self, response):
		print(response.xpath('//*[@id="main_content"]/div[2]/ul[1]/li/dl/dt/a/text()').extract())
		print(response.css('.writing::text').extract())
        