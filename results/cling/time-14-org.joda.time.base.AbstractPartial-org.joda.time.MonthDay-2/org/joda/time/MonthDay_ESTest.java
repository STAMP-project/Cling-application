/*

 * Tue Mar 03 16:53:12 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MonthDay_ESTest extends MonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1294, 2159, 1294, (-383), 1294);
      MonthDay monthDay0 = MonthDay.fromCalendarFields(gregorianCalendar0);
      Period period0 = Period.hours(157);
      MonthDay monthDay1 = monthDay0.plus(period0);
      assertEquals(2, monthDay1.size());
      assertNotSame(monthDay1, monthDay0);
      assertEquals(31, monthDay1.getDayOfMonth());
      assertEquals(5, monthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      Instant instant0 = gJChronology0.getGregorianCutover();
      Chronology chronology0 = instant0.getChronology();
      MonthDay monthDay0 = new MonthDay(chronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      // Undeclared exception!
      try { 
        monthDay0.withField(dateTimeFieldType0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'weekyear' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      String string0 = monthDay0.toString();
      assertEquals("--03-03", string0);
  }
}
