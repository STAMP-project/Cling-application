/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 06:21:49 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.JavaScriptException;
import com.google.javascript.rhino.head.ast.FunctionNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode((-21));
      JavaScriptException javaScriptException0 = null;
      try {
        javaScriptException0 = new JavaScriptException(functionNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-598), "K\"?R#;{(*@4I7O", "Cannot overwrite existing ClassShutter object", true);
  }
}
