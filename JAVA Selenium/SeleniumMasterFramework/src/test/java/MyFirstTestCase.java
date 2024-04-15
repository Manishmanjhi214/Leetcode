import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium.pom.base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class MyFirstTestCase extends BaseTest {
    public MyFirstTestCase(WebDriver driver) {
        super(driver);
    }

    @Test
    public void guestCheckoutUsingDirectBankTransfer() throws IOException, InterruptedException {
       driver.get("https://www.w3schools.com/html/html_tables.asp");
        String table="//table[@id='customers']//tbody//tr//td[1]";
        List<WebElement> company= driver.findElements(By.xpath(table));

        for(int i=0;i<company.size();i++){
            System.out.println(company.get(i).getText());
        }
    }

    public static void getCountryNameUsingComapnyName(String CompanyName){

    }

}
