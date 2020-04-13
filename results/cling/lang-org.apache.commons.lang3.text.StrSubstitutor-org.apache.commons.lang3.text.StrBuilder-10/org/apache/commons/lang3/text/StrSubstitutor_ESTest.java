/*

 * Tue Mar 03 16:44:06 GMT 2020
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
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4X\"/[");
      StringBuffer stringBuffer0 = new StringBuffer(116);
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-506), 334);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -506
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.put(strBuilder0, "Variable prefix must not be null!");
      HashMap<String, StrLookup<Integer>> hashMap0 = new HashMap<String, StrLookup<Integer>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<Integer>>) hashMap0, "Variable prefix must not be null!", "Variable prefix must not be null!", 'd');
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(32, strBuilder0.capacity());
      assertFalse(boolean0);
      assertEquals(0, strBuilder0.length());
      assertEquals('d', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("$)gz");
      HashMap<String, StrLookup<Integer>> hashMap0 = new HashMap<String, StrLookup<Integer>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<Integer>>) hashMap0, "$)gz", "28I'pnL[4eaXO-6lH;Q", '6');
      strSubstitutor0.replace((StringBuffer) null);
      // Undeclared exception!
      try { 
        strBuilder0.validateIndex(34);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 34
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("*+UsjG");
      strBuilder0.appendSeparator('$', 5);
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(41, 46);
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
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "59>]6L81", "59>]6L81", '9');
      strSubstitutor0.setVariablePrefix('9');
      strSubstitutor0.replace("59>]6L81");
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring(15, 15);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4X\"/[");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      StrSubstitutor strSubstitutor1 = null;
      try {
        strSubstitutor1 = new StrSubstitutor((Map<String, Object>) null, "", (String) null, '0');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable suffix must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4X\"/[");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      strBuilder0.appendSeparator('$', 5);
      assertEquals(11, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@7d0f8974");
      strBuilder0.appendSeparator('g', 0);
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals((-1), int0);
      assertEquals(57, strBuilder0.capacity());
      assertEquals(25, strBuilder0.size());
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4X\"/[");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals(10, strBuilder0.length());
      assertEquals(42, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder1 = new StrBuilder((String) null);
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4X\"/[");
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-506), 334);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -506
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.put(strBuilder0, "Variable prefix must not be null!");
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
      
      HashMap<String, StrLookup<Integer>> hashMap0 = new HashMap<String, StrLookup<Integer>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<Integer>>) hashMap0, "Variable prefix must not be null!", "Variable prefix must not be null!", 'd');
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('d', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Properties properties0 = new Properties();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.put(strBuilder0, "Variable prefix must not be null!");
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      char[] charArray0 = new char[0];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, '-');
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("Variable prefix must not be null!", (-1), (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4X\"/[");
      strSubstitutor0.replace((StringBuffer) null);
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(0, (-472));
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
      StrBuilder strBuilder0 = new StrBuilder("p7h0fMn<EX|*");
      strBuilder0.deleteCharAt(2);
      assertEquals(11, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4X\"/[");
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      String string0 = strBuilder0.substring(0, 521);
      assertEquals(42, strBuilder0.capacity());
      assertEquals("+J7/?4X\"/[", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrLookup<Integer> strLookup0 = (StrLookup<Integer>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrMatcher strMatcher0 = StrMatcher.noneMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'P');
      StringBuffer stringBuffer0 = new StringBuffer(117);
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.substring(38, (int) '$');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "^APWQ~GzbLd7", " \t\n\r\f", 'i');
      StrBuilder strBuilder0 = new StrBuilder("^APWQ~GzbLd7");
      strBuilder0.validateIndex(5);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("\"4vwd6.{r", 97, 1486);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@7d0f8974");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals(25, strBuilder0.length());
      assertEquals(57, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("YSPC`EEo>)4}xLD]?");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals(17, strBuilder0.length());
      assertEquals(11, int0);
      assertEquals(49, strBuilder0.capacity());
      
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(19, 4);
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
      Properties properties0 = new Properties();
      properties0.putIfAbsent("Variable prefix must not be null!", "Variable prefix must not be null!");
      StrSubstitutor.replace((Object) properties0, properties0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrBuilder strBuilder0 = new StrBuilder(3024);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_PREFIX, "Variable prefix must not be null!", 3024, 57, (-2023));
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
      properties0.putIfAbsent("Variable prefix must not be null!", "Variable prefix must not be null!");
      String string0 = StrSubstitutor.replace((Object) properties0, properties0);
      assertEquals("{Variable prefix must not be null!=Variable prefix must not be null!}", string0);
      assertNotNull(string0);
      
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.put(strBuilder0, "Variable prefix must not be null!");
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "", "", '\\');
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring(1011, 42);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4X\"/[");
      strSubstitutor0.replaceIn(strBuilder0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      String string0 = strBuilder0.substring(5, 2171);
      assertEquals("4X\"/[", string0);
      assertEquals(42, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.putIfAbsent("Variable prefix must not be null!", "Variable prefix must not be null!");
      String string0 = StrSubstitutor.replace((Object) properties0, properties0);
      assertEquals("{Variable prefix must not be null!=Variable prefix must not be null!}", string0);
      assertNotNull(string0);
      
      HashMap<String, StrLookup<Integer>> hashMap0 = new HashMap<String, StrLookup<Integer>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<Integer>>) hashMap0, "Variable prefix must not be null!", "Variable prefix must not be null!", 'd');
      StrBuilder strBuilder0 = new StrBuilder("Variable prefix must not be null!");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals('d', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
      assertEquals(65, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.putIfAbsent("Variable prefix must not be null!", "Variable prefix must not be null!");
      String string0 = StrSubstitutor.replace((Object) properties0, properties0);
      assertEquals("{Variable prefix must not be null!=Variable prefix must not be null!}", string0);
      
      StrBuilder strBuilder0 = new StrBuilder("Variable prefix must not be null!");
      strBuilder0.validateIndex(1);
      assertEquals(65, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.setLength(0);
      assertEquals(32, strBuilder1.capacity());
      assertTrue(strBuilder1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("set() is unsupported");
      strBuilder0.lastIndexOf((StrMatcher) null);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", 1431, 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4X\"/[");
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
  public void test29()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replaceIn(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(19, 4);
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
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor.replace((Object) "59>]6L81", (Properties) null);
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-1424), 4);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1424
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@5be8c1be");
      // Undeclared exception!
      try { 
        strBuilder0.setCharAt((-451), '$');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -451
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      strBuilder0.setLength(11);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Variable prefix mustnot be null!");
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      assertEquals(64, strBuilder0.capacity());
      assertEquals("Variable prefix mustnot be null!", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4`X\"/[");
      strSubstitutor0.replace("+J7/?4`X\"/[", 0, 0);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-1548), 211);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1548
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("Variable prefix must not be null!");
      strSubstitutor0.replaceIn((StrBuilder) null);
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals(65, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
      assertEquals(33, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@7d0f8974");
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertFalse(boolean0);
      
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals(57, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(25, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.put(strBuilder0, "Variable prefix must not be null!");
      HashMap<String, StrLookup<Integer>> hashMap0 = new HashMap<String, StrLookup<Integer>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<Integer>>) hashMap0, "Variable prefix must not be null!", "Variable prefix must not be null!", 'd');
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("Variable prefix must not be null!", 2122, 282);
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
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.put(strBuilder0, "Variable prefix must not be null!");
      HashMap<String, StrLookup<Integer>> hashMap0 = new HashMap<String, StrLookup<Integer>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<Integer>>) hashMap0, "Variable prefix must not be null!", "Variable prefix must not be null!", 'd');
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("Variable prefix must not be null!", 27, (-1057));
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
      StrBuilder strBuilder0 = new StrBuilder(3024);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('f', (int) 'f');
      // Undeclared exception!
      try { 
        strBuilder1.substring((-1100), (-1100));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1100
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator(';', (-458));
      // Undeclared exception!
      try { 
        strBuilder1.substring((-458), (-113));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -458
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4X\"/[");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals((-1), int0);
      assertEquals(10, strBuilder0.length());
      assertEquals(42, strBuilder0.capacity());
      
      StringBuffer stringBuffer0 = new StringBuffer('$');
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.put(strBuilder0, "Variable prefix must not be null!");
      assertEquals(32, strBuilder0.capacity());
      
      HashMap<String, StrLookup<Integer>> hashMap0 = new HashMap<String, StrLookup<Integer>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<Integer>>) hashMap0, "Variable prefix must not be null!", "Variable prefix must not be null!", 'd');
      StringBuffer stringBuffer0 = new StringBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      assertEquals('d', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = (StrMatcher.StringMatcher)StrSubstitutor.DEFAULT_SUFFIX;
      strBuilder0.appendFixedWidthPadRight((Object) "", 11, '^');
      strBuilder0.insert(11, 36);
      assertEquals(13, strBuilder0.size());
      
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_StringMatcher0, strMatcher_StringMatcher0, '[');
      StringWriter stringWriter0 = new StringWriter(36);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('[', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4`X\"/[");
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      Properties properties0 = new Properties();
      properties0.putIfAbsent("", stringBuffer0);
      StrSubstitutor.replace((Object) "+J7/?4`X\"/[", properties0);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-1548), 211);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1548
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Variable prefix must not be null!");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('p', 1233);
      strBuilder1.validateIndex(28);
      assertEquals(34, strBuilder0.length());
      assertEquals(65, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(9);
      strBuilder0.appendSeparator('$', (-809));
      // Undeclared exception!
      try { 
        strBuilder0.validateIndex(22);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 22
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4X\"/[");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      // Undeclared exception!
      try { 
        strBuilder0.setLength((-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("p7h0fMn<EX|*");
      char[] charArray0 = strBuilder0.toCharArray(2, 100);
      assertEquals(10, charArray0.length);
      assertArrayEquals(new char[] {'h', '0', 'f', 'M', 'n', '<', 'E', 'X', '|', '*'}, charArray0);
      assertEquals(12, strBuilder0.length());
      assertEquals(44, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.charAt((-778));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -778
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("D =y");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals((-1), int0);
      assertEquals(5, strBuilder0.length());
      
      StringBuffer stringBuffer0 = new StringBuffer("java.lang.Object@25c0b1ea");
      strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "^APWQ~GzbLd7", " \t\n\r\f", 'i');
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefixMatcher(strMatcher_TrimMatcher0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) " \t\n\r\f");
      boolean boolean0 = strSubstitutor1.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      assertEquals('i', strSubstitutor1.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder("^APWQ~GzbLd7");
      strBuilder0.validateIndex(5);
      assertEquals(12, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@7d0f8974");
      strBuilder0.appendSeparator("$\u0000\u0000\u0000$$\u0000\u0000\u0000\u0000");
      assertEquals(35, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4X\"/[");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      StrSubstitutor strSubstitutor1 = null;
      try {
        strSubstitutor1 = new StrSubstitutor((Map<String, Object>) hashMap0, (String) null, "\"7(4Z<)(I@/", '$');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable prefix must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HashMap<String, StrLookup<Integer>> hashMap0 = new HashMap<String, StrLookup<Integer>>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, StrLookup<Integer>>) hashMap0, "Variable prefix must not be null!", "Variable prefix must not be null!", 'd');
      StrBuilder strBuilder0 = new StrBuilder("Variable prefix must not be null!");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("Variable prefix must not be null!", 2122, 282);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4X\"/[");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("*+UsjG", (-1), (-1));
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
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4X\"/[");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("/{6o+", 5, (-1));
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
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.validateIndex(0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Variable prefix mustnot be null!");
      strBuilder0.appendSeparator(".2x^iuORY9x9(E", Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        strBuilder0.insert(Integer.MAX_VALUE, 319);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 2147483647
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace("Invalid startIndex: ", 5, 5);
      StrBuilder strBuilder0 = new StrBuilder((-430));
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(Integer.MAX_VALUE, 151);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@7d0f8974");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals((-1), int0);
      
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('g');
      strSubstitutor1.replace(strBuilder0);
      assertEquals(25, strBuilder0.length());
      assertEquals('$', strSubstitutor1.getEscapeChar());
      assertEquals(57, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("+J7/?4X\"/[");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("+J7/?4X\"/[", 5, 1896);
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
      StrBuilder strBuilder0 = new StrBuilder("set() is unsupported");
      strBuilder0.lastIndexOf((StrMatcher) null);
      strBuilder0.appendSeparator('9', 5);
      assertEquals(21, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrBuilder strBuilder0 = new StrBuilder(3024);
      strBuilder0.appendSeparator('f', (-2023));
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_PREFIX, "Variable prefix must not be null!", 3024, 57, (-2023));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "^APWQ~GzbLd7", " \t\n\r\f", 'i');
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefixMatcher(strMatcher0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) " \t\n\r\f");
      strSubstitutor1.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring((-2662), 1658);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2662
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Variable prefix must not be null!");
      strBuilder0.validateIndex(28);
      // Undeclared exception!
      try { 
        strBuilder0.append("Variable prefix must not be null!", 1, (-596));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.validateIndex(0);
      assertEquals(32, strBuilder0.capacity());
      
      strSubstitutor0.replace("java.lang.Object@29ad3809", 0, 0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendFixedWidthPadRight((Object) "", 11, '^');
      strBuilder0.insert(11, 36);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", (-1057), 28);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }
}
