/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 08:18:23 GMT 2019
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
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaScriptException;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.WrappedException;
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
      nativeRegExp0.hasInstance(nativeRegExp0);
      Context context0 = Context.getCurrentContext();
      Object object0 = NativeRegExp.compileRE(context0, "error reporter", (String) null, true);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Context context0 = new Context();
      NativeRegExp.compileRE(context0, "%^?^q1W^~YgQ.+N+", (String) null, true);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeContinuation0, "(", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: ( is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) nativeRegExp0, true);
      nativeRegExp0.hasInstance(scriptableObject0);
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "encodeURIComponent", "language version", false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeRegExp.init(context0, nativeArray0, false);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(150, nativeArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 150
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      ImporterTopLevel importerTopLevel1 = (ImporterTopLevel)context0.initStandardObjects((ScriptableObject) importerTopLevel0);
      assertFalse(importerTopLevel1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ContextFactory contextFactory0 = new ContextFactory();
      Context context1 = contextFactory0.enterContext(context0);
      ScriptableObject scriptableObject0 = context1.initStandardObjects();
      assertFalse(scriptableObject0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Context context0 = new Context();
      context0.setLanguageVersion(130);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      boolean boolean0 = Context.toBoolean(nativeRegExp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      int int0 = nativeRegExp0.findPrototypeId("WCNp~Q8~");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("9jwLzKv%xVRayRk}", classLoader0);
      JavaScriptException javaScriptException0 = new JavaScriptException(nativeJavaPackage0);
      WrappedException wrappedException0 = new WrappedException(javaScriptException0);
      assertEquals("com.google.javascript.rhino.head.WrappedException: Wrapped com.google.javascript.rhino.head.JavaScriptException: [JavaPackage 9jwLzKv%xVRayRk}]", wrappedException0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = Context.toBoolean("object");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        Context.toObject((Object) contextFactory0, (Scriptable) delegator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Delegator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      double double0 = Context.toNumber(context0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeRegExp.compileRE(context0, "WCNp~Q8~", "", false);
      Context context1 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(130);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context1, (Scriptable) nativeArray0, "$DtVpMU&)yk{QFv", context1.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: $DtVpMU&)yk{QFv is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(130);
      NativeRegExp.init(context0, nativeArray0, false);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeArray0, "$DtVpMU&)yk{QFv", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: $DtVpMU&)yk{QFv is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(130);
      context0.initStandardObjects((ScriptableObject) nativeArray0, true);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.hasInstance(nativeArray0);
      NativeRegExp.init(context0, nativeArray0, false);
      assertEquals((-1), Context.VERSION_UNKNOWN);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeRegExp0, nativeRegExp0, nativeRegExp0, context0.emptyArgs);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(160, importerTopLevel0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 160
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeRegExp0.defineOwnProperty(context0, "", nativeContinuation0);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(41, (Object) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 41
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(context0).toString();
      JavaScriptException javaScriptException0 = new JavaScriptException(context0);
      WrappedException wrappedException0 = new WrappedException(javaScriptException0);
      NativeObject nativeObject0 = new NativeObject();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(28, nativeObject0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 28
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeRegExp.compileRE(context0, "language version", "m", false);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context1 = new Context();
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
  @Ignore
  public void test20()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeRegExp.compileRE(context0, "WCNp~Q8~", "", false);
      Context context1 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(130);
      context1.initStandardObjects((ScriptableObject) nativeArray0, true);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.hasInstance(nativeArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Scriptable scriptable0 = ScriptableObject.getObjectPrototype(importerTopLevel0);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(5, scriptable0);
      nativeRegExp0.findPrototypeId("object");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(idFunctionObject0).getFunctionName();
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(2).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Method \"null\" called on incompatible object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn("f3ecHfS&#").when(idFunctionObject0).getFunctionName();
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(1).when(idFunctionObject0).methodId();
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Method \"f3ecHfS&#\" called on incompatible object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }
}
