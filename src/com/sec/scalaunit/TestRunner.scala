package com.sec.scalaunit

import com.sec.scalaunit.model.{UnitLogger, TestMethod, TestClass, TestTarget}
import com.sec.scalaunit.exception.TestFailedException
import java.lang.reflect.InvocationTargetException

object TestRunner {

  var passedCases: Int = 0;
  var failedCases: Int = 0;
  var errorCases: Int = 0;
  var totalCases: Int = 0;

  def target(className: String, methodName: String) {
    UnitLogger.info("Testing \n\t\t\t" + className + "." + methodName + "()");
  }

  def failed(ex: TestFailedException) {
    if (ex.hasValue()) {
      UnitLogger.info("[[[[[FAILED]]]]] expected " + ex.getExpected() + ", but actual is " + ex.getActual());
    } else {
      UnitLogger.info("[[[[[FAILED]]]]] " + ex.message);
    }
  }

  def failed(ex: InvocationTargetException) {
    if (ex.getTargetException().isInstanceOf[TestFailedException]) {
      failed(ex.getTargetException.asInstanceOf[TestFailedException]);
    } else {
      error(ex, "");
    }
  }

  def passed() {
    UnitLogger.info("PASSED.");
  }

  def error(ex: Exception, message: String) {
    UnitLogger.info("ERROR.");
    UnitLogger.info(message);

    if (ex.isInstanceOf[InvocationTargetException]) {
      val e: InvocationTargetException = ex.asInstanceOf[InvocationTargetException];
      var targetExp: Throwable = e.getTargetException();
      outputException(targetExp);
    }

    outputException(ex)
  }


  def outputException(ex: Throwable) {
    UnitLogger.info("\t" + ex.getClass.getName);
    val elements: Array[StackTraceElement] = ex.getStackTrace;
    elements.foreach((element: StackTraceElement) => UnitLogger.info("\t" + element.toString));
  }

  def scanTestCases(): TestTarget = {
    val target: TestTarget = new TestTarget {
      var classes: List[TestClass] = Nil;
    };

    val clazz: TestClass = new TestClass {
      var methods: List[TestMethod] = Nil;
      val name: String = "test.com.sec.editor.TestColorAdapter";
    }

    val methods: List[String] = "testKeyword" :: "testKeywordWithSymbol" :: "testCommonWord" :: Nil;

    methods.foreach((name: String) => appendMethod(name, clazz));

    target.classes = clazz :: target.classes;

    return target;
  }

  def appendMethod(name: String, clazz: TestClass) {
    val method: TestMethod = new TestMethod(name);
    clazz.methods = method :: clazz.methods;
  }

  def run() {
    val testTarget: TestTarget = scanTestCases();
    testTarget.classes.foreach((clazz: TestClass) => executeTest(clazz));
  }

  def executeTest(clazz: TestClass) {
    clazz.methods.foreach((method: TestMethod) => executeTestCase(clazz, method));
  }

  def executeTestCase(clazz: TestClass, method: TestMethod) {
    totalCases += 1;
    try {
      target(clazz.name, method.name);
      clazz.setUp();
      clazz.run(method);
      passed();
      passedCases += 1;
    } catch {
      case ex:
        InvocationTargetException => failed(ex);
      failedCases += 1;
      case ex:
        TestFailedException => failed(ex);
      failedCases += 1;
      case ex: Exception => error(ex, "");
      errorCases += 1;
    } finally {
      clazz.tearDown();
    }
  }

  def report() {
    UnitLogger.info("Executed " + totalCases + " test cases.");
    UnitLogger.info("Passed " + passedCases + " cases.")
    UnitLogger.info("Failed " + failedCases + " cases.")
    UnitLogger.info("Error " + errorCases + " cases.")
  }

  def main(arg: Array[String]) {
    TestRunner.run();
    TestRunner.report();
  }

}
