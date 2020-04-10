/*

 * Tue Mar 03 15:34:48 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.ContinuousOutputModel;
import org.apache.commons.math.ode.DummyStepHandler;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.StepHandler;
import org.apache.commons.math.ode.SwitchingFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GraggBulirschStoerIntegrator_ESTest extends GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.7976931348623157E308, 1.7976931348623157E308, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize((-1476.0624));
      assertEquals(Double.POSITIVE_INFINITY, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1258.01626581, 35.81684148639408, 1258.01626581, 35.81684148639408);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 914, 1, 0.8);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(1265.820096, 35.81684148639408, (-939.8844), 4565.5);
      graggBulirschStoerIntegrator1.setInitialStepSize(1258.01626581);
      assertEquals(212.92646084675368, graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(457.6242313370667, 1507.0, 1507.0, (-537.61));
      graggBulirschStoerIntegrator0.setOrderControl(562, 1.0E-4, (-537.61));
      assertEquals(830.4454928681108, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1036.338125, 1036.338125, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(0.0, true);
      assertEquals(1036.338125, double0, 0.01);
      
      graggBulirschStoerIntegrator0.setOrderControl(1241, 92.2, 4458.1080765162);
      assertEquals(1036.338125, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1258.01626581, 35.81684148639408, 1258.01626581, 35.81684148639408);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 914, 914, 0.8);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[4];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 914, doubleArray0, 2585.0, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, initial state vector has dimension 4
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2038.3105042063307), (-775.0), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize((-2038.3105042063307));
      graggBulirschStoerIntegrator0.setStepsizeControl(2763.5062624989187, (-775.0), 1.0E-4, 3.0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(1256.8574464750989, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3717.3758), (-3717.3758), (-3717.3758), 0.1413124436746325);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(2859.449328484965, 1277.7538848, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 2859.449328484965, doubleArray0, (-1526.077405583), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1476.0624), (-1.0), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-51.3399292399), doubleArray0, (-1476.0624), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, initial state vector has dimension 2
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1258.01626581, 35.81684148639408, 1258.01626581, 35.81684148639408);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 914, 1, 0.8);
      double double0 = graggBulirschStoerIntegrator0.filterStep(6267.34, false);
      assertEquals(212.2690961487851, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(35.81684148639408, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1258.01626581, 35.81684148639408, 1258.01626581, 35.81684148639408);
      graggBulirschStoerIntegrator0.setStepsizeControl(1, 2763.5062624989187, 1258.01626581, 1265.820096);
      graggBulirschStoerIntegrator0.setInitialStepSize(1.0E15);
      assertEquals(212.2690961487851, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-420.7), (-775.0), (-775.0), 93.3765784);
      graggBulirschStoerIntegrator0.setInitialStepSize((-775.0));
      graggBulirschStoerIntegrator0.setStepsizeControl(3.5219323679207912, (-3005.88), 1253.872057236639, (-420.7));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(571.0013134836031, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-4894.8466567), (-1866.7), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-1160), 2722, (-1938));
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 2722, 0).when(firstOrderDifferentialEquations0).getDimension();
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-30.0), doubleArray0, (-3294.5), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, final state vector has dimension 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(572.155119738, 0.02, 0.02, 572.155119738);
      graggBulirschStoerIntegrator0.setStepsizeControl((-3717.3758), 0.02, 1401.0710425132338, (-1487.9698114));
      assertEquals(3.3827654950883015, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3202.36, 3202.36, 4565.5, 4565.5);
      graggBulirschStoerIntegrator0.setStepsizeControl(583.900924952, 3657.660328274, (-495.5236840557), 583.900924952);
      try { 
        graggBulirschStoerIntegrator0.filterStep(0.5, false);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (3,202.36) reached, integration needs 0.5
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-99.59675), 0.0, (-1469.7042088356), (-2848.586918984631));
      double double0 = graggBulirschStoerIntegrator0.filterStep((-3791.52811), false);
      assertEquals(-0.0, double0, 0.01);
      
      graggBulirschStoerIntegrator0.setStepsizeControl(1335.19650135261, (-1.0), (-950.9), 2.382468931778144);
      assertEquals(-0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 1.0E15, 4.0, 0.0);
      graggBulirschStoerIntegrator0.setOrderControl((-373), 2730.602761, 1.0E-4);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(1.0E15, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
      
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(3607.7729253921343, 2.1170345824450285, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator1.filterStep((-208.6), true);
      assertEquals(87.39439369126613, graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
      assertEquals((-2.1170345824450285), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1258.01626581, 35.81684148639408, 1258.01626581, 35.81684148639408);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2145874953, 2145874953, 1258.01626581);
      graggBulirschStoerIntegrator0.setInitialStepSize(35.81684148639408);
      assertEquals(212.2690961487851, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1258.01626581, 35.81684148639408, 1258.01626581, 35.81684148639408);
      double[] doubleArray0 = new double[8];
      graggBulirschStoerIntegrator0.vecAbsoluteTolerance = doubleArray0;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1, doubleArray1, 1, doubleArray1);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: state vector has dimension 0, absolute tolerance vector has dimension 8
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1258.01626581, 35.81684148639408, 1258.01626581, 35.81684148639408);
      graggBulirschStoerIntegrator0.setStepsizeControl(1, 2763.5062624989187, 1258.01626581, 1265.820096);
      double double0 = graggBulirschStoerIntegrator0.filterStep(6267.34, false);
      assertEquals(35.81684148639408, double0, 0.01);
      assertEquals(212.2690961487851, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-0.08333333333333333), (-0.08333333333333333), 0.0);
      double[] doubleArray0 = new double[0];
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-0.08333333333333333), doubleArray0, 1958, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-99.59675), 0.0, (-1469.7042088356), (-2848.586918984631));
      double double0 = graggBulirschStoerIntegrator0.filterStep((-3791.52811), false);
      assertEquals(-0.0, double0, 0.01);
      
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      graggBulirschStoerIntegrator0.setStepHandler(continuousOutputModel0);
      assertEquals(-0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-562.01528366908), (-562.01528366908), (-3651.62897272328), (-39.17726167561544));
      graggBulirschStoerIntegrator0.setStepsizeControl(1188.475, 0.0, 1188.475, 0.02);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(124, 8).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[1];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2563.487246, doubleArray0, 1874.0, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 8, initial state vector has dimension 1
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1258.01626581, 35.81684148639408, 1258.01626581, 35.81684148639408);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2585, 2585, 1258.01626581);
      graggBulirschStoerIntegrator0.setInitialStepSize(1.0E15);
      assertEquals(212.2690961487851, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1258.01626581, 35.81684148639408, 1258.01626581, 35.81684148639408);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 914, 1, 0.8);
      graggBulirschStoerIntegrator0.setInitialStepSize(1.0E15);
      assertEquals(212.2690961487851, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1.0), 1759.01985353479, (-1881.102250408), 1759.01985353479);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 4, (-1851), 1.0E-4);
      graggBulirschStoerIntegrator0.setInitialStepSize(186.34);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3093.13, 35.81684148639408, (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setInitialStepSize(1.0E15);
      assertEquals(332.84553009888856, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2038.3105042063307), (-775.0), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize((-775.0));
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2585, 2585, 1311.032216916109);
      assertEquals(1256.8574464750989, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1.0), 1759.01985353479, (-1881.102250408), 1759.01985353479);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.7346061839349769, (-453.0), 0.9999, (-2018.3350401));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3717.3758), (-3717.3758), (-3717.3758), 0.1413124436746325);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 32, 32, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-1791.0664), doubleArray0, (-1720.15963128), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1476.0624), (-1.0), doubleArray0, doubleArray0);
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-1476.0624), (-1.0), 6);
      assertEquals(38.41955751957589, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(110.791266, 110.791266, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(98.90862, 0.0, 0.0, (-1935.8096));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 3, doubleArray0, (-1935.8096), doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 1.0E15, 4.0, 0.0);
      graggBulirschStoerIntegrator0.setOrderControl((-373), 2730.602761, 1.0E-4);
      double double0 = graggBulirschStoerIntegrator0.filterStep(1.0E-4, true);
      assertEquals(1.0E-4, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-0.08333333333333333), (-0.08333333333333333), 0.0);
      graggBulirschStoerIntegrator0.setStepsizeControl(2.1170345824450285, 0.0, 0.0, 0.0);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-0.08333333333333333), doubleArray0, 1958, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-0.08333333333333333), (-0.08333333333333333), 0.0);
      graggBulirschStoerIntegrator0.setStepsizeControl(2.1170345824450285, 0.0, 0.0, 0.0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 2055, 0).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-0.08333333333333333), doubleArray0, 1525.23360728, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, final state vector has dimension 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3717.3758), (-3717.3758), (-3717.3758), 0.1413124436746325);
      graggBulirschStoerIntegrator0.setStepsizeControl(2859.449328484965, (-3717.3758), 366.885172, 1277.7538848);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 2859.449328484965, doubleArray0, (-1526.077405583), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3607.7729253921343, 2.1170345824450285, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(1662.2, true);
      assertEquals(2.1170345824450285, double0, 0.01);
      
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2585, (-2976), 3607.7729253921343);
      assertEquals(87.39439369126613, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 1.0E15, 4.0, 0.0);
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(3607.7729253921343, 2.1170345824450285, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 2081.895074280847, doubleArray0, (-1935.31), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2038.3105042063307), (-775.0), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-775.0), doubleArray0, (-775.0), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3607.7729253921343, 2.1170345824450285, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2585, (-2976), 3607.7729253921343);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-2976), doubleArray0, (-160.29118442503), doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1258.01626581, 35.81684148639408, 1258.01626581, 35.81684148639408);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2145874953, 2145874953, 1258.01626581);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2145874953, 235).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[1];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 1258.01626581, doubleArray0, 35.81684148639408, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 235, initial state vector has dimension 1
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 1.0E15, 4.0, 0.0);
      graggBulirschStoerIntegrator0.setOrderControl((-373), 2730.602761, 1911.7671);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 2081.895074280847, doubleArray0, (-1935.31), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1036.338125, 1036.338125, doubleArray0, doubleArray0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      double double0 = graggBulirschStoerIntegrator0.filterStep(0.0, true);
      assertEquals(1036.338125, double0, 0.01);
      
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-2854.1), 0.01, 1241);
      StepHandler stepHandler0 = graggBulirschStoerIntegrator0.getStepHandler();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      assertEquals(1036.338125, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.filterStep(0.0, false);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-1641.89562998675), 0.0, (-736));
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1258.01626581, 35.81684148639408, 1258.01626581, 35.81684148639408);
      graggBulirschStoerIntegrator0.setStepsizeControl(1, 2763.5062624989187, 1258.01626581, 1265.820096);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1, doubleArray0, 1148.364511593989, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-4894.8466567), (-1866.7), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-1160), 2722, (-1938));
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-30.0), doubleArray0, (-3294.5), doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1258.01626581, 35.81684148639408, 1258.01626581, 35.81684148639408);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2585, 2585, 1258.01626581);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1, doubleArray0, 1148.364511593989, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(572.155119738, 0.02, 0.02, 572.155119738);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 1, 1, (-0.04432804463693693));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 2247.97, doubleArray0, 0.02, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(572.155119738, 0.02, 0.02, 572.155119738);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 0, 0, 2830.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 2247.97, doubleArray0, 0.02, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2038.3105042063307), (-775.0), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-2038.3105042063307), doubleArray0, 1.0E-10, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1258.01626581, 35.81684148639408, 1258.01626581, 35.81684148639408);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 914, 1, 0.8);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1, doubleArray0, 1148.364511593989, doubleArray0);
  }
}
