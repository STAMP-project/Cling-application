/*

 * Tue Mar 03 15:38:04 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.DormandPrince54StepInterpolator;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.apache.commons.math.ode.GillStepInterpolator;
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
      doReturn((double)(-13), (double)(-13)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-13), (-13), (-13));
      double[] doubleArray0 = new double[0];
      boolean boolean0 = switchingFunctionsHandler0.reset((-992.2558078), doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      boolean boolean1 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertTrue(boolean1 == boolean0);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      switchingFunctionsHandler0.isEmpty();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2586.744382623241), 0.3111643669578199, Double.NaN, Double.NaN, (-2977.7023)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, Double.NaN, (-2977.7023), 239);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-758.0923834)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((-2586.744382623241)).when(stepInterpolator0).getPreviousTime();
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertEquals(730.7587666, switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-6046.732980148314), (-6046.732980148314), (double)0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 0, 0, 0);
      switchingFunctionsHandler0.isEmpty();
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
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
      boolean boolean0 = switchingFunctionsHandler0.isEmpty();
      assertTrue(boolean0);
      
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-2798.8453931241293), Double.NaN, 4130);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-758.0923834)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((-2798.8453931241293)).when(stepInterpolator0).getPreviousTime();
      boolean boolean1 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertFalse(switchingFunctionsHandler0.isEmpty());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      switchingFunctionsHandler0.getEventTime();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(239).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((-2586.744382623241), 0.3111643669578199, Double.NaN, Double.NaN, (-2977.7023)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, Double.NaN, (-2977.7023), 239);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-758.0923834)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((-2586.744382623241)).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      switchingFunctionsHandler0.stepAccepted((-758.0923834), (double[]) null);
      assertEquals(730.7587666, switchingFunctionsHandler0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((double)1022, (-2798.487781271792), 10.42750864257913, (-2798.487781271792), 0.8859180748217733).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 1022, 1022, 1022);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.8859180748217733).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((-2798.487781271792)).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      switchingFunctionsHandler0.getEventTime();
      switchingFunctionsHandler0.stepAccepted(10.42750864257913, (double[]) null);
      assertEquals((-1776.4877812717918), switchingFunctionsHandler0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[4];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((double)1002, (-2798.487781271792), 10.42750864257913, (-2798.487781271792), 0.7691885558162953).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 1002, 1002, 1002);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.7691885558162953, 0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((-2798.487781271792)).when(stepInterpolator0).getPreviousTime();
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 797.076942309, 1.0, 1002);
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      switchingFunctionsHandler0.stepAccepted((-3254.122987628233), (double[]) null);
      assertEquals((-1796.4877812717918), switchingFunctionsHandler0.getEventTime(), 0.01);
      
      switchingFunctionsHandler0.reset(0.7691885558162953, doubleArray0);
      boolean boolean0 = switchingFunctionsHandler0.stop();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      switchingFunctionsHandler0.add(switchingFunction0, 0, 0, 0);
      boolean boolean0 = switchingFunctionsHandler0.reset(0, (double[]) null);
      boolean boolean1 = switchingFunctionsHandler0.stop();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      GillStepInterpolator gillStepInterpolator0 = new GillStepInterpolator();
      switchingFunctionsHandler0.evaluateStep(gillStepInterpolator0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (-500.04268), (-500.04268), 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 0, 0, 0);
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [NaN,NaN]  Values: [-500.04268,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)1002).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 1002, 1002, 1002);
      switchingFunctionsHandler0.stepAccepted((-3254.122987628233), (double[]) null);
      boolean boolean0 = switchingFunctionsHandler0.stop();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      switchingFunctionsHandler0.isEmpty();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, 0.3111643669578199, Double.NaN, Double.NaN, 0.3111643669578199).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, Double.NaN, (-2798.487781271792), 1010);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.3111643669578199).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((-2798.487781271792)).when(stepInterpolator0).getPreviousTime();
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

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)1022, (-2797.7726373945384), 10.42750864257913, (-2797.7726373945384), 0.8859180748217733).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 1022, 1022, 1022);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.8859180748217733).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((-2797.7726373945384)).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.isEmpty();
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertFalse(switchingFunctionsHandler0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 0, 0, 0);
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, 0.0, Double.NaN, Double.NaN, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, Double.NaN, (-2798.8453931241293), 4130);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)4130).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, (-2798.8453931241293), Double.NaN, 4130);
      SwitchingFunction switchingFunction2 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)4130, (-2798.8453931241293), Double.NaN, (-758.0923834), 0.0).when(switchingFunction2).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction2, 4130, 4130, 4130);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-758.0923834), (-2798.8453931241293), (double)4130).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((-2798.8453931241293)).when(stepInterpolator0).getPreviousTime();
      doReturn(true).when(stepInterpolator0).isForward();
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertEquals(641.3303131620646, switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, 0.3111643669578199, Double.NaN, Double.NaN, 0.3111643669578199).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, Double.NaN, (-2798.487781271792), 1010);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)1010, (-2798.487781271792), Double.NaN, (-2798.487781271792), 0.3111643669578199).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 1010, 1010, 1010);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.3111643669578199, 0.3111643669578199).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((-2798.487781271792)).when(stepInterpolator0).getPreviousTime();
      doReturn(true).when(stepInterpolator0).isForward();
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

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, 0.0, Double.NaN, Double.NaN, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, Double.NaN, (-2798.8453931241293), 4130);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)4130).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, (-2798.8453931241293), Double.NaN, 4130);
      SwitchingFunction switchingFunction2 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)4130, (-2798.8453931241293), Double.NaN, (-758.0923834), 0.0).when(switchingFunction2).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction2, 4130, 4130, 4130);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-758.0923834), (-2798.8453931241293), (double)4130).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((-2798.8453931241293)).when(stepInterpolator0).getPreviousTime();
      doReturn(false).when(stepInterpolator0).isForward();
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertEquals(2730.5773034379354, switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, Double.NaN, (-2798.487781271792), 1010);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)1010).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 1010, 1010, 1010);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((-2798.487781271792)).when(stepInterpolator0).getPreviousTime();
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-2798.487781271792,2798.487781271792]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }
}
