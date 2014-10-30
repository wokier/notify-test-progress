package notify.progress;

import com.google.common.base.Predicate;
import org.junit.Test;
import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import javax.annotation.Nullable;
import java.lang.annotation.Annotation;

/**
 * @author francois wauquier
 */
public class TestMethodScanner {


	public TestMethodScanner() {
		super();
	}

	public int scanTestTotal() {
		return new Reflections(new MethodAnnotationsScanner()).getMethodsAnnotatedWith(Test.class).size();
	}

}
