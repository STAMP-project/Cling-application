/*

 * Tue Mar 03 19:18:27 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.UniqueTag;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      objectArray0[1] = (Object) uniqueTag0;
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.contains(objectArray0[1]);
      // Undeclared exception!
      try { 
        nativeArray0.get((long) (-2356));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      int int0 = nativeArray0.size();
      assertEquals(1, int0);
      
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getContext();
      nativeArray0.defineOwnProperty(context0, (Object) null, (ScriptableObject) nativeIterator_StopIteration0, false);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0, nativeArray0);
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
  public void test03()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Context context1 = Context.enter((Context) null);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context1, false);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(importerTopLevel0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      long long0 = NativeArray.getLengthProperty(context0, scriptable0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Class<NativeGenerator> class0 = NativeGenerator.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) null, class0, false, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.NativeGenerator\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Class<BaseFunction> class0 = BaseFunction.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) null, class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.BaseFunction
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, false);
      NativeArray nativeArray0 = new NativeArray((-9223372036854775808L));
      // Undeclared exception!
      try { 
        nativeArray0.toArray((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-232L));
      nativeArray0.setInstanceIdAttributes(19, 19);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(context0).toString();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) nativeIterator_StopIteration0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      nativeArray0.size();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeArray0.put(1973, (Scriptable) nativeArray0, (Object) importerTopLevel0);
      nativeArray0.get((long) 0);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, true);
      NativeArray nativeArray0 = new NativeArray(3021);
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) nativeArray0;
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.containsAll(nativeArray1);
      assertFalse(boolean0);
      assertEquals(3021L, nativeArray0.jsGet_length());
      assertEquals("Array", nativeArray1.getClassName());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      nativeArray0.get((long) 0);
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      nativeArray0.get((long) 0);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getContext();
      nativeArray0.defineOwnProperty(context0, (Object) null, (ScriptableObject) nativeIterator_StopIteration0, false);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0);
      Object[] objectArray0 = new Object[7];
      nativeArray0.equivalentValues((Object) null);
      assertEquals(0L, nativeArray0.jsGet_length());
      
      Object[] objectArray1 = nativeArray0.toArray(objectArray0);
      assertEquals(7, objectArray1.length);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      nativeArray0.size();
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1633L);
      Object[] objectArray0 = nativeArray0.toArray();
      assertEquals(1633, objectArray0.length);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Class<Float> class0 = Float.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, true);
      NativeArray nativeArray0 = new NativeArray(3021);
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.containsAll(nativeArray1);
      assertTrue(boolean0);
  }
}
