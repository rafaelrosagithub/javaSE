package br.com.xyz.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ MathTest.class, TestCube.class, TestRecursion.class })
public class AllTests {

}
