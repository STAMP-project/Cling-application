/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 17:55:33 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EthiopicChronology_ESTest extends EthiopicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      ethiopicChronology0.assemble(assembledChronology_Fields0);
      assertEquals(1, EthiopicChronology.EE);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      Chronology chronology0 = ethiopicChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, ethiopicChronology0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) null);
      Chronology chronology0 = ethiopicChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, ethiopicChronology0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      int int0 = ethiopicChronology0.getMinYear();
      assertEquals((-292269337), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      long long0 = ethiopicChronology0.setYear(6, 1);
      assertEquals((-61884431999994L), long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      assertEquals(1, EthiopicChronology.EE);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Chronology chronology0 = ethiopicChronology0.withUTC();
      assertSame(ethiopicChronology0, chronology0);
  }
}
