/*

 * Tue Mar 03 16:43:43 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedHashSet;
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, "7&uv2GT|Y-&6?ex", "7&uv2GT|Y-&6?ex", 't');
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring((-2076), 53);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2076
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-1070), (-1537));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1070
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, "E&u[2GT|Y-6?ex", "E&u[2GT|Y-6?ex", '4');
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert(46, (double) '$');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 46
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-1359), 114);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1359
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-939), 3037);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -939
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("ms|tx1u=xq2[T*");
      strBuilder0.replaceFirst("java.specification.version", "ms|tx1u=xq2[T*");
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-2969), 36);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2969
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      strBuilder0.replaceFirst("java.specification.version", "java.specification.version");
      // Undeclared exception!
      try { 
        strBuilder0.substring((-939), 3037);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -939
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(31);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>(31, 31);
      linkedHashSet0.add(strBuilder0);
      assertEquals(0, strBuilder0.length());
      
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "AUTOSELECT_FILTERING", "AUTOSELECT_FILTERING", '9');
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals('9', strSubstitutor0.getEscapeChar());
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals(31, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(31);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>(31, 31);
      linkedHashSet0.add(strBuilder0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "bo%*xSa8_1", "bo%*xSa8_1");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("AUTOSELECT_FILTERING", (-1), 117);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) null);
      strSubstitutor0.setVariablePrefix('K');
      char[] charArray0 = new char[8];
      charArray0[0] = '$';
      charArray0[1] = 'K';
      String string0 = strSubstitutor0.replace(charArray0);
      assertEquals("K\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, "7&uv2GT|Y-&6?ex", "7&uv2GT|Y-&6?ex", 'y');
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder("java.spe8ification.version");
      // Undeclared exception!
      try { 
        strBuilder0.substring(46, 36);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring(2, 2);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, ']');
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix(']');
      char[] charArray0 = new char[4];
      charArray0[1] = ']';
      String string0 = strSubstitutor1.replace(charArray0);
      assertEquals(']', strSubstitutor1.getEscapeChar());
      assertNotNull(string0);
      assertEquals("\u0000]\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      StrSubstitutor.replace((Object) locale_FilteringMode0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder(31);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>(31, 31);
      linkedHashSet0.add(strBuilder0);
      assertEquals(31, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("7&uv2GT|Y-&6?ex");
      Properties properties0 = new Properties();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      properties0.put(strBuilder0, locale_FilteringMode0);
      // Undeclared exception!
      try { 
        StrSubstitutor.replace((Object) null, properties0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.lang3.text.StrBuilder cannot be cast to java.lang.String
         //
         verifyException("java.util.Properties", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrTokenizer");
      strBuilder0.insert(8, 0.0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace(",%A*O6EBIaxq5", 32, 1331);
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
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      StrSubstitutor.replace((Object) locale_FilteringMode0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder(31);
      strBuilder0.appendln((-1126.9087F));
      char[] charArray0 = new char[7];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_CharSetMatcher0, 31);
      assertEquals(11, strBuilder0.length());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder(31);
      // Undeclared exception!
      try { 
        strBuilder0.substring(9, 31);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) locale_FilteringMode0, properties0);
      // Undeclared exception!
      try { 
        strBuilder0.substring((int) '$', 14);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring(1313, 32);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) null);
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.substring((int) '$', 14);
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
      Properties properties0 = new Properties();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals(58, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals(26, strBuilder0.length());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      String string0 = StrSubstitutor.replace((Object) locale_FilteringMode0, properties0);
      assertNotNull(string0);
      assertEquals("AUTOSELECT_FILTERING", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("E&u[2GT|Y-?ex");
      stringBuffer0.append("E&u[2GT|Y-?ex");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, "E&u[2GT|Y-?ex", "E&u[2GT|Y-?ex", 'J');
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("E&u[2GT|Y-?ex");
      // Undeclared exception!
      try { 
        strBuilder0.substring(53, 766);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      strSubstitutor0.replace("org.apache.commons.lang3.text.StrTokenizer", 8, 8);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrTokenizer");
      strBuilder0.insert(8, 0.0);
      assertEquals(45, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder('$');
      Properties properties0 = new Properties();
      properties0.put("java.lang.Object@50c724d3", "java.lang.Object@50c724d3");
      StrSubstitutor.replace((Object) "set() is unsupported", properties0);
      // Undeclared exception!
      try { 
        strBuilder0.insert(39, 'n');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 39
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      // Undeclared exception!
      try { 
        strBuilder0.deleteCharAt((-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-2526), (-35));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2526
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.setLength(35);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.awt.printerjob");
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      assertEquals(51, strBuilder0.capacity());
      assertEquals("java.awt.printerjob", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals((-1), int0);
      
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(26, strBuilder0.length());
      assertEquals(58, strBuilder0.capacity());
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator('Y', 1682);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-2526), (-2526));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2526
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      strBuilder0.appendSeparator('l', (-636));
      // Undeclared exception!
      try { 
        strBuilder0.substring((-1359), 114);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1359
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      
      StrBuilder strBuilder0 = new StrBuilder(31);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>(31, 31);
      linkedHashSet0.add(strBuilder0);
      assertEquals(31, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      strBuilder0.replaceAll("0", "");
      strBuilder0.insert(0, 0.0);
      assertEquals(29, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      strBuilder0.replaceFirst("java.specification.version", "java.specification.version");
      strBuilder0.insert(0, 0.0);
      assertEquals(29, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@2ca14f1c");
      strBuilder0.insert(0, (double) '$');
      assertEquals(29, strBuilder0.size());
      
      StringWriter stringWriter0 = new StringWriter(38);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, ']');
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix(']');
      strSubstitutor0.setEnableSubstitutionInVariables(true);
      char[] charArray0 = new char[4];
      charArray0[0] = ']';
      String string0 = strSubstitutor1.replace(charArray0);
      assertEquals("]\u0000\u0000\u0000", string0);
      assertEquals(']', strSubstitutor1.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      StrSubstitutor.replace((Object) locale_FilteringMode0, properties0);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-939), 3037);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -939
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      strBuilder0.insert(0, 0.0);
      strBuilder0.appendSeparator('Y', 58);
      assertEquals(30, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder('$');
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('$', (-4025));
      strBuilder1.insert(0, 4459.73132);
      assertFalse(strBuilder0.isEmpty());
      assertEquals(10, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.setNullText((String) null);
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      strBuilder0.insert(0, 0.0);
      assertEquals(29, strBuilder0.length());
      
      strSubstitutor0.setVariablePrefix('$');
      char[] charArray0 = new char[4];
      charArray0[0] = '$';
      String string0 = strSubstitutor0.replace(charArray0);
      assertEquals("$\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.spe8ification.version");
      strBuilder0.replaceFirst("LINUX", "java.spe8ification.version");
      // Undeclared exception!
      try { 
        strBuilder0.substring(46, 36);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      strBuilder0.appendSeparator("-u;@vba>R");
      assertEquals(35, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      strBuilder0.replaceAll("0", "");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals(26, strBuilder0.length());
      assertEquals(58, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals(58, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
      assertEquals(26, strBuilder0.length());
      
      StrSubstitutor strSubstitutor1 = new StrSubstitutor((Map<String, Locale.FilteringMode>) null, "user.home", "Gh/D5-Qb[0`OP@Yv|", '$');
      assertEquals('$', strSubstitutor1.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) null);
      StrBuilder strBuilder0 = new StrBuilder("?NqWrv-Pf");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 44);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("-582", (-1573), (-1573));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      strBuilder0.replaceFirst("java.specification.version", "java.specification.version");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals(58, strBuilder0.capacity());
      assertEquals(26, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(31);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>(31, 31);
      linkedHashSet0.add(strBuilder0);
      strBuilder0.appendSeparator('&', 31);
      assertEquals(1, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(31);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>(31, 31);
      linkedHashSet0.add(strBuilder0);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('$', (-1138));
      assertEquals(0, strBuilder1.size());
      assertEquals(31, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      StrSubstitutor.replace((Object) locale_FilteringMode0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder(31);
      StrBuilder strBuilder1 = strBuilder0.appendln((-1126.9087F));
      strBuilder0.append((CharSequence) "java.lang.Object@567868da");
      strBuilder1.insert(31, (double) (-1126.9087F));
      assertEquals(53, strBuilder0.length());
      assertEquals(72, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test51()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      strBuilder0.insert(0, 0.0);
      assertEquals(29, strBuilder0.length());
      
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      String string0 = StrSubstitutor.replace((Object) locale_FilteringMode0, properties0);
      assertEquals("AUTOSELECT_FILTERING", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.setNullText("Mac OS X");
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      strBuilder0.appendSeparator("$:.v|e", 0);
      strBuilder0.insert(0, 0.0);
      assertEquals(29, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      strBuilder0.appendSeparator("$:.v|e", 0);
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(26, strBuilder0.size());
      assertEquals(58, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("java.specification.version", 0, 1442);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(24);
      strBuilder0.appendSeparator('1', 24);
      // Undeclared exception!
      try { 
        strBuilder0.substring(229, 46);
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
      StrBuilder strBuilder0 = new StrBuilder('$');
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('$', (-4025));
      // Undeclared exception!
      try { 
        strBuilder1.substring(786, 29);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("E&u[2GT|Y-?ex");
      stringBuffer0.append("E&u[2GT|Y-?ex");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, "E&u[2GT|Y-?ex", "E&u[2GT|Y-?ex", 'J');
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder((-5224));
      // Undeclared exception!
      try { 
        strBuilder0.insert(3, 43);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 3
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("E&u[2GT|Y-6?ex");
      stringBuffer0.append(0.0F);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, "E&u[2GT|Y-6?ex", "E&u[2GT|Y-6?ex", 'J');
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("E&u[2GT|Y-6?ex");
      // Undeclared exception!
      try { 
        strBuilder0.substring((-1019), (-2942));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1019
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      strBuilder0.insert(0, 0.0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("java.specification.version", 0, (-4634));
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("java.specification.version");
      strBuilder0.insert(0, 0.0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("java.specification.version", 0, 1442);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(31);
      StrBuilder strBuilder1 = strBuilder0.appendln((-1126.9087F));
      strBuilder0.append((CharSequence) "java.lang.Object@567868da");
      strBuilder1.insert(31, (double) (-1126.9087F));
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("k+'DH=Kcfv\"yWlsd", (-1788), (-3498));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }
}
