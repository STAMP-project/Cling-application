/*

 * Tue Mar 03 15:55:01 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.SwitchingFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GraggBulirschStoerIntegrator_ESTest extends GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5, 5).when(firstOrderDifferentialEquations0).getDimension();
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(5, 2786.300857665, 5, (-714.39));
      double[] doubleArray0 = new double[5];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-499.00719535612933), (-2978.727487609176), (-28.3456446), (-1.0), 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator1.addSwitchingFunction(switchingFunction0, (-714.39), (-2131.95775), (-2047));
      graggBulirschStoerIntegrator1.integrate(firstOrderDifferentialEquations0, 0.0, doubleArray0, (-2131.95775), doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(1548.0, 2312.7281647, 1.0001, (-2131.95775));
      assertFalse(graggBulirschStoerIntegrator0.equals((Object)graggBulirschStoerIntegrator1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5, 5).when(firstOrderDifferentialEquations0).getDimension();
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2271.7912568934, 0.25, 5, (-716.4726714523975));
      double[] doubleArray0 = new double[5];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, 5.0, 1.0E15).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-115.539312), 2007.93157414506, (-3205));
      graggBulirschStoerIntegrator0.setStepsizeControl(0.25, 0.25, (-115.539312), (-3300.8104584366));
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 164362.08189619292, doubleArray0, 2098.1986317997, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (2,271.791) reached, integration needs 0.528
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2090.753280500733), 839.510493, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl((-3.4046500868740456E-4), 1867.413724094828, 0.04471061572777259, (-3.4046500868740456E-4));
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(1948.66, 839.510493, (-3.4046500868740456E-4), 2112007227);
      int int0 = 0;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double double0 = (-44.536540367364);
      // Undeclared exception!
      graggBulirschStoerIntegrator1.integrate(firstOrderConverter0, int0, doubleArray0, double0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2090.753280500733), 839.510493, doubleArray0, doubleArray0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-2090.753280500733), 1359.900646103, (-1370.4435029980834), (-2090.753280500733));
      graggBulirschStoerIntegrator0.setStepsizeControl(2112007227, 0.04471061572777259, 0.04471061572777259, 839.510493);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator1.integrate(firstOrderConverter0, (-3.0689499459498917), doubleArray0, 1393.1115, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5, 5).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 14, 5, 4.0E-15);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 6, doubleArray0, Double.NaN, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5, 5).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[5];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-3202), doubleArray0, doubleArray0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 1916.25671871, doubleArray0, 1.0000000000000008E15, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5, 5).when(firstOrderDifferentialEquations0).getDimension();
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2271.7912568934, 0.25, 5, (-714.39));
      double[] doubleArray0 = new double[5];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2271.7912568934, (-2696.03), (-1.0), 0.9, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 0.01, 1.0E15, 5);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2146996109, (-2977), 0.01);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2007.93157414506, doubleArray0, (-4049.130296314496), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5, 5).when(firstOrderDifferentialEquations0).getDimension();
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2271.7912568934, 0.25, 5, (-714.39));
      double[] doubleArray0 = new double[5];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, 5.0, 1.0E15).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-714.39), (-2131.95775), 5);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(1.0E15, 2271.7912568934, doubleArray0, doubleArray0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 5, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (2,271.791) reached, integration needs 0.528
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5, 5).when(firstOrderDifferentialEquations0).getDimension();
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2271.7912568934, 0.25, 5, 5);
      double[] doubleArray0 = new double[5];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-8), doubleArray0, (-2977), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (2,271.791) reached, integration needs 0.464
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2090.753280500733), 839.510493, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.65, (-2579.6), 0.0, 2271.7912568934);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(2007.93157414506, 3.0, 4383.0, (-1422.0));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator1.integrate(firstOrderConverter0, (-4973.237076358761), doubleArray0, (-9.332130526430229), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1149.0, (-80.56484336), 1149.0, (-80.56484336));
      graggBulirschStoerIntegrator0.setOrderControl(2146868271, 0.9, (-21.675641455357116));
      assertEquals(1149.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-4377.6078), (-4377.6078), (-4377.6078), (-4377.6078));
      graggBulirschStoerIntegrator0.setOrderControl(596, 372.0, (-1787.0231163));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5, 5).when(firstOrderDifferentialEquations0).getDimension();
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2271.7912568934, 0.25, 5, (-716.4726714523975));
      double[] doubleArray0 = new double[5];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, 5.0, 1.0E15).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-115.539312), 2007.93157414506, (-3205));
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 105, 3, 105);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 164362.08189619292, doubleArray0, 2098.1986317997, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (2,271.791) reached, integration needs 0.528
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5, 5).when(firstOrderDifferentialEquations0).getDimension();
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2271.7912568934, 0.25, 5, (-714.39));
      double[] doubleArray0 = new double[5];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 0.01, 1.0E15, 5);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2146996109, (-2977), 0.01);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2007.93157414506, doubleArray0, (-4049.130296314496), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (2,271.791) reached, integration needs 0.528
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.1521609496625161, (-782.025006283), (-782.025006283), 0.1521609496625161);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 289.0, doubleArray0, (-9.7398744), doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 0, (-932), 61.772349128);
      assertEquals((-298.7398744), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.1521609496625161, (-782.025006283), (-782.025006283), 0.1521609496625161);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2146096384, 4543, 0.1521609496625161);
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 0.25, doubleArray0, 0.1521609496625161, doubleArray0);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-4377.6078), (-4377.6078), (-4377.6078), (-4377.6078));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1708.3511067559, doubleArray0, 515.0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-214727), 1968, 1968);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.1521609496625161, (-782.025006283), (-782.025006283), 0.1521609496625161);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 289.0, doubleArray0, (-9.7398744), doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl((-3191.5), 2227.915, (-370.20532713), 2638);
      assertEquals((-9.73987440000002), graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.1521609496625161, (-782.025006283), (-782.025006283), 0.1521609496625161);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.setStepsizeControl(4017.89282, (-0.3111643669578199), 2.382468931778144, 2.0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 2998.0, doubleArray0, 28.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.1521609496625161, (-782.025006283), (-782.025006283), 0.1521609496625161);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 289.0, doubleArray0, (-9.7398744), doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.1521609496625161, 0.04471061572777259, 1359.900646103, 1.0E-4);
      assertEquals((-782.025006283), graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }
}
