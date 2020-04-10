/*

 * Tue Mar 03 20:40:03 GMT 2020
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
      RegExpImpl regExpImpl0 = new RegExpImpl();
      nativeRegExp0.setInstanceIdValue(3, regExpImpl0);
      assertEquals(1, NativeRegExp.MATCH);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE(context0, "ccurQ8_O(h.]^3gB@m*", "", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Context context1 = Context.enter(context0);
      NativeArray nativeArray0 = new NativeArray(2);
      NativeRegExp.init(context1, nativeArray0, false);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(180, nativeArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 180
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = NativeRegExp.compileRE(context0, "", "", true);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      boolean boolean0 = Context.toBoolean(importerTopLevel0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = NativeRegExp.compileRE((Context) null, "CaM|FGUYVMcVNoN", "", false);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Context context1 = Context.enter(context0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context1);
      ScriptableObject scriptableObject0 = context1.initStandardObjects((ScriptableObject) importerTopLevel0, true);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      nativeRegExp0.findPrototypeId("U>+M#z9n");
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(908, "U>+M#z9n");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 908
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = NativeRegExp.compileRE(context0, "language version", "", false);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeRegExp0, nativeRegExp0, nativeRegExp0, (Object[]) null);
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(2185, (Object) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 2185
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Context context1 = Context.enter(context0);
      NativeArray nativeArray0 = new NativeArray(2);
      context1.initStandardObjects((ScriptableObject) nativeArray0, false);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(180, nativeArray0);
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
  public void test12()  throws Throwable  {
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        Context.toBoolean(context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Synchronizer synchronizer0 = new Synchronizer(nativeRegExp0);
      Object[] objectArray0 = new Object[7];
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeRegExp0, 1);
      objectArray0[0] = object0;
      // Undeclared exception!
      try { 
        nativeRegExp0.compile(context0, synchronizer0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Context context1 = Context.enter(context0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context1);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Boolean;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      // Undeclared exception!
      try { 
        Context.toObject((Object) context1, (Scriptable) baseFunction0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) importerTopLevel0, "error reporter", (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }
}
