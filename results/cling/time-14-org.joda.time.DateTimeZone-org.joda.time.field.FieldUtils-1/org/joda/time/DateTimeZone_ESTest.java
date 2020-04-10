/*

 * Tue Mar 03 18:00:45 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.NameProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      dateTimeZone0.getName((long) 4);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(281);
      String string0 = dateTimeZone0.getName((long) 281);
      assertEquals("+00:00:00.281", string0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertNotSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      Locale locale0 = Locale.JAPANESE;
      String string0 = dateTimeZone0.getName((-2676L), locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-5));
      Locale locale0 = Locale.GERMANY;
      String string0 = dateTimeZone0.getName((long) (-5), locale0);
      assertEquals("-05:00", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getShortName(2276L);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertTrue(dateTimeZone1.isFixed());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      String string0 = dateTimeZone0.getName((long) 46, locale0);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(nameProvider0).getShortName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getShortName((long) 4);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(nameProvider0).getShortName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getShortName(2276L);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertTrue(dateTimeZone1.isFixed());
  }
}
