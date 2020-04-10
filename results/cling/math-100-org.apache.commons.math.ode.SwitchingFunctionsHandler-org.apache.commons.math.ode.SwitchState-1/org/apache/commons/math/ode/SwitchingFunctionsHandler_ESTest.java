/*

 * Tue Mar 03 15:37:01 GMT 2020
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
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-2147050683), (-2147050683), 2139331044);
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      
      boolean boolean1 = switchingFunctionsHandler0.reset((-2147050683), doubleArray0);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-567.272), (-4269.457)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 5486, 5486, 5486);
      boolean boolean0 = switchingFunctionsHandler0.reset(5486, doubleArray0);
      boolean boolean1 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[0];
      switchingFunctionsHandler0.isEmpty();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-567.272), (-567.272), (double)5480, 1.0, (-567.272)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 5480, 5480, 5480);
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      switchingFunctionsHandler0.stepAccepted(5480, doubleArray0);
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [5480.0,NaN]  Values: [-567.272,-567.272]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(576.5324397318, (double)(-9), 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-9), (-9), (-9));
      switchingFunctionsHandler0.isEmpty();
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
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
  public void test04()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-9), (-9), (-9));
      switchingFunctionsHandler0.isEmpty();
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertFalse(switchingFunctionsHandler0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-567.272), (-4269.457), (double)5486, 1.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 5486, 5486, 5486);
      switchingFunctionsHandler0.stepAccepted(5486, doubleArray0);
      dummyStepInterpolator0.previousTime = (double) 5486;
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [5486.0,NaN]  Values: [1.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((-567.272), (-567.272), (double)5480, 1.0, (-567.272)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 5480, 5480, 5480);
      switchingFunctionsHandler0.stepAccepted(5480, doubleArray0);
      dummyStepInterpolator0.previousTime = (double) 5480;
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      switchingFunctionsHandler0.getEventTime();
      double[] doubleArray1 = new double[0];
      switchingFunctionsHandler0.stepAccepted(1117.744, doubleArray1);
      assertEquals(5480.0, switchingFunctionsHandler0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      switchingFunctionsHandler0.evaluateStep((StepInterpolator) null);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)(-3), (double)(-3), (double)(-3)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-3), (-3), (-3));
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [NaN,NaN]  Values: [-3.0,-3.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      switchingFunctionsHandler0.add(switchingFunction0, (-12), (-12), (-12));
      boolean boolean0 = switchingFunctionsHandler0.stop();
      double[] doubleArray0 = new double[1];
      boolean boolean1 = switchingFunctionsHandler0.reset((-12), doubleArray0);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, (-12), (-12), (-12));
      switchingFunctionsHandler0.stop();
      switchingFunctionsHandler0.stepAccepted((-12), (double[]) null);
      assertEquals(Double.NaN, switchingFunctionsHandler0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[0];
      switchingFunctionsHandler0.isEmpty();
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-567.272), (-4269.457), (double)5486, 1.0, (-4269.457)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 5486, 5486, 5486);
      switchingFunctionsHandler0.stepAccepted(5486, doubleArray0);
      dummyStepInterpolator0.previousTime = (double) 5486;
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertEquals(5486.0, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-567.272), (-567.272), (double)5480, 1.0, (-567.272)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 5480, 5480, 5480);
      switchingFunctionsHandler0.stepAccepted(5480, doubleArray0);
      dummyStepInterpolator0.previousTime = (double) 5480;
      switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      boolean boolean0 = switchingFunctionsHandler0.isEmpty();
      assertEquals(5480.0, switchingFunctionsHandler0.getEventTime(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[10];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-567.7677302926575), (-567.7677302926575), (double)5486, 1.0, (-567.7677302926575)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 5486, 5486, 5486);
      switchingFunctionsHandler0.stepAccepted(5486, doubleArray0);
      dummyStepInterpolator0.previousTime = (double) 5486;
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5486, (-567.7677302926575), 0.7777137798053443, (-567.7677302926575), (-567.7677302926575)).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, (-567.7677302926575), (-567.7677302926575), 5486);
      boolean boolean0 = switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
      assertEquals(5486.0, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
      double[] doubleArray0 = new double[10];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-580.7232430907999), (-580.7232430907999), 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction0, 5486, 5486, 5486);
      switchingFunctionsHandler0.stepAccepted(5486, doubleArray0);
      dummyStepInterpolator0.previousTime = (double) 5486;
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5486).when(switchingFunction1).g(anyDouble() , any(double[].class));
      switchingFunctionsHandler0.add(switchingFunction1, (-580.7232430907999), (-580.7232430907999), 5486);
      // Undeclared exception!
      try { 
        switchingFunctionsHandler0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [5486.0,NaN]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }
}
