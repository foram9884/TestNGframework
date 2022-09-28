import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FirstTestNGTestcase {
    WebDriver driver;

    @Test(pr)
    void openBrowser(){
        System.out.println("open Browser");
    }
    void logIn(){
        System.out.println("user login");
    }
    void closeBrowser(){
        System.out.println("close Browser");
    }
}
