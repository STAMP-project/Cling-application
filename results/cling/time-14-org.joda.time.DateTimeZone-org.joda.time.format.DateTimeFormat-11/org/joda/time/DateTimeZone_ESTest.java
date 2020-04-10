/*

 * Tue Mar 03 18:16:30 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal(10800000L);
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
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
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals(1583259361216L, dateTime0.getMillis());
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(9);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(9);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+09:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-13), (-194768744), (-292269337), (-1642), (-419)).when(dateTimeZone0).getOffset(anyLong());
      doReturn(0L, 0L).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      DateTimeZone dateTimeZone2 = DateTimeZone.forOffsetHours((-13));
      dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (-2785L));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-13), dateTimeZone1);
      // Undeclared exception!
      try { 
        localDateTime0.toDateTime();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition: 1969-12-29T17:53:52.885
         //
         verifyException("org.joda.time.chrono.ZonedChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-13), (-194768744)).when(dateTimeZone0).getOffset(anyLong());
      doReturn(631L).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone1.adjustOffset((-713L), false);
      assertEquals((-713L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+09:00");
      assertNotNull(dateTimeZone0);
      assertEquals("+09:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-13), (-194768781)).when(dateTimeZone0).getOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      int int0 = dateTimeZone1.getOffsetFromLocal(1L);
      assertEquals((-194768781), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone.forID("+00:00");
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
      assertEquals("UTC", dateTimeZone0.getID());
      assertNotNull(dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZone.forID("org.joda.time.DateTimeZone.NameProvider");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'org.joda.time.DateTimeZone.NameProvider' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1838));
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 609L);
      assertEquals("-00:00:01.838", dateTimeZone0.toString());
      assertEquals((-3601229L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes((-13), (-135));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -135
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(4362, (-780), 4362, (-780)).when(dateTimeZone0).getOffset(anyLong());
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(0);
      long long0 = dateTimeZone1.getMillisKeepLocal(dateTimeZone0, 0L);
      assertEquals(780L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-13), (-194768744)).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)2146325350).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone1.adjustOffset(2645L, true);
      assertEquals(2645L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-13), (-194768744)).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)(-194768744), (long)(-135)).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone1.convertLocalToUTC((long) (-194768744), false);
      assertEquals((-194768731L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalDateTime localDateTime0 = new LocalDateTime(1485L, dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.minusHours(3600000);
      DateTime dateTime0 = localDateTime1.toDateTime();
      assertEquals((-12960001170515L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getName((long) (-13), locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone.setNameProvider((NameProvider) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Provider provider0 = DateTimeZone.getProvider();
      DateTimeZone.setProvider(provider0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(":~");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(1999L, false);
      assertEquals((-3598001L), long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 121);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 121
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("m#&n", "m#&n").when(timeZone0).getID();
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'm#&n' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-13), (-194768744), (-292269337), 0, 0).when(dateTimeZone0).getOffset(anyLong());
      doReturn(0L, 0L).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      DateTimeZone dateTimeZone2 = DateTimeZone.forOffsetHours((-13));
      long long0 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (-2785L));
      assertEquals(46797202L, long0);
      assertEquals("-13:00", dateTimeZone2.getID());
      
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-13), dateTimeZone1);
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals((-194768757L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      Locale locale0 = Locale.CANADA;
      String string0 = dateTimeZone0.UTC.getShortName((long) (-13), locale0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((-1L), true);
      assertEquals((-3600001L), long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(228877200000L, true);
      assertEquals(228873600000L, long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-13), (-194768744)).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)(-194768744)).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone1.adjustOffset((-2785L), false);
      assertEquals((-194771516L), long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((-1L), true);
      assertEquals((-3600001L), long0);
  }
}
