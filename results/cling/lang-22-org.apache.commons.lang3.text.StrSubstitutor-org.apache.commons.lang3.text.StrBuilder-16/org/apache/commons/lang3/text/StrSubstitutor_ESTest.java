/*

 * Tue Mar 03 16:44:55 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
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
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrSubstitutor_ESTest extends StrSubstitutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replace((StringBuffer) null);
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-3634), (-3634));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3634
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-19), 1257, ": ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -19
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertFalse(boolean0);
      
      StrBuilder strBuilder0 = new StrBuilder();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-333));
      assertEquals((-1), int0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-1555));
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = (StrMatcher.StringMatcher)StrSubstitutor.DEFAULT_SUFFIX;
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, (-1555));
      assertEquals((-1), int0);
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertFalse(boolean0);
      assertEquals(0, strBuilder0.length());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder("s.la");
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.put(strBuilder0, object0);
      assertEquals(36, strBuilder0.capacity());
      assertEquals(4, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.remove((Object) strBuilder0);
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(0, strBuilder0.length());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder('$');
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.remove((Object) strBuilder0);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("+v+$'Q:3x,o#b^Y |", (-4290));
      assertEquals(36, strBuilder1.capacity());
      assertTrue(strBuilder1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator('$', (-88));
      // Undeclared exception!
      try { 
        strBuilder0.replace(101, (-88), "lang3");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrBuilder strBuilder0 = new StrBuilder(46);
      Properties properties0 = new Properties();
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, 46);
      assertEquals(46, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals(0, strBuilder0.length());
      
      Object object0 = new Object();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap1);
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('6');
      String string0 = strSubstitutor1.replace(object0);
      assertEquals('$', strSubstitutor1.getEscapeChar());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("\u0000{", (-3194));
      // Undeclared exception!
      try { 
        strBuilder1.replace(505, 4, ": ");
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.append((Object) strSubstitutor0);
      strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 535);
      StrLookup<String> strLookup0 = StrLookup.mapLookup((Map<String, String>) hashMap0);
      StrSubstitutor strSubstitutor1 = null;
      try {
        strSubstitutor1 = new StrSubstitutor(strLookup0, "FORMAT", (String) null, '$');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable suffix must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(".");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("B=4C^el|Z7r", (-1));
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrMatcher strMatcher0 = StrMatcher.noneMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'N');
      int int0 = strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-1));
      assertEquals(1, strBuilder1.length());
      assertEquals((-1), int0);
      assertEquals(33, strBuilder1.capacity());
      assertEquals('N', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("W");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('T', 36);
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
      int int0 = strBuilder1.lastIndexOf((StrMatcher) strMatcher_NoMatcher0, 36);
      assertEquals(2, strBuilder0.length());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = new StrBuilder((String) null);
      strBuilder0.append((Object) hashMap0);
      StrMatcher strMatcher0 = StrMatcher.spaceMatcher();
      int int0 = strBuilder0.lastIndexOf(strMatcher0, 2);
      assertEquals(2, strBuilder0.length());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.lastIndexOf((StrMatcher) null, (-333));
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("<XM2(4Nd_fdBB}L", (-1), 684);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((-691), 816, "java.awt.fonts");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -691
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-3634), (-3634));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3634
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.append((Object) strSubstitutor0);
      strBuilder1.deleteAll("Variable suffix must not be null!");
      // Undeclared exception!
      try { 
        strBuilder0.substring((-96));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -96
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder('$');
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.remove((Object) strBuilder0);
      assertEquals(36, strBuilder0.capacity());
      
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.remove((Object) strBuilder0);
      assertEquals(32, strBuilder0.capacity());
      
      StringBuffer stringBuffer0 = new StringBuffer("Mac OS X");
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("Mac OS X", string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(48, 0);
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
  public void test21()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.append((Object) strSubstitutor0);
      strBuilder1.deleteCharAt('$');
      assertEquals(52, strBuilder0.size());
      assertEquals(106, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0);
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder();
      char[] charArray0 = strBuilder0.toCharArray(0, 48);
      assertEquals(0, charArray0.length);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StringBuffer stringBuffer0 = new StringBuffer("?xm%FF^U");
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((int) '$', (int) '$');
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.append((Object) strSubstitutor0);
      strBuilder1.insert(5, "");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("Infinite loop in property interpolation of ", 2187, (-2059));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Integer integer0 = new Integer(0);
      StrSubstitutor.replace((Object) integer0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("0");
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      int int0 = strBuilder0.lastIndexOf(strMatcher0, 1443);
      assertEquals(1, strBuilder0.length());
      assertEquals(33, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrSubstitutor.replace((Object) "java.lang.Object@5d1986f5", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(26, 26);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.setProperty("W", "gr1P.4$ct{Q");
      StrSubstitutor.replace((Object) "W", properties0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace(31, 31, "The Array must not be null");
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
  public void test28()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      StrBuilder strBuilder1 = strBuilder0.append((Object) locale_Category0);
      strBuilder1.setNullText("[OUNoc;ZCk0+C");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 10);
      assertEquals(6, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(529);
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      Object object0 = new Object();
      properties0.put(strBuilder0, object0);
      assertEquals(529, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn((StrBuilder) null);
      // Undeclared exception!
      try { 
        strBuilder0.replace(505, 4, ": ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(134, (int) '$', (String) null);
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
      StrBuilder strBuilder0 = new StrBuilder(529);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor1 = new StrSubstitutor((Map<String, ?>) hashMap0, "n", "n", '$');
      strSubstitutor1.replace((Object) strSubstitutor0);
      assertEquals('$', strSubstitutor1.getEscapeChar());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.put(strBuilder0, object0);
      assertEquals(529, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.setProperty("W", "gr1P.4$ct{Q");
      String string0 = StrSubstitutor.replace((Object) "W", properties0);
      assertEquals("W", string0);
      
      StrBuilder strBuilder0 = new StrBuilder("W");
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_NoMatcher0, 36);
      assertEquals(33, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Variable suffix must not be null!");
      strBuilder0.insert(0, 0.0F);
      strBuilder0.appendSeparator((String) null, (-1898));
      assertEquals(36, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor1 = new StrSubstitutor((Map<String, ?>) hashMap0, ".", ".", '$');
      strSubstitutor1.replace((Object) strSubstitutor0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(24, 350, ".");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@2e1eb467");
      StrBuilder strBuilder1 = strBuilder0.setCharAt(1, '$');
      assertEquals(57, strBuilder1.capacity());
      assertEquals(25, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.lastIndexOf((StrMatcher) null, (-333));
      // Undeclared exception!
      try { 
        strBuilder0.deleteCharAt(32);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 32
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      StrBuilder strBuilder0 = new StrBuilder("Variable suffix must not be null!");
      strBuilder0.insert(0, 0.0F);
      StrLookup<String> strLookup0 = StrLookup.mapLookup((Map<String, String>) null);
      StrMatcher strMatcher1 = StrMatcher.singleQuoteMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher1, 'A');
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("4.9", 0, 15);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.setProperty("W", "gr1P.4$ct{Q");
      StrSubstitutor.replace((Object) "W", properties0);
      StrBuilder strBuilder0 = new StrBuilder(33);
      // Undeclared exception!
      try { 
        strBuilder0.insert(9, (float) 33);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 9
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder('$');
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.remove((Object) strBuilder0);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("", 256);
      assertEquals(36, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, (-333));
      assertEquals(0, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals(32, strBuilder0.capacity());
      
      HashMap<String, StrLookup<Object>> hashMap0 = new HashMap<String, StrLookup<Object>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<Object>>) hashMap0);
      StringBuffer stringBuffer0 = new StringBuffer("org.apache.commons.lang3.text.StrSubstitutor");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder('$');
      // Undeclared exception!
      try { 
        strBuilder0.deleteCharAt((-1879));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1879
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      Object object0 = new Object();
      StrBuilder strBuilder1 = strBuilder0.append(object0);
      strBuilder1.setNullText("");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 10);
      assertEquals(25, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "${", "", 'J');
      StrBuilder strBuilder0 = new StrBuilder("{}");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 57);
      assertEquals('J', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
      
      StrBuilder strBuilder1 = strBuilder0.setNullText((String) null);
      assertEquals(34, strBuilder1.capacity());
      assertEquals(2, strBuilder1.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer(4);
      strSubstitutor0.replaceIn(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(505, 4, ": ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StrSubstitutor.replace((Object) "java.lang.Object@624b6d70", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-3634), (-3634));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3634
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@60e35fad");
      char char0 = strBuilder0.charAt(0);
      assertEquals(57, strBuilder0.capacity());
      assertEquals(25, strBuilder0.length());
      assertEquals('j', char0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.toCharArray(0, 48);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", 116, 44);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0);
      strSubstitutor0.replace("#jv", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((-551), (-551), ",]6|{v^C|p4 ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -551
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.append((Object) strSubstitutor0);
      strSubstitutor0.replaceIn((StrBuilder) null);
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 412);
      assertFalse(strBuilder0.isEmpty());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder1 = new StrBuilder("0");
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      int int0 = strBuilder1.lastIndexOf(strMatcher0, 1443);
      assertEquals((-1), int0);
      assertEquals(33, strBuilder1.capacity());
      assertFalse(strBuilder1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.remove((Object) strBuilder0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("lang", 14, 14);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder('$');
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('$', 1350);
      // Undeclared exception!
      try { 
        strBuilder1.replace((-1952), 2477, "bkrbi/BUC*k7D");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1952
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder("W");
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_NoMatcher0, 36);
      assertEquals(33, strBuilder0.capacity());
      assertEquals(1, strBuilder0.length());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "${", "${", 'J');
      StrBuilder strBuilder0 = new StrBuilder("{}");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 57);
      assertEquals(34, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals(2, strBuilder0.length());
      
      StringBuffer stringBuffer0 = new StringBuffer("{}");
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals('J', strSubstitutor0.getEscapeChar());
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.append((Object) strSubstitutor0);
      strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 138);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("cC|WG/_bkEKowp=H:", 50, (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.remove((Object) strBuilder0);
      assertEquals(32, strBuilder0.capacity());
      
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Variable suffix must not be null!");
      strBuilder0.insert(0, 0.0F);
      StrLookup<String> strLookup0 = StrLookup.mapLookup((Map<String, String>) null);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      String string0 = strSubstitutor0.replace((StringBuffer) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrBuilder strBuilder0 = new StrBuilder("length must be valid");
      strBuilder0.insert(10, 1.0F);
      assertEquals(23, strBuilder0.size());
      
      StringBuffer stringBuffer0 = new StringBuffer("H0fMww:{$,sg)V9H");
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("H0fMww:{$,sg)V9H", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.setProperty("W", "gr1P.4{Q");
      StrSubstitutor.replace((Object) "W", properties0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((-2705), (-632), "gr1P.4{Q");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2705
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator("^/V=a}RUM&k+Ta+-,t", 2);
      // Undeclared exception!
      try { 
        strBuilder0.replace(24, 350, ".");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator((String) null, (int) '$');
      // Undeclared exception!
      try { 
        strBuilder1.replace(134, (int) '$', (String) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StrSubstitutor.replace((Object) "java.lang.Object@60e35fad", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@60e35fad");
      // Undeclared exception!
      try { 
        strBuilder0.insert(33, 0.0F);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 33
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.append((Object) strSubstitutor0);
      strBuilder1.appendSeparator(".", 11);
      int int0 = strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 11);
      assertFalse(strBuilder0.isEmpty());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.append((Object) strSubstitutor0);
      strBuilder1.appendSeparator((String) null, 11);
      int int0 = strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 44);
      assertFalse(strBuilder0.isEmpty());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "java.lang.Object@3723265f", "java.lang.Object@3723265f");
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      strBuilder0.lastIndexOf(strMatcher0, (-1785));
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("org.apache.commons.lang3.text.StrSubstitutor", 13, (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test67()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.append((Object) strSubstitutor0);
      char[] charArray0 = strBuilder1.toCharArray(1, 24);
      assertEquals(53, strBuilder0.length());
      assertEquals(23, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-3585));
      // Undeclared exception!
      try { 
        strBuilder0.charAt((-3585));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3585
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("0");
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replaceIn(stringBuffer0);
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      int int0 = strBuilder0.lastIndexOf(strMatcher0, 1443);
      assertEquals(1, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals(33, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(529);
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-333));
      assertEquals((-1), int0);
      assertEquals(529, strBuilder0.capacity());
      
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(46);
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, (-333));
      assertEquals((-1), int0);
      assertEquals(46, strBuilder0.capacity());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer("Array element ");
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("Array element ", string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      StrBuilder strBuilder0 = new StrBuilder("Variable suffix must not be null!");
      StrLookup<String> strLookup0 = StrLookup.mapLookup((Map<String, String>) null);
      StrMatcher strMatcher1 = StrMatcher.singleQuoteMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher1, 'A');
      strBuilder0.replace(0, 777, "Variable suffix must not be null!");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("4.9", 0, 15);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator('$', (int) '$');
      strBuilder0.appendSeparator(".");
      assertEquals(2, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor1 = new StrSubstitutor((Map<String, ?>) hashMap0, ".", ".", '$');
      strSubstitutor1.replace((Object) strSubstitutor0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        strBuilder0.insert(9, object0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 9
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      StrBuilder strBuilder1 = strBuilder0.append((Object) locale_Category0);
      strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 10);
      // Undeclared exception!
      try { 
        strSubstitutor0.setVariablePrefix((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable prefix must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test76()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariableSuffix(".");
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.append((Object) strSubstitutor0);
      StrSubstitutor strSubstitutor2 = strSubstitutor1.setVariablePrefix(".");
      strBuilder1.lastIndexOf(strSubstitutor2.DEFAULT_PREFIX, (-2215));
      strSubstitutor0.replace(strBuilder0);
      assertFalse(strBuilder0.isEmpty());
      assertEquals(53, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("W");
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
      strBuilder0.lastIndexOf((StrMatcher) strMatcher_NoMatcher0, 36);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("W", (-2641), 682);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.append((Object) strSubstitutor0);
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
      strBuilder1.lastIndexOf((StrMatcher) strMatcher_NoMatcher0, 682);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace(".", 0, (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer("#jv");
      strSubstitutor0.replaceIn(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-551), (-551), ",]6|{v^C|p4 ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -551
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Variable suffix must not be null!");
      strBuilder0.insert(30, 0.0F);
      Object object0 = new Object();
      Properties properties0 = new Properties();
      String string0 = StrSubstitutor.replace(object0, properties0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder(1);
      strBuilder0.lastIndexOf((StrMatcher) null, (-333));
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("java.vm.specification.version", 40, (-283));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0);
      strSubstitutor0.replace("#kv", 0, 0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder(1);
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, (-333));
      assertEquals(1, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test83()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.append((Object) strSubstitutor0);
      StrBuilder strBuilder1 = strBuilder0.insert(4, 4);
      strBuilder1.appendSeparator(".", 1479);
      assertEquals(55, strBuilder0.size());
      assertEquals(106, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Variable suffix must not be null!");
      strBuilder0.insert(0, 0.0F);
      strBuilder0.appendSeparator("U", 0);
      assertEquals(36, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replace("org.apache.commons.lang3.text.StrSubstitutor@4b1f9ed", 2, 24);
      // Undeclared exception!
      try { 
        strBuilder0.replace(24, 350, ".");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(46);
      Properties properties0 = new Properties();
      strBuilder0.lastIndexOf((StrMatcher) null, (-333));
      Object object0 = new Object();
      String string0 = StrSubstitutor.replace(object0, properties0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(46);
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, 46);
      assertEquals((-1), int0);
      
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0);
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertFalse(boolean0);
      assertEquals(0, strBuilder0.length());
      assertEquals(46, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor1 = new StrSubstitutor((Map<String, ?>) hashMap0, ".", ".", '$');
      strSubstitutor1.replace((Object) strSubstitutor0);
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      strBuilder0.append((Object) locale_Category0);
      strBuilder0.lastIndexOf(strSubstitutor1.DEFAULT_SUFFIX, (int) '$');
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "k", "xeie3/&.{A?%'}`", 'q');
      strSubstitutor0.replace("k");
      assertEquals('q', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.append((Object) strSubstitutor0);
      strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 535);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("XA}dUfk", 7, 535);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrBuilder strBuilder0 = new StrBuilder("0WN9");
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      int int0 = strBuilder0.lastIndexOf(strMatcher0, 7);
      assertEquals((-1), int0);
      assertEquals(36, strBuilder0.capacity());
      assertEquals(4, strBuilder0.size());
      
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "", "0WN9", '<');
      String string0 = strSubstitutor0.replace("Infinite loop in property interpolation of ", 7, 2);
      assertNotNull(string0);
      assertEquals('<', strSubstitutor0.getEscapeChar());
      assertEquals("e ", string0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 1257);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-19), 1257, ": ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -19
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(".");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("B=4C^el|Z7r", (-1));
      // Undeclared exception!
      try { 
        strBuilder1.toCharArray((-3030), (-2221));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3030
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('$', (int) '$');
      // Undeclared exception!
      try { 
        strBuilder1.replace(116, 6, "..");
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
  public void test95()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(529);
      StrBuilder strBuilder1 = strBuilder0.append((Object) strSubstitutor0);
      StrSubstitutor strSubstitutor1 = new StrSubstitutor((Map<String, ?>) hashMap0, "n", "n", '$');
      strSubstitutor1.replace((Object) strSubstitutor0);
      strBuilder1.insert(33, 3393.5564F);
      assertEquals(62, strBuilder0.length());
      assertEquals(62, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor1 = new StrSubstitutor((Map<String, ?>) hashMap0, ".", ".", '$');
      strSubstitutor1.replace((Object) strSubstitutor0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-276), 80, "m!?'Cy");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -276
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      StrBuilder strBuilder0 = new StrBuilder("Variable suffix must not be null!");
      strBuilder0.insert(0, 0.0F);
      assertEquals(36, strBuilder0.length());
      
      StrLookup<String> strLookup0 = StrLookup.mapLookup((Map<String, String>) null);
      StrMatcher strMatcher1 = StrMatcher.singleQuoteMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher1, 'A');
      String string0 = strSubstitutor0.replace("java.library.path", 0, 15);
      assertEquals("java.library.pa", string0);
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.append((Object) strSubstitutor0);
      strBuilder0.insert(4, 4);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("Infinite loop in property interpolation of ", (-1), (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test99()  throws Throwable  {
      StrSubstitutor.replace((Object) "java.lang.Object@ce76aec", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder((-6463));
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, (-6463));
      assertEquals((-1), int0);
      assertEquals(32, strBuilder0.capacity());
  }
}
