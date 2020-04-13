/*

 * Tue Mar 03 17:53:26 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableInterval;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      DateTime dateTime0 = localDate0.toDateTime((ReadableInstant) null);
      assertEquals(1583257994062L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.minusDays(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(3302875L);
      localDate0.plusDays(1);
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
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      DateTimeZone.setDefault(dateTimeZone0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) islamicChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((long) 1);
      localDate0.minusDays(1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+g");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+g\" is malformed at \"g\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      doReturn(0L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      localTime0.plusHours(1);
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInterval0).getChronology();
      Chronology chronology0 = DateTimeUtils.getIntervalChronology(readableInterval0);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toLocalDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(20587500, "# {<SP'9j78");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '# {<SP'9j78' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime.now((Chronology) islamicChronology0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[25];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
      int[] intArray0 = new int[1];
      Partial partial0 = new Partial(islamicChronology0, dateTimeFieldTypeArray0, intArray0);
      boolean boolean0 = DateTimeUtils.isContiguous(partial0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((long) 1);
      localDate0.minusDays(157);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) julianChronology0);
      boolean boolean0 = DateTimeUtils.isContiguous(localDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime.now((Chronology) islamicChronology0);
      // Undeclared exception!
      try { 
        Period.parse("(h");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"(h\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toLocalDate();
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) copticChronology0);
      MutableInterval mutableInterval0 = new MutableInterval(1, 1, copticChronology0);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) mutableInterval0);
      assertSame(copticChronology0, chronology0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = new LocalDate(3302880L);
      LocalDate localDate1 = localDate0.minusDays(1);
      assertEquals(3, localDate1.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      localDate0.toInterval();
      // Undeclared exception!
      try { 
        DateTimeUtils.setCurrentMillisProvider((DateTimeUtils.MillisProvider) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The MillisProvider must not be null
         //
         verifyException("org.joda.time.DateTimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(3302880L);
      localDate0.minusDays(1);
      DateTimeUtils.SystemMillisProvider dateTimeUtils_SystemMillisProvider0 = new DateTimeUtils.SystemMillisProvider();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_SystemMillisProvider0);
      assertEquals(1583257983888L, dateTimeUtils_SystemMillisProvider0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) ethiopicChronology0);
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval((ReadableInterval) null);
      assertEquals(1583257983650L, readableInterval0.getStartMillis());
      assertNotNull(readableInterval0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDate localDate0 = new LocalDate(2147483647L);
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval(interval0);
      assertEquals(2070000000L, readableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((long) (-15));
      localDate0.minusDays((-15));
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime();
      DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) dateTime0);
      assertEquals(64381680L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) ethiopicChronology0);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(3302880L);
      localDate0.minusDays(1);
      DateTimeUtils.setCurrentMillisOffset(0L);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) copticChronology0);
      DateTimeUtils.setCurrentMillisOffset(1);
  }
}
