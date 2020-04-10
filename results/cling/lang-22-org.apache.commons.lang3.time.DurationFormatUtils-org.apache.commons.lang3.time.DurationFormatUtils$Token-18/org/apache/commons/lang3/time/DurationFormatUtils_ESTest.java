/*

 * Tue Mar 03 16:40:29 GMT 2020
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
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(durationFormatUtils0, (-3932));
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      String string0 = DurationFormatUtils.formatPeriod(0L, 0L, "H4NnjY1ajJ_Gyc0L", true, timeZone0);
      assertEquals("04NnjY1ajJ_G0c0L", string0);
      
      String string1 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "0:00:00.000");
      String string0 = DurationFormatUtils.formatPeriod(0L, 654L, "0:00:00.000");
      assertEquals("0:00:00.000", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-371L), true, true);
      assertEquals("0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-371L), "", true);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("[-=wtWpb#O=.Yv'");
      String string0 = DurationFormatUtils.formatPeriod((-2654L), (long) 25, "[-=wtWpb#O=.Yv'", false, timeZone0);
      assertEquals("[-=wtWpb#O=.Yv", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      String string0 = DurationFormatUtils.formatPeriod(0L, (-2793L), "P0Y0M0DT0H0M0.000S", true, timeZone0);
      assertEquals("P0Y0-10DT07430-10.0003597207", string0);
      
      String string1 = DurationFormatUtils.formatDurationISO((-2793L));
      assertEquals("P0Y0M0DT0H0M-2.07S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "(%$fM", true);
      assertEquals("(%$f0", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2700), "");
      String string0 = DurationFormatUtils.formatPeriod((-515L), (long) (-2700), "#zcdz74ns", false, (TimeZone) simpleTimeZone0);
      assertEquals("#zc30z74n86397", string0);
      
      String string1 = DurationFormatUtils.formatDurationISO((-2700));
      assertEquals("P0Y0M0DT0H0M-2.00S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "java.text.Normalizer$Form");
      assertEquals("java.text.Nor00alizer$For", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(144L, 0L, "SecurityException occurred");
      assertEquals("86399856ecurit0Exception occurre30", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(timeZone0).getOffset(anyLong());
      doReturn(0, 0, 0, 0).when(timeZone0).getRawOffset();
      String string0 = DurationFormatUtils.formatPeriod(3600000L, 0L, "P0Y0M0DT0H0M1.937S", false, timeZone0);
      assertEquals("P0Y0-10DT07430-11.9370", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "P0Y0-10DT07430-11.9370");
      assertEquals("P0Y0-10DT07430-11.9370", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, true);
      assertEquals("0 days", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "jgo9");
      assertEquals("jgo9", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "jgo9");
      assertEquals("jgo9", string1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFormatUtils.formatDurationISO(0L);
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-3061), 13, (-3061), 1809).when(timeZone0).getDSTSavings();
      doReturn(12, 12, 13, (-3061), (-3061)).when(timeZone0).getOffset(anyLong());
      doReturn(12, (-72), 1809, (-3061), (-3061)).when(timeZone0).getRawOffset();
      doReturn(true, true, true, true, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(1L, 551L, "org.apache.commons.lang3.time.DurationFormatUtils", false, timeZone0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils.formatDuration(1L, "go93@SOLf2g(");
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-3061), 13, (-3061), 1809).when(timeZone0).getDSTSavings();
      doReturn(12, 12, 13, (-3061), (-3061)).when(timeZone0).getOffset(anyLong());
      doReturn(12, (-72), 1809, (-3061), (-3061)).when(timeZone0).getRawOffset();
      doReturn(true, true, true, true, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(1L, 551L, "org.apache.commons.lang3.time.DurationFormatUtils", false, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-371L), "");
      assertEquals("", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO((-371L), 0L);
      assertEquals("P0Y0M0DT0H0M0.371S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      String string0 = DurationFormatUtils.formatPeriod(0L, (-3738L), "_P6 FyyK%;!JX.g", false, timeZone0);
      assertEquals("_P6 F-1K%;!JX.g", string0);
      
      String string1 = DurationFormatUtils.formatDurationISO(1702L);
      assertEquals("P0Y0M0DT0H0M1.702S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      String string0 = DurationFormatUtils.formatPeriod(0L, (-3738L), "_P6 FyyK%;!JX.g", false, timeZone0);
      assertEquals("_P6 F-1K%;!JX.g", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "", false);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(525L, 3600000L, "The stripAccents(CharSequence) method requires at least Java 1.6 or a Sun JVM");
      assertEquals("The 59tripAccent(Char475equence) 59etho0 require59 at leat Java 1.6 or a 475un JV0", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("P0Y0M0DT0H0M0.000S");
      boolean boolean0 = durationFormatUtils_Token0.equals("P0Y0M0DT0H0M0.000S");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO((-371L), 0L);
      assertEquals("P0Y0M0DT0H0M0.371S", string0);
      
      String string1 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(timeZone0).getDSTSavings();
      doReturn(2481, 2481, 2481, (-450), (-450)).when(timeZone0).getOffset(anyLong());
      doReturn(1, 2481, (-450), 1376, Integer.MAX_VALUE).when(timeZone0).getRawOffset();
      doReturn(false, true, false, true, true).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(2129L, (-791L), "b}2[br4", false, timeZone0);
  }
}
