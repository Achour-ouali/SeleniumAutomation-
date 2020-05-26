/*package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases {


    public static  String url=("https://www.amazon.com/");
    public static String chromedriverpath=("webBrowsers/Mac/chromedriver");
    public static String chromedriver=("webdriver.chrome.driver");

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
AmazonHomePage amazonHomePage=new AmazonHomePage();
        //test case 1:
         driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("hand sanitizer");
       // driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        Thread.sleep(10000);
        //print the title of your search
        String title=driver.getTitle();
        System.out.println(title);
        //close the running window only
        driver.close();
        //quit all the open windows
        driver.quit();






















































    }
}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AmazonHomePage {
    //chrome driver

    public static  String url=("https://www.amazon.com/");
    public static String chromedriverpath=("webBrowsers/Mac/chromedriver");
    public static String chromedriver=("webdriver.chrome.driver");
    public static String searchField = "//*[@id=\"twotabsearchtextbox\"]";
    //public static String searchProduct = "Hand Sanitizer";

    public static void setUp(String browserdriver,String driverpath,String url) throws InterruptedException {

        System.setProperty( browserdriver,driverpath);
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get(url);
        driver.navigate().to(url);
        driver.manage().window().maximize();
       // for (WebElement webElement : driver.findElements(By.id("#s-separator"))) {
           // driver.findElements(By.id("//*[@id=\"s-separator\"]"));
       // }




        //driver.findElement(By.cssSelector("#twotabsearchtextbox"));

        // driver.findElement(By.xpath(searchField)).sendKeys(searchProduct);
        //driver.findElement(By.xpath("//*[@id=\"0d03a24d-4a43-4ff7-83a2-4d4a436ff7fa\"]/div/div[1]/div[2]/a[1]/span/span")).click();
        // driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        // driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
        // Click searchButton
        // driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[2]/div[2]/div/span/div/div/div[2]/h2/a")).click();
        //driver.findElement(By.id("hlb-ptc-btn-native")).click();
        //  driver.findElement(By.id("kjdkfjsd")).click();
        // driver.findElement(By.name("kjdkfjsd")).click();
        // driver.findElement(By.tagName("kjdkfjsd")).click();
        //  driver.findElement(By.className("#\\35 84a0682-3d75-407e-8a06-823d75707e27 > div > div.sb_2fJUey94 > div")).click();
        // driver.findElement(By.linkText("kjdkfjsd")).click();
        // driver.findElement(By.partialLinkText("kjdkfjsd")).click();
        // driver.findElement(By.cssSelector("body")).click();
        // driver.findElement(By.xpath("/html/body")).click();



//test case 1:
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("hand sanitizer");
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        Thread.sleep(10000);
        //print the title of your search
        String title=driver.getTitle();
        System.out.println(title);
        //close the running window only
        driver.close();
        //quit all the open windows
        // driver.quit();

        //test case 2:user should search in the box hand sanitizer and he will get option to add to cart
       /* driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("hand sanitizer");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
       driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-20-of-24.sg-col-28-of-32.sg-col-16-of-20.sg-col.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(5) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(5) > div > span > div > div > div:nth-child(3) > h2 > a")).click();
        //driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
        Thread.sleep(10000);
        //print the title of your search
        String title1=driver.getTitle();
        System.out.println(title1);
        //close the running window only
        driver.close();
        //quit all the open windows
        driver.quit();*/



   // }








   /* public static void main(String[] args) throws InterruptedException {


        setUp(chromedriver,chromedriverpath,url);


    }}*/