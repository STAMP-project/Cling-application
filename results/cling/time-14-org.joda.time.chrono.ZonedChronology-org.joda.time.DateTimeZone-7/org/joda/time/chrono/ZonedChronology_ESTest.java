/*

 * Tue Mar 03 17:46:12 GMT 2020
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
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Interval;
import org.joda.time.Months;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.SkipDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology_ESTest extends ZonedChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(3, 3);
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
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance(buddhistChronology0, (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DateTimeZone must not be null
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      Months months0 = Months.MIN_VALUE;
      DateTimeZone.forTimeZone(timeZone0);
      DurationFieldType durationFieldType0 = months0.getFieldType();
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
  public void test03()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfDay();
      DurationField durationField0 = zonedChronology0.weekyears();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, fixedDateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.addWrapField((long) 1, (-1655));
      assertEquals(3600001L, long0);
      
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone2, dateTimeZone1);
      assertEquals("-18:00", dateTimeZone2.getID());
      assertNotNull(dateTimeZone2);
      
      DateTimeField dateTimeField0 = zonedChronology0.halfdayOfDay();
      long long0 = dateTimeField0.add((-2516L), (-4118L));
      assertEquals((-177897602516L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.halfdayOfDay();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1172000);
      assertEquals("+00:19:32", dateTimeZone0.getID());
      
      long long0 = dateTimeField0.addWrapField((long) 326565, 60000);
      assertEquals(326565L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(3, 3);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1172000);
      Interval interval0 = new Interval(1, 1);
      Months months0 = Months.monthsIn(interval0);
      DurationFieldType durationFieldType0 = months0.getFieldType();
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
  public void test08()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHours((-971));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.minuteOfDay();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, 1357);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1172000);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(offsetDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.roundCeiling(8266464L);
      assertEquals(8308000L, long0);
      assertEquals("+00:19:32", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(3, 3);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.hourOfHalfday();
      long long0 = dateTimeField0.roundCeiling(3);
      assertEquals(3420000L, long0);
      assertEquals("+03:03", dateTimeZone0.toString());
      
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfDay();
      long long0 = dateTimeField0.roundHalfFloor(1);
      assertEquals(0L, long0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.halfdayOfDay();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone1, (DurationField) null, (DurationField) null, (DurationField) null);
      assertEquals("-18:00", dateTimeZone1.getID());
      assertEquals("-18:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1172000);
      assertEquals("+00:19:32", dateTimeZone0.toString());
      
      DateMidnight dateMidnight0 = new DateMidnight((-42521587200000L));
      assertEquals((-42521588372000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, fixedDateTimeZone0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone0);
      zonedChronology1.withZone(fixedDateTimeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
      assertEquals("-18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(chronology0).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(60000);
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
  public void test17()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1764);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DurationField durationField0 = zonedChronology0.seconds();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = null;
      try {
        zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(unsupportedDateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1172000);
      zonedChronology0.withZone(dateTimeZone1);
      assertEquals("+00:19:32", dateTimeZone1.getID());
      assertEquals("+00:19:32", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.millisOfDay();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.getDifferenceAsLong(1, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("EAT").when(dateTimeZone0).getID();
      doReturn(5062500, 5062500).when(dateTimeZone0).getOffset(anyLong());
      doReturn((-627)).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("org.joda.time.DateTimeFieldType", (String) null, (String) null, "++du?L)hJ`i", "4JtBO*#g+g").when(dateTimeZone0).toString();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone0);
      try { 
        zonedChronology0.getDateTimeMillis(1844L, 1, 1, 0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition: 1970-01-01T01:01:00.628
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1764);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      
      Chronology chronology0 = zonedChronology0.withZone(dateTimeZone1);
      assertEquals("+00:00:01.764", dateTimeZone0.getID());
      assertEquals("-18:00", dateTimeZone1.getID());
      assertNotSame(chronology0, zonedChronology0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(58, 58);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+58:58", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1172000);
      assertEquals("+00:19:32", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone0);
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(ethiopicChronology0, fixedDateTimeZone0);
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((long)1).when(dateTimeZone0).convertLocalToUTC(anyLong() , anyBoolean() , anyLong());
      doReturn((long)1, 86400000L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      doReturn("-u", "Ds`G]U-EwJ").when(dateTimeZone0).getID();
      doReturn("org.joda.time.chrono.LimitChronology", "-u", "SVbL", "NET", "-").when(dateTimeZone0).toString();
      // Undeclared exception!
      try { 
        buddhistChronology0.withZone(dateTimeZone0);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -543 for year is not supported: Illegal instant due to time zone offset transition: -0543-12-26T00:00:00.001 (Ds`G]U-EwJ)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      DateMidnight dateMidnight1 = dateMidnight0.withYearOfEra(1764);
      assertEquals((-6500737172000L), dateMidnight1.getMillis());
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTimeZone.setDefault(dateTimeZone0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("-18:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, fixedDateTimeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1172000);
      assertEquals("+00:19:32", dateTimeZone0.toString());
      
      DateTimeField dateTimeField0 = zonedChronology0.hourOfHalfday();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, fixedDateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.add((-3599488L), (-798));
      assertEquals((-2876399488L), long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfDay();
      long long0 = dateTimeField0.add((long) 1, (long) 1);
      assertEquals("+01:01", dateTimeZone0.toString());
      assertEquals(3600001L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfDay();
      DateTimeZone.forOffsetMillis(1172000);
      int int0 = dateTimeField0.getDifference(1349L, 1899L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, fixedDateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1172000);
      assertEquals("+00:19:32", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.halfdayOfDay();
      dateTimeField0.getDifference(11L, 11L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-years");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-years\" is malformed at \"years\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(1, 1);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.minuteOfDay();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(zonedChronology0, dateTimeField0, 2287);
      DurationField durationField0 = skipDateTimeField0.getRangeDurationField();
      assertNotNull(durationField0);
      
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.add((long) 1, 5062500);
      assertEquals("+01:01", dateTimeZone0.toString());
      assertEquals(303750000001L, long0);
      assertEquals("days", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.halfdayOfDay();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, millisDurationField0, millisDurationField0, millisDurationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.addWrapField((-2020L), (-2147483592));
      assertEquals((-2020L), long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("$I[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      String string0 = dateTimeZone0.getShortName((long) 1);
      assertEquals("UTC", dateTimeZone0.toString());
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(2147483271, 2147483271);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 2147483271
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(timeZone0);
      Chronology chronology0 = zonedChronology0.withZone(dateTimeZone2);
      assertFalse(chronology0.equals((Object)zonedChronology0));
      assertNotSame(chronology0, zonedChronology0);
      assertEquals("-18:00", dateTimeZone2.getID());
      assertSame(dateTimeZone2, dateTimeZone1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      String string0 = dateTimeZone0.getShortName(28871328L);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      dateTimeZone0.getShortName((-36L), locale0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.millisOfDay();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.getDifference(9223372036854775807L, 30617280276L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.getID());
      
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      DateMidnight dateMidnight1 = dateMidnight0.withYearOfEra(1764);
      assertEquals((-6500737172000L), dateMidnight1.getMillis());
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("$I[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone1);
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      String string0 = dateTimeZone1.getShortName((-36L), locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }
}
