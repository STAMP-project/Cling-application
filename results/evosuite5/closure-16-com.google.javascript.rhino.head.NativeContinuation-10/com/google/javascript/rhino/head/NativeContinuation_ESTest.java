/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 08:16:07 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.Scriptable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeContinuation_ESTest extends NativeContinuation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      int int0 = nativeContinuation0.findPrototypeId("constructor");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      int int0 = nativeContinuation0.findPrototypeId("}W=z#>*_m!T");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      int int0 = nativeContinuation0.findPrototypeId("");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeContinuation0, "Continuation", 13, "Continuation", 8, nativeContinuation0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      // Undeclared exception!
      try { 
        nativeContinuation0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("com.google.javascript.rhino.head.NativeContinuation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeContinuation0, "cnmstructor", 2, 0);
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        nativeContinuation0.execIdCall(idFunctionObject0, context0, idFunctionObject0, (Scriptable) null, context0.emptyArgs);
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
  public void test05()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeError nativeError0 = new NativeError();
      IdFunctionObject idFunctionObject0 = nativeContinuation0.exportAsJSClass(4, nativeError0, false);
      // Undeclared exception!
      try { 
        idFunctionObject0.construct(context0, nativeContinuation0, context0.emptyArgs);
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
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeContinuation0, "Continuation", 2, 13);
      boolean boolean0 = NativeContinuation.isContinuationConstructor(idFunctionObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeError nativeError0 = new NativeError();
      IdFunctionObject idFunctionObject0 = nativeContinuation0.exportAsJSClass(2, nativeError0, false);
      boolean boolean0 = NativeContinuation.isContinuationConstructor(idFunctionObject0);
      assertEquals("Continuation", idFunctionObject0.getFunctionName());
      assertTrue(boolean0);
      assertEquals(0, idFunctionObject0.getLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeCall0, nativeCall0, 13, 1);
      boolean boolean0 = NativeContinuation.isContinuationConstructor(idFunctionObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeContinuation0.initImplementation((Object) null);
      assertTrue(nativeContinuation0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeContinuation.init(context0, nativeContinuation0, false);
      assertEquals("Continuation", nativeContinuation0.getClassName());
  }
}
