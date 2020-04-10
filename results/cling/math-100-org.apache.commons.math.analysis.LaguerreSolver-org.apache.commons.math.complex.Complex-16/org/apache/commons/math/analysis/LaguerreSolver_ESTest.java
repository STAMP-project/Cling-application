/*

 * Tue Mar 03 15:29:06 GMT 2020
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
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cosh();
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      complex0.tanh();
      // Undeclared exception!
      try { 
        laguerreSolver0.solveAll(doubleArray0, (-1640.4493547346901));
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
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0E-6;
      doubleArray0[1] = 1.0E-6;
      doubleArray0[4] = 1.0E-6;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, (-213.5658139592));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      boolean boolean0 = laguerreSolver0.isRootOK(321.1888485062, (-0.001953125), complex0);
      assertFalse(boolean0);
      
      Complex complex1 = complex0.tanh();
      assertEquals(1.557407724654902, complex1.abs(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(1.557407724654902, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1640.4493547346901);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      complex0.tanh();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(752.64971549, 1669.532585);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [752.64971549,1669.532585]  Values: [-1640.4493547346901,-1640.4493547346901]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-1037.178146063652), (-1.0));
      Complex[] complexArray0 = new Complex[8];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex1;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      complexArray0[6] = complex0;
      complexArray0[7] = complex0;
      laguerreSolver0.solve(complexArray0, complex0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solveAll(doubleArray0, (-1640.4493547346901));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Polynomial degree must be positive: degree=0
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[21];
      Complex complex0 = Complex.ZERO;
      Complex complex1 = new Complex(3581.13255, Double.NaN);
      complex0.pow(complex1);
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
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.sin();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      boolean boolean0 = laguerreSolver0.isRootOK((-1640.4493547346901), 1261.38344112362, complex2);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex2.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.INF;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex1 = Complex.ONE;
      laguerreSolver0.isRootOK(1.0E-6, 1.0E-6, complex1);
      Complex[] complexArray0 = new Complex[9];
      complexArray0[7] = complex0;
      complexArray0[8] = complex1;
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray0, complex1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      Complex[] complexArray0 = new Complex[8];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      Complex complex1 = complex0.tanh();
      assertEquals(1.557407724654902, complex1.abs(), 0.01);
      
      complexArray0[3] = complexArray0[1];
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      complexArray0[6] = complex0;
      complexArray0[7] = complex0;
      Complex complex2 = laguerreSolver0.solve(complexArray0, complex0);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[6];
      Complex complex0 = Complex.INF;
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
  public void test11()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cos();
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
      assertEquals(0.5403023058681398, complex1.abs(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      assertEquals(0.0, complex0.abs(), 0.01);
      
      Complex complex1 = Complex.I;
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      
      Complex[] complexArray0 = new Complex[6];
      complexArray0[0] = complex1;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex1;
      complexArray0[5] = complex0;
      Complex complex2 = laguerreSolver0.solve(complexArray0, complex1);
      assertEquals(1.0, complex1.abs(), 0.01);
      assertEquals(0.7071067811865475, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ONE;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve(2357.0, 1.0E-6, (-1.0));
      Complex[] complexArray0 = new Complex[9];
      complexArray0[7] = complex0;
      complexArray0[8] = complex1;
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray0, complex1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 646.489934962;
      doubleArray0[3] = 0.5;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve((-5126.5786), 1.0E-6, (-893.55869465894));
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.I;
      Complex[] complexArray0 = new Complex[2];
      complexArray0[0] = complex1;
      complexArray0[1] = complex0;
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
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1751.341017;
      doubleArray0[1] = 1751.341017;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve((-1070.8643731093912), 1751.341017);
      Complex complex0 = Complex.INF;
      Complex[] complexArray0 = new Complex[6];
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
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      laguerreSolver0.isRootOK((-1070.8643731093912), 1816.0, complex0);
      Complex complex1 = Complex.INF;
      Complex[] complexArray0 = new Complex[2];
      complexArray0[1] = complex1;
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
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0E-6;
      doubleArray0[2] = 646.489934962;
      doubleArray0[3] = 0.5;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      Complex[] complexArray0 = new Complex[6];
      laguerreSolver0.solve((-2266.576), 646.489934962);
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
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1751.341017;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      complex0.acos();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((-6976.2446), 223.401091194);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-6976.2446,223.401091194]  Values: [1751.341017,1751.341017]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.tanh();
      assertEquals(1.557407724654902, complex1.getImaginary(), 0.01);
      
      Complex complex2 = new Complex(2034.9770802730202, 0.5915138767057225);
      Complex[] complexArray0 = new Complex[8];
      complexArray0[0] = complex1;
      complexArray0[1] = complex1;
      complexArray0[2] = complex2;
      complexArray0[3] = complex2;
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      complexArray0[6] = complex2;
      complexArray0[7] = complex1;
      Complex complex3 = laguerreSolver0.solve(complexArray0, complex0);
      assertEquals(0.8446266350082937, complex3.abs(), 0.01);
      assertEquals(0.42976843951688054, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      laguerreSolver0.isRootOK((-1640.4493547346901), (-1640.4493547346901), complex0);
      Complex complex1 = Complex.INF;
      Complex[] complexArray0 = new Complex[7];
      complexArray0[0] = complex1;
      complexArray0[1] = complex0;
      complexArray0[2] = complex1;
      complexArray0[3] = complex1;
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      complexArray0[6] = complex1;
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
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 1751.341017;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve((-1070.8643731093912), 1751.341017);
      Complex complex0 = Complex.ZERO;
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
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 1751.341017;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve((-1070.8643731093912), 1751.341017);
      Complex complex0 = Complex.INF;
      Complex[] complexArray0 = new Complex[6];
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
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex[] complexArray0 = new Complex[2];
      complexArray0[0] = complex0;
      complexArray0[1] = complex1;
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
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (-507.0);
      doubleArray1[3] = (-5306.233193672464);
      laguerreSolver0.solveAll(doubleArray1, 1265.08359518658);
      double double0 = laguerreSolver0.solve(6.283185307179586, Double.NaN, 2.0);
      assertEquals(6.283185307179586, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex1;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex1;
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
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1751.341017;
      doubleArray0[1] = 1751.341017;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve((-1070.8643731093912), 1751.341017);
      assertEquals((-1.0), double0, 0.01);
      
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 1751.341017;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve((-1070.8643731093912), 1751.341017);
      assertEquals(0.0, double0, 0.01);
      
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.asin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0E-6;
      doubleArray0[3] = 0.5;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve((-5126.5786), 1.0E-6, (-893.55869465894));
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.I;
      Complex[] complexArray0 = new Complex[2];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
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
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.INF;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve(2357.0, 1.0E-6, (-1.0));
      Complex[] complexArray0 = new Complex[9];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      complexArray0[6] = complex0;
      complexArray0[7] = complex0;
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
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1751.341017;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ZERO;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      complex0.acos();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(4499.898119115, 1751.341017, 1751.341017);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [4499.898119115,1751.341017]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      boolean boolean0 = laguerreSolver0.isRootOK((-1389.0331052225), (-103.4), complex0);
      assertFalse(boolean0);
      
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-898.192600846);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve((-898.192600846), 0.0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, 902.8744);
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
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0E-6;
      doubleArray0[2] = 646.489934962;
      doubleArray0[3] = 0.5;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve((-5126.5786), 1.0E-6, (-893.55869465894));
      assertEquals((-1292.9798699240012), double0, 0.01);
      
      double double1 = laguerreSolver0.solve((-2266.576), 646.489934962);
      assertEquals((-1292.9798699240014), double1, 0.01);
  }
}
