/*

 * Tue Mar 03 15:30:55 GMT 2020
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
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, (-2015.2045633751), 0.5, (-390));
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
      Complex[] complexArray0 = new Complex[6];
      Complex complex0 = Complex.INF;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
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
  public void test02()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 3.0, 4.9E-324, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      complex0.atan();
      try { 
        FastFourierTransformer.verifyInterval(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-Infinity, -Infinity]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      try { 
        FastFourierTransformer.verifyInterval(10.0, 10.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [10.0, 10.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertTrue(complex1.isNaN());
      
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex2.log();
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertTrue(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertEquals(Double.NaN, complex1.abs(), 0.01);
      
      Complex complex2 = new Complex((-364.0), (-0.38109784554181547));
      Complex complex3 = complex2.asin();
      assertEquals(6.7746707141657225, complex3.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[0];
      try { 
        fastFourierTransformer0.inversetransform(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      complex0.asin();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      Complex[] complexArray1 = fastFourierTransformer0.transform(complexArray0);
      assertNotSame(complexArray1, complexArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = Complex.I;
      complex1.pow(complex0);
      Complex[] complexArray0 = new Complex[5];
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
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = Complex.I;
      complex1.pow(complex0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, (-1743.13), (-6));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = complex0.atan();
      complex0.pow(complex1);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, (double) 2182L, 3957.66, (-1431655765));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = complex0.sqrt1z();
      complex1.cosh();
      try { 
        FastFourierTransformer.sample(polynomialFunction0, 631.2170934808, (-364.0), (-12));
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
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = Complex.I;
      Complex complex2 = complex1.pow(complex0);
      Complex complex3 = complex1.asin();
      Complex complex4 = complex3.pow(complex2);
      assertEquals(0.8813735870195428, complex3.getImaginary(), 0.01);
      assertNotSame(complex4, complex2);
      assertEquals(1.0, complex1.abs(), 0.01);
      assertEquals(0.8813735870195428, complex3.abs(), 0.01);
      assertEquals(Double.NaN, complex4.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.asin();
      try { 
        FastFourierTransformer.verifyInterval(10.0, 10.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [10.0, 10.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.asin();
      try { 
        FastFourierTransformer.verifyInterval(10.0, 10.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [10.0, 10.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex1.asin();
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[10];
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
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
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = FastFourierTransformer.sample(polynomialFunction0, (-1.0), 2.0, 37);
      assertEquals(37, doubleArray1.length);
      
      Complex complex0 = Complex.INF;
      complex0.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.acos();
      try { 
        FastFourierTransformer.verifyInterval(37, 37);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [37.0, 37.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.acos();
      try { 
        FastFourierTransformer.verifyInterval(504.5933, 0.4142135623730949);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [504.5933, 0.4142135623730949]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = complex0.sqrt1z();
      complex1.asin();
      try { 
        FastFourierTransformer.sample(polynomialFunction0, 631.2170934808, (-364.0), (-12));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      complex0.asin();
      try { 
        FastFourierTransformer.sample(polynomialFunction0, 631.2170934808, (-364.0), (-12));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = complex0.pow(complex0);
      complex1.asin();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, (double) 10, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      complex0.atan();
      Complex[] complexArray0 = new Complex[6];
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
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.fft(doubleArray0, false);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.NaN;
      complex0.acos();
      try { 
        FastFourierTransformer.sample(polynomialFunction0, 631.2170934808, (-364.0), (-12));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = new Complex((-440.8233878185577), (-440.8233878185577));
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      complex0.acos();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, 187.0, 187.0, (-224));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex[] complexArray0 = fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, (-580.0040654849731), (double) 3724, 1);
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, (double) 10, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex1.sqrt1z();
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
      assertEquals(0.0, complex0.abs(), 0.01);
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = new Complex(0.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = Complex.I;
      complex1.pow(complex0);
      try { 
        FastFourierTransformer.sample(polynomialFunction0, (-1.0), Double.NEGATIVE_INFINITY, 1182);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-1.0, -Infinity]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.atan();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.abs(), 0.01);
      
      Complex complex3 = Complex.NaN;
      Complex complex4 = complex3.acos();
      assertTrue(complex4.isNaN());
      assertFalse(complex4.isInfinite());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = complex0.sqrt1z();
      complex1.acos();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      
      Complex complex2 = new Complex((-364.0), (-0.38109784554181547));
      Complex complex3 = complex2.asin();
      assertEquals((-6.590299709423128), complex3.getImaginary(), 0.01);
      assertEquals((-1.5697493511233347), complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      complex0.cos();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      Complex[] complexArray1 = fastFourierTransformer0.transform(complexArray0);
      assertEquals(2, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = Complex.I;
      complex1.pow(complex0);
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, 167.902322461094, 32);
      assertEquals(32, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = complex0.sqrt1z();
      complex1.acos();
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.I;
      fastFourierTransformer0.inversetransform(doubleArray0);
      Complex complex1 = complex0.acos();
      assertEquals(1.8011719796199461, complex1.abs(), 0.01);
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[3];
      Complex complex0 = Complex.ZERO;
      complex0.acos();
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
  public void test41()  throws Throwable  {
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.pow(complex1);
      Complex complex3 = complex1.pow(complex0);
      assertTrue(complex3.equals((Object)complex2));
      assertTrue(complex0.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(1.0, complex1.abs(), 0.01);
      assertEquals(2.0, complex0.getReal(), 0.01);
      assertNotSame(complex3, complex2);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Complex complex0 = new Complex(6.283185307179586, Double.NaN);
      Complex complex1 = complex0.atan();
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      complex0.atan();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, 167.902322461094, 32);
      assertEquals(32, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.sqrt1z();
      assertSame(complex2, complex1);
      
      Complex complex3 = complex0.log();
      assertEquals(0.0, complex3.getReal(), 0.01);
      assertEquals(1.5707963267948966, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = complex0.atan();
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex2.pow(complex1);
      assertEquals(2.0, complex0.getReal(), 0.01);
      assertSame(complex3, complex1);
      assertEquals(0.0, complex2.abs(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.negate();
      Complex complex2 = complex1.atan();
      assertEquals(Double.POSITIVE_INFINITY, complex2.abs(), 0.01);
      
      Complex complex3 = complex1.acos();
      assertEquals(1.0, complex1.abs(), 0.01);
      assertEquals(1.5707963267948966, complex3.getReal(), 0.01);
      assertEquals(1.8011719796199457, complex3.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.atan();
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex0.getImaginary(), 0.01);
      
      Complex complex3 = complex1.asin();
      assertEquals(0.8813735870195428, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.cosh();
      Complex complex2 = complex0.subtract(complex1);
      assertNotSame(complex2, complex1);
      
      Complex complex3 = complex0.pow(complex0);
      assertTrue(complex3.equals((Object)complex2));
      assertTrue(complex3.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertNotSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.sqrt1z();
      assertEquals(1.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.abs(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      
      Complex complex3 = complex0.sqrt1z();
      assertEquals(Double.NaN, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex2 = complex0.pow(complex1);
      complex2.asin();
      double[] doubleArray0 = new double[0];
      try { 
        fastFourierTransformer0.inversetransform(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      complex0.asin();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, (double) 10, 10);
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
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex0.multiply(complex1);
      complex2.pow(complex0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, (double) 10, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = complex0.atan();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      complex0.pow(complex1);
      Complex[] complexArray1 = fastFourierTransformer0.transform2(complexArray0);
      assertNotSame(complexArray0, complexArray1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, (-3722.482), (double) 37, 37);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[3];
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
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.asin();
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, 3.141592653589793, 2441.9384315, 12);
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
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(2.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = complex0.sqrt1z();
      complex1.cosh();
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }
}
