/*

 * Tue Mar 03 16:52:51 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology_ESTest extends ZonedChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      Instant instant0 = new Instant((-5475L));
      boolean boolean0 = zonedChronology0.equals(instant0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn(1150L).when(chronology0).getDateTimeMillis(anyLong() , anyInt() , anyInt() , anyInt() , anyInt());
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((String) null, (String) null).when(chronology0).toString();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("DurationField[").when(dateTimeZone0).getID();
      doReturn(1970, (-113)).when(dateTimeZone0).getOffset(anyLong());
      doReturn(326565).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("i-7o6!P{*/;B<gvq4^a", "org.joda.time.field.SkipDateTimeField", (String) null, "oL8d/[VwShNxr").when(dateTimeZone0).toString();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      try { 
        zonedChronology0.getDateTimeMillis((long) (-2382), (-2382), Integer.MAX_VALUE, 1971, 1980);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition: 1969-12-31T23:54:34.585
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn(0L).when(chronology0).getDateTimeMillis(anyLong() , anyInt() , anyInt() , anyInt() , anyInt());
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((String) null, (String) null).when(chronology0).toString();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis((-3434L), 153692453, 5048, 849, 1136);
      assertEquals((-3600000L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((String) null).when(chronology0).toString();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology.getInstance(chronology1, dateTimeZone0);
      MutableDateTime mutableDateTime0 = null;
      try {
        mutableDateTime0 = new MutableDateTime(775, (-1869), 1084, 1084, 775, 1084, 1084);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 1084 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((String) null, (String) null, (String) null).when(chronology0).toString();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone1);
      Chronology chronology2 = zonedChronology0.withZone(dateTimeZone0);
      assertFalse(chronology2.equals((Object)chronology1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((String) null, (String) null).when(chronology0).toString();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      assertNotNull(dateTimeZone0);
      
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      Instant instant0 = new Instant((long) 1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null, (DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).seconds();
      doReturn((String) null, (String) null, (String) null).when(chronology0).toString();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      zonedChronology0.withZone(dateTimeZone1);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(zonedChronology0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(lenientChronology0, dateTimeZone0);
      long long0 = zonedChronology1.getDateTimeMillis(5846656L, 1, 1, (-418), 1);
      assertEquals(3242001L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-337L));
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.minuteOfDay();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null, preciseDurationField0).when(chronology0).centuries();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).dayOfYear();
      doReturn((DurationField) null, preciseDurationField0).when(chronology0).days();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).era();
      doReturn((DurationField) null, preciseDurationField0).when(chronology0).eras();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null, preciseDurationField0).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null, dateTimeField0, dateTimeField0).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null, preciseDurationField0).when(chronology0).hours();
      doReturn((DurationField) null, preciseDurationField0).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null, dateTimeField0, dateTimeField0).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).minuteOfHour();
      doReturn((DurationField) null, preciseDurationField0).when(chronology0).minutes();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).monthOfYear();
      doReturn((DurationField) null, preciseDurationField0).when(chronology0).months();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).secondOfMinute();
      doReturn((DurationField) null, preciseDurationField0).when(chronology0).seconds();
      doReturn((String) null, (String) null, "", "^7").when(chronology0).toString();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null, preciseDurationField0).when(chronology0).weeks();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).weekyear();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null, preciseDurationField0).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null, dateTimeField0, dateTimeField0).when(chronology0).year();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(chronology1, dateTimeZone1);
      ZonedChronology zonedChronology2 = ZonedChronology.getInstance(zonedChronology1, dateTimeZone1);
      assertNotSame(zonedChronology1, zonedChronology2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((String) null).when(chronology0).toString();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology.getInstance(chronology1, fixedDateTimeZone0);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, fixedDateTimeZone0);
      try { 
        zonedChronology0.getDateTimeMillis(1883L, 5048, (-3358), 485, 17);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 5048 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((String) null).when(chronology0).toString();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      Instant instant0 = new Instant((-5475L));
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      boolean boolean0 = zonedChronology0.equals(instant0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null, (DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).seconds();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(chronology0).toString();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, fixedDateTimeZone0);
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, fixedDateTimeZone0);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((String) null).when(chronology0).toString();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology.getInstance(chronology1, dateTimeZone0);
      try { 
        buddhistChronology0.getDateTimeMillis(1244, 1, 91, 522);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 91 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
