/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:44:09 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BasicYearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GJEraDateTimeField;
import org.joda.time.chrono.GJYearOfEraDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology_ESTest extends ZonedChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-212));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      // Undeclared exception!
      try { 
        dateTimeField0.getDifferenceAsLong(155L, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-133));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.secondOfMinute();
      long long0 = dateTimeField0.roundHalfEven((-133));
      assertEquals(133L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyear();
      long long0 = dateTimeField0.roundHalfFloor((-308));
      assertEquals((-262800000L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-191));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      // Undeclared exception!
      try { 
        dateTimeField0.getDifferenceAsLong(3, 3);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyearOfCentury();
      long long0 = dateTimeField0.getDifferenceAsLong((-2343L), 2477);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      // Undeclared exception!
      try { 
        dateTimeField0.getDifference(1000L, 1209600000L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyearOfCentury();
      int int0 = dateTimeField0.getDifference((-869L), 237L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyearOfCentury();
      long long0 = dateTimeField0.set(0L, 1);
      assertEquals((-2724624000000L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      // Undeclared exception!
      try { 
        dateTimeField0.addWrapField(0L, (-2145355318));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      BasicYearDateTimeField basicYearDateTimeField0 = new BasicYearDateTimeField(gregorianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(basicYearDateTimeField0, gregorianChronology0);
      DurationField durationField0 = gJYearOfEraDateTimeField0.getDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicYearDateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.addWrapField(0L, 44);
      assertEquals(1388534400000L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1));
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      // Undeclared exception!
      try { 
        dateTimeField0.add(168L, (long) 1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      BasicYearDateTimeField basicYearDateTimeField0 = new BasicYearDateTimeField(gregorianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(basicYearDateTimeField0, gregorianChronology0);
      DurationField durationField0 = gJYearOfEraDateTimeField0.getDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicYearDateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.add(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      // Undeclared exception!
      try { 
        dateTimeField0.add((long) 1, 1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyearOfCentury();
      long long0 = dateTimeField0.add((long) 2477, 1);
      assertEquals(30844802477L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      DurationField durationField0 = zonedChronology0.minutes();
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
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-133));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      Days days0 = Days.ZERO;
      int[] intArray0 = zonedChronology0.get((ReadablePeriod) days0, (long) (-133));
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-273));
      GJChronology gJChronology0 = GJChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      Days days0 = Days.FOUR;
      // Undeclared exception!
      try { 
        zonedChronology0.get((ReadablePeriod) days0, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DurationField durationField0 = zonedChronology0.seconds();
      long long0 = durationField0.getDifferenceAsLong(43200000L, 21260793600000L);
      assertEquals((-21260750400L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      TimeZone timeZone0 = TimeZone.getTimeZone("yA!G~q6S[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = durationFieldType0.getField(gJChronology0);
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(durationField0, dateTimeZone0);
      long long0 = zonedChronology_ZonedDurationField0.getDifferenceAsLong(484L, 2453);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Seconds seconds0 = Seconds.ONE;
      long long0 = gregorianChronology0.add((ReadablePeriod) seconds0, (-1413L), (-1499));
      assertEquals((-1500413L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Years years0 = Years.years(11);
      long long0 = gJChronology0.add((ReadablePeriod) years0, (long) 11, 11);
      assertEquals(3818448000011L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      Period period0 = Period.days(1);
      int[] intArray0 = zonedChronology0.get((ReadablePeriod) period0, (long) 1);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      Days days0 = Days.ONE;
      int[] intArray0 = zonedChronology0.get((ReadablePeriod) days0, (-41L));
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(ethiopicChronology0);
      DurationField durationField0 = gJEraDateTimeField0.getDurationField();
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
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone1);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-163));
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(lenientChronology0, dateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("yA!G~q6S[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyearOfCentury();
      boolean boolean0 = zonedChronology0.equals(dateTimeField0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2453);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, dateTimeZone0);
      IslamicChronology islamicChronology1 = (IslamicChronology)zonedChronology0.withZone(fixedDateTimeZone0);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("yA!G~q6S[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      Chronology chronology0 = zonedChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, zonedChronology0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, fixedDateTimeZone0);
      Chronology chronology0 = zonedChronology0.withZone(fixedDateTimeZone0);
      assertSame(chronology0, zonedChronology0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-133));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.secondOfMinute();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      assertTrue(zonedChronology_ZonedDateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance(gJChronology0, (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DateTimeZone must not be null
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
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
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-191));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      Locale locale0 = Locale.KOREAN;
      int int0 = dateTimeField0.getMaximumTextLength(locale0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      Locale locale0 = Locale.KOREAN;
      int int0 = dateTimeField0.getMaximumShortTextLength(locale0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyear();
      String string0 = dateTimeField0.getAsText(0L);
      assertEquals("1970", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyear();
      Locale locale0 = Locale.KOREA;
      // Undeclared exception!
      try { 
        dateTimeField0.set((long) (-334), "yyyy-MM-dd'T'HH:mm:ss.SSS", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"yyyy-MM-dd'T'HH:mm:ss.SSS\" for weekyear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-133));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.secondOfMinute();
      String string0 = dateTimeField0.getAsShortText((long) (-133));
      assertEquals("59", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      MonthDay monthDay0 = new MonthDay(550L);
      int[] intArray0 = gJChronology0.get((ReadablePartial) monthDay0, 0L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyear();
      int[] intArray1 = dateTimeField0.addWrapPartial(monthDay0, 0, intArray0, 1);
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.millisOfSecond();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      dateTimeField0.getMaximumValue((ReadablePartial) monthDay0);
      assertEquals(14, monthDay0.getDayOfMonth());
      assertEquals(2, monthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-133));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.secondOfMinute();
      int int0 = dateTimeField0.getMinimumValue(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-133));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.secondOfMinute();
      int int0 = dateTimeField0.getMaximumValue((long) (-133));
      assertEquals(59, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.millisOfSecond();
      YearMonth yearMonth0 = new YearMonth((Chronology) ethiopicChronology0);
      dateTimeField0.getMinimumValue((ReadablePartial) yearMonth0);
      assertEquals(6, yearMonth0.getMonthOfYear());
      assertEquals(2006, yearMonth0.getYear());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyear();
      int int0 = dateTimeField0.getLeapAmount(2474L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(11, 11);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekOfWeekyear();
      Locale locale0 = Locale.US;
      String string0 = dateTimeField0.getAsShortText(11, locale0);
      assertEquals("11", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyear();
      LocalTime localTime0 = LocalTime.now();
      Locale locale0 = Locale.FRENCH;
      String string0 = dateTimeField0.getAsText((ReadablePartial) localTime0, (-2145476652), locale0);
      assertEquals("-2145476652", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(ethiopicChronology0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(lenientChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyearOfCentury();
      // Undeclared exception!
      try { 
        dateTimeField0.set(1000000000L, 326565);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 326565 for weekyearOfCentury is not supported: Illegal instant due to time zone offset transition: 328478-09-26T13:46:40.000 (UTC)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyear();
      long long0 = dateTimeField0.remainder(3061728028800L);
      assertEquals(493228800L, long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("yA!G~q6S[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.halfdayOfDay();
      boolean boolean0 = dateTimeField0.isLeap(2629746000L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      TimeZone timeZone0 = TimeZone.getTimeZone("yA!G~q6S[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = durationFieldType0.getField(gJChronology0);
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(durationField0, dateTimeZone0);
      int int0 = zonedChronology_ZonedDurationField0.getValue((-1309L), (-1309L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DurationField durationField0 = zonedChronology0.seconds();
      long long0 = durationField0.getMillis((-308), (long) (-308));
      assertEquals((-308000L), long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      BasicYearDateTimeField basicYearDateTimeField0 = new BasicYearDateTimeField(gregorianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(basicYearDateTimeField0, gregorianChronology0);
      DurationField durationField0 = gJYearOfEraDateTimeField0.getDurationField();
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(durationField0, dateTimeZone0);
      long long0 = zonedChronology_ZonedDurationField0.getMillis(0L, (-140L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      TimeZone timeZone0 = TimeZone.getTimeZone("yA!G~q6S[");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = durationFieldType0.getField(gJChronology0);
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = new ZonedChronology.ZonedDurationField(durationField0, dateTimeZone0);
      long long0 = zonedChronology_ZonedDurationField0.getValueAsLong(343L, 168L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis((long) 11, 11, 11, 11, 11);
      assertEquals(36671011L, long0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-133));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      long long0 = gJChronology0.getDateTimeMillis((-133), 11, 11, 11);
      assertEquals((-66305779199856L), long0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone0);
      zonedChronology0.hashCode();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(2145102845, 2145102845, (-2131337153), (-2131337153), (-2131337153), 2145102845, 2145102845);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2131337153 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, fixedDateTimeZone0);
      String string0 = zonedChronology0.toString();
      assertEquals("ZonedChronology[IslamicChronology[UTC], UTC]", string0);
  }
}
