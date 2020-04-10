/*

 * Tue Mar 03 14:52:59 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.DormandPrince54Integrator;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.HighamHall54Integrator;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HighamHall54Integrator_ESTest extends HighamHall54Integrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-462.9364432026559), (-1.34441), (-1.34441), 4.925);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(firstOrderConverter0, 1.3020833333333333, doubleArray0, (-684.148281), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-24.941242473090256), (-24.941242473090256), (-24.941242473090256), (-24.941242473090256));
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[0];
      // Undeclared exception!
      highamHall54Integrator0.integrate(firstOrderConverter0, (-2578.518949), doubleArray0, (-288.0768102), doubleArray1);
  }
}
