/*

 * Tue Mar 03 16:44:58 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.util.HashMap;
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1113), (-1113), "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1113
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("org.apache.commons.lang3.text.StrSubstitutor");
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      int int0 = strBuilder0.lastIndexOf(strMatcher0, (-281));
      assertEquals(0, strBuilder0.length());
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Properties properties0 = new Properties();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.remove((Object) strBuilder0, (Object) strSubstitutor0);
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(0, strBuilder0.length());
      assertEquals(32, strBuilder0.capacity());
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator('$', 13);
      // Undeclared exception!
      try { 
        strBuilder0.replace(13, 1405, "->");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "??gbi@EvFsv5}/&", "??gbi@EvFsv5}/&", '5');
      strSubstitutor0.setVariablePrefix('5');
      StringBuffer stringBuffer0 = new StringBuffer("??gbi@EvFsv5}/&");
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace(40, 40, "$");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Properties properties0 = new Properties();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.remove((Object) strBuilder0, (Object) strSubstitutor0);
      assertEquals(32, strBuilder0.capacity());
      
      strSubstitutor0.setVariablePrefix('');
      char[] charArray0 = new char[5];
      charArray0[1] = '';
      String string0 = strSubstitutor0.replace(charArray0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals("\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      strBuilder0.setLength(36);
      strBuilder0.replace(36, 108, "4.0");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", (-6), 9);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      strBuilder0.appendSeparator('$', (int) '$');
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 67);
      assertEquals(37, strBuilder0.length());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor");
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      int int0 = strBuilder0.lastIndexOf(strMatcher0, 36);
      assertEquals((-1), int0);
      
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('$', (-1840700268));
      assertEquals(44, strBuilder1.length());
      assertEquals(76, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor");
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      int int0 = strBuilder0.lastIndexOf(strMatcher0, 36);
      assertEquals((-1), int0);
      assertEquals(44, strBuilder0.length());
      assertEquals(76, strBuilder0.capacity());
      
      StrBuilder strBuilder1 = new StrBuilder((String) null);
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      strBuilder0.lastIndexOf(strMatcher0, (-2172));
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("aY", (-1113), (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((-2109), 32, "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2109
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "??gbi@EvFw{5}/&", "??gbi@EvFw{5}/&", '5');
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1670), 490, "4.0");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1670
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      Properties properties0 = new Properties();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.put(strBuilder0, object0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@263918c1");
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, stringBuffer0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      Properties properties0 = new Properties();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.put(strBuilder0, object0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("java.lang.Object@2dab1ee8", (-3149), (-3149));
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
      Properties properties0 = new Properties();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.remove((Object) strBuilder0, (Object) strSubstitutor0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("$'", 1, (-4380));
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
      Object object0 = new Object();
      Properties properties0 = new Properties();
      properties0.put("\u0000", object0);
      StrSubstitutor.replace(object0, properties0);
      StrBuilder strBuilder0 = new StrBuilder("QuI2Q^LPIqoK0%12");
      // Undeclared exception!
      try { 
        strBuilder0.replace(39, 36, "\u0000");
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace(861, 78, "");
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
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@263918c1");
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, stringBuffer0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@787a8c72");
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      int int0 = strBuilder0.lastIndexOf(strMatcher0, 67);
      assertEquals((-1), int0);
      assertEquals(57, strBuilder0.capacity());
      assertEquals(25, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('L', 52);
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      int int0 = strBuilder1.lastIndexOf(strMatcher0, (-2172));
      assertEquals(1, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace(37, 37, "K)1[@w{>/5-+AO{");
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "??gbi@EvFw{5}/&", "??gbi@EvFw{5}/&", '5');
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('5');
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "??gbi@EvFw{5}/&");
      strSubstitutor0.setEnableSubstitutionInVariables(true);
      strSubstitutor1.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1670), 490, "4.0");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1670
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("java.library.path");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'U');
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.library.path");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('U', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('$');
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_CharMatcher0, (-1933));
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = new Object();
      Properties properties0 = new Properties();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.remove((Object) strBuilder0, (Object) strSubstitutor0);
      properties0.put("Variable prefix must not be null!", strSubstitutor0);
      String string0 = StrSubstitutor.replace(object0, properties0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      // Undeclared exception!
      try { 
        strBuilder0.replace(13, 108, "4.0");
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      strBuilder0.setLength(36);
      strBuilder0.replace(13, 108, "4.0");
      strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(72, strBuilder0.capacity());
      assertEquals(16, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 67);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("g.apache.commons.lang3.text.StrSubstitutor@63b", 1259, 3);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "??gbi@EvFw{5}/&", "??gbi@EvFw{5}/&", '5');
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('5');
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "??gbi@EvFw{5}/&");
      strSubstitutor0.setEnableSubstitutionInVariables(true);
      strSubstitutor1.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.insert(4212, 623);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 4212
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 67);
      Properties properties0 = new Properties();
      Object object0 = new Object();
      String string0 = StrSubstitutor.replace(object0, properties0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, '/');
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0, 13, 6);
      // Undeclared exception!
      try { 
        strBuilder0.replace(13, 117, "Variable suffix matcher must not be null!");
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
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      // Undeclared exception!
      try { 
        strBuilder0.deleteCharAt((-2078));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2078
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer("vBfRwBxa");
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace(100, 100, "vBfRwBxa");
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "??gbi@EvFsv5}/&", "??gbi@EvFsv5}/&", '5');
      StringBuffer stringBuffer0 = new StringBuffer("??gbi@EvFsv5}/&");
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefixMatcher(strSubstitutor0.DEFAULT_SUFFIX);
      strSubstitutor1.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace(40, 40, "$");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((-601), 0, (String) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -601
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      assertEquals("org.apache.commons.lang3.SystemUtils", stringBuffer0.toString());
      assertEquals(68, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      strBuilder0.setLength(36);
      strBuilder0.replace(13, 108, "4.0");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", 12, 13);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace("java.lang.Object@6a2f0d94", 1, 1);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((-601), 0, (String) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -601
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor");
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      int int0 = strBuilder0.lastIndexOf(strMatcher0, 36);
      assertEquals(76, strBuilder0.capacity());
      assertEquals(44, strBuilder0.length());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 67);
      assertEquals((-1), int0);
      
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertFalse(boolean0);
      assertEquals(68, strBuilder0.capacity());
      assertEquals(36, strBuilder0.size());
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) null);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "1ALe'^~OjIX5P: V5{", "+S[h", '\"');
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("g.apache.commons.lang3.text.StrSubstitutor@2", 1017, (-3638));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Properties properties0 = new Properties();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.remove((Object) strBuilder0, (Object) strSubstitutor0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("!BfFz/g\"S~v$", 116, 390);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      strBuilder0.appendSeparator('$', (int) '$');
      // Undeclared exception!
      try { 
        strBuilder0.replace((-941), (-1832), "KN^`CNc\"w2||GI");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -941
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor");
      strBuilder0.appendSeparator('$', (-1840700268));
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1743), 108, (String) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1743
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(0, strBuilder0.size());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 67);
      assertEquals(36, strBuilder0.size());
      assertEquals((-1), int0);
      assertEquals(68, strBuilder0.capacity());
      
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 67);
      assertEquals((-1), int0);
      assertEquals(68, strBuilder0.capacity());
      assertEquals(36, strBuilder0.size());
      
      StringBuffer stringBuffer0 = new StringBuffer("3");
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("3", string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Properties properties0 = new Properties();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.remove((Object) strBuilder0, (Object) strSubstitutor0);
      assertEquals(32, strBuilder0.capacity());
      
      StringBuffer stringBuffer0 = new StringBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      StrBuilder strBuilder1 = strBuilder0.setLength(36);
      strBuilder1.insert(9, 9);
      assertFalse(strBuilder0.isEmpty());
      
      StringBuffer stringBuffer0 = new StringBuffer(9);
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Properties properties0 = new Properties();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Object object0 = properties0.put("Variable prefix must not be null!", strSubstitutor0);
      StrBuilder strBuilder0 = new StrBuilder("$'");
      StrSubstitutor.replace(object0, properties0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-3464), 116, "$(");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3464
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      strBuilder0.appendSeparator('$', (int) '$');
      strBuilder0.insert((int) '$', (-2054));
      assertEquals(42, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(34);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('0', (-1113));
      strBuilder1.insert(0, 44);
      assertEquals(2, strBuilder1.size());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Properties properties0 = new Properties();
      String string0 = StrSubstitutor.replace((Object) null, properties0);
      assertNull(string0);
      
      StrBuilder strBuilder0 = new StrBuilder();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(0, strBuilder0.size());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      Properties properties0 = new Properties();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(1, properties0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 67);
      assertEquals(36, strBuilder0.length());
      assertEquals((-1), int0);
      
      StringBuffer stringBuffer0 = new StringBuffer("3");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Object object0 = new Object();
      Properties properties0 = new Properties();
      properties0.put("\u0000", object0);
      StrSubstitutor.replace(object0, properties0);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      strBuilder0.insert(32, (float) 0L);
      assertEquals(39, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('\u0000');
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      StrBuilder strBuilder1 = strBuilder0.setLength(36);
      strBuilder1.insert(9, 9);
      boolean boolean0 = strSubstitutor1.replaceIn(strBuilder0);
      assertEquals(72, strBuilder0.capacity());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("java.library.path");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'U');
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.library.path");
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals('U', strSubstitutor0.getEscapeChar());
      assertEquals("java.library.path", string0);
      
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('$');
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_CharMatcher0, (-1933));
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.Iommons.lang3.SystemUtils");
      strBuilder0.appendSeparator("Invalid startIndex: ", "r");
      assertEquals(56, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Properties properties0 = new Properties();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.remove((Object) strBuilder0, (Object) strSubstitutor0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("java.lang.Object@43533ca0", 6, 102);
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
      Properties properties0 = new Properties();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.remove((Object) strBuilder0, (Object) strSubstitutor0);
      assertEquals(32, strBuilder0.capacity());
      
      String string0 = strSubstitutor0.replace("|M4!N$U&YB#$:", 1, 1);
      assertEquals("M", string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, '/');
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0, 13, 6);
      // Undeclared exception!
      try { 
        strBuilder0.insert(616, (Object) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 616
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("org.apache.commons.lang3.text.StrSubstitutor");
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor");
      strBuilder0.lastIndexOf(strMatcher0, 36);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = null;
      try {
        strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, (String) null, "org.apache.commons.lang3.text.StrSubstitutor", '3');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable prefix must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 67);
      assertEquals((-1), int0);
      assertEquals(36, strBuilder0.length());
      assertEquals(68, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrSubstitutor strSubstitutor1 = new StrSubstitutor((StrLookup<?>) null, "org.apache.commons.lang3.SystemUtils", "]Eh}Q7a8J!4)xlbNId", '8');
      assertEquals('8', strSubstitutor1.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("java.library.path");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'U');
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replace("g.apache.commons.lang3.text.StrSubstitutor@3a3");
      assertEquals('U', strSubstitutor0.getEscapeChar());
      
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('$');
      strBuilder0.lastIndexOf((StrMatcher) strMatcher_CharMatcher0, (-1933));
      assertEquals(0, strBuilder0.length());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Properties properties0 = new Properties();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(0, strBuilder0.size());
      assertEquals(32, strBuilder0.capacity());
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(0, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer("K2< v<@6BVX3ZDNT_");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      
      StrBuilder strBuilder0 = new StrBuilder();
      Reader reader0 = strBuilder0.asReader();
      Properties properties0 = new Properties();
      properties0.load(reader0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@263918c1");
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator('$', 38);
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, stringBuffer0);
      assertEquals(1, strBuilder0.size());
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Object object0 = new Object();
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator('$', (-1113));
      properties0.put(strBuilder0, object0);
      assertTrue(strBuilder0.isEmpty());
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "??gbi@EvFw{5}/&", "??gbi@EvFw{5}/&", '5');
      strSubstitutor0.setVariablePrefixMatcher(strSubstitutor0.DEFAULT_SUFFIX);
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "??gbi@EvFw{5}/&");
      strSubstitutor0.replaceIn(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1670), 490, "4.0");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1670
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      strBuilder0.insert((int) '$', (-2054));
      Object object0 = new Object();
      String string0 = StrSubstitutor.replace(object0, (Properties) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 67);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("org.apache.commons.lang3.text.StrSubstitutor", 21, (-1310));
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
      StrBuilder strBuilder0 = new StrBuilder("user.language");
      StrBuilder strBuilder1 = strBuilder0.setNullText("org.apache.commons.lang3.text.StrTokenizer");
      assertEquals(45, strBuilder1.capacity());
      assertEquals(13, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("org.apache.commons.lang3.text.StrSubstitutor");
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor");
      strBuilder0.lastIndexOf(strMatcher0, 36);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("$(", 4, (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("java.library.path");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'U');
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('$');
      strBuilder0.lastIndexOf((StrMatcher) strMatcher_CharMatcher0, (-1933));
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("java.library.path", 4, (-1790));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder('$');
      strSubstitutor0.replace("g.apache.commons.lang3.text.StrSubstitutor@", 2, 2);
      // Undeclared exception!
      try { 
        strBuilder0.replace(37, (int) '$', "g.apache.commons.lang3.text.StrSubstitutor@");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer("K2< v<@6BVX3ZDNT_");
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertNotNull(string0);
      assertEquals("K2< v<@6BVX3ZDNT_", string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder();
      Reader reader0 = strBuilder0.asReader();
      Properties properties0 = new Properties();
      properties0.load(reader0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Properties properties0 = new Properties();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("java.lang.Object@29c75a08", (-4), (-343));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      String string0 = strSubstitutor0.replace("java.lang.Object@6a2f0d94", 1, 1);
      assertEquals("a", string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      Reader reader0 = strBuilder0.asReader();
      assertFalse(reader0.ready());
      
      properties0.load(reader0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 67);
      assertFalse(strBuilder0.isEmpty());
      assertEquals(68, strBuilder0.capacity());
      
      String string0 = strSubstitutor0.replace("3`ZS;$omX", 4, 4);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(";$om", string0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator('$', (-1113));
      // Undeclared exception!
      try { 
        strBuilder0.replace(861, 78, "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "??gbi@EvFw{5}/&", "??gbi@EvFw{5}/&", '5');
      strSubstitutor0.setVariablePrefix('5');
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "??gbi@EvFw{5}/&");
      strSubstitutor0.replaceIn(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1670), 490, "4.0");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1670
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, '/');
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0, 13, 6);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-330), 37, (String) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -330
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      strBuilder0.insert((int) '$', (-2054));
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("org.apache.commons.lang3.text.StrSubstitutor@15003a03", 48, 36);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      StrBuilder strBuilder1 = strBuilder0.setLength(36);
      strBuilder1.insert(9, 9);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", 12, 13);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      StrBuilder strBuilder1 = strBuilder0.setLength(36);
      strBuilder1.insert(9, 9);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", (-6), 9);
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
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('$');
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_CharMatcher0, (-1933));
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test88()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("org.apache.commons.lang3.text.StrSubstitutor");
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      Properties properties0 = new Properties();
      String string0 = StrSubstitutor.replace((Object) properties0, properties0);
      assertEquals("{}", string0);
      
      strBuilder0.lastIndexOf(strMatcher0, (-281));
      assertEquals(32, strBuilder0.capacity());
  }
}
