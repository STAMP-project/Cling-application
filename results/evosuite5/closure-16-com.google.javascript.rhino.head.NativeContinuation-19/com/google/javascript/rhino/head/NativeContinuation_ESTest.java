/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 14 00:15:49 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.UniqueTag;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeContinuation_ESTest extends NativeContinuation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      int int0 = nativeContinuation0.findPrototypeId("_c_(.*)_d+");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeContinuation0, nativeContinuation0, 2, 0);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeContinuation0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=2 MASTER=com.google.javascript.rhino.head.NativeContinuation@1
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeContinuation0.exportAsJSClass(12, nativeContinuation0, true);
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
  public void test3()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeError nativeError0 = new NativeError();
      IdFunctionObject idFunctionObject0 = nativeContinuation0.exportAsJSClass(4, nativeError0, true);
      boolean boolean0 = NativeContinuation.isContinuationConstructor(idFunctionObject0);
      assertEquals("Continuation", idFunctionObject0.getFunctionName());
      assertEquals(0, idFunctionObject0.getLength());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeContinuation0, "Continuation", 4, 4);
      boolean boolean0 = NativeContinuation.isContinuationConstructor(idFunctionObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = Context.enter();
      NativeObject nativeObject0 = new NativeObject();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeObject0, context0, 12, "language version", 4, nativeContinuation0);
      boolean boolean0 = NativeContinuation.isContinuationConstructor(idFunctionObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      nativeContinuation0.initImplementation(uniqueTag0);
      assertTrue(nativeContinuation0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test7()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        nativeContinuation0.construct(context0, (Scriptable) null, context0.emptyArgs);
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
  public void test8()  throws Throwable  {
      Context context0 = Context.enter();
      NativeObject nativeObject0 = new NativeObject();
      NativeContinuation.init(context0, nativeObject0, true);
      assertEquals(1, ScriptableObject.READONLY);
  }
}
