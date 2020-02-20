package Expedia_Login;
import Driver_Global.Driver_Global;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
public class Expedia_Login_02 implements Driver_Global {

    @Test
    public void Sample_Assert() {
        Web_Driver.navigate().to("https://www.expedia.com");
        assertEquals("Just_Testing_Invalid", "Just_Testing_Pass");
    }
}
