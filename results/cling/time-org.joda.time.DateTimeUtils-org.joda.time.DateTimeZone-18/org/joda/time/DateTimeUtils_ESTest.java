/*

 * Tue Mar 03 17:55:04 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone.forOffsetMillis(0);
      LocalDate localDate0 = new LocalDate();
      LocalDate localDate1 = localDate0.plusWeeks(1);
      assertNotSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.plusYears(583);
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
      LocalDate localDate0 = new LocalDate();
      localDate0.plusYears(583);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.plusWeeks((-3036));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("SST");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'SST' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      doReturn(0L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      doReturn((String) null).when(dateTimeZone0).toString();
      DateTimeZone dateTimeZone1 = DateTimeUtils.getZone(dateTimeZone0);
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInterval0).getChronology();
      DateTimeUtils.getIntervalChronology(readableInterval0);
      LocalDate localDate0 = LocalDate.now(dateTimeZone1);
      LocalDate localDate1 = localDate0.withWeekyear(308);
      assertNotSame(localDate0, localDate1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.withDayOfWeek(3);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[7];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      int[] intArray0 = new int[4];
      Partial partial0 = new Partial(gJChronology0, dateTimeFieldTypeArray0, intArray0);
      boolean boolean0 = DateTimeUtils.isContiguous(partial0);
      assertFalse(boolean0);
      
      DateMidnight dateMidnight0 = DateMidnight.now(dateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.withZoneRetainFields(dateTimeZone0);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      assertEquals(1583190000000L, dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      LocalDate localDate0 = LocalDate.now();
      localDate0.minusWeeks(1236);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      LocalDate localDate1 = localDate0.plusWeeks(58);
      assertNotSame(localDate0, localDate1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.plusYears(568);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
      assertNotNull(dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.plusYears(2329);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+-qpY&!l<&}QAuck+e");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+-qpY&!l<&}QAuck+e\" is malformed at \"-qpY&!l<&}QAuck+e\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      localDate0.withDayOfWeek(3);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.plusYears(2329);
      DateTimeZone.forOffsetMillis(1583);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2329);
      assertEquals("+00:00:02.329", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Interval interval0 = localDate0.toInterval();
      DateTimeUtils.getIntervalChronology((ReadableInterval) interval0);
      assertEquals(1583276400000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      localDate0.plusYears(583);
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
  public void test16()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Interval interval0 = localDate0.toInterval();
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval(interval0);
      assertEquals(1583276400000L, readableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      localDate0.withWeekyear((-20));
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeUtils.setCurrentMillisOffset(0L);
      LocalDate localDate0 = new LocalDate(967L);
      LocalDate localDate1 = localDate0.plusYears((-3211));
      assertEquals(3, localDate1.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      doReturn(0L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      doReturn((String) null).when(dateTimeZone0).toString();
      DateTimeZone dateTimeZone1 = DateTimeUtils.getZone(dateTimeZone0);
      DateTimeUtils.setCurrentMillisOffset((-1L));
      LocalDate localDate0 = LocalDate.now(dateTimeZone1);
      LocalDate localDate1 = localDate0.withWeekyear(308);
      assertNotSame(localDate1, localDate0);
  }
}
