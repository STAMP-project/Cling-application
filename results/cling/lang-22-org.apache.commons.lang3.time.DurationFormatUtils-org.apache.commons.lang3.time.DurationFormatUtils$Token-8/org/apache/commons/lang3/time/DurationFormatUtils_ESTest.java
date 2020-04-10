/*

 * Tue Mar 03 16:32:58 GMT 2020
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
      String string0 = DurationFormatUtils.formatDurationWords((-802L), false, true);
      assertEquals("0 days", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(1690L, 1690L, "0 days");
      assertEquals("0 0a00", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-802L), "KrwY bPE4RP}70GyG(");
      assertEquals("KrwY bPE4RP}70G0G(", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-25L), "1 minute");
      assertEquals("1 0inute", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(0L, true, true);
      assertEquals("0 seconds", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string0);
      
      String string1 = DurationFormatUtils.formatDuration(3600000L, "", true);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      DurationFormatUtils.formatPeriod((-2100L), 1L, "_");
      String string0 = DurationFormatUtils.formatDuration(1L, "_");
      assertEquals("_", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO((-1119L));
      assertEquals("P0Y0M0DT0H0M-1.81S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(1887L, (-1119L), "P0Y0M0DT0H0M-1.81S");
      assertEquals("P0Y0-10DT07430-1-1.813596994", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-802L), (-802L), "Minimum abbreviation width is 4");
      assertEquals("0ini00u abbreviation wi0th i0 4", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "");
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DurationFormatUtils.formatDuration((-802L), ".W@`1");
      String string0 = DurationFormatUtils.formatDurationWords((-802L), false, true);
      assertEquals("0 days", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string0);
      
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(3600000L, (-285L), "");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFormatUtils.formatDuration(3600000L, "", true);
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(3600000L, (-285L), "");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(1690L, (-15L));
      assertEquals("P-1Y11M30DT23H59M58.295S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1690L, "{YVC69@");
      assertEquals("{YVC69@", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(1690L, (-15L));
      assertEquals("P-1Y11M30DT23H59M58.295S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DurationFormatUtils.formatDuration(3600000L, "");
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, false, false);
      assertEquals("0 days 1 hour 0 minutes 0 seconds", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils.formatDurationWords((-802L), false, true);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(109, "");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(86400000L, (-802L), "__xphNw=/ARK9~W", false, (TimeZone) simpleTimeZone0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFormatUtils.formatDuration((-802L), ".W@`1");
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(109, "");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(86400000L, (-802L), "__xphNw=/ARK9~W", false, (TimeZone) simpleTimeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(60000L, true, true);
      assertEquals("1 minute", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-25L), "1 minute");
      assertEquals("1 0inute", string1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("v?s E>k2gI:n");
      boolean boolean0 = durationFormatUtils_Token0.equals("v?0 E>k2gI:n");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-802L), false, true);
      assertEquals("0 days", string0);
      
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(10, "<.5s)7C 34|");
      String string1 = DurationFormatUtils.formatPeriod((-802L), 1986L, "<.5s)7C 34|", true, (TimeZone) simpleTimeZone0);
      assertEquals("<.52)7C 34|", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-802L), ".W@`1");
      assertEquals(".W@`1", string0);
      
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(10, "<.5s)7C 34|");
      String string1 = DurationFormatUtils.formatPeriod((-802L), 1986L, "<.5s)7C 34|", true, (TimeZone) simpleTimeZone0);
      assertEquals("<.52)7C 34|", string1);
  }
}
