/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 15:41:03 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator;
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
      SwitchState switchState0 = new SwitchState(switchingFunction0, Double.NaN, 2462.17119636692, 1966);
      double[] doubleArray0 = new double[3];
      boolean boolean0 = switchState0.reset((-271.5030302927), doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(boolean0);
      assertFalse(switchState0.stop());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-3152), (-3152), (-3152));
      boolean boolean0 = switchState0.stop();
      assertFalse(boolean0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-737), 5.2411959556684655, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-737), (-737), (-737));
      switchState0.stepAccepted((-737), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      // Undeclared exception!
      try { 
        switchState0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-737.0,NaN]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(16.0, 2462.17119636692).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, Double.NaN, 2462.17119636692, 1966);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[3];
      switchState0.stepAccepted((-271.5030302927), doubleArray1);
      double[][] doubleArray2 = new double[7][7];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray2[3], doubleArray0, doubleArray2[2], doubleArray1, doubleArray2, false);
      graggBulirschStoerStepInterpolator0.storeTime(0.0);
      switchState0.evaluateStep(graggBulirschStoerStepInterpolator0);
      assertEquals(2462.17119636692, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)3933).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 3933, 3933, 3933);
      switchState0.reinitializeBegin(3933, doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-741)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-741), (-741), (-741));
      switchState0.reinitializeBegin((-741), doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      SwitchState switchState0 = new SwitchState(switchingFunction0, Double.NaN, 2462.17119636692, 1966);
      double double0 = switchState0.getEventTime();
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-737), 5.2411959556684655, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-737), (-737), (-737));
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      // Undeclared exception!
      try { 
        switchState0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [NaN,NaN]  Values: [5.2411959556684655,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }
}
