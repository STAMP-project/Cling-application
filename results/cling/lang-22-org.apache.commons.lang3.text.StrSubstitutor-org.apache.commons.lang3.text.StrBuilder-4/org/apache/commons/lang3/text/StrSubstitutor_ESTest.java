/*

 * Tue Mar 03 16:43:26 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.ObjectInputStream;
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
        strBuilder0.delete((-1868), 667);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1868
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder();
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.remove((Object) strBuilder0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("SrTokenizer[not tokenized yet]");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((StrLookup<?>) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.remove((Object) strBuilder0);
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      assertEquals(30, strBuilder0.length());
      assertEquals(62, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator("HP-UX", (-956));
      // Undeclared exception!
      try { 
        strBuilder0.delete(48, 85);
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
      StrBuilder strBuilder0 = new StrBuilder("i2xr0=U/");
      strBuilder0.replaceFirst("K", (String) null);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1007), (-578), "22");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1007
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor.replace(object0, (Map<String, ?>) hashMap0, "6", "6");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@79e587");
      // Undeclared exception!
      try { 
        strBuilder0.delete(24, 24);
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
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = new StrBuilder("Invalid starMIndex: ");
      strBuilder1.replaceFirst("java.vm.info", "HP-UX");
      // Undeclared exception!
      try { 
        strBuilder0.delete(57, (-90));
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
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = new StrBuilder("Invalid starMIndex: ");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      strBuilder0.appendSeparator('u', 33);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Invalid starMIndex: ");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(52, strBuilder0.capacity());
      assertEquals(20, strBuilder0.length());
      
      StrBuilder strBuilder1 = new StrBuilder((String) null);
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.delete((-4552), (-938));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -4552
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.delete((-1868), 667);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1868
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("awt.toolkit");
      StrBuilder strBuilder1 = strBuilder0.replaceFirst("java.lang.Object@cff0b5f", "awt.toolkit");
      // Undeclared exception!
      try { 
        strBuilder1.delete((-1), 11);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Invalid starMIndex: ");
      strBuilder0.replaceFirst("java.vm.info", "HP-UX");
      // Undeclared exception!
      try { 
        strBuilder0.delete((-3261), 38);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3261
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.remove((Object) strBuilder0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.remove((Object) strBuilder0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.delete(3, (-2959));
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
      StrLookup<InputStream> strLookup0 = (StrLookup<InputStream>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(strLookup0).toString();
      doReturn((String) null, (String) null).when(strLookup0).lookup(anyString());
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_TrimMatcher0, strMatcher_TrimMatcher0, 'h');
      char[] charArray0 = new char[6];
      charArray0[0] = 'h';
      String string0 = strSubstitutor0.replace(charArray0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("i2}r0=U/");
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder1 = strBuilder0.delete(0, 12);
      assertEquals(41, strBuilder1.capacity());
      assertTrue(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("TqS\bGwhxc3o ");
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.delete(34, 57);
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
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      // Undeclared exception!
      try { 
        strBuilder0.delete(2544, 46);
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
      StrBuilder strBuilder0 = new StrBuilder(":<Sa)'Y!{W>-) JCo8");
      strBuilder0.replaceFirst(":<Sa)'Y!{W>-) JCo8", ":<Sa)'Y!{W>-) JCo8");
      // Undeclared exception!
      try { 
        strBuilder0.insert(101, (-1063));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 101
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Invalid starMIndex: ");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("java.vm.info", (-1));
      assertEquals(52, strBuilder1.capacity());
      assertEquals(20, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "HNEJ}!Zc,/l&iw39I?", "HNEJ}!Zc,/l&iw39I?", '[');
      Properties properties0 = new Properties();
      properties0.put("java.lang.Object@1fa3664c", strSubstitutor0);
      StrSubstitutor.replace((Object) hashMap0, properties0);
      StrBuilder strBuilder0 = new StrBuilder((-630));
      // Undeclared exception!
      try { 
        strBuilder0.delete(1, 2861);
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
  public void test23()  throws Throwable  {
      Properties properties0 = new Properties();
      String string0 = StrSubstitutor.replace((Object) "SrTokenizer[not tokenized yet]", properties0);
      assertEquals("SrTokenizer[not tokenized yet]", string0);
      
      StrBuilder strBuilder0 = new StrBuilder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.remove((Object) strBuilder0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "Dh0]JD_6h-??=/V`Q", "Dh0]JD_6h-??=/V`Q", ',');
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      // Undeclared exception!
      try { 
        strBuilder0.delete(7, 2055);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("TqS\bGwhxc3o ");
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.delete(34, 57);
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
  public void test26()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "HNEJ}!Zc,/l&iw39I?", "HNEJ}!Zc,/l&iw39I?", '[');
      Properties properties0 = new Properties();
      properties0.put("java.lang.Object@174070b8", strSubstitutor0);
      String string0 = StrSubstitutor.replace((Object) hashMap0, properties0);
      assertEquals("{}", string0);
      
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@174070b8");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals('[', strSubstitutor0.getEscapeChar());
      assertEquals(57, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("i2}r0=U/");
      strBuilder0.appendSeparator((String) null, 115);
      strBuilder0.insert(0, 1663.521);
      assertEquals(17, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "HNEJ}!Zc,/l&iw39I?", "HNEJ}!Zc,/l&iw39I?", '[');
      StringBuffer stringBuffer0 = new StringBuffer("HNEJ}!Zc,/l&iw39I?");
      stringBuffer0.append("HNEJ}!Zc,/l&iw39I?");
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder((-630));
      // Undeclared exception!
      try { 
        strBuilder0.delete(1, 2861);
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
      HashMap<String, Locale.FilteringMode> hashMap0 = new HashMap<String, Locale.FilteringMode>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Locale.FilteringMode>) hashMap0, "java.lang.Object@9bdf5f2", "java.lang.Object@9bdf5f2");
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@9bdf5f2");
      strBuilder0.insert(9, ")ZRVF-E>w[fWqkA");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace(")ZRVF-E>w[fWqkA", 9, 15);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "HNEJ}!Zc,/l&iw39I?", "HNEJ}!Zc,/l&iw39I?", '[');
      Properties properties0 = new Properties();
      properties0.put("java.lang.Object@174070b8", strSubstitutor0);
      StrSubstitutor.replace((Object) hashMap0, properties0);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@174070b8");
      // Undeclared exception!
      try { 
        strBuilder0.insert(116, 2270.5109);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 116
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Integer integer0 = new Integer((-2257));
      StrSubstitutor.replace((Object) integer0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder('2');
      // Undeclared exception!
      try { 
        strBuilder0.delete((-2257), 116);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2257
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "Dh0]JD_6h-??=/V`Q", "Dh0]JD_6h-??=/V`Q", ',');
      strSubstitutor0.replace("Dh0]JD_6h-??=/V`Q", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.delete((-1857), 115);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1857
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(1036);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("9", 1036);
      strBuilder1.insert(0, 0.0);
      assertEquals(4, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "java.lang.Object@8df64c0", "java.lang.Object@8df64c0", '[');
      StrBuilder strBuilder0 = new StrBuilder("f0f");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 0);
      assertEquals((-1), int0);
      
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals('[', strSubstitutor0.getEscapeChar());
      assertEquals(35, strBuilder0.capacity());
      assertEquals(3, strBuilder0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.remove((Object) strBuilder0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("@n2AvZqmW5:%A9k", 2126, 1821);
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
      StrBuilder strBuilder0 = new StrBuilder(1166);
      strBuilder0.appendSeparator('d', 3075);
      // Undeclared exception!
      try { 
        strBuilder0.delete((-2228), 1101);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2228
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-3091));
      strBuilder0.appendSeparator('W', (-3091));
      // Undeclared exception!
      try { 
        strBuilder0.delete((-3091), (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3091
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "java.lang.Object@76459504", "java.lang.Object@76459504", '[');
      StrBuilder strBuilder0 = new StrBuilder(";");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 73);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("qCi|-uh{BLX", 73, 39);
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
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0);
      StrBuilder strBuilder0 = new StrBuilder();
      StringBuffer stringBuffer0 = new StringBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.remove((Object) strBuilder0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("i2}r0=U/");
      strSubstitutor0.replace((StringBuffer) null);
      strBuilder0.insert(0, 1663.521);
      assertEquals(17, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.insert(0, (double) 0);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "HNEJ}!Zc,/l&iw39I?", "HNEJ}!Zc,/l&iw39I?", 'W');
      Properties properties0 = new Properties();
      properties0.put("java.lang.Object@22767e9a", strSubstitutor0);
      StrSubstitutor.replace((Object) hashMap0, properties0);
      StrBuilder strBuilder0 = new StrBuilder((-3091));
      // Undeclared exception!
      try { 
        strBuilder0.delete((-3091), (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3091
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator("SrTokenizer[not tokenized yet]", 570);
      // Undeclared exception!
      try { 
        strBuilder0.delete(2544, 46);
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
      strBuilder0.appendSeparator((String) null, 5);
      // Undeclared exception!
      try { 
        strBuilder0.delete(2053, 59);
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
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.charAt((-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Invalid starMIndex: ");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals(20, strBuilder0.length());
      assertEquals(52, strBuilder0.capacity());
      assertEquals((-1), int0);
      
      StringBuffer stringBuffer0 = new StringBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.setNullText((String) null);
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object object0 = new Object();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor.replace(object0, (Map<String, ?>) hashMap0, "6", "6");
      StrBuilder strBuilder0 = new StrBuilder(1036);
      ClassLoader.getSystemClassLoader();
      strBuilder0.insert(0, 0.0);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("TqS\bGwhxc3o ");
      strBuilder0.replaceFirst("4", "awt.toolkit");
      // Undeclared exception!
      try { 
        strBuilder0.delete(34, 57);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("awt.toolkit");
      StrBuilder strBuilder1 = strBuilder0.replaceFirst("java.lang.Object@10f7639e", "awt.toolkit");
      // Undeclared exception!
      try { 
        strBuilder1.delete(1426, 10);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "java.lang.Object@8df64c0", "java.lang.Object@8df64c0", '[');
      StrBuilder strBuilder0 = new StrBuilder("f0f");
      StringBuffer stringBuffer0 = new StringBuffer();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 0);
      assertEquals((-1), int0);
      assertEquals(3, strBuilder0.length());
      assertEquals(35, strBuilder0.capacity());
      
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('[', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) null, "Dh0]JD_6h-??=/V`Q", "Dh0]JD_6h-??=/V`Q", ',');
      strSubstitutor0.replace("Dh0]JD_6h-??=/V`Q", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring(47, 17);
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
      StrBuilder strBuilder0 = new StrBuilder(":<Sa)'Y!{W>-) JCo8");
      strBuilder0.appendSeparator(":<Sa)'Y!{W>-) JCo8");
      assertEquals(36, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("i2}r0=U/");
      StrBuilder strBuilder1 = strBuilder0.replaceFirst("c", (String) null);
      int int0 = strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, 1985);
      assertEquals(9, strBuilder1.length());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(41, strBuilder1.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "HNEJ}!Zc,/l&iw39I?", "HNEJ}!Zc,/l&iw39I?", '[');
      StringBuffer stringBuffer0 = new StringBuffer("HNEJ}!Zc,/l&iw39I?");
      stringBuffer0.append("HNEJ}!Zc,/l&iw39I?");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      
      StrBuilder strBuilder0 = new StrBuilder();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-1864));
      assertEquals(0, strBuilder0.length());
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals('[', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Invalid starMIndex: ");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("12", (-1), 1755);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Invalid starMIndex: ");
      strBuilder0.replaceFirst("java.vm.info", "HP-UX");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals(52, strBuilder0.capacity());
      assertEquals(20, strBuilder0.size());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@1b5ed0d8");
      strBuilder0.insert(9, ")ZRVF-E>w[fWqkA");
      assertEquals(40, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) hashMap0, properties0);
      StrBuilder strBuilder0 = new StrBuilder("@'wom=$LUshnD,9");
      strBuilder0.insert(4, "yr#rHAmr^Grxl");
      assertEquals(29, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "HNEJ}!Zc,/l&iw39I?", "HNEJ}!Zc,/l&iw39I?", '[');
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-1864));
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("c", 37, 37);
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
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("HP-UX", (-956));
      // Undeclared exception!
      try { 
        strBuilder1.insert(5, (-1178.8911777));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 5
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "HNEJ}!Zc,/l&iw39I?", "HNEJ}!Zc,/l&iw39I?", '[');
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@174070b8");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      strBuilder0.appendSeparator("Infinite loop in property interpolation of ", 36);
      assertEquals(68, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("awt.toolkit");
      StrBuilder strBuilder1 = strBuilder0.replaceFirst("java.lang.Object@43c99530", "awt.toolkit");
      properties0.put(strBuilder1, "java.lang.Object@43c99530");
      assertEquals(43, strBuilder1.capacity());
      assertEquals(11, strBuilder1.length());
      assertEquals(11, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "java.lang.Object@76459504", "java.lang.Object@76459504", '[');
      StrBuilder strBuilder0 = new StrBuilder(";");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 73);
      assertEquals(1, strBuilder0.length());
      assertEquals(33, strBuilder0.capacity());
      assertEquals('[', strSubstitutor0.getEscapeChar());
      
      HashMap<String, ObjectInputStream> hashMap1 = new HashMap<String, ObjectInputStream>();
      StrSubstitutor strSubstitutor1 = new StrSubstitutor((Map<String, ObjectInputStream>) hashMap1, ";", "{}", '$');
      strSubstitutor1.replace("Op;JlOZXzTUWno*L");
      assertEquals('$', strSubstitutor1.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "java.lang.Object@8df64c0", "java.lang.Object@8df64c0", '[');
      StrBuilder strBuilder0 = new StrBuilder("f0f");
      String string0 = strSubstitutor0.replace("->", 0, 0);
      assertEquals("", string0);
      
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 0);
      assertEquals('[', strSubstitutor0.getEscapeChar());
      assertEquals(3, strBuilder0.length());
      assertEquals(35, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test66()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "HNEJ}!Zc,/l&iw39I?", "HNEJ}!Zc,/l&iw39I?", '[');
      Properties properties0 = new Properties();
      properties0.put("java.lang.Object@46b8d606", strSubstitutor0);
      String string0 = StrSubstitutor.replace((Object) hashMap0, properties0);
      assertEquals("{}", string0);
      assertNotNull(string0);
      
      StrBuilder strBuilder0 = new StrBuilder();
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX, (-1864));
      assertEquals((-1), int0);
      assertEquals('[', strSubstitutor0.getEscapeChar());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null, 5372);
      assertEquals((-1), int0);
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator("e", 2952);
      // Undeclared exception!
      try { 
        strBuilder0.delete((-1868), 667);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1868
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-1511));
      strBuilder0.appendSeparator("java.lang.Object@41ead4d0", (-2463));
      // Undeclared exception!
      try { 
        strBuilder0.delete((-2463), 55);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2463
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(44);
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('L', 3958);
      // Undeclared exception!
      try { 
        strBuilder1.delete(11, 44);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-630));
      strBuilder0.appendSeparator('L', (-630));
      // Undeclared exception!
      try { 
        strBuilder0.delete(1, 2861);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Invalid starMIndex: ");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, "HP-UX", "HP-UX", '^');
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('e');
      strSubstitutor1.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.delete((-3261), 38);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3261
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "HNEJ}!Zc,/l&iw39I?", "HNEJ}!Zc,/l&iw39I?", 'W');
      StringBuffer stringBuffer0 = new StringBuffer("HNEJ}!Zc,/l&iw39I?");
      stringBuffer0.append("HNEJ}!Zc,/l&iw39I?");
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder((-3091));
      // Undeclared exception!
      try { 
        strBuilder0.delete((-3091), (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3091
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace("java.lang.Object@1926ccd8", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.insert(0, (double) 0);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0, "java.lang.Object@8df64c0", "java.lang.Object@8df64c0", '[');
      StrSubstitutor.replace((Object) hashMap0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("f0f");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 0);
      assertEquals(3, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals('[', strSubstitutor0.getEscapeChar());
      assertEquals(35, strBuilder0.capacity());
  }
}
