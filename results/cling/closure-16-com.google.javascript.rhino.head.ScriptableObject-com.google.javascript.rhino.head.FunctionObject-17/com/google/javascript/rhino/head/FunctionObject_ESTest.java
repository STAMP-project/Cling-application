/*

 * Tue Mar 03 18:54:44 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.FunctionObject;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaObject;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeScript;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FunctionObject_ESTest extends FunctionObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ContextFactory contextFactory0 = new ContextFactory();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeContinuation0, contextFactory0, 95);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<NativeScript> class0 = NativeScript.class;
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeArray0, class0, 12);
      assertFalse(scriptableObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeContinuation0.defineProperty(">>>", (Object) null, 1982);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1982
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray((-6742553186979055798L));
      Object object0 = nativeArray0.get(3194, scriptable0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      boolean boolean0 = nativeContinuation0.isConst("hasInstance");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[12];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.has(66, (Scriptable) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        nativeBoolean0.setGetterOrSetter("{^9nI`2H`e^ N", (-1091), delegator0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // {^9nI`2H`e^ N
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BaseFunction baseFunction0 = null;
      try {
        baseFunction0 = new BaseFunction((Scriptable) null, (Scriptable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        baseFunction0.getDefaultValue(class0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        nativeBoolean0.getDefaultValue(class0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeCall nativeCall0 = new NativeCall();
      nativeError0.defineConst("toString", nativeCall0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeIterator_StopIteration0, (Object) null, 494, 4580);
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeBoolean0, idFunctionObject0, 81);
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<NativeScript> class0 = NativeScript.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      NativeArray nativeArray0 = new NativeArray(methodArray0);
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      // Undeclared exception!
      try { 
        nativeArray0.put("toString", (Scriptable) nativeJavaObject0, (Object) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeJavaObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      Class<Byte> class0 = Byte.class;
      // Undeclared exception!
      try { 
        nativeBoolean0.getDefaultValue(class0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeBoolean0, (String) null, context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: null is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeArray nativeArray0 = new NativeArray((-965L));
      nativeArray0.putConst("language version", nativeContinuation0, context0.VERSION_1_6);
      assertEquals(8, Context.FEATURE_STRICT_VARS);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      // Undeclared exception!
      try { 
        importerTopLevel0.putConst((String) null, (Scriptable) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray((-3301L));
      nativeArray0.defineConst("language version", scriptable0);
      assertEquals((-3301L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeObject nativeObject1 = new NativeObject();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeObject0.put(962, (Scriptable) nativeObject1, (Object) nativeContinuation0);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeContinuation0, nativeContinuation0, nativeContinuation0, context0.emptyArgs);
      // Undeclared exception!
      try { 
        FunctionObject.convertArg(context0, (Scriptable) nativeContinuation0, (Object) boundFunction0, 2);
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
  public void test20()  throws Throwable  {
      Class<ImporterTopLevel> class0 = ImporterTopLevel.class;
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(scriptable0, class0, 5);
      Class<NativeNumber> class1 = NativeNumber.class;
      // Undeclared exception!
      try { 
        scriptableObject0.getDefaultValue(class1);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeNumber
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }
}
