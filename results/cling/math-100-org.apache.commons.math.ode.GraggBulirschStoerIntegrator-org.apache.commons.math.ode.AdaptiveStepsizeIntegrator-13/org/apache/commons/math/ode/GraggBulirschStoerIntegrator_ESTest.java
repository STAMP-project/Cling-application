/*

 * Tue Mar 03 15:34:26 GMT 2020
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
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-4489.7095312), (-4489.7095312), (-4489.7095312), (-4489.7095312));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-604), 789, (-4489.7095312));
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-1898.9275305791832), doubleArray0, (-1898.9275305791832), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1089.867935886099), (-1089.867935886099), (-1089.867935886099), 711.71);
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-1089.867935886099), 1330.90026687, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 492.29156430266, doubleArray0, 527.8081592054236, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1089.867935886099), (-1089.867935886099), (-1089.867935886099), 711.71);
      graggBulirschStoerIntegrator0.setInitialStepSize((-1322.014699130462));
      assertEquals(1089.867935886099, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-1089.867935886099), 1330.90026687, doubleArray0, doubleArray0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.9999, 0.9999, 0.9999, 0.9999);
      graggBulirschStoerIntegrator0.setOrderControl(2145335949, 0.9999, 125.0);
      assertEquals(0.9999, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1089.867935886099), (-1089.867935886099), (-1089.867935886099), 711.71);
      graggBulirschStoerIntegrator0.scalRelativeTolerance = (-1089.867935886099);
      graggBulirschStoerIntegrator0.setStepsizeControl((-1322.014699130462), 0.94, 7.733432668472264, (-1089.867935886099));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 2737.7314711794, doubleArray0, 4882.989, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1089.867935886099), (-1089.867935886099), 0.0, 711.71);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.setOrderControl(1848, 0.0, 999.9);
      double[] doubleArray0 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 0.0, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1202.61810134032, 1202.61810134032, 1202.61810134032, (-2546.3471));
      double[] doubleArray0 = new double[0];
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      graggBulirschStoerIntegrator0.setStepHandler(continuousOutputModel0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1236.8, doubleArray0, (-1439.6626386215773), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2015.8284125946;
      doubleArray0[1] = 2015.8284125946;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2015.8284125946, 11.99229113618279, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(755, 1994.0554475, 755);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2, 2).when(firstOrderDifferentialEquations0).getDimension();
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2015.8284125946, doubleArray0, 1.8915178993145003, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (2,015.828) reached, integration needs 22.271
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2546.3471), 0.9999, 0.9999, (-2546.3471));
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2145335949, 756).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 756, 14, 176.8);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 0.5, doubleArray0, 2, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 756, initial state vector has dimension 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2546.3471), 0.9999, 0.9999, (-2546.3471));
      graggBulirschStoerIntegrator0.setInitialStepSize(701.18041598109);
      graggBulirschStoerIntegrator0.setStepsizeControl(701.18041598109, (-1756.4430079234), (-4123.778756749), 2239.0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1089.867935886099), (-1089.867935886099), (-1089.867935886099), 711.71);
      graggBulirschStoerIntegrator0.scalRelativeTolerance = (-1089.867935886099);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-765.9943575442), doubleArray0, 4882.989, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1089.867935886099), (-1089.867935886099), (-1089.867935886099), 711.71);
      graggBulirschStoerIntegrator0.setInitialStepSize((-1322.014699130462));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 0, 2755, 4065.0);
      assertEquals(1089.867935886099, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2015.8284125946, 11.99229113618279, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2, 2, 1).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray1 = new double[3];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 10.0, doubleArray0, 2, doubleArray1);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 1, final state vector has dimension 3
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2145335949, 756).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.9999, 0.9999, doubleArray0, doubleArray0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-2546.3471), doubleArray0, 1334.708112, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 756, initial state vector has dimension 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-4489.7095312), (-4489.7095312), (-4489.7095312), 262.14624);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(262.14624, fixedStepHandler0);
      graggBulirschStoerIntegrator0.setStepHandler(stepNormalizer0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[4];
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 7);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-765.9943575442), doubleArray0, 0.01, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1089.867935886099), (-1089.867935886099), (-1089.867935886099), 711.71);
      graggBulirschStoerIntegrator0.setInitialStepSize((-1322.014699130462));
      graggBulirschStoerIntegrator0.setStepsizeControl(2023.25, 10.0, 4882.989, 0);
      assertEquals(1089.867935886099, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2015.8284125946, 11.99229113618279, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2, 2).when(firstOrderDifferentialEquations0).getDimension();
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(2, 2015.8284125946, 2, 0.0);
      graggBulirschStoerIntegrator0.setStepsizeControl(2015.8284125946, 2015.8284125946, 320.27672611786215, 877.2117221178621);
      graggBulirschStoerIntegrator1.integrate(firstOrderDifferentialEquations0, 2, graggBulirschStoerIntegrator0.vecAbsoluteTolerance, (-2546.3471), graggBulirschStoerIntegrator0.vecAbsoluteTolerance);
      assertEquals((-1802.5190634589342), graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2015.8284125946;
      doubleArray0[1] = 2015.8284125946;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2015.8284125946, 11.99229113618279, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2, 2).when(firstOrderDifferentialEquations0).getDimension();
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-31.139403219565178), 2015.8284125946, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1797, 1, 143.6994245475139);
      graggBulirschStoerIntegrator1.integrate(firstOrderDifferentialEquations0, 2015.8284125946, graggBulirschStoerIntegrator0.vecAbsoluteTolerance, 0.9, doubleArray0);
      assertEquals(0.9, graggBulirschStoerIntegrator1.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1089.867935886099), (-1089.867935886099), (-1089.867935886099), 711.71);
      graggBulirschStoerIntegrator0.setInitialStepSize((-1322.014699130462));
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 1481, 1481, (-1322.014699130462));
      assertEquals(1089.867935886099, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2015.8284125946;
      doubleArray0[1] = 2015.8284125946;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2015.8284125946, 11.99229113618279, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2, 2).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.setStepsizeControl(1868.1774331680149, 2015.8284125946, 1.0, 1251.3787406012);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-1273.96597549625), doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (2,015.828) reached, integration needs 22.271
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.9999, 0.9999, 0.9999, (-2546.3471));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 756, 2, 0.9);
      double double0 = graggBulirschStoerIntegrator0.filterStep(0.1, true);
      assertEquals(0.9999, double0, 0.01);
      assertEquals(0.9999, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(14.139659588459136, 1279.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 0, 0, 0.9);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-1325.705389311), doubleArray0, (-2.4121062256053727), doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2546.3471), 0.9999, 0.9999, (-2546.3471));
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2145335949, 756).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.setStepsizeControl(701.18041598109, (-1756.4430079234), (-4123.778756749), 2239.0);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 0.5, doubleArray0, 2, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 756, initial state vector has dimension 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2546.3471), 0.9999, 0.9999, (-2546.3471));
      graggBulirschStoerIntegrator0.setInitialStepSize(701.18041598109);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 756, 14, 176.8);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.9999, 0.9999, 0.9999, 0.9999);
      graggBulirschStoerIntegrator0.setInitialStepSize(0.9999);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2145335949, 2145335949, 545.4554051590053);
      assertEquals(0.9999, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2546.3471), 0.9999, 0.9999, (-2546.3471));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 756, 2, 0.9);
      graggBulirschStoerIntegrator0.setInitialStepSize(701.18041598109);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.9999, 0.9999, 0.9999, (-2546.3471));
      graggBulirschStoerIntegrator0.setInitialStepSize(0.9999);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 756, 756, 0.9);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.9999, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[9];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray1);
      graggBulirschStoerIntegrator0.setStepsizeControl(1755.7414, 0.0, 0.0, 1230.6511766845);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(100.0, 0.0, 7, (-3815.924316875149));
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      // Undeclared exception!
      graggBulirschStoerIntegrator1.integrate(firstOrderDifferentialEquations0, 1230.6511766845, doubleArray0, 0.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1089.867935886099), (-1089.867935886099), (-1089.867935886099), 711.71);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 1481, 1481, (-1322.014699130462));
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-312.57945396), doubleArray0, 0.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.9999, 0.9999, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize(701.18041598109);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.9999, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.9999, 0.9999, 0.9999, (-2546.3471));
      graggBulirschStoerIntegrator0.setInitialStepSize(0.9999);
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(756, (-1155.164995390834), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-2546.3471), doubleArray0, (-1402.4473898460992), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.9999, (-1249.620023), (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.9999, (-1249.620023), 0.9999, (-817.0));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2015.8284125946;
      doubleArray0[1] = 2015.8284125946;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2015.8284125946, 11.99229113618279, doubleArray0, doubleArray0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(11.99229113618279, 1994.0554475, (-1532.373488261984)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 1757.4746589634108, 0.8, (-55));
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2, 2).when(firstOrderDifferentialEquations0).getDimension();
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2015.8284125946, doubleArray0, 1.8915178993145003, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (2,015.828) reached, integration needs 25.317
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2015.8284125946, 11.99229113618279, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2, 2).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.setStepsizeControl(1868.1774331680149, 2015.8284125946, 1.0, 1251.3787406012);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-1273.96597549625), doubleArray0, 0.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.9999, 0.9999, 0.9999, (-2546.3471));
      graggBulirschStoerIntegrator0.setOrderControl(2145335949, (-619.2), 0.9);
      assertEquals(0.9999, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-4.436036387594894), (-4.436036387594894), doubleArray0, doubleArray0);
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(firstOrderDifferentialEquations0).getDimension();
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 467.806, doubleArray0, 467.806, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.9999, 0.9999, 0.9999, (-2546.3471));
      graggBulirschStoerIntegrator0.setInitialStepSize(0.9999);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.setStepsizeControl(1.3333333333333333, 2, (-2546.3471), 1.3333333333333333);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-2546.3471), doubleArray0, (-1402.4473898460992), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1222.8494706), 0.0, 0.0, (-1222.8494706));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 138, 7, 328.985142318);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(7, (-1), 0).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[7];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 1.7976931348623157E308, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, final state vector has dimension 7
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1222.8494706), 0.0, 0.0, (-1222.8494706));
      graggBulirschStoerIntegrator0.setStepsizeControl(1500.4856967370824, 3878.7074390481635, 0.0, (-834.86185036));
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(7, (-1), 0).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[7];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 1.7976931348623157E308, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, final state vector has dimension 7
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1089.867935886099), (-1089.867935886099), (-1089.867935886099), 711.71);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.setStepsizeControl(2023.25, 10.0, 4882.989, 0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-312.57945396), doubleArray0, 0.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 139.233749, 0.0, 5155.893386604351);
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, true).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 5155.893386604351;
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-1389), doubleArray0, 1643.3788568426214, doubleArray0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 5155.893386604351, 50.40831129000003, (-2388));
      graggBulirschStoerIntegrator0.addSwitchingFunction((SwitchingFunction) null, 5155.893386604351, 139.233749, 6);
      assertEquals(69.99838972475936, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-4489.7095312), (-4489.7095312), (-4489.7095312), (-4489.7095312));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2, (-1900), 1045.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-1898.9275305791832), doubleArray0, (-1898.9275305791832), doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.001, 0.0);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 0, 0, 0.9);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-1325.705389311), doubleArray0, (-2.4121062256053727), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.9999, 0.9999, 0.9999, (-2546.3471));
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2145335949, 756).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 756, 2, 0.9);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, (-2546.3471), doubleArray0, 1334.708112, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: ODE problem has dimension 756, initial state vector has dimension 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2, 2).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray1 = new double[7];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-189.17813819516758), 2, doubleArray0, doubleArray1);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2, doubleArray0, 1.0001, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // dimensions mismatch: state vector has dimension 2, relative tolerance vector has dimension 7
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-4489.7095312), (-4489.7095312), (-4489.7095312), (-4489.7095312));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2, (-1900), 1045.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-1900), doubleArray0, 0.9500461658082173, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 139.233749, 0.0, 5155.893386604351);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[1];
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-1389), 18, 5155.893386604351);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 139.233749, 3736.23535785, (-2670));
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 5155.893386604351, doubleArray0, 1469.68, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2015.8284125946;
      doubleArray0[1] = 2015.8284125946;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2015.8284125946, 11.99229113618279, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2, 2).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1797, 1, 143.6994245475139);
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2015.8284125946, graggBulirschStoerIntegrator0.vecAbsoluteTolerance, 0.9, doubleArray0);
        fail("Expecting exception: IntegratorException");
      
      } catch(IntegratorException e) {
         //
         // minimal step size (2,015.828) reached, integration needs 22.271
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 139.233749, 0.0, 5155.893386604351);
      StepHandler stepHandler0 = mock(StepHandler.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(stepHandler0).requiresDenseOutput();
      graggBulirschStoerIntegrator0.setStepHandler(stepHandler0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1).when(firstOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[1];
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2772.406089122), (-2772.406089122), (-2772.406089122), (double)1, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 139.233749, 3736.23535785, (-2670));
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 5155.893386604351, doubleArray0, 1469.68, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [NaN,NaN]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2015.8284125946, 11.99229113618279, doubleArray0, doubleArray0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(11.99229113618279, 1994.0554475, (-1532.373488261984), 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.setOrderControl(755, 1994.0554475, 755);
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 1757.4746589634108, 0.8, (-55));
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2, 2).when(firstOrderDifferentialEquations0).getDimension();
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2015.8284125946, doubleArray0, 1.8915178993145003, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [NaN,NaN]  Values: [0.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2015.8284125946, 11.99229113618279, doubleArray0, doubleArray0);
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2, 2).when(firstOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1797, 1, 143.6994245475139);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderDifferentialEquations0, 2015.8284125946, graggBulirschStoerIntegrator0.vecAbsoluteTolerance, 0.9, doubleArray0);
  }
}
