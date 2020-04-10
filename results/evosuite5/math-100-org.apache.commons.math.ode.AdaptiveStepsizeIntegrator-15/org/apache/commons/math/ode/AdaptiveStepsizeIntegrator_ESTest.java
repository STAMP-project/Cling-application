/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 14:37:43 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.DormandPrince54Integrator;
import org.apache.commons.math.ode.DormandPrince853Integrator;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.HighamHall54Integrator;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.StepHandler;
import org.apache.commons.math.ode.SwitchingFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AdaptiveStepsizeIntegrator_ESTest extends AdaptiveStepsizeIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-2049.9), (-2049.9), (-0.35032884874997366), (-0.35032884874997366));
      double double0 = dormandPrince853Integrator0.filterStep((-2049.9), true);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(2049.9, double0, 0.01);
      assertEquals(2049.9, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-804.2500988), (-0.871391583777973), (-804.2500988), (-804.2500988));
      double double0 = dormandPrince853Integrator0.filterStep(177.83116392812, true);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(26.47294406270151, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-0.871391583777973), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(100.0, 0.0, doubleArray0, doubleArray0);
      try { 
        graggBulirschStoerIntegrator0.filterStep(1.0E-10, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (100) reached, integration needs 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1396.534317669, 2739.8596223219984, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-1344.882), true);
      assertEquals((-1396.534317669), double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(1956.0950866888595, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(30.0, 155.2866405, 1652.0672, 1554.894225);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 2080374784;
      double double0 = dormandPrince54Integrator0.initializeStep(firstOrderConverter0, true, 2080374784, doubleArray0, 155.2866405, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(30.0, double0, 0.01);
      assertEquals(68.25393186476512, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertArrayEquals(new double[] {2.10117853184E9}, doubleArray0, 0.01);
      assertEquals(155.2866405, dormandPrince54Integrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(30.0, 155.2866405, 1652.0672, 1554.894225);
      double[] doubleArray0 = new double[1];
      double double0 = dormandPrince54Integrator0.initializeStep(firstOrderConverter0, true, 2080374784, doubleArray0, 155.2866405, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(155.2866405, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(68.25393186476512, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertArrayEquals(new double[] {Double.NaN}, doubleArray0, 0.01);
      assertEquals(30.0, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1964.8394051121757), 0.0, (-1964.8394051121757), 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 0.0, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1001.89), 540.9953, doubleArray0, doubleArray0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(firstOrderConverter0, (-316.12), doubleArray0, 10.0433251428, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(30.0, 155.2866405, 1652.0672, 1554.894225);
      double[] doubleArray0 = new double[1];
      try { 
        dormandPrince54Integrator0.sanityChecks(firstOrderConverter0, (-676.0578), doubleArray0, 1652.0672, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, initial state vector has dimension 1
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-0.35032884874997366), (-4474.9), doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[4];
      try { 
        dormandPrince54Integrator0.sanityChecks(firstOrderConverter0, (-2739.8596223219984), doubleArray0, (-2049.9), doubleArray1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, final state vector has dimension 4
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-0.3125), (-1.0), (-1.0), (-1.0));
      dormandPrince54Integrator0.setInitialStepSize((-0.3125));
      assertEquals(0.5590169943749475, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1938.27457), 469.02349321619, 469.02349321619, 3.0);
      graggBulirschStoerIntegrator0.setInitialStepSize((-899.46046243134));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2389.848716, 0.0, 2389.848716, 2081.544);
      dormandPrince853Integrator0.setInitialStepSize(2081.544);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(2389.848716, dormandPrince853Integrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1614.027552917, 1614.027552917, 1614.027552917, 316.2405448116531);
      double double0 = dormandPrince853Integrator0.getCurrentSignedStepsize();
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(1614.027552917, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(3.5555555555555554, 2215.5237735, 1203.7857410126, 2215.5237735);
      double double0 = dormandPrince853Integrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(88.75481880626727, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-0.35032884874997366), (-4474.9), doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[4];
      double double0 = dormandPrince54Integrator0.initializeStep(firstOrderConverter0, false, (-4007), doubleArray0, (-2800.46), doubleArray0, (double[]) null, doubleArray1, doubleArray0);
      assertEquals(39.59402183753574, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(4474.9, double0, 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-0.35032884874997366), dormandPrince54Integrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0, 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.getStepHandler();
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(1.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3966.918158), 2049.9, 662.929264, 662.929264);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-2049.9), 1137963.0, 974);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1938.27457), 469.02349321619, 469.02349321619, 3.0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.setStepHandler((StepHandler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerIntegrator", e);
      }
  }
}
