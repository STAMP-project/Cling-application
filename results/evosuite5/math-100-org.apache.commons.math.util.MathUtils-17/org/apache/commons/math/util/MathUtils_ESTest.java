/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 15:24:01 GMT 2019
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
        MathUtils.subAndCheck(3588L, (-9223372036854775806L));
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
      long long0 = MathUtils.subAndCheck((long) (-90), (-9223372036854775808L));
      assertEquals(9223372036854775718L, long0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(62, (-2147483646));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      int int0 = MathUtils.subAndCheck((int) (byte) (-1), (int) (byte) (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-2147483646), 32931840);
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
      short short0 = MathUtils.sign((short) (-2578));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      short short0 = MathUtils.sign((short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      short short0 = MathUtils.sign((short) (byte)22);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      long long0 = MathUtils.sign(145L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      long long0 = MathUtils.sign(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      long long0 = MathUtils.sign((-19L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      int int0 = MathUtils.sign((-27));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      int int0 = MathUtils.sign(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      int int0 = MathUtils.sign(144);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      float float0 = MathUtils.sign((-5.0F));
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
      float float0 = MathUtils.sign((float) (byte)86);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      double double0 = MathUtils.sign((-1264.55999970489));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      double double0 = MathUtils.sign(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      double double0 = MathUtils.sign(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      double double0 = MathUtils.sign((double) 2);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte) (-81));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)31);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round(1.1143116F, (-10), 7);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Inexact result from rounding
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      float float0 = MathUtils.round(3755.85F, 1);
      assertEquals(3755.9F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      float float0 = MathUtils.round((float) 2796, 2796, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      float float0 = MathUtils.round(91.436F, 6, 6);
      assertEquals(91.436F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      float float0 = MathUtils.round(Float.NaN, 1049, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      float float0 = MathUtils.round(Float.NaN, 1405, 5);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      float float0 = MathUtils.round((-2470.28F), 1413, 3);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      float float0 = MathUtils.round((-3419.6887F), 2, 2);
      assertEquals((-3419.68F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round((float) 32931840, 32931840, 32931840);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding method.
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      float float0 = MathUtils.round((float) 6, (-1), 6);
      assertEquals(10.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      float float0 = MathUtils.round((float) 32931841, 32931841, 1);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      float float0 = MathUtils.round((float) 2796, 2796, 0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      double double0 = MathUtils.round(Double.POSITIVE_INFINITY, (-2482), (-2482));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      double double0 = MathUtils.nextAfter(2, 1L);
      assertEquals(1.9999999999999998, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      double double0 = MathUtils.nextAfter(1.9999999999999998, 2);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      float float0 = MathUtils.round(1.0F, 2, 2);
      assertEquals(1.01F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      float float0 = MathUtils.round((float) 5, (-3216), 5);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(1761056850444286L, 1761056850444286L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) 1408969, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((long) (-2681), 4503599627370495L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(0L, (-1L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((-1L), (-1L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-9223372036854775805L), (-9223372036854775805L));
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
      long long0 = MathUtils.mulAndCheck((long) 144, (-15L));
      assertEquals((-2160L), long0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) (byte)1, (long) (byte)1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(32931840, 32931840);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.lcm((-467779584), 479);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      short short0 = MathUtils.indicator((short)2501);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      short short0 = MathUtils.indicator((short) (-2390));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      long long0 = MathUtils.indicator(2147059054L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      long long0 = MathUtils.indicator((-4413L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      int int0 = MathUtils.indicator(16377);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      int int0 = MathUtils.indicator((-295));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      float float0 = MathUtils.round((float) (byte) (-90), (int) (byte) (-90));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      float float0 = MathUtils.round(Float.NaN, (-952), 3);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      double double0 = MathUtils.indicator((double) 2);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      double double0 = MathUtils.indicator((double) Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      double double0 = MathUtils.indicator((-1264.55999970489));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte)86);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte) (-90));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int int0 = MathUtils.hash((double[]) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      int int0 = MathUtils.hash(doubleArray0);
      assertEquals(2, doubleArray0.length);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1922, int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int int0 = MathUtils.gcd((-2146777702), (-2143329906));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      int int0 = MathUtils.gcd(1413, 65863680);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialLog((byte) (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n > 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial((-7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial((byte)31);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // result too large to represent in a long integer
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      long long0 = MathUtils.factorial(2);
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = (double) (-135);
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[23];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      boolean boolean0 = MathUtils.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      boolean boolean0 = MathUtils.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(Double.NaN, (-3581.07734));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) Float.NaN;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(0, (-1));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(2352, 1);
      assertEquals(7.763021309018518, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(717, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog((-2100), (-2100));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog((byte)1, (byte)86);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(3431, 3128);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // result too large to represent in a long integer
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(23, (byte)22);
      assertEquals(23L, long0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(4, 1);
      assertEquals(4L, long0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(430, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(62, (-17));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-25), (-25));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(8, 131);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(2, 2);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(9223372036854775807L, (-1096L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((long) (byte) (-1), (long) (byte) (-90));
      assertEquals(89L, long0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-1878L), 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(2147477367, 2147477367);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      int int0 = MathUtils.addAndCheck(32931840, 32931840);
      assertEquals(65863680, int0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(Integer.MIN_VALUE, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      double double0 = MathUtils.log(1L, 1L);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      double double0 = MathUtils.round((double) Float.NaN, (int) (byte) (-81));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      double double0 = MathUtils.cosh(3.099999928776878E32);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(322, 322);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle(4.9E-324, 4.9E-324);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      double double0 = MathUtils.sinh(3.099999928776878E32);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      long long0 = MathUtils.addAndCheck(134L, 134L);
      assertEquals(268L, long0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      float float0 = MathUtils.round(1.0F, 32931834, 7);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      int int0 = MathUtils.lcm(0, (-2037));
      assertEquals(0, int0);
  }
}
