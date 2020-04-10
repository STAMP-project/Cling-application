/*

 * Tue Mar 03 16:51:02 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISOChronology_ESTest extends ISOChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTime dateTime0 = new DateTime(5, 5, 5, 5, 5, 5);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        iSOChronology0.assemble((AssembledChronology.Fields) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ISOChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      long long0 = iSOChronology0.getDateTimeMillis((long) 20, 20, 20, 20, 20);
      assertEquals(69620020L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-12));
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      DateTime dateTime0 = new DateTime((DateTimeZone) null);
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0, 5);
      assertEquals(1583254249522L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-12));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }
}
