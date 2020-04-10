/*

 * Tue Mar 03 16:35:29 GMT 2020
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
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("", (-2302));
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(1346L);
      assertEquals("0:00:01.346", string0);
      
      String string1 = DurationFormatUtils.formatDuration(1346L, "C,Wo5cyV");
      assertEquals("C,Wo5c0V", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1679L, "Search and Replace array lengths don't match: ", true);
      assertEquals("679earch an0 Replace arra0 length1 0ont match: ", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(0L, 0L, "SecurityException occurred");
      assertEquals("0ecurit0Exception occurre0", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "org.apache.commons.lang3.time.DurationFormatUtils");
      assertEquals("org.apache.co00on0.lang3.ti00e.DurationForatUtil0", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(889L, false, true);
      assertEquals("0 days", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(4678L, "0:00:04.678", true);
      assertEquals("0:00:04.678", string0);
      
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(4678L, (-149L), "sun.text.Normalizer is not available", true, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS((-2517L));
      assertEquals("0:00:-2.83", string0);
      
      String string1 = DurationFormatUtils.formatPeriod(1496L, (-1246L), "M14Bh')");
      assertEquals("-114Bh)", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "`5tg:'!~pOomqo", true);
      String string0 = DurationFormatUtils.formatDurationWords(60000L, false, true);
      assertEquals("0 days 0 hours 1 minute", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DurationFormatUtils.formatPeriod(19L, 0L, "");
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(4678L);
      assertEquals("0:00:04.678", string0);
      
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(4678L, (-149L), "sun.text.Normalizer is not available", true, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "org.apache.commons.lang3.time.DurationFormatUtils");
      assertEquals("org.apache.co00on0.lang3.ti00e.DurationForatUtil0", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(2974L, false, false);
      assertEquals("0 days 0 hours 0 minutes 2 seconds", string1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFormatUtils.formatDurationISO(0L);
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-3825)).when(timeZone0).getDSTSavings();
      doReturn(48, 48, 48, 48, 48).when(timeZone0).getOffset(anyLong());
      doReturn(3186, 6, 6, 6, 3186).when(timeZone0).getRawOffset();
      doReturn(false, false, false, true, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod((-18L), (-1966L), "", true, timeZone0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "", true);
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-3825)).when(timeZone0).getDSTSavings();
      doReturn(48, 48, 48, 48, 48).when(timeZone0).getOffset(anyLong());
      doReturn(3186, 6, 6, 6, 3186).when(timeZone0).getRawOffset();
      doReturn(false, false, false, true, false).when(timeZone0).inDaylightTime(any(java.util.Date.class));
      // Undeclared exception!
      DurationFormatUtils.formatPeriod((-18L), (-1966L), "", true, timeZone0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      String string1 = DurationFormatUtils.formatPeriod((long) (-3825), 1342L, "+UO,%a", true, timeZone0);
      assertEquals("+UO,%a", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "", true);
      assertEquals("", string0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      String string1 = DurationFormatUtils.formatPeriod((long) (-3825), 1342L, "+UO,%a", true, timeZone0);
      assertEquals("+UO,%a", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, true, true);
      assertEquals("0 seconds", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "", true);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(1496L, (-1246L), "M14Bh')");
      assertEquals("-114Bh)", string0);
      
      String string1 = DurationFormatUtils.formatDurationWords(0L, true, true);
      assertEquals("0 seconds", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1425L), (-1425L), "AWXM4E");
      assertEquals("AWX04E", string0);
      
      String string1 = DurationFormatUtils.formatDuration((-1425L), "AWXM4E");
      assertEquals("AWX04E", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(3600000L, true, true);
      assertEquals("1 hour", string0);
      
      String string1 = DurationFormatUtils.formatDuration(0L, "", true);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("", (-2302));
      boolean boolean0 = durationFormatUtils_Token0.equals("M");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
      
      String string1 = DurationFormatUtils.formatPeriodISO(48, 31L);
      assertEquals("P-1Y11M30DT23H59M59.983S", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      DurationFormatUtils.formatDuration(0L, "", true);
      String string0 = DurationFormatUtils.formatPeriodISO(48, 31L);
      assertEquals("P-1Y11M30DT23H59M59.983S", string0);
  }
}
