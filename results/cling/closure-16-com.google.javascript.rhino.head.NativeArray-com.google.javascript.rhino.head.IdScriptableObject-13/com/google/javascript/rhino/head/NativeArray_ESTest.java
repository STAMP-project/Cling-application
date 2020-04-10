/*

 * Tue Mar 03 18:58:33 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      // Undeclared exception!
      try { 
        nativeBoolean0.getAttributes("8N");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 8N not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(17);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-358L));
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(", ", (ClassLoader) null);
      nativeArray0.put(", ", (Scriptable) nativeJavaPackage0, (Object) nativeJavaPackage0);
      assertEquals((-358L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(100);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, nativeArray0.EMPTY);
      assertNull(scriptableObject0);
      assertEquals(100L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(1, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(8);
      nativeArray0.delete(105);
      assertEquals(8L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
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
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.getAllIds();
      NativeArray.init(nativeArray0, true);
      assertEquals(1L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity((-715));
      NativeArray nativeArray0 = new NativeArray(5L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeArray.init(nativeArray0, false);
      Double double0 = new Double(3);
      nativeArray0.getOwnPropertyDescriptor(context0, double0);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2471L);
      nativeArray0.put(1615, (Scriptable) nativeArray0, (Object) nativeArray0.PERMANENT);
      Context context0 = new Context();
      nativeArray0.exportAsJSClass(1276, nativeArray0, false);
      nativeArray0.defineOwnProperty((Context) null, (Object) context0, (ScriptableObject) nativeArray0, true);
      assertEquals(130, Context.VERSION_1_3);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1051L);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, (-595), (Object) nativeWith0);
      NativeArray.init(nativeWith0, false);
      assertEquals(1051L, nativeArray0.getLength());
      assertEquals(1051L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity((-715));
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(13);
      nativeArray0.delete(100);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray((-1958L));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-2147266751));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -2147266751 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(100);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(4308);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 4308 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeArray.init(nativeObject0, true);
      NativeArray nativeArray0 = new NativeArray((-3061L));
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext((Context) null);
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor(context0, nativeArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity((-715));
      NativeArray nativeArray0 = new NativeArray(5L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeArray.init(nativeArray0, false);
      assertFalse(nativeArray0.isEmpty());
      
      nativeArray0.defineOwnProperty(context0, (Object) contextFactory0, (ScriptableObject) nativeArray0, false);
      assertEquals(5L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray((-700L));
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, importerTopLevel0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray((-1958L));
      nativeArray0.delete(9);
      assertEquals((-1958L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(100);
      NativeArray.init(nativeArray0, false);
      Object[] objectArray0 = nativeArray0.getAllIds();
      assertEquals(2, objectArray0.length);
      assertEquals(100L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(8);
      nativeArray0.delete((-145));
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(10, (Scriptable) null, false);
      assertEquals(1, idFunctionObject0.methodId());
      assertEquals(1, idFunctionObject0.getArity());
      assertEquals(8L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Delegator delegator0 = new Delegator();
      nativeArray0.put(666, (Scriptable) nativeArray0, (Object) delegator0);
      NativeArray.init(nativeArray0, false);
      assertEquals(667L, nativeArray0.jsGet_length());
      assertEquals(667L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray((-1958L));
      NativeArray nativeArray1 = new NativeArray(0);
      Synchronizer synchronizer0 = new Synchronizer(importerTopLevel0);
      nativeArray0.put(12, (Scriptable) nativeArray1, (Object) synchronizer0);
      assertEquals(13L, nativeArray1.jsGet_length());
      assertEquals(13L, nativeArray1.getLength());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeArray.init(nativeObject0, true);
      NativeArray nativeArray0 = new NativeArray((-3061L));
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext((Context) null);
      Long long0 = new Long(130);
      nativeArray0.getOwnPropertyDescriptor(context0, long0);
      assertEquals((-3061L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity((-715));
      NativeArray nativeArray0 = new NativeArray(5L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
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
}
