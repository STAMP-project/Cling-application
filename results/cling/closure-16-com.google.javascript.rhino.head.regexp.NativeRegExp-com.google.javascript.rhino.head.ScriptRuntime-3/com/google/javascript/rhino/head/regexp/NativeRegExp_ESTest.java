/*

 * Tue Mar 03 20:38:26 GMT 2020
 */

package com.google.javascript.rhino.head.regexp;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Callable;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaAdapter;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeFunction;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
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
      Context context0 = new Context();
      context0.getElements(nativeRegExp0);
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "prefix", "}jNh}'@qX:gu)", true);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Context context0 = Context.enter();
      NativeRegExp.compileRE(context0, "error reporter", "", true);
      NativeFunction nativeFunction0 = mock(NativeFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(nativeFunction0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      // Undeclared exception!
      try { 
        JavaAdapter.getFunction(nativeFunction0, (String) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: null is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = new Context();
      context0.getElements(nativeRegExp0);
      TopLevel topLevel0 = new TopLevel();
      Synchronizer synchronizer0 = new Synchronizer(topLevel0, (Object) null);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue((-188), synchronizer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -188
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, "3N=y");
      Context context0 = new Context();
      Object[] objectArray0 = context0.getElements(nativeRegExp0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, "3N=y");
      // Undeclared exception!
      try { 
        nativeRegExp0.initPrototypeId(180);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 180
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = NativeRegExp.compileRE((Context) null, "", "", true);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      Context context0 = new Context();
      context0.getElements(topLevel0);
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("[object ");
      // Undeclared exception!
      try { 
        NativeRegExp.init(context0, nativeJavaPackage0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      String string0 = "\\u";
      Object object0 = NativeRegExp.compileRE(context0, string0, "", false);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      int int0 = nativeRegExp0.findPrototypeId("RR!>");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(1, nativeContinuation0);
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
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      int int0 = nativeRegExp0.findPrototypeId("RegExp");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeObject nativeObject0 = (NativeObject)context0.initStandardObjects(scriptableObject0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, "3N=y");
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      assertEquals("Object", scriptableObject0.getClassName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context1 = contextFactory0.enterContext(context0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context1);
      Scriptable scriptable0 = ScriptableObject.getObjectPrototype(importerTopLevel0);
      NativeRegExp nativeRegExp0 = new NativeRegExp(scriptable0, (Object) null);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(110, nativeRegExp0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 110
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, "3N=y");
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      assertFalse(importerTopLevel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      Scriptable scriptable0 = context0.newArray((Scriptable) nativeRegExp0, 27);
      NativeRegExp.init(context0, scriptable0, true);
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(1972, nativeObject0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1972
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, "3N=y");
      Context context0 = Context.enter();
      Scriptable scriptable0 = context0.newArray((Scriptable) nativeRegExp0, 27);
      NativeRegExp.init(context0, scriptable0, true);
      assertEquals(140, Context.VERSION_1_4);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      Scriptable scriptable0 = context0.newArray((Scriptable) nativeRegExp0, 27);
      NativeRegExp.init(context0, scriptable0, true);
      boolean boolean0 = nativeRegExp0.hasInstance(nativeRegExp0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeRegExp0.setInstanceIdValue(2, "3N=y");
      Context context0 = new Context();
      TopLevel topLevel0 = new TopLevel();
      Object[] objectArray0 = new Object[2];
      Object object0 = ScriptableObject.getProperty((Scriptable) topLevel0, "2((Yy4R*<b'^n:`i':<");
      objectArray0[1] = object0;
      // Undeclared exception!
      try { 
        nativeRegExp0.compile(context0, nativeContinuation0, objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, "3N=y");
      Context context0 = new Context();
      boolean boolean0 = context0.stringIsCompilableUnit("3liPz(&)!oG6ACkl");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(110).when(idFunctionObject0).methodId();
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, (Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 110
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Context context1 = Context.getCurrentContext();
      BoundFunction boundFunction0 = new BoundFunction(context1, importerTopLevel0, (Callable) null, importerTopLevel0, (Object[]) null);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(7, boundFunction0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 7
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeRegExp0.setInstanceIdValue(2, "3N=y");
      Context context0 = new Context();
      BoundFunction boundFunction0 = new BoundFunction((Context) null, nativeContinuation0, nativeContinuation0, nativeRegExp0, context0.emptyArgs);
      assertEquals("Function", boundFunction0.getClassName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, "3N=y");
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeRegExp0, "language version", (Object[]) null);
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
  public void test24()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      // Undeclared exception!
      try { 
        Context.toObject((Object) contextFactory0, (Scriptable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeRegExp0, "language version", (Object[]) null);
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
  public void test26()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = new Context();
      context0.getElements(nativeRegExp0);
      NativeRegExp.compileRE(context0, "3p>hDL6#a3@K\"Ebb", (String) null, false);
  }
}
