/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:56:50 GMT 2019
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
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('Z');
      char[] charArray0 = new char[1];
      charArray0[0] = 'Z';
      int int0 = strMatcher_CharMatcher0.isMatch(charArray0, 0, 0, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('f');
      char[] charArray0 = new char[8];
      int int0 = strMatcher_CharMatcher0.isMatch(charArray0, 0, 0, 0);
      assertEquals(0, int0);
  }
}
