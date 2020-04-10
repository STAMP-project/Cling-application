/*

 * Tue Mar 03 16:35:52 GMT 2020
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
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string0);
      
      String string1 = DurationFormatUtils.formatDuration((long) 681, "z/jZ1Q#?Q\"EyV~z<%", true);
      assertEquals("z/jZ1Q#?Q\"E0V~z<%", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      DurationFormatUtils.formatDuration((-3176L), "0:00:-3.24");
      String string0 = DurationFormatUtils.formatPeriod((-3176L), (-1001L), "<5g}A ln3O1$ZWyJ~(");
      assertEquals("<5g}A ln3O1$ZW0J~(", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1L), 1208L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      assertEquals("P0000Y0M0DT0H0M1.209S", string0);
      
      String string1 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-3176L), "0:00:-3.24");
      assertEquals("0:00:-3.24", string0);
      
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(1783L, (-1688L), "0:00:-3.24");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1977L, "pRo83s\"sq", true);
      assertEquals("pRo8301\"q", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(0L, false, true);
      assertEquals("0 days", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-309L), "B+pAx$d<:i~@RPH{ms7");
      assertEquals("B+pAx$0<:i~@RP0{007", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(3562L, 1L, "B+pAx$0<:i~@RP0{007");
      assertEquals("B+pAx$0<:i~@RP0{007", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "'GJ$?R%E>%");
      String string0 = DurationFormatUtils.formatDurationWords((-51L), false, false);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DurationFormatUtils.formatDurationWords(1977L, true, true);
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(timeZone0).getDSTSavings();
      doReturn((-1739), (-1739), (-1739), (-1), Integer.MAX_VALUE).when(timeZone0).getOffset(anyLong());
      doReturn(3216, 28, Integer.MAX_VALUE, (-1173), 28).when(timeZone0).getRawOffset();
      doReturn(true, false, true, false, true).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(3997L, (-1884L), "pRo83s\"sq", true, timeZone0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFormatUtils.formatDuration(1977L, "pRo83s\"sq", true);
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(timeZone0).getDSTSavings();
      doReturn((-1739), (-1739), (-1739), (-1), Integer.MAX_VALUE).when(timeZone0).getOffset(anyLong());
      doReturn(3216, 28, Integer.MAX_VALUE, (-1173), 28).when(timeZone0).getRawOffset();
      doReturn(true, false, true, false, true).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(3997L, (-1884L), "pRo83s\"sq", true, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(1977L, true, true);
      assertEquals("1 second", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      String string1 = DurationFormatUtils.formatPeriod((-2989L), 2143L, ";B", true, timeZone0);
      assertEquals(";B", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1977L, "pRo83s\"sq", true);
      assertEquals("pRo8301\"q", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      String string1 = DurationFormatUtils.formatPeriod((-2989L), 2143L, ";B", true, timeZone0);
      assertEquals(";B", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-142L), true, true);
      assertEquals("0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "NFD");
      assertEquals("NFD", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-5046L), (-5046L), "P0Y0M0DT0H0M-5.54S");
      assertEquals("P0Y000DT0000-5.540", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("");
      boolean boolean0 = durationFormatUtils_Token0.equals("pRo8301\"q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-142L), true, true);
      assertEquals("0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((-201L), (-5046L), "P0Y0M0DT0H0M-5.54S");
      assertEquals("P0Y0-10DT07430-1-5.543595155", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "NFD");
      assertEquals("NFD", string0);
      
      String string1 = DurationFormatUtils.formatPeriod((-201L), (-5046L), "P0Y0M0DT0H0M-5.54S");
      assertEquals("P0Y0-10DT07430-1-5.543595155", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1977L, "pRo83s\"sq", true);
      assertEquals("pRo8301\"q", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(0L, (-149L));
      assertEquals("P-1Y11M30DT23H59M59.851S", string1);
  }
}
