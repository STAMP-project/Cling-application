/*

 * Tue Mar 03 16:37:01 GMT 2020
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
  public void test00()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("0:00:-1.68");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-474L), (-474L), "P0Y0M0DT0H0M0.26S");
      assertEquals("P0Y000DT00000.260", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-1L), "0:00:00.000", true);
      assertEquals("0:00:00.000", string1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("M", (-3496));
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("d");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("0 seconds");
      String string0 = DurationFormatUtils.formatPeriod(0L, (-343L), "0 days 0 hours 0 minutes 0 seconds", true, timeZone0);
      assertEquals("0 364a-159 0 hour 0 1439inute59 0 econ36459", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "0 364a-159 0 hour 0 1439inute59 0 econ36459");
      assertEquals("0 364a-159 0 hour 0 1439inute59 0 econ36459", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS((-2786L));
      assertEquals("0:00:-2.14", string0);
      
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(0L, (-249L), "0:00:-2.14", true, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("z&ro(sP#G");
      String string0 = DurationFormatUtils.formatPeriod((-595L), 60000L, "z&ro(sP#G", true, timeZone0);
      assertEquals("z&ro(60P#G", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "t-Jmxq%8FB3tS|~[@>q");
      String string0 = DurationFormatUtils.formatDurationWords(0L, false, true);
      assertEquals("0 days", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DurationFormatUtils.formatDuration(60000L, "", false);
      String string0 = DurationFormatUtils.formatDurationWords(60000L, true, true);
      assertEquals("1 minute", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(361L, (-1008L), "S");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(1L, 0L);
      assertEquals("P-1Y11M30DT23H59M59.999S", string0);
      
      String string1 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(1L);
      assertEquals("0:00:00.001", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(1L, 0L);
      assertEquals("P-1Y11M30DT23H59M59.999S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO((-817L), (-2416L));
      assertEquals("P-1Y11M30DT23H59M58.401S", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-814L), " 0 hours");
      assertEquals(" 0 hour0", string1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFormatUtils.formatDurationWords(239L, true, true);
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(timeZone0).getOffset(anyLong());
      doReturn(0, 0, 0, 0, 0).when(timeZone0).getRawOffset();
      doReturn(false, false, false, false, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod((long) 298, (-582L), "\"h@H", true, timeZone0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "t-Jmxq%8FB3tS|~[@>q");
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(timeZone0).getOffset(anyLong());
      doReturn(0, 0, 0, 0, 0).when(timeZone0).getRawOffset();
      doReturn(false, false, false, false, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod((long) 298, (-582L), "\"h@H", true, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      DurationFormatUtils.formatDuration((-310L), "tM,C=py", false);
      String string0 = DurationFormatUtils.formatPeriodISO((-489), 7);
      assertEquals("P0Y0M0DT0H0M0.496S", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO((-343L));
      assertEquals("P0Y0M0DT0H0M0.57S", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("0 seconds");
      String string1 = DurationFormatUtils.formatPeriod(0L, (-343L), "0 days 0 hours 0 minutes 0 seconds", true, timeZone0);
      assertEquals("0 364a-159 0 hour 0 1439inute59 0 econ36459", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-310L), "P0Y0M0DT0H0M0.90S", true);
      assertEquals("P0Y000DT00000.90-310", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords((-310L), true, true);
      assertEquals("0 seconds", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("P0000Y000DT00000.610");
      String string0 = DurationFormatUtils.formatPeriod(0L, (-339L), "P0000Y0M0DT0H0M0.61S", true, timeZone0);
      assertEquals("P0000Y0-10DT07430-10.613599661", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-310L), true, true);
      assertEquals("0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-310L), "tM,C=py", false);
      assertEquals("t0,C=p0", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-343L), false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "0 364a-159 0 hour 0 1439inute59 0 econ36459");
      assertEquals("0 364a-159 0 hour 0 1439inute59 0 econ36459", string1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("P0Y0M0DT0H0M1.273S");
      boolean boolean0 = durationFormatUtils_Token0.equals("P0Y0M0DT0H0M1.273S");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO((-474L));
      assertEquals("P0Y0M0DT0H0M0.26S", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((-474L), (-474L), "P0Y0M0DT0H0M0.26S");
      assertEquals("P0Y000DT00000.260", string1);
  }
}
