/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 08:07:17 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.InterpretedFunction;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class InterpretedFunction_ESTest extends InterpretedFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeWith nativeWith0 = new NativeWith(nativeContinuation0, nativeContinuation0);
      InterpreterData interpreterData0 = new InterpreterData(13, "_p", (String) null, true);
      Context context0 = Context.getCurrentContext();
      interpreterData0.itsFunctionType = 6;
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createFunction(context0, nativeWith0, interpreterData0, (Object) null);
      // Undeclared exception!
      try { 
        interpretedFunction0.exec(context0, nativeWith0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.InterpretedFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeWith nativeWith0 = new NativeWith(nativeContinuation0, nativeContinuation0);
      InterpreterData interpreterData0 = new InterpreterData(13, "_p", (String) null, true);
      Context context0 = Context.enter();
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createFunction(context0, nativeWith0, interpreterData0, (Object) null);
      // Undeclared exception!
      try { 
        interpretedFunction0.exec(context0, nativeWith0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.InterpretedFunction", e);
      }
  }
}
