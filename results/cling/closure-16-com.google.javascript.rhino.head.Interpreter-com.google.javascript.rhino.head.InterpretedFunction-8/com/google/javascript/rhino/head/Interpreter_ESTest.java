/*

 * Tue Mar 03 20:29:00 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.DefaultErrorReporter;
import com.google.javascript.rhino.head.Interpreter;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.Scriptable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        Interpreter.resumeGenerator((com.google.javascript.rhino.head.Context) context0, (Scriptable) null, 0, (Object) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Interpreter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      Context context0 = new Context();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Interpreter interpreter0 = new Interpreter();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      // Undeclared exception!
      try { 
        defaultErrorReporter0.runtimeError("error reporter", "language version", 0, "error reporter", 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }
}
