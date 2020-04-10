/*

 * Tue Mar 03 15:20:35 GMT 2020
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
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2633.676746075343, (-2849.946559), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize((-481.99368391));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2448.190683305292), (-2448.190683305292), 124.43446, (-2448.190683305292));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      graggBulirschStoerIntegrator0.setStepHandler(continuousOutputModel0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-2448.190683305292), doubleArray0, 124.43446, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3343.446114693018, 1638.314475954408, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-172), (-172), 3343.446114693018);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 0.5667149535193777, doubleArray1, (-2849.946559), doubleArray1);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: state vector has dimension 0, absolute tolerance vector has dimension 17
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(188.20109, (-694.01437718), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl((-1948), (-1871.682109), 1240.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1.0001, doubleArray0, 1.0001, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setOrderControl(0, 298.4, 119.09407766455);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(1180.0, 0, 0, (-836.0959534909206));
      double double0 = graggBulirschStoerIntegrator1.filterStep(1075.2, true);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator1.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setOrderControl(0, 298.4, 119.09407766455);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-432.58), doubleArray0, 0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2077.21066751), 0.65, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-898), (-755), 0.65);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(754).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1638.314475954408, doubleArray0, (-43.53345659001114), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 1,508, initial state vector has dimension 2
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(580.49, 1169.3, 1169.3, (-676.9926));
      graggBulirschStoerIntegrator0.setStepsizeControl(580.49, 1169.3, (-0.04432804463693693), (-676.9926));
      try { 
        graggBulirschStoerIntegrator0.filterStep(156.95408425797638, false);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (580.49) reached, integration needs 156.954
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-914.38176), 150.58257483, 2613.00770417, 943.465879706379);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-2706.848848392), 1.7976931348623157E308, doubleArray0, doubleArray0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-154.18974869023643), doubleArray0, (-1644.19467097731), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2449.0), (-2449.0), 124.43446, (-2449.0));
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-1925.12895571), 1213.7165594536036, doubleArray0, doubleArray1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-4.436036387594894), doubleArray1, 2613.13398, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, final state vector has dimension 6
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1385.12892653928, (-384.0), 2633.676746075343, (-481.99368391));
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(2633.676746075343, (-2849.946559), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-384.0), doubleArray0, 1795.080788345472, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.0, 2.0, 1.0E-6, 1.0E-6);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-172), 245, 245);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-2539), false);
      assertEquals((-2.0), double0, 0.01);
      assertEquals(2.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-914.38176), 150.58257483, 2613.00770417, 943.465879706379);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-1), 0, 308.6943947);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator1.integrate(firstOrderConverter0, (-154.18974869023643), doubleArray0, (-1644.19467097731), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3343.446114693018, 1638.314475954408, doubleArray0, doubleArray0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(3343.446114693018, fixedStepHandler0);
      graggBulirschStoerIntegrator0.setStepHandler(stepNormalizer0);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-0.3111643669578199), true);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(2340.4307657512736, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-1638.314475954408), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3181.507690251), (-3181.507690251), 1638.314475954408, 18.148505520854727);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 17, 15, 17);
      double double0 = graggBulirschStoerIntegrator0.filterStep(2140286989, false);
      assertEquals(3181.507690251, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-3181.507690251), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3336.21442312248, 1638.314475954408, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(1638.314475954408, (-1982.0), 3359, 0.0);
      assertEquals(2337.8982835635607, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-832.0), 1638.314475954408, (-172), (-1982.0));
      graggBulirschStoerIntegrator1.setInitialStepSize(2007.5226054593766);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator1.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(188.20109, (-694.01437718), doubleArray0, doubleArray0);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      graggBulirschStoerIntegrator0.setStepHandler(continuousOutputModel0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1.0001, doubleArray0, 1.0001, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(7.0, (-302.788), 1.3333333333333333, (-25.69393346270375));
      graggBulirschStoerIntegrator0.setOrderControl(10, 3164.42, (-302.788));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2449.0), (-2449.0), 124.43446, (-2449.0));
      graggBulirschStoerIntegrator0.setStepsizeControl(0.94, 0.94, 124.43446, 124.43446);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-1079.97283), 1180.0, (-1079.97283), (-836.0959534909206));
      double double0 = graggBulirschStoerIntegrator1.filterStep(1.0, true);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator1.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(7.0, 0.0, 1.3333333333333333, (-25.69393346270375));
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2075517986, 3279, (-876.38565458));
      graggBulirschStoerIntegrator0.setInitialStepSize((-25.69393346270375));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(7.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3343.446114693018, 1638.314475954408, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(7.4908491133103325, true);
      assertEquals(1638.314475954408, double0, 0.01);
      
      graggBulirschStoerIntegrator0.setStepsizeControl(1638.314475954408, (-1982.0), 1, 0.0);
      assertEquals(2340.4307657512736, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3343.446114693018, 1638.314475954408, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-0.3111643669578199), true);
      assertEquals((-1638.314475954408), double0, 0.01);
      
      graggBulirschStoerIntegrator0.setStepsizeControl(1638.314475954408, (-1982.0), 3359, 0.0);
      assertEquals(2340.4307657512736, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3343.446114693018, 1638.314475954408, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(7.4908491133103325, true);
      assertEquals(1638.314475954408, double0, 0.01);
      
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 3141, (-1276), 3343.446114693018);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(2340.4307657512736, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      DummyStepHandler dummyStepHandler0 = (DummyStepHandler)graggBulirschStoerIntegrator0.handler;
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-432.58), doubleArray0, 0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.0, 2.0, 1.0E-6, 1.0E-6);
      graggBulirschStoerIntegrator0.setStepsizeControl((-2539), (-2539), 0.9999, 1.0E-6);
      assertEquals(2.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3343.446114693018, 1638.314475954408, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(1638.314475954408, (-1982.0), 3359, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 35.81684, doubleArray0, 2776.2049632, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, initial state vector has dimension 17
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(124.76055823202506, (-2449.0), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize(1240.0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-940), 582, 1466.98925242);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3343.446114693018, 1638.314475954408, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-0.3111643669578199), true);
      assertEquals((-1638.314475954408), double0, 0.01);
      
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 1638.314475954408, 2776.2049632, (-172));
      assertEquals(2340.4307657512736, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-154.18974869023643), (-154.18974869023643), doubleArray0, doubleArray0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(419.90344, fixedStepHandler0);
      graggBulirschStoerIntegrator0.setStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.addSwitchingFunction((SwitchingFunction) null, (-1015.4732822355692), 419.90344, 1140);
      assertEquals(154.18974869023643, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-843.58682), 0.65, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl((-1597), 0.65, 0.9);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-304.18), (-304.18), 3578.534, (-914.38176));
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      double[] doubleArray0 = new double[0];
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 3578.534, doubleArray0, 3578.534, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2449.0), (-2449.0), 124.43446, (-2449.0));
      graggBulirschStoerIntegrator0.setStepsizeControl(0.94, 0.94, 124.43446, 124.43446);
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-4.436036387594894), doubleArray1, 2613.13398, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, final state vector has dimension 6
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3343.446114693018, 1638.314475954408, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(1638.314475954408, (-1982.0), 3359, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 0.5667149535193777, doubleArray1, (-2849.946559), doubleArray1);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: state vector has dimension 0, absolute tolerance vector has dimension 17
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3343.446114693018, 1638.314475954408, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-172), (-172), 3343.446114693018);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-0.3111643669578199), true);
      assertEquals(2340.4307657512736, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-1638.314475954408), double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3181.507690251), (-3181.507690251), 1638.314475954408, 18.148505520854727);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 17, 15, 17);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn((-2145333281), 0).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 298.4, doubleArray0, 18.148505520854727, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, initial state vector has dimension 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      StepHandler stepHandler0 = graggBulirschStoerIntegrator0.getStepHandler();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(1180.0, 2146841351, 2146841351, (-836.0959534909206));
      double double0 = graggBulirschStoerIntegrator1.filterStep(298.4, true);
      assertEquals(1180.0, double0, 0.01);
      assertEquals(1591625.8335990906, graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(188.20109, (-694.01437718), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2132264061, 2132264061, 1240.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1.0001, doubleArray0, 1.0001, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-304.18), (-304.18), 3578.534, (-914.38176));
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 0, 21, 21);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1006.48252577451, doubleArray0, 1.0E-15, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      graggBulirschStoerIntegrator0.setStepHandler(continuousOutputModel0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-1), 0, 308.6943947);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1.7976931348623157E308, doubleArray0, 1922.833, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3403.89048516, (-1888.4668120545157), doubleArray0, doubleArray1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 3403.89048516, doubleArray0, (-1888.4668120545157), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: state vector has dimension 0, relative tolerance vector has dimension 8
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setOrderControl(0, 298.4, 119.09407766455);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-2463.7827), 0.5, 3);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-37.45832313645163), doubleArray0, (-836.0959534909206), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 462, 0, 2092.853);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-432.58), doubleArray0, 0, doubleArray0);
  }
}
