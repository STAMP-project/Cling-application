/*

 * Tue Mar 03 18:09:14 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1788L));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(6, 6);
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      localDateTime0.toDateTime(dateTime0);
      assertEquals(1583258912762L, dateTime0.getMillis());
      
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+06:06", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      assertSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1901);
      assertEquals("+00:00:01.901", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2703));
      assertEquals("-00:00:02.703", dateTimeZone0.getID());
      
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(1);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      localDateTime0.plusDays((-150));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      long long0 = buddhistChronology0.set(localDateTime0, (-3585));
      assertEquals((-15551413860451L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/St_Johns");
      localDateTime0.plusMinutes((-3554));
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      assertEquals(1583275111021L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone.forOffsetHours(14);
      // Undeclared exception!
      try { 
        LocalDateTime.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1788L));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(1384);
      long long0 = buddhistChronology0.set(localDateTime0, 6);
      assertNotSame(localDateTime0, localDateTime1);
      assertEquals((-17134672773788L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1788L));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      long long0 = buddhistChronology0.set(localDateTime0, 6);
      assertEquals((-17134672773788L), long0);
      
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(6);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1741L));
      try { 
        DateTimeZone.forOffsetHoursMinutes((-23), (-23));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -23
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1788L));
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours((-1791));
      long long0 = gregorianChronology0.set(localDateTime1, (-2489L));
      assertEquals(1576811308956L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      gregorianChronology0.set(localDateTime0, (-10318856413358L));
      // Undeclared exception!
      try { 
        LocalDateTime.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1788L));
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      long long0 = buddhistChronology0.set(localDateTime0, (-3585));
      assertEquals((-15551413864299L), long0);
      
      localDateTime0.isSupported(durationFieldType0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/St_Johns");
      LocalDateTime localDateTime1 = localDateTime0.withFields(localDateTime0);
      DateTime dateTime0 = localDateTime1.toDateTime(dateTimeZone0);
      assertEquals(1583275107045L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1788L));
      DateTimeZone.forOffsetHoursMinutes(6, 6);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(0);
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1788L));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(6, 6);
      assertEquals("+06:06", dateTimeZone0.toString());
      
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(12740625);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1055L));
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
  public void test19()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(6, 6);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("org.joda.time.Weeks");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'org.joda.time.Weeks' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/St_Johns");
      localDateTime0.plusWeeks(1900);
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      assertEquals(1583275105314L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime(1L, dateTimeZone0);
      localDateTime0.toDateTime();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      // Undeclared exception!
      try { 
        localDateTime0.getField((-1791), (Chronology) copticChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -1791
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(112);
      LocalDateTime localDateTime0 = new LocalDateTime((-2872L), dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.minusSeconds(2147288439);
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals("+00:00:00.112", dateTimeZone0.toString());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      LocalDateTime localDateTime1 = new LocalDateTime((-3075L), (Chronology) gregorianChronology0);
      LocalDateTime localDateTime2 = localDateTime0.plusMinutes(0);
      assertSame(localDateTime2, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1788L));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+-user.timezone");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+-user.timezone\" is malformed at \"-user.timezone\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, dateTimeZone0);
      localDateTime0.toDate();
      LocalDateTime localDateTime1 = new LocalDateTime((-20L));
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258896865L, dateTime0.getMillis());
      
      YearMonth yearMonth0 = new YearMonth();
      localDateTime0.equals(yearMonth0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Months months0 = Months.SIX;
      DateMidnight dateMidnight0 = new DateMidnight((-2379L), (Chronology) gregorianChronology0);
      dateMidnight0.minus((ReadablePeriod) months0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("No formatter supplied");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'No formatter supplied' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime(1L, dateTimeZone0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeZone.forOffsetHours(3);
      boolean boolean0 = localDateTime0.equals(islamicChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(12, 12);
      assertEquals("+12:12", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(12);
      assertEquals("+12:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      localDateTime0.plusWeeks(0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      long long0 = buddhistChronology0.set(localDateTime0, (-3585));
      assertEquals((-15551413877220L), long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.withCenturyOfEra(1);
      gregorianChronology0.set(localDateTime1, (-919L));
      // Undeclared exception!
      try { 
        LocalDateTime.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.withCenturyOfEra(1);
      long long0 = gregorianChronology0.set(localDateTime1, (-919L));
      assertEquals((-61530642678135L), long0);
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime2 = LocalDateTime.now(dateTimeZone0);
      assertEquals(4, localDateTime2.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258876501L, dateTime0.getMillis());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:07:56 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        LocalDateTime.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      long long0 = buddhistChronology0.set(localDateTime1, (-3585));
      assertEquals((-15551413896104L), long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone.forOffsetMillis((-3910));
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      localDateTime0.plusDays(0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      long long0 = buddhistChronology0.set(localDateTime0, (-3585));
      assertEquals((-15551413896871L), long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(112);
      LocalDateTime localDateTime0 = new LocalDateTime((-2872L), dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.minusSeconds(2147288439);
      LocalDateTime localDateTime2 = localDateTime0.plusDays(2834);
      DateTime dateTime0 = localDateTime1.toDateTime((ReadableInstant) null);
      assertNotSame(localDateTime0, localDateTime2);
      assertEquals("+00:00:00.112", dateTimeZone0.toString());
      assertEquals((-2147289613760L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1788L));
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals((-1788L), dateTime0.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test41()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:07:45 CET 2020", date0.toString());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1179);
      assertEquals("+00:00:01.179", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMonths(59);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/St_Johns");
      localDateTime0.compareTo((ReadablePartial) localDateTime1);
      DateTime dateTime0 = localDateTime1.toDateTime(dateTimeZone0);
      assertEquals(1738622264723L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      localDateTime0.plusWeeks(0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258864441L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1788L));
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(12740625);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals((-1788L), dateTime0.getMillis());
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-310L));
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(julianChronology0, dateTimeZone0);
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn(zonedChronology0).when(chronology0).withUTC();
      LocalDateTime localDateTime1 = new LocalDateTime((long) 829, chronology0);
      localDateTime1.withYear(829);
      boolean boolean0 = localDateTime0.equals(dateTimeZone0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      Duration duration0 = Duration.standardHours(1378);
      LocalDateTime localDateTime2 = localDateTime1.withDurationAdded(duration0, 2134);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.set(localDateTime2, 2134);
      assertEquals(12169602461907L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(1378);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.set(localDateTime1, 2134);
      assertEquals(1588216061574L, long0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toDateTime();
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test49()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      localDateTime0.isSupported(durationFieldType0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258860667L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(6, 6);
      LocalDateTime localDateTime0 = new LocalDateTime(625L, dateTimeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+-user.timezone");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+-user.timezone\" is malformed at \"-user.timezone\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test51()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.withLocalMillis((-1221L));
      LocalDateTime localDateTime2 = localDateTime0.withWeekyear(46);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.set(localDateTime2, 26607895200000L);
      assertEquals((-60709929112472L), long0);
      
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.withLocalMillis((-1221L));
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals(1, int0);
      
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals((-3601221L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test53()  throws Throwable  {
      DateTimeZone.forOffsetHours(13);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1583258834166,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Amsterdam\",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=180,lastRule=java.util.SimpleTimeZone[id=Europe/Amsterdam,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=63,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=7,SECOND=14,MILLISECOND=166,ZONE_OFFSET=3600000,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.withWeekyear((-1));
      boolean boolean0 = localDateTime0.isAfter(localDateTime1);
      assertTrue(boolean0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1179);
      LocalDateTime localDateTime2 = new LocalDateTime((-1L), dateTimeZone0);
      assertEquals("+00:00:01.179", dateTimeZone0.toString());
      assertEquals("+00:00:01.179", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.minuteOfHour();
      Chronology chronology0 = localDateTime_Property0.getChronology();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology0, dateTimeZone0);
      MonthDay monthDay0 = new MonthDay((Chronology) zonedChronology0);
      // Undeclared exception!
      try { 
        localDateTime0.compareTo((ReadablePartial) monthDay0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2703));
      assertEquals("-00:00:02.703", dateTimeZone0.getID());
      
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone.forOffsetMillis(112);
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test58()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/St_Johns");
      LocalDateTime localDateTime1 = localDateTime0.plusDays(2000);
      DateTime dateTime0 = localDateTime1.toDateTime(dateTimeZone0);
      assertEquals(1756071431649L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test59()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.minusYears(1179);
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:07:01 CET 2020", date0.toString());
      
      long long0 = gregorianChronology0.set(localDateTime1, (-2489L));
      assertEquals((-35622393150964L), long0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LocalDateTime.now();
      // Undeclared exception!
      try { 
        LocalDateTime.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.withWeekyear(46);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      gregorianChronology0.set(localDateTime1, 26607895200000L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test62()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258819407L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(14);
      LocalDateTime localDateTime0 = new LocalDateTime((-41370739140999L), dateTimeZone0);
      long long0 = buddhistChronology0.set(localDateTime0, 14);
      assertEquals((-58506229112999L), long0);
      assertEquals("+14:00", dateTimeZone0.getID());
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test64()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.minusYears(1179);
      long long0 = gregorianChronology0.set(localDateTime0, (-2489L));
      assertEquals(1583258817809L, long0);
      
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DateTimeZone.forOffsetMillis(112);
      // Undeclared exception!
      try { 
        LocalDateTime.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(112);
      LocalDateTime localDateTime0 = new LocalDateTime((-2872L), dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.minusSeconds(2147288439);
      localDateTime1.toDateTime((ReadableInstant) null);
      Chronology chronology0 = localDateTime1.getChronology();
      // Undeclared exception!
      try { 
        localDateTime1.getField(2110, chronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 2110
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test67()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258816584L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test68()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258816197L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusDays(60000);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test69()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 18:06:39 CET 2020", date0.toString());
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test70()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      LocalDateTime localDateTime1 = localDateTime0.minusYears(1179);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.set(localDateTime1, 2134);
      assertEquals((-35622393173311L), long0);
      
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test71()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:06:19 CET 2020", date0.toString());
      
      Duration duration0 = Duration.standardHours(1378);
      LocalDateTime localDateTime1 = localDateTime0.withDurationAdded(duration0, 2134);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.set(localDateTime1, 2134);
      assertEquals(12169602379405L, long0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DateTimeZone.forOffsetMillis(1);
      // Undeclared exception!
      try { 
        LocalDateTime.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test73()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(2, 2, (-852));
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(1);
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      dateTime0.withFields(localDateTime1);
      assertEquals(1583258742009L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime(1L, dateTimeZone0);
      localDateTime0.toDateTime();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(232, (-1791), 829, (-1791), (-2147483049));
      LocalDateTime localDateTime1 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test75()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(1);
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals(1583258781333L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test76()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1788L));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(6, 6);
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      localDateTime0.toDateTime(dateTime0);
      assertEquals(1583258720294L, dateTime0.getMillis());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 940);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 940
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test78()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/St_Johns");
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      assertEquals(1583274919141L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds((-3554));
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test79()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      localDateTime0.plusMinutes(0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258718714L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      localDateTime0.plusHours(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      assertEquals("+00:00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(1);
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(6, 6);
      LocalDateTime localDateTime0 = new LocalDateTime(625L, dateTimeZone0);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-2348), (-2348));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2348
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-3598460L)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime(1L, dateTimeZone0);
      localDateTime0.toDateTime();
      // Undeclared exception!
      try { 
        LocalDateTime.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test84()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583255115801L, dateTime0.getMillis());
      
      localDateTime0.plusHours(1);
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test85()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258696724L, dateTime0.getMillis());
      
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:04:56 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      localDateTime0.toDateTime();
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localDateTime0.compareTo((ReadablePartial) localTime0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(1901);
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1901);
      assertEquals("+00:00:01.901", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null);
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-2848), (Chronology) null);
      // Undeclared exception!
      try { 
        localDateTime0.getField((-2848), (Chronology) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -2848
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test89()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      localDateTime0.plusSeconds(0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258694603L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test90()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(1901);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258694025L, dateTime0.getMillis());
      
      int int0 = localDateTime0.compareTo((ReadablePartial) localDateTime1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      localDateTime0.toDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toDateTime();
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
  public void test93()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1788L));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(6, 6);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals((-1788L), dateTime0.getMillis());
      
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+06:06", dateTimeZone0.toString());
      assertEquals("+06:06", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime(1L, dateTimeZone0);
      localDateTime0.toDateTime();
      try { 
        DateTimeZone.forOffsetHoursMinutes(1418, (-1575));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1575
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      Duration duration0 = Duration.standardHours(1378);
      LocalDateTime localDateTime1 = localDateTime0.withDurationAdded(duration0, 2134);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      gregorianChronology0.set(localDateTime1, 2134);
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localDateTime0.compareTo((ReadablePartial) localTime0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(2, 2, (-852));
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertNotNull(dateTimeZone0);
      
      LocalDateTime localDateTime1 = new LocalDateTime((-763L), dateTimeZone0);
      LocalDateTime localDateTime2 = localDateTime0.plusMinutes(1);
      assertNotSame(localDateTime2, localDateTime0);
  }
}
