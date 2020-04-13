/*

 * Tue Mar 03 18:17:02 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(746);
      Provider provider0 = DateTimeZone.getProvider();
      DateTimeZone.setProvider(provider0);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Locale locale0 = Locale.ROOT;
      String string0 = localDate0.toString("#yUwRYxN(mh~", locale0);
      assertEquals("#00000002020", string0);
      assertEquals("+00:00:00.746", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(89);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 89, false);
      assertEquals((-320399911L), long0);
      
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      String string0 = cachedDateTimeZone0.getName((-352L));
      assertEquals("+89:00", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Set<String> set0 = Calendar.getAvailableCalendarTypes();
      Provider provider0 = mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn(set0).when(provider0).getAvailableIDs();
      // Undeclared exception!
      try { 
        DateTimeZone.setProvider(provider0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The provider doesn't support UTC
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 4L);
      Locale locale0 = Locale.UK;
      LocalDate localDate0 = new LocalDate(3600003L);
      localDate0.toString("-e=n#`'[9z|O", locale0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-3923));
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) mutableDateTime0);
      assertEquals(1583259381099L, mutableDateTime0.getMillis());
      assertEquals((-3923), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.JAPANESE;
      Period period0 = Period.months(417);
      Period period1 = period0.withYears((-1575));
      gJChronology0.add((ReadablePeriod) period1, 1235L, 417);
      try { 
        localDate0.toString("?X0NF.0\"RPjV", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      dateTimeZone0.getShortName(1L);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Locale locale0 = Locale.ROOT;
      localDate0.toString("j", locale0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.of("+00:00");
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(575);
      DateTimeZone.forOffsetHours(117);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 575, true);
      assertEquals("+575:00", dateTimeZone0.getID());
      assertEquals((-2069999425L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(746);
      DateTimeUtils.MillisProvider dateTimeUtils_MillisProvider0 = mock(DateTimeUtils.MillisProvider.class, new ViolatedAssumptionAnswer());
      doReturn((-746L)).when(dateTimeUtils_MillisProvider0).getMillis();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_MillisProvider0);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Locale locale0 = Locale.ROOT;
      String string0 = localDate0.toString("#yUwRYxN(mh~", locale0);
      assertEquals("+00:00:00.746", dateTimeZone0.toString());
      assertEquals("#00000001970", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+01:00");
      assertNotNull(dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC(9223372036854775807L, true, 4L);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Locale locale0 = Locale.ROOT;
      String string0 = localDate0.toString("GMT-GMT-Xb}!8j4f1KL#'.p", locale0);
      assertEquals("AD", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn("Afri").when(nameProvider0).getName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName(9223372036854775807L);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Locale locale0 = Locale.ROOT;
      String string1 = localDate0.toString("GMT-GMT-Xb}!8j4f1KL#'.p", locale0);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDate localDate0 = LocalDate.now((Chronology) islamicChronology0);
      Locale locale0 = Locale.GERMANY;
      localDate0.toString(" :>6rW(%", locale0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.UTC.convertLocalToUTC(10800000L, true);
      Locale locale0 = Locale.GERMANY;
      LocalDate localDate0 = new LocalDate();
      String string0 = localDate0.toString("-2.m5<f]Z)rg3g!", locale0);
      assertEquals("-2.\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn("Afri").when(nameProvider0).getShortName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(122);
      dateTimeZone0.getShortName((long) 119);
      LocalDate localDate0 = new LocalDate(dateTimeZone1);
      Locale locale0 = Locale.ROOT;
      try { 
        localDate0.toString("America/Chicago", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      LocalDate localDate0 = new LocalDate((-3450L));
      try { 
        localDate0.toString("Euro", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
      LocalDate localDate0 = new LocalDate(1L);
      Locale locale0 = Locale.JAPAN;
      try { 
        localDate0.toString("tId/Mb)'/vyj,{]", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(89);
      LocalDate localDate0 = new LocalDate((-1L), dateTimeZone0);
      Locale locale0 = Locale.JAPANESE;
      try { 
        localDate0.toString("org.joda.time.DateTimeFieldType", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Provider provider0 = mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Set<String>) null).when(provider0).getAvailableIDs();
      // Undeclared exception!
      try { 
        DateTimeZone.setProvider(provider0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The provider doesn't have any available ids
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes((-817), (-817));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -817
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC((-9223372036854775803L), false);
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
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Locale locale0 = Locale.JAPANESE;
      localDate0.toString("Gv", locale0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getName(9223372036854775807L);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Locale locale0 = Locale.ROOT;
      localDate0.toString("GMT-GMT-Xb}!8j4f1KL#'.p", locale0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset((-9223372036854775802L), true);
      assertEquals((-9223372036854775802L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.UTC.convertLocalToUTC(10800000L, true);
      assertEquals(10800000L, long0);
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      String string0 = dateTimeZone0.getName((-1053L), locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = LocalDate.now((Chronology) gJChronology0);
      Locale locale0 = Locale.GERMANY;
      localDate0.toString("*NsD`!;xnj.3}/P", locale0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone.setNameProvider((NameProvider) null);
      LocalDate localDate0 = new LocalDate(134L);
      Locale locale0 = Locale.JAPAN;
      try { 
        localDate0.toString("tId/Mb)'/vyj,{]", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      dateTimeZone0.isStandardOffset(1);
      Locale locale0 = Locale.TAIWAN;
      LocalDate localDate0 = new LocalDate();
      String string0 = localDate0.toString("-2.m5<f]Z)rg3g!", locale0);
      assertEquals("-2.\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      Locale locale0 = Locale.UK;
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      try { 
        localDate0.toString("Invalid index: ", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      Locale locale0 = Locale.GERMANY;
      LocalDate localDate0 = new LocalDate();
      String string0 = localDate0.toString("-2.m5<f]Z)rg3g!", locale0);
      assertEquals("-2.\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset((-3599959L), false);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Locale locale0 = Locale.JAPANESE;
      localDate0.toString("7li70F", locale0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 3600000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 3600000
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-292269337));
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Locale locale0 = Locale.ROOT;
      try { 
        localDate0.toString("i!L[E>Hg%[{5p'tlZ", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((-745L), (Chronology) islamicChronology0);
      Locale locale0 = Locale.GERMANY;
      LocalDate localDate0 = new LocalDate();
      String string0 = localDate0.toString("-2.m5<f]Z)rg3g!", locale0);
      assertEquals("-2.\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDate localDate0 = LocalDate.now((Chronology) buddhistChronology0);
      Locale locale0 = Locale.UK;
      localDate0.toString("MST", locale0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone.forOffsetHours(0);
      LocalDate localDate0 = new LocalDate(1L);
      Locale locale0 = Locale.JAPAN;
      try { 
        localDate0.toString("tId/Mb)'/vyj,{]", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(746);
      DateTimeZone.setDefault(dateTimeZone0);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Locale locale0 = Locale.ROOT;
      String string0 = localDate0.toString("#yUwRYxN(mh~", locale0);
      assertEquals("+00:00:00.746", dateTimeZone0.getID());
      assertEquals("#00000002020", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((DateTimeZone) null);
      Locale locale0 = Locale.ROOT;
      try { 
        localDate0.toString("eaBl'h}+@&-%li", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset(9223372036847575804L, true);
      Locale locale0 = Locale.JAPAN;
      java.time.Instant instant0 = java.time.Instant.now();
      Date date0 = Date.from(instant0);
      LocalDate localDate0 = LocalDate.fromDateFields(date0);
      try { 
        localDate0.toString("*Qi-Y", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-501));
      TimeZone timeZone0 = TimeZone.getTimeZone(")wwJeeMUmw&q}M$o");
      DateTimeZone.forTimeZone(timeZone0);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      LocalDate localDate0 = new LocalDate((DateTimeZone) cachedDateTimeZone0);
      Locale locale0 = Locale.ROOT;
      localDate0.toString("%FP~Y*eELgy", locale0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(746);
      DateTimeZone.forOffsetMillis(746);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Locale locale0 = Locale.ROOT;
      String string0 = localDate0.toString("#yUwRYxN(mh~", locale0);
      assertEquals("#00000002020", string0);
      assertEquals("+00:00:00.746", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.forID((String) null);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Locale locale0 = Locale.ROOT;
      try { 
        localDate0.toString("X><-F$ik<bESu", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((DateTimeZone) null);
      Locale locale0 = Locale.ROOT;
      try { 
        localDate0.toString("Z!L[E>Hg%[{5ptlZ", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getShortName((-9223372036854775805L));
      Locale locale0 = Locale.GERMANY;
      LocalDate localDate0 = new LocalDate();
      localDate0.toString("-2.m5<f]Z)rg3g!", locale0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-292269337));
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      Locale locale0 = Locale.UK;
      dateTimeZone1.UTC.getShortName((-2512L), locale0);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      localDate0.toString("G;OQ8<asSwu1;6zc", locale0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.JAPANESE;
      Period period0 = Period.months(417);
      gJChronology0.add((ReadablePeriod) period0, 1235L, 417);
      try { 
        localDate0.toString("?X0NF.0\"RPjV", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-292269337));
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      cachedDateTimeZone0.getOffsetFromLocal((-904L));
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Locale locale0 = Locale.ROOT;
      try { 
        localDate0.toString("qZMWw)EhT')iRKI'}#", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test50()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDate localDate0 = LocalDate.now((Chronology) gJChronology0);
      localDate0.toString("3J1oz@", locale0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test51()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone.forTimeZone(timeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDate localDate0 = LocalDate.now((Chronology) buddhistChronology0);
      Locale locale0 = Locale.UK;
      localDate0.toString("GMT+GMT-18:00", locale0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test52()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(746);
      long long0 = dateTimeZone0.convertLocalToUTC(0L, false);
      assertEquals((-746L), long0);
      
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Locale locale0 = Locale.ROOT;
      String string0 = localDate0.toString("#yUwRYxN(mh~", locale0);
      assertEquals("+00:00:00.746", dateTimeZone0.toString());
      assertEquals("#00000002020", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC((-9223372036854775802L), true, (-9223372036854775802L));
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
  public void test54()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(746);
      DateTimeZone.setProvider((Provider) null);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Locale locale0 = Locale.ROOT;
      localDate0.toString("#yUwRYxN(mh~", locale0);
  }
}
