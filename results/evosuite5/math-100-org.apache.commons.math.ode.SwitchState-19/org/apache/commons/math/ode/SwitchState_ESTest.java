/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 15:40:53 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.DummyStepInterpolator;
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
      double[] doubleArray0 = new double[4];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-1866), (-1866), (-1866));
      boolean boolean0 = switchState0.reset((-1866), doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SwitchState switchState0 = new SwitchState((SwitchingFunction) null, 10, 10, 10);
      boolean boolean0 = switchState0.stop();
      assertFalse(boolean0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-1866), (-1866), (-1866));
      switchState0.stepAccepted((-1866), doubleArray0);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-1848), 0.0, (-2359.4482363957), 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-1848), (-1848), (-1848));
      switchState0.stepAccepted((-5041.398937484505), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      // Undeclared exception!
      try { 
        switchState0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-5041.398937484505,NaN]  Values: [-2359.4482363957,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-1867), (double)(-1867)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-1867), (-1867), (-1867));
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchState0.stepAccepted((-1839.0), doubleArray0);
      dummyStepInterpolator0.currentTime = 327.623598;
      switchState0.evaluateStep(dummyStepInterpolator0);
      assertEquals(2194.623598, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-1866), (-1866), (-1866));
      switchState0.reinitializeBegin((-1866), doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-1866)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-1866), (-1866), (-1866));
      switchState0.reinitializeBegin((-1866), doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      SwitchState switchState0 = new SwitchState(switchingFunction0, 0.0, 0.0, 0);
      double double0 = switchState0.getEventTime();
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-1848), 0.0, (-2359.4482363957)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-1848), (-1848), (-1848));
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      // Undeclared exception!
      try { 
        switchState0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [NaN,NaN]  Values: [0.0,-2359.4482363957]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }
}
