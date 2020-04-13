/*

 * Tue Mar 03 19:05:13 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Callable;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
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
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0);
      Object[] objectArray0 = new Object[4];
      nativeArray0.toArray(objectArray0);
      NativeArray.init(nativeArray0, true);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      Object[] objectArray0 = new Object[2];
      nativeArray0.toArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.get((-2547L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0);
      assertFalse(nativeArray0.isSealed());
      
      NativeArray.init(nativeArray0, true);
      nativeArray0.delete(65535);
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      nativeArray0.size();
      NativeArray.init(nativeArray0, false);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<BaseFunction> class0 = BaseFunction.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) null, class0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[2];
      BoundFunction boundFunction0 = new BoundFunction((Context) null, nativeArray0, callable0, nativeArray0, objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.get((-2547L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray.init((Scriptable) null, false);
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object[] objectArray1 = nativeArray0.getIds();
      NativeArray nativeArray1 = new NativeArray(objectArray1);
      boolean boolean0 = nativeArray0.containsAll(nativeArray1);
      assertFalse(boolean0);
      assertEquals(3, objectArray1.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Class<NativeJavaPackage> class0 = NativeJavaPackage.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeJavaPackage
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[2];
      BoundFunction boundFunction0 = new BoundFunction((Context) null, nativeArray0, callable0, nativeArray0, objectArray0);
      assertTrue(nativeArray0.isEmpty());
      
      nativeArray0.put("", (Scriptable) nativeArray0, (Object) boundFunction0);
      Object[] objectArray1 = nativeArray0.getIds();
      assertEquals(1, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ContextFactory contextFactory0 = new ContextFactory();
      Context context1 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context1);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(importerTopLevel0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      long long0 = NativeArray.getLengthProperty(context0, scriptable0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object[] objectArray1 = nativeArray0.getIds();
      NativeArray nativeArray1 = new NativeArray(objectArray1);
      nativeArray0.containsAll(nativeArray1);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray1.getOwnPropertyDescriptor((Context) null, synchronizer0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.containsAll(nativeArray0);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor((Context) null, synchronizer0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[2];
      BoundFunction boundFunction0 = new BoundFunction((Context) null, nativeArray0, callable0, nativeArray0, objectArray0);
      Object[] objectArray1 = nativeArray0.toArray(objectArray0);
      assertEquals(1L, nativeArray0.jsGet_length());
      assertTrue(nativeArray0.isEmpty());
      assertEquals(2, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray.init((Scriptable) null, false);
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.containsAll(nativeArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, true);
      NativeArray nativeArray0 = new NativeArray(415L);
      assertEquals(415L, nativeArray0.getLength());
      
      Object[] objectArray0 = new Object[4];
      nativeArray0.toArray(objectArray0);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeArray nativeArray1 = new NativeArray(4);
      boolean boolean0 = nativeArray0.containsAll(nativeArray1);
      assertFalse(boolean0);
  }
}
