/*

 * Tue Mar 03 20:40:39 GMT 2020
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
import com.google.javascript.rhino.head.NativeJavaObject;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.UniqueTag;
import com.google.javascript.rhino.head.regexp.NativeRegExp;
import com.google.javascript.rhino.head.regexp.RegExpImpl;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeRegExp_ESTest extends NativeRegExp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      RegExpImpl regExpImpl0 = new RegExpImpl();
      nativeRegExp0.setInstanceIdValue(2, regExpImpl0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeRegExp0.setInstanceIdValue(3, importerTopLevel0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      NativeRegExp.init(context0, nativeRegExp0, true);
      NativeObject nativeObject0 = new NativeObject();
      boolean boolean0 = nativeObject0.hasInstance(nativeRegExp0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      context0.getElements(nativeRegExp0);
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "language version", "error reporter", true);
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
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "qkA(64F>@aEY{", (String) null, false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: Unterminated parenthetical 
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeRegExp0, nativeRegExp0, nativeRegExp0, (Object[]) null);
      Object[] objectArray0 = new Object[5];
      BoundFunction boundFunction1 = new BoundFunction(context0, nativeRegExp0, boundFunction0, boundFunction0, objectArray0);
      nativeRegExp0.setInstanceIdValue(2, context0);
      assertEquals(0, Context.VERSION_DEFAULT);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      nativeRegExp0.setInstanceIdValue(1, context0);
      nativeRegExp0.setInstanceIdValue(2, context0);
      assertEquals(0, context0.getOptimizationLevel());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      RegExpImpl regExpImpl0 = new RegExpImpl();
      // Undeclared exception!
      try { 
        Context.toObject((Object) regExpImpl0, (Scriptable) nativeRegExp0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) importerTopLevel0, false);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Class<NativeRegExp> class0 = NativeRegExp.class;
      ScriptableObject.defineClass((Scriptable) importerTopLevel0, class0, false, false);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) importerTopLevel0, "ignoreCase", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: ignoreCase is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.findPrototypeId("*.Pt+lok");
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeRegExp0.setInstanceIdValue(3, importerTopLevel0);
      assertEquals(4, NativeRegExp.JSREG_MULTILINE);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      context0.initStandardObjects();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeRegExp0, nativeRegExp0, nativeRegExp0, (Object[]) null);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(13, boundFunction0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 13
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      NativeRegExp.compileRE(context0, "language version", "", false);
      NativeObject nativeObject0 = new NativeObject();
      boolean boolean0 = nativeObject0.hasInstance(nativeRegExp0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(411).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, (Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 411
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = Context.getCurrentContext();
      nativeRegExp0.setInstanceIdValue(2, context0);
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) contextFactory0;
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
  public void test14()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeRegExp0, nativeRegExp0, nativeRegExp0, (Object[]) null);
      nativeRegExp0.setInstanceIdValue(5, boundFunction0);
      assertEquals(4, NativeRegExp.JSREG_MULTILINE);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      NativeObject nativeObject0 = new NativeObject();
      nativeObject0.hasInstance(nativeRegExp0);
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "language version", "OpenJDK 64-Bit Server VM", false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(idFunctionObject0).getFunctionName();
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(2).when(idFunctionObject0).methodId();
      Context context0 = Context.enter();
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
  public void test17()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeRegExp0, nativeRegExp0, nativeRegExp0, (Object[]) null);
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      Context.toBoolean(nativeJavaObject0);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(13, boundFunction0);
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
  public void test18()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context.toBoolean(regExpImpl0);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(180, context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 180
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("error reporter", classLoader0);
      Context.toBoolean(nativeJavaPackage0);
      nativeRegExp0.setInstanceIdValue(2, context0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      Context.toBoolean(uniqueTag0);
      nativeRegExp0.setInstanceIdValue(2, uniqueTag0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.findPrototypeId("*.Pt+lok");
      RegExpImpl regExpImpl0 = new RegExpImpl();
      nativeRegExp0.setInstanceIdValue(2, regExpImpl0);
      assertTrue(nativeRegExp0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = Context.enter();
      StringReader stringReader0 = new StringReader("OpenJDK 64-Bit Server VM");
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        context0.compileReader((Reader) stringReader0, "toString", 4, (Object) delegator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // securityDomain should be null if setSecurityController() was never called
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeRegExp0, nativeRegExp0, nativeRegExp0, (Object[]) null);
      nativeRegExp0.setInstanceIdValue(1, context0);
      Object[] objectArray0 = new Object[5];
      BoundFunction boundFunction1 = new BoundFunction(context0, nativeRegExp0, boundFunction0, boundFunction0, objectArray0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Scriptable scriptable0 = importerTopLevel0.getPrototype();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) importerTopLevel0;
      // Undeclared exception!
      try { 
        nativeRegExp0.call(context0, importerTopLevel0, scriptable0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      Context context0 = new Context();
      NativeRegExp.compileRE(context0, "language version", "", false);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) topLevel0, "6ZyhRg", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: 6ZyhRg is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      context0.getElements(nativeRegExp0);
      NativeRegExp.init(context0, nativeRegExp0, true);
  }
}
