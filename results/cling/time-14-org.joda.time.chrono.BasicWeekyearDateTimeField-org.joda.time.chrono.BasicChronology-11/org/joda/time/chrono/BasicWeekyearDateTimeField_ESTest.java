/*

 * Tue Mar 03 17:34:59 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BasicWeekyearDateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicWeekyearDateTimeField_ESTest extends BasicWeekyearDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      JulianChronology julianChronology0 = null;
      try {
        julianChronology0 = new JulianChronology(buddhistChronology0, buddhistChronology0, (-2620));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -2620
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1, 1, islamicChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getDaysInYear((-1097));
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getDaysInYear((-3692));
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      long long0 = basicWeekyearDateTimeField0.set((long) (-4), (-4));
      assertEquals((-62293276800004L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(copticChronology0);
      // Undeclared exception!
      try { 
        basicWeekyearDateTimeField0.set((long) 1, (-4));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(copticChronology0);
      long long0 = basicWeekyearDateTimeField0.getDifferenceAsLong(53568000000L, 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(copticChronology0);
      CopticChronology copticChronology1 = null;
      try {
        copticChronology1 = new CopticChronology(copticChronology0, basicWeekyearDateTimeField0, 1391);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 1391
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      String string0 = zonedChronology0.toString();
      assertEquals("ZonedChronology[CopticChronology[UTC], +01:01]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(copticChronology0);
      boolean boolean0 = basicWeekyearDateTimeField0.isLeap(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(islamicChronology0);
      boolean boolean0 = basicWeekyearDateTimeField0.isLeap(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) islamicChronology0);
      LocalDate localDate0 = yearMonth0.toLocalDate(1);
      assertEquals(3, localDate0.size());
  }
}
