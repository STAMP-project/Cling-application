/*

 * Tue Mar 03 17:52:36 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISOChronology_ESTest extends ISOChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      iSOChronology0.withZone((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1203);
      long long0 = dateTimeZone0.adjustOffset(1203, false);
      assertEquals("+00:00:01.203", dateTimeZone0.getID());
      assertEquals(1203L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      long long0 = dateTimeZone0.adjustOffset(100000L, true);
      assertEquals(100000L, long0);
      
      Chronology chronology0 = iSOChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, iSOChronology0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.adjustOffset(21859199998L, false);
      assertEquals(21859199998L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      ISOChronology iSOChronology1 = (ISOChronology)iSOChronology0.withZone(dateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology1.assemble(assembledChronology_Fields0);
      assertNotSame(iSOChronology1, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1082), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      LocalTime localTime0 = LocalTime.now();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = fixedDateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      assertFalse(boolean0);
      
      ISOChronology iSOChronology1 = (ISOChronology)iSOChronology0.withZone(fixedDateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology1.assemble(assembledChronology_Fields0);
      assertNotSame(iSOChronology1, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime(2820L);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(531);
      dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      assertEquals("+531:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone.forOffsetHours((-5));
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      LocalTime localTime1 = localTime0.plusSeconds((-5));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(51);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      LocalTime localTime0 = new LocalTime(dateTimeZone1);
      assertEquals("UTC", dateTimeZone1.toString());
      assertEquals("+51:00", dateTimeZone0.toString());
      assertEquals("+51:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      assertFalse(boolean0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      localTime0.minusMinutes(479);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertSame(iSOChronology0, chronology0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeZone.forTimeZone((TimeZone) null);
      boolean boolean0 = fixedDateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime(2820L);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      ISOChronology iSOChronology1 = (ISOChronology)iSOChronology0.withZone((DateTimeZone) null);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology1.assemble(assembledChronology_Fields0);
      assertNotSame(iSOChronology1, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      LocalTime localTime1 = localTime0.plusSeconds((-2018));
      assertNotSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(20);
      dateTimeZone0.adjustOffset(20, false);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+U");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+U\" is malformed at \"U\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3817);
      dateTimeZone0.adjustOffset(3817, true);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3817);
      dateTimeZone0.adjustOffset(3817, false);
      try { 
        DateTimeZone.forOffsetHoursMinutes(85, 85);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 85
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-3018));
      dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
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
  public void test21()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      dateTimeZone0.adjustOffset(30617280288L, false);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-1561L), (Chronology) iSOChronology0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-4));
      dateTimeZone0.adjustOffset((-4), false);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-4), (-1684));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1684
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      long long0 = dateTimeZone0.adjustOffset(0L, false);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      TimeZone timeZone0 = TimeZone.getTimeZone("-:WV?%hL");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone1.getID());
      
      dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      assertEquals("+00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-1));
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
      // Undeclared exception!
      try { 
        dateTimeZone1.isLocalDateTimeGap((LocalDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      long long0 = dateTimeZone0.adjustOffset(43200000L, true);
      assertEquals(43200000L, long0);
      assertEquals("+00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-4));
      dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      try { 
        DateTimeZone.forOffsetHoursMinutes(2700, 2700);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 2700
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      ISOChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(3, 3);
      dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      assertEquals("+03:03", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
      // Undeclared exception!
      try { 
        dateTimeZone1.isLocalDateTimeGap((LocalDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-5));
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("-05:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      TimeZone timeZone0 = TimeZone.getTimeZone("k&0?&WMRg");
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      // Undeclared exception!
      try { 
        dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.getID());
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      assertEquals("+00:01", dateTimeZone0.getID());
      
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.withMillisOfDay(3600000);
      assertFalse(localTime1.equals((Object)localTime0));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(3, 3);
      dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime(2820L);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1200, 1200);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1200
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(20);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      LocalTime localTime1 = localTime0.plusSeconds(20);
      assertNotSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("RB$aq-lwD%$");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeZone0.adjustOffset(0L, true);
      assertEquals("UTC", dateTimeZone0.toString());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-4));
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      
      long long0 = dateTimeZone1.adjustOffset((-4), false);
      assertEquals("-04:00", dateTimeZone0.getID());
      assertEquals((-4L), long0);
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      assertEquals("UTC", dateTimeZone0.getID());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(0, 1);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      // Undeclared exception!
      try { 
        dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-5));
      dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-794), (-2294));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2294
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }
}
