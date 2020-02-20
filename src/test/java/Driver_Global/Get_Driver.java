package Driver_Global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Driver {
    private static String OS = System.getProperty("os.name").toLowerCase();

    public static String getosanddriver()  {


        if (OS.contains("win")) {
            System.out.println("This is Windows");
            return System.getProperty("user.dir") + "/src/test/resources/Driver/chromedriver_win.exe";
        } else if (OS.contains("mac")) {
            System.out.println("This is Mac");
            return System.getProperty("user.dir") + "/src/test/resources/Driver/chromedriver_Mac";
        }
        return null;// Work on this later
    }

    public static WebDriver Get_Web_Driver()  {
        System.out.println(System.getProperty("user.dir"));
        String Path_D = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", getosanddriver());
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.google.com/");
        try {
            Thread.sleep(5000);  // Let the user actually see something!
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver;
    }

}
