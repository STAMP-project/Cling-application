/*

 * Tue Mar 03 17:51:48 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-1));
      long long0 = dateTimeZone0.adjustOffset((-1), false);
      assertEquals((-1L), long0);
      
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Chronology chronology0 = iSOChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, iSOChronology0);
      assertEquals("-01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertEquals(1583190000000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      dateTime0.withLaterOffsetAtOverlap();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      dateTime0.withLaterOffsetAtOverlap();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("0VIh~k*UKx#=?Z){lm");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '0VIh~k*UKx#=?Z){lm' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(8);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+2_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+2_\" is malformed at \"2_\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+2_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+2_\" is malformed at \"2_\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusWeeks(4);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+2_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+2_\" is malformed at \"2_\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.minusWeeks((-506));
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1), (-506));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -506
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      dateTime0.withLaterOffsetAtOverlap();
      try { 
        DateTimeZone.forOffsetHoursMinutes(60, 678);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 678
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHours(3600000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      ISOChronology iSOChronology1 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology1.assemble(assembledChronology_Fields0);
      assertNotSame(iSOChronology1, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(14);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("+14:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone.forOffsetHoursMinutes(4, 4);
      LocalDateTime localDateTime1 = localDateTime0.plusWeeks(4);
      assertEquals(4, localDateTime1.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(827, "");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      long long0 = dateTimeZone0.adjustOffset(65, true);
      assertEquals(65L, long0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      dateTime0.withLaterOffsetAtOverlap();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      dateTime0.withLaterOffsetAtOverlap();
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = LocalDateTime.now((DateTimeZone) fixedDateTimeZone0);
      fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      DateTimeZone.setNameProvider(nameProvider0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.minusWeeks((-506));
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(14);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("+14:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTime dateTime0 = dateMidnight0.toDateTime();
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
  public void test25()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      dateTime0.withLaterOffsetAtOverlap();
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+2_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+2_\" is malformed at \"2_\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      dateTime0.withLaterOffsetAtOverlap();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.minusWeeks((-60));
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
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(3);
      DateTimeZone dateTimeZone2 = DateTimeZone.getDefault();
      long long0 = dateTimeZone2.adjustOffset(9223372036854775807L, false);
      assertEquals(9223372036854775807L, long0);
      
      ISOChronology.getInstance(dateTimeZone1);
      assertEquals("+03:00", dateTimeZone1.toString());
      assertEquals("+03:00", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
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
  public void test30()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
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
  public void test31()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("Australka/S3ney");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'Australka/S3ney' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      dateTime0.withLaterOffsetAtOverlap();
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1042), (-1042));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1042
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      iSOChronology0.withZone((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-721));
      LocalDateTime localDateTime0 = new LocalDateTime();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("-00:00:00.721", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, false);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1042), (-1042));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1042
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-283), (-283));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -283
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      dateTime0.withLaterOffsetAtOverlap();
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-1));
      dateTimeZone0.adjustOffset((-1), false);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset(9223372036854775807L, false);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertEquals(1583190000000L, dateTime1.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 3);
      assertEquals("+00:03", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ISOChronology iSOChronology1 = (ISOChronology)iSOChronology0.withZone(fixedDateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology1.assemble(assembledChronology_Fields0);
      assertNotSame(iSOChronology1, iSOChronology0);
      
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) fixedDateTimeZone0);
      boolean boolean0 = fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone.forTimeZone((TimeZone) null);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDate localDate0 = LocalDate.now((Chronology) iSOChronology0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-1));
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertSame(dateTimeZone0, dateTimeZone1);
      assertFalse(boolean0);
      assertEquals("-01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.withWeekyear((-480));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-1));
      assertEquals("-01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.getID());
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.minusWeeks(2859);
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 126);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 126
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test52()  throws Throwable  {
      ISOChronology.getInstance((DateTimeZone) null);
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      DateTime dateTime1 = dateTime0.withZoneRetainFields((DateTimeZone) null);
      assertNotSame(dateTime1, dateTime0);
      assertEquals(1583190000000L, dateTime1.getMillis());
      assertEquals(1583190000000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.minusWeeks(2859);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      // Undeclared exception!
      try { 
        dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) fixedDateTimeZone0);
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.minusWeeks(2859);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2859);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '+00:00:02.859' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test57()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateTime dateTime0 = dateMidnight0.toDateTime();
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertEquals(1583190000000L, dateTime1.getMillis());
      
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-1));
      long long0 = dateTimeZone0.adjustOffset((-1), false);
      assertEquals((-1L), long0);
      
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertNotNull(dateTimeZone1);
      assertEquals("-01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes((-283), 1);
      assertEquals("-283:01", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(0);
      TimeZone timeZone0 = dateTimeZone1.toTimeZone();
      DateTimeZone dateTimeZone2 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone2.toString());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(234000000);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 234000000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 234000000
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 1089);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1089
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }
}
