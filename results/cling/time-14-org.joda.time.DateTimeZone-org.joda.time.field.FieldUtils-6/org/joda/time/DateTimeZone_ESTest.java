/*

 * Tue Mar 03 18:00:52 GMT 2020
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
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      String string0 = dateTimeZone0.getName((long) 1);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      Locale locale0 = new Locale("UTC");
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours((-518));
      String string0 = dateTimeZone1.getName((long) (-518));
      assertEquals("-518:00", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertNotNull(dateTimeZone0);
      
      Locale locale0 = Locale.FRENCH;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      String string0 = dateTimeZone0.getShortName((long) 1);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertNotNull(dateTimeZone0);
      
      String string0 = dateTimeZone0.getShortName((long) 157);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }
}
