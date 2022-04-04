package com.testingfeatures;

import org.testng.annotations.Test;

public class Dependencytest {
@Test
private void mobile() {
	System.out.println("Mobile");
}
@Test(dependsOnMethods = "watch")
private void offer() {
System.out.println("offer");
}
@Test
private void watch() {
System.out.println("watch");
}
}