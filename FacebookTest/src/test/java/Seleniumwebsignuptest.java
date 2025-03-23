import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Seleniumwebsignuptest {

    private WebDriver driver;

    @Test
    public void start() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://selenium-blog.herokuapp.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("user_username")).sendKeys("Alexander");
        Thread.sleep(5000);
        driver.findElement(By.id("user_email")).sendKeys("ashearer7657@cosoinan.com");
        Thread.sleep(5000);
        driver.findElement(By.id("user_password")).sendKeys("Alexander");
        Thread.sleep(5000);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();

    }

    @AfterTest
    public void closebrowser() {
        driver.quit();

    }

}