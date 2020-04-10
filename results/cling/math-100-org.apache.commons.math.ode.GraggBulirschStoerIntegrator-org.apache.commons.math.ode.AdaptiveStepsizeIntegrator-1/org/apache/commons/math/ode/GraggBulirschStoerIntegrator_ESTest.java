/*

 * Tue Mar 03 15:24:24 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.ContinuousOutputModel;
import org.apache.commons.math.ode.DummyStepHandler;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.FixedStepHandler;
import org.apache.commons.math.ode.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.StepHandler;
import org.apache.commons.math.ode.StepNormalizer;
import org.apache.commons.math.ode.SwitchingFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GraggBulirschStoerIntegrator_ESTest extends GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[9][4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4.0, 7.0, doubleArray0[0], doubleArray0[0]);
      graggBulirschStoerIntegrator0.setInitialStepSize(0.0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-794), (-2144264109), 0.001);
      assertEquals(5.291502622129181, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.38466765651207, (-1681.3250338669), 2.38466765651207, 2.38466765651207);
      DummyStepHandler dummyStepHandler0 = (DummyStepHandler)graggBulirschStoerIntegrator0.handler;
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-663.29222), doubleArray0, 1.0E-12, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1948.1770302375874, 0.0, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-907.5227167057386), true);
      assertEquals(-0.0, double0, 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(1948.1770302375874, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.38466765651207, (-1681.3250338669), 2.38466765651207, 2.38466765651207);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2381, 2381, 2381);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2381).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 2.38466765651207, doubleArray0, 2.38466765651207, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 4,762, initial state vector has dimension 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1571.20432269701), 3093.5850312, (-1571.20432269701), 0.0);
      graggBulirschStoerIntegrator0.setInitialStepSize(579.03088479748);
      graggBulirschStoerIntegrator0.setStepsizeControl(966.7735076378274, (-1571.20432269701), 732.4712297116268, (-758.0));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1681.3250338669), 2381, doubleArray0, (double[]) null);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-663.29222), doubleArray0, 1.0E-12, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0, 367.6715299737, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(1867, (-2272.9349), 367.6715299737, 1.0);
      // Undeclared exception!
      graggBulirschStoerIntegrator1.integrate(firstOrderConverter0, (-697.2319770188449), doubleArray0, 0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1712.5147, 1177.764262282914, 1712.5147, 1712.5147);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1, 5, 1);
      graggBulirschStoerIntegrator0.setInitialStepSize(1712.5147);
      assertEquals(1420.189639553164, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2404.9), (-2404.9), (-2404.9), (-2404.9));
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-1), 16, 1107.0);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-2518.4), true);
      assertEquals(2404.9, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(2404.9, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[7];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1431.2222322), (-1571.20432269701), doubleArray0, doubleArray1);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 3093.5850312, doubleArray1, 2144.30254391647, doubleArray1);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, initial state vector has dimension 7
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2333.888777749569, 2333.888777749569, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(734, true);
      assertEquals(2333.888777749569, double0, 0.01);
      
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      graggBulirschStoerIntegrator0.setStepHandler(continuousOutputModel0);
      assertEquals(2333.888777749569, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1712.5147, 1177.764262282914, 1712.5147, 1712.5147);
      graggBulirschStoerIntegrator0.setStepsizeControl(1177.764262282914, (-25.69393346270375), 996.5, 2953.385);
      graggBulirschStoerIntegrator0.setInitialStepSize(1712.5147);
      assertEquals(1420.189639553164, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1948.1770302375874, 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(6016, 0.0, 6016, (-1431.2222322));
      graggBulirschStoerIntegrator0.setInitialStepSize((-834.1126671295423));
      assertEquals(1948.1770302375874, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setOrderControl(122, 5, (-1788.3720430475));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(5, 1, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1, 8, 1);
      graggBulirschStoerIntegrator0.setInitialStepSize((-31.139403219565178));
      assertEquals(2.23606797749979, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-8.428938276109013), doubleArray1, 493.7001275054, doubleArray1);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: state vector has dimension 0, absolute tolerance vector has dimension 5
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2331.4715261638607, 2331.4715261638607, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(697, true);
      assertEquals(2331.4715261638607, double0, 0.01);
      
      graggBulirschStoerIntegrator0.setStepsizeControl(1982.7165943123969, (-2799.18388223687), 0.9, (-2619.0));
      assertEquals(2331.4715261638607, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(7.0, 7.0, (double[]) null, (double[]) null);
      double double0 = graggBulirschStoerIntegrator0.filterStep(304, false);
      assertEquals(7.0, double0, 0.01);
      
      graggBulirschStoerIntegrator0.setStepsizeControl(3891.0, 7.0, 7.0, 520.0651164);
      assertEquals(7.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-12, 1.0E-12, 367.6715299737, (-2031.36410865));
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 1.0E-12, 1189.51193861, 1867);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 2, doubleArray0, (-1157.0), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-12, 1.0E-12, 367.6715299737, (-2031.36410865));
      graggBulirschStoerIntegrator0.setOrderControl(2, 0.65, 1.0E-10);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 2, doubleArray0, (-1157.0), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1712.5147, 1177.764262282914, 1712.5147, 1712.5147);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1, 5, 1);
      double double0 = graggBulirschStoerIntegrator0.filterStep(8, true);
      assertEquals(1420.189639553164, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(1177.764262282914, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-12, 1.0E-12, 367.6715299737, (-2031.36410865));
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 2, doubleArray0, (-1157.0), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3726.837674254341, 837.8, 3726.837674254341, 837.8);
      graggBulirschStoerIntegrator0.setStepsizeControl(3.0, 0.001, (-834.1126671295423), 3.0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(7, 7).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[3];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-665.0), doubleArray0, 1.0E-4, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 7, initial state vector has dimension 3
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1691.203934665944), 0.0, 851.34539789256, 0.0);
      graggBulirschStoerIntegrator0.setInitialStepSize(0.0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-931), (-562), 370.66);
      assertEquals(-0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2404.9), (-2518.4), (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setInitialStepSize(2246.655317065);
      assertEquals(2460.9957659451593, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1571.20432269701), 3093.5850312, (-1571.20432269701), 0.0);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.setInitialStepSize(579.03088479748);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      double[] doubleArray1 = new double[7];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-1431.2222322), (-1571.20432269701), doubleArray0, doubleArray1);
      assertEquals(1499.5807940797, graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator1.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-12, 1.0E-12, 367.6715299737, (-2031.36410865));
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 1.0E-12, 1189.51193861, 1867);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-2130.908734), doubleArray0, 1.7976931348623157E308, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4376.0, 4376.0, 4376.0, 4376.0);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.001, (-481.214799512865), (-0.19316434850839564), 4376.0);
      assertEquals(4376.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2331.4715261638607, 2331.4715261638607, doubleArray0, doubleArray0);
      try { 
        graggBulirschStoerIntegrator0.filterStep(734, false);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (2,331.472) reached, integration needs 734
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2333.888777749569, 2333.888777749569, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(734, true);
      assertEquals(2333.888777749569, double0, 0.01);
      
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 2261.2702221320787, (-705.27846), (-2097));
      assertEquals(2333.888777749569, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1189.51193861, 0.9, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(5, 1850.772, 0.9);
      assertEquals(32.71942457851299, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1691.12421), 0.0, 851.34539789256, 0.0);
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-2470.109662), doubleArray0, (-2470.109662), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2331.4715261638607, 2331.4715261638607, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 319, 319, 319);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[8];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-570.17511529), doubleArray0, 26.09, doubleArray1);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, final state vector has dimension 8
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2189.316340186673), (-2560.17), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(4231.77275, (-2189.316340186673), 4231.77275, 1587.04826);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-931.0), doubleArray0, 1216.707505, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2331.4715261638607, 2331.4715261638607, 2331.4715261638607, 2331.4715261638607);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 1254, 1254, 3179.04804);
      double double0 = graggBulirschStoerIntegrator0.filterStep((-818.6700748693), true);
      assertEquals((-2331.4715261638607), double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(2331.4715261638607, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1712.5147, 1177.764262282914, 1712.5147, 1712.5147);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1, 5, 1);
      try { 
        graggBulirschStoerIntegrator0.filterStep(1177.764262282914, false);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (1,712.515) reached, integration needs 1,177.764
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-12, 1.0E-12, 367.6715299737, (-2031.36410865));
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(0, 367.6715299737, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-489.99804693), doubleArray0, (-1793.56810096), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1189.51193861, 0.9, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 0.9, doubleArray0, 0.9, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(7.0, 7.0, (double[]) null, (double[]) null);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer((-0.4831900357003607), fixedStepHandler0);
      graggBulirschStoerIntegrator0.setStepHandler(stepNormalizer0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      double double0 = graggBulirschStoerIntegrator0.filterStep(304, false);
      assertEquals(7.0, double0, 0.01);
      
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, (-2518.4), (-1.0), 304);
      assertEquals(7.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.38466765651207, (-1681.3250338669), 2.38466765651207, 2.38466765651207);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2381, 2381, 2381);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 2.38466765651207, doubleArray0, 2.38466765651207, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2346.01), (-2346.01), (-2346.01), (-2346.01));
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 423, 27, 0.0018737681664791894);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[2];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 0.9999, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, initial state vector has dimension 2
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(744.78344111081, 6, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(0.0, true);
      assertEquals(6.0, double0, 0.01);
      
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      assertEquals(66.84834064256839, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1571.20432269701), 3093.5850312, (-1571.20432269701), 0.0);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.setInitialStepSize(579.03088479748);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 906, 2126302851, 0.8);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-25.69393346270375), doubleArray0, (-944), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1189.51193861, 0.9, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 9, 9, 1189.51193861);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1.0E-4, doubleArray0, (-3618.4081394), doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.38466765651207, (-1681.3250338669), 2.38466765651207, 2.38466765651207);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2381, 2381, 2381);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-697.2319770188449), doubleArray0, (-705.27846), doubleArray0);
      assertEquals(2.38466765651207, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1571.20432269701), 3093.5850312, (-1571.20432269701), 0.0);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 906, 2126302851, 0.8);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-25.69393346270375), doubleArray0, (-944), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-12, 1.0E-12, 367.6715299737, 1.0E-10);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2381, 8, 239.14846551933);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-697.2319770188449), doubleArray0, 0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2189.316340186673), (-2560.17), doubleArray0, doubleArray0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-2189.316340186673), (-2189.316340186673), (-2189.316340186673), 1.0001);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator1.addSwitchingFunction(switchingFunction0, 800.672, 800.672, (-2619));
      graggBulirschStoerIntegrator0.setOrderControl((-2619), (-2619), 1.0001);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator1.integrate(firstOrderConverter0, (-2471.626958000002), doubleArray0, 2459, doubleArray0);
  }
}
