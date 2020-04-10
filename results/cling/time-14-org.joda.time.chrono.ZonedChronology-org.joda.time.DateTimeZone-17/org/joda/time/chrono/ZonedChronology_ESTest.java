/*

 * Tue Mar 03 17:48:37 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology_ESTest extends ZonedChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology.getInstance();
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
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
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
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.centuryOfEra();
      long long0 = dateTimeField0.addWrapField((-6127L), 2147483485);
      assertEquals(6946247476079993873L, long0);
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.dayOfWeek();
      DurationField durationField0 = zonedChronology0.millis();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone1, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.add((long) 1, (long) 1);
      assertEquals(86400001L, long0);
      assertEquals("+01:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
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
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
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
  public void test06()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHours((-2163));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1000);
      assertEquals("+00:00:01", dateTimeZone1.toString());
      
      DateTimeField dateTimeField0 = zonedChronology0.secondOfMinute();
      DurationField durationField0 = zonedChronology0.millis();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.roundCeiling(1133L);
      assertEquals(2000L, long0);
      assertEquals("+01:00", dateTimeZone0.toString());
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone1);
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
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DurationField durationField0 = zonedChronology0.days();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = null;
      try {
        zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(unsupportedDateTimeField0, dateTimeZone0, durationField0, (DurationField) null, durationField0);
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
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(chronology0).withUTC();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("GMT+01:01").when(dateTimeZone0).getID();
      doReturn(1, (-196469980)).when(dateTimeZone0).getOffset(anyLong());
      doReturn(1).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn((String) null, "+-", "GMT+01:01", "+-", "O?+PLa|!E{U2Vh@").when(dateTimeZone0).toString();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology0, dateTimeZone0);
      try { 
        zonedChronology0.getDateTimeMillis((long) 1, 2, 2, 2, 83);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition: 1970-01-01T01:02:02.082
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
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
  @Ignore
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.dayOfMonth();
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      String string0 = dateTimeZone1.getShortName((-9223372036854775808L));
      assertEquals("+00:19:32", string0);
      
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone1, millisDurationField0, millisDurationField0, millisDurationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.roundFloor(1);
      assertEquals((-7200000L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone2 = gJChronology0.getZone();
      zonedChronology0.withZone(dateTimeZone2);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      
      DateTimeZone dateTimeZone2 = DateTimeZone.forOffsetHours(60);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone2);
      Chronology chronology0 = zonedChronology0.withZone(dateTimeZone1);
      assertNotSame(chronology0, zonedChronology0);
      assertEquals("+01:00", dateTimeZone1.toString());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis((-475L), 1, 1, 1, 1);
      assertEquals(61001L, long0);
      assertEquals("+01:00", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1000);
      assertEquals("+00:00:01", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateMidnight dateMidnight0 = new DateMidnight((-982L));
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(chronology0).withUTC();
      // Undeclared exception!
      try { 
        ZonedChronology.getInstance(chronology0, fixedDateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // UTC chronology must not be null
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      zonedChronology0.withZone(fixedDateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
      
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      String string0 = dateTimeZone1.getShortName((-9223372036854775808L));
      assertEquals("+00:19:32", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      zonedChronology0.withZone(dateTimeZone1);
      assertEquals("+00:00:01", dateTimeZone0.getID());
      assertEquals("+00:00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1000);
      assertEquals("+00:00:01", dateTimeZone1.getID());
      
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+00:00:01", dateTimeZone0.toString());
      assertEquals("+00:00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      zonedChronology0.equals(zonedChronology1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+Mx-@G?oZ][,O.PJ1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+Mx-@G?oZ][,O.PJ1\" is malformed at \"Mx-@G?oZ][,O.PJ1\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, fixedDateTimeZone0);
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeZone0).convertLocalToUTC(anyLong() , anyBoolean() , anyLong());
      doReturn(0L, 0L).when(dateTimeZone0).convertUTCToLocal(anyLong());
      doReturn("0#E&c{Bo", (String) null).when(dateTimeZone0).getID();
      doReturn("0#E&c{Bo", "+'pXo5ef", "+'pXo5ef", "0#E&c{Bo", "weekyearOfCentury").when(dateTimeZone0).toString();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      // Undeclared exception!
      try { 
        buddhistChronology0.withZone(dateTimeZone0);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -543 for year is not supported: Illegal instant due to time zone offset transition: -0543-12-26T00:00:00.000 (null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfDay();
      DurationField durationField0 = zonedChronology0.weeks();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone1, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.getDifferenceAsLong(2629800000L, 1);
      assertEquals(730L, long0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfDay();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.add((long) 1, 1);
      assertEquals("+00:00:01", dateTimeZone0.toString());
      assertEquals(3600001L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone.forOffsetMillis(1000);
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
  public void test28()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 1000);
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(dividedDateTimeField0);
      DurationField durationField0 = remainderDateTimeField0.getRangeDurationField();
      assertNotNull(durationField0);
      
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.addWrapField(14423501L, 1);
      assertEquals("+00:00:01", dateTimeZone0.getID());
      assertEquals(18023501L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 1000);
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(dividedDateTimeField0);
      DurationField durationField0 = remainderDateTimeField0.getRangeDurationField();
      assertNotNull(durationField0);
      
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      int int0 = zonedChronology_ZonedDateTimeField0.getDifference(10800000L, (-1649L));
      assertEquals(3, int0);
      assertEquals("+00:00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
      assertEquals("+00:00:01", dateTimeZone0.toString());
      assertEquals("+00:00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfHalfday();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
      
      int int0 = dateTimeField0.getDifference(0L, (-766623600001L));
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals(212951, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone2 = DateTimeZone.getDefault();
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfDay();
      DurationField durationField0 = zonedChronology0.centuries();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone2, durationField0, durationField0, durationField0);
      int int0 = zonedChronology_ZonedDateTimeField0.getDifference(1, (-766L));
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfHalfday();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeField0.add((long) 1, (-3047));
      assertEquals((-10969199999L), long0);
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone2);
      
      DateTimeField dateTimeField0 = zonedChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(dateTimeField0, dateTimeFieldType0, 60);
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(remainderDateTimeField0, dateTimeFieldType0);
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dividedDateTimeField0, dateTimeFieldType0, 60);
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField(zonedChronology0, offsetDateTimeField0);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(skipUndoDateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.roundHalfFloor(2551440384L);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals(2498400000L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.weekyearOfCentury();
      // Undeclared exception!
      try { 
        dateTimeField0.getDifference(43200000L, 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      assertEquals("+01:01", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      String string0 = dateTimeZone1.getShortName((-863L), locale0);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      zonedChronology0.assemble(assembledChronology_Fields0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      String string0 = dateTimeZone0.getShortName(583L, (Locale) null);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
      Locale locale0 = Locale.US;
      String string0 = dateTimeZone0.getShortName((long) 1, locale0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, 1322);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1322
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      long long0 = zonedChronology0.getDateTimeMillis((-475L), 1, 1, 1, 1);
      assertEquals(61001L, long0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfDay();
      dateTimeField0.getDifferenceAsLong(1, (-1538L));
      assertEquals("+01:00", dateTimeZone0.toString());
      assertSame(dateTimeZone0, dateTimeZone1);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfHalfday();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone1, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.roundHalfFloor((-1561L));
      assertEquals(0L, long0);
      assertEquals("+01:00", dateTimeZone1.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1000);
      assertEquals("+00:00:01", dateTimeZone1.getID());
      
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfDay();
      DurationField durationField0 = zonedChronology0.weeks();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.getDifferenceAsLong((-8L), 1000);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.setDefault(dateTimeZone1);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals("+01:00", dateTimeZone1.getID());
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("CST");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("America/Chicago", dateTimeZone0.getID());
  }
}
