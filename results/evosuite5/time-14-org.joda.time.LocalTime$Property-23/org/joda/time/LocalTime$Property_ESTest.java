/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 22:55:14 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime$Property_ESTest extends LocalTime$Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      // Undeclared exception!
      try { 
        localTime_Property0.addNoWrapToCopy((-314));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The addition exceeded the boundaries of LocalTime
         //
         verifyException("org.joda.time.LocalTime$Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.addNoWrapToCopy((-314));
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(395L);
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.addWrapFieldToCopy(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.getLocalTime();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.addCopy(0L);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.roundHalfCeilingCopy();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((-14L));
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.roundHalfEvenCopy();
      assertNotSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.roundCeilingCopy();
      assertNotSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.roundHalfFloorCopy();
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(395L);
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.addCopy(Integer.MAX_VALUE);
      assertNotSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      // Undeclared exception!
      try { 
        localTime_Property0.setCopy("America/Puerto_Rico");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"America/Puerto_Rico\" for millisOfDay is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(395L);
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.withMinimumValue();
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(395L);
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      Chronology chronology0 = localTime_Property0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.withMaximumValue();
      assertNotSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.roundFloorCopy();
      assertSame(localTime0, localTime1);
  }
}
