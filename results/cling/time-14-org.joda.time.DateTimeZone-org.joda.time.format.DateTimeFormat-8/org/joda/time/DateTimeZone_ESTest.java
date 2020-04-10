/*

 * Tue Mar 03 18:14:53 GMT 2020
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
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      assertEquals("+18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1034);
      DateMidnight dateMidnight0 = new DateMidnight((long) 1034, dateTimeZone0);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals((-1034L), dateMidnight0.getMillis());
      assertEquals("+00:00:01.034", dateTimeZone0.getID());
      assertEquals(1034, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(41);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+00:00:00.041");
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+00:00:00.041", dateTimeZone1.getID());
      assertNotNull(dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(25);
      assertEquals("+25:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-842), 89, 63, (-842), 89).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)89, (long)89, (long)89, (long)89).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone1.convertLocalToUTC((-678L), true);
      assertEquals((-767L), long0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("&9 O6'H?}Gg?IK[D");
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(timeZone0);
      long long1 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, 89);
      assertEquals(152L, long1);
      
      int int0 = dateTimeZone1.getOffsetFromLocal(16L);
      assertEquals(89, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2146235109));
      long long0 = dateTimeZone0.convertLocalToUTC((-2146235931L), false, 1217L);
      assertEquals((-822L), long0);
      assertEquals("-596:10:35.109", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-842), (-842), 63, (-842)).when(dateTimeZone0).getOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone1.convertLocalToUTC((-678L), true);
      assertEquals(164L, long0);
      
      int int0 = dateTimeZone1.getOffsetFromLocal(16L);
      assertEquals((-842), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone.forID("-00:00:00.011");
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-%I");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-%I\" is malformed at \"%I\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZone.forID("@2'&`1Xpq8)k3_P");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '@2'&`1Xpq8)k3_P' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      DateTimeZone dateTimeZone0 = cachedDateTimeZone0.getUncachedZone();
      long long0 = cachedDateTimeZone0.getMillisKeepLocal(dateTimeZone0, (-1598L));
      assertEquals((-1598L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes((-2147483050), (-2147483050));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2147483050
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(89, 354, 354, 89).when(dateTimeZone0).getOffset(anyLong());
      TimeZone timeZone0 = TimeZone.getTimeZone("Adding time zone offset caused overflow");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeZone1.getMillisKeepLocal(dateTimeZone0, 226801280L);
      assertEquals(226801191L, long0);
      assertEquals("UTC", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-842), 89).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)89, (long)(-2650)).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone1.convertLocalToUTC((long) (-842), false);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(fixedDateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal((-1L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.CANADA_FRENCH;
      String string0 = fixedDateTimeZone0.getName(10000L, locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone.setNameProvider((NameProvider) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Provider provider0 = DateTimeZone.getProvider();
      DateTimeZone.setProvider(provider0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 128);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 128
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(766620002635L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(173, "+00:");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '+00:' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, true);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("Adding time zone offset caused overflow");
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/Argentina/Buenos_Aires");
      int int0 = dateTimeZone0.getOffsetFromLocal((-10800000));
      assertEquals((-10800000), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.TAIWAN;
      String string0 = dateTimeZone0.getShortName((long) (-3548), locale0);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((-663L), true);
      assertEquals((-3600663L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
  }
}
