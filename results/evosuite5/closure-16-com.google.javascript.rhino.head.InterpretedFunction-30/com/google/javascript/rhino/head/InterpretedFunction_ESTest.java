/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 07:26:59 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.InterpretedFunction;
import com.google.javascript.rhino.head.InterpreterData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class InterpretedFunction_ESTest extends InterpretedFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        InterpretedFunction.createScript((InterpreterData) null, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }
}
