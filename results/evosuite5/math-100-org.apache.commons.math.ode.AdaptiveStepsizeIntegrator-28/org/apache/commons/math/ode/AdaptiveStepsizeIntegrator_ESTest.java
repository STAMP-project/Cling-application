/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 10:36:55 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.ContinuousOutputModel;
import org.apache.commons.math.ode.DormandPrince54Integrator;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.HighamHall54Integrator;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.SwitchingFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AdaptiveStepsizeIntegrator_ESTest extends AdaptiveStepsizeIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.001, (-273.684674965742), doubleArray0, doubleArray0);
      assertEquals(0, doubleArray0.length);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertNotNull(highamHall54Integrator0);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.001, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals((-273.684674965742), highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      
      double double0 = highamHall54Integrator0.filterStep((-1.0), true);
      assertEquals(0, doubleArray0.length);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertEquals((-273.684674965742), double0, 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.001, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals((-273.684674965742), highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(2724.26, 0.0, 1326.9432154270703, 2305.819988654);
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(2724.26, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      
      double double0 = dormandPrince54Integrator0.filterStep((-1166.1711233), true);
      assertEquals(-0.0, double0, 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(2724.26, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(842.32284468677, 1034.7953, 0.0, 842.32284468677);
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(842.32284468677, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(1034.7953, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(933.6121897043224, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      
      try { 
        dormandPrince54Integrator0.filterStep(0.01, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (842.323) reached, integration needs 0.01
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(842.32284468677, 1034.7953, 0.0, 842.32284468677);
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(842.32284468677, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(1034.7953, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(933.6121897043224, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      
      double double0 = dormandPrince54Integrator0.filterStep(0.01, true);
      assertEquals(842.32284468677, double0, 0.01);
      assertEquals(842.32284468677, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(1034.7953, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(933.6121897043224, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(175.450258, 0.0, 112847.0, (-1658.6));
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(175.450258, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(0, firstOrderConverter0.getDimension());
      
      double[] doubleArray0 = new double[0];
      double double0 = dormandPrince54Integrator0.initializeStep(firstOrderConverter0, false, 5133, doubleArray0, 5133, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(0, doubleArray0.length);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertEquals(-0.0, double0, 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(175.450258, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(0, firstOrderConverter0.getDimension());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(0, firstOrderConverter0.getDimension());
      
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-242.7), 963.5925, doubleArray0, doubleArray0);
      assertEquals(1, doubleArray0.length);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertNotNull(dormandPrince54Integrator0);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals((-242.7), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(963.5925, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      
      double double0 = dormandPrince54Integrator0.initializeStep(firstOrderConverter0, false, 361, doubleArray0, 1.0E-12, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(1, doubleArray0.length);
      assertArrayEquals(new double[] {Double.NaN}, doubleArray0, 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals((-242.7), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(963.5925, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1710.31234605478), (-9.778006595772556), (-433.904704462), (-3371.596808524104));
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(129.31916099540265, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals((-9.778006595772556), dormandPrince54Integrator0.getMaxStep(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3030).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(6060, firstOrderConverter0.getDimension());
      
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.initializeStep(firstOrderConverter0, true, 3030, doubleArray0, (-433.904704462), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.FirstOrderConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1710.31234605478), 0.001, 0.001, (-433.904704462));
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(0.001, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      
      dormandPrince54Integrator0.setInitialStepSize(0.001);
      assertEquals(0.001, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(0, firstOrderConverter0.getDimension());
      
      double double0 = dormandPrince54Integrator0.initializeStep(firstOrderConverter0, false, (-28), (double[]) null, (-1166.1711233), (double[]) null, (double[]) null, (double[]) null, (double[]) null);
      assertEquals((-0.001), double0, 0.01);
      assertEquals(0.001, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0, firstOrderConverter0.getDimension());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-12, 2522.19, 1326.9432154270703, 1.0E-12);
      assertNotNull(graggBulirschStoerIntegrator0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(2522.19, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
      assertEquals(1.0E-12, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
      assertEquals(5.022140977710602E-5, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(0, firstOrderConverter0.getDimension());
      
      double[] doubleArray0 = new double[0];
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1326.9432154270703, doubleArray0, 1326.9432154270703, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[5];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2522.19, 2522.19, (-242.7), 273.684674965742);
      assertNotNull(graggBulirschStoerIntegrator0);
      assertEquals(2522.19, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
      assertEquals(2522.19, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
      assertEquals(2522.19, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(0, firstOrderConverter0.getDimension());
      
      try { 
        graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, (-1.0), doubleArray0, 100.0, doubleArray1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, final state vector has dimension 5
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1710.31234605478), (-9.778006595772556), (-433.904704462), (-3371.596808524104));
      assertNotNull(dormandPrince54Integrator0);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals((-9.778006595772556), dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(129.31916099540265, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3030).when(secondOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[6];
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(6060, firstOrderConverter0.getDimension());
      
      try { 
        dormandPrince54Integrator0.sanityChecks(firstOrderConverter0, (-1710.31234605478), doubleArray0, (-28), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 6,060, initial state vector has dimension 6
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1710.31234605478), 0.0, (-433.904704462), (-3371.596808524104));
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(-0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      
      dormandPrince54Integrator0.setInitialStepSize(336.9924);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(-0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1710.31234605478), 0.001, 0.001, (-433.904704462));
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.001, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      
      dormandPrince54Integrator0.setInitialStepSize(0.001);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.001, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3076).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(6152, firstOrderConverter0.getDimension());
      
      double double0 = dormandPrince54Integrator0.initializeStep(firstOrderConverter0, true, (-28), (double[]) null, (-433.904704462), (double[]) null, (double[]) null, (double[]) null, (double[]) null);
      assertEquals(0.001, double0, 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.001, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(6152, firstOrderConverter0.getDimension());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1710.31234605478), (-1710.31234605478), (-433.904704462), (-3392.410504168528));
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(1710.31234605478, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      
      dormandPrince54Integrator0.setInitialStepSize((-3392.410504168528));
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(1710.31234605478, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1710.31234605478), 0.0, (-433.904704462), (-3371.596808524104));
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(-0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      
      double double0 = dormandPrince54Integrator0.getCurrentSignedStepsize();
      assertEquals(-0.0, double0, 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(-0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-1710.31234605478), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1700.452671198, 1700.452671198, 1700.452671198, 1700.452671198);
      assertNotNull(graggBulirschStoerIntegrator0);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
      assertEquals(1700.452671198, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
      assertEquals(1700.452671198, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(1700.452671198, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      
      double double0 = graggBulirschStoerIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
      assertEquals(1700.452671198, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
      assertEquals(1700.452671198, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(1700.452671198, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.3269E-9, (-1331.666580359587), -0.0, 815.9957015474);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(firstOrderConverter0, 1.0E-12, doubleArray0, 815.9957015474, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-201.4939634), 0.0, 1.0E-6, (-201.4939634));
      highamHall54Integrator0.getStepHandler();
      assertEquals(-0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(815.9957015474, 3371.596808524104, 3371.596808524104, (-43.48988418106996));
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      dormandPrince54Integrator0.addSwitchingFunction(switchingFunction0, 815.9957015474, (-1905.0), 844);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(1658.6767325511626, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-12, 2522.19, 1326.9432154270703, 1.0E-12);
      ContinuousOutputModel continuousOutputModel0 = new ContinuousOutputModel();
      graggBulirschStoerIntegrator0.setStepHandler(continuousOutputModel0);
      assertEquals(5.022140977710602E-5, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }
}
