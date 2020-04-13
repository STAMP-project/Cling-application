/*

 * Tue Mar 03 19:07:29 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, false);
      NativeArray nativeArray0 = new NativeArray(0L);
      Object[] objectArray0 = new Object[6];
      Object[] objectArray1 = nativeArray0.toArray(objectArray0);
      assertSame(objectArray1, objectArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      // Undeclared exception!
      try { 
        nativeArray0.get(3536116);
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
      NativeArray nativeArray0 = new NativeArray((-1353L));
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      boolean boolean0 = nativeArray0.containsAll(treeSet0);
      assertEquals((-1353L), nativeArray0.getLength());
      assertTrue(boolean0);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-3515));
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      int int0 = nativeArray0.indexOf(importerTopLevel0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(986);
      Object[] objectArray0 = new Object[6];
      Object[] objectArray1 = nativeArray0.toArray(objectArray0);
      assertEquals(986, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) nativeGenerator0, (ScriptableObject) nativeGenerator0, false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.toArray();
      NativeArray.init(nativeArray0, false);
      assertFalse(nativeArray0.hasPrototypeMap());
  }
}
