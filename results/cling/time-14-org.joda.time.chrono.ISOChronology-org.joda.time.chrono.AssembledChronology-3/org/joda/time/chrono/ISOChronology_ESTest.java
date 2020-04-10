/*

 * Tue Mar 03 16:49:50 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISOChronology_ESTest extends ISOChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTime dateTime0 = DateTime.now((Chronology) gregorianChronology0);
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0);
      assertEquals(1583254181674L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      iSOChronology0.getDateTimeMillis((long) 1, 1, 1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2132);
      ISOChronology iSOChronology1 = ISOChronology.getInstance(dateTimeZone0);
      assertFalse(iSOChronology1.equals((Object)iSOChronology0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = mock(AssembledChronology.Fields.class, new ViolatedAssumptionAnswer());
      iSOChronology0.assemble(assembledChronology_Fields0);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeZone0).getID();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(dateTimeZone0).toString();
      ISOChronology iSOChronology1 = ISOChronology.getInstance(dateTimeZone0);
      assertFalse(iSOChronology1.equals((Object)iSOChronology0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("x)4>XE&LT", "x)4>XE&LT").when(dateTimeZone0).getID();
      doReturn("org.joda.time.chrono.ISOChronology", "x)4>XE&LT", "org.joda.time.chrono.ISOChronology", "x)4>XE&LT", "x)4>XE&LT").when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      assertNotNull(iSOChronology0);
      
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
  }
}
