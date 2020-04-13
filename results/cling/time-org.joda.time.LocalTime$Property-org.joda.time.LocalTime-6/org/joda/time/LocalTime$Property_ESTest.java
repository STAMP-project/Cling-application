/*

 * Tue Mar 03 17:28:22 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime$Property_ESTest extends LocalTime$Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      localTime0.toString("Z");
      LocalTime localTime1 = localTime0.minusHours((-770));
      int int0 = localTime0.compareTo((ReadablePartial) localTime1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalTime localTime1 = LocalTime.now((Chronology) iSOChronology0);
      int int0 = localTime0.compareTo((ReadablePartial) localTime1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      String string0 = localTime0.toString((String) null);
      assertEquals("18:28:14.365", string0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      String string0 = localTime0.toString("Z");
      assertEquals("", string0);
      
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalTime localTime1 = LocalTime.now((Chronology) iSOChronology0);
      int int0 = localTime0.compareTo((ReadablePartial) localTime1);
      assertEquals((-1), int0);
  }
}
