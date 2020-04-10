/*

 * Tue Mar 03 15:31:00 GMT 2020
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      complex0.divide(complex0);
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, 2.0, (-2106));
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
      Complex complex0 = Complex.ONE;
      complex0.cos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, 3.565163866300541E-4, 2.0, (-1246));
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
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      complex0.divide(complex0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, (-966.4723180901243), Double.NEGATIVE_INFINITY, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-966.4723180901243, -Infinity]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, (double) 31, (-1497.663890196222), 1756);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [31.0, -1497.663890196222]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      complex0.pow(complex0);
      double[] doubleArray0 = new double[2];
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      complex2.pow(complex2);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex0.asin();
      Complex complex3 = complex1.acos();
      Complex complex4 = complex3.pow(complex2);
      assertEquals(0.0, complex3.abs(), 0.01);
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      assertSame(complex4, complex0);
      assertEquals(0.0, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.log();
      Complex complex1 = complex0.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.abs(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      complexArray0[0] = complex0;
      Complex complex1 = new Complex(2112.1, 1117.553827);
      Complex complex2 = complex0.sqrt1z();
      Complex complex3 = complex2.asin();
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      
      Complex complex4 = complex1.pow(complexArray0[0]);
      assertTrue(complex4.equals((Object)complex2));
      assertTrue(complex4.equals((Object)complex3));
      assertEquals(2389.5382328480005, complex1.abs(), 0.01);
      assertNotSame(complex4, complex3);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = complex0.pow(complex0);
      complex1.cosh();
      double[] doubleArray0 = new double[8];
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      complex0.acos();
      double[] doubleArray0 = new double[2];
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.acos();
      Object[] objectArray0 = new Object[3];
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
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.INF;
      complex0.atan();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(1097.430118, 1097.430118);
      complex0.atan();
      Complex[] complexArray0 = new Complex[8];
      // Undeclared exception!
      try { 
        fastFourierTransformer0.inversetransform2(complexArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = new Complex(0.5, 2.0);
      Complex complex2 = complex1.pow(complex0);
      assertEquals(2.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex2.abs(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(2.0615528128088303, complex1.abs(), 0.01);
      assertEquals(0.5, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = new Complex(1.0, 2.0);
      Complex complex2 = complex1.divide(complex0);
      Complex complex3 = complex2.acos();
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex3.getReal(), 0.01);
      assertEquals(2.23606797749979, complex1.abs(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = new Complex(2112.1, 1117.553827);
      complex1.multiply(complex0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[9];
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
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.inversetransform(doubleArray0);
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = Complex.ONE;
      complex1.pow(complex0);
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
  public void test20()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = new Complex(1.0, 2.0);
      complex1.multiply(complex0);
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, 2.0, (-2106));
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
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertTrue(complex1.isNaN());
      
      Complex complex2 = Complex.I;
      Complex complex3 = complex2.acos();
      assertEquals(1.8011719796199461, complex3.abs(), 0.01);
      assertEquals(1.0, complex2.abs(), 0.01);
      assertEquals(1.5707963267948966, complex3.getReal(), 0.01);
      assertEquals((-0.8813735870195429), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      complex0.pow(complex0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) null, (-1025.1566173), 3.4328922159134834, (-3239));
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
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) null, (-1025.1566173), 3.4328922159134834, (-3239));
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
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.ONE;
      complex0.atan();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, 1.0, 1.0, (-1704));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.asin();
      try { 
        FastFourierTransformer.verifyInterval((-568.69), (-5007.98249));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-568.69, -5007.98249]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
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
  public void test27()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      Complex complex2 = new Complex(Double.NEGATIVE_INFINITY, 2.0);
      Complex complex3 = complex2.asin();
      assertEquals(2.0, complex2.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getReal(), 0.01);
      assertSame(complex3, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = FastFourierTransformer.sample(polynomialFunction0, (-1196.2433367247404), 1267.0, 61);
      assertEquals(61, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) null, 801.705663, 801.705663, 11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [801.705663, 801.705663]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.acos();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, (-966.4723180901243), Double.NEGATIVE_INFINITY, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-966.4723180901243, -Infinity]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ZERO;
      complex0.acos();
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) null, 0.3594330038102771, 0.3594330038102771, 541);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [0.3594330038102771, 0.3594330038102771]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.asin();
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, 2.0, (-2106));
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
      Complex complex0 = Complex.I;
      complex0.asin();
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) null, (-1025.1566173), 3.4328922159134834, (-3239));
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      complex0.pow(complex0);
      Complex[] complexArray0 = new Complex[5];
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
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[3];
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
  public void test36()  throws Throwable  {
      Complex complex0 = new Complex((-229021.65186741392), Double.POSITIVE_INFINITY);
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex1.pow(complex0);
      assertTrue(complex2.isNaN());
      
      Complex complex3 = complex1.acos();
      Complex complex4 = complex3.pow(complex0);
      assertTrue(complex0.isInfinite());
      assertEquals(0.0, complex3.getReal(), 0.01);
      assertNotSame(complex4, complex2);
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = new Complex(1097.430118, 1097.430118);
      Complex[] complexArray0 = new Complex[8];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      Complex complex1 = Complex.NaN;
      complexArray0[5] = complex1;
      complexArray0[6] = complex0;
      complexArray0[7] = complex0;
      fastFourierTransformer0.inversetransform2(complexArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 1.0009990155663104, (double) 646, 646);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      double[] doubleArray0 = new double[8];
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, 2.0, (-2106));
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      complex0.acos();
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) null, (-1025.1566173), 3.4328922159134834, (-3239));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertTrue(complex1.isNaN());
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = FastFourierTransformer.sample(polynomialFunction0, (-1982.4751237), 874.47606828, 11);
      assertEquals(11, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = Complex.ONE;
      Complex complex3 = complex2.acos();
      Complex complex4 = complex3.pow(complex0);
      assertEquals(0.0, complex3.getReal(), 0.01);
      assertEquals(0.0, complex3.abs(), 0.01);
      assertSame(complex4, complex1);
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      
      Complex complex2 = Complex.NaN;
      Complex complex3 = complex2.asin();
      assertEquals(Double.NaN, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      fastFourierTransformer0.inversetransform2(doubleArray0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, 2.0, (-2106));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = new Complex(1.0, 2.0);
      complex1.multiply(complex0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, (-966.4723180901243), Double.NEGATIVE_INFINITY, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-966.4723180901243, -Infinity]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ONE;
      Complex complex2 = complex0.acos();
      Complex complex3 = complex1.acos();
      Complex complex4 = complex3.pow(complex1);
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      assertTrue(complex4.equals((Object)complex2));
      assertNotSame(complex4, complex0);
      assertEquals(0.0, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.I;
      complex0.cos();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.ZERO;
      complex0.cos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = new Complex(2112.1, 1117.553827);
      complexArray0[1] = complex1;
      complexArray0[2] = complexArray0[1];
      complexArray0[2].multiply(complex0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex[] complexArray1 = fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (-2080.79464649218), 1117.553827, 2);
      assertEquals(2, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      double[] doubleArray0 = new double[8];
      complex0.acos();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.acos();
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = new Complex(1097.430118, 1097.430118);
      complex0.acos();
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 1.0009990155663104, (double) 646, 646);
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
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = Double.POSITIVE_INFINITY;
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      
      Complex complex2 = Complex.NaN;
      Complex complex3 = complex0.multiply(complex2);
      assertSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = new Complex(1097.430118, 1097.430118);
      complex0.atan();
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 1.0009990155663104, (double) 646, 646);
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(1097.430118, 1097.430118);
      Complex complex1 = complex0.acos();
      Complex[] complexArray0 = new Complex[8];
      complexArray0[0] = complex1;
      complexArray0[1] = complex1;
      complexArray0[2] = complex1;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      Complex complex2 = Complex.NaN;
      complexArray0[5] = complex2;
      complexArray0[6] = complex0;
      complexArray0[7] = complexArray0[5];
      Complex[] complexArray1 = fastFourierTransformer0.inversetransform2(complexArray0);
      assertEquals(8, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.pow(complex0);
      Complex complex3 = complex0.pow(complex2);
      assertEquals(0.0, complex1.abs(), 0.01);
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertNotSame(complex3, complex2);
      assertTrue(complex0.isInfinite());
      assertTrue(complex3.isNaN());
      assertEquals(Double.NEGATIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.log();
      Complex complex2 = complex0.acos();
      assertEquals(1.5707963267948966, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      
      Complex complex3 = complex1.sqrt1z();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
      assertEquals(Double.NaN, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      complexArray0[1] = complex0;
      Complex complex1 = complex0.pow(complexArray0[1]);
      complex1.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[9];
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
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.sqrt1z();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.NaN;
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      complex0.pow(complex0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, 1176.658513643054, 4911.3748105109, 82);
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
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      complex0.pow(complex0);
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex[] complexArray0 = fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (-2080.79464649218), 1117.553827, 2);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, 2.0, 2735);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[3];
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
  public void test64()  throws Throwable  {
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = complex0.sqrt1z();
      complex1.asin();
      assertEquals(Double.NEGATIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.abs(), 0.01);
      
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex[] complexArray0 = fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (-2080.79464649218), 1117.553827, 2);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      complexArray0[1] = complex0;
      complexArray0[1].asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[9];
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
  public void test66()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cosh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(1.0, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      complex0.asin();
      Complex[] complexArray0 = new Complex[5];
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
  public void test68()  throws Throwable  {
      Complex complex0 = new Complex(1.0, Double.NEGATIVE_INFINITY);
      Complex complex1 = complex0.asin();
      assertEquals(Double.NEGATIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex1.abs(), 0.01);
      
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex[] complexArray0 = fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (-2080.79464649218), 1117.553827, 2);
      assertEquals(2, complexArray0.length);
  }
}
