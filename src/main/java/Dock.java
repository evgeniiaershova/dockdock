import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dock {

    public static void main(String[] args) {
        System.out.println("This is muy docker project!");

        WebDriver driver = new ChromeDriver();
        driver.get("http://epam.com");
    }


}
