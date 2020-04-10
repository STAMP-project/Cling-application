/*

 * Tue Mar 03 17:52:22 GMT 2020
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
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
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
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone.setNameProvider((NameProvider) null);
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      long long0 = dateTimeZone0.adjustOffset(397L, false);
      assertEquals(397L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      DateTimeZone.setNameProvider((NameProvider) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      assertEquals((-9223372036854775806L), long0);
      
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.withYearOfEra(15);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((-282L), dateTimeZone1);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+h <xEYk@8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+h <xEYk@8\" is malformed at \"h <xEYk@8\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      LocalTime.fromMillisOfDay((-282L), (Chronology) iSOChronology0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+h <xEYk@8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+h <xEYk@8\" is malformed at \"h <xEYk@8\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("?tT(dTvVxZadj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '?tT(dTvVxZadj' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.minusMillis(41);
      try { 
        DateTimeZone.forOffsetHoursMinutes(41, (-5509));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -5509
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      try { 
        DateTimeZone.forOffsetHoursMinutes(3466, (-1578));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1578
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-7");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-7\" is malformed at \"7\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+h <xEYk@8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+h <xEYk@8\" is malformed at \"h <xEYk@8\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset((-282L), false);
      try { 
        DateTimeZone.forOffsetHoursMinutes(153692453, 1609);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1609
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2000);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("+00:00:02", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-27));
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
      assertEquals("-27:00", dateTimeZone0.getID());
      assertEquals("-27:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone.forOffsetHours((-58));
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) (-58), (Chronology) iSOChronology0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      long long0 = dateTimeZone0.adjustOffset(3666L, true);
      assertEquals(3666L, long0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertTrue(dateTimeZone1.isFixed());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-547), 192);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 192
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset((-282L), false);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("PST");
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.withYearOfEra(15);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      assertEquals((-9223372036854775806L), long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset(9223372036854775807L, true);
      try { 
        DateTimeZone.forOffsetHoursMinutes(401, 401);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 401
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      iSOChronology0.withZone((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(442);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      iSOChronology0.withZone(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      assertEquals("+442:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, false);
      assertEquals(9223372036854775807L, long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, true);
      assertEquals(9223372036854775807L, long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(0, 4);
      assertEquals("+00:04", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, true);
      assertEquals(9223372036854775807L, long0);
      
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.adjustOffset(9223372036854775773L, true);
      assertEquals(9223372036854775773L, long0);
      
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      Chronology chronology0 = iSOChronology0.withZone(dateTimeZone1);
      assertNotSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      dateTimeZone0.adjustOffset(0L, false);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+h <xEYk@8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+h <xEYk@8\" is malformed at \"h <xEYk@8\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 0L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-7");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-7\" is malformed at \"7\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset(9223372036854775807L, false);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((-282L), dateTimeZone1);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
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
  public void test37()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      long long0 = dateTimeZone0.adjustOffset(0L, true);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateMidnight dateMidnight0 = new DateMidnight(1163L, dateTimeZone0);
      DateTime dateTime0 = dateMidnight0.toDateTime();
      dateTime0.withEarlierOffsetAtOverlap();
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, (-3710));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -3710
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset(9223372036854775807L, true);
      DateTimeZone.setNameProvider((NameProvider) null);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset(9223372036854775807L, true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("YRn_^uQ5r'9wkq");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'YRn_^uQ5r'9wkq' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset(9223372036854775791L, true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+h <xEYk@8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+h <xEYk@8\" is malformed at \"h <xEYk@8\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-27));
      LocalDateTime localDateTime0 = new LocalDateTime();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-27), (-27));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -27
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(41, (-5509));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -5509
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset(9223372036854775807L, true);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      assertEquals((-9223372036854775806L), long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours((-547));
      assertEquals("-547:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      try { 
        DateTimeZone.forOffsetHours(25650000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-282L), false);
      assertEquals((-282L), long0);
      
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.adjustOffset((-460L), false);
      assertEquals((-460L), long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("PST");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(60000);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset(9223372036854775807L, true);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      assertEquals((-9223372036854775806L), long0);
      
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Chronology chronology0 = iSOChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-87));
      dateTimeZone0.adjustOffset((-87), false);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test56()  throws Throwable  {
      DateTimeZone.forOffsetHours(541);
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withEarlierOffsetAtOverlap();
      assertEquals(1583257875503L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, true);
      assertEquals(9223372036854775807L, long0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("bL9l__-2YVJ");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(442);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(2097, 442);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 442
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((-282L), dateTimeZone1);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("+18:00", dateTimeZone1.getID());
      assertFalse(boolean0);
      
      DateTimeZone dateTimeZone2 = DateTimeZone.forOffsetHours(509);
      assertEquals("+509:00", dateTimeZone2.toString());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      assertEquals((-9223372036854775806L), long0);
      
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone1.toString());
      assertNotNull(dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((-282L), dateTimeZone1);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset(9223372036854775807L, false);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(64);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("+00:00:00.064", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775806L), true);
      assertEquals((-9223372036854775806L), long0);
      
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-547));
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.withYearOfEra(153692453);
      try { 
        DateTimeZone.forOffsetHoursMinutes(153692453, 1609);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1609
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DateTimeZone.forOffsetHours(0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.minusMillis(41);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalTime.fromMillisOfDay((-2109L), (Chronology) iSOChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 4);
      assertEquals("+00:04", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalTime.fromMillisOfDay(2685L, (Chronology) iSOChronology0);
      ISOChronology iSOChronology1 = ISOChronology.getInstance((DateTimeZone) null);
      assertSame(iSOChronology1, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-1L), (Chronology) iSOChronology0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, true);
      assertEquals(9223372036854775807L, long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours((-38));
      assertEquals("-38:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset(9223372036854775804L, true);
      try { 
        DateTimeZone.forOffsetHoursMinutes(3466, (-1578));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1578
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-517));
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.withYearOfEra(153692453);
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.adjustOffset((-2492L), true);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone1);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      long long0 = dateTimeZone0.adjustOffset((-282L), false);
      assertEquals((-282L), long0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone1.toString());
      assertNotNull(dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, true);
      assertEquals(9223372036854775807L, long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(153692453, 1609);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1609
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.toString());
      
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }
}
