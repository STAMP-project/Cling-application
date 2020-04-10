/*

 * Tue Mar 03 17:46:34 GMT 2020
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
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology_ESTest extends ZonedChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology.getInstance();
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      PeriodType periodType0 = PeriodType.yearMonthDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(34356139648L, periodType0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
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
  public void test04()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1640), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance(copticChronology0, (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DateTimeZone must not be null
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone.forOffsetMillis(1000);
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance(gregorianChronology0, (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DateTimeZone must not be null
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DurationField durationField0 = zonedChronology0.minutes();
      long long0 = durationField0.getDifferenceAsLong(1092L, 23118750);
      assertEquals((-385L), long0);
      assertEquals("+18:00", dateTimeZone0.getID());
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      DurationField durationField0 = zonedChronology0.centuries();
      durationField0.getDifferenceAsLong(1, 2830L);
      assertEquals("+18:00", dateTimeZone0.getID());
      assertEquals("+18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone.forOffsetMillis(1000);
      boolean boolean0 = ZonedChronology.useTimeArithmetic((DurationField) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone1);
      DateTimeField dateTimeField0 = zonedChronology0.minuteOfDay();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      assertEquals("-18:00", dateTimeZone1.toString());
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1);
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone2.getID());
      
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      zonedChronology0.withZone(dateTimeZone1);
      assertEquals("+00:00:00.001", dateTimeZone1.getID());
      assertSame(dateTimeZone0, dateTimeZone2);
      assertEquals("+00:00:00.001", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(chronology0).withUTC();
      GregorianChronology.getInstance();
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance(chronology0, (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // UTC chronology must not be null
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = null;
      try {
        zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(unsupportedDurationField0, dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00:01");
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Chronology chronology0 = zonedChronology0.withZone(fixedDateTimeZone0);
      assertNotSame(chronology0, copticChronology0);
      assertEquals("+00:00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      TimeZone timeZone0 = TimeZone.getTimeZone("+]");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone1);
      zonedChronology0.withZone(dateTimeZone0);
      assertEquals("+00:00:01", dateTimeZone0.toString());
      assertEquals("UTC", dateTimeZone1.toString());
      assertEquals("+00:00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("-lIeoyQ%C_$8ZJt7j3").when(dateTimeZone0).getID();
      doReturn(1, 1).when(dateTimeZone0).getOffset(anyLong());
      doReturn(46).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("-lIeoyQ%C_$8ZJt7j3", "-lIeoyQ%C_$8ZJt7j3", "-lIeoyQ%C_$8ZJt7j3", "-lIeoyQ%C_$8ZJt7j3", "-lIeoyQ%C_$8ZJt7j3").when(dateTimeZone0).toString();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      try { 
        zonedChronology0.getDateTimeMillis((long) 1, 1, 1, 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition: 1970-01-01T01:01:00.955
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, dateTimeZone0);
      DurationField durationField0 = zonedChronology0.millis();
      // Undeclared exception!
      try { 
        durationField0.getDifferenceAsLong(9223372036854775807L, 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = null;
      try {
        zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(unsupportedDurationField0, dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+00:00:01", dateTimeZone0.getID());
      assertEquals("+00:00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone0);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertTrue(boolean0);
      assertEquals("-18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(copticChronology0, fixedDateTimeZone0);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertEquals("+18:00", dateTimeZone0.getID());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+18:00", dateTimeZone0.getID());
      assertEquals("+18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(1, 40);
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      MonthDay monthDay0 = MonthDay.now();
      assertEquals(1, MonthDay.DAY_OF_MONTH);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone0);
      Seconds seconds0 = Seconds.TWO;
      long long0 = zonedChronology0.add((ReadablePeriod) seconds0, (long) 1000, 1000);
      assertEquals(2001000L, long0);
      assertEquals("+00:00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone0);
      zonedChronology0.assemble(assembledChronology_Fields0);
      assertEquals("+00:00:01", dateTimeZone0.toString());
      assertEquals("+00:00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DurationField durationField0 = zonedChronology0.centuries();
      long long0 = durationField0.subtract((long) 1, 0L);
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("+18:00", dateTimeZone0.toString());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-967L), (Chronology) gregorianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      assertEquals("+00:00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone1);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("-18:00", dateTimeZone1.getID());
      assertEquals("-18:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(1081, 1081);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1081
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      String string0 = dateTimeZone0.getShortName((long) 1);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      String string0 = dateTimeZone0.getShortName((-949L), locale0);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      Seconds seconds0 = Seconds.MAX_VALUE;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      long long0 = zonedChronology0.add((ReadablePeriod) seconds0, (long) 1, 1);
      assertEquals(2147483647001L, long0);
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone.forID("+00:00:01");
      PeriodType periodType0 = PeriodType.dayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1008L), periodType0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis(1, 1, 1, 1);
      assertEquals((-42521588371999L), long0);
      
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone1);
      PeriodType periodType0 = PeriodType.dayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(34356139648L, periodType0);
      int[] intArray0 = zonedChronology0.get((ReadablePeriod) mutablePeriod0, (long) 1);
      assertArrayEquals(new int[] {0, 0, 0, 0, 1}, intArray0);
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone0);
      PeriodType periodType0 = PeriodType.dayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(5482L, periodType0);
      int[] intArray0 = zonedChronology0.get((ReadablePeriod) mutablePeriod0, 3966L);
      assertEquals("+00:00:01", dateTimeZone0.toString());
      assertArrayEquals(new int[] {0, 0, 0, 3, 966}, intArray0);
  }
}
