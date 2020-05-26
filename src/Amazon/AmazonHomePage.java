

package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.SortedMap;
import java.util.concurrent.TimeUnit;

public class AmazonHomePage {

//chrome browser

    //public static WebDriver driver = new ChromeDriver();
    public static String chromeDriver = "webdriver.chrome.driver";
    public static String chromeDriverPath = "webBrowsers/Mac/chromedriver";
    public static String url = "https://www.amazon.com/";


    public static void setUp(String browserDriver, String driverPath, String url) throws InterruptedException {
        System.setProperty(browserDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

//driver.get(url);
        driver.navigate().to(url);
        String title=driver.getTitle();
        System.out.println(title);

//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("hand sanitizer");


//test case1:user should navigate to amazon home page and look for watches and he/she has to have option

        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("smart watch");
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        String title1 =driver.getTitle();
        System.out.println(title1);
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[2]/div[4]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(5000);

        String title2 =driver.getTitle();
        System.out.println(title2);
//driver.quit();
        driver.close();*/

//test case2 :user should have to look for phones and to look for any mobile he/she wants
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("phones");
        driver.findElement(By.cssSelector("#p_89-title > span")).click();
        driver.findElement(By.cssSelector("#p_89\\/Apple > span > a > span")).click();
        driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-20-of-24.sg-col-28-of-32.sg-col-16-of-20.sg-col.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(5) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(1) > div > span > div > div > div:nth-child(2) > div.sg-col-4-of-12.sg-col-8-of-16.sg-col-16-of-24.sg-col-12-of-20.sg-col-24-of-32.sg-col.sg-col-28-of-36.sg-col-20-of-28 > div > div:nth-child(1) > div > div > div:nth-child(1) > h2 > a > span"));

        String title3 =driver.getTitle();
        System.out.println(title3);

//test case3:use should have to look for headphones and check thr price price and add it to cart
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("headphones");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        driver.findElement(By.cssSelector("#price_inside_buybox")).click();
        driver.findElement(By.cssSelector("#add-to-cart-button"));

        String title4 =driver.getTitle();
        System.out.println(title4);

 //test case4:use should have to look for amazon prime movies&tv and check the price and add it to cart
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("movie&tv");
        driver.findElement(By.cssSelector("#i\\/dvd > span > a > span")).click();
        driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-20-of-24.sg-col-28-of-32.sg-col-16-of-20.sg-col.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(5) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(10) > div > span > div > div > div > div > div:nth-child(2) > div.sg-col-4-of-12.sg-col-8-of-16.sg-col-16-of-24.sg-col-12-of-20.sg-col-24-of-32.sg-col.sg-col-28-of-36.sg-col-20-of-28 > div > div:nth-child(1) > div > div > div:nth-child(1) > h2 > a > span")).click();
        driver.findElement(By.cssSelector("#declarative_ > table > tbody > tr > td.a-color-tertiary.a-text-right.dp-used-col"));

        String title5 =driver.getTitle();
        System.out.println(title5);


//test case5:use should have to look  and check the price and add it to cart
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("prime video");
        driver.findElement(By.cssSelector("#p_85\\/2470955011 > span > a > i")).click();
        driver.findElement(By.cssSelector("#p_76\\/2661625011 > span > a > span"));
        String title6 =driver.getTitle();
        System.out.println(title6);

 //test case6:use should have to look for best sellers list new york times 2020
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("best sellers list new york times 2020");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        driver.findElement(By.cssSelector("#B07SFGLDJH-best-seller-label > span > span")).click();
        String title7 =driver.getTitle();
        System.out.println(title7);

//test case7:use should have to select his/her address to be a costumer
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("select your address");
        driver.findElement(By.cssSelector("#glow-ingress-line2")).click();
        driver.findElement(By.cssSelector("#a-popover-content-3")).click();
        String title8 =driver.getTitle();
        System.out.println(title8);

//test case8:use should have to select his/her gift section and get options
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("find a GIFT");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)")).click();
        driver.findElement(By.cssSelector("#notification-provider > div > div > div:nth-child(1) > div > a:nth-child(2) > div > div.sc-gqjmRU.farDCw > img")).click();
        String title9 =driver.getTitle();
        System.out.println(title9);

//test case9:use should have to select and see todays deal and pick his/her choice of  selection and get options
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("today's deals ");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)")).click();
        driver.findElement(By.cssSelector("#widgetFilters > div > div.a-section.tiles > div:nth-child(9) > span > a > div > div.a-section.a-spacing-mini.imageContainer.aok-relative > img")).click();
        String title10=driver.getTitle();
        System.out.println(title10);

//test case10:use should have acces to whole food section
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("whole food ");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
        driver.findElement(By.cssSelector("#contentGrid_6441 > div > div > div:nth-child(1) > div > div > a > img")).click();
        String title11 =driver.getTitle();
        System.out.println(title11);

//test case11:use should have to select his/her register plan and to put address to be a costumer
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("register with amazon");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(9)")).click();
        driver.findElement(By.cssSelector("#contentGrid_886650 > div")).click();
        String title12 =driver.getTitle();
        System.out.println(title12);

//test case12:use should have to select his/her option on amazon basics
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("amazon basics");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(10)")).click();
        driver.findElement(By.cssSelector("#Header-SZQNaPS > div > div.style__navArea__jlY6Q > div.style__rightColumn__32Y8Y > div.style__navigation__FMWJE.style__navigation__fzWOQ.style__hasLogo__3Lfx0 > nav.style__navBar__2NVns > ul > li:nth-child(9) > a > span")).click();
        String title13 =driver.getTitle();
        System.out.println(title13);

//test case13:use should have to have option if he/she wants to sell something
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("sell");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(11)")).click();
        driver.findElement(By.cssSelector("#rp_cta_h_c > div > div > a")).click();
        String title14 =driver.getTitle();
        System.out.println(title14);

 //test case14:use should have option to look for a coupons section
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("coupons");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(12)")).click();
        driver.findElement(By.cssSelector("#coupon_box_A1AI4KTEPHI77K > div > div > div.a-section.coupon-image")).click();
        String title15 =driver.getTitle();
        System.out.println(title15);

//test case15:use should have option to checkout what in his card shop
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("cart");
        driver.findElement(By.cssSelector("#nav-cart")).click();
        driver.findElement(By.cssSelector("#a-autoid-0-announce > span")).click();
        String title16 =driver.getTitle();
        System.out.println(title16);


    }


    public static void main(String[] args) throws InterruptedException {

        setUp(chromeDriver, chromeDriverPath, url);


    }}

/*//firefox browser
String firefoxwebdriver ="webdriver.gecko.driver";
String firefoxwebdriverpath = "BrowserDriver/MacDriver/geckodriver";


System.setProperty(firefoxwebdriver,firefoxwebdriverpath)*/