/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 04:41:49 GMT 2019
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.FieldUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      Object object0 = new Object();
      boolean boolean0 = FieldUtils.equals(object0, (Object) dateTimeFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = FieldUtils.equals((Object) null, object0);
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
      int int0 = FieldUtils.getWrappedValue((-220), 0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(443, 1738, 443, 1738);
      assertEquals(885, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue((-220), (-3), 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(" - ", 0, 0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for  -  must be in the range [0,-1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FieldUtils.verifyValueBounds(" - ", (-3728), (-3728), (-3728));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds("HvP,:H^", 0, 570025, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for HvP,:H^ must be in the range [570025,0]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeFieldType0, 570025, (-755), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 570025 for dayOfMonth must be in the range [-755,0]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeFieldType0, (-429), 1882, (-429));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -429 for secondOfMinute must be in the range [1882,-429]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      try { 
        buddhistChronology0.getDateTimeMillis(2146254417, 2146254417, 2146254417, 2146254417);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2146254417 for year must be in the range [-292268511,292279536]
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
      DateTimeField dateTimeField0 = buddhistChronology0.era();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeField0, 13, 26, 13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 13 for era must be in the range [26,13]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeToInt((-9223372036854775719L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -9223372036854775719
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiplyToInt((-2147483648L), (-2147483648L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 4611686018427387904
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-9223372036854775771L), (long) (-1));
       //  fail("Expecting exception: ArithmeticException");
       // Unstable assertion
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775771 * -1
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((long) (-1), (-9223372036854775771L));
       //  fail("Expecting exception: ArithmeticException");
       // Unstable assertion
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -1 * -9223372036854775771
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(214L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt(1L, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(1L, 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) (-2147483645), (-2147483645));
      assertEquals(4611686005542486025L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) (-1), (-1));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-9223372036854775783L), 400);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775783 * 400
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(32L, 1);
      assertEquals(32L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((-9223372036854775771L), 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-9223372036854775758L), (-1));
       //  fail("Expecting exception: ArithmeticException");
       // Unstable assertion
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775758 * -1
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-2146091865), (-2146091865));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -2146091865 * -2146091865
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = FieldUtils.safeMultiply(14, 14);
      assertEquals(196, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-2146091888), 2146674498);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -2146091888 * 2146674498
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeSubtract((-9223372036854775776L), 1478888435L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -9223372036854775776 - 1478888435
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract((-2146489403L), (-2146489403L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract(3L, 3L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      long long0 = FieldUtils.safeAdd((long) 2146613516, (-2147483648L));
      assertEquals((-870132L), long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeAdd((-9223372036854775723L), (-9223372036854775723L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -9223372036854775723 + -9223372036854775723
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      long long0 = FieldUtils.safeAdd(3448L, 3448L);
      assertEquals(6896L, long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeAdd((-2146091845), (-2146091845));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2146091845 + -2146091845
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = FieldUtils.safeAdd(13, (-262));
      assertEquals((-249), int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = FieldUtils.safeAdd(13, 13);
      assertEquals(26, int0);
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
      int int0 = FieldUtils.safeNegate((-3266));
      assertEquals(3266, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.getWrappedValue(0, 0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiplyToInt(10333691314176L, 10333691314176L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 10333691314176 * 10333691314176
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
