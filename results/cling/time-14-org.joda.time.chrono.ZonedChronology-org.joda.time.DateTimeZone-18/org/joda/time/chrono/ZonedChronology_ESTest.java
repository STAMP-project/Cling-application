/*

 * Tue Mar 03 17:48:39 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
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
import org.joda.time.Days;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Minutes;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology_ESTest extends ZonedChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone.forOffsetMillis(1000);
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
      PeriodType periodType0 = PeriodType.yearWeekDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-178L), periodType0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-sdAk%5>(t563GiR|Wt");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-sdAk%5>(t563GiR|Wt\" is malformed at \"sdAk%5>(t563GiR|Wt\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone.forOffsetMillis(1000);
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period0 = new Period((-396L), periodType0, (Chronology) buddhistChronology0);
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-17));
      assertEquals("-17:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      PeriodType periodType0 = PeriodType.standard();
      Period period0 = new Period((long) 1, periodType0, (Chronology) zonedChronology0);
      assertEquals("+00:00:01", dateTimeZone0.toString());
      assertEquals("+00:00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      StrictChronology strictChronology0 = StrictChronology.getInstance(zonedChronology0);
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance(strictChronology0, (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DateTimeZone must not be null
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone.forOffsetMillis(1000);
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
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.secondOfDay();
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField(buddhistChronology0, dateTimeField0, 1);
      DurationField durationField0 = skipUndoDateTimeField0.getDurationField();
      assertNotNull(durationField0);
      
      long long0 = durationField0.getDifferenceAsLong((-79271632799999L), 31557600000L);
      assertEquals((-79303190399L), long0);
      assertEquals("+18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DurationField durationField0 = zonedChronology0.centuries();
      durationField0.getDifferenceAsLong((-403L), 1);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone.forOffsetMillis(1000);
      boolean boolean0 = ZonedChronology.useTimeArithmetic((DurationField) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekOfWeekyear();
      assertSame(dateTimeZone0, dateTimeZone1);
      
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      assertEquals("-18:00", dateTimeZone0.toString());
      assertEquals("-18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DurationField durationField0 = zonedChronology0.centuries();
      durationField0.getDifferenceAsLong(1000, 843L);
      assertEquals("+00:00:01", dateTimeZone0.toString());
      assertEquals("+00:00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone2 = buddhistChronology0.getZone();
      zonedChronology0.withZone(dateTimeZone2);
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("-18:00", dateTimeZone0.getID());
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      Chronology chronology0 = zonedChronology0.withZone((DateTimeZone) null);
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("-18:00", dateTimeZone0.getID());
      assertNotSame(chronology0, zonedChronology0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(lenientChronology0, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis(1000, 1, 3600000, 1845);
      assertEquals("+00:00:01", dateTimeZone0.toString());
      assertEquals(263294409600845L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(chronology0).withUTC();
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
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
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(40);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
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
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1000);
      assertEquals("+00:00:01", dateTimeZone1.getID());
      
      zonedChronology0.withZone((DateTimeZone) null);
      assertEquals("-18:00", dateTimeZone0.getID());
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1000);
      assertEquals("+00:00:01", dateTimeZone1.toString());
      
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertTrue(boolean0);
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone1.getID());
      
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(40);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone2);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertEquals("-18:00", dateTimeZone2.toString());
      assertFalse(boolean0);
      assertSame(dateTimeZone2, dateTimeZone1);
      assertEquals("+00:00:00.040", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("+").when(dateTimeZone0).getID();
      doReturn(3600000, 3600000).when(dateTimeZone0).getOffset(anyLong());
      doReturn(4).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("+", "(<M*9<|e'z-^t.G", "", "H{D!L", "ZonedChronology[").when(dateTimeZone0).toString();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(lenientChronology0, dateTimeZone0);
      try { 
        zonedChronology0.getDateTimeMillis(1L, 3348, (-2289), 3, 45);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition: 1970-05-18T21:51:03.041
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(40);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      PeriodType periodType0 = PeriodType.standard();
      Period period0 = null;
      try {
        period0 = new Period(9223372036854775807L, periodType0, (Chronology) zonedChronology0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      TimeZone timeZone0 = TimeZone.getTimeZone("9/C'B~$>K|u*PyJm]`5");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(lenientChronology0, dateTimeZone0);
      Chronology chronology0 = zonedChronology0.withZone(dateTimeZone1);
      assertNotSame(chronology0, lenientChronology0);
      assertEquals("UTC", dateTimeZone1.getID());
      assertEquals("+00:00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(334800000);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, dateTimeZone1);
      zonedChronology0.withZone(dateTimeZone0);
      assertEquals("+93:00", dateTimeZone0.getID());
      assertEquals("+93:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1172000);
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
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+00:00:01", dateTimeZone0.getID());
      assertEquals("+00:00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone2, dateTimeZone1);
      assertEquals("-18:00", dateTimeZone2.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone.forOffsetMillis(1000);
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance((Chronology) null, (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply a chronology
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(lenientChronology0, dateTimeZone0);
      Minutes minutes0 = Minutes.TWO;
      long long0 = zonedChronology0.add((ReadablePeriod) minutes0, 3061728028800L, 1000);
      assertEquals(3061848028800L, long0);
      assertEquals("+00:00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
      assertEquals("-18:00", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1000);
      assertEquals("+00:00:01", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      Days days0 = Days.TWO;
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      long long0 = islamicChronology0.add((ReadablePeriod) days0, (long) 1, 1900);
      assertEquals(328320000001L, long0);
      assertEquals("-18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      Locale locale0 = new Locale("agtMAkl9v.XJ1ye.2", "agtMAkl9v.XJ1ye.2");
      String string0 = dateTimeZone0.getShortName((long) 1, locale0);
      assertEquals("+01:01", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(2379, 2379);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 2379
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertNotNull(dateTimeZone0);
      
      String string0 = dateTimeZone0.getShortName((long) 334800000);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      Locale locale0 = Locale.ENGLISH;
      String string0 = dateTimeZone0.getShortName((-2543L), locale0);
      assertEquals("-18:00", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(islamicChronology0, dateTimeZone0);
      Minutes minutes0 = Minutes.TWO;
      long long0 = zonedChronology0.add((ReadablePeriod) minutes0, (long) 1, 1);
      assertEquals(120001L, long0);
      
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone1.getID());
      
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone2, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Period period0 = Period.months(32000);
      long long0 = islamicChronology0.add((ReadablePeriod) period0, 2592000000L, 32000);
      assertEquals(2612674562601600000L, long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      long long0 = zonedChronology0.getDateTimeMillis(1, 1, 1, 1);
      assertEquals("-18:00", dateTimeZone0.getID());
      assertEquals((-79271503199999L), long0);
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      PeriodType periodType0 = PeriodType.standard();
      Period period0 = new Period((-586L), periodType0, (Chronology) zonedChronology0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone1.toString());
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      PeriodType periodType0 = PeriodType.standard();
      Period period0 = new Period((-586L), periodType0, (Chronology) zonedChronology0);
      assertEquals("-18:00", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1000);
      assertEquals("+00:00:01", dateTimeZone1.toString());
  }
}
