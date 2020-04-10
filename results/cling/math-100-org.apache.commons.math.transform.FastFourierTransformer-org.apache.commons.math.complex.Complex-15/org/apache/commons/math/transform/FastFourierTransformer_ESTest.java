/*

 * Tue Mar 03 15:32:12 GMT 2020
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
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.INF;
      Complex complex1 = new Complex(951.749683079, Double.POSITIVE_INFINITY);
      complex0.divide(complex1);
      try { 
        FastFourierTransformer.sample(polynomialFunction0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, (-1));
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
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.I;
      complex0.cos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        FastFourierTransformer.sample(polynomialFunction0, (-1), (-1), (-1));
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      complex0.subtract(complex1);
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 0.0, Double.NaN, 0);
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
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.INF;
      Complex complex1 = new Complex(951.749683079, Double.POSITIVE_INFINITY);
      complex0.divide(complex1);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, 951.749683079, 951.749683079, 12);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [951.749683079, 951.749683079]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      complex0.subtract(complex1);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, 3161.0, 1065.9863960931377, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [3161.0, 1065.9863960931377]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      complex0.pow(complex1);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      complex1.pow(complex0);
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex1.asin();
      assertEquals(0.0, complex0.abs(), 0.01);
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.inversetransform(doubleArray0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = new Complex(951.749683079, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.pow(complex1);
      Complex complex3 = complex0.divide(complex1);
      assertTrue(complex3.equals((Object)complex2));
      assertEquals(951.749683079, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
      assertEquals(Double.NaN, complex3.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[0];
      complex0.acos();
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
  public void test12()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.acos();
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
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = new Complex((-1854.1193162079132), 2.0);
      complex0.atan();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.atan();
      assertEquals(0.7853981633974483, complex1.getReal(), 0.01);
      assertEquals(0.7853981633974483, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = new Complex((-508.2765), Double.POSITIVE_INFINITY);
      complex0.divide(complex0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex[] complexArray0 = fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, 5.886381276359104, 2);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = new Complex((-1854.1193162079132), 2.0);
      Complex complex1 = new Complex((-1854.1193162079132), Double.POSITIVE_INFINITY);
      complex0.pow(complex1);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 2.0, 0.0, 0);
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      complex0.pow(complex1);
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 0.0, Double.NaN, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 0.5, 0.5, (-1794));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = new Complex((-1854.1193162079132), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals((-1854.1193162079132), complex0.getReal(), 0.01);
      assertTrue(complex2.isNaN());
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = new Complex((-1944.0202933081), (-1944.0202933081));
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.pow(complex1);
      assertEquals((-1944.0202933081), complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
      assertEquals((-1944.0202933081), complex0.getReal(), 0.01);
      assertEquals(2749.2598643248375, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = new Complex((-1854.1193162079132), 2.0);
      Complex complex1 = new Complex((-1854.1193162079132), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.pow(complex1);
      complex2.asin();
      try { 
        FastFourierTransformer.verifyInterval(Double.POSITIVE_INFINITY, 2.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [Infinity, 2.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex0.subtract(complex1);
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = FastFourierTransformer.sample(polynomialFunction0, 1821.797, Double.NaN, 1);
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.NaN;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, 3602.152, Double.POSITIVE_INFINITY, 429);
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
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.5403023058681398, complex1.abs(), 0.01);
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
      
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = FastFourierTransformer.sample(polynomialFunction0, (-135.0037644134198), 35.51749, 1125);
      assertEquals(1125, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = new Complex((-1854.1193162079132), Double.POSITIVE_INFINITY);
      complex0.asin();
      try { 
        FastFourierTransformer.verifyInterval(Double.POSITIVE_INFINITY, 2.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [Infinity, 2.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = new Complex((-1854.1193162079132), 2.0);
      complex0.acos();
      try { 
        FastFourierTransformer.verifyInterval(Double.POSITIVE_INFINITY, 2.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [Infinity, 2.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.subtract(complex0);
      Complex complex2 = complex1.acos();
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = FastFourierTransformer.sample(polynomialFunction0, 1821.797, Double.NaN, 1);
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.subtract(complex0);
      complex1.asin();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 0.0, Double.NaN, 0);
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
      double[] doubleArray0 = new double[2];
      Complex complex0 = new Complex((-1854.1193162079132), 2.0);
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 2.0, 0.0, 0);
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
      Complex complex0 = Complex.INF;
      Complex complex1 = new Complex(951.749683079, Double.POSITIVE_INFINITY);
      complex0.divide(complex1);
      Object[] objectArray0 = new Object[0];
      try { 
        FastFourierTransformer.verifyDataSet(objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex(951.749683079, Double.POSITIVE_INFINITY);
      complex0.divide(complex1);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[0];
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
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = new Complex((-1854.1193162079132), 2.0);
      Complex complex1 = new Complex((-1854.1193162079132), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.pow(complex1);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex3 = complex0.subtract(complex2);
      assertNotSame(complex3, complex2);
      assertEquals(1854.1203948868313, complex0.abs(), 0.01);
      assertEquals((-1854.1193162079132), complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.pow(complex0);
      complex2.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        FastFourierTransformer.sample(polynomialFunction0, (-1), (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.I;
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        FastFourierTransformer.sample(polynomialFunction0, (-1), (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.NaN;
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        FastFourierTransformer.sample(polynomialFunction0, 0.0, 0, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [0.0, 0.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Complex complex0 = new Complex((-1854.1193162079132), 2.0);
      Complex complex1 = complex0.acos();
      Complex complex2 = new Complex((-1854.1193162079132), Double.POSITIVE_INFINITY);
      Complex complex3 = complex1.pow(complex2);
      Complex complex4 = complex3.asin();
      assertNotSame(complex4, complex3);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(8.797925501799977, complex1.abs(), 0.01);
      assertTrue(complex4.isNaN());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = new Complex((-1854.1193162079132), 2.0);
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.pow(complex0);
      assertEquals(1854.1203948868313, complex0.abs(), 0.01);
      assertEquals(0.0, complex2.abs(), 0.01);
      assertEquals(8.797925501799977, complex1.abs(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      
      Complex complex3 = Complex.INF;
      Complex complex4 = complex3.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex3.abs(), 0.01);
      assertTrue(complex4.isNaN());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(1.8011719796199461, complex1.abs(), 0.01);
      
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex2.pow(complex0);
      Complex complex4 = complex3.acos();
      assertNotSame(complex4, complex3);
      assertEquals(Double.NaN, complex4.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
      assertEquals(0.5403023058681398, complex1.abs(), 0.01);
      
      Complex[] complexArray0 = new Complex[1];
      Complex[] complexArray1 = fastFourierTransformer0.transform(complexArray0);
      assertNotSame(complexArray1, complexArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.I;
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      complex0.cos();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = new Complex((-1854.1193162079132), 2.0);
      Complex complex1 = new Complex((-1854.1193162079132), Double.POSITIVE_INFINITY);
      complex0.pow(complex1);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 9.329814, 876.9177, 3243);
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
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.pow(complex0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      complex2.acos();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = new Complex((-1854.1193162079132), 2.0);
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      complex0.acos();
      Complex[] complexArray0 = new Complex[6];
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
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = new Complex((-1854.1193162079132), 2.0);
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 9.329814, 876.9177, 3243);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Complex complex0 = new Complex((-1854.1193162079132), 2.0);
      Complex complex1 = new Complex((-1854.1193162079132), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.pow(complex1);
      assertEquals(1854.1203948868313, complex0.abs(), 0.01);
      
      Complex complex3 = complex1.asin();
      assertTrue(complex3.equals((Object)complex2));
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-1854.1193162079132), complex1.getReal(), 0.01);
      assertNotSame(complex3, complex2);
      assertTrue(complex3.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = new Complex(2167.662560492, Double.NaN);
      Complex complex2 = complex1.pow(complex0);
      assertEquals(2167.662560492, complex1.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertTrue(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.pow(complex1);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Complex complex0 = new Complex((-1854.1193162079132), 2.0);
      Complex complex1 = complex0.acos();
      Complex complex2 = new Complex((-1854.1193162079132), Double.POSITIVE_INFINITY);
      Complex complex3 = complex1.pow(complex2);
      Complex complex4 = complex0.subtract(complex3);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(8.797925501799977, complex1.abs(), 0.01);
      assertNotSame(complex4, complex3);
      assertTrue(complex4.isNaN());
      assertEquals(3.140513974619295, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = new Complex(951.749683079, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = Complex.ZERO;
      Complex complex4 = complex3.pow(complex2);
      assertEquals(0.0, complex3.getReal(), 0.01);
      assertEquals(0.0, complex3.abs(), 0.01);
      assertTrue(complex1.isInfinite());
      assertTrue(complex4.isNaN());
      assertNotSame(complex4, complex2);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex(951.749683079, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.divide(complex1);
      assertTrue(complex1.isInfinite());
      assertEquals(0.0, complex2.abs(), 0.01);
      
      Complex complex3 = complex0.acos();
      assertEquals(1.8011719796199461, complex3.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = Complex.ZERO;
      Complex complex4 = complex3.pow(complex1);
      assertSame(complex4, complex2);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(0.0, complex3.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.INF;
      complex0.asin();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, (-1431.0), 2.0, 368);
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
      double[] doubleArray0 = new double[3];
      Complex complex0 = Complex.INF;
      Complex complex1 = new Complex(944.980264529658, Double.POSITIVE_INFINITY);
      complex0.divide(complex1);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
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
  public void test57()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (-5354.99), 1.0, 2635);
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ONE;
      complex0.asin();
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
  public void test59()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.asin();
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
  public void test60()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = new Complex((-1854.1193162079132), 2.0);
      Complex complex1 = new Complex((-1854.1193162079132), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.pow(complex1);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex3 = complex2.asin();
      assertNotSame(complex3, complex2);
      assertEquals(1854.1203948868313, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.NaN;
      complex0.exp();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (-5354.99), 1.0, 2635);
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
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cosh();
      assertEquals(1.5430806348152437, complex1.abs(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[6];
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
  public void test64()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = new Complex((-1854.1193162079132), Double.POSITIVE_INFINITY);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex1 = complex0.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex1.abs(), 0.01);
  }
}
