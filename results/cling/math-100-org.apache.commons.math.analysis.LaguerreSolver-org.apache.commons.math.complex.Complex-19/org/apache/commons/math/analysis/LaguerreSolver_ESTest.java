/*

 * Tue Mar 03 15:32:17 GMT 2020
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
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      Complex[] complexArray0 = new Complex[4];
      Complex complex1 = Complex.NaN;
      complex1.asin();
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
  public void test01()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      Complex complex0 = Complex.NaN;
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
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cosh();
      assertEquals(0.5403023058681398, complex1.abs(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex[] complexArray0 = new Complex[7];
      Complex complex0 = Complex.I;
      complexArray0[0] = complex0;
      complexArray0[1] = complexArray0[0];
      Complex complex1 = complexArray0[1].tan();
      assertEquals(0.761594155955765, complex1.abs(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.761594155955765, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[8];
      Complex complex0 = Complex.INF;
      complexArray0[1] = complex0;
      Complex complex1 = Complex.NaN;
      Complex complex2 = new Complex(0.5, Double.NaN);
      complex1.acos();
      complexArray0[3] = complex2;
      complexArray0[7] = complexArray0[3];
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray0, complexArray0[1]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[8];
      Complex complex0 = Complex.INF;
      complexArray0[1] = complex0;
      Complex complex1 = new Complex(0.5, Double.NaN);
      complexArray0[3] = complex1;
      Complex complex2 = Complex.ZERO;
      complexArray0[4] = complex2;
      complexArray0[5] = complex0;
      complexArray0[6] = complexArray0[4];
      complexArray0[7] = complexArray0[1];
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray0, complex2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 0.5;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      complex0.pow(complex0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((-1055.554112829783), 757.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-1055.554112829783,757.5]  Values: [0.5,0.5]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      Complex complex0 = new Complex((-2522.3982351764), 1400.5212870700009);
      complex0.sqrt1z();
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
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[8];
      Complex complex0 = Complex.NaN;
      complexArray0[0] = complex0;
      complexArray0[0].cos();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray0, complexArray0[1]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex0;
      complexArray0[0].cos();
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
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      assertEquals(Double.NaN, complex1.abs(), 0.01);
      
      Complex complex2 = complex0.conjugate();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.abs(), 0.01);
      assertFalse(complex2.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[5];
      Complex complex0 = Complex.ONE;
      complexArray0[0] = complex0;
      complexArray0[1] = complexArray0[0];
      complexArray0[2] = complexArray0[0];
      Complex complex1 = Complex.ZERO;
      complexArray0[3] = complex1;
      Complex complex2 = Complex.INF;
      complexArray0[4] = complex2;
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
  public void test13()  throws Throwable  {
      Complex[] complexArray0 = new Complex[8];
      Complex complex0 = Complex.NaN;
      complexArray0[0] = complex0;
      Complex complex1 = complexArray0[0].negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex[] complexArray0 = new Complex[7];
      Complex complex0 = Complex.I;
      complexArray0[0] = complex0;
      Complex complex1 = complex0.pow(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.20787957635076193, complex1.getReal(), 0.01);
      
      Complex complex2 = complexArray0[0].conjugate();
      assertEquals((-1.0), complex2.getImaginary(), 0.01);
      assertEquals(1.0, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[7];
      Complex complex0 = Complex.ZERO;
      complex0.pow(complex0);
      Complex[] complexArray1 = new Complex[0];
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray1, complexArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Polynomial degree must be positive: degree=-1
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[7];
      Complex complex0 = Complex.I;
      complexArray0[0] = complex0;
      complexArray0[0].pow(complexArray0[0]);
      Complex[] complexArray1 = new Complex[0];
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray1, complex0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Polynomial degree must be positive: degree=-1
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[7];
      Complex complex0 = Complex.I;
      complexArray0[0] = complex0;
      Complex complex1 = complexArray0[0].conjugate();
      Complex complex2 = Complex.INF;
      complexArray0[5] = complex2;
      complexArray0[6] = complex1;
      // Undeclared exception!
      try { 
        laguerreSolver0.solveAll(complexArray0, complexArray0[0]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[7];
      Complex complex0 = Complex.I;
      complexArray0[0] = complex0;
      Complex complex1 = Complex.ZERO;
      complexArray0[1] = complex1;
      Complex complex2 = complex1.pow(complex1);
      complexArray0[2] = complex0;
      complexArray0[3] = complex2;
      complexArray0[4] = complex0;
      complexArray0[5] = complexArray0[0];
      complexArray0[6] = complexArray0[1];
      // Undeclared exception!
      laguerreSolver0.solveAll(complexArray0, complex1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-757.092405127548);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      complex0.pow(complex0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(806.0, 870.2905431489415);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [806.0,870.2905431489415]  Values: [-757.092405127548,-757.092405127548]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-757.092405127548);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ZERO;
      complex0.pow(complex0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(1.0, (-757.092405127548), (-827.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1.0,-757.092405127548]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      laguerreSolver0.solveAll(doubleArray0, 3696.4553273545157);
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
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[8];
      Complex complex0 = Complex.NaN;
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complexArray0[1];
      complex0.acos();
      complexArray0[3] = complexArray0[2];
      Complex complex1 = Complex.ZERO;
      complexArray0[4] = complex1;
      complexArray0[5] = complexArray0[0];
      complexArray0[6] = complexArray0[3];
      complexArray0[7] = complexArray0[0];
      // Undeclared exception!
      laguerreSolver0.solve(complexArray0, complex1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      Complex[] complexArray0 = new Complex[4];
      double[] doubleArray1 = new double[6];
      doubleArray1[5] = 3696.4553273545157;
      laguerreSolver0.solveAll(doubleArray1, 3696.4553273545157);
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
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[7];
      Complex complex0 = Complex.I;
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      Complex complex1 = complex0.pow(complex0);
      assertEquals(0.20787957635076193, complex1.abs(), 0.01);
      
      complexArray0[2] = complexArray0[1];
      complexArray0[3] = complexArray0[0];
      complexArray0[4] = complexArray0[1];
      complexArray0[5] = complex0;
      complexArray0[6] = complex0;
      Complex[] complexArray1 = laguerreSolver0.solveAll(complexArray0, complexArray0[0]);
      assertEquals(6, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      laguerreSolver0.isRootOK((-2232.821), (-1376.0), complex0);
      Complex[] complexArray0 = new Complex[5];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complexArray0[1];
      complexArray0[4] = complex0;
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
  public void test26()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
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
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[8];
      Complex complex0 = Complex.NaN;
      complexArray0[0] = complex0;
      Complex complex1 = Complex.INF;
      complexArray0[1] = complex1;
      complexArray0[2] = complex1;
      complexArray0[3] = complexArray0[1];
      complexArray0[4] = complexArray0[0];
      complexArray0[5] = complexArray0[2];
      complexArray0[6] = complex1;
      complex1.atan();
      complexArray0[7] = complex0;
      // Undeclared exception!
      laguerreSolver0.solveAll(complexArray0, complex0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 0.5;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[8];
      Complex complex0 = Complex.NaN;
      complexArray0[0] = complex0;
      complexArray0[0].acos();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(Double.NaN, 1899.507308649, Double.NaN);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [NaN,1899.507308649]  Values: [NaN,0.5]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[5];
      Complex complex0 = Complex.ONE;
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complexArray0[0];
      complexArray0[3] = complex0;
      Complex complex1 = Complex.INF;
      complexArray0[4] = complex1;
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
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[8];
      Complex complex0 = Complex.NaN;
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complex0.acos();
      complexArray0[3] = complexArray0[2];
      complexArray0[4] = complexArray0[3];
      complexArray0[5] = complexArray0[3];
      complexArray0[6] = complexArray0[3];
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
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-75.06437963);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      complex0.acos();
      try { 
        laguerreSolver0.solveAll(doubleArray0, 0.465076753867379);
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
      Complex[] complexArray0 = new Complex[8];
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertTrue(complex1.isNaN());
      
      Complex complex2 = Complex.ONE;
      complexArray0[6] = complex2;
      Complex complex3 = complexArray0[6].atan();
      assertEquals(0.7853981633974483, complex3.getReal(), 0.01);
      assertEquals(0.7853981633974483, complex3.abs(), 0.01);
      assertEquals(0.0, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[7];
      Complex complex0 = Complex.I;
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[0].conjugate();
      complexArray0[3] = complexArray0[0];
      Complex complex1 = Complex.NaN;
      complexArray0[4] = complex1;
      complexArray0[5] = complexArray0[2];
      complexArray0[6] = complexArray0[5];
      // Undeclared exception!
      laguerreSolver0.solveAll(complexArray0, complexArray0[0]);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertTrue(complex1.isNaN());
      
      double double0 = laguerreSolver0.solve(Double.NaN, 1899.507308649, Double.NaN);
      assertEquals(1899.507308649, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-757.092405127548);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[7];
      Complex complex0 = Complex.I;
      complexArray0[0] = complex0;
      complexArray0[0].asin();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(806.0, 870.2905431489415);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [806.0,870.2905431489415]  Values: [-757.092405127548,-757.092405127548]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Complex[] complexArray0 = new Complex[8];
      Complex complex0 = Complex.NaN;
      complexArray0[0] = complex0;
      Complex complex1 = complexArray0[0].acos();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      
      Complex complex2 = new Complex((-1376.0), 1899.507308649);
      Complex complex3 = complex2.atan();
      assertEquals((-1.5705462133474761), complex3.getReal(), 0.01);
      assertEquals(1.570546251299796, complex3.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex1.abs(), 0.01);
      
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 0.465076753867379);
      assertEquals(3, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[8];
      Complex complex0 = Complex.NaN;
      complexArray0[0] = complex0;
      Complex complex1 = Complex.INF;
      complexArray0[1] = complex1;
      complexArray0[2] = complexArray0[1];
      Complex complex2 = new Complex(0.5, Double.NaN);
      complexArray0[3] = complex2;
      complexArray0[4] = complex1;
      complexArray0[5] = complexArray0[0];
      complexArray0[6] = complexArray0[4];
      complexArray0[7] = complexArray0[3];
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
}
