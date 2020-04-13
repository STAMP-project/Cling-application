/*

 * Tue Mar 03 20:30:27 GMT 2020
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
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.findPrototypeId(" of class ");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray((byte)8);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, objectArray0[2], (-659), 2);
      nativeArray0.get((-659), (Scriptable) idFunctionObject0);
      assertEquals(8L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(4);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 4 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-425));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -425 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray((-4393L));
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) importerTopLevel0, (ScriptableObject) importerTopLevel0, false);
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
  public void test06()  throws Throwable  {
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
  @Ignore
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1365L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(2147483646);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 2147483646 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      boolean boolean0 = nativeArray0.has((-2889), (Scriptable) nativeContinuation0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1696L);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 8233, (Object) null);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(8234L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArray nativeArray0 = new NativeArray(2896L);
      nativeArray0.defineOwnProperty(context0, (Object) importerTopLevel0, (ScriptableObject) importerTopLevel0, false);
      assertEquals(2896L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(57L);
      nativeArray0.delete((-661));
      assertEquals(57L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(57L);
      int int0 = nativeArray0.findPrototypeId("Unknown icode : ");
      assertEquals(0, int0);
      assertEquals(57L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1926L);
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
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(159L);
      int int0 = nativeArray0.findPrototypeId("msg.no.regexp");
      assertEquals(0, int0);
      assertEquals(159L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-3156152948152813503L));
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 8, 2);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=8 MASTER=com.google.javascript.rhino.head.NativeArray@12751a9b
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      Context context0 = Context.getCurrentContext();
      nativeArray0.getOwnPropertyDescriptor(context0, context0);
      assertEquals(1431655764L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.defineConstProperty(nativeArray0, "-1");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(4, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray((-3099L));
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      // Undeclared exception!
      try { 
        NativeArray.getLengthProperty(context0, scriptable0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.defineConstProperty(nativeArray0, " of class ");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(4, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.defineConstProperty(nativeArray0, "0");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(5, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity((-1233));
      NativeArray nativeArray0 = new NativeArray(2242L);
      ScriptableObject.deleteProperty((Scriptable) nativeArray0, 4);
      assertEquals(2242L, nativeArray0.getLength());
      assertEquals(2242L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, "-1");
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      long long0 = NativeArray.getLengthProperty(context0, nativeArray0);
      assertEquals(4L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1271L));
      nativeArray0.delete(13);
      assertEquals((-1271L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      Short short0 = new Short((short)30);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, short0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeError nativeError0 = new NativeError();
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeError0, "=\"");
      objectArray0[7] = object0;
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(8, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.put(2, (Scriptable) nativeArray0, (Object) nativeArray0);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(3L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9221120237041090560L);
      Object object0 = nativeArray0.get(13);
      assertNull(object0);
      assertEquals(9221120237041090560L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Byte byte0 = new Byte((byte)8);
      NativeArray nativeArray0 = new NativeArray(2427L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, byte0);
      assertEquals(2427L, nativeArray0.jsGet_length());
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-6422206049907525489L));
      NativeArray.init(nativeArray0, false);
      assertEquals(0L, nativeArray0.getLength());
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.put(3, (Scriptable) nativeArray0, (Object) nativeArray0);
      assertEquals(4L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeString nativeString0 = new NativeString("language version");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(16L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Context context0 = new Context();
      long long0 = NativeArray.getLengthProperty(context0, nativeError0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2);
      int int0 = nativeArray0.findPrototypeId("TypeError");
      assertEquals(0, int0);
      assertEquals(2L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(5039, (Scriptable) null, false);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      nativeArray0.execIdCall(idFunctionObject0, context0, (Scriptable) null, (Scriptable) null, objectArray0);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Class<NativeCall> class0 = NativeCall.class;
      Scriptable scriptable0 = Context.toObject((Object) context0, (Scriptable) importerTopLevel0, (Class<?>) class0);
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeArray0, 2);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object object0 = nativeArray0.get(1077, (Scriptable) nativeArray0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      Short short0 = new Short((short)0);
      nativeWith0.put((-811), (Scriptable) nativeArray0, (Object) short0);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.defineConstProperty(nativeArray0, "- 151");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(5, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.exportAsJSClass(5039, (Scriptable) null, false);
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
  public void test42()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeArray0, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9221120237041090560L);
      nativeArray0.delete(313);
      assertEquals(9221120237041090560L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
      NativeCall nativeCall0 = new NativeCall();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(9, nativeCall0, false);
      nativeArray0.defineOwnProperty(context0, nativeArray0.EMPTY, idFunctionObject0);
      assertEquals(1, idFunctionObject0.getArity());
      assertEquals(3L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeArray0.defineOwnProperty(context0, (Object) 3, (ScriptableObject) importerTopLevel0, false);
      assertEquals(4294967295L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = new Context();
      Double double0 = new Double(0);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, double0);
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray((byte)8);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, objectArray0[2], (-659), 2);
      nativeArray0.put("0|Klw&'", (Scriptable) nativeWith0, (Object) idFunctionObject0);
      assertEquals(8L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test48()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      NativeArray nativeArray1 = new NativeArray(integerArray0);
      IdFunctionObject idFunctionObject0 = nativeArray1.exportAsJSClass(8, nativeArray0, true);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }
}
