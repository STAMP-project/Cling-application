/*

 * Tue Mar 03 16:33:06 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DurationFormatUtils_ESTest extends DurationFormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("0 0a001 0 hour 0 0inute01 0 econ01");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((long) 1, "0 days 0 hours 0 minutes 0 seconds");
      assertEquals("0 0a000 0 hour 0 0inute00 0 econ00", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(3600000L, false, true);
      assertEquals("0 days 1 hour", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-864L), 481L, "Minimum abbreviation width with offset is 7");
      assertEquals("0ini00u abbreviation wi0th with off01et i 7", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-864L), "Minimum abbreviation width with offset is 7");
      assertEquals("0ini00u abbreviation wi0th with off00et i 7", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, false, true);
      assertEquals("0 days 1 hour", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "H@q9:JQ");
      assertEquals("0@q9:JQ", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(1L, false, true);
      assertEquals("0 days", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "0 days");
      assertEquals("0 0a00", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(60000L, false, true);
      assertEquals("0 days 0 hours 1 minute", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "0 days 0 hours 1 minute");
      assertEquals("0 0a000 0 hour 1 0inute", string1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "0:00:00.001", false);
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-853L), "normalize");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((-864L), 481L, "Minimum abbreviation width with offset is 7");
      assertEquals("0ini00u abbreviation wi0th with off01et i 7", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(1L);
      assertEquals("0:00:00.001", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(1L, false, true);
      assertEquals("0 days", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(2450L);
      assertEquals("0:00:02.450", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(60000L, false, true);
      assertEquals("0 days 0 hours 1 minute", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO((-864L), 481L);
      assertEquals("P0Y0M0DT0H0M1.345S", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-864L), "Minimum abbreviation width with offset is 7");
      assertEquals("0ini00u abbreviation wi0th with off00et i 7", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-864L), "Minimum abbreviation width with offset is 7");
      assertEquals("0ini00u abbreviation wi0th with off00et i 7", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords((-1L), true, true);
      assertEquals("0 seconds", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-2225L), "0 0a001 0 hour 0 0inute01 0 econ01", false);
      assertEquals("0 0a001 0 hour 0 0inute01 0 econ01", string1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils.formatDurationISO((-1L));
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(25, "P0Y0M0DT0H0M0.99S");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-551L), "d", false, (TimeZone) simpleTimeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-1L), false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      String string1 = DurationFormatUtils.formatPeriod((-1L), 0L, "Search and Replace array lengths don't match: ", false, timeZone0);
      assertEquals("1earch an0 Replace arra1 length0 0ont match: ", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(782L, (-1500L), "P0Y0M0DT0H0M0.88S");
      assertEquals("P0Y0-10DT07430-10.883597718", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-864L), 481L, "Minimum abbreviation width with offset is 7");
      assertEquals("0ini00u abbreviation wi0th with off01et i 7", string0);
      
      String string1 = DurationFormatUtils.formatDurationHMS(481L);
      assertEquals("0:00:00.481", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-1L), true, true);
      assertEquals("0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDurationHMS(481L);
      assertEquals("0:00:00.481", string1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token((Object) null);
      boolean boolean0 = durationFormatUtils_Token0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      DurationFormatUtils.formatPeriod(1780L, 0L, "nfN_|{&z2Y-");
      String string0 = DurationFormatUtils.formatDurationWords(1780L, true, false);
      assertEquals("1 second", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO((-864L), 481L);
      assertEquals("P0Y0M0DT0H0M1.345S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DurationFormatUtils.formatPeriod((-2301L), 0L, "", true, timeZone0);
      String string0 = DurationFormatUtils.formatDuration((-2716L), "Fbpo`y5XL'{gmy[");
      assertEquals("Fbpo`05XL{gmy[", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO((-864L), 481L);
      assertEquals("P0Y0M0DT0H0M1.345S", string0);
      
      String string1 = DurationFormatUtils.formatDurationHMS(481L);
      assertEquals("0:00:00.481", string1);
  }
}
