/*

 * Tue Mar 03 15:37:26 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.DummyStepInterpolator;
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
      switchingFunctionsHandler0.isEmpty();
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-324.5564888067258)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(2.1170345824450285).when(stepInterpolator0).getPreviousTime();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-198), 2.1170345824450285).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-198), (-198), (-1641));
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2.1170345824450285,-522.5564888067257]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[2];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(1902.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(1902.0).when(stepInterpolator0).getPreviousTime();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2716.159), 1902.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 2145222540, 4.0, 5);
      switchingFunctionsHandler0.isEmpty();
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1902.0,1898.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      assertTrue(switchingFunctionsHandler0.isEmpty());
      
      double[] doubleArray0 = new double[4];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 0.0, Double.NaN, 358);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertFalse(switchingFunctionsHandler0.isEmpty());
      
      SwitchingFunctionsHandler switchingFunctionsHandler1 = new SwitchingFunctionsHandler();
      boolean boolean0 = switchingFunctionsHandler1.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      assertTrue(switchingFunctionsHandler0.isEmpty());
      
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((-1.0)).when(stepInterpolator0).getPreviousTime();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, Double.NaN).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, Double.NaN, Double.NaN, 1226);
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      boolean boolean0 = switchingFunctionsHandler0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      switchingFunctionsHandler0.getEventTime();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn(Double.NaN, 0.0, Double.NaN, Double.NaN, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 0.0, 0.0, 636);
      double[] doubleArray0 = new double[4];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(0.0).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      switchingFunctionsHandler0.stepAccepted((-2748.5521), doubleArray0);
      assertFalse(switchingFunctionsHandler0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn(Double.NaN, 0.0, Double.NaN, Double.NaN, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 0.0, 0.0, 636);
      double[] doubleArray0 = new double[4];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(0.0).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      switchingFunctionsHandler0.stepAccepted((-2748.5521), doubleArray0);
      double double0 = switchingFunctionsHandler0.getEventTime();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      switchingFunctionsHandler0.add(switchingFunction0, 0.30545274794128174, 0.30545274794128174, (-2951));
      boolean boolean0 = switchingFunctionsHandler0.reset(1637.3029, (double[]) null);
      boolean boolean1 = switchingFunctionsHandler0.stop();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn((-1.0)).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, Double.NaN, 3405.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, Double.NaN, Double.NaN, 1226);
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      StepInterpolator stepInterpolator1 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator1).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null).when(stepInterpolator1).getInterpolatedState();
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-1.0,NaN]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-1.0), 0.5667149535193777, 11);
      switchingFunctionsHandler0.stepAccepted(0.0, (double[]) null);
      boolean boolean0 = switchingFunctionsHandler0.stop();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, 0.0, Double.NaN, Double.NaN, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 0.0, 0.0, 636);
      double[] doubleArray0 = new double[4];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertFalse(switchingFunctionsHandler0.isEmpty());
      
      SwitchingFunctionsHandler switchingFunctionsHandler1 = new SwitchingFunctionsHandler();
      boolean boolean0 = switchingFunctionsHandler1.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      assertTrue(switchingFunctionsHandler0.isEmpty());
      
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, 0.0, Double.NaN, Double.NaN, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 0.0, 0.0, 636);
      double[] doubleArray0 = new double[4];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(0.0).when(stepInterpolator0).getPreviousTime();
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      boolean boolean1 = switchingFunctionsHandler0.isEmpty();
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, 0.0, Double.NaN, Double.NaN, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 0.0, 0.0, 636);
      double[] doubleArray0 = new double[4];
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 0.0, Double.NaN, 358);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      
      boolean boolean1 = switchingFunctionsHandler0.reset(3458.31040681134, doubleArray0);
      assertFalse(boolean1 == boolean0);
      assertEquals(Double.NaN, switchingFunctionsHandler0.getEventTime(), 0.01);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, 0.0, Double.NaN, Double.NaN, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 0.0, 0.0, 636);
      double[] doubleArray0 = new double[4];
      switchingFunctionsHandler0.stepAccepted((-1032.437), doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(0.0).when(stepInterpolator0).getPreviousTime();
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertTrue(boolean0);
  }
}
