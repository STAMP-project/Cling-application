/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 11:56:48 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import org.apache.commons.math.ode.ContinuousOutputModel;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ContinuousOutputModel_ESTest extends ContinuousOutputModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[5];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      DummyStepInterpolator dummyStepInterpolator1 = (DummyStepInterpolator)dummyStepInterpolator0.copy();
      dummyStepInterpolator0.storeTime(1279.0551013);
      dummyStepInterpolator1.previousTime = (-2066.68117484487);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      continuousOutputModel0.handleStep(dummyStepInterpolator1, true);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel0.append(continuousOutputModel1);
      continuousOutputModel1.handleStep(dummyStepInterpolator1, false);
      continuousOutputModel0.append(continuousOutputModel1);
      continuousOutputModel0.setInterpolatedTime(1279.0551013);
      continuousOutputModel0.setInterpolatedTime((-2066.68117484));
      assertEquals((-2066.68117484), continuousOutputModel0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      dummyStepInterpolator0.previousTime = (-114.945430867851);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      // Undeclared exception!
      try { 
        continuousOutputModel1.setInterpolatedTime((-1205.593452606));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DummyStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[16];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      dummyStepInterpolator0.storeTime(0.25);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      continuousOutputModel0.setInterpolatedTime(5.746280211439194);
      assertEquals(0.25, continuousOutputModel0.getFinalTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[5];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      DummyStepInterpolator dummyStepInterpolator1 = (DummyStepInterpolator)dummyStepInterpolator0.copy();
      dummyStepInterpolator0.storeTime(1279.0551013);
      dummyStepInterpolator1.currentTime = 1279.0551013;
      dummyStepInterpolator1.previousTime = (-2066.68117484487);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      continuousOutputModel0.handleStep(dummyStepInterpolator1, true);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel0.append(continuousOutputModel1);
      continuousOutputModel1.handleStep(dummyStepInterpolator1, false);
      continuousOutputModel0.append(continuousOutputModel1);
      continuousOutputModel0.setInterpolatedTime((-2066.68117484));
      assertEquals((-2066.68117484), continuousOutputModel0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[5];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      DummyStepInterpolator dummyStepInterpolator1 = (DummyStepInterpolator)dummyStepInterpolator0.copy();
      dummyStepInterpolator0.storeTime(1279.0551013);
      dummyStepInterpolator1.previousTime = (-2066.68117484487);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel0.append(continuousOutputModel1);
      assertEquals(1279.0551013, continuousOutputModel0.getFinalTime(), 0.01);
      
      dummyStepInterpolator0.reinitialize(doubleArray0, true);
      continuousOutputModel1.handleStep(dummyStepInterpolator0, true);
      continuousOutputModel0.append(continuousOutputModel1);
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel1.handleStep(dummyStepInterpolator1, true);
      continuousOutputModel1.setInterpolatedTime(164.0296506046717);
      assertEquals(164.0296506046717, continuousOutputModel1.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[16];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream(byteArrayOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(printStream0);
      dummyStepInterpolator0.writeExternal(objectOutputStream0);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
      assertTrue(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      // Undeclared exception!
      try { 
        continuousOutputModel1.setInterpolatedTime((-1205.593452606));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DummyStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[5];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      DummyStepInterpolator dummyStepInterpolator1 = (DummyStepInterpolator)dummyStepInterpolator0.copy();
      dummyStepInterpolator0.storeTime(1279.0551013);
      dummyStepInterpolator0.shift();
      dummyStepInterpolator1.previousTime = (-2066.68117484487);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, false);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel0.append(continuousOutputModel1);
      continuousOutputModel1.handleStep(dummyStepInterpolator1, false);
      continuousOutputModel0.append(continuousOutputModel1);
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel1.handleStep(dummyStepInterpolator1, false);
      assertEquals(1279.0551013, dummyStepInterpolator0.getPreviousTime(), 0.01);
      
      continuousOutputModel1.setInterpolatedTime((-1.0));
      assertEquals((-1.0), continuousOutputModel1.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double[] doubleArray0 = new double[5];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      dummyStepInterpolator0.storeTime(1279.0551013);
      continuousOutputModel0.handleStep(dummyStepInterpolator0, true);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      continuousOutputModel0.append(continuousOutputModel1);
      assertEquals(1279.0551013, continuousOutputModel0.getFinalTime(), 0.01);
      
      continuousOutputModel1.setInterpolatedTime(1150.4718218911003);
      assertEquals(1150.4718218911003, continuousOutputModel1.getInterpolatedTime(), 0.01);
  }
}
