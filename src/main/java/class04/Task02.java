package class04;
/*
goto facebook.com
 click on create account
and select the your  date of birth using select class
 */

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task02 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://facebook.com";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();
        Thread.sleep(2000);

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select sel=new Select(month);
        sel.selectByValue("9");
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select sel1=new Select(day);
        sel1.selectByVisibleText("17");
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select sel2=new Select(year);
        sel2.selectByValue("1993");


    }
}
