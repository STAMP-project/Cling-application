/*

 * Tue Mar 03 16:30:03 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
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
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0, 110);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-1667L), "0 days 0 hours 0 minutes -1 seconds", false);
      assertEquals("0 0a0-1 0 hour 0 0inute-1 -1 econ0-1", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords((-1L), false, true);
      assertEquals("0 days", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      String string0 = DurationFormatUtils.formatPeriod(0L, (-1L), "p{InCombiningDiacriticalMarks}+", false, timeZone0);
      assertEquals("p{InCo44639biningDiacritical-1ark59}+", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-44L), "p{InCo44639biningDiacritical-1ark59}+");
      assertEquals("p{InCo44639biningDiacritical-1ark59}+", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-3132L), true, true);
      assertEquals("-3 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-3132L), "<,yt}jh6Q8_kd{O%,s");
      assertEquals("<,0t}jh6Q8_k0{O%,-3", string1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DurationFormatUtils.formatDuration(3600000L, " 1 minutes");
      TimeZone timeZone0 = TimeZone.getTimeZone("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(3600000L, (long) (-1041), " 1 minutes", false, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS((-2251L));
      assertEquals("0:00:-2.49", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(0L, false, true);
      assertEquals("0 days", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DurationFormatUtils.formatDuration((-2995L), "0:00:-2.05", true);
      String string0 = DurationFormatUtils.formatPeriod(732L, (-2995L), "Dy' ^ARF`Ce");
      assertEquals("D0 ^ARF`Ce", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO((-23L));
      assertEquals("P0Y0M0DT0H0M0.77S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((-23L), (-1980L), "P0Y0M0DT0H0M0.77S");
      assertEquals("P0Y0-10DT07430-10.773598043", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "");
      assertEquals("", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(0L, (-1L));
      assertEquals("P-1Y11M30DT23H59M59.999S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, false, true);
      assertEquals("0 days 1 hour", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "j1|Ym,e\"QT;5uM");
      assertEquals("j1|Y0,e\"QT;5u0", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, true, false);
      assertEquals("1 hour 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "j1|Ym,e\"QT;5uM");
      assertEquals("j1|Y0,e\"QT;5u0", string1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFormatUtils.formatDurationHMS((-1022));
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(32, "0:00:-1.78");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-858L), " is less than 0: ", true, (TimeZone) simpleTimeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-425L), "decompose");
      assertEquals("0eco0po0e", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("Jqu (0]4");
      String string1 = DurationFormatUtils.formatPeriod((-425L), 0L, "0eco0po0e", false, timeZone0);
      assertEquals("0eco0po0e", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(52L);
      assertEquals("P0Y0M0DT0H0M0.052S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(52L, 0L, "H");
      assertEquals("743", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS((-2453L));
      assertEquals("0:00:-2.47", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("0:00:-2.47");
      String string1 = DurationFormatUtils.formatPeriod((-2453L), 952L, "0:00:-2.47", true, timeZone0);
      assertEquals("0:00:-2.47", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS((-1022));
      assertEquals("0:00:-1.78", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords((-1022), true, true);
      assertEquals("-1 seconds", string1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFormatUtils.formatDurationWords((-1022), true, true);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(32, "0:00:-1.78");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-858L), " is less than 0: ", true, (TimeZone) simpleTimeZone0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("0 days 0 hours 0 minutes -1 seconds");
      boolean boolean0 = durationFormatUtils_Token0.equals("0 0a0-1 0 hour 0 0inute-1 -1 econ0-1");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(52L);
      assertEquals("P0Y0M0DT0H0M0.052S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(52L, 52L, "P0Y0M0DT0H0M0.052S");
      assertEquals("P0Y000DT00000.0520", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(0L, 0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(0L, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string1);
  }
}
