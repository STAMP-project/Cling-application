/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 15:05:40 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.WrappedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Context.enter();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Context context0 = new Context();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(255, "", (String) null, false);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1015, "v", "v", false);
      byte[] byteArray0 = new byte[13];
      byteArray0[7] = (byte) (-10);
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      WrappedException wrappedException0 = null;
      try {
        wrappedException0 = new WrappedException(mockThrowable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1015, "?", "?", false);
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte)88;
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(191, "))AZYx<4ds", "R23=n", true);
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)50;
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(0, "v", "v", false);
      byte[] byteArray0 = new byte[15];
      byteArray0[3] = (byte)7;
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1060, "v", "v", false);
      byte[] byteArray0 = new byte[12];
      byteArray0[4] = (byte) (-6);
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1015, "v", "v", false);
      byte[] byteArray0 = new byte[13];
      byteArray0[3] = (byte) (-11);
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1015, "v", "v", true);
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-23);
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(999, "c#2|BL80I^\"", "c#2|BL80I^\"", false);
      byte[] byteArray0 = new byte[25];
      byteArray0[6] = (byte) (-28);
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1026, "", "", true);
      byte[] byteArray0 = new byte[9];
      byteArray0[6] = (byte) (-40);
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1015, "v", "v", true);
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-45);
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1015, "v", "v", false);
      byte[] byteArray0 = new byte[13];
      byteArray0[6] = (byte) (-47);
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1088, "d", "d", false);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-62);
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1015, "", "", false);
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte) (-26);
      interpreterData0.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(0, "7wi#/+EeQ", "", false);
  }
}
