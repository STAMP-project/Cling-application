/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 02:07:47 GMT 2019
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FixedDateTimeZone_ESTest extends FixedDateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("GMT", "-0:`m00", 1217, 1217);
      FixedDateTimeZone fixedDateTimeZone1 = new FixedDateTimeZone("GMT", "GMT", (-1987704968), 1217);
      boolean boolean0 = fixedDateTimeZone0.equals(fixedDateTimeZone1);
      assertFalse(boolean0);
      assertFalse(fixedDateTimeZone1.equals((Object)fixedDateTimeZone0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      FixedDateTimeZone fixedDateTimeZone1 = new FixedDateTimeZone("wb[XjW.\"2yN=", "wb[XjW.\"2yN=", 526, 3772);
      boolean boolean0 = fixedDateTimeZone0.equals(fixedDateTimeZone1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("GMT", "-0:`m00", 1217, 1217);
      boolean boolean0 = fixedDateTimeZone0.equals("GMT");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("GMT", "-0:`m00", 1217, 1217);
      FixedDateTimeZone fixedDateTimeZone1 = new FixedDateTimeZone("GMT", "GMT", (-1987704968), (-1107862686));
      boolean boolean0 = fixedDateTimeZone0.equals(fixedDateTimeZone1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("0:em00", "0:em00", 41, 41);
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      assertEquals(41, timeZone0.getRawOffset());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(63);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      assertEquals(0, timeZone0.getRawOffset());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.previousTransition((-3873L));
      assertEquals((-3873L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("UTC", "UTC", (-9), (-9));
      boolean boolean0 = fixedDateTimeZone0.isFixed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getShortName((-1587L));
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      int int0 = fixedDateTimeZone0.getOffsetFromLocal(29L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.nextTransition((-455L));
      assertEquals((-455L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = fixedDateTimeZone0.isStandardOffset((-2026L));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("-.ohzd", "-c~?8 <", 18, 326601);
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      assertEquals("GMT", timeZone0.getID());
  }
}
