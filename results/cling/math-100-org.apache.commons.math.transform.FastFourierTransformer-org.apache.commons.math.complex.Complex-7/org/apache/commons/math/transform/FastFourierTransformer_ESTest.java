/*

 * Tue Mar 03 15:30:03 GMT 2020
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
      Complex complex0 = Complex.INF;
      complex0.cos();
      double[] doubleArray0 = new double[9];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, 0.5, (-1780.9432749315713), (-1));
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
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.NaN;
      complex0.subtract(complex1);
      try { 
        FastFourierTransformer.sample((UnivariateRealFunction) null, 7.0, 7.0, (-2144832432));
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
      double[] doubleArray0 = new double[3];
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.ZERO;
      complexArray0[0] = complex0;
      Complex complex1 = Complex.NaN;
      complexArray0[1] = complex1;
      complexArray0[2] = complexArray0[0];
      complexArray0[3] = complexArray0[2];
      fastFourierTransformer0.inversetransform(complexArray0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        FastFourierTransformer.sample(polynomialFunction0, (-4.9E-324), (-49.2876), 2010);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-4.9E-324, -49.2876]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      complex1.pow(complex1);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      complex0.pow(complex1);
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.pow(complex0);
      Complex complex3 = complex2.asin();
      assertEquals(0.0, complex1.abs(), 0.01);
      assertTrue(complex3.isNaN());
      assertTrue(complex0.isInfinite());
      assertNotSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex0.asin();
      Complex complex3 = complex1.pow(complex2);
      assertSame(complex3, complex2);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.asin();
      assertFalse(complex2.isInfinite());
      
      Complex complex3 = complex0.asin();
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
      
      Complex[] complexArray1 = fastFourierTransformer0.fft(complexArray0);
      assertNotSame(complexArray1, complexArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[4];
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[3];
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
  public void test11()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.ZERO;
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      fastFourierTransformer0.inversetransform2(complexArray0);
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.acos();
      assertFalse(complex2.equals((Object)complex0));
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[1];
      Complex complex0 = Complex.ONE;
      complex0.atan();
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      Complex[] complexArray1 = fastFourierTransformer0.fft(complexArray0);
      assertNotSame(complexArray0, complexArray1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[16];
      Complex complex0 = Complex.INF;
      complex0.atan();
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      assertEquals(16, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.asin();
      assertEquals(0.8813735870195428, complex1.abs(), 0.01);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      
      Complex[] complexArray1 = fastFourierTransformer0.transform(complexArray0);
      assertNotSame(complexArray1, complexArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.exp();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 3096.72378, (-1.0), (-218));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      try { 
        FastFourierTransformer.sample((UnivariateRealFunction) null, 7.0, 7.0, (-2144832432));
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
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex1.pow(complex0);
      assertSame(complex2, complex0);
      assertEquals(1.0, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.asin();
      try { 
        FastFourierTransformer.verifyInterval(6.283185307179586, 6.283185307179586);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [6.283185307179586, 6.283185307179586]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.asin();
      try { 
        FastFourierTransformer.sample((UnivariateRealFunction) null, Double.POSITIVE_INFINITY, (-3538519.239914556), 189);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [Infinity, -3538519.239914556]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
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
  public void test21()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[16];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      FastFourierTransformer.sample(polynomialFunction0, (-920.389), 1.5707963267948966, 189);
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.ZERO;
      complexArray0[0] = complex0;
      complexArray0[1] = complexArray0[0];
      complexArray0[2] = complexArray0[0];
      Complex complex1 = Complex.NaN;
      complexArray0[3] = complex1;
      Complex[] complexArray1 = fastFourierTransformer0.inversetransform(complexArray0);
      assertEquals(4, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = FastFourierTransformer.sample(polynomialFunction0, 808, 2073.3, 808);
      assertEquals(808, doubleArray1.length);
      
      Complex[] complexArray0 = new Complex[5];
      Complex complex0 = Complex.INF;
      complexArray0[1] = complex0;
      Complex complex1 = complexArray0[1].cos();
      assertFalse(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      complex0.acos();
      try { 
        fastFourierTransformer0.transform2(doubleArray0);
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
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.INF;
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        FastFourierTransformer.sample(polynomialFunction0, 3589.0, 189, 189);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [3589.0, 189.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.acos();
      try { 
        FastFourierTransformer.verifyInterval(4891.8244816809, 4891.8244816809);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [4891.8244816809, 4891.8244816809]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[16];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.I;
      complex0.acos();
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, 6.283185307179586, 6.283185307179586, 2793);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [6.283185307179586, 6.283185307179586]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.asin();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, (-563.0002), 464.058241754085, (-109));
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
      double[] doubleArray0 = new double[1];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.I;
      complex0.asin();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 3096.72378, (-1.0), (-218));
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
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.NaN;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex[] complexArray0 = fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, (-966.10826), 3.141592653589793, 16);
      assertEquals(16, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.I;
      complex1.subtract(complex0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[3];
      try { 
        fastFourierTransformer0.inversetransform2(doubleArray0);
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
      double[] doubleArray0 = new double[1];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 3096.72378, (-1.0), (-218));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[16];
      Complex complex0 = Complex.INF;
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex[] complexArray0 = fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 3.141592653589793, (double) 8, 8);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.I;
      Complex complex2 = complex1.pow(complex0);
      Complex complex3 = complex2.asin();
      assertEquals(1.0, complex1.abs(), 0.01);
      assertNotSame(complex3, complex2);
      assertEquals(Double.NaN, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.asin();
      assertEquals(0.8813735870195428, complex1.abs(), 0.01);
      
      Complex complex2 = complex0.acos();
      assertEquals(1.5707963267948966, complex2.getReal(), 0.01);
      assertEquals(1.8011719796199461, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.INF;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (double) (-2), 2.0, (-2));
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
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.acos();
      assertEquals(1.5707963267948966, complex2.abs(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex2.getReal(), 0.01);
      
      Complex complex3 = complex1.sqrt1z();
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex2.pow(complex0);
      assertSame(complex3, complex1);
      assertEquals(0.0, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      
      Complex complex2 = complex0.acos();
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex2.abs(), 0.01);
      assertEquals(0.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.acos();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.abs(), 0.01);
      
      Complex complex2 = Complex.NaN;
      complexArray0[1] = complex2;
      Complex complex3 = complexArray0[1].acos();
      assertTrue(complex3.isNaN());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.I;
      complex0.cos();
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform2(doubleArray0);
      Complex complex0 = Complex.INF;
      complex0.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      FastFourierTransformer.verifyDataSet(doubleArray0);
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.acos();
      assertTrue(complex2.isNaN());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.exp();
      Complex complex2 = Complex.I;
      Complex complex3 = complex2.pow(complex1);
      assertTrue(complex3.isNaN());
      assertTrue(complex0.isInfinite());
      assertEquals(1.0, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = FastFourierTransformer.sample(polynomialFunction0, 808, 2073.3, 808);
      assertEquals(808, doubleArray1.length);
      
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = Double.NaN;
      fastFourierTransformer0.inversetransform(doubleArray0);
      Complex complex1 = complex0.acos();
      assertEquals(1.5707963267948966, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.sqrt1z();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ZERO;
      complex0.pow(complex0);
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = Double.NaN;
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      Complex complex0 = Complex.NaN;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.transform2(doubleArray0);
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
      Complex complex0 = Complex.ZERO;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, (-1747.51884544528), (-1266.5), 186);
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
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex1.asin();
      assertNotSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.pow(complex1);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.abs(), 0.01);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = FastFourierTransformer.sample(polynomialFunction0, 2073.3, Double.NaN, 808);
      assertEquals(808, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[6];
      Complex complex0 = Complex.ONE;
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
  public void test54()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (-2608.2324), (double) 526, 526);
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
  public void test56()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(0.41421356237309515, (-93.63382282));
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
  public void test57()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[16];
      Complex complex0 = Complex.NaN;
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, (-3058.01036126966), 2.0, 12);
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
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cosh();
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertEquals(1.5430806348152437, complex1.abs(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Complex complex0 = Complex.INF;
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
}
