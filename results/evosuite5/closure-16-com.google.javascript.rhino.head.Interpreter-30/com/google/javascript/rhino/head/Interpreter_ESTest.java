/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 15:03:19 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.InterpretedFunction;
import com.google.javascript.rhino.head.Interpreter;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      Context.getCurrentContext();
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      InterpreterData interpreterData0 = interpretedFunction0.idata;
      Interpreter interpreter0 = new Interpreter();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Context.enter();
      InterpreterData interpreterData0 = new InterpreterData(9, "language version", "language version", true);
      byte[] byteArray0 = new byte[7];
      byteArray0[6] = (byte)5;
      byteArray0[2] = (byte)5;
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context.getCurrentContext();
      InterpreterData interpreterData0 = new InterpreterData(9, "language version", "language version", true);
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte)1;
      byteArray0[7] = (byte)1;
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = new Context();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-891), (String) null, (String) null, false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context.getCurrentContext();
      InterpreterData interpreterData0 = new InterpreterData(9, "language version", "language version", true);
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte)6;
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-891), "J&ykKj\"I_ZXeq", "J&ykKj\"I_ZXeq", false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(5767, "}O!`@tWgelLX<cV<^", "h9QXWSuij~FE", true);
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)72;
      byteArray0[2] = (byte) (-117);
      byteArray0[3] = (byte) (-60);
      byteArray0[4] = (byte)46;
      byteArray0[6] = (byte) (-47);
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeWith nativeWith0 = new NativeWith(nativeContinuation0, nativeContinuation0);
      EvaluatorException evaluatorException0 = null;
      try {
        evaluatorException0 = new EvaluatorException("Cannot capture continuation from JavaScript code not called directly by executeScriptWithContinuations or callFunctionWithContinuations");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      contextFactory0.enter();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context.getCurrentContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      contextFactory0.checkNotSealed();
      contextFactory0.enter();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(3400, "2", "2", true);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-7);
      interpreterData0.itsICode = byteArray0;
      interpreterData0.evalScriptFlag = true;
  }
}
