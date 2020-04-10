/*

 * Tue Mar 03 18:53:51 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Callable;
import com.google.javascript.rhino.head.ConsString;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.MemberBox;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FunctionObject_ESTest extends FunctionObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeWith nativeWith0 = new NativeWith(importerTopLevel0, importerTopLevel0);
      // Undeclared exception!
      try { 
        Context.toNumber(nativeWith0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeString nativeString0 = new NativeString((CharSequence) null);
      Synchronizer synchronizer0 = new Synchronizer(nativeString0);
      nativeString0.defineConst("!D?^=%I[", synchronizer0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.checkValidAttributes(38);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 38
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Object object0 = ScriptableObject.getProperty((Scriptable) importerTopLevel0, 4);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      assertEquals("object", importerTopLevel0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      boolean boolean0 = topLevel0.isConst(":D(~.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeIterator_StopIteration0, 4);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("containsKey");
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod((MemberBox[]) null, "containsKey");
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeJavaMethod0, nativeJavaPackage0, 0, 67);
      // Undeclared exception!
      try { 
        nativeJavaMethod0.setGetterOrSetter("language version", (-23), idFunctionObject0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // language version
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) nativeContinuation0, (ScriptableObject) nativeContinuation0, false);
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
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object[] objectArray0 = ScriptableObject.getPropertyIds(nativeIterator_StopIteration0);
      Context context0 = new Context();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeIterator_StopIteration0, (Callable) null, (Scriptable) null, objectArray0);
      assertEquals("Function", boundFunction0.getClassName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<BoundFunction> class0 = BoundFunction.class;
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeIterator_StopIteration0, class0, (-5));
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeObject nativeObject0 = (NativeObject)ScriptableObject.buildDataDescriptor(nativeIterator_StopIteration0, (Object) null, (-12));
      assertFalse(nativeObject0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<NativeIterator.StopIteration> class0 = NativeIterator.StopIteration.class;
      NativeArray nativeArray0 = new NativeArray((-535L));
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("b", classLoader0);
      nativeArray0.put("b", (Scriptable) nativeJavaPackage0, (Object) class0);
      assertEquals((-535L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeContinuation0, "function", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: function is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<ConsString> class0 = ConsString.class;
      NativeCall nativeCall0 = new NativeCall();
      NativeCall nativeCall1 = new NativeCall();
      nativeCall1.putConst("%E@?=]<^X.A;[", nativeCall0, class0);
      assertTrue(nativeCall0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      // Undeclared exception!
      try { 
        topLevel0.putConst("com.google.j vascript.rhino.head.ScriptableObject", (Scriptable) null, "com.google.j vascript.rhino.head.ScriptableObject");
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
  public void test17()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeWith nativeWith0 = new NativeWith(nativeIterator_StopIteration0, nativeIterator_StopIteration0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeIterator_StopIteration0, nativeWith0, 2, "msg.varargs.fun", 1, nativeWith0);
      idFunctionObject0.defineConst("error reporter", nativeIterator_StopIteration0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      Context context0 = Context.getContext();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      nativeJavaTopPackage0.setGetterOrSetter((String) null, 853, (Callable) null, true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.put(115, (Scriptable) topLevel0, (Object) topLevel0);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10L);
      Class<Integer> class0 = Integer.class;
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
  public void test22()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber((-1.2234022673458702));
      ScriptableObject.isFalse(nativeNumber0);
  }
}
