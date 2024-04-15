import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        String table="//table[@id='customers']//tbody//tr//td[1]";
        List<WebElement> company= driver.findElements(By.xpath(table));

        for(int i=0;i<company.size();i++){
            System.out.println(company.get(i).getText());
        }
    }
}
