/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 11:44:44 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import org.apache.commons.math.ode.ContinuousOutputModel;
import org.apache.commons.math.ode.DormandPrince54StepInterpolator;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ContinuousOutputModel_ESTest extends ContinuousOutputModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DormandPrince54StepInterpolator dormandPrince54StepInterpolator0 = new DormandPrince54StepInterpolator();
      double[] doubleArray0 = new double[8];
      double[][] doubleArray1 = new double[6][4];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      dormandPrince54StepInterpolator0.reinitialize((FirstOrderDifferentialEquations) null, doubleArray0, doubleArray1, false);
      continuousOutputModel0.handleStep(dormandPrince54StepInterpolator0, false);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime((-22.958455394931345));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.math.ode.DormandPrince54StepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DormandPrince54StepInterpolator dormandPrince54StepInterpolator0 = new DormandPrince54StepInterpolator();
      continuousOutputModel0.handleStep(dormandPrince54StepInterpolator0, true);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime((-4492.904651446778));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DormandPrince54StepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DormandPrince54StepInterpolator dormandPrince54StepInterpolator0 = new DormandPrince54StepInterpolator();
      dormandPrince54StepInterpolator0.currentTime = (-4492.904651446778);
      continuousOutputModel0.handleStep(dormandPrince54StepInterpolator0, false);
      // Undeclared exception!
      try { 
        continuousOutputModel0.setInterpolatedTime(3058.555);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DormandPrince54StepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DormandPrince54StepInterpolator dormandPrince54StepInterpolator0 = new DormandPrince54StepInterpolator();
      continuousOutputModel0.handleStep(dormandPrince54StepInterpolator0, true);
      continuousOutputModel0.handleStep(dormandPrince54StepInterpolator0, false);
      assertTrue(dormandPrince54StepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DormandPrince54StepInterpolator dormandPrince54StepInterpolator0 = new DormandPrince54StepInterpolator();
      continuousOutputModel0.handleStep(dormandPrince54StepInterpolator0, true);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel1.append(continuousOutputModel0);
      assertEquals(Double.NaN, continuousOutputModel1.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      continuousOutputModel0.append(continuousOutputModel0);
      assertEquals(Double.NaN, continuousOutputModel0.getFinalTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel0.getInitialTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      DormandPrince54StepInterpolator dormandPrince54StepInterpolator0 = new DormandPrince54StepInterpolator();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[2];
      double[][] doubleArray1 = new double[6][4];
      dormandPrince54StepInterpolator0.reinitialize(firstOrderConverter0, doubleArray0, doubleArray1, true);
      continuousOutputModel0.handleStep(dormandPrince54StepInterpolator0, true);
      // Undeclared exception!
      try { 
        continuousOutputModel0.append(continuousOutputModel0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      // Undeclared exception!
      try { 
        continuousOutputModel0.getInterpolatedTime();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      double double0 = continuousOutputModel0.getFinalTime();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, continuousOutputModel0.getInitialTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      boolean boolean0 = continuousOutputModel0.requiresDenseOutput();
      assertEquals(Double.NaN, continuousOutputModel0.getInitialTime(), 0.01);
      assertEquals(Double.NaN, continuousOutputModel0.getFinalTime(), 0.01);
      assertTrue(boolean0);
  }
}
