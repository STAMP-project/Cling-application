/*

 * Tue Mar 03 15:31:07 GMT 2020
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
      Complex complex0 = new Complex(2879.259672282125, Double.POSITIVE_INFINITY);
      complex0.pow(complex0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) null, Double.POSITIVE_INFINITY, 2879.259672282125, (-2));
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
      double[] doubleArray0 = new double[3];
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 1192.16, 1192.16, (-1073741824));
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
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2877.255, 2877.255, 2877.255).when(univariateRealFunction0).value(anyDouble());
      double[] doubleArray0 = FastFourierTransformer.sample(univariateRealFunction0, (-186.5862121985), Double.POSITIVE_INFINITY, 3);
      Complex complex0 = new Complex(2877.255, Double.POSITIVE_INFINITY);
      complex0.asin();
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
  public void test03()  throws Throwable  {
      Complex complex0 = new Complex(2877.255, Double.POSITIVE_INFINITY);
      complex0.log();
      try { 
        FastFourierTransformer.verifyInterval(Double.POSITIVE_INFINITY, 7048350.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [Infinity, 7048350.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      try { 
        FastFourierTransformer.verifyInterval(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [Infinity, Infinity]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.exp();
      double[] doubleArray0 = new double[2];
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.NaN;
      complex0.pow(complex0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.asin();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      
      complex0.pow(complex0);
      assertEquals(0.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      double[] doubleArray0 = new double[2];
      fastFourierTransformer0.transform2(doubleArray0);
      Complex complex1 = complex0.cosh();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex[] complexArray0 = new Complex[8];
      Complex complex0 = Complex.NaN;
      complex0.cosh();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
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
      Complex complex0 = Complex.NaN;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, (-2944.0), (-1068.86097843703), 157);
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
      double[] doubleArray0 = new double[8];
      Complex complex0 = new Complex(2665.122702064, 80.0);
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 80.0, 1193.197029, 57);
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
      Complex complex0 = new Complex(9.263159838417488, 9.263159838417488);
      complex0.atan();
      double[] doubleArray0 = new double[4];
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Complex complex0 = new Complex(1317.487302261113, Double.NEGATIVE_INFINITY);
      Complex complex1 = Complex.ZERO;
      complex1.multiply(complex0);
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
  public void test14()  throws Throwable  {
      Complex complex0 = new Complex(2877.255, Double.POSITIVE_INFINITY);
      complex0.atan();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ZERO;
      complex0.acos();
      double[] doubleArray0 = new double[2];
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = new Complex(2877.255, Double.POSITIVE_INFINITY);
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = new Complex(3.141592653589793, Double.POSITIVE_INFINITY);
      Complex complex1 = new Complex(217.516247443, 0.7080734182735711);
      complex1.multiply(complex0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
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
  public void test18()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(9.263159838417488, 9.263159838417488);
      Complex complex1 = new Complex((-512.544192), Double.NEGATIVE_INFINITY);
      complex0.multiply(complex1);
      double[] doubleArray0 = new double[8];
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex[] complexArray0 = new Complex[8];
      Complex complex0 = new Complex(2.0, 2.0);
      complexArray0[0] = complex0;
      Complex complex1 = new Complex((-512.544192), Double.NEGATIVE_INFINITY);
      complexArray0[0].multiply(complex1);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        FastFourierTransformer.sample(polynomialFunction0, (-1558), 1629.8235829719, (-1558));
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
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.NaN;
      complex0.exp();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, (-3240.1187), (-3240.1187), (-3081));
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
      complex0.cosh();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (-641.279756537643), 0.0, (-5703));
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
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt1z();
      Complex complex2 = complex1.asin();
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex0.pow(complex1);
      assertTrue(complex2.isNaN());
      assertEquals(0.0, complex0.abs(), 0.01);
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.asin();
      try { 
        FastFourierTransformer.verifyInterval(4100.77272, (-295.375583));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [4100.77272, -295.375583]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex1.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
      
      Complex complex3 = complex0.pow(complex0);
      assertTrue(complex3.equals((Object)complex2));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertNotSame(complex3, complex2);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = new Complex(9.263159838417488, 9.263159838417488);
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.asin();
      assertEquals(3.358543204473802, complex2.abs(), 0.01);
      assertEquals(0.7839414013282079, complex2.getReal(), 0.01);
      
      Complex complex3 = complex1.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01);
      assertTrue(complex3.isNaN());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex[] complexArray0 = new Complex[5];
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
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
  public void test28()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.INF;
      complex0.atan();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, 0.0021382893851296103, 0.0021382893851296103, (-515));
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
      Complex complex0 = new Complex(2877.255, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex1.acos();
      assertTrue(complex2.isNaN());
      assertTrue(complex0.isInfinite());
      assertNotSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(2877.255, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2877.255, 2877.255, 2877.255).when(univariateRealFunction0).value(anyDouble());
      double[] doubleArray0 = FastFourierTransformer.sample(univariateRealFunction0, (-186.5862121985), Double.POSITIVE_INFINITY, 3);
      assertArrayEquals(new double[] {2877.255, 2877.255, 2877.255}, doubleArray0, 0.01);
      
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.cos();
      assertEquals(0.5403023058681398, complex1.abs(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = new Complex(1317.487302261113, Double.NEGATIVE_INFINITY);
      complex0.pow(complex0);
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
  public void test32()  throws Throwable  {
      Complex complex0 = new Complex(2877.255, Double.POSITIVE_INFINITY);
      complex0.asin();
      try { 
        FastFourierTransformer.verifyInterval(Double.POSITIVE_INFINITY, 7048350.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [Infinity, 7048350.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) null, 2295.766143, (double) 32, 32);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [2295.766143, 32.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ONE;
      complex0.acos();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 835.0748, (double) 4, 1402);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [835.0748, 4.0]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.NaN;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 0.026949200278114205, 0.026949200278114205, (-1));
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
      Complex complex0 = Complex.ONE;
      complex0.asin();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, (-3.292681647862634), (-3.292681647862634), (-1));
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
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2877.255, 2877.255, 2877.255).when(univariateRealFunction0).value(anyDouble());
      double[] doubleArray0 = FastFourierTransformer.sample(univariateRealFunction0, (-186.5862121985), Double.POSITIVE_INFINITY, 3);
      assertArrayEquals(new double[] {2877.255, 2877.255, 2877.255}, doubleArray0, 0.01);
      
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = new Complex((-512.544192), Double.NEGATIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals((-512.544192), complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.abs(), 0.01);
      
      Complex complex3 = complex0.pow(complex0);
      assertEquals(0.0, complex0.abs(), 0.01);
      assertFalse(complex3.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, (-2944.0), (-1068.86097843703), 157);
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
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.NaN;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 0.026949200278114205, 0.026949200278114205, (-1));
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
      Complex complex0 = Complex.I;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 6.283185307179586, 2.0, (-2448));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ZERO;
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      complex0.pow(complex0);
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.acos();
      assertEquals(1.5707963267948966, complex1.abs(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      
      Complex complex2 = Complex.NaN;
      Complex complex3 = complex2.asin();
      assertTrue(complex3.isNaN());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.NaN;
      complex0.sqrt1z();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, (-3240.1187), (-3240.1187), (-3081));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = new Complex((-530.4952674506968), Double.NEGATIVE_INFINITY);
      complex0.pow(complex1);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 1198);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-Infinity, -Infinity]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertTrue(complex1.isNaN());
      
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex2.tan();
      Complex complex4 = complex3.log();
      assertEquals(Double.NEGATIVE_INFINITY, complex4.getReal(), 0.01);
      assertEquals(0.0, complex4.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertTrue(complex4.isInfinite());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.acos();
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.acos();
      assertEquals(1.5707963267948966, complex2.getReal(), 0.01);
      assertEquals(1.5707963267948966, complex2.abs(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.ONE;
      complex0.cos();
      Complex[] complexArray0 = new Complex[1];
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
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.INF;
      complex0.cos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform2(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2877.255, 2877.255, 2877.255).when(univariateRealFunction0).value(anyDouble());
      double[] doubleArray0 = FastFourierTransformer.sample(univariateRealFunction0, (-186.5862121985), Double.POSITIVE_INFINITY, 3);
      assertArrayEquals(new double[] {2877.255, 2877.255, 2877.255}, doubleArray0, 0.01);
      
      Complex complex0 = Complex.ONE;
      Complex complex1 = new Complex(3.141592653589793, Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      Complex complex3 = complex2.pow(complex0);
      assertEquals(3.141592653589793, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.abs(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.NaN, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.acos();
      double[] doubleArray0 = new double[2];
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      assertEquals(2, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Complex[] complexArray0 = new Complex[5];
      Complex complex0 = Complex.NaN;
      complex0.acos();
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
  public void test53()  throws Throwable  {
      Complex complex0 = new Complex(9.263159838417488, 9.263159838417488);
      Complex complex1 = complex0.asin();
      assertEquals(3.358543204473802, complex1.abs(), 0.01);
      assertEquals(0.7839414013282079, complex1.getReal(), 0.01);
      
      Complex complex2 = new Complex((-512.544192), Double.NEGATIVE_INFINITY);
      Complex complex3 = complex0.multiply(complex2);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = Double.POSITIVE_INFINITY;
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.multiply(complex0);
      assertSame(complex2, complex0);
      
      Complex complex3 = complex1.acos();
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex1.abs(), 0.01);
      assertEquals(1.5707963267948966, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2877.255, 2877.255, 2877.255).when(univariateRealFunction0).value(anyDouble());
      double[] doubleArray0 = FastFourierTransformer.sample(univariateRealFunction0, (-186.5862121985), Double.POSITIVE_INFINITY, 3);
      assertArrayEquals(new double[] {2877.255, 2877.255, 2877.255}, doubleArray0, 0.01);
      
      Complex complex0 = new Complex(2877.255, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.atan();
      assertEquals(2877.255, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Complex complex0 = new Complex(9.263159838417488, 9.263159838417488);
      Complex complex1 = Complex.ZERO;
      Complex complex2 = new Complex((-512.544192), Double.NEGATIVE_INFINITY);
      Complex complex3 = complex2.pow(complex0);
      assertEquals(9.263159838417488, complex0.getImaginary(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals((-512.544192), complex2.getReal(), 0.01);
      assertEquals(13.10008627391978, complex0.abs(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.abs(), 0.01);
      assertEquals(Double.NaN, complex3.abs(), 0.01);
      
      Complex complex4 = complex1.pow(complex1);
      assertEquals(0.0, complex1.abs(), 0.01);
      assertNotSame(complex4, complex3);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Complex complex0 = new Complex(9.263159838417488, 9.263159838417488);
      Complex complex1 = complex0.asin();
      Complex complex2 = new Complex((-512.544192), Double.NEGATIVE_INFINITY);
      Complex complex3 = complex2.pow(complex1);
      assertEquals(0.7839414013282079, complex1.getReal(), 0.01);
      assertEquals(3.358543204473802, complex1.abs(), 0.01);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.NaN, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(9.263159838417488, 9.263159838417488);
      complex0.asin();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(Double.NEGATIVE_INFINITY, 9.263159838417488);
      complex0.pow(complex0);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = Complex.NaN;
      complex0.asin();
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
  public void test62()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex complex0 = new Complex(9.263159838417488, 9.263159838417488);
      Complex complex1 = new Complex((-512.544192), Double.NEGATIVE_INFINITY);
      complex1.pow(complex0);
      double[] doubleArray0 = new double[8];
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Complex complex0 = new Complex(2879.259672282125, Double.POSITIVE_INFINITY);
      complex0.pow(complex0);
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
  public void test64()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double[] doubleArray1 = FastFourierTransformer.sample(polynomialFunction0, (-305.0825481801149), 0.7080734182735711, 3);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray1, 0.01);
      
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
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
  public void test66()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
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
  public void test67()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.pow(complex0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      complex1.asin();
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(8, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Complex complex0 = Complex.NaN;
      complex0.pow(complex0);
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, 80.0, 1193.197029, 57);
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
      Complex complex0 = Complex.INF;
      complex0.cosh();
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.acos();
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
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
}
