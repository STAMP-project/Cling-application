/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 01:22:01 GMT 2019
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
      char[] charArray0 = new char[9];
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      int int0 = strMatcher_TrimMatcher0.isMatch(charArray0, 0, 0, 5504);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("org.apache.commons.lang3.text.StrMatcher$TrimMatcher");
      char[] charArray0 = new char[1];
      charArray0[0] = 'o';
      // Undeclared exception!
      try { 
        strMatcher_StringMatcher0.isMatch(charArray0, 0, 329, 957);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.lang3.text.StrMatcher$StringMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("");
      char[] charArray0 = new char[0];
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 0, 0, 982);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("org.apache.commons.lang3.text.StrMatcher$TrimMatcher");
      char[] charArray0 = new char[1];
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 0, 329, 957);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'p';
      StrMatcher strMatcher0 = StrMatcher.charMatcher('p');
      int int0 = strMatcher0.isMatch(charArray0, 0, 34, 32);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'o';
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("org.apache.commons.lang3.text.StrMatcher$TrimMatcher");
      int int0 = strMatcher0.isMatch(charArray0, 0, 0, (-1743));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("org.apache.commons.lang3.text.StrMatcher$CharSetMatcher");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher((String) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("i");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[5];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[0];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      char[] charArray0 = new char[9];
      int int0 = strMatcher0.isMatch(charArray0, 0, 584, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.spaceMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.noneMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.singleQuoteMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      char[] charArray0 = new char[5];
      int int0 = strMatcher0.isMatch(charArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.tabMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.commaMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("org.apache.commons.lang3.text.StrMatcher$TrimMatcher");
      char[] charArray0 = new char[1];
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 34);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[8];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((String) null);
      int int0 = strMatcher0.isMatch(charArray0, 0, 0, 406);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      char[] charArray0 = new char[9];
      charArray0[0] = 'H';
      int int0 = strMatcher_TrimMatcher0.isMatch(charArray0, 0);
      assertEquals(0, int0);
  }
}
