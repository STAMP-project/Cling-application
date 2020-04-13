/*

 * Tue Mar 03 16:40:28 GMT 2020
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
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("H", 104);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DurationFormatUtils.formatDuration(1L, "Minimum abbreviation width is 4");
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-5445)).when(timeZone0).getDSTSavings();
      doReturn(13, 13, (-359), (-2384), (-2384)).when(timeZone0).getOffset(anyLong());
      doReturn((-5445), (-2384), (-2341), (-5445), (-2384)).when(timeZone0).getRawOffset();
      doReturn(false, false, false, true, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (long) 13, "0 0a00", false, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(1L, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration((long) 46, "P0Y0M0DT0H0M0.001S");
      assertEquals("P0Y000DT00000.00146", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(0L);
      assertEquals("0:00:00.000", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(1L, false, true);
      assertEquals("0 days", string0);
      
      String string1 = DurationFormatUtils.formatDuration(1L, "Minimum abbreviation width is 4");
      assertEquals("0ini00u abbreviation wi0th i0 4", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-1397L), ")!SQ", true);
      assertEquals(")!-1397Q", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((-1397L), (-3828L), "o");
      assertEquals("o", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(1L, false, true);
      assertEquals("0 days", string0);
      
      String string1 = DurationFormatUtils.formatDurationHMS(1L);
      assertEquals("0:00:00.001", string1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(536L, (-2309L), "0:00:00.000");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO((-2920L), (-2920L));
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatDurationHMS(1L);
      assertEquals("0:00:00.001", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(1L, false, true);
      assertEquals("0 days", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO((-2920L), (-2920L));
      assertEquals("P0Y0M0DT0H0M0.000S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO((-2920L), (-2920L));
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatDuration(1L, "Minimum abbreviation width is 4");
      assertEquals("0ini00u abbreviation wi0th i0 4", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(86400000L, true, false);
      assertEquals("1 day 0 hours 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration(3600000L, "1 day 0 hours 0 minutes 0 seconds", true);
      assertEquals("1 0a0 0 hour0 0 60inute00 0 econ00", string1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFormatUtils.formatDurationWords(1L, false, true);
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-5445)).when(timeZone0).getDSTSavings();
      doReturn(13, 13, (-359), (-2384), (-2384)).when(timeZone0).getOffset(anyLong());
      doReturn((-5445), (-2384), (-2341), (-5445), (-2384)).when(timeZone0).getRawOffset();
      doReturn(false, false, false, true, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (long) 13, "0 0a00", false, timeZone0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils.formatDurationHMS(1L);
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-5445)).when(timeZone0).getDSTSavings();
      doReturn(13, 13, (-359), (-2384), (-2384)).when(timeZone0).getOffset(anyLong());
      doReturn((-5445), (-2384), (-2341), (-5445), (-2384)).when(timeZone0).getRawOffset();
      doReturn(false, false, false, true, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (long) 13, "0 0a00", false, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-56L), true, true);
      assertEquals("0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-56L), "", true);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(2678L, 0L, "Minimum abbreviation width with offset is 7");
      assertEquals("-1ini1439u abbreviation wi30th with off57et i 7", string0);
      
      String string1 = DurationFormatUtils.formatDuration(2678L, "-1ini1439u abbreviation wi30th with off57et i 7");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("0 days 0 hours 0 minutes -1 seconds");
      String string0 = DurationFormatUtils.formatPeriod((-1690L), 1L, "P0Y0M0DT0H0M0.000S", false, timeZone0);
      assertEquals("P0Y000DT00000.0001691", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-1035L), false, false);
      assertEquals("0 days 0 hours 0 minutes -1 seconds", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("0 days 0 hours 0 minutes -1 seconds");
      String string1 = DurationFormatUtils.formatPeriod((-1690L), 1L, "P0Y0M0DT0H0M0.000S", false, timeZone0);
      assertEquals("P0Y000DT00000.0001691", string1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token((Object) null);
      boolean boolean0 = durationFormatUtils_Token0.equals("-1ini1439u abbreviation wi30th with off57et i 7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(86400000L, true, true);
      assertEquals("1 day", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("InvocationTargetException occurred");
      String string1 = DurationFormatUtils.formatPeriod((-803L), 3600000L, "vg.O?Wn7u,", true, timeZone0);
      assertEquals("vg.O?Wn7u,", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(1L, false, true);
      assertEquals("0 days", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(1L, 1L, "0 days");
      assertEquals("0 0a00", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("InvocationTargetException occurred");
      String string0 = DurationFormatUtils.formatPeriod((-803L), 3600000L, "vg.O?Wn7u,", true, timeZone0);
      assertEquals("vg.O?Wn7u,", string0);
      
      String string1 = DurationFormatUtils.formatDuration(3600000L, "^6J^P,OI]3N_r");
      assertEquals("^6J^P,OI]3N_r", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(1L, 1L, "0 days");
      assertEquals("0 0a00", string0);
      
      String string1 = DurationFormatUtils.formatDurationHMS(1L);
      assertEquals("0:00:00.001", string1);
  }
}
