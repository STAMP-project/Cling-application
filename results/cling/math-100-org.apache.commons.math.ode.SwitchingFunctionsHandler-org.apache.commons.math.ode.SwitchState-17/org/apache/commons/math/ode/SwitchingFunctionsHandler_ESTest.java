/*

 * Tue Mar 03 15:39:19 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.apache.commons.math.ode.GillStepInterpolator;
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
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(539.5937998898444).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)20).when(stepInterpolator0).getPreviousTime();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 539.5937998898444, 20, 20);
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      boolean boolean0 = switchingFunctionsHandler0.reset(20, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1723.250199), (-1723.250199), 540.451353376639, 540.451353376639, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 540.451353376639, (-1723.250199), (-1));
      double[] doubleArray0 = new double[1];
      switchingFunctionsHandler0.stepAccepted(540.451353376639, doubleArray0);
      switchingFunctionsHandler0.stepAccepted(540.451353376639, doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(540.451353376639).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)(-1)).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.isEmpty();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      switchingFunctionsHandler0.isEmpty();
      assertTrue(switchingFunctionsHandler0.isEmpty());
      
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-2756.171000690842), (-2756.171000690842), 2146834592);
      double[] doubleArray0 = new double[5];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1320)).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((-1746.617455517326), (-1746.617455517326), 540.451353376639, 540.451353376639, (-1746.617455517326)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(540.451353376639).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)(-1)).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.getEventTime();
      switchingFunctionsHandler0.add(switchingFunction0, 306, 540.451353376639, 2143524797);
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      switchingFunctionsHandler0.stepAccepted(540.451353376639, doubleArray0);
      assertEquals(810.1770300649584, switchingFunctionsHandler0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((-1723.25019852), (-1723.25019852), 540.451353376639, 540.451353376639, (-1723.25019852)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 540.451353376639, (-1723.25019852), 46);
      double[] doubleArray0 = new double[1];
      switchingFunctionsHandler0.stepAccepted((-1723.25019852), doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(540.451353376639).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)46).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      switchingFunctionsHandler0.getEventTime();
      switchingFunctionsHandler0.stepAccepted(65.0, doubleArray0);
      assertEquals(46.0, switchingFunctionsHandler0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((-1723.25019852), (-1723.25019852), 540.451353376639, 540.451353376639, (-1723.25019852)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 540.451353376639, (-1723.25019852), 46);
      double[] doubleArray0 = new double[1];
      switchingFunctionsHandler0.stepAccepted((-1723.25019852), doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(540.451353376639).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)46).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.reset(46, doubleArray0);
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      switchingFunctionsHandler0.stepAccepted(65.0, doubleArray0);
      boolean boolean0 = switchingFunctionsHandler0.stop();
      assertEquals(46.0, switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      switchingFunctionsHandler0.add(switchingFunction0, (-1007.5), (-1007.5), (-1));
      double[] doubleArray0 = new double[0];
      boolean boolean0 = switchingFunctionsHandler0.reset((-1), doubleArray0);
      boolean boolean1 = switchingFunctionsHandler0.stop();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(threeEighthesStepInterpolator0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1723.2501985168), (-1723.2501985168)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-1723.2501985168), (-1723.2501985168), (-1));
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1723.2501985168)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)(-1)).when(stepInterpolator0).getPreviousTime();
      boolean boolean1 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1723.2501985168), (-1723.2501985168), 540.451353376639, 540.451353376639, (-1723.2501985168)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      GillStepInterpolator gillStepInterpolator0 = new GillStepInterpolator();
      switchingFunctionsHandler0.evaluateStep(gillStepInterpolator0);
      switchingFunctionsHandler0.add(switchingFunction0, 540.451353376639, (-1723.2501985168), (-1));
      double[] doubleArray0 = new double[1];
      switchingFunctionsHandler0.stepAccepted(540.451353376639, doubleArray0);
      switchingFunctionsHandler0.stepAccepted(540.451353376639, doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(540.451353376639).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)(-1)).when(stepInterpolator0).getPreviousTime();
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [1992.9758752051196,2263.701551893439]  Values: [-1723.2501985168,-1723.2501985168]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)1085).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 1085, 1085, 1085);
      switchingFunctionsHandler0.stepAccepted(1085, (double[]) null);
      boolean boolean0 = switchingFunctionsHandler0.stop();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[6];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(4196.526330057531).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.isEmpty();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-1703.886104504)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 0.0, (-1703.886104504), (-1));
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [4196.526330057531,2492.6402235993705]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      assertTrue(switchingFunctionsHandler0.isEmpty());
      
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1723.25019852), (-1723.25019852)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 539.5937998898444, (-1723.25019852), 20);
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      boolean boolean0 = switchingFunctionsHandler0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1723.2501985168), (-1723.2501985168), 540.451353376639, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 540.451353376639, (-1723.2501985168), 24);
      double[] doubleArray0 = new double[8];
      switchingFunctionsHandler0.stepAccepted(540.451353376639, doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(540.451353376639).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)24).when(stepInterpolator0).getPreviousTime();
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [24.0,2263.701551893439]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1723.25019852), (-1723.25019852), 540.451353376639, 540.451353376639, (-1723.25019852)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 540.451353376639, (-1723.25019852), 46);
      double[] doubleArray0 = new double[1];
      switchingFunctionsHandler0.stepAccepted((-1723.25019852), doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(540.451353376639).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)46).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      boolean boolean0 = switchingFunctionsHandler0.isEmpty();
      assertEquals(46.0, switchingFunctionsHandler0.getEventTime(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1723.25019852), (-1723.25019852), 539.5937998898444, 539.5937998898444, (-1723.25019852)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 539.5937998898444, (-1723.25019852), 20);
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(539.5937998898444).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)20).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertEquals(20.0, switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1723.25019852), (-1723.25019852), 539.5937998898444, 539.5937998898444, (-1723.25019852)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 539.5937998898444, (-1723.25019852), 20);
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(539.5937998898444).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)20).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2198.0), (-1073.856466), (-1723.25019852)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, (-1723.25019852), 20, 20);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [NaN,NaN]  Values: [-1073.856466,-1723.25019852]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1723.25019852), (-1723.25019852), 539.5937998898444, 539.5937998898444, (-1723.25019852)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 539.5937998898444, (-1723.25019852), 20);
      double[] doubleArray0 = new double[1];
      switchingFunctionsHandler0.stepAccepted(539.5937998898444, doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(539.5937998898444).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)20).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2198.0), (-1073.856466), (-1723.25019852)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, (-1723.25019852), 20, 20);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [NaN,NaN]  Values: [-1073.856466,-1723.25019852]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }
}
