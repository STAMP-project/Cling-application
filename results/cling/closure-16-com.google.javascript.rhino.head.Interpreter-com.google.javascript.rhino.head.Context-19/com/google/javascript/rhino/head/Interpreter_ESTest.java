/*

 * Tue Mar 03 19:47:15 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.NativeContinuation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(100, "I2c]", "msg.bad.catchcond", true);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = Context.enter();
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        nativeContinuation0.construct(context0, delegator0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }
}
