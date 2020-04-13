/*

 * Tue Mar 03 16:44:35 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((-3414), 1213, (String) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3414
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
        strBuilder0.replace((-1), (-178), "Invalid startIndex: ");
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
      StrBuilder strBuilder0 = new StrBuilder("ZXd4cW3");
      strBuilder0.setLength(2);
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      int int0 = strBuilder0.lastIndexOf(strMatcher0);
      assertEquals(2, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder((-1163));
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_TrimMatcher0, (-2687));
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
      
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-546));
      assertEquals((-1), int0);
      
      strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(0, strBuilder0.length());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      strSubstitutor0.setVariablePrefix('R');
      char[] charArray0 = new char[8];
      charArray0[3] = 'R';
      String string0 = strSubstitutor0.replace(charArray0);
      assertEquals("\u0000\u0000\u0000R\u0000\u0000\u0000\u0000", string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder("MapStrLookup@360d");
      strBuilder0.lastIndexOf(strMatcher0, (-248));
      assertEquals(49, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer("Invalid startIndex: ");
      StringBuffer stringBuffer1 = stringBuffer0.append((CharSequence) "startIndex must be valid");
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("Invalid offset: ");
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefixMatcher(strMatcher0);
      strSubstitutor0.setVariableSuffix("r");
      boolean boolean0 = strSubstitutor1.replaceIn(stringBuffer1);
      assertEquals(44, stringBuffer0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      strSubstitutor0.setVariablePrefix('$');
      strSubstitutor0.replace("org.apache.commons.lang3.text.StrMatcher$CharMatcher@6ca8d22c");
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace(1, 1, "org.apache.commons.lang3.text.StrMatcher$CharMatcher@6ca8d22c");
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strBuilder0.replace(4, (int) '$', "MapStrLookup@3bb39d");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("startIndex must be valid", 4, (-103));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      Object object0 = new Object();
      hashMap0.remove((Object) strBuilder0, object0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "m", "end < start", '$');
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(24, strBuilder0.length());
      assertEquals(56, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(34);
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, 48);
      assertEquals(34, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
      assertEquals((-1), int0);
      
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0);
      StringBuffer stringBuffer0 = new StringBuffer(40);
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrBuilder strBuilder0 = new StrBuilder();
      Object object0 = new Object();
      hashMap0.remove((Object) strBuilder0, object0);
      StrBuilder strBuilder1 = strBuilder0.append(false);
      strBuilder1.deleteFirst("zNWo7qJ?J:?25.K");
      assertEquals(5, strBuilder0.length());
      assertEquals(5, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 4);
      // Undeclared exception!
      try { 
        strBuilder0.appendln("aYcG{)9H\"", (-546), 18);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1698), 50, "H=>");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1698
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1), (-178), "Invalid startIndex: ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@2865e103");
      strBuilder0.deleteFirst("MapStrLookup@3bb39d");
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1786), (-1786), "org.apache.commons.lang3.text.StrSubstitutor@2865e103");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1786
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      hashMap0.remove((Object) strBuilder0, (Object) strSubstitutor0);
      assertEquals(56, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(24, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      Object object0 = new Object();
      hashMap0.remove((Object) strBuilder0, object0);
      // Undeclared exception!
      try { 
        strBuilder0.appendln("{5$<0w^V", (-1220), 4);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(680, 1134, "a");
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('L');
      char[] charArray0 = new char[10];
      charArray0[0] = '$';
      charArray0[1] = 'L';
      String string0 = strSubstitutor1.replace(charArray0);
      assertEquals("L\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(0);
      strSubstitutor0.replace((StringBuffer) null);
      // Undeclared exception!
      try { 
        strBuilder0.replace(39, 14, "MapStrLookup@3bb39d");
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
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strBuilder0.insert(4, "startIndex must be valid");
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0, "MapStrLookup@6", "k9(X2Rk6i~c~o|~Jzt", '!');
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", 22, (-1609));
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
      StrSubstitutor.replace((Object) "", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.replace(17, 17, "Variable suffix matcher must not be null!");
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
      StrBuilder strBuilder0 = new StrBuilder("GFxN'x;u");
      StrBuilder strBuilder1 = strBuilder0.deleteFirst("org.apache.commons.lang3.text.StrSubstitutor@33212446");
      // Undeclared exception!
      try { 
        strBuilder1.validateIndex(1213);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 1213
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      Object object0 = new Object();
      Properties properties0 = new Properties();
      StrSubstitutor.replace(object0, properties0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(680, 1134, "a");
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
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      Object object0 = new Object();
      hashMap0.remove((Object) strBuilder0, (Object) strSubstitutor0);
      Properties properties0 = new Properties();
      String string0 = StrSubstitutor.replace(object0, properties0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strBuilder0.replace(4, (int) '$', "startIndex must be valid");
      assertEquals(28, strBuilder0.length());
      
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      StrBuilder strBuilder1 = strBuilder0.replace(4, (int) '$', "MaptrLokup@3bb39d");
      strSubstitutor0.replaceIn(strBuilder1);
      assertEquals(21, strBuilder0.size());
      assertEquals(21, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      StrBuilder strBuilder1 = strBuilder0.setCharAt(4, '$');
      assertEquals(24, strBuilder0.length());
      assertEquals(56, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(34);
      strBuilder0.lastIndexOf((StrMatcher) null, 48);
      // Undeclared exception!
      try { 
        strBuilder0.appendln("", 48, (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      // Undeclared exception!
      try { 
        strBuilder0.deleteCharAt((-1506));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1506
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      StrBuilder strBuilder1 = strBuilder0.replace(4, (int) '$', "MaptrLokup@3bb39d");
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      strBuilder0.lastIndexOf(strMatcher0, 994);
      strBuilder1.setNullText("MapStrLookup@6");
      assertEquals(21, strBuilder0.length());
      assertEquals(21, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strBuilder0.replace(4, (int) '$', "MaptrLokup@3bb39d");
      assertEquals(21, strBuilder0.size());
      
      StringBuffer stringBuffer0 = new StringBuffer(4);
      strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrSubstitutor.replace((Object) "", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder(17);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-67), 2, "IZrlyZ1@zl4=@");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -67
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      StringBuffer stringBuffer0 = new StringBuffer(4);
      stringBuffer0.append((CharSequence) strBuilder0);
      assertEquals(24, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strBuilder0.replace(4, (int) '$', "MaptrLokup@3bb39d");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("MapStrLookup@360d", 348, 43);
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
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replace("', has a length less than 2", 4, 4);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-612), (-612), "L\u0000\u0000L\u0000\u0000\u0000\u0000\u0000");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -612
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn((StrBuilder) null);
      strBuilder0.setLength(1319);
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertFalse(strBuilder0.isEmpty());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 994);
      assertEquals((-1), int0);
      
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(56, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      assertEquals(24, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      Object object0 = new Object();
      hashMap0.remove((Object) strBuilder0, object0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("end < start", 475, 4);
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
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = (StrMatcher.StringMatcher)StrSubstitutor.DEFAULT_SUFFIX;
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, 939);
      assertEquals(56, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals(24, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@82ae6a5");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 994);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("length must be valid", 51, 5);
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
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      Object object0 = new Object();
      hashMap0.remove((Object) strBuilder0, object0);
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, stringBuffer0.length());
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.validateIndex(0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "org.apache.commons.lang3.text.StrMatcher$StringMatcher@6270396d");
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("mmons.lang3.t");
      Object object0 = new Object();
      strBuilder0.insert(0, object0);
      assertEquals(38, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      StrBuilder strBuilder1 = strBuilder0.appendln("startIndex must be valid", 4, 4);
      strBuilder1.insert(4, "startIndex must be valid");
      assertEquals(53, strBuilder0.length());
      assertEquals(53, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      StrBuilder strBuilder1 = strBuilder0.appendln("startIndex must be valid", 4, 4);
      strBuilder1.lastIndexOf((StrMatcher) null);
      assertEquals(29, strBuilder0.size());
      assertEquals(29, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      char[] charArray0 = strBuilder0.toCharArray(0, 357);
      assertEquals(24, charArray0.length);
      assertEquals(24, strBuilder0.length());
      assertEquals(56, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      StringBuffer stringBuffer0 = new StringBuffer(4);
      strSubstitutor0.replaceIn(stringBuffer0);
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 4);
      assertEquals(24, strBuilder0.length());
      assertEquals(56, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("6f?0P2@");
      StrBuilder strBuilder1 = strBuilder0.setNullText((String) null);
      assertEquals(39, strBuilder1.capacity());
      assertEquals(7, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "m", "end < start", '$');
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.insert(394, "MapStrLookup@6");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 394
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strBuilder0.deleteFirst("startIndex must be valid");
      // Undeclared exception!
      try { 
        strBuilder0.replace(680, 1134, "a");
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-546));
      assertEquals((-1), int0);
      assertEquals(32, strBuilder0.capacity());
      
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder((-1163));
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_TrimMatcher0, (-2687));
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals(0, strBuilder0.length());
      
      StringBuffer stringBuffer0 = new StringBuffer();
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("", string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strBuilder0.replace(4, (int) '$', "MaptrLokup@3bb39d");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("MaptrLokup@3bb39d", 10, 10);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("");
      assertFalse(strBuilder1.isEmpty());
      assertEquals(24, strBuilder1.length());
      assertEquals(56, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      Object object0 = new Object();
      hashMap0.remove((Object) strBuilder0, object0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("yU^,?", 4, 4191);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strBuilder0.appendln("startIndex must be valid", 4, 4);
      hashMap0.remove((Object) strBuilder0, (Object) strSubstitutor0);
      assertEquals(29, strBuilder0.size());
      assertEquals(29, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@13793888");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 994);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor1 = null;
      try {
        strSubstitutor1 = new StrSubstitutor((Map<String, String>) hashMap0, (String) null, (String) null, '$');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable prefix must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("6yUMe\"JJ9%/iV&(!");
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("6L /.pP!^)");
      int int0 = strBuilder0.lastIndexOf(strMatcher0, 44);
      assertEquals(16, strBuilder0.length());
      assertEquals(48, strBuilder0.capacity());
      assertEquals((-1), int0);
      
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "", "", '3');
      assertEquals('3', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strBuilder0.replace(4, (int) '$', "MaptrLokup@3bb39d");
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      strBuilder0.lastIndexOf(strMatcher0, 994);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("startIndex must be valid", (-2666), 994);
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
      StrBuilder strBuilder0 = new StrBuilder("6yUMe\"JJ9%/iV&(!");
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("");
      int int0 = strBuilder0.lastIndexOf(strMatcher0, 44);
      assertEquals((-1), int0);
      
      StrBuilder strBuilder1 = strBuilder0.deleteFirst("org.apache.commons.lang3.text.StrLookup");
      assertEquals(16, strBuilder1.length());
      assertEquals(48, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 994);
      strBuilder0.deleteFirst("startIndex must be valid");
      assertEquals(0, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      strSubstitutor0.replaceIn(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1), (-178), "Invalid startIndex: ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StrSubstitutor.replace((Object) "", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("");
      Object[] objectArray0 = new Object[9];
      strBuilder0.appendWithSeparators(objectArray0, "4.0");
      strBuilder0.insert(17, "");
      assertEquals(24, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      Object object0 = new Object();
      strBuilder0.insert(4, "startIndex must be valid");
      Properties properties0 = new Properties();
      String string0 = StrSubstitutor.replace(object0, properties0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      StringBuffer stringBuffer0 = new StringBuffer();
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("", string0);
      
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 994);
      assertEquals(56, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(24, strBuilder0.length());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-546));
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("K%Y[", 47, 5);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strBuilder0.appendln("startIndex must be valid", 4, 4);
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 4);
      assertEquals(29, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strBuilder0.appendln("startIndex must be valid", 4, 4);
      // Undeclared exception!
      try { 
        strBuilder0.replace(680, 1134, "a");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(34);
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, 48);
      assertEquals((-1), int0);
      assertEquals(34, strBuilder0.capacity());
      
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0);
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strBuilder0.lastIndexOf((StrMatcher) null);
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(24, strBuilder0.length());
      assertEquals(56, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      hashMap0.remove((Object) strBuilder0, (Object) strSubstitutor0);
      assertFalse(strBuilder0.isEmpty());
      
      strBuilder0.deleteFirst("startIndex must be valid");
      assertEquals(0, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('L');
      char[] charArray0 = new char[6];
      charArray0[4] = 'L';
      String string0 = strSubstitutor1.replace(charArray0);
      assertEquals("\u0000\u0000\u0000\u0000L\u0000", string0);
      
      StrBuilder strBuilder0 = new StrBuilder("'2S$");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 100);
      assertEquals(4, strBuilder0.size());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(36, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = (StrMatcher.StringMatcher)StrSubstitutor.DEFAULT_SUFFIX;
      strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, 939);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("end < start", 4, 939);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('L');
      char[] charArray0 = new char[10];
      charArray0[4] = 'L';
      strSubstitutor1.replace(charArray0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((-612), (-612), "L\u0000\u0000L\u0000\u0000\u0000\u0000\u0000");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -612
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(17);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) strSubstitutor0;
      strBuilder0.appendWithSeparators(objectArray0, "MapStrLookup@6");
      strBuilder0.insert(41, "MapStrLookup@6");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("Avz#ETYGp55Bs", (-1000), (-4212));
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
      StrSubstitutor.replace((Object) "", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("6yUMe\"JJ9%/iV&(!");
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("6yUMe\"JJ9%/iV&(!");
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_StringMatcher0, 9);
      assertEquals(16, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals(48, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder('$');
      StrBuilder strBuilder1 = strBuilder0.appendln((String) null, 694, (int) '$');
      strBuilder1.appendFixedWidthPadRight(103, 103, '$');
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 103);
      assertEquals(104, strBuilder0.size());
      
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }
}
