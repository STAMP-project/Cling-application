/*

 * Tue Mar 03 17:45:51 GMT 2020
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
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology_ESTest extends ZonedChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone.forOffsetMillis(4000);
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
  public void test02()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      DurationField durationField0 = zonedChronology0.eras();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
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
  public void test03()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      // Undeclared exception!
      try { 
        dateTimeField0.add((-1228L), (-19L));
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
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.year();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone1.getID());
      
      long long0 = dateTimeField0.add((-2401L), (-352L));
      assertEquals((-11108016002401L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4000);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.secondOfDay();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.addWrapField((long) 4000, (-1771));
      assertEquals(84633000L, long0);
      assertEquals("+00:00:04", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
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
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4000);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
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
  public void test08()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4000);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyearOfCentury();
      // Undeclared exception!
      try { 
        dateTimeField0.getDifferenceAsLong(9223372036854775804L, 1382L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeZone.forTimeZone(timeZone0);
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
  public void test11()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.year();
      DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeField0.roundHalfFloor(2629746000L);
      assertEquals((-64800000L), long0);
      assertEquals("+18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis(1, 1, 1, 1);
      assertEquals((-62135597971999L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone.forOffsetMillis(4000);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
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
  public void test14()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      DurationField durationField0 = zonedChronology0.weeks();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, durationField0, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.roundFloor(1529L);
      assertEquals((-62135726400000L), long0);
      assertEquals("+18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4000);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.roundHalfFloor(2629746000L);
      assertEquals((-62135596808000L), long0);
      assertEquals("+00:00:04", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Chronology chronology0 = zonedChronology0.withZone(fixedDateTimeZone0);
      assertNotSame(chronology0, iSOChronology0);
      assertNotSame(fixedDateTimeZone0, dateTimeZone1);
      assertEquals("+18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, dateTimeZone1);
      zonedChronology1.withZone(dateTimeZone0);
      assertEquals("+18:00", dateTimeZone0.getID());
      assertEquals("+18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4000);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(lenientChronology0, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis((-2594L), (-9), 4000, 60, 365);
      assertEquals(207656365L, long0);
      assertEquals("+00:00:04", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(chronology0).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
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
  public void test20()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DurationField durationField0 = zonedChronology0.minutes();
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
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4000);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Chronology chronology0 = zonedChronology0.withZone(fixedDateTimeZone0);
      assertEquals("+00:00:04", dateTimeZone0.toString());
      assertNotSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4000);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      zonedChronology0.withZone((DateTimeZone) null);
      assertEquals("+00:00:04", dateTimeZone0.getID());
      assertEquals("+00:00:04", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("x6{x)").when(dateTimeZone0).getID();
      doReturn(1, 874).when(dateTimeZone0).getOffset(anyLong());
      doReturn(2).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("x6{x)", "x6{x)", "x6{x)", "x6{x)", "__)7$vP%WH").when(dateTimeZone0).toString();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      try { 
        zonedChronology0.getDateTimeMillis((-2594L), 1, 1, 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition: 1969-12-31T01:01:00.999
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      long long0 = dateTimeField0.roundHalfFloor(2629L);
      assertEquals((-62135661600000L), long0);
      assertEquals("+18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4000);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
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
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4000);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+00:00:04", dateTimeZone0.getID());
      assertEquals("+00:00:04", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, fixedDateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, fixedDateTimeZone0);
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      Chronology chronology0 = zonedChronology0.withZone(dateTimeZone1);
      boolean boolean0 = zonedChronology0.equals(chronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      // Undeclared exception!
      try { 
        dateTimeField0.getDifferenceAsLong((-50), 3185);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4000);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyearOfCentury();
      DurationField durationField0 = zonedChronology0.hours();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.add((long) 4000, 4000);
      assertEquals("+00:00:04", dateTimeZone0.getID());
      assertEquals(126230832004000L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4000);
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
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.minuteOfHour();
      long long0 = dateTimeField0.addWrapField((long) Integer.MAX_VALUE, 2146924698);
      assertEquals("-18:00", dateTimeZone0.toString());
      assertEquals(2148563647L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.year();
      long long0 = dateTimeField0.addWrapField(30962844000000L, (-22));
      assertEquals(30268620000000L, long0);
      assertEquals("+18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4000);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DurationField durationField0 = zonedChronology0.eras();
      DateTimeField dateTimeField0 = zonedChronology0.halfdayOfDay();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      zonedChronology_ZonedDateTimeField0.getDifference((-1228L), 31557600000L);
      assertEquals("+00:00:04", dateTimeZone0.toString());
      assertEquals("+00:00:04", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4000);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
      assertEquals("+00:00:04", dateTimeZone0.toString());
      assertEquals("+00:00:04", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.millisOfDay();
      long long0 = dateTimeField0.add((long) 2904, 2904);
      assertEquals(5808L, long0);
      assertEquals("+18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4000);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(zonedChronology0);
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 4000);
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(dividedDateTimeField0);
      DurationField durationField0 = remainderDateTimeField0.getRangeDurationField();
      assertNotNull(durationField0);
      
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.add((-2382L), 879116399931L);
      assertEquals(52746983995857618L, long0);
      assertEquals("+00:00:04", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      String string0 = dateTimeZone0.getShortName(2254L, (Locale) null);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours((-32));
      assertEquals("-32:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone1.getID());
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      String string0 = dateTimeZone0.getShortName((-64800000L), locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("+18:00", dateTimeZone0.toString());
      assertEquals("+18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test41()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(1);
      String string0 = dateTimeZone1.getShortName(923293904L, (Locale) null);
      assertEquals("+01:00", string0);
      
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(timeZone0);
      assertNotSame(dateTimeZone2, dateTimeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      Locale locale0 = Locale.FRENCH;
      dateTimeZone0.getShortName((-1421L), locale0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      TimeZone timeZone0 = TimeZone.getTimeZone("MET");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("CET", dateTimeZone1.getID());
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      String string0 = dateTimeZone0.getShortName((-64800000L), locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(543, 70);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 70
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      // Undeclared exception!
      try { 
        dateTimeField0.getDifference(732L, 3547830L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, fixedDateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.halfdayOfDay();
      dateTimeField0.getDifference((-1228L), (-1228L));
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone1.toString());
      
      long long0 = zonedChronology0.getDateTimeMillis(1, 1, 1, 4);
      assertEquals((-62135661599996L), long0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyearOfCentury();
      // Undeclared exception!
      try { 
        dateTimeField0.add((long) 2933, (-1104905971));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 1104904001 for weekyear must be in the range [-292275054,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.centuryOfEra();
      dateTimeField0.getDifferenceAsLong(723L, (-2401L));
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("+18:00", dateTimeZone0.toString());
      assertEquals("+18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(4000);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.era();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.getDifferenceAsLong((-1524L), 2629746000L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+18:00", dateTimeZone0.getID());
      assertEquals("+18:00", dateTimeZone0.toString());
  }
}
