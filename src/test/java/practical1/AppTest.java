package practical1;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 * @return
	 */
	@Test
	public void AppTest1(String testName) {
		// System.setProperty("webdriver.chrome.driver",
		// System.getProperty("user.dir") +
		// "//src//main//java//practical//chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		// driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// driver.close();

		// 3 6 9 12 15 18
		List<String> str = Arrays.asList("adam", "don", "major", "kara", "susha", "allam");
		Boolean b = str.stream().anyMatch(s -> s.contains("con"));
		System.out.println(b);
		// adding comment to code
		// X adding changes to code
		// X again adding changes to igonoring Y
		// Y adding changes to code
		// Y adding code to dev branchnow
		// X adding code to dev branch now

	}

}
