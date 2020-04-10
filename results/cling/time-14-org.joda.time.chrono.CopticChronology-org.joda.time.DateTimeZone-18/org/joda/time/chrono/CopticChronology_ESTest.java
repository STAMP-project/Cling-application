/*

 * Tue Mar 03 17:44:36 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CopticChronology_ESTest extends CopticChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1716);
      assertEquals(937094400000L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(60001L, long0);
      
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, copticChronology0);
      assertEquals("+01:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      dateTimeZone0.convertLocalToUTC((long) 3, false);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-EOp+@e`x6A6. ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-EOp+@e`x6A6. \" is malformed at \"EOp+@e`x6A6. \"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null, 2);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      CopticChronology copticChronology0 = null;
      try {
        copticChronology0 = new CopticChronology((Chronology) null, localDate0, (-2919));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -2919
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
      
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(3292);
      assertEquals(50671872000000L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(60001L, long0);
      assertEquals("+01:01", dateTimeZone0.getID());
      
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(10209375);
      assertEquals(322130156688000000L, long1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      dateTimeZone0.convertLocalToUTC((long) 3, false);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-5788), 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+iDa;U8TAzSAL%$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+iDa;U8TAzSAL%$\" is malformed at \"iDa;U8TAzSAL%$\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+iDa;U8TAzSAL%$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+iDa;U8TAzSAL%$\" is malformed at \"iDa;U8TAzSAL%$\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1641), 767);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 767
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.convertLocalToUTC(1696L, true);
      assertEquals((-3598304L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-EOp+@e`x6A6. ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-EOp+@e`x6A6. \" is malformed at \"EOp+@e`x6A6. \"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID(";gb4q!");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id ';gb4q!' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = new CopticChronology((Chronology) null, (Object) null, 1);
      long long0 = dateTimeZone0.convertLocalToUTC(1696L, true);
      assertEquals((-3598304L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3659999L), long0);
      assertEquals("+01:01", dateTimeZone0.getID());
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(2411);
      assertEquals(22869561600000L, long1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(60001L, long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long1);
      assertEquals("+01:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(2411);
      assertEquals(22869561600000L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(60001L, long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(95220);
      assertEquals("+01:01", dateTimeZone0.toString());
      assertEquals(2951698924800000L, long1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(60001L, long0);
      assertEquals("+01:01", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 566L);
      assertEquals("+00:01", dateTimeZone0.toString());
      assertEquals((-3539434L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      Chronology chronology0 = copticChronology0.withZone(fixedDateTimeZone0);
      assertSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1683), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(13);
      assertEquals("+13:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = new CopticChronology((Chronology) null, (Object) null, 1);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      dateTimeZone0.convertLocalToUTC((long) 3, false);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CopticChronology.getInstance();
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(1901L, true);
      assertEquals((-3598099L), long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, (-50100));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -50100
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, (-1572));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1572
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeZone0).convertLocalToUTC(anyLong() , anyBoolean() , anyLong());
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(4, 4);
      dateTimeZone1.getMillisKeepLocal(dateTimeZone0, 0L);
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone2.getID());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone.forTimeZone((TimeZone) null);
      LocalDate localDate0 = new LocalDate();
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(1);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      assertEquals("+01:00", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(9);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 9, false);
      assertEquals((-32399991L), long0);
      assertEquals("+09:00", dateTimeZone0.getID());
      
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      Chronology chronology0 = copticChronology0.withZone(fixedDateTimeZone0);
      assertNotSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 3, false);
      assertEquals((-10799997L), long0);
      
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(3377);
      assertEquals(53354246400000L, long1);
      assertEquals("+03:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 0L);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(1);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      dateTimeZone0.convertLocalToUTC((long) 1, false);
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 999);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 999
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LocalDate.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-TC");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-TC\" is malformed at \"TC\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      dateTimeZone0.convertLocalToUTC(1061L, true);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1130), (-1130));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1130
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("w@RwB@3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'w@RwB@3' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(1);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, copticChronology0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Chronology chronology0 = copticChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, copticChronology0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes((-294), 43);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1991L);
      assertEquals((-1064578009L), long0);
      assertEquals("-294:43", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1933, 352831696);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 352831696
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(2, 2);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 7L);
      Provider provider0 = DateTimeZone.getProvider();
      DateTimeZone.setProvider(provider0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeZone0).convertLocalToUTC(anyLong() , anyBoolean() , anyLong());
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(4, 4);
      dateTimeZone1.getMillisKeepLocal(dateTimeZone0, 0L);
      assertEquals("+04:04", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      LocalDate localDate0 = new LocalDate();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertSame(copticChronology0, chronology0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes((-294), 43);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1991L);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertFalse(dateTimeZone1.equals((Object)dateTimeZone0));
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 860L);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(1);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC((long) 1, false);
      CopticChronology copticChronology1 = (CopticChronology)copticChronology0.withZone(dateTimeZone1);
      assertEquals(1, CopticChronology.AM);
  }
}
