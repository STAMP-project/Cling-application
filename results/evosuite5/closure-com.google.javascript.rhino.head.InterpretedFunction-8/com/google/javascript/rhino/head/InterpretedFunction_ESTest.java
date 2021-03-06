/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 08:09:35 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.InterpretedFunction;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.Scriptable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class InterpretedFunction_ESTest extends InterpretedFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeNumber nativeNumber0 = new NativeNumber(100);
      InterpreterData interpreterData0 = new InterpreterData(2, "error reporter", "language version", true);
      interpreterData0.itsFunctionType = 11;
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createFunction(context0, nativeNumber0, interpreterData0, (Object) null);
      // Undeclared exception!
      try { 
        interpretedFunction0.exec(context0, nativeNumber0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.InterpretedFunction", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        interpretedFunction0.construct(context0, interpretedFunction0, context0.emptyArgs);
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
  public void test2()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(7, "language version", "language version", false);
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript(interpreterData0, (Object) null);
      String string0 = interpretedFunction0.getFunctionName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(0, "", "", false);
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript(interpreterData0, (Object) null);
      interpreterData0.itsName = "";
      String string0 = interpretedFunction0.getFunctionName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Context context0 = Context.enter();
      NativeNumber nativeNumber0 = new NativeNumber(10);
      InterpreterData interpreterData0 = new InterpreterData(3, "language version", "error reporter", true);
      interpreterData0.itsRegExpLiterals = context0.emptyArgs;
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createFunction(context0, nativeNumber0, interpreterData0, (Object) null);
      Object[] objectArray0 = new Object[5];
      interpreterData0.itsRegExpLiterals = objectArray0;
      Scriptable[] scriptableArray0 = interpretedFunction0.createRegExpWraps(context0, nativeNumber0);
      assertEquals(5, scriptableArray0.length);
      assertNotNull(scriptableArray0);
  }
}
