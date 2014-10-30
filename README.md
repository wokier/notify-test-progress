notify-test-progress
====================

Notify Junit Test Progress

Based on https://github.com/wokier/java-to-OS-notify

Usage
-----

	@Rule
	public TestRule progress = new NotifyTestProgressRule();


For maven, Surefire must be configured in useSystemClassLoader = false mode to scan correctly the test methods


