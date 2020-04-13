/*

 * Tue Mar 03 19:04:36 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaConstructor;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4433L);
      int int0 = nativeArray0.size();
      assertTrue(nativeArray0.isExtensible());
      assertEquals(4433L, nativeArray0.jsGet_length());
      assertEquals(4433, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray.init(nativeIterator_StopIteration0, false);
      NativeArray nativeArray0 = new NativeArray(4);
      // Undeclared exception!
      try { 
        nativeArray0.get((-760L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.containsAll(nativeArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-7698142301602209613L));
      TreeSet<TopLevel> treeSet0 = new TreeSet<TopLevel>();
      nativeArray0.containsAll(treeSet0);
      NativeArray.init(nativeArray0, true);
      assertEquals(0L, nativeArray0.getLength());
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      ClassLoader classLoader0 = mock(ClassLoader.class, new ViolatedAssumptionAnswer());
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      nativeArray0.put("msg.modify.readonly", (Scriptable) nativeArray0, (Object) nativeJavaTopPackage0);
      nativeArray0.getIndexIds();
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeArray.init(nativeArray0, true);
      ClassLoader classLoader0 = mock(ClassLoader.class, new ViolatedAssumptionAnswer());
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      nativeArray0.put("msg.modify.readonly", (Scriptable) nativeArray0, (Object) nativeJavaTopPackage0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1006140569036166267L));
      Class<NativeJavaConstructor> class0 = NativeJavaConstructor.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeJavaConstructor
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-7698142301602209613L));
      nativeArray0.contains(nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty((Context) null, (Object) nativeArray0, (ScriptableObject) nativeArray0, false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-7698142301602209613L));
      Object[] objectArray0 = new Object[8];
      objectArray0[1] = (Object) nativeArray0;
      nativeArray0.toArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty((Context) null, objectArray0[1], (ScriptableObject) nativeArray0, false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1220L);
      Object[] objectArray0 = new Object[8];
      Object[] objectArray1 = nativeArray0.toArray(objectArray0);
      assertEquals(1220, objectArray1.length);
      assertTrue(nativeArray0.isExtensible());
  }
}
