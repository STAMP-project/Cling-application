/*

 * Tue Mar 03 18:18:20 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-27));
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.UTC.convertLocalToUTC(916L, false);
      assertEquals(916L, long0);
      assertEquals("-00:00:00.027", dateTimeZone0.getID());
      
      Locale locale0 = Locale.JAPAN;
      String string0 = dateTimeZone1.getShortName((-12219292800000L), locale0);
      assertNotNull(string0);
      assertEquals("+00:19:32", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(0L, dateTimeZone0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffsetFromLocal((-766620000001L));
      assertEquals(7200000, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn("H").when(nameProvider0).getName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName(346L);
      assertEquals("H", string0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long0 = fixedDateTimeZone0.convertLocalToUTC((-2083L), true);
      assertEquals((-2083L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC(364L, false, (-766623600001L));
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      DateTimeZone.setNameProvider(nameProvider0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC(364L, false, (-766623600001L));
      Locale locale0 = new Locale("+00:19:32");
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      String string0 = localDate0.toString("AST", locale0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Locale locale0 = new Locale("Or_");
      LocalDate localDate0 = new LocalDate((long) 3600000);
      localDate0.toString("(eQwR", locale0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(228877200007L, true, 9223372036854775807L);
      assertEquals(228873600007L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(dateTimeZone1);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+03:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.adjustOffset(9223372036854775807L, false);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      long long1 = fixedDateTimeZone0.convertLocalToUTC(9223372036854775807L, true);
      assertTrue(long1 == long0);
      assertEquals(9223372036854775807L, long1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDateTime localDateTime0 = new LocalDateTime();
      fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      LocalDate localDate0 = new LocalDate();
      Locale locale0 = Locale.GERMAN;
      try { 
        localDate0.toString("PRT", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.UTC.getOffset((ReadableInstant) null);
      Locale locale0 = Locale.KOREA;
      LocalDate localDate0 = LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      localDate0.toString("-$JU/tdQ*+EoB", locale0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      LocalDate localDate0 = new LocalDate();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay((DateTimeZone) null);
      dateTimeZone0.getOffset((ReadableInstant) dateTime0);
      Locale locale0 = Locale.FRANCE;
      localDate0.toString("W}*G)z\"#rK\"", locale0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(fixedDateTimeZone0);
      Locale locale0 = Locale.TAIWAN;
      DateTimeZone.setDefault(cachedDateTimeZone0);
      LocalDate localDate0 = new LocalDate();
      String string0 = localDate0.toString("5Gm+?#p7*", locale0);
      assertEquals("\u897F\u5143+?#7*", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      LocalDate localDate0 = LocalDate.fromCalendarFields(gregorianCalendar0);
      localDate0.toString("Zone must not be null", locale0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Provider provider0 = mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Set) null).when(provider0).getAvailableIDs();
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
  public void test17()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(3L);
      Locale locale0 = Locale.JAPANESE;
      try { 
        localDate0.toString("t;IMx2Lg?h;]UUV", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(228877200007L, false, 9223372036854775807L);
      assertEquals(228873600007L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      long long0 = dateTimeZone0.convertLocalToUTC(3600000L, true);
      assertEquals(3599997L, long0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+00:00:00.003");
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+00:00:00.003", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      LocalDate localDate0 = new LocalDate();
      try { 
        localDate0.toString("[Gqi$3I", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-27));
      dateTimeZone0.getName((-171L));
      Locale locale0 = Locale.JAPAN;
      LocalDate localDate0 = new LocalDate();
      try { 
        localDate0.toString("Illegal instant due to time zone offset transition: ", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) buddhistChronology0);
      try { 
        localDate0.toString("UTC", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-27));
      dateTimeZone0.UTC.convertLocalToUTC(916L, false);
      Provider provider0 = DateTimeZone.getProvider();
      DateTimeZone.setProvider(provider0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 3);
      LocalDate localDate0 = new LocalDate();
      Locale locale0 = Locale.UK;
      localDate0.toString("Years", locale0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone.forOffsetHours((-27));
      Locale locale0 = Locale.JAPAN;
      LocalDate localDate0 = new LocalDate();
      try { 
        localDate0.toString("Illegal instant due to time zone offset transition: ", locale0);
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
  public void test26()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      DateTimeZone.forOffsetHoursMinutes(51, 3);
      Locale locale0 = Locale.FRANCE;
      localDate0.toString("W}*G)z\"#rK\"", locale0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone.forOffsetMillis((-27));
      DateTimeZone.forOffsetMillis((-27));
      Locale locale0 = Locale.JAPAN;
      LocalDate localDate0 = new LocalDate();
      try { 
        localDate0.toString("Illegal instant due to time zone offset transition: ", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal((-2280L));
      assertEquals(3, int0);
      
      long long0 = dateTimeZone0.convertLocalToUTC(3600000L, true);
      assertEquals("+00:00:00.003", dateTimeZone0.toString());
      assertEquals(3599997L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(fixedDateTimeZone0);
      Locale locale0 = Locale.TAIWAN;
      cachedDateTimeZone0.getName((-61L), locale0);
      LocalDate localDate0 = new LocalDate();
      localDate0.toString("5Gm+?#p7*", locale0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getShortName(31622400000L);
      Locale locale0 = Locale.JAPAN;
      LocalDate localDate0 = new LocalDate();
      try { 
        localDate0.toString("Illegal instant due to time zone offset transition: ", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone.setNameProvider((NameProvider) null);
      LocalDate localDate0 = new LocalDate();
      Locale locale0 = Locale.UK;
      try { 
        localDate0.toString("nJ9k= 7~cs *(D2", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      Locale locale0 = Locale.JAPAN;
      LocalDate localDate0 = new LocalDate();
      try { 
        localDate0.toString("Illegal instant due to time zone offset transition: ", locale0);
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
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      LocalDate localDate0 = new LocalDate();
      dateTimeZone0.adjustOffset(44L, true);
      Locale locale0 = Locale.FRANCE;
      localDate0.toString("W}*G)z\"#rK\"", locale0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(364L, false, (-766623600001L));
      assertEquals((-3599636L), long0);
      
      long long1 = dateTimeZone0.adjustOffset((-766623600001L), false);
      assertEquals((-766623600001L), long1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Locale locale0 = Locale.GERMAN;
      localDate0.toString("HST", locale0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("XqWC,%',K3/", (String) null).when(timeZone0).getID();
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(timeZone0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.adjustOffset((-766623600001L), false);
      Locale locale0 = new Locale("+00:19:32");
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      localDate0.toString("AST", locale0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      fixedDateTimeZone0.convertLocalToUTC((-2083L), true);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("XnThg");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'XnThg' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/New_York");
      int int0 = dateTimeZone0.getOffsetFromLocal(1329L);
      assertEquals((-18000000), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      DateTimeZone.forTimeZone((TimeZone) null);
      Locale locale0 = new Locale("lHRg");
      LocalDate localDate0 = new LocalDate((-1L));
      localDate0.toString("w*uP}CwqN-l/,G", locale0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      Locale locale0 = Locale.TAIWAN;
      TimeZone timeZone0 = TimeZone.getTimeZone("n@WDO&&");
      DateTimeZone.forTimeZone(timeZone0);
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      try { 
        localDate0.toString("n@WDO&&", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 3);
      dateTimeZone0.previousTransition(3);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      int int0 = cachedDateTimeZone0.getOffset(3L);
      assertEquals(3, int0);
      
      LocalDate localDate0 = LocalDate.now();
      Locale locale0 = Locale.UK;
      String string0 = localDate0.toString("m,6GD_aZ", locale0);
      assertEquals("\uFFFD,6AD63_\uFFFD", string0);
      
      localDate0.withDayOfYear(3);
      String string1 = dateTimeZone0.getShortName((long) 3);
      assertEquals("+00:00:00.003", string1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.KOREA;
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      try { 
        localDate0.toString("O?41*>L[%odYZt?Zfh[", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      dateTimeZone0.convertLocalToUTC(3L, true);
      LocalDate localDate0 = new LocalDate();
      Locale locale0 = Locale.UK;
      localDate0.toString("Years", locale0);
  }
}
