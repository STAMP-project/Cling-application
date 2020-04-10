/*

 * Tue Mar 03 17:42:57 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.Provider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CopticChronology_ESTest extends CopticChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      LocalDateTime localDateTime0 = new LocalDateTime();
      copticChronology0.withZone(dateTimeZone0);
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
      assertEquals("+00:00:00.001", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.convertLocalToUTC((long) 1, false);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, 2360);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 2360
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC((long) 3, true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("No printer supplied");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'No printer supplied' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC((long) 3, true);
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
  public void test05()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 1);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      copticChronology0.assemble(assembledChronology_Fields0);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime.now();
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1862);
      assertEquals(5544460800000L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(719527);
      assertEquals(22653329443200000L, long1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-413));
      long long0 = dateTimeZone0.convertLocalToUTC((long) (-413), true);
      assertEquals(1486799587L, long0);
      assertEquals("-413:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
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
  public void test10()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeZone0.convertLocalToUTC(0L, false);
      assertEquals("+18:00", dateTimeZone0.toString());
      assertEquals((-64800000L), long0);
      
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(4186);
      assertEquals(78884323200000L, long1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(2045);
      assertEquals(11319523200000L, long1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 27);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("CET");
      long long0 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 3162L);
      assertEquals((-1976838L), long0);
      assertEquals("+00:27", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, copticChronology0);
      
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-4124L));
      assertEquals((-4124L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(14);
      copticChronology0.withZone(dateTimeZone1);
      assertEquals("+14:00", dateTimeZone1.getID());
      assertEquals("+14:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-68399999L), long0);
      
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
      assertNotSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      try { 
        DateTimeZone.forOffsetHours((-837));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      try { 
        DateTimeZone.forOffsetHours((-1686));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      CopticChronology copticChronology0 = null;
      try {
        copticChronology0 = new CopticChronology((Chronology) null, localDateTime0, (-292269337));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -292269337
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      dateTimeZone0.convertLocalToUTC(1896L, false);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CopticChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.convertLocalToUTC(809L, false);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, (-2335));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2335
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      try { 
        DateTimeZone.forOffsetHoursMinutes(45, (-1370));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1370
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone1.toString());
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 0, true);
      assertEquals((-3600000L), long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC(809L, false);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals((-3599191L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeZone0.convertLocalToUTC(0L, true);
      assertEquals((-3600000L), long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(1863);
      assertEquals(5575996800000L, long1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      CopticChronology copticChronology1 = new CopticChronology(copticChronology0, localDateTime0, 1);
      int int0 = copticChronology1.getMonthOfYear(3001L);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      copticChronology0.calculateFirstDayOfYearMillis(1863);
      LocalDateTime localDateTime0 = new LocalDateTime();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalDateTime.now();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-^-^GN7D`");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-^-^GN7D`\" is malformed at \"^-^GN7D`\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("R,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'R,' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      try { 
        DateTimeZone.forOffsetHoursMinutes(17, (-4149));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -4149
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
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
  @Ignore
  public void test38()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeZone0.convertLocalToUTC(0L, true);
      assertEquals((-3600000L), long0);
      
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      copticChronology0.withZone((DateTimeZone) null);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      try { 
        DateTimeZone.forOffsetHoursMinutes(86400, 1077);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1077
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 1);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, 67);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 67
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      DateTimeZone.forOffsetHoursMinutes(0, 1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-4124L));
      assertEquals((-4124L), long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 74L);
      assertEquals((-3599926L), long0);
      
      DateTimeZone dateTimeZone2 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone2.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone0);
      
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-68399999L), long0);
      assertEquals("-18:00", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.getID());
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      long long0 = dateTimeZone0.convertLocalToUTC(0L, false);
      assertEquals((-60000L), long0);
      assertEquals("+00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 0, false);
      assertEquals((-3600000L), long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(272);
      copticChronology0.withZone(dateTimeZone1);
      assertEquals("+00:00:00.272", dateTimeZone1.getID());
      assertEquals("+00:00:00.272", dateTimeZone1.toString());
  }
}
