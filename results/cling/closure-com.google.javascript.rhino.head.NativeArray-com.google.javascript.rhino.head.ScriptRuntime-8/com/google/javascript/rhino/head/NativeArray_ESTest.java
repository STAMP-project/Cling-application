/*

 * Tue Mar 03 20:28:02 GMT 2020
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
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeObject;
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
  @Ignore
  public void test00()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      int int0 = nativeArray0.findPrototypeId("__parent__");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(130);
      ScriptableObject.getProperty((Scriptable) nativeArray0, (-15));
      assertEquals(130L, nativeArray0.jsGet_length());
      assertEquals(130L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(168L);
      nativeArray0.defaultPut("", context0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeArray nativeArray0 = new NativeArray((-1137L));
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArray0, true);
      nativeArray0.put("error reporter", (Scriptable) importerTopLevel0, (Object) nativeGenerator0);
      assertEquals((-1137L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-21));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -21 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1175L));
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      NativeCall nativeCall0 = new NativeCall();
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, nativeCall0, nativeCall0);
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
      NativeArray nativeArray0 = new NativeArray((-332L));
      Class<NativeContinuation> class0 = NativeContinuation.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeContinuation
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
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
  public void test08()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeCall nativeCall0 = new NativeCall();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      boolean boolean0 = nativeArray0.has(13, (Scriptable) nativeCall0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      Context context0 = Context.getContext();
      BaseFunction baseFunction0 = new BaseFunction();
      NativeArray nativeArray0 = new NativeArray(170);
      Double double0 = new Double(13);
      nativeArray0.defineOwnProperty(context0, (Object) double0, (ScriptableObject) baseFunction0, true);
      assertEquals(170L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.delete((-1));
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0);
      nativeArray0.defaultPut(" (", " (");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(13);
      int int0 = nativeArray0.findPrototypeId("EzU~k#[61P!L9;[}}");
      assertEquals(0, int0);
      assertEquals(13L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1829L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(753);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 753 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.has(0, (Scriptable) nativeObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(idFunctionObject0).hasTag(any());
      doReturn((RuntimeException) null).when(idFunctionObject0).unknown();
      Context context0 = Context.enter();
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
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      NativeArray nativeArray0 = new NativeArray(4294967304L);
      nativeArray0.getOwnPropertyDescriptor(context0, contextFactory0);
      assertEquals(4294967304L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(168L);
      ScriptableObject.putProperty((Scriptable) nativeArray0, (-755), (Object) "language version");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(9);
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
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Long long0 = new Long(0);
      nativeArray0.defaultPut("invalid decl type: ", long0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(1, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.defaultPut("Infinity", "Infinity");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(9, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, "java.lang.Float");
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(11);
      NativeArray nativeArray0 = new NativeArray(168L);
      ScriptableObject.putProperty((Scriptable) nativeArray0, (-755), (Object) "language version");
      assertEquals(168L, nativeArray0.getLength());
      assertEquals(168L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeArray nativeArray1 = (NativeArray)context0.initStandardObjects((ScriptableObject) nativeArray0);
      assertEquals(0L, nativeArray1.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-258L));
      nativeArray0.delete(5399);
      assertEquals((-258L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(5);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      nativeArray0.put(7, (Scriptable) nativeArray0, (Object) nativeJavaTopPackage0);
      assertEquals(8L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(835L);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 18, (Object) nativeArray0);
      assertEquals(835L, nativeArray0.jsGet_length());
      assertTrue(nativeArray0.isEmpty());
      assertEquals(835L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967304L);
      Object object0 = nativeArray0.get(4);
      assertNull(object0);
      assertEquals(4294967304L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-4938676049251384304L));
      Long long0 = new Long(8);
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor((Context) null, long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-924L));
      NativeArray.init(nativeArray0, false);
      assertEquals(0L, nativeArray0.jsGet_length());
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(5);
      nativeArray0.defaultPut("-mD", "-mD");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(8);
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      nativeArray0.put(6, (Scriptable) nativeArray1, (Object) importerTopLevel0);
      assertEquals(7L, nativeArray1.jsGet_length());
      assertTrue(nativeArray1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Context context0 = new Context();
      NativeString nativeString0 = new NativeString("error reporter");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(14L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      long long0 = NativeArray.getLengthProperty(context0, nativeArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(227L);
      int int0 = nativeArray0.findPrototypeId("yxGnaq\"}2");
      assertEquals(0, int0);
      assertEquals(227L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeError nativeError0 = new NativeError();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(108, nativeError0, true);
      Context context0 = Context.enter();
      Object[] objectArray1 = new Object[1];
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, nativeError0, idFunctionObject0, objectArray1);
      assertEquals("Array", nativeArray1.getClassName());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test37()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Class<NativeJavaPackage> class0 = NativeJavaPackage.class;
      Scriptable scriptable0 = Context.toObject((Object) class0, (Scriptable) importerTopLevel0, (Class<?>) class0);
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeArray nativeArray0 = new NativeArray(4);
      boolean boolean0 = nativeArray0.contains(baseFunction0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1);
      ScriptableObject.getProperty((Scriptable) nativeArray0, 11);
      assertEquals(1L, nativeArray0.getLength());
      assertEquals(1L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1708L);
      int int0 = nativeArray0.findPrototypeId("X{7^2WSFOE6E");
      assertEquals(0, int0);
      assertEquals(1708L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeObject nativeObject0 = new NativeObject();
      nativeArray0.defaultPut("+=F9Y'2j#K-uu52etJ.", nativeObject0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      nativeArray0.put(65536, (Scriptable) nativeWith0, (Object) nativeArray0);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getContext();
      NativeArray nativeArray1 = (NativeArray)context0.scratchScriptable;
      Double double0 = new Double(1);
      // Undeclared exception!
      try { 
        nativeArray0.put(2138, (Scriptable) nativeArray1, (Object) double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2476L);
      nativeArray0.activatePrototypeMap(1266);
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
      NativeArray nativeArray0 = new NativeArray(4217L);
      nativeArray0.delete(2);
      assertEquals(4217L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
      BaseFunction baseFunction0 = new BaseFunction();
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) baseFunction0, true);
      assertEquals(4L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      nativeArray0.defineOwnProperty(context0, (Object) importerTopLevel0, (ScriptableObject) importerTopLevel0, false);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test48()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(7);
      Short short0 = new Short((short)38);
      nativeArray0.getOwnPropertyDescriptor(context0, short0);
      assertEquals(7L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeArray nativeArray1 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = nativeArray1.exportAsJSClass(13, nativeArray0, true);
      nativeArray1.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeArray0, context0.emptyArgs);
  }
}
