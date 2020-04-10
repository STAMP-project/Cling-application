/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 20:32:57 GMT 2019
 */

package org.joda.time.field;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.FieldUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Object object0 = new Object();
      boolean boolean0 = FieldUtils.equals((Object) integer0, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = FieldUtils.equals((Object) null, (Object) "ConverterManager.alterIntervalConverters");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = FieldUtils.equals(object0, object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = FieldUtils.equals(object0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue((-62), (-62), (-62), (-1));
      assertEquals((-62), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue((-991), (-991), 3799);
      assertEquals((-991), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.getWrappedValue((-975), (-975), (-975));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FieldUtils.verifyValueBounds("\"bf^4e3%=4", 18, 18, 18);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds("\"bf^4e3%=4", 0, 0, (-3892));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for \"bf^4e3%=4 must be in the range [0,-3892]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds("\"bf^4e3%=4", (-3892), (-36), (-3892));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -3892 for \"bf^4e3%=4 must be in the range [-36,-3892]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDateTime localDateTime0 = null;
      try {
        localDateTime0 = new LocalDateTime(1, 1, 1, 525, 1, 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 525 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDateTime localDateTime0 = null;
      try {
        localDateTime0 = new LocalDateTime((-1160), 1, (-1160), (-1160), 1, 1, (-1160));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1160 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeField0, 1, 1, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1 for weekOfWeekyear must be in the range [1,0]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      long long0 = buddhistChronology0.getDateTimeMillis(1, 1, 1, 1);
      assertEquals((-79271567999999L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeField0, (-1), 1, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for weekOfWeekyear must be in the range [1,-1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeToInt((-13936274803L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -13936274803
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((long) (-1), (-9223372036854775778L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -1 * -9223372036854775778
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-9223372036854775808L), (long) (-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * -1
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiplyToInt(31449600010L, 31449600010L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 31449600010 * 31449600010
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((-1013L), 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt(0L, 0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt(1L, 1388L);
      assertEquals(1388, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt(1L, 1L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) 11, 11);
      assertEquals(121L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) (-1), (-1));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) 36, 1);
      assertEquals(36L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-9223372036854775808L), 4836);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * 4836
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-9223372036854775808L), (-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * -1
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply(21600000, 21600000);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 21600000 * 21600000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = FieldUtils.safeMultiply((-48), (-48));
      assertEquals(2304, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply(2147483086, (-62));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483086 * -62
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract((-1361L), (-1361L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeSubtract((-9223372036854775770L), 1000000000000038L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -9223372036854775770 - 1000000000000038
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract(1854L, 1854L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      long long0 = FieldUtils.safeAdd((-1L), 1771L);
      assertEquals(1770L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeAdd((-9223372036854775763L), (-9223372036854775763L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -9223372036854775763 + -9223372036854775763
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      long long0 = FieldUtils.safeAdd(4252L, 4252L);
      assertEquals(8504L, long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeAdd(2145338309, 2145338309);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2145338309 + 2145338309
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = FieldUtils.safeAdd((-70), 1948);
      assertEquals(1878, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = FieldUtils.safeAdd((-48), (-48));
      assertEquals((-96), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeNegate(Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = FieldUtils.safeNegate((-1));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue((-48), (-96), (-96), (-48));
      assertEquals((-95), int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiplyToInt(2147483647L, 2147483647L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 4611686014132420609
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
