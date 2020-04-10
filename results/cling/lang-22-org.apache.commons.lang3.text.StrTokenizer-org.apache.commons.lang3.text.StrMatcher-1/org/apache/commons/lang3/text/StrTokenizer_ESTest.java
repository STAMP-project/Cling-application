/*

 * Tue Mar 03 16:44:05 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.text.StrTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrTokenizer_ESTest extends StrTokenizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[1] = '=';
      charArray0[2] = '8';
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredChar('8');
      strTokenizer1.next();
      assertEquals(1, strTokenizer1.nextIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      strTokenizer0.size();
      String string0 = strTokenizer0.toString();
      assertEquals("StrTokenizer[]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[2] = ' ';
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      strTokenizer0.setQuoteChar('\u0000');
      strTokenizer0.next();
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance("FN!Te");
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("FN!Te").when(strMatcher0).toString();
      doReturn(33).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrTokenizer strTokenizer1 = strTokenizer0.setQuoteMatcher(strMatcher0);
      strTokenizer1.setEmptyTokenAsNull(true);
      strTokenizer0.next();
      assertTrue(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("e++0<j");
      strTokenizer0.next();
      strTokenizer0.previousToken();
      assertEquals((-1), strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("+b<j", "+b<j");
      strTokenizer0.previousToken();
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer(", Length: 0", (StrMatcher) null);
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      strTokenizer0.next();
      strTokenizer0.next();
      assertEquals(2, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[6];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      strTokenizer0.setQuoteChar('\u0000');
      strTokenizer0.next();
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[3];
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
      char[] charArray0 = new char[3];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      strTokenizer0.setDelimiterChar('\u0000');
      strTokenizer0.next();
      assertEquals(0, strTokenizer0.previousIndex());
  }
}
