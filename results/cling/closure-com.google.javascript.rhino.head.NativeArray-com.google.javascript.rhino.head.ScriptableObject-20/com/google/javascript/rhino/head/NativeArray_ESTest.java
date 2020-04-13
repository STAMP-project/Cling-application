/*

 * Tue Mar 03 19:25:16 GMT 2020
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
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.Scriptable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2421L);
      int int0 = nativeArray0.size();
      assertEquals(2421L, nativeArray0.getLength());
      assertTrue(nativeArray0.isExtensible());
      assertEquals(2421, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1);
      nativeArray0.setDenseOnly(false);
      Long long0 = new Long(1);
      nativeArray0.lastIndexOf(long0);
      // Undeclared exception!
      try { 
        nativeArray0.get(1);
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
      NativeArray nativeArray0 = new NativeArray((-3063L));
      Class<NativeCall> class0 = NativeCall.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeCall
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      NativeJavaPackage nativeJavaPackage0 = null;
      try {
        nativeJavaPackage0 = new NativeJavaPackage((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeJavaPackage", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      // Undeclared exception!
      try { 
        nativeArray0.get((-1L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1));
      nativeArray0.put("indexOf", (Scriptable) nativeArray0, (Object) "indexOf");
      nativeArray0.getIds();
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      Double double0 = new Double(13);
      nativeArray0.contains(double0);
      NativeJavaPackage nativeJavaPackage0 = null;
      try {
        nativeJavaPackage0 = new NativeJavaPackage((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeJavaPackage", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10000);
      nativeArray0.toArray();
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
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
}
