/*

 * Tue Mar 03 15:46:30 GMT 2020
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
import org.apache.commons.math.complex.Complex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LaguerreSolver_ESTest extends LaguerreSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.asin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve(410.120724485, Double.NaN, Double.NaN);
      assertEquals(410.120724485, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[7] = (-1337.3345637596826);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, 543.7998);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(1244.8, 1244.8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1244.8,1244.8]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 1244.8);
      Complex complex1 = laguerreSolver0.solve(complexArray0, complex0);
      assertEquals(1.0, complex1.abs(), 0.01);
      assertEquals((-0.8660254037844386), complex1.getImaginary(), 0.01);
      
      Complex complex2 = complex0.acos();
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 1244.8);
      Complex complex1 = laguerreSolver0.solve(complexArray0, complex0);
      assertEquals(1.0, complex1.abs(), 0.01);
      assertEquals((-0.8660254037844386), complex1.getImaginary(), 0.01);
      
      boolean boolean0 = laguerreSolver0.isRootOK((-273.06), (-610138.643225), complex0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cosh();
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tan();
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cos();
      assertEquals(1.0, complex1.abs(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 1.0E-15);
      assertEquals(3, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      assertEquals(0.0, complex0.abs(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 1244.8);
      Complex complex1 = laguerreSolver0.solve(complexArray0, complex0);
      assertEquals(1.0, complex1.abs(), 0.01);
      assertEquals((-0.8660254037844386), complex1.getImaginary(), 0.01);
      
      double double0 = laguerreSolver0.solve(224.57823393170014, (-76.102964242), 224.57823393170014);
      assertEquals(224.57823393170014, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      complex0.exp();
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
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex1 = new Complex(Double.POSITIVE_INFINITY, 1244.8);
      complex0.divide(complex0);
      Complex[] complexArray0 = new Complex[4];
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
  public void test11()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.cos();
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
  public void test12()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex1 = complex0.sinh();
      assertTrue(complex1.equals((Object)complex0));
      
      double double0 = laguerreSolver0.solve(3.0, (-2.0), (-2208.8967417));
      assertEquals(3.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tanh();
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      boolean boolean0 = laguerreSolver0.isRootOK(171.04237, 171.04237, complex0);
      assertFalse(boolean0);
      assertEquals(0.0, complex0.abs(), 0.01);
      assertTrue(complex0.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 660.7140696359083;
      doubleArray0[3] = 660.7140696359083;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 660.7140696359083);
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
  public void test15()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1804.77435873519);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      complex0.conjugate();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, 1.0E-6);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.tanh();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(1997.661, 4.399999999999997E-5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1997.661,4.399999999999997E-5]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      Complex complex1 = complex0.exp();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      boolean boolean0 = laguerreSolver0.isRootOK((-273.06), (-610138.643225), complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, complex0.abs(), 0.01);
      assertEquals(1.0, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      Complex complex1 = complex0.sinh();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      boolean boolean0 = laguerreSolver0.isRootOK(660.7140696359083, 2699.1354517924, complex0);
      assertEquals(0.0, complex0.abs(), 0.01);
      assertTrue(complex0.equals((Object)complex1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.sinh();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1337.3345637596826);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(1244.8, 1244.8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1244.8,1244.8]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex0.conjugate();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertTrue(complex0.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex1.acos();
      Complex complex3 = complex0.divide(complex2);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(Double.NaN, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
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
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      Complex[] complexArray0 = new Complex[3];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complex0.acos();
      complexArray0[2] = complex0;
      try { 
        laguerreSolver0.solveAll(complexArray0, complexArray0[0]);
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
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      Complex complex1 = complex0.exp();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(1.0, complex1.abs(), 0.01);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve(224.57823393170014, (-76.102964242), 224.57823393170014);
      assertEquals(224.57823393170014, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.sinh();
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
  public void test26()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      Complex complex1 = complex0.exp();
      assertEquals(1.0, complex1.abs(), 0.01);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      Complex complex2 = Complex.I;
      complexArray0[3] = complex2;
      Complex complex3 = laguerreSolver0.solve(complexArray0, complex2);
      assertFalse(complex2.equals((Object)complex0));
      assertTrue(complex3.equals((Object)complex0));
      assertEquals(1.0, complex2.abs(), 0.01);
      assertFalse(complex3.equals((Object)complex2));
      assertFalse(complex3.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, 0.0);
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tanh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.761594155955765, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      complex0.exp();
      doubleArray0[0] = 660.7140696359083;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(2232.5035142471147, 556.2096896032198, 3.141592653589793);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2232.5035142471147,556.2096896032198]
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
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tanh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.exp();
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.abs(), 0.01);
      
      Complex complex2 = complex0.conjugate();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      Complex complex1 = complex0.exp();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[0];
      // Undeclared exception!
      try { 
        laguerreSolver0.solveAll(complexArray0, complex1);
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
      Complex complex0 = Complex.INF;
      complex0.exp();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 1244.8);
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
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sinh();
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 1244.8);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray0, complex1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Polynomial degree must be positive: degree=0
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.cos();
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.sinh();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1337.3345637596826);
      doubleArray0[2] = (-1337.3345637596826);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, 543.7998);
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
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      Complex complex1 = complex0.exp();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex2 = complex1.atan();
      assertEquals(0.7853981633974483, complex2.abs(), 0.01);
      
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 1244.8);
      Complex complex3 = laguerreSolver0.solve(complexArray0, complex1);
      assertEquals(1.0, complex1.abs(), 0.01);
      assertEquals((-0.8660254037844386), complex3.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex2));
      assertEquals((-0.5), complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 660.7140696359083;
      doubleArray0[3] = 660.7140696359083;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex1 = complex0.exp();
      complex1.atan();
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 660.7140696359083);
      assertEquals(3, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      Complex complex1 = complex0.exp();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[8];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex1;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex1;
      complexArray0[6] = complex0;
      Complex complex2 = Complex.INF;
      complexArray0[7] = complex2;
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
  public void test40()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = 660.7140696359083;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 660.7140696359083);
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
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, 1244.8);
      laguerreSolver0.isRootOK(509.814408368698, Double.NaN, complex0);
      Complex[] complexArray0 = new Complex[4];
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
  public void test42()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.cos();
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-1337.3345637596826);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, 543.7998);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.exp();
      boolean boolean0 = laguerreSolver0.isRootOK((-9.482438286045284E15), 660.7140696359083, complex1);
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertEquals(1.0, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[7];
      Complex complex0 = Complex.INF;
      complexArray0[0] = complex0;
      complexArray0[0].atan();
      Complex[] complexArray1 = laguerreSolver0.solveAll(doubleArray0, 1244.8);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray1, complexArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Polynomial degree must be positive: degree=0
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 1244.8);
      assertEquals(3, complexArray0.length);
      
      Complex complex1 = laguerreSolver0.solve(complexArray0, complex0);
      boolean boolean0 = laguerreSolver0.isRootOK((-3025.8895673391), 1244.8, complex1);
      assertEquals((-0.8660254037844386), complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.abs(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.INF;
      complex0.atan();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 9.094947017729282E-13);
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
  @Ignore
  public void test47()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.isRootOK((-781.115), 3.141592653589793, complex0);
      Complex[] complexArray0 = new Complex[8];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      complexArray0[6] = complex0;
      Complex complex1 = Complex.INF;
      complexArray0[7] = complex1;
      // Undeclared exception!
      laguerreSolver0.solveAll(complexArray0, complex0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = new Complex(1.0E-15, (-577.9));
      laguerreSolver0.isRootOK(0.5, 0.9318414923762619, complex0);
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex0;
      complexArray0[1] = complex1;
      complexArray0[2] = complexArray0[0];
      complexArray0[3] = complex0;
      try { 
        laguerreSolver0.solve(complexArray0, complexArray0[1]);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1804.77435873519);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[5];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      laguerreSolver0.solve(complexArray0, complex0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((-1804.77435873519), (-76.102964242), (-1337.3345637596826));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-1804.77435873519,-76.102964242]  Values: [-1804.77435873519,-1804.77435873519]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-2706.78733402);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.exp();
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      
      double double0 = laguerreSolver0.solve((-4.9E-324), 1244.8);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      laguerreSolver0.isRootOK((-1337.3345637596826), 2.0, complex0);
      Complex complex1 = Complex.I;
      Complex[] complexArray0 = new Complex[7];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex1;
      complexArray0[6] = complex0;
      laguerreSolver0.solveAll(complexArray0, complex1);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      Complex[] complexArray0 = new Complex[6];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex1;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
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
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.INF;
      complex0.sinh();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 9.094947017729282E-13);
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
  public void test54()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.asin();
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-1337.3345637596826);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, 543.7998);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex1 = complex0.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      
      Complex[] complexArray0 = new Complex[8];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      complexArray0[6] = complex0;
      complexArray0[7] = complexArray0[5];
      Complex[] complexArray1 = laguerreSolver0.solveAll(complexArray0, complex0);
      assertEquals(7, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      complex0.asin();
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-991.42549778857));
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex1 = Complex.NaN;
      laguerreSolver0.solve(1557.04, (-781.115), (-781.115));
      Complex[] complexArray0 = new Complex[7];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex1;
      complexArray0[5] = complex0;
      complexArray0[6] = complex0;
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
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-2706.78733402);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      complex0.acos();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(660.7140696359083, 4496.288961943517, 10.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [660.7140696359083,4496.288961943517]  Values: [-1788412.475099285,-1.2170498012282645E7]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 0.0);
      assertEquals(1, complexArray0.length);
      
      double double0 = laguerreSolver0.solve(Double.POSITIVE_INFINITY, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex1 = complex0.atan();
      assertTrue(complex1.equals((Object)complex0));
      
      double double0 = laguerreSolver0.solve(224.57823393170014, (-76.102964242), 224.57823393170014);
      assertEquals(224.57823393170014, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertTrue(complex1.isNaN());
      
      double double0 = laguerreSolver0.solve(3.0, (-2.0), (-2208.8967417));
      assertEquals(3.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex1 = Complex.I;
      Complex[] complexArray0 = new Complex[8];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex1;
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      complexArray0[6] = complex0;
      Complex complex2 = Complex.INF;
      complexArray0[7] = complex2;
      try { 
        laguerreSolver0.solveAll(complexArray0, complexArray0[3]);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[8] = Double.POSITIVE_INFINITY;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, 841.1615233915);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }
}
