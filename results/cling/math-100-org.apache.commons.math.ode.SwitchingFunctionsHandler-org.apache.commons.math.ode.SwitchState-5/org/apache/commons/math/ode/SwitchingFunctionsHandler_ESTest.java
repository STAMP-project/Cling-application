/*

 * Tue Mar 03 15:37:54 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator;
import org.apache.commons.math.ode.MidpointStepInterpolator;
import org.apache.commons.math.ode.StepInterpolator;
import org.apache.commons.math.ode.SwitchingFunction;
import org.apache.commons.math.ode.SwitchingFunctionsHandler;
import org.apache.commons.math.ode.ThreeEighthesStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SwitchingFunctionsHandler_ESTest extends SwitchingFunctionsHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-3479.04418428)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-3479.04418428)).when(stepInterpolator0).getPreviousTime();
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      switchingFunctionsHandler0.isEmpty();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-3479.04418428), 1058.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-14.63785740071), (-22.01162), 850);
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-3479.04418428,-3501.0558042800003]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-8.428938276109013)).when(stepInterpolator0).getPreviousTime();
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((-1775.37953), 815.4232, 2673.2275832950077, (-1134.5752471117), (-1134.5752471117)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 1.0, 342.726, 532);
      switchingFunctionsHandler0.getEventTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      switchingFunctionsHandler0.stepAccepted(815.4232, doubleArray0);
      assertEquals(163.87061042123645, switchingFunctionsHandler0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-8.428938276109013)).when(stepInterpolator0).getPreviousTime();
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((double)0, (-189.17813819516758), 1.0, (-8.428938276109013), 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 0, (-1775.37953), 3);
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      switchingFunctionsHandler0.stepAccepted(0.04471061572777259, doubleArray0);
      double double0 = switchingFunctionsHandler0.getEventTime();
      assertEquals(879.260826723891, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-8.428938276109013)).when(stepInterpolator0).getPreviousTime();
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((double)0, (-189.17813819516758), 1.0, (-8.428938276109013), 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1525.44135), (-376.0), (double)0).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, (-1.0006050966910838), 0, 0);
      switchingFunctionsHandler0.add(switchingFunction0, 0, (-1775.37953), 3);
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      switchingFunctionsHandler0.stepAccepted(0.04471061572777259, doubleArray0);
      assertEquals(879.260826723891, switchingFunctionsHandler0.getEventTime(), 0.01);
      
      switchingFunctionsHandler0.reset((-376.0), doubleArray0);
      boolean boolean0 = switchingFunctionsHandler0.stop();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      switchingFunctionsHandler0.add(switchingFunction0, (-1.0006050966910838), 0, 0);
      boolean boolean0 = switchingFunctionsHandler0.reset((-376.0), doubleArray0);
      boolean boolean1 = switchingFunctionsHandler0.stop();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, Double.NaN).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, Double.NaN, 0.0, 0);
      double[] doubleArray0 = new double[2];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(214.5011841708555).when(stepInterpolator0).getPreviousTime();
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      StepInterpolator stepInterpolator1 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      SwitchingFunctionsHandler switchingFunctionsHandler1 = new SwitchingFunctionsHandler();
      boolean boolean1 = switchingFunctionsHandler1.evaluateStep(stepInterpolator1);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-8.428938276109013)).when(stepInterpolator0).getPreviousTime();
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (-189.17813819516758), 1.0, (-8.428938276109013), 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      switchingFunctionsHandler0.evaluateStep(graggBulirschStoerStepInterpolator0);
      switchingFunctionsHandler0.add(switchingFunction0, 0, (-1775.37953), 3);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertEquals(879.260826723891, switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 0, (-1775.37953), 3);
      switchingFunctionsHandler0.stepAccepted(0.04471061572777259, doubleArray0);
      boolean boolean0 = switchingFunctionsHandler0.stop();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(0.0).when(stepInterpolator0).getPreviousTime();
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      boolean boolean0 = switchingFunctionsHandler0.isEmpty();
      assertTrue(boolean0);
      
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-14.63785740071), (-22.01162), 850);
      boolean boolean1 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertFalse(switchingFunctionsHandler0.isEmpty());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, Double.NaN).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-8.428938276109013)).when(stepInterpolator0).getPreviousTime();
      doReturn(true).when(stepInterpolator0).isForward();
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2673.84163940799, (-8.428938276109013), 1.0, (-8.428938276109013), 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1775.37953), 815.4232, 2673.84163940799, (-1134.5752471117), (-1134.5752471117)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 1.0, 342.726, 532);
      SwitchingFunction switchingFunction2 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1525.44135), (-376.0)).when(switchingFunction2).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.isEmpty();
      switchingFunctionsHandler0.add(switchingFunction2, (-1134.5752471117), 0, 0);
      switchingFunctionsHandler0.add(switchingFunction0, 0, (-1775.37953), 3);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertEquals((-8.428938276109013), switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-8.428938276109013)).when(stepInterpolator0).getPreviousTime();
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (-189.17813819516758), 1.0, (-8.428938276109013), 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.isEmpty();
      switchingFunctionsHandler0.add(switchingFunction0, 0, (-1775.37953), 3);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertEquals(879.260826723891, switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, Double.NaN, 453.11730502313725).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, Double.NaN, 0.0, 0);
      double[] doubleArray0 = new double[2];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(214.5011841708555).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      StepInterpolator stepInterpolator1 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1.0).when(stepInterpolator1).getCurrentTime();
      doReturn(doubleArray0).when(stepInterpolator1).getInterpolatedState();
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [214.5011841708555,1.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-8.428938276109013)).when(stepInterpolator0).getPreviousTime();
      doReturn(true).when(stepInterpolator0).isForward();
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2673.84163940799, (-8.428938276109013), 1.0, (-8.428938276109013), 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1775.37953), 815.4232, 2673.84163940799, (-1134.57525), (-1134.57525)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 1.0, 342.726, 532);
      switchingFunctionsHandler0.add(switchingFunction0, 1.0, (-506.2), 532);
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      MidpointStepInterpolator midpointStepInterpolator0 = new MidpointStepInterpolator();
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(midpointStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.MidpointStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((-8.428938276109013)).when(stepInterpolator0).getPreviousTime();
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2673.84163940799).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1775.37953), 0.0, 0.0, 0.0).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 1.0, 342.726, 532);
      switchingFunctionsHandler0.add(switchingFunction0, 1.0, (-506.2), 532);
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-8.428938276109013,335.23361042123645]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-8.428938276109013)).when(stepInterpolator0).getPreviousTime();
      doReturn(false).when(stepInterpolator0).isForward();
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2673.84163940799, (-8.428938276109013), 1.0, (-8.428938276109013), 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1775.37953), 815.4232, 2673.84163940799, (-1134.5752471117), (-1134.5752471117)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 1.0, 342.726, 532);
      switchingFunctionsHandler0.add(switchingFunction0, 1.0, 342.726, 20);
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(threeEighthesStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.ThreeEighthesStepInterpolator", e);
      }
  }
}
