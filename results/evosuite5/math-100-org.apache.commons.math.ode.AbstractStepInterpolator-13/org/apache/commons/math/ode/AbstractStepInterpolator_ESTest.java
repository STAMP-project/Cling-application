/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 15:30:11 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import org.apache.commons.math.ode.DormandPrince54StepInterpolator;
import org.apache.commons.math.ode.DormandPrince853StepInterpolator;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator;
import org.apache.commons.math.ode.HighamHall54StepInterpolator;
import org.apache.commons.math.ode.StepInterpolator;
import org.apache.commons.math.ode.ThreeEighthesStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractStepInterpolator_ESTest extends AbstractStepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      dummyStepInterpolator0.writeExternal(objectOutputStream0);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertFalse(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      DummyStepInterpolator dummyStepInterpolator1 = new DummyStepInterpolator(dummyStepInterpolator0);
      assertEquals(Double.NaN, dummyStepInterpolator1.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator1.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator1.getCurrentTime(), 0.01);
      assertFalse(dummyStepInterpolator1.isForward());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      // Undeclared exception!
      try { 
        dormandPrince853StepInterpolator0.storeTime(988.19489);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HighamHall54StepInterpolator highamHall54StepInterpolator0 = new HighamHall54StepInterpolator();
      // Undeclared exception!
      try { 
        highamHall54StepInterpolator0.reinitialize((double[]) null, true);
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
      DormandPrince54StepInterpolator dormandPrince54StepInterpolator0 = new DormandPrince54StepInterpolator();
      // Undeclared exception!
      try { 
        dormandPrince54StepInterpolator0.setInterpolatedTime((-2494.685271));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DormandPrince54StepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      double double0 = threeEighthesStepInterpolator0.getCurrentTime();
      assertTrue(threeEighthesStepInterpolator0.isForward());
      assertEquals(Double.NaN, threeEighthesStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, threeEighthesStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HighamHall54StepInterpolator highamHall54StepInterpolator0 = new HighamHall54StepInterpolator();
      highamHall54StepInterpolator0.shift();
      assertEquals(Double.NaN, highamHall54StepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, highamHall54StepInterpolator0.getPreviousTime(), 0.01);
      assertTrue(highamHall54StepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      boolean boolean0 = threeEighthesStepInterpolator0.isForward();
      assertEquals(Double.NaN, threeEighthesStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, threeEighthesStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, threeEighthesStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DormandPrince54StepInterpolator dormandPrince54StepInterpolator0 = new DormandPrince54StepInterpolator();
      double double0 = dormandPrince54StepInterpolator0.getInterpolatedTime();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, dormandPrince54StepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, dormandPrince54StepInterpolator0.getCurrentTime(), 0.01);
      assertTrue(dormandPrince54StepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HighamHall54StepInterpolator highamHall54StepInterpolator0 = new HighamHall54StepInterpolator();
      highamHall54StepInterpolator0.copy();
      StepInterpolator stepInterpolator0 = highamHall54StepInterpolator0.copy();
      assertEquals(Double.NaN, stepInterpolator0.getPreviousTime(), 0.01);
      assertTrue(stepInterpolator0.isForward());
      assertEquals(Double.NaN, stepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, stepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[][] doubleArray1 = new double[2][2];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true);
      graggBulirschStoerStepInterpolator0.getInterpolatedState();
      assertTrue(graggBulirschStoerStepInterpolator0.isForward());
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
  }
}
