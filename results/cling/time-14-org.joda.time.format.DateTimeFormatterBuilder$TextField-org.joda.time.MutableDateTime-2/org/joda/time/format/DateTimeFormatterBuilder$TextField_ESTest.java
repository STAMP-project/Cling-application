/*

 * Tue Mar 03 17:27:01 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setMillis(0L);
      // Undeclared exception!
      try { 
        mutableDateTime0.set((DateTimeFieldType) null, 621);
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
  public void test1()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime(5, 5, 5, 1, 4, 1, 0, dateTimeZone0);
      mutableDateTime0.setDate((ReadableInstant) dateTime0);
      assertEquals((-61998587560483L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.set(dateTimeFieldType0, 64);
      assertEquals(2971790811313L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Months months0 = Months.TEN;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      MutableDateTime mutableDateTime0 = new MutableDateTime(1, 1, 1, 1, 1, 1, 1);
      mutableDateTime0.add((ReadablePeriod) months0, 1);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField((DateTimeFieldType) null, true);
      Locale locale0 = Locale.FRANCE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) mutableDateTime0.ROUND_HALF_EVEN, 3);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "org.joda.time.MutableDateTime", 1);
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
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime(5, 5, 5, 1, 4, 1, 0, dateTimeZone0);
      Locale locale0 = Locale.FRANCE;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LimitChronology limitChronology0 = LimitChronology.getInstance(buddhistChronology0, dateTime0, mutableDateTime0);
      Chronology chronology0 = limitChronology0.withZone(dateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(3, chronology0, locale0, (Integer) 1, 5);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      int int0 = dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "8e7u", 0);
      assertEquals(1583256409662L, mutableDateTime0.getMillis());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.add((DurationFieldType) null, (-1367));
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
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      mutableDateTime0.add(durationFieldType0, 5);
      assertEquals(1583274409481L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime(5, 5, 5, 1, 4, 1, 0, dateTimeZone0);
      mutableDateTime0.setTime((ReadableInstant) dateTime0);
      // Undeclared exception!
      try { 
        mutableDateTime0.add((DurationFieldType) null, (-1367));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }
}
