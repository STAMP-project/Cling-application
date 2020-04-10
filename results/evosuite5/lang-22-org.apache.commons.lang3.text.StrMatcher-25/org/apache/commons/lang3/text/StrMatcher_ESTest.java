/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 21:23:24 GMT 2019
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.text.StrMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrMatcher_ESTest extends StrMatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '[';
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      int int0 = strMatcher0.isMatch(charArray0, 0, 1, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = 'o';
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("org.apache.commons.lang3.text.StrMatcher$TrimMatcher");
      // Undeclared exception!
      try { 
        strMatcher0.isMatch(charArray0, 1, 0, 1116);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.lang3.text.StrMatcher$StringMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("");
      char[] charArray0 = new char[9];
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, (-423));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("1+*kNL;~wR!\"");
      char[] charArray0 = new char[2];
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, (-478), (-478), (-478));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[6];
      StrMatcher strMatcher0 = StrMatcher.charMatcher('1');
      int int0 = strMatcher0.isMatch(charArray0, 1, 43, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      int int0 = strMatcher_CharSetMatcher0.isMatch(charArray0, 0, 0, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("1+*kNL;~wR!\"");
      int int0 = strMatcher0.isMatch(charArray0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher((String) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((String) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      int int0 = strMatcher0.isMatch(charArray0, 0, 720, 52);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[0];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.spaceMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.singleQuoteMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.tabMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.commaMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("1+*kNL;~wR!\"");
      char[] charArray0 = new char[2];
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 1, 0, 1116);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrMatcher strMatcher0 = StrMatcher.noneMatcher();
      int int0 = strMatcher0.isMatch(charArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      char[] charArray0 = new char[4];
      int int0 = strMatcher_TrimMatcher0.isMatch(charArray0, 1, 1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("S");
      assertNotNull(strMatcher0);
  }
}
