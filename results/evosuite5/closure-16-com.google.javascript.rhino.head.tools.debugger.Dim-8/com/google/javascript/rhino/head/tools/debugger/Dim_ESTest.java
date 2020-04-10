/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 22:35:08 GMT 2019
 */

package com.google.javascript.rhino.head.tools.debugger;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.tools.debugger.Dim;
import com.google.javascript.rhino.head.tools.debugger.GuiCallback;
import com.google.javascript.rhino.head.tools.debugger.ScopeProvider;
import com.google.javascript.rhino.head.tools.debugger.SourceProvider;
import java.time.temporal.ChronoField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Dim_ESTest extends Dim_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      ChronoField chronoField0 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
      String string0 = dim0.objectToString(chronoField0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      String string0 = dim0.objectToString((Object) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      BaseFunction baseFunction0 = new BaseFunction();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(baseFunction0, baseFunction0, 5, "this", 3, baseFunction0);
      ScopeProvider scopeProvider0 = mock(ScopeProvider.class, new ViolatedAssumptionAnswer());
      dim0.setScopeProvider(scopeProvider0);
      // Undeclared exception!
      try { 
        dim0.evalScript("9YgF(vk", "9YgF(vk");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      boolean boolean0 = dim0.stringIsCompilableUnit("com.google.javascript.rhino.head.tools.debugger.Dim$FunctionSource");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.compileScript((String) null, (String) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = dim0.getObjectIds(baseFunction0);
      assertEquals(4, objectArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        Context.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        dim0.getObjectIds(nativeJavaClass0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = new Context();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeContinuation0, nativeContinuation0, nativeContinuation0, (Object[]) null);
      // Undeclared exception!
      try { 
        dim0.getObjectIds(boundFunction0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      Object[] objectArray0 = dim0.getObjectIds(contextFactory0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeObject nativeObject0 = new NativeObject();
      nativeObject0.put((String) null, (Scriptable) nativeContinuation0, (Object) dim0);
      Dim dim1 = (Dim)dim0.getObjectProperty(nativeContinuation0, nativeContinuation0.EMPTY);
      assertEquals(1, Dim.STEP_INTO);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        dim0.getObjectProperty(nativeContinuation0, "");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Dim dim0 = new Dim();
      String string0 = dim0.eval((String) null);
      assertEquals("undefined", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.clearAllBreakpoints();
      assertEquals(1, Dim.STEP_INTO);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.evalScript("iT~#%6Z", "");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.evalScript("O)^(xz(}iCEl5", "a");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.debugger.Dim", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      dim0.attachTo(contextFactory0);
      assertEquals(4, Dim.BREAK);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Dim.ContextData dim_ContextData0 = new Dim.ContextData();
      // Undeclared exception!
      try { 
        dim_ContextData0.getFrame(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -1 \u2209 [0, 0)
         //
         verifyException("com.google.javascript.rhino.head.ObjArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Dim.ContextData.get((Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.debugger.Dim$ContextData", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Dim.ContextData dim_ContextData0 = new Dim.ContextData();
      int int0 = dim_ContextData0.frameCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        dim0.getObjectProperty(nativeObject0, 1);
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreak();
      assertEquals(3, Dim.GO);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.go();
      assertEquals(3, Dim.GO);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.contextSwitch(0);
      assertEquals(1, Dim.STEP_INTO);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Dim dim0 = new Dim();
      Dim.FunctionSource dim_FunctionSource0 = dim0.functionSourceByName("$*tqa?");
      assertNull(dim_FunctionSource0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreakOnExceptions(false);
      assertEquals(4, Dim.BREAK);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Dim dim0 = new Dim();
      SourceProvider sourceProvider0 = mock(SourceProvider.class, new ViolatedAssumptionAnswer());
      dim0.setSourceProvider(sourceProvider0);
      assertEquals(0, Dim.STEP_OVER);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreakOnEnter(false);
      assertEquals(3, Dim.GO);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.dispose();
      assertEquals(4, Dim.BREAK);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Dim dim0 = new Dim();
      Dim.SourceInfo dim_SourceInfo0 = dim0.sourceInfo("~");
      assertNull(dim_SourceInfo0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Dim dim0 = new Dim();
      String string0 = dim0.eval("com.google.javascript.rhino.head.tools.debugger.Dim$StackFrame");
      assertEquals("undefined", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreakOnReturn(false);
      assertEquals(0, Dim.STEP_OVER);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setGuiCallback((GuiCallback) null);
      assertEquals(4, Dim.BREAK);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Dim dim0 = new Dim();
      String[] stringArray0 = dim0.functionNames();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setReturnValue(2);
      assertEquals(0, Dim.STEP_OVER);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.evalScript("#Q+`+2[yat*L", "a");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.debugger.Dim", e);
      }
  }
}
