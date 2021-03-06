/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:35:06 GMT 2019
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.BisectionSolver;
import org.apache.commons.math.analysis.BrentSolver;
import org.apache.commons.math.analysis.LaguerreSolver;
import org.apache.commons.math.analysis.MullerSolver;
import org.apache.commons.math.analysis.NewtonSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.RiddersSolver;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class UnivariateRealSolverImpl_ESTest extends UnivariateRealSolverImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 4.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        riddersSolver0.solve((-85.72224494640872), 1.0E-14);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-85.72224494640872,1.0E-14]  Values: [4.0,4.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = (-1591.250590701);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunction1);
      double double0 = riddersSolver0.solve((-1591.250590701), 4382.1791);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0E-14, riddersSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, riddersSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, riddersSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(3170.760111501, (-578.0173182283775), (-2261.167511211034));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [3170.760111501,-578.0173182283775]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      NewtonSolver newtonSolver0 = new NewtonSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        newtonSolver0.solve((-2201.59), (-2201.59), (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=-2201.59 initial=-1.0 upper=-2201.59
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      NewtonSolver newtonSolver0 = new NewtonSolver(polynomialFunction0);
      try { 
        newtonSolver0.solve((-2056.0), 1.0E-14);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.NewtonSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        mullerSolver0.verifySequence(1118.283, 1118.283, 1118.283);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=1118.283 initial=1118.283 upper=1118.283
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (-2207.8037793892645);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      boolean boolean0 = brentSolver0.isBracketing(1683.78056884, 1.0E-15, polynomialFunction0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01);
      assertFalse(boolean0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = 1401.78975;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      boolean boolean0 = brentSolver0.isBracketing((-4554.346), 1.0, polynomialFunction0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01);
      assertTrue(boolean0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.resultComputed = true;
      int int0 = mullerSolver0.getIterationCount();
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0, int0);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        mullerSolver0.getIterationCount();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No result available
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.setResult((-1.0), 164);
      double double0 = laguerreSolver0.getResult();
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals((-1.0), double0, 0.01);
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      NewtonSolver newtonSolver0 = new NewtonSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        newtonSolver0.getResult();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No result available
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BrentSolver brentSolver0 = null;
      try {
        brentSolver0 = new BrentSolver((UnivariateRealFunction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function can not be null.
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      double double0 = bisectionSolver0.getFunctionValueAccuracy();
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      double double0 = mullerSolver0.getRelativeAccuracy();
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.resetFunctionValueAccuracy();
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      bisectionSolver0.resetAbsoluteAccuracy();
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      brentSolver0.setFunctionValueAccuracy((-2924.884192509868));
      assertEquals((-2924.884192509868), brentSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      brentSolver0.setMaximalIterationCount(2241);
      assertEquals(2241, brentSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      int int0 = brentSolver0.getMaximalIterationCount();
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, int0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.getAbsoluteAccuracy();
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, double0, 0.01);
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      brentSolver0.setRelativeAccuracy((-880.7149063866));
      assertEquals((-880.7149063866), brentSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01);
      
      brentSolver0.setAbsoluteAccuracy(1.0E-14);
      assertEquals(1.0E-14, brentSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunction0);
      bisectionSolver0.resetRelativeAccuracy();
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunctionLagrangeForm0);
      riddersSolver0.resetMaximalIterationCount();
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, riddersSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, riddersSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, riddersSolver0.getRelativeAccuracy(), 0.01);
  }
}
