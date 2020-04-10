/*

 * Tue Mar 03 18:13:15 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.UTC.convertLocalToUTC((long) 3154, false);
      assertEquals(3154L, long0);
      
      long long1 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 63L);
      assertEquals(63L, long1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime((Object) null, dateTimeZone0);
      dateTimeZone0.UTC.getOffset((ReadableInstant) dateTime0);
      assertEquals(1583259178418L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(2134389235, (-674)).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)(-674)).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone1.adjustOffset((-1652L), true);
      assertEquals(2134388257L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("9N_0\"");
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Locale locale0 = Locale.CANADA_FRENCH;
      localDateTime0.toString("j'J=gs+", locale0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+01:00");
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+01:00");
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+01:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(3154, 4849, 300, 3154).when(dateTimeZone0).getOffset(anyLong());
      doReturn(false).when(dateTimeZone0).isFixed();
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertTrue(boolean0);
      
      long long0 = dateTimeZone1.UTC.convertLocalToUTC((long) 3154, false);
      assertEquals(3154L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      DateTimeZone.setNameProvider(nameProvider0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      try { 
        localDateTime0.toString("org.joda.time.MutableInterval", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
      
      long long0 = dateTimeZone0.UTC.convertLocalToUTC((long) 3154, false);
      assertEquals(3154L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZone.forID("OC5)M; Kg#p|X3<");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'OC5)M; Kg#p|X3<' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(2);
      dateTimeZone0.UTC.convertLocalToUTC(401L, false);
      LocalDateTime localDateTime0 = new LocalDateTime();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      String string0 = localDateTime0.toString(".&BJu,Pf9gu`MK?", locale0);
      assertEquals(".&BJu,Pf9gu`MK?", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      localDateTime0.toString("+LUd9;D1#|G", locale0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  @Ignore
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toString("DateTimeZone.setNameProvider", locale0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes((-332), (-27360));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -27360
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(3154, 4849, 334, 3154, 334).when(dateTimeZone0).getOffset(anyLong());
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      assertEquals(1, BuddhistChronology.BE);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1319);
      localDateTime0.toString("`C`v^'-", locale0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      try { 
        localDateTime0.toString("UTC", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn("ReadablePartial objects must have the same set of fields").when(dateTimeZone0).getNameKey(anyLong());
      doReturn(3154, 4874, 300, 3154, (-2737)).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)(-2737), (long)300, 28828416L).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone((TimeZone) null);
      int int0 = dateTimeZone1.getOffsetFromLocal((-627L));
      assertEquals(3154, int0);
      
      String string0 = dateTimeZone1.getName((long) (-916));
      assertEquals("+00:00:00.300", string0);
      assertNotNull(string0);
      
      long long0 = dateTimeZone1.adjustOffset(3154, true);
      assertEquals(3154L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      localDateTime0.withLocalMillis(4849);
      localDateTime0.toString("=0h{;2yCdzAG", locale0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      DateTimeZone.forOffsetHours((-332));
      LocalDateTime localDateTime0 = new LocalDateTime();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      localDateTime0.toString("g", locale0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(608, (-2147483050), (-2147483050), 1069).when(dateTimeZone0).getOffset(anyLong());
      doReturn(43200000L, (long)(-2147483050)).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone1.UTC.getMillisKeepLocal(dateTimeZone0, 43200000L);
      assertEquals(2190683050L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(3154, 4849, 334).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)3154, (long)3154).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      dateTimeZone1.getOffsetFromLocal(3L);
      Locale locale0 = Locale.CANADA_FRENCH;
      LocalDateTime localDateTime0 = new LocalDateTime();
      try { 
        localDateTime0.toString("-OC5)M; Kg#p|X3<", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      String string0 = fixedDateTimeZone0.getName((-3600001L), locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone.setNameProvider((NameProvider) null);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(2);
      dateTimeZone0.isStandardOffset((-781052400001L));
      LocalDateTime localDateTime0 = new LocalDateTime();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      String string0 = localDateTime0.toString(".&BJu,Pf9gu`MK?", locale0);
      assertEquals(".&BJu,Pf9gu`MK?", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      Provider provider0 = DateTimeZone.getProvider();
      DateTimeZone.setProvider(provider0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      String string0 = localDateTime0.toString(".&BJu,Pf9gu`MK?", locale0);
      assertEquals(".&BJu,Pf9gu`MK?", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, true);
      assertEquals((-3599999L), long0);
      assertEquals("+01:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 77);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 77
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((-2271L));
      assertEquals(1, monthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(3154).when(dateTimeZone0).getOffset(anyLong());
      doReturn(4849).when(dateTimeZone0).getStandardOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone1.isStandardOffset(4727L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      DateTimeZone.forOffsetMillis(3154);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.toString("Euro", locale0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "ul)f%K~QVU");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'ul)f%K~QVU' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = (-1270);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      DateTimeZone.getProvider();
      DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Locale locale1 = locale0.stripExtensions();
      localDateTime0.toString("0K", locale1);
      // Undeclared exception!
      try { 
        localDateTime0.withMillisOfSecond(2134389235);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 2134389235 for millisOfSecond must be in the range [0,999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/Puerto_Rico");
      int int0 = dateTimeZone0.getOffsetFromLocal(14401322L);
      assertEquals((-14400000), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test37()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 4849, (Chronology) gregorianChronology0);
      Locale locale0 = Locale.JAPANESE;
      localDateTime0.toString("Za4a\biFMa$8z", locale0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.FRENCH;
      fixedDateTimeZone0.getShortName((long) 3154, locale0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      try { 
        localDateTime0.toString("PiRE.i3<qZ9pg", locale0);
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
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(2);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      localDateTime0.toString(".&BJu,Pf9gu`MK?", locale0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      long long0 = dateTimeZone0.convertLocalToUTC(228877200000L, true);
      assertEquals(228873600000L, long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(2134389235, (-662)).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)(-662)).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      long long0 = dateTimeZone1.adjustOffset(1322L, false);
      assertEquals((-2134388575L), long0);
  }
}
