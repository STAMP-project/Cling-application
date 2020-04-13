/*

 * Tue Mar 03 18:58:42 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaAdapter;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2020L));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes("{llG7!}^G\"+&'wh$Kp");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property {llG7!}^G\"+&'wh$Kp not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      // Undeclared exception!
      try { 
        nativeArray0.setInstanceIdValue(1, nativeArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1462L));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(4);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 4 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(34);
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeArray0.delete(120);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(500L);
      assertEquals(500L, nativeArray0.jsGet_length());
      
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Object[] objectArray0 = nativeArray0.toArray();
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      Object[] objectArray1 = nativeArray1.getIds();
      assertEquals(500, objectArray1.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(379L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-1444780575));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -1444780575 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.enter();
      ContextFactory contextFactory0 = new ContextFactory();
      context0.initStandardObjects();
      NativeArray.setMaximumInitialCapacity(1);
      NativeArray nativeArray0 = new NativeArray(8);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, contextFactory0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray((short) (-1779));
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      Context context0 = Context.getContext();
      nativeArray1.defineOwnProperty(context0, (Object) null, (ScriptableObject) nativeArray0, false);
      assertEquals(4L, nativeArray1.getLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(34);
      NativeArray nativeArray1 = new NativeArray(2);
      nativeArray1.put(13, (Scriptable) nativeArray1, (Object) nativeArray0);
      NativeArray.init(nativeArray1, true);
      assertEquals(14L, nativeArray1.jsGet_length());
      assertEquals(14L, nativeArray1.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeArray.init(baseFunction0, true);
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(13);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 13 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(34);
      NativeArray nativeArray1 = new NativeArray(2);
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeArray1.put(140, (Scriptable) nativeArray0, (Object) "Call");
      assertFalse(nativeArray0.isEmpty());
      assertEquals(141L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2100L);
      NativeArray.init(nativeArray0, false);
      Class<IdFunctionObject> class0 = IdFunctionObject.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.IdFunctionObject
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = Context.enter();
      context0.initStandardObjects();
      NativeArray.setMaximumInitialCapacity(1);
      NativeArray nativeArray0 = new NativeArray(8);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      IdFunctionObject idFunctionObject0 = (IdFunctionObject)JavaAdapter.getFunction(importerTopLevel0, "importPackage");
      assertEquals(3, idFunctionObject0.methodId());
      assertNotNull(idFunctionObject0);
      assertEquals(1, idFunctionObject0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2082L);
      nativeArray0.put(8, (Scriptable) nativeArray0, (Object) nativeArray0);
      assertTrue(nativeArray0.isEmpty());
      
      NativeArray.init(nativeArray0, false);
      assertEquals(2082L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2060L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      context0.initStandardObjects();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeContinuation0, "Gup", (-15), 2);
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor((Context) null, idFunctionObject0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(500L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) importerTopLevel0, false);
      nativeArray0.delete(1);
      assertFalse(nativeArray0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(34);
      NativeArray nativeArray1 = new NativeArray(2);
      nativeArray1.put("Call", (Scriptable) nativeArray0, (Object) null);
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2060L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      context0.initStandardObjects();
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2076L);
      nativeArray0.delete(8);
      NativeArray.init(nativeArray0, false);
      assertEquals(2076L, nativeArray0.getLength());
      assertEquals(2076L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2082L);
      nativeArray0.delete((-21));
      NativeArray.init(nativeArray0, false);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(2082L, nativeArray0.getLength());
  }
}
