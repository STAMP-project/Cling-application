/*

 * Tue Mar 03 15:40:36 GMT 2020
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
      Complex complex0 = new Complex((-764.4), Double.POSITIVE_INFINITY);
      complex0.log();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, (-764.4), (-3050.97960496), (-1020));
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      Complex[] complexArray0 = new Complex[2];
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, (-1252.2123));
      complexArray0[0] = complex0;
      Complex complex1 = Complex.NaN;
      complexArray0[1] = complex1;
      fastFourierTransformer0.transform2(complexArray0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, (double) (-646), (-1252.2123), (-2147));
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
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, 291.7639551345);
      complex0.log();
      double[] doubleArray0 = new double[0];
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
  public void test03()  throws Throwable  {
      Complex complex0 = new Complex((-3505.11781), Double.POSITIVE_INFINITY);
      complex0.log();
      try { 
        FastFourierTransformer.verifyInterval((-620.63517), (-955.6502442262224));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-620.63517, -955.6502442262224]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = new Complex((-3505.11781), Double.POSITIVE_INFINITY);
      complex0.log();
      FastFourierTransformer.verifyInterval(360.0, 3505.11781);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = new Complex(293.968225085774, 8459.0);
      complexArray0[0] = complex0;
      Complex complex1 = Complex.NaN;
      complexArray0[1] = complex1;
      complexArray0[2] = complex1;
      complexArray0[3] = complex1;
      fastFourierTransformer0.inversetransform(complexArray0);
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, 124.98, 2.0, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [124.98, 2.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastFourierTransformer.verifyInterval((-1L), 0.0);
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.subtract(complex1);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.exp();
      Complex[] complexArray0 = new Complex[1];
      // Undeclared exception!
      try { 
        fastFourierTransformer0.transform2(complexArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      Complex[] complexArray0 = new Complex[1];
      // Undeclared exception!
      try { 
        fastFourierTransformer0.transform2(complexArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[8];
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[8];
      Complex[] complexArray0 = new Complex[2];
      Complex complex0 = new Complex(0.0, 0.0);
      complexArray0[0] = complex0;
      fastFourierTransformer0.inversetransform2(doubleArray0);
      Complex complex1 = complexArray0[0].acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.acos();
      Complex[] complexArray0 = new Complex[10];
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
  public void test12()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[11];
      Complex complex0 = new Complex((-1595.2), (-1595.2));
      complex0.acos();
      try { 
        fastFourierTransformer0.transform2(complexArray0);
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(127.113, 127.113);
      complex0.atan();
      Complex[] complexArray0 = new Complex[2];
      // Undeclared exception!
      try { 
        fastFourierTransformer0.inversetransform(complexArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = new Complex(1.9450973662272386, Double.POSITIVE_INFINITY);
      complex0.pow(complex1);
      Complex complex2 = complex0.asin();
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = new Complex((-3505.11781), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.log();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      
      Complex complex2 = new Complex(360.0, (-2147));
      Complex complex3 = complex2.log();
      assertEquals((-2147.0), complex2.getImaginary(), 0.01);
      assertEquals((-1.404665924880677), complex3.getImaginary(), 0.01);
      assertEquals(7.812997075474838, complex3.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-3505.11781), Double.POSITIVE_INFINITY);
      complex0.log();
      double[] doubleArray0 = new double[2];
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[8];
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.exp();
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[7];
      Complex complex0 = Complex.ONE;
      Complex complex1 = new Complex(2.0, Double.POSITIVE_INFINITY);
      complex0.pow(complex1);
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[1];
      Complex[] complexArray0 = new Complex[7];
      Complex complex0 = Complex.INF;
      complexArray0[0] = complex0;
      complexArray0[1] = complexArray0[0];
      complexArray0[1].atan();
      Complex[] complexArray1 = fastFourierTransformer0.inversetransform(doubleArray0);
      Complex[] complexArray2 = fastFourierTransformer0.transform2(complexArray1);
      assertNotSame(complexArray2, complexArray1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.exp();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) null, 325.41530225092583, 325.41530225092583, (-189));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.NaN;
      complex1.pow(complex0);
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 514.835, (-2319166.3215981284), 1188);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [514.835, -2319166.3215981284]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, 675.0074467, 0.5, 2136);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [675.0074467, 0.5]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.ONE;
      complex0.atan();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, (-2237.6267789176), 1.0, (-1969));
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
      Complex complex0 = new Complex((-2147), 360.0);
      complex0.asin();
      try { 
        FastFourierTransformer.verifyInterval((-620.63517), (-955.6502442262224));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-620.63517, -955.6502442262224]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = new Complex((-1595.3233081982055), (-1595.3233081982055));
      Complex complex1 = complex0.log();
      assertEquals(8.07290233228605, complex1.abs(), 0.01);
      
      Complex complex2 = complex0.cosh();
      Complex complex3 = complex2.atan();
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals((-1595.3233081982055), complex0.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NaN, complex3.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      Complex[] complexArray0 = new Complex[10];
      complex0.sqrt1z();
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
  public void test27()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = new Complex(610.0, Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.acos();
      assertEquals(610.0, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
      
      Complex complex3 = complex0.acos();
      assertSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = new Complex(18.16403839015134, Double.POSITIVE_INFINITY);
      complex0.log();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[7];
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
  public void test29()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      complex0.acos();
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 17.0, (-3852.380411855541), 17);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [17.0, -3852.380411855541]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) null, (-1.5707963267948966), (-1.5707963267948966), 2019);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-1.5707963267948966, -1.5707963267948966]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.ONE;
      complex0.asin();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, (-2237.6267789176), 1.0, (-1969));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.asin();
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 3042.0, 0.0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [3042.0, 0.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex[] complexArray0 = new Complex[7];
      Complex complex0 = Complex.INF;
      complexArray0[0] = complex0;
      complexArray0[5] = complexArray0[0];
      complexArray0[5].asin();
      Complex[] complexArray1 = fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, (-4139.0), 2.0, 1);
      assertNotSame(complexArray1, complexArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[3];
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
  public void test35()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.NaN;
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 1.0, 1.0, (-2683));
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = Complex.I;
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex2;
      complexArray0[1] = complex1;
      complexArray0[2] = complexArray0[0];
      complexArray0[3] = complex1;
      Complex[] complexArray1 = fastFourierTransformer0.transform2(complexArray0);
      assertNotSame(complexArray1, complexArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Complex complex0 = new Complex((-3505.11781), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.exp();
      Complex complex2 = new Complex(360.0, (-2147));
      Complex complex3 = complex2.log();
      assertEquals(7.685690401054253, complex3.getReal(), 0.01);
      assertEquals((-1.404665924880677), complex3.getImaginary(), 0.01);
      assertEquals(7.812997075474838, complex3.abs(), 0.01);
      
      Complex complex4 = complex1.asin();
      assertTrue(complex4.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertNotSame(complex4, complex1);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      complex0.acos();
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, 2198.306244633652, 2397.8394590046832, (-1631));
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
      Complex complex0 = new Complex((-1595.2), (-1595.2));
      Complex complex1 = complex0.cosh();
      Complex complex2 = complex1.atan();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex2.abs(), 0.01);
      
      Complex complex3 = complex0.acos();
      assertEquals(8.738137365727786, complex3.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Complex[] complexArray0 = new Complex[2];
      Complex complex0 = new Complex(0.0, 0.0);
      complexArray0[0] = complex0;
      complexArray0[1] = complexArray0[0];
      Complex complex1 = complexArray0[0].acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      
      complexArray0[1].pow(complex0);
      assertEquals(0.0, complex0.abs(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.pow(complex1);
      assertEquals(1.0, complex0.abs(), 0.01);
      
      Complex complex3 = complex1.acos();
      assertSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cos();
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[8];
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[8];
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertEquals(Double.NaN, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.ONE;
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (-2011.71), 3.141592653589793, 17);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = Double.NaN;
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.pow(complex1);
      assertEquals(1.0, complex0.abs(), 0.01);
      
      Complex complex3 = complex1.acos();
      assertSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.atan();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, (-1885.4), 421.0, 2124);
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
      Complex complex0 = Complex.NaN;
      Complex complex1 = new Complex(610.0, Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(610.0, complex1.getReal(), 0.01);
      
      Complex complex3 = complex0.sqrt1z();
      assertSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex2 = Complex.NaN;
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex1;
      complexArray0[1] = complex0;
      complexArray0[2] = complex2;
      complexArray0[3] = complex1;
      Complex[] complexArray1 = fastFourierTransformer0.inversetransform(complexArray0);
      assertEquals(4, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[3];
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
  public void test52()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.I;
      complex0.asin();
      double[] doubleArray0 = new double[19];
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
  public void test53()  throws Throwable  {
      Complex complex0 = new Complex((-3505.11781), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.log();
      assertEquals(1.5707963267948966, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      
      Complex complex2 = complex0.sinh();
      Complex complex3 = complex2.asin();
      assertTrue(complex3.isNaN());
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertNotSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-3505.11781), Double.POSITIVE_INFINITY);
      complex0.log();
      double[] doubleArray0 = new double[8];
      Complex[] complexArray0 = fastFourierTransformer0.fft(doubleArray0, true);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-3505.11781), Double.POSITIVE_INFINITY);
      complex0.log();
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
  public void test56()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.asin();
      Complex[] complexArray0 = new Complex[5];
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
  public void test57()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ONE;
      complex0.asin();
      Complex[] complexArray0 = new Complex[6];
      try { 
        fastFourierTransformer0.transform2(complexArray0);
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
      double[] doubleArray0 = new double[8];
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.NaN;
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (-3311.4858163828), (-705.866575858), 17);
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[11];
      Complex complex0 = new Complex((-1595.2), (-1595.2));
      Complex complex1 = complex0.cosh();
      complex1.atan();
      try { 
        fastFourierTransformer0.transform2(complexArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }
}
