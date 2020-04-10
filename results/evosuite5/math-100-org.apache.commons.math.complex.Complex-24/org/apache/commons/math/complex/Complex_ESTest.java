/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 11:44:12 GMT 2019
 */

package org.apache.commons.math.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.complex.Complex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Complex_ESTest extends Complex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.tanh();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.tan();
      assertFalse(complex0.isNaN());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ONE.tan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.557407724654902, complex1.abs(), 0.01);
      assertEquals(1.557407724654902, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.sqrt();
      assertEquals(1.0, complex1.abs(), 0.01);
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.sinh();
      assertTrue(complex1.isNaN());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ZERO.sinh();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sin();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sin();
      assertEquals(0.8414709848078965, complex1.abs(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.8414709848078965, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex complex0 = Complex.INF;
      // Undeclared exception!
      try { 
        complex0.ZERO.pow((Complex) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.pow(complex0);
      assertTrue(complex1.isNaN());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cosh();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.cosh();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cos();
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.acos();
      assertTrue(complex1.isNaN());
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt1z();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.subtract(complex0);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.negate();
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.asin();
      assertEquals(1.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.multiply(complex1);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      boolean boolean0 = complex0.isInfinite();
      assertFalse(boolean0);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.hashCode();
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Complex complex0 = new Complex(5.176680583562439E-6, 5.176680583562439E-6);
      complex0.hashCode();
      assertEquals(5.176680583562439E-6, complex0.getReal(), 0.01);
      assertEquals(5.176680583562439E-6, complex0.getImaginary(), 0.01);
      assertEquals(7.3209318893474695E-6, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      boolean boolean0 = complex0.equals(complex1);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertFalse(boolean0);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = new Complex(5.176680583562439E-6, 5.176680583562439E-6);
      Complex complex1 = new Complex(5.176680583562439E-6, 5.176680583562439E-6);
      boolean boolean0 = complex0.equals(complex1);
      assertTrue(boolean0);
      assertEquals(7.3209318893474695E-6, complex1.abs(), 0.01);
      assertEquals(5.176680583562439E-6, complex1.getReal(), 0.01);
      assertEquals(5.176680583562439E-6, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      boolean boolean0 = complex0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.NaN;
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertTrue(complex1.isNaN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      assertEquals(1.0, complex0.abs(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = new Complex(5.176680583562439E-6, 5.176680583562439E-6);
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-5.176680583562439E-6), complex2.getImaginary(), 0.01);
      assertEquals(5.176680583562439E-6, complex2.getReal(), 0.01);
      assertEquals(7.3209318893474695E-6, complex2.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.I.pow(complex1);
      Complex complex3 = complex0.divide(complex2);
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
      assertNotSame(complex3, complex2);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
      assertTrue(complex3.isNaN());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertTrue(complex0.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.conjugate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.conjugate();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
      assertTrue(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Complex complex0 = new Complex(5.176680583562439E-6, 5.176680583562439E-6);
      Complex complex1 = complex0.log();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(boolean0);
      assertEquals(11.850827192233933, complex1.abs(), 0.01);
      assertEquals(0.7853981633974483, complex1.getImaginary(), 0.01);
      assertEquals((-11.824772930806033), complex1.getReal(), 0.01);
  }
}
