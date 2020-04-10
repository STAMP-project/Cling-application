/*

 * Tue Mar 03 16:19:08 GMT 2020
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
      String string0 = DurationFormatUtils.formatDurationISO(3987L);
      assertEquals("P0Y0M0DT0H0M3.987S", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(1721L);
      assertEquals("0:00:01.721", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(433L, "`_*Cw\"Jg|M-9B](A*;v");
      assertEquals("`_*Cw\"Jg|0-9B](A*;v", string0);
  }
}
