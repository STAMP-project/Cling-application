/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 18:02:16 GMT 2019
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FixedDateTimeZone_ESTest extends FixedDateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("67x7#", "Ij0P_DR5fZd<", 411, 3);
      FixedDateTimeZone fixedDateTimeZone1 = new FixedDateTimeZone("67x7#", "Ij0P_DR5fZd<", 1049, 3);
      boolean boolean0 = fixedDateTimeZone0.equals(fixedDateTimeZone1);
      assertFalse(boolean0);
      assertFalse(fixedDateTimeZone1.equals((Object)fixedDateTimeZone0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("TGYE/d_C](\"f", "", (-14), 37);
      FixedDateTimeZone fixedDateTimeZone1 = new FixedDateTimeZone("TGYE/d_C](\"f", "Ij0P_DR5fZd<", (-14), (-2));
      boolean boolean0 = fixedDateTimeZone0.equals(fixedDateTimeZone1);
      assertFalse(boolean0);
      assertFalse(fixedDateTimeZone1.equals((Object)fixedDateTimeZone0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      FixedDateTimeZone fixedDateTimeZone1 = new FixedDateTimeZone("Bp&", "Bp&", 77, 77);
      boolean boolean0 = fixedDateTimeZone1.equals(fixedDateTimeZone0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = fixedDateTimeZone0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("67x7#", "XT6WUl:Q>(Bstu>|@", 0, 0);
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      assertEquals("java.util.SimpleTimeZone[id=67x7#,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", timeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("+37:00", "67x7#", 37, 330);
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      assertEquals("java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", timeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.previousTransition(1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      assertEquals(1, BuddhistChronology.BE);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("DurationField[", "", 3515, 0);
      boolean boolean0 = fixedDateTimeZone0.isFixed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getName((long) (-3000));
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("pG5", "pG5", (-1083), (-5174));
      int int0 = fixedDateTimeZone0.getStandardOffset((-1083));
      assertEquals((-5174), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      int int0 = fixedDateTimeZone0.getOffsetFromLocal((-43L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("Types array must be in order largest-smallest: ", "Types array must be in order largest-smallest: ", 1, (-791));
      long long0 = fixedDateTimeZone0.nextTransition((-791));
      assertEquals((-791L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("-4IH}P", "-4IH}P", (-3000), (-3000));
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      assertEquals("GMT", timeZone0.getID());
  }
}
