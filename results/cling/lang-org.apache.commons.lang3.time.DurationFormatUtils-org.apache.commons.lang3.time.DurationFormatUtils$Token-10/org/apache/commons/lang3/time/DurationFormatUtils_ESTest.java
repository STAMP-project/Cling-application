/*

 * Tue Mar 03 16:33:13 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.SimpleTimeZone;
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
      String string0 = DurationFormatUtils.formatDuration(2521L, "r@,z$v\"9((y(2R!r><", true);
      assertEquals("r@,z$v\"9((0(2R!r><", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("y", (-423));
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(3399L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      assertEquals("P0000Y0M0DT0H0M3.399S", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1387L), (-1387L), "G3ym3");
      assertEquals("G3003", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      DurationFormatUtils.formatDuration(1000L, "\"Eh+?-WE[", true);
      String string0 = DurationFormatUtils.formatDurationWords(1000L, true, true);
      assertEquals("1 second", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      DurationFormatUtils.formatDuration((-3315L), "qBn])F4h6", true);
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, true);
      assertEquals("0 days", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "");
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((long) 83, 0L, "P0Y0M0DT0H0M0.000S");
      assertEquals("P0Y0-10DT07430-10.0003599917", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO((-286L), 0L);
      assertEquals("P0Y0M0DT0H0M0.286S", string0);
      
      String string1 = DurationFormatUtils.formatDuration(1L, "0:00:00.000");
      assertEquals("0:00:00.000", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      DurationFormatUtils.formatDuration(413L, "");
      String string0 = DurationFormatUtils.formatDurationWords(413L, true, false);
      assertEquals("0 seconds", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFormatUtils.formatDurationISO(1L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(13, "P0Y0M0DT0H0M0.001S");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(1L, (-940L), "0:00:00.001", false, (TimeZone) simpleTimeZone0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFormatUtils.formatDuration((-1465L), "&R%K:", true);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(13, " 0 minutes");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(1000L, (-1465L), "&R%K:", true, (TimeZone) simpleTimeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1888), "fRPVYi_gB3X.|.pX");
      DurationFormatUtils.formatPeriod((long) (-1888), 3973L, "fRPVYi_gB3X.|.pX", true, (TimeZone) simpleTimeZone0);
      String string0 = DurationFormatUtils.formatDuration(3973L, " 1 days");
      assertEquals(" 1 0a03", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(0L);
      assertEquals("0:00:00.000", string0);
      
      TimeZone timeZone0 = TimeZone.getDefault();
      String string1 = DurationFormatUtils.formatPeriod((-2342L), 1L, "0:00:00.000", false, timeZone0);
      assertEquals("0:00:00.000", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      DurationFormatUtils.formatDuration(60000L, "");
      String string0 = DurationFormatUtils.formatDurationWords(60000L, true, true);
      assertEquals("1 minute", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-3135L), (-3135L), "P0Y0M0DT0H0M-3.65S");
      assertEquals("P0Y000DT0000-3.650", string0);
      
      String string1 = DurationFormatUtils.formatDuration(1L, "=<doS0?JtP|jL", false);
      assertEquals("=<0o10?JtP|jL", string1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("23:59:59.993");
      boolean boolean0 = durationFormatUtils_Token0.equals("23:59:59.993");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(3600000L, 0L, "");
      assertEquals("", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(60000L, 60000L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(60000L, true, true);
      assertEquals("1 minute", string1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "");
      String string1 = DurationFormatUtils.formatPeriod(3600000L, 0L, "");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((long) 83, 0L, "P0Y0M0DT0H0M0.000S");
      assertEquals("P0Y0-10DT07430-10.0003599917", string0);
      
      String string1 = DurationFormatUtils.formatDurationHMS(0L);
      assertEquals("0:00:00.000", string1);
  }
}
