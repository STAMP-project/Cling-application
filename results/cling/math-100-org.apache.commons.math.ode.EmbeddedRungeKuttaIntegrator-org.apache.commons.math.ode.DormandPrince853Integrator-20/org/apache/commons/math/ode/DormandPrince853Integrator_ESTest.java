/*

 * Tue Mar 03 14:46:26 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.DormandPrince853Integrator;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DormandPrince853Integrator_ESTest extends DormandPrince853Integrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.3020833333333333, 1.3020833333333333, 1.6643771824549864, (-2579.03832));
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[0];
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(firstOrderConverter0, (-2301.8), doubleArray1, 2.4936055526796523, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.3020833333333333, 1.3020833333333333, 1.6643771824549864, (-2579.03832));
      double[][] doubleArray0 = new double[2][3];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(firstOrderConverter0, (-2301.8), doubleArray0[0], 2.4936055526796523, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2153.058975247, 2153.058975247, 2033.28215580325, 2033.28215580325);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(firstOrderConverter0, 107.0, doubleArray0, Double.NaN, doubleArray0);
  }
}
