/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:00:01 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.ClassicalRungeKuttaStepInterpolator;
import org.apache.commons.math.ode.ContinuousOutputModel;
import org.apache.commons.math.ode.DormandPrince853StepInterpolator;
import org.apache.commons.math.ode.DummyStepHandler;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.FixedStepHandler;
import org.apache.commons.math.ode.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.StepHandler;
import org.apache.commons.math.ode.StepInterpolator;
import org.apache.commons.math.ode.StepNormalizer;
import org.apache.commons.math.ode.SwitchingFunction;
import org.apache.commons.math.ode.SwitchingFunctionsHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GraggBulirschStoerIntegrator_ESTest extends GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 5298.804156361311, 684, 684);
      graggBulirschStoerIntegrator0.scalRelativeTolerance = (double) 3348;
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 3348, 684, 3348);
      graggBulirschStoerIntegrator0.setOrderControl(684, 684, 10.0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 165.20045171727028;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 165.20045171727028;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(165.20045171727028, 165.20045171727028, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize(165.20045171727028);
      graggBulirschStoerIntegrator0.stepSize = 14.34375;
      graggBulirschStoerIntegrator0.addSwitchingFunction((SwitchingFunction) null, 165.20045171727028, 165.20045171727028, (-940));
      graggBulirschStoerIntegrator0.setInterpolationControl(true, (-940));
      DummyStepHandler dummyStepHandler0 = (DummyStepHandler)graggBulirschStoerIntegrator0.handler;
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 458.63213130294;
      doubleArray0[1] = 458.63213130294;
      doubleArray0[2] = 458.63213130294;
      doubleArray0[3] = 0.9;
      doubleArray0[4] = 0.9;
      doubleArray0[5] = 0.9;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(458.63213130294, 0.9, doubleArray0, doubleArray0);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      graggBulirschStoerIntegrator0.handler = (StepHandler) continuousOutputModel0;
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      StepInterpolator stepInterpolator0 = dormandPrince853StepInterpolator0.doCopy();
      continuousOutputModel0.handleStep(stepInterpolator0, true);
      ContinuousOutputModel continuousOutputModel1 = new ContinuousOutputModel();
      continuousOutputModel0.append(continuousOutputModel1);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 7, 779, 0.9);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 1329);
      graggBulirschStoerIntegrator0.addSwitchingFunction((SwitchingFunction) null, 1329, 1329, 7);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1484.572682014, 1484.572682014, 0.0, 494.5718113338558);
      graggBulirschStoerIntegrator0.getName();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-915.916), (-915.916), (-915.916), (-915.916));
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.setInterpolationControl(false, (-3257));
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.0, 0.0, (-915.916), 817.94938539852);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 690.9226485, (-0.08333333333333333), (-203));
      graggBulirschStoerIntegrator0.setStepsizeControl(0.0, (-203), 690.9226485, 0.94);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.6, 0.8, (-977.299), 0.0);
      graggBulirschStoerIntegrator0.setOrderControl(0, 0.0, 0.8);
      graggBulirschStoerIntegrator0.setOrderControl(0, (-0.4831900357003607), 0.6);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 0, (-1323), 14.1804);
      graggBulirschStoerIntegrator0.setOrderControl((-1323), 0.0, 1.0E-4);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1974.6, doubleArray0, 0.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2561.839984075495, 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize(0.0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 2561.839984075495, 0.0, (-3322));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 232.35534, (-2704.68729688));
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.scalRelativeTolerance = 0.0;
      graggBulirschStoerIntegrator0.setOrderControl((-192), (-192), 0.9999);
      graggBulirschStoerIntegrator0.setOrderControl((-192), 2318.0, 0.0);
      StepNormalizer stepNormalizer0 = new StepNormalizer(0.0, fixedStepHandler0);
      graggBulirschStoerIntegrator0.setStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.setOrderControl((-4081), (-1159.0), 1078.37);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 2318.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 1078.37;
      graggBulirschStoerIntegrator0.vecAbsoluteTolerance = doubleArray0;
      ClassicalRungeKuttaStepInterpolator classicalRungeKuttaStepInterpolator0 = new ClassicalRungeKuttaStepInterpolator();
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = classicalRungeKuttaStepInterpolator0.equations;
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 0.0;
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) null, 0.9999, doubleArray1, (-31.139403219565178), doubleArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.1, (-751.91933429), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.getName();
      graggBulirschStoerIntegrator0.setInitialStepSize((-1327.619));
      graggBulirschStoerIntegrator0.setOrderControl(926, 0.0, (-2366.77088584));
      graggBulirschStoerIntegrator0.setStepsizeControl(0.0, 577.432, 0.9, 1.0E-4);
      graggBulirschStoerIntegrator0.setOrderControl(4, 4, 4.026);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-1417), 4, 0.0);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, (-3334.67763433), 0.0);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.vecAbsoluteTolerance = null;
      graggBulirschStoerIntegrator0.setStepsizeControl(0.0, 4.0, 5298.804156361311, 5298.804156361311);
      graggBulirschStoerIntegrator0.addSwitchingFunction((SwitchingFunction) null, 0.0, (-1190), (-1190));
      graggBulirschStoerIntegrator0.setStepsizeControl(163.57691, 5298.804156361311, (-1.0), 4.0);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2084.0, 4803.01191331, 0.0, 1197.723161180614);
      graggBulirschStoerIntegrator0.setOrderControl((-316), (-316), 5298.804156361311);
      graggBulirschStoerIntegrator0.setStepsizeControl((-2.778205752353508), 2084.0, 1197.723161180614, (-2941.0));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2561.839984075495, 0.0, doubleArray0, doubleArray0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(0.0, (-2.778205752353508), 2561.839984075495, 0.0);
      assertEquals(-0.0, graggBulirschStoerIntegrator1.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.9999, 0.9999, 0.9999, 668.09459881164);
      graggBulirschStoerIntegrator0.setOrderControl(684, (-4.422011983080043), (-231.2));
      assertEquals(0.9999, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = null;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, (double[]) null, (double[]) null);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(578.97087, 0.0, (-43.53345659001114), (-1.0));
      graggBulirschStoerIntegrator1.setStepsizeControl(16.0, 0.8, (-43.53345659001114), 16.0);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, (-2276));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 16.0, (double[]) null, (-1542.85), (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = 2561.839984075495;
      double double1 = 0.0;
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2561.839984075495, 0.0, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.setInitialStepSize(2561.839984075495);
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 2561.839984075495, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.13095238095238096, 0.13095238095238096, (double[]) null, (double[]) null);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(1.0E-15, 0.13095238095238096, (double[]) null, (double[]) null);
      SwitchingFunctionsHandler switchingFunctionsHandler0 = graggBulirschStoerIntegrator1.switchesHandler;
      graggBulirschStoerIntegrator0.switchesHandler = switchingFunctionsHandler0;
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 0.13095238095238096, 225.6630335, 136);
      graggBulirschStoerIntegrator0.vecRelativeTolerance = null;
      graggBulirschStoerIntegrator0.stepSize = (double) 136;
      graggBulirschStoerIntegrator0.setOrderControl(856, 1115.0, (-1122.7));
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 856, 0, 0.13095238095238096);
      assertEquals(0.13095238095238096, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2561.839984075495, 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl((-1917.1132957287111), (-1917.1132957287111), (-1917.1132957287111), 2561.839984075495);
      graggBulirschStoerIntegrator0.setOrderControl(1619, 2143935497, 2143935497);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 2143935497);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.handler = (StepHandler) dummyStepHandler0;
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 8);
      graggBulirschStoerIntegrator0.setStepsizeControl(8, 4.0, 0.0, (-1917.1132957287111));
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-4.422011983080043), 1566.8057353436952, (-521.6075069998936), (-1625.954651240371));
      graggBulirschStoerIntegrator0.setOrderControl(0, 0.0, (-2387.1713));
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      continuousOutputModel0.reset();
      graggBulirschStoerIntegrator0.setStepHandler(continuousOutputModel0);
      graggBulirschStoerIntegrator0.setStepsizeControl(1566.8057353436952, 0, (-1625.954651240371), 0.0);
      graggBulirschStoerIntegrator0.getName();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 0;
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-2041.47), doubleArray0, (-3259.7), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, initial state vector has dimension 1
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-0.20136540080403034);
      doubleArray0[1] = 0.5667149535193777;
      doubleArray0[2] = 0.5667149535193777;
      doubleArray0[3] = 0.5667149535193777;
      doubleArray0[4] = (-0.20136540080403034);
      doubleArray0[5] = (-0.20136540080403034);
      doubleArray0[6] = 0.5667149535193777;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-0.20136540080403034), 0.5667149535193777, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.5667149535193777, 739.2, 0.0, 434.2906067293842);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = (-915.916);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-915.916), (-915.916), (-915.916), (-915.916));
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(0.0, 1.0E15, doubleArray0, doubleArray0);
      double double1 = (-1465.67579123522);
      graggBulirschStoerIntegrator1.setInitialStepSize((-1465.67579123522));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1243.8893967870522, doubleArray0, 1.0E15, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.vecAbsoluteTolerance = null;
      graggBulirschStoerIntegrator0.getName();
      int int0 = 6;
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 6);
      ClassicalRungeKuttaStepInterpolator classicalRungeKuttaStepInterpolator0 = new ClassicalRungeKuttaStepInterpolator();
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = classicalRungeKuttaStepInterpolator0.equations;
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) null, 23.96073981647117, (double[]) null, 396.0, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(8.0, 16.0, (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.setOrderControl(684, 14.34375, 16.0);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 4.450312892752409;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4.450312892752409, 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 39, 39, 0.0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.0;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.handler = (StepHandler) dummyStepHandler0;
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 1430.17076, 999.9, 0);
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction1, 60.57862012278, (-1153.26), 2664);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.0, 0.9, 2847.6469667589, 0.0);
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      graggBulirschStoerIntegrator0.setStepsizeControl(60.57862012278, 2847.6469667589, 0.9, (-1595.3552248));
      graggBulirschStoerIntegrator0.getName();
      graggBulirschStoerIntegrator0.setOrderControl((-2856), 0.0, 0.6);
      graggBulirschStoerIntegrator0.setOrderControl((-2856), 0.6, 0.0);
      graggBulirschStoerIntegrator0.setStepsizeControl(0.9999, 0, 1.0E-15, 0.6);
      graggBulirschStoerIntegrator0.getName();
      SwitchingFunction switchingFunction2 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction2, 0.6, 2664, 2664);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2, 2, 0.0);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 736.16492);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.setStepHandler(dummyStepHandler0);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.addSwitchingFunction(switchingFunction0, 512.9634970202, 0.0, 71);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, (double[]) null, (double[]) null);
      graggBulirschStoerIntegrator0.vecAbsoluteTolerance = null;
      graggBulirschStoerIntegrator0.setOrderControl(684, 14.34375, 0.0);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }
}
