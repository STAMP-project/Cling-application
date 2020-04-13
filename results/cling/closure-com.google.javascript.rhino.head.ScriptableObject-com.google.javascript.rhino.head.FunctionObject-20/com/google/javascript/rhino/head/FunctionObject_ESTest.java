/*

 * Tue Mar 03 18:55:03 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
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
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FunctionObject_ESTest extends FunctionObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(true, "mk%Rca?zn2l(", (ClassLoader) null);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeJavaPackage nativeJavaPackage1 = nativeJavaPackage0.forcePackage("language version", importerTopLevel0);
      nativeJavaPackage1.defineConst("x0_n@Y", nativeJavaPackage0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      // Undeclared exception!
      try { 
        topLevel0.defineProperty("retainAll", (Object) "retainAll", 680);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 680
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Class<Method> class0 = Method.class;
      Method method0 = ScriptableObject.getTypedProperty((Scriptable) importerTopLevel0, 4, class0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-3667L));
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      nativeArray0.setGetterOrSetter((String) null, 11, synchronizer0, false);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      boolean boolean0 = topLevel0.isConst("retainAll");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) topLevel0, 28);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(13);
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage((ClassLoader) null);
      // Undeclared exception!
      try { 
        nativeArray0.setGetterOrSetter("", 582, nativeJavaTopPackage0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = new Context();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      IdFunctionObject idFunctionObject0 = null;
      try {
        idFunctionObject0 = new IdFunctionObject(baseFunction0, classLoader0, (-197), "error reporter", 0, (Scriptable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = new Context();
      BoundFunction boundFunction0 = new BoundFunction(context0, baseFunction0, baseFunction0, baseFunction0, context0.emptyArgs);
      assertFalse(boundFunction0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("R&C9*-$.uI8qhLek");
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeCall0, nativeJavaPackage0, 8);
      assertFalse(scriptableObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(importerTopLevel0, (Object) null, 1791);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put("WAZ", (Scriptable) topLevel0, (Object) topLevel0);
      assertEquals("object", topLevel0.getTypeOf());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Class<Delegator> class0 = Delegator.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) importerTopLevel0, (Class<?>) class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.Delegator
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeBoolean0, false);
      Synchronizer synchronizer0 = new Synchronizer(nativeGenerator0);
      nativeGenerator0.put(13, (Scriptable) nativeBoolean0, (Object) synchronizer0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = new Context();
      TopLevel topLevel0 = new TopLevel();
      Scriptable scriptable0 = context0.newObject((Scriptable) topLevel0);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, scriptable0, "language version", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: language version is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1389L));
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeArray0, (Class<?>) null);
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
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      BaseFunction baseFunction0 = new BaseFunction();
      nativeBoolean0.putConst("msg.dup.param.strict", baseFunction0, baseFunction0);
      assertEquals("Boolean", nativeBoolean0.getClassName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        baseFunction0.putConst("isFrozen", (Scriptable) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      importerTopLevel0.defineConst("error reporter", (Scriptable) null);
      assertFalse(importerTopLevel0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeContinuation0.setGetterOrSetter("&O+X/T!%", 0, delegator0, false);
      assertFalse(nativeContinuation0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Context context0 = Context.enter();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("msg.set.prop.no.setter");
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        FunctionObject.convertArg(context0, (Scriptable) nativeJavaPackage0, (Object) nativeIterator_StopIteration0, 2);
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
  public void test22()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ScriptableObject.isTrue(nativeContinuation0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(12);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor(context0, nativeContinuation0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }
}
