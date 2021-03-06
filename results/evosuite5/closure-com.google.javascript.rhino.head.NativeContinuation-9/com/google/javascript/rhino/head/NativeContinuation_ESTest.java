/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 08:15:34 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.NativeContinuation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeContinuation_ESTest extends NativeContinuation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      int int0 = nativeContinuation0.findPrototypeId("%sTYcHt\"w.M");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeContinuation0.exportAsJSClass(7, nativeContinuation0, true);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot modify a property of a sealed object: Continuation.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeContinuation0, nativeContinuation0, 4, 4);
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        nativeContinuation0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=4 MASTER=com.google.javascript.rhino.head.NativeContinuation@1
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeContinuation0.initPrototypeId(8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8
         //
         verifyException("com.google.javascript.rhino.head.NativeContinuation", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeContinuation0, nativeContinuation0, 1, 1);
      boolean boolean0 = NativeContinuation.isContinuationConstructor(idFunctionObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeContinuation0.initImplementation(8);
      assertFalse(nativeContinuation0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeContinuation0.construct(context0, nativeContinuation0, context0.emptyArgs);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Direct call is not supported
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      NativeContinuation.init(context0, nativeContinuation0, true);
      assertEquals("Continuation", nativeContinuation0.getClassName());
  }
}
