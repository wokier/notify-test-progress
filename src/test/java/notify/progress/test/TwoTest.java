package notify.progress.test;

import notify.progress.NotifyTestProgressRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

/**
 * @author francois wauquier
 */
public class TwoTest {

	@Rule
	public TestRule progress = new NotifyTestProgressRule();

	@Test
	public void test11() throws Exception {
		Thread.sleep(2000);
	}
}
