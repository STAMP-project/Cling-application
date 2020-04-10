/*

 * Tue Mar 03 18:00:55 GMT 2020
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(545);
      DateTimeZone.forID("UTC");
      String string0 = dateTimeZone0.getName((long) 545);
      assertEquals("+545:00", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(77);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      String string0 = dateTimeZone0.UTC.getName((long) 77, locale0);
      assertEquals("+00:00", string0);
      assertEquals("+77:00", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertNotSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(575);
      dateTimeZone0.getName((long) 575);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(575);
      Locale locale0 = Locale.JAPAN;
      dateTimeZone0.UTC.getName((long) 575, locale0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      String string0 = dateTimeZone0.UTC.getShortName((long) 545);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(595);
      dateTimeZone0.UTC.getShortName((long) 595);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }
}
