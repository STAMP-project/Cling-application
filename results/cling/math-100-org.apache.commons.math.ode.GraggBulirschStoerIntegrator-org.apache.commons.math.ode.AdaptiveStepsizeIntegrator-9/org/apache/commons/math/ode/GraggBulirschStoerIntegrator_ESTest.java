/*

 * Tue Mar 03 15:19:45 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.DummyStepHandler;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.FixedStepHandler;
import org.apache.commons.math.ode.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.StepHandler;
import org.apache.commons.math.ode.StepNormalizer;
import org.apache.commons.math.ode.SwitchingFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GraggBulirschStoerIntegrator_ESTest extends GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-189.17813819516758), (-189.17813819516758), (-189.17813819516758), (-189.17813819516758));
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 9, 11, 0.9);
      double double0 = graggBulirschStoerIntegrator0.filterStep(1505.053325, true);
      assertEquals(189.17813819516758, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-189.17813819516758), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.8, 100.0, 0.0, 0.8);
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 100.0, (-885.417833), 6);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-186.204547), doubleArray0, (-186.204547), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-189.17813819516758), (-189.17813819516758), (-189.17813819516758), (-189.17813819516758));
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(1018, 38, 1018, 2432.210239113663);
      double double0 = graggBulirschStoerIntegrator1.filterStep(1.0, true);
      assertEquals(38.0, double0, 0.01);
      assertEquals(196.68248523953525, graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
      
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1841, 1841, 1.0);
      assertEquals((-189.17813819516758), graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1287.34907), (-1287.34907), (-1287.34907), (-3673.3862));
      graggBulirschStoerIntegrator0.setOrderControl(996, 0.94, (-5047.595116479431));
      assertEquals(1287.34907, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(726.628283, 2432.210239113663, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(1.0E-4, true);
      assertEquals(726.628283, double0, 0.01);
      assertEquals(1329.4031555334072, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-297.442501), (-297.442501), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1947, 1947, 1.0E-4);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-4055.35468856), doubleArray0, (-4055.35468856), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 16, initial state vector has dimension 2
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setInitialStepSize(0.0);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.5667149535193777, 0.0, (-4077.15), 2258.0);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2432.210239113663, 2432.210239113663, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(1568.88814437496, 1568.88814437496, 1.0, 1182.215749);
      try { 
        graggBulirschStoerIntegrator0.filterStep(1.0, false);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (2,432.21) reached, integration needs 1
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-189.17813819516758), (-189.17813819516758), (-189.17813819516758), (-189.17813819516758));
      double double0 = graggBulirschStoerIntegrator0.filterStep(1.0, true);
      assertEquals((-189.17813819516758), double0, 0.01);
      
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1841, 1841, 1.0);
      assertEquals(189.17813819516758, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.8, 100.0, 0.0, 0.8);
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-885.417833), 0.8, (-1856.705306972535), 41.25137005563636, (double)0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 100.0, (-885.417833), 6);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-35.6), doubleArray0, 1.0E-4, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-35.6,NaN]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.9, 0.9, 0.9, 2132.1531117097);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2791, 2791, (-1042.917843032143));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 2132.1531117097, doubleArray0, 2132.1531117097, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(12.0, 0.7777137798053443, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-1.7672812570757455), true);
      assertEquals((-0.7777137798053443), double0, 0.01);
      
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(1.7976931348623157E308, fixedStepHandler0);
      graggBulirschStoerIntegrator0.setStepHandler(stepNormalizer0);
      assertEquals(3.0549247711955414, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-189.17813819516758), (-189.17813819516758), (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setInitialStepSize(303.7);
      graggBulirschStoerIntegrator0.setStepsizeControl(303.7, 0.04471061572777259, (-1829.658643091), 0.04471061572777259);
      assertEquals(189.17813819516758, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(6, (-173.0), doubleArray0, (double[]) null);
      graggBulirschStoerIntegrator0.setInitialStepSize((-9.35292435884448));
      graggBulirschStoerIntegrator0.setStepsizeControl(2.9475147891527724, 2087.345906667, (-9.35292435884448), 1708.161);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-189.17813819516758), (-189.17813819516758), (double[]) null, (double[]) null);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(1884.0309188778006, (-1771.0940071), (double[]) null, (double[]) null);
      double double0 = graggBulirschStoerIntegrator1.filterStep((-3.75), true);
      assertEquals(1771.0940071, double0, 0.01);
      
      graggBulirschStoerIntegrator0.setOrderControl((-4924), (-4924), 1429.3082);
      assertEquals(189.17813819516758, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2080.510672131825, 1530.1695, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-450.63508), true);
      assertEquals((-1530.1695), double0, 0.01);
      
      graggBulirschStoerIntegrator0.setOrderControl((-4924), 2080.510672131825, 0.3752119474003136);
      assertEquals(1784.246052236243, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-287.0485526212136), (-287.0485526212136), (-287.0485526212136), (-287.0485526212136));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 11, 1366, 643.776688546847);
      graggBulirschStoerIntegrator0.setInitialStepSize((-765.78762427073));
      assertEquals(287.0485526212136, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(726.628283, (-26.041666666666668), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(59.9779, (-2220.406471759), 0.3752119474003136, (-2220.406471759));
      double[] doubleArray1 = new double[3];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(2432.5, (-0.08899033645133331), doubleArray1, doubleArray1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator1.integrate(firstOrderConverter0, 2432.5, doubleArray0, 1.3333333333333333, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: state vector has dimension 0, absolute tolerance vector has dimension 3
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.3752119474003136, 0.3752119474003136, doubleArray0, doubleArray0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(2080.510672131825, 1530.1695, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator1.filterStep((-450.63508), true);
      assertEquals(1784.246052236243, graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
      assertEquals((-1530.1695), double0, 0.01);
      
      graggBulirschStoerIntegrator0.setStepsizeControl(0.3752119474003136, 2.2404374302607883, (-1233.2858064), 6129.76);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-189.17813819516758), (-189.17813819516758), (-189.17813819516758), (-189.17813819516758));
      graggBulirschStoerIntegrator0.setStepsizeControl(1018, 38, (-189.17813819516758), 0.04471061572777259);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(1018, 38, 1018, 2432.210239113663);
      double double0 = graggBulirschStoerIntegrator1.filterStep(1.0, true);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator1.getCurrentStepStart(), 0.01);
      assertEquals(38.0, double0, 0.01);
      assertEquals(196.68248523953525, graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-189.17813819516758), (-189.17813819516758), (-189.17813819516758), (-189.17813819516758));
      graggBulirschStoerIntegrator0.setStepsizeControl(1018, 11, (-189.17813819516758), 0.04471061572777259);
      double double0 = graggBulirschStoerIntegrator0.filterStep(1505.053325, true);
      assertEquals((-189.17813819516758), double0, 0.01);
      assertEquals(189.17813819516758, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(6, (-4783.68), doubleArray0, doubleArray0);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-38.237134090395), false);
      assertEquals((-4783.68), double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(12.0, 0.7777137798053443, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-1.7672812570757455), true);
      assertEquals((-0.7777137798053443), double0, 0.01);
      
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 22, 22, 22);
      assertEquals(3.0549247711955414, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.3752119474003136, 0.3752119474003136, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.setStepsizeControl(0.3752119474003136, 2.2404374302607883, (-1233.2858064), 6129.76);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 0.3752119474003136, doubleArray0, 2.2404374302607883, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, initial state vector has dimension 4
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-189.17813819516758), (-189.17813819516758), (-189.17813819516758), (-189.17813819516758));
      graggBulirschStoerIntegrator0.setInitialStepSize((-189.17813819516758));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1841, 1841, 1.0);
      assertEquals(189.17813819516758, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-189.17813819516758), (-189.17813819516758), (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setInitialStepSize(303.7);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 1018, 11, 0.9);
      assertEquals(189.17813819516758, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-189.17813819516758), (-189.17813819516758), (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setInitialStepSize(662.7575);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2791, 2791, 662.7575);
      assertEquals(189.17813819516758, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-189.17813819516758), (-189.17813819516758), (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setInitialStepSize((-189.17813819516758));
      assertEquals(189.17813819516758, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.7777137798053443, 0.7777137798053443, 0.3752119474003136, 0.7777137798053443);
      graggBulirschStoerIntegrator0.setOrderControl((-4924), (-473.2106575416083), 0.3752119474003136);
      double double0 = graggBulirschStoerIntegrator0.filterStep(4969.3253512, false);
      assertEquals(0.7777137798053443, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.7777137798053443, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-287.0485526212136), (-287.0485526212136), (-287.0485526212136), (-287.0485526212136));
      graggBulirschStoerIntegrator0.setOrderControl(11, 0.0, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-2532.8236415433), doubleArray0, (-5960.707672483058), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(12.0, 0.7777137798053443, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-1.7672812570757455), true);
      assertEquals((-0.7777137798053443), double0, 0.01);
      
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 41.25137005563636, 0.001, 22);
      assertEquals(3.0549247711955414, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1287.34907), (-1287.34907), (-1287.34907), (-3673.3862));
      graggBulirschStoerIntegrator0.setStepsizeControl(996, 0.94, (-1287.34907), (-1287.34907));
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-1353.18949), (-3673.3862), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator1.integrate(firstOrderConverter0, 0.94, doubleArray0, 996, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.8, 100.0, 0.0, 0.8);
      double[] doubleArray0 = new double[3];
      graggBulirschStoerIntegrator0.vecAbsoluteTolerance = doubleArray0;
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1366, 2145376205, 0.01);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 100.0, doubleArray1, (-5960.707672483058), graggBulirschStoerIntegrator0.vecAbsoluteTolerance);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, final state vector has dimension 3
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.3752119474003136, 0.3752119474003136, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4, 2146432441, 0).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.setStepsizeControl(0.3752119474003136, 2.2404374302607883, (-1233.2858064), 6129.76);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 0.3752119474003136, doubleArray0, 2.2404374302607883, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, final state vector has dimension 4
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1287.34907), (-1287.34907), (-1287.34907), (-3673.3862));
      graggBulirschStoerIntegrator0.setStepsizeControl(996, 0.94, (-1287.34907), (-1287.34907));
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 0.94, doubleArray0, 996, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.8, 100.0, 0.0, 0.8);
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-2750.10963), 1421.55, doubleArray0, doubleArray0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-1856.705306972535), doubleArray0, 0.25, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.8, 100.0, 0.0, 0.8);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-885.417833), 0.8, (-1856.705306972535), 41.25137005563636, (double)0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 100.0, (-885.417833), 6);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-2750.10963), 1421.55, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-35.6), doubleArray0, 1.0E-4, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-35.6,NaN]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-189.17813819516758), (-189.17813819516758), (-189.17813819516758), (-189.17813819516758));
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 30, 38, 0.9);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(1018, 38, 1018, 2432.210239113663);
      double double0 = graggBulirschStoerIntegrator1.filterStep(1.0, true);
      assertEquals(38.0, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator1.getCurrentStepStart(), 0.01);
      assertEquals(196.68248523953525, graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2750.10963), 1421.55, doubleArray0, doubleArray0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-186.204547), doubleArray0, (-186.204547), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(726.628283, 2432.210239113663, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 3730, 3730, 3730);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 3136.355055001, doubleArray0, 1.0E-4, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-297.442501), (-297.442501), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 10, 3730, 999.9);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-4055.35468856), doubleArray0, (-4055.35468856), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 16, initial state vector has dimension 2
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-189.17813819516758), (-189.17813819516758), (-189.17813819516758), (-189.17813819516758));
      DummyStepHandler dummyStepHandler0 = (DummyStepHandler)graggBulirschStoerIntegrator0.handler;
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(1018, 38, 1018, 2432.210239113663);
      double double0 = graggBulirschStoerIntegrator1.filterStep(1.0, true);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator1.getCurrentStepStart(), 0.01);
      assertEquals(196.68248523953525, graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
      assertEquals(38.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-189.17813819516758), (-189.17813819516758), (double[]) null, (double[]) null);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-1697.50894365826), doubleArray0, (-2052.479606584), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.8, 100.0, 0.0, 0.8);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.0, 0.0, (-885.417833), 41.25137005563636);
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 0.9999, (-516.221936591), 0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 747.174995, doubleArray0, (-1856.705306972535), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(100.10408, 100.10408, 100.10408, 100.10408);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-248), (-825701510), 41.25137005563636);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 2297.0, 41.25137005563636, (-248));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 255.720664866987, doubleArray0, 2297.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(100.10408, 100.10408, 100.10408, 100.10408);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-248), (-825701510), 41.25137005563636);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 255.720664866987, doubleArray0, 2297.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.8, 100.0, 0.0, 0.8);
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      graggBulirschStoerIntegrator0.setOrderControl(767, 1012.691594642482, 424.12779791);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 0.8, doubleArray0, 1.0E-4, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-287.0485526212136), (-287.0485526212136), (-287.0485526212136), (-287.0485526212136));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 11, 1366, 643.776688546847);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-2532.8236415433), doubleArray0, (-5960.707672483058), doubleArray0);
  }
}
