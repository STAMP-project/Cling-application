/*

 * Tue Mar 03 16:44:08 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
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
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-1298), (-1298));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1298
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "0](mb6&e", "`$#N", 'e');
      StringBuffer stringBuffer0 = new StringBuffer(0);
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.substring((-449), 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -449
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "java.endorsed.dirs", "", '>');
      StrBuilder strBuilder0 = new StrBuilder("java.endorsed.dirs");
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertFalse(boolean0);
      
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-3829));
      assertEquals(50, strBuilder0.capacity());
      assertEquals('>', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
      assertEquals(18, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "0](mb6&e", "`$#N", 'e');
      StrBuilder strBuilder0 = new StrBuilder("6O2");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-3829));
      assertEquals((-1), int0);
      
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals(3, strBuilder0.size());
      assertEquals('e', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      assertEquals(35, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertFalse(boolean0);
      
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor1 = (StrSubstitutor)hashMap0.getOrDefault(strBuilder0, strSubstitutor0);
      assertEquals('$', strSubstitutor1.getEscapeChar());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.replace((Object) strBuilder0, (Object) hashMap0);
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(0, strBuilder0.length());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor1 = (StrSubstitutor)hashMap0.getOrDefault(strBuilder0, strSubstitutor0);
      assertEquals('$', strSubstitutor1.getEscapeChar());
      
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("KrT!j*X#S')]@", (-2060));
      assertEquals(32, strBuilder1.capacity());
      assertTrue(strBuilder1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder("a.lang.Object@4b97aa83");
      // Undeclared exception!
      try { 
        strBuilder0.validateIndex(2870);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 2870
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder(1195);
      // Undeclared exception!
      try { 
        strBuilder0.validateIndex(166);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 166
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "java_y.class.version", (String) null).when(strMatcher0).toString();
      doReturn(2356, 3, (-1203), (-1), 9).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, 'e');
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@171f1e29");
      strSubstitutor0.replaceIn(strBuilder0);
      strSubstitutor0.setVariableSuffix('e');
      strSubstitutor0.replaceIn(strBuilder0);
      strBuilder0.substring(9, 2182);
      assertEquals(23, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "java_y.class.version", (String) null).when(strMatcher0).toString();
      doReturn(2356, 3, 3).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, 'e');
      StrBuilder strBuilder0 = new StrBuilder("Db&%PbJl`n=UmjE+\"");
      strSubstitutor0.replaceIn(strBuilder0);
      strSubstitutor0.setVariableSuffix('U');
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.substring(2, (-1));
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
      StrBuilder strBuilder0 = new StrBuilder("KrT!j*X#S')]@");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 36);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      // Undeclared exception!
      try { 
        StrSubstitutor.replace((Object) "KrT!j*X#S')]@", (Map<String, Integer>) hashMap0, "ct@559877f", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable suffix must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('o');
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.replace((Object) strBuilder0, (Object) hashMap0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
      
      strSubstitutor1.replace("java.specification.name");
      assertEquals('$', strSubstitutor1.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("KrT!j*X#S')]@");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 36);
      strBuilder0.appendSeparator('S', 7);
      assertEquals(14, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("KrT!j*X#S')]@");
      StrBuilder strBuilder1 = new StrBuilder((String) null);
      assertEquals(32, strBuilder1.capacity());
      
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 36);
      assertEquals(13, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(45, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "0](mb6&e", "`$#N", 'e');
      StrBuilder strBuilder0 = new StrBuilder("o");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-3829));
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("o", (-3980), 2);
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
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder("java.endorsed.dirs");
      strSubstitutor0.replaceIn((StrBuilder) null);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-3115), 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3115
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.replace((Object) strBuilder0, (Object) hashMap0);
      assertEquals(32, strBuilder0.capacity());
      
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder(32);
      hashMap0.remove((Object) strBuilder0, (Object) "ct@76adca");
      assertEquals(0, strBuilder0.length());
      assertEquals(32, strBuilder0.capacity());
      
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      // Undeclared exception!
      try { 
        strBuilder0.substring(23, 5);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.vm.name");
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("ct@77c9b4");
      // Undeclared exception!
      try { 
        strBuilder0.substring(36, 36);
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
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrBuilder strBuilder0 = new StrBuilder(32);
      hashMap0.remove((Object) strBuilder0, (Object) "ct@76adca");
      Object object0 = new Object();
      String string0 = StrSubstitutor.replace(object0, (Properties) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-1012));
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
      
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('$', (-1865));
      assertEquals(32, strBuilder1.capacity());
      assertEquals(0, strBuilder1.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("5p");
      // Undeclared exception!
      try { 
        strBuilder0.substring(2586, 31);
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
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "n$?vo57!pyAhGqL", "`$#N", 'y');
      StrBuilder strBuilder0 = new StrBuilder("n$?vo57!pyAhGqL");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-3829));
      assertEquals(47, strBuilder0.capacity());
      assertEquals(15, strBuilder0.length());
      
      StringBuffer stringBuffer0 = new StringBuffer("user.dir");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('y', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) null, properties0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring(86, (-2997));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.replace((Object) strBuilder0, (Object) hashMap0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
      
      String string0 = StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "java_y.class.version", (String) null, "1l<|flM2d~y(:").when(strMatcher0).toString();
      doReturn(2356, 3, 3, 2, 3).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, 'e');
      StrBuilder strBuilder0 = new StrBuilder("1l<|flM2d~y(:");
      strSubstitutor0.replaceIn(strBuilder0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@5b1a6396");
      strSubstitutor0.replaceIn(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.substring(10, (-1));
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
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replaceIn((StrBuilder) null);
      // Undeclared exception!
      try { 
        strBuilder0.substring(23, 5);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) strLookup0, properties0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "org.apache.commons.lang3.text.StrLookup$MapStrLookup@22d72c99", "org.apache.commons.lang3.text.StrLookup$MapStrLookup@22d72c99");
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrLookup$MapStrLookup@22d72c99");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 686);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(93, strBuilder0.capacity());
      assertEquals(61, strBuilder0.length());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.endorsed.dirs");
      StrBuilder strBuilder1 = strBuilder0.setCharAt(9, '2');
      assertEquals(50, strBuilder1.capacity());
      assertEquals(18, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("5p");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("java.lang.Object@27d80a6a", 31);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.getOrDefault(strBuilder1, "awt.toolkit");
      assertEquals(27, strBuilder0.size());
      assertEquals(27, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor1 = (StrSubstitutor)hashMap0.getOrDefault(strBuilder0, strSubstitutor0);
      assertEquals('$', strSubstitutor1.getEscapeChar());
      
      StrBuilder strBuilder1 = strBuilder0.appendSeparator((String) null, (-2060));
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.deleteCharAt((-1354));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1354
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replaceIn(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.substring(57, 57);
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
      StrBuilder strBuilder0 = new StrBuilder("5p");
      // Undeclared exception!
      try { 
        strBuilder0.substring((-1256), 23);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1256
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      strBuilder0.setLength(2919);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.vm.version");
      strBuilder0.substring(9, 32);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("a.lang.Object@4cdfcc59", 32, 2182);
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
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "0](mb6&e", "`$#N", 'e');
      strSubstitutor0.replace("", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.substring((-449), 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -449
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("d");
      Reader reader0 = strBuilder0.asReader();
      Properties properties0 = new Properties();
      properties0.load(reader0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("a.lang.Object@4cdfcc59", 32, 2182);
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
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder(32);
      hashMap0.remove((Object) strBuilder0, (Object) "ct@76adca");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("Mac OS X", 1597, 100);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.SystemUtils");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('R', 34);
      // Undeclared exception!
      try { 
        strBuilder1.substring((-774), 22);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -774
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("5p");
      strBuilder0.appendSeparator('N', (-1247));
      // Undeclared exception!
      try { 
        strBuilder0.substring((-1256), 23);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1256
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("${");
      Reader reader0 = strBuilder0.asReader();
      Properties properties0 = new Properties();
      properties0.load(reader0);
      assertEquals(1, properties0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder("KrT!j*X#S')]@");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 36);
      assertEquals(13, strBuilder0.length());
      assertEquals(45, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "0](mb6&e", "`$#N", 'e');
      StrBuilder strBuilder0 = new StrBuilder("o");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (int) '$');
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("5.1", (int) 'e', 103);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder(32);
      hashMap0.remove((Object) strBuilder0, (Object) "ct@76adca");
      assertEquals(32, strBuilder0.capacity());
      
      StringBuffer stringBuffer0 = new StringBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('$');
      strSubstitutor0.setEnableSubstitutionInVariables(true);
      char[] charArray0 = new char[6];
      charArray0[2] = '$';
      String string0 = strSubstitutor1.replace(charArray0);
      assertEquals('$', strSubstitutor1.getEscapeChar());
      assertEquals("\u0000\u0000$\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Properties properties0 = new Properties();
      StringReader stringReader0 = new StringReader("a.lang.Object@357fec4b");
      properties0.load((Reader) stringReader0);
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      StrSubstitutor.replace((Object) locale_Category0, properties0);
      StrBuilder strBuilder0 = new StrBuilder("4mxQjY1)_1M{l");
      // Undeclared exception!
      try { 
        strBuilder0.substring((-4537), 102);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -4537
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("ava.lang.Obj");
      strBuilder0.appendSeparator('$', 398);
      strBuilder0.insert(1, "DISPLAY");
      assertEquals(20, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      strBuilder0.appendSeparator('$', (-1354));
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        strBuilder0.insert(48, charArray0, 0, 48);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 48
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.endorsed.dirs");
      Reader reader0 = strBuilder0.asReader();
      Properties properties0 = new Properties();
      properties0.load(reader0);
      Object object0 = new Object();
      StrSubstitutor.replace(object0, properties0);
      // Undeclared exception!
      try { 
        strBuilder0.substring((int) 'G', 31);
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
      StrBuilder strBuilder0 = new StrBuilder("5p");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("O1b=9bE", 31);
      // Undeclared exception!
      try { 
        strBuilder1.substring(2586, 31);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@3a4d20e8");
      strBuilder0.appendSeparator((String) null, 31);
      // Undeclared exception!
      try { 
        strBuilder0.substring(197, 2356);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "java_y.class.version", (String) null, "1l<|flM2d~y(:").when(strMatcher0).toString();
      doReturn(2356, 3, 3, 2, 3).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, 'e');
      StrBuilder strBuilder0 = new StrBuilder("1l<|flM2d~y(:");
      Reader reader0 = strBuilder0.asReader();
      strSubstitutor0.replaceIn(strBuilder0);
      Properties properties0 = new Properties();
      properties0.load(reader0);
      assertEquals(1, properties0.size());
      
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@d8d1360");
      strSubstitutor0.setEnableSubstitutionInVariables(true);
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateIndex(36);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 36
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      // Undeclared exception!
      try { 
        strBuilder0.charAt((-2852));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2852
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "java_y.class.version").when(strMatcher0).toString();
      doReturn(2356).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, 'e');
      StrBuilder strBuilder0 = new StrBuilder("1l<|flM2d~y(:");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals(46, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals(14, strBuilder0.length());
      
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@74fffede");
      strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('e', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('e');
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@54f8c410");
      boolean boolean0 = strSubstitutor1.replaceIn(strBuilder0);
      assertEquals('$', strSubstitutor1.getEscapeChar());
      assertFalse(boolean0);
      
      strBuilder0.validateIndex(1);
      assertEquals(57, strBuilder0.capacity());
      assertEquals(25, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder('e');
      StrBuilder strBuilder1 = strBuilder0.appendln((String) null);
      strBuilder1.replaceAll("8G<'C", "Invalid offset: ");
      // Undeclared exception!
      try { 
        strBuilder1.substring(15, (-883));
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
      StrBuilder strBuilder0 = new StrBuilder();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-1012));
      assertEquals(32, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, 'e');
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@3f8df0b7");
      strBuilder0.substring(9, 2182);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("a.lang.Object@4358ba76", 3, 2356);
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
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "0](mb6&e", "`$#N", 'e');
      String string0 = strSubstitutor0.replace("", 0, 0);
      assertNotNull(string0);
      assertEquals('e', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder();
      String string1 = strBuilder0.substring(0, 1020);
      assertEquals(32, strBuilder0.capacity());
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "java_y.class.version").when(strMatcher0).toString();
      doReturn(2356, 3).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, 'e');
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariableSuffix('$');
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@3f8df0b7");
      strSubstitutor1.replaceIn(strBuilder0);
      Reader reader0 = strBuilder0.asReader();
      strSubstitutor1.replaceIn(strBuilder0);
      Properties properties0 = new Properties();
      properties0.load(reader0);
      assertEquals(1, properties0.size());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("n$?vo57!pyAhGqL");
      strBuilder0.appendSeparator("0](mb6&e", "0](mb6&e");
      assertEquals(23, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, 'e');
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@3f8df0b7");
      Reader reader0 = strBuilder0.asReader();
      Properties properties0 = new Properties();
      properties0.load(reader0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("a.lang.Object@4358ba76", 3, 2356);
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      properties0.replace((Object) strBuilder0, (Object) hashMap0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("org.apache.commons.lang3.text.StrSubstitutor@5ec62d17", 32, 32);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("5p");
      strBuilder0.appendSeparator("java.lang.Object@42033f89", 31);
      Reader reader0 = strBuilder0.asReader();
      Properties properties0 = new Properties();
      properties0.load(reader0);
      assertEquals(27, strBuilder0.length());
      assertEquals(34, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "java_y.class.version", (String) null, "1l<|flM2d~y(:").when(strMatcher0).toString();
      doReturn(2356, 3, 3, 2, 3).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, 'e');
      StrBuilder strBuilder0 = new StrBuilder("1l<|flM2d~y(:");
      strSubstitutor0.replaceIn(strBuilder0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@2dd33530");
      strSubstitutor0.replaceIn(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.validateIndex(2356);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 2356
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "0](mb6&e", "`$#N", 'e');
      StrBuilder strBuilder0 = new StrBuilder("o");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (int) '$');
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("<*]|jToB=:zq=:}+", (-1), (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("java.endorsed.dirs");
      strSubstitutor0.replaceIn((StrBuilder) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      Reader reader0 = strBuilder0.asReader();
      Properties properties0 = new Properties();
      properties0.load(reader0);
      assertEquals(50, strBuilder0.capacity());
      assertEquals(18, strBuilder0.length());
      assertEquals(18, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "java_y.class.version", (String) null, "1l<|flM2d~y(:").when(strMatcher0).toString();
      doReturn(2356, 3, 3, 2, 3).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, 'e');
      StrBuilder strBuilder0 = new StrBuilder("1l<|flM2d~y(:");
      Reader reader0 = strBuilder0.asReader();
      strSubstitutor0.replaceIn(strBuilder0);
      Properties properties0 = new Properties();
      properties0.load(reader0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@74fffede");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals(24, stringBuffer0.length());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@20c44768");
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring((-3115), (-3115));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3115
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Object object0 = new Object();
      StrBuilder strBuilder0 = new StrBuilder("ava.lang.Obj");
      strBuilder0.insert(1, "DISPLAY");
      Properties properties0 = new Properties();
      String string0 = StrSubstitutor.replace(object0, properties0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.endorsed.dirs");
      Reader reader0 = strBuilder0.asReader();
      Properties properties0 = new Properties();
      properties0.load(reader0);
      strBuilder0.appendSeparator('$', 23);
      assertEquals(19, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('N', (-1247));
      assertEquals(0, strBuilder1.size());
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.setNullText("org.apache.commons.lang3.text.StrTokenizer");
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "0](mb6&e", "`$#N", 'e');
      StrBuilder strBuilder0 = new StrBuilder("o");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-3829));
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("5.1", 256, (-3829));
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
      StrBuilder strBuilder0 = new StrBuilder("{}");
      strBuilder0.appendSeparator("2949fals", (-3964));
      strBuilder0.validateIndex(1);
      assertEquals(34, strBuilder0.capacity());
      assertEquals(2, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "0](mb6&e", "`$#N", 'e');
      strSubstitutor0.replace("", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring(86, (-2997));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Properties properties0 = new Properties();
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder("a.lang.Object@4b97aa83");
      Reader reader0 = strBuilder0.asReader();
      properties0.load(reader0);
      assertFalse(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "java.endorsed.dirs", "", '>');
      StrBuilder strBuilder0 = new StrBuilder("java.endorsed.dirs");
      Reader reader0 = strBuilder0.asReader();
      Properties properties0 = new Properties();
      properties0.load(reader0);
      assertEquals(1, properties0.size());
      
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("java.endorsed.dirs", string0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "java_y.class.version", (String) null, "1l<|flM2d~y(:").when(strMatcher0).toString();
      doReturn(2356, 3, 3, 2, 3).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, 'e');
      StrBuilder strBuilder0 = new StrBuilder("1l<|flM2d~y(:");
      strSubstitutor0.replaceIn(strBuilder0);
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@74fffede");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals(24, stringBuffer0.length());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "java_y.class.version").when(strMatcher0).toString();
      doReturn(2356).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, 'e');
      StrBuilder strBuilder0 = new StrBuilder("1l<|flM2d~y(:");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals(14, strBuilder0.size());
      
      String string0 = strSubstitutor0.replace("5.*Q", 2, 2);
      assertEquals('e', strSubstitutor0.getEscapeChar());
      assertEquals("*Q", string0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@1ee66306");
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, 48);
      assertEquals(25, strBuilder0.length());
      assertEquals(57, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("5p");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("java.lang.Object@3cdca478", 31);
      // Undeclared exception!
      try { 
        strBuilder1.substring((-1256), 23);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1256
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("pv'{?ujy|5kcQ*iu2");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('$', 2008);
      // Undeclared exception!
      try { 
        strBuilder1.substring(107, 21);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      strBuilder0.appendSeparator('$', (-1354));
      // Undeclared exception!
      try { 
        strBuilder0.substring(57, 57);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "n$?vo57!pyAhGqL", "`$#N", 'y');
      StrBuilder strBuilder0 = new StrBuilder("n$?vo57!pyAhGqL");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, (-3829));
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("!H>/<yhb1f`iN6+MM!", 2, 479);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "java_y.class.version", (String) null).when(strMatcher0).toString();
      doReturn(2356, 3, (-1203), 0, 0).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, 'e');
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@6361f627");
      strSubstitutor0.replaceIn(strBuilder0);
      strSubstitutor0.setVariableSuffix('e');
      strSubstitutor0.replaceIn(strBuilder0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "java_y.class.version").when(strMatcher0).toString();
      doReturn(2356).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null, strMatcher0, strMatcher0, 'e');
      StrBuilder strBuilder0 = new StrBuilder("1l<|flM2d~y(:");
      Reader reader0 = strBuilder0.asReader();
      Properties properties0 = new Properties();
      properties0.load(reader0);
      assertEquals(1, properties0.size());
      
      String string0 = strSubstitutor0.replace("5.*Q", 2, 2);
      assertEquals("*Q", string0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "java.endorsed.dirs", "", '>');
      StrBuilder strBuilder0 = new StrBuilder("java.endorsed.dirs");
      Reader reader0 = strBuilder0.asReader();
      Properties properties0 = new Properties();
      properties0.load(reader0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("org.apache.commons.lang3.text.StrSubstitutor@14f9c442", (-728), (int) '>');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("5p");
      strBuilder0.deleteAll("BWRlYCLd");
      Reader reader0 = strBuilder0.asReader();
      Properties properties0 = new Properties();
      properties0.load(reader0);
      assertFalse(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "0](mb6&e", "`$#N", 'e');
      StrBuilder strBuilder0 = new StrBuilder("o");
      strBuilder0.validateIndex(1);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("org.apache.commons.lang3.text.StrLookup$MapStrLookup@22d72c99", 3, (-32));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("ava.lang.Obj");
      strBuilder0.insert(1, "DISPLAY");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("}", (-1291), (-3753));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }
}
