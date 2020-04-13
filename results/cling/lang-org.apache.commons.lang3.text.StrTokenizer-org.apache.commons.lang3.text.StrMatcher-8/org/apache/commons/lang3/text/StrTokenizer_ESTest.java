/*

 * Tue Mar 03 16:45:06 GMT 2020
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
      StrTokenizer strTokenizer0 = new StrTokenizer("StrTokenizer", '', '');
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredChar('r');
      boolean boolean0 = strTokenizer1.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[7];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, strMatcher0, strMatcher0);
      strTokenizer0.setDelimiterChar('y');
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredChar('\u0000');
      boolean boolean0 = strTokenizer1.hasPrevious();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[7];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, strMatcher0, strMatcher0);
      boolean boolean0 = strTokenizer0.hasPrevious();
      assertFalse(boolean0);
      
      String string0 = strTokenizer0.toString();
      assertEquals("StrTokenizer[]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("StrTokenizer", (StrMatcher) null, (StrMatcher) null);
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[1] = 'b';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, 'b', '\u0000');
      String[] stringArray0 = strTokenizer0.getTokenArray();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance("org.apache.commons.lang3.text.StrBuilder");
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("Arguments cannot both be null");
      strTokenizer0.setQuoteMatcher(strMatcher0);
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
  public void test07()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance("W!A`");
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("W!A`");
      strTokenizer0.setIgnoredMatcher(strMatcher0);
      StrTokenizer strTokenizer1 = strTokenizer0.setEmptyTokenAsNull(true);
      assertEquals((-1), strTokenizer1.previousIndex());
      
      strTokenizer1.next();
      assertEquals(0, strTokenizer1.previousIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("org.apache.commons.lang3.text.StrBuilder");
      strTokenizer0.nextToken();
      assertEquals(0, strTokenizer0.previousIndex());
      
      String string0 = strTokenizer0.previousToken();
      assertEquals("org.apache.commons.lang3.text.StrBuilder", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("Invalid length: ");
      boolean boolean0 = strTokenizer0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertEquals((-1), strTokenizer1.previousIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer();
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
  public void test12()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", "");
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(" \t\n\r\f");
      String string0 = strTokenizer0.previousToken();
      assertNull(string0);
  }
}
