/*

 * Tue Mar 03 16:56:18 GMT 2020
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IslamicChronology_ESTest extends IslamicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      String string0 = ethiopicChronology0.toString();
      assertEquals("EthiopicChronology[Europe/Amsterdam]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      int int0 = copticChronology0.getDaysInYear((-1853));
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      int int0 = ethiopicChronology0.getDaysInYear(1);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) islamicChronology0);
      long long0 = islamicChronology0.set(localDateTime0, (-1005L));
      assertEquals(1583254566701L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      LocalDate localDate0 = LocalDate.now((Chronology) gregorianChronology0);
      long long0 = gregorianChronology0.set(localDate0, 1);
      assertEquals(1583193600001L, long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      int int0 = islamicChronology0.getWeekOfWeekyear((-42521587200000L), 29);
      assertEquals(51, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeZone0).getID();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      assertNotNull(islamicChronology0);
      
      int int0 = islamicChronology0.getDaysInYear((-802));
      assertEquals(355, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0);
      assertNotNull(gJChronology0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      int int0 = ethiopicChronology0.getWeekyear(0L);
      assertEquals(1962, int0);
  }
}
