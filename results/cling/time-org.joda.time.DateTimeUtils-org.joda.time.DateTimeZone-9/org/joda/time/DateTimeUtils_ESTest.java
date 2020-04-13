/*

 * Tue Mar 03 17:54:06 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-3598809L));
      localDateTime0.withLocalMillis((-3598809L));
      long long0 = DateTimeUtils.getInstantMillis((ReadableInstant) null);
      assertEquals(1583258033725L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-3598810L));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.toString());
      
      LocalDateTime localDateTime1 = localDateTime0.withLocalMillis((-3598810L));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeZone.setDefault(fixedDateTimeZone0);
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInterval0).getChronology();
      DateTimeUtils.getIntervalChronology(readableInterval0);
      LocalDate localDate0 = new LocalDate();
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime((-9223372036854775808L));
      LocalDateTime localDateTime1 = localDateTime0.withLocalMillis((-9223372036854775808L));
      assertNotSame(localDateTime1, localDateTime0);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      assertEquals("-18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-3598810L));
      localDateTime0.withLocalMillis((-2598L));
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(3321L);
      localDateTime0.withLocalMillis(3321L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+user.timezone");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+user.timezone\" is malformed at \"user.timezone\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-3598810L));
      localDateTime0.withLocalMillis((-3598810L));
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
      
      LocalDateTime localDateTime0 = new LocalDateTime((-3598810L));
      LocalDateTime localDateTime1 = localDateTime0.withLocalMillis((-3598810L));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-2021L));
      localDateTime0.withLocalMillis((-2021L));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("><~\"oq3tb<aY~in");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '><~\"oq3tb<aY~in' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusMinutes(30);
      // Undeclared exception!
      try { 
        DateTimeUtils.setCurrentMillisProvider((DateTimeUtils.MillisProvider) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The MillisProvider must not be null
         //
         verifyException("org.joda.time.DateTimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-3598829L));
      localDateTime0.withLocalMillis((-3598829L));
      DateTimeUtils.OffsetMillisProvider dateTimeUtils_OffsetMillisProvider0 = new DateTimeUtils.OffsetMillisProvider((-3598829L));
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_OffsetMillisProvider0);
      assertEquals(1583254429198L, dateTimeUtils_OffsetMillisProvider0.getMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.withLocalMillis((-3598847L));
      Chronology chronology0 = DateTimeUtils.getInstantChronology((ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.withLocalMillis(15778800016L);
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval((ReadableInterval) null);
      assertNotNull(readableInterval0);
      assertEquals(1583258026846L, readableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = new LocalDate();
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval(interval0);
      assertEquals("-18:00", dateTimeZone0.getID());
      assertEquals(1583258400000L, readableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-3598810L));
      LocalDateTime localDateTime1 = localDateTime0.withLocalMillis((-3598810L));
      assertNotSame(localDateTime1, localDateTime0);
      
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) iSOChronology0);
      DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) dateMidnight0);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.withLocalMillis((-1967L));
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(10800000L);
      localDateTime0.withLocalMillis(10800000L);
      DateTimeUtils.setCurrentMillisOffset(0L);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.withLocalMillis((-64799977L));
      DateTimeUtils.setCurrentMillisOffset((-64799977L));
  }
}
