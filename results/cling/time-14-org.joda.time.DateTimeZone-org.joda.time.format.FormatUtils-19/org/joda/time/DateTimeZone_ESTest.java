/*

 * Tue Mar 03 18:11:18 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.UK;
      String string0 = dateTimeZone0.getName(10L, locale0);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffsetFromLocal(228877200000L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("NoLimit");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'NoLimit' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getShortName((long) (-1123));
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
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC(228877200000L, true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("++3r,EV<tR");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"++3r,EV<tR\" is malformed at \"+3r,EV<tR\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName(9999995101199999L);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(46);
      Locale locale0 = Locale.ITALY;
      dateTimeZone0.getName((long) 46, locale0);
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
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(102, 17971875, (-353), 2220).when(dateTimeZone0).getOffset(anyLong());
      doReturn(17971875).when(dateTimeZone0).getStandardOffset(anyLong());
      doReturn(0L, 0L).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      dateTimeZone1.isStandardOffset(102);
      dateTimeZone1.getOffset((long) 102);
      dateTimeZone1.getOffsetFromLocal(17971875);
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
      dateTimeZone0.getOffsetFromLocal(228877200000L);
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
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffsetFromLocal(228877200000L);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
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
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(40);
      dateTimeZone0.getName((long) 40, (Locale) null);
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertEquals("+40:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName(694L);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      dateTimeZone0.getName((-3599468L), locale0);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-222));
      DateTimeZone.forID("UTC");
      String string0 = dateTimeZone0.getShortName((long) (-222));
      assertEquals("-222:00", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.forID((String) null);
      int int0 = dateTimeZone0.getOffsetFromLocal(228877200000L);
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(216000000, 59, 216000000, 0).when(dateTimeZone0).getOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      dateTimeZone1.convertLocalToUTC((long) 216000000, false, 5845632L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("KPqmMs|fOW$N>9brL");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'KPqmMs|fOW$N>9brL' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn("CET").when(dateTimeZone0).getNameKey(anyLong());
      doReturn(3600000, (-1044), (-676)).when(dateTimeZone0).getOffset(anyLong());
      doReturn(3358L, 0L).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      dateTimeZone1.getShortName(3358L);
      dateTimeZone1.getOffsetFromLocal(3600000);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '3' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(142).when(dateTimeZone0).getOffset(anyLong());
      doReturn(496).when(dateTimeZone0).getStandardOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      dateTimeZone1.isStandardOffset(142);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("QX");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'QX' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(46);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      cachedDateTimeZone0.getOffsetFromLocal(46);
      assertEquals("+46:00", cachedDateTimeZone0.toString());
      
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertNotSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(37);
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone.getDefault();
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      String string0 = cachedDateTimeZone0.getName((long) 37);
      assertEquals("+37:00", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(46);
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone.getDefault();
      Locale locale0 = Locale.JAPANESE;
      String string0 = dateTimeZone0.getName((-2099L), locale0);
      assertEquals("+46:00", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2511);
      dateTimeZone0.getName(1440L);
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
  public void test22()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      cachedDateTimeZone0.getName((long) 33);
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal((-257L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      boolean boolean0 = dateTimeZone1.isStandardOffset(228877200000L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(40);
      dateTimeZone0.getName((long) 40, (Locale) null);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      Locale locale0 = Locale.GERMANY;
      String string0 = dateTimeZone0.getName(766620000006L, locale0);
      assertEquals("+02:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(3599998, 3599998).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)3599998).when(dateTimeZone0).previousTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      int int0 = dateTimeZone1.getOffsetFromLocal(3599998);
      assertEquals(3599998, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(41);
      // Undeclared exception!
      try { 
        dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(37);
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 873L);
      assertEquals(133200873L, long0);
      assertEquals("+37:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(3599998).when(dateTimeZone0).getOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone1.convertUTCToLocal(9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-509));
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getShortName((long) (-509));
      assertEquals("-509:00", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal((-388L));
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(57);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      cachedDateTimeZone0.getOffsetFromLocal(57);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(374, 114, 374, (-1344)).when(dateTimeZone0).getOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(2511);
      dateTimeZone1.getMillisKeepLocal((DateTimeZone) null, 374);
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
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(46);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      cachedDateTimeZone0.getOffsetFromLocal(46);
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
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertNotNull(dateTimeZone0);
      
      boolean boolean0 = dateTimeZone0.isStandardOffset(10000000000000000L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      String string0 = dateTimeZone0.getName((-1474L));
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(10);
      DateTimeZone.forID("UTC");
      Locale locale0 = Locale.CHINA;
      String string0 = dateTimeZone0.getName((long) 10, locale0);
      assertEquals("+10:00", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(37);
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("+37:00", dateTimeZone1.getID());
      
      String string0 = dateTimeZone0.getShortName((long) 37);
      assertEquals("+37:00", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(46);
      Locale locale0 = Locale.ENGLISH;
      dateTimeZone0.getShortName((long) 46, locale0);
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
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-509));
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone1);
      
      String string0 = dateTimeZone0.getShortName((long) (-509));
      assertEquals("-509:00", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      // Undeclared exception!
      try { 
        dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      TimeZone timeZone0 = TimeZone.getTimeZone("(-Vz>'Hp2e1.");
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      // Undeclared exception!
      try { 
        dateTimeZone1.getMillisKeepLocal(dateTimeZone0, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }
}
