/*

 * Tue Mar 03 18:21:25 GMT 2020
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
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Partial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("2020-03-03T19:19:45.831", "2020-03-03T19:19:45.831").when(dateTimePrinter0).toString();
      doReturn(7593732).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, (DateTimeParser) null);
      dateTimeFormatter0.print(59970L);
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
  public void test01()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-23112936000000L), (DateTimeZone) null);
      LocalDateTime localDateTime1 = localDateTime0.plusYears(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusYears((-1256));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      String string0 = localDateTime0.toString();
      assertEquals("2020-03-03T19:21:12.301", string0);
      
      LocalDateTime localDateTime1 = LocalDateTime.parse("2020-03-03T19:19:45.831");
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusMonths(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plusMonths(1);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      LocalDateTime.fromCalendarFields(gregorianCalendar0);
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      try { 
        LocalDateTime.parse("H)-TnO+IM,Tq|IV", dateTimeFormatter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"H)-TnO+IM,Tq|IV\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      LocalDateTime.parse("", dateTimeFormatter0);
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
  @Ignore
  public void test08()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = new LocalDateTime();
      boolean boolean0 = localDateTime1.isBefore(localDateTime0);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime(1882L, dateTimeZone0);
      localDateTime0.isSupported((DateTimeFieldType) null);
      // Undeclared exception!
      try { 
        LocalDateTime.parse("Wu(-Y>xP(F[vr");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Wu(-Y>xP(F[vr\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:19:51 CET 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Seconds seconds0 = Seconds.seconds((-455));
      LocalDateTime localDateTime1 = localDateTime0.plus((ReadablePeriod) seconds0);
      boolean boolean0 = localDateTime1.isEqual(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime1 = new LocalDateTime((-1795L), (Chronology) buddhistChronology0);
      boolean boolean0 = localDateTime0.isAfter(localDateTime1);
      assertFalse(boolean0);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Date date0 = new Date(10L);
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      LocalDate localDate0 = localDateTime0.toLocalDate();
      Partial partial0 = new Partial(localDate0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      // Undeclared exception!
      try { 
        LocalDateTime.parse((String) null, dateTimeFormatter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", e);
      }
  }
}
