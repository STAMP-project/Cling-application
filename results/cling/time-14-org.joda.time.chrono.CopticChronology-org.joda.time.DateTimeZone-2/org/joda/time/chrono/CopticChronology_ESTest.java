/*

 * Tue Mar 03 17:42:33 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.Provider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CopticChronology_ESTest extends CopticChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 379);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.convertLocalToUTC(19L, true);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, 3660000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 3660000
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID(" (");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id ' (' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 86399999L);
      assertEquals(86399999L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.convertLocalToUTC(19L, true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-Summer");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-Summer\" is malformed at \"Summer\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+yT9DG;D`(G");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+yT9DG;D`(G\" is malformed at \"yT9DG;D`(G\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime.fromMillisOfDay(2592000010L);
      CopticChronology copticChronology0 = null;
      try {
        copticChronology0 = new CopticChronology((Chronology) null, (Object) null, (-1339));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -1339
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalTime.now();
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(17887500);
      assertEquals(564433354252800000L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 0L);
      assertEquals((-3600000L), long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(2027);
      assertEquals(10751443200000L, long1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.convertLocalToUTC(19L, true);
      try { 
        DateTimeZone.forOffsetHours((-2004));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+Mi$Tu9wR");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+Mi$Tu9wR\" is malformed at \"Mi$Tu9wR\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology.getInstance((DateTimeZone) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(906, 906);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 906
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-S(mwer");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-S(mwer\" is malformed at \"S(mwer\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID(")_&t2}r&gwgX49T =");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id ')_&t2}r&gwgX49T =' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalTime.fromMillisOfDay((long) 1);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1143);
      assertEquals((-17145475200000L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      long long1 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-292269337));
      assertEquals((-295869337L), long1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime.fromMillisOfDay((long) 1);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1835);
      assertEquals(4692384000000L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
      assertEquals("+01:00", dateTimeZone0.getID());
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(1809);
      assertEquals(3871929600000L, long1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-3599999L), long0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 58);
      assertEquals("+00:58", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology.getInstance((DateTimeZone) null, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-292269337));
      assertEquals((-295869337L), long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((DateTimeZone) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      copticChronology0.withZone(fixedDateTimeZone0);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 1);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-3599999L), long0);
      
      Chronology chronology0 = copticChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime.fromMillisOfDay((long) 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertEquals("+00:01", dateTimeZone0.toString());
      assertNotSame(copticChronology0, chronology0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Chronology chronology0 = copticChronology0.withZone(fixedDateTimeZone0);
      assertNotSame(chronology0, copticChronology0);
      
      long long0 = fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalTime.now((Chronology) julianChronology0);
      try { 
        DateTimeZone.forOffsetHours((-1055));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes((-361), 1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-1303259999L), long0);
      assertEquals("-361:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(2);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 2, true);
      assertEquals("+02:00", dateTimeZone0.getID());
      assertEquals((-7199998L), long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = mock(AssembledChronology.Fields.class, new ViolatedAssumptionAnswer());
      copticChronology0.assemble(assembledChronology_Fields0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-292269337));
      assertEquals((-295869337L), long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone.forID((String) null);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 1);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.convertLocalToUTC(19L, true);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals("+01:01", dateTimeZone0.toString());
      assertEquals((-3659999L), long0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone(" (");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CopticChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      try { 
        DateTimeZone.forOffsetHoursMinutes(23, (-1863));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1863
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((DateTimeZone) null);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, (-5523));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -5523
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 0, false);
      assertEquals((-60000L), long0);
      assertEquals("+00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals("+01:01", dateTimeZone0.toString());
      assertEquals((-3659999L), long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(292272708);
      assertEquals(9223371994233600000L, long1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimeZone0).getID();
      LocalTime.fromMillisOfDay((-4855L));
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CopticChronology.getInstance();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalTime.now(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.getID());
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      CopticChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone1.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals("+01:01", dateTimeZone1.toString());
      assertEquals(60001L, long0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone.forTimeZone((TimeZone) null);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(2592000000L);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(2);
      long long1 = dateTimeZone0.convertLocalToUTC((long) 2, true);
      assertEquals((-7199998L), long1);
      assertEquals("+02:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((DateTimeZone) null);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-Summer");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-Summer\" is malformed at \"Summer\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-422), (-1648));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1648
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
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
  public void test49()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.convertLocalToUTC(19L, true);
      assertEquals((-3659981L), long0);
      
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertEquals("+01:01", dateTimeZone0.getID());
      assertNotSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.convertLocalToUTC(19L, true);
      assertEquals((-3659981L), long0);
      assertEquals("+01:01", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertNotSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((DateTimeZone) null);
      try { 
        DateTimeZone.forOffsetHoursMinutes(567, 567);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 567
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, 11280000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 11280000
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals("UTC", dateTimeZone0.getID());
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalTime.now(dateTimeZone0);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 0);
      assertEquals((-3600000L), long0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone1);
      assertSame(copticChronology0, chronology0);
  }
}
