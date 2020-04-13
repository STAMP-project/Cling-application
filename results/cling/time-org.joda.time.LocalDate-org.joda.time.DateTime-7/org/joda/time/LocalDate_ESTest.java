/*

 * Tue Mar 03 17:57:42 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight(1646265600000L, (Chronology) iSOChronology0);
      LocalDate localDate0 = dateMidnight0.toLocalDate();
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      DateTime dateTime0 = localDate0.toDateTime(localTime0, (DateTimeZone) null);
      DateTime dateTime1 = dateTime0.toDateTime((DateTimeZone) null);
      assertEquals(3, localDate0.size());
      assertEquals(1646330255168L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) ethiopicChronology0);
      assertNotSame(dateTime1, dateTime0);
      assertEquals(1583189940000L, dateTime1.getMillis());
  }
}
