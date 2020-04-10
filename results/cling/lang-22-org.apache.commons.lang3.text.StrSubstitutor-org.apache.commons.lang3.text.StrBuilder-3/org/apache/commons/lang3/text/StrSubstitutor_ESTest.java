/*

 * Tue Mar 03 16:43:07 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrSubstitutor_ESTest extends StrSubstitutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "Dp38c", "\u0000");
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder(43);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1167), (-1167), "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1167
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "ava.speci");
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_PREFIX, "*/.{1/TD_", (-2080), (-334), 19);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2080
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      int int0 = strBuilder0.lastIndexOf(strMatcher0, (-1371));
      assertEquals((-1), int0);
      assertEquals(0, strBuilder0.length());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Properties properties0 = new Properties();
      properties0.getOrDefault(strBuilder0, (Object) null);
      assertEquals(32, strBuilder0.capacity());
      
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder('$');
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.getOrDefault(strBuilder0, object0);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("ITR&,IV;oyef", (-702));
      assertEquals(36, strBuilder1.capacity());
      assertTrue(strBuilder1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      char[] charArray0 = new char[7];
      charArray0[1] = 'F';
      charArray0[3] = 'F';
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      strSubstitutor0.setVariablePrefixMatcher(strMatcher_CharSetMatcher0);
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariableSuffix('F');
      String string0 = strSubstitutor1.replace(charArray0);
      assertEquals('$', strSubstitutor1.getEscapeChar());
      assertEquals("\u0000F\u0000F\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("9&:HyWKP)B#1#w8Re{", (-751));
      // Undeclared exception!
      try { 
        strBuilder1.replace(strSubstitutor0.DEFAULT_PREFIX, "PaSV.()Ofv-GB#z-9n/", 36, 36, 34);
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(17);
      char[] charArray0 = new char[19];
      charArray0[0] = 'F';
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('F');
      hashMap0.remove((Object) strBuilder0);
      assertEquals(17, strBuilder0.capacity());
      
      String string0 = strSubstitutor1.replace(charArray0);
      assertEquals("F\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertEquals('$', strSubstitutor1.getEscapeChar());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder(18);
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertFalse(boolean0);
      
      Properties properties0 = new Properties();
      Integer integer0 = new Integer(110);
      properties0.put(strBuilder0, strSubstitutor0);
      StrSubstitutor strSubstitutor1 = (StrSubstitutor)properties0.getOrDefault(strBuilder0, integer0);
      assertEquals(0, strBuilder0.length());
      assertEquals('$', strSubstitutor1.getEscapeChar());
      assertEquals(18, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendln((char[]) null, (-1371), (-1371));
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 2293);
      assertEquals(1, strBuilder0.size());
      
      StrBuilder strBuilder1 = new StrBuilder("5.0");
      assertEquals(35, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn((StrBuilder) null);
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_SUFFIX, "^eMKu", (-2391), 857, 857);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2391
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder((-2895));
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_PREFIX, "Invalid offset: ", (-806), 34, 108);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -806
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Properties properties0 = new Properties();
      properties0.getOrDefault(strBuilder0, (Object) null);
      assertEquals(32, strBuilder0.capacity());
      
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder('$');
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.getOrDefault(strBuilder0, object0);
      assertEquals(36, strBuilder0.capacity());
      
      StringBuffer stringBuffer0 = new StringBuffer("W`dp6M`ab9@ w");
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals("W`dp6M`ab9@ w", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrBuilder strBuilder0 = new StrBuilder(17);
      hashMap0.remove((Object) strBuilder0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", (-2520), 1984);
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
      StrBuilder strBuilder0 = new StrBuilder('$');
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.getOrDefault(strBuilder0, object0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("2$&FOI;9H4^Y-w&Zb\"", 0, (-6496));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder('$');
      strBuilder0.appendSeparator((String) null, (int) '$');
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_SUFFIX, "$", (-1885), 115, 115);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1885
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "LM Ali??1cOA\";QlE5", "LM Ali??1cOA\";QlE5", 'G');
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('G');
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "LM Ali??1cOA\";QlE5");
      StringBuffer stringBuffer0 = stringWriter2.getBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals("LM Ali??1cOA\";QlE5", stringBuffer0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "N|'--", "");
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_PREFIX, "mvp~ST.W?:q", (int) '$', 214, (-50));
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
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrMatcher strMatcher0 = StrMatcher.singleQuoteMatcher();
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(strMatcher0, "Variable suffix matcher must not be null!", 20, 20, (-2498));
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
      StrSubstitutor.replace((Object) "", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher strMatcher0 = StrMatcher.singleQuoteMatcher();
      // Undeclared exception!
      try { 
        strBuilder0.replace(strMatcher0, "Variable suffix matcher must not be null!", 20, 20, (-2498));
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "\"6Rn!j_UG#A~;\"V+nK", "user.name");
      char[] charArray0 = new char[3];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefixMatcher(strMatcher_CharSetMatcher0);
      strSubstitutor1.setEnableSubstitutionInVariables(true);
      strSubstitutor1.replace(charArray0);
      StrBuilder strBuilder0 = new StrBuilder('$');
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1833), 114, "\"6Rn!j_UG#A~;\"V+nK");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1833
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      Integer integer0 = new Integer((-1376));
      properties0.put("java.specification.vendor", integer0);
      properties0.getOrDefault(strBuilder0, (Object) null);
      String string0 = StrSubstitutor.replace((Object) strBuilder0, properties0);
      assertNotNull(string0);
      assertEquals(0, strBuilder0.length());
      assertEquals(32, strBuilder0.capacity());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn((StrBuilder) null);
      // Undeclared exception!
      try { 
        strBuilder0.delete(4, 116);
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
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_PREFIX, "9&:HyWKP)B#1#w8Re{", 25, 17, 6255);
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
      StrBuilder strBuilder0 = new StrBuilder(17);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator((String) null, (int) '$');
      // Undeclared exception!
      try { 
        strBuilder1.insert(17, (Object) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 17
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.put("${", "");
      StrSubstitutor.replace((Object) properties0, properties0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.delete(9, 5);
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
      StrBuilder strBuilder0 = new StrBuilder('$');
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.getOrDefault(strBuilder0, object0);
      strBuilder0.appendSeparator("org.apache.commons.lang3.text.StrBuilder", 12);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder('$');
      StrBuilder strBuilder1 = strBuilder0.appendSeparator((String) null, (int) '$');
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.getOrDefault(strBuilder1, object0);
      assertEquals(36, strBuilder1.capacity());
      assertEquals(36, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.deleteCharAt((-560));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -560
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "${");
      strSubstitutor0.replaceIn(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.delete(9, 5);
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
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor.replace((Object) strBuilder0, (Properties) null);
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("#<|98eFdsY ");
      // Undeclared exception!
      try { 
        strBuilder0.replace((StrMatcher) strMatcher_StringMatcher0, "", (-3212), (-3212), 3563);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3212
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("", (-2841));
      assertEquals(0, strBuilder1.size());
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-1415));
      strBuilder0.setLength(7);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Variable prefix matcher must not be null!");
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      assertEquals("Variable prefix matcher must not be null!", stringBuffer0.toString());
      assertEquals(73, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace("java.specification.vendor", 1, 9);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_PREFIX, "*/.{1/TD_", (-2080), (-334), 19);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2080
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendln((char[]) null, (-1371), (-1371));
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replaceIn(strBuilder0);
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 2293);
      assertFalse(strBuilder0.isEmpty());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("end < start", 48, 3375);
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
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.getOrDefault(strBuilder0, object0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("user.dir", 36, 190);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder(18);
      Properties properties0 = new Properties();
      Integer integer0 = new Integer(110);
      properties0.put(strBuilder0, strSubstitutor0);
      properties0.getOrDefault(strBuilder0, integer0);
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
  public void test40()  throws Throwable  {
      StrSubstitutor.replace((Object) "", (Properties) null);
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder('$');
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.getOrDefault(strBuilder0, object0);
      assertEquals(0, strBuilder0.length());
      assertEquals(36, strBuilder0.capacity());
      
      StringBuffer stringBuffer0 = new StringBuffer("W`dp6M`ab9@ w");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "a$*}6", "file.encoding");
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder("file.encoding");
      strBuilder0.insert(0, "@|y<hSAe_J)hC?j<S");
      assertEquals(30, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer("L");
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@2555f934");
      strBuilder0.validateIndex(18);
      assertEquals(57, strBuilder0.capacity());
      assertEquals(25, strBuilder0.length());
      
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("L", string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "\"6Rn!j_UG#A~;\"V+nK", "Gs.arch");
      char[] charArray0 = new char[3];
      charArray0[0] = '$';
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefixMatcher(strMatcher_CharSetMatcher0);
      strSubstitutor1.setEnableSubstitutionInVariables(true);
      StrBuilder strBuilder0 = new StrBuilder('$');
      Object[] objectArray0 = new Object[3];
      objectArray0[1] = (Object) strSubstitutor0;
      strBuilder0.appendWithSeparators(objectArray0, "$$$");
      strSubstitutor0.replace(strBuilder0);
      assertTrue(strSubstitutor0.isEnableSubstitutionInVariables());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("file.encoding");
      strBuilder0.appendSeparator('$', (-134));
      strBuilder0.insert(0, "@|y<hSAe_J)hC?j<S");
      assertEquals(30, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("", 1);
      StrMatcher strMatcher0 = StrMatcher.singleQuoteMatcher();
      // Undeclared exception!
      try { 
        strBuilder1.replace(strMatcher0, "Variable suffix matcher must not be null!", 20, 20, (-2498));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(17);
      strBuilder0.appendSeparator((String) null, (int) '$');
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_SUFFIX, "?c!,Q7)X7d<%?", 4069, 17, 4069);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "a$*}6", "file.encoding");
      StrBuilder strBuilder0 = new StrBuilder("file.encoding");
      Properties properties0 = new Properties();
      properties0.put("a$*}6", "a$*}6");
      StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      strBuilder0.insert(0, "@|y<hSAe_J)hC?j<S");
      assertEquals(30, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "}", "}", 'x');
      StringWriter stringWriter0 = new StringWriter(16);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "}");
      char[] charArray0 = new char[9];
      stringWriter0.write(charArray0);
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("DNtIH4,KASoO~+KMUC");
      strBuilder0.insert(16, 54.352F);
      assertEquals(25, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      int int0 = strBuilder0.lastIndexOf(strMatcher0, (-1371));
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
      
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test51()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.put("${", "");
      String string0 = StrSubstitutor.replace((Object) properties0, properties0);
      assertEquals("{${=}", string0);
      assertNotNull(string0);
      
      StrBuilder strBuilder0 = new StrBuilder();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder('$');
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.getOrDefault(strBuilder0, object0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", 0, 267);
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
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      strBuilder0.appendSeparator("8upu\"H>=F{", 36);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator((String) null, 4);
      assertEquals(32, strBuilder1.capacity());
      assertEquals(0, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendln((char[]) null, (-1371), (-1371));
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor1 = new StrSubstitutor((Map<String, ?>) hashMap0, "'", "'", '$');
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 2293);
      assertEquals(1, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder((-2895));
      StringBuffer stringBuffer0 = new StringBuffer("");
      strSubstitutor0.replaceIn(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_PREFIX, "Invalid offset: ", (-806), 34, 108);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -806
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Integer integer0 = new Integer('$');
      StrSubstitutor.replace((Object) integer0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@2555f934");
      strBuilder0.validateIndex(18);
      assertEquals(57, strBuilder0.capacity());
      assertEquals(25, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Variable prefix matcher must not be null!");
      strBuilder0.validateIndex(18);
      strBuilder0.appendSeparator("\u0000", 3019);
      assertEquals(42, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace("java.specification.vendor", 1, 9);
      StrBuilder strBuilder0 = new StrBuilder(9);
      // Undeclared exception!
      try { 
        strBuilder0.delete(1559, 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("MS+&cN6E4o+O!,U7e?d", (-792), (-792));
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
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendln((char[]) null, (-1371), (-1371));
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 2293);
      strBuilder1.appendSeparator("'", 37);
      assertFalse(strBuilder0.isEmpty());
      assertEquals(2, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      String string0 = strSubstitutor0.replace("java.specification.vendor", 1, 9);
      assertEquals("ava.speci", string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      Reader reader0 = strBuilder0.asReader();
      assertFalse(reader0.ready());
      
      properties0.load(reader0);
      assertEquals(0, strBuilder0.length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test63()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      int int0 = strBuilder0.lastIndexOf(strMatcher0, (-1371));
      assertEquals((-1), int0);
      
      Properties properties0 = new Properties();
      Integer integer0 = new Integer((-1371));
      properties0.put("java.specification.vendor", integer0);
      String string0 = StrSubstitutor.replace((Object) strBuilder0, properties0);
      assertNotNull(string0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals("", string0);
      assertEquals(0, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("ava.speci", 9);
      // Undeclared exception!
      try { 
        strBuilder1.replace(strSubstitutor0.DEFAULT_PREFIX, "*/.{1/TD_", (-2080), (-334), 19);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2080
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder((-2895));
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("$", (-2895));
      // Undeclared exception!
      try { 
        strBuilder1.replace(strSubstitutor0.DEFAULT_PREFIX, "Invalid offset: ", (-806), 34, 108);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -806
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.put("${", "");
      StrSubstitutor.replace((Object) properties0, properties0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((-37), (-819), "\u0000");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -37
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Variable prefix matcher must not be null!");
      strBuilder0.validateIndex(18);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("=62CyG:vK'l", 6, 1897);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@2555f934");
      strBuilder0.validateIndex(18);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", 21, (-181));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "}", "}", 'x');
      StrBuilder strBuilder0 = new StrBuilder("DNtIH4,KASoO~+KMUC");
      strBuilder0.insert(16, 54.352F);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("DNtIH4,KASoO~+KMUC", (-2361), 16);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }
}
