/*

 * Tue Mar 03 18:43:29 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
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
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.WrapFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeIterator_StopIteration0, 8);
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptable(object0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type com.google.javascript.rhino.head.UniqueTag
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1);
      NativeArray nativeArray1 = (NativeArray)ScriptableObject.ensureScriptable(nativeArray0);
      assertTrue(nativeArray1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(140);
      ScriptableObject.defineConstProperty(nativeArray0, "");
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeIterator_StopIteration0, "");
      assertTrue(boolean0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "msg.change.setter.with.configurable.false";
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineFunctionProperties(stringArray0, class0, 1943291465);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"msg.change.setter.with.configurable.false\" not found in \"java.lang.String\".
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty((Scriptable) nativeError0, 160, class0);
      assertTrue(nativeError0.isEmpty());
      assertTrue(nativeError0.isExtensible());
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyInt() , any(com.google.javascript.rhino.head.Scriptable.class));
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty(scriptable0, 0, class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(140);
      nativeArray0.put("M", (Scriptable) nativeArray0, (Object) "M");
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeArray0.defineOwnProperty((Context) null, "M", nativeIterator_StopIteration0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      WrapFactory wrapFactory0 = context0.getWrapFactory();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        wrapFactory0.wrapAsJavaObject(context0, nativeArray0, "", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      Object object0 = NativeIterator.getStopIterationObject(scriptable0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(context0).toString();
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(scriptable0, context0, 1023);
      NativeArray nativeArray0 = new NativeArray(1);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      nativeArray0.defineOwnProperty(context1, "+[", scriptableObject0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      ScriptableObject.redefineProperty(nativeCall0, "writable", false);
      assertTrue(nativeCall0.isEmpty());
      assertTrue(nativeCall0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray nativeArray0 = new NativeArray(1);
      boolean boolean0 = nativeArray0.isGenericDescriptor(nativeIterator_StopIteration0);
      assertTrue(boolean0);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(scriptable0, context0, 1023);
      ImporterTopLevel.init(context0, scriptableObject0, false);
      assertFalse(scriptableObject0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        NativeError.init((Scriptable) null, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Error.
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeIterator_StopIteration0, "{+YDQi**<>D^c!Xrbq2", objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: {+YDQi**<>D^c!Xrbq2 is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeArray nativeArray0 = new NativeArray(1);
      IdFunctionObject idFunctionObject0 = nativeObject0.exportAsJSClass(13, nativeArray0, true);
      Class<Object> class0 = Object.class;
      ScriptableObject.getTypedProperty((Scriptable) idFunctionObject0, "", class0);
      assertTrue(nativeObject0.isSealed());
      assertEquals(1, idFunctionObject0.getLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty(scriptable0, "msg.while.compiling.script", class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9221120237041090560L);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(2, nativeIterator_StopIteration0, true);
      nativeArray0.initPrototypeConstructor(idFunctionObject0);
      assertTrue(nativeArray0.isSealed());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        baseFunction0.defineProperty("msg.change.setter.with.configurable.false", class0, 103);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 103
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }
}
