notify-test-progress
====================

Notify Junit Test Progress

Based on https://github.com/wokier/java-to-OS-notify

Usage
-----

  <dependency>
    <groupId>com.github.wokier.notify-test-progress</groupId>
    <artifactId>notify-test-progress</artifactId>
    <version>0.1</version>
  </dependency>

	@Rule
	public TestRule progress = new NotifyTestProgressRule();


For maven, Surefire must be configured in useSystemClassLoader = false mode to scan correctly the test methods


