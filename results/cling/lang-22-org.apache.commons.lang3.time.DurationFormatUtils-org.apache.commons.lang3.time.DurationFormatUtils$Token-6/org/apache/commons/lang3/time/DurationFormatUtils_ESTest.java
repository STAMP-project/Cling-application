/*

 * Tue Mar 03 16:35:53 GMT 2020
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
      String string0 = DurationFormatUtils.formatPeriod(2873L, 2873L, "r|,y5<Km");
      assertEquals("r|,05<K0", string0);
      
      String string1 = DurationFormatUtils.formatDurationHMS(1817L);
      assertEquals("0:00:01.817", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-181L), " 1 days");
      assertEquals(" 1 0a00", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFormatUtils.formatDuration((long) (-152), "");
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(timeZone0).getDSTSavings();
      doReturn(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (-1646), Integer.MAX_VALUE).when(timeZone0).getOffset(anyLong());
      doReturn(48, (-1646), 48, (-296), 2165).when(timeZone0).getRawOffset();
      doReturn(true, false, false, false, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod((-1L), 0L, "P0Y000DT00000.000-970", false, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(2873L, 2873L, "r|,y5<Km");
      assertEquals("r|,05<K0", string0);
      
      String string1 = DurationFormatUtils.formatDurationISO(2873L);
      assertEquals("P0Y0M0DT0H0M2.873S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(27L);
      assertEquals("P0Y0M0DT0H0M0.027S", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(27L, 0L);
      assertEquals("P-1Y11M30DT23H59M59.973S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO((-181L));
      assertEquals("P0Y0M0DT0H0M0.19S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((-181L), (-181L), "P0Y0M0DT0H0M0.000S");
      assertEquals("P0Y000DT00000.0000", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DurationFormatUtils.formatDuration(1604L, "}t", true);
      String string0 = DurationFormatUtils.formatPeriod((-181L), (-181L), "P0Y0M0DT0H0M0.000S");
      assertEquals("P0Y000DT00000.0000", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(60000L, false, true);
      assertEquals("0 days 0 hours 1 minute", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DurationFormatUtils.formatDuration(1604L, "}", true);
      String string0 = DurationFormatUtils.formatDurationWords(18, false, true);
      assertEquals("0 days", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(1L, 0L, "");
      assertEquals("", string0);
      
      String string1 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFormatUtils.formatPeriod(1L, 0L, "");
      String string0 = DurationFormatUtils.formatDuration(0L, "", true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(0L, (-1L));
      assertEquals("P-1Y11M30DT23H59M59.999S", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-970L), "P0Y0M0DT0H0M0.000S", false);
      assertEquals("P0Y000DT00000.000-970", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(0L, (-1L));
      assertEquals("P-1Y11M30DT23H59M59.999S", string0);
      
      String string1 = DurationFormatUtils.formatDuration((long) (-152), "");
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "$qK^", true);
      String string0 = DurationFormatUtils.formatDurationWords(4L, true, true);
      assertEquals("0 seconds", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFormatUtils.formatDurationISO((-181L));
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(7, 1153).when(timeZone0).getDSTSavings();
      doReturn(20, 4791, 20, (-2690), 1153).when(timeZone0).getOffset(anyLong());
      doReturn((-2690), 4791, 1153, (-2690), 7).when(timeZone0).getRawOffset();
      doReturn(false, true, true, false, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod((-181L), 0L, "$qK^", true, timeZone0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFormatUtils.formatDuration((-970L), "P0Y0M0DT0H0M0.000S", false);
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(timeZone0).getDSTSavings();
      doReturn(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (-1646), Integer.MAX_VALUE).when(timeZone0).getOffset(anyLong());
      doReturn(48, (-1646), 48, (-296), 2165).when(timeZone0).getRawOffset();
      doReturn(true, false, false, false, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod((-1L), 0L, "P0Y000DT00000.000-970", false, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      DurationFormatUtils.formatDuration((long) (-152), "");
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(timeZone0).getOffset(anyLong());
      doReturn(0, 0, 0, 0, 0).when(timeZone0).getRawOffset();
      doReturn(false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      String string0 = DurationFormatUtils.formatPeriod((-1L), 0L, "P0Y000DT00000.000-970", false, timeZone0);
      assertEquals("P0Y000DT00000.000-970", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, true, true);
      assertEquals("0 seconds", string0);
      
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(timeZone0).getDSTSavings();
      doReturn(63, 63, (-3594), 4, 56).when(timeZone0).getOffset(anyLong());
      doReturn(56, 4, (-3594), 416, 13).when(timeZone0).getRawOffset();
      doReturn(true).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      String string1 = DurationFormatUtils.formatPeriod((-519L), 0L, "e", true, timeZone0);
      assertEquals("e", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(1L, true, false);
      assertEquals("0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration(1L, "", true);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-181L), (-1751L), "P0Y0M0DT0H0M0.19S");
      assertEquals("P0Y0-10DT07430-10.193598430", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("y");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("0 seconds");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("m");
      boolean boolean0 = durationFormatUtils_Token0.equals("m");
      assertFalse(boolean0);
  }
}
