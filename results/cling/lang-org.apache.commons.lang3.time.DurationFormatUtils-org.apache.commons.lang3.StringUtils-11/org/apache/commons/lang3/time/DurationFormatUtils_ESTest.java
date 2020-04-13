/*

 * Tue Mar 03 16:19:39 GMT 2020
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
      String string0 = DurationFormatUtils.formatDurationISO(1L);
      assertEquals("P0Y0M0DT0H0M0.001S", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS((-3269L));
      assertEquals("0:00:-3.31", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "sun.text.Normalizer");
      assertEquals("0un.text.Nor0alizer", string0);
  }
}
