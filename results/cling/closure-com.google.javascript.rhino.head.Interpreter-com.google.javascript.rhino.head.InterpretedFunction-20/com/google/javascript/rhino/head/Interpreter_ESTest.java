/*

 * Tue Mar 03 20:39:37 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Callable;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.Interpreter;
import com.google.javascript.rhino.head.JavaScriptException;
import com.google.javascript.rhino.head.NativeContinuation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      Interpreter.GeneratorState interpreter_GeneratorState0 = new Interpreter.GeneratorState(124, object0);
      Interpreter interpreter0 = new Interpreter();
      // Undeclared exception!
      try { 
        interpreter0.createScriptObject(interpreter_GeneratorState0, interpreter_GeneratorState0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Boolean boolean0 = new Boolean("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Interpreter interpreter0 = new Interpreter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      BoundFunction boundFunction0 = new BoundFunction((Context) null, importerTopLevel0, (Callable) null, importerTopLevel0, (Object[]) null);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      Interpreter interpreter0 = new Interpreter();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      contextFactory0.enter();
      JavaScriptException javaScriptException0 = null;
      try {
        javaScriptException0 = new JavaScriptException(interpreter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }
}
