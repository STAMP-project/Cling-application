/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:55:46 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationField;
import org.joda.time.chrono.BasicWeekyearDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicWeekyearDateTimeField_ESTest extends BasicWeekyearDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      long long0 = basicWeekyearDateTimeField0.getDifferenceAsLong(929L, 929L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      boolean boolean0 = basicWeekyearDateTimeField0.isLeap((-734L));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      boolean boolean0 = basicWeekyearDateTimeField0.isLeap(100000000000000L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      long long0 = basicWeekyearDateTimeField0.set((long) 39, 39);
      assertEquals((-60936019199961L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(islamicChronology0);
      long long0 = basicWeekyearDateTimeField0.addWrapField((long) 1, 1);
      assertEquals(30844800001L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      long long0 = basicWeekyearDateTimeField0.set((-357L), 1970);
      assertEquals((-357L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      long long0 = basicWeekyearDateTimeField0.getDifferenceAsLong(31449600010L, 62035200000L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      long long0 = basicWeekyearDateTimeField0.getDifferenceAsLong(31449600010L, 31449600010L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      long long0 = basicWeekyearDateTimeField0.add(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      long long0 = basicWeekyearDateTimeField0.addWrapField(31449600010L, (-1427));
      assertEquals((-45000748799990L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      boolean boolean0 = basicWeekyearDateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      DurationField durationField0 = basicWeekyearDateTimeField0.getLeapDurationField();
      assertEquals(604800000L, durationField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      int int0 = basicWeekyearDateTimeField0.getMinimumValue();
      assertEquals((-292275054), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      int int0 = basicWeekyearDateTimeField0.getMaximumValue();
      assertEquals(292278993, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      int int0 = basicWeekyearDateTimeField0.getLeapAmount((-339L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(gregorianChronology0);
      DurationField durationField0 = basicWeekyearDateTimeField0.getRangeDurationField();
      assertNull(durationField0);
  }
}
