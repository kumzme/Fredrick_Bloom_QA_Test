package testsuite;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectPackages({"Expedia_Login", "Expedia_Search_Invalid"})
public class TestSuite_01 {
}
