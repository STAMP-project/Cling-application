/*

 * Tue Mar 03 19:02:36 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(15);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes("RETHROW", (Scriptable) null);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property RETHROW not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(32L);
      BaseFunction baseFunction0 = new BaseFunction();
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      nativeArray0.put(1982292598, (Scriptable) baseFunction0, (Object) synchronizer0);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10000);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(10000000);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 10000000 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1052L);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(16);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10000);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 2169, (Object) nativeArray0);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(10000L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(15L);
      nativeArray0.exportAsJSClass(5, (Scriptable) null, false);
      nativeArray0.delete(180);
      assertEquals("object", nativeArray0.getTypeOf());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(15L);
      nativeArray0.exportAsJSClass(5, (Scriptable) null, false);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(2);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 2 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(0);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      NativeArray.init(scriptable0, true);
      NativeArray nativeArray0 = new NativeArray(287L);
      nativeArray0.delete(17);
      assertFalse(nativeArray0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeContinuation0, "@1']^", 140, "@1']^", 13, nativeContinuation0);
      NativeArray nativeArray0 = new NativeArray(2);
      ScriptableObject.putProperty((Scriptable) nativeArray0, (-6), (Object) idFunctionObject0);
      assertFalse(nativeArray0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-713));
      NativeError nativeError0 = new NativeError();
      nativeArray0.put((-713), (Scriptable) nativeError0, (Object) nativeError0);
      NativeArray.init(nativeArray0, true);
      assertEquals(0L, nativeArray0.getLength());
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10000);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(75, (Scriptable) null, false);
      assertEquals(1, idFunctionObject0.methodId());
      assertEquals(1, idFunctionObject0.getArity());
      
      Class<Integer> class0 = Integer.class;
      nativeArray0.getDefaultValue(class0);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[20];
      NativeArray nativeArray0 = new NativeArray(15L);
      Context context0 = Context.enter();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(5, (Scriptable) null, false);
      assertEquals(1, idFunctionObject0.methodId());
      
      nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, objectArray0);
      assertEquals(1, idFunctionObject0.getLength());
      assertFalse(idFunctionObject0.isSealed());
      assertEquals(15L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1124L);
      Context context0 = Context.getCurrentContext();
      nativeArray0.getOwnPropertyDescriptor(context0, context0);
      NativeArray.init((Scriptable) null, false);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Double double0 = new Double(2313.9814);
      nativeArray0.defineOwnProperty(context0, (Object) double0, (ScriptableObject) nativeArray0, true);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context1 = contextFactory0.enterContext();
      nativeArray0.getOwnPropertyDescriptor(context1, context1);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1124L);
      nativeArray0.getIndexIds();
      NativeArray.init((Scriptable) null, false);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(100);
      nativeArray0.delete(21);
      assertEquals("Array", nativeArray0.getClassName());
      assertEquals(100L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(15L);
      nativeArray0.exportAsJSClass(160, nativeArray0, false);
      nativeArray0.delete((-498));
      assertFalse(nativeArray0.isEmpty());
  }
}
