/*

 * Tue Mar 03 17:42:48 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.Provider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CopticChronology_ESTest extends CopticChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone.forOffsetHoursMinutes(0, 1);
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(60000);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-1512L));
      assertEquals((-3541512L), long0);
      
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      copticChronology0.withZone(dateTimeZone0);
      assertEquals("+00:01", dateTimeZone0.toString());
      assertEquals("+00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      copticChronology0.withZone(dateTimeZone0);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(60001L, long0);
      assertEquals("+01:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC((long) 1, false);
      try { 
        DateTimeZone.forOffsetHoursMinutes(87, 87);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 87
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC((long) 1, false);
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
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      CopticChronology copticChronology1 = null;
      try {
        copticChronology1 = new CopticChronology((Chronology) null, (Object) null, (-4498));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -4498
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      copticChronology0.assemble(assembledChronology_Fields0);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3659999L), long0);
      assertEquals("+01:01", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+00:30:14");
      assertEquals("+00:30:14", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      CopticChronology copticChronology1 = CopticChronology.getInstance();
      assertNotSame(copticChronology1, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(653, (-2294));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2294
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1814);
      assertEquals(4029696000000L, long0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long1 = dateTimeZone0.convertLocalToUTC((long) 1814, false);
      assertEquals((-3598186L), long1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
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
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      CopticChronology copticChronology1 = CopticChronology.getInstance((DateTimeZone) null);
      assertNotSame(copticChronology1, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, 690562340);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 690562340
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((long) 1);
      localTime0.minusHours((-2878));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-1643L));
      assertEquals((-1643L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.convertLocalToUTC(0L, false);
      CopticChronology copticChronology0 = null;
      try {
        copticChronology0 = new CopticChronology((Chronology) null, (Object) null, 3600000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 3600000
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:30:14");
      assertEquals("+00:30:14", dateTimeZone0.toString());
      assertNotNull(dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-3599998L), long0);
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      copticChronology0.calculateFirstDayOfYearMillis(4207);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 4207);
      assertEquals(4207L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(0, 31);
      LocalTime localTime0 = new LocalTime();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      copticChronology0.withZone((DateTimeZone) null);
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      copticChronology0.withZone(dateTimeZone0);
      LocalTime localTime0 = new LocalTime();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-25620), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(60000);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-1512L));
      try { 
        DateTimeZone.forOffsetHours((-1112));
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone.forID("UTC");
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalTime localTime0 = new LocalTime((Chronology) islamicChronology0);
      CopticChronology copticChronology0 = new CopticChronology((Chronology) null, islamicChronology0, 7);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals("+01:01", dateTimeZone0.getID());
      assertEquals((-3659999L), long0);
      
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone.forID((String) null);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone0.convertLocalToUTC(0L, true);
      assertEquals((-3660000L), long0);
      
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("+01:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CopticChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-64800000), (-787));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -787
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC((-9223372036854775808L), true);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(0);
      assertEquals((-53215747200000L), long0);
      
      long long1 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-59999L), long1);
      assertEquals("+00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(4207);
      assertEquals(79547011200000L, long0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(171);
      long long1 = dateTimeZone0.convertLocalToUTC((long) 171, true);
      assertEquals("+171:00", dateTimeZone0.getID());
      assertEquals((-615599829L), long1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-11));
      long long0 = dateTimeZone0.convertLocalToUTC((-3811L), true);
      assertEquals("-11:00", dateTimeZone0.getID());
      assertEquals(39596189L, long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      copticChronology0.withZone(dateTimeZone0);
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC((-9223372036854775808L), true);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalTime localTime0 = new LocalTime((Chronology) islamicChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTime dateTime0 = DateTime.now((Chronology) copticChronology0);
      dateTime0.toLocalDate();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.convertLocalToUTC((long) 1, false);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-2765), (-2765));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2765
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-1643L));
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
  public void test48()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("6U/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '6U/' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      copticChronology0.withZone(dateTimeZone0);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3659999L), long0);
      assertEquals("+01:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(681);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-1512L));
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      copticChronology0.assemble(assembledChronology_Fields0);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(60000);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-1512L));
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, 2520);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 2520
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-1643L));
      assertEquals((-1643L), long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      LocalTime localTime0 = new LocalTime();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
      LocalTime localTime0 = new LocalTime();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:01", dateTimeZone0.toString());
      assertNotNull(dateTimeZone1);
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      long long0 = dateTimeZone1.convertLocalToUTC(0L, true);
      assertEquals("+01:01", dateTimeZone1.toString());
      assertEquals((-3660000L), long0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC((-9223372036854775808L), false);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      copticChronology0.withZone((DateTimeZone) null);
      long long0 = dateTimeZone0.convertLocalToUTC(0L, true);
      assertEquals((-3660000L), long0);
      assertEquals("+01:01", dateTimeZone0.toString());
  }
}
