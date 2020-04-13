/*

 * Tue Mar 03 16:45:18 GMT 2020
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
import java.util.function.Function;
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
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replace((StringBuffer) null);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-117), 1614, "4.1");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -117
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@2b1fe420");
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-185), 256, "org.apach.commons.lang3.txt.StrSubstitutor@2b1f420");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -185
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      StrBuilder strBuilder0 = new StrBuilder("oYJaQ,Q`|@ic1):^LI\"");
      StrMatcher strMatcher1 = StrMatcher.charSetMatcher("76");
      int int0 = strBuilder0.lastIndexOf(strMatcher0, (-3194));
      assertEquals((-1), int0);
      
      HashMap<String, Locale.FilteringMode> hashMap0 = new HashMap<String, Locale.FilteringMode>();
      StrLookup<Locale.FilteringMode> strLookup0 = StrLookup.mapLookup((Map<String, Locale.FilteringMode>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher1, strMatcher1, 'p');
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(51, strBuilder0.capacity());
      assertEquals('p', strSubstitutor0.getEscapeChar());
      assertEquals(19, strBuilder0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator("9", 0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(9, 1925, (String) null);
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
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@2b1fe420");
      strBuilder0.deleteAll("e");
      // Undeclared exception!
      try { 
        strBuilder0.replace((-185), 256, "org.apach.commons.lang3.txt.StrSubstitutor@2b1f420");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -185
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor.replace((Object) strSubstitutor0, (Map<String, ?>) hashMap0, "e", "e");
      hashMap0.put("e", "org.apache.commons.lang3.text.StrSubstitutor@48c43c96");
      StrSubstitutor.replaceSystemProperties(hashMap0);
      StrSubstitutor strSubstitutor1 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@48c43c96");
      StrBuilder strBuilder1 = new StrBuilder();
      StrSubstitutor strSubstitutor2 = strSubstitutor0.setVariableSuffixMatcher(strSubstitutor1.DEFAULT_PREFIX);
      strSubstitutor1.replace(strBuilder0);
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Map<String, ?>) hashMap0);
      strSubstitutor2.setVariablePrefixMatcher(strSubstitutor0.DEFAULT_PREFIX);
      // Undeclared exception!
      try { 
        strBuilder1.replace((-109), (-109), "Sv");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -109
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      StrBuilder strBuilder0 = new StrBuilder("oYJaQ,Q`|@ic1):^LI\"");
      strBuilder0.lastIndexOf(strMatcher0, (-3194));
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("$$$$", (-1543), 58);
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
      StrBuilder strBuilder0 = new StrBuilder("X*y<Xm(E@6");
      StrBuilder strBuilder1 = strBuilder0.deleteAll("X*y<Xm(E@6");
      // Undeclared exception!
      try { 
        strBuilder1.validateRange((-1534), 22);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1534
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("2");
      strBuilder0.deleteAll("lFE95Oq8");
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-1534), 22);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1534
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@386b30f7");
      Properties properties0 = new Properties();
      StringBuffer stringBuffer0 = new StringBuffer();
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertNotNull(string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      properties0.put(strBuilder0, "org.apach.commons.lang3.txt.StrSubstitutor@386b30f7");
      assertEquals(85, strBuilder0.capacity());
      assertEquals(53, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder(44);
      // Undeclared exception!
      try { 
        strBuilder0.substring(44);
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
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@3dff5289");
      strBuilder0.deleteCharAt('$');
      assertEquals(52, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer("Invalid startIndex: ");
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(1614, 57, "user.language");
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
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("Invalid offset: ").when(strLookup0).toString();
      doReturn("Invalid offset: ").when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      StrMatcher strMatcher1 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("add() is unsupported").when(strMatcher1).toString();
      doReturn((-2086)).when(strMatcher1).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher1, '~');
      strSubstitutor0.setVariablePrefix('$');
      char[] charArray0 = new char[7];
      charArray0[1] = '$';
      // Undeclared exception!
      try { 
        strSubstitutor0.replace(charArray0);
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
      Integer integer0 = new Integer(2);
      StrSubstitutor.replace((Object) integer0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("2");
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      int int0 = strBuilder0.lastIndexOf((StrMatcher) strMatcher_TrimMatcher0);
      assertEquals(33, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer('$');
      StrSubstitutor.replace((Object) integer0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(23, 22);
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
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) null, properties0);
      StrBuilder strBuilder0 = new StrBuilder(2229);
      // Undeclared exception!
      try { 
        strBuilder0.replace((int) '$', (int) '$', "?]JfC");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      StrBuilder strBuilder0 = new StrBuilder("oYJaQ,Q`|@ic1):^LI\"");
      int int0 = strBuilder0.lastIndexOf(strMatcher0, (-3194));
      assertEquals(19, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals(51, strBuilder0.capacity());
      
      StringBuffer stringBuffer0 = new StringBuffer("$$$$");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("oYJaQ,Q`|@ic1):^LI\"");
      strBuilder0.appendSeparator("org.apache.commons.lang3.text.StrSubstitutor", 36);
      HashMap<String, Locale.FilteringMode> hashMap0 = new HashMap<String, Locale.FilteringMode>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>(hashMap0);
      StrLookup<Object> strLookup0 = StrLookup.mapLookup((Map<String, Object>) hashMap1);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals(63, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@386b30f7");
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) strBuilder0, properties0);
      properties0.put(strBuilder0, "org.apach.commons.lang3.txt.StrSubstitutor@386b30f7");
      assertEquals(53, strBuilder0.length());
      assertEquals(85, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor.replace((Object) strSubstitutor0, (Map<String, ?>) hashMap0, "e", "e");
      StrSubstitutor.replaceSystemProperties(hashMap0);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@4fca74c3");
      StringBuffer stringBuffer0 = new StringBuffer("Variable prefix must not be null!");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      
      Integer integer0 = new Integer(5);
      StrSubstitutor.replace((Object) "org.apache.commons.lang3.text.StrSubstitutor@4fca74c3", (Map<String, ?>) hashMap0);
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals(85, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor.replace((Object) strSubstitutor0, (Map<String, ?>) hashMap0, "e", "e");
      strSubstitutor0.setVariablePrefixMatcher(strSubstitutor0.DEFAULT_PREFIX);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@59117401");
      StrBuilder strBuilder1 = strBuilder0.deleteAll("e");
      Integer integer0 = new Integer(65);
      StrBuilder strBuilder2 = strBuilder1.appendFixedWidthPadRight((Object) integer0, 65, '$');
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) strBuilder1, properties0);
      StringBuffer stringBuffer0 = new StringBuffer(47);
      StrSubstitutor.replace((Object) strBuilder1, properties0);
      // Undeclared exception!
      try { 
        strBuilder2.replace(117, 47, "org.apache.commons.lang3.text.StrSubstitutor@59117401");
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("]xp\"H");
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(46, 46, "9");
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
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor.replace((Object) strSubstitutor0, (Map<String, ?>) hashMap0, "e", "e");
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@386b30f7");
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, "org.apach.commons.lang3.txt.StrSubstitutor@386b30f7");
      assertEquals(85, strBuilder0.capacity());
      assertEquals(53, strBuilder0.length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("06");
      Properties properties0 = new Properties();
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(34, strBuilder0.capacity());
      
      String string0 = StrSubstitutor.replace((Object) "06", properties0);
      assertEquals("06", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator((String) null, 1);
      // Undeclared exception!
      try { 
        strBuilder1.insert(16, 13);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 16
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor.replace((Object) strSubstitutor0, (Map<String, ?>) hashMap0, "e", "e");
      StrBuilder strBuilder0 = new StrBuilder(2229);
      // Undeclared exception!
      try { 
        strBuilder0.replace((int) '$', (int) '$', "?]JfC");
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
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@7726e2f5");
      // Undeclared exception!
      try { 
        strBuilder0.deleteCharAt((-3983));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3983
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("M$;%[m'>5Ua\"").when(strLookup0).toString();
      doReturn("M$;%[m'>5Ua\"").when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(strMatcher0).toString();
      StrMatcher strMatcher1 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("gpGsgLb:h8G<2", "M$;%[m'>5Ua\"", "gpGsgLb:h8G<2").when(strMatcher1).toString();
      doReturn(1589, 1589).when(strMatcher1).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher1, '~');
      StringBuffer stringBuffer0 = new StringBuffer(60);
      strSubstitutor0.replaceIn(stringBuffer0);
      strSubstitutor0.setVariablePrefix('$');
      char[] charArray0 = new char[7];
      charArray0[1] = '$';
      // Undeclared exception!
      try { 
        strSubstitutor0.replace(charArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Infinite loop in property interpolation of \u0000$\u0000\u0000\u0000\u0000\u0000: 
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor.replace((Object) strSubstitutor0, (Map<String, ?>) hashMap0, "e", "e");
      StrSubstitutor.replaceSystemProperties(hashMap0);
      strSubstitutor0.setVariablePrefixMatcher(strSubstitutor0.DEFAULT_PREFIX);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@209e9e10");
      StrBuilder strBuilder1 = strBuilder0.deleteAll("e");
      Properties properties0 = new Properties();
      strBuilder1.insert(21, (int) '$');
      assertEquals(51, strBuilder0.length());
      assertEquals(51, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Integer integer0 = new Integer(2);
      StrSubstitutor.replace((Object) integer0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("2");
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-1534), 22);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1534
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("fO");
      strBuilder0.insert(2, 628);
      strBuilder0.deleteAll("fO");
      assertEquals(3, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("fO");
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      assertEquals(34, strBuilder0.capacity());
      assertEquals("fO", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@4fca74c3");
      strSubstitutor0.replaceIn((StrBuilder) null);
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals(53, strBuilder0.length());
      assertEquals(85, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@55cc0eb1");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(53, strBuilder0.length());
      assertEquals(85, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      Function<Object, Object> function0 = Function.identity();
      hashMap0.computeIfAbsent(strBuilder0, function0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("mT<", 795, (-1039));
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
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@3dff5289");
      strSubstitutor0.replace((StringBuffer) null);
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals(85, strBuilder0.capacity());
      assertEquals(53, strBuilder0.length());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@4fca74c3");
      StringBuffer stringBuffer0 = new StringBuffer("Variable prefix must not be null!");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals(85, strBuilder0.capacity());
      
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals("Variable prefix must not be null!", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@55cc0eb1");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("D$", 3, (-1));
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
      StrBuilder strBuilder0 = new StrBuilder("fO");
      StrBuilder strBuilder1 = strBuilder0.insert(0, 628);
      strBuilder1.deleteAll("Variable prefix must not be null!");
      assertEquals(5, strBuilder0.size());
      assertEquals(5, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("oYJaQ,Q`|@ic1):^LI\"");
      strBuilder0.insert(2, 628);
      assertEquals(22, strBuilder0.length());
      
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace("org.apache.commons.lang3.text.StrSubstitutor", 2, 2);
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("2cdb", 1);
      strBuilder1.insert(1, 117);
      assertEquals(7, strBuilder1.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@2b1fe420");
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) strBuilder0, properties0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-185), 256, "org.apach.commons.lang3.txt.StrSubstitutor@2b1f420");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -185
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("]xp\"H");
      strBuilder0.appendSeparator("9", 46);
      // Undeclared exception!
      try { 
        strBuilder0.replace(46, 46, "9");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator((String) null, 1);
      // Undeclared exception!
      try { 
        strBuilder1.replace(3304, 115, "%?u");
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
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      StrBuilder strBuilder0 = new StrBuilder("oYJaQ,Q`|@ic1):^LI\"");
      int int0 = strBuilder0.lastIndexOf(strMatcher0, (-3194));
      assertEquals((-1), int0);
      
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("$$$$", (-3194));
      assertEquals(51, strBuilder1.capacity());
      assertEquals(19, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      StrBuilder strBuilder0 = new StrBuilder("oYJaQ,Q`|@ic1):^LI\"");
      int int0 = strBuilder0.lastIndexOf(strMatcher0, (-3194));
      assertEquals((-1), int0);
      
      StrBuilder strBuilder1 = strBuilder0.appendSeparator((String) null, (-3194));
      assertEquals(19, strBuilder1.length());
      assertEquals(51, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@7beab90d");
      strBuilder0.deleteAll("e");
      StrBuilder strBuilder1 = strBuilder0.append((-1083.010415535649));
      strBuilder1.deleteAll("org.apach.commons.lang3.txt.StrSubstitutor@7bab90d-1083.010415535649");
      // Undeclared exception!
      try { 
        strBuilder0.replace(9, 117, "{}");
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
      StrBuilder strBuilder0 = new StrBuilder("2");
      strBuilder0.deleteAll("lFE95Oq8");
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(33, Integer.MAX_VALUE);
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
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      StrBuilder strBuilder0 = new StrBuilder("oYJaQ,Q`|@ic1):^LI\"");
      int int0 = strBuilder0.lastIndexOf(strMatcher0, (-3194));
      assertEquals(19, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals(51, strBuilder0.capacity());
      
      StringBuffer stringBuffer0 = new StringBuffer("$$$$");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals("$$$$", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("e");
      strBuilder0.appendSeparator("{}");
      assertEquals(3, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("06");
      StrBuilder strBuilder1 = strBuilder0.deleteAll("e");
      int int0 = strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(34, strBuilder1.capacity());
      assertEquals(2, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("06");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("org.apache.commons.lang3.text.StrSubstitutor@2f47bfbe", (-1), 35);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("2");
      StrBuilder strBuilder1 = strBuilder0.deleteAll("lFE95Oq8");
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      int int0 = strBuilder1.lastIndexOf((StrMatcher) strMatcher_TrimMatcher0);
      assertEquals(1, strBuilder1.length());
      assertEquals(33, strBuilder1.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@77515f9");
      StrBuilder strBuilder1 = strBuilder0.deleteAll("X~1^Je");
      strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals(52, strBuilder1.length());
      assertEquals(84, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@209e9e10");
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) strBuilder0, properties0);
      strBuilder0.insert(21, (int) '$');
      assertEquals(55, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.setNullText("7=qKyDo-#rJ");
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test57()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("2cdb", 1);
      strBuilder1.insert(1, 117);
      String string0 = StrSubstitutor.replace((Object) "g.", (Properties) null);
      assertEquals("g.", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("oYJaQ,Q`|@ic1):^LI\"");
      strBuilder0.appendSeparator("2cdb", (-3194));
      strBuilder0.insert(2, 628);
      assertEquals(22, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace("{n}JE4xU;OJ", 2, 2);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(23, 22);
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
      StrBuilder strBuilder0 = new StrBuilder("oYJaQ,Q`|@ic1):^LI\"");
      strBuilder0.appendSeparator("oYJaQ,Q`|@ic1):^LI\"", (-3194));
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      int int0 = strBuilder0.lastIndexOf(strMatcher0);
      assertEquals(19, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals(51, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@386b30f7");
      StrBuilder strBuilder1 = strBuilder0.deleteAll("e");
      Properties properties0 = new Properties();
      properties0.put(strBuilder1, "org.apach.commons.lang3.txt.StrSubstitutor@386b30f7");
      assertEquals(51, strBuilder0.length());
      assertEquals(51, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("oYJaQ,Q`|@ic1):^LI\"");
      Properties properties0 = new Properties();
      strBuilder0.deleteAll("MAP_EXTENDED_RANGES");
      Integer integer0 = new Integer(4);
      properties0.put(strBuilder0, integer0);
      assertEquals(19, strBuilder0.size());
      assertEquals(51, strBuilder0.capacity());
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test63()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String string0 = StrSubstitutor.replace((Object) "8h~y[lFvMm&Q=M5(t-", (Map<String, ?>) hashMap0, "8h~y[lFvMm&Q=M5(t-", "8h~y[lFvMm&Q=M5(t-");
      assertEquals("8h~y[lFvMm&Q=M5(t-", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@55cc0eb1");
      String string0 = strSubstitutor0.replace("iFO@K4sVB^/)", 3, 3);
      assertEquals("@K4", string0);
      assertNotNull(string0);
      
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(53, strBuilder0.length());
      assertEquals(85, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      StrBuilder strBuilder0 = new StrBuilder("oYJaQ,Q`|@ic1):^LI\"");
      strBuilder0.lastIndexOf(strMatcher0, (-3194));
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("java.awt.headless", 58, 46);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }
}
