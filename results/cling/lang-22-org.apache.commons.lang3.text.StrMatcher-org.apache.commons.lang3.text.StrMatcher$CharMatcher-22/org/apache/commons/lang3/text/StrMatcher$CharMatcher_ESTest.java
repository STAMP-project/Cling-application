/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 12:24:55 GMT 2019
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.text.StrMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrMatcher$CharMatcher_ESTest extends StrMatcher$CharMatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }
}
