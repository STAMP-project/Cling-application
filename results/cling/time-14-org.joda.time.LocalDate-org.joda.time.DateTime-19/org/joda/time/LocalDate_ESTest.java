/*

 * Tue Mar 03 17:58:20 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalTime localTime0 = new LocalTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(157);
      DateTime dateTime0 = localDate0.toDateTime(localTime0, dateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTime(dateTimeZone0);
      assertEquals(1582696694823L, dateTime1.getMillis());
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      Instant instant0 = new Instant();
      Chronology chronology0 = instant0.getChronology();
      DateTime dateTime0 = DateTime.parse("", dateTimeFormatter0);
      DateTime dateTime1 = dateTime0.toDateTime(chronology0);
      assertEquals(1583258294307L, instant0.getMillis());
      assertNotSame(dateTime0, dateTime1);
  }
}
