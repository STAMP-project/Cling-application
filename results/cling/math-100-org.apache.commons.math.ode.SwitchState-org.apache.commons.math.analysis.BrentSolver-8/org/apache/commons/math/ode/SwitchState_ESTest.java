/*

 * Tue Mar 03 15:09:20 GMT 2020
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
      doReturn((-2019.06), 1517987.44968373, (-2019.06), (-2019.06), 1768.375181).when(switchingFunction0).g(anyDouble() , any(double[].class));
      double[] doubleArray0 = new double[6];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(2.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      SwitchState switchState0 = new SwitchState(switchingFunction0, 1768.375181, 1517987.44968373, 2);
      switchState0.stepAccepted(1517987.44968373, doubleArray0);
      switchState0.stepAccepted(1.0E-15, doubleArray0);
      boolean boolean0 = switchState0.evaluateStep(stepInterpolator0);
      assertEquals(758995.724841865, switchState0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-989.6659170231293), (-989.6659170231293), (-989.6659170231293)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-989.6659170231293), (-989.6659170231293), 1562);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-989.6659170231293)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      // Undeclared exception!
      try { 
        switchState0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [NaN,NaN]  Values: [-989.6659170231293,-989.6659170231293]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-989.6659170231293), 15.697238121770845, (-989.6659170231293), (-989.6659170231293), 15.697238121770845).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-989.6659170231293), 15.697238121770845, 1562);
      double[] doubleArray0 = new double[2];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)1562).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) doubleArray0, (Object) doubleArray0, (Object) null).when(stepInterpolator0).getInterpolatedState();
      try { 
        switchState0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (1,562) exceeded
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-989.6659170231293), 15.697238121770845, (-989.6659170231293), (-989.6659170231293), 15.697238121770845).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-989.6659170231293), 15.697238121770845, 1562);
      double[] doubleArray0 = new double[2];
      switchState0.stepAccepted(15.697238121770845, (double[]) null);
      switchState0.reinitializeBegin(15.697238121770845, (double[]) null);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)1562).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) doubleArray0, (Object) doubleArray0, (Object) null).when(stepInterpolator0).getInterpolatedState();
      boolean boolean0 = switchState0.evaluateStep(stepInterpolator0);
      assertEquals(24.0251830035133, switchState0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }
}
