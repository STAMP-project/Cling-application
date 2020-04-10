/*

 * Tue Mar 03 15:10:09 GMT 2020
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
      doReturn((-726.0), (-726.0), 373.0, 373.0, (-726.0)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1616.241177).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      SwitchState switchState0 = new SwitchState(switchingFunction0, 373.0, 1616.241177, 3);
      double[] doubleArray0 = new double[8];
      switchState0.reinitializeBegin(0.0, (double[]) null);
      switchState0.reinitializeBegin(3, doubleArray0);
      boolean boolean0 = switchState0.evaluateStep(stepInterpolator0);
      assertEquals(3.0, switchState0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-587.4419170018037), 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-587.4419170018037), (-587.4419170018037), (-2032));
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-2032)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      // Undeclared exception!
      try { 
        switchState0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [NaN,NaN]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-587.4419170018037), (-587.4419170018037), 0.5, 0.5, 0.5).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-587.4419170018037), (-587.4419170018037), 2);
      double[] doubleArray0 = new double[17];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)2).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      try { 
        switchState0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (2) exceeded
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, 1.0, (-2279.34511), 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-2279.34511), (-2279.34511), 313);
      switchState0.stepAccepted(313, (double[]) null);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      switchState0.stepAccepted((-2279.34511), (double[]) null);
      // Undeclared exception!
      try { 
        switchState0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-2279.34511,2280.34511]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }
}
