/*

 * Tue Mar 03 16:31:12 GMT 2020
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
      String string0 = DurationFormatUtils.formatDurationWords(86399990L, true, true);
      assertEquals("23 hours 59 minutes 59 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "23 hours 59 minutes 59 seconds");
      assertEquals("23 hour0 59 0inute00 59 econ00", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(86400000L, true, true);
      assertEquals("1 day", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "1 day");
      assertEquals("1 0a0", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS((-2759L));
      assertEquals("0:00:-2.41", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(2373L, true, true);
      assertEquals("2 seconds", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(2559L, (-3418L));
      assertEquals("P-1Y11M30DT23H59M54.023S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(426L, false, true);
      assertEquals("0 days", string0);
      
      String string1 = DurationFormatUtils.formatDurationHMS(0L);
      assertEquals("0:00:00.000", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-3023L), true, false);
      assertEquals("-3 seconds", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((-1599L), 1995L, "P0Y0M0DT0H0M-1.01S");
      assertEquals("P0Y000DT0000-1.013594", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(60000L, "ynm>MImt");
      assertEquals("0n1>0I1t", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(60000L, false, true);
      assertEquals("0 days 0 hours 1 minute", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(2581L, 1L);
      assertEquals("P-1Y11M30DT23H59M57.420S", string0);
      
      String string1 = DurationFormatUtils.formatDurationHMS(2581L);
      assertEquals("0:00:02.581", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DurationFormatUtils.formatDuration(1L, "");
      String string0 = DurationFormatUtils.formatPeriodISO(2581L, 1L);
      assertEquals("P-1Y11M30DT23H59M57.420S", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      DurationFormatUtils.formatDuration(3600000L, "");
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, false, true);
      assertEquals("0 days 1 hour", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFormatUtils.formatDurationWords(0L, false, false);
      TimeZone timeZone0 = TimeZone.getTimeZone("0 days 0 hours 0 minutes 0 seconds");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-1L), "", false, timeZone0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFormatUtils.formatDuration((-1L), "ynm>MImt");
      TimeZone timeZone0 = TimeZone.getTimeZone("BlDi-o{&$XS5Ot/oM");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(66L, (-800L), "0n0>0I0t", true, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, false, true);
      assertEquals("0 days 1 hour", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((-2092L), 0L, "WPoJ");
      assertEquals("WPoJ", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("0 days 0 hours 0 minutes 0 seconds");
      String string1 = DurationFormatUtils.formatPeriod(0L, (-1L), "0 days 0 hours 0 minutes 0 seconds", false, timeZone0);
      assertEquals("0 364a-159 0 hour 0 1439inute59 0 econ36459", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((long) 0, " 1 hour", false);
      assertEquals(" 1 hour", string0);
      
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(timeZone0).getOffset(anyLong());
      doReturn(0, 0, 0, 0, 0).when(timeZone0).getRawOffset();
      doReturn(false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      String string1 = DurationFormatUtils.formatPeriod((-1807L), (long) 0, " 1 hour", false, timeZone0);
      assertEquals(" 1 hour", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("BlDi-o{&$XS5Ot/oM");
      String string0 = DurationFormatUtils.formatPeriod(334L, (-18L), "BlDi-o{&$XS5Ot/oM", true, timeZone0);
      assertEquals("BlDi-o{&$X-16165676485Ot/o-1", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1599L), 1995L, "P0Y0M0DT0H0M-1.01S");
      assertEquals("P0Y000DT0000-1.013594", string0);
      
      String string1 = DurationFormatUtils.formatDuration(1995L, "f'T3GQop", false);
      assertEquals("fT3GQop", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-3023L), true, false);
      assertEquals("-3 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration(1995L, "f'T3GQop", false);
      assertEquals("fT3GQop", string1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("P0Y0M0DT0H0M0.000S");
      boolean boolean0 = durationFormatUtils_Token0.equals("P0Y0M0DT0H0M0.000S");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(3600000L, 0L, " 1 second");
      assertEquals(" 1 82800econ30", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(3600000L, false, true);
      assertEquals("0 days 1 hour", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      DurationFormatUtils.formatDuration(3600000L, "");
      String string0 = DurationFormatUtils.formatPeriod(3600000L, 0L, " 1 second");
      assertEquals(" 1 82800econ30", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-993), 8192, (-2993), 12618, 2025).when(timeZone0).getDSTSavings();
      doReturn(1216, 729, 24, (-3606), Integer.MAX_VALUE).when(timeZone0).getOffset(anyLong());
      doReturn(1216, (-3606), (-3606), 25, (-3606)).when(timeZone0).getRawOffset();
      doReturn(true, true, true, true, true).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod((-9L), (-9L), "zB/ul4.", true, timeZone0);
  }
}
