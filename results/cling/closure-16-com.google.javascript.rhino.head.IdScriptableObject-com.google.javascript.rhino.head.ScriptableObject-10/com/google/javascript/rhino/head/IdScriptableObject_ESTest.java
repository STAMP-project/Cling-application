/*

 * Tue Mar 03 18:43:21 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.FunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.InterpretedFunction;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeScript;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.UniqueTag;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-955L));
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        nativeArray0.defineProperty("", class0, 15);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptable(baseFunction0.PERMANENT);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type number
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      BaseFunction baseFunction1 = (BaseFunction)ScriptableObject.ensureScriptable(baseFunction0);
      assertTrue(baseFunction1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = new Context();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeIterator_StopIteration0, nativeContinuation0, nativeContinuation0, objectArray0);
      assertTrue(boundFunction0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      ScriptableObject.putConstProperty(nativeIterator_StopIteration0, "jsSet_", uniqueTag0);
      assertFalse(nativeIterator_StopIteration0.isEmpty());
      assertFalse(nativeIterator_StopIteration0.isSealed());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ImporterTopLevel", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject.putProperty((Scriptable) nativeIterator_StopIteration0, 51, (Object) nativeIterator_StopIteration0.EMPTY);
      assertFalse(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeCall0, 28);
      assertTrue(nativeCall0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeIterator_StopIteration0, "T!*R6,TH");
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      baseFunction0.setAttributes(0, (Scriptable) null, 0);
      ScriptableObject.defineConstProperty(baseFunction0, "");
      assertTrue(baseFunction0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse("jUsqi2Kk`WL39h!VI");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeIterator_StopIteration0, nativeIterator_StopIteration0, 0);
      nativeIterator_StopIteration0.defineOwnProperty((Context) null, (Object) null, scriptableObject0);
      assertFalse(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeIterator.getStopIterationObject(nativeArray0);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.lastIndexOf("msg.set.prop.no.setter");
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<String> class0 = String.class;
      String string0 = ScriptableObject.getTypedProperty((Scriptable) nativeIterator_StopIteration0, 160, class0);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1546L));
      ScriptableObject.redefineProperty(nativeArray0, "H#Iwdk=", true);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeScript.init(scriptable0, true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.exportAsJSClass(3018, (Scriptable) null, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: StopIteration.
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeIterator_StopIteration0, "language version", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: language version is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1512, "error reporter", (String) null, true);
      // Undeclared exception!
      try { 
        InterpretedFunction.createScript(interpreterData0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      Class<String> class0 = String.class;
      String string0 = ScriptableObject.getTypedProperty((Scriptable) topLevel0, "language version", class0);
      assertNull(string0);
      assertTrue(topLevel0.isExtensible());
      assertTrue(topLevel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(nativeIterator_StopIteration0.UNINITIALIZED_CONST, nativeIterator_StopIteration0.UNINITIALIZED_CONST);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      boolean boolean0 = baseFunction0.sameValue(baseFunction0, baseFunction0);
      assertTrue(baseFunction0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptableObject("SQRT1_2");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type string
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject scriptableObject0 = ScriptableObject.ensureScriptableObject(nativeIterator_StopIteration0);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject.getPropertyIds(nativeIterator_StopIteration0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ImporterTopLevel", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3100L);
      Class<FunctionObject> class0 = FunctionObject.class;
      // Undeclared exception!
      try { 
        nativeArray0.defineProperty("Vv", class0, 90);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 91
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }
}
