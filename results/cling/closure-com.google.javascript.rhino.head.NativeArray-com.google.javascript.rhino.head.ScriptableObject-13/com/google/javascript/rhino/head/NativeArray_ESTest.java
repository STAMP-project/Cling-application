/*

 * Tue Mar 03 19:15:25 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      int int0 = nativeArray0.size();
      assertTrue(nativeArray0.isExtensible());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Class<NativeJavaTopPackage> class0 = NativeJavaTopPackage.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) nativeJavaClass0, class0, true, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(0);
      NativeArray nativeArray0 = new NativeArray(2111L);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      int int0 = nativeArray0.lastIndexOf(nativeIterator_StopIteration0);
      assertTrue(nativeArray0.isEmpty());
      assertEquals((-1), int0);
      assertEquals(2111L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      nativeArray0.toArray();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 8, 2);
      nativeArray0.fillConstructorProperties(idFunctionObject0);
      assertEquals("", idFunctionObject0.getFunctionName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 8, 2);
      nativeArray0.fillConstructorProperties(idFunctionObject0);
      int int0 = nativeArray0.indexOf(idFunctionObject0);
      assertEquals((-1), int0);
  }
}
