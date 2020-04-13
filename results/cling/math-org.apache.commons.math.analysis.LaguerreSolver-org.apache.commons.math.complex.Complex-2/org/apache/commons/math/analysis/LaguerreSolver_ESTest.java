/*

 * Tue Mar 03 15:27:18 GMT 2020
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
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tan();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.tan();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      Complex complex0 = new Complex(1.0E-15, (-2119.0));
      complex0.tanh();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 329.92708222777);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 1.0E-15;
      Complex complex0 = new Complex(1.0E-15, (-2119.0));
      Complex complex1 = complex0.tanh();
      assertEquals((-2119.0), complex0.getImaginary(), 0.01);
      assertEquals((-235.5783742020402), complex1.getImaginary(), 0.01);
      assertEquals(5.545381193409201E-11, complex1.getReal(), 0.01);
      assertEquals(1.0E-15, complex0.getReal(), 0.01);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve((-811.0), 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = new Complex((-1567.69132), (-786.6915390911));
      boolean boolean0 = laguerreSolver0.isRootOK(2.5421149729252077E-13, 2588.8006790842, complex0);
      assertFalse(boolean0);
      
      Complex complex1 = complex0.exp();
      assertEquals((-786.6915390911), complex0.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1754.0067424274246, complex0.abs(), 0.01);
      assertEquals(0.0, complex1.abs(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double[] doubleArray0 = new double[5];
      complex0.tanh();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[5];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complexArray0[1];
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
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
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = 2445.8075934486724;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      complex0.sinh();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((-2119.0), (-912.272234916504));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-2119.0,-912.272234916504]  Values: [2445.8075934486724,2445.8075934486724]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 2445.8075934486724;
      doubleArray0[1] = 764.61;
      doubleArray0[3] = 2445.8075934486724;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tanh();
      assertEquals(0.761594155955765, complex1.getReal(), 0.01);
      assertEquals(0.761594155955765, complex1.abs(), 0.01);
      
      double double0 = laguerreSolver0.solve((-2568.5), 0.06343997089155973);
      assertEquals((-0.89620897283039), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[16];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve(0.0, 0.0, 1.0E-15);
      Complex[] complexArray0 = new Complex[9];
      Complex complex0 = Complex.INF;
      complexArray0[4] = complex0;
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray0, complexArray0[4]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = new Complex((-1567.69132), (-786.6915390911));
      Complex[] complexArray0 = new Complex[7];
      complex0.atan();
      // Undeclared exception!
      try { 
        laguerreSolver0.solveAll(complexArray0, complexArray0[4]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 1.0E-15;
      Complex complex0 = new Complex(1.0E-15, (-2119.0));
      Complex complex1 = complex0.tanh();
      assertEquals(5.545381193409201E-11, complex1.getReal(), 0.01);
      assertEquals(235.5783742020402, complex1.abs(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve((-126.0), 388.4787867);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[1];
      Complex complex0 = Complex.ONE;
      complex0.sinh();
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
  public void test12()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.tanh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[16];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve(0.0, 0.0, 1.0E-15);
      Complex[] complexArray0 = new Complex[9];
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.I;
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
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      boolean boolean0 = laguerreSolver0.isRootOK(1.262737356962647E-16, 764.61, complex0);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertTrue(boolean0);
      
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, Double.NEGATIVE_INFINITY);
      assertEquals(9, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[16];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[9];
      Complex complex0 = Complex.NaN;
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      Complex complex1 = Complex.ZERO;
      complexArray0[2] = complex1;
      Complex complex2 = new Complex(0.0, (-161.2637));
      complexArray0[3] = complex2;
      Complex complex3 = Complex.INF;
      complexArray0[4] = complex3;
      complexArray0[5] = complex2;
      complexArray0[6] = complexArray0[4];
      complexArray0[7] = complex3;
      complexArray0[8] = complexArray0[7];
      try { 
        laguerreSolver0.solve(complexArray0, complexArray0[3]);
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
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = new Complex((-1567.69132), (-786.6915390911));
      Complex[] complexArray0 = new Complex[7];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      Complex complex1 = complex0.exp();
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      complexArray0[6] = complex1;
      // Undeclared exception!
      laguerreSolver0.solveAll(complexArray0, complexArray0[0]);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = new Complex((-1567.69132), (-786.6915390911));
      Complex[] complexArray0 = new Complex[7];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      Complex complex1 = complex0.exp();
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      complexArray0[6] = complexArray0[0];
      laguerreSolver0.solveAll(complexArray0, complex1);
      assertEquals(1754.0067424274246, complex0.abs(), 0.01);
      assertEquals(0.0, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = Double.NEGATIVE_INFINITY;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = new Complex(4187.06340498, (-872.133209));
      laguerreSolver0.isRootOK(Double.NaN, Double.NEGATIVE_INFINITY, complex0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, (-523.7945886345865));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[16];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = new Complex((-3862.3), 0.0);
      Complex complex1 = complex0.cosh();
      boolean boolean0 = laguerreSolver0.isRootOK(618.44, (-4247.5618), complex1);
      assertEquals(Double.NaN, complex1.abs(), 0.01);
      assertFalse(boolean0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      Complex[] complexArray0 = new Complex[2];
      complexArray0[0] = complex0;
      Complex complex1 = complex0.cos();
      assertEquals(1.5430806348152437, complex1.abs(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      
      complexArray0[1] = complex0;
      Complex[] complexArray1 = laguerreSolver0.solveAll(complexArray0, complex0);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertEquals(1, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      Complex complex0 = new Complex(1.0E-15, (-2119.0));
      Complex[] complexArray0 = new Complex[1];
      complex0.atan();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
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
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 764.61;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      
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
      Complex[] complexArray1 = laguerreSolver0.solveAll(complexArray0, complex0);
      assertEquals(8, complexArray1.length);
      
      double double0 = laguerreSolver0.solve((-944.56), 4.566397770529407E31);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-837.2);
      doubleArray0[2] = (-1270.51436);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, (-4.9E-324));
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
      double[] doubleArray0 = new double[10];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      Complex[] complexArray0 = new Complex[9];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      Complex complex1 = Complex.I;
      complexArray0[2] = complex1;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex0;
      Complex complex2 = complex0.sinh();
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.1752011936438014, complex2.abs(), 0.01);
      
      complexArray0[6] = complex0;
      complexArray0[7] = complex0;
      complexArray0[8] = complex0;
      Complex[] complexArray1 = laguerreSolver0.solveAll(complexArray0, complex0);
      assertEquals(8, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      Complex complex0 = new Complex(1.0E-15, (-2119.0));
      Complex complex1 = complex0.asin();
      assertEquals(4.71920664768965E-19, complex1.getReal(), 0.01);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 0.0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[4] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solveAll(doubleArray0, 0.0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(1078.45263988, 1.0E-15, 1.1470347698330876);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1078.45263988,1.0E-15]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[16];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve(0.0, 0.0, 1.0E-15);
      Complex[] complexArray0 = new Complex[9];
      Complex complex0 = Complex.NaN;
      complexArray0[0] = complex0;
      complexArray0[1] = complexArray0[0];
      complexArray0[2] = complexArray0[1];
      Complex complex1 = new Complex(0.0, (-161.2637));
      complexArray0[3] = complex1;
      complexArray0[4] = complex0;
      complexArray0[5] = complexArray0[0];
      complexArray0[6] = complexArray0[3];
      complexArray0[7] = complexArray0[4];
      complexArray0[8] = complexArray0[7];
      try { 
        laguerreSolver0.solve(complexArray0, complexArray0[3]);
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
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve((-811.0), 0.0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 0.0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.NaN;
      complex0.acos();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 158.0404711556029);
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 764.61;
      doubleArray0[3] = 2445.8075934486724;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.tanh();
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(0.761594155955765, complex1.abs(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      
      double double0 = laguerreSolver0.solve((-2568.5), 0.06343997089155973);
      assertEquals((-5.0487097934144756E-29), double0, 0.01);
  }
}
