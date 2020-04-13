/*

 * Tue Mar 03 16:45:52 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.text.StrLookup;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.text.StrSubstitutor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrSubstitutor_ESTest extends StrSubstitutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "[(#'4Zl`&m6c(iQ m|(", "{");
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.delete((-2143), (-2143));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2143
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "", "");
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder(3264);
      // Undeclared exception!
      try { 
        strBuilder0.delete((-311), 3264);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -311
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder(40);
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-1));
      assertEquals(40, strBuilder0.capacity());
      assertEquals((-1), int0);
      
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder("");
      StrBuilder strBuilder1 = strBuilder0.appendFixedWidthPadLeft(14, 6, 'c');
      strBuilder1.appendSeparator('k', 14);
      strSubstitutor0.replaceIn(strBuilder1);
      int int0 = strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 6);
      assertEquals(7, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "[(#'4Zl`&m6c(iQ m|(", "[(#'4Zl`&m6c(iQ m|(");
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder("[(#'4Zl`&m6c(iQ m|(");
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      // Undeclared exception!
      try { 
        strBuilder0.insert(72, (Object) locale_Category0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 72
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator('I', 9);
      // Undeclared exception!
      try { 
        strBuilder0.replace(100, (-3327), "JYm2N4\"Cg'PKYpA*D");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.lastIndexOf((StrMatcher) null, 357);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "", "#Yw][>xu7svh#W~");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("E<uVt$H|v", (-343), 1667);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrBuilder strBuilder0 = new StrBuilder("\"nh'6m8w;f?`Jh f3");
      StrMatcher strMatcher0 = StrMatcher.noneMatcher();
      strBuilder0.lastIndexOf(strMatcher0, 7);
      StrSubstitutor strSubstitutor0 = null;
      try {
        strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "Vx", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable suffix must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StringBuffer stringBuffer0 = new StringBuffer("");
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, 357);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
      assertEquals((-1), int0);
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0, "", "");
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("\"nh'6m8w;f?`Jh f3");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('_', 0);
      StrMatcher strMatcher0 = StrMatcher.noneMatcher();
      int int0 = strBuilder1.lastIndexOf(strMatcher0, 2);
      assertEquals(17, strBuilder1.length());
      assertEquals(49, strBuilder1.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "", "");
      StrBuilder strBuilder0 = new StrBuilder("rj8KYQp9");
      StrBuilder strBuilder1 = new StrBuilder((String) null);
      assertEquals(32, strBuilder1.capacity());
      
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals(40, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
      assertEquals(8, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, Locale.Category> hashMap0 = new HashMap<String, Locale.Category>();
      StrLookup<Locale.Category> strLookup0 = StrLookup.mapLookup((Map<String, Locale.Category>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "G6N~@zM/j=~", "G6N~@zM/j=~", 'Z');
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder("`t?vNf");
      // Undeclared exception!
      try { 
        strBuilder0.delete((-59), (-470));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -59
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "[(#'4Zl`&m6c(iQ m|(", "");
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.delete((-490), (-1406));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -490
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "[(#'4Zl`&m6c(iQ m|(", "{");
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.delete(25, 4);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("\"nh'6m8w;f?`Jh f3");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('_', 17);
      assertEquals(18, strBuilder0.length());
      
      strBuilder1.deleteCharAt(17);
      assertEquals(49, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "", "");
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.delete('$', '$');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("FB~8z\"^q}s6Kc|c}");
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("iX");
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.put(strBuilder0, object0);
      // Undeclared exception!
      try { 
        StrSubstitutor.replace((Object) strMatcher_StringMatcher0, properties0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.lang3.text.StrBuilder cannot be cast to java.lang.String
         //
         verifyException("java.util.Properties", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("\"nh'6m8w;f?`Jh f3");
      strBuilder0.validateIndex(0);
      StrMatcher strMatcher0 = StrMatcher.noneMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, '-');
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("Invalid length: ", 108, (-33));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Integer integer0 = new Integer(9);
      StrSubstitutor.replace((Object) integer0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder(9);
      StringBuffer stringBuffer0 = new StringBuffer("9");
      StrBuilder strBuilder1 = strBuilder0.append(stringBuffer0);
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      int int0 = strBuilder1.lastIndexOf(strMatcher0, 9);
      assertEquals(1, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StrSubstitutor.replace((Object) "", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.delete('$', '$');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      strSubstitutor0.setEnableSubstitutionInVariables(true);
      strSubstitutor0.setVariablePrefix('b');
      strSubstitutor0.replace((Object) strSubstitutor0);
      StrBuilder strBuilder0 = new StrBuilder("'5eP!c)<");
      // Undeclared exception!
      try { 
        strBuilder0.delete((-2143), 26);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2143
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StringBuffer stringBuffer0 = new StringBuffer("");
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("");
      StrBuilder strBuilder1 = strBuilder0.appendFixedWidthPadLeft(14, 6, 'c');
      strBuilder1.appendSeparator('k', 14);
      strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 6);
      assertEquals(7, strBuilder0.length());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("V(");
      strBuilder0.replaceFirst("?S%~n%I2U~p4.T", "'\"");
      // Undeclared exception!
      try { 
        strBuilder0.validateIndex(2186);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 2186
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendFixedWidthPadLeft((-1), 2024, '!');
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      strBuilder1.appendSeparator("C7j[zZE LBam", (-3909));
      int int0 = strBuilder1.lastIndexOf((StrMatcher) strMatcher_TrimMatcher0, 15);
      assertFalse(strBuilder0.isEmpty());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = new Object();
      Properties properties0 = new Properties();
      StrSubstitutor.replace(object0, properties0);
      StrBuilder strBuilder0 = new StrBuilder("q[Ql");
      // Undeclared exception!
      try { 
        strBuilder0.delete(2355, 32);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("\"nh'6m8w;f?`Jh f3");
      strBuilder0.appendSeparator('_', 748);
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, 2);
      assertEquals(18, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("\"nh'6m8w;f?`Jh f3");
      strBuilder0.appendSeparator('_', 0);
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, (-609));
      assertEquals(17, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals(49, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "JYm2N4\"Cg'PKYpA*D", "JYm2N4\"Cg'PKYpA*D", '\\');
      StrBuilder strBuilder0 = new StrBuilder((-249));
      StrBuilder strBuilder1 = strBuilder0.delete(0, 44);
      assertEquals(32, strBuilder1.capacity());
      assertEquals(0, strBuilder1.size());
      
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertEquals('\\', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "[(#'4Zl`&m6c(iQ m|(", "[(#'4Zl`&m6c(iQ m|(");
      StrBuilder strBuilder0 = new StrBuilder("[(#'4Zl`&m6c(iQ m|(");
      strSubstitutor0.replaceIn(strBuilder0);
      strBuilder0.delete(2, 34);
      assertEquals(2, strBuilder0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("[(#'4Zl`&m6c(iQ m|(");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "Abri\"N*O", "StrTokenizer");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      Properties properties0 = new Properties();
      String string0 = StrSubstitutor.replace((Object) strBuilder0, properties0);
      assertEquals(51, strBuilder0.capacity());
      assertEquals("[(#'4Zl`&m6c(iQ m|(", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("\"nh'6m8w;f?`Jh f3");
      strBuilder0.validateIndex(0);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator((String) null, 38);
      assertEquals(49, strBuilder1.capacity());
      assertEquals(17, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.validateIndex(0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("~K+c&()H(+c[yE", 0, 1564);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Properties properties0 = new Properties();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      properties0.put("zPN=", object0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "zPN=", "Variable preuixFmustf~ot be null!");
      StrBuilder strBuilder0 = new StrBuilder("user.name");
      StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      Integer integer0 = new Integer(46);
      // Undeclared exception!
      try { 
        strBuilder0.insert(674, (Object) integer0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 674
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StringBuffer stringBuffer0 = new StringBuffer("");
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, 357);
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0, "", "");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("");
      StrBuilder strBuilder1 = strBuilder0.setLength(0);
      assertEquals(32, strBuilder1.capacity());
      assertEquals(0, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(39);
      strBuilder0.lastIndexOf((StrMatcher) null, 357);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", 357, (-1661));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.deleteCharAt((-998));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -998
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test37()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(39);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      strBuilder0.lastIndexOf((StrMatcher) null, 357);
      String string0 = StrSubstitutor.replace((Object) hashMap0, (Properties) null);
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer("[(#'4Zl`&m6c(iQ m|(");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      
      StrBuilder strBuilder0 = new StrBuilder("$$\u0000$$");
      StrBuilder strBuilder1 = strBuilder0.delete(5, 2584);
      assertEquals(37, strBuilder1.capacity());
      assertEquals(5, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("[(#'4Zl`&m6c(iQ m|(");
      StrSubstitutor.replace((Object) "2_3m[T:L", (Properties) null);
      // Undeclared exception!
      try { 
        strBuilder0.delete((-23), (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -23
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "JYm2N4\"Cg'PKYpA*D", "JYm2N4\"Cg'PKYpA*D", '\\');
      StrBuilder strBuilder0 = new StrBuilder(22);
      strBuilder0.delete(0, 44);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", 9, 2088);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "[(#'4Zl`&m6c(iQ m|(", "{");
      strSubstitutor0.replace("[(#'4Zl`&m6c(iQ m|(", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.delete((-2143), (-2143));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2143
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("wilB4WvP");
      strBuilder0.appendSeparator('$', 2365);
      // Undeclared exception!
      try { 
        strBuilder0.delete((-783), (-783));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -783
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('I', (-3327));
      // Undeclared exception!
      try { 
        strBuilder1.replace((-3327), 100, "JYm2N4\"Cg'PKYpA*D");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3327
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "", "");
      StringBuffer stringBuffer0 = new StringBuffer();
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("", string0);
      
      StrBuilder strBuilder0 = new StrBuilder("rj8KYQp9");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(8, strBuilder0.length());
      assertEquals(40, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(9);
      StringBuffer stringBuffer0 = new StringBuffer("9");
      StrBuilder strBuilder1 = strBuilder0.append(stringBuffer0);
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      strBuilder1.lastIndexOf(strMatcher0, 9);
      // Undeclared exception!
      try { 
        strBuilder1.append((CharSequence) strBuilder1, 9, 9);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("FB~8z\"^q}s6Kc|c}");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Properties properties0 = new Properties();
      Object object0 = new Object();
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals("FB~8z\"^q}s6Kc|c}", stringBuffer0.toString());
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      properties0.put(strBuilder0, object0);
      assertEquals(48, strBuilder0.capacity());
      assertEquals(16, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "[(#'4Zl`&m6c(iQ m|(", "");
      StrBuilder strBuilder0 = new StrBuilder("\"tA,D&F");
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      strBuilder0.insert(0, "Invalid length: ");
      assertEquals(23, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      strSubstitutor0.replace((char[]) null);
      Object object0 = new Object();
      strSubstitutor0.setEnableSubstitutionInVariables(true);
      strSubstitutor0.setVariablePrefix('b');
      strSubstitutor0.replace((Object) strSubstitutor0);
      StrBuilder strBuilder0 = new StrBuilder("q[Ql");
      // Undeclared exception!
      try { 
        strBuilder0.delete(2355, 32);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Properties properties0 = new Properties();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      properties0.put("zPN=", object0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "zPN=", "Variable prefix must not be null!");
      StrBuilder strBuilder0 = new StrBuilder("user.name");
      StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-452));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -452
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("\"nh'6m8w;f?`Jh f3");
      strBuilder0.appendSeparator('_', 17);
      strBuilder0.validateIndex(17);
      assertEquals(18, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("\"nh'6m8w;f?`Jh f3");
      strBuilder0.appendSeparator('_', 0);
      strBuilder0.validateIndex(0);
      assertEquals(17, strBuilder0.length());
      assertEquals(49, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test52()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("");
      Properties properties0 = new Properties();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.size());
      assertEquals(0, strBuilder0.length());
      
      String string0 = StrSubstitutor.replace((Object) "", properties0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder("");
      StrBuilder strBuilder1 = strBuilder0.appendFixedWidthPadLeft(14, 6, 'c');
      StrBuilder strBuilder2 = strBuilder1.appendSeparator('k', 14);
      strBuilder2.appendSeparator("", 14);
      int int0 = strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 6);
      assertEquals(7, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.charAt((-686));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -686
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('$');
      char[] charArray0 = new char[5];
      charArray0[0] = '$';
      strSubstitutor1.replace(charArray0);
      StrBuilder strBuilder0 = new StrBuilder("$$\u0000$$");
      // Undeclared exception!
      try { 
        strBuilder0.insert(2584, charArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 2584
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder("");
      StrBuilder strBuilder1 = strBuilder0.appendFixedWidthPadLeft(14, 6, 'c');
      strBuilder1.appendSeparator('k', 14);
      strSubstitutor0.replace((StringBuffer) null);
      int int0 = strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 6);
      assertEquals(7, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "", "");
      StringBuffer stringBuffer0 = new StringBuffer();
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("", string0);
      
      StrBuilder strBuilder0 = new StrBuilder();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-1954));
      assertEquals(0, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "[(#'4Zl`&m6c(iQ m|(", "[(#'4Zl`&m6c(iQ m|(");
      StrBuilder strBuilder0 = new StrBuilder("[(#'4Zl`&m6c(iQ m|(");
      strBuilder0.delete(2, 34);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("uu$u", 2, 32);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("\"nh'6m8w;f?`Jh f3");
      strBuilder0.appendSeparator("\"nh'6m8w;f?`Jh f3", "<uOT");
      assertEquals(34, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "", "");
      StrBuilder strBuilder0 = new StrBuilder("@K|s");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("P,0PF{]-B^k>MlP9", (-564), 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer(0);
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("wilB4WvP");
      // Undeclared exception!
      try { 
        strBuilder0.delete((-783), (-783));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -783
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Integer integer0 = new Integer(9);
      StrSubstitutor.replace((Object) integer0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("9");
      strBuilder0.insert(1, 0L);
      assertEquals(2, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("\"nh'6m8w;f?`Jh f3");
      strBuilder0.validateIndex(0);
      assertEquals(17, strBuilder0.size());
      assertEquals(49, strBuilder0.capacity());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      String string0 = StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      assertNotNull(string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.setLength(18);
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("iX");
      strBuilder1.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, 820);
      // Undeclared exception!
      try { 
        strBuilder1.setLength((-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("FB~8z\"^q}s6Kc|c}");
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("iX");
      strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, (-472));
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("iX", 3034, (-1609));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("\"nh'6m8w;f?`Jh f3");
      strBuilder0.validateIndex(0);
      strBuilder0.appendSeparator("Invalid length: ", 28);
      assertEquals(33, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("\"nh'6m8w;f?`Jh f3");
      strBuilder0.validateIndex(0);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator(";PB2?~/-q^]G|$D", 0);
      assertEquals(49, strBuilder1.capacity());
      assertEquals(17, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "[(#'4Zl`&m6c(iQ m|(", "{");
      strSubstitutor0.replace("[(#'4Zl`&m6c(iQ m|(", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.delete(25, 4);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "[(#'4Zl`&m6c(iQ m|(", "{");
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder("");
      Properties properties0 = new Properties();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(0, strBuilder0.size());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "[(#'4Zl`&m6c(iQ m|(", "{");
      String string0 = strSubstitutor0.replace("[(#'4Zl`&m6c(iQ m|(", 0, 0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals("", string0);
      
      StrBuilder strBuilder0 = new StrBuilder("");
      Properties properties0 = new Properties();
      Reader reader0 = strBuilder0.asReader();
      assertFalse(reader0.ready());
      
      properties0.load(reader0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(39);
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, 357);
      assertEquals((-1), int0);
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(39, strBuilder0.capacity());
      assertFalse(boolean0);
      assertEquals(0, strBuilder0.length());
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "[(#'4Zl`&m6c(iQ m|(", "{");
      strSubstitutor0.replace("Invaldlength: ", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendln((long) 0);
      int int0 = strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 39);
      assertFalse(strBuilder0.isEmpty());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test73()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, 357);
      assertEquals((-1), int0);
      
      Properties properties0 = new Properties();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      String string0 = StrSubstitutor.replace((Object) locale_Category0, properties0);
      assertNotNull(string0);
      assertEquals("FORMAT", string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("[(#'4Zl`&m6c(iQ m|(");
      strBuilder0.appendSeparator('u', (int) 'u');
      strBuilder0.delete(2, 34);
      assertEquals(2, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("zp?X#q(Gd");
      strBuilder0.appendSeparator('$', (-3327));
      // Undeclared exception!
      try { 
        strBuilder0.replace(116, 40, "user.name");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test76()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrBuilder strBuilder0 = new StrBuilder("\"-nh'6m8w;f?`Jh f3");
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "\"-nh'6m8w;f?`Jh f3";
      strBuilder0.appendAll(objectArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "\"-nh'6m8w;f?`Jh f3", "\"-nh'6m8w;f?`Jh f3");
      String string0 = strSubstitutor0.replace(strBuilder0);
      assertEquals(36, strBuilder0.length());
      assertEquals("\"-nh'6m8w;f?`Jh f3\"-nh'6m8w;f?`Jh f3", string0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("");
      StrBuilder strBuilder1 = new StrBuilder("[(#'4Zl`&m6c(iQ m|(");
      StrBuilder strBuilder2 = strBuilder1.deleteFirst("^:dhUak");
      assertEquals(19, strBuilder2.length());
      
      Properties properties0 = new Properties();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(0, strBuilder0.size());
      assertEquals(32, strBuilder0.capacity());
      assertFalse(strBuilder0.equals((Object)strBuilder2));
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "[(#'4Zl`&m6c(iQ m|(", "");
      strSubstitutor0.replace("Invalid length: ", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder("\"tA,D&F");
      strBuilder0.insert(0, "Invalid length: ");
      assertEquals(23, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("wilB4WvP");
      strBuilder0.appendFixedWidthPadLeft(2365, 2365, 'k');
      Object object0 = new Object();
      strBuilder0.insert(2365, object0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("java.class.path", (-1970), 2365);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "", "");
      StrSubstitutor.replace((Object) "", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-1954));
      assertEquals(32, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("FB~8z\"^q}s6Kc|c}");
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("iX");
      strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, (-472));
      Properties properties0 = new Properties();
      String string0 = StrSubstitutor.replace((Object) strMatcher_StringMatcher0, properties0);
      assertNotNull(string0);
  }
}
