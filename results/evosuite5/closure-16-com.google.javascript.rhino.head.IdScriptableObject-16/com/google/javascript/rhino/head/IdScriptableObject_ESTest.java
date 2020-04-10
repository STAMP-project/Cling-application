/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 22:26:21 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(100.0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeNumber0, (Object) null, 17, "|&,PV.0vg", 17, nativeNumber0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ScriptableObject scriptableObject0 = idFunctionObject0.getOwnPropertyDescriptor(context0, "Er?y`H`");
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Context context0 = Context.enter();
      NativeString nativeString0 = new NativeString("error reporter");
      ScriptableObject scriptableObject0 = nativeString0.getOwnPropertyDescriptor(context0, "language version");
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      ScriptableObject scriptableObject0 = nativeBoolean0.getOwnPropertyDescriptor(context0, (Object) null);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      nativeBoolean0.exportAsJSClass(1, nativeContinuation0, false);
      Context context0 = Context.getCurrentContext();
      nativeBoolean0.defineOwnProperty(context0, "error reporter", nativeContinuation0);
      assertEquals(180, Context.VERSION_1_8);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      Context context0 = Context.getCurrentContext();
      nativeBoolean0.defineOwnProperty(context0, "error reporter", nativeContinuation0);
      assertEquals(5, Context.FEATURE_PARENT_PROTO_PROPRTIES);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      IdFunctionObject idFunctionObject0 = nativeBoolean0.exportAsJSClass(1, nativeContinuation0, false);
      nativeBoolean0.initPrototypeConstructor(idFunctionObject0);
      assertEquals(1, idFunctionObject0.getArity());
      assertFalse(idFunctionObject0.isSealed());
      assertEquals(1, idFunctionObject0.getLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      IdFunctionObject idFunctionObject0 = nativeBoolean0.exportAsJSClass(100, (Scriptable) null, false);
      IdFunctionObject idFunctionObject1 = new IdFunctionObject(idFunctionObject0, context0, 18, "error reporter", 1, idFunctionObject0);
      // Undeclared exception!
      try { 
        nativeBoolean0.initPrototypeConstructor(idFunctionObject1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      IdFunctionObject idFunctionObject0 = nativeBoolean0.exportAsJSClass(1, nativeContinuation0, true);
      assertEquals(1, idFunctionObject0.methodId());
      
      nativeBoolean0.initPrototypeConstructor(idFunctionObject0);
      assertEquals(1, idFunctionObject0.getArity());
      assertEquals(1, idFunctionObject0.getLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      // Undeclared exception!
      try { 
        importerTopLevel0.exportAsJSClass(7, nativeBoolean0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      boolean boolean0 = importerTopLevel0.hasPrototypeMap();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      boolean boolean0 = nativeContinuation0.hasPrototypeMap();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = baseFunction0.getAllIds();
      assertEquals(4, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = Context.enter();
      NativeString nativeString0 = new NativeString("error reporter");
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeString0, context0, 150, 0);
      nativeString0.defineOwnProperties(context0, idFunctionObject0);
      assertFalse(nativeString0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      // Undeclared exception!
      try { 
        importerTopLevel0.getAttributes("error reporter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Property error reporter not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      // Undeclared exception!
      try { 
        importerTopLevel0.getAttributes("error reporter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Property error reporter not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      importerTopLevel0.delete("error reporter");
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      nativeBoolean0.delete("error reporter");
      assertFalse(nativeBoolean0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Object[] objectArray0 = importerTopLevel0.getIds();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      // Undeclared exception!
      try { 
        importerTopLevel0.initPrototypeMethod(context0, 0, "language version", 7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject$PrototypeValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeString nativeString0 = new NativeString("error reporter");
      // Undeclared exception!
      try { 
        nativeString0.activatePrototypeMap((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject$PrototypeValues", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      importerTopLevel0.defaultPut("error reporter", context0);
      assertEquals(110, Context.VERSION_1_1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      Object[] objectArray0 = importerTopLevel0.getAllIds();
      assertEquals(59, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = Context.enter();
      NativeString nativeString0 = new NativeString("error reporter");
      // Undeclared exception!
      try { 
        nativeString0.initPrototypeValue(1176, "error reporter", context0, (-3150));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeString nativeString0 = new NativeString("error reporter");
      Object object0 = nativeString0.defaultGet("error reporter");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeString nativeString0 = new NativeString("error reporter");
      // Undeclared exception!
      try { 
        nativeString0.getInstanceIdValue((-1));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -1
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeString nativeString0 = new NativeString("error reporter");
      NativeError nativeError0 = new NativeError();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeString0, context0, 140, 203);
      // Undeclared exception!
      try { 
        nativeError0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeString0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=140 MASTER=error reporter
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeString nativeString0 = new NativeString("error reporter");
      // Undeclared exception!
      try { 
        nativeString0.setInstanceIdAttributes(12, 130);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 12
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }
}
