/*

 * Tue Mar 03 20:39:38 GMT 2020
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
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.regexp.NativeRegExp;
import com.google.javascript.rhino.head.regexp.RegExpImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeRegExp_ESTest extends NativeRegExp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, (Object) null);
      double double0 = Context.toNumber((Object) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = Context.toNumber("compile");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      context0.getElements(nativeRegExp0);
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "error reporter", "O7}xZdFpp", false);
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
      NativeRegExp.init((Context) null, nativeRegExp0, false);
      nativeRegExp0.setInstanceIdValue(2, (Object) null);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, (Object) null);
      // Undeclared exception!
      try { 
        nativeRegExp0.initPrototypeId(13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Object object0 = NativeRegExp.compileRE(context0, "", "", true);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.enter();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(1, context0);
      assertEquals(9, Context.FEATURE_STRICT_EVAL);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.findPrototypeId("object");
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(160, "object");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 160
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeRegExp.init((Context) null, nativeArray0, true);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Context) null, (Scriptable) nativeRegExp0, "=z8\"wG8!", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: =z8\"wG8! is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, (Object) null);
      Context context0 = Context.enter();
      NativeRegExp nativeRegExp1 = (NativeRegExp)context0.initStandardObjects((ScriptableObject) nativeRegExp0);
      assertFalse(nativeRegExp1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeRegExp nativeRegExp1 = (NativeRegExp)nativeRegExp0.compile(context0, nativeRegExp0, context0.emptyArgs);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context1 = contextFactory0.enterContext();
      RegExpImpl regExpImpl0 = new RegExpImpl();
      int[] intArray0 = new int[2];
      nativeRegExp1.executeRegExp(context1, nativeRegExp0, regExpImpl0, "'fE=0Ye ^>$nHSD)m>Vm", intArray0, 21);
      nativeRegExp0.setInstanceIdValue(2, nativeRegExp1);
      assertFalse(nativeRegExp0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeRegExp nativeRegExp0 = new NativeRegExp(importerTopLevel0, (Object) null);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(120).when(idFunctionObject0).methodId();
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 120
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Synchronizer synchronizer0 = new Synchronizer(importerTopLevel0);
      BoundFunction boundFunction0 = new BoundFunction(context0, synchronizer0, synchronizer0, importerTopLevel0, context0.emptyArgs);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Context.toBoolean((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = Context.enter();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Object;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      nativeRegExp0.setInstanceIdValue(1, baseFunction0);
      assertEquals("object", nativeRegExp0.getTypeOf());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeRegExp nativeRegExp0 = new NativeRegExp(importerTopLevel0, (Object) null);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn("msg.ctor.not.found").when(idFunctionObject0).getFunctionName();
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(1).when(idFunctionObject0).methodId();
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Method \"msg.ctor.not.found\" called on incompatible object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Context context0 = Context.enter();
      context0.initStandardObjects((ScriptableObject) null, true);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Object;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      nativeRegExp0.setInstanceIdValue(1, baseFunction0);
      assertTrue(nativeRegExp0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.String;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      Scriptable scriptable0 = ScriptableObject.getObjectPrototype(baseFunction0);
      BoundFunction boundFunction0 = new BoundFunction(context0, scriptable0, baseFunction0, importerTopLevel0, context0.emptyArgs);
      BoundFunction boundFunction1 = new BoundFunction(context0, boundFunction0, baseFunction0, importerTopLevel0, context0.emptyArgs);
      assertTrue(baseFunction0.isSealed());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = NativeRegExp.compileRE(context0, "language version", (String) null, false);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).getDefaultValue(nullable(java.lang.Class.class));
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) scriptable0;
      // Undeclared exception!
      try { 
        nativeRegExp0.call(context0, scriptable0, scriptable0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(1, (Object) null);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeRegExp0, "error reporter", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: error reporter is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, (Object) null);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Context) null, (Scriptable) nativeRegExp0, "=z8\"wG8!", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: =z8\"wG8! is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Object object0 = ScriptableObject.getProperty((Scriptable) importerTopLevel0, 1057);
      // Undeclared exception!
      try { 
        Context.toObject(object0, (Scriptable) importerTopLevel0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeRegExp.compileRE(context0, "language version", (String) null, true);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Context) null, (Scriptable) nativeRegExp0, "=z8\"wG8!", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: =z8\"wG8! is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }
}
