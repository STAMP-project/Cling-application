/*

 * Tue Mar 03 16:44:22 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.text.StrTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrTokenizer_ESTest extends StrTokenizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("#YlHvh^%CXt(o");
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredChar('o');
      // Undeclared exception!
      try { 
        strTokenizer1.previous();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance();
      assertEquals((-1), strTokenizer0.previousIndex());
      
      strTokenizer0.previousToken();
      String string0 = strTokenizer0.toString();
      assertEquals("StrTokenizer[]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer(", '", (StrMatcher) null, (StrMatcher) null);
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer((String) null);
      char[] charArray0 = new char[7];
      charArray0[2] = 'h';
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      StrTokenizer strTokenizer1 = strTokenizer0.setQuoteMatcher(strMatcher_TrimMatcher0);
      strTokenizer1.reset(charArray0);
      strTokenizer0.previousToken();
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      strTokenizer0.setEmptyTokenAsNull(true);
      strTokenizer0.previousToken();
      assertTrue(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance("Lzj{L>~F9]br ?p");
      boolean boolean0 = strTokenizer0.hasPrevious();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertEquals((-1), strTokenizer1.previousIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer(",8awt<Rqe!hFG");
      strTokenizer0.next();
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance();
      // Undeclared exception!
      try { 
        strTokenizer0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance();
      char[] charArray0 = new char[4];
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      StrTokenizer strTokenizer1 = strTokenizer0.setQuoteMatcher(strMatcher_TrimMatcher0);
      strTokenizer1.reset(charArray0);
      String string0 = strTokenizer0.previousToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", "");
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("Invalid startIdex: ");
      strTokenizer0.nextToken();
      assertEquals(1, strTokenizer0.nextIndex());
      
      String string0 = strTokenizer0.previous();
      assertEquals("Invalid", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(" \t\n\r\f");
      // Undeclared exception!
      try { 
        strTokenizer0.previous();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }
}
