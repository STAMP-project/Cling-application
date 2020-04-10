/*

 * Tue Mar 03 18:43:17 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJSON;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeCall0, true);
      NativeGenerator nativeGenerator1 = (NativeGenerator)ScriptableObject.ensureScriptable(nativeGenerator0);
      assertTrue(nativeCall0.isEmpty());
      assertTrue(nativeGenerator1.isExtensible());
      assertTrue(nativeGenerator1.isSealed());
      assertTrue(nativeGenerator1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      Class<NativeObject> class0 = NativeObject.class;
      ScriptableObject.buildClassCtor((Scriptable) topLevel0, class0, false, false);
      assertTrue(topLevel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        ScriptableObject.isFalse(nativeIterator_StopIteration0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      nativeArray0.defineOwnProperty(context0, (Object) null, nativeArray0);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context1 = Context.getCurrentContext();
      nativeArray0.defineOwnProperty(context1, (Object) null, nativeIterator_StopIteration0);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Class<Object> class0 = Object.class;
      NativeJavaClass nativeJavaClass1 = null;
      try {
        nativeJavaClass1 = new NativeJavaClass(nativeJavaClass0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      assertFalse(nativeArray0.isSealed());
      
      Object object0 = NativeJSON.stringify((Context) null, nativeArray0, nativeArray0, "", nativeIterator_StopIteration0);
      assertEquals("[null,null,null,null,null,null,null,null]", object0);
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      NativeString nativeString0 = new NativeString(stringBuffer0);
      ScriptableObject.redefineProperty(nativeString0, "(I)C", false);
      assertTrue(nativeString0.isExtensible());
      assertTrue(nativeString0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeString.init(scriptable0, true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeCall0, true);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeGenerator0, "BB'GPJmFT[_6Q2c", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: BB'GPJmFT[_6Q2c is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty((Scriptable) nativeContinuation0, "language version", class0);
      assertTrue(nativeContinuation0.isExtensible());
      assertTrue(nativeContinuation0.isEmpty());
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
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
  public void test12()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      assertFalse(nativeContinuation0.isSealed());
      
      Class<NativeObject> class0 = NativeObject.class;
      ScriptableObject.defineClass((Scriptable) nativeContinuation0, class0, true);
      assertTrue(nativeContinuation0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ScriptableObject.getPropertyIds(nativeObject0);
      assertTrue(nativeObject0.isExtensible());
  }
}
