/*

 * Tue Mar 03 16:44:40 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
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
      charArray0[1] = '5';
      StrTokenizer strTokenizer0 = new StrTokenizer("Pi]OA]qE", "Pi]OA]qE");
      StrTokenizer strTokenizer1 = strTokenizer0.reset(charArray0);
      strTokenizer1.setIgnoredChar('5');
      strTokenizer0.previousToken();
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'e';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0);
      StrTokenizer strTokenizer1 = strTokenizer0.setQuoteChar('e');
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      strTokenizer0.setIgnoredMatcher(strMatcher0);
      boolean boolean0 = strTokenizer1.hasNext();
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer();
      strTokenizer0.previousToken();
      String string0 = strTokenizer0.toString();
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertEquals("StrTokenizer[]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '`';
      charArray0[1] = '`';
      charArray0[3] = '`';
      charArray0[4] = '`';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, 'g', '`');
      strTokenizer0.previousToken();
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance("Invalid startIndex: ");
      StrTokenizer strTokenizer1 = strTokenizer0.setDelimiterString("Invalid startIndex: ");
      strTokenizer1.setEmptyTokenAsNull(true);
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
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      String[] stringArray0 = strTokenizer0.getTokenArray();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, (StrMatcher) null, (StrMatcher) null);
      strTokenizer0.nextToken();
      assertEquals(1, strTokenizer0.nextIndex());
      
      strTokenizer0.previous();
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance(" in an array of ");
      String[] stringArray0 = strTokenizer0.getTokenArray();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[0];
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, (StrMatcher) null);
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("U*>XqRN;Y&xO[Mbeq-@Q");
      strTokenizer0.next();
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("DU*>XqRN;Y&x[Mbe-@Q", "DU*>XqRN;Y&x[Mbe-@Q");
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
      char[] charArray0 = new char[5];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", "");
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("U*>XqRN;Y&xO[Mb-@Q", "U*>XqRN;Y&xO[Mb-@Q");
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("U*>XqRN;Y&xO[Mb-@Q").when(strMatcher0).toString();
      doReturn(222).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      strTokenizer0.setIgnoredMatcher(strMatcher0);
      strTokenizer0.previousToken();
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }
}
