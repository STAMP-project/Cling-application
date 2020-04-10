/*

 * Tue Mar 03 17:47:18 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.Hours;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology_ESTest extends ZonedChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GJChronology.getInstance();
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "GMT-18:00");
      DateTimeZone.forTimeZone(simpleTimeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance((Chronology) null, dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply a chronology
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHours((-2773));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "GMT-18:00");
      DateTimeZone.forTimeZone(simpleTimeZone0);
      DateTimeZone.forTimeZone(simpleTimeZone0);
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance(ethiopicChronology0, (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DateTimeZone must not be null
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "GMT-18:00", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(simpleTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone1);
      DurationField durationField0 = zonedChronology0.millis();
      long long0 = durationField0.getDifferenceAsLong(1, 1);
      assertEquals(0L, long0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("-18:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "GMT-18:00");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      DurationField durationField0 = zonedChronology0.halfdays();
      durationField0.getDifferenceAsLong(1, 1);
      assertEquals("-18:00", dateTimeZone0.toString());
      assertEquals("-18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Locale locale0 = new Locale("LenientChronology[", "LenientChronology[", "LenientChronology[");
      dateTimeZone0.getName((-62135770771999L), locale0);
      boolean boolean0 = ZonedChronology.useTimeArithmetic((DurationField) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "GMT-18:00");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(simpleTimeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("-18:00", dateTimeZone1.toString());
      
      boolean boolean0 = ZonedChronology.useTimeArithmetic((DurationField) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      Locale locale0 = new Locale("LenientC$ronology[", "LenientC$ronology[", "LenientC$ronology[");
      String string0 = dateTimeZone0.getName((-62135770771999L), locale0);
      assertNotNull(string0);
      assertEquals("+00:19:32", string0);
      
      DurationField durationField0 = zonedChronology0.weekyears();
      long long0 = durationField0.getDifferenceAsLong(766624204801L, 1);
      assertEquals(24L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "GMT-18:00");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(simpleTimeZone0);
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(simpleTimeZone0);
      assertEquals("-18:00", dateTimeZone2.toString());
      
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone1);
      zonedChronology0.withZone(dateTimeZone0);
      assertSame(dateTimeZone1, dateTimeZone2);
      assertEquals("-18:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(julianChronology0, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis(1, 1, 1, 1834);
      assertEquals((-62135704798166L), long0);
      assertEquals("-18:00", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      Locale locale0 = new Locale("wCPnW)Fy[=O<[O7j8", "~T<*]t/.daRx{HE}y0", "Long.MIN_VALUE cannot be negated");
      String string0 = dateTimeZone1.getShortName((-42521587200000L), locale0);
      assertEquals("+00:19:32", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "GMT-18:00");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(simpleTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone1);
      DurationField durationField0 = zonedChronology0.eras();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = null;
      try {
        zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(durationField0, dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, dateTimeZone0);
      Chronology chronology0 = zonedChronology0.withZone(fixedDateTimeZone0);
      assertNotSame(chronology0, islamicChronology0);
      assertEquals("+00:00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Locale locale0 = new Locale("LenientChronology[", "LenientChronology[", "LenientChronology[");
      String string0 = dateTimeZone0.getName((-62135770771999L), locale0);
      assertEquals("+00:19:32", string0);
      assertNotNull(string0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone1);
      zonedChronology0.withZone(dateTimeZone0);
      assertEquals("+01:00", dateTimeZone1.getID());
      assertEquals("+01:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone0);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone1.getID());
      
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(5, 5);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone1);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertFalse(boolean0);
      assertEquals("-18:00", dateTimeZone1.getID());
      assertEquals("+05:05", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("0h").when(dateTimeZone0).getID();
      doReturn("0h", (String) null, "M+9sKt.g0`", (String) null, (String) null).when(dateTimeZone0).toString();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(julianChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone1).getID();
      doReturn((-3556)).when(dateTimeZone1).getOffset(anyLong());
      doReturn((-1516)).when(dateTimeZone1).getOffsetFromLocal(anyLong());
      doReturn("0h", "+", "The lower limit must be come before than the upper limit", "~z6|gaG<ZL(cb|A8,K", (String) null).when(dateTimeZone1).toString();
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone1);
      try { 
        zonedChronology1.getDateTimeMillis(1, 1, 2, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition: 0000-12-31T00:00:01.518
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(julianChronology0, dateTimeZone0);
      Period period0 = new Period((long) 1);
      // Undeclared exception!
      try { 
        zonedChronology0.add((ReadablePeriod) period0, 9223372036854775807L, 57);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      zonedChronology0.withZone(dateTimeZone1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      Locale locale0 = new Locale("LenientChronology[", "LenientChronology[", "LenientChronology[");
      dateTimeZone0.getName((-62135770771999L), locale0);
      DurationField durationField0 = zonedChronology0.eras();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = null;
      try {
        zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(durationField0, dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+00:00:01", dateTimeZone0.toString());
      assertEquals("+00:00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("UTC").when(dateTimeZone0).getID();
      doReturn("UTC", "UTC", "UTC", "UTC", "UTC").when(dateTimeZone0).toString();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(julianChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("UTC").when(dateTimeZone1).getID();
      doReturn("UTC", "+", "The lower limit must be come before than the upper limit", "~z6|gaG<ZL(cb|A8,K", "UTC").when(dateTimeZone1).toString();
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone1);
      DateTimeZone.forTimeZone((TimeZone) null);
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.setDefault(dateTimeZone0);
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("-18:00", dateTimeZone0.toString());
      assertEquals("-18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "GMT-18:00");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      DateTimeZone.forTimeZone(simpleTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      Period period0 = Period.minutes((-2147483627));
      int[] intArray0 = zonedChronology0.get((ReadablePeriod) period0, (-782L));
      assertEquals("-18:00", dateTimeZone0.toString());
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, (-782)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance((Chronology) null, dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply a chronology
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, dateTimeZone0);
      Hours hours0 = Hours.FOUR;
      long long0 = zonedChronology0.add((ReadablePeriod) hours0, (long) 1000, 58);
      assertEquals(835201000L, long0);
      assertEquals("+00:00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      Locale locale0 = new Locale("LenientChronology[", "LenientChronology[", "LenientChronology[");
      dateTimeZone0.getName((-62135770771999L), locale0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "GMT-18:00");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(simpleTimeZone0);
      Months months0 = Months.TWO;
      long long0 = zonedChronology0.add((ReadablePeriod) months0, (long) 1, 1);
      assertEquals("-18:00", dateTimeZone0.getID());
      assertEquals(5184000001L, long0);
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      String string0 = dateTimeZone0.getShortName((long) 1);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(306);
      Locale locale0 = Locale.JAPAN;
      String string0 = dateTimeZone0.getShortName((long) 1, locale0);
      assertEquals("+306:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone1.getID());
      
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
      assertEquals("-18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(2147483051, 1014);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1014
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "GMT-18:00");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      String string0 = dateTimeZone0.getShortName(9223372036854775807L);
      assertEquals("-18:00", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      zonedChronology0.getDateTimeMillis(1, 1, 1, 1);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "GMT-18:00");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      assertNotNull(dateTimeZone0);
      
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      DateTimeZone.forTimeZone(simpleTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 1, (Chronology) ethiopicChronology0);
      long long0 = zonedChronology0.add((ReadablePeriod) mutablePeriod0, (long) 1, 1);
      assertEquals(2L, long0);
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Locale locale0 = new Locale("LenientChronology[", "LenientChronology[", "LenientChronology[");
      dateTimeZone0.getName((-62135770771999L), locale0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(1041L, (-4452L));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("0h");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone0.getID());
  }
}
