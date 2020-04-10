/*

 * Tue Mar 03 17:47:51 GMT 2020
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
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadableDateTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.SkipDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.field.ZeroIsMaxDateTimeField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology_ESTest extends ZonedChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      Instant instant0 = gJChronology0.getGregorianCutover();
      Chronology chronology0 = instant0.getChronology();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology0, dateTimeZone0);
      DurationField durationField0 = zonedChronology0.eras();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = null;
      try {
        zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(durationField0, dateTimeZone1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone1);
      DateTimeField dateTimeField0 = zonedChronology0.secondOfDay();
      long long0 = dateTimeField0.addWrapField((-1290L), 1015);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals(1013710L, long0);
      assertEquals("-18:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.monthOfYear();
      long long0 = dateTimeField0.addWrapField((-1797L), 511);
      assertEquals(18316798203L, long0);
      assertEquals("+18:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone1);
      DateMidnight dateMidnight0 = new DateMidnight((long) 143, dateTimeZone0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(ethiopicChronology0, (ReadableDateTime) null, dateMidnight0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(limitChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.minuteOfDay();
      // Undeclared exception!
      try { 
        dateTimeField0.add(1111L, 805L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant is above the supported maximum of 1962-04-23T00:00:00.000Z (EthiopicChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone1);
      DateTimeField dateTimeField0 = zonedChronology0.weekOfWeekyear();
      long long0 = dateTimeField0.add(13347L, 905L);
      assertEquals("-18:00", dateTimeZone1.toString());
      assertEquals(547344013347L, long0);
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(10000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.minuteOfDay();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.addWrapField(1875L, 1);
      assertEquals(61875L, long0);
      assertEquals("+00:00:10", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
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
  public void test07()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(2000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone1);
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
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfDay();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.roundHalfFloor(1000);
      assertEquals((-2000L), long0);
      assertEquals("+00:00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
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
  public void test10()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone1);
      DurationField durationField0 = zonedChronology0.years();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      DateTimeField dateTimeField0 = zonedChronology0.minuteOfDay();
      ZeroIsMaxDateTimeField zeroIsMaxDateTimeField0 = new ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType0);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(zeroIsMaxDateTimeField0, dateTimeZone0, (DurationField) null, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.roundCeiling(1L);
      assertEquals(60000L, long0);
      assertEquals("-18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
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
  public void test12()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance(zonedChronology0, (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DateTimeZone must not be null
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      long long0 = dateTimeField0.roundFloor(63158400000L);
      assertEquals((-62135532000000L), long0);
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1000);
      assertEquals("+00:00:01", dateTimeZone1.getID());
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekOfWeekyear();
      DurationField durationField0 = zonedChronology0.eras();
      DurationField durationField1 = zonedChronology0.weekyears();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField1);
      long long0 = zonedChronology_ZonedDateTimeField0.roundFloor(1);
      assertEquals((-266400000L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone1);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Chronology chronology0 = zonedChronology0.withZone(fixedDateTimeZone0);
      assertEquals("+18:00", dateTimeZone1.getID());
      assertSame(dateTimeZone1, dateTimeZone0);
      assertNotSame(chronology0, gregorianChronology0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(143);
      DateTimeZone dateTimeZone2 = DateTimeZone.getDefault();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone2);
      DateMidnight dateMidnight0 = new DateMidnight((long) 143, dateTimeZone0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(ethiopicChronology0, (ReadableDateTime) null, dateMidnight0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(limitChronology0, dateTimeZone0);
      Chronology chronology0 = zonedChronology0.withZone(dateTimeZone1);
      assertEquals("+00:00:00.143", dateTimeZone1.toString());
      assertEquals((-64800000L), dateMidnight0.getMillis());
      assertNotSame(chronology0, zonedChronology0);
      assertEquals("+18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583257622058L, dateTime0.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      assertEquals("+00:00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(chronology0).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2866));
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance(chronology0, dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // UTC chronology must not be null
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.hourOfDay();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 497);
      DurationField durationField0 = dividedDateTimeField0.getDurationField();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      DurationField durationField1 = zonedChronology0.centuries();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = null;
      try {
        zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(unsupportedDateTimeField0, dateTimeZone0, durationField1, durationField0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      Chronology chronology0 = zonedChronology0.withZone(dateTimeZone1);
      assertNotSame(chronology0, iSOChronology0);
      assertEquals("+00:00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      DateTimeZone.forOffsetMillis(1000);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone0);
      LocalTime localTime0 = LocalTime.now();
      long long0 = zonedChronology0.set(localTime0, 1);
      assertEquals(64017943L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      long long0 = zonedChronology0.set(localDateTime0, (-384L));
      assertEquals(10536094016216L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, fixedDateTimeZone0);
      Chronology chronology0 = zonedChronology1.withZone(dateTimeZone0);
      assertEquals("+00:00:01", dateTimeZone0.toString());
      assertTrue(chronology0.equals((Object)zonedChronology0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone.forOffsetMillis(1000);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone0);
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertTrue(boolean0);
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(Integer.MAX_VALUE);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone1);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertEquals("-18:00", dateTimeZone0.toString());
      assertFalse(boolean0);
      assertEquals("+596:31:23.647", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeZone0).convertLocalToUTC(anyLong() , anyBoolean() , anyLong());
      doReturn(0L, 0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      doReturn((String) null, (String) null).when(dateTimeZone0).getID();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(dateTimeZone0).toString();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.yearOfEra();
      // Undeclared exception!
      try { 
        dateTimeField0.set(1274L, 1);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 1 for yearOfEra is not supported: Illegal instant due to time zone offset transition: 0284-12-19T00:00:00.000 (null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone1.toString());
      
      DateTimeZone.setDefault(dateTimeZone0);
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("-18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone1);
      DateTimeField dateTimeField0 = zonedChronology0.millisOfDay();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.getDifferenceAsLong((-544L), 1000L);
      assertEquals("+18:00", dateTimeZone1.toString());
      assertEquals((-1544L), long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1000);
      assertEquals("+00:00:01", dateTimeZone1.toString());
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekOfWeekyear();
      DurationField durationField0 = zonedChronology0.eras();
      DurationField durationField1 = zonedChronology0.weekyears();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField1);
      long long0 = zonedChronology_ZonedDateTimeField0.add((long) 1, 1);
      assertEquals(604800001L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekOfWeekyear();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-385));
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, preciseDurationField0, unsupportedDurationField0, preciseDurationField0);
      zonedChronology_ZonedDateTimeField0.getDifference(1231L, 1000);
      assertEquals("+00:00:01", dateTimeZone0.toString());
      assertEquals("+00:00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      DateTimeZone.forOffsetMillis(1000);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.secondOfDay();
      int int0 = dateTimeField0.getDifference(1583801042434L, 1583801042434L);
      assertEquals(0, int0);
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone1);
      DateTimeField dateTimeField0 = zonedChronology0.minuteOfDay();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.add(1193L, (-3201));
      assertEquals((-192058807L), long0);
      assertEquals("+18:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.minuteOfDay();
      DurationField durationField0 = zonedChronology0.millis();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.add((long) 1, (long) 1);
      assertEquals("+00:00:01", dateTimeZone0.toString());
      assertEquals(60001L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.minuteOfDay();
      // Undeclared exception!
      try { 
        dateTimeField0.addWrapField(9223372036854775807L, 1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      Locale locale0 = Locale.JAPAN;
      dateTimeZone0.getShortName(1730L, locale0);
      try { 
        DateTimeZone.forOffsetHours((-1521));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      String string0 = dateTimeZone0.getShortName((-2571L));
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.PRC;
      String string0 = fixedDateTimeZone0.getShortName(2629800000L, locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(378);
      assertEquals("+378:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
      assertEquals("-18:00", dateTimeZone0.toString());
      assertEquals("-18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      Locale locale0 = Locale.TAIWAN;
      String string0 = dateTimeZone0.getShortName((-595L), locale0);
      assertEquals("-18:00", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("No valid ISO8601 format for fields because Date was reduced precision: ");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      String string0 = dateTimeZone0.getShortName(1271L);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("No valid ISO8601 format for fields because Date was reduced precision: ");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      Locale locale0 = Locale.JAPAN;
      String string0 = dateTimeZone0.getShortName(10800000L, locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, 2210);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 2210
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      String string0 = dateTimeZone0.getShortName(320L);
      assertEquals("-18:00", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      Locale locale0 = Locale.GERMAN;
      String string0 = dateTimeZone0.getShortName((long) (-881), locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test48()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583257583853L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertNotNull(dateTimeZone0);
      
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone1);
      DateTimeField dateTimeField0 = zonedChronology0.minuteOfDay();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(zonedChronology0, dateTimeField0);
      DurationField durationField0 = skipDateTimeField0.getRangeDurationField();
      assertNotNull(durationField0);
      
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.getDifferenceAsLong(1663L, (-1L));
      assertEquals(0L, long0);
      assertEquals("days", durationField0.getName());
      assertEquals("+00:00:01", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone1);
      DateTimeField dateTimeField0 = zonedChronology0.weekOfWeekyear();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      zonedChronology_ZonedDateTimeField0.getDifference(905L, 905L);
      assertEquals("-18:00", dateTimeZone0.getID());
      assertEquals("-18:00", dateTimeZone0.toString());
  }
}
