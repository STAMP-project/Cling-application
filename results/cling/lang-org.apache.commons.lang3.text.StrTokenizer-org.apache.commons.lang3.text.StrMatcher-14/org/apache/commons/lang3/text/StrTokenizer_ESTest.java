/*

 * Tue Mar 03 16:45:53 GMT 2020
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
      StrMatcher strMatcher0 = StrMatcher.singleQuoteMatcher();
      StrTokenizer strTokenizer0 = new StrTokenizer("e^RpMt]U@iUy3R", strMatcher0);
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredChar('R');
      String string0 = strTokenizer1.previousToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("org.apache.coomonsnlang3.text.StrTocenizer");
      char[] charArray0 = new char[5];
      charArray0[3] = 'o';
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredMatcher(strMatcher_CharSetMatcher0);
      strTokenizer1.setQuoteChar('o');
      strTokenizer0.nextToken();
      assertEquals(0, strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      strTokenizer0.nextToken();
      String string0 = strTokenizer0.toString();
      assertEquals((-1), strTokenizer0.previousIndex());
      assertEquals("StrTokenizer[]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("at-7wcm~{;04j(");
      StrTokenizer strTokenizer1 = strTokenizer0.setDelimiterMatcher((StrMatcher) null);
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[1] = '9';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, '9', '\u0000');
      String[] stringArray0 = strTokenizer0.getTokenArray();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(" \t\n\r\f");
      strTokenizer0.setEmptyTokenAsNull(true);
      strTokenizer0.previousToken();
      assertTrue(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance("Invalid startIndex: ");
      int int0 = strTokenizer0.size();
      assertEquals(1, int0);
      assertEquals(0, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer();
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("n3x`R");
      strTokenizer0.next();
      assertEquals(0, strTokenizer0.previousIndex());
      
      String string0 = strTokenizer0.previousToken();
      assertEquals("n3x`R", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[9];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", "");
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("n3x`R", "n3x`R");
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
  public void test13()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(" \t\n\r\f");
      String string0 = strTokenizer0.previousToken();
      assertNull(string0);
  }
}
