/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 20:57:46 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-766623600001L), true);
      assertEquals((-766620000001L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-766623599992L), true);
      assertEquals((-766623599992L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-766623599992L), false);
      assertEquals((-766627199992L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036847575807L, true);
      assertEquals(9223372036847575807L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775778L), false);
      assertEquals((-9223372036854775778L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2057);
      long long0 = dateTimeZone0.adjustOffset(2057, false);
      assertEquals("+00:00:02.057", dateTimeZone0.getID());
      assertEquals(2057L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-766623600001L), false);
      assertEquals((-766623600001L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.UTC.isLocalDateTimeGap((LocalDateTime) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(fixedDateTimeZone0);
      long long0 = fixedDateTimeZone0.UTC.getMillisKeepLocal(cachedDateTimeZone0, 1694L);
      assertEquals(1694L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.getMillisKeepLocal(dateTimeZone0, (-4080L));
      assertEquals((-4080L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-25));
      long long0 = dateTimeZone0.convertLocalToUTC((long) (-25), true);
      assertEquals(0L, long0);
      assertEquals("-00:00:00.025", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((-766623599990L), true, (-766623599990L));
      assertEquals((-766630799990L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((-766623599990L), false, (-766623599990L));
      assertEquals((-766630799990L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC((-9223372036854775808L), true, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertUTCToLocal((-4061L));
      assertEquals(3595939L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertUTCToLocal(9223372036854775791L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2399), "Africa/Addis_Ababa");
      ZoneId zoneId0 = simpleTimeZone0.toZoneId();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      int int0 = dateTimeZone0.getOffsetFromLocal(9223372036854775807L);
      assertEquals(9320000, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime(1, 1, 1, 1, 1, 1, 1);
      assertEquals((-62135594310999L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal((-9223372036854775808L));
      assertEquals(1172000, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal(228877200000L);
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal((-766623599992L));
      assertEquals(7200000, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal((-766623600001L));
      assertEquals(7200000, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset((-3732L));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1000000000000000000L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      int int0 = fixedDateTimeZone0.UTC.getOffset((ReadableInstant) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Instant instant0 = new Instant();
      int int0 = fixedDateTimeZone0.UTC.getOffset((ReadableInstant) instant0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(60000);
      Locale locale0 = Locale.FRANCE;
      String string0 = dateTimeZone0.getName((long) 60000, locale0);
      assertEquals("+00:01", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Locale locale0 = Locale.GERMANY;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.FRENCH;
      String string0 = fixedDateTimeZone0.getShortName(2961L, locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((-12219292800000L));
      assertEquals("+00:19:32", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone.setNameProvider((NameProvider) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '+00:00:00.001' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(60000);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+00:01", dateTimeZone1.getID());
      assertEquals("+00:01", dateTimeZone0.toString());
      assertNotNull(dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal((-284L));
      assertEquals("-18:00", cachedDateTimeZone0.toString());
      assertEquals((-64800000), int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      TimeZone timeZone0 = TimeZone.getTimeZone("JST");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'JST' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHours((-904));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      assertEquals("+01:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes((-943), (-943));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -943
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 726);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 726
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00:01.969");
      assertNotNull(dateTimeZone0);
      assertEquals("+00:00:01.969", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-D9ES%-0(zaA*");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-D9ES%-0(zaA*\" is malformed at \"D9ES%-0(zaA*\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
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
  @Ignore
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      //  // Unstable assertion: assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test52()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Provider provider0 = DateTimeZone.getProvider();
      assertNotNull(provider0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      DateTimeZone.setNameProvider(nameProvider0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test55()  throws Throwable  {
      Set<String> set0 = DateTimeZone.getAvailableIDs();
      assertEquals(575, set0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test56()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      String string0 = dateTimeZone0.toString();
      assertEquals("Europe/Amsterdam", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
      assertNotNull(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Object object0 = fixedDateTimeZone0.UTC.writeReplace();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(60000);
      String string0 = dateTimeZone0.getShortName((long) 60000);
      assertEquals("+00:01", string0);
  }
}
