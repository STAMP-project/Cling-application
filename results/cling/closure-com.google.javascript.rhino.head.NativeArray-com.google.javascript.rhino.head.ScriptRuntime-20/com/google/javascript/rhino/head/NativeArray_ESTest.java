/*

 * Tue Mar 03 20:32:44 GMT 2020
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
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeIterator;
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
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(910L);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(22).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: com.google.javascript.rhino.head.Undefined@601311b1 is not a function, it is undefined.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(6);
      int int0 = nativeArray0.findPrototypeId("y~xS aJeK*");
      assertEquals(0, int0);
      assertEquals(6L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object object0 = nativeArray0.get((-223), (Scriptable) null);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(910L);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(34);
      NativeArray nativeArray0 = new NativeArray(910L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(3101);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 3101 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeString nativeString0 = new NativeString("error reporter");
      NativeArray nativeArray0 = new NativeArray(910L);
      NativeObject nativeObject0 = new NativeObject();
      nativeArray0.put("language version", (Scriptable) nativeString0, (Object) nativeObject0);
      assertEquals(910L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-1410));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -1410 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = new Context();
      NativeObject nativeObject0 = new NativeObject();
      NativeArray nativeArray0 = new NativeArray((-1));
      nativeArray0.defineOwnProperty(context0, (Object) null, (ScriptableObject) nativeObject0, false);
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(23);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 23 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(130);
      boolean boolean0 = nativeArray0.has((-672), (Scriptable) importerTopLevel0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getContext();
      TopLevel topLevel0 = new TopLevel();
      nativeArray0.defineOwnProperty(context0, context0, topLevel0);
      assertEquals(3L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(543L);
      nativeArray0.delete((-183));
      assertEquals(543L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.defaultPut(" ", " ");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      int int0 = nativeArray0.findPrototypeId("b5&0-'Uz&9/D}XA3G");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[20];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1792L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(674);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 674 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(34);
      NativeArray nativeArray0 = new NativeArray(910L);
      NativeObject nativeObject0 = new NativeObject();
      int int0 = nativeArray0.indexOf(nativeObject0);
      assertEquals((-1), int0);
      assertEquals(910L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      int int0 = nativeArray0.findPrototypeId("JavaException");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeArray0, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, context0, 5, 110);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=5 MASTER=com.google.javascript.rhino.head.NativeArray@55f0486c
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(11);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      importerTopLevel0.put(100, (Scriptable) nativeArray0, (Object) context0);
      nativeArray0.delete(0);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(39);
      NativeArray nativeArray0 = new NativeArray(2582L);
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor((Context) null, nativeJavaClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeJavaClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = Context.enter((Context) null);
      NativeArray nativeArray0 = new NativeArray(13);
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
  public void test23()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.defaultPut("7 ", "7 ");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(2057L);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, "0(0/R'bLW{G");
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      boolean boolean0 = nativeArray0.has(100, (Scriptable) importerTopLevel0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      context0.initStandardObjects((ScriptableObject) nativeArray0, false);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4);
      nativeArray0.delete(12);
      assertEquals(4L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(120);
      Object[] objectArray0 = nativeArray0.getAllIds();
      assertEquals(120L, nativeArray0.getLength());
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-35));
      ScriptableObject.putProperty((Scriptable) nativeArray0, 1, (Object) nativeArray0);
      assertEquals(2L, nativeArray0.jsGet_length());
      assertEquals(2L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray nativeArray0 = new NativeArray(120);
      nativeIterator_StopIteration0.put(16, (Scriptable) nativeArray0, (Object) nativeArray0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(4, nativeIterator_StopIteration0, false);
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals(120L, nativeArray0.getLength());
      
      Class<Byte> class0 = Byte.class;
      Object object0 = nativeArray0.getDefaultValue(class0);
      assertEquals(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,", object0);
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      Byte byte0 = new Byte((byte)2);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, byte0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-6879582898840692748L));
      NativeArray.init(nativeArray0, true);
      assertEquals(0L, nativeArray0.jsGet_length());
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Context context0 = Context.enter();
      NativeString nativeString0 = new NativeString("error reporter");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(14L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      NativeCall nativeCall0 = new NativeCall();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(1953, nativeCall0, false);
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, (Scriptable) null, (Scriptable) null, context0.emptyArgs);
      assertEquals(0L, nativeArray1.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeString nativeString0 = new NativeString("error reporter");
      NativeArray nativeArray0 = new NativeArray(910L);
      nativeArray0.put(592, (Scriptable) nativeString0, (Object) nativeString0);
      assertFalse(nativeString0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Scriptable scriptable0 = Context.toObject((Object) context0, (Scriptable) importerTopLevel0);
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(11);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      importerTopLevel0.put(100, (Scriptable) nativeArray0, (Object) context0);
      nativeArray0.toArray(context0.emptyArgs);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Double double0 = new Double(2479.0);
      nativeArray0.put((-305), (Scriptable) nativeArray0, (Object) double0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.findPrototypeId("1j8Tx_D<OSC");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      Context context0 = Context.enter();
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.defaultPut("+IJ1", scriptable0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test41()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(910L);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(7).when(idFunctionObject0).methodId();
      doReturn((Object) null).when(idFunctionObject0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((String) null, (String) null).when(idFunctionObject0).toString();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
      assertNotNull(object0);
      assertEquals(910L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(180).when(idFunctionObject0).methodId();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 180
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray1.getIndexIds();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(480, nativeArray1, true);
      Context context0 = Context.getContext();
      NativeArray nativeArray2 = (NativeArray)nativeArray1.execIdCall(idFunctionObject0, context0, nativeArray0, nativeArray0, integerArray0);
      assertEquals(10, integerArray0.length);
      assertEquals(10L, nativeArray2.getLength());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(11);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      importerTopLevel0.put(100, (Scriptable) nativeArray0, (Object) context0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 160, (Object) null);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(161L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.exportAsJSClass(966, (Scriptable) null, false);
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
  public void test46()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(11);
      nativeArray0.delete(0);
      assertEquals(11L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9221120237041090560L);
      nativeArray0.delete(142);
      assertEquals(9221120237041090560L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test48()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Float float0 = Float.valueOf((float) 5);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, float0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4096L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Long long0 = new Long(150);
      nativeArray0.defineOwnProperty(context0, (Object) long0, (ScriptableObject) importerTopLevel0, false);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Array;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      assertNotNull(baseFunction0);
      
      nativeArray0.defineOwnProperty(context0, (Object) contextFactory0, (ScriptableObject) baseFunction0, false);
      assertFalse(baseFunction0.isSealed());
      assertEquals(4096L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.defaultPut("0", "9sW");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(1, integerArray0.length);
  }
}
