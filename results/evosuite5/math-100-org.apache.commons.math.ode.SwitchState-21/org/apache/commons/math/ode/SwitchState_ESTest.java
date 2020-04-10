/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 12:02:35 GMT 2019
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
  public void test00()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn(6.0, (-3205.0), 6.0, (-3205.0), (-3205.0)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-3205.0), 6.0, 3);
      double[] doubleArray0 = new double[0];
      switchState0.reinitializeBegin(3, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchState0.evaluateStep(dummyStepInterpolator0);
      switchState0.stepAccepted(3, doubleArray0);
      assertEquals(3.0, switchState0.getEventTime(), 0.01);
      
      boolean boolean0 = switchState0.reset(6.0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-3205.0), 6.0, 3);
      double[] doubleArray0 = new double[0];
      boolean boolean0 = switchState0.reset(1473.25, doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(boolean0);
      assertFalse(switchState0.stop());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(6.0, (-3205.0), 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-3205.0), 6.0, 3);
      double[] doubleArray0 = new double[0];
      switchState0.reinitializeBegin(3, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      // Undeclared exception!
      try { 
        switchState0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [3.0,NaN]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn(6.0, (-3205.0), 6.0, (-3205.0), (-3205.0)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-3205.0), 6.0, 3);
      double[] doubleArray0 = new double[0];
      switchState0.reinitializeBegin(3, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchState0.evaluateStep(dummyStepInterpolator0);
      switchState0.stepAccepted(3, doubleArray0);
      boolean boolean0 = switchState0.stop();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      SwitchState switchState0 = new SwitchState(switchingFunction0, 1707.0, 1707.0, 1923);
      boolean boolean0 = switchState0.stop();
      assertFalse(boolean0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)43).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 43, 43, 43);
      double[] doubleArray0 = new double[0];
      switchState0.stepAccepted(43, doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn(6.0, (-3205.0), 6.0, (-3205.0), (-3205.0)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-3205.0), 6.0, 2634);
      double[] doubleArray0 = new double[1];
      switchState0.reinitializeBegin(6.0, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      switchState0.evaluateStep(dummyStepInterpolator0);
      switchState0.stepAccepted(2634, doubleArray0);
      assertEquals(6.0, switchState0.getEventTime(), 0.01);
      
      boolean boolean0 = switchState0.reset((-1209.465290347), doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-1279)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-1279), (-1279), (-1279));
      double[] doubleArray0 = new double[0];
      switchState0.stepAccepted((-1279), doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(6.0, (-3205.0), 6.0, (-3205.0), (-3205.0)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-3205.0), 6.0, 2708);
      double[] doubleArray0 = new double[0];
      switchState0.reinitializeBegin(2708, doubleArray0);
      switchState0.reinitializeBegin(6.0, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      // Undeclared exception!
      try { 
        switchState0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [6.0,NaN]  Values: [-3205.0,-3205.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(6.0, 6.0, 6.0, 6.0, 6.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 6.0, 6.0, 2634);
      double[] doubleArray0 = new double[0];
      switchState0.reinitializeBegin((-315.08522), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      dummyStepInterpolator0.currentTime = (double) 2634;
      switchState0.evaluateStep(dummyStepInterpolator0);
      assertEquals(2640.0000000000186, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-1559.94618506), (-1559.94618506), (-4007));
      double double0 = switchState0.getEventTime();
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, double0, 0.01);
  }
}
