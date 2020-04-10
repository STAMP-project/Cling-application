/*

 * Tue Mar 03 18:17:05 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Set<String> set0 = Calendar.getAvailableCalendarTypes();
      Provider provider0 = mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn(set0).when(provider0).getAvailableIDs();
      // Undeclared exception!
      try { 
        DateTimeZone.setProvider(provider0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The provider doesn't support UTC
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(17, 17);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+17:17", dateTimeZone0.toString());
      assertNotNull(dateTimeZone1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2146710058);
      GJChronology gJChronology0 = GJChronology.getInstance();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) gJChronology0);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) mutableDateTime0);
      assertEquals(1583259402262L, mutableDateTime0.getMillis());
      assertEquals(2146710058, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-2389), 2147483382, (-2389), 2147483382).when(dateTimeZone0).getOffset(anyLong());
      doReturn(false).when(dateTimeZone0).isFixed();
      doReturn(0L, 0L).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      boolean boolean0 = dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn("GMT+BZ|kr99").when(dateTimeZone0).getNameKey(anyLong());
      doReturn(2147483377, 2147483377, 326565).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)2147483377, 0L).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      dateTimeZone1.getName((-831L));
      // Undeclared exception!
      try { 
        dateTimeZone1.convertLocalToUTC((-2859L), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition: 1969-12-31T23:59:57.141 (null)
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:19:32");
      assertNotNull(dateTimeZone0);
      assertEquals("+00:19:32", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((-12219292800000L), false, 1735L);
      assertEquals((-12219293972000L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-2389), 2147483382).when(dateTimeZone0).getOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      int int0 = dateTimeZone1.getOffsetFromLocal((-831L));
      assertEquals(2147483382, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      DateTimeZone.setNameProvider(nameProvider0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(17, 17);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = dateTimeZone0.getMillisKeepLocal(fixedDateTimeZone0, (-502L));
      assertEquals(62219498L, long0);
      assertEquals("+17:17", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Provider provider0 = mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Set<String>) null).when(provider0).getAvailableIDs();
      // Undeclared exception!
      try { 
        DateTimeZone.setProvider(provider0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The provider doesn't have any available ids
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-2389), 2147483382, (-2389)).when(dateTimeZone0).getOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      LocalDateTime.now();
      long long0 = dateTimeZone1.convertLocalToUTC((long) 2147483382, false);
      assertEquals(2147485771L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775808L), false);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-2389), 2147483382).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)2147483382, (-1L)).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone1.convertLocalToUTC((long) 2147483382, false);
      assertEquals(2147485771L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal((-12219292800000L));
      assertEquals(1172000, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.GERMANY;
      String string0 = fixedDateTimeZone0.getName(0L, locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone.setNameProvider((NameProvider) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, (-49));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -49
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1000000000000000000L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-2389), (-2389)).when(dateTimeZone0).getOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      int int0 = dateTimeZone1.getOffsetFromLocal((-831L));
      assertEquals((-2389), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(59, 59);
      Locale locale0 = Locale.JAPAN;
      String string0 = dateTimeZone0.UTC.getShortName((long) 59, locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      assertEquals("+59:59", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 90, true);
      assertEquals((-3599910L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn("GMT+BZ|kr99").when(dateTimeZone0).getNameKey(anyLong());
      doReturn(2147483377, 2147483377, 326565, 2147483377, (-292269054)).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)2147483377, (long)2147483377, (long)(-292269054)).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      String string0 = dateTimeZone1.getName((-831L));
      assertEquals("+596:31:23.377", string0);
      
      long long0 = dateTimeZone1.convertLocalToUTC((-2859L), true);
      assertEquals((-329424L), long0);
      
      long long1 = dateTimeZone1.adjustOffset((-14639744L), false);
      assertEquals((-2454392175L), long1);
  }
}
