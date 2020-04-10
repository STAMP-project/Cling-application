/*

 * Tue Mar 03 15:55:26 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.FixedStepHandler;
import org.apache.commons.math.ode.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.StepNormalizer;
import org.apache.commons.math.ode.SwitchingFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GraggBulirschStoerIntegrator_ESTest extends GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(754.666548, 754.666548, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(754.666548, 4100.0, 1734.9863708308765, 1734.9863708308765);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(1734.9863708308765, (-374.5467547226902), 31.95006, 467.857103742147);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator1.addSwitchingFunction(switchingFunction0, (-285.6618391524248), (-3688.705), 94);
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator1.integrate(firstOrderConverter0, 1888.0410490977895, doubleArray0, 0.1521609496625161, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 6.104177546095708, 532.1708966065604);
      double[] doubleArray0 = new double[8];
      graggBulirschStoerIntegrator0.setStepsizeControl(850.5, 0.6, 1.0E-4, 3290.821284975061);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-22.113666853125302), doubleArray0, 28.3671304, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(754.666548, 754.666548, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1734.9863708308765, doubleArray0, 754.666548, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 6.104177546095708, 532.1708966065604);
      double[] doubleArray0 = new double[8];
      graggBulirschStoerIntegrator0.setStepsizeControl(1.0E-4, 886, 0.0, 0.0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-731.19694166714), 0.0, 0.0, 1.0E-4);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator1.integrate(firstOrderConverter0, (-22.113666853125302), doubleArray0, 28.3671304, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3.4046500868740456E-4), (-3.4046500868740456E-4), (-3.4046500868740456E-4), (-3.4046500868740456E-4));
      graggBulirschStoerIntegrator0.setOrderControl(31, 31, (-3140.9247871771));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 6.104177546095708, 532.1708966065604);
      graggBulirschStoerIntegrator0.setOrderControl(886, 0.0, 532.1708966065604);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-25.69393346270375), (-1580.59119005), 1.0, (-1627.9828549931));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2982, 662, 468.0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(2, fixedStepHandler0);
      graggBulirschStoerIntegrator0.setStepHandler(stepNormalizer0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 165.20045171727028, doubleArray0, 816.5621, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.8, 0.0, 0.8, 0.0);
      graggBulirschStoerIntegrator0.setOrderControl(0, 0.8, 0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(754.666548, 754.666548, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2144641807, 2, 0.30545274794128174);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(2982, 1668.0, 6.0, (-471.477));
      // Undeclared exception!
      graggBulirschStoerIntegrator1.integrate(firstOrderConverter0, 2144641807, doubleArray0, (-342.85), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(754.666548, 754.666548, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(2964.2825037457, 2964.2825037457, 754.666548, 754.666548);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(2982, 1668.0, 6.0, (-471.477));
      // Undeclared exception!
      graggBulirschStoerIntegrator1.integrate(firstOrderConverter0, 2144641807, doubleArray0, (-342.85), doubleArray0);
  }
}
