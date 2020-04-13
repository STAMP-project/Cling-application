/*

 * Tue Mar 03 20:28:55 GMT 2020
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
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
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
      NativeArray nativeArray0 = new NativeArray(1426L);
      nativeArray0.get((-2451), (Scriptable) null);
      assertEquals(1426L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(5);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 5 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(11);
      BaseFunction baseFunction0 = new BaseFunction();
      nativeArray0.put("language version", (Scriptable) baseFunction0, (Object) nativeArray0);
      assertEquals(11L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-5));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -5 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[20];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(1836);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 1836 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1));
      ScriptableObject.hasProperty((Scriptable) nativeArray0, (-4620));
      assertEquals((-1L), nativeArray0.jsGet_length());
      assertEquals((-1L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeArray0.defineOwnProperty(context0, (Object) importerTopLevel0, (ScriptableObject) importerTopLevel0, false);
      assertEquals(2L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(5);
      nativeArray0.delete((-1164));
      assertEquals(5L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(1);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 1 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.has(1, (Scriptable) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(10);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 12, 3114);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=12 MASTER=com.google.javascript.rhino.head.NativeArray@7e98ee68
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1));
      NativeArray.init(nativeArray0, false);
      nativeArray0.delete(6);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity((-11));
      NativeArray nativeArray0 = new NativeArray(0L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor(context0, nativeContinuation0);
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
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483651L);
      nativeArray0.has(123, (Scriptable) nativeArray0);
      assertEquals(2147483651L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray.getLengthProperty(context0, importerTopLevel0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(217L);
      nativeArray0.setInstanceIdValue(1, (Object) null);
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-5162L));
      nativeArray0.delete(13);
      assertEquals((-5162L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(42L);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-7101705404292871755L));
      ScriptableObject.putProperty((Scriptable) nativeArray0, 2, (Object) nativeArray0);
      assertEquals(3L, nativeArray0.jsGet_length());
      assertEquals(3L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(42L);
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      nativeArray0.put(8, (Scriptable) nativeArray0, (Object) nativeJavaClass0);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(42L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      Object object0 = nativeArray0.get(10L);
      assertNull(object0);
      assertEquals(4294967295L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray((-1));
      context0.initStandardObjects((ScriptableObject) nativeArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      // Undeclared exception!
      try { 
        nativeArray0.defineProperty("-1", (Object) null, (-2786));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2786
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeString nativeString0 = new NativeString("language version");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(16L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object[] objectArray0 = new Object[31];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.exportAsJSClass(4, (Scriptable) null, false);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      Scriptable scriptable0 = context0.initStandardObjects((ScriptableObject) nativeArray0);
      assertEquals("Array", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray((-456L));
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(1843, importerTopLevel0, false);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, importerTopLevel0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(8);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(8, importerTopLevel0, false);
      nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, importerTopLevel0, objectArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Context.toObject((Object) context0, (Scriptable) importerTopLevel0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(42L);
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      nativeArray0.put((-1994), (Scriptable) nativeArray0, (Object) nativeJavaClass0);
      assertEquals(42L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((short) (-2528));
      nativeArray0.getOwnPropertyDescriptor((Context) null, "+.nonoM(bG:tzc6,B3Y");
      assertEquals((-2528L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1775L);
      Class<Double> class0 = Double.class;
      nativeArray0.activatePrototypeMap(721);
      nativeArray0.getDefaultValue(class0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 3445, (Object) null);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(3446L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object[] objectArray0 = new Object[12];
      NativeObject nativeObject0 = new NativeObject();
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.exportAsJSClass(2056, nativeObject0, false);
      // Undeclared exception!
      try { 
        nativeArray0.getIndexIds();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 24
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1));
      nativeArray0.delete(6);
      assertEquals((-1L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity((-682));
      NativeArray nativeArray0 = new NativeArray((-579L));
      nativeArray0.delete(10);
      assertEquals((-579L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0, context0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, (-652), 170);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) synchronizer0, (ScriptableObject) idFunctionObject0, true);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity((-682));
      NativeArray nativeArray0 = new NativeArray((-579L));
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) importerTopLevel0, (ScriptableObject) importerTopLevel0, true);
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
  public void test43()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3255L);
      Context context0 = Context.getCurrentContext();
      Float float0 = new Float(1.0F);
      nativeArray0.getOwnPropertyDescriptor(context0, float0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object[] objectArray0 = new Object[20];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.defineConstProperty(nativeArray0, "0@-M#IpSVg9igz%:[");
      nativeArray0.getIndexIds();
  }
}
