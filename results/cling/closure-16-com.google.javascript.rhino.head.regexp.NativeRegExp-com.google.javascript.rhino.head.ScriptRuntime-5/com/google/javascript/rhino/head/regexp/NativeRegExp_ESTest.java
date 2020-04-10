/*

 * Tue Mar 03 20:38:03 GMT 2020
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
import com.google.javascript.rhino.head.NativeObject;
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
  public void test00()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(3, nativeRegExp0);
      assertFalse(nativeRegExp0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      NativeRegExp.compileRE(context0, "j4Cg-ncEY.4", (String) null, false);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeRegExp0, "\"e a]FFUxTATCz.}3", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: \"e a]FFUxTATCz.}3 is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Number;
      Scriptable scriptable0 = importerTopLevel0.getBuiltinPrototype(topLevel_Builtins0);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) scriptable0;
      // Undeclared exception!
      try { 
        nativeRegExp0.construct(context0, scriptable0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, contextFactory0);
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      assertFalse(importerTopLevel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      NativeRegExp.init(context0, nativeRegExp0, false);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, (Context) null, idFunctionObject0, idFunctionObject0, (Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(5, (Object) null);
      assertEquals(2, NativeRegExp.JSREG_FOLD);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "language version", "language version", false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.enter();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Error;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      nativeRegExp0.setInstanceIdValue(1, baseFunction0);
      assertEquals(2, NativeRegExp.JSREG_FOLD);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      NativeRegExp.init(context0, nativeRegExp0, false);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(idFunctionObject0).getFunctionName();
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(1).when(idFunctionObject0).methodId();
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, (Context) null, idFunctionObject0, idFunctionObject0, (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Method \"null\" called on incompatible object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      int int0 = nativeRegExp0.findPrototypeId("`}iZB@($");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = Context.enter();
      context0.initStandardObjects();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(481, nativeRegExp0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 481
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) importerTopLevel0, false);
      assertFalse(scriptableObject0.isSealed());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = new Context();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeRegExp0, nativeRegExp0, nativeRegExp0, (Object[]) null);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(130, boundFunction0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 130
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(1, (Object) null);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeRegExp0, "bad perand", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: bad perand is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Context context0 = new Context();
      Class<NativeArray> class0 = NativeArray.class;
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
  public void test15()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeRegExp.compileRE(context0, "boLan", "", false);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context1 = contextFactory0.enterContext();
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context1, (Scriptable) nativeObject0, "Zh$;ZS%D:ms", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Zh$;ZS%D:ms is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }
}
