/*

 * Tue Mar 03 16:30:18 GMT 2020
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
      DurationFormatUtils.formatDuration((-1L), "8x7 !!N]", true);
      String string0 = DurationFormatUtils.formatDuration((-1L), "0 days");
      assertEquals("0 0a00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-1L), "8x7 !!N]", true);
      assertEquals("8x7 !!N]", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("QmVYS)G?gdH[:_");
      String string1 = DurationFormatUtils.formatPeriod((-1L), 1503L, "Minimum abbreviation width is 4", true, timeZone0);
      assertEquals("0ini00u abbreviation wi0th i1 4", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-1L), false, true);
      assertEquals("0 days", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-1L), "0 days");
      assertEquals("0 0a00", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDurationHMS(0L);
      assertEquals("0:00:00.000", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1141L), 86400000L, "A7V4yEbtBv");
      assertEquals("A7V41EbtBv", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DurationFormatUtils.formatDuration(677L, "W4e{A#/R9$\"U", true);
      String string0 = DurationFormatUtils.formatPeriod(677L, 315L, "W4e{A#/R9$\"U");
      assertEquals("W4e{A#/R9$\"U", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DurationFormatUtils.formatDuration((-1L), "8x7 !!N]", true);
      String string0 = DurationFormatUtils.formatDurationWords((-1L), false, true);
      assertEquals("0 days", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFormatUtils.formatDurationWords(60000L, true, true);
      String string0 = DurationFormatUtils.formatDuration(60000L, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFormatUtils.formatDurationWords(60000L, false, true);
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(60000L, (-1373L), "rg+B@~");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFormatUtils.formatDurationHMS(1331L);
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(60000L, (-1373L), "rg+B@~");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(60000L, true, true);
      assertEquals("1 minute", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO((-3392), 0L);
      assertEquals("P0Y0M0DT0H0M3.392S", string1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFormatUtils.formatDurationWords((-1L), true, true);
      TimeZone timeZone0 = TimeZone.getTimeZone("lKufJ/0;ARs");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(1522L, (-1L), "lKufJ/0;ARs", true, timeZone0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils.formatDuration((-1L), "8x7 !!N]", true);
      TimeZone timeZone0 = TimeZone.getTimeZone("lKufJ/0;ARs");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(1522L, (-1L), "lKufJ/0;ARs", true, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO((-3392), 0L);
      assertEquals("P0Y0M0DT0H0M3.392S", string0);
      
      String string1 = DurationFormatUtils.formatDuration(60000L, "");
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      DurationFormatUtils.formatDuration((-1L), "8x7 !!N]", true);
      String string0 = DurationFormatUtils.formatDurationWords((-1L), true, true);
      assertEquals("0 seconds", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-1L), true, false);
      assertEquals("0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-66L), "0 seconds");
      assertEquals("0 0econ00", string1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("m", (-242));
      boolean boolean0 = durationFormatUtils_Token0.equals("m");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(60000L, false, true);
      assertEquals("0 days 0 hours 1 minute", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("0 days 0 hours 1 minute");
      String string1 = DurationFormatUtils.formatPeriod(60000L, 1331L, "P0Y0M0DT0H0M0.000S", true, timeZone0);
      assertEquals("P0Y0-10DT07430-10.0003541331", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-1L), true, true);
      assertEquals("0 seconds", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("0 seconds");
      String string1 = DurationFormatUtils.formatPeriod((-1L), 1522L, "0 seconds", true, timeZone0);
      assertEquals("0 1econ01", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-1L), "8x7 !!N]", true);
      assertEquals("8x7 !!N]", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("0 seconds");
      String string1 = DurationFormatUtils.formatPeriod((-1L), 1522L, "0 seconds", true, timeZone0);
      assertEquals("0 1econ01", string1);
  }
}
