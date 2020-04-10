/*

 * Tue Mar 03 17:27:54 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime((-1352L), (Chronology) gJChronology0);
      LimitChronology limitChronology0 = LimitChronology.getInstance(gJChronology0, (ReadableDateTime) null, mutableDateTime0);
      Chronology chronology0 = limitChronology0.withZone(dateTimeZone0);
      assertTrue(chronology0.equals((Object)limitChronology0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      MutableDateTime mutableDateTime0 = new MutableDateTime((-1363L));
      LimitChronology limitChronology0 = LimitChronology.getInstance(gJChronology0, mutableDateTime0, (ReadableDateTime) null);
      Locale locale0 = Locale.PRC;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2, limitChronology0, locale0, (Integer) mutableDateTime0.ROUND_HALF_CEILING, 0);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.set((DateTimeFieldType) null, (-2316));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField((DateTimeFieldType) null, true);
      GJChronology gJChronology0 = GJChronology.getInstance();
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutableDateTime0.add((ReadablePeriod) mutablePeriod0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(4, gJChronology0, (Locale) null, (Integer) 3, 5);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "}C3sI8z!kcD1N$d^Qo", 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test4()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = mock(DateTimeParserBucket.class, new ViolatedAssumptionAnswer());
      doReturn(locale0).when(dateTimeParserBucket0).getLocale();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = MutableDateTime.now(dateTimeZone0);
      mutableDateTime0.set(dateTimeFieldType0, 1);
      assertEquals((-62130261114097L), mutableDateTime0.getMillis());
      
      int int0 = dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "u,Fa_dU(X+2", 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      MutableDateTime mutableDateTime0 = new MutableDateTime((-3525L), (Chronology) islamicChronology0);
      mutableDateTime0.set(dateTimeFieldType0, 1);
      // Undeclared exception!
      try { 
        mutableDateTime0.add((DurationFieldType) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test6()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.add(durationFieldType0, 5);
      assertEquals(1583256456966L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateMidnight dateMidnight0 = DateMidnight.now(dateTimeZone0);
      mutableDateTime0.setTime((ReadableInstant) dateMidnight0);
      // Undeclared exception!
      try { 
        mutableDateTime0.set((DateTimeFieldType) null, (-2316));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }
}
