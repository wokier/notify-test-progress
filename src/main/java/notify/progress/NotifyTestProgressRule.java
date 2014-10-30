package notify.progress;

import com.google.common.base.Joiner;
import notify.Notify;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * Rule to place on each test
 * 
 * @author francois wauquier
 */
public class NotifyTestProgressRule extends TestWatcher {

	private static int current;
	private static Integer total;


	public NotifyTestProgressRule() {
	   super();
	}

	/**
	 * Invoked when a test is about to start
	 * 
	 * @param description
	 */
	protected void starting(Description description) {
		if (total == null) {
			total = new TestMethodScanner().scanTestTotal();
		}
        notifyProgress();
    }

	/**
	 * Invoked when a test method finishes (whether passing or failing)
	 * 
	 * @param description
	 */
	protected void finished(Description description) {
		current++;
        if(current == total){
            notifyProgress();
        }
	}

    private void notifyProgress() {
        Notify.notify("Test Progress", current + "/" + total);
    }

    /**
	 * Invoked when a test succeeds
	 * 
	 * @param description
	 */
	protected void succeeded(Description description) {
	}

	/**
	 * Invoked when a test fails
	 * 
	 * @param e
	 * @param description
	 */
	protected void failed(Throwable e, Description description) {
		Notify.error("Test Error", Joiner.on(" ").join(description.getTestClass(), description.getMethodName(), e.getClass(), e.getMessage()));
	}

}
