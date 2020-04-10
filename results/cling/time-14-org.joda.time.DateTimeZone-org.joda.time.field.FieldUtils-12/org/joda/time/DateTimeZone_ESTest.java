/*

 * Tue Mar 03 18:01:02 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-314));
      String string0 = dateTimeZone0.getName((long) (-314), locale0);
      assertEquals("-314:00", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-1));
      dateTimeZone0.getName((long) (-1));
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(79);
      DateTimeZone.forID("UTC");
      String string0 = dateTimeZone0.getShortName((long) 79);
      assertEquals("+79:00", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertNotNull(dateTimeZone0);
      
      Locale locale0 = Locale.KOREAN;
      String string0 = dateTimeZone0.getName(3600000L, locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      String string0 = dateTimeZone0.getName((long) (-314), locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      String string0 = dateTimeZone0.getShortName((-1130400000L), locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertNotNull(dateTimeZone0);
      
      String string0 = dateTimeZone0.getShortName((long) (-1));
      assertEquals("+01:00", string0);
  }
}
