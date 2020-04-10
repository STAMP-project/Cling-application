/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 04:46:07 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes("msg.instanceof.not.object");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property msg.instanceof.not.object not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      // Undeclared exception!
      try { 
        importerTopLevel0.getAttributes("arity");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property arity not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(1, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      context0.initStandardObjects((ScriptableObject) importerTopLevel0, true);
      NativeArray nativeArray0 = new NativeArray(120);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(150);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 150 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(2528);
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(3390L);
      nativeArray0.defineOwnProperty(context0, (Object) importerTopLevel0, (ScriptableObject) importerTopLevel0, true);
      assertFalse(importerTopLevel0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-906L));
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-3949));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -3949 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      context0.initStandardObjects((ScriptableObject) importerTopLevel0, true);
      NativeArray nativeArray0 = new NativeArray(120);
      nativeArray0.getOwnPropertyDescriptor(context0, 140);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray((-699L));
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      nativeArray1.defineOwnProperty(context0, objectArray0[1], (ScriptableObject) nativeArray0, true);
      assertEquals(130, Context.VERSION_1_3);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeArray.init(nativeError0, true);
      NativeArray nativeArray0 = new NativeArray((-3707L));
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, (Object) null);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-906L));
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) synchronizer0, (ScriptableObject) nativeArray0, true);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(130);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-906L));
      Double double0 = new Double(13);
      nativeArray0.put((-3117), (Scriptable) nativeArray0, (Object) double0);
      NativeArray.init(nativeArray0, false);
      assertEquals(0L, nativeArray0.jsGet_length());
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(9);
      NativeArray nativeArray0 = new NativeArray(4206L);
      nativeArray0.delete(2940);
      assertEquals(4206L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-906L));
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(".(O*Y");
      nativeArray0.put("every", (Scriptable) nativeJavaPackage0, (Object) "every");
      NativeArray.init(nativeArray0, false);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3154L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(1);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 1 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-7698142301602209613L));
      NativeArray nativeArray1 = new NativeArray(2);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(5, nativeArray1, true);
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray2 = new NativeArray(objectArray0);
      nativeArray1.put(2, (Scriptable) nativeArray2, (Object) idFunctionObject0);
      assertTrue(nativeArray2.isEmpty());
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals(1, idFunctionObject0.methodId());
      assertEquals(2L, nativeArray1.getLength());
      assertEquals(7L, nativeArray2.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4018L);
      nativeArray0.delete(175);
      assertEquals(4018L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      nativeArray0.put(13, (Scriptable) nativeArray0, (Object) nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.exportAsJSClass(2, nativeArray0, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Array.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      nativeArray0.delete(175);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.put(1908874353, (Scriptable) nativeArray0, (Object) nativeArray0);
      assertEquals(1908874354L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      nativeArray0.getOwnPropertyDescriptor(context0, contextFactory0);
      assertEquals(2147483647L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      nativeArray0.delete((-308));
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }
}
