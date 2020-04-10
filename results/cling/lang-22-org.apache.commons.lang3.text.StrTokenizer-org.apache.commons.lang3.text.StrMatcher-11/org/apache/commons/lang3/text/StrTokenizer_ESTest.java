/*

 * Tue Mar 03 16:44:50 GMT 2020
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
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("be\"}p#");
      strTokenizer0.setIgnoredChar('p');
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
  @Ignore
  public void test02()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      String[] stringArray0 = strTokenizer0.getTokenArray();
      assertEquals(1, stringArray0.length);
      
      String string0 = strTokenizer0.toString();
      assertEquals((-1), strTokenizer0.previousIndex());
      assertEquals("StrTokenizer[]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", (StrMatcher) null, (StrMatcher) null);
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '-';
      charArray0[3] = '-';
      charArray0[5] = '-';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, '', '-');
      strTokenizer0.nextToken();
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance(" \t\n\r\f");
      strTokenizer0.next();
      assertEquals(0, strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("#,");
      strTokenizer0.setEmptyTokenAsNull(true);
      strTokenizer0.getTokenList();
      assertTrue(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance("set() is unsupported");
      strTokenizer0.nextToken();
      boolean boolean0 = strTokenizer0.hasPrevious();
      assertEquals(0, strTokenizer0.previousIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertEquals((-1), strTokenizer1.previousIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[7];
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, '', '-');
      strTokenizer0.nextToken();
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
      char[] charArray0 = new char[3];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, '{', '\u0000');
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredChar('\u0000');
      String string0 = strTokenizer1.previousToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer(", Length: ", ", Length: ");
      strTokenizer0.setIgnoredChar(',');
      boolean boolean0 = strTokenizer0.hasNext();
      assertFalse(boolean0);
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }
}
