/*

 * Tue Mar 03 15:37:24 GMT 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.LaguerreSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.complex.Complex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LaguerreSolver_ESTest extends LaguerreSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[5] = (-4899.3307218791);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, 561.9);
      Complex complex0 = Complex.INF;
      laguerreSolver0.isRootOK((-2123.3468354), 2375.3, complex0);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tanh();
      assertEquals(0.761594155955765, complex1.getReal(), 0.01);
      assertEquals(0.761594155955765, complex1.abs(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      boolean boolean0 = laguerreSolver0.isRootOK(8.285496733151376E-10, (-4899.3307218791), complex0);
      assertFalse(boolean0);
      assertEquals(1.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      laguerreSolver0.isRootOK(6.283185307179586, 6.283185307179586, complex0);
      Complex complex1 = complex0.pow(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.20787957635076193, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, (-274.318759789253));
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[5] = (-4899.3307218791);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, 561.9);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(561.9, 1632.8967612212, 2375.3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [561.9,1632.8967612212]  Values: [-2.74430209597779712E17,-5.687617672780732E19]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-4899.3307218791);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      complex0.asin();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((-4899.3307218791), (-4899.3307218791), 211.86882);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-4899.3307218791,-4899.3307218791]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 2375.3;
      doubleArray1[3] = 561.9;
      laguerreSolver0.solveAll(doubleArray1, 2375.3);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.tanh();
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[9];
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
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = new Complex(0.0, Double.POSITIVE_INFINITY);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[8];
      complexArray0[0] = complex0;
      complexArray0[1] = complexArray0[0];
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      complex0.pow(complex0);
      complexArray0[6] = complexArray0[1];
      complexArray0[7] = complex0;
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
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 15.693017191351647;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, Double.NEGATIVE_INFINITY);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(Double.NEGATIVE_INFINITY, (-470.92927));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-Infinity,-470.92927]  Values: [NaN,15.693017191351647]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      laguerreSolver0.isRootOK((-1033.0), 1.2042527844889744E12, complex0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, Double.NEGATIVE_INFINITY);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[9];
      Complex complex0 = Complex.NaN;
      complexArray0[0] = complex0;
      Complex complex1 = new Complex(1.0E-6, (-1971.4033133));
      complexArray0[1] = complex1;
      complexArray0[2] = complexArray0[1];
      complexArray0[3] = complexArray0[2];
      complexArray0[4] = complexArray0[1];
      Complex complex2 = Complex.INF;
      complexArray0[5] = complex2;
      complexArray0[6] = complexArray0[2];
      complexArray0[7] = complex1;
      complexArray0[8] = complexArray0[1];
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
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-4899.3307218791);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, Double.NEGATIVE_INFINITY);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((-318.6919380962), (-4.9E-324), (-4899.3307218791));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-318.6919380962,-4.9E-324]  Values: [-4899.3307218791,-4899.3307218791]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 15.693017191351647;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      complex0.acos();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(Double.NEGATIVE_INFINITY, (-470.92927));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-Infinity,-470.92927]  Values: [NaN,15.693017191351647]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (-1729.8327);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, 6.283185307179586);
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
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-4899.3307218791);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.isRootOK(8.285496733151376E-10, (-4899.3307218791), complex0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, (-774.647448517));
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
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-1.0));
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.exp();
      assertEquals(1.0, complex1.abs(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      
      Complex complex2 = laguerreSolver0.solve(complexArray0, complex0);
      assertEquals((-0.9510565162951535), complex2.getImaginary(), 0.01);
      assertEquals(0.9999999999999999, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      Complex[] complexArray0 = new Complex[5];
      Complex complex1 = Complex.ZERO;
      complex1.conjugate();
      // Undeclared exception!
      try { 
        laguerreSolver0.solveAll(complexArray0, complex0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-4899.3307218791);
      doubleArray0[2] = (-4899.3307218791);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 6.283185307179586);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[9];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complexArray0[1];
      complexArray0[4] = complex0;
      complexArray0[5] = complexArray0[4];
      complexArray0[6] = complex0;
      complexArray0[7] = complex0;
      complex0.conjugate();
      complexArray0[8] = complex0;
      Complex[] complexArray1 = laguerreSolver0.solveAll(complexArray0, complex0);
      assertEquals(8, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-1.0));
      assertEquals(5, complexArray0.length);
      
      Complex complex0 = Complex.I;
      Complex complex1 = laguerreSolver0.solve(complexArray0, complex0);
      assertEquals(0.9999999999999999, complex1.abs(), 0.01);
      
      Complex complex2 = complex0.asin();
      assertEquals(0.8813735870195428, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-1.0));
      assertEquals(5, complexArray0.length);
      
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.asin();
      assertFalse(complex1.equals((Object)complex0));
      
      Complex complex2 = laguerreSolver0.solve(complexArray0, complex1);
      assertEquals(0.3090169943749474, complex2.getReal(), 0.01);
      assertEquals(0.9999999999999999, complex2.abs(), 0.01);
      assertEquals(0.8813735870195428, complex1.getImaginary(), 0.01);
      
      double double0 = laguerreSolver0.solve((-1.0), (-155.853348655167), 1.0E-14);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.asin();
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex1;
      complexArray0[1] = complex0;
      complexArray0[2] = complex2;
      complexArray0[3] = complex0;
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
  public void test24()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, Double.NEGATIVE_INFINITY);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 3.141592653589793);
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
  @Ignore
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-274.318759789253));
      laguerreSolver0.solve(10.0, 6.99999999999999E-5, 1.0);
      Complex complex0 = Complex.NaN;
      // Undeclared exception!
      laguerreSolver0.solveAll(complexArray0, complex0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve(Double.NaN, Double.NaN, 0.0);
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
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      boolean boolean0 = laguerreSolver0.isRootOK((-1033.0), 1.2042527844889744E12, complex0);
      assertFalse(boolean0);
      
      Complex complex1 = complex0.acos();
      assertTrue(complex0.isNaN());
      assertEquals(Double.NaN, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[5] = (-4899.3307218791);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, 561.9);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(9.246531061709822E-4, (-5407.433300800851));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [9.246531061709822E-4,-5407.433300800851]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertEquals(Double.NaN, complex1.abs(), 0.01);
      
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, Double.NEGATIVE_INFINITY);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-274.318759789253));
      Complex complex0 = new Complex(0.0, Double.POSITIVE_INFINITY);
      // Undeclared exception!
      laguerreSolver0.solveAll(complexArray0, complex0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[5] = Double.POSITIVE_INFINITY;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, 561.9);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.atan();
      assertEquals(0.7853981633974483, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.7853981633974483, complex1.abs(), 0.01);
      
      boolean boolean0 = laguerreSolver0.isRootOK((-632.926991889364), 4.932900477917773E23, complex0);
      assertTrue(boolean0);
  }
}
