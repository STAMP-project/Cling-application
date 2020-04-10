/*

 * Tue Mar 03 20:39:48 GMT 2020
 */

package com.google.javascript.rhino.head.regexp;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.FunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.UniqueTag;
import com.google.javascript.rhino.head.regexp.NativeRegExp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeRegExp_ESTest extends NativeRegExp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      nativeRegExp0.setInstanceIdValue(3, nativeJavaClass0);
      assertTrue(nativeRegExp0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = Context.toNumber((Object) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[3];
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      objectArray0[0] = (Object) uniqueTag0;
      // Undeclared exception!
      try { 
        nativeRegExp0.compile((Context) null, delegator0, objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      double double0 = Context.toNumber(contextFactory0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = NativeRegExp.compileRE((Context) null, "1", "", false);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(1, nativeRegExp0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ImporterTopLevel importerTopLevel1 = (ImporterTopLevel)context0.initStandardObjects((ScriptableObject) importerTopLevel0);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeRegExp.compileRE(context0, "language version", "", true);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context1, (Scriptable) nativeRegExp0, "language version", context1.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: language version is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, "");
      assertFalse(nativeRegExp0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) importerTopLevel0;
      objectArray0[1] = (Object) "";
      nativeRegExp0.compile(context0, importerTopLevel0, objectArray0);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) importerTopLevel0, "e[Q|h}c-", objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: e[Q|h}c- is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(scriptable0, "msg.bad.radix", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: msg.bad.radix is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeRegExp0, nativeRegExp0, nativeObject0, context0.emptyArgs);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("\"-V;dXV)-]ZtCe*&?", classLoader0);
      double double0 = Context.toNumber(nativeJavaPackage0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) importerTopLevel0;
      objectArray0[1] = (Object) "";
      NativeRegExp nativeRegExp1 = (NativeRegExp)nativeRegExp0.compile(context0, importerTopLevel0, objectArray0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeRegExp1.setInstanceIdValue(1825, nativeContinuation0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1825
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(5, context0);
      Context context1 = Context.enter();
      ScriptableObject scriptableObject0 = context1.initStandardObjects();
      assertFalse(scriptableObject0.isSealed());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = NativeRegExp.compileRE(context0, "error reporter", "", false);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      boolean boolean0 = Context.toBoolean(importerTopLevel0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(4, nativeObject0);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeObject0, "language version", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: language version is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Delegator delegator0 = new Delegator();
      Class<FunctionObject> class0 = FunctionObject.class;
      // Undeclared exception!
      try { 
        Context.toObject((Object) contextFactory0, (Scriptable) delegator0, (Class<?>) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Delegator", e);
      }
  }
}
