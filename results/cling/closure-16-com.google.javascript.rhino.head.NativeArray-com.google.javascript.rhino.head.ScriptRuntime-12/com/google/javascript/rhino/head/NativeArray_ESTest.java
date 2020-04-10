/*

 * Tue Mar 03 20:29:42 GMT 2020
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
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.NativeWith;
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
      NativeArray nativeArray0 = new NativeArray(11);
      int int0 = nativeArray0.findPrototypeId("ontinution");
      assertEquals(0, int0);
      assertEquals(11L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(3);
      NativeArray nativeArray0 = new NativeArray(1716L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(14);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 14 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(7);
      nativeArray0.put("error reporter", (Scriptable) importerTopLevel0, (Object) importerTopLevel0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2342L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-157));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -157 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Class<TopLevel> class0 = TopLevel.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.TopLevel
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2870L));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(21);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 21 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArray nativeArray0 = new NativeArray(0);
      nativeArray0.has((-4324), (Scriptable) importerTopLevel0);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) contextFactory0, (ScriptableObject) null, false);
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
      Object[] objectArray0 = new Object[10];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.delete((-5));
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Object[] objectArray0 = new Object[21];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putConstProperty(nativeArray0, " ", importerTopLevel0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(21, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1818L));
      int int0 = nativeArray0.findPrototypeId("Invalid keyword literal type: ");
      assertEquals(0, int0);
      assertEquals((-1818L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(8);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 8 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483655L);
      Class<Float> class0 = Float.class;
      ScriptableObject.getTypedProperty((Scriptable) nativeArray0, 1, class0);
      assertEquals(2147483655L, nativeArray0.jsGet_length());
      assertEquals(2147483655L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.has(2, (Scriptable) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(idFunctionObject0).hasTag(any());
      doReturn((RuntimeException) null).when(idFunctionObject0).unknown();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeArray0, context0.emptyArgs);
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
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9221120237041090560L);
      Context context0 = Context.getContext();
      nativeArray0.getOwnPropertyDescriptor(context0, context0);
      assertEquals(9221120237041090560L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(8);
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
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-3322L));
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty((Context) null, (Object) "IVRv@jm4%7$tX ", (ScriptableObject) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, "error reporter");
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      nativeArray0.has(0, (Scriptable) nativeObject0);
      assertEquals(9218868437227405312L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2544L);
      Context context0 = Context.getContext();
      context0.initStandardObjects((ScriptableObject) nativeArray0);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(2544L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.defineProperty("0", (Object) "0", (int) (byte) (-114));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -114
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(4);
      long long0 = NativeArray.getLengthProperty(context0, nativeArray0);
      assertEquals(4L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.delete(120);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      Object[] objectArray0 = new Object[12];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getContext();
      Float float0 = new Float(528.0F);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, float0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2592L));
      ScriptableObject.putProperty((Scriptable) nativeArray0, 0, (Object) null);
      assertEquals(1L, nativeArray0.getLength());
      assertEquals(1L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2342L);
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 2, (Object) importerTopLevel0);
      assertEquals(2342L, nativeArray0.jsGet_length());
      assertEquals("Array", nativeArray0.getClassName());
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Long long0 = new Long((-3335171328526686932L));
      NativeArray nativeArray0 = new NativeArray((byte) (-94));
      nativeArray0.defineProperty("Function", (Object) long0, 5);
      Float float0 = new Float((-3592.0F));
      nativeArray0.get((Object) float0);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
      Double double0 = new Double(0);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, double0);
      assertFalse(scriptableObject0.isSealed());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(importerTopLevel0, context0, 13, "language version", 13, importerTopLevel0);
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeArray0, idFunctionObject0, nativeArray0, context0.emptyArgs);
      // Undeclared exception!
      try { 
        nativeArray0.defineProperty("-_# *W+(b^SpiR P", (Object) boundFunction0, 76);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 76
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Context context0 = Context.enter();
      NativeString nativeString0 = new NativeString("language version");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(16L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      nativeArray0.exportAsJSClass(3, importerTopLevel0, true);
      // Undeclared exception!
      try { 
        ScriptableObject.putConstProperty(nativeArray0, "undefined", "undefined");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: undefined.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(12L);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(8, nativeContinuation0, true);
      Object[] objectArray0 = new Object[1];
      nativeArray0.execIdCall(idFunctionObject0, context0, nativeContinuation0, nativeContinuation0, objectArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeArray0.put(6, (Scriptable) importerTopLevel0, (Object) importerTopLevel0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      Context.toObject((Object) context0, (Scriptable) importerTopLevel0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object[] objectArray1 = nativeArray0.toArray();
      assertEquals(10, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeArray0, 1);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArray nativeArray0 = new NativeArray(0);
      NativeWith nativeWith0 = new NativeWith(importerTopLevel0, nativeArray0);
      nativeArray0.put((-470), (Scriptable) nativeArray0, (Object) nativeWith0);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      int int0 = nativeArray0.findPrototypeId("Continuation");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Scriptable scriptable0 = Context.toObject((Object) importerTopLevel0.DONTENUM, (Scriptable) importerTopLevel0);
      NativeArray nativeArray0 = new NativeArray(453L);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, scriptable0);
      ScriptableObject.putConstProperty(nativeArray0, "+>ccmZ-Gz>J5M{{hp", nativeWith0);
      nativeArray0.getIndexIds();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Context context0 = Context.getCurrentContext();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(1840700269).when(idFunctionObject0).methodId();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeArray0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1840700269
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test41()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      Scriptable scriptable0 = ScriptableObject.getFunctionPrototype(importerTopLevel0);
      NativeArray nativeArray0 = new NativeArray(294L);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(1, importerTopLevel0, true);
      nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, scriptable0, context0.emptyArgs);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 2085, (Object) nativeArray0);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(2086L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Long long0 = new Long((-3335171328526686932L));
      NativeArray nativeArray0 = new NativeArray((byte) (-94));
      nativeArray0.defineProperty("Function", (Object) long0, 5);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      synchronizer0.put(1256, (Scriptable) nativeArray0, (Object) "Function");
      assertEquals(1257L, nativeArray0.getLength());
      assertEquals(1257L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArray nativeArray0 = new NativeArray(2);
      nativeArray0.exportAsJSClass(84, importerTopLevel0, false);
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
  public void test45()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4825L);
      nativeArray0.delete(1716);
      assertEquals(4825L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      nativeArray0.delete((-788));
      assertEquals(1431655764L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArray nativeArray0 = new NativeArray(2147483648L);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty((Context) null, (Object) importerTopLevel0, (ScriptableObject) importerTopLevel0, false);
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
  public void test48()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(294L);
      Float float0 = new Float(0.0F);
      nativeArray0.getOwnPropertyDescriptor(context0, float0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.defaultPut("0aL4nT^XWr^$SZ;pWQ", context0);
      nativeArray0.getIndexIds();
  }
}
