/*

 * Tue Mar 03 15:39:22 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.DormandPrince853StepInterpolator;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.SwitchingFunction;
import org.apache.commons.math.ode.SwitchingFunctionsHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SwitchingFunctionsHandler_ESTest extends SwitchingFunctionsHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[4];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(441.86352962382205, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, Double.NaN, Double.NaN, 1134);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      boolean boolean0 = switchingFunctionsHandler0.reset((-1157.41647575685), doubleArray0);
      boolean boolean1 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      switchingFunctionsHandler0.isEmpty();
      double[] doubleArray0 = new double[5];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(445.9964033748939, (-4722.0), (-494.7901914600971), Double.NaN, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, Double.NaN, Double.NaN, 1134);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertFalse(switchingFunctionsHandler0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      assertTrue(switchingFunctionsHandler0.isEmpty());
      
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)1256, (-452.17524673437), (-452.17524673437), (double)1256, 1.0E-15).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 1256, 1256, 1256);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      boolean boolean0 = switchingFunctionsHandler0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      switchingFunctionsHandler0.isEmpty();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)1181, (double)1181).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 1181, 1181, 1181);
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      assertTrue(switchingFunctionsHandler0.isEmpty());
      
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)1181, (double)1181).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 1181, 1181, 1181);
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      boolean boolean0 = switchingFunctionsHandler0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((-494.7901914600971), 441.86352962382205, Double.NaN, (double)1134, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      double[] doubleArray0 = new double[4];
      switchingFunctionsHandler0.add(switchingFunction0, (-0.84375), (-301.30081804), 1134);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchingFunctionsHandler0.getEventTime();
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      switchingFunctionsHandler0.stepAccepted((-4722.0), doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((-494.7901914600971), 441.86352962382205, Double.NaN, (double)1134, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      double[] doubleArray0 = new double[5];
      switchingFunctionsHandler0.add(switchingFunction0, 1098.23065313644, (-1.0), 100);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      switchingFunctionsHandler0.getEventTime();
      switchingFunctionsHandler0.stepAccepted((-1.0), doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[0];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.7777777777777778, (-614.48103941), (-614.48103941), (-614.48103941)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      switchingFunctionsHandler0.evaluateStep(dormandPrince853StepInterpolator0);
      switchingFunctionsHandler0.add(switchingFunction0, 0.7777777777777778, (-2146563301), (-2146563301));
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [NaN,NaN]  Values: [-614.48103941,-614.48103941]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((-494.7901914600971), 441.86352962382205, Double.NaN, (double)1134, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      double[] doubleArray0 = new double[4];
      switchingFunctionsHandler0.add(switchingFunction0, (-0.84375), (-301.30081804), 1134);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      boolean boolean0 = switchingFunctionsHandler0.reset((-1157.41647575685), doubleArray0);
      boolean boolean1 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertTrue(boolean1);
      
      switchingFunctionsHandler0.stepAccepted((-4722.0), doubleArray0);
      boolean boolean2 = switchingFunctionsHandler0.stop();
      assertFalse(boolean2 == boolean0);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[4];
      switchingFunctionsHandler0.add(switchingFunction0, (-0.84375), (-301.30081804), 1134);
      boolean boolean0 = switchingFunctionsHandler0.reset((-1157.41647575685), doubleArray0);
      boolean boolean1 = switchingFunctionsHandler0.stop();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-3920), (double)(-3920)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-3920), (-3920), (-3920));
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertFalse(boolean0);
      
      SwitchingFunctionsHandler switchingFunctionsHandler1 = new SwitchingFunctionsHandler();
      switchingFunctionsHandler1.evaluateStep(dummyStepInterpolator0);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)1261).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 1261, 1261, 1261);
      switchingFunctionsHandler0.stepAccepted(1261, doubleArray0);
      boolean boolean0 = switchingFunctionsHandler0.stop();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      switchingFunctionsHandler0.isEmpty();
      assertTrue(switchingFunctionsHandler0.isEmpty());
      
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-494.7901914600971), 441.86352962382205, Double.NaN, (double)1134, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      double[] doubleArray0 = new double[5];
      switchingFunctionsHandler0.add(switchingFunction0, 1098.23065313644, (-1.0), 100);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-494.7901914600971), 441.86352962382205, Double.NaN, (double)1134, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      double[] doubleArray0 = new double[5];
      switchingFunctionsHandler0.add(switchingFunction0, 1098.23065313644, (-1.0), 100);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      boolean boolean0 = switchingFunctionsHandler0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)1181, (double)1181, (-198.180229749151), (-198.180229749151), (double)1181).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 1181, 1181, 1181);
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      try { 
        switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // Maximal number of iterations (1,181) exceeded
         //
         verifyException("org.apache.commons.math.ode.SwitchingFunctionsHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-494.7901914600971), 445.9964033748939, Double.NaN, (double)1134, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      double[] doubleArray0 = new double[5];
      switchingFunctionsHandler0.add(switchingFunction0, 1134, (-301.30081804), 1134);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(445.9964033748939, (-4722.0), (-494.7901914600971), Double.NaN, 0.0).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, Double.NaN, Double.NaN, 1134);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-494.7901914600971), 441.86352962382205, Double.NaN, (double)1134, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      double[] doubleArray0 = new double[4];
      switchingFunctionsHandler0.add(switchingFunction0, (-0.84375), (-301.30081804), 1134);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(441.86352962382205, (-4722.0), (-494.7901914600971), Double.NaN, 0.0).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, Double.NaN, Double.NaN, 1134);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertTrue(boolean0);
  }
}
