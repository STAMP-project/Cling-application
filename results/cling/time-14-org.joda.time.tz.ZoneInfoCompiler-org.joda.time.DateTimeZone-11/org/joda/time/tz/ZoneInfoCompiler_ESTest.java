/*

 * Tue Mar 03 18:15:15 GMT 2020
 */

package org.joda.time.tz;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZoneInfoCompiler_ESTest extends ZoneInfoCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes(989, 989);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 989
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(255);
      String string0 = dateTimeZone0.getShortName((long) 255);
      assertEquals("+00:00:00.255", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(606);
      Locale locale0 = Locale.GERMANY;
      String string0 = dateTimeZone0.getShortName((long) 606, locale0);
      assertEquals("+00:00:00.606", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(10000);
      assertEquals("+00:00:10", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName((long) 276);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZone.forID("-1$' bZZa) Q8-{f");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"-1$' bZZa) Q8-{f\" is malformed at \"1$' bZZa) Q8-{f\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(3927, "dhHHVpa975r");
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'dhHHVpa975r' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      try { 
        DateTimeZone.forOffsetHoursMinutes((-592), (-592));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -592
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(60000);
      boolean boolean0 = dateTimeZone0.isStandardOffset((-2097L));
      assertTrue(boolean0);
      assertEquals("+00:01", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
      assertEquals("+00:01", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals(1583190000000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1, 1, 1);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone.setNameProvider((NameProvider) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NameProvider nameProvider0 = DateTimeZone.getNameProvider();
      DateTimeZone.setNameProvider(nameProvider0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(71);
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
  public void test16()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTimeZone.setDefault(fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1431655763));
      assertEquals("-397:40:55.763", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(613);
      DateTime dateTime0 = new DateTime((-766623600001L), dateTimeZone0);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateTime0);
      assertEquals(613, int0);
      assertEquals("+00:00:00.613", dateTimeZone0.getID());
  }
}
