/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:19:33 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.ContinuousOutputModel;
import org.apache.commons.math.ode.DummyStepHandler;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.GraggBulirschStoerIntegrator;
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
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.0, 2.0, (double[]) null, (double[]) null);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-3551.226765847054), doubleArray0, 0.5, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4162.52752617014, 4162.52752617014, 1.884612893454465, 4162.52752617014);
      double[] doubleArray0 = new double[0];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 4059.0, 1593.2383308563765, (-4150));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 4059.0, doubleArray0, 4162.52752617014, doubleArray0);
      assertEquals(4162.52752617014, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.382468931778144, 0.6, 0.6, 0.6);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 9);
      assertEquals(0.6, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.884612893454465, 4162.52752617014, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 2);
      assertEquals(88.57061050472309, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(18.148505520854727, 1023.499956729, 1183.164446, 18.148505520854727);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      graggBulirschStoerIntegrator0.setStepHandler(continuousOutputModel0);
      graggBulirschStoerIntegrator0.addSwitchingFunction((SwitchingFunction) null, (-2033.613669), 0, 0);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-184.68717), 572.0, (-1685.1118897));
      graggBulirschStoerIntegrator0.addSwitchingFunction((SwitchingFunction) null, 0.0, (-1167.3746870078712), 0);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      assertEquals((-184.68717), graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-184.68717), 572.0, (-1685.1118897));
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.0, 2.0, (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setOrderControl((-371), (-371), 0.20136540080403034);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(199.15, (-1233.8), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl((-371), 0.02, 2487.6754786594743);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4.450312892752409, 999.9, (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setOrderControl(2870, 999.9, (-1324.045656548108));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.0, 2.0, (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setOrderControl(2146386593, (-371), (-0.4539437869953382));
      assertEquals(2.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2598.2429495886, 2598.2429495886, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(3, 1702.24887043, 1702.24887043, 0.0);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(120.8542560323, 0.9, (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setStepsizeControl(1.0E15, 0.9, (-1.0), 1.0E15);
      assertEquals(0.9, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.5, 0.0, 0.0, 0.0);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(21.778176332405668, 21.778176332405668, (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setStepsizeControl(841.34575331408, (-238.3893852791), 0.20136540080403034, 841.34575331408);
      assertEquals(21.778176332405668, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.9999, 0.9999, 3005.55, 3005.55);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 7, 7, 0.9999);
      assertEquals(0.9999, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.112554502895308, 1.112554502895308, 3008.45695219591, 3008.45695219591);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 7, 7, 1.112554502895308);
      assertEquals(1.112554502895308, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(120.8542560323, 0.9, (double[]) null, (double[]) null);
      String string0 = graggBulirschStoerIntegrator0.getName();
      assertEquals("Gragg-Bulirsch-Stoer", string0);
  }
}
