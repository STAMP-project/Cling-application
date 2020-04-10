/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 21:02:21 GMT 2019
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
  @Ignore
  public void test00()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, false, true);
      assertEquals("0 days 1 hour", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "0 days 1 hour");
      assertEquals("0 0a00 1 hour", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("4m fna");
      String string1 = DurationFormatUtils.formatPeriod((-1636L), 0L, "4m fna", true, timeZone0);
      assertEquals("40 fna", string1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFormatUtils.formatDurationWords(0L, false, false);
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MAX_VALUE).when(timeZone0).getDSTSavings();
      doReturn((-1583), Integer.MAX_VALUE, Integer.MAX_VALUE, 59, 59).when(timeZone0).getOffset(anyLong());
      doReturn((-627), Integer.MAX_VALUE, Integer.MAX_VALUE, (-1583), 1021).when(timeZone0).getRawOffset();
      doReturn(true, false, false, false, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(1L, (-862L), "`2YcXa0)0{uj0qil~", true, timeZone0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, ")rl*f", false);
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MAX_VALUE).when(timeZone0).getDSTSavings();
      doReturn((-1583), Integer.MAX_VALUE, Integer.MAX_VALUE, 59, 59).when(timeZone0).getOffset(anyLong());
      doReturn((-627), Integer.MAX_VALUE, Integer.MAX_VALUE, (-1583), 1021).when(timeZone0).getRawOffset();
      doReturn(true, false, false, false, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(1L, (-862L), "`2YcXa0)0{uj0qil~", true, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      DurationFormatUtils.formatDuration((-3353L), "%Tz{Y\"hXOfjqt", true);
      String string0 = DurationFormatUtils.formatDurationWords(60000L, false, true);
      assertEquals("0 days 0 hours 1 minute", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      DurationFormatUtils.formatDuration((-682L), "");
      String string0 = DurationFormatUtils.formatPeriod(0L, (-682L), "P0Y0M0DT0H0M0.000S");
      assertEquals("P0Y0-10DT07430-10.0003599318", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DurationFormatUtils.formatDuration((-1L), "@3", true);
      String string0 = DurationFormatUtils.formatDurationWords((-1737L), true, true);
      assertEquals("-1 seconds", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(0L);
      assertEquals("0:00:00.000", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(0L, true, false);
      assertEquals("0 seconds", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(0L, (-682L), "P0Y0M0DT0H0M0.000S");
      assertEquals("P0Y0-10DT07430-10.0003599318", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, false, true);
      assertEquals("0 days 1 hour", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-1L), "@3", true);
      assertEquals("@3", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(3600000L, 0L, "");
      assertEquals("", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(3600000L, false, true);
      assertEquals("0 days 1 hour", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-1L), "@3", true);
      assertEquals("@3", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(2709L, 0L);
      assertEquals("P-1Y11M30DT23H59M57.291S", string1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(" v-2 ", 3);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(" v-2 ");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(" v-2 ", 3);
      boolean boolean0 = durationFormatUtils_Token0.equals("P0Y0M0DT0H0M2.887S");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(" v-2 ", 3);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1546L), (-1546L), "Minimum abbreviation width with offset is 7");
      assertEquals("0ini00u abbreviation wi0th with off00et i 7", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, true, false);
      assertEquals("0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-682L), "");
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-525L), false, true);
      assertEquals("0 days", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "Q\"");
      assertEquals("Q\"", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      String string0 = DurationFormatUtils.formatPeriod(0L, 0L, " 0 days", true, timeZone0);
      assertEquals(" 0 0a00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(3600000L, 0L, "");
      assertEquals("", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-1L), "@3", true);
      assertEquals("@3", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "0 days 1 hour");
      assertEquals("0 0a00 1 hour", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-1L), "@3", true);
      assertEquals("@3", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, false, true);
      assertEquals("0 days 1 hour", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(2709L, 0L);
      assertEquals("P-1Y11M30DT23H59M57.291S", string1);
  }
}
