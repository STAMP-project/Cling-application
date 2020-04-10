/*

 * Tue Mar 03 15:39:54 GMT 2020
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
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      Complex complex0 = Complex.ONE;
      complex0.asin();
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
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertTrue(complex1.isNaN());
      
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 620.771276784893;
      doubleArray1[1] = (-2686.951224020958);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray1, 620.771276784893);
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.cosh();
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.tan();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      Complex complex0 = Complex.INF;
      complex0.exp();
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
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-3127.1589925982967);
      Complex complex0 = Complex.INF;
      complex0.asin();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, (-2889.051620376053));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      Complex complex0 = Complex.ONE;
      complex0.cos();
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
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Complex complex0 = Complex.INF;
      complex0.sinh();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve(2121.2308615043, 2121.2308615043, 1314.8);
      assertEquals(2121.2308615043, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex0.sin();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex1.tanh();
      Complex complex3 = complex2.divide(complex0);
      assertSame(complex3, complex0);
      assertEquals(0.761594155955765, complex2.abs(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.761594155955765, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      Complex complex0 = Complex.I;
      complex0.atan();
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
  public void test12()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      Complex complex0 = new Complex(Double.NaN, 0.0);
      complex0.atan();
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
  @Ignore
  public void test13()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.conjugate();
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = (-950.793288076969);
      doubleArray0[5] = 2114.005;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, (-110.56915));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
      
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex2.sinh();
      assertTrue(complex3.equals((Object)complex2));
      assertFalse(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      Complex complex0 = Complex.NaN;
      complex0.asin();
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
  public void test16()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.asin();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-569.7);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((-569.7), (-569.7), (-569.7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-569.7,-569.7]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.acos();
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
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
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Complex complex0 = Complex.INF;
      complex0.exp();
      assertFalse(complex0.isNaN());
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve(2121.2308615043, 2121.2308615043, 1314.8);
      assertEquals(2121.2308615043, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      
      Complex complex2 = complex0.exp();
      assertEquals(2.718281828459045, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      Complex complex0 = Complex.INF;
      complex0.sinh();
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
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-1.835340193808747E13));
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.NaN;
      complex1.sin();
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
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tanh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex0.conjugate();
      assertSame(complex2, complex0);
      
      Complex complex3 = complex1.exp();
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertEquals(2.718281828459045, complex3.abs(), 0.01);
      assertEquals(2.718281828459045, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.conjugate();
      assertEquals(0.0, complex1.getReal(), 0.01);
      
      Complex complex2 = complex0.exp();
      assertEquals(0.8414709848078965, complex2.getImaginary(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
      assertEquals(0.5403023058681398, complex2.getReal(), 0.01);
      assertEquals(1.0, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = new Complex(1.0, 1.0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[7];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      complexArray0[6] = complex0;
      laguerreSolver0.solveAll(complexArray0, complex0);
      assertEquals(1.4142135623730951, complex0.abs(), 0.01);
      
      Complex complex1 = complexArray0[1].atan();
      assertEquals(1.0939075288148181, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = new Complex((-1.4890911460047909), (-1.4890911460047909));
      Complex complex1 = complex0.sinh();
      assertEquals((-2.3215504864701986), complex1.getImaginary(), 0.01);
      assertEquals((-0.17169556578725342), complex1.getReal(), 0.01);
      assertEquals(2.3278908970441505, complex1.abs(), 0.01);
      
      Complex complex2 = complex0.asin();
      assertEquals((-0.7296088723613988), complex2.getReal(), 0.01);
      assertEquals((-1.4425675545737098), complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      laguerreSolver0.isRootOK((-1559.927010186073), 4.9E-324, complex0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1559.927010186073);
      doubleArray1[2] = (-1559.927010186073);
      try { 
        laguerreSolver0.solveAll(doubleArray1, 2870.5381074);
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
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ZERO;
      complex0.exp();
      Complex complex1 = Complex.INF;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
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
  public void test30()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      Complex complex0 = Complex.INF;
      complex0.asin();
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
  public void test31()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.sqrt1z();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-569.7);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((-569.7), (-569.7), (-569.7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-569.7,-569.7]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertTrue(complex1.isNaN());
      
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = (-2686.951224020958);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray1, 620.771276784893);
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.subtract(complex0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 124.9423648107398;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(2321.0, (-1496.151));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2321.0,-1496.151]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.exp();
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
      assertEquals(1.0, complex1.abs(), 0.01);
      
      Complex complex2 = complex0.atan();
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.ONE;
      complex0.exp();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[2];
      complexArray0[0] = complex1;
      complexArray0[1] = complex0;
      laguerreSolver0.solveAll(complexArray0, complex0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      Complex[] complexArray0 = new Complex[7];
      Complex complex0 = Complex.NaN;
      complex0.subtract(complexArray0[0]);
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
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-1.835340193808747E13));
      Complex complex0 = Complex.I;
      laguerreSolver0.isRootOK((-3446.6543), 1462.1147011282999, complex0);
      Complex complex1 = Complex.INF;
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
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      laguerreSolver0.isRootOK(442.76215, 2.1079363535939672E9, complex0);
      double[] doubleArray1 = new double[5];
      doubleArray1[4] = 2.1079363535939672E9;
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray1, 2.1079363535939672E9);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.acos();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 124.9423648107398;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(2321.0, (-1496.151));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2321.0,-1496.151]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sin();
      complex1.sqrt1z();
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
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      laguerreSolver0.isRootOK((-632.137), 0.0, complex0);
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
  @Ignore
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      complex0.acos();
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 620.771276784893;
      laguerreSolver0.solveAll(doubleArray1, 620.771276784893);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 124.9423648107398;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(2321.0, (-1496.151));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2321.0,-1496.151]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = Complex.ZERO;
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex2;
      complexArray0[1] = complex0;
      complexArray0[2] = complex1;
      complexArray0[3] = complex1;
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
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-1.4890911460047909));
      assertEquals(2, complexArray0.length);
      
      Complex complex0 = new Complex((-1.4890911460047909), (-1.4890911460047909));
      Complex complex1 = laguerreSolver0.solve(complexArray0, complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-1.0), complex1.getReal(), 0.01);
      
      Complex complex2 = complex0.cos();
      assertEquals(2.105326059736015, complex2.abs(), 0.01);
      assertEquals(2.10589289428967, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      Complex complex2 = complex0.acos();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      complex0.acos();
      double[] doubleArray1 = new double[2];
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray1, 620.771276784893);
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
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Complex complex0 = Complex.INF;
      complex0.exp();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-1.0));
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve(4.547473508864641E-13, 1.0E-6, 0.2919265817264288);
      assertEquals(4.547473508864641E-13, double0, 0.01);
      
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.asin();
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.8620958891185866, complex2.abs(), 0.01);
      assertEquals(1.5707963267948966, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (-196.26456117342684);
      doubleArray0[4] = 1.0;
      doubleArray0[7] = (-196.26456117342684);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 4.9E-324);
      assertEquals(7, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sinh();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertFalse(complex1.isInfinite());
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-1.0));
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ONE;
      Complex[] complexArray0 = new Complex[7];
      complexArray0[0] = complex0;
      complexArray0[1] = complex1;
      complex1.sinh();
      complexArray0[2] = complex1;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex1;
      complexArray0[6] = complex0;
      // Undeclared exception!
      laguerreSolver0.solve(complexArray0, complex1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      boolean boolean0 = laguerreSolver0.isRootOK((-3446.6543), 1462.1147011282999, complex0);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(boolean0);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.sin();
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.subtract(complex0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 124.9423648107398;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(1035.34766, 124.9423648107398, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1035.34766,124.9423648107398]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = new Complex(1.0, 1.0);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertEquals(1.0, complex0.getReal(), 0.01);
      
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[7];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      complexArray0[6] = complex0;
      Complex complex1 = laguerreSolver0.solve(complexArray0, complex0);
      Complex complex2 = complex1.asin();
      assertEquals(0.7818314824680299, complex1.getImaginary(), 0.01);
      assertEquals(1.4142135623730951, complex0.abs(), 0.01);
      assertEquals(0.7970859172833058, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (-3127.1589925982967);
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve((-3127.1589925982967), 2889.38242437226);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-1.835340193808747E13));
      laguerreSolver0.solve(4.547473508864641E-13, 1.0E-6, 0.2919265817264288);
      Complex complex0 = Complex.INF;
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
  public void test58()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve((-725.2757459965102), 620.771276784893, Double.NaN);
      assertEquals((-725.2757459965102), double0, 0.01);
      
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.acos();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 124.9423648107398;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(1035.34766, 124.9423648107398, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1035.34766,124.9423648107398]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertEquals(Double.NaN, complex1.abs(), 0.01);
      
      boolean boolean0 = laguerreSolver0.isRootOK(620.771276784893, 2.0, complex0);
      assertTrue(complex0.isNaN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.atan();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-569.7);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((-569.7), (-569.7), (-569.7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-569.7,-569.7]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.cos();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-569.7);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((-569.7), (-569.7), (-569.7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-569.7,-569.7]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex1.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[9];
      Complex complex0 = Complex.ZERO;
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complexArray0[1];
      complexArray0[4] = complexArray0[3];
      complexArray0[5] = complexArray0[2];
      complexArray0[6] = complex0;
      complexArray0[7] = complexArray0[0];
      Complex complex1 = new Complex(0.0, Double.NaN);
      complexArray0[8] = complex1;
      try { 
        laguerreSolver0.solve(complexArray0, complexArray0[0]);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 124.9423648107398;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(1035.34766, 124.9423648107398, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1035.34766,124.9423648107398]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-3127.1589925982967);
      doubleArray0[2] = (-283.42316119526276);
      doubleArray0[5] = 93.5867744;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve((-3127.1589925982967), 54.6900089, 2.0);
      assertEquals(2.1654583660067614, double0, 0.01);
  }
}
