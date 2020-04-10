/*

 * Tue Mar 03 20:39:31 GMT 2020
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
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.regexp.NativeRegExp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeRegExp_ESTest extends NativeRegExp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Context context0 = Context.enter();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Object object0 = NativeRegExp.compileRE(context0, "", "", false);
      assertNotNull(object0);
      
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("Packages");
      boolean boolean0 = nativeRegExp0.hasInstance(nativeJavaPackage0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, nativeRegExp0);
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      nativeRegExp0.setInstanceIdValue(3, nativeJavaClass0);
      assertEquals("object", nativeRegExp0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn("GS:<2{").when(idFunctionObject0).getFunctionName();
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(1).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Method \"GS:<2{\" called on incompatible object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "1(#zVk2@Qq6", (String) null, false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: Unterminated parenthetical 
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) importerTopLevel0, "error reporter", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: error reporter is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("language version");
      boolean boolean0 = nativeRegExp0.hasInstance(nativeJavaPackage0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      Object object0 = NativeRegExp.compileRE(context0, "5", (String) null, false);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      int int0 = nativeRegExp0.findPrototypeId("GS:<2{");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      Class<Object> class0 = Object.class;
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
  public void test09()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray((-422));
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue((-422), nativeArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -422
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, nativeRegExp0);
      Context context0 = Context.enter();
      Scriptable scriptable0 = context0.newArray((Scriptable) nativeRegExp0, 23);
      NativeRegExp.init(context0, scriptable0, false);
      assertEquals(170, Context.VERSION_1_7);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeRegExp.compileRE(context0, "language version", (String) null, true);
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("language version");
      boolean boolean0 = nativeRegExp0.hasInstance(nativeJavaPackage0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(150).when(idFunctionObject0).methodId();
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, (Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 150
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(idFunctionObject0).getFunctionName();
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(2).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Method \"null\" called on incompatible object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("prefix");
      nativeRegExp0.hasInstance(nativeJavaPackage0);
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "error reporter", "g==W>", false);
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
  public void test15()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn("language version").when(idFunctionObject0).getFunctionName();
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(3).when(idFunctionObject0).methodId();
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Method \"language version\" called on incompatible object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Context context0 = Context.enter();
      context0.initStandardObjects();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(52, delegator0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 52
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      BoundFunction boundFunction0 = new BoundFunction((Context) null, nativeRegExp0, delegator0, nativeRegExp0, (Object[]) null);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(137, boundFunction0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 137
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = Context.enter();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) context0;
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
  public void test19()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, nativeRegExp0);
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
  public void test20()  throws Throwable  {
      Context context0 = Context.enter();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      NativeRegExp.compileRE(context0, "", "", false);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeRegExp0, "l Gl", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: l Gl is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeRegExp.compileRE(context0, "language version", (String) null, false);
      Context context1 = Context.enter();
      context1.getElements(nativeRegExp0);
  }
}
