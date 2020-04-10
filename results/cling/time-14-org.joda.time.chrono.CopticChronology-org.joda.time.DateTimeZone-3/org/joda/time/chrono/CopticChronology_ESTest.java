/*

 * Tue Mar 03 17:42:13 GMT 2020
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
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CopticChronology_ESTest extends CopticChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusHours(1);
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 2949);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 2949
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(362);
      assertEquals((-41791939200000L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      try { 
        DateTimeZone.forOffsetHoursMinutes(15360, 3660000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 3660000
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.convertLocalToUTC((long) 1, false);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("o");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'o' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC((long) 1, true);
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
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(2063);
      assertEquals(11887516800000L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
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
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Chronology chronology0 = copticChronology0.withZone(fixedDateTimeZone0);
      assertNotSame(chronology0, copticChronology0);
      
      LocalDateTime localDateTime0 = new LocalDateTime(chronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("PLT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'PLT' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(2063);
      assertEquals(11887516800000L, long1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-767059200000L));
      assertEquals((-767059200000L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(2154);
      assertEquals(14759280000000L, long1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      assertEquals("+00:01", dateTimeZone1.getID());
      
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      CopticChronology copticChronology1 = CopticChronology.getInstance((DateTimeZone) null);
      assertSame(copticChronology1, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
      
      Chronology chronology0 = copticChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      Chronology chronology0 = copticChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusMinutes(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, copticChronology0);
      assertEquals("+01:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      Chronology chronology0 = copticChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, copticChronology0);
      
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals(1L, long0);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusHours(1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes((-216), 1);
      assertEquals("-216:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals("+01:00", dateTimeZone0.toString());
      assertEquals(1L, long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes((-87), 1);
      assertEquals("-87:01", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      copticChronology0.assemble(assembledChronology_Fields0);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      try { 
        DateTimeZone.forOffsetHoursMinutes(3026, (-2754));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2754
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      try { 
        DateTimeZone.forOffsetHoursMinutes(1, (-2425));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2425
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-3599999L), long0);
      
      long long1 = copticChronology0.calculateFirstDayOfYearMillis(423);
      assertEquals((-39866947200000L), long1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-W");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-W\" is malformed at \"W\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-W");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-W\" is malformed at \"W\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-|axK&RN,S>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-|axK&RN,S>\" is malformed at \"|axK&RN,S>\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC((long) 1, true);
      try { 
        DateTimeZone.forOffsetHoursMinutes(9, (-2425));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -2425
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("v0J3+QG'aXB");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'v0J3+QG'aXB' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      copticChronology0.withZone((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      try { 
        DateTimeZone.forOffsetHoursMinutes(545, 545);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 545
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-3599999L), long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      localDateTime0.plusDays(4);
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone.forTimeZone(timeZone0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(";r$aJh9'Pi");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
      assertEquals((-3599999L), long0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      assertEquals("UTC", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours((-493));
      long long0 = dateTimeZone1.convertLocalToUTC((-1475L), true);
      assertEquals("-493:00", dateTimeZone1.toString());
      assertEquals(1774798525L, long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHoursMinutes(46, 1);
      copticChronology0.withZone(dateTimeZone1);
      assertEquals("+46:01", dateTimeZone1.toString());
      assertEquals("+46:01", dateTimeZone1.getID());
  }
}
