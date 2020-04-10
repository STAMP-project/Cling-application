/*

 * Tue Mar 03 20:39:01 GMT 2020
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
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeFunction;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.regexp.NativeRegExp;
import com.google.javascript.rhino.head.regexp.RegExpImpl;
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
        NativeRegExp.compileRE(context0, "error reporter", "msg.bad.switch", true);
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
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "@8sv49 J(E%LG]a.hx", "", false);
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
  public void test02()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeRegExp0, "language version", (Object[]) null);
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
  public void test03()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeRegExp0.setInstanceIdValue(1, importerTopLevel0);
      Object[] objectArray0 = context0.getElements(importerTopLevel0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeRegExp0.setInstanceIdValue(1, importerTopLevel0);
      // Undeclared exception!
      try { 
        nativeRegExp0.initPrototypeId(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      boolean boolean0 = Context.toBoolean(regExpImpl0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = new Context();
      Object object0 = NativeRegExp.compileRE(context0, "rM@|Ey3N=.7wi;e:G", "", false);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.enter();
      Object object0 = NativeRegExp.compileRE(context0, "5v*Xh7a?aP7w9?gd8bC", (String) null, false);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeObject nativeObject0 = (NativeObject)context0.initStandardObjects(scriptableObject0, true);
      assertFalse(nativeObject0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = Context.toBoolean((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeRegExp0.setInstanceIdValue(2, importerTopLevel0);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(1, nativeRegExp0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Delegator delegator0 = new Delegator(nativeRegExp0);
      boolean boolean0 = delegator0.hasInstance(nativeRegExp0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = new Context();
      NativeFunction nativeFunction0 = mock(NativeFunction.class, new ViolatedAssumptionAnswer());
      NativeGenerator nativeGenerator0 = new NativeGenerator(nativeRegExp0, nativeFunction0, context0);
      nativeRegExp0.setInstanceIdValue(5, nativeGenerator0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = new Context();
      Delegator delegator0 = new Delegator(nativeRegExp0);
      delegator0.hasInstance(nativeRegExp0);
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "%(%g|9CI:%1", ".)iqGE?.1Py&0", true);
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
  public void test14()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeRegExp0.setInstanceIdValue(1, importerTopLevel0);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) context0;
      // Undeclared exception!
      try { 
        nativeRegExp0.call(context0, importerTopLevel0, importerTopLevel0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = Context.toBoolean("@8sv49 J(E%LG]a.hx");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.enter();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeRegExp0, nativeRegExp0, nativeRegExp0, (Object[]) null);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(170, context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 170
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context.toBoolean(nativeRegExp0);
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(102, context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 102
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      NativeArray nativeArray0 = new NativeArray((-1L));
      Object[] objectArray0 = new Object[1];
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeRegExp0, 2);
      objectArray0[0] = object0;
      Scriptable scriptable0 = nativeRegExp0.compile((Context) null, nativeArray0, objectArray0);
      assertSame(scriptable0, nativeRegExp0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      Context context0 = new Context();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        Context.toObject((Object) context0, (Scriptable) nativeJavaClass0, (Class<?>) class0);
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
      Context context0 = new Context();
      NativeRegExp.compileRE(context0, "", "", true);
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) baseFunction0, "language version", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: language version is not a function, it is function.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = new Context();
      context0.getElements(nativeRegExp0);
      NativeRegExp.compileRE(context0, "", "", true);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      context0.getElements(importerTopLevel0);
      NativeRegExp.compileRE(context0, "object", (String) null, false);
  }
}
