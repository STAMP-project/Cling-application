/*

 * Tue Mar 03 18:08:44 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-1L), (Chronology) iSOChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-4321));
      LocalDateTime localDateTime0 = new LocalDateTime(208L, dateTimeZone0);
      Object object0 = new Object();
      localDateTime0.equals(object0);
      assertEquals("-00:00:04.321", dateTimeZone0.getID());
      assertEquals("-00:00:04.321", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1890L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      DateTimeZone.forOffsetHoursMinutes(5, 0);
      // Undeclared exception!
      try { 
        localDateTime0.getField(4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 4
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.set(localDateTime0, 727L);
      assertEquals(19300007283901L, long0);
      
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(7593750);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusMinutes(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(14);
      assertEquals("+00:00:00.014", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes((-1));
      assertNotSame(localDateTime1, localDateTime0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(7593750);
      assertEquals("+02:06:33.750", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusDays((-1));
      assertNotSame(localDateTime1, localDateTime0);
      
      DateMidnight dateMidnight0 = new DateMidnight((-1050L));
      assertEquals((-3600000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      localDateTime0.plusWeeks((-1));
      long long0 = islamicChronology0.set(localDateTime0, 727L);
      assertEquals(19300007282741L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      dateMidnight0.withMillis((-1));
      try { 
        DateTimeZone.forOffsetHoursMinutes(1771, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-4321));
      LocalDateTime localDateTime0 = new LocalDateTime(208L, dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(294);
      assertNotSame(localDateTime1, localDateTime0);
      assertEquals("-00:00:04.321", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDate localDate0 = localDateTime0.toLocalDate();
      localDate0.toInterval();
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
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-106L)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      DateMidnight dateMidnight0 = new DateMidnight((-2111L), dateTimeZone1);
      assertEquals((-3600000L), dateMidnight0.getMillis());
      
      DurationFieldType durationFieldType0 = DurationFieldType.SECONDS_TYPE;
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDate localDate0 = new LocalDate((long) (-2703), (Chronology) iSOChronology0);
      // Undeclared exception!
      try { 
        localDateTime0.isBefore(localDate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(7593750);
      assertEquals("+02:06:33.750", dateTimeZone0.toString());
      
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks((-1));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-4321));
      LocalDateTime localDateTime0 = new LocalDateTime(208L, dateTimeZone0);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("-00:00:04.321", dateTimeZone0.toString());
      assertEquals("-00:00:04.321", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1989);
      LocalDateTime localDateTime0 = new LocalDateTime(208L, dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusHours(294);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) buddhistChronology0);
      DateTime dateTime0 = localDateTime1.toDateTime(dateMidnight0);
      assertEquals((-17133617969803L), dateTime0.getMillis());
      assertEquals("+00:00:01.989", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone.forOffsetHours(2);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("--TSJshujF#w");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"--TSJshujF#w\" is malformed at \"-TSJshujF#w\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusMinutes(0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      long long0 = islamicChronology0.set(localDateTime0, (-2782L));
      assertEquals(19300007279466L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) islamicChronology0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      localDate0.toInterval();
      // Undeclared exception!
      try { 
        localDateTime0.getField(60000);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 60000
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1890L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      Hours hours0 = Hours.SEVEN;
      Duration duration0 = hours0.toStandardDuration();
      duration0.toPeriodTo((ReadableInstant) null);
      // Undeclared exception!
      try { 
        localDateTime0.getField(4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 4
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-475), dateTimeZone0);
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
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-4321));
      LocalDateTime localDateTime0 = new LocalDateTime(208L, dateTimeZone0);
      LocalDateTime.now(dateTimeZone0);
      assertEquals("-00:00:04.321", dateTimeZone0.toString());
      assertEquals("-00:00:04.321", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-4321));
      LocalDateTime localDateTime0 = new LocalDateTime(208L, dateTimeZone0);
      // Undeclared exception!
      try { 
        LocalDateTime.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.set(localDateTime0, 727L);
      assertEquals(19300003677034L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) islamicChronology0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      islamicChronology0.set(localDateTime0, 918518400000L);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, dateTimeZone0);
      LocalDate localDate0 = new LocalDate((-1239L), (Chronology) zonedChronology0);
      // Undeclared exception!
      try { 
        localDateTime0.isBefore(localDate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1325L), (Chronology) null);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("\u0003'lCtV4s!?Sx/fe6A");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '\u0003'lCtV4s!?Sx/fe6A' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-4321));
      LocalDateTime localDateTime0 = new LocalDateTime(208L, dateTimeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+P0D");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+P0D\" is malformed at \"P0D\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-4321));
      LocalDateTime localDateTime0 = new LocalDateTime(208L, dateTimeZone0);
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
  public void test28()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.millisOfDay();
      LocalDateTime localDateTime1 = localDateTime_Property0.addWrapFieldToCopy(2);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDate localDate0 = new LocalDate((long) (-556), dateTimeZone0);
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-219));
      LocalDateTime localDateTime1 = new LocalDateTime((long) (-219), dateTimeZone0);
      LocalDate localDate0 = localDateTime1.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      PeriodType periodType0 = PeriodType.years();
      interval0.toPeriod(periodType0);
      assertEquals((-3600000L), interval0.getEndMillis());
      
      boolean boolean0 = localDateTime1.isBefore(localDateTime0);
      assertTrue(boolean0);
      assertEquals("-00:00:00.219", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      localDateTime0.toDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      boolean boolean0 = localDateTime0.equals(buddhistChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) iSOChronology0);
      dateMidnight0.minusWeeks((-3624));
      // Undeclared exception!
      try { 
        DateTimeZone.forID(".]H+^V!AjceOFV*");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '.]H+^V!AjceOFV*' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime(1584172701093L);
      Hours hours0 = Hours.SEVEN;
      Duration duration0 = hours0.toStandardDuration();
      Period period0 = new Period(mutableDateTime0, duration0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDate localDate0 = localDateTime0.toLocalDate();
      localDate0.toInterval();
      try { 
        DateTimeZone.forOffsetHoursMinutes(1059, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1979);
      LocalDateTime localDateTime0 = new LocalDateTime(208L, dateTimeZone0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      assertEquals((-3600000L), interval0.getStartMillis());
      
      PeriodType periodType0 = PeriodType.seconds();
      localDateTime0.equals(periodType0);
      assertEquals("+00:00:01.979", dateTimeZone0.toString());
      assertEquals("+00:00:01.979", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(13);
      LocalDate localDate0 = localDateTime1.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1583276400000L, interval0.getEndMillis());
      
      boolean boolean0 = localDateTime1.equals(localDateTime0);
      assertFalse(boolean0);
      assertFalse(localDateTime0.equals((Object)localDateTime1));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      localDateTime0.toDate();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Interval interval0 = localDate0.toInterval((DateTimeZone) fixedDateTimeZone0);
      assertEquals(1583193600000L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime.now((Chronology) islamicChronology0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("--TSJshujF#w");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"--TSJshujF#w\" is malformed at \"-TSJshujF#w\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(14);
      assertEquals("+00:00:00.014", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDate localDate0 = new LocalDate((long) (-556), dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks((-1538));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) islamicChronology0);
      islamicChronology0.set(localDateTime0, 918518400000L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("8)vw#vX");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '8)vw#vX' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-4321));
      LocalDateTime localDateTime0 = new LocalDateTime(208L, dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(0);
      assertSame(localDateTime1, localDateTime0);
      assertEquals("-00:00:04.321", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      DateTimeZone.forOffsetMillis(5);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gregorianChronology0);
      LocalDateTime localDateTime1 = localDateTime0.minusMonths(730);
      LocalDateTime localDateTime2 = localDateTime1.plusDays(730);
      LocalDate localDate0 = localDateTime2.toLocalDate();
      LocalDate localDate1 = localDate0.withWeekyear(7593750);
      DateTime dateTime0 = localDate1.toDateTimeAtCurrentTime();
      assertEquals(239573447255256525L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) iSOChronology0);
      MutableDateTime mutableDateTime0 = dateMidnight0.toMutableDateTimeISO();
      Hours hours0 = Hours.SEVEN;
      Duration duration0 = hours0.toStandardDuration();
      duration0.toPeriodTo((ReadableInstant) mutableDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, (-1252));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1252
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Sun Jun 24 19:07:23 GMT 2012", date0.toString());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2012);
      assertEquals("+00:00:02.012", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258843425L, dateTime0.getMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(0);
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test48()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks((-1377));
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      PeriodType periodType0 = PeriodType.years();
      interval0.toPeriod(periodType0);
      assertNotSame(localDateTime0, localDateTime1);
      assertEquals(1583276400000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-106L)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      MutableDateTime mutableDateTime0 = new MutableDateTime((-2111L));
      Hours hours0 = Hours.SEVEN;
      Duration duration0 = hours0.toStandardDuration();
      Period period0 = new Period(mutableDateTime0, duration0);
      DurationFieldType durationFieldType0 = DurationFieldType.SECONDS_TYPE;
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test50()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1583276400000L, interval0.getEndMillis());
      
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      boolean boolean0 = localDateTime0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LocalDate.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test53()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(13);
      int int0 = localDateTime1.compareTo((ReadablePartial) localDateTime0);
      assertEquals(1, int0);
      
      LocalDate localDate0 = localDateTime1.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      PeriodType periodType0 = PeriodType.years();
      interval0.toPeriod(periodType0);
      assertEquals(1583276400000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(35, 0);
      assertEquals("+35:00", dateTimeZone0.getID());
      
      LocalDateTime localDateTime1 = localDateTime0.plusDays(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(2, 1, 5);
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2071));
      assertEquals("-00:00:02.071", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(354);
      localDateTime0.compareTo((ReadablePartial) localDateTime1);
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime2 = new LocalDateTime((-699L), (Chronology) gJChronology0);
      assertFalse(localDateTime2.equals((Object)localDateTime1));
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone.forOffsetMillis(5);
      boolean boolean0 = localDateTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-106L)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      localDateTime0.isSupported(durationFieldType0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(60);
      assertEquals("+60:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight((-1050L));
      dateMidnight0.minusDays(1);
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
  public void test62()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1989);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      localDate0.toInterval();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("J|XA\u0007[");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'J|XA\u0007[' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test63()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusHours(294);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      PeriodType periodType0 = PeriodType.years();
      interval0.toPeriod(periodType0);
      assertNotSame(localDateTime0, localDateTime1);
      assertEquals(1583276400000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test65()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(33);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+33:00", dateTimeZone0.getID());
      assertEquals("+33:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1890L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime1 = new LocalDateTime((-1L), (Chronology) iSOChronology0);
      Date date0 = localDateTime0.toDate();
      assertFalse(localDateTime0.equals((Object)localDateTime1));
      assertEquals("Thu Jan 01 00:00:01 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test67()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusDays(0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1583258809533L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test68()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1989);
      LocalDateTime localDateTime0 = new LocalDateTime(208L, dateTimeZone0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      PeriodType periodType0 = PeriodType.years();
      interval0.toPeriod(periodType0);
      assertEquals((-3600000L), interval0.getStartMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusDays(1989);
      assertEquals("+00:00:01.989", dateTimeZone0.getID());
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test69()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:06:32 GMT 2020", date0.toString());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(7593750);
      assertEquals("+02:06:33.750", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DateTimeZone.forOffsetMillis(1989);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1165), (-1165));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1165
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test71()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:06:07 GMT 2020", date0.toString());
      
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.set(localDateTime0, 727L);
      assertEquals(19300007167706L, long0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Duration duration0 = hours0.toStandardDuration();
      duration0.toPeriodTo((ReadableInstant) null);
      // Undeclared exception!
      try { 
        LocalDateTime.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test73()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(2012, (-1453), (-1453), 10, 2012, 10);
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      DateMidnight dateMidnight0 = new DateMidnight((long) (-1453));
      DateMidnight dateMidnight1 = dateMidnight0.minusDays(45);
      assertEquals((-3891600000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      islamicChronology0.set(localDateTime0, 727L);
      try { 
        DateTimeZone.forOffsetHours(7593750);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test75()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(13);
      LocalDate localDate0 = localDateTime1.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      PeriodType periodType0 = PeriodType.years();
      interval0.toPeriod(periodType0);
      assertEquals(1583276400000L, interval0.getEndMillis());
      
      boolean boolean0 = localDateTime1.equals(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = localDateTime0.toLocalDate();
      localDate0.toInterval((DateTimeZone) fixedDateTimeZone0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(2012, (-1453), (-1453), 10, 2012, 10);
      LocalDateTime localDateTime1 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DateTimeZone.forOffsetMillis(14);
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
  public void test78()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      assertEquals("UTC", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(59, 0);
      LocalDateTime.now(dateTimeZone1);
      assertEquals("+59:00", dateTimeZone1.getID());
      assertEquals("+59:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, (-1252));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1252
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test80()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes(0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      PeriodType periodType0 = PeriodType.years();
      interval0.toPeriod(periodType0);
      assertEquals(1583276400000L, interval0.getEndMillis());
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test81()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusMinutes((-1));
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.set(localDateTime0, 727L);
      assertEquals(19300007148605L, long0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1989);
      LocalDateTime localDateTime0 = new LocalDateTime(208L, dateTimeZone0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      PeriodType periodType0 = PeriodType.years();
      interval0.toPeriod(periodType0);
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
  public void test83()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((long) 33);
      Hours hours0 = Hours.EIGHT;
      Duration duration0 = hours0.toStandardDuration();
      Period period0 = new Period(mutableDateTime0, duration0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(33);
      LocalDateTime.now(dateTimeZone0);
      assertEquals("+33:00", dateTimeZone0.getID());
      assertEquals("+33:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test84()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:05:22 GMT 2020", date0.toString());
      
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      PeriodType periodType0 = PeriodType.years();
      interval0.toPeriod(periodType0);
      assertEquals(1583276400000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      PeriodType periodType0 = PeriodType.years();
      interval0.toPeriod(periodType0);
      // Undeclared exception!
      try { 
        localDateTime0.compareTo((ReadablePartial) localDate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone.forOffsetMillis(14);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone.forOffsetMillis(7593750);
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(7593750);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test88()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      PeriodType periodType0 = PeriodType.years();
      interval0.toPeriod(periodType0);
      assertEquals(1583276400000L, interval0.getEndMillis());
      
      LocalDateTime localDateTime1 = localDateTime0.plusSeconds(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test89()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      localDateTime0.plusSeconds(2147483633);
      DateMidnight dateMidnight0 = new DateMidnight((long) (-1453));
      DateMidnight dateMidnight1 = dateMidnight0.minusDays(45);
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertEquals((-3891600000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test90()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone.forID((String) null);
      DateTime dateTime0 = localDateTime0.toDateTime((DateTimeZone) null);
      assertEquals(1583258718741L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((long) 33);
      Hours hours0 = Hours.EIGHT;
      Duration duration0 = hours0.toStandardDuration();
      Period period0 = new Period(mutableDateTime0, duration0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(33);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+33:00", dateTimeZone0.getID());
      assertEquals("+33:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test92()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      int[] intArray0 = localDateTime0.getValues();
      assertArrayEquals(new int[] {2020, 3, 3, 68716908}, intArray0);
      
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Interval interval0 = localDate0.toInterval();
      PeriodType periodType0 = PeriodType.years();
      interval0.toPeriod(periodType0);
      assertEquals(1583190000000L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test93()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Sun Jun 24 19:04:50 GMT 2012", date0.toString());
      
      DateMidnight dateMidnight0 = new DateMidnight((long) (-1453));
      dateMidnight0.minusDays(45);
      assertEquals((-3600000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        LocalDateTime.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }
}
