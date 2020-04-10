/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 15:29:06 GMT 2019
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
        MathUtils.subAndCheck((long) (short)1397, (-9223372036854775808L));
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
      long long0 = MathUtils.subAndCheck((-4868L), (-9223372036854775808L));
      assertEquals(9223372036854770940L, long0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((int) (short)1413, (-2147483646));
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
      int int0 = MathUtils.subAndCheck(2123, (-167));
      assertEquals(2290, int0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-23560192), 2147483600);
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
      short short0 = MathUtils.sign((short)1397);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      short short0 = MathUtils.sign((short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      short short0 = MathUtils.sign((short) (-1671));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      long long0 = MathUtils.sign(42L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      long long0 = MathUtils.sign((long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      long long0 = MathUtils.sign((-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      int int0 = MathUtils.sign(1088);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      int int0 = MathUtils.sign(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      int int0 = MathUtils.sign((-185));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      float float0 = MathUtils.sign((-2437.86F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      float float0 = MathUtils.sign((float) 0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      float float0 = MathUtils.sign(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      float float0 = MathUtils.sign((float) 32);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      double double0 = MathUtils.sign((-2609.3243983701277));
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
      byte byte0 = MathUtils.sign((byte)17);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte) (-76));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      float float0 = MathUtils.round((float) 7, 7, 7);
      assertEquals(7.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      float float0 = MathUtils.round((-985.8134F), 0);
      assertEquals((-986.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      float float0 = MathUtils.round(Float.NaN, 6, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      float float0 = MathUtils.round((float) 6, 6, 6);
      assertEquals(6.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      float float0 = MathUtils.round((-1.0733098F), 6, 6);
      assertEquals((-1.07331F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      float float0 = MathUtils.round((float) 5, 27, 5);
      assertEquals(5.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      float float0 = MathUtils.round((-1.0F), 3, 3);
      assertEquals((-1.001F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      float float0 = MathUtils.round((-891.38F), 2, 2);
      assertEquals((-891.37F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round((float) 51, 51, 51);
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
      float float0 = MathUtils.round((float) 6, 2608, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      float float0 = MathUtils.round((float) 3, 3, 3);
      assertEquals(2.999F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      float float0 = MathUtils.round((float) 0, 27, 0);
      assertEquals(1.0E-27F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      double double0 = MathUtils.round(Double.NEGATIVE_INFINITY, (-203), (-1));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      double double0 = MathUtils.round(Double.NaN, (-27), (-27));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      double double0 = MathUtils.nextAfter(2, 0.0);
      assertEquals(1.9999999999999998, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double double0 = MathUtils.nextAfter(1.9999999999999998, 3326);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      float float0 = MathUtils.round((float) 2, (-1), 2);
      assertEquals(10.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      float float0 = MathUtils.round((float) 1, 5, 5);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      float float0 = MathUtils.round((float) 1088, 1088, 1);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      float float0 = MathUtils.round(Float.NaN, (-947));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(9223372036854775807L, 9223372036854775807L);
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
      long long0 = MathUtils.mulAndCheck((long) 27, (long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(1L, (long) (short) (-3540));
      assertEquals((-3540L), long0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((-9223372036854775808L), 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-9223372036854775808L), (-9223372036854775808L));
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
      long long0 = MathUtils.mulAndCheck((-278L), (-278L));
      assertEquals(77284L, long0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-3453153139968092L), 1205649897524053L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) 5, (long) 1);
      assertEquals(5L, long0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      int int0 = MathUtils.mulAndCheck((-4096), (-4096));
      assertEquals(16777216, int0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(65536, 65536);
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
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(16777216, (-4096));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      short short0 = MathUtils.indicator((short)1375);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      short short0 = MathUtils.indicator((short) (-3525));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      long long0 = MathUtils.indicator(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      long long0 = MathUtils.indicator((-4L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      int int0 = MathUtils.indicator(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      int int0 = MathUtils.indicator((-2526));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round(Float.NaN, 7, 7);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Inexact result from rounding
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      double double0 = MathUtils.indicator(0.9999999850988388);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      double double0 = MathUtils.indicator(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      double double0 = MathUtils.indicator((-976.6569));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte)10);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte) (-68));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      int int0 = MathUtils.hash((double[]) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      int int0 = MathUtils.hash(doubleArray0);
      assertEquals(1030054790, int0);
      assertEquals(6, doubleArray0.length);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = MathUtils.gcd(51520, (-217));
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = MathUtils.gcd(6, 6);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int int0 = MathUtils.gcd((-1799), 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialLog((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n > 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial((-214));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial(1370);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // result too large to represent in a long integer
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      long long0 = MathUtils.factorial(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = (double) (-163);
      double[] doubleArray1 = new double[7];
      boolean boolean0 = MathUtils.equals(doubleArray1, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[3];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      boolean boolean0 = MathUtils.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      boolean boolean0 = MathUtils.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.NaN;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(Double.NaN, (double) 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(0, (-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(1, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(2, 2);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientDouble((-1), (-20));
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
        MathUtils.binomialCoefficientLog((-1373), 1);
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
        MathUtils.binomialCoefficient(2882, 1989);
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
      long long0 = MathUtils.binomialCoefficient(0, (-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(615, 1);
      assertEquals(615L, long0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(2882, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(2083, 2);
      assertEquals(2168403L, long0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-197), (-197));
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
        MathUtils.binomialCoefficient((-2292), 1);
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
      long long0 = MathUtils.binomialCoefficient(2, 2);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      long long0 = MathUtils.addAndCheck(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      long long0 = MathUtils.addAndCheck((-13L), (-13L));
      assertEquals((-26L), long0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(9223372036854775776L, 9223372036854775776L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((long) 1424, (long) 1424);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(1994091958, 1994091958);
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
      int int0 = MathUtils.addAndCheck(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck((-1390051339), (-1390051339));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      double double0 = MathUtils.log((-365.86175), 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      double double0 = MathUtils.round((double) (-1), 2);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      double double0 = MathUtils.cosh(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(2, 1);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle(2262.9, 2262.9);
      assertEquals(2262.9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      double double0 = MathUtils.sinh((-1856.2046081730343));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck((-9223372036854775808L), (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      float float0 = MathUtils.round((float) 1, (-1799), 1);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.lcm(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }
}
