/*

 * Tue Mar 03 18:08:11 GMT 2020
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
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn("P(G>3eJNk^F3L8-q$1").when(nameProvider0).getShortName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getShortName(2629800000L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("P(G>3eJNk^F3L8-q$1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'P(G>3eJNk^F3L8-q$1' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.TAIWAN;
      dateTimeZone0.getName(3601280L, locale0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      dateMidnight0.withYear(2);
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
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.getMillisKeepLocal(fixedDateTimeZone0, 9223372036854775765L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2991);
      String string0 = dateTimeZone0.getName(4927104L);
      assertEquals("+00:00:02.991", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(42);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      // Undeclared exception!
      try { 
        dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 9223372036854775797L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((String) null).when(dateTimeZone0).getNameKey(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      String string0 = dateTimeZone1.getName(346L);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName(1768L);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone.forID((String) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1));
      String string0 = dateTimeZone0.getShortName((long) (-1));
      assertEquals("-00:00:00.001", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2147483054);
      String string0 = dateTimeZone0.getShortName((long) 2147483054);
      assertEquals("+596:31:23.054", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      dateMidnight0.withCenturyOfEra(2);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("u:CO=/>'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'u:CO=/>'' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isStandardOffset(9223372036847575809L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("6BEc,dl&y_P/$z8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '6BEc,dl&y_P/$z8' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn(".P(G>3eJNk^F3L8-q$^").when(nameProvider0).getShortName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getShortName(2629800000L);
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
  public void test13()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn("P(G>3eJNk^F3L8-q$1").when(nameProvider0).getShortName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      String string0 = dateTimeZone0.getShortName(1L);
      assertEquals("P(G>3eJNk^F3L8-q$1", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(2, 2, 2);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("%ogUmwH`T");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '%ogUmwH`T' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(32);
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName(1710L);
      assertEquals("+32:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.CANADA;
      String string0 = dateTimeZone0.getName((long) (-508), locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(2);
      dateTimeZone0.getName((long) 2);
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
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(2);
      Locale locale0 = Locale.GERMANY;
      dateTimeZone0.UTC.getName((long) 2, locale0);
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
      Locale locale0 = Locale.CANADA_FRENCH;
      dateTimeZone0.getName((-1L), locale0);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn(".P(G>3eJNk^F3L8-q$^").when(nameProvider0).getShortName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getShortName(2629800000L);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withYear(682);
      DateMidnight dateMidnight2 = dateMidnight1.plusYears(682);
      assertEquals(1583190000000L, dateMidnight0.getMillis());
      assertEquals((-19118161172000L), dateMidnight2.getMillis());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone.forID((String) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(8);
      String string0 = dateTimeZone0.getName((long) 8);
      assertEquals("+08:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      Locale locale0 = Locale.CANADA;
      String string0 = dateTimeZone0.getName((-919L), locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+01:00");
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
  public void test25()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis((-2147483612));
      long long0 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (-2147483612));
      assertEquals(0L, long0);
      assertEquals("-596:31:23.612", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      DateTimeZone.setDefault(dateTimeZone0);
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
  @Ignore
  public void test27()  throws Throwable  {
      DateTimeZone.forID((String) null);
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.plusYears((-747));
      assertEquals((-21989837972000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(0, 0).when(dateTimeZone0).getOffset(anyLong());
      doReturn(0L).when(dateTimeZone0).previousTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      int int0 = dateTimeZone1.getOffsetFromLocal((-3385L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.forID((String) null);
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036847575809L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isStandardOffset(9223372036847575809L);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      String string0 = dateTimeZone0.getName(10L);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      Locale locale0 = Locale.JAPAN;
      String string0 = dateTimeZone0.getName((-1L), locale0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((String) null).when(dateTimeZone0).getNameKey(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      String string0 = dateTimeZone1.getShortName(60000L);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(42);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      cachedDateTimeZone0.getShortName((long) 42);
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
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours((-508));
      String string0 = dateTimeZone1.getShortName((long) (-508));
      assertEquals("-508:00", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(2, 2, 2);
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
