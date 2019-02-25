package com.xy.baidusousuo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Baidusousuo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:\\firefoxDriver\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        // 与浏览器同步非常重要，必须等待浏览器加载完毕
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //打开目标地址
        webDriver.get("https://www.baidu.com");
        Thread.sleep(1000);
        webDriver.findElement(By.id("kw")).sendKeys("Selenium");

        webDriver.findElement(By.id("su")).click();

        //暂停5秒钟后关闭
        Thread.sleep(5000);
        webDriver.quit();
    }
}


