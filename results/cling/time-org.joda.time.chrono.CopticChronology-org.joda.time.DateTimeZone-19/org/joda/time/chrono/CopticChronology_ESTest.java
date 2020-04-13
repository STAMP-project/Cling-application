/*

 * Tue Mar 03 17:44:41 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.temporal.ChronoField;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CopticChronology_ESTest extends CopticChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime.now();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(2187);
      assertEquals(15800659200000L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-15));
      dateTimeZone0.convertLocalToUTC((long) (-15), false);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, 2957);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 2957
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.convertLocalToUTC((long) 1, false);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null, 3);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      CopticChronology copticChronology1 = new CopticChronology((Chronology) null, copticChronology0, 1);
      assertFalse(copticChronology1.equals((Object)copticChronology0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDate.now();
      try { 
        DateTimeZone.forOffsetHoursMinutes((-106), (-106));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -106
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) (-823));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+I2*$o7k!C#ufc^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+I2*$o7k!C#ufc^\" is malformed at \"I2*$o7k!C#ufc^\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDate.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+(Jgp$@U0oAQ+D6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+(Jgp$@U0oAQ+D6\" is malformed at \"(Jgp$@U0oAQ+D6\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology.getInstance((DateTimeZone) null);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 1);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime.now();
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 1177);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1177
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone.forOffsetHours(0);
      LocalTime localTime0 = LocalTime.now();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDate.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      CopticChronology copticChronology0 = new CopticChronology((Chronology) null, dateTimeZone0, 1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalTime.fromMillisOfDay((long) 1);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(4);
      assertEquals((-53089516800000L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LocalTime.fromMillisOfDay((long) 1);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(2620);
      assertEquals(29465164800000L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 1177);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1177
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDate.now();
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-794));
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      copticChronology0.withZone(dateTimeZone0);
      assertEquals("-00:00:00.794", dateTimeZone0.toString());
      assertEquals("-00:00:00.794", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalTime.fromMillisOfDay((long) 1);
      copticChronology0.withZone(dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime.now();
      Chronology chronology0 = copticChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone.forOffsetHours((-30));
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) (-30));
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone.forOffsetHours((-24));
      LocalTime localTime0 = LocalTime.now();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) (-805));
      ChronoField chronoField0 = ChronoField.DAY_OF_YEAR;
      CopticChronology copticChronology0 = null;
      try {
        copticChronology0 = new CopticChronology((Chronology) null, chronoField0, (-805));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -805
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-156));
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, true);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone.forID((String) null);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 1);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC(1587L, true);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals((-3598413L), long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CopticChronology.getInstance((DateTimeZone) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 1);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, (-388));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -388
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 1);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalDate.now();
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone1.getID());
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-59999L), long0);
      assertEquals("+00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3659999L), long0);
      assertEquals("+01:01", dateTimeZone0.getID());
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(3251);
      assertEquals(49377945600000L, long1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LocalTime.fromMillisOfDay((long) 1);
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertSame(copticChronology0, chronology0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-141));
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, false);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(3, 3);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 3, true);
      assertEquals((-10979997L), long0);
      assertEquals("+03:03", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3659999L), long0);
      
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      copticChronology0.withZone(dateTimeZone0);
      assertEquals("+01:01", dateTimeZone0.getID());
      assertEquals("+01:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) (-823));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-141));
      dateTimeZone0.convertLocalToUTC((long) (-141), false);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-141), (-1548));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1548
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      copticChronology0.withZone(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours((-141));
      // Undeclared exception!
      try { 
        dateTimeZone1.convertLocalToUTC(9223372036854775807L, true);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3659999L), long0);
      
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertEquals("+01:01", dateTimeZone0.toString());
      assertNotSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      LocalTime localTime0 = new LocalTime();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalDate.now();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(2176);
      assertEquals(15453590400000L, long0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZone.forOffsetHours(0);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis((-147));
      assertEquals((-57854736000000L), long1);
  }
}
