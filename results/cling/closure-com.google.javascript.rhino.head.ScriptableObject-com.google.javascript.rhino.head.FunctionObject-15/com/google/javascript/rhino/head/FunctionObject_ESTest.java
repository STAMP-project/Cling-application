/*

 * Tue Mar 03 18:54:56 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Callable;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.FunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJSON;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FunctionObject_ESTest extends FunctionObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.checkValidAttributes(5555);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5555
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<Boolean> class0 = Boolean.class;
      Boolean boolean0 = ScriptableObject.getTypedProperty((Scriptable) nativeObject0, 1, class0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      assertFalse(importerTopLevel0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      boolean boolean0 = nativeError0.isConst("#At{zu&9%c");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      Synchronizer synchronizer0 = new Synchronizer(nativeCall0);
      // Undeclared exception!
      try { 
        nativeCall0.setGetterOrSetter("msg.const.redecl", 1, synchronizer0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // msg.const.redecl
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      nativeCall0.setGetterOrSetter((String) null, (-86), (Callable) null, true);
      assertFalse(nativeCall0.isSealed());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
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
  public void test08()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("b=(R9+6xrv6\"FtbXyQL");
      nativeObject0.defineConst("hasTag", nativeJavaPackage0);
      assertFalse(nativeObject0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      ScriptRuntime.NoSuchMethodShim scriptRuntime_NoSuchMethodShim0 = new ScriptRuntime.NoSuchMethodShim(baseFunction0, "error reporter");
      ScriptableObject scriptableObject1 = ScriptableObject.buildDataDescriptor(scriptableObject0, scriptRuntime_NoSuchMethodShim0, (-1309));
      assertFalse(scriptableObject1.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      Member member0 = mock(Member.class, new ViolatedAssumptionAnswer());
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(scriptable0, member0, 180);
      assertEquals("object", scriptableObject0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<NativeJSON> class0 = NativeJSON.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Error;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      baseFunction0.call(context0, importerTopLevel0, importerTopLevel0, methodArray0);
      assertEquals(4, methodArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      Class<NativeJSON> class0 = NativeJSON.class;
      NativeArray nativeArray0 = new NativeArray(2131L);
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeJSON
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      ScriptableObject.putProperty((Scriptable) baseFunction0, 17, (Object) baseFunction0);
      assertFalse(baseFunction0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) topLevel0, "error reporter", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: error reporter is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber((-0.6835976908608751));
      // Undeclared exception!
      try { 
        nativeNumber0.getDefaultValue((Class<?>) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeContinuation0.putConst("}s6O$llq]M8&G", nativeObject0, nativeObject0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeContinuation0.putConst("jsFunction_getClassName", (Scriptable) null, (Object) null);
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
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      TopLevel topLevel0 = new TopLevel();
      topLevel0.defineConst((String) null, scriptable0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      nativeCall0.setGetterOrSetter((String) null, (-86), (Callable) null, false);
      assertEquals("object", nativeCall0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      nativeIterator_StopIteration0.put(16, scriptable0, (Object) importerTopLevel0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Scriptable scriptable0 = ScriptableObject.getArrayPrototype(importerTopLevel0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.RegExp;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      FunctionObject.convertArg(context0, scriptable0, (Object) baseFunction0, (Class<?>) class0);
  }
}
