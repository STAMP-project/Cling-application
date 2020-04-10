/*

 * Tue Mar 03 18:52:55 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Arguments;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Callable;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FunctionObject_ESTest extends FunctionObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.checkValidAttributes((-2633));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2633
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeArray nativeArray0 = new NativeArray(8);
      Object object0 = nativeArray0.get((-1), (Scriptable) nativeContinuation0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(48L);
      boolean boolean0 = nativeArray0.isConst("thWYtF7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      boolean boolean0 = nativeContinuation0.has(149, (Scriptable) nativeContinuation0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Long long0 = new Long(2);
      IdFunctionObject idFunctionObject0 = null;
      try {
        idFunctionObject0 = new IdFunctionObject(nativeContinuation0, long0, 112, "jsStaticFunction_getClassName", 2, (Scriptable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Context context0 = Context.getContext();
      BoundFunction boundFunction0 = new BoundFunction(context0, topLevel0, (Callable) null, importerTopLevel0, (Object[]) null);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      NativeObject nativeObject0 = new NativeObject();
      HashMap<Arguments, NativeGenerator> hashMap0 = new HashMap<Arguments, NativeGenerator>();
      nativeObject0.put("language version", scriptable0, (Object) hashMap0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      String string0 = topLevel0.getTypeOf();
      assertEquals("object", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeString nativeString0 = new NativeString("language version");
      nativeString0.putConst("language version", importerTopLevel0, nativeContinuation0);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Number;
      // Undeclared exception!
      try { 
        importerTopLevel0.putConst("jsFunction_defineClass", (Scriptable) null, topLevel_Builtins0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      assertTrue(importerTopLevel0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeArray nativeArray0 = new NativeArray(8);
      nativeContinuation0.defineConst("", nativeArray0);
      assertEquals("Continuation", nativeContinuation0.getClassName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(772L);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put((-1867), (Scriptable) nativeArray0, (Object) nativeArray0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        importerTopLevel0.getOwnPropertyDescriptor(context0, nativeError0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<TopLevel> class0 = TopLevel.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.TopLevel
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }
}
