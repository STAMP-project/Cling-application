/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 16:00:32 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.ContinuousOutputModel;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.SwitchingFunction;
import org.apache.commons.math.ode.SwitchingFunctionsHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GraggBulirschStoerIntegrator_ESTest extends GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1585.0), 3144.06049, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(3, 1.0E-4, 0.6);
      assertEquals(3144.06049, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1208.28;
      doubleArray0[1] = 1208.28;
      doubleArray0[2] = (-868.0);
      doubleArray0[3] = (-868.0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-868.0), 1208.28, doubleArray0, doubleArray0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(145.65243914, (-868.0), 1.0001, (-451.118407635279), 1361.801).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 1208.28, (-4289.22254184), 994);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4, 4).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2077.3, doubleArray0, 994, doubleArray0);
      assertEquals((-885.7793571801956), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1.0), (-1.0), doubleArray0, doubleArray0);
      SwitchingFunctionsHandler switchingFunctionsHandler0 = graggBulirschStoerIntegrator0.switchesHandler;
      double double0 = switchingFunctionsHandler0.getEventTime();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = (-868.0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1208.28;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-868.0), 1208.28, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4, 4).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 1208.28, doubleArray0, 1005, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = 1208.28;
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-868.0), 1208.28, doubleArray0, doubleArray0);
      int int0 = 1005;
      graggBulirschStoerIntegrator0.setStepsizeControl(1208.28, 2077.3, 0.0, 569.75331373596);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4, 4).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, doubleArray0[2], doubleArray0, int0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-868.0);
      doubleArray0[1] = 1208.28;
      doubleArray0[2] = (-868.0);
      doubleArray0[3] = (-868.0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-868.0), 1208.28, doubleArray0, doubleArray0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(145.65243914, (-868.0), 1.0001, (-451.118407635279), 1361.801).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 1208.28, (-4289.22254184), 1005);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4, 4).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2077.3, doubleArray0, 1005, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl((-868.0), 1005.0, 145.65243914, 145.65243914);
      assertEquals((-908.689205070343), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-39.17726167561544), 0.3111643669578199, 0.3111643669578199, 0.3111643669578199);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 0, (-1455), 1184.940434466);
      assertEquals(0.3111643669578199, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-868.0);
      doubleArray0[1] = 1208.28;
      doubleArray0[2] = (-868.0);
      doubleArray0[3] = (-868.0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-868.0), 1208.28, doubleArray0, doubleArray0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(145.65243914, (-868.0), 1.0001, (-451.118407635279), 1361.801).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 1208.28, (-4289.22254184), 1005);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4, 4).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2077.3, doubleArray0, 1005, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 4, 4, (-868.0));
      assertEquals((-908.689205070343), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-868.0), 1208.28, doubleArray0, doubleArray0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-868.0), 0.0, 1208.28, 0.0);
      int int0 = 1005;
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4, 4).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, doubleArray0[1], doubleArray0, int0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-39.17726167561544), 0.3111643669578199, 0.3111643669578199, 0.3111643669578199);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1260, 179, 0.3111643669578199);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-868.0);
      doubleArray0[1] = 1208.28;
      doubleArray0[2] = (-868.0);
      doubleArray0[3] = (-868.0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-868.0), 1208.28, doubleArray0, doubleArray0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-868.0), (-868.0), 1208.28, (-868.0));
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(145.65243914, (-868.0), 1.0001, (-451.118407635279), 1361.801).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 1208.28, (-4289.22254184), 1005);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4, 4).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2077.3, doubleArray0, 1005, doubleArray0);
      assertEquals(1005.0, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-868.0);
      doubleArray0[1] = 1208.28;
      doubleArray0[2] = (-868.0);
      doubleArray0[3] = (-868.0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-868.0), 1208.28, doubleArray0, doubleArray0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(145.65243914, (-868.0), 1.0001, (-451.118407635279), 1361.801).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 1208.28, (-4289.22254184), 1005);
      graggBulirschStoerIntegrator0.setStepsizeControl(1208.28, (-145.7400346025269), (-868.0), 569.75331373596);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4, 4).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2077.3, doubleArray0, 1005, doubleArray0);
      assertEquals((-908.689205070343), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1208.28;
      doubleArray0[1] = 1208.28;
      doubleArray0[2] = (-868.0);
      doubleArray0[3] = (-868.0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-868.0), 1208.28, doubleArray0, doubleArray0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1208.28, 1208.28, 2553.9123628, 1208.28, 2077.3).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 1208.28, (-4289.22254184), 1005);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4, 4).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2077.3, doubleArray0, 1005, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.1103856493896019, (-868.0), (-1608.9325823313518), (-877.847665166735));
      assertEquals((-143.08635029223615), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1208.28;
      doubleArray0[1] = 1208.28;
      doubleArray0[2] = (-868.0);
      doubleArray0[3] = (-868.0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-868.0), 1208.28, doubleArray0, doubleArray0);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      graggBulirschStoerIntegrator0.setStepHandler(continuousOutputModel0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4, 4).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2077.3, doubleArray0, 1005, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 4, 3, 6.0);
      assertEquals((-143.08635029223615), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-39.17726167561544), 0.3111643669578199, 0.3111643669578199, 0.3111643669578199);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.8, 0.8, 0.3111643669578199, 0.3111643669578199);
      assertEquals(0.3111643669578199, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-868.0), 1208.28, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(1208.28, (-145.7400346025269), (-868.0), 1208.28);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4, 4).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2077.3, doubleArray0, 1005, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-561.0), (-561.0), (-561.0), (-561.0));
      graggBulirschStoerIntegrator0.setOrderControl(1438, 1438, (-1.5419164109565866));
      assertEquals((-561.0), graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-868.0), 1208.28, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(1321, 2553.9123628, 569.75331373596);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-868.0), 1208.28, 1208.28, 1208.28);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4, 4).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2077.3, doubleArray0, (-1337), doubleArray0);
      assertEquals((-734.5251102232253), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }
}
