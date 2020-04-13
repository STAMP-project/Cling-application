/*

 * Tue Mar 03 20:30:41 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Callable;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1385L));
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId((-648));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -648
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-130));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -130 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[19];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "", (Object) "");
      assertFalse(nativeArray0.isEmpty());
      assertEquals(19L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.put("J", (Scriptable) nativeContinuation0, (Object) null);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(120L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-828));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -828 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray((-1385L));
      nativeArray0.defineOwnProperty(context0, importerTopLevel0, importerTopLevel0);
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(5L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(120);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 120 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[33];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter((Context) null);
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeArray0, (Callable) null, nativeArray0, context0.emptyArgs);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty((Context) null, boundFunction0, boundFunction0);
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
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.delete((-13));
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[33];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.defineProperty((Scriptable) nativeArray0, " in already gented code", (Object) null, 8);
      assertEquals(33L, nativeArray0.getLength());
      assertEquals(33L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(2);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(241L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(102);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 102 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      ScriptableObject.getProperty((Scriptable) nativeArray0, 8);
      assertEquals(4294967295L, nativeArray0.jsGet_length());
      assertEquals(4294967295L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(131L);
      int int0 = nativeArray0.findPrototypeId("ETJxaHaHB*D*");
      assertEquals(0, int0);
      assertEquals(131L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.has(2, (Scriptable) nativeArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, "RehTS;M.X2wU", 65279, 8);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, (Scriptable) null, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=65279 MASTER=com.google.javascript.rhino.head.NativeArray@776c694
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      Short short0 = new Short((short)588);
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor((Context) null, short0);
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
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[15];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        Context.toNumber(nativeArray0);
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
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = (NativeArray)ScriptableObject.getArrayPrototype(importerTopLevel0);
      Class<IdFunctionObject> class0 = IdFunctionObject.class;
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject(nativeArray0, "language version", class0, true);
      NativeArray.getLengthProperty(context0, nativeJavaObject0);
      assertFalse(nativeArray0.isSealed());
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(100);
      NativeArray nativeArray0 = new NativeArray(180);
      nativeArray0.has((-337), (Scriptable) null);
      assertEquals(180L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "-1", (Object) "-1");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(1, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1824L);
      nativeArray0.delete(1299);
      assertEquals(1824L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4);
      assertEquals(4L, nativeArray0.getLength());
      
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-122L));
      ScriptableObject.putProperty((Scriptable) nativeArray0, 2, (Object) nativeArray0);
      assertEquals(3L, nativeArray0.jsGet_length());
      assertEquals(3L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(916L);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 2, (Object) nativeArray0);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(916L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(5L);
      nativeArray0.setDenseOnly(false);
      boolean boolean0 = nativeArray0.contains(context0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(2L);
      nativeArray0.getOwnPropertyDescriptor(context0, nativeArray0.READONLY);
      assertEquals(2L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-4689L));
      ScriptableObject.putProperty((Scriptable) nativeArray0, "JSON", (Object) nativeArray0);
      assertEquals(0L, nativeArray0.getLength());
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object[] objectArray0 = new Object[13];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.put(18, (Scriptable) nativeArray0, (Object) nativeArray0);
      assertEquals(19L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeString nativeString0 = new NativeString("error reporter");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(14L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1824L);
      int int0 = nativeArray0.findPrototypeId("*&7xiV$t4");
      assertEquals(0, int0);
      assertEquals(1824L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(140);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(120, importerTopLevel0, true);
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

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeArray0.put((-1685), (Scriptable) importerTopLevel0, (Object) context0);
      assertEquals(5, Context.FEATURE_PARENT_PROTO_PROPERTIES);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Scriptable scriptable0 = Context.toObject((Object) context0, (Scriptable) importerTopLevel0);
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(930L);
      ScriptableObject.putProperty((Scriptable) nativeArray0, (-177), (Object) nativeArray0);
      assertEquals(930L, nativeArray0.getLength());
      assertEquals(930L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      int int0 = nativeArray0.findPrototypeId("RehTS;M.X2wU");
      assertEquals(0L, nativeArray0.jsGet_length());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(423L);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(160, nativeArray0, false);
      Context context0 = new Context();
      nativeArray0.execIdCall(idFunctionObject0, context0, nativeArray0, nativeArray0, objectArray0);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = (NativeArray)ScriptableObject.getArrayPrototype(importerTopLevel0);
      assertNotNull(nativeArray0);
      
      nativeArray0.getIndexIds();
      assertFalse(nativeArray0.isSealed());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.delete(1072693248);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(100);
      NativeArray nativeArray0 = new NativeArray(180);
      nativeArray0.delete((-1));
      assertEquals(180L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      nativeArray0.defineOwnProperty(context0, (Object) null, (ScriptableObject) importerTopLevel0, true);
      assertEquals(9218868437227405312L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(128L);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      importerTopLevel0.put("0", (Scriptable) nativeArray0, (Object) "0");
  }
}
