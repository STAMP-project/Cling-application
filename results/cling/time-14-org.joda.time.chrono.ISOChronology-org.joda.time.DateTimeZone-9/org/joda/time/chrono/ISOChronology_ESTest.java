/*

 * Tue Mar 03 17:52:49 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISOChronology_ESTest extends ISOChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = chronology0.getZone();
      long long0 = dateTimeZone0.adjustOffset((-500L), true);
      assertEquals((-500L), long0);
      assertNotSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-4831L), false);
      assertEquals((-4831L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775798L), true);
      assertEquals((-9223372036854775798L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      dateTimeZone0.adjustOffset((-500L), true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-Jv$cRP4wV3U'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-Jv$cRP4wV3U'\" is malformed at \"Jv$cRP4wV3U'\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+ELY)^/GW#,r");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+ELY)^/GW#,r\" is malformed at \"ELY)^/GW#,r\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+ELY)^/GW#,r");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+ELY)^/GW#,r\" is malformed at \"ELY)^/GW#,r\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      dateTime0.withZoneRetainFields(dateTimeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+ELY)^/GW#,r");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+ELY)^/GW#,r\" is malformed at \"ELY)^/GW#,r\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0);
      LocalDate localDate0 = LocalDate.fromCalendarFields(gregorianCalendar0);
      localDate0.toInterval();
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1107), (-1107));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1107
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.adjustOffset((-1135L), true);
      try { 
        DateTimeZone.forOffsetHoursMinutes(9, 120);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 120
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-240));
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("-240:00", dateTimeZone0.getID());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHours((-2062));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        iSOChronology0.assemble((AssembledChronology.Fields) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ISOChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      ISOChronology iSOChronology1 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology1.assemble(assembledChronology_Fields0);
      assertNotSame(iSOChronology1, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      localDate0.toInterval();
      try { 
        DateTimeZone.forOffsetHoursMinutes((-2570), 47);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      long long0 = dateTimeZone0.adjustOffset(0, true);
      assertEquals(0L, long0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      long long0 = fixedDateTimeZone0.adjustOffset(0L, false);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(30L, (DateTimeZone) null);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      long long0 = dateTimeZone0.adjustOffset(30L, true);
      assertEquals(30L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("umX2d");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime.now(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.minusMillis((-2862));
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeZone.setNameProvider((NameProvider) null);
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      boolean boolean0 = fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(2866);
      dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertEquals("+00:00:02.866", dateTimeZone1.getID());
      
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Chronology chronology0 = iSOChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone.forTimeZone((TimeZone) null);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, true);
      assertEquals(9223372036854775807L, long0);
      
      LocalDateTime localDateTime0 = LocalDateTime.now();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      dateTime0.withLaterOffsetAtOverlap();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+ELY)^/GW#,r");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+ELY)^/GW#,r\" is malformed at \"ELY)^/GW#,r\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.adjustOffset(0L, false);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      ISOChronology iSOChronology1 = ISOChronology.getInstance();
      dateTimeZone0.adjustOffset((-500L), true);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology1.assemble(assembledChronology_Fields0);
      assertNotSame(iSOChronology1, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, false);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, true);
      assertEquals(9223372036854775807L, long0);
      
      DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
      assertNotSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-R4-Jv$cRP4wV3U'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-R4-Jv$cRP4wV3U'\" is malformed at \"R4-Jv$cRP4wV3U'\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-Jv$cRP4wV3U'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-Jv$cRP4wV3U'\" is malformed at \"Jv$cRP4wV3U'\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("gMU");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'gMU' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      ISOChronology.getInstance();
      long long0 = dateTimeZone0.adjustOffset((-500L), true);
      assertEquals((-500L), long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(256);
      dateTimeZone0.adjustOffset(256, false);
      try { 
        DateTimeZone.forOffsetHoursMinutes(256, (-1347));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1347
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone1);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-2062), (-2062));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2062
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-2062), (-2062));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2062
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      long long0 = dateTimeZone0.adjustOffset((-500L), true);
      assertEquals((-500L), long0);
      
      LocalDateTime localDateTime0 = LocalDateTime.now();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.adjustOffset((-1246L), false);
      assertEquals((-1246L), long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(5);
      LocalDateTime localDateTime0 = new LocalDateTime(5, 5, 5, 5, 5, 5);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("+00:00:00.005", dateTimeZone0.toString());
      
      TimeZone timeZone0 = TimeZone.getTimeZone("Corrupt zone info map");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      TimeZone timeZone0 = TimeZone.getTimeZone("J");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3600);
      dateTimeZone0.adjustOffset((-500L), true);
      try { 
        DateTimeZone.forOffsetHours((-2708));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(2);
      long long0 = dateTimeZone0.adjustOffset(0L, false);
      assertEquals(0L, long0);
      assertEquals("+02:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(6512, 2689);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 2689
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(63);
      assertEquals("+63:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test50()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      boolean boolean0 = dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, true);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test54()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalDate localDate0 = LocalDate.fromCalendarFields(gregorianCalendar0);
      localDate0.toInterval(dateTimeZone0);
      assertEquals("java.util.GregorianCalendar[time=1583257889293,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-18:00\",offset=-64800000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2020,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=62,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=51,SECOND=29,MILLISECOND=293,ZONE_OFFSET=-64800000,DST_OFFSET=0]", gregorianCalendar0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(15, 15);
      assertEquals("+15:15", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 86400000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 86400000
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(30L, (DateTimeZone) null);
      Interval interval0 = localDate0.toInterval((DateTimeZone) null);
      assertEquals(82800000L, interval0.getEndMillis());
      assertEquals((-3600000L), interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, true);
      assertEquals(9223372036854775807L, long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(121);
      assertEquals("+121:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset(9223372036854775807L, true);
      try { 
        DateTimeZone.forOffsetHoursMinutes(10080, (-2062));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2062
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis((-2163));
      dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertSame(iSOChronology0, chronology0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test63()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      assertEquals("Europe/Amsterdam", timeZone0.getID());
      
      long long0 = dateTimeZone0.adjustOffset((-500L), true);
      assertEquals((-500L), long0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, true);
      assertEquals(9223372036854775807L, long0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("J");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone1);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1938, 1938);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1938
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(45, 45);
      assertEquals("+45:45", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("UTC", dateTimeZone0.getID());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone1);
      
      boolean boolean0 = dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      assertEquals("UTC", dateTimeZone0.toString());
  }
}
