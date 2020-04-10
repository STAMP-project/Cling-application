/*

 * Tue Mar 03 17:49:54 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BasicSingleEraDateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime0 = DateTime.now((Chronology) copticChronology0);
      fixedDateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals(1583257778032L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      Period period0 = new Period(1000000000L, (-42521587200000L));
      long long0 = dateTimeField0.addWrapField(1000000000L, 2147483051);
      assertEquals((-1544866372000L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(4, 4);
      String string0 = dateTimeZone0.getName(418L);
      assertEquals("+04:04", string0);
      
      LocalDateTime localDateTime0 = new LocalDateTime(122L, dateTimeZone0);
      localDateTime0.minusMonths(2906);
      assertEquals("+04:04", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((long) 2147483051, (Locale) null);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(39, false);
      assertEquals(39L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.months();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(basicSingleEraDateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.roundFloor((-1425L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      String string0 = dateTimeZone0.getName((long) 1, (Locale) null);
      assertEquals("+01:01", string0);
      
      long long0 = dateTimeField0.roundCeiling((-766623600001L));
      assertEquals((-735699600000L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = fixedDateTimeZone0.isStandardOffset(1);
      assertTrue(boolean0);
      
      long long0 = dateTimeField0.set(1094L, 1);
      assertEquals((-2713735170906L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.JAPAN;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
      
      long long0 = dateTimeField0.addWrapField((long) 1, 117);
      assertEquals((-2618781571999L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      Period period0 = new Period(1, 2687L);
      long long0 = dateTimeField0.set((long) 1, 1);
      assertEquals((-2713735171999L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getShortName((long) 1);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusMonths(1);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.minusMonths(2147483051);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = new Locale("v,C~7_");
      String string0 = fixedDateTimeZone0.getName((long) 2147483051, locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(4, 4);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 4, true);
      assertEquals((-14639996L), long0);
      
      Locale locale0 = new Locale("T#8iK\"{T87K#T3@7", "Y", "T#8iK\"{T87K#T3@7");
      String string0 = dateTimeZone0.getName((long) 4, locale0);
      assertEquals("+04:04", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(4, 4);
      long long0 = dateTimeZone0.convertLocalToUTC(1137L, true);
      assertEquals("+04:04", dateTimeZone0.getID());
      assertEquals((-14638863L), long0);
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      String string0 = dateTimeZone1.getShortName((-4294967296L));
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.isStandardOffset(1);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusMonths(59);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = new Period((-2317L), 1);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusMonths(3600000);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period(1000000000L, (-42521587200000L));
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.minusMonths(1166);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getShortName((long) 1);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
      
      long long0 = dateTimeField0.addWrapField((long) 2147483046, 2147483046);
      assertEquals((-1701571688954L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = new Period((-2317L), 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 11);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-4259999L), long0);
      assertEquals("+01:11", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(4, 4);
      long long0 = dateTimeZone0.convertLocalToUTC(1115L, true);
      assertEquals((-14638885L), long0);
      assertEquals("+04:04", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone1);
      
      Locale locale0 = Locale.JAPAN;
      String string0 = dateTimeZone1.getName((long) 1, locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }
}
