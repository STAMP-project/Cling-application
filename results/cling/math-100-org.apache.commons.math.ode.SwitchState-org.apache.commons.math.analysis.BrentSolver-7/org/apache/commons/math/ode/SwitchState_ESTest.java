/*

 * Tue Mar 03 15:08:44 GMT 2020
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
      doReturn((-1038.9823970975), 1079484.4214784673, (-1038.9823970975), 1079484.4214784673, (-1038.9823970975)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1038.9823970975)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      SwitchState switchState0 = new SwitchState(switchingFunction0, 1079484.4214784673, 1079484.4214784673, 64);
      switchState0.stepAccepted((-1470.7787326648), (double[]) null);
      boolean boolean0 = switchState0.evaluateStep(stepInterpolator0);
      assertEquals(538271.4320065689, switchState0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-1038.9823970975), (-1038.9823970975), (-812));
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1038.9823970975)).when(stepInterpolator0).getCurrentTime();
      doReturn((double[]) null).when(stepInterpolator0).getInterpolatedState();
      switchState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1038.9823970975), 1079484.4214784673, (-1038.9823970975), 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1038.9823970975)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      SwitchState switchState0 = new SwitchState(switchingFunction0, 1079484.4214784673, 1079484.4214784673, 64);
      switchState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1592.6788, 1592.6788, (-2980.083526568), 1055.9122285931, (-43.53345659001114)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-43.53345659001114), (-2980.083526568), 3);
      switchState0.stepAccepted(1592.6788, (double[]) null);
      switchState0.stepAccepted((-2980.083526568), (double[]) null);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1055.9122285931).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      try { 
        switchState0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (3) exceeded
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }
}
