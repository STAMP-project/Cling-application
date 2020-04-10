/*

 * Tue Mar 03 18:08:41 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      String string0 = dateTimeZone0.getShortName(9223372036854775807L);
      assertNotNull(string0);
      assertEquals("+02:00", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertUTCToLocal(9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertUTCToLocal(31420800L);
      assertEquals(35020800L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      String string0 = dateTimeZone0.getName((long) 2484, locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone.forID("UTC");
      LocalDateTime localDateTime0 = new LocalDateTime();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(57);
      String string0 = dateTimeZone0.getName((long) 57);
      assertEquals("+57:00", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(36);
      Locale locale0 = Locale.US;
      dateTimeZone0.UTC.getName((long) 36, locale0);
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
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertUTCToLocal(9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(801);
      String string0 = dateTimeZone0.getName((long) 801);
      assertEquals("+00:00:00.801", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.convertLocalToUTC(228877200000L, false);
      assertEquals(228873600000L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(2, 2, (-2146277179), 2, (-2146277179)).when(dateTimeZone0).getOffset(anyLong());
      BuddhistChronology.getInstance(dateTimeZone0);
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
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.UTC.getName(31449600000L);
      LocalDateTime localDateTime0 = new LocalDateTime();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      Locale locale0 = Locale.GERMAN;
      String string0 = dateTimeZone0.getName((-1L), locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone.forID((String) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(36);
      Locale locale0 = Locale.PRC;
      String string0 = dateTimeZone0.getShortName((long) 36, locale0);
      assertEquals("+36:00", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(38, 38);
      String string0 = dateTimeZone0.getShortName((long) 38);
      assertEquals("+38:38", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isStandardOffset(766619999998L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("5azj.K}Rgi");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '5azj.K}Rgi' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((long) 57);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.CHINESE;
      String string0 = dateTimeZone0.getName((-7200000L), locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(232);
      dateTimeZone0.getName((long) 232);
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
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(57);
      dateTimeZone1.getName((long) 57);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(2, 2, (-2146277179), 2, (-2146277179)).when(dateTimeZone0).getOffset(anyLong());
      BuddhistChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("R3msZXG");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'R3msZXG' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn("lh'zf2a*1-''P`<").when(nameProvider0).getShortName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      Locale locale0 = Locale.UK;
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getShortName((-732L), locale0);
      Period period0 = null;
      try {
        period0 = new Period("lh'zf2a*1-''P`<");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"lh'zf2a*1-''P`<\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isStandardOffset(766619999985L);
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
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isStandardOffset(766619999998L);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(4);
      dateTimeZone0.getName((long) 4);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      Locale locale0 = Locale.ITALY;
      String string0 = dateTimeZone0.getName(492L, locale0);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.withWeekyear(45);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      LocalDate localDate0 = new LocalDate((DateTimeZone) cachedDateTimeZone0);
      assertEquals("UTC", cachedDateTimeZone0.toString());
      assertEquals("UTC", cachedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.convertLocalToUTC(766619999998L, false, 176L);
      assertEquals(766612799998L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(36, 36, (-2146277213), 36, (-2146277213)).when(dateTimeZone0).getOffset(anyLong());
      BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(36);
      DateTimeZone.setDefault(dateTimeZone1);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      // Undeclared exception!
      try { 
        dateTimeZone0.convertUTCToLocal(9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal((-1L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isStandardOffset(766619999998L);
      LocalDate localDate0 = LocalDate.now();
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateMidnight dateMidnight0 = DateMidnight.now();
      assertEquals(1583193600000L, dateMidnight0.getMillis());
      
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2005031520));
      String string0 = dateTimeZone0.getShortName((long) (-2005031520));
      assertEquals("-556:57:11.520", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal((-1171L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(36);
      DateTimeZone.setDefault(dateTimeZone0);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal(2149576526L);
      assertEquals("+36:00", cachedDateTimeZone0.toString());
      assertEquals(129600000, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertNotNull(dateTimeZone0);
      
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      String string0 = dateTimeZone0.getName((long) 801);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      Locale locale0 = Locale.US;
      String string0 = dateTimeZone0.getName(0L, locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      Locale locale0 = Locale.CANADA;
      dateTimeZone0.getName((long) 1, locale0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertEquals("Europe/Amsterdam", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      BuddhistChronology.getInstance();
      String string0 = dateTimeZone0.getShortName((-324001972L));
      assertEquals("+01:01", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(36);
      dateTimeZone0.getShortName((long) 36);
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
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(232);
      DateTimeZone.setDefault(dateTimeZone0);
      String string0 = dateTimeZone0.getShortName((long) 232);
      assertEquals("+232:00", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
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
}
