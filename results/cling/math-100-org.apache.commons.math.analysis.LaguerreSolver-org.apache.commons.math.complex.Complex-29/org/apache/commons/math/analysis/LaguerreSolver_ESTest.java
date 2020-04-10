/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 11:36:49 GMT 2019
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.LaguerreSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.complex.Complex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LaguerreSolver_ESTest extends LaguerreSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex1.tan();
      Complex complex3 = complex0.tanh();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[8];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex2;
      complexArray0[6] = complex3;
      complexArray0[7] = complex0;
      // Undeclared exception!
      laguerreSolver0.solveAll(complexArray0, complex3);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.log();
      Complex complex2 = complex0.tanh();
      assertEquals(0.761594155955765, complex2.abs(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.761594155955765, complex2.getReal(), 0.01);
      
      Complex complex3 = complex1.divide(complex1);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.sin();
      assertEquals(1.1752011936438014, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(1.1752011936438014, complex2.abs(), 0.01);
      
      Complex complex3 = complex1.acos();
      assertTrue(complex3.isNaN());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex0.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertNotSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.multiply(complex0);
      assertFalse(complex1.isInfinite());
      
      Complex complex3 = complex0.asin();
      assertSame(complex0, complex2);
      assertTrue(complex3.isNaN());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.tanh();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      boolean boolean0 = laguerreSolver0.isRootOK((-5512.466769), 2760.0, complex1);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals(Double.NaN, complex1.abs(), 0.01);
      assertFalse(boolean0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(0.761594155955765, complex1.abs(), 0.01);
      assertEquals(0.761594155955765, complex1.getReal(), 0.01);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[8];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex1;
      complexArray0[6] = complex1;
      complexArray0[7] = complex0;
      Complex[] complexArray1 = laguerreSolver0.solveAll(complexArray0, complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertEquals(7, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.tanh();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solveAll(doubleArray0, (-5512.466769));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Polynomial degree must be positive: degree=0
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      boolean boolean0 = laguerreSolver0.isRootOK(Double.POSITIVE_INFINITY, 1014.645095, complex0);
      assertFalse(boolean0);
      assertTrue(complex0.isNaN());
      assertEquals(Double.NaN, complex0.abs(), 0.01);
      
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 0.0);
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 2626.2657;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve((-3899.03382), 3255.78931662);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve(Double.NaN, 0.0);
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      try { 
        laguerreSolver0.solveAll(complexArray0, complex0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      laguerreSolver0.isRootOK(Double.POSITIVE_INFINITY, 1014.645095, complex0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, Double.POSITIVE_INFINITY);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.pow(complex0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-2515.68);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(2626.2657, (-2515.68));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2626.2657,-2515.68]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ZERO;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      boolean boolean0 = laguerreSolver0.isRootOK((-215.1159), (-1469.36), complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(boolean0);
      
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, Double.NEGATIVE_INFINITY);
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tanh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ONE;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[3];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      laguerreSolver0.solve(complexArray0, complex0);
      Complex[] complexArray1 = laguerreSolver0.solveAll(doubleArray0, 0.5);
      assertNotSame(complexArray1, complexArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex[] complexArray0 = new Complex[12];
      Complex complex0 = Complex.INF;
      complexArray0[6] = complex0;
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complexArray0[6].divide(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex1.asin();
      assertEquals(1.5707963267948966, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      
      Complex complex3 = complex0.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
      
      Complex complex2 = Complex.ONE;
      Complex complex3 = complex2.log();
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[6];
      complexArray0[0] = complex0;
      Complex complex2 = Complex.ZERO;
      complexArray0[1] = complex2;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex1;
      complexArray0[5] = complex1;
      try { 
        laguerreSolver0.solve(complexArray0, complex2);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      assertEquals(Double.NaN, complex1.abs(), 0.01);
      
      Complex complex2 = complex0.conjugate();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[3];
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      complexArray0[0] = complex0;
      complexArray0[1] = complex1;
      Complex complex2 = complex1.atan();
      assertFalse(complex2.equals((Object)complex0));
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
      assertEquals(1.0, complex1.abs(), 0.01);
      
      complexArray0[2] = complex1;
      Complex[] complexArray1 = laguerreSolver0.solveAll(complexArray0, complex0);
      assertEquals(2, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve(0.0, 0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.log();
      Complex complex2 = Complex.INF;
      complex0.add(complex2);
      Complex complex3 = complex2.tan();
      Complex complex4 = Complex.ZERO;
      Complex complex5 = complex4.asin();
      complex4.divide(complex5);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[8];
      complexArray0[0] = complex4;
      complexArray0[1] = complex0;
      complexArray0[2] = complex4;
      complexArray0[3] = complex1;
      complexArray0[4] = complex0;
      complexArray0[5] = complexArray0[0];
      complexArray0[6] = complex3;
      complexArray0[7] = complex4;
      try { 
        laguerreSolver0.solveAll(complexArray0, complex4);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cos();
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.abs(), 0.01);
      
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve(0.0, 0.0, 1.1102230246251565E-16);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex[] complexArray0 = new Complex[3];
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray0, complex1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.cos();
      double[] doubleArray0 = new double[4];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      LaguerreSolver laguerreSolver0 = null;
      try {
        laguerreSolver0 = new LaguerreSolver(polynomialFunctionLagrangeForm0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function is not polynomial.
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 2626.2657;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cos();
      assertEquals(1.0, complex1.abs(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve((-261.64191536812), 0.0, 1.1102230246251565E-16);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.cos();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-858.1898301);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(1864.76, (-1.0), 2541.872352);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1864.76,-1.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 2626.2657;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ZERO;
      complex0.cos();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(1.0, (-1.5), (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1.0,-1.5]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ZERO;
      complex0.cos();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, Double.NEGATIVE_INFINITY);
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ZERO;
      complex0.cos();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 0.0);
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 2626.2657;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, 0.0);
      double double0 = laguerreSolver0.solve((-261.64191536812), 0.0, 1.1102230246251565E-16);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 2626.2657;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(univariateRealFunction0);
      laguerreSolver0.solveAll(doubleArray0, 2626.2657);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(2626.2657, 0.0, 4187.5725138575);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2626.2657,0.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.acos();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.abs(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.asin();
      double[] doubleArray0 = new double[6];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      LaguerreSolver laguerreSolver0 = null;
      try {
        laguerreSolver0 = new LaguerreSolver(polynomialFunctionLagrangeForm0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function is not polynomial.
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.asin();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((-3301.2909489), (-1.0239898784605974E7), (-4.9E-324));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-3301.2909489,-1.0239898784605974E7]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve(1115.0, 1.0, 0.0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, Double.POSITIVE_INFINITY);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, 0.0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, Double.POSITIVE_INFINITY);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      complex1.subtract(complex0);
      double[] doubleArray0 = new double[4];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      LaguerreSolver laguerreSolver0 = null;
      try {
        laguerreSolver0 = new LaguerreSolver(polynomialFunctionLagrangeForm0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function is not polynomial.
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve(0.0, 0.0, 1.1102230246251565E-16);
      assertEquals(0.0, double0, 0.01);
      
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, Double.NEGATIVE_INFINITY);
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 2626.2657;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve((-261.64191536812), 0.0, 1.1102230246251565E-16);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, Double.NEGATIVE_INFINITY);
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 2626.2657;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, Double.NEGATIVE_INFINITY);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(1.0, (-1.5), (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1.0,-1.5]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.cosh();
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex0.divide(complex0);
      assertNotSame(complex2, complex1);
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, 0.0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, Double.NEGATIVE_INFINITY);
      assertEquals(1, complexArray0.length);
  }
}
