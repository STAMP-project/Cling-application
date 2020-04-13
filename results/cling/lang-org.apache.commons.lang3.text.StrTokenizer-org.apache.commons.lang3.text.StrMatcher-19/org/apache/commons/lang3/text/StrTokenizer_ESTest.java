/*

 * Tue Mar 03 16:46:39 GMT 2020
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
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("Invalid startIndex: ");
      strTokenizer0.setIgnoredChar('r');
      String string0 = strTokenizer0.nextToken();
      assertNotNull(string0);
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer();
      strTokenizer0.previousToken();
      String string0 = strTokenizer0.toString();
      assertEquals("StrTokenizer[]", string0);
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("set() is unsupported", 'i', 's');
      strTokenizer0.nextToken();
      assertEquals(0, strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[10];
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance(charArray0);
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      
      strTokenizer0.setEmptyTokenAsNull(true);
      boolean boolean0 = strTokenizer0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      int int0 = strTokenizer0.size();
      assertEquals(0, strTokenizer0.nextIndex());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[5];
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, 'l', 'l');
      strTokenizer0.nextToken();
      assertEquals(1, strTokenizer0.nextIndex());
      
      String string0 = strTokenizer0.previousToken();
      assertEquals("\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[9];
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, (StrMatcher) null);
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("\"");
      strTokenizer0.next();
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("");
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
      char[] charArray0 = new char[2];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, strMatcher0, strMatcher0);
      StrTokenizer strTokenizer1 = strTokenizer0.setDelimiterString("");
      boolean boolean0 = strTokenizer1.hasPrevious();
      assertFalse(boolean0);
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("kM H/0xXrwH", '\u0000', 'k');
      StrMatcher strMatcher0 = StrMatcher.charMatcher('k');
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher(strMatcher0);
      boolean boolean0 = strTokenizer1.hasPrevious();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("DYHsv", "DYHsv");
      StrMatcher strMatcher0 = strTokenizer0.getDelimiterMatcher();
      strTokenizer0.setIgnoredMatcher(strMatcher0);
      String[] stringArray0 = strTokenizer0.getTokenArray();
      assertEquals(0, stringArray0.length);
  }
}
