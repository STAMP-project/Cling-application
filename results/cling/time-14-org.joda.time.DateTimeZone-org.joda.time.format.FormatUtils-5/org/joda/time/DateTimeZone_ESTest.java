/*

 * Tue Mar 03 18:08:27 GMT 2020
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn("").when(nameProvider0).getShortName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getShortName((-1151L));
      assertEquals("", string0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+01:00");
      assertEquals("+01:00", dateTimeZone1.toString());
      assertNotNull(dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(10080);
      String string0 = dateTimeZone0.getName((long) 10080);
      assertEquals("+00:00:10.080", string0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+00:00:10.080");
      assertNotNull(dateTimeZone1);
      assertEquals("+00:00:10.080", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffsetFromLocal(228877200000L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("BJ($K}TVCcr$o");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'BJ($K}TVCcr$o' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone1.getMillisKeepLocal(dateTimeZone0, 9223372036854775807L);
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
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(24);
      DateTime dateTime0 = new DateTime();
      dateTime0.withWeekyear(24);
      assertEquals(1583258884939L, dateTime0.getMillis());
      
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+24:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffsetFromLocal(243997200000L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("S");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'S' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DateTimeZone.forID("+00:00");
      DateMidnight dateMidnight0 = null;
      try {
        dateMidnight0 = new DateMidnight(9223372036854775807L);
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
      DateTimeZone.forID((String) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-595));
      String string0 = dateTimeZone0.getName(100L);
      assertEquals("-00:00:00.595", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffsetFromLocal(243997200000L);
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
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffsetFromLocal(243997200000L);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  @Ignore
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffsetFromLocal(228877200000L);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(196);
      String string0 = dateTimeZone0.getName((-996L));
      assertEquals("+196:00", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-9));
      DateTimeZone.getDefault();
      BuddhistChronology.getInstance();
      String string0 = dateTimeZone0.getName((long) 1);
      assertEquals("-09:00", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone.forID((String) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-49));
      String string0 = dateTimeZone0.getShortName((long) (-49));
      assertEquals("-49:00", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(9);
      String string0 = dateTimeZone0.getShortName((long) 9);
      assertEquals("+09:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffsetFromLocal(228877200000L);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      dateTime0.withWeekyear(24);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("tE_k'}?&!G/R-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'tE_k'}?&!G/R-' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal(243997200000L);
      assertEquals(7200000, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-987)).when(dateTimeZone0).getOffset(anyLong());
      doReturn((-317)).when(dateTimeZone0).getStandardOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      dateTimeZone1.isStandardOffset((-317));
      // Undeclared exception!
      try { 
        DateTimeZone.forID(";P*A&'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id ';P*A&'' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn("").when(nameProvider0).getShortName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getShortName(1L);
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
  public void test21()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn("").when(nameProvider0).getShortName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      String string0 = dateTimeZone0.getShortName((long) 1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("txHX7+U3c");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'txHX7+U3c' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName(2299L);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.JAPANESE;
      String string0 = dateTimeZone0.getName(2299L, locale0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.getName((long) 1);
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
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getName(10000L);
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
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      DateTimeZone.setDefault(dateTimeZone0);
      Locale locale0 = Locale.ROOT;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(fixedDateTimeZone0);
      cachedDateTimeZone0.getName((long) (-422), locale0);
      DateTime dateTime0 = new DateTime((long) (-317));
      assertEquals((-317L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn("").when(nameProvider0).getShortName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology.getInstance();
      String string0 = dateTimeZone0.getShortName(2105L);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      dateTimeZone0.isStandardOffset(228877200000L);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      String string0 = dateTimeZone0.getName((-717L));
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      Locale locale0 = Locale.KOREAN;
      String string0 = dateTimeZone0.getName(228877200000L, locale0);
      assertNotNull(string0);
      assertEquals("+02:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      long long0 = dateTimeZone0.getMillisKeepLocal(cachedDateTimeZone0, (-2525L));
      assertEquals((-2525L), long0);
      assertEquals("UTC", cachedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      DateTimeZone.forID((String) null);
      DateTime dateTime0 = new DateTime();
      dateTime0.withWeekyear(41);
      assertEquals(1583258871001L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-987), (-987), (-422), (-1032), (-317)).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)(-317), (-9223372036854775775L)).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTime dateTime0 = new DateTime((long) (-317));
      DateTime dateTime1 = dateTime0.withTimeAtStartOfDay();
      assertEquals((-86399683L), dateTime1.getMillis());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+00:00");
      assertNotNull(dateTimeZone1);
      assertEquals("UTC", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-987)).when(dateTimeZone0).getOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTime dateTime0 = new DateTime((-9223372036854775808L));
      // Undeclared exception!
      try { 
        dateTime0.withTimeAtStartOfDay();
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
  public void test37()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(59);
      DateTime dateTime0 = new DateTime();
      assertEquals(1583258869045L, dateTime0.getMillis());
      
      String string0 = dateTimeZone0.getShortName((long) 59);
      assertEquals("+59:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTime dateTime0 = new DateTime(2147483645L);
      DateTime dateTime1 = dateTime0.plusMonths((-81402810));
      assertEquals((-214068711955688355L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      String string0 = dateTimeZone0.getName((-996L));
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      Locale locale0 = Locale.JAPANESE;
      dateTimeZone0.UTC.getName(9223372036854775807L, locale0);
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
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      dateTimeZone0.getName((long) 1);
      DateTimeZone.setDefault(dateTimeZone1);
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  @Ignore
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
  @Ignore
  public void test43()  throws Throwable  {
      BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2270));
      dateTimeZone0.getShortName((long) (-2270));
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertEquals("Europe/Amsterdam", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.getShortName((long) 1854);
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
  public void test45()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(24);
      String string0 = dateTimeZone0.getShortName((long) 24);
      assertEquals("+24:00", string0);
      
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+24:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      dateTime0.withWeekyear(1476);
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
  public void test47()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1);
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
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1);
      assertEquals((-62135594311000L), dateTime0.getMillis());
      
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
      assertEquals("+01:00", dateTimeZone0.toString());
  }
}
