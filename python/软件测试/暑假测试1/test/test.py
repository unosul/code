from selenium import webdriver
from selenium.webdriver.common.by import By
import time
# 启动Chrome
driver = webdriver.Chrome()
# 打开网页
driver.get("https://www.baidu.com")
driver.maximize_window()

time.sleep(5)
driver.find_element(By.ID, value='kw').send_keys('百度百科')
driver.find_element(By.ID, value='su').submit()
time.sleep(5)
driver.find_element(By.XPATH, value='//*[@id="2"]/div/div/h3/a').click()


