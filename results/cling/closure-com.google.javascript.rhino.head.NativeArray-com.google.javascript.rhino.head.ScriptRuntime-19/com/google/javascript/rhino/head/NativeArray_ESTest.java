/*

 * Tue Mar 03 20:31:42 GMT 2020
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
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
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
      NativeCall nativeCall0 = new NativeCall();
      NativeArray nativeArray0 = new NativeArray(13);
      Context context0 = Context.enter();
      nativeArray0.defineOwnProperty(context0, (Object) "~0", (ScriptableObject) nativeCall0, false);
      assertEquals(13L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1780L);
      BaseFunction baseFunction0 = new BaseFunction();
      nativeArray0.get((-2035083366), (Scriptable) baseFunction0);
      assertEquals(1780L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArray nativeArray0 = new NativeArray(7);
      nativeArray0.put("", (Scriptable) importerTopLevel0, (Object) context0);
      assertEquals(7L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(92, nativeBoolean0, true);
      Context context0 = Context.getContext();
      Object[] objectArray1 = new Object[1];
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, (Scriptable) null, objectArray1);
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals("Array", nativeArray1.getClassName());
      assertEquals(1L, nativeArray1.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getCurrentContext();
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) importerTopLevel0, false);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(877);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 877 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(13L);
      nativeArray0.delete((-521));
      assertEquals(13L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(150);
      ScriptableObject.putProperty((Scriptable) nativeArray0, " GMT+", (Object) " GMT+");
      assertEquals(150L, nativeArray0.getLength());
      assertEquals(150L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(170);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(11);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 11 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2517L));
      int int0 = nativeArray0.findPrototypeId("InternalError");
      assertEquals(0, int0);
      assertEquals((-2517L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.has(0, (Scriptable) nativeCall0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(idFunctionObject0).hasTag(any());
      doReturn((RuntimeException) null).when(idFunctionObject0).unknown();
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = Context.enter();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Scriptable scriptable0 = Context.toObject((Object) "language version", (Scriptable) nativeIterator_StopIteration0);
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor(context0, scriptable0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10000);
      nativeArray0.setInstanceIdValue(1, (Object) null);
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[3];
      NativeArray nativeArray0 = new NativeArray(stringArray0);
      Byte byte0 = Byte.valueOf((byte) (-115));
      ScriptableObject.defineProperty((Scriptable) nativeArray0, "1x!AXh ", (Object) byte0, 8);
      assertEquals(3L, nativeArray0.getLength());
      assertEquals(3L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray nativeArray0 = new NativeArray(4294967323L);
      nativeArray0.has(2, (Scriptable) nativeIterator_StopIteration0);
      assertEquals(4294967323L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      nativeArray0.delete(1971);
      assertEquals(1L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      Context context0 = new Context();
      NativeObject nativeObject0 = new NativeObject();
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
  public void test21()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-10L));
      ScriptableObject.putProperty((Scriptable) nativeArray0, 8, (Object) nativeArray0);
      assertEquals(9L, nativeArray0.getLength());
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(7);
      Float float0 = new Float(135.40032);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0, float0);
      nativeArray0.put(2, (Scriptable) nativeArray0, (Object) synchronizer0);
      assertEquals(7L, nativeArray0.getLength());
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      Object object0 = nativeArray0.get(12);
      assertNull(object0);
      assertEquals(2147483647L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(180L);
      Short short0 = new Short((short)101);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, short0);
      assertNull(scriptableObject0);
      assertEquals(180L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(782L);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "-1", (Object) importerTopLevel0);
      assertEquals(782L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Context context0 = new Context();
      NativeString nativeString0 = new NativeString("language version");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(16L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Context context0 = new Context();
      NativeObject nativeObject0 = new NativeObject();
      long long0 = NativeArray.getLengthProperty(context0, nativeObject0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2977L);
      int int0 = nativeArray0.findPrototypeId("bR*+Fo+i~");
      assertEquals(2977L, nativeArray0.jsGet_length());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(6, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(665, baseFunction0, false);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, (Context) null, baseFunction0, idFunctionObject0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArray nativeArray0 = new NativeArray(5);
      nativeArray0.put(0, (Scriptable) importerTopLevel0, (Object) importerTopLevel0);
      assertFalse(importerTopLevel0.isEmpty());
      assertEquals(5L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Scriptable scriptable0 = Context.toObject((Object) context0, (Scriptable) scriptableObject0);
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Context context0 = Context.getCurrentContext();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray nativeArray0 = new NativeArray(10000L);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(3, nativeIterator_StopIteration0, true);
      NativeError nativeError0 = NativeError.make(context0, nativeIterator_StopIteration0, idFunctionObject0, objectArray0);
      ScriptableObject.getProperty((Scriptable) nativeError0, 110);
      assertEquals("Array", idFunctionObject0.getFunctionName());
      assertEquals(10000L, nativeArray0.getLength());
      assertEquals(10000L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(686);
      Class<Object> class0 = Object.class;
      ScriptableObject.getTypedProperty((Scriptable) nativeArray0, 1211, class0);
      assertEquals(686L, nativeArray0.getLength());
      assertEquals(686L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(686);
      Context context0 = Context.getContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      scriptableObject0.put((-1699), (Scriptable) nativeArray0, (Object) nativeContinuation0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-4568956265895094861L));
      int int0 = nativeArray0.findPrototypeId("=%|H/.3>&-54");
      assertEquals((-4568956265895094861L), nativeArray0.getLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4);
      Class<Object> class0 = Object.class;
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeContinuation0, class0, 8, 160);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "+(`fRg2el", (Object) idFunctionObject0);
      assertEquals(4L, nativeArray0.getLength());
      assertEquals(4L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2962L));
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) nativeArray0, true);
      nativeArray0.put(3794, (Scriptable) scriptableObject0, (Object) null);
      assertEquals(3795L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      nativeArray0.delete(1);
      assertEquals(2L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      nativeArray0.delete(3);
      assertEquals(4294967295L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2430079312244744221L));
      Context context0 = new Context();
      Float float0 = new Float(2.302585092994046);
      NativeError nativeError0 = new NativeError();
      nativeArray0.defineOwnProperty(context0, (Object) float0, (ScriptableObject) nativeError0, false);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431650791L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1268L);
      Byte byte0 = new Byte((byte)9);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "0l#<sw", (Object) byte0);
      assertEquals(1268L, nativeArray0.jsGet_length());
      assertEquals(1268L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(686);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "X", (Object) null);
      nativeArray0.getIndexIds();
  }
}
