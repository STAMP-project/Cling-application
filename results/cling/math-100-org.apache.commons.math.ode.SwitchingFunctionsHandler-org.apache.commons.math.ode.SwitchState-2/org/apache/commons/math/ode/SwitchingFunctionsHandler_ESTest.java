/*

 * Tue Mar 03 15:37:22 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.DormandPrince54StepInterpolator;
import org.apache.commons.math.ode.DummyStepInterpolator;
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
      doReturn(Double.NaN, 1.0, 1.0, Double.NaN, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, Double.NaN, Double.NaN, 859);
      double[] doubleArray0 = new double[0];
      boolean boolean0 = switchingFunctionsHandler0.reset(1.0, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      boolean boolean1 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[9];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-660.6816114008509)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray1, (Object) doubleArray1).when(stepInterpolator0).getInterpolatedState();
      doReturn((-3039.423274111)).when(stepInterpolator0).getPreviousTime();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-666.0), (-666.0), (double)323, Double.NaN, 418.24).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.isEmpty();
      switchingFunctionsHandler0.add(switchingFunction0, 849.608372065661, 849.608372065661, 323);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertEquals((-603.9871269052395), switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[9];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-660.6816114008509)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray1, (Object) doubleArray1).when(stepInterpolator0).getInterpolatedState();
      doReturn((-3039.423274111)).when(stepInterpolator0).getPreviousTime();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-666.0), (-666.0), (double)323, Double.NaN, 418.24).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 849.608372065661, 849.608372065661, 323);
      switchingFunctionsHandler0.isEmpty();
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertEquals((-603.9871269052395), switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[9];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-660.6816114008509), 970.084, (-1.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray1, (Object) doubleArray1).when(stepInterpolator0).getInterpolatedState();
      doReturn((-3039.423274111)).when(stepInterpolator0).getPreviousTime();
      doReturn(false, true).when(stepInterpolator0).isForward();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-666.0), (-666.0), (double)323, Double.NaN, (double)323).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(970.084, (-660.6816114008509), 360.7966292299, (-27.84), (-1.0)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 641.7627872311376, (-0.322376179245283), 323);
      switchingFunctionsHandler0.add(switchingFunction0, 849.608372065661, 849.608372065661, 323);
      SwitchingFunction switchingFunction2 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-901.319722284587), 2782.831580086, Double.NaN, (-1286.568136), 1.0).when(switchingFunction2).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction2, 979, (-666.0), 323);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertEquals((-2612.81745558325), switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 96.32455395918828).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 791.2884816044669, 0.0, 262);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction1).eventOccurred(anyDouble() , any(double[].class));
      doReturn(0.0, 0.0, (-884.49), Double.NaN, 5.746280211439194).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 0.0, 0.0, 979);
      switchingFunctionsHandler0.getEventTime();
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)262).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(0.25).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      switchingFunctionsHandler0.stepAccepted(0.0, (double[]) null);
      assertEquals(0.25000012188684434, switchingFunctionsHandler0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-29.842393913868666), 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 791.2884816044669, Double.NaN, 262);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-29.842393913868666)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, (-29.842393913868666), (-29.842393913868666), 262);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(0.0).when(stepInterpolator0).getPreviousTime();
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [0.0,NaN]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[9];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-660.6816114008509), 970.084).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray1, (Object) doubleArray1).when(stepInterpolator0).getInterpolatedState();
      doReturn((-3039.423274111)).when(stepInterpolator0).getPreviousTime();
      doReturn(false).when(stepInterpolator0).isForward();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-666.0), (-666.0), (double)323, Double.NaN, (double)323).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 849.608372065661, 849.608372065661, 323);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-901.31972228), 2782.831580086, Double.NaN, (-1286.568136), 1.0).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 979, (-708.0), 323);
      switchingFunctionsHandler0.stepAccepted(2062.79882, doubleArray1);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertEquals((-2246.5093865409503), switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 96.32455395918828).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 791.2884816044669, 0.0, 262);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction1).eventOccurred(anyDouble() , any(double[].class));
      doReturn(0.0, 0.0, (-884.49), Double.NaN, 5.746280211439194).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 0.0, 0.0, 979);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)262).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(0.25).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.reset(96.32455395918828, (double[]) null);
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      switchingFunctionsHandler0.stepAccepted(0.0, (double[]) null);
      boolean boolean0 = switchingFunctionsHandler0.stop();
      assertEquals(0.25000012188684434, switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      switchingFunctionsHandler0.add(switchingFunction0, 791.2884816044669, 0.0, 262);
      boolean boolean0 = switchingFunctionsHandler0.reset(96.32455395918828, (double[]) null);
      boolean boolean1 = switchingFunctionsHandler0.stop();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[9];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-660.6816114008509), 970.084).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray1, (Object) doubleArray1).when(stepInterpolator0).getInterpolatedState();
      doReturn((-3039.423274111)).when(stepInterpolator0).getPreviousTime();
      doReturn(false).when(stepInterpolator0).isForward();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-666.0), (-666.0), (double)323, Double.NaN, 418.24).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 849.608372065661, 849.608372065661, 323);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)323, Double.NaN, (-1286.568136), (-1.0)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 979, (-708.0), 323);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-3039.423274111,NaN]  Values: [418.24,418.24]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      HighamHall54StepInterpolator highamHall54StepInterpolator0 = new HighamHall54StepInterpolator();
      switchingFunctionsHandler0.evaluateStep(highamHall54StepInterpolator0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, (-884.49)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 0.0, 0.0, 979);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(0.25).when(stepInterpolator0).getPreviousTime();
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [0.24999999988358468,0.24999999976716936]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)666).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 666, 666, 666);
      switchingFunctionsHandler0.stop();
      switchingFunctionsHandler0.stepAccepted(666, (double[]) null);
      assertEquals(Double.NaN, switchingFunctionsHandler0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      switchingFunctionsHandler0.isEmpty();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 791.2884816044669, 0.0, 262);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, (-884.49), Double.NaN, 5.746280211439194).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 0.0, 0.0, 979);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)262).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(0.25).when(stepInterpolator0).getPreviousTime();
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertEquals(0.25000012188684434, switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 791.2884816044669, 0.0, 262);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, (-884.49), Double.NaN, 5.746280211439194).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 0.0, 0.0, 979);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)262).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(0.25).when(stepInterpolator0).getPreviousTime();
      switchingFunctionsHandler0.isEmpty();
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertFalse(switchingFunctionsHandler0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[9];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-660.6816114008509), 970.084).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray1, (Object) doubleArray1).when(stepInterpolator0).getInterpolatedState();
      doReturn((-3039.423274111)).when(stepInterpolator0).getPreviousTime();
      doReturn(true).when(stepInterpolator0).isForward();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-666.0), (-666.0), (double)323, Double.NaN, 418.24).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 849.608372065661, 849.608372065661, 323);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-901.319722284587), 2782.831580086, Double.NaN, (-1286.568136), (-1.0)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, (-1883.5218192888), 1.0, 2146948183);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      assertEquals((-603.9871269052395), switchingFunctionsHandler0.getEventTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(0.0).when(stepInterpolator0).getPreviousTime();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, (-882.7013331218512)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 0.0, 0.0, 262);
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      StepInterpolator stepInterpolator1 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(stepInterpolator1).getCurrentTime();
      doReturn((double[]) null).when(stepInterpolator1).getInterpolatedState();
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[9];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-660.6816114008509), 970.084).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray1, (Object) doubleArray1).when(stepInterpolator0).getInterpolatedState();
      doReturn((-3039.423274111)).when(stepInterpolator0).getPreviousTime();
      doReturn(true).when(stepInterpolator0).isForward();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-666.0), (-666.0), (double)323, Double.NaN, 418.24).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 849.608372065661, 849.608372065661, 323);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-901.319722284587), 2782.831580086, Double.NaN, (-1286.568136), (-1.0)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 323, (-708.0), 323);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-3039.423274111,NaN]  Values: [418.24,418.24]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[10];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-660.6816114008509), 970.084).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray1, (Object) doubleArray1).when(stepInterpolator0).getInterpolatedState();
      doReturn((-3039.42)).when(stepInterpolator0).getPreviousTime();
      doReturn(false).when(stepInterpolator0).isForward();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-666.0), (-666.0), (double)323, Double.NaN, (double)323).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(970.084, (-660.6816114008509), 2371.31059479, (-27.594512739714805), (-3039.42)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, 947.4, (-0.322376179245283), 323);
      switchingFunctionsHandler0.add(switchingFunction0, 2371.31059479, 2371.31059479, 323);
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
