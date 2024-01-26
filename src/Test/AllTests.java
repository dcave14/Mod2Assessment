package Test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

// Test Suite
@Suite
@SelectClasses({ BookTest.class, BookStoreTest.class })
public class AllTests {
}
