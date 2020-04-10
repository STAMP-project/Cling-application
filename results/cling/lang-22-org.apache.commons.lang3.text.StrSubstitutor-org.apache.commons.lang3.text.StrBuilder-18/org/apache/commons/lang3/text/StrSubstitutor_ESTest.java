/*

 * Tue Mar 03 16:44:48 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.util.HashMap;
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
      StringBuffer stringBuffer0 = new StringBuffer('$');
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-2401), 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2401
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder('$');
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-1627));
      assertEquals((-1), int0);
      assertEquals(36, strBuilder0.capacity());
      
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertFalse(boolean0);
      
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-523));
      assertEquals((-1), int0);
      assertEquals(0, strBuilder0.length());
      assertEquals(32, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, StrLookup<String>> hashMap0 = new HashMap<String, StrLookup<String>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<String>>) hashMap0, "bsfr uUi?C", "bsfr uUi?C");
      StrBuilder strBuilder0 = new StrBuilder('$');
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, "org.apache.commons.lang3.text.StrSubstitutor@66d2c6ef");
      assertEquals(36, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, StrLookup<String>> hashMap0 = new HashMap<String, StrLookup<String>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<String>>) hashMap0, "bsfr uUi?C", "bsfr uUi?C");
      StrBuilder strBuilder0 = new StrBuilder('$');
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, "org.apache.commons.lang3.text.StrSubstitutor@1c1cded7");
      assertEquals(36, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("ject@2e");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, '^');
      String string0 = strSubstitutor0.replace((Object) "ject@2e");
      assertNotNull(string0);
      assertEquals('^', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert(100, (long) 100);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 100
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder("` LP");
      StringBuffer stringBuffer0 = new StringBuffer("ject@1cf");
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.insert(31, (-1L));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 31
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrBuilder strBuilder0 = new StrBuilder("user.region");
      StrBuilder strBuilder1 = strBuilder0.deleteAll("W=iTKDc");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "q-8ETe*5zORua|{d", "mg,|Qz1B?Bvn.g4", 'c');
      int int0 = strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-1));
      assertEquals((-1), int0);
      assertEquals('c', strSubstitutor0.getEscapeChar());
      assertEquals(43, strBuilder1.capacity());
      assertEquals(11, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("user.region");
      strBuilder0.deleteFirst("ject@10c5422");
      // Undeclared exception!
      try { 
        strBuilder0.replace(9, 0, "user.region");
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
      HashMap<String, StrLookup<String>> hashMap0 = new HashMap<String, StrLookup<String>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<String>>) hashMap0, "bsfr uUi?C", "bsfr uUi?C");
      StrBuilder strBuilder0 = new StrBuilder('$');
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, "org.apache.commons.lang3.text.StrSubstitutor@1336bc76");
      assertEquals(36, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
      
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "bsfr uUi?C");
      stringBuffer0.append(42);
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "I", "ject@6029", '6');
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@2bb9eda0");
      // Undeclared exception!
      try { 
        strBuilder0.substring((-680), (-1283));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -680
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      char[] charArray0 = new char[1];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'j');
      StrBuilder strBuilder0 = new StrBuilder(26);
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-4795));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -4795
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("user.region");
      StrBuilder strBuilder1 = strBuilder0.deleteAll("W=iTKDc");
      // Undeclared exception!
      try { 
        strBuilder1.substring((-1283), (-680));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1283
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, StrLookup<String>> hashMap0 = new HashMap<String, StrLookup<String>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<String>>) hashMap0, "bsfr uUi?C", "bsfr uUi?C");
      StrBuilder strBuilder0 = new StrBuilder('$');
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, "org.apache.commons.lang3.text.StrSubstitutor@1c1cded7");
      assertEquals(0, strBuilder0.length());
      assertEquals(36, strBuilder0.capacity());
      
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, StrLookup<String>> hashMap0 = new HashMap<String, StrLookup<String>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<String>>) hashMap0, "bsfr uUi?C", "bsfr uUi?C");
      StrBuilder strBuilder0 = new StrBuilder('$');
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, "org.apache.commons.lang3.text.StrSubstitutor@24f2ce5d");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("bsfr uUi?C", (-1060), 5799);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, StrLookup<String>> hashMap0 = new HashMap<String, StrLookup<String>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<String>>) hashMap0, "bsfr uUi?C", "bsfr uUi?C");
      StrBuilder strBuilder0 = new StrBuilder('$');
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, "org.apache.commons.lang3.text.StrSubstitutor@123a01a");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", 0, (-2286));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(">}>&N<,D");
      strBuilder0.appendSeparator((String) null, 2800);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-131), (-1433), ">}>&N<,D");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -131
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrMatcher strMatcher0 = StrMatcher.charMatcher('6');
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, '6');
      char[] charArray0 = new char[9];
      charArray0[4] = '6';
      charArray0[6] = '6';
      charArray0[7] = '6';
      String string0 = strSubstitutor0.replace(charArray0);
      assertNotNull(string0);
      assertEquals("\u0000\u0000\u0000\u00006\u00006\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder(32);
      // Undeclared exception!
      try { 
        strBuilder0.replace(1, 32, "");
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer(4);
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(114, 3616, "Linux");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      char[] charArray0 = new char[1];
      charArray0[0] = 'b';
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'r');
      char char0 = StrSubstitutor.DEFAULT_ESCAPE;
      Object object0 = new Object();
      strSubstitutor0.replace(object0);
      StrBuilder strBuilder0 = mock(StrBuilder.class, new ViolatedAssumptionAnswer());
      StrBuilder strBuilder1 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder1.replace(31, 21, "ject@4");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendln((String) null, 192, 192);
      StrMatcher strMatcher0 = StrMatcher.charMatcher('$');
      int int0 = strBuilder0.lastIndexOf(strMatcher0, 58);
      assertEquals(1, strBuilder0.length());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-1627));
      strBuilder0.appendSeparator('%', 4573);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-1627));
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('$', (-1627));
      assertTrue(strBuilder1.isEmpty());
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("YGGtG4SQp");
      // Undeclared exception!
      try { 
        strBuilder0.replace(36, 36, "F9T%2rd");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer(4);
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      
      StrBuilder strBuilder0 = new StrBuilder();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-1627));
      assertEquals(32, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("user.region");
      StrBuilder strBuilder1 = strBuilder0.deleteAll("W=iTKDc");
      // Undeclared exception!
      try { 
        strBuilder1.insert(21, 21);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 21
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.put("@", "@");
      StrSubstitutor.replace((Object) "@", properties0);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.replace(Integer.MAX_VALUE, Integer.MAX_VALUE, "@");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashMap<String, StrLookup<String>> hashMap0 = new HashMap<String, StrLookup<String>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<String>>) hashMap0, "bsfr uUi?C", "bsfr uUi?C");
      StrBuilder strBuilder0 = new StrBuilder('$');
      Properties properties0 = new Properties();
      String string0 = StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertNotNull(string0);
      
      properties0.put(strBuilder0, "org.apache.commons.lang3.text.StrSubstitutor@1c1cded7");
      assertEquals(36, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      char[] charArray0 = new char[1];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'j');
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder("YGGtG4SQp");
      // Undeclared exception!
      try { 
        strBuilder0.replace(36, 36, "F9T%2rd");
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
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      char[] charArray0 = new char[1];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'j');
      StrBuilder strBuilder0 = new StrBuilder("");
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(1949, 9, "W=iTKDc");
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
  public void test32()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.put("@", "@");
      String string0 = StrSubstitutor.replace((Object) "@", properties0);
      assertEquals("@", string0);
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(" x,UWytY{a<h,)1f.5O");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 1039);
      assertEquals(51, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      char[] charArray0 = new char[1];
      charArray0[0] = 'b';
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'j');
      Object object0 = new Object();
      strSubstitutor0.replace(object0);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.replace(1949, 9, "W=iTKDc");
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
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.deleteCharAt((-2062));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2062
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      char[] charArray0 = new char[1];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'j');
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("YGGtG4SQp");
      // Undeclared exception!
      try { 
        strBuilder0.replace(36, 36, "F9T%2rd");
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
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@c27a998");
      // Undeclared exception!
      try { 
        strBuilder0.substring((-680), 16);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -680
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("user.region");
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      assertEquals(43, strBuilder0.capacity());
      assertEquals("user.region", stringBuffer0.toString());
      assertEquals(11, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      char[] charArray0 = new char[1];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'j');
      strSubstitutor0.replace("l)MS,`", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1769), (-1769), "add() is unsupported");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1769
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HashMap<String, StrLookup<String>> hashMap0 = new HashMap<String, StrLookup<String>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<String>>) hashMap0, "bsfr uUi?C", "bsfr uUi?C");
      StrBuilder strBuilder0 = new StrBuilder('$');
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, "org.apache.commons.lang3.text.StrSubstitutor@66d2c6ef");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("Mac OS X", 2885, (-3185));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendln((String) null, 192, 192);
      StrMatcher strMatcher0 = StrMatcher.charMatcher('$');
      int int0 = strBuilder0.lastIndexOf(strMatcher0, 58);
      assertFalse(strBuilder0.isEmpty());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StringBuffer stringBuffer0 = new StringBuffer(4773);
      StrBuilder strBuilder0 = new StrBuilder("Y#I0Bo|7ei");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 1716);
      assertEquals((-1), int0);
      assertEquals(10, strBuilder0.length());
      assertEquals(42, strBuilder0.capacity());
      
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("", string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Properties properties0 = new Properties();
      Integer integer0 = new Integer(1430);
      properties0.put("@", "@");
      StrBuilder strBuilder0 = new StrBuilder(1430);
      StrSubstitutor.replace((Object) integer0, properties0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-305), 9, "ject@5de4a4");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -305
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert(100, (long) 100);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 100
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HashMap<String, StrLookup<String>> hashMap0 = new HashMap<String, StrLookup<String>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<String>>) hashMap0, "bsfr uUi?C", "bsfr uUi?C");
      StrBuilder strBuilder0 = new StrBuilder('$');
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      // Undeclared exception!
      try { 
        strBuilder0.insert(48, (long) 48);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 48
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder('$');
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-1627));
      strBuilder0.appendSeparator("Invalid offset: ", 4);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder('$');
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-1627));
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("a0cuIrSkm!}`J>C(C4", 4, 2802);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StringBuffer stringBuffer0 = new StringBuffer(4773);
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("F]Y#I0Bo|7ei");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 4773);
      assertEquals(12, strBuilder0.length());
      assertEquals(44, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("user.region");
      strBuilder0.deleteAll("W=iTKDc");
      // Undeclared exception!
      try { 
        strBuilder0.replace(100, 101, "ject@51");
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
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('m');
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_CharMatcher0, (-4761));
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrBuilder strBuilder0 = new StrBuilder("user.region");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "q-8ETe*5zORua|{d", "mg,|Qz1B?Bvn.g4", 'c');
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("", string0);
      
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-1));
      assertEquals('c', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
      assertEquals(11, strBuilder0.length());
      assertEquals(43, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("+Q:dW)K3U~OFiV5i:[");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator((String) null);
      assertEquals(18, strBuilder1.length());
      assertEquals(50, strBuilder1.capacity());
      assertFalse(strBuilder1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HashMap<String, StrLookup<String>> hashMap0 = new HashMap<String, StrLookup<String>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<String>>) hashMap0, "bsfr uUi?C", "bsfr uUi?C");
      StrBuilder strBuilder0 = new StrBuilder('$');
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, "org.apache.commons.lang3.text.StrSubstitutor@1c1cded7");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", 0, (int) '$');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      char[] charArray0 = new char[1];
      charArray0[0] = 'b';
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'j');
      strSubstitutor0.getEscapeChar();
      StrSubstitutor.replaceSystemProperties("l)MS,`");
      Object object0 = new Object();
      strSubstitutor0.replace(object0);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.insert(21, 0L);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 21
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder("F]Y#I0Bo|7ei");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 1713);
      StrSubstitutor strSubstitutor1 = null;
      try {
        strSubstitutor1 = new StrSubstitutor((Map<String, Object>) hashMap0, (String) null, (String) null, '$');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable prefix must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder("F]Y#I0Bo|7ei");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 125);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("F]Y#I0Bo|7ei", 32, 125);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charMatcher('u');
      StrBuilder strBuilder0 = new StrBuilder("ject@1e8");
      strBuilder0.lastIndexOf(strMatcher0, 0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0, "X4YlWjNY,`|9%|T", "ject@5913");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("X4YlWjNY,`|9%|T", (-1), 32);
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
      StringBuffer stringBuffer0 = new StringBuffer('$');
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring((-2401), 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2401
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.setNullText("java.awt.printerjob");
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-523));
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("kl=`a9", 7, 1687);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-1627));
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", 0, (-5301));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      char[] charArray0 = new char[1];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'j');
      strSubstitutor0.replace("l)MS,`", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.replace(1949, 9, "W=iTKDc");
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
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder("Y#I0Bo|7ei");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 1716);
      strBuilder0.appendSeparator("Y#I0Bo|7ei", 10);
      assertEquals(20, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder("Y#I0Bo|7ei");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 1716);
      assertEquals((-1), int0);
      
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('|');
      boolean boolean0 = strSubstitutor1.replaceIn(strBuilder0);
      assertEquals(42, strBuilder0.capacity());
      assertEquals('$', strSubstitutor1.getEscapeChar());
      assertEquals(10, strBuilder0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher strMatcher0 = StrMatcher.charMatcher('$');
      properties0.put("kl=`a9", strMatcher0);
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-523));
      String string0 = StrSubstitutor.replace((Object) properties0, properties0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@c27a998");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("java.vm.specification.version", Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        strBuilder1.substring((-680), 16);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -680
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(strLookup0).toString();
      doReturn((String) null).when(strLookup0).lookup(anyString());
      char[] charArray0 = new char[1];
      charArray0[0] = 'b';
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'j');
      strSubstitutor0.getEscapeChar();
      Object object0 = new Object();
      strSubstitutor0.replace(object0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1769), (-1769), "add() is unsupported");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1769
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("ject@4");
      strBuilder0.insert(5, true);
      assertEquals(10, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      char[] charArray0 = new char[1];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'j');
      strSubstitutor0.replace("l)MS,`", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.insert(21, 0L);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 21
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      StrBuilder strBuilder0 = new StrBuilder("Invalid offset: ");
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_TrimMatcher0, (-2286));
      assertEquals(48, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals(16, strBuilder0.length());
  }
}
