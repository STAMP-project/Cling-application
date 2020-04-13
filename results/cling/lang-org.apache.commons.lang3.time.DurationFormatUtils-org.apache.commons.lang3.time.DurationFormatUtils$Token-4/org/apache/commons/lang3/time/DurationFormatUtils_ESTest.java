/*

 * Tue Mar 03 16:30:37 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
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
      String string0 = DurationFormatUtils.formatDuration(0L, ":yHeJWH?+i5qjt*@S");
      assertEquals(":000eJW?+i5qjt*@0", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, false, true);
      assertEquals("0 days 1 hour", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "");
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, true);
      assertEquals("0 days", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "0 days");
      assertEquals("0 0a00", string1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFormatUtils.formatDurationWords(1L, false, false);
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-1591L), "`04@2T)2wH]", true, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "");
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(4L, 4L, ":yHeJWH?+i5qjt*@S");
      assertEquals(":000eJW?+i5qjt*@0", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS((-242L));
      assertEquals("0:00:00.58", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DurationFormatUtils.formatDuration(2447L, "1ti", false);
      String string0 = DurationFormatUtils.formatDurationWords(86400000L, false, true);
      assertEquals("1 day", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DurationFormatUtils.formatDuration(2447L, "1ti", false);
      String string0 = DurationFormatUtils.formatDurationWords(60000L, false, true);
      assertEquals("0 days 0 hours 1 minute", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-1338L), "Fa2z;ag4L,dcnm6");
      assertEquals("Fa2z;ag4L,0cn06", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(4L, 0L, ":i(eWev3]{");
      assertEquals(":i(eWev3]{", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(4L, 0L, ":i(eWev3]{");
      assertEquals(":i(eWev3]{", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "");
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFormatUtils.formatDuration(1L, " 1 days", false);
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-1591L), "`04@2T)2wH]", true, timeZone0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFormatUtils.formatDuration(1L, "BVR}3[ojEJx;T0) %");
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-1591L), "`04@2T)2wH]", true, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(2447L);
      assertEquals("P0Y0M0DT0H0M2.447S", string0);
      
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-2673), (-2673), (-2673), (-2673), 0).when(timeZone0).getOffset(anyLong());
      doReturn(72, 72, 72, 72, 0).when(timeZone0).getRawOffset();
      doReturn(false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      String string1 = DurationFormatUtils.formatPeriod(1292L, 60000L, "1ti", false, timeZone0);
      assertEquals("1ti", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(2447L, "1ti", false);
      assertEquals("1ti", string0);
      
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-2673), (-2673), (-2673), (-2673), 0).when(timeZone0).getOffset(anyLong());
      doReturn(72, 72, 72, 72, 0).when(timeZone0).getRawOffset();
      doReturn(false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      String string1 = DurationFormatUtils.formatPeriod(1292L, 60000L, "1ti", false, timeZone0);
      assertEquals("1ti", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-1L), true, true);
      assertEquals("0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-1L), "", false);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(2447L, 2447L, "P0Y0M0DT0H0M2.447S");
      assertEquals("P0Y000DT00002.4470", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(4L, 0L, ":i(eWev3]{");
      assertEquals(":i(eWev3]{", string1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("H");
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "0:00:00.97");
      boolean boolean0 = durationFormatUtils_Token0.equals(stringBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(2447L);
      assertEquals("P0Y0M0DT0H0M2.447S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(60000L, 2447L, "P0Y0M0DT0H0M2.447S");
      assertEquals("P0Y0-10DT07430-12.4473542447", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(2447L);
      assertEquals("P0Y0M0DT0H0M2.447S", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(86400000L, 1768L);
      assertEquals("P-1Y11M30DT0H0M1.768S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(2447L, "1ti", false);
      assertEquals("1ti", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(86400000L, 1768L);
      assertEquals("P-1Y11M30DT0H0M1.768S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(60000L, 2447L, "P0Y0M0DT0H0M2.447S");
      assertEquals("P0Y0-10DT07430-12.4473542447", string0);
      
      String string1 = DurationFormatUtils.formatDuration(2447L, "1ti", false);
      assertEquals("1ti", string1);
  }
}
