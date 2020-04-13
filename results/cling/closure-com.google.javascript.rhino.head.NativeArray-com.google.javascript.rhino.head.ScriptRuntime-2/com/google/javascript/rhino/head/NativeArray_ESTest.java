/*

 * Tue Mar 03 20:19:53 GMT 2020
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
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeNumber;
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
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(100, nativeBoolean0, true);
      NativeError.make(context0, nativeArray0, idFunctionObject0, objectArray0);
      assertEquals("Array", idFunctionObject0.getFunctionName());
      assertEquals(1, idFunctionObject0.getArity());
      assertEquals(1, idFunctionObject0.getLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeArray nativeArray0 = new NativeArray((-9133518327554766460L));
      nativeArray0.get((-217), (Scriptable) baseFunction0);
      assertEquals((-9133518327554766460L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(1431655764);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 1431655764 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeArray nativeArray0 = new NativeArray((-1));
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      synchronizer0.put("java.lang.Object", (Scriptable) nativeObject0, (Object) 2);
      assertEquals((-1L), nativeArray0.jsGet_length());
      assertEquals((-1L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(110L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-4700));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -4700 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Short short0 = new Short((short)5);
      BaseFunction baseFunction0 = new BaseFunction(nativeArray0, nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty((Context) null, (Object) short0, (ScriptableObject) baseFunction0, true);
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
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(2101);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 2101 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(10);
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) importerTopLevel0, false);
      assertEquals(10L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(" ").when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      long long0 = NativeArray.getLengthProperty(context0, scriptable0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.findPrototypeId("(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/Ref;");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      TopLevel topLevel0 = new TopLevel();
      int int0 = nativeArray0.getAttributes(8, (Scriptable) topLevel0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(13);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(12);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 12 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      int int0 = nativeArray0.findPrototypeId("*c)dXK;d}%B1w");
      assertEquals(2147483647L, nativeArray0.getLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeArray0, 4);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, context0, 3553, "language version", 1294, nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=3553 MASTER=com.google.javascript.rhino.head.NativeArray@6429b58d
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      nativeArray0.getOwnPropertyDescriptor(context0, contextFactory0);
      assertEquals(4294967295L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(12);
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
  public void test18()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ContextFactory contextFactory0 = new ContextFactory();
      Context context1 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context1);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Array;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(baseFunction0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      long long0 = NativeArray.getLengthProperty(context0, scriptable0);
      assertEquals(0L, long0);
      assertFalse(baseFunction0.isSealed());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1947L);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor((Context) null, (Object) null);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity((-2215));
      NativeArray nativeArray0 = new NativeArray(4096L);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 4, (Object) null);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(120);
      nativeArray0.delete(10);
      assertEquals(120L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(5);
      nativeArray0.delete(13);
      assertEquals(5L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1094L);
      Object[] objectArray0 = nativeArray0.getIds();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-9133518327554766460L));
      Object object0 = nativeArray0.defaultGet("s fy");
      ScriptableObject.putProperty((Scriptable) nativeArray0, 6, object0);
      assertEquals(7L, nativeArray0.jsGet_length());
      assertEquals(7L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1094L);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 0, (Object) null);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(1094L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      Object object0 = nativeArray0.get((long) 4);
      assertEquals(1431655764L, nativeArray0.jsGet_length());
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeArray nativeArray0 = new NativeArray((-1));
      nativeArray0.put(11, (Scriptable) nativeArray0, (Object) nativeObject0);
      assertEquals(12L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeString nativeString0 = new NativeString("error reporter");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(14L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1507L));
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(5, importerTopLevel0, false);
      ScriptableObject scriptableObject0 = idFunctionObject0.getOwnPropertyDescriptor(context0, nativeArray0);
      assertEquals((-1507L), nativeArray0.jsGet_length());
      assertNull(scriptableObject0);
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(129L);
      int int0 = nativeArray0.findPrototypeId("In3finity");
      assertEquals(0, int0);
      assertEquals(129L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.defineProperty((Scriptable) nativeArray0, "Dalvik", (Object) "Dalvik", 0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(6, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(14, baseFunction0, true);
      Context context0 = Context.enter();
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, objectArray0);
      assertEquals(1, idFunctionObject0.getArity());
      assertEquals(3L, nativeArray1.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeArray0.put(250, (Scriptable) importerTopLevel0, (Object) context0);
      assertEquals("Array", nativeArray0.getClassName());
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = (NativeArray)ScriptableObject.getArrayPrototype(importerTopLevel0);
      Context.toObject((Object) context0, (Scriptable) nativeArray0);
      assertFalse(nativeArray0.isSealed());
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(160);
      int int0 = nativeArray0.indexOf(nativeArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Scriptable scriptable0 = Context.toObject((Object) "*f7", (Scriptable) baseFunction0);
      NativeArray nativeArray0 = new NativeArray(1);
      nativeArray0.get(65279, scriptable0);
      assertEquals(1L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, (-645), (Object) nativeArray0);
      assertFalse(nativeArray0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1);
      int int0 = nativeArray0.findPrototypeId("m_}/s1_+@V7Y");
      assertEquals(0, int0);
      assertEquals(1L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "-9\"!M.", (Object) "-9\"!M.");
      assertEquals(9L, nativeArray0.jsGet_length());
      assertEquals(9L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(5, nativeArray0, false);
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, nativeArray0, idFunctionObject0, context0.emptyArgs);
      assertEquals(0L, nativeArray1.getLength());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject.putProperty((Scriptable) nativeArray0, 8, (Object) null);
      nativeIterator_StopIteration0.put(2, (Scriptable) nativeArray0, (Object) null);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(9L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.activatePrototypeMap(128);
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
  public void test43()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.delete((-3580));
      assertEquals("object", nativeArray0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(37);
      NativeArray nativeArray0 = new NativeArray(5208L);
      nativeArray0.delete(114);
      assertEquals(5208L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Short short0 = new Short((short)242);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, short0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeNumber nativeNumber0 = new NativeNumber(4);
      nativeArray0.defineOwnProperty((Context) null, (Object) "oP3", (ScriptableObject) nativeNumber0, true);
      assertEquals(6L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
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
  @Ignore
  public void test48()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("language version");
      NativeArray nativeArray0 = new NativeArray(48L);
      // Undeclared exception!
      try { 
        ScriptableObject.defineProperty((Scriptable) nativeArray0, "8", (Object) nativeJavaPackage0, 1073741824);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1073741824
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        ScriptableObject.defineProperty((Scriptable) nativeArray0, "09{:yx/dN&.=oJ;", (Object) "09{:yx/dN&.=oJ;", (-7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -7
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray((-2363L));
      context0.initStandardObjects((ScriptableObject) nativeArray0, false);
      assertEquals(0L, nativeArray0.jsGet_length());
      assertEquals(0L, nativeArray0.getLength());
  }
}
