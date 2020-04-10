/*

 * Tue Mar 03 20:38:35 GMT 2020
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
  public void test00()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Synchronizer synchronizer0 = new Synchronizer(nativeRegExp0, importerTopLevel0);
      nativeRegExp0.setInstanceIdValue(3, synchronizer0);
      assertFalse(nativeRegExp0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = new Context();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeRegExp0, nativeRegExp0, nativeRegExp0, context0.emptyArgs);
      BoundFunction boundFunction1 = new BoundFunction(context0, nativeRegExp0, nativeRegExp0, nativeRegExp0, context0.emptyArgs);
      assertTrue(boundFunction1.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Context context1 = new Context();
      context1.getElements(importerTopLevel0);
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "", "language version", true);
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
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      Object[] objectArray0 = new Object[4];
      objectArray0[1] = (Object) context0;
      // Undeclared exception!
      try { 
        nativeRegExp0.compile(context0, nativeRegExp0, objectArray0);
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
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE((Context) null, "-+&\"9t(H3OR>B001", "", false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: Unterminated parenthetical 
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.findPrototypeId("RegExp");
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue((-43), "RegExp");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -43
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(5, (Object) null);
      // Undeclared exception!
      try { 
        nativeRegExp0.initPrototypeId(8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = NativeRegExp.compileRE((Context) null, "N", "", false);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      int int0 = nativeRegExp0.findPrototypeId("(I)Z");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      int int0 = nativeRegExp0.findPrototypeId("prefix");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Context context0 = new Context();
      ContextFactory contextFactory0 = context0.getFactory();
      TopLevel topLevel0 = new TopLevel();
      // Undeclared exception!
      try { 
        Context.toObject((Object) contextFactory0, (Scriptable) topLevel0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeObject nativeObject0 = (NativeObject)context0.initStandardObjects(scriptableObject0);
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = new Context();
      NativeRegExp.compileRE(context0, "", "", true);
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeObject0, "nNHV@_d^Lo>_->", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: nNHV@_d^Lo>_-> is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Context) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Object[] objectArray0 = new Object[6];
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Context) null, scriptable0, "/=", objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: /= is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeRegExp.init(context0, nativeContinuation0, false);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(170).when(idFunctionObject0).methodId();
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context1, nativeContinuation0, nativeContinuation0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 170
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = Context.enter();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      NativeArray nativeArray0 = (NativeArray)context0.newArray((Scriptable) nativeRegExp0, 50);
      NativeRegExp.init(context0, nativeArray0, false);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(5, (Object) null);
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeRegExp.init(context0, nativeContinuation0, false);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn("error reporter").when(idFunctionObject0).getFunctionName();
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(2).when(idFunctionObject0).methodId();
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context1, nativeContinuation0, nativeContinuation0, context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Method \"error reporter\" called on incompatible object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      int int0 = nativeRegExp0.findPrototypeId(":A-9@cPY");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeRegExp0, nativeRegExp0, nativeRegExp0, context0.emptyArgs);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue((-363), boundFunction0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -363
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeRegExp0.defineOwnProperty(context0, importerTopLevel0, importerTopLevel0);
      assertEquals((-1), Context.VERSION_UNKNOWN);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Context context0 = Context.enter();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      NativeRegExp.compileRE(context0, "language version", (String) null, false);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeRegExp0, "Dalvik", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Dalvik is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Object;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      context0.getElements(baseFunction0);
  }
}
