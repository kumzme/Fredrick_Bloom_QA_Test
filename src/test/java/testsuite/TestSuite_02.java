package testsuite;
import Expedia_Login.Expedia_Login_02;
import Expedia_Valid.Expedia_Valid_02;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({Expedia_Login_02.class, Expedia_Valid_02.class})
public class TestSuite_02 {
}
