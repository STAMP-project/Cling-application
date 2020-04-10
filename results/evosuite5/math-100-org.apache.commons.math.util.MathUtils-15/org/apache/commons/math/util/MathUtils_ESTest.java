/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 15:03:06 GMT 2019
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.util.MathUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MathUtils_ESTest extends MathUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(4503599627370496L, (-9223372036854775740L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((-1808L), (-9223372036854775740L));
      assertEquals(9223372036854773932L, long0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      int int0 = MathUtils.subAndCheck((int) (byte)0, 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(Integer.MAX_VALUE, (-1337));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-2147483647), 1029);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      short short0 = MathUtils.sign((short) (-132));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      short short0 = MathUtils.sign((short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      short short0 = MathUtils.sign((short)646);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      long long0 = MathUtils.sign(1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      long long0 = MathUtils.sign(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      long long0 = MathUtils.sign((-15L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      int int0 = MathUtils.sign((-2));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      int int0 = MathUtils.sign(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      int int0 = MathUtils.sign(1096);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      float float0 = MathUtils.sign((-1.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      float float0 = MathUtils.sign(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      float float0 = MathUtils.sign(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      float float0 = MathUtils.sign(3157.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      double double0 = MathUtils.sign((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      double double0 = MathUtils.sign((double) 0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      double double0 = MathUtils.sign(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      double double0 = MathUtils.sign((double) 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte) (-6));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)54);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      float float0 = MathUtils.round(14.0F, 14, 7);
      assertEquals(14.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      float float0 = MathUtils.round((-1218.4564F), (-1));
      assertEquals((-1220.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      float float0 = MathUtils.round((float) 6, 667, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      float float0 = MathUtils.round((float) 6, 6, 6);
      assertEquals(6.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      float float0 = MathUtils.round(Float.NaN, 667, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      float float0 = MathUtils.round((float) 5, 5, 5);
      assertEquals(5.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      float float0 = MathUtils.round((float) 2, (-1508), 2);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round(Float.NaN, 32, 32);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding method.
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      float float0 = MathUtils.round((float) 5, 199, 5);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      float float0 = MathUtils.round((float) (-1), 1, 1);
      assertEquals((-0.9F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      float float0 = MathUtils.round((float) (short) (-846), (int) (short) (-1), 0);
      assertEquals((-850.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      double double0 = MathUtils.round(Double.POSITIVE_INFINITY, 0, 1);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      double double0 = MathUtils.round(Double.NaN, 0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      double double0 = MathUtils.nextAfter(32, (-577.56799352721));
      assertEquals(31.999999999999996, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      double double0 = MathUtils.nextAfter(0.9999999999999999, 1114.42);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      float float0 = MathUtils.round((float) 3, 3, 3);
      assertEquals(2.999F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      float float0 = MathUtils.round((float) (-2763), (-1473), 3);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      float float0 = MathUtils.round((-1113.9F), (-1508), 2);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      float float0 = MathUtils.round(10.881633F, 773);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      double double0 = MathUtils.nextAfter(Double.NaN, (-464.874083117526));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(9218868437227405347L, 9218868437227405347L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) (short)646, (long) (byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-3786L), 4503599627370496L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((-1L), 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-1903L), (-9223372036854775807L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((-359L), (-359L));
      assertEquals(128881L, long0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(1547L, (-13L));
      assertEquals((-20111L), long0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(706L, 2146085547L);
      assertEquals(1515136396182L, long0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-901120), (-901120));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.lcm((-4165), 1789569706);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      short short0 = MathUtils.indicator((short)0);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      short short0 = MathUtils.indicator((short) (-3));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      long long0 = MathUtils.indicator((long) 741);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      long long0 = MathUtils.indicator((-268L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      int int0 = MathUtils.indicator(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      int int0 = MathUtils.indicator((-1044));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round(Float.NaN, 5, 7);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Inexact result from rounding
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      double double0 = MathUtils.indicator(2477.2848121);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      double double0 = MathUtils.indicator(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      double double0 = MathUtils.indicator((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte)18);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte) (-1));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int int0 = MathUtils.hash((double[]) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      int int0 = MathUtils.hash(doubleArray0);
      assertEquals(6, doubleArray0.length);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1030054790, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = MathUtils.gcd(538, 7);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = MathUtils.gcd((-2763), (-1506));
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = MathUtils.lcm(0, 773);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialLog((byte) (-26));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n > 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialDouble((-1324));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial(73);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // result too large to represent in a long integer
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      long long0 = MathUtils.factorial(3);
      assertEquals(6L, long0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 1;
      double[] doubleArray1 = new double[6];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertEquals(6, doubleArray0.length);
      assertEquals(6, doubleArray1.length);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertFalse(boolean0);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[13];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertEquals(7, doubleArray0.length);
      assertEquals(13, doubleArray1.length);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(boolean0);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean boolean0 = MathUtils.equals(doubleArray0, (double[]) null);
      assertEquals(1, doubleArray0.length);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      boolean boolean0 = MathUtils.equals((double[]) null, doubleArray0);
      assertEquals(0, doubleArray0.length);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (double) Float.NaN;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertEquals(3, doubleArray0.length);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NaN}, doubleArray0, 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(Double.NaN, 518.454940046);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble((byte)0, (-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(741, 1);
      assertEquals(741.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(1, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(1122, 1122);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientDouble((-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog((-1417), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(2158, 1079);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // result too large to represent in a long integer
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(32, 31);
      assertEquals(32L, long0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(57, 1);
      assertEquals(57L, long0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(32, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(14, 14);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-890), (-890));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(1, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      long long0 = MathUtils.subAndCheck(1L, (-359L));
      assertEquals(360L, long0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((-1247L), 1L);
      assertEquals((-1248L), long0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      long long0 = MathUtils.subAndCheck(4503599627370495L, 4503599627370495L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(9223372036854775448L, (-1248L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      int int0 = MathUtils.addAndCheck((-1), (-5792));
      assertEquals((-5793), int0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(Integer.MAX_VALUE, Integer.MAX_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck((-2060943343), (-2060943343));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      double double0 = MathUtils.log(1, 1.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      double double0 = MathUtils.round((double) 32, 32);
      assertEquals(32.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      double double0 = MathUtils.cosh((-3650.527));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(2, (-1508));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle(0.5, 10.881633F);
      assertEquals(13.066370614359172, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      double double0 = MathUtils.sinh(1.0);
      assertEquals(1.1752011936438014, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck((-9223372036854775717L), (-9223372036854775717L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      float float0 = MathUtils.round((float) 64, (-2), 6);
      assertEquals(100.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      int int0 = MathUtils.lcm(32, 32);
      assertEquals(32, int0);
  }
}
