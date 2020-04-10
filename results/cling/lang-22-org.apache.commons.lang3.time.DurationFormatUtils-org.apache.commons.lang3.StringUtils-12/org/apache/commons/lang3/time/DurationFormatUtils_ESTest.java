/*

 * Tue Mar 03 16:19:41 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DurationFormatUtils_ESTest extends DurationFormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(0L);
      assertEquals("P0Y0M0DT0H0M0.000S", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(1778L);
      assertEquals("0:00:01.778", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-1L), "");
      assertEquals("", string0);
  }
}
