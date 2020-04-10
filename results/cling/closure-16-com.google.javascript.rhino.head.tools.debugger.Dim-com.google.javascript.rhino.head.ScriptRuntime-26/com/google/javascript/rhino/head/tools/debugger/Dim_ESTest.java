/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 08:30:51 GMT 2019
 */

package com.google.javascript.rhino.head.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.tools.debugger.Dim;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Dim_ESTest extends Dim_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Context.jsToJava("", class0);
      try { 
        Context.jsToJava(class0, class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot convert class java.lang.Integer to java.lang.Integer
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Dim dim0 = new Dim();
      Class<Integer> class0 = Integer.class;
      Context.jsToJava("0", class0);
      Class<BaseFunction> class1 = BaseFunction.class;
      try { 
        Context.jsToJava(dim0, class1);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot convert com.google.javascript.rhino.head.tools.debugger.Dim@448ea870 to com.google.javascript.rhino.head.BaseFunction
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      try { 
        Context.jsToJava("undefined", class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot convert undefined to java.lang.Integer
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }
}
