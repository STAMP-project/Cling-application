/*

 * Tue Mar 03 20:19:52 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
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
  @Ignore
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getContext();
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, "-1");
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4096L);
      NativeError nativeError0 = new NativeError();
      nativeArray0.get((-3550), (Scriptable) nativeError0);
      assertEquals(4096L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9221120237041090560L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(375);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 375 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.defineProperty((Scriptable) nativeArray0, "", (Object) "", 8);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(2618L);
      nativeArray0.put("error reporter", (Scriptable) importerTopLevel0, (Object) context0);
      assertEquals(2618L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-1471));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -1471 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2741L);
      Context context0 = Context.enter();
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
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4);
      nativeArray0.delete((-3409));
      assertEquals(4L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3348L);
      nativeArray0.defaultPut(" where it expected String, Number, Boolean or Scriptable instance. Please check your code for missing Context.javaToJS() call.", " where it expected String, Number, Boolean or Scriptable instance. Please check your code for missing Context.javaToJS() call.");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1688L));
      int int0 = nativeArray0.findPrototypeId("=>");
      assertEquals(0, int0);
      assertEquals((-1688L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getContext();
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) nativeObject0, (ScriptableObject) nativeObject0, false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(2);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(180);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(3);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 3 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      Object object0 = nativeArray0.get(1390);
      assertEquals(2147483647L, nativeArray0.jsGet_length());
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[12];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.findPrototypeId("InternalError");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(120);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(idFunctionObject0).hasTag(any());
      doReturn((RuntimeException) null).when(idFunctionObject0).unknown();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(170);
      nativeArray0.delete(0);
      assertEquals(170L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      Context context0 = new Context();
      nativeArray0.getOwnPropertyDescriptor(context0, context0);
      assertEquals(2147483647L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(2598L);
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
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(8);
      Double double0 = new Double(4);
      nativeArray0.setInstanceIdValue(1, double0);
      assertEquals(4L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.defineProperty((Scriptable) nativeArray0, "Unexpected return type ", (Object) "Unexpected return type ", 8);
      assertEquals(8L, nativeArray0.getLength());
      assertEquals(8L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967341L);
      ScriptableObject.hasProperty((Scriptable) nativeArray0, 4);
      assertEquals(4294967341L, nativeArray0.jsGet_length());
      assertEquals(4294967341L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
      long long0 = NativeArray.getLengthProperty(context0, nativeArray0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-326L));
      Double double0 = new Double(4);
      nativeArray0.setInstanceIdValue(1, double0);
      assertEquals(4L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 0, (Object) nativeArray0);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(1L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(160);
      Double double0 = new Double(110);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, double0);
      assertEquals(160L, nativeArray0.getLength());
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.defineProperty((Scriptable) nativeArray0, "-1", (Object) "-1", 8);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(1, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-491L));
      ScriptableObject.putProperty((Scriptable) nativeArray0, 13, (Object) nativeArray0);
      assertEquals(14L, nativeArray0.jsGet_length());
      assertEquals(14L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-320L));
      NativeArray.init(nativeArray0, false);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 6, (Object) null);
      assertEquals(7L, nativeArray0.getLength());
      assertEquals(7L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeString nativeString0 = new NativeString("language version");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(16L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
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
  public void test32()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      NativeArray nativeArray1 = new NativeArray(2);
      IdFunctionObject idFunctionObject0 = nativeArray1.exportAsJSClass(17, nativeArray0, true);
      Context context0 = Context.enter();
      nativeArray0.execIdCall(idFunctionObject0, context0, synchronizer0, synchronizer0, objectArray0);
      assertEquals(1L, nativeArray0.jsGet_length());
      assertEquals(2L, nativeArray1.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
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
  public void test34()  throws Throwable  {
      Context context0 = Context.getContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Context.toObject((Object) context0, (Scriptable) scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      Double double0 = new Double(13);
      Object[] objectArray0 = new Object[2];
      ScriptableObject.putProperty((Scriptable) nativeArray0, 1722, (Object) double0);
      nativeArray0.toArray(objectArray0);
      assertEquals(1723L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-38366372719436721L));
      ScriptableObject.putProperty((Scriptable) nativeArray0, (-799), (Object) nativeArray0);
      assertEquals((-798L), nativeArray0.getLength());
      assertEquals((-798L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeArray nativeArray1 = new NativeArray(2);
      IdFunctionObject idFunctionObject0 = nativeArray1.exportAsJSClass(17, nativeArray0, true);
      nativeArray0.checkPropertyChange("We0#:8zOGL/Iz[uA,", nativeArray1, idFunctionObject0);
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals(2L, nativeArray1.getLength());
      assertEquals(2L, nativeArray1.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(85L);
      nativeArray0.activatePrototypeMap(2622);
      // Undeclared exception!
      try { 
        nativeArray0.getIds();
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
      NativeArray nativeArray0 = new NativeArray((-65L));
      nativeArray0.delete(19);
      assertEquals((-65L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      nativeArray0.delete((-1922));
      assertEquals(2147483647L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test41()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
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
  public void test42()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArray.setMaximumInitialCapacity((-111));
      NativeArray nativeArray0 = new NativeArray(2L);
      Context context0 = new Context();
      Double double0 = new Double(Double.POSITIVE_INFINITY);
      nativeArray0.defineOwnProperty(context0, (Object) double0, (ScriptableObject) importerTopLevel0, false);
      assertEquals(2L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.defaultPut("0Fd_b~M VC", objectArray0[4]);
      nativeArray0.getIndexIds();
  }
}
