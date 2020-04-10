/*

 * Tue Mar 03 17:28:06 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTime dateTime0 = DateTime.now((Chronology) buddhistChronology0);
      DateTime dateTime1 = dateTime0.withYear(1);
      LimitChronology limitChronology0 = LimitChronology.getInstance(buddhistChronology0, dateTime1, dateTime0);
      limitChronology0.withZone((DateTimeZone) null);
      assertEquals((-79266232292577L), dateTime1.getMillis());
      assertEquals(1583256479423L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField((DateTimeFieldType) null, true);
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket dateTimeParserBucket0 = mock(DateTimeParserBucket.class, new ViolatedAssumptionAnswer());
      doReturn(locale0).when(dateTimeParserBucket0).getLocale();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTime dateTime0 = DateTime.now((Chronology) buddhistChronology0);
      DateTime dateTime1 = dateTime0.withYear(1);
      LimitChronology limitChronology0 = LimitChronology.getInstance(buddhistChronology0, dateTime1, dateTime0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      limitChronology0.withZone(dateTimeZone0);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, (String) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DateTimeParserBucket dateTimeParserBucket0 = mock(DateTimeParserBucket.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(dateTimeParserBucket0).getLocale();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, (String) null, (-1191));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
