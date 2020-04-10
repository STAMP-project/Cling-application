/*

 * Tue Mar 03 15:24:26 GMT 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.LaguerreSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.complex.Complex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LaguerreSolver_ESTest extends LaguerreSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      complex0.divide(complex0);
      Complex[] complexArray0 = new Complex[8];
      complexArray0[7] = complex1;
      // Undeclared exception!
      try { 
        laguerreSolver0.solveAll(complexArray0, complex0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.ZERO;
      complex0.asin();
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solveAll(complexArray0, complex0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      Complex[] complexArray0 = new Complex[5];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      Complex[] complexArray1 = laguerreSolver0.solveAll(complexArray0, complex0);
      assertEquals(4, complexArray1.length);
      
      boolean boolean0 = laguerreSolver0.isRootOK(10.0, 3610.59983, complex0);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cosh();
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5430806348152437, complex1.abs(), 0.01);
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
      complex0.exp();
      double[] doubleArray0 = new double[3];
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
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      double double0 = laguerreSolver0.solve(Double.NaN, Double.NaN, (-1729.64));
      assertEquals((-1729.64), double0, 0.01);
      
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      Complex complex1 = laguerreSolver0.solve(complexArray0, complex0);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals(1.2237932021930131E-17, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      
      double double0 = laguerreSolver0.solve((-265.5931087), (-214.63247117), 2.0);
      assertEquals((-265.5931087), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(complex0);
      Complex complex2 = complex1.acos();
      assertEquals(0.0, complex2.abs(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      Complex[] complexArray0 = new Complex[7];
      complex0.atan();
      // Undeclared exception!
      try { 
        laguerreSolver0.solveAll(complexArray0, complex0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex1.conjugate();
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
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
  public void test15()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex0);
      assertEquals(0.0, complex0.abs(), 0.01);
      
      Complex complex3 = complex1.sqrt1z();
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertTrue(complex3.equals((Object)complex2));
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Complex complex0 = Complex.NaN;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 3135.25185);
      laguerreSolver0.solve((-1937.2), (-1937.2), 3135.25185);
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
  public void test17()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[6];
      complexArray0[0] = complex0;
      complexArray0[1] = complex1;
      complexArray0[2] = complex1;
      Complex complex2 = Complex.ONE;
      complexArray0[3] = complex2;
      complexArray0[4] = complex0;
      complexArray0[5] = complex1;
      try { 
        laguerreSolver0.solveAll(complexArray0, complex2);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-4611.090309);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve(1.0E-6, 1.0E-6, 0.0);
      Complex complex0 = Complex.INF;
      Complex[] complexArray0 = new Complex[9];
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray0, complex0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.pow(complex0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1374.0028797002465;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(7.021489395173867E9, 1374.0028797002465, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [7.021489395173867E9,1374.0028797002465]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex0.divide(complex0);
      assertNotSame(complex2, complex1);
      assertTrue(complex2.equals((Object)complex1));
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.exp();
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      
      Complex complex2 = complex0.divide(complex0);
      assertEquals(1.0, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      Complex complex0 = Complex.ONE;
      complex0.acos();
      LaguerreSolver laguerreSolver0 = null;
      try {
        laguerreSolver0 = new LaguerreSolver(univariateRealFunction0);
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
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      Complex complex0 = Complex.NaN;
      complex0.subtract(complex0);
      LaguerreSolver laguerreSolver0 = null;
      try {
        laguerreSolver0 = new LaguerreSolver(univariateRealFunction0);
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
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      assertEquals(1.8011719796199461, complex1.abs(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      
      Complex complex2 = complex0.divide(complex0);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.0, complex2.getReal(), 0.01);
      assertEquals(1.0, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.isRootOK((-4.9E-324), 1.0, complex0);
      Complex[] complexArray0 = new Complex[6];
      complexArray0[0] = complex0;
      complexArray0[1] = complex1;
      complexArray0[2] = complex1;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex1;
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
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = new Complex(2.0, Double.POSITIVE_INFINITY);
      laguerreSolver0.isRootOK(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, complex0);
      Complex[] complexArray0 = new Complex[3];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complexArray0[0];
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
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[5];
      Complex complex2 = Complex.ZERO;
      complexArray0[0] = complex2;
      complexArray0[1] = complex1;
      complexArray0[2] = complex1;
      complexArray0[3] = complex1;
      complexArray0[4] = complex1;
      try { 
        laguerreSolver0.solveAll(complexArray0, complex2);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      
      Complex complex2 = complex0.conjugate();
      assertEquals(1.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 1.4760221612087172E13);
      Complex[] complexArray1 = laguerreSolver0.solveAll(complexArray0, complex0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray1, complex0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Polynomial degree must be positive: degree=0
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      complex0.asin();
      Complex[] complexArray0 = new Complex[0];
      // Undeclared exception!
      try { 
        laguerreSolver0.solveAll(complexArray0, complex0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Polynomial degree must be positive: degree=-1
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      assertEquals(0.0, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      Complex[] complexArray1 = laguerreSolver0.solveAll(complexArray0, complex0);
      assertEquals(3, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-4611.090309);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve(1.0E-6, 1.0E-6, 0.0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, 0.0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex1.sqrt1z();
      Complex[] complexArray0 = new Complex[8];
      complexArray0[0] = complex1;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex2;
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      complexArray0[6] = complex0;
      complexArray0[7] = complexArray0[5];
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
  @Ignore
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 1.0E-6;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, 0.0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      assertEquals(1.1752011936438014, complex1.abs(), 0.01);
      
      boolean boolean0 = laguerreSolver0.isRootOK(1.0293815545687222, 1.0293815545687222, complex0);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-2017.3));
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[6];
      Complex complex1 = complex0.conjugate();
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(1.0, complex1.abs(), 0.01);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      Complex[] complexArray1 = laguerreSolver0.solveAll(complexArray0, complex0);
      assertEquals(3, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      Complex[] complexArray0 = new Complex[8];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      complexArray0[6] = complex0;
      complexArray0[7] = complex0;
      laguerreSolver0.solveAll(complexArray0, complex0);
      assertEquals(1.0, complex0.abs(), 0.01);
      
      double double0 = laguerreSolver0.solve(Double.POSITIVE_INFINITY, (-3391.21165), (-57.9155));
      assertEquals((-3391.21165), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = new Complex(2.0, Double.POSITIVE_INFINITY);
      Complex[] complexArray0 = new Complex[3];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      Complex complex1 = Complex.I;
      try { 
        laguerreSolver0.solveAll(complexArray0, complex1);
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
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex0.subtract(complex1);
      assertTrue(complex2.isNaN());
      
      Complex complex3 = complex1.acos();
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      assertEquals(1.0, complex0.abs(), 0.01);
      
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-418.58774);
      doubleArray0[2] = 2.1262153837753717E7;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      laguerreSolver0.solveAll(complexArray0, complex0);
      double double0 = laguerreSolver0.solve((-418.58774), 1.5092485993736327E-16, 5.551115123125783E-17);
      assertEquals((-0.004437001995559265), double0, 0.01);
  }
}
