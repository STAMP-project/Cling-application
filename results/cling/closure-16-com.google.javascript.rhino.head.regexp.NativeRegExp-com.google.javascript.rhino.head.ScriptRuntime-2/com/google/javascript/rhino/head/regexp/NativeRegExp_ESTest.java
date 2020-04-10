/*

 * Tue Mar 03 20:37:29 GMT 2020
 */

package com.google.javascript.rhino.head.regexp;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.regexp.NativeRegExp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeRegExp_ESTest extends NativeRegExp_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Object[] objectArray0 = new Object[1];
      Scriptable scriptable0 = nativeRegExp0.compile(context0, scriptableObject0, objectArray0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeRegExp0, context0, 6, "o", 2, scriptable0);
      boolean boolean0 = nativeRegExp0.hasInstance(idFunctionObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ContextFactory contextFactory0 = new ContextFactory();
      nativeRegExp0.setInstanceIdValue(3, contextFactory0);
      assertEquals(1, NativeRegExp.MATCH);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("3'}lkg1IRDj#;");
      nativeRegExp0.hasInstance(nativeJavaPackage0);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "error reporter", "getUserData", true);
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
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).getDefaultValue(nullable(java.lang.Class.class));
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Object[] objectArray0 = new Object[4];
      objectArray0[1] = (Object) scriptable0;
      // Undeclared exception!
      try { 
        nativeRegExp0.compile((Context) null, scriptable0, objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = Context.enter((Context) null);
      TopLevel topLevel0 = new TopLevel();
      NativeRegExp.compileRE((Context) null, "", "", true);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) topLevel0, "error reporter", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: error reporter is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Context context0 = new Context();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeRegExp0.setInstanceIdValue(4, importerTopLevel0);
      // Undeclared exception!
      try { 
        nativeRegExp0.initPrototypeId(150);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 150
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Context context0 = new Context();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(1, context0);
      assertFalse(nativeRegExp0.isSealed());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.findPrototypeId("~)%`#Z");
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(170, "object");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 170
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = Context.enter();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) nativeContinuation0, true);
      Scriptable scriptable0 = context0.initStandardObjects(scriptableObject0);
      assertFalse(nativeContinuation0.isEmpty());
      assertSame(scriptableObject0, scriptable0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = Context.enter((Context) null);
      TopLevel topLevel0 = new TopLevel();
      context0.initStandardObjects((ScriptableObject) topLevel0);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) topLevel0, "error reporter", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: error reporter is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("3'}lkg1IRDj#;");
      Context context0 = Context.getCurrentContext();
      context0.initStandardObjects((ScriptableObject) null, false);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue((-2979), nativeJavaPackage0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -2979
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(scriptable0, "ignoreCase", objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: ignoreCase is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, "I?:_5");
      assertEquals("object", nativeRegExp0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext((Context) null);
      BoundFunction boundFunction0 = new BoundFunction((Context) null, nativeRegExp0, nativeRegExp0, nativeRegExp0, context0.emptyArgs);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Context context0 = new Context();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      importerTopLevel0.hasInstance(nativeRegExp0);
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "language version", ")!tH", false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeRegExp0.setInstanceIdValue(1, importerTopLevel0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(8);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      context0.initStandardObjects((ScriptableObject) nativeArray0, false);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue((-1), nativeRegExp0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -1
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Error;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      Object object0 = ScriptableObject.getProperty((Scriptable) baseFunction0, 1253);
      Context.toBoolean(object0);
      assertFalse(baseFunction0.isSealed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) context0;
      NativeRegExp nativeRegExp1 = (NativeRegExp)nativeRegExp0.compile(context0, scriptableObject0, objectArray0);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Class<ImporterTopLevel> class0 = ImporterTopLevel.class;
      // Undeclared exception!
      try { 
        Context.toObject((Object) context0, (Scriptable) nativeRegExp0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeRegExp.compileRE(context0, "language version", "", false);
      NativeArray nativeArray0 = new NativeArray(110);
      Context context1 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeArray0, "language version", context1.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: language version is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }
}
