/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 01:05:42 GMT 2019
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology_ESTest extends ZonedChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-2905));
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      TimeZone timeZone1 = dateTimeZone0.toTimeZone();
      Locale locale0 = Locale.KOREA;
      String string0 = dateTimeZone0.getShortName((long) (-2905), locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone1);
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-3));
      String string0 = dateTimeZone0.getShortName(10800000L);
      assertEquals("-03:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(10);
      assertEquals("+10:00", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      Locale locale0 = Locale.forLanguageTag("<y)?|;50>rlcCHu");
      String string0 = dateTimeZone1.getShortName((-4504L), locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
      
      DateTimeZone dateTimeZone2 = DateTimeZone.getDefault();
      String string0 = dateTimeZone2.getShortName(2680L);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      Integer integer0 = new Integer(1108);
      String string0 = dateTimeZone0.getShortName((long) integer0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(3600000, 3600000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 3600000
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("$<");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      String string0 = dateTimeZone0.getShortName(3155695200000L);
      assertEquals("+00:00", string0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis((long) 1, 1, 1, 1, 1);
      assertEquals(61001L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(10);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance((Chronology) null, dateTimeZone1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply a chronology
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DurationField durationField0 = zonedChronology0.hours();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = null;
      try {
        zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(unsupportedDateTimeField0, dateTimeZone1, durationField0, durationField0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeZone0).convertLocalToUTC(anyLong() , anyBoolean() , anyLong());
      doReturn(0L, 0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      doReturn((String) null, (String) null).when(dateTimeZone0).getID();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(dateTimeZone0).toString();
      // Undeclared exception!
      try { 
        lenientChronology0.withZone(dateTimeZone0);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -543 for year is not supported: Illegal instant due to time zone offset transition: -0543-12-26T00:00:00.000 (null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone2.toString());
      
      DateTimeField dateTimeField0 = zonedChronology0.year();
      long long0 = dateTimeField0.set(32330880L, 1);
      assertEquals((-62135737269120L), long0);
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
      
      DateTimeField dateTimeField0 = zonedChronology0.millisOfSecond();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      int int0 = zonedChronology_ZonedDateTimeField0.getDifference(702L, 729L);
      assertEquals((-27), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.year();
      dateTimeField0.getDifferenceAsLong((-1566L), (-1831L));
      assertEquals("+01:00", dateTimeZone0.toString());
      assertSame(dateTimeZone0, dateTimeZone1);
      assertSame(dateTimeZone0, dateTimeZone2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.millisOfSecond();
      DurationField durationField0 = zonedChronology0.centuries();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone1, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.add((-440L), (-4659));
      assertEquals("+01:00", dateTimeZone1.toString());
      assertEquals((-5099L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.getID());
      
      DateTimeField dateTimeField0 = zonedChronology0.millisOfSecond();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.roundFloor(2045L);
      assertEquals(2045L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.dayOfWeek();
      DurationField durationField0 = zonedChronology0.hours();
      DurationField durationField1 = zonedChronology0.eras();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone1, durationField0, durationField1, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.getDifferenceAsLong(1455L, (-1123199999L));
      assertEquals("+01:00", dateTimeZone1.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals(13L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, fixedDateTimeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-54));
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone0);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertEquals("-54:00", dateTimeZone0.getID());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
      
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone0);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(10);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
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
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
      
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.yearOfCentury();
      DurationField durationField0 = zonedChronology0.millis();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.addWrapField((long) 1, 3173);
      assertEquals((-852076799999L), long0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(10);
      GJChronology gJChronology0 = GJChronology.getInstance();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone1);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
      assertEquals("+10:00", dateTimeZone0.toString());
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+10:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("KRDEWri").when(dateTimeZone0).getID();
      doReturn(1).when(dateTimeZone0).getOffset(anyLong());
      doReturn(201).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn((String) null, "KRDEWri", (String) null, "|6C1", (String) null).when(dateTimeZone0).toString();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      try { 
        zonedChronology0.getDateTimeMillis(1, 1, 30, 30);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition: 0284-09-26T23:59:59.829
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis((long) 1, 1, 1, 1, 1);
      assertEquals(61001L, long0);
      
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-18));
      DateTimeZone.setDefault(dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(10);
      GJChronology gJChronology0 = GJChronology.getInstance();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
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
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(10);
      GJChronology gJChronology0 = GJChronology.getInstance();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone1);
      DateTimeField dateTimeField0 = zonedChronology0.millisOfSecond();
      long long0 = dateTimeField0.add((long) 10, 1466L);
      assertEquals("+10:00", dateTimeZone0.toString());
      assertEquals(1476L, long0);
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(10);
      GJChronology gJChronology0 = GJChronology.getInstance();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone1);
      DateTimeField dateTimeField0 = zonedChronology0.weekOfWeekyear();
      long long0 = dateTimeField0.add((long) 10, 60000L);
      assertEquals("+10:00", dateTimeZone1.toString());
      assertEquals(36288000000010L, long0);
      assertEquals("+10:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      
      DateTimeField dateTimeField0 = zonedChronology0.dayOfWeek();
      DurationField durationField0 = zonedChronology0.hours();
      DurationField durationField1 = zonedChronology0.eras();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone1, durationField0, durationField1, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.roundCeiling(10080L);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals(79200000L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-22));
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(julianChronology0, dateTimeZone0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      zonedChronology0.withZone(fixedDateTimeZone0);
      assertEquals("-22:00", dateTimeZone0.getID());
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-4));
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      TimeZone timeZone0 = dateTimeZone1.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      zonedChronology0.withZone(dateTimeZone1);
      DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-04:00", dateTimeZone1.toString());
      assertSame(dateTimeZone1, dateTimeZone0);
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
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
  public void test33()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DurationField durationField0 = zonedChronology0.hours();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
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
  public void test34()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.millisOfSecond();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      int int0 = zonedChronology_ZonedDateTimeField0.getDifference(528L, 25650000);
      assertEquals((-25649472), int0);
      assertEquals("+07:07:30", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.yearOfCentury();
      // Undeclared exception!
      try { 
        dateTimeField0.getDifference(9223372036854775807L, 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.dayOfWeek();
      DurationField durationField0 = zonedChronology0.hours();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.add((long) 25650000, 25650000);
      assertEquals("+07:07:30", dateTimeZone0.getID());
      assertEquals(2216160025650000L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.millisOfSecond();
      DurationField durationField0 = zonedChronology0.halfdays();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, durationField0, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.getDifferenceAsLong(453337344L, (-25652058L));
      assertEquals(478989402L, long0);
      assertEquals("+07:07:30", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone0);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertEquals("+07:07:30", dateTimeZone0.getID());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
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
  public void test40()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.yearOfEra();
      DurationField durationField0 = zonedChronology0.millis();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.addWrapField((long) 25650000, 25650000);
      assertEquals(809435818825650000L, long0);
      assertEquals("+07:07:30", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
      assertEquals("+07:07:30", dateTimeZone0.toString());
      assertEquals("+07:07:30", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-4));
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis((long) (-4), 10, 10, 10, 10);
      assertEquals("-04:00", dateTimeZone0.toString());
      assertEquals((-35389990L), long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(25650000);
      assertEquals("+07:07:30", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone.forOffsetMillis(25650000);
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
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+07:07:30", dateTimeZone0.toString());
      assertEquals("+07:07:30", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone.forOffsetMillis(25650000);
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance(iSOChronology0, (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DateTimeZone must not be null
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.halfdayOfDay();
      DurationField durationField0 = zonedChronology0.millis();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.add((long) 25650000, 1461L);
      assertEquals(63140850000L, long0);
      assertEquals("+07:07:30", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.halfdayOfDay();
      DurationField durationField0 = zonedChronology0.millis();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.roundHalfEven(25650000);
      assertEquals("+07:07:30", dateTimeZone0.toString());
      assertEquals(35100000L, long0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      Chronology chronology0 = zonedChronology0.withZone(fixedDateTimeZone0);
      assertEquals("+07:07:30", dateTimeZone0.getID());
      assertNotSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(46);
      Chronology chronology0 = zonedChronology0.withZone(dateTimeZone1);
      assertEquals("+46:00", dateTimeZone1.toString());
      assertEquals("+07:07:30", dateTimeZone0.toString());
      assertNotSame(chronology0, zonedChronology0);
  }
}
