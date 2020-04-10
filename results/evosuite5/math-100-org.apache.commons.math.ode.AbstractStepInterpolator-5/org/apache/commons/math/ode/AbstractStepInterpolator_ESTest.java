/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:41:13 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import org.apache.commons.math.ode.DormandPrince54StepInterpolator;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator;
import org.apache.commons.math.ode.HighamHall54StepInterpolator;
import org.apache.commons.math.ode.MidpointStepInterpolator;
import org.apache.commons.math.ode.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractStepInterpolator_ESTest extends AbstractStepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DormandPrince54StepInterpolator dormandPrince54StepInterpolator0 = new DormandPrince54StepInterpolator();
      double[] doubleArray0 = new double[0];
      dormandPrince54StepInterpolator0.currentState = doubleArray0;
      DormandPrince54StepInterpolator dormandPrince54StepInterpolator1 = null;
      try {
        dormandPrince54StepInterpolator1 = new DormandPrince54StepInterpolator(dormandPrince54StepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MidpointStepInterpolator midpointStepInterpolator0 = new MidpointStepInterpolator();
      // Undeclared exception!
      try { 
        midpointStepInterpolator0.storeTime(Double.NaN);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      dummyStepInterpolator0.writeExternal(objectOutputStream0);
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
      assertFalse(dummyStepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      double[] doubleArray0 = new double[0];
      dummyStepInterpolator0.reinitialize(doubleArray0, true);
      assertTrue(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.setInterpolatedTime(0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MidpointStepInterpolator midpointStepInterpolator0 = new MidpointStepInterpolator();
      double double0 = midpointStepInterpolator0.getCurrentTime();
      assertTrue(midpointStepInterpolator0.isForward());
      assertEquals(Double.NaN, midpointStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, midpointStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DormandPrince54StepInterpolator dormandPrince54StepInterpolator0 = new DormandPrince54StepInterpolator();
      double double0 = dormandPrince54StepInterpolator0.getPreviousTime();
      assertTrue(dormandPrince54StepInterpolator0.isForward());
      assertEquals(Double.NaN, dormandPrince54StepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, dormandPrince54StepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince54StepInterpolator dormandPrince54StepInterpolator0 = new DormandPrince54StepInterpolator();
      dormandPrince54StepInterpolator0.shift();
      assertEquals(Double.NaN, dormandPrince54StepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, dormandPrince54StepInterpolator0.getPreviousTime(), 0.01);
      assertTrue(dormandPrince54StepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HighamHall54StepInterpolator highamHall54StepInterpolator0 = new HighamHall54StepInterpolator();
      boolean boolean0 = highamHall54StepInterpolator0.isForward();
      assertEquals(Double.NaN, highamHall54StepInterpolator0.getPreviousTime(), 0.01);
      assertTrue(boolean0);
      assertEquals(Double.NaN, highamHall54StepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, highamHall54StepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      double double0 = graggBulirschStoerStepInterpolator0.getInterpolatedTime();
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertTrue(graggBulirschStoerStepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DormandPrince54StepInterpolator dormandPrince54StepInterpolator0 = new DormandPrince54StepInterpolator();
      StepInterpolator stepInterpolator0 = dormandPrince54StepInterpolator0.copy();
      assertEquals(Double.NaN, stepInterpolator0.getPreviousTime(), 0.01);
      assertTrue(stepInterpolator0.isForward());
      assertEquals(Double.NaN, stepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, stepInterpolator0.getCurrentTime(), 0.01);
      
      dormandPrince54StepInterpolator0.finalizeStep();
      assertEquals(Double.NaN, dormandPrince54StepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MidpointStepInterpolator midpointStepInterpolator0 = new MidpointStepInterpolator();
      // Undeclared exception!
      try { 
        midpointStepInterpolator0.getInterpolatedState();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractStepInterpolator", e);
      }
  }
}
