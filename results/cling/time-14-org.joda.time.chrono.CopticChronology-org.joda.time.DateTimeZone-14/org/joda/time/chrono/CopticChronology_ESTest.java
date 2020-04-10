/*

 * Tue Mar 03 17:43:53 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CopticChronology_ESTest extends CopticChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(73373);
      assertEquals(2262260016000000L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.convertLocalToUTC((long) 1, false);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1921), 2870);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 2870
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.convertLocalToUTC((long) 1, false);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("I:/Hi5i%v@}p`D");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'I:/Hi5i%v@}p`D' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      Object object0 = new Object();
      CopticChronology copticChronology1 = new CopticChronology((Chronology) null, object0, 1);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+01:00");
      assertEquals("+01:00", dateTimeZone1.getID());
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(604800);
      assertEquals(19032820732800000L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, (-1205));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1205
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1267, 1267);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1267
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.convertLocalToUTC(1L, false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("PRT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'PRT' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC(0L, true);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      copticChronology0.assemble(assembledChronology_Fields0);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
      assertNotNull(dateTimeZone0);
      
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals("UTC", dateTimeZone0.toString());
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
      assertNotNull(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone.forID("+01:00");
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(2687);
      assertEquals(31579459200000L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDateTime.now();
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1739);
      assertEquals(1662854400000L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      copticChronology0.withZone(dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone.forOffsetHours((-222));
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      try { 
        DateTimeZone.forOffsetHours((-52080));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, copticChronology0);
      
      LocalDateTime localDateTime0 = new LocalDateTime(chronology0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      assertEquals("+00:01", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone.forID("UTC");
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      CopticChronology copticChronology1 = CopticChronology.getInstance((DateTimeZone) null);
      Chronology chronology0 = copticChronology1.withZone((DateTimeZone) null);
      assertSame(chronology0, copticChronology1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) null);
      CopticChronology copticChronology0 = null;
      try {
        copticChronology0 = new CopticChronology((Chronology) null, localDateTime0, 1815);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 1815
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, (-1671));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1671
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-222));
      long long0 = dateTimeZone0.convertLocalToUTC((-3068L), false);
      assertEquals(799196932L, long0);
      assertEquals("-222:00", dateTimeZone0.getID());
      
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone.forID("-00:00:02.551");
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.convertLocalToUTC((long) 1, false);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1383, (-1687));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1687
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, copticChronology0);
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertEquals("UTC", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(808, 1000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1000
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      CopticChronology copticChronology1 = CopticChronology.getInstance();
      assertFalse(copticChronology1.equals((Object)copticChronology0));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone1.getID());
      assertNotNull(dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone.forOffsetHoursMinutes(0, 0);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CopticChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.convertLocalToUTC((long) 1, false);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertEquals("Europe/Amsterdam", dateTimeZone1.toString());
  }
}
