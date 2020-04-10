/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 22:05:59 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IslamicChronology_ESTest extends IslamicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis(85, 85, 1024, 1024, 1514, 1073741824, 1024);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 85 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0, 2);
      String string0 = ethiopicChronology0.toString();
      assertEquals("EthiopicChronology[Europe/Amsterdam,mdfw=2]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      String string0 = ethiopicChronology0.toString();
      assertEquals("EthiopicChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(696);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0, islamicChronology0.AH);
      int int0 = julianChronology0.getDaysInYear(696);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      int int0 = gregorianChronology0.getDaysInYear(1);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getWeekOfWeekyear(1, 2078);
      assertEquals(50, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = mock(IslamicChronology.LeapYearPatternType.class, new ViolatedAssumptionAnswer());
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      int int0 = islamicChronology0.getDayOfMonth(1);
      assertEquals(25, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      DateTime dateTime0 = DateTime.now((Chronology) islamicChronology0);
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0);
      assertEquals(1566079553853L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getWeekyear((-42496790399999L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.setYear((-198L), 1);
      assertEquals((-42496790400198L), long0);
  }
}
