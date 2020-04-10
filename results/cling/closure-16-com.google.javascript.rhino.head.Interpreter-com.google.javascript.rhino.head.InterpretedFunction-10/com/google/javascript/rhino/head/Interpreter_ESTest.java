/*

 * Tue Mar 03 20:37:32 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.Interpreter;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaPackage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Interpreter interpreter0 = new Interpreter();
      Delegator delegator0 = new Delegator();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(true, "", classLoader0);
      // Undeclared exception!
      try { 
        interpreter0.createScriptObject(delegator0, nativeJavaPackage0);
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
      Context context0 = new Context();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeContinuation nativeContinuation0 = mock(NativeContinuation.class, new ViolatedAssumptionAnswer());
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Interpreter interpreter0 = new Interpreter();
  }
}
