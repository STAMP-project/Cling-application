/*

 * Tue Mar 03 16:50:51 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISOChronology_ESTest extends ISOChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      long long0 = lenientChronology0.getDateTimeMillis(20930L, 19, (-2100), 19, 19);
      assertEquals((-57580981L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      LocalDate localDate0 = new LocalDate((Object) null, lenientChronology0);
      DateTime dateTime0 = DateTime.now((Chronology) lenientChronology0);
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0);
      assertEquals(1583254236624L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ISOChronology.getInstance();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(5);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      assertNotNull(zonedChronology0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = DateTime.now((Chronology) iSOChronology0);
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0);
      try { 
        iSOChronology0.getDateTimeMillis(5, 5, (-1577), (-1577), 62, 1169, 62);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -1577 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      iSOChronology0.getDateTimeMillis((-11L), 19, 19, 19, 19);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(19, 19);
      ISOChronology iSOChronology1 = ISOChronology.getInstance(dateTimeZone0);
      assertNotSame(iSOChronology1, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("=+I:&O\"mD`ea1\".q@*", "=+I:&O\"mD`ea1\".q@*").when(dateTimeZone0).getID();
      doReturn("=+I:&O\"mD`ea1\".q@*", "", "Year is too small: ", "=+I:&O\"mD`ea1\".q@*", "Year is too small: ").when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      try { 
        iSOChronology0.getDateTimeMillis(65533, 65533, 65533, 0);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 65533 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("e", "e").when(dateTimeZone0).getID();
      doReturn("e", "e", "e", "e", "nxx").when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      ISOChronology iSOChronology1 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotSame(iSOChronology1, iSOChronology0);
  }
}
