/*

 * Tue Mar 03 16:44:13 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
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
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("set() is unsupported");
      StrMatcher strMatcher0 = StrMatcher.spaceMatcher();
      strTokenizer0.setIgnoredMatcher(strMatcher0);
      String string0 = strTokenizer0.previousToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[6];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      strTokenizer0.setQuoteMatcher(strMatcher_TrimMatcher0);
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

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance("`rr]:.'");
      strTokenizer0.next();
      strTokenizer0.toString();
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer((String) null, (StrMatcher) null, (StrMatcher) null);
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '6';
      charArray0[1] = '6';
      charArray0[5] = '6';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, 'D', '6');
      boolean boolean0 = strTokenizer0.hasPrevious();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("add() is unsupported");
      StrTokenizer strTokenizer1 = strTokenizer0.setDelimiterString("add() is unsupported");
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
      
      strTokenizer1.setEmptyTokenAsNull(true);
      strTokenizer0.previousToken();
      assertTrue(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("end < start");
      assertEquals((-1), strTokenizer0.previousIndex());
      
      String string0 = strTokenizer0.next();
      assertEquals("end < start", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("|6&j|", "|6&j|");
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      strTokenizer0.next();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[4];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", "");
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance("`rr]:.'");
      strTokenizer0.next();
      assertEquals(0, strTokenizer0.previousIndex());
      
      String string0 = strTokenizer0.previousToken();
      assertEquals("`rr]:.'", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[6];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
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

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("add() is unsupported", "add() is unsupported");
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("add() is unsupported");
      strTokenizer0.setTrimmerMatcher(strMatcher0);
      strTokenizer0.previousToken();
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }
}
