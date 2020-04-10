/*

 * Tue Mar 03 17:34:17 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.BasicWeekyearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicWeekyearDateTimeField_ESTest extends BasicWeekyearDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      JulianChronology julianChronology0 = null;
      try {
        julianChronology0 = new JulianChronology(gJChronology0, gJChronology0, (-1633));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -1633
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = null;
      try {
        localDateTime0 = new LocalDateTime(1, (-2748), (-1392), (-2748), 1, (-2748), 1, ethiopicChronology0);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -2748 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      long long0 = basicWeekyearDateTimeField0.add((-2237L), (-2237L));
      assertEquals((-70592860802237L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      int int0 = ethiopicChronology0.getDaysInYear(2955);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = ethiopicChronology0.getDaysInYear(1);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(julianChronology0);
      long long0 = basicWeekyearDateTimeField0.roundHalfFloor((-16L));
      assertEquals(950400000L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      long long0 = basicWeekyearDateTimeField0.remainder(274L);
      assertEquals(259200274L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      CopticChronology copticChronology0 = null;
      try {
        copticChronology0 = new CopticChronology(gregorianChronology0, gregorianChronology0, 508);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 508
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Chronology chronology0 = ethiopicChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, ethiopicChronology0);
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
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(islamicChronology0);
      boolean boolean0 = basicWeekyearDateTimeField0.isLeap(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDate localDate0 = new LocalDate(1, 1, 1, ethiopicChronology0);
      assertEquals(3, localDate0.size());
  }
}
