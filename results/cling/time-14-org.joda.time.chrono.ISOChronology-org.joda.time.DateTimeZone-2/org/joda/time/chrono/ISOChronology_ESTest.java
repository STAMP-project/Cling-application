/*

 * Tue Mar 03 17:51:30 GMT 2020
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
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
  @Ignore
  public void test00()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      iSOChronology0.withZone((DateTimeZone) null);
      DateTime dateTime0 = new DateTime((Chronology) iSOChronology0);
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertEquals(1583257869986L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-317), dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      DateTime dateTime0 = new DateTime((Chronology) iSOChronology0);
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertEquals(1583257869303L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTime dateTime0 = new DateTime((Chronology) iSOChronology0);
      dateTime0.withLaterOffsetAtOverlap();
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      DateTimeZone.setNameProvider(nameProvider0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone.forTimeZone((TimeZone) null);
      DateTime dateTime0 = new DateTime((Chronology) iSOChronology0);
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertEquals(1583257868641L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-317), dateTimeZone0);
      localDateTime0.withSecondOfMinute(34);
      assertEquals("-317:00", dateTimeZone0.toString());
      assertEquals("-317:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTime dateTime0 = new DateTime((Chronology) iSOChronology0);
      dateTime0.withLaterOffsetAtOverlap();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("oR!2e|&,M");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'oR!2e|&,M' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-317), dateTimeZone0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
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
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-317), dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      dateTimeZone1.isLocalDateTimeGap(localDateTime0);
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
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-317), dateTimeZone0);
      localDateTime0.withSecondOfMinute(34);
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
  public void test09()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      LocalDate localDate0 = LocalDate.now();
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(23);
      dateTimeZone0.adjustOffset(23, true);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1458, 1458);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1458
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(11);
      dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      assertEquals("+11:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-317), dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      boolean boolean0 = dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      assertEquals("-317:00", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone2 = DateTimeZone.forOffsetHours(34);
      assertEquals("+34:00", dateTimeZone2.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-317), dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTime dateTime0 = new DateTime((Chronology) iSOChronology0);
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertEquals(1583257864111L, dateTime1.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
      DateTime dateTime0 = new DateTime((Chronology) iSOChronology0);
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertEquals(1583257861055L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-317), dateTimeZone0);
      localDateTime0.withSecondOfMinute(34);
      assertEquals("-317:00", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(34);
      assertEquals("+34:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-64800000));
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.getID());
      assertSame(dateTimeZone1, dateTimeZone0);
      
      LocalDate localDate0 = LocalDate.now();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1583276400000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      iSOChronology0.withZone((DateTimeZone) null);
      LocalDate localDate0 = LocalDate.now();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1583276400000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1138);
      localDate0.toInterval(dateTimeZone0);
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(64);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, iSOChronology0);
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime(0L, dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      boolean boolean1 = dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertTrue(boolean1 == boolean0);
      assertEquals("-317:00", dateTimeZone0.toString());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.toInterval();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTime dateTime0 = new DateTime((Chronology) iSOChronology0);
      dateTime0.withLaterOffsetAtOverlap();
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
  public void test26()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTime dateTime0 = new DateTime((Chronology) copticChronology0);
      dateTime0.withLaterOffsetAtOverlap();
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
  public void test27()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      dateTime0.withLaterOffsetAtOverlap();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-317), dateTimeZone0);
      localDateTime0.minusWeeks((-317));
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
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime(0L, dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("org.joda.time.chrono.GregorianChronology");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'org.joda.time.chrono.GregorianChronology' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      boolean boolean0 = fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      dateTime0.withLaterOffsetAtOverlap();
      try { 
        DateTimeZone.forOffsetHoursMinutes((-2290), (-2290));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2290
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      iSOChronology0.withZone((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-64800000));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-64800000), (DateTimeZone) null);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2105));
      dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      try { 
        DateTimeZone.forOffsetHoursMinutes(2116, (-2441));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2441
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-317), dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-317), (-317));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -317
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTime dateTime0 = new DateTime((Chronology) copticChronology0);
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertEquals(1583257849510L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-64800000));
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-64800000), (DateTimeZone) null);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("-18:00", dateTimeZone0.toString());
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test37()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTime dateTime0 = new DateTime((Chronology) iSOChronology0);
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertEquals(1583257847786L, dateTime1.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(11);
      assertEquals("+11:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime(158L, dateTimeZone0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(25650000, 25650000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 25650000
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(2116, 2116);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 2116
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-317), dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      boolean boolean0 = dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      assertEquals("-317:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-317), dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      boolean boolean0 = dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      assertEquals("-317:00", dateTimeZone0.toString());
      
      TimeZone timeZone0 = dateTimeZone1.toTimeZone();
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(timeZone0);
      assertNotSame(dateTimeZone2, dateTimeZone1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.getID());
      
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDate localDate0 = LocalDate.now((Chronology) iSOChronology0);
      Interval interval0 = localDate0.toInterval();
      assertEquals(1583276400000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.toInterval();
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, (-64800000));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -64800000
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime(158L, dateTimeZone0);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-317), dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      localDateTime0.withSecondOfMinute(34);
      assertEquals("-317:00", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      TimeZone timeZone0 = dateTimeZone1.toTimeZone();
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(timeZone0);
      assertNotSame(dateTimeZone2, dateTimeZone1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTime dateTime0 = new DateTime((Chronology) iSOChronology0);
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertEquals(1583257826647L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test48()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-64800000));
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
      
      DateTime dateTime0 = new DateTime((Chronology) iSOChronology0);
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertEquals(1583257825026L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime(0L, dateTimeZone0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("org.joda.time.chrono.GregorianChronology");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'org.joda.time.chrono.GregorianChronology' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      assertFalse(boolean0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-317));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-317), dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }
}
