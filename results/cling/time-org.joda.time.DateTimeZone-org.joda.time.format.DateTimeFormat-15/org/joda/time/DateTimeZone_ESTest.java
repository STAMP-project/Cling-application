/*

 * Tue Mar 03 18:17:41 GMT 2020
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
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
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
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("^'Zk$AJ<]ZA:3vl", "GMT+C_v05?p,T)?1|2").when(timeZone0).getID();
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+C_v05?p,T)?1|2\" is malformed at \"C_v05?p,T)?1|2\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(2628, (-46), 2628, (-46)).when(dateTimeZone0).getOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      // Undeclared exception!
      try { 
        dateTimeZone1.getMillisKeepLocal((DateTimeZone) null, 9223372036854775805L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-2033), 1949, 1949, 2044).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)1949, 3035L, (long)1949, (long)1949).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      int int0 = dateTimeZone1.getOffsetFromLocal((-1696L));
      assertEquals((-2033), int0);
      
      int int1 = dateTimeZone1.getOffsetFromLocal((-1530L));
      assertEquals(2044, int1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      localDateTime0.toString("halfdays");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
      assertEquals("UTC", dateTimeZone0.toString());
      assertNotNull(dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.toString("r57Wb}N_<r8r");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime((-9223372036854775808L), dateTimeZone0);
      String string0 = localDateTime0.toString("y#ph2F");
      assertEquals("-292275055", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.toString("oz7m&gTZ:ra+[");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.toString(",BPEh'`'M e");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2033));
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.toString(",jP9$j2/vj,Y_ju|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-2033), 1949, 1949, 1925).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)1949, 3035L).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      int int0 = dateTimeZone1.getOffsetFromLocal((-1696L));
      assertEquals((-2033), int0);
      
      int int1 = dateTimeZone1.getOffsetFromLocal((-2033L));
      assertEquals(1925, int1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime((-396L), dateTimeZone0);
      localDateTime0.toString("s1}n1riO");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      localDateTime0.toString("=w3^/=c{0U]#");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.toString("XlbpZX");
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
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-53));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-53), dateTimeZone0);
      dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      localDateTime0.toString("+N9?[\"Vg#c1|t4oBC");
      assertEquals("-00:00:00.053", dateTimeZone0.toString());
      assertEquals("-00:00:00.053", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      // Undeclared exception!
      try { 
        localDateTime0.toString("UTC");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(39);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      localDateTime0.toString("-bY9HmGU8wNF,");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-21));
      dateTimeZone0.getOffset((ReadableInstant) null);
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.toString("Invalid UTC zone provided");
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
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-53));
      DateTime dateTime0 = new DateTime();
      dateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals(1583259404961L, dateTime0.getMillis());
      
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-53), dateTimeZone0);
      localDateTime0.toString("+N9?[\"Vg#c1|t4oBC");
      assertEquals("-00:00:00.053", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2033));
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      localDateTime0.toString("+WE30<j<o");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-21));
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.toString("`zg");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.toString("America/Phoenix");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(2628, (-5113));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -5113
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(60);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      String string0 = cachedDateTimeZone0.getShortName((-447L));
      assertEquals("+00:00:00.060", string0);
      
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      String string1 = localDateTime0.toString("+3CxZaPk.\"2yg(paJQf");
      assertEquals("+300000000000000020", string1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      DateTimeZone.forID("+01:00");
      String string0 = localDateTime0.toString("{o:>!n:1(C");
      assertEquals("!", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.convertLocalToUTC((-4081L), false);
      assertEquals((-3604081L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      DateTimeZone.setNameProvider((NameProvider) null);
      String string0 = localDateTime0.toString("{o:>!n:1(C");
      assertEquals("!", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1392));
      dateTimeZone0.getName((-267L));
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      localDateTime0.toString("GMT-GMT-18:00");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.toString("2f9V#S5RPWo6g<=jk#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(60);
      long long0 = dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 60);
      assertEquals(60L, long0);
      
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      String string0 = localDateTime0.toString("+3CxZaPk.\"2yg(paJQf");
      assertEquals("+300000000000000020", string0);
      assertEquals("+00:00:00.060", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) copticChronology0);
      gJChronology0.set(localDateTime0, 1346L);
      localDateTime0.toString("YQQ+uP");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-21));
      DateTimeZone.forOffsetHours((-21));
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      localDateTime0.toString("G5P}Xgr0");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-2033), 1949).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)1949, 3035L).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone1.convertLocalToUTC((long) 1925, false);
      assertEquals(3958L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(fixedDateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal(1000000000L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-2033), 1949, 1949).when(dateTimeZone0).getOffset(anyLong());
      doReturn((long)1949, 3035L).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      dateTimeZone1.getOffsetFromLocal((-1696L));
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone1);
      localDateTime0.toString("<[[tqtgQ\"i>K3[1%");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.toString("Fixing duplicate recurrent name key - ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: F
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-53));
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-53), dateTimeZone0);
      dateTimeZone0.isStandardOffset((-4317L));
      localDateTime0.toString("+N9?[\"Vg#c1|t4oBC");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      localDateTime0.toString("U`R3");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn(2628, (-46), 2628, (-46), 90).when(dateTimeZone0).getOffset(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      dateTimeZone1.convertLocalToUTC((-49L), false, (-318L));
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone1);
      localDateTime0.toString("wwRv");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(0, 3128);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 3128
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.toString("iXz0[IWS#D47");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      Locale locale0 = Locale.GERMANY;
      String string0 = dateTimeZone0.UTC.getName(10800000L, locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      localDateTime0.toString("Europe/Amsterdam");
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-932), "H*w\nL,J?{):K");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'H*w
         // L,J?{):K' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(60);
      DateTimeZone.forOffsetHours(60);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      localDateTime0.toString("+3CxZaPk.\"2yg(paJQf");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone1);
      
      DateTimeZone.setDefault(dateTimeZone1);
      LocalDateTime localDateTime0 = new LocalDateTime(796L, dateTimeZone0);
      String string0 = localDateTime0.toString("y#ph2F");
      assertEquals("001969", string0);
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, CALLS_REAL_METHODS);
      doReturn((-2033), 1949, 1949, (-2033), 0).when(dateTimeZone0).getOffset(anyLong());
      doReturn(29L, 29L).when(dateTimeZone0).nextTransition(anyLong());
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      dateTimeZone1.convertLocalToUTC((long) 1949, true, 1280L);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone1);
      // Undeclared exception!
      try { 
        localDateTime0.toString("oz7m&gTZ:ra+[");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1392));
      long long0 = dateTimeZone0.convertLocalToUTC((-267L), false);
      assertEquals(1125L, long0);
      assertEquals("-00:00:01.392", dateTimeZone0.getID());
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("-00:00:01.392");
      assertSame(dateTimeZone1, dateTimeZone0);
      assertNotNull(dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1392));
      dateTimeZone0.convertLocalToUTC((-267L), false);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("org.joda.time.DateTimeZone");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'org.joda.time.DateTimeZone' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("+R!'E7YliHl");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      // Undeclared exception!
      try { 
        localDateTime0.toString("The time must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2033));
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal(1789L);
      assertEquals((-2033), int0);
      assertEquals("-00:00:02.033", cachedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test53()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      dateTimeZone0.getShortName((long) 1231, (Locale) null);
      localDateTime0.toString("{o:>!n:1(C");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test54()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(39);
      Locale locale0 = Locale.GERMAN;
      String string0 = dateTimeZone0.getShortName(4081L, locale0);
      DateTime dateTime0 = new DateTime(86394576L);
      LocalDateTime localDateTime0 = dateTime0.toLocalDateTime();
      String string1 = localDateTime0.toString("GMT-18:00");
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test55()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) 39);
      localDateTime0.toString("JST");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test56()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime(796L, dateTimeZone0);
      String string0 = localDateTime0.toString("y#ph2F");
      assertEquals("-18:00", dateTimeZone0.toString());
      assertEquals("001969", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test57()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      dateTimeZone1.convertLocalToUTC(161L, false);
      LocalDateTime localDateTime0 = new LocalDateTime(796L, dateTimeZone0);
      localDateTime0.toString("y#ph2F");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test58()  throws Throwable  {
      DateTimeZone.setProvider((Provider) null);
      DateTime dateTime0 = new DateTime(86394576L);
      LocalDateTime localDateTime0 = dateTime0.toLocalDateTime();
      localDateTime0.toString("GMT-18:00");
  }
}
