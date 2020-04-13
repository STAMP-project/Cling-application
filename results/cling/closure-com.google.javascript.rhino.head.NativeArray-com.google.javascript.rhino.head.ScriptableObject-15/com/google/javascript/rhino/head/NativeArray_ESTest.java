/*

 * Tue Mar 03 19:28:45 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.Scriptable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2024L);
      boolean boolean0 = nativeArray0.contains((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(0);
      NativeArray nativeArray0 = new NativeArray(4096L);
      Object[] objectArray0 = nativeArray0.toArray();
      assertEquals(4096, objectArray0.length);
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, false);
      NativeArray nativeArray0 = new NativeArray(4096L);
      int int0 = nativeArray0.indexOf((Object) null);
      assertEquals(0, int0);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, false);
      NativeArray nativeArray0 = new NativeArray(4096L);
      Object[] objectArray0 = nativeArray0.toArray();
      assertEquals(4096, objectArray0.length);
  }
}
