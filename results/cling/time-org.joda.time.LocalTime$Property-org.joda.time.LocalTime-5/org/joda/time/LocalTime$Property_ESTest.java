/*

 * Tue Mar 03 17:28:20 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime$Property_ESTest extends LocalTime$Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.plusSeconds((-1409));
      int int0 = localTime1.compareTo((ReadablePartial) localTime0);
      assertEquals((-1), int0);
      
      localTime0.toString("'am3,]o~+FL-");
      assertNotSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.plusSeconds((-1409));
      boolean boolean0 = localTime0.isAfter(localTime1);
      assertTrue(boolean0);
      
      localTime0.toString("'am3,]o~+FL-");
      assertNotSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(292272984);
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      String string0 = localTime0.toString((String) null);
      assertEquals(4, localTime0.size());
      assertEquals("02:39:23.964", string0);
  }
}
