/*

 * Tue Mar 03 16:35:24 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DurationFormatUtils_ESTest extends DurationFormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      DurationFormatUtils.formatDuration((-832L), "0:00:00.68");
      String string0 = DurationFormatUtils.formatDurationWords((-3297L), true, true);
      assertEquals("-3 seconds", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "gY@ OD Yt", false);
      assertEquals("gY@ OD Yt", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(3600000L, false, true);
      assertEquals("0 days 1 hour", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "0 days", false);
      assertEquals("0 0a00", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(60000L, true, true);
      assertEquals("1 minute", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-659L), false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((-1326L), 0L, "P-1Y11M30DT23H59M58.699S");
      assertEquals("P-1Y11030DT23059058.6991326", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, true);
      assertEquals("0 days", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "gY@ OD Yt", false);
      assertEquals("gY@ OD Yt", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, true);
      assertEquals("0 days", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(1794L, (-1439L), "0 days");
      assertEquals("0 30a086396", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(1794L, (-1439L), "0 days");
      assertEquals("0 30a086396", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "gY@ OD Yt", false);
      assertEquals("gY@ OD Yt", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "0 days 0 hours 0 minutes 0 seconds", false);
      assertEquals("0 0a00 0 hour 0 0inute0 0 econ00", string1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFormatUtils.formatDurationWords(707L, false, false);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod((long) 115, (long) (-1299), "Zx#'`KeYqu", false, timeZone0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFormatUtils.formatDuration(26L, "%KP:=@ClZ@s-x`=e[");
      TimeZone timeZone0 = TimeZone.getTimeZone("{)A/gR{ZQ");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-1369L), " ", false, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-10L), "P0Y0M0DT0H0M0.90S");
      assertEquals("P0Y000DT00000.90-10", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords((-10L), true, false);
      assertEquals("0 seconds", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(1000L, (long) 441, "P-1Y11M30DT23H59M59.127S");
      assertEquals("P-1Y11-130DT2374359-159.1273599441", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1326L), 0L, "P-1Y11M30DT23H59M58.699S");
      assertEquals("P-1Y11030DT23059058.6991326", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, " 1 minutes");
      assertEquals(" 1 0inute0", string1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token((Object) null);
      StringBuffer stringBuffer0 = new StringBuffer();
      boolean boolean0 = durationFormatUtils_Token0.equals(stringBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("0 days 0 hours 0 minutes 0 seconds");
      String string1 = DurationFormatUtils.formatPeriod((long) (-1299), 1L, "[/p&9YwHX$:", false, timeZone0);
      assertEquals("[/p&9Yw0X$:", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(1300L, (-1L));
      assertEquals("P-1Y11M30DT23H59M58.699S", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords((-659L), false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("0 days 0 hours 0 minutes 0 seconds");
      String string0 = DurationFormatUtils.formatPeriod((long) (-1299), 1L, "[/p&9YwHX$:", false, timeZone0);
      assertEquals("[/p&9Yw0X$:", string0);
      
      String string1 = DurationFormatUtils.formatDuration(1L, "P0Y0M0DT0H0M0.41S");
      assertEquals("P0Y000DT00000.411", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(1300L, (-1L));
      assertEquals("P-1Y11M30DT23H59M58.699S", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, " 1 minutes");
      assertEquals(" 1 0inute0", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "0 days 0 hours 0 minutes 0 seconds", false);
      assertEquals("0 0a00 0 hour 0 0inute0 0 econ00", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("0 days 0 hours 0 minutes 0 seconds");
      String string1 = DurationFormatUtils.formatPeriod((long) (-1299), 1L, "[/p&9YwHX$:", false, timeZone0);
      assertEquals("[/p&9Yw0X$:", string1);
  }
}
