/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 08:12:28 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeContinuation_ESTest extends NativeContinuation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      int int0 = nativeContinuation0.findPrototypeId(", CY`BMgkC8");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = new Context();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeContinuation0, nativeContinuation0, 140, 2);
      // Undeclared exception!
      try { 
        nativeContinuation0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=140 MASTER=com.google.javascript.rhino.head.NativeContinuation@1
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = nativeContinuation0.exportAsJSClass(8, nativeContinuation0, false);
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        nativeContinuation0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Direct call is not supported
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeContinuation0.initPrototypeId(4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4
         //
         verifyException("com.google.javascript.rhino.head.NativeContinuation", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = nativeContinuation0.exportAsJSClass(8, nativeContinuation0, false);
      boolean boolean0 = NativeContinuation.isContinuationConstructor(idFunctionObject0);
      assertFalse(nativeContinuation0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeContinuation0, nativeContinuation0, 4, "tiJkD3^;", 0, nativeContinuation0);
      boolean boolean0 = NativeContinuation.isContinuationConstructor(idFunctionObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeContinuation0.initImplementation("RjQV&UiOi/b3D4");
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = new Context();
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        nativeContinuation0.construct(context0, baseFunction0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Direct call is not supported
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      TopLevel topLevel0 = new TopLevel();
      NativeContinuation.init(context0, topLevel0, false);
      assertEquals("global", topLevel0.getClassName());
  }
}
