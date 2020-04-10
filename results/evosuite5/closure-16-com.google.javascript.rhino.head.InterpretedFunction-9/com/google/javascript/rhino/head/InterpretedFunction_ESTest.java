/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 08:10:38 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.InterpretedFunction;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class InterpretedFunction_ESTest extends InterpretedFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      NativeArray nativeArray0 = new NativeArray(9);
      InterpreterData interpreterData0 = new InterpreterData(12, "language version", "language version", false);
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createFunction(context0, nativeArray0, interpreterData0, (Object) null);
      // Undeclared exception!
      try { 
        interpretedFunction0.exec(context0, nativeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.InterpretedFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      NativeArray nativeArray0 = new NativeArray(9);
      InterpreterData interpreterData0 = new InterpreterData(12, "language version", "language version", false);
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createFunction(context0, nativeArray0, interpreterData0, (Object) null);
      interpreterData0.itsFunctionType = 1;
      // Undeclared exception!
      try { 
        interpretedFunction0.exec(context0, nativeArray0);
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
  public void test2()  throws Throwable  {
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      Context context0 = Context.getContext();
      NativeCall nativeCall0 = new NativeCall();
      // Undeclared exception!
      try { 
        interpretedFunction0.call(context0, nativeCall0, nativeCall0, context0.emptyArgs);
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
  public void test3()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeArray nativeArray0 = new NativeArray(9218868437227405337L);
      InterpreterData interpreterData0 = new InterpreterData(1, "com.google.javascript.rhino.head.InterpretedFunction", "com.google.javascript.rhino.head.InterpretedFunction", false);
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createFunction(context0, nativeArray0, interpreterData0, (Object) null);
      String string0 = interpretedFunction0.getFunctionName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test4()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeArray nativeArray0 = new NativeArray(9218868437227405337L);
      InterpreterData interpreterData0 = new InterpreterData(3, "com.google.javascript.rhino.head.InterpretedFunction", "com.google.javascript.rhino.head.InterpretedFunction", false);
      interpreterData0.itsName = "";
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createFunction(context0, nativeArray0, interpreterData0, (Object) null);
      String string0 = interpretedFunction0.getFunctionName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      InterpreterData interpreterData0 = new InterpreterData(12, "language version", "language version", false);
      interpreterData0.itsRegExpLiterals = context0.emptyArgs;
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createFunction(context0, nativeArray0, interpreterData0, (Object) null);
      assertEquals("Function", interpretedFunction0.getClassName());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      // Undeclared exception!
      try { 
        InterpretedFunction.createFunction((Context) null, interpretedFunction0, (InterpreterData) null, interpretedFunction0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.InterpretedFunction", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test7()  throws Throwable  {
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      // Undeclared exception!
      try { 
        interpretedFunction0.getParamOrVarName(13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.InterpretedFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        InterpretedFunction.createFunction(context0, nativeIterator_StopIteration0, (InterpretedFunction) null, 120);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.InterpretedFunction", e);
      }
  }
}
