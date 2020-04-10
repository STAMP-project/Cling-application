/*

 * Tue Mar 03 19:00:26 GMT 2020
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
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(12);
      NativeError nativeError0 = new NativeError();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeError0, false);
      nativeArray0.put((-1), (Scriptable) nativeArray0, (Object) nativeGenerator0);
      assertEquals(12L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-169L));
      Context context0 = Context.getContext();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(", point:", (Scriptable) nativeJavaTopPackage0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property , point: not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(160);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeArray0.setInstanceIdValue(1, nativeIterator_StopIteration0);
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
  public void test03()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(12);
      Double double0 = new Double(0);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, double0);
      assertNull(scriptableObject0);
      assertEquals(12L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(140, importerTopLevel0, false);
      assertEquals(1, idFunctionObject0.getLength());
      
      NativeArray nativeArray1 = new NativeArray(170);
      nativeArray0.defineOwnProperty(context0, (Object) nativeArray0, (ScriptableObject) importerTopLevel0, false);
      boolean boolean0 = nativeArray0.containsAll(nativeArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(2);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(4, importerTopLevel0, true);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.getIds();
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(140);
      nativeArray0.delete(140);
      assertEquals(140L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(140);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(2);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 2 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) importerTopLevel0, false);
      nativeArray0.exportAsJSClass(140, importerTopLevel0, false);
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      nativeArray0.getOwnPropertyDescriptor(context0, scriptableObject0);
      // Undeclared exception!
      try { 
        nativeArray0.getIds();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 24
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(idFunctionObject0).getDefaultValue(nullable(java.lang.Class.class));
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) idFunctionObject0, (ScriptableObject) nativeArray0, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Primitive type expected (had com.google.javascript.rhino.head.NativeArray instead)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) importerTopLevel0, false);
      nativeArray0.delete(1);
      assertEquals(1L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(140);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-22));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -22 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(140);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(2281);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 2281 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(4);
      NativeArray nativeArray1 = new NativeArray((-1442L));
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArray0, true);
      nativeArray1.put(12, (Scriptable) nativeArray0, (Object) nativeGenerator0);
      assertEquals(13L, nativeArray0.getLength());
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) importerTopLevel0, false);
      nativeArray0.defineOwnProperty(context0, (Object) null, (ScriptableObject) importerTopLevel0, false);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(180);
      Short short0 = new Short((short)8);
      nativeArray0.put(0, (Scriptable) nativeArray0, (Object) short0);
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(110);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, context0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(110);
      nativeArray0.put("JSON", (Scriptable) importerTopLevel0, (Object) "JSON");
      assertTrue(importerTopLevel0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArray nativeArray0 = new NativeArray(140);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(110);
      nativeArray0.delete(0);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
      nativeArray0.getIds();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(8);
      nativeArray0.delete((-1280));
      assertEquals(8L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(463L);
      Context context0 = Context.getCurrentContext();
      Scriptable scriptable0 = context0.initStandardObjects((ScriptableObject) nativeArray0);
      nativeArray0.put(3292, scriptable0, (Object) "[&T");
      assertEquals(3293L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(110);
      Double double0 = new Double(160);
      nativeArray0.getOwnPropertyDescriptor(context0, double0);
      assertEquals(110L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) importerTopLevel0, false);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(12);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 12 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }
}
