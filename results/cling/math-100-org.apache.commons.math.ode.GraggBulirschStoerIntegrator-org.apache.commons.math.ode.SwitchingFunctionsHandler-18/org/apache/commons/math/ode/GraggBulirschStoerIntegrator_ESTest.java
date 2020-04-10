/*

 * Tue Mar 03 15:57:27 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.ContinuousOutputModel;
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
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-284.4621056965), (-284.4621056965), 2606.719808798842, (-1102.0));
      graggBulirschStoerIntegrator0.setStepsizeControl(365.70005916454, 1.0E-15, 1.0001, 1.0E-15);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      graggBulirschStoerIntegrator0.setStepHandler(continuousOutputModel0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1.0E-15, doubleArray0, 945.5881420979154, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-284.4621056965), (-284.4621056965), 2606.719808798842, (-1102.0));
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.setStepsizeControl((-1102.0), 0.0, 0.5835123183, 4.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-523.2), doubleArray0, (-311.2578199055889), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-284.4621056965), (-284.4621056965), 2606.719808798842, (-1102.0));
      graggBulirschStoerIntegrator0.setStepsizeControl(0.5835123183, 0.5835123183, (-1102.0), 3573.534416270775);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      graggBulirschStoerIntegrator0.setStepHandler(continuousOutputModel0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 10.0, doubleArray0, 3115.5108, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(554.5751291053688, (-4.450312892752409), 3762.820090978382, (-8.428938276109013));
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 9, 1, (-2512.565219213));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-2512.565219213), doubleArray0, 3762.820090978382, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2122.8517, 2122.8517, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 96.337234899, doubleArray0, 1.0001, doubleArray0);
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
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(554.5751291053688, 554.5751291053688, 554.5751291053688, 429.4368715120492);
      graggBulirschStoerIntegrator0.setOrderControl(2121, 554.5751291053688, 429.4368715120492);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(357.709627, 357.709627, (-2339.2326197), (-316.09));
      graggBulirschStoerIntegrator0.setOrderControl(10, 10, 357.709627);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4284.4, 4284.4, 4284.4, 4284.4);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-79), 1, 103.0751727626198);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-0.04471061572777259), doubleArray0, 103.0751727626198, doubleArray0);
      assertEquals(4284.4, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-284.4621056965), (-284.4621056965), 2606.719808798842, (-1102.0));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 108, 0, 96.337234899);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      graggBulirschStoerIntegrator0.setStepHandler(continuousOutputModel0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1.0E-15, doubleArray0, 415.85461819, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-284.4621056965), (-284.4621056965), 2606.719808798842, (-1102.0));
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 108, 0, 0.02);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      graggBulirschStoerIntegrator0.setStepHandler(continuousOutputModel0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1.0E-15, doubleArray0, 0.5835123183, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-284.4621056965), (-284.4621056965), 2606.719808798842, (-1102.0));
      graggBulirschStoerIntegrator0.setOrderControl((-1266), 0.7777137798053443, 2.382468931778144);
      assertEquals((-284.4621056965), graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-284.4621056965), (-284.4621056965), 2606.719808798842, (-1102.0));
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(3573.534416270775, (-311.2578199055889), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-523.2), doubleArray0, (-311.2578199055889), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-284.4621056965), (-284.4621056965), 2606.719808798842, (-1102.0));
      graggBulirschStoerIntegrator0.setStepsizeControl(2606.719808798842, 0.0, (-631.044788492083), 4192.20342);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 0.65, doubleArray0, (-1102.0), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-284.4621056965), (-284.4621056965), 2606.719808798842, (-1102.0));
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 2, 1739.8517000000002, 2);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 6.8812326946963, doubleArray0, 0.0, doubleArray0);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-284.4621056965), (-284.4621056965), 2606.719808798842, (-1102.0));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 96.337234899, doubleArray0, 0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.11645019720921788, 2540.02321934979, 112.5119991, 112.5119991);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-284.4621056965), (-284.4621056965), (-284.4621056965), (-1102.0));
      graggBulirschStoerIntegrator0.setStepsizeControl(365.70005916454, 0.11645019720921788, 1.0001, 0.11645019720921788);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 96.337234899, doubleArray0, 0, doubleArray0);
      assertEquals(0, doubleArray0.length);
  }
}
