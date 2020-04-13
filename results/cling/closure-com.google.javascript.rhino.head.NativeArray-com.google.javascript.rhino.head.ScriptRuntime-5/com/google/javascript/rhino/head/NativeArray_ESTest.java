/*

 * Tue Mar 03 20:21:28 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
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
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeJavaPackage;
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
      NativeArray nativeArray0 = new NativeArray(2492L);
      int int0 = nativeArray0.findPrototypeId("Bad base: ");
      assertEquals(2492L, nativeArray0.jsGet_length());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(1498);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 1498 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[20];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Class<NativeContinuation> class0 = NativeContinuation.class;
      Scriptable scriptable0 = Context.toObject((Object) "-1", (Scriptable) nativeArray0, (Class<?>) class0);
      nativeArray0.put("-1", scriptable0, (Object) "-1");
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
      TopLevel topLevel0 = new TopLevel();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(16, topLevel0, true);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) idFunctionObject0, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: 0.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2129L));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-319));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -319 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-35L));
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty((Context) null, (Object) null, (ScriptableObject) null, false);
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
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1233L));
      Class<BaseFunction> class0 = BaseFunction.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.BaseFunction
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray(0);
      nativeArray0.defineOwnProperty(context0, (Object) importerTopLevel0, (ScriptableObject) importerTopLevel0, true);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4L);
      nativeArray0.delete((-62));
      assertEquals(4L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      int int0 = nativeArray0.findPrototypeId("E2=37DQGTl4PBX5");
      assertEquals(0, int0);
      assertEquals(1431655764L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[20];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(13);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-587L));
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
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      NativeObject nativeObject0 = new NativeObject();
      nativeArray0.get(1844, (Scriptable) nativeObject0);
      assertEquals(4294967295L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4);
      int int0 = nativeArray0.findPrototypeId("error reprter");
      assertEquals(0, int0);
      assertEquals(4L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(313L);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 1434, 2);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=1434 MASTER=com.google.javascript.rhino.head.NativeArray@277838dc
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(9);
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(10000);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, importerTopLevel0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2891L));
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
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(" -5YH", (ClassLoader) null);
      // Undeclared exception!
      try { 
        nativeArray0.defineProperty("RHINO USAGE WARNING: Missed Context.javaToJS() conversion:\nRhino runtime detected object ", (Object) nativeJavaPackage0, 719);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 719
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      nativeArray0.has(8232, scriptable0);
      assertEquals(2147483647L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      long long0 = NativeArray.getLengthProperty(context0, importerTopLevel0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(170);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1277L);
      nativeArray0.put(269, (Scriptable) nativeArray0, (Object) nativeArray0);
      assertEquals(1277L, nativeArray0.getLength());
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1420L);
      nativeArray0.setDenseOnly(false);
      Object[] objectArray0 = nativeArray0.toArray();
      assertEquals(1420, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-7101705404292871755L));
      Float float0 = new Float((-777.9900464178504));
      // Undeclared exception!
      try { 
        nativeArray0.defineProperty("language version", (Object) float0, 100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 100
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object[] objectArray0 = new Object[20];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.defineProperty((Scriptable) nativeArray0, "-1", (Object) "-1", 4);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(20, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeString nativeString0 = new NativeString("error reporter");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(14L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getCurrentContext();
      long long0 = NativeArray.getLengthProperty(context0, nativeArray0);
      assertEquals(8L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-664674077828931748L));
      int int0 = nativeArray0.findPrototypeId("decodeURI");
      assertEquals(0, int0);
      assertEquals((-664674077828931748L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object[] objectArray0 = new Object[20];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.defineProperty((Scriptable) nativeArray0, " nwlfb", (Object) nativeArray0, 1);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(20, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
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
  public void test33()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(170);
      NativeArray nativeArray1 = new NativeArray(1);
      TopLevel topLevel0 = new TopLevel();
      nativeArray0.put(4, (Scriptable) nativeArray1, (Object) topLevel0);
      assertEquals(5L, nativeArray1.jsGet_length());
      assertEquals(5L, nativeArray1.getLength());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      Scriptable scriptable0 = Context.toObject((Object) context0, (Scriptable) importerTopLevel0);
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1420L);
      Object object0 = nativeArray0.get(13);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4L);
      TopLevel topLevel0 = new TopLevel();
      nativeArray0.get(857, (Scriptable) topLevel0);
      assertEquals(4L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(170);
      int int0 = nativeArray0.findPrototypeId("S.cDvht=:F;;");
      assertEquals(170L, nativeArray0.getLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(1L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      BoundFunction boundFunction0 = new BoundFunction(context0, importerTopLevel0, (Callable) null, nativeArray0, context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(69, boundFunction0, false);
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, (Scriptable) null, boundFunction0, objectArray0);
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals("Array", nativeArray1.getClassName());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      ScriptableObject.putProperty((Scriptable) nativeArray0, 173, (Object) contextFactory0);
      assertEquals(174L, nativeArray0.getLength());
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2);
      nativeArray0.activatePrototypeMap(1784);
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
  public void test41()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeArray0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      nativeArray0.delete((-2216));
      assertEquals(2147483647L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
      NativeString nativeString0 = new NativeString("language version");
      nativeArray0.defineOwnProperty(context0, context0, nativeString0);
      assertEquals(1L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      Context context0 = new Context();
      NativeError nativeError0 = new NativeError();
      nativeArray0.defineOwnProperty(context0, "hCa}-_b-',8", nativeError0);
      assertEquals(4294967295L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(11);
      Byte byte0 = new Byte((byte)94);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, byte0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0, nativeArray0);
      synchronizer0.put("023H8D=-", (Scriptable) nativeArray0, (Object) "023H8D=-");
      assertEquals(6L, nativeArray0.getLength());
      assertEquals(6L, nativeArray0.jsGet_length());
  }
}
