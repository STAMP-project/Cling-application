/*

 * Tue Mar 03 18:53:26 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FunctionObject_ESTest extends FunctionObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeWith nativeWith0 = new NativeWith(nativeBoolean0, nativeBoolean0);
      Object object0 = nativeBoolean0.get((-9), (Scriptable) nativeWith0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      assertFalse(importerTopLevel0.isSealed());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      boolean boolean0 = importerTopLevel0.isConst("W5kRcCU=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("error reporter", (ClassLoader) null);
      nativeJavaPackage0.setGetterOrSetter((String) null, 13, nativeContinuation0, false);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      EcmaError ecmaError0 = null;
      try {
        ecmaError0 = new EcmaError(nativeError0, "`H}tFJ5h[l", 20, (-1499), "`H}tFJ5h[l");
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
      NativeArray nativeArray0 = new NativeArray(0L);
      Class<TopLevel> class0 = TopLevel.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.TopLevel
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ScriptableObject.putProperty((Scriptable) nativeObject0, "\",", (Object) "\",");
      boolean boolean0 = nativeObject0.containsKey("\",");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      ScriptableObject.defineConstProperty(nativeArray0, "msg.var.redecl");
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(importerTopLevel0, importerTopLevel0, (-47));
      // Undeclared exception!
      try { 
        scriptableObject0.setAttributes((String) null, (Scriptable) importerTopLevel0, (-47));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -47
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(topLevel0, topLevel0, (-292));
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(0L);
      Long long0 = new Long(0L);
      nativeArray0.put("", (Scriptable) importerTopLevel0, (Object) long0);
      assertEquals("global", importerTopLevel0.getClassName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeWith nativeWith0 = new NativeWith(nativeBoolean0, nativeBoolean0);
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        nativeWith0.getDefaultValue(class0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ScriptableObject.putProperty((Scriptable) nativeContinuation0, 1, (Object) nativeContinuation0);
      assertFalse(nativeContinuation0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeObject0, "jsGet_getClassName", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: jsGet_getClassName is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeCall nativeCall0 = new NativeCall();
      NativeArray nativeArray0 = new NativeArray(2);
      nativeCall0.putConst("error reporter", importerTopLevel0, nativeArray0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      nativeBoolean0.defineConst("=OUN&Ygm>", (Scriptable) null);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("error reporter", (ClassLoader) null);
      nativeJavaPackage0.setGetterOrSetter((String) null, (-15), nativeContinuation0, true);
      assertEquals("object", nativeContinuation0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      // Undeclared exception!
      try { 
        nativeCall0.put(7, (Scriptable) null, (Object) null);
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
  public void test19()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ScriptableObject.isTrue(nativeContinuation0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Context.toNumber(importerTopLevel0);
  }
}
