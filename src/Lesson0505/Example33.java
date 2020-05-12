package Lesson0505;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class Example33 {
    public static void main(String[] args) {
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { Example1Test.class });
        testng.addListener(tla);
        System.out.println(tla.getFailedTests().toString());
        testng.run();

    }
}
