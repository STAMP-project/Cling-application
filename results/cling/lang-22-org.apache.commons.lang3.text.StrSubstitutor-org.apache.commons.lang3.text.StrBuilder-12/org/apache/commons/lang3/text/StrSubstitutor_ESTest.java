/*

 * Tue Mar 03 16:44:55 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.function.BiFunction;
import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.text.StrLookup;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.text.StrSubstitutor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrSubstitutor_ESTest extends StrSubstitutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("eUa/9");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, '{');
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((-2182), 1294, "is u");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2182
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("7");
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "7");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "7", "7", '3');
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-1), (int) '$');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("34suppor");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-16));
      assertEquals((-1), int0);
      assertEquals(40, strBuilder0.capacity());
      assertEquals(8, strBuilder0.size());
      
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("2l/`WuU4l\"*");
      StrBuilder strBuilder1 = strBuilder0.deleteAll(".Object@786");
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      int int0 = strBuilder1.lastIndexOf(strMatcher0, 9);
      assertEquals(9, int0);
      assertEquals(43, strBuilder1.capacity());
      assertEquals(11, strBuilder1.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("{}");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = (StrMatcher.StringMatcher)StrSubstitutor.DEFAULT_PREFIX;
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, (-2004318069));
      assertEquals(34, strBuilder0.capacity());
      assertEquals((-1), int0);
      
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefixMatcher(strSubstitutor0.DEFAULT_SUFFIX);
      StringBuffer stringBuffer0 = new StringBuffer("{}");
      stringBuffer0.insert(2, 832.6286F);
      String string0 = strSubstitutor1.replace(stringBuffer0);
      assertEquals("{}832.6286", string0);
      assertEquals('$', strSubstitutor1.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      Properties properties0 = new Properties();
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) null);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "{}", "{}", 'a');
      strSubstitutor0.replaceIn((StrBuilder) null);
      assertEquals('a', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder("tFypCd");
      properties0.put(strBuilder0, object0);
      assertEquals(6, strBuilder0.length());
      assertEquals(38, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      Properties properties0 = new Properties();
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) null);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "{}", "{}", 'a');
      StrBuilder strBuilder0 = new StrBuilder("tFypCd");
      strSubstitutor0.replaceIn(strBuilder0);
      assertEquals('a', strSubstitutor0.getEscapeChar());
      
      properties0.put(strBuilder0, object0);
      assertEquals(38, strBuilder0.capacity());
      assertEquals(6, strBuilder0.length());
      assertEquals(6, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("eUa/9");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, '{');
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert(2558, 'f');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 2558
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("7");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('3', 11);
      // Undeclared exception!
      try { 
        strBuilder1.toCharArray(9, 97);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("eUa/9");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, '{');
      Integer integer0 = new Integer(90);
      strSubstitutor0.replace((Object) integer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(360, 90);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("34suppor");
      strBuilder0.deleteAll("_");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-16));
      assertEquals(8, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(40, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("{}");
      strBuilder0.deleteAll("`\"0Ul");
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = (StrMatcher.StringMatcher)StrSubstitutor.DEFAULT_PREFIX;
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, (-2004318069));
      assertEquals(2, strBuilder0.length());
      assertEquals(34, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("34suppor");
      strBuilder0.deleteAll("prop");
      // Undeclared exception!
      try { 
        strBuilder0.replace(102, 1350, "]$xqW({j");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("34suppor");
      strBuilder0.replace(3, 2151, "34suppor");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace(" in an array of ", (-1), 23);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("34s&uwpir");
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      int int0 = strBuilder0.lastIndexOf(strMatcher0);
      assertEquals((-1), int0);
      
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('1', (-25));
      assertEquals(41, strBuilder1.capacity());
      assertEquals(9, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("tFypCd");
      StrBuilder strBuilder1 = strBuilder0.deleteAll("tFypCd");
      properties0.put(strBuilder1, object0);
      assertEquals(0, strBuilder0.size());
      assertTrue(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('1', 1018);
      StrMatcher strMatcher0 = StrMatcher.charMatcher('$');
      int int0 = strBuilder1.lastIndexOf(strMatcher0, 9);
      assertFalse(strBuilder0.isEmpty());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-4019), 21);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -4019
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator('J', 278);
      StrBuilder strBuilder1 = strBuilder0.deleteAll("34suppor");
      // Undeclared exception!
      try { 
        strBuilder1.replace((-990), 278, "p82monsOoo'4lpW W");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -990
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrLookup$MapStrLookup@53eb2805");
      strBuilder0.deleteAll("org.apache.commons.lang3.text.StrLookup$MapStrLookup@53eb2805");
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_SUFFIX, "org.apache.commons.lang3.text.StrLookup$MapStrLookup@53eb2805", (-2065), (-911), (-2065));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2065
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      properties0.computeIfPresent(strBuilder0, biFunction0);
      assertEquals(32, strBuilder0.capacity());
      
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      HashMap<String, Locale.Category> hashMap0 = new HashMap<String, Locale.Category>();
      hashMap0.remove((Object) strBuilder0);
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("java.lang.Object@21c149f3");
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) null);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "java.lang.Object@21c149f3", "java.lang.Object@21c149f3", 'a');
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefixMatcher(strMatcher0);
      StrSubstitutor strSubstitutor2 = strSubstitutor1.setVariableSuffixMatcher(strMatcher0);
      strSubstitutor2.replace("java.lang.Object@21c149f3");
      assertEquals('a', strSubstitutor2.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("eUa/9");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, '{');
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(360, 90);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("eUa/9");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, '{');
      StringBuffer stringBuffer0 = new StringBuffer("eUa/9");
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(35, 3812);
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
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('*', 1056);
      strBuilder1.deleteAll("1^8z:AdATJaA(3HQmP");
      // Undeclared exception!
      try { 
        strBuilder0.insert(229, (char[]) null, 24, 1056);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 229
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(".");
      strBuilder0.appendSeparator('C', 13);
      strBuilder0.insert(2, (long) 2);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("suppor", 806, 5);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("{}");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('1', 2);
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = (StrMatcher.StringMatcher)StrSubstitutor.DEFAULT_PREFIX;
      int int0 = strBuilder1.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, (-2004318069));
      assertEquals(3, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("java.lang.Object@22ffa3af");
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@22ffa3af");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('1', (-656));
      int int0 = strBuilder1.lastIndexOf(strMatcher0, (-656));
      assertEquals(57, strBuilder1.capacity());
      assertEquals(25, strBuilder1.length());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrSubstitutor.replace((Object) "?I7>k(3o!,}Cfa", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder(2);
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(32, 34);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-3575));
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Properties properties0 = new Properties();
      properties0.put("", hashMap0);
      StrSubstitutor.replace((Object) hashMap0, properties0);
      StrBuilder strBuilder0 = new StrBuilder((-1));
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(5, 5);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      properties0.computeIfPresent(strBuilder0, biFunction0);
      assertEquals(32, strBuilder0.capacity());
      
      String string0 = StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(394, 381);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("34suppor");
      StrBuilder strBuilder1 = strBuilder0.replace(3, 2151, "34suppor");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder1);
      assertEquals(11, strBuilder0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(",I");
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = (StrMatcher.StringMatcher)StrSubstitutor.DEFAULT_PREFIX;
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, 46);
      assertEquals(34, strBuilder0.capacity());
      assertEquals((-1), int0);
      
      Properties properties0 = new Properties();
      properties0.put("Linux", strMatcher_StringMatcher0);
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      String string0 = StrSubstitutor.replace((Object) locale_Category0, properties0);
      assertEquals("DISPLAY", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrBuilder strBuilder0 = new StrBuilder("34suppor");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      strBuilder0.insert(3, (long) 3);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("Variable prefix matcher must not be null!", 13, 116);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.put("", hashMap0);
      StrSubstitutor.replace((Object) hashMap0, properties0);
      // Undeclared exception!
      try { 
        strBuilder0.insert(11, 13);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 11
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.deleteCharAt((-952));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -952
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("eUa/9");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, '{');
      StringBuffer stringBuffer0 = new StringBuffer("eUa/9");
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(360, 90);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StrSubstitutor.replace((Object) "?I7>k(3o!,}Cfa", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("?I7>k(3o!,}Cfa");
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-2710), (-3863));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2710
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("os.version");
      strBuilder0.setLength(14);
      assertEquals(14, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator('J', 284);
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      assertFalse(strBuilder0.isEmpty());
      assertEquals("J", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrBuilder strBuilder0 = new StrBuilder("34suppor");
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = (StrMatcher.StringMatcher)StrSubstitutor.DEFAULT_PREFIX;
      strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, 3);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(40, strBuilder0.capacity());
      assertEquals(8, strBuilder0.length());
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Variable prefix matcher must not be null!");
      strBuilder0.appendSeparator('G', (-3096));
      // Undeclared exception!
      try { 
        strBuilder0.replace((-3096), (-3096), "Variable prefix matcher must not be null!");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3096
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StrSubstitutor.replace((Object) "?I7>k(3o!,}Cfa", (Properties) null);
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("#I5gLXV7aEob;");
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(14, strBuilder0.size());
      assertTrue(properties0.isEmpty());
      assertEquals(46, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrBuilder strBuilder0 = new StrBuilder("34suppor");
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = (StrMatcher.StringMatcher)StrSubstitutor.DEFAULT_PREFIX;
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, 3);
      assertEquals((-1), int0);
      assertEquals(8, strBuilder0.size());
      assertEquals(40, strBuilder0.capacity());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "suppor");
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("suppor", string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      
      Properties properties0 = new Properties();
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      properties0.computeIfPresent(strBuilder0, biFunction0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("34suppor");
      StrBuilder strBuilder1 = strBuilder0.insert(3, (-3301));
      strBuilder1.deleteAll("prop");
      assertEquals(13, strBuilder0.size());
      assertEquals(13, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) null);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "java.lang.Object@21c149f3", "java.lang.Object@21c149f3", 'a');
      StrBuilder strBuilder0 = new StrBuilder("set() is unsupported");
      strBuilder0.insert(11, 34);
      assertEquals(22, strBuilder0.length());
      
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('a', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("");
      properties0.put("", hashMap0);
      StrSubstitutor.replace((Object) hashMap0, properties0);
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-1), (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test51()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@17fa3f2b");
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(57, strBuilder0.capacity());
      
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String string0 = StrSubstitutor.replace((Object) hashMap0, properties0);
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrLookup$MapStrLookup@6354d415");
      char[] charArray0 = strBuilder0.toCharArray(9, 101);
      assertEquals(93, strBuilder0.capacity());
      assertEquals(52, charArray0.length);
      assertEquals(61, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("34suppor");
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = (StrMatcher.StringMatcher)StrSubstitutor.DEFAULT_PREFIX;
      strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, 3);
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "suppor", "z6Ec)", 'a');
      // Undeclared exception!
      try { 
        strSubstitutor0.setVariableSuffixMatcher((StrMatcher) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable suffix matcher must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-1223));
      StrBuilder strBuilder1 = strBuilder0.setNullText((String) null);
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = new StrBuilder("2l/`WuU4l\"*");
      strBuilder1.deleteAll("_");
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(3, 2662);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("set() is unsupported");
      StrBuilder strBuilder1 = strBuilder0.deleteAll("org.apache.commons.lang3.text.StrSubstitutor");
      // Undeclared exception!
      try { 
        strBuilder1.toCharArray(32, 8192);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("34suppor");
      strBuilder0.replace(3, 2151, "34suppor");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("Cs@p<m:Qo^?!b~@BN~H", 1, 39);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Properties properties0 = new Properties();
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("java.lang.Object@33042827");
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) null);
      StrBuilder strBuilder0 = new StrBuilder(9);
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(9, strBuilder0.capacity());
      assertEquals(0, strBuilder0.size());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'a');
      String string0 = strSubstitutor0.replace("set() is unsupported");
      assertNotNull(string0);
      assertEquals('a', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Properties properties0 = new Properties();
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("java.lang.Object@7d34c485");
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@7d34c485");
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, '');
      strSubstitutor0.replace(strBuilder0, 11, 11);
      assertEquals(57, strBuilder0.capacity());
      assertEquals(25, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("eUa/9");
      strBuilder0.appendSeparator("eUa/9");
      assertEquals(10, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      HashMap<String, Locale.Category> hashMap0 = new HashMap<String, Locale.Category>();
      hashMap0.remove((Object) strBuilder0);
      assertEquals(32, strBuilder0.capacity());
      
      String string0 = strSubstitutor0.replace("d'8TLa", 1, 2);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals("'8", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator('J', 278);
      strBuilder0.deleteAll("34suppor");
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, 256);
      assertEquals(1, strBuilder0.length());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrBuilder strBuilder0 = new StrBuilder("34s&uwpir");
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      strBuilder0.lastIndexOf(strMatcher0);
      StrSubstitutor strSubstitutor0 = null;
      try {
        strSubstitutor0 = new StrSubstitutor(strLookup0, "34s&uwpir", (String) null, '^');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable suffix must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrBuilder strBuilder0 = new StrBuilder("34suppor");
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = (StrMatcher.StringMatcher)StrSubstitutor.DEFAULT_PREFIX;
      strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, 3);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("w7<*~", 1592, 1592);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("34s&uwpir");
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      strBuilder0.lastIndexOf(strMatcher0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("2l/`WuU4l\"*", (-1), 1456);
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
      StrBuilder strBuilder0 = new StrBuilder("34suppor");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('1', 3);
      strBuilder1.deleteAll("suppor");
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = (StrMatcher.StringMatcher)StrSubstitutor.DEFAULT_PREFIX;
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, 3);
      assertEquals(3, strBuilder0.length());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Properties properties0 = new Properties();
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) null);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "{}", "{}", 'a');
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertFalse(boolean0);
      assertEquals('a', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder((-556));
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(0, strBuilder0.size());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Properties properties0 = new Properties();
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>(46);
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder(6);
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "java.lang.Object@44458bcc", "java.lang.Object@44458bcc", '=');
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(6, strBuilder0.capacity());
      assertEquals(0, strBuilder0.size());
      assertEquals(0, strBuilder0.length());
      assertEquals('=', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Properties properties0 = new Properties();
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) null);
      StrBuilder strBuilder0 = new StrBuilder(9);
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(9, strBuilder0.capacity());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "java.lang.Object@4eaaa502", "java.lang.Object@4eaaa502", 'a');
      StringBuffer stringBuffer0 = new StringBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      assertEquals('a', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("eUa/9");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, '{');
      StringBuffer stringBuffer0 = new StringBuffer("eUa/9");
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((-2182), 1294, "is u");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2182
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StrSubstitutor.replace((Object) "?I7>k(3o!,}Cfa", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("java.vm.specification.name");
      strBuilder0.insert(5, 34);
      assertEquals(28, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Object object0 = new Object();
      Properties properties0 = new Properties();
      StrSubstitutor.replace(object0, properties0);
      StrBuilder strBuilder0 = new StrBuilder("set() is unsupported");
      strBuilder0.insert(11, 34);
      assertEquals(22, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder((-556));
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('$', (-556));
      assertEquals(0, strBuilder1.size());
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("34s&uwpir");
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      int int0 = strBuilder0.lastIndexOf(strMatcher0);
      assertEquals(41, strBuilder0.capacity());
      assertEquals(9, strBuilder0.size());
      assertEquals((-1), int0);
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer(32);
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.setNullText("6o");
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Properties properties0 = new Properties();
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>(46);
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder(6);
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(0, strBuilder0.size());
      assertEquals(6, strBuilder0.capacity());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "java.lang.Object@44458bcc", "java.lang.Object@44458bcc", '=');
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('=', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('J', 284);
      strBuilder0.deleteAll("34suppor");
      HashMap<String, Locale.Category> hashMap0 = new HashMap<String, Locale.Category>();
      hashMap0.remove((Object) strBuilder1);
      assertFalse(strBuilder0.isEmpty());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@17fa3f2b");
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(1, properties0.size());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer("1v^/,haQ{n2");
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("1v^/,haQ{n2", string0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) null);
      StrBuilder strBuilder0 = new StrBuilder(",I");
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = (StrMatcher.StringMatcher)StrSubstitutor.DEFAULT_PREFIX;
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(",I");
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, 46);
      assertEquals(34, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals(2, strBuilder0.size());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_StringMatcher0, strMatcher0, '<');
      strSubstitutor0.setVariablePrefix('$');
      char[] charArray0 = new char[6];
      charArray0[0] = '$';
      String string0 = strSubstitutor0.replace(charArray0);
      assertEquals("$\u0000\u0000\u0000\u0000\u0000", string0);
      assertEquals('<', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@4bdde171");
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      // Undeclared exception!
      try { 
        strBuilder0.append("java.lang.Object@4bdde171", 23, 853);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator('J', 284);
      strBuilder0.deleteAll("34suppor");
      Reader reader0 = strBuilder0.asReader();
      Properties properties0 = new Properties();
      properties0.load(reader0);
      assertEquals(1, strBuilder0.length());
      assertEquals(1, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrLookup$MapStrLookup@2018863c");
      strBuilder0.appendSeparator('G', (-3096));
      // Undeclared exception!
      try { 
        strBuilder0.replace(2487, 116, "Variable suffix must not be null!");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("java.lang.Object@21c149f3");
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) null);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "java.lang.Object@21c149f3", "java.lang.Object@21c149f3", 'a');
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefixMatcher(strMatcher0);
      StrBuilder strBuilder0 = new StrBuilder("set() is unsupported");
      StrSubstitutor strSubstitutor2 = strSubstitutor1.setVariableSuffixMatcher(strMatcher0);
      strSubstitutor2.replaceIn(strBuilder0);
      strBuilder0.insert(11, 34);
      assertEquals(22, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("java.lang.Object@7334d0c6");
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) null);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "java.lang.Object@7334d0c6", "java.lang.Object@7334d0c6", 'a');
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefixMatcher(strMatcher0);
      StrBuilder strBuilder0 = new StrBuilder("set() is unsupported");
      StrSubstitutor strSubstitutor2 = strSubstitutor1.setVariableSuffixMatcher(strMatcher0);
      strSubstitutor2.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-1181), (-698));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1181
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@6cd95e6f");
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("is u", 853, 853);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@17fa3f2b");
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("1v^/,haQ{n2", (-1), (-629));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@17fa3f2b");
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(1, properties0.size());
      
      strBuilder0.deleteAll("d}z> tFiF");
      assertEquals(25, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrBuilder strBuilder0 = new StrBuilder("34suppor");
      strBuilder0.insert(3, (-3301));
      assertEquals(13, strBuilder0.size());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      String string0 = strSubstitutor0.replace("60zC`D]eb~+lbL", 3, 2);
      assertEquals("C`", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test89()  throws Throwable  {
      Properties properties0 = new Properties();
      String string0 = StrSubstitutor.replace((Object) properties0, properties0);
      assertEquals("{}", string0);
      assertNotNull(string0);
      
      StrBuilder strBuilder0 = new StrBuilder("{}");
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = (StrMatcher.StringMatcher)StrSubstitutor.DEFAULT_PREFIX;
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, (-2004318069));
      assertEquals((-1), int0);
      assertEquals(34, strBuilder0.capacity());
  }
}
