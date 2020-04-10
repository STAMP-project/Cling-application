/*

 * Tue Mar 03 18:19:19 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.Partial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Partial partial0 = new Partial(localDate0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      LocalDateTime localDateTime0 = LocalDateTime.parse("2020-03-03", dateTimeFormatter0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-1944), (-1944), (-1944), (-1944), (-1944));
      LocalDateTime localDateTime1 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusYears(703);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.parse("2020-03-03");
      LocalDateTime localDateTime1 = localDateTime0.plusMonths(0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      LocalDateTime localDateTime1 = localDateTime0.plusMonths(28);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Partial partial0 = new Partial(localDate0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      LocalDateTime.parse("2020-03-03", dateTimeFormatter0);
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
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.parse("2020-03-03");
      boolean boolean0 = localDateTime0.isSupported((DateTimeFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) null);
      Weeks weeks0 = Weeks.THREE;
      Minutes minutes0 = weeks0.toStandardMinutes();
      LocalDateTime localDateTime1 = localDateTime0.withPeriodAdded(minutes0, 0);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Days days0 = Days.SEVEN;
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadablePeriod) days0);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Tue Mar 03 19:17:59 GMT+00:00 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.parse("2020-03-03");
      String string0 = localDateTime0.toString();
      assertEquals(4, localDateTime0.size());
      assertEquals("2020-03-03T00:00:00.000", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Partial partial0 = new Partial(localDate0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      LocalDateTime localDateTime0 = LocalDateTime.parse("2020-03-03", dateTimeFormatter0);
      Date date0 = localDateTime0.toDate();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertEquals("Tue Mar 03 00:00:00 GMT+00:00 2020", date0.toString());
  }
}
