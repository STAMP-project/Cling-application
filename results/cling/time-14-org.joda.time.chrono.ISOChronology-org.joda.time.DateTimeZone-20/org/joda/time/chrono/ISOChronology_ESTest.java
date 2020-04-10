/*

 * Tue Mar 03 17:54:25 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.CopticChronology;
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
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset(15308640144L, false);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Chronology chronology0 = iSOChronology0.withZone(dateTimeZone0);
      assertSame(iSOChronology0, chronology0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
      long long0 = dateTimeZone0.adjustOffset(0, false);
      assertEquals(0L, long0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775765L), false);
      assertEquals((-9223372036854775765L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset((-9223372036854775785L), false);
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.adjustOffset(1270L, false);
      assertEquals(1270L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-175));
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("-00:00:00.175");
      assertEquals("-00:00:00.175", dateTimeZone1.toString());
      
      long long0 = dateTimeZone0.adjustOffset((-175), true);
      assertEquals((-175L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset((-9223372036854775785L), false);
      try { 
        DateTimeZone.forOffsetHoursMinutes(64799986, (-1023));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1023
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
      assertNotNull(dateTimeZone0);
      
      long long0 = dateTimeZone0.adjustOffset((-5L), false);
      assertEquals((-5L), long0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset((-9223372036854775781L), true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("&,YXcT%3Zjon");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '&,YXcT%3Zjon' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-175));
      dateTimeZone0.adjustOffset((-175), false);
      try { 
        DateTimeZone.forOffsetHoursMinutes(175, 175);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 175
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-161));
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("-00:00:00.161", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours((-161));
      assertEquals("-161:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-13));
      assertEquals("-13:00", dateTimeZone0.getID());
      
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = new LocalDateTime(10000000000000L);
      fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
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
  public void test16()  throws Throwable  {
      ISOChronology.getInstance();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      assertEquals("+00:00:00.001", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset((-9223372036854775781L), true);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775774L), false);
      assertEquals((-9223372036854775774L), long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+01:00");
      assertEquals("+01:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset((-9223372036854775781L), true);
      try { 
        DateTimeZone.forOffsetHoursMinutes(873, 873);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 873
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775781L), true);
      assertEquals((-9223372036854775781L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset(0L, true);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset(9223372036854775807L, false);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      DateTimeZone.setNameProvider(defaultNameProvider0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime.now(dateTimeZone0);
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      DateTimeZone.setNameProvider(nameProvider0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset(9223372036854775807L, false);
      try { 
        DateTimeZone.forOffsetHoursMinutes(3114, 3114);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 3114
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone.forTimeZone((TimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-170));
      LocalDateTime localDateTime0 = new LocalDateTime();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("-00:00:00.170", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-161));
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("-00:00:00.161", dateTimeZone0.getID());
      
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, iSOChronology0);
      
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      boolean boolean1 = dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.toString());
      
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(57, "PST");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(simpleTimeZone0);
      long long0 = dateTimeZone1.adjustOffset(9223372036854775807L, false);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusMonths(91);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, false);
      assertEquals(9223372036854775807L, long0);
      
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Chronology chronology0 = iSOChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
      long long0 = dateTimeZone0.adjustOffset((-1L), false);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-6));
      long long0 = dateTimeZone0.adjustOffset((-6), false);
      assertEquals((-6L), long0);
      
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      iSOChronology0.withZone((DateTimeZone) null);
      assertEquals("-00:00:00.006", dateTimeZone0.getID());
      assertEquals("-00:00:00.006", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, false);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("]L@j.jK:{Y8M|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id ']L@j.jK:{Y8M|' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(0L, false);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-175));
      dateTimeZone0.adjustOffset((-175), false);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-175), (-175));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -175
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      iSOChronology0.withZone((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775781L), true);
      assertEquals((-9223372036854775781L), long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset(9223372036854775807L, true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("Vc2dzDv");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'Vc2dzDv' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, false);
      assertEquals(9223372036854775807L, long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+18:00");
      assertEquals("+18:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone.forID("+00:00");
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalDateTime.now((Chronology) iSOChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("-00:00:00.161");
      assertEquals("-00:00:00.161", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-943), (-943));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -943
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-964), (-964));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -964
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset((-9223372036854775794L), true);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("Y]y*?$'rT&s|&WOG").when(dateTimeZone0).getID();
      ISOChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone1.adjustOffset((-9223372036854775785L), false);
      assertEquals((-9223372036854775785L), long0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775781L), true);
      assertEquals((-9223372036854775781L), long0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775785L), false);
      assertEquals((-9223372036854775785L), long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(91, 53);
      assertEquals("+91:53", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(1000000000000L, false);
      assertEquals(1000000000000L, long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset(9223372036854775807L, false);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset((-9223372036854775785L), false);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      Chronology chronology0 = iSOChronology0.withZone(dateTimeZone0);
      assertSame(iSOChronology0, chronology0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset((-9223372036854775785L), false);
      try { 
        DateTimeZone.forOffsetHours((-1006));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 58);
      dateTimeZone0.adjustOffset(58, false);
      assertEquals("+00:58", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, true);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1645, 1645);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1645
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(91, 91);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 91
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone0.getID());
      assertNotNull(dateTimeZone0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone1.adjustOffset((-9223372036854775785L), false);
      assertEquals((-9223372036854775785L), long0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
      
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, true);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      LocalDateTime localDateTime0 = new LocalDateTime(1702L);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      boolean boolean0 = fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      LocalDateTime localDateTime0 = new LocalDateTime(921L);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+00:00");
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) iSOChronology0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+00:00");
      assertEquals("UTC", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-175));
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("-00:00:00.175");
      assertEquals("-00:00:00.175", dateTimeZone1.toString());
      assertNotNull(dateTimeZone1);
      
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-175));
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+01:00");
      assertEquals("+01:00", dateTimeZone1.getID());
      assertNotNull(dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      assertEquals("+00:01", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(25);
      assertEquals("+25:00", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone1.adjustOffset(9223372036854775807L, false);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset(9223372036854775807L, false);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-1605), (-948));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -948
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(15);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(31557600000L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(8, 8);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      assertEquals("+08:08", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775774L), false);
      assertEquals((-9223372036854775774L), long0);
      
      TimeZone timeZone0 = TimeZone.getTimeZone("pOMG}IYet!Zc");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("+18:00", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone1);
      
      long long0 = dateTimeZone1.adjustOffset(9223372036854775807L, false);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(122);
      assertEquals("+122:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      LocalDateTime localDateTime0 = new LocalDateTime((-858L));
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.getID());
      
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 45);
      LocalDateTime localDateTime0 = new LocalDateTime(21859200000L, dateTimeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("+00:45", dateTimeZone0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-13));
      dateTimeZone0.adjustOffset((-13), true);
      assertEquals("-13:00", dateTimeZone0.toString());
  }
}
