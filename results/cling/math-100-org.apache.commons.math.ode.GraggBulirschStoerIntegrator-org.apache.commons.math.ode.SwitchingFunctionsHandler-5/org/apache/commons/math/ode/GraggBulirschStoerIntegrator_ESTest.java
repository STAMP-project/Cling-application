/*

 * Tue Mar 03 15:52:22 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.FixedStepHandler;
import org.apache.commons.math.ode.GraggBulirschStoerIntegrator;
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
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2432.92532, 2432.92532, 0.0, 0.0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 0.0, 0.0, 0);
      assertEquals(2432.92532, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(18.148505520854727, (-2707.0), doubleArray0, doubleArray0);
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.0, 1, 1, (-5.685526961588504));
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1).when(firstOrderDifferentialEquations0).getDimension();
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-2707.0), doubleArray0, 1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(18.148505520854727, (-2707.0), doubleArray0, doubleArray0);
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.9, 0.0, 1, 0.9);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1).when(firstOrderDifferentialEquations0).getDimension();
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-1.0006050966910838), doubleArray0, 1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.5, 0.5, 0.5, 8.849692136138087);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.5, 8.849692136138087, 0.9, 1311.49);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3656.734, 3656.734, 3656.734, (-2759.692508584562));
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 0.0, doubleArray0, 427.85387, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl((-242.144132198631), (-3335025.0006050966), 1894.380277018, 2931);
      assertEquals(3656.734, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(865.391402757, (-3100.0), (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setStepsizeControl((-3100.0), 0.9, (-3100.0), 865.391402757);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(165.20045171727028, 165.20045171727028, 0.13095238095238096, 0.13095238095238096);
      graggBulirschStoerIntegrator0.setOrderControl(1281, (-3048083.0006050966), 0.0);
      assertEquals(165.20045171727028, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3306.83606203, 1065.324669025, (-1.1270175653862835), 3306.83606203);
      graggBulirschStoerIntegrator0.setOrderControl(1258, 1258, 3306.83606203);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.5, 0.5, 0.5, 8.849692136138087);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-2144253628), (-2144253628), 0.9);
      assertEquals(0.5, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.5, 0.5, 0.5, 8.849692136138087);
      graggBulirschStoerIntegrator0.setOrderControl(4, 0.5, 8.849692136138087);
      assertEquals(0.5, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3656.734, 3656.734, 3656.734, 3656.734);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      double double0 = 0.9999;
      double[] doubleArray0 = new double[0];
      double double1 = (-1991.0);
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, double0, doubleArray0, double1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3656.734, 3656.734, 3656.734, (-2759.692508584562));
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 0.0, doubleArray0, 427.85387, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 32, 3765, 11.99229113618279);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-2707.0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(18.148505520854727, (-2707.0), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.0, 1, 1, (-5.685526961588504));
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1).when(firstOrderDifferentialEquations0).getDimension();
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-2707.0), doubleArray0, 1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3306.83606203, 1065.324669025, (-1.1270175653862835), 3306.83606203);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(0.01, fixedStepHandler0);
      graggBulirschStoerIntegrator0.setStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 1258);
      double[] doubleArray0 = new double[0];
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 1065.324669025, doubleArray0, 0.01, doubleArray0);
  }
}
