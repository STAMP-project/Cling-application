/*

 * Tue Mar 03 16:38:14 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DurationFormatUtils_ESTest extends DurationFormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("0 days");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(630L);
      assertEquals("P0Y0M0DT0H0M0.630S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(630L, 630L, ";Xg!GOix`XCK}Ly!g`");
      assertEquals(";Xg!GOix`XCK}L0!g`", string1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(106, 7).when(timeZone0).getDSTSavings();
      doReturn(2149, 1, (-2159), (-236), Integer.MAX_VALUE).when(timeZone0).getOffset(anyLong());
      doReturn(50, (-2159), 8192, 7, 8192).when(timeZone0).getRawOffset();
      doReturn(false, true, true, false, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      DurationFormatUtils.formatDuration((-1093L), "org.apache.commons.lang3.StringUtils", true);
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-3061L), "|pHV9E", false, timeZone0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(454L, "y");
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "&8JUko");
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, true);
      assertEquals("0 days", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-201L), "IllegalArgumentException occurred", false);
      assertEquals("IllegalArgu0entException occurre0", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(60000L, false, true);
      assertEquals("0 days 0 hours 1 minute", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(3600000L, "H:mm:ss.SSS");
      assertEquals("1:00:00.000", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DurationFormatUtils.formatDuration((-933L), " 1 hour");
      String string0 = DurationFormatUtils.formatDurationWords(86400000L, true, false);
      assertEquals("1 day 0 hours 0 minutes 0 seconds", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFormatUtils.formatDurationWords((-456L), true, true);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-377L), "", true, timeZone0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(106, 7).when(timeZone0).getDSTSavings();
      doReturn(2149, 1, (-2159), (-236), Integer.MAX_VALUE).when(timeZone0).getOffset(anyLong());
      doReturn(50, (-2159), 8192, 7, 8192).when(timeZone0).getRawOffset();
      doReturn(false, true, true, false, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      DurationFormatUtils.formatDurationHMS(Integer.MAX_VALUE);
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-3075L), "|pHV9E", false, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(timeZone0).getDSTSavings();
      doReturn((-1939), (-1939), 744, 744, 3897).when(timeZone0).getOffset(anyLong());
      doReturn(3897, (-1939), 3897, 554, 11).when(timeZone0).getRawOffset();
      doReturn(true, false, false, false, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      DurationFormatUtils.formatPeriod(994L, 994L, "5exgrC14W", true, timeZone0);
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-456L), true, true);
      assertEquals("0 seconds", string0);
      
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-456L), "0 seconds");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFormatUtils.formatDuration((-456L), "");
      TimeZone timeZone0 = TimeZone.getTimeZone("y3K=~&'y");
      String string0 = DurationFormatUtils.formatPeriod((-377L), 0L, "", false, timeZone0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils.formatDuration((-456L), "");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-456L), "0 seconds");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      DurationFormatUtils.formatDuration((-456L), "");
      String string0 = DurationFormatUtils.formatDurationWords((-377L), true, true);
      assertEquals("0 seconds", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-2321L), (-1437L), "MGZi&,2[Nc8");
      assertEquals("0GZi&,2[Nc8", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("P0Y0M0DT0H0M3.272S");
      boolean boolean0 = durationFormatUtils_Token0.equals("P0Y0M0DT0H0M3.272S");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(86400000L);
      assertEquals("P0Y0M1DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(0L, (-122L), "P0Y0M1DT0H0M0.000S");
      assertEquals("P0Y0-11DT07430-10.0003599878", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-377L), true, true);
      assertEquals("0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(1080L, 0L);
      assertEquals("P-1Y11M30DT23H59M58.920S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-933L), " 1 hour");
      assertEquals(" 1 hour", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(0L, (-122L), "P0Y0M1DT0H0M0.000S");
      assertEquals("P0Y0-11DT07430-10.0003599878", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-456L), "");
      assertEquals("", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(1080L, 0L);
      assertEquals("P-1Y11M30DT23H59M58.920S", string1);
  }
}
