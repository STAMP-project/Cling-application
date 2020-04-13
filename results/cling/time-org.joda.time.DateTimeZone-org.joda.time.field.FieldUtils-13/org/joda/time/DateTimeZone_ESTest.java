/*

 * Tue Mar 03 18:01:09 GMT 2020
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(25, 25);
      DateTimeZone.forID("UTC");
      Locale locale0 = Locale.KOREA;
      String string0 = dateTimeZone0.getName((long) 25, locale0);
      assertEquals("+25:25", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      Locale locale0 = Locale.JAPANESE;
      String string0 = dateTimeZone0.getName((long) 0, locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertNotNull(dateTimeZone0);
      
      String string0 = dateTimeZone0.getName((long) 37);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(17, 17);
      Locale locale0 = Locale.US;
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertNotNull(dateTimeZone1);
      
      String string0 = dateTimeZone0.getName((long) 17, locale0);
      assertEquals("+17:17", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      DateTimeZone.forID("UTC");
      String string0 = dateTimeZone0.getShortName((long) 0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertNotNull(dateTimeZone0);
      
      String string0 = dateTimeZone0.UTC.getShortName(3945600000L);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }
}
