/*

 * Tue Mar 03 15:08:36 GMT 2020
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
      doReturn(855.0, 855.0, (-888.0), (-888.0), 1040.99).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 0.0, 0.0, 1339);
      double[] doubleArray0 = new double[2];
      switchState0.stepAccepted(0.0, doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1339.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      boolean boolean0 = switchState0.evaluateStep(stepInterpolator0);
      assertEquals(6.235204639954122E-7, switchState0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-0.03714271806722689), (-0.03714271806722689), (-0.03714271806722689)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-0.03714271806722689), (-0.03714271806722689), 782);
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-0.03714271806722689)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      // Undeclared exception!
      try { 
        switchState0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [NaN,NaN]  Values: [-0.03714271806722689,-0.03714271806722689]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(854.6542885836892, Double.NaN, (-1796.56), 1.0, (-1796.56)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 1.0, (-1796.56), 1305);
      double[] doubleArray0 = new double[2];
      switchState0.stepAccepted((-1796.56), doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      boolean boolean0 = switchState0.evaluateStep(stepInterpolator0);
      assertEquals(0.9997551474680022, switchState0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-0.03714271806722689), (-0.03714271806722689), 1880.46629876, (-0.03714271806722689), 1880.46629876).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 1880.46629876, 1880.46629876, 782);
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-0.03714271806722689)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      try { 
        switchState0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (782) exceeded
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }
}
