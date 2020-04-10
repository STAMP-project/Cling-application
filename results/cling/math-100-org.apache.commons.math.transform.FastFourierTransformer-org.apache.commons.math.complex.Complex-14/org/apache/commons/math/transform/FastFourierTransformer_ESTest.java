/*

 * Tue Mar 03 15:31:01 GMT 2020
 */

package org.apache.commons.math.transform;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.transform.FastFourierTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FastFourierTransformer_ESTest extends FastFourierTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.cos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, (-615.94), 1.0, (-1326));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, 1794.2, (-2185.3), (-1937));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[10];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, (-1483.292359), (-1483.292359), 721);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-1483.292359, -1483.292359]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertTrue(complex1.isNaN());
      
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex2.log();
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertTrue(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      complex1.cosh();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.acos();
      Complex[] complexArray0 = new Complex[6];
      try { 
        fastFourierTransformer0.inversetransform2(complexArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      complex0.acos();
      Complex[] complexArray0 = new Complex[19];
      try { 
        fastFourierTransformer0.fft(complexArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ZERO;
      complex0.atan();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.I;
      complex0.atan();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      complex0.asin();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.INF;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.exp();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.exp();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, 1794.2, (-2185.3), (-1937));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      complex1.cosh();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 6.283185307179586, 6.283185307179586, (-514));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      assertSame(complex2, complex1);
      
      Complex complex3 = complex0.log();
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertTrue(complex3.isInfinite());
      assertEquals(0.0, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Complex complex0 = Complex.ZERO;
      complex0.atan();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, (-1334.9462921), (-1334.9462921), (-712));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.NaN;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 4731);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [0.0, 0.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.INF;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, 1170.54724327295, 1170.54724327295, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1170.54724327295, 1170.54724327295]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex2.log();
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.ZERO;
      complexArray0[0] = complex0;
      Complex complex1 = Complex.INF;
      complexArray0[1] = complex1;
      complexArray0[2] = complex1;
      complexArray0[3] = complex1;
      fastFourierTransformer0.transform2(complexArray0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = FastFourierTransformer.sample(polynomialFunction0, (-1.0), 1080, 4);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.I;
      complex0.cos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, 435.859, Double.NaN, 721);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.NaN;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 4731);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [0.0, 0.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.I;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, (-1164.622635), (-1164.622635), 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-1164.622635, -1164.622635]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.asin();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, (double) 721, (double) 721, (-2841));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.INF;
      complex0.asin();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, (double) 721, 4356.198802544244, 721);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.log();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[9];
      try { 
        fastFourierTransformer0.inversetransform2(complexArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.transform(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, (double) 108, (double) 108, (-869));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, (-3007.93568), 2.0, (-1412));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ZERO;
      complex0.log();
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = Double.NaN;
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertTrue(complex1.isNaN());
      
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex2.acos();
      assertEquals(1.5707963267948966, complex3.getReal(), 0.01);
      assertEquals(0.0, complex2.abs(), 0.01);
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.I;
      complex0.atan();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 4731);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [0.0, 0.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex1.abs(), 0.01);
      
      Complex complex2 = Complex.I;
      Complex complex3 = complex2.acos();
      assertEquals(1.8011719796199461, complex3.abs(), 0.01);
      assertEquals(1.0, complex2.abs(), 0.01);
      assertEquals((-0.8813735870195429), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.acos();
      assertTrue(complex2.isNaN());
      
      Complex complex3 = complex0.log();
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertTrue(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(0.0, complex1.abs(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      
      Complex complex2 = Complex.NaN;
      Complex complex3 = complex2.acos();
      assertTrue(complex3.isNaN());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.INF;
      complex0.cos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.ZERO;
      complex0.cos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.acos();
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 1119.664185, (double) 2171L, 31);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586, Double.NaN);
      Complex complex1 = complex0.asin();
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      assertSame(complex2, complex1);
      
      Complex complex3 = complex0.acos();
      assertEquals(0.0, complex0.abs(), 0.01);
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.ONE;
      complex0.atan();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, (-2470.9913764423), (-2139.0), 1887);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      
      Complex complex2 = Complex.ONE;
      Complex complex3 = complex2.asin();
      assertEquals(1.5707963267948966, complex3.getReal(), 0.01);
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(1.8011719796199461, complex1.abs(), 0.01);
      assertEquals(1.0, complex0.abs(), 0.01);
      
      Complex complex2 = Complex.NaN;
      Complex complex3 = complex2.acos();
      assertEquals(Double.NaN, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      assertTrue(complex1.isInfinite());
      
      Complex complex2 = complex0.acos();
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.sqrt1z();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex2.asin();
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getReal(), 0.01);
      assertEquals(0.0, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.NaN;
      complex0.asin();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, (-898.02649506), Double.NaN, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ONE;
      complex0.acos();
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ONE;
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 1119.664185, (double) 2171L, 31);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
      
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, 0.5, 1837.5015, 1);
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      complex1.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[3];
      try { 
        fastFourierTransformer0.fft(complexArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.NaN;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(Double.NaN, Double.NaN);
      complex0.exp();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 1119.664185, (double) 2171L, 31);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cosh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
      assertEquals(0.5403023058681398, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[9];
      try { 
        fastFourierTransformer0.inversetransform2(complexArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.exp();
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(4, complexArray0.length);
  }
}
