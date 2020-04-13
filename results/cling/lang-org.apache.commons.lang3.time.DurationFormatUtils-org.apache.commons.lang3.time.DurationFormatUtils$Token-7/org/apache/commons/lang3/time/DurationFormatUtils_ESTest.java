/*

 * Tue Mar 03 16:33:58 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.SimpleTimeZone;
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
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(" ");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      DurationFormatUtils.formatDuration((-1002L), "P0Y000DT00000.0000");
      String string0 = DurationFormatUtils.formatDurationWords(86400000L, true, true);
      assertEquals("1 day", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1840L), (-1840L), "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      assertEquals("P0000Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-1002L), "P0Y000DT00000.0000");
      assertEquals("P0Y000DT00000.0000", string1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("m");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("m", (-1880));
      boolean boolean0 = durationFormatUtils_Token1.equals(durationFormatUtils_Token0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(2011L, 2011L, "0 days 0 hours 0 minutes 2 seconds");
      assertEquals("0 0a000 0 hour 0 0inute00 2 econ00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(207L, "#]qBZ", false);
      assertEquals("#]qBZ", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(1935L, 0L);
      assertEquals("P-1Y11M30DT23H59M58.065S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.000S");
      assertEquals("P0Y000DT00000.0000", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(86400000L, true, true);
      assertEquals("1 day", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-1002L), "P0Y000DT00000.0000");
      assertEquals("P0Y000DT00000.0000", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DurationFormatUtils.formatDuration((-1002L), "P0Y000DT00000.0000");
      String string0 = DurationFormatUtils.formatPeriod(402L, 0L, "4;n0w");
      assertEquals("4;n0w", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.000S");
      assertEquals("P0Y000DT00000.0000", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(3600000L);
      assertEquals("P0Y0M0DT1H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(3600000L, 0L);
      assertEquals("P-1Y11M30DT23H0M0.000S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      String string0 = DurationFormatUtils.formatPeriod((-1840L), (-1840L), "P0Y0M0DT0H0M0.000S", true, timeZone0);
      assertEquals("P0Y000DT00000.0000", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-1002L), "P0Y000DT00000.0000");
      assertEquals("P0Y000DT00000.0000", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, true, true);
      assertEquals("0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-1002L), "P0Y000DT00000.0000");
      assertEquals("P0Y000DT00000.0000", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      DurationFormatUtils.formatDuration(1614L, " 0 0inute0");
      String string0 = DurationFormatUtils.formatDurationWords(3, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFormatUtils.formatDurationISO(0L);
      TimeZone timeZone0 = TimeZone.getTimeZone("{e\"W(Pw");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (long) (-286), "java.text.Normalizer$Form", true, timeZone0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFormatUtils.formatDuration(207L, "#]qBZ", false);
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-1), 38, (-643), (-1), 0).when(timeZone0).getOffset(anyLong());
      doReturn((-1549), 38, (-643), (-1549), 0).when(timeZone0).getRawOffset();
      doReturn(false, false, false, false, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod((-1L), (-1L), "x", false, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO((-613L));
      assertEquals("P0Y0M0DT0H0M0.87S", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("hgY^yw]Mqcu");
      String string1 = DurationFormatUtils.formatPeriod((-1759L), (long) 10, ";cSzih`Il}1Sk\"H\"'", false, timeZone0);
      assertEquals(";c1769zih`Il}1k\"0\"", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(402L, 0L, "4;n0w");
      assertEquals("4;n0w", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      DurationFormatUtils.formatDuration(1614L, " 0 0inute0");
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(4, "NuKR{)tr");
      String string0 = DurationFormatUtils.formatPeriod((-2534L), 1614L, " 0 0inute0", false, (TimeZone) simpleTimeZone0);
      assertEquals(" 0 0inute0", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(timeZone0).getOffset(anyLong());
      doReturn(0, 0, 0, 0).when(timeZone0).getRawOffset();
      String string0 = DurationFormatUtils.formatPeriod(3600000L, 2368L, "P0Y0M0DT0H0M2.757S", true, timeZone0);
      assertEquals("P0Y0-10DT07430-12.7572368", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("P-1Y11M30DT23H59M59.999S");
      boolean boolean0 = durationFormatUtils_Token0.equals("P-1Y11M30DT23H59M59.999S");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      TimeZone timeZone0 = TimeZone.getDefault();
      String string1 = DurationFormatUtils.formatPeriod((-1840L), (-1840L), "P0Y0M0DT0H0M0.000S", true, timeZone0);
      assertEquals("P0Y000DT00000.0000", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((-1840L), (-1840L), "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      assertEquals("P0000Y0M0DT0H0M0.000S", string1);
  }
}
