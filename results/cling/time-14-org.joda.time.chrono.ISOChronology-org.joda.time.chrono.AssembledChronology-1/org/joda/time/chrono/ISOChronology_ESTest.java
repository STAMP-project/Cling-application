/*

 * Tue Mar 03 16:50:34 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISOChronology_ESTest extends ISOChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(iSOChronology0);
      LenientChronology.getInstance(strictChronology0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeZone0).getID();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      lenientChronology0.getDateTimeMillis((-3511L), 1151, 1151, 0, (-1702));
      ISOChronology iSOChronology1 = ISOChronology.getInstance(dateTimeZone0);
      assertNotSame(iSOChronology1, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimeZone0).getID();
      doReturn("No partial converter found for type: ", "No partial converter found for type: ", "", "No partial converter found for type: ", "Y").when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      iSOChronology0.getDateTimeMillis(1, 1, 1, 1151);
      ISOChronology iSOChronology1 = ISOChronology.getInstance(dateTimeZone0);
      assertNotSame(iSOChronology1, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimeZone0).getID();
      doReturn("No partial converter found for type: ", "No partial converter found for type: ", "", "No partial converter found for type: ", "Y").when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      lenientChronology0.getDateTimeMillis((-2482), (-100), (-1250), 1);
      ISOChronology iSOChronology1 = ISOChronology.getInstance(dateTimeZone0);
      assertNotSame(iSOChronology1, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimeZone0).getID();
      doReturn("No partial converter found for type: ", "No partial converter found for type: ", "", "No partial converter found for type: ", "Y").when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      DateMidnight dateMidnight0 = new DateMidnight(1151, 1151, 1151, lenientChronology0);
      ISOChronology iSOChronology1 = ISOChronology.getInstance(dateTimeZone0);
      assertNotSame(iSOChronology1, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      LocalTime.fromCalendarFields(gregorianCalendar0);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(iSOChronology0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(strictChronology0);
      assertNotNull(lenientChronology0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeZone0).getID();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      ISOChronology iSOChronology1 = ISOChronology.getInstance(dateTimeZone0);
      assertNotSame(iSOChronology1, iSOChronology0);
  }
}
