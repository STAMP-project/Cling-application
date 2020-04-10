/*

 * Tue Mar 03 20:30:42 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[13];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Class<BoundFunction> class0 = BoundFunction.class;
      BoundFunction boundFunction0 = ScriptableObject.getTypedProperty((Scriptable) nativeArray0, (-1281), class0);
      assertNull(boundFunction0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483633L);
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
  public void test02()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn("").when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      long long0 = NativeArray.getLengthProperty(context0, scriptable0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeArray nativeArray0 = new NativeArray(8);
      nativeArray0.put("*=", (Scriptable) nativeObject0, (Object) "*=");
      assertEquals(8L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-634));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -634 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeArray nativeArray1 = new NativeArray(3658L);
      IdFunctionObject idFunctionObject0 = nativeArray1.exportAsJSClass(150, nativeArray0, true);
      NativeArray nativeArray2 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, nativeArray1, nativeArray1, context0.emptyArgs);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      Integer integer0 = new Integer(37);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty((Context) null, (Object) integer0, (ScriptableObject) importerTopLevel0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
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
  public void test08()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(3740L);
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      // Undeclared exception!
      try { 
        nativeArray1.defineOwnProperty(context0, (Object) nativeIterator_StopIteration0, (ScriptableObject) nativeArray0, false);
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
  public void test09()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.delete((-58));
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-3156152948152813503L));
      int int0 = nativeArray0.findPrototypeId(" ");
      assertEquals(0, int0);
      assertEquals((-3156152948152813503L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4965L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(7);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 7 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      NativeArray.setMaximumInitialCapacity((-1625));
      NativeArray nativeArray0 = new NativeArray(1);
      nativeArray0.get(14, scriptable0);
      assertEquals(1L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      long long0 = NativeArray.getLengthProperty(context0, importerTopLevel0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.findPrototypeId("S%Nt_Ch -25i6");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(importerTopLevel0, false);
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.has(8, (Scriptable) nativeGenerator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(4308L);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 110, 180);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=110 MASTER=com.google.javascript.rhino.head.NativeArray@6d7dc9f1
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(8);
      nativeArray0.setDenseOnly(false);
      nativeArray0.delete(4);
      assertEquals(8L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      nativeArray0.getOwnPropertyDescriptor(context0, context0);
      assertEquals(2147483647L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      nativeArray0.has(16, (Scriptable) topLevel0);
      assertEquals(2147483647L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      Context context0 = Context.getContext();
      Long long0 = new Long((-1));
      nativeArray0.getOwnPropertyDescriptor(context0, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(110);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "94", (Object) "94");
      assertFalse(nativeArray0.isEmpty());
      assertEquals(110L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10000);
      nativeArray0.delete(10000);
      assertEquals(10000L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(110);
      nativeArray0.getIndexIds();
      assertEquals(110L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(72L);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 0, (Object) nativeArray0);
      assertEquals(72L, nativeArray0.getLength());
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 120, (Object) context0.VERSION_1_1);
      boolean boolean0 = nativeArray0.containsAll(nativeArray0);
      assertEquals(121L, nativeArray0.jsGet_length());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(4);
      Float float0 = new Float(1.0F);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, float0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn("-1").when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      long long0 = NativeArray.getLengthProperty(context0, scriptable0);
      assertEquals(4294967295L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(462);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 462, (Object) nativeArray0);
      assertEquals(463L, nativeArray0.jsGet_length());
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Context context0 = new Context();
      NativeString nativeString0 = new NativeString("language version");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(16L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.exportAsJSClass(160, importerTopLevel0, false);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0, importerTopLevel0);
      nativeArray0.getOwnPropertyDescriptor(context0, synchronizer0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(2, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      int int0 = nativeArray0.findPrototypeId("HM;gM?8K_");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(20, nativeArray0, false);
      Context context0 = Context.getContext();
      Object[] objectArray0 = new Object[9];
      nativeArray0.execIdCall(idFunctionObject0, context0, nativeArray0, (Scriptable) null, objectArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeObject nativeObject0 = new NativeObject();
      NativeArray nativeArray0 = new NativeArray(1451L);
      nativeArray0.put(180, (Scriptable) nativeObject0, (Object) context0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Context.toObject((Object) context0, (Scriptable) importerTopLevel0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.containsAll(nativeArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(170);
      ScriptableObject.putProperty((Scriptable) nativeArray0, (-20), (Object) nativeArray0);
      assertEquals(170L, nativeArray0.getLength());
      assertEquals(170L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.findPrototypeId("t1$bj2GMuq|w");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "+?:42U-v", (Object) context0);
      nativeArray0.getIndexIds();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(5003L);
      nativeArray0.activatePrototypeMap(2429);
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
  public void test42()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-3156152948152813503L));
      nativeArray0.delete(0);
      assertEquals((-3156152948152813503L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      nativeArray0.delete(13);
      assertEquals(4294967295L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9223372036854775794L);
      Double double0 = new Double(99.0);
      NativeCall nativeCall0 = new NativeCall();
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty((Context) null, (Object) double0, (ScriptableObject) nativeCall0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test45()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Double double0 = new Double(11);
      nativeArray0.getOwnPropertyDescriptor(context0, double0);
  }
}
