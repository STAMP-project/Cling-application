/*

 * Tue Mar 03 16:34:50 GMT 2020
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
      String string0 = DurationFormatUtils.formatDuration((-1459L), "mTy:w#");
      assertEquals("0T0:w#", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(749L, false, true);
      assertEquals("0 days", string0);
      
      String string1 = DurationFormatUtils.formatDuration(749L, "0 days", false);
      assertEquals("0 0a00", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(1352L);
      assertEquals("P0Y0M0DT0H0M1.352S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((-1459L), 884L, "RNE}M:P");
      assertEquals("RNE}0:P", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-6L), "90ChQ#,qWOk");
      assertEquals("90ChQ#,qWOk", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((-1459L), 884L, "RNE}M:P");
      assertEquals("RNE}0:P", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, true);
      assertEquals("0 days", string0);
      
      String string1 = DurationFormatUtils.formatDurationHMS(0L);
      assertEquals("0:00:00.000", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, ":X7tu");
      String string0 = DurationFormatUtils.formatDurationWords(60000L, false, true);
      assertEquals("0 days 0 hours 1 minute", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-23L), (-2064L), "yuX");
      assertEquals("0uX", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(3291L, true, true);
      assertEquals("3 seconds", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1878L, "]>");
      assertEquals("]>", string0);
      
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (long) (-1), "0:00:01.878");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(884L, 0L);
      assertEquals("P-1Y11M30DT23H59M59.116S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "");
      assertEquals("", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(884L, 0L);
      assertEquals("P-1Y11M30DT23H59M59.116S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      DurationFormatUtils.formatDuration(1286L, "0:00:00.228");
      String string0 = DurationFormatUtils.formatDurationWords(228L, true, true);
      assertEquals("0 seconds", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DurationFormatUtils.formatDuration((-6L), "90ChQ#,qWOk");
      String string0 = DurationFormatUtils.formatDurationWords(2652L, false, false);
      assertEquals("0 days 0 hours 0 minutes 2 seconds", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils.formatDurationISO(0L);
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(4, 4, (-3131), (-3131), 0).when(timeZone0).getOffset(anyLong());
      doReturn((-3131), 4, (-2535), 4, 0).when(timeZone0).getRawOffset();
      doReturn(false, false, false, false, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(926L, 926L, "", true, timeZone0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "U&j+,BDPE7_?m");
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1681, "");
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(884L, (long) (-2535), "ht;m u8B\u0002n>", true, (TimeZone) simpleTimeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-1102), (-1102), (-1102), 3062, 0).when(timeZone0).getOffset(anyLong());
      doReturn((-2767), 32, (-2767), 32, 0).when(timeZone0).getRawOffset();
      doReturn(false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      DurationFormatUtils.formatPeriod(228L, 1286L, "0:00:00.228", true, timeZone0);
      String string0 = DurationFormatUtils.formatDuration(1286L, "0:00:00.228");
      assertEquals("0:00:00.228", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(0L, (long) (-814), "P0Y0M0DT0H0M0.194S");
      assertEquals("P0Y0-10DT07430-10.1943599186", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("0 days 0 hours 0 minutes 2 seconds", (-1));
      boolean boolean0 = durationFormatUtils_Token0.equals("0 days 0 hours 0 minutes 0 seconds");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(228L);
      assertEquals("0:00:00.228", string0);
      
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-1102), (-1102), (-1102), 3062, 0).when(timeZone0).getOffset(anyLong());
      doReturn((-2767), 32, (-2767), 32, 0).when(timeZone0).getRawOffset();
      doReturn(false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      String string1 = DurationFormatUtils.formatPeriod(228L, 1286L, "0:00:00.228", true, timeZone0);
      assertEquals("0:00:00.228", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-1102), (-1102), (-1102), 3062, 0).when(timeZone0).getOffset(anyLong());
      doReturn((-2767), 32, (-2767), 32, 0).when(timeZone0).getRawOffset();
      doReturn(false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      DurationFormatUtils.formatPeriod(228L, 1286L, "0:00:00.228", true, timeZone0);
      String string0 = DurationFormatUtils.formatDurationWords(228L, true, true);
      assertEquals("0 seconds", string0);
  }
}
