/*

 * Tue Mar 03 15:32:10 GMT 2020
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
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ONE;
      complex0.cos();
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, (-642.395034), Double.NaN, (-1444));
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
      double[] doubleArray0 = new double[4];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.I;
      complexArray0[0] = complex0;
      Complex complex1 = Complex.NaN;
      complexArray0[1] = complex1;
      complexArray0[2] = complex0;
      complexArray0[3] = complexArray0[1];
      fastFourierTransformer0.transform(complexArray0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, (-875.862), (-875.862), 0);
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
      Complex complex0 = Complex.ONE;
      complex0.log();
      try { 
        FastFourierTransformer.verifyInterval(2758.0, 1.999999999999987);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2758.0, 1.999999999999987]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.multiply(complex0);
      complex0.subtract(complex2);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) null, (double) 1925, 2.0, 6626);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [1925.0, 2.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      Complex complex0 = Complex.NaN;
      complex0.pow(complex0);
      Complex[] complexArray1 = fastFourierTransformer0.fft(complexArray0);
      assertEquals(2, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.log();
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      
      Complex complex3 = complex0.asin();
      assertTrue(complex3.isNaN());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.log();
      Complex complex1 = complex0.asin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = new Complex(4.9E-324, 4.9E-324);
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.pow(complex1);
      assertEquals(4.9E-324, complex0.getImaginary(), 0.01);
      assertEquals(4.9E-324, complex0.abs(), 0.01);
      assertEquals(4.9E-324, complex0.getReal(), 0.01);
      
      Complex complex3 = complex1.asin();
      assertSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.NaN;
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      complex0.cosh();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      Complex[] complexArray1 = fastFourierTransformer0.fft(complexArray0);
      assertNotSame(complexArray0, complexArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      complex1.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[3];
      try { 
        fastFourierTransformer0.inversetransform(complexArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[0];
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
  public void test11()  throws Throwable  {
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex0.pow(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex2.abs(), 0.01);
      
      Complex complex3 = complex1.atan();
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertEquals(0.7853981633974483, complex3.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      Complex complex1 = Complex.ONE;
      complex1.multiply(complex0);
      double[] doubleArray0 = new double[1];
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      double[] doubleArray0 = new double[2];
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      Complex complex1 = complex0.sqrt1z();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.abs(), 0.01);
      
      Complex[] complexArray1 = fastFourierTransformer0.inversetransform(complexArray0);
      assertNotSame(complexArray1, complexArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      Complex complex1 = Complex.ONE;
      complex1.multiply(complex0);
      Complex[] complexArray0 = new Complex[0];
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
  public void test15()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals((-4.9E-324), complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      
      Complex[] complexArray0 = new Complex[1];
      Complex[] complexArray1 = fastFourierTransformer0.fft(complexArray0);
      assertNotSame(complexArray1, complexArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      Complex complex1 = Complex.ONE;
      complex1.multiply(complex0);
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, (-5));
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
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      assertEquals(1.8011719796199461, complex1.abs(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      
      Complex complex2 = complex0.atan();
      assertEquals(1.0, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      
      Complex complex2 = Complex.ONE;
      Complex complex3 = complex2.atan();
      assertEquals(0.7853981633974483, complex3.abs(), 0.01);
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertEquals(0.7853981633974483, complex3.getReal(), 0.01);
      assertEquals(1.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      complex0.cosh();
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, (-642.395034), Double.NaN, (-1444));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, (double) 3, (-3905.35193841), 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [3.0, -3905.35193841]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      complex0.atan();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, (-5));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 610.0, 610.0, 17);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [610.0, 610.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) null, 2.059306170823243, 2.059306170823243, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2.059306170823243, 2.059306170823243]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex2.pow(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(0.0, complex2.abs(), 0.01);
      assertTrue(complex3.equals((Object)complex1));
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = new Complex(4.9E-324, 4.9E-324);
      Complex complex1 = complex0.pow(complex0);
      assertEquals(1.0, complex1.abs(), 0.01);
      assertEquals((-3.67E-321), complex1.getImaginary(), 0.01);
      
      Complex complex2 = Complex.INF;
      Complex complex3 = complex2.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex2.abs(), 0.01);
      assertEquals(Double.NaN, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[2];
      Complex complex0 = Complex.ONE;
      complexArray0[0] = complex0;
      Complex complex1 = Complex.NaN;
      complexArray0[1] = complex1;
      fastFourierTransformer0.transform(complexArray0);
      Complex[] complexArray1 = new Complex[3];
      try { 
        fastFourierTransformer0.inversetransform(complexArray1);
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(complex0);
      double[] doubleArray0 = new double[1];
      complex1.pow(complex0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, (-5));
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
      Complex complex0 = Complex.INF;
      complex0.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = FastFourierTransformer.sample(polynomialFunction0, Double.NaN, (-4.9E-324), 1416);
      assertEquals(1416, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.sqrt1z();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      complex0.log();
      try { 
        FastFourierTransformer.verifyInterval(2758.0, 1.999999999999987);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2758.0, 1.999999999999987]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 610.0, 610.0, 17);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [610.0, 610.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      complex0.acos();
      try { 
        FastFourierTransformer.verifyInterval(2758.0, 1.999999999999987);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2758.0, 1.999999999999987]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.asin();
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) null, 2.0, Double.NaN, (-360));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ONE;
      complex0.asin();
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, (-642.395034), Double.NaN, (-1444));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertTrue(complex1.isNaN());
      
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = FastFourierTransformer.sample(polynomialFunction0, Double.NaN, (-4.9E-324), 1416);
      assertEquals(1416, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      fastFourierTransformer0.inversetransform(complexArray0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (double) 1017, Double.POSITIVE_INFINITY, 1017);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, (-642.395034), Double.NaN, (-1444));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ONE;
      complex0.acos();
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, (-642.395034), Double.NaN, (-1444));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (-1091.056197179), Double.POSITIVE_INFINITY, 3029);
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
      Complex complex0 = Complex.NaN;
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex1 = Complex.ZERO;
      complex1.asin();
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex1;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      Complex[] complexArray1 = fastFourierTransformer0.inversetransform(complexArray0);
      assertEquals(4, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.tan();
      Complex complex2 = Complex.ONE;
      Complex complex3 = complex2.atan();
      assertEquals(0.7853981633974483, complex3.abs(), 0.01);
      assertEquals(0.7853981633974483, complex3.getReal(), 0.01);
      
      complex1.asin();
      assertTrue(complex1.isNaN());
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      complex0.pow(complex0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, (-642.395034), Double.NaN, (-1444));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex1.atan();
      assertEquals(0.7853981633974483, complex2.getReal(), 0.01);
      assertEquals(0.7853981633974483, complex2.abs(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      
      Complex complex3 = complex1.multiply(complex0);
      complex3.pow(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex3.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertTrue(complex1.isNaN());
      
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex2.log();
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertTrue(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      
      Complex complex2 = complex0.pow(complex0);
      assertFalse(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertTrue(complex1.isNaN());
      
      Complex complex2 = Complex.ONE;
      Complex complex3 = complex2.acos();
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      Complex complex0 = Complex.ZERO;
      complex0.cos();
      Complex[] complexArray1 = fastFourierTransformer0.fft(complexArray0);
      assertNotSame(complexArray0, complexArray1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      Complex complex1 = Complex.ONE;
      complex1.multiply(complex0);
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 1017);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform2(doubleArray0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform2(doubleArray0);
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      complex0.acos();
      double[] doubleArray0 = new double[6];
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
  public void test52()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.I;
      Complex complex2 = complex1.pow(complex0);
      Complex complex3 = complex1.subtract(complex0);
      assertSame(complex3, complex2);
      assertEquals(1.0, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex2.log();
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getReal(), 0.01);
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      
      Complex complex4 = complex0.multiply(complex1);
      assertTrue(complex0.isInfinite());
      assertTrue(complex4.isNaN());
      assertNotSame(complex4, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex0.atan();
      Complex complex3 = complex1.pow(complex0);
      assertTrue(complex3.isNaN());
      assertEquals(1.0, complex1.abs(), 0.01);
      assertTrue(complex0.isInfinite());
      assertTrue(complex3.equals((Object)complex2));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertNotSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = FastFourierTransformer.sample(polynomialFunction0, (-3420.11529661), 1.0012585872576203, 7);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      complex0.sqrt();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.POSITIVE_INFINITY;
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      Complex[] complexArray1 = fastFourierTransformer0.inversetransform(complexArray0);
      assertEquals(2, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.log();
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex2;
      complexArray0[1] = complex2;
      complexArray0[2] = complex1;
      complexArray0[3] = complex0;
      Complex[] complexArray1 = fastFourierTransformer0.inversetransform(complexArray0);
      assertEquals(4, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[5];
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
  public void test59()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (-2255.1), 5.079203146962641E-7, 85);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.pow(complex0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (-2255.1), 5.079203146962641E-7, 85);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[6];
      try { 
        fastFourierTransformer0.transform(complexArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.inversetransform(doubleArray0);
      Complex complex2 = complex1.asin();
      assertEquals(Double.NaN, complex2.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      Complex complex1 = Complex.ONE;
      complex1.multiply(complex0);
      try { 
        FastFourierTransformer.verifyInterval(2758.0, 1.999999999999987);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2758.0, 1.999999999999987]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      complex0.atan();
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (double) 1017, Double.POSITIVE_INFINITY, 1017);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cosh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertEquals(1.5430806348152437, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      complex0.atan();
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
  public void test67()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-4.9E-324), Double.POSITIVE_INFINITY);
      complex0.atan();
      double[] doubleArray0 = new double[2];
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      Complex[] complexArray1 = fastFourierTransformer0.inversetransform(complexArray0);
      assertNotSame(complexArray1, complexArray0);
  }
}
