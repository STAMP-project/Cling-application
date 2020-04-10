/*

 * Tue Mar 03 16:51:02 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISOChronology_ESTest extends ISOChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LenientChronology.getInstance(iSOChronology0);
      LocalDate localDate0 = null;
      try {
        localDate0 = new LocalDate((-10), (-10), (-10));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -10 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(iSOChronology0);
      LocalDate localDate0 = new LocalDate(5, 5, 5, strictChronology0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      LenientChronology.getInstance(lenientChronology0);
      LocalDate localDate0 = new LocalDate(65535, 65535, 65535, lenientChronology0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      DateMidnight dateMidnight0 = new DateMidnight(3315, 3315, 3315, lenientChronology0);
      assertEquals(51445231200000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ISOChronology.getInstance((DateTimeZone) null);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) null, 1);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(ethiopicChronology0);
      long long0 = lenientChronology0.getDateTimeMillis((-425L), 788, 1, 1, 1);
      assertEquals(2833261001L, long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      iSOChronology0.getDateTimeMillis(553L, 0, 0, 0, 0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      LenientChronology lenientChronology1 = LenientChronology.getInstance(lenientChronology0);
      assertNotSame(lenientChronology1, lenientChronology0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("BE", "BE").when(dateTimeZone0).getID();
      doReturn((String) null, "", (String) null, "BE", "BE").when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      assertNotNull(iSOChronology0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone1);
      boolean boolean0 = dateTimeZone1.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }
}
