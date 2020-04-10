/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 06:13:50 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.InterpreterData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        Context.reportRuntimeError("TopLevel.java.java");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1501, (String) null, (String) null, true);
  }
}
