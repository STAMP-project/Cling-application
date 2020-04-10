/*

 * Tue Mar 03 15:29:00 GMT 2020
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
import org.apache.commons.math.analysis.PolynomialFunctionNewtonForm;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.complex.Complex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LaguerreSolver_ESTest extends LaguerreSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[2];
      Complex complex0 = new Complex(1.0E-15, 1837.942739);
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      Complex complex1 = laguerreSolver0.solve(complexArray0, complex0);
      Complex complex2 = complex1.acos();
      assertEquals(1837.942739, complex0.abs(), 0.01);
      assertEquals(3.999268133105346E-35, complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Complex[] complexArray0 = new Complex[3];
      Complex complex0 = Complex.ZERO;
      complexArray0[0] = complex0;
      Complex complex1 = Complex.NaN;
      complexArray0[0].subtract(complex1);
      double[] doubleArray1 = new double[2];
      PolynomialFunctionNewtonForm polynomialFunctionNewtonForm0 = new PolynomialFunctionNewtonForm(doubleArray0, doubleArray1);
      LaguerreSolver laguerreSolver0 = null;
      try {
        laguerreSolver0 = new LaguerreSolver(polynomialFunctionNewtonForm0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function is not polynomial.
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2831.8;
      doubleArray0[2] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      boolean boolean0 = laguerreSolver0.isRootOK(2831.8, 0.0, complex0);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertFalse(boolean0);
      
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-6164.0));
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cosh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.557407724654902, complex1.abs(), 0.01);
      assertEquals(1.557407724654902, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      double double0 = laguerreSolver0.solve((-1044.01), (-1044.01), (-1044.01));
      assertEquals((-1044.01), double0, 0.01);
      
      laguerreSolver0.solveAll(complexArray0, complex0);
      assertEquals(1.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2831.8;
      complex0.sinh();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, (-9433292.16));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sinh();
      assertEquals(1.1752011936438014, complex1.abs(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      
      double double0 = laguerreSolver0.solve(0.0, (-1609.0446105), 2.2737367544323206E-13);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex1 = complex0.tanh();
      boolean boolean0 = laguerreSolver0.isRootOK(441.6553, 2831.8, complex1);
      assertFalse(boolean0);
      assertEquals(0.761594155955765, complex1.getReal(), 0.01);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertEquals(0.761594155955765, complex1.abs(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(univariateRealFunction0);
      double double0 = laguerreSolver0.solve((-6164.0), 2831.8);
      assertEquals(0.0, double0, 0.01);
      
      Complex complex1 = complex0.conjugate();
      assertEquals(1.0, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      complex0.tanh();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(2047.465195, 2831.8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [2047.465195,2831.8]  Values: [2831.8,2831.8]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex1 = complex0.exp();
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(2.718281828459045, complex1.abs(), 0.01);
      
      boolean boolean0 = laguerreSolver0.isRootOK(2.2708465405232002E10, 0.0, complex0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      complex0.tanh();
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 0.0);
      try { 
        laguerreSolver0.solve(complexArray0, complex1);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      laguerreSolver0.solve(complexArray0, complex0);
      double[] doubleArray1 = new double[2];
      Complex[] complexArray1 = laguerreSolver0.solveAll(doubleArray1, 1077.16788247);
      // Undeclared exception!
      try { 
        laguerreSolver0.solveAll(complexArray1, complex0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Polynomial degree must be positive: degree=0
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex1 = complex0.conjugate();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      
      Complex[] complexArray0 = new Complex[3];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      Complex complex2 = laguerreSolver0.solve(complexArray0, complex0);
      assertEquals((-0.8660254037844386), complex2.getImaginary(), 0.01);
      assertEquals(1.0, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex1 = complex0.exp();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(2.718281828459045, complex1.abs(), 0.01);
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
      
      double double0 = laguerreSolver0.solve(Double.POSITIVE_INFINITY, (-2024.0176937893));
      assertEquals((-2024.0176937893), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      complex0.exp();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(2831.8, (-1.3530168514428408E19));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2831.8,-1.3530168514428408E19]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      Complex complex1 = complex0.sinh();
      assertEquals(1.1752011936438014, complex1.abs(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve(Double.NaN, (-878.603855));
      assertEquals((-878.603855), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.conjugate();
      assertSame(complex2, complex1);
      
      Complex complex3 = complex0.sinh();
      assertEquals(1.1752011936438014, complex3.abs(), 0.01);
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertEquals(1.1752011936438014, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[3];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      laguerreSolver0.solve(complexArray0, complex0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(2831.8, 2831.8, 2831.8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2831.8,2831.8]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, 6.199999999999992E-5);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.exp();
      assertEquals(2.718281828459045, complex1.abs(), 0.01);
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      
      double double0 = laguerreSolver0.solve(0.0, (-1609.0446105), 2.2737367544323206E-13);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      complex0.sinh();
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
  public void test24()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      complex0.exp();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, (-9433292.16));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.isRootOK((-1305.312427), (-1102.310072542), complex0);
      Complex[] complexArray0 = new Complex[8];
      Complex complex1 = Complex.INF;
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
      double[] doubleArray0 = new double[3];
      Complex complex0 = Complex.INF;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      complex0.conjugate();
      Complex[] complexArray0 = new Complex[2];
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray0, complex0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve(Double.POSITIVE_INFINITY, (-2024.0176937893), (-288.308984668188));
      assertEquals((-2024.0176937893), double0, 0.01);
      
      Complex complex1 = complex0.exp();
      assertEquals(2.718281828459045, complex1.abs(), 0.01);
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      complex0.exp();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(2831.8, 2831.8, (-1609.0446105));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2831.8,2831.8]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      complex0.sinh();
      double[] doubleArray1 = new double[2];
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray1, 1077.16788247);
      // Undeclared exception!
      try { 
        laguerreSolver0.solveAll(complexArray0, complex0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Polynomial degree must be positive: degree=0
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      complex0.exp();
      double[] doubleArray1 = new double[2];
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray1, 1077.16788247);
      // Undeclared exception!
      try { 
        laguerreSolver0.solveAll(complexArray0, complex0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Polynomial degree must be positive: degree=0
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      complex0.sinh();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[0];
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray0, complex0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Polynomial degree must be positive: degree=-1
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 6.199999999999992E-5);
      Complex complex0 = Complex.NaN;
      complex0.subtract(complex0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray0, complex0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Polynomial degree must be positive: degree=0
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex0.tanh();
      assertSame(complex2, complex0);
      
      Complex complex3 = complex1.exp();
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertEquals(2.718281828459045, complex3.abs(), 0.01);
      assertEquals(2.718281828459045, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.sinh();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex1;
      complexArray0[1] = complex2;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      try { 
        laguerreSolver0.solve(complexArray0, complex1);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 0.0);
      laguerreSolver0.solve((-243.27478), (-1102.310072542), 0.0);
      try { 
        laguerreSolver0.solve(complexArray0, complex0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tanh();
      assertEquals(0.761594155955765, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.761594155955765, complex1.abs(), 0.01);
      
      boolean boolean0 = laguerreSolver0.isRootOK(0.0, 2611.24050071, complex0);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2831.8;
      complex0.sinh();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(2831.8, 2831.8, 2831.8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2831.8,2831.8]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2831.8;
      doubleArray0[2] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, (-6164.0));
      Complex complex1 = complex0.atan();
      assertEquals(0.7853981633974483, complex1.getReal(), 0.01);
      assertEquals(1.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      boolean boolean0 = laguerreSolver0.isRootOK((-0.31809587895046154), 2831.8, complex0);
      assertTrue(boolean0);
      
      Complex complex1 = complex0.exp();
      assertEquals(2.718281828459045, complex1.abs(), 0.01);
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.negate();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[2];
      complexArray0[0] = complex1;
      complexArray0[1] = complex0;
      laguerreSolver0.solve(complexArray0, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[6];
      doubleArray0[5] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      complex0.cos();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-2274.807931292137));
      assertEquals(5, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      assertEquals(1.0, complex0.abs(), 0.01);
      
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      Complex complex1 = laguerreSolver0.solve(complexArray0, complex0);
      assertEquals(1.2237932021930131E-17, complex1.getReal(), 0.01);
      assertEquals(1.0, complex1.abs(), 0.01);
      
      Complex complex2 = complex0.exp();
      assertEquals(2.718281828459045, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2831.8;
      complex0.sinh();
      doubleArray0[2] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-6164.0));
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2831.8;
      doubleArray0[2] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      complex0.exp();
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 2831.8);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      laguerreSolver0.isRootOK(0.0, (-1305.312427), complex0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 0.0);
      try { 
        laguerreSolver0.solve(complexArray0, complex0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Complex complex0 = Complex.ZERO;
      complex0.subtract(complex0);
      double[] doubleArray1 = new double[2];
      PolynomialFunctionNewtonForm polynomialFunctionNewtonForm0 = new PolynomialFunctionNewtonForm(doubleArray0, doubleArray1);
      LaguerreSolver laguerreSolver0 = null;
      try {
        laguerreSolver0 = new LaguerreSolver(polynomialFunctionNewtonForm0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function is not polynomial.
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Complex complex0 = Complex.INF;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[2];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      try { 
        laguerreSolver0.solve(complexArray0, complex0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test49()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2831.8;
      doubleArray0[1] = 2831.8;
      doubleArray0[2] = 2831.8;
      doubleArray0[3] = 2831.8;
      doubleArray0[4] = 2831.8;
      doubleArray0[5] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      complex0.tanh();
      laguerreSolver0.solveAll(doubleArray0, (-4176.3002891719));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex1.subtract(complex0);
      boolean boolean0 = laguerreSolver0.isRootOK(1.0, 1.0, complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertEquals(Double.NaN, complex0.abs(), 0.01);
      assertSame(complex0, complex2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[3];
      Complex complex1 = Complex.I;
      assertEquals(1.0, complex1.abs(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      
      complexArray0[0] = complex1;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      Complex complex2 = laguerreSolver0.solve(complexArray0, complex0);
      Complex complex3 = complex2.acos();
      assertEquals(0.30024259022012034, complex2.getReal(), 0.01);
      assertEquals(1.449323834660383, complex3.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve(Double.NaN, (-878.603855));
      assertEquals((-878.603855), double0, 0.01);
      
      Complex[] complexArray0 = new Complex[2];
      complexArray0[0] = complex0;
      complexArray0[1] = complexArray0[0];
      Complex complex1 = laguerreSolver0.solve(complexArray0, complex0);
      assertEquals(1.0, complex1.abs(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      
      Complex complex2 = complex0.conjugate();
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2831.8;
      doubleArray0[2] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(univariateRealFunction0);
      double double0 = laguerreSolver0.solve((-6164.0), 2831.8);
      assertEquals(0.0, double0, 0.01);
      
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-6164.0));
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve((-1086.6125), (-1086.6125), 6.199999999999992E-5);
      assertEquals((-1086.6125), double0, 0.01);
      
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve(0.0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
      
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cos();
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.5403023058681398, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = complex0.acos();
      Complex[] complexArray0 = new Complex[9];
      complexArray0[0] = complex1;
      complexArray0[1] = complex0;
      complexArray0[2] = complex3;
      complexArray0[3] = complex2;
      complexArray0[4] = complex3;
      complexArray0[5] = complexArray0[1];
      complexArray0[6] = complex0;
      complexArray0[7] = complex2;
      complexArray0[8] = complex0;
      try { 
        laguerreSolver0.solve(complexArray0, complex0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      Complex complex1 = complex0.sinh();
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(1.1752011936438014, complex1.abs(), 0.01);
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      
      doubleArray0[2] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction1);
      double double0 = laguerreSolver0.solve((-6164.0), 2831.8);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      assertEquals(1.1752011936438014, complex1.abs(), 0.01);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      boolean boolean0 = laguerreSolver0.isRootOK(2831.8, 0.0, complex0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.conjugate();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex1;
      complexArray0[1] = complex1;
      complexArray0[2] = complex2;
      complexArray0[3] = complex0;
      try { 
        laguerreSolver0.solve(complexArray0, complex0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.conjugate();
      Complex[] complexArray0 = new Complex[6];
      complexArray0[0] = complex2;
      complexArray0[1] = complex2;
      complexArray0[2] = complex1;
      complexArray0[3] = complex1;
      complexArray0[4] = complex2;
      complexArray0[5] = complex0;
      try { 
        laguerreSolver0.solve(complexArray0, complex1);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve(Double.POSITIVE_INFINITY, (-2024.0176937893), (-288.308984668188));
      assertEquals((-2024.0176937893), double0, 0.01);
      
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 112.09);
      assertEquals(5, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      double double0 = laguerreSolver0.solve((-1100.69), (-1100.69), (-56.03911));
      assertEquals((-1100.69), double0, 0.01);
      
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.subtract(complex1);
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(1.8011719796199461, complex1.abs(), 0.01);
      
      double double0 = laguerreSolver0.solve((-1042.9), (-3997.7), (-3540.145347496441));
      assertEquals((-1042.9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      complex0.acos();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(2831.8, 2831.8, (-1609.0446105));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2831.8,2831.8]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.exp();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(2.718281828459045, complex1.abs(), 0.01);
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
      
      Complex complex2 = complex0.conjugate();
      assertEquals(1.0, complex2.getReal(), 0.01);
      assertFalse(complex2.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      boolean boolean0 = laguerreSolver0.isRootOK((-1305.312427), (-1102.310072542), complex0);
      assertFalse(boolean0);
      
      Complex complex1 = complex0.acos();
      assertEquals(0.0, complex1.abs(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.conjugate();
      assertEquals(1.1752011936438014, complex2.getReal(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      assertEquals(1.1752011936438014, complex2.abs(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      complex0.atan();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(2831.8, 1.0, 1.0E-15);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2831.8,1.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve(Double.POSITIVE_INFINITY, (-2024.0176937893), (-288.308984668188));
      assertEquals((-2024.0176937893), double0, 0.01);
      
      Complex complex1 = complex0.cos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.5403023058681398, complex1.abs(), 0.01);
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2831.8;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      complex0.cos();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(2831.8, 2831.8, 2831.8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2831.8,2831.8]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[2];
      complexArray0[0] = complex0;
      Complex complex1 = Complex.NaN;
      complexArray0[1] = complex1;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 2831.8;
      doubleArray1[3] = 8021923.040000001;
      laguerreSolver0.solveAll(doubleArray1, 3848.3046315206);
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
  public void test73()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[2];
      complexArray0[0] = complex0;
      Complex complex1 = Complex.NaN;
      complexArray0[1] = complex1;
      laguerreSolver0.solveAll(doubleArray0, 3848.3046315206);
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
  public void test74()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(1.8011719796199461, complex1.abs(), 0.01);
      
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 1.6038182480000002E7);
      assertEquals(2, complexArray0.length);
  }
}
