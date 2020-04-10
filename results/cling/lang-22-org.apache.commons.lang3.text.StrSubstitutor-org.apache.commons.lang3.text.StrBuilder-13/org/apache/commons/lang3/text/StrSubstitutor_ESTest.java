/*

 * Tue Mar 03 16:45:09 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.Reader;
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
        strBuilder0.validateRange((-1036), 773);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1036
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, strBuilder0);
      properties0.put(strBuilder0, strBuilder0);
      assertEquals(1, properties0.size());
      
      properties0.clear();
      String string0 = StrSubstitutor.replace((Object) properties0, properties0);
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.replace(0, 10, "@?H@RH<'Gw@,K.Jk9^");
      // Undeclared exception!
      try { 
        strBuilder0.appendln("StrTokenizer[not tokenized yet]", 10, (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@2ed36a79");
      strBuilder0.deleteFirst("?vq!9}5UAb.b3");
      // Undeclared exception!
      try { 
        strBuilder0.replace((int) 'e', 40, (String) null);
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
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("$i\u0000i");
      StrBuilder strBuilder0 = new StrBuilder("Zj^_B5yR&*/o");
      StrMatcher strMatcher1 = StrMatcher.stringMatcher("$i\u0000i");
      strBuilder0.replace(10, 819, "@?H@RH<'Gw@,K.Jk9^");
      HashMap<String, Locale.FilteringMode> hashMap0 = new HashMap<String, Locale.FilteringMode>();
      StrLookup<Locale.FilteringMode> strLookup0 = StrLookup.mapLookup((Map<String, Locale.FilteringMode>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher1, 'i');
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("ct@769cd755", (-4081), 10);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@51f06a30");
      Properties properties0 = new Properties();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(57, strBuilder0.capacity());
      
      String string0 = StrSubstitutor.replace((Object) "--`RWW", properties0);
      assertEquals("--`RWW", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@53ebc7b8");
      StrBuilder strBuilder1 = new StrBuilder((String) null);
      assertEquals(32, strBuilder1.capacity());
      
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(",GC");
      int int0 = strBuilder0.lastIndexOf(strMatcher0);
      assertEquals(25, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals(57, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(strLookup0).toString();
      doReturn((String) null).when(strLookup0).lookup(anyString());
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@62418dd9");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('e', 40);
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('e');
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharMatcher0, strMatcher_CharMatcher0, 'e');
      Properties properties0 = new Properties();
      properties0.put(strBuilder1, strBuilder1);
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(26, strBuilder0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-1036), 773);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1036
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@c1b6c0c");
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('e');
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharMatcher0, strMatcher_CharMatcher0, 'e');
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, strBuilder0);
      assertEquals(56, strBuilder0.capacity());
      assertEquals(24, strBuilder0.length());
      
      StringBuffer stringBuffer0 = new StringBuffer("ct@6253dcf9");
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('e', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, strBuilder0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("nQckn]u:zHZ-..;tu$", (-5132), 27);
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
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, strBuilder0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("<$m|}GHzFf|8}{Tu_", 11, (-1091));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replace((StringBuffer) null);
      // Undeclared exception!
      try { 
        strBuilder0.validateRange('$', 773);
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
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@6cb82d6c");
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('e');
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharMatcher0, strMatcher_CharMatcher0, 'e');
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(1, (-2797));
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
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('%');
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharMatcher0, strMatcher_CharMatcher0, '%');
      char[] charArray0 = new char[5];
      charArray0[0] = '%';
      charArray0[2] = '%';
      charArray0[3] = '%';
      String string0 = strSubstitutor0.replace(charArray0);
      assertEquals("%\u0000%\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.replace(0, 4, "@?H@RH<'Gw@,K.Jk9^");
      assertEquals(18, strBuilder0.size());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer();
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@25e03ac3");
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, "java.lang.Object@25e03ac3");
      assertEquals(25, strBuilder0.length());
      assertEquals(57, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@13007268");
      // Undeclared exception!
      try { 
        strBuilder0.substring(2711, (-792));
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
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@8780a6");
      strBuilder0.replace(10, 32, "@?H@RH<'Gw@,K.Jk9^");
      assertEquals(28, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "{Pzt-XTzjy", "{Pzt-XTzjy", 'y');
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("");
      properties0.put("{Pzt-XTzjy", "{Pzt-XTzjy");
      StrSubstitutor.replace((Object) "{Pzt-XTzjy", properties0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_SUFFIX, "}", 824, 824, 1091);
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
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("java.lang.Object@6cb82d6c").when(strLookup0).toString();
      doReturn("java.lang.Object@6cb82d6c").when(strLookup0).lookup(anyString());
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@6cb82d6c");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('e', 40);
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('e');
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharMatcher0, strMatcher_CharMatcher0, 'e');
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder1);
      strSubstitutor0.replaceIn(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder1.validateRange(1, (-2797));
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
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replaceIn((StrBuilder) null);
      // Undeclared exception!
      try { 
        strBuilder0.replace(2, 3251, "'XH{Bd/0CD");
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
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("java.lang.Object@5986efd7").when(strLookup0).toString();
      doReturn("java.lang.Object@5986efd7").when(strLookup0).lookup(anyString());
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@5986efd7");
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('e');
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharMatcher0, strMatcher_CharMatcher0, 'e');
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, strBuilder0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replaceIn(strBuilder0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Infinite loop in property interpolation of java.lang.Object@5986efd7: ct@5986
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@8d3a7c2");
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((String) null);
      int int0 = strBuilder0.lastIndexOf(strMatcher0);
      assertEquals(56, strBuilder0.capacity());
      assertEquals((-1), int0);
      
      Properties properties0 = new Properties();
      String string0 = StrSubstitutor.replace((Object) "ciJRm' vS;8}]:W.~'", properties0);
      assertEquals("ciJRm' vS;8}]:W.~'", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strBuilder0.insert(0, "Wob)+i8/");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("java.lang.Object@42c7ac72", 0, 100);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.replace(0, 4, "@?H@RH<'Gw@,K.Jk9^");
      assertFalse(strBuilder0.isEmpty());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("java.lang.Object@16e204bf", "java.lang.Object@16e204bf", (String) null, (String) null, (String) null).when(strLookup0).toString();
      doReturn("Zj^_B5yR&*/o", "Zj^_B5yR&*/o", (String) null, (String) null, (String) null).when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("java.lang.Object@16e204bf");
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.replace(0, 10, "@?H@RH<'Gw@,K.Jk9^");
      assertFalse(strBuilder0.isEmpty());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'u');
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@16e204bf");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@17931fd4");
      // Undeclared exception!
      try { 
        strBuilder0.substring((-1736), 96);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1736
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.setCharAt((-2797), '0');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2797
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor.replace(object0, (Map<String, ?>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder(40);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('e', 40);
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((String) null);
      int int0 = strBuilder1.lastIndexOf(strMatcher0);
      assertFalse(strBuilder0.isEmpty());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.replace(0, 4, "@?H@RH<'Gw@,K.Jk9^");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", 4, 3);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("imtn'y");
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0, "imtn'y", "imtn'y", 'r');
      strSubstitutor0.replace("imtn'y", 0, 0);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-2251), 57);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2251
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("G$");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals((-1), int0);
      
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(2, strBuilder0.length());
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(34, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, strBuilder0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("{}", 52, 52);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("S-UBkVF");
      strBuilder0.appendSeparator('$', 39);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-2271), (-64), "^_B");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2271
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@17931fd4");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('^', (-2271));
      // Undeclared exception!
      try { 
        strBuilder1.substring((-1736), 96);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1736
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, strBuilder0);
      properties0.put(strBuilder0, strBuilder0);
      assertEquals(1, properties0.size());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(strLookup0).toString();
      doReturn((String) null).when(strLookup0).lookup(anyString());
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@53ebc7b8");
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(",GC");
      strBuilder0.lastIndexOf(strMatcher0);
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('e');
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharMatcher0, strMatcher_CharMatcher0, 'd');
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals(57, strBuilder0.capacity());
      assertEquals('d', strSubstitutor0.getEscapeChar());
      assertEquals(25, stringBuffer0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@5544756f");
      Properties properties0 = new Properties();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertFalse(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrBuilder strBuilder0 = new StrBuilder(40);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('e', 40);
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((String) null);
      strBuilder1.lastIndexOf(strMatcher0);
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('e');
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharMatcher0, strMatcher_CharMatcher0, 'e');
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder1);
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertFalse(strBuilder0.isEmpty());
      assertEquals("e", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, strBuilder0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer("{}");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      strBuilder0.validateIndex(0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(40);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@a2e3179");
      char[] charArray0 = new char[8];
      strBuilder0.insert(10, charArray0);
      assertEquals(32, strBuilder0.length());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0);
      StringBuffer stringBuffer0 = new StringBuffer(40);
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("imtn'y");
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) "", properties0);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-2251), 57);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2251
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@a2e3179");
      char[] charArray0 = new char[8];
      strBuilder0.insert(10, charArray0);
      strBuilder0.appendSeparator('e', 40);
      assertEquals(33, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@112ca643");
      strBuilder0.appendSeparator('^', (-2271));
      strBuilder0.insert(0, "\u0000");
      assertEquals(26, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-1316));
      // Undeclared exception!
      try { 
        strBuilder0.charAt((-1316));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1316
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(strLookup0).toString();
      doReturn((String) null).when(strLookup0).lookup(anyString());
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@7805b2d4");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('e', 40);
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((String) null);
      strBuilder1.lastIndexOf(strMatcher0);
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('e');
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharMatcher0, strMatcher_CharMatcher0, 'e');
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder1);
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals(26, strBuilder0.length());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.setNullText((String) null);
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.append((double) 0);
      strBuilder0.deleteAll("java.lang.Object@28f05ca1");
      // Undeclared exception!
      try { 
        strBuilder1.substring(175, 97);
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
  public void test50()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.setVariablePrefix('$');
      StrBuilder strBuilder0 = new StrBuilder();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Reader reader0 = strBuilder0.asReader();
      Integer integer0 = new Integer(3458);
      hashMap0.put("$", integer0);
      Properties properties0 = new Properties();
      properties0.load(reader0);
      assertEquals(0, strBuilder0.size());
      assertEquals(32, strBuilder0.capacity());
      
      String string0 = strSubstitutor0.replace((Object) hashMap0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals("{$=3458}", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@3535b8fb");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("", "3# 0x'V%oM8jY");
      assertEquals(57, strBuilder1.capacity());
      assertEquals(25, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, strBuilder0);
      assertEquals(32, strBuilder0.capacity());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      String string0 = strSubstitutor0.replace("sQ9c|_E[$7", 0, 0);
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@8780a6");
      strBuilder0.insert(17, true);
      strBuilder0.replace(10, 32, "@?H@RH<'Gw@,K.Jk9^");
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("@?H@RH<'Gw@,K.Jk9^");
      StrLookup<Locale.FilteringMode> strLookup0 = StrLookup.mapLookup((Map<String, Locale.FilteringMode>) null);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, '|');
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(28, strBuilder0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test54()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrBuilder strBuilder0 = new StrBuilder(40);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('e', 40);
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((String) null);
      strBuilder1.lastIndexOf(strMatcher0);
      String string0 = StrSubstitutor.replace((Object) strBuilder0, (Map<String, Object>) hashMap0, ".|Q<Y@q%nVt", ".|Q<Y@q%nVt");
      assertFalse(strBuilder0.isEmpty());
      assertEquals("e", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrBuilder strBuilder0 = new StrBuilder(40);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('e', 40);
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((String) null);
      strBuilder1.lastIndexOf(strMatcher0);
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("java.lang.Object@4fe8a33f", (-1545), 40);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("");
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.size());
      
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HashMap<String, InputStream> hashMap0 = new HashMap<String, InputStream>();
      StrLookup<InputStream> strLookup0 = StrLookup.mapLookup((Map<String, InputStream>) hashMap0);
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_TrimMatcher0, strMatcher_TrimMatcher0, ')');
      StrBuilder strBuilder0 = new StrBuilder();
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(')', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      
      Properties properties0 = new Properties();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(0, strBuilder0.length());
      assertEquals(0, strBuilder0.size());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer("");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@23ae5f1e");
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, strBuilder0);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('e', 0);
      assertEquals(57, strBuilder1.capacity());
      assertEquals(25, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("imtn'y");
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0, "imtn'y", "imtn'y", 'r');
      StringBuffer stringBuffer0 = new StringBuffer(32);
      strSubstitutor0.replaceIn(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-2251), 57);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2251
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@8780a6");
      strBuilder0.insert(17, true);
      assertEquals(27, strBuilder0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test62()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      String string0 = StrSubstitutor.replace((Object) properties0, properties0);
      assertEquals("{}", string0);
      assertNotNull(string0);
      
      strBuilder0.validateIndex(0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@6df8ddfc");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('e', 40);
      Properties properties0 = new Properties();
      Reader reader0 = strBuilder1.asReader();
      properties0.load(reader0);
      assertEquals(26, strBuilder0.size());
      assertEquals(26, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@51f06a30");
      strBuilder0.appendSeparator('^', (-2271));
      Properties properties0 = new Properties();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(1, properties0.size());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrBuilder strBuilder0 = new StrBuilder(40);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('e', 40);
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((String) null);
      strBuilder1.lastIndexOf(strMatcher0);
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('e');
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharMatcher0, strMatcher_CharMatcher0, 'e');
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        strSubstitutor0.replace(charArray0, (-1), 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // Invalid startIndex: 0
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.setNullText("U");
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "Invalid offset: ", "$Z\u0003\\<A", '#');
      strSubstitutor0.replace("V|:Q_stc`ye", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring(31, 57);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      String string0 = strSubstitutor0.replace("m]Hc", 0, 0);
      assertNotNull(string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals("", string0);
      
      Reader reader0 = strBuilder0.asReader();
      Properties properties0 = new Properties();
      properties0.load(reader0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      HashMap<String, InputStream> hashMap0 = new HashMap<String, InputStream>();
      StrLookup<InputStream> strLookup0 = StrLookup.mapLookup((Map<String, InputStream>) hashMap0);
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_TrimMatcher0, strMatcher_TrimMatcher0, ')');
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("Variable suffix matcher must not be null!", 3, (-1545));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@23ae5f1e");
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, strBuilder0);
      StrBuilder strBuilder1 = strBuilder0.deleteAll("]KPEifn*ND5");
      assertEquals(25, strBuilder1.length());
      assertEquals(57, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "", "", 'y');
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("java.specification.name");
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertFalse(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@2ed36a79");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('e', 40);
      // Undeclared exception!
      try { 
        strBuilder1.replace((int) 'e', 40, (String) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@25132f8b");
      strBuilder0.appendSeparator('^', (-2271));
      // Undeclared exception!
      try { 
        strBuilder0.replace(37, 37, "1.6");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('$');
      char[] charArray0 = new char[9];
      charArray0[0] = '$';
      strSubstitutor1.replace(charArray0);
      StrBuilder strBuilder0 = new StrBuilder("S-UBkVF");
      // Undeclared exception!
      try { 
        strBuilder0.replace((-2271), (-64), "^_B");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2271
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) null);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "1.6", "java.runtime.name", 'J');
      StringWriter stringWriter0 = new StringWriter(24);
      stringWriter0.write("1.6");
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "java.runtime.name");
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder(46);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-2271), 901);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2271
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@5544756f");
      Properties properties0 = new Properties();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("1.6", 471, 2);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "", "", 'y');
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("java.specification.name");
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", (-2802), (-2802));
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
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "Invalid offset: ", "$Z\u0003\\<A", '#');
      char[] charArray0 = new char[2];
      StrBuilder strBuilder0 = new StrBuilder("");
      strBuilder0.insert(0, charArray0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("ct@63c61070", 11, (-351));
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
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "Invalid offset: ", "$Z\u0003\\<A", '#');
      strSubstitutor0.replace("V|:Q_stc`ye", 0, 0);
      char[] charArray0 = new char[2];
      StrBuilder strBuilder0 = new StrBuilder("");
      strBuilder0.insert(0, charArray0);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(40);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@a2e3179");
      char[] charArray0 = new char[8];
      strBuilder0.insert(10, charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("ct@6d382479", (-287), 3);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }
}
