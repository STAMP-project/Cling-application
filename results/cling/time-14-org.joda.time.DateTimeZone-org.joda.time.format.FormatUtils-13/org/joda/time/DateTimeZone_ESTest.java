/*

 * Tue Mar 03 18:10:21 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.Weeks;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      Locale locale0 = Locale.KOREA;
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(2, 2, 36, 2, 0).when(dateTimeZone0).getOffset(anyLong());
      doReturn(false).when(dateTimeZone0).isFixed();
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      LocalDateTime.now();
      LocalDateTime.now();
      dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("cjVUe32?C]QT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'cjVUe32?C]QT' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone.forID((String) null);
      Period period0 = new Period(31556952000L, 2328L);
      // Undeclared exception!
      try { 
        Weeks.standardWeeksIn(period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot convert period to duration as years is not precise in the period P-1YT-5H-49M-9.672S
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(719527);
      DateTimeZone.setDefault(dateTimeZone0);
      Locale locale0 = Locale.PRC;
      String string0 = dateTimeZone0.getName((long) 719527, locale0);
      assertEquals("+00:11:59.527", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone.forID((String) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(85);
      String string0 = dateTimeZone0.getName((long) 85);
      assertEquals("+00:00:00.085", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(2, 2, 36, 2, 2).when(dateTimeZone0).getOffset(anyLong());
      doReturn(false).when(dateTimeZone0).isFixed();
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.now();
      dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      DateTimeZone.getDefault();
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+01:00");
      // Undeclared exception!
      try { 
        dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 9223372036854775772L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      String string0 = dateTimeZone0.getName(11120827243L);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone.forID("UTC");
      Period period0 = Period.years(52);
      Period period1 = period0.minusDays(52);
      // Undeclared exception!
      try { 
        Weeks.standardWeeksIn(period1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot convert period to duration as years is not precise in the period P52Y-52D
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(2, 2, 36, 36).when(dateTimeZone0).getOffset(anyLong());
      doReturn(false).when(dateTimeZone0).isFixed();
      doReturn((long)36, (long)36).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(1L);
      dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+vko");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+vko\" is malformed at \"vko\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn("+vko").when(dateTimeZone0).getNameKey(anyLong());
      doReturn(2, 2, 26, 740, 2).when(dateTimeZone0).getOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      dateTimeZone1.getName((long) 2);
      dateTimeZone1.convertLocalToUTC(270L, false, 270L);
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeZone.setDefault(fixedDateTimeZone0);
      Period period0 = Period.years(52);
      Period period1 = period0.minusDays(52);
      // Undeclared exception!
      try { 
        Weeks.standardWeeksIn(period1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot convert period to duration as years is not precise in the period P52Y-52D
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      dateMidnight0.minusYears(575);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.UK;
      dateTimeZone0.UTC.getName(9223372036847575807L, locale0);
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(564);
      DateTimeZone.forID((String) null);
      String string0 = dateTimeZone0.getShortName((long) 564);
      assertEquals("+564:00", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone1);
      String string0 = cachedDateTimeZone0.getShortName(2292L);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(2, 2, 36, 2, 2).when(dateTimeZone0).getOffset(anyLong());
      doReturn(false).when(dateTimeZone0).isFixed();
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.now();
      dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      DateTimeZone dateTimeZone2 = DateTimeZone.forID("EET");
      assertEquals("EET", dateTimeZone2.getID());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      EthiopicChronology.getInstance();
      Period period0 = Period.years(1);
      Period period1 = period0.minusDays(2147483645);
      // Undeclared exception!
      try { 
        Weeks.standardWeeksIn(period1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot convert period to duration as years is not precise in the period P1Y-2147483645D
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isStandardOffset(9223372036854775807L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID(" (");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id ' (' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      String string0 = dateTimeZone0.getName((long) 1);
      assertEquals("+00:00:00.001", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.PRC;
      String string0 = dateTimeZone0.getName(240L, locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(32);
      dateTimeZone0.getName((long) 32);
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isStandardOffset(9223372036854775807L);
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      String string0 = dateTimeZone0.getName(822L);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      String string0 = dateTimeZone0.getName((-7200000L), locale0);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      long long0 = dateTimeZone0.convertUTCToLocal(1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn("+vko").when(dateTimeZone0).getNameKey(anyLong());
      doReturn(2, 2, 36, 2, 36).when(dateTimeZone0).getOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      Locale locale0 = Locale.CANADA;
      String string0 = dateTimeZone1.getShortName(1000L, locale0);
      assertEquals("+00:00:00.002", string0);
      
      DateTimeZone dateTimeZone2 = DateTimeZone.forID((String) null);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.getMillisKeepLocal(dateTimeZone2, (-4316L));
      assertEquals((-4352L), long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn("ZV+Vko").when(dateTimeZone0).getNameKey(anyLong());
      doReturn(2, 2, 52, 740, 2).when(dateTimeZone0).getOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      dateTimeZone1.getName((long) 2);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.getMillisKeepLocal(dateTimeZone1, 2);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("l2&z(/)p:'GEQ-T]N4s");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'l2&z(/)p:'GEQ-T]N4s' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+01:00");
      DateTimeZone.setDefault(dateTimeZone1);
      // Undeclared exception!
      try { 
        dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal(11120823558L);
      assertEquals("+00:00:00.001", cachedDateTimeZone0.toString());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeZone.forID("UTC");
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(fixedDateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal((-4281L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(fixedDateTimeZone0);
      cachedDateTimeZone0.getOffsetFromLocal(17L);
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isStandardOffset(9223372036854775807L);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeZone.forID("UTC");
      String string0 = fixedDateTimeZone0.getName(11120827243L);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeZone.forID("UTC");
      Locale locale0 = Locale.TAIWAN;
      String string0 = fixedDateTimeZone0.getName((-33L), locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      // Undeclared exception!
      try { 
        fixedDateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-9223372036854775808L));
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
      LocalDateTime localDateTime0 = new LocalDateTime();
      EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      String string0 = dateTimeZone0.getShortName((long) 1);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(581);
      dateTimeZone0.getShortName((long) 581);
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(575);
      String string0 = dateTimeZone0.getShortName((long) 575);
      assertEquals("+575:00", string0);
      
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+575:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      String string0 = dateTimeZone0.getShortName(10000000000L);
      assertEquals("+00:00:00.001", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateMidnight dateMidnight0 = new DateMidnight(5L);
      DateMidnight dateMidnight1 = dateMidnight0.withYear(59);
      assertEquals((-60305300372000L), dateMidnight1.getMillis());
      assertEquals((-3600000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight dateMidnight1 = dateMidnight0.minusYears(575);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      assertEquals((-16562103572000L), dateMidnight1.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(575);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+00:00:00.575", dateTimeZone0.getID());
      assertEquals("+00:00:00.575", dateTimeZone0.toString());
  }
}
