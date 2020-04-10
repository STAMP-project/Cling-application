/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 12:41:26 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.GraggBulirschStoerIntegrator;
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
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(561.874, 561.874, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl((-1), 561.874, (-1));
      assertEquals(561.874, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6510416666666666, 921.849167, doubleArray0, doubleArray0);
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8, 8).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 4);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-537.66889402), doubleArray0, Double.NaN, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.6510416666666666;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6510416666666666, 921.849167, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8, 8).when(firstOrderDifferentialEquations0).getDimension();
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-1886.67), doubleArray0, (-3105.200024083813), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.6510416666666666;
      doubleArray0[1] = 0.6510416666666666;
      doubleArray0[2] = 921.849167;
      doubleArray0[3] = 921.849167;
      doubleArray0[4] = 0.6510416666666666;
      doubleArray0[5] = 921.849167;
      doubleArray0[6] = 0.6510416666666666;
      doubleArray0[7] = 921.849167;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6510416666666666, 921.849167, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8, 8).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 1142.0311054, doubleArray0, (-4058.5574), doubleArray0);
      assertEquals((-348.560106421789), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6510416666666666, 921.849167, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(921.849167, 0.6510416666666666, 0.0, 0.94);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2.580957130917566), (-885.1), 0.30545274794128174).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-838.1878746), 0.6510416666666666, 2147103710);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8, 8).when(firstOrderDifferentialEquations0).getDimension();
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-1886.67), doubleArray0, (-3105.200024083813), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-537.66889402), 470.059, 0.0, (-2.580957130917566));
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-838.1878746), 0.0, 2147103710);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8, 8).when(firstOrderDifferentialEquations0).getDimension();
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 0.0, doubleArray0, (-3105.200024083813), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6510416666666666, 920.6715375365116, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(1.0E15, 1.0E15, (-9.15095847217987), 1.0E15);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-9.15095847217987), 547.7844014, (-2.580957130917566), 1.0E15, 1.0E15).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-838.1878746), 0.0, 2147103710);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8, 8).when(firstOrderDifferentialEquations0).getDimension();
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 0.0, doubleArray0, (-3105.200024083813), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6510416666666666, 920.6715375365116, doubleArray0, doubleArray0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-838.1878746), 0.0, 2147103710);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8, 8).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2655, (-4), 920.6715375365116);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 0.0, doubleArray0, (-3105.200024083813), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.6510416666666666;
      doubleArray0[1] = 0.6510416666666666;
      doubleArray0[2] = 921.849167;
      doubleArray0[3] = 921.849167;
      doubleArray0[4] = 0.6510416666666666;
      doubleArray0[5] = 921.849167;
      doubleArray0[6] = 0.6510416666666666;
      doubleArray0[7] = 921.849167;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6510416666666666, 921.849167, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8, 8).when(firstOrderDifferentialEquations0).getDimension();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2167.2), 0.6510416666666666, (-5013.9583), 0.44923629829290207, 1565.6072728788).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-1229.365405105908), 0.6510416666666666, 8);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 5, 5, 0.6510416666666666);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 1142.0311054, doubleArray0, (-4058.5574), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1142.0311054,1141.0545428999994]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6510416666666666, 921.849167, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8, 8).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 5, 5, 0.6510416666666666);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 1142.0311054, doubleArray0, (-4058.5574), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-537.66889402), 470.059, 0.0, (-2.580957130917566));
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2.580957130917566), (-885.1), 0.30545274794128174).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-838.1878746), 0.6510416666666666, 2147103710);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8, 8).when(firstOrderDifferentialEquations0).getDimension();
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-1886.67), doubleArray0, (-3105.200024083813), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6510416666666666, 921.849167, doubleArray0, doubleArray0);
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8, 8).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 8, 4, 921.849167);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-537.66889402), doubleArray0, Double.NaN, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.6510416666666666;
      doubleArray0[1] = 0.6510416666666666;
      doubleArray0[2] = 0.6510416666666666;
      doubleArray0[3] = 0.6510416666666666;
      doubleArray0[4] = 0.6510416666666666;
      doubleArray0[5] = 0.6510416666666666;
      doubleArray0[6] = 0.6510416666666666;
      doubleArray0[7] = 0.6510416666666666;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6510416666666666, 0.6510416666666666, doubleArray0, doubleArray0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-537.66889402), 470.059, 0.0, (-2.580957130917566));
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8, 8).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator1.integrate(firstOrderDifferentialEquations0, (-1886.67), doubleArray0, (-3105.200024083813), doubleArray0);
      assertEquals((-15.197134307036777), graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
      
      graggBulirschStoerIntegrator0.setStepsizeControl((-1886.67), (-2.580957130917566), 999.9, 0.0);
      assertArrayEquals(new double[] {0.6510416666666666, 0.6510416666666666, 0.6510416666666666, 0.6510416666666666, 0.6510416666666666, 0.6510416666666666, 0.6510416666666666, 0.6510416666666666}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.6510416666666666;
      doubleArray0[1] = 0.6510416666666666;
      doubleArray0[2] = 0.6510416666666666;
      doubleArray0[3] = 0.6510416666666666;
      doubleArray0[4] = 0.6510416666666666;
      doubleArray0[5] = 0.6510416666666666;
      doubleArray0[6] = 0.6510416666666666;
      doubleArray0[7] = 0.6510416666666666;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6510416666666666, 0.6510416666666666, doubleArray0, doubleArray0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-537.66889402), 470.059, 0.0, (-2.580957130917566));
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8, 8).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator1.integrate(firstOrderDifferentialEquations0, (-1886.67), doubleArray0, (-3105.200024083813), doubleArray0);
      assertEquals((-15.197134307036777), graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
      
      graggBulirschStoerIntegrator0.setStepsizeControl(0.6510416666666666, 2284.091726, 0.65, 0.6510416666666666);
      assertArrayEquals(new double[] {0.6510416666666666, 0.6510416666666666, 0.6510416666666666, 0.6510416666666666, 0.6510416666666666, 0.6510416666666666, 0.6510416666666666, 0.6510416666666666}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6510416666666666, 921.849167, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8, 8).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.setStepsizeControl(0.0, 1344.57474992655, (-2.580957130917566), 1.0001);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-1886.67), doubleArray0, (-3105.200024083813), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2407.9659719974), (-2407.9659719974), (-2407.9659719974), (-2407.9659719974));
      graggBulirschStoerIntegrator0.setOrderControl(2371, (-2407.9659719974), (-1599.50926263481));
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6510416666666666, 921.849167, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(8, 0.6510416666666666, (-1293.07583));
      assertEquals(24.498208467129967, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }
}
