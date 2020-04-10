/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 21:26:58 GMT 2019
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
  @Ignore
  public void test00()  throws Throwable  {
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.put("f<r6|B|", object0);
      String string0 = StrSubstitutor.replace((Object) "f<r6|B|", properties0);
      assertEquals("f<r6|B|", string0);
      
      StrBuilder strBuilder0 = new StrBuilder("^izPDjk}<TvT<)>M");
      StrBuilder strBuilder1 = strBuilder0.insert(10, (char[]) null, 10, 10);
      assertEquals(49, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.put("f<r6|B|", object0);
      String string0 = StrSubstitutor.replace(object0, properties0);
      assertNotNull(string0);
      
      StrBuilder strBuilder0 = new StrBuilder("f<r6|B|");
      properties0.put(strBuilder0, "f<r6|B|");
      assertEquals(39, strBuilder0.capacity());
      assertEquals(7, strBuilder0.length());
      assertEquals(7, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, ";|[P(=X(Z", "OkRKC&+TD)hx/b", ')');
      StrBuilder strBuilder0 = new StrBuilder(1019);
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-2763), 1019, "OkRKC&+TD)hx/b");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2763
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'h');
      StringBuffer stringBuffer0 = new StringBuffer("'?ZC");
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-1116), 2);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1116
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, ")iI8H31,wdPHy1u", ")iI8H31,wdPHy1u");
      StrBuilder strBuilder0 = new StrBuilder("bP~J-7qHXzameq<#ULw");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 1732);
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(19, strBuilder0.length());
      assertFalse(boolean0);
      assertEquals(51, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_TrimMatcher0, strMatcher_TrimMatcher0, 'h');
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(1171, 2);
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
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "5N^v>{@pM-BOa~oGZ/", "5N^v>{@pM-BOa~oGZ/", '^');
      StringBuffer stringBuffer0 = new StringBuffer('^');
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(884, 884);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(1019);
      strBuilder0.appendSeparator('*', (-2763));
      // Undeclared exception!
      try { 
        strBuilder0.replace((-2763), 1019, "OkRKC&+TD)hx/b");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2763
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(1380);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("5]{4)P&", 900);
      int int0 = strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals(7, strBuilder0.length());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("\u0005Vn;i5'OJ", 20);
      // Undeclared exception!
      try { 
        strBuilder1.validateRange(256, 256);
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
      StrBuilder strBuilder0 = new StrBuilder((-8));
      strBuilder0.appendSeparator("5#j*:F-4kk<qm}kms", (-8));
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(1171, 2);
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
      StrBuilder strBuilder0 = new StrBuilder(1019);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('*', 1019);
      // Undeclared exception!
      try { 
        strBuilder1.replace(1019, 1019, "OkRKC&+TD)hx/b");
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
      StrBuilder strBuilder0 = new StrBuilder("ZFe*;5,r=X");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('L', 0);
      // Undeclared exception!
      try { 
        strBuilder1.validateRange(550, 1676);
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
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator((String) null, (-8));
      strBuilder0.insert(0, 0L);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("5#j*:F-4kk<qm}kms", (-8));
      strBuilder1.insert(0, 0L);
      assertEquals(1, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator('$', (-1610612734));
      // Undeclared exception!
      try { 
        strBuilder0.insert(237, (Object) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 237
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('s', 1281);
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      strBuilder0.replaceFirst("`G,,t-g5^3Sok+hdpr", "java.vm.specification.vendor");
      strBuilder1.insert(1, (Object) locale_Category0);
      assertEquals(7, strBuilder0.size());
      assertEquals(7, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, ")iI8H31,wdPHy1u", ")iI8H31,wdPHy1u");
      StringBuffer stringBuffer0 = new StringBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      
      StrBuilder strBuilder0 = new StrBuilder("bP~J-7qHXzameq<#ULw");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 1732);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
      assertEquals(19, strBuilder0.length());
      assertEquals(51, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) "f<r6|B|", properties0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(48, 39);
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
      StrBuilder strBuilder0 = new StrBuilder("f<r6|B|");
      // Undeclared exception!
      try { 
        strBuilder0.insert(3234, object0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 3234
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'h');
      StringBuffer stringBuffer0 = new StringBuffer("'?ZC");
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-1116), 2);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1116
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, ";|[P(=X(Z", "OkRKC&+TD)hx/b", ')');
      StrSubstitutor.replace((Object) strSubstitutor0, (Map<String, ?>) hashMap0, "2", "puj");
      StrBuilder strBuilder0 = new StrBuilder(1019);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-2763), 1019, "OkRKC&+TD)hx/b");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2763
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder("user.home");
      strBuilder0.appendFixedWidthPadLeft((-1497), 32, '=');
      strBuilder0.insert(32, (Object) "java.lang.Object@1f23ff9b");
      assertEquals(132, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder("^izPDjk}<TvT<)>M");
      StrBuilder strBuilder1 = strBuilder0.insert(10, (char[]) null, 10, 10);
      assertEquals(17, strBuilder0.length());
      assertEquals(49, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, object0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, object0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("java.lang.Object@3a515c83", 441, 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.delete(44, 441);
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
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(strLookup0).toString();
      doReturn("e.commons.lang3.text.StrMatcher", (String) null, (String) null).when(strLookup0).lookup(anyString());
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_TrimMatcher0, strMatcher_TrimMatcher0, 'h');
      StrBuilder strBuilder0 = new StrBuilder();
      char[] charArray0 = new char[5];
      strSubstitutor0.replace(charArray0);
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariableSuffix('$');
      strSubstitutor0.setVariablePrefix('h');
      strSubstitutor1.replace("e.commons.lang3.text.StrMatcher$h");
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(1171, 2);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Object object0 = new Object();
      StrBuilder strBuilder0 = new StrBuilder();
      char[] charArray0 = new char[2];
      charArray0[0] = '$';
      charArray0[1] = '$';
      strSubstitutor0.setVariableSuffix('$');
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('$');
      strSubstitutor1.replace(charArray0);
      // Undeclared exception!
      try { 
        strBuilder0.insert(48, object0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 48
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "5N^v>{@pM-BOa~oGZ/", "5N^v>{@pM-BOa~oGZ/", '^');
      StringBuffer stringBuffer0 = new StringBuffer(19);
      stringBuffer0.append((CharSequence) "5N^v>{@pM-BOa~oGZ/");
      strSubstitutor0.setEnableSubstitutionInVariables(true);
      stringBuffer0.append((long) '$');
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert(48, (Object) "5N^v>{@pM-BOa~oGZ/36");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 48
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      // Undeclared exception!
      try { 
        strBuilder0.deleteCharAt((-602));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -602
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.setVariablePrefix('i');
      char[] charArray0 = new char[4];
      charArray0[2] = '$';
      charArray0[3] = 'i';
      String string0 = strSubstitutor0.replace(charArray0, 2, 2);
      assertEquals("i", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("user.home");
      // Undeclared exception!
      try { 
        strBuilder0.charAt((-1497));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1497
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("end < start");
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      assertEquals(43, strBuilder0.capacity());
      assertEquals("end < start", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Invalid length: ");
      strBuilder0.setLength(4549);
      assertEquals(9098, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("f<r6|B|");
      strBuilder0.appendSeparator("f<r6|B|");
      assertEquals(14, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("e.commons.lang3.text.StrMatcher");
      // Undeclared exception!
      try { 
        strBuilder0.setCharAt((-335), '$');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -335
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "5N^v>{@pM-BOa~oGZ/", "5N^v>{@pM-BOa~oGZ/", '^');
      StringBuffer stringBuffer0 = new StringBuffer('^');
      stringBuffer0.append((CharSequence) "5N^v>{@pM-BOa~oGZ/");
      strSubstitutor0.setEnableSubstitutionInVariables(true);
      stringBuffer0.append((long) '$');
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(884, 884);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-843));
      assertEquals(32, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
  }
}
