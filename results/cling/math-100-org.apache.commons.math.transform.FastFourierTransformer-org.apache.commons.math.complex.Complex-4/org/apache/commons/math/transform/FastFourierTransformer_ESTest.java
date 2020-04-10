/*

 * Tue Mar 03 15:30:34 GMT 2020
 */

package org.apache.commons.math.transform;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.transform.FastFourierTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FastFourierTransformer_ESTest extends FastFourierTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      complex0.sqrt();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        FastFourierTransformer.sample(polynomialFunction0, (-360.085544), (-360.085544), (-70));
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
      Complex complex0 = Complex.ONE;
      complex0.cos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, (-1293.03), 632.0, (-1703));
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
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, 521.0719, (double) (-846), (-846));
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
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      complex0.divide(complex1);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        FastFourierTransformer.sample(polynomialFunction0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1957);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [Infinity, Infinity]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      complex0.subtract(complex1);
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
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.pow(complex0);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex0 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sqrt();
      complex1.exp();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.NaN, complex1.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex1.asin();
      assertNotSame(complex2, complex1);
      assertTrue(complex2.isNaN());
      assertEquals(0.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.acos();
      assertEquals(1.8011719796199461, complex2.abs(), 0.01);
      assertEquals(1.5707963267948966, complex2.getReal(), 0.01);
      
      Complex complex3 = complex0.pow(complex1);
      Complex complex4 = complex3.asin();
      assertNotSame(complex4, complex3);
      assertTrue(complex4.isNaN());
      assertEquals(1.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[1];
      Complex complex0 = Complex.NaN;
      complex0.cosh();
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
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Complex complex0 = Complex.I;
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
  public void test12()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(837.32043127, 837.32043127, 837.32043127).when(univariateRealFunction0).value(anyDouble());
      double[] doubleArray0 = FastFourierTransformer.sample(univariateRealFunction0, (-1966.090566), (-1144.2632797018844), 3);
      Complex complex0 = Complex.NaN;
      complex0.acos();
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
  public void test13()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.7853981633974483, complex1.getReal(), 0.01);
      assertEquals(0.7853981633974483, complex1.abs(), 0.01);
      
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[1];
      Complex[] complexArray1 = fastFourierTransformer0.transform(complexArray0);
      assertNotSame(complexArray1, complexArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      complex0.pow(complex1);
      double[] doubleArray0 = new double[5];
      try { 
        fastFourierTransformer0.fft(doubleArray0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      fastFourierTransformer0.inversetransform(doubleArray0);
      Complex complex0 = new Complex((-3593.60295), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(complex0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      complex0.pow(complex1);
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
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.pow(complex1);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        FastFourierTransformer.sample(polynomialFunction0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1957);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [Infinity, Infinity]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.NaN;
      complex1.pow(complex0);
      try { 
        FastFourierTransformer.sample((UnivariateRealFunction) null, 0.7949577687638787, 0.7853981633974483, (-2));
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
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 357.696955, Double.NEGATIVE_INFINITY, (-1084));
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
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.pow(complex0);
      assertSame(complex2, complex0);
      
      Complex complex3 = complex1.asin();
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.asin();
      try { 
        FastFourierTransformer.verifyInterval(2199.955, 2199.955);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2199.955, 2199.955]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.I;
      complex0.asin();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        FastFourierTransformer.sample(polynomialFunction0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1957);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [Infinity, Infinity]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      Complex[] complexArray0 = new Complex[7];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
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
  public void test27()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(837.32043127, 837.32043127, 837.32043127).when(univariateRealFunction0).value(anyDouble());
      FastFourierTransformer.sample(univariateRealFunction0, (-1966.090566), (-1144.2632797018844), 3);
      Complex complex0 = new Complex(Double.NaN, (-1966.090566));
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex0;
      Complex complex1 = new Complex(3, (-1144.2632797018844));
      complexArray0[1] = complex1;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      Complex[] complexArray1 = fastFourierTransformer0.transform(complexArray0);
      assertEquals(4, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.I;
      complex0.cos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 6.283185307179586, 1617.76, 1233);
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
      Complex complex0 = Complex.INF;
      Complex complex1 = new Complex(0.0, Double.POSITIVE_INFINITY);
      complex1.pow(complex0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[6];
      try { 
        fastFourierTransformer0.fft(doubleArray0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.pow(complex1);
      complex2.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      FastFourierTransformer.sample(polynomialFunction0, (-3542.5099312045554), 2546.710055804176, 2226);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.NaN;
      complex0.asin();
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 357.696955, Double.NEGATIVE_INFINITY, (-1084));
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
      Complex complex0 = Complex.INF;
      complex0.asin();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, (double) 1246, (-1.0), (-2177));
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
      double[] doubleArray0 = new double[8];
      Complex complex0 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      complex0.sqrt();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      FastFourierTransformer.sample(polynomialFunction0, (-3542.5099312045554), 2546.710055804176, 2226);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      complex0.divide(complex1);
      Complex[] complexArray0 = new Complex[7];
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
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.pow(complex1);
      Complex complex3 = Complex.ZERO;
      Complex complex4 = complex3.pow(complex2);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertEquals((-3542.5099312045554), complex1.getReal(), 0.01);
      assertEquals(0.0, complex3.abs(), 0.01);
      assertTrue(complex4.equals((Object)complex2));
      assertNotSame(complex4, complex2);
      assertTrue(complex2.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.pow(complex1);
      assertEquals(Double.NaN, complex2.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      
      Complex complex3 = complex0.asin();
      assertEquals(0.8813735870195428, complex3.abs(), 0.01);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertEquals(0.8813735870195428, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[2];
      Complex complex0 = Complex.INF;
      complexArray0[0] = complex0;
      Complex complex1 = Complex.NaN;
      complexArray0[1] = complex1;
      fastFourierTransformer0.inversetransform2(complexArray0);
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
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.NaN;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, 521.0719, (double) (-846), (-846));
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
      Complex complex0 = Complex.ONE;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, (-1293.03), 632.0, (-1703));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sqrt1z();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      complex1.acos();
      try { 
        FastFourierTransformer.sample(polynomialFunction0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1957);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [Infinity, Infinity]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.sqrt1z();
      Complex complex3 = complex0.pow(complex1);
      assertSame(complex3, complex2);
      assertEquals(0.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      complex0.atan();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, (double) 1246, (-1.0), (-2177));
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
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.sqrt1z();
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex2.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
      
      Complex complex3 = complex0.sqrt();
      assertEquals(0.7071067811865475, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      complex0.pow(complex1);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, (-430.38752825499), (-3542.5099312045554), 5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-430.38752825499, -3542.5099312045554]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.sqrt1z();
      Complex complex3 = complex0.divide(complex1);
      Complex complex4 = complex2.acos();
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertTrue(complex4.equals((Object)complex2));
      
      Complex complex5 = complex3.log();
      assertEquals(Double.POSITIVE_INFINITY, complex5.abs(), 0.01);
      assertEquals(0.0, complex5.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.divide(complex1);
      Complex complex3 = complex1.acos();
      assertEquals(Double.NaN, complex3.abs(), 0.01);
      
      Complex complex4 = complex2.log();
      assertEquals(Double.NEGATIVE_INFINITY, complex4.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
      assertEquals(0.0, complex4.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.sqrt1z();
      Complex complex3 = complex2.acos();
      assertTrue(complex3.equals((Object)complex2));
      assertEquals(Double.NEGATIVE_INFINITY, complex2.getImaginary(), 0.01);
      
      Complex complex4 = complex0.asin();
      assertEquals(0.8813735870195428, complex4.getImaginary(), 0.01);
      assertEquals(0.0, complex4.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      fastFourierTransformer0.inversetransform(doubleArray0);
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cos();
      assertEquals(1.0, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform2(doubleArray0);
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cos();
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.sqrt1z();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex2 = complex1.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertNotSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
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
  public void test53()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertSame(complex1, complex0);
      
      Complex complex2 = Complex.ONE;
      Complex complex3 = complex2.asin();
      assertEquals(1.5707963267948966, complex3.getReal(), 0.01);
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.divide(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
      
      Complex complex3 = complex0.asin();
      assertEquals(0.8813735870195428, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.NaN;
      complex0.asin();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, 0.5, Double.POSITIVE_INFINITY, 1183);
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
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.subtract(complex1);
      assertFalse(complex0.isInfinite());
      
      Complex complex3 = Complex.INF;
      Complex complex4 = complex3.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
      assertSame(complex4, complex2);
      assertEquals(Double.POSITIVE_INFINITY, complex3.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      
      Complex complex2 = Complex.I;
      Complex complex3 = complex2.asin();
      assertEquals(0.8813735870195428, complex3.abs(), 0.01);
      assertEquals(0.8813735870195428, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(837.32043127, 837.32043127, 837.32043127).when(univariateRealFunction0).value(anyDouble());
      double[] doubleArray0 = FastFourierTransformer.sample(univariateRealFunction0, (-1966.090566), (-1144.2632797018844), 3);
      assertArrayEquals(new double[] {837.32043127, 837.32043127, 837.32043127}, doubleArray0, 0.01);
      
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.pow(complex0);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      complex0.sqrt();
      Complex[] complexArray0 = new Complex[7];
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
  public void test60()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.I;
      complex0.acos();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 6.283185307179586, 1617.76, 1233);
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[4];
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, 0.5, Double.POSITIVE_INFINITY, 1183);
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
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      complex1.asin();
      Complex[] complexArray0 = new Complex[7];
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
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.transform(doubleArray0);
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.pow(complex1);
      Complex complex3 = complex1.pow(complex2);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-3542.5099312045554), complex1.getReal(), 0.01);
      assertTrue(complex3.equals((Object)complex2));
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
      assertTrue(complex1.isInfinite());
      assertTrue(complex3.isNaN());
      assertNotSame(complex3, complex2);
      assertEquals(1.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      complex0.asin();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, 0.41421356237309515, (double) 816, 816);
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
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cosh();
      assertEquals(0.5403023058681398, complex1.abs(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = FastFourierTransformer.sample(polynomialFunction0, (-1075.0944309634795), 1.0, 7);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      assertEquals(Double.NaN, complex1.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.INF;
      complex0.asin();
      Complex[] complexArray0 = new Complex[7];
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
  public void test69()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = new Complex((-3542.5099312045554), Double.POSITIVE_INFINITY);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      complex0.acos();
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(8, complexArray0.length);
  }
}
