/*

 * Tue Mar 03 15:08:01 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.ode.StepInterpolator;
import org.apache.commons.math.ode.SwitchState;
import org.apache.commons.math.ode.SwitchingFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SwitchState_ESTest extends SwitchState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-121.434230888), 2720.7104197318954, 2720.7104197318954, (-1473.0), (-26.041666666666668)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 3130.36904266, 3130.36904266, 2625);
      double[] doubleArray0 = new double[5];
      switchState0.reinitializeBegin((-590.846016440633), doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-26.041666666666668)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      boolean boolean0 = switchState0.evaluateStep(stepInterpolator0);
      assertEquals(1539.1428546633335, switchState0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-532.9114318006), (-532.9114318006), (-532.9114318006)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-532.9114318006), (-532.9114318006), (-1539));
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-532.9114318006)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      // Undeclared exception!
      try { 
        switchState0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [NaN,NaN]  Values: [-532.9114318006,-532.9114318006]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1095.87631849), (-1478.0), 1.0, (-1095.87631849), 1.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-1095.87631849), (-1095.87631849), 9);
      double[] doubleArray0 = new double[10];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1478.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      try { 
        switchState0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (9) exceeded
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1548.7774560996675, 1548.7774560996675, (-680.6699226483408), 1548.7774560996675, (-680.6699226483408)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 0.0, 0.0, 2492);
      double[] doubleArray0 = new double[1];
      switchState0.reinitializeBegin((-680.6699226483408), doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      boolean boolean0 = switchState0.evaluateStep(stepInterpolator0);
      assertEquals((-680.6699223313726), switchState0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }
}
