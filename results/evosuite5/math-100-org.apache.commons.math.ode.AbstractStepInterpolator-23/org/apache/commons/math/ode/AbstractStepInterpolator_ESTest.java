/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 11:56:41 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectOutputStream;
import org.apache.commons.math.ode.ClassicalRungeKuttaStepInterpolator;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator;
import org.apache.commons.math.ode.HighamHall54StepInterpolator;
import org.apache.commons.math.ode.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractStepInterpolator_ESTest extends AbstractStepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[][] doubleArray1 = new double[4][5];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(".s8!VIUw0FwE!l<");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      graggBulirschStoerStepInterpolator0.writeBaseExternal(objectOutputStream0);
      assertTrue(graggBulirschStoerStepInterpolator0.isForward());
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      graggBulirschStoerStepInterpolator0.finalizeStep();
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[][] doubleArray1 = new double[9][2];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, false);
      graggBulirschStoerStepInterpolator0.storeTime(1377.71363894);
      assertEquals(1377.71363894, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.reinitialize((double[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      // Undeclared exception!
      try { 
        dummyStepInterpolator0.setInterpolatedTime((-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DummyStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[][] doubleArray1 = new double[2][1];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, false);
      double double0 = graggBulirschStoerStepInterpolator0.getCurrentTime();
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertFalse(graggBulirschStoerStepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassicalRungeKuttaStepInterpolator classicalRungeKuttaStepInterpolator0 = new ClassicalRungeKuttaStepInterpolator();
      double double0 = classicalRungeKuttaStepInterpolator0.getPreviousTime();
      assertTrue(classicalRungeKuttaStepInterpolator0.isForward());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      graggBulirschStoerStepInterpolator0.shift();
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertTrue(graggBulirschStoerStepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      boolean boolean0 = dummyStepInterpolator0.isForward();
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertTrue(boolean0);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HighamHall54StepInterpolator highamHall54StepInterpolator0 = new HighamHall54StepInterpolator();
      double double0 = highamHall54StepInterpolator0.getInterpolatedTime();
      assertEquals(Double.NaN, double0, 0.01);
      assertTrue(highamHall54StepInterpolator0.isForward());
      assertEquals(Double.NaN, highamHall54StepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, highamHall54StepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[][] doubleArray1 = new double[4][5];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true);
      StepInterpolator stepInterpolator0 = graggBulirschStoerStepInterpolator0.copy();
      assertEquals(Double.NaN, stepInterpolator0.getCurrentTime(), 0.01);
      assertTrue(stepInterpolator0.isForward());
      assertEquals(Double.NaN, stepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, stepInterpolator0.getPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[][] doubleArray1 = new double[9][2];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, false);
      graggBulirschStoerStepInterpolator0.getInterpolatedState();
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      assertFalse(graggBulirschStoerStepInterpolator0.isForward());
  }
}
