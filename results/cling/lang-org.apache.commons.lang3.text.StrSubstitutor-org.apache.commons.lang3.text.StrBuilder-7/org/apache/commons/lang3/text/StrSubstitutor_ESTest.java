/*

 * Tue Mar 03 16:43:09 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
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
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-2873), (int) '$');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2873
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("$");
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-650), 48);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -650
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert(41, 498L);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 41
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrMatcher strMatcher0 = strSubstitutor0.getVariableSuffixMatcher();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor.replace((Object) strMatcher0, (Map<String, ?>) hashMap0, "org.apache.commons.lang3.text.StrMatcher", "X");
      StrBuilder strBuilder0 = new StrBuilder("3x4Qb)K^]*COac");
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_PREFIX, "", 48, 48, 48);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_SUFFIX, ";uHSz=%(KX58z7", (-1119), 589, 32);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1119
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = mock(StrBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((-15)).when(strBuilder0).length();
      strSubstitutor0.replaceIn(strBuilder0);
      StrBuilder strBuilder1 = new StrBuilder((String) null);
      // Undeclared exception!
      try { 
        strBuilder1.replace(strSubstitutor0.DEFAULT_SUFFIX, (String) null, (-15), (-15), (-1957));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -15
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("=java.lang.Object@185cdcba");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringWriter stringWriter0 = new StringWriter();
      properties0.put(strBuilder0, "vHi} (h4#=r l~V");
      assertEquals(26, strBuilder0.size());
      assertEquals(58, strBuilder0.capacity());
      
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("", string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("remove() is unsupported", "remove() is unsupported").when(strMatcher0).toString();
      doReturn(0, 0, 2).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'R');
      char[] charArray0 = new char[3];
      charArray0[1] = 'R';
      String string0 = strSubstitutor0.replace(charArray0);
      assertEquals("\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replace((StringBuffer) null);
      // Undeclared exception!
      try { 
        strBuilder0.replace(118, 118, "=java.lang.Object@4b230cb7");
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@21b21a13");
      StringBuffer stringBuffer0 = new StringBuffer(5);
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(3096, 40, "");
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
      StrSubstitutor.replace((Object) "2G3nKZ?E<:", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace(118, 118, "=java.lang.Object@4b230cb7");
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
      Object object0 = new Object();
      Properties properties0 = new Properties();
      StrSubstitutor.replace(object0, properties0);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@21b21a13");
      // Undeclared exception!
      try { 
        strBuilder0.replace(3096, 40, "");
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
      Object object0 = new Object();
      Properties properties0 = new Properties();
      StrSubstitutor.replace(object0, properties0);
      StrBuilder strBuilder0 = new StrBuilder("=java.lang.Object@185cdcba");
      properties0.put(strBuilder0, "vHi} (h4#=r l~V");
      assertEquals(58, strBuilder0.capacity());
      assertEquals(26, strBuilder0.length());
      assertEquals(26, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("ho_\"Q<1").when(strLookup0).toString();
      doReturn("ho_\"Q<1").when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("remove() is unsupported", "starIndex must be vald", "kS[H", "length must be valid").when(strMatcher0).toString();
      doReturn(0, 0, 2, 39, 39).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'R');
      StrBuilder strBuilder0 = new StrBuilder("starIndex must be vald");
      strSubstitutor0.replace(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(82, 0, "");
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
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "java.lang.Object@14d73f49", "");
      StrBuilder strBuilder0 = new StrBuilder("Invalid startIndex: ");
      StrBuilder strBuilder1 = strBuilder0.replace(strSubstitutor0.DEFAULT_SUFFIX, "Invalid startIndex: ", 10, 48, 48);
      assertEquals(20, strBuilder0.length());
      assertEquals(52, strBuilder1.capacity());
      
      strSubstitutor0.replaceIn((StrBuilder) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(118, 118, "=java.lang.Object@4b230cb7");
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
      doReturn((String) null).when(strLookup0).toString();
      doReturn((String) null).when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("remove() is unsupported", "starIndex must be vald").when(strMatcher0).toString();
      doReturn(0, 0, 2, 39).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'R');
      StrBuilder strBuilder0 = new StrBuilder("kS[H");
      char[] charArray0 = strBuilder0.toCharArray(2, 1269);
      assertArrayEquals(new char[] {'[', 'H'}, charArray0);
      assertEquals(2, charArray0.length);
      assertEquals(4, strBuilder0.size());
      
      String string0 = strSubstitutor0.replace("length must be valid");
      assertEquals('R', strSubstitutor0.getEscapeChar());
      assertEquals("length must be valid", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("=java.lang.Object@185cdcba");
      assertFalse(strBuilder0.isEmpty());
      
      String string0 = strBuilder0.substring(23, 97);
      assertEquals("cba", string0);
      assertEquals(58, strBuilder0.capacity());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StrSubstitutor.replace((Object) "2G3:Z?E<:", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder((-1));
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-454), (-454));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -454
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("->");
      // Undeclared exception!
      try { 
        strBuilder0.setCharAt((-955), 'E');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -955
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("kS[H");
      strBuilder0.setLength(39);
      assertEquals(39, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      strBuilder0.appendSeparator('$', 9);
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      assertEquals(1, strBuilder0.size());
      assertEquals("$", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "java.lang.Object@18537f39", "");
      StrBuilder strBuilder0 = new StrBuilder("Invalid startIndex: ");
      strBuilder0.replace(strSubstitutor0.DEFAULT_SUFFIX, "Invalid startIndex: ", 10, 48, 48);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", (int) '$', (-2898));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("remove() is unsupported", "starIndex must be vald").when(strMatcher0).toString();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'R');
      strSubstitutor0.replace("length must be valid", 2, 0);
      StrBuilder strBuilder0 = new StrBuilder("starIndex must be vald");
      // Undeclared exception!
      try { 
        strBuilder0.replace((-938), 7, "stho_\"Q<1");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -938
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@4775804f");
      strBuilder0.appendSeparator('$', (-97));
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1817), 209, "lang.");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1817
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("=java.lang.Object@185cdcba");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringWriter stringWriter0 = new StringWriter();
      properties0.put(strBuilder0, "vHi} (h4#=r l~V");
      assertEquals(26, strBuilder0.length());
      assertEquals(58, strBuilder0.capacity());
      
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("remove() is unsupported", "starIndex must be vald").when(strMatcher0).toString();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'R');
      StrBuilder strBuilder0 = new StrBuilder("kS[H");
      strBuilder0.insert(0, (long) 'R');
      assertEquals(6, strBuilder0.length());
      
      StringBuffer stringBuffer0 = new StringBuffer();
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) null);
      Object object0 = new Object();
      Properties properties0 = new Properties();
      properties0.put("", object0);
      StrSubstitutor.replace(object0, properties0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_SUFFIX, "", (-1147), (-1147), (-1147));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1147
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StrSubstitutor.replace((Object) "2G3nKZ?E<:", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder(108);
      // Undeclared exception!
      try { 
        strBuilder0.insert(108, (-1L));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 108
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) "", properties0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert(41, 498L);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 41
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrMatcher strMatcher0 = strSubstitutor0.getVariableSuffixMatcher();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor.replace((Object) strMatcher0, (Map<String, ?>) hashMap0, "org.apache.commons.lang3.text.StrMatcher", "");
      StrBuilder strBuilder0 = new StrBuilder(256);
      // Undeclared exception!
      try { 
        strBuilder0.insert(5, '$');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 5
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'R');
      StrBuilder strBuilder0 = new StrBuilder(114);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('R', 2);
      strBuilder1.replaceAll("length must be valid", "remove() is unsupported");
      // Undeclared exception!
      try { 
        strBuilder1.replace(strSubstitutor0.DEFAULT_PREFIX, "Invalid offset: ", 1659, 2, 114);
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
      StrBuilder strBuilder0 = new StrBuilder("=java.lang.Object@185cdcba");
      strBuilder0.substring(23, 97);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("a`g", 2, 2);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("remove() is unsupported").when(strLookup0).toString();
      doReturn("remove() is unsupported").when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("remove() is unsupported", "starIndex must be vald", "kS[H", "length must be valid", (String) null).when(strMatcher0).toString();
      doReturn(0, 0, 2, 39, 0).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'R');
      strSubstitutor0.replace("length must be valid", 3, 0);
      String string0 = strSubstitutor0.replace("bJO`nS5(");
      assertEquals("bJremove() is unsupported", string0);
      assertEquals('R', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("kS[H");
      strBuilder0.appendSeparator(".");
      assertEquals(5, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("=java.lang.Object@185cdcba");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      properties0.put(strBuilder0, "vHi} (h4#=r l~V");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("a`g", 2, 2);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("org.apache.commons.lang3.text.StrTokenizer").when(strLookup0).toString();
      doReturn("org.apache.commons.lang3.text.StrTokenizer").when(strLookup0).lookup(anyString());
      int int0 = 0;
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("remove() is unsupported", "starIndex must be vald", (String) null, (String) null).when(strMatcher0).toString();
      doReturn(0, 0, 2, 39, 0).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'R');
      StrBuilder strBuilder0 = new StrBuilder("kS[H");
      strBuilder0.insert(0, 0L);
      assertEquals(5, strBuilder0.length());
      
      strSubstitutor0.replace("length must be valid");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@4775804f");
      StringBuffer stringBuffer0 = new StringBuffer(5);
      strSubstitutor0.replaceIn(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1817), 209, "lang.");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1817
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(114);
      StrBuilder strBuilder1 = strBuilder0.setNullText("remove() is unsupported");
      assertEquals(114, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(strMatcher0).toString();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'R');
      strSubstitutor0.replace("length must be valid", 2, 0);
      StrBuilder strBuilder0 = new StrBuilder("starIndex must be vald");
      // Undeclared exception!
      try { 
        strBuilder0.replace(82, 0, "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@21b21a13");
      strBuilder0.appendSeparator('$', (-97));
      // Undeclared exception!
      try { 
        strBuilder0.replace(3096, 40, "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("remove() is unsupported", "starIndex must be vald").when(strMatcher0).toString();
      doReturn(0, 0, 2, 0, 0).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'R');
      StrBuilder strBuilder0 = new StrBuilder("kS[H");
      strBuilder0.insert(0, 0L);
      assertEquals(5, strBuilder0.size());
      
      strSubstitutor0.replace("length must be valid");
      assertEquals('R', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(strLookup0).toString();
      doReturn((String) null).when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("remove() is unsupported", "starIndex must be vald").when(strMatcher0).toString();
      doReturn(0, 0, 2, 39).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'R');
      StrBuilder strBuilder0 = new StrBuilder("starIndex must be vald");
      strSubstitutor0.replace(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(82, 0, "");
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
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("remove() is unsupported").when(strMatcher0).toString();
      doReturn(0, 0, 2).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'R');
      strSubstitutor0.setVariableSuffix('g');
      StrBuilder strBuilder0 = new StrBuilder("starIndex must be vald");
      strSubstitutor0.replace(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-938), 7, "starIndex must be vald");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -938
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StrLookup<String> strLookup0 = (StrLookup<String>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("ho_\"Q<1").when(strLookup0).toString();
      doReturn("ho_\"Q<1").when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("remove() is unsupported", "starIndex must be vald", "kS[H", "length must be valid").when(strMatcher0).toString();
      doReturn(0, 0, 2, 39, 9).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'R');
      StrBuilder strBuilder0 = new StrBuilder("starIndex must be vald");
      strSubstitutor0.replace(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-938), 7, "stho_\"Q<1");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -938
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      strSubstitutor0.replace("Nqh0|BrAi4PFTJg", 5, 5);
      StrBuilder strBuilder0 = new StrBuilder(256);
      // Undeclared exception!
      try { 
        strBuilder0.insert(5, '$');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 5
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }
}
