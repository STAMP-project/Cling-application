/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 02:33:46 GMT 2019
 */

package org.joda.time.tz;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZoneInfoCompiler_ESTest extends ZoneInfoCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-18548323));
      assertEquals("-05:09:08.323", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(10000);
      assertEquals("+00:00:10", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getShortName((-1288L));
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.FRANCE;
      String string0 = dateTimeZone0.getShortName((-2708L), locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal((-1617503721));
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.convertLocalToUTC(1522L, false);
      assertEquals(1522L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2001);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      long long0 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 1490490000000L);
      assertEquals(1490486402001L, long0);
      assertEquals("+00:00:02.001", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone.setNameProvider((NameProvider) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals(7200000, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("JST");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("Asia/Tokyo", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      assertEquals("+00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = fixedDateTimeZone0.isStandardOffset(1603587600000L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes((-2138), (-2138));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2138
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      String string0 = dateTimeZone0.getName(12360535227L);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(1814, 1814);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1814
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight((-1277L));
      assertEquals((-3600000L), dateMidnight0.getMillis());
  }
}
