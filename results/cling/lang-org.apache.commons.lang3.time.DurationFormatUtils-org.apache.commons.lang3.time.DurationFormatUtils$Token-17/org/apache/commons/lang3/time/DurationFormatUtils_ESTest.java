/*

 * Tue Mar 03 16:35:33 GMT 2020
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
      DurationFormatUtils.formatDuration(0L, "...", false);
      String string0 = DurationFormatUtils.formatDurationWords(1285L, true, true);
      assertEquals("1 second", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      DurationFormatUtils.formatDuration(1405L, "=Pe", true);
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(1L);
      assertEquals("P0Y0M0DT0H0M0.001S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(1L, (-1430L), "P0Y0M0DT0H0M0.001S");
      assertEquals("P0Y0-10DT07430-10.0013598569", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "");
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, true);
      assertEquals("0 days", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(1L);
      assertEquals("P0Y0M0DT0H0M0.001S", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(60000L, 1L);
      assertEquals("P-1Y11M30DT23H59M0.001S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(0L, 0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatDurationHMS(0L);
      assertEquals("0:00:00.000", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "java.text.Normalizer$Form", true);
      assertEquals("java.text.Nor00alizer$For", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(0L, 0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "m", false);
      assertEquals("0", string1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFormatUtils.formatDurationISO(1L);
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(1L, (-1406L), "X2?b1");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "m", false);
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-750L), "", false, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      DurationFormatUtils.formatPeriod((-756L), 0L, "QN/ZAq7^0 ");
      String string0 = DurationFormatUtils.formatDurationISO((-756L));
      assertEquals("P0Y0M0DT0H0M0.44S", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1L), 0L, " 1 seconds");
      assertEquals(" 1 0econ00", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-1L), "hZrp@>jMF}DD_vX");
      assertEquals("hZrp@>j0F}DD_vX", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "java.text.Normalizer$Form", true);
      assertEquals("java.text.Nor00alizer$For", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(60000L, true, true);
      assertEquals("1 minute", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(1L, (-1430L), "P0Y0M0DT0H0M0.001S");
      assertEquals("P0Y0-10DT07430-10.0013598569", string0);
      
      String string1 = DurationFormatUtils.formatDuration(569L, "", false);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(6L, 6L, "P0Y0M0DT0H0M0.006S");
      assertEquals("P0Y000DT00000.0060", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("H");
      boolean boolean0 = durationFormatUtils_Token0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(60000L, 1L);
      assertEquals("P-1Y11M30DT23H59M0.001S", string0);
      
      String string1 = DurationFormatUtils.formatDuration(60000L, "OMe1=4:k#9a", false);
      assertEquals("O0e1=4:k#9a", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(3600000L, 0L, "0 days 0 hours 0 minutes 0 seconds");
      assertEquals("0 30a000 0 hour 0 1380inute00 0 econ300", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(3600000L, 0L, "0 days 0 hours 0 minutes 0 seconds");
      assertEquals("0 30a000 0 hour 0 1380inute00 0 econ300", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "m", false);
      assertEquals("0", string1);
  }
}
