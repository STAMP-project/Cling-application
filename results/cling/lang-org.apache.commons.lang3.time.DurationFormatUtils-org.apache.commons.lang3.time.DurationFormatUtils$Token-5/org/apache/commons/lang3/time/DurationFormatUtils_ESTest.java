/*

 * Tue Mar 03 16:31:10 GMT 2020
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
      String string0 = DurationFormatUtils.formatDurationHMS(0L);
      assertEquals("0:00:00.000", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(0L, 0L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      assertEquals("P0000Y0M0DT0H0M0.000S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1L, "SecurityException occurred", true);
      assertEquals("1ecurit0Exception occurre0", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(3953L, 86400000L, "y9NT|B/gEe&Qrt-aE");
      assertEquals("09NT|B/gEe&Qrt-aE", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DurationFormatUtils.formatDuration((-1563L), "bT");
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, true);
      assertEquals("0 days", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO((-1563L));
      assertEquals("P0Y0M0DT0H0M-1.37S", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("P0Y0M0DT0H0M-1.37S");
      String string1 = DurationFormatUtils.formatPeriod(0L, (-1563L), "P0Y0M0DT0H0M-1.37S", true, timeZone0);
      assertEquals("P0Y0-10DT07430-1-1.373598437", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "bT");
      assertEquals("bT", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("P0Y0M0DT0H0M-1.37S");
      String string1 = DurationFormatUtils.formatPeriod(0L, (-1563L), "P0Y0M0DT0H0M-1.37S", true, timeZone0);
      assertEquals("P0Y0-10DT07430-1-1.373598437", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO((-1563L));
      assertEquals("P0Y0M0DT0H0M-1.37S", string0);
      
      String string1 = DurationFormatUtils.formatDuration(4194L, "P0Y0M0DT0H0M-1.37S");
      assertEquals("P0Y000DT0000-1.374194", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string0);
      
      String string1 = DurationFormatUtils.formatDuration(3600000L, "1 hour", false);
      assertEquals("1 hour", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "bT");
      String string0 = DurationFormatUtils.formatDurationWords(60000L, false, true);
      assertEquals("0 days 0 hours 1 minute", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "bT");
      String string0 = DurationFormatUtils.formatDurationWords((-713L), false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFormatUtils.formatDurationISO((-1563L));
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(4194L, (-1525L), "", true, timeZone0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "bT");
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(4194L, (-1525L), "", true, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(3086L, "D=x");
      assertEquals("D=x", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("D=x");
      String string1 = DurationFormatUtils.formatPeriod((-1585L), 3086L, "D=x", true, timeZone0);
      assertEquals("D=x", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO((-1563L));
      assertEquals("P0Y0M0DT0H0M-1.37S", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("P0Y0M0DT0H0M-1.37S");
      String string1 = DurationFormatUtils.formatPeriod((-1563L), 0L, "YG?W,*]", true, timeZone0);
      assertEquals("YG?W,*]", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      DurationFormatUtils.formatDuration(211L, " vs ", false);
      String string0 = DurationFormatUtils.formatDurationWords(211L, true, true);
      assertEquals("0 seconds", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(timeZone0).getOffset(anyLong());
      doReturn(0, 0, 0, 0).when(timeZone0).getRawOffset();
      String string0 = DurationFormatUtils.formatPeriod((-1229L), (-1229L), "P0Y0M0DT0H0M0.000S", true, timeZone0);
      assertEquals("P0Y000DT00000.0000", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("bT", 9);
      boolean boolean0 = durationFormatUtils_Token0.equals("bT");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(3600000L, 0L, ".TW?%mG2`Bn2XD3(44");
      assertEquals(".TW?%44580G2`Bn2XD3(44", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(3600000L, 0L);
      assertEquals("P-1Y11M30DT23H0M0.000S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(3600000L, 0L, ".TW?%mG2`Bn2XD3(44");
      assertEquals(".TW?%44580G2`Bn2XD3(44", string0);
      
      String string1 = DurationFormatUtils.formatDuration(3600000L, "1 hour", false);
      assertEquals("1 hour", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(3600000L, 0L);
      assertEquals("P-1Y11M30DT23H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatDuration(3600000L, "1 hour", false);
      assertEquals("1 hour", string1);
  }
}
