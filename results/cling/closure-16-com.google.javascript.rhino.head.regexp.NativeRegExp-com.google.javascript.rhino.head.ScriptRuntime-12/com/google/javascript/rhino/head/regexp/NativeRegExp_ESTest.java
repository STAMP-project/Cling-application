/*

 * Tue Mar 03 20:40:12 GMT 2020
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
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
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
      Synchronizer synchronizer0 = new Synchronizer(nativeRegExp0);
      nativeRegExp0.setInstanceIdValue(3, synchronizer0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, nativeArray0);
      int int0 = nativeRegExp0.findPrototypeId("extends");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) nativeArray0, true);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Object[] objectArray0 = new Object[6];
      objectArray0[1] = (Object) scriptableObject0;
      // Undeclared exception!
      try { 
        nativeRegExp0.compile(context0, nativeArray0, objectArray0);
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
      Context context0 = Context.getCurrentContext();
      double double0 = Context.toNumber(context0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("language version");
      Synchronizer synchronizer0 = new Synchronizer(nativeJavaPackage0);
      double double0 = Context.toNumber(synchronizer0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "H^;kAx~f|?,!", "", false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: Invalid quantifier ?
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = new Context();
      Object object0 = NativeRegExp.compileRE(context0, "R", "", true);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      int int0 = nativeRegExp0.findPrototypeId("Rs_w");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) importerTopLevel0, true);
      assertSame(importerTopLevel0, scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeRegExp.compileRE(context0, "", "", true);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) importerTopLevel0, "error reporter", context0.emptyArgs);
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
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeRegExp nativeRegExp0 = new NativeRegExp(importerTopLevel0, (Object) null);
      nativeRegExp0.setInstanceIdValue(5, importerTopLevel0);
      assertFalse(nativeRegExp0.isSealed());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = NativeRegExp.compileRE(context0, "P~V5UC+mN8IODH", (String) null, false);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(57, scriptableObject0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 57
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = Context.enter();
      boolean boolean0 = context0.stringIsCompilableUnit("0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeArray0, nativeRegExp0, nativeArray0, context0.emptyArgs);
      nativeRegExp0.setInstanceIdValue(2, nativeArray0);
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      context0.initStandardObjects((ScriptableObject) nativeArray0, true);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.setInstanceIdValue(2, nativeArray0);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) context0;
      // Undeclared exception!
      try { 
        nativeRegExp0.compile(context0, nativeArray0, objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Class<Integer> class0 = Integer.class;
      Scriptable scriptable0 = Context.toObject((Object) contextFactory0, (Scriptable) importerTopLevel0, (Class<?>) class0);
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      context0.getElements(importerTopLevel0);
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "OpenJDK 64-Bit Server VM", "language version", false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }
}
