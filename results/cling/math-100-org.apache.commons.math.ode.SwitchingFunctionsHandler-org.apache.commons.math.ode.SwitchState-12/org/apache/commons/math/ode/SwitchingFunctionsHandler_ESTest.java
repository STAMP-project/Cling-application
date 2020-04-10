/*

 * Tue Mar 03 15:38:30 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.ClassicalRungeKuttaStepInterpolator;
import org.apache.commons.math.ode.DormandPrince54StepInterpolator;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.apache.commons.math.ode.GillStepInterpolator;
import org.apache.commons.math.ode.HighamHall54StepInterpolator;
import org.apache.commons.math.ode.StepInterpolator;
import org.apache.commons.math.ode.SwitchingFunction;
import org.apache.commons.math.ode.SwitchingFunctionsHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SwitchingFunctionsHandler_ESTest extends SwitchingFunctionsHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5133, (double)5133).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 5133, 5133, 5133);
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      boolean boolean0 = switchingFunctionsHandler0.reset(5133, doubleArray0);
      boolean boolean1 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-1.0), (-1.0)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 6, 6, 6);
      double[] doubleArray0 = new double[18];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)6).when(stepInterpolator0).getPreviousTime();
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      boolean boolean1 = switchingFunctionsHandler0.reset(6, doubleArray0);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      switchingFunctionsHandler0.isEmpty();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2232.3490587311962), (-2232.3490587311962), 531.37, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-5379.13), (-5379.13), 5131);
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [NaN,NaN]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0, (-0.10416666666666667), (-1.0), (double)6, 5.791903296748099).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 1357.0, (-5379.13), 6);
      double[] doubleArray0 = new double[7];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-9.2)).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      boolean boolean0 = switchingFunctionsHandler0.isEmpty();
      assertEquals((-9.2), switchingFunctionsHandler0.getEventTime(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((-5379.13), 1357.0, (-5406.312368297264), (double)158, (double)6).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-0.3125), (-0.08333333333333333), 158);
      double[] doubleArray0 = new double[18];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-9.15095847217987)).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      switchingFunctionsHandler0.stepAccepted((-9.15095847217987), doubleArray0);
      assertEquals((-9.07243754877446), switchingFunctionsHandler0.getEventTime(), 0.01);
      
      SwitchingFunctionsHandler switchingFunctionsHandler1 = new SwitchingFunctionsHandler();
      double double0 = switchingFunctionsHandler1.getEventTime();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn(1357.0, (-2.2881602786053357), (-2.2881602786053357), (double)6, 1357.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 6, 6, 6);
      double[] doubleArray0 = new double[18];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)6).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      switchingFunctionsHandler0.stepAccepted(6, doubleArray0);
      double double0 = switchingFunctionsHandler0.getEventTime();
      assertEquals(6.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      switchingFunctionsHandler0.add(switchingFunction0, 2397.0, 2397.0, (-1));
      boolean boolean0 = switchingFunctionsHandler0.reset(2397.0, (double[]) null);
      boolean boolean1 = switchingFunctionsHandler0.stop();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      HighamHall54StepInterpolator highamHall54StepInterpolator0 = new HighamHall54StepInterpolator();
      switchingFunctionsHandler0.evaluateStep(highamHall54StepInterpolator0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-1.0), (-1.0)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 6, 6, 6);
      double[] doubleArray0 = new double[18];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)6).when(stepInterpolator0).getPreviousTime();
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      HighamHall54StepInterpolator highamHall54StepInterpolator0 = new HighamHall54StepInterpolator();
      switchingFunctionsHandler0.evaluateStep(highamHall54StepInterpolator0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0, (-5379.13), (-5379.13), (double)6, 1357.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 6, 6, 6);
      double[] doubleArray0 = new double[18];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)6).when(stepInterpolator0).getPreviousTime();
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertEquals(11.977876106194692, switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5131).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 5131, 5131, 5131);
      switchingFunctionsHandler0.stepAccepted(5131, (double[]) null);
      boolean boolean0 = switchingFunctionsHandler0.stop();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      assertTrue(switchingFunctionsHandler0.isEmpty());
      
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-1.0), (-1.0)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 6, 6, 6);
      double[] doubleArray0 = new double[18];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)6).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      boolean boolean0 = switchingFunctionsHandler0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0, (-1.0), (-1.0), (double)6, 1357.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 6, 6, 6);
      double[] doubleArray0 = new double[18];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((double)6).when(stepInterpolator0).getPreviousTime();
      SwitchingFunctionsHandler switchingFunctionsHandler1 = new SwitchingFunctionsHandler();
      switchingFunctionsHandler1.isEmpty();
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertEquals(6.0, switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-5379.13), 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-0.3125), (-0.08333333333333333), 158);
      double[] doubleArray0 = new double[18];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((-9.15095847217987)).when(stepInterpolator0).getPreviousTime();
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-9.15095847217987,1357.0833333333333]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0, (-0.10416666666666667), (-1.0), (double)6, 5.791903296748099).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 1357.0, (-5379.13), 6);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0, (-5379.13), 1357.0, (-1.0), (-1.0)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, (-9.2), 6, 6);
      double[] doubleArray0 = new double[7];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0, (-0.5128907974410148)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-9.2)).when(stepInterpolator0).getPreviousTime();
      doReturn(true).when(stepInterpolator0).isForward();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      GillStepInterpolator gillStepInterpolator0 = new GillStepInterpolator();
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(gillStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.GillStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-5379.13), 1357.0, (-5407.048859983), 1357.0, (-5407.048859983)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-28.243747170842234), (-28.243747170842234), 158);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0, (-5379.13), 1357.0, (-5407.048859983), (-5407.048859983)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 158, 6, 6);
      double[] doubleArray0 = new double[18];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0, 1357.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-5407.048859983)).when(stepInterpolator0).getPreviousTime();
      doReturn(true).when(stepInterpolator0).isForward();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      ClassicalRungeKuttaStepInterpolator classicalRungeKuttaStepInterpolator0 = new ClassicalRungeKuttaStepInterpolator();
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(classicalRungeKuttaStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.ClassicalRungeKuttaStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0, (-0.10416666666666667), (-1.0), (double)6, 5.791903296748099).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 1357.0, (-5379.13), 6);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-5379.13), 1357.0, Double.NaN, (double)93, (-931.897211)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, (-5379.13), 93, 93);
      double[] doubleArray0 = new double[7];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0, 0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-9.15095847217987)).when(stepInterpolator0).getPreviousTime();
      doReturn(false).when(stepInterpolator0).isForward();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertEquals(93.0, switchingFunctionsHandler0.getEventTime(), 0.01);
      
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-5379.13), 1357.0, Double.NaN, 1357.0, (-5407.048859983)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-0.3125), (-0.3125), 6);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0, (-5379.13), 1357.0, (-5407.048859983), (-5407.048859983)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 6, 6, 6);
      double[] doubleArray0 = new double[29];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1357.0, (-5379.13)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn((-5407.048859983)).when(stepInterpolator0).getPreviousTime();
      doReturn(false).when(stepInterpolator0).isForward();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      DormandPrince54StepInterpolator dormandPrince54StepInterpolator0 = new DormandPrince54StepInterpolator();
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(dormandPrince54StepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.DormandPrince54StepInterpolator", e);
      }
  }
}
