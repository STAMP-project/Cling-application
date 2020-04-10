/*

 * Tue Mar 03 19:11:46 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(context0).hasFeature(anyInt());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray.getLengthProperty(context0, importerTopLevel0);
      NativeArray nativeArray0 = new NativeArray(13);
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
  public void test1()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      assertEquals("Object", scriptableObject0.getClassName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, false);
      NativeArray nativeArray0 = new NativeArray((-1422L));
      Object[] objectArray0 = new Object[9];
      Object[] objectArray1 = nativeArray0.toArray(objectArray0);
      assertSame(objectArray1, objectArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3316L);
      NativeArray nativeArray1 = new NativeArray((-1423L));
      assertEquals((-1423L), nativeArray1.jsGet_length());
      
      boolean boolean0 = nativeArray1.containsAll(nativeArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1);
      boolean boolean0 = nativeArray0.containsAll(nativeArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, false);
      NativeArray nativeArray0 = new NativeArray(0L);
      boolean boolean0 = nativeArray0.contains((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeObject0, (Class<?>) class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class java.lang.Object
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3316L);
      Object[] objectArray0 = new Object[2];
      Object[] objectArray1 = nativeArray0.toArray(objectArray0);
      assertTrue(nativeArray0.isExtensible());
      assertEquals(3316, objectArray1.length);
      assertEquals(3316L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(11);
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = nativeArray1.exportAsJSClass(98, nativeArray0, true);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeArray1, objectArray0);
      assertTrue(nativeArray1.isSealed());
  }
}
