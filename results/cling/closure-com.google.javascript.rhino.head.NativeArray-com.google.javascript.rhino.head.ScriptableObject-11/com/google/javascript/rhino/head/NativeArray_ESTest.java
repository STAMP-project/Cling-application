/*

 * Tue Mar 03 19:17:50 GMT 2020
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
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(9);
      NativeArray nativeArray0 = new NativeArray(3136L);
      int int0 = nativeArray0.lastIndexOf(nativeArray0.PERMANENT);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(3136L, nativeArray0.jsGet_length());
      assertEquals((-1), int0);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) objectArray0;
      objectArray0[1] = objectArray0[0];
      objectArray0[2] = objectArray0[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray.getLengthProperty(context0, nativeArray0);
      TreeSet<NativeIterator> treeSet0 = new TreeSet<NativeIterator>();
      nativeArray0.containsAll(treeSet0);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(context1).toString();
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context1, (Object) context1, (ScriptableObject) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-341));
      nativeArray0.toArray();
      assertEquals((-341L), nativeArray0.jsGet_length());
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, true);
      NativeArray nativeArray0 = new NativeArray(0L);
      // Undeclared exception!
      try { 
        nativeArray0.get(1431655764L);
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
      NativeArray nativeArray0 = new NativeArray((-4291L));
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) nativeArray0;
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.containsAll(nativeArray1);
      assertTrue(nativeArray1.isExtensible());
      assertEquals((-4291L), nativeArray0.getLength());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2033L));
      NativeError nativeError0 = new NativeError();
      nativeArray0.size();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) synchronizer0, (ScriptableObject) nativeError0, false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }
}
