/*

 * Tue Mar 03 20:37:34 GMT 2020
 */

package com.google.javascript.rhino.head.regexp;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaScriptException;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.regexp.NativeRegExp;
import com.google.javascript.rhino.head.regexp.RegExpImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeRegExp_ESTest extends NativeRegExp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = Context.toNumber((Object) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      context0.getElements(scriptableObject0);
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "error reporter", "\"Q-)F", false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = new Context();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) context0;
      // Undeclared exception!
      try { 
        nativeRegExp0.call(context0, nativeRegExp0, nativeRegExp0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      context0.initStandardObjects((ScriptableObject) nativeRegExp0, true);
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeRegExp0, nativeRegExp0, nativeRegExp0, context0.emptyArgs);
      JavaScriptException javaScriptException0 = new JavaScriptException(boundFunction0);
      Context.toNumber(javaScriptException0);
      assertEquals("com.google.javascript.rhino.head.JavaScriptException: function () {\n\t[native code, arity=0]\n}\n", javaScriptException0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = new Context();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      context0.initStandardObjects((ScriptableObject) nativeRegExp0);
      NativeRegExp nativeRegExp1 = (NativeRegExp)context0.initStandardObjects((ScriptableObject) nativeRegExp0);
      assertEquals(2, NativeRegExp.PREFIX);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      RegExpImpl regExpImpl0 = new RegExpImpl();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(13, regExpImpl0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 13
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(120);
      NativeArray nativeArray1 = (NativeArray)context0.initStandardObjects((ScriptableObject) nativeArray0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("error reporter", (ClassLoader) null);
      double double0 = Context.toNumber(nativeJavaPackage0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = NativeRegExp.compileRE((Context) null, "m", "m", false);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = new Context();
      Object object0 = NativeRegExp.compileRE(context0, "error reporter", "", false);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeRegExp0, nativeRegExp0, nativeRegExp0, context0.emptyArgs);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(140, boundFunction0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 140
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = Context.enter();
      Class<IdFunctionObject> class0 = IdFunctionObject.class;
      // Undeclared exception!
      try { 
        Context.toObject((Object) context0, (Scriptable) null, (Class<?>) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      Scriptable scriptable0 = nativeRegExp0.compile(context0, nativeRegExp0, context0.emptyArgs);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, scriptable0, "parseFlqat", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: parseFlqat is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      context0.getElements(scriptableObject0);
      NativeRegExp.compileRE(context0, "", "", true);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      context0.getElements(scriptableObject0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
  }
}
