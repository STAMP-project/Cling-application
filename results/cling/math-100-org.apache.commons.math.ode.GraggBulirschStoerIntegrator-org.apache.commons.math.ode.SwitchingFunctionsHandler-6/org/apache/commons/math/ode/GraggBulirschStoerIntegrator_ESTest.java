/*

 * Tue Mar 03 15:46:11 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
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
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(6.526829214206556, (-384.06), (-384.06), 0.25);
      double[] doubleArray0 = new double[0];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 6.0, (-0.19316434850839564), 535);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 4, 0, 0);
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 6, doubleArray0, 0.045563, doubleArray0);
      assertEquals(6.526829214206556, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(6.526829214206556, (-384.06), (-384.06), 0.25);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.setStepsizeControl(0.25, 0.3111643669578199, 6.526829214206556, (-384.06));
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(538.0, 538.0, 538.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 6.0, (-0.19316434850839564), 535);
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 6, doubleArray0, 0.045563, doubleArray0);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4421.06476268852, Double.NaN, (-0.08333333333333333), (-4787.0));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.setStepsizeControl(510.37638023, 510.37638023, 0.9999, 0.25);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 4421.06476268852, doubleArray0, (-1331.05), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(6.526829214206556, (-384.06), (-384.06), (-32.205413675290686));
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 0.045563, doubleArray0, (-0.08333333333333333), doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-114), (-3011), Double.NaN);
      assertEquals((-0.12889633333333333), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(506.5101, 506.5101, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 195.72136495055, doubleArray0, 4.0, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2566.3, 2566.3, 1.0E-4, 1.8915178993145003);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-1635.860179), doubleArray0, 910.838716, doubleArray0);
      assertEquals(2566.3, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1649.5343929393198), 448.82, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(535, 448.82, 169.338);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(6.526829214206556, (-384.06), (-384.06), 0.25);
      graggBulirschStoerIntegrator0.setOrderControl(2124492652, 0.25, 81.16823);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(6.526829214206556, (-384.06), (-384.06), (-32.205413675290686));
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 0.045563, doubleArray0, (-0.08333333333333333), doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 12, 535, 93.40532418);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(6.526829214206556, (-384.06), (-384.06), (-32.205413675290686));
      double[] doubleArray1 = new double[0];
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 0.045563, doubleArray1, (-0.08333333333333333), doubleArray1);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(98.104, 857.37605061803, doubleArray0, doubleArray0);
      assertEquals(857.37605061803, graggBulirschStoerIntegrator1.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2566.3, 2566.3, 1.0E-4, 1.8915178993145003);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.setStepsizeControl(1.0E-4, 2566.3, (-2271.866077651582), 2566.3);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 910.838716, doubleArray0, 0.01, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(6.526829214206556, (-384.06), (-384.06), (-32.205413675290686));
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 0.045563, doubleArray0, (-0.08333333333333333), doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(93.4053241836243, 12, 999.9, 1.0001);
      assertEquals((-0.12889633333333333), graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }
}
