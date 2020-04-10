/*

 * Tue Mar 03 16:53:05 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology_ESTest extends ZonedChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DurationField durationField0 = zonedChronology0.years();
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField(buddhistChronology0, dateTimeField0);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null, durationField0).when(chronology0).centuries();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).dayOfYear();
      doReturn((DurationField) null, durationField0).when(chronology0).days();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).era();
      doReturn((DurationField) null, durationField0).when(chronology0).eras();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null, durationField0).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null, dateTimeField0, dateTimeField0).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null, skipUndoDateTimeField0, dateTimeField0).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null, skipUndoDateTimeField0).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null, skipUndoDateTimeField0).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null, dateTimeField0, (DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null, durationField0).when(chronology0).minutes();
      doReturn((DateTimeField) null, unsupportedDateTimeField0).when(chronology0).monthOfYear();
      doReturn((DurationField) null, durationField0).when(chronology0).months();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).secondOfMinute();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).seconds();
      doReturn((String) null, (String) null, (String) null, "", "").when(chronology0).toString();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null, durationField0).when(chronology0).weeks();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).weekyear();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null, durationField0).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone1 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "").when(dateTimeZone1).getID();
      doReturn((String) null, "", "oCOAhVYe.\"").when(dateTimeZone1).toString();
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(chronology1, dateTimeZone1);
      StrictChronology strictChronology0 = StrictChronology.getInstance(zonedChronology1);
      ZonedChronology zonedChronology2 = ZonedChronology.getInstance(strictChronology0, dateTimeZone0);
      assertNotSame(zonedChronology2, zonedChronology0);
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
      doReturn(4697L).when(chronology0).getDateTimeMillis(anyLong() , anyInt() , anyInt() , anyInt() , anyInt());
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
      doReturn("7QTM!1D").when(dateTimeZone0).getID();
      doReturn(48, 48).when(dateTimeZone0).getOffset(anyLong());
      doReturn(2147483051).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("7QTM!1D", "7QTM!1D", "R", "7QTM!1D").when(dateTimeZone0).toString();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      try { 
        zonedChronology0.getDateTimeMillis((long) 93, 3, 93, 2728, (-1112));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition: 1969-12-07T03:28:41.646
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
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
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("7QTM!1D").when(dateTimeZone0).getID();
      doReturn("c$8qsCp").when(dateTimeZone0).toString();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(0);
      Chronology chronology2 = zonedChronology0.withZone(dateTimeZone1);
      assertSame(chronology2, chronology0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(2);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone1);
      Chronology chronology2 = zonedChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology2, zonedChronology0);
  }

  @Test(timeout = 4000)
  @Ignore
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
      doReturn(0L).when(chronology0).getDateTimeMillis(anyInt() , anyInt() , anyInt() , anyInt());
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
      doReturn("org.joda.time.chrono.GJChronology$LinkedDurationField").when(dateTimeZone0).getID();
      doReturn(0).when(dateTimeZone0).getOffset(anyLong());
      doReturn(0).when(dateTimeZone0).getOffsetFromLocal(anyLong());
      doReturn("ZonedChronology[", "HST").when(dateTimeZone0).toString();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis((-1612), 0, (-2288), (-1612));
      assertEquals(0L, long0);
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
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      DateTimeField dateTimeField0 = zonedChronology0.secondOfMinute();
      assembledChronology_Fields0.monthOfYear = dateTimeField0;
      zonedChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
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
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("7QTM!1D").when(dateTimeZone0).getID();
      ZonedChronology.getInstance(chronology1, dateTimeZone0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(535);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gregorianChronology0, dateTimeZone1);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) zonedChronology0);
      Date date0 = localDateTime0.toDate();
      LocalTime.fromDateFields(date0);
      assertEquals("Wed Mar 25 23:52:27 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DurationField durationField0 = zonedChronology0.weeks();
      DateTimeField dateTimeField0 = zonedChronology0.centuryOfEra();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(unsupportedDateTimeField0);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null, durationField0).when(chronology0).centuries();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).dayOfYear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).era();
      doReturn((DurationField) null, durationField0).when(chronology0).eras();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null, durationField0).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null, dateTimeField0, delegatedDateTimeField0).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null, durationField0).when(chronology0).hours();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, unsupportedDateTimeField0).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null, durationField0).when(chronology0).months();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null, dateTimeField0).when(chronology0).secondOfMinute();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).seconds();
      doReturn((String) null, (String) null, (String) null, "NoSeconds", "NoSeconds").when(chronology0).toString();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null, delegatedDateTimeField0).when(chronology0).weekyear();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null, (DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null, (DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null, durationField0).when(chronology0).years();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(chronology1, dateTimeZone1);
      ZonedChronology zonedChronology2 = ZonedChronology.getInstance(zonedChronology1, dateTimeZone1);
      boolean boolean0 = zonedChronology1.equals(zonedChronology2);
      assertTrue(boolean0);
      assertFalse(zonedChronology2.equals((Object)zonedChronology0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(2);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(zonedChronology0, fixedDateTimeZone0);
      boolean boolean0 = zonedChronology0.equals(zonedChronology1);
      assertFalse(boolean0);
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
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology1, dateTimeZone0);
      boolean boolean0 = zonedChronology0.equals(dateTimeZone0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
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
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology1 = ZonedChronology.getInstance(chronology1, dateTimeZone1);
      boolean boolean0 = zonedChronology1.equals(zonedChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
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
      ZonedChronology.getInstance(chronology1, dateTimeZone0);
      try { 
        zonedChronology0.getDateTimeMillis((-1542), (-1805), (-1542), 469);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -1805 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
