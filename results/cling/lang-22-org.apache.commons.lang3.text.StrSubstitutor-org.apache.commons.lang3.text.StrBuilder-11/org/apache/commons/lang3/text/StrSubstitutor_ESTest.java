/*

 * Tue Mar 03 16:45:03 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrSubstitutor_ESTest extends StrSubstitutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, '(');
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-674), 2);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -674
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@25538f04");
      StringBuffer stringBuffer0 = new StringBuffer(36);
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-1357), (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1357
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder("\u0000\u0000");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-492));
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(34, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals(2, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder((-1057));
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertFalse(boolean0);
      
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-1057));
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(0, strBuilder0.length());
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("\u0000\u0000");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-492));
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
      
      StrBuilder strBuilder1 = strBuilder0.replaceAll("$%B s.-iY-4V/{c", "");
      assertEquals(34, strBuilder1.capacity());
      assertEquals(2, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "&b^Yxvu0=/E/=Zm4_kI", "java.lang.Object@471c6e1e");
      StrMatcher strMatcher0 = StrMatcher.spaceMatcher();
      strSubstitutor0.setVariablePrefixMatcher(strMatcher0);
      StrBuilder strBuilder0 = new StrBuilder("length must be valid");
      strSubstitutor0.replaceIn(strBuilder0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      int int0 = strBuilder0.validateRange(15, 115);
      assertEquals(20, strBuilder0.length());
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder('$');
      strSubstitutor0.replace((StringBuffer) null);
      // Undeclared exception!
      try { 
        strBuilder0.insert(1117, (long) 1117);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 1117
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("{}");
      StrBuilder strBuilder1 = strBuilder0.replaceAll("l\"_\u0004_>P-KK", "}");
      // Undeclared exception!
      try { 
        strBuilder1.validateRange(39, 2312);
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
      StrBuilder strBuilder0 = new StrBuilder(31);
      strBuilder0.appendSeparator("G:fV", (-1338));
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(34, 2796);
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
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      char[] charArray0 = new char[19];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor1 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strSubstitutor0.DEFAULT_PREFIX, 'x');
      strSubstitutor1.replace("$$$\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 4, 4);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(4, (-1));
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
      char[] charArray0 = new char[8];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrBuilder strBuilder0 = new StrBuilder("\u0000\u0000K\u0000\u0000");
      strBuilder0.lastIndexOf((StrMatcher) strMatcher_CharSetMatcher0, (-2667));
      strBuilder0.replaceAll("\u0000\u0000K\u0000\u0000", "ject@2ef9d");
      assertEquals(10, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-1057));
      StrBuilder strBuilder1 = strBuilder0.append("'4saC'.Hx5CT/r >S");
      strBuilder1.replaceFirst("'4saC'.Hx5CT/r >S", "java.endorsed.dirs");
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(556, 256);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.vm.specification.version");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("ject@337a9d", 32);
      strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 32);
      strBuilder1.appendSeparator("H]2WI%rw=s|,", (-899));
      assertEquals(40, strBuilder0.size());
      assertEquals(61, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[8];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'K');
      StrBuilder strBuilder0 = new StrBuilder("K\u0000K\u0000\u0000");
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_CharSetMatcher0, 0);
      assertEquals(37, strBuilder0.capacity());
      assertEquals(5, strBuilder0.size());
      assertEquals((-1), int0);
      
      char[] charArray1 = new char[3];
      charArray1[1] = '$';
      String string0 = strSubstitutor0.replace(charArray1);
      assertEquals("\u0000$\u0000", string0);
      assertNotNull(string0);
      assertEquals('K', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@25538f04");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 36);
      assertEquals(25, strBuilder0.length());
      assertEquals(57, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
      
      StrBuilder strBuilder1 = new StrBuilder((String) null);
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn((StrBuilder) null);
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-492), 97);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -492
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-53), 68);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -53
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("J.9E?1Dzzm");
      StrBuilder strBuilder1 = strBuilder0.deleteCharAt(0);
      strBuilder1.replaceFirst("J.9E?1Dzzm", ".9E?1Dzzm");
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-1997), (-2852));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1997
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@59b99ffc");
      strBuilder1.replaceAll("Windows NT", "r6[lpuUB");
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-492), 97);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -492
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "java.lang.Object@336a6633", "end < start");
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(Integer.MAX_VALUE, 116);
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
      StringBuffer stringBuffer0 = new StringBuffer();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@263946c2");
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(872, 56);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("$e8");
      strBuilder0.insert(0, (double) 0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("9dC00, J", 1831, 3277);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StrSubstitutor.replace((Object) "je2tY4", (Properties) null);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("\u0000\u0000\u0000\u0000\u0000");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (int) '$');
      assertEquals(5, strBuilder0.length());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(37, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrSubstitutor.replace((Object) "ject@4", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(120, 36);
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
      char[] charArray0 = new char[8];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, '\u0000');
      StrBuilder strBuilder0 = new StrBuilder("\u0000\u0000");
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_CharSetMatcher0, 0);
      assertEquals(34, strBuilder0.capacity());
      assertEquals(2, strBuilder0.size());
      assertEquals(0, int0);
      
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('\u0000', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("{");
      strBuilder0.replaceAll("{", (String) null);
      // Undeclared exception!
      try { 
        strBuilder0.insert(848, 0.0F);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 848
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      Object object0 = new Object();
      properties0.setProperty("&,vdvY?>FcY", "&,vdvY?>FcY");
      StrSubstitutor.replace(object0, properties0);
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(116, 2);
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
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder("{}");
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(39, 2312);
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
      Object object0 = new Object();
      Properties properties0 = new Properties();
      Integer integer0 = new Integer(31);
      properties0.put("K", integer0);
      StrSubstitutor.replace(object0, properties0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder("!E5Sv7@");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(39, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals(7, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("{");
      strBuilder0.appendSeparator((String) null, 76);
      // Undeclared exception!
      try { 
        strBuilder0.insert(848, 0.0F);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 848
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[6];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'K');
      strSubstitutor0.replace(charArray0);
      StrBuilder strBuilder0 = new StrBuilder("\u0000\u0000KK");
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(25, 25);
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
      StrBuilder strBuilder0 = new StrBuilder("nrz0xo=tbv<");
      strBuilder0.insert(11, true);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("nrz0xo=tbv<true", 11, 99);
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
      StrBuilder strBuilder0 = new StrBuilder("[`m[C4");
      // Undeclared exception!
      try { 
        strBuilder0.deleteCharAt((-1500));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1500
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      
      StrBuilder strBuilder0 = new StrBuilder("nrz0xo=tbv<");
      assertFalse(strBuilder0.isEmpty());
      
      int int0 = strBuilder0.validateRange(1, 2336);
      assertEquals(43, strBuilder0.capacity());
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor.replace((Object) strSubstitutor0, (Properties) null);
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-492), 97);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -492
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, '(');
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.substring(0, 363);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("S([e`i", 97, 891);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace("org.apache.commons.lang3.text.StrSubstitutor", 11, 11);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-775), (-2704));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -775
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder("\u0000\u0000\u0000\u0000\u0000");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (int) '$');
      assertEquals((-1), int0);
      assertEquals(37, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(5, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("{}");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 2454);
      assertEquals((-1), int0);
      
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(2, strBuilder0.size());
      assertEquals(34, strBuilder0.capacity());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "java.lang.Object@336a6633", "end < start");
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendPadding(804, '&');
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 116);
      assertFalse(strBuilder0.isEmpty());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("nrz0xo=tbv<");
      strBuilder0.insert(11, true);
      strBuilder0.replaceAll("nrz0xo=tbv<true", "Solaris");
      assertEquals(7, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("nrz0xo=tbv<");
      strBuilder0.insert(11, true);
      assertEquals(15, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "java.lang.Object@48838e47", "java.lang.Object@48838e47");
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('i');
      char[] charArray0 = new char[6];
      charArray0[0] = 'i';
      strSubstitutor0.setEnableSubstitutionInVariables(true);
      String string0 = strSubstitutor1.replace(charArray0);
      assertEquals('$', strSubstitutor1.getEscapeChar());
      assertEquals("i\u0000\u0000\u0000\u0000\u0000", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      StrSubstitutor.replace((Object) locale_Category0, properties0);
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-674), 2);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -674
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@263946c2");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("nw-x!3S`.^V2*v)M", 10);
      // Undeclared exception!
      try { 
        strBuilder1.validateRange(872, 56);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(9);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator((String) null, 9);
      // Undeclared exception!
      try { 
        strBuilder1.validateRange(9, 36);
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
      Integer integer0 = new Integer((-1997));
      StrSubstitutor.replace((Object) integer0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("-1997");
      // Undeclared exception!
      try { 
        strBuilder0.insert(1596, 4853.3);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 1596
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder("Variable prefix matcher must not be null!");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 0);
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
  public void test48()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      // Undeclared exception!
      try { 
        strBuilder0.charAt((-2118));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2118
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.setNullText((String) null);
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrLookup<Integer> strLookup0 = StrLookup.mapLookup((Map<String, Integer>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      char[] charArray0 = new char[3];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor1 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strSubstitutor0.DEFAULT_PREFIX, 'x');
      strSubstitutor1.replace(charArray0);
      StrBuilder strBuilder0 = new StrBuilder("$\u0000\u0000");
      strBuilder0.insert(2, 0.0);
      assertEquals(6, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@263946c2");
      StrBuilder strBuilder1 = strBuilder0.replaceAll("2", "ject@");
      // Undeclared exception!
      try { 
        strBuilder1.validateRange(872, 56);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("java.vm.specification.version");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("ject@337a9d", 32);
      int int0 = strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 32);
      assertEquals(40, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      String string0 = strSubstitutor0.replace("nw-x!3S`.^V2*v)M", 11, 1);
      assertEquals("2", string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder("nrz0xo=tbv<");
      int int0 = strBuilder0.validateRange(1, 2336);
      assertEquals(43, strBuilder0.capacity());
      assertEquals(11, strBuilder0.size());
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("J.9E?1Dzzm");
      strBuilder0.appendSeparator("f<V+G(qRm", "L");
      assertEquals(19, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[8];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'h');
      strSubstitutor0.replace(charArray0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert(100, (double) 23);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 100
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[8];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'K');
      String string0 = strSubstitutor0.replace(charArray0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertEquals('K', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder("\u0000\u0000K\u0000\u0000");
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_CharSetMatcher0, (-2667));
      assertEquals((-1), int0);
      assertEquals(5, strBuilder0.size());
      assertEquals(37, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@21c3e6f");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 630);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("S([e`i", 1195, 630);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@6c8b93e");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 36);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("Invalid startIndex: ", (-1357), (-1357));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("\u0000\u0000\u0000\u0000\u0000");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (int) '$');
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder1 = strBuilder0.replaceAll("$%B s.-iY-4V/{c", "");
      assertEquals(5, strBuilder1.length());
      assertEquals(37, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@3fcfe38a");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 36);
      strBuilder0.replaceFirst("java.lang.Object@3fcfe38a", "AzC-2W/b9z3)m&L");
      assertEquals(15, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@25538f04");
      StringBuffer stringBuffer0 = new StringBuffer(36);
      strSubstitutor0.replaceIn(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-1357), (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1357
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Properties properties0 = new Properties();
      Object object0 = new Object();
      StrSubstitutor.replace(object0, properties0);
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.insert(0, (double) 24);
      assertEquals(4, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@21c3e6f");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 630);
      assertEquals(56, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals(24, strBuilder0.length());
      
      StringBuffer stringBuffer0 = new StringBuffer(711);
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.setNullText("X/1[Zt:+h");
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, '(');
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-2153));
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("S([e`i", 97, 891);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.vm.specification.version");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("ject@337a9d", 32);
      strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 32);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("nw-x!3S`.^V2*v)M", (-1), (-1580));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      char[] charArray0 = new char[8];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'K');
      strSubstitutor0.replace(charArray0);
      StrBuilder strBuilder0 = new StrBuilder(116);
      StrBuilder strBuilder1 = strBuilder0.appendPadding(116, 'd');
      int int0 = strBuilder1.lastIndexOf((StrMatcher) strMatcher_CharSetMatcher0, 1741);
      assertFalse(strBuilder0.isEmpty());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("ULzD?gsU?`OZy1A {L");
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, 36);
      assertEquals((-1), int0);
      assertEquals(51, strBuilder0.capacity());
      assertEquals(19, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("{}");
      strBuilder0.appendSeparator("wchIpmH{'v%o~", 117);
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-3180), (-4259));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3180
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator("r6[lpuUB", (-1317));
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-492), 97);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -492
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, '(');
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("\u0000\u0000\u0000", 2216);
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder1);
      strSubstitutor0.replaceIn(stringBuffer0);
      strBuilder1.insert(0, (double) 24);
      assertEquals(7, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      char[] charArray0 = new char[8];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'K');
      strSubstitutor0.replace(charArray0);
      StrBuilder strBuilder0 = new StrBuilder("\u0000\u0000K\u0000\u0000");
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-1033), (-1033));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1033
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace("nw-x!3S`.^V2*v)M", 11, 1);
      StrBuilder strBuilder0 = new StrBuilder("nrz0xo=tbv<");
      strBuilder0.insert(11, true);
      assertEquals(15, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("nrz0xo=tbv<");
      strBuilder0.insert(11, true);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("Solaris", (-1809), 1);
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
      StrSubstitutor.replace((Object) "je2tY4", (Properties) null);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("\u0000\u0000");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-492));
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(34, strBuilder0.capacity());
      assertEquals(2, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      char[] charArray0 = new char[8];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrBuilder strBuilder0 = new StrBuilder("\u0000\u0000");
      strBuilder0.lastIndexOf((StrMatcher) strMatcher_CharSetMatcher0, 0);
      Properties properties0 = new Properties();
      Object object0 = new Object();
      String string0 = StrSubstitutor.replace(object0, properties0);
      assertNotNull(string0);
  }
}
