/*

 * Tue Mar 03 16:38:19 GMT 2020
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
  @Ignore
  public void test00()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(2671L, "IllegalArgumentException occurred");
      assertEquals("IllegalArgu0entException occurre0", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(3600000L, false, true);
      assertEquals("0 days 1 hour", string1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "", false);
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(timeZone0).getOffset(anyLong());
      doReturn(0, 0, 0, 0, 0).when(timeZone0).getRawOffset();
      doReturn(false, false, false, false, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-3107L), "", false, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(2671L);
      assertEquals("0:00:02.671", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(3600000L, false, true);
      assertEquals("0 days 1 hour", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DurationFormatUtils.formatDuration(2671L, "IllegalArgumentException occurred");
      String string0 = DurationFormatUtils.formatDurationWords((-916L), true, true);
      assertEquals("0 seconds", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-4703L), 0L, "dBxj~W");
      assertEquals("0Bxj~W", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(2671L);
      assertEquals("0:00:02.671", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords((-1L), false, true);
      assertEquals("0 days", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(2671L, "IllegalArgumentException occurred");
      assertEquals("IllegalArgu0entException occurre0", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords((-1L), false, true);
      assertEquals("0 days", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration(1L, "V1|3}rMnkg^R");
      assertEquals("V1|3}r0nkg^R", string1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFormatUtils.formatDurationISO(2689L);
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(2689L, (-1665L), "");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFormatUtils.formatDuration(35L, "P0Y0M0DT0H0M2.689S");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(2689L, (-1665L), "");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(2671L, "IllegalArgumentException occurred");
      assertEquals("IllegalArgu0entException occurre0", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((-1L), (-916L), "0;Q<&#?VK");
      assertEquals("0;Q<&#?VK", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(1L, (-1758L), "0 days 0 hours 0 minutes 0 seconds");
      assertEquals("0 364a-158 0 hour 0 1439inute58 0 econ36458", string0);
      
      String string1 = DurationFormatUtils.formatDuration(1L, "V1|3}rMnkg^R");
      assertEquals("V1|3}r0nkg^R", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(2671L);
      assertEquals("0:00:02.671", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((-1L), (-916L), "0;Q<&#?VK");
      assertEquals("0;Q<&#?VK", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(2671L);
      assertEquals("0:00:02.671", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords((-916L), true, true);
      assertEquals("0 seconds", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("P0Y0M0DT0H0M1.194S");
      String string0 = DurationFormatUtils.formatPeriod(1194L, 0L, "P0Y0M0DT0H0M1.194S", true, timeZone0);
      assertEquals("P0Y0-10DT07430-11.1943598806", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("H");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("s");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(1L, (-1758L), "0 days 0 hours 0 minutes 0 seconds");
      assertEquals("0 364a-158 0 hour 0 1439inute58 0 econ36458", string1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("P0Y0M0DT0H0M0.004S");
      StringBuffer stringBuffer0 = new StringBuffer();
      boolean boolean0 = durationFormatUtils_Token0.equals(stringBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(852, "0:00:02.671");
      String string0 = DurationFormatUtils.formatPeriod(0L, 2671L, "P-1Y11M30DT23H59M57.329S", true, (TimeZone) simpleTimeZone0);
      assertEquals("P-1Y11030DT23059057.3292671", string0);
      
      String string1 = DurationFormatUtils.formatDuration(2671L, "IllegalArgumentException occurred");
      assertEquals("IllegalArgu0entException occurre0", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(2671L, 0L);
      assertEquals("P-1Y11M30DT23H59M57.329S", string0);
      
      String string1 = DurationFormatUtils.formatDuration(2671L, "IllegalArgumentException occurred");
      assertEquals("IllegalArgu0entException occurre0", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(2671L);
      assertEquals("0:00:02.671", string0);
      
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(852, "0:00:02.671");
      String string1 = DurationFormatUtils.formatPeriod(0L, 2671L, "P-1Y11M30DT23H59M57.329S", true, (TimeZone) simpleTimeZone0);
      assertEquals("P-1Y11030DT23059057.3292671", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(2671L);
      assertEquals("0:00:02.671", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(2671L, 0L);
      assertEquals("P-1Y11M30DT23H59M57.329S", string1);
  }
}
