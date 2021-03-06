/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:25:27 GMT 2019
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
        MathUtils.subAndCheck((long) 1298, (-9223372036854775808L));
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
      long long0 = MathUtils.subAndCheck((-1308L), (-9223372036854775808L));
      assertEquals(9223372036854774500L, long0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(2147483620, (-3429));
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
      int int0 = MathUtils.subAndCheck((int) (short)1, (int) (short)1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-2147483622), 3219);
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
      short short0 = MathUtils.sign((short) (-880));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      short short0 = MathUtils.sign((short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      short short0 = MathUtils.sign((short)1);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      long long0 = MathUtils.sign((long) (-2780));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      long long0 = MathUtils.sign(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      long long0 = MathUtils.sign((long) 1750);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      int int0 = MathUtils.sign((-2029));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      int int0 = MathUtils.sign(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      int int0 = MathUtils.sign(1027);
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
      float float0 = MathUtils.sign(1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      double double0 = MathUtils.sign((-6.718487346858367E18));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      double double0 = MathUtils.sign((double) (short)1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      double double0 = MathUtils.sign((double) Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      double double0 = MathUtils.sign((double) 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)1);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte) (-81));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      float float0 = MathUtils.round((float) 7, 7, 7);
      assertEquals(7.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      float float0 = MathUtils.round(1767.2289F, 3);
      assertEquals(1767.229F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      float float0 = MathUtils.round((float) (-484), 1024, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      float float0 = MathUtils.round((float) 6, 6, 6);
      assertEquals(6.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      float float0 = MathUtils.round(4.965782F, 1, 6);
      assertEquals(5.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      float float0 = MathUtils.round((-1.0F), (-1), 5);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      float float0 = MathUtils.round((float) 3, 3, 3);
      assertEquals(2.999F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      float float0 = MathUtils.round(876.9F, 1151, 2);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round((float) 3, (-21), (-21));
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
      // Undeclared exception!
      try { 
        MathUtils.round((float) 3, (-25), 7);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Inexact result from rounding
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      float float0 = MathUtils.round((float) 0, 1024, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      float float0 = MathUtils.round(0.0F, (-1), 5);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      float float0 = MathUtils.round((float) 1, 1, 1);
      assertEquals(0.9F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      double double0 = MathUtils.round(Double.POSITIVE_INFINITY, 0, 0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      double double0 = MathUtils.round(Double.NaN, (-801), (-801));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double double0 = MathUtils.nextAfter(0.5, 0L);
      assertEquals(0.49999999999999994, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      double double0 = MathUtils.nextAfter(9223372036854774310L, 9223372036854774310L);
      assertEquals(9.223372036854776E18, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      float float0 = MathUtils.round((float) (-21), 3, 3);
      assertEquals((-21.001F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      float float0 = MathUtils.round(1.0F, 2254);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) (short)1, (long) (short)1732);
      assertEquals(1732L, long0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(1L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) 1, (-744L));
      assertEquals((-744L), long0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) (-5288), 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-40L), (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-40L), 9223372036854775799L);
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
      long long0 = MathUtils.mulAndCheck((long) (-1839), (long) (-1839));
      assertEquals(3381921L, long0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(51240955760304310L, (long) 2254);
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
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-2174963), (-2174963));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-3429), 2147483646);
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
      short short0 = MathUtils.indicator((short)1732);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      short short0 = MathUtils.indicator((short) (-900));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      long long0 = MathUtils.indicator((long) 32);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      long long0 = MathUtils.indicator((long) (-6));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      int int0 = MathUtils.indicator(6);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      int int0 = MathUtils.indicator((-24));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      float float0 = MathUtils.round((float) (-270L), (-2145776579), 2);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      float float0 = MathUtils.round(Float.NaN, 0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      double double0 = MathUtils.indicator((double) 32);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      double double0 = MathUtils.indicator(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      double double0 = MathUtils.indicator((double) (-2339L));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte)1);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte) (-26));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int int0 = MathUtils.hash((double[]) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      int int0 = MathUtils.hash(doubleArray0);
      assertEquals((-1574733816), int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = MathUtils.gcd(1024, 242);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = MathUtils.gcd(2, (-2145776579));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialLog((-32));
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
        MathUtils.factorial((-1));
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
        MathUtils.factorial(28);
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
      long long0 = MathUtils.factorial(10);
      assertEquals(3628800L, long0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) (short)1;
      double[] doubleArray1 = new double[3];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      double[] doubleArray0 = new double[19];
      double[] doubleArray1 = new double[2];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
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
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean boolean0 = MathUtils.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(Double.NaN, (double) 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(Double.NaN, Double.NaN);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(0, (-1));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog((short)1732, 1);
      assertEquals(7.4570320891223805, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(1, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(32, 32);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientDouble((-3099), (-3099));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog((-391), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(0, (byte) (-7));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(0, (-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(5, (byte)1);
      assertEquals(5L, long0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(1662062600, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(28, 28);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-2780), (-2780));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-1), (byte)1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      long long0 = MathUtils.subAndCheck(0L, (-9223372036854774310L));
      assertEquals(9223372036854774310L, long0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((long) (-3077), 2422030L);
      assertEquals((-2425107L), long0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck((-9223372036854774296L), (-9223372036854774296L));
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
      long long0 = MathUtils.subAndCheck((long) 32, 280400L);
      assertEquals((-280368L), long0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      int int0 = MathUtils.addAndCheck(2254, 2254);
      assertEquals(4508, int0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(1106427913, 1106427913);
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
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck((-1093107712), (-1093107712));
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
      double double0 = MathUtils.log((-6.718487346858367E18), (-6.718487346858367E18));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      double double0 = MathUtils.round(1.0, 6171);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      double double0 = MathUtils.cosh(838.296793);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      float float0 = MathUtils.round((float) 0, 0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(4004, 1750);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // result too large to represent in a long integer
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle(0.0, 1.0F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      double double0 = MathUtils.sinh((-4.9E-324));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck((long) 1207, 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      float float0 = MathUtils.round((float) 0, 0, 0);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      int int0 = MathUtils.lcm((-2147483647), (-2147483647));
      assertEquals(Integer.MAX_VALUE, int0);
  }
}
