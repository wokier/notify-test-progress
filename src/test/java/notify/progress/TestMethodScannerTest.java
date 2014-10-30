package notify.progress;

import org.fest.assertions.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

/**
 * @author francois wauquier
 */
public class TestMethodScannerTest {

	@Rule
	public TestRule progress = new NotifyTestProgressRule();

	@Test
	public void testScanTestTotal() {
		int total = new TestMethodScanner().scanTestTotal();
		Assertions.assertThat(total).isEqualTo(4);
	}
}
