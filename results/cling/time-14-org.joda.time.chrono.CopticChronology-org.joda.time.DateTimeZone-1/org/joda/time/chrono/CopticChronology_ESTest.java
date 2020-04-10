/*

 * Tue Mar 03 17:42:29 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CopticChronology_ESTest extends CopticChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone.forOffsetHours(0);
      LocalDate localDate0 = LocalDate.now((Chronology) copticChronology0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate.now((Chronology) copticChronology0);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1847);
      assertEquals(5071075200000L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      try { 
        DateTimeZone.forOffsetHours((-2074));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-3599999L), long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis((-249));
      assertEquals((-61073654400000L), long1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC(0L, false);
      try { 
        DateTimeZone.forOffsetHoursMinutes(57, 25649992);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 25649992
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC(0L, false);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("saPQJD'J");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'saPQJD'J' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+18:00");
      assertEquals("+18:00", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone1.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate.now((Chronology) copticChronology0);
      CopticChronology copticChronology1 = new CopticChronology((Chronology) null, (Object) null, 1);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("-18:00");
      assertEquals("-18:00", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone1.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      copticChronology0.calculateFirstDayOfYearMillis(1847);
      LocalDate localDate0 = LocalDate.now((Chronology) copticChronology0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate.now((Chronology) copticChronology0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      localDateTime0.plusSeconds((-292269337));
      // Undeclared exception!
      try { 
        CopticChronology.getInstance((DateTimeZone) null, (-292269337));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -292269337
         //
         verifyException("org.joda.time.chrono.CopticChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-2556L));
      try { 
        DateTimeZone.forOffsetHoursMinutes(2517, 2517);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 2517
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(0, 13);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate localDate0 = LocalDate.now((Chronology) copticChronology0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("YlOR'HlN[00<*['#2*3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'YlOR'HlN[00<*['#2*3' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone0, fixedDateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1847);
      assertEquals(5071075200000L, long0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long1 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate.now((Chronology) copticChronology0);
      CopticChronology copticChronology1 = CopticChronology.getInstance();
      assertNotSame(copticChronology1, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate.now((Chronology) copticChronology0);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      copticChronology0.calculateFirstDayOfYearMillis(1854);
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDate.now(dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.toString());
      
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(101220);
      assertEquals(3141044524800000L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-3599999L), long0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      assertEquals("+00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null, 1);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
      
      Chronology chronology0 = copticChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate.now((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+18:00");
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-2319L));
      assertEquals(61197681L, long0);
      
      copticChronology0.withZone(dateTimeZone0);
      assertEquals("+18:00", dateTimeZone0.toString());
      assertEquals("+18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone.forOffsetHours((-147));
      LocalDate localDate0 = LocalDate.now((Chronology) copticChronology0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-334));
      dateTimeZone0.convertLocalToUTC((long) (-334), false);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 1);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertEquals("UTC", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = new CopticChronology((Chronology) null, (Object) null, 1);
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone("The provider doesn't support UTC");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone1.getID());
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone1.getMillisKeepLocal(dateTimeZone0, 1);
      assertEquals(60001L, long0);
      assertEquals("+01:01", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CopticChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3659999L), long0);
      assertEquals("+01:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(1622L, true);
      assertEquals((-3598378L), long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-514), (-3477));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -3477
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate.now((Chronology) copticChronology0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, (-292271024));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -292271024
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(122);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      LocalDate.now((Chronology) julianChronology0);
      assertEquals("+122:00", dateTimeZone0.getID());
      assertEquals("+122:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 57);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 0, false);
      assertEquals((-3420000L), long0);
      assertEquals("+00:57", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(60000);
      long long0 = dateTimeZone0.convertLocalToUTC(277L, true);
      assertEquals((-59723L), long0);
      assertEquals("+00:01", dateTimeZone0.getID());
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(60000);
      assertEquals(1840240252800000L, long1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate.now((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long1 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("-18:00");
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 0L);
      assertEquals("-18:00", dateTimeZone0.getID());
      assertEquals((-68400000L), long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, (-3015));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -3015
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-3029L));
      // Undeclared exception!
      try { 
        DateTimeZone.forID("/nYw@BSDpNH;7_}0\"|W");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '/nYw@BSDpNH;7_}0\"|W' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, copticChronology0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals("+01:01", dateTimeZone0.toString());
      assertEquals((-3659999L), long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, copticChronology0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("-18:00");
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, copticChronology0);
      
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, (-1063L));
      assertEquals("-18:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-432), 1815);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1815
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate.now((Chronology) copticChronology0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(2626, 2626);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 2626
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-2556L));
      assertEquals((-2556L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test55()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      LocalDate.now((Chronology) copticChronology0);
      CopticChronology copticChronology1 = CopticChronology.getInstance();
      assertSame(copticChronology1, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("-18:00");
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, (-1063L));
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+18:00");
      assertNotNull(dateTimeZone0);
      
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-2319L));
      assertEquals(61197681L, long0);
      
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("+18:00", dateTimeZone0.toString());
  }
}
