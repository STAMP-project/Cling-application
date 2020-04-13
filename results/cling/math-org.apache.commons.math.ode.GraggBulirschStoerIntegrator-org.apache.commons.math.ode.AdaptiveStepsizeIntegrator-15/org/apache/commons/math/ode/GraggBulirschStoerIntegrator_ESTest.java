/*

 * Tue Mar 03 15:11:34 GMT 2020
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
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(6, 0.0, (-2942.625340750787), (-2942.625340750787));
      graggBulirschStoerIntegrator0.setInitialStepSize(0.04471061572777259);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 6, 6, 1.0E-4);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-549.628), (-549.628), doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-1021.42), false);
      assertEquals(549.628, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(549.628, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1537.06217, 100.0, 1537.06217, (-491.8126937960349));
      double double0 = graggBulirschStoerIntegrator0.filterStep(100.0, true);
      assertEquals(100.0, double0, 0.01);
      
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 4, 4, 1537.06217);
      assertEquals(392.0538445162858, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(752.6686391089, 752.6686391089, (double[]) null, (double[]) null);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-0.84375), true);
      assertEquals(752.6686391089, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-752.6686391089), double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4882.082994642182, 4882.082994642182, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(47, 2333.52072455055, 1258.783);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1.0E15, doubleArray0, 1.0E15, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4344.02184, 4344.02184, (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setOrderControl((-255), 752.6686391089, 4344.02184);
      double double0 = graggBulirschStoerIntegrator0.filterStep(2896.3137238485206, true);
      assertEquals(4344.02184, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(4344.02184, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(752.668639109, 752.668639109, (double[]) null, (double[]) null);
      double double0 = graggBulirschStoerIntegrator0.filterStep(0.8, true);
      assertEquals(752.668639109, double0, 0.01);
      
      graggBulirschStoerIntegrator0.setOrderControl(11, 0.7777137798053443, 0.2);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(752.668639109, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-923.91827911), (-923.91827911), 0.001, (-1550.80479766));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-255), (-255), 0.3111643669578199);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1009).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[1];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-923.91827911), doubleArray0, (-1550.80479766), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 2,018, initial state vector has dimension 1
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-549.628), 612.0, 0.02, (-5.008316185744419));
      graggBulirschStoerIntegrator0.setInitialStepSize(1615.435029230899);
      graggBulirschStoerIntegrator0.setStepsizeControl(357.6391179106141, 612.0, (-5.008316185744419), 357.6391179106141);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0, 1.0, (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 7, 7, 1.0E-6);
      try { 
        graggBulirschStoerIntegrator0.filterStep(1.0E-4, false);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (1) reached, integration needs 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-549.628), (-549.628), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 612, 2146556897, 612);
      double double0 = graggBulirschStoerIntegrator0.filterStep(770.2502248934208, true);
      assertEquals((-549.628), double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(549.628, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4882.082994642182, 4882.082994642182, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(4882.082994642182, true);
      assertEquals(4882.082994642182, double0, 0.01);
      
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 18, 18, 0.02);
      assertEquals(4882.082994642182, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0, 1.0, (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-1), (-1505), 1.0);
      graggBulirschStoerIntegrator0.setInitialStepSize(1.0E-4);
      assertEquals(1.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-549.628), (-549.628), doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 11, 0).when(firstOrderDifferentialEquations0).getDimension();
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 0.0, doubleArray0, (-1945.5), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, final state vector has dimension 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray1 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 3009.195766577383, doubleArray0, doubleArray1);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1080, (-788), (-2550.8836003081988));
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 558.420701333, doubleArray0, 1365.015588904, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: state vector has dimension 0, relative tolerance vector has dimension 2
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2223.59899189464, 2223.59899189464, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(6, 0).when(firstOrderDifferentialEquations0).getDimension();
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 0.5667149535193777, doubleArray0, 2223.59899189464, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, initial state vector has dimension 11
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2690.4927), (-2690.4927), 0.0, 0.0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(7, 47, 7).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[7];
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 4610, 4610, 1682.97603992087);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-2417.831784629182), doubleArray0, (-0.34701319655785756), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 7, final state vector has dimension 7
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(829.266913, 0.0, 0.0, 829.266913);
      double double0 = graggBulirschStoerIntegrator0.filterStep(161, true);
      assertEquals(0.0, double0, 0.01);
      
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(2035.9547577, fixedStepHandler0);
      graggBulirschStoerIntegrator0.setStepHandler(stepNormalizer0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(829.266913, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2223.59899189464, 100.0, 2223.59899189464, 29.8402934266605);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-775), 2, (-1476.898));
      double double0 = graggBulirschStoerIntegrator0.filterStep((-1476.898), true);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals((-100.0), double0, 0.01);
      assertEquals(471.5505266559078, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-923.91827911), (-923.91827911), 0.001, 0.001);
      graggBulirschStoerIntegrator0.setInitialStepSize((-923.91827911));
      graggBulirschStoerIntegrator0.setStepsizeControl(0.7777137798053443, 0.001, 0.001, 1783.9495);
      assertEquals(923.91827911, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(356.49836781521, 356.49836781521, 356.49836781521, 356.49836781521);
      graggBulirschStoerIntegrator0.setInitialStepSize(0.9999);
      graggBulirschStoerIntegrator0.setStepsizeControl(1357.997261657, (-2083.268604546796), 356.49836781521, 2490.69860202554);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(356.49836781521, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(63.07217, (-0.1521609496625161), 2184.5215289005014, 63.07217);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-9.35292435884448), true);
      assertEquals(0.1521609496625161, double0, 0.01);
      
      graggBulirschStoerIntegrator0.setStepsizeControl(1303.0, 2184.5215289005014, 2286.2199808273, 0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2317.21747883, 4132.22, 0.02, (-1565.8534602570444));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2, 0, 3019.5);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(63.07217, (-0.1521609496625161), 2184.5215289005014, 63.07217);
      double double0 = graggBulirschStoerIntegrator1.filterStep((-9.35292435884448), true);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator1.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.1521609496625161, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2223.59899189464, 100.0, 2223.59899189464, 37.10724797071874);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-1476.898), true);
      assertEquals((-100.0), double0, 0.01);
      
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 37.10724797071874, (-165.0), 3883);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(471.5505266559078, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0, 1.0, (double[]) null, (double[]) null);
      double double0 = graggBulirschStoerIntegrator0.filterStep(999.9, true);
      assertEquals(1.0, double0, 0.01);
      
      graggBulirschStoerIntegrator0.setStepsizeControl(7, 1365.015588904, (-2690.4927), (-4848.51031));
      assertEquals(1.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2317.21747883, 4132.22, 0.02, (-1565.8534602570444));
      double double0 = graggBulirschStoerIntegrator0.filterStep((-9.35292435884448), true);
      assertEquals((-2317.21747883), double0, 0.01);
      
      graggBulirschStoerIntegrator0.setStepsizeControl(1303.0, 2184.5215289005014, 2286.2199808273, 0);
      assertEquals(3094.390474773813, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-549.628), (-549.628), (-549.628), (-549.628));
      assertEquals((-549.628), graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
      assertEquals(549.628, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-1109.90585), doubleArray0, (-1213.3662271055), doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(4, 1, 1845.4242);
      assertEquals((-549.628), graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-923.91827911), (-923.91827911), 0.001, (-1550.80479766));
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 0.0, doubleArray0, 954.5965327700812, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-549.628), (-549.628), (-549.628), (-549.628));
      assertEquals(549.628, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-1109.90585), doubleArray0, (-1213.3662271055), doubleArray0);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      graggBulirschStoerIntegrator0.setStepHandler(continuousOutputModel0);
      assertEquals((-549.628), graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(29.8402934266605, 1.0, 29.8402934266605, Double.NaN);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-775), (-775), 0.30545274794128174);
      double double0 = graggBulirschStoerIntegrator0.filterStep(1.0, true);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(5.462626971216367, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-549.628), (-549.628), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 304, 304, 304);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 304, doubleArray0, 5411.7715, doubleArray0);
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
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2317.21747883, 4132.22, 0.02, (-1565.8534602570444));
      graggBulirschStoerIntegrator0.setStepsizeControl(1303.0, 2184.5215289005014, 2286.2199808273, 0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 631.0, doubleArray0, (-60.19669523126412), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, initial state vector has dimension 4
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2690.4927), (-2690.4927), 0.0, 0.0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 10, 47, 351.2387959997);
      graggBulirschStoerIntegrator0.setInitialStepSize(803.04);
      assertEquals(2690.4927, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-549.628), (-549.628), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 304, 304, 304);
      graggBulirschStoerIntegrator0.setInitialStepSize((-549.628));
      assertEquals(549.628, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-549.628), (-549.628), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize(2223.59899189464);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 18, 18, 0.02);
      assertEquals(549.628, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(752.668639109, 752.668639109, (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.2, 0.8, (-719.330088495), 0.2);
      double double0 = graggBulirschStoerIntegrator0.filterStep(0.8, true);
      assertEquals(752.668639109, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(752.668639109, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-923.91827911), (-923.91827911), 0.001, (-1569.9181669912834));
      graggBulirschStoerIntegrator0.setStepsizeControl(0.0, 0.0, 0.001, 0.001);
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-923.91827911), (-2690.4927), 1401);
      assertEquals(923.91827911, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-923.91827911), (-923.91827911), 0.001, (-1550.80479766));
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      double[] doubleArray0 = new double[0];
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 0.0, doubleArray0, 0.0, doubleArray0);
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
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(829.266913, 0.0, 0.0, 829.266913);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1204, 161).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[5];
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1204, 1204, 0.0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-2609.4933582986), doubleArray0, 11.0, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 161, initial state vector has dimension 5
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-549.628), (-549.628), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(696.6368864272949, (-549.628), (-549.628), (-897.9663022971));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 0.09114583333333333, doubleArray0, (-1437.54920862359), doubleArray0);
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
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-549.628), (-549.628), (-549.628), (-549.628));
      double[] doubleArray1 = new double[2];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-1945.5), (-2275.4496227614), (-1564));
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(0.0, 3009.195766577383, doubleArray0, doubleArray1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-262.84951161704277), doubleArray0, 3009.195766577383, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2317.21747883, 4132.22, 0.02, (-1565.8534602570444));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2, 0, 3019.5);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-9.35292435884448), true);
      assertEquals(3094.390474773813, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-2317.21747883), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0, 1.0, (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-775), (-1), 1327.87096471);
      try { 
        graggBulirschStoerIntegrator0.filterStep(1.0E-4, false);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (1) reached, integration needs 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-549.628), (-549.628), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.sanityChecks(firstOrderConverter0, 0.0, doubleArray0, (-549.628), doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 18, 18, 0.02);
      assertEquals(549.628, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2317.21747883, 4132.22, 0.02, (-1565.8534602570444));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2, 0, 3019.5);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 631.0, doubleArray0, (-60.19669523126412), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, initial state vector has dimension 4
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2223.59899189464, 2223.59899189464, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.addSwitchingFunction((SwitchingFunction) null, 10.0, 2223.59899189464, 0);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(0, true);
      assertEquals(2223.59899189464, double0, 0.01);
      assertEquals(2223.59899189464, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2317.21747883, 4132.22, 0.02, (-1565.8534602570444));
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-9.35292435884448), true);
      assertEquals(3094.390474773813, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-2317.21747883), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-549.628), (-549.628), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1, 1, (-495.0));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-549.628), doubleArray0, (-549.628), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-549.628), (-549.628), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 7, (-1431679625), (-549.628));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(0.09391537081776892, 1365.015588904, (-549.628), 1503.7484326595686);
      // Undeclared exception!
      graggBulirschStoerIntegrator1.integrate(firstOrderConverter0, 161.541905, doubleArray0, (-1023.6672960832822), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.09391537081776892, 0.09391537081776892, (-463.00797568288), 0.09391537081776892);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(273.964012154, 273.964012154, (-2417.9257), 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-463.00797568288), 16.0, 0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2144894031, 2144894031, 273.964012154);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-1173.879), doubleArray0, 357.6391179106141, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-1173.7850846291822,NaN]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-549.628), (-549.628), (-549.628), (-549.628));
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-1945.5), (-2275.4496227614), (-1564));
      graggBulirschStoerIntegrator0.setOrderControl(1080, (-788), 1.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-262.84951161704277), doubleArray0, 3009.195766577383, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.09391537081776892, 0.09391537081776892, (-463.00797568288), 0.09391537081776892);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2144894031, 2144894031, 273.964012154);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-1173.879), doubleArray0, 357.6391179106141, doubleArray0);
  }
}
