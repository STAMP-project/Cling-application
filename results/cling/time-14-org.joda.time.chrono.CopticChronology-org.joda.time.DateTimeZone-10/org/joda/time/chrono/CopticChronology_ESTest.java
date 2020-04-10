/*

 * Tue Mar 03 17:43:40 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.Provider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CopticChronology_ESTest extends CopticChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime.now((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      assertEquals("+00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      localDateTime0.withTime(1, 1, 1, 1);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(2563);
      assertEquals(27666316800000L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      localDateTime0.withDate(1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1023, 801);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 801
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.convertLocalToUTC(0L, false);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+xOL2QuhO<E@6D@");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+xOL2QuhO<E@6D@\" is malformed at \"xOL2QuhO<E@6D@\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      copticChronology0.assemble(assembledChronology_Fields0);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals(1L, long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(3600011);
      assertEquals(113554491321600000L, long1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC(26L, false);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals((-3599974L), long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes((-207), 2);
      assertEquals("-207:02", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      localDateTime0.withMonthOfYear(1);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, (-24));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -24
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      localDateTime0.withDate(1, 1, 1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+xOL2QuhO<E@6D@");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+xOL2QuhO<E@6D@\" is malformed at \"xOL2QuhO<E@6D@\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+,~ICQ1KyC(bo?okBQ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+,~ICQ1KyC(bo?okBQ\" is malformed at \",~ICQ1KyC(bo?okBQ\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      localDateTime0.withHourOfDay(1);
      // Undeclared exception!
      try { 
        CopticChronology.getInstance((DateTimeZone) null, 575);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 575
         //
         verifyException("org.joda.time.chrono.CopticChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime.now((Chronology) copticChronology0);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, 337);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 337
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      long long0 = dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 1);
      assertEquals("UTC", dateTimeZone0.toString());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      copticChronology0.assemble(assembledChronology_Fields0);
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
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      localDateTime0.withMonthOfYear(1);
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
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      localDateTime0.withDate(1, 1, 1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("k}CljkEAo{Ai~96j");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'k}CljkEAo{Ai~96j' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(1);
      assertEquals("+01:00", dateTimeZone1.toString());
      
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC(644L, true);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals((-3599356L), long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(4023);
      assertEquals(73740412800000L, long1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.withDate(1, 1, 1);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      localDateTime0.withDate(1, 1, 1);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(2757);
      assertEquals(33788534400000L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
      assertEquals("+01:00", dateTimeZone0.getID());
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(3600000);
      assertEquals(113554144252800000L, long1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime.now((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
      assertEquals("+01:00", dateTimeZone0.toString());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      assertEquals("+00:01", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CopticChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(259);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-20742998400000L));
      assertEquals((-20742067172000L), long0);
      assertEquals("+259:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      localDateTime0.withYearOfCentury(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      CopticChronology copticChronology1 = (CopticChronology)copticChronology0.withZone(dateTimeZone1);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
      
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertNotSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      localDateTime0.withDate(1, 1, 1);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-69780), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset is too large
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-434));
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 0L);
      assertEquals("-434:00", dateTimeZone0.getID());
      assertEquals((-1566000000L), long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC(26L, false);
      assertEquals((-3599974L), long0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals(1L, long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertNotSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime.now((Chronology) copticChronology0);
      CopticChronology copticChronology1 = new CopticChronology((Chronology) null, "N*Vtt+caM2H@B,\"^f}A", 1);
      assertFalse(copticChronology1.equals((Object)copticChronology0));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      copticChronology0.assemble(assembledChronology_Fields0);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      localDateTime0.withDate(1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC(0L, true);
      assertEquals((-3600000L), long0);
      assertEquals("+01:00", dateTimeZone0.toString());
      
      TimeZone timeZone0 = TimeZone.getTimeZone("ydxt; ]");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      try { 
        DateTimeZone.forOffsetHoursMinutes((-447), (-2311));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2311
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime.now((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      DateTimeZone.forOffsetHours(0);
      long long0 = dateTimeZone0.convertLocalToUTC(142L, true);
      assertEquals((-3599858L), long0);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      copticChronology0.calculateFirstDayOfYearMillis(58);
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
  public void test47()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals((-3599999L), long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-53184211200000L), long1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1105199985);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-1105199984L), long0);
      assertEquals("+306:59:59.985", dateTimeZone0.toString());
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(1105199985);
      assertEquals((-2016082316551903232L), long1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
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
  public void test50()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime.now((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
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
  public void test52()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, (-3428));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -3428
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
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
  public void test54()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1105199985);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-1105199984L), long0);
      
      Chronology chronology1 = chronology0.withZone(dateTimeZone0);
      assertEquals("+306:59:59.985", dateTimeZone0.getID());
      assertNotSame(chronology1, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC((long) 1, false);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("UTC");
      assertEquals("UTC", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      try { 
        DateTimeZone.forOffsetHoursMinutes(1877, 1877);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 1877
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime.now((Chronology) copticChronology0);
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      localDateTime0.withDate(1, 1, 1);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
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
  public void test62()  throws Throwable  {
      CopticChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.convertLocalToUTC(0L, true);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }
}
