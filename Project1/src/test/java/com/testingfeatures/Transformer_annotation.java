package com.testingfeatures;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class Transformer_annotation implements IAnnotationTransformer {
	@Override
		public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
			//@Test(retryAnalyser =Retry_class.class)
			annotation.setRetryAnalyzer(Retry_class.class);
			
		}


}
        