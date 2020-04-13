/*

 * Tue Mar 03 16:43:30 GMT 2020
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
      StrBuilder strBuilder0 = new StrBuilder("prefix");
      // Undeclared exception!
      try { 
        strBuilder0.delete((-2295), 102);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2295
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
        strBuilder0.toCharArray((-264), 100);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -264
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(0);
      strBuilder0.lastIndexOf((StrMatcher) null);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("!;R|D&S*x1_`V", 0, (-1));
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("nD~");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      // Undeclared exception!
      try { 
        StrSubstitutor.replace((Object) "lyv}l>;", (Map<String, Integer>) hashMap0, "must", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable suffix must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "8KL}{dskpE*mV", "8KL}{dskpE*mV", 'f');
      StringBuffer stringBuffer0 = new StringBuffer();
      StrBuilder strBuilder0 = new StrBuilder();
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
      assertEquals((-1), int0);
      
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals('f', strSubstitutor0.getEscapeChar());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(0);
      strBuilder0.appendSeparator('k', 102);
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertFalse(strBuilder0.isEmpty());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("0mbo9cM&ST{e j:]']");
      strBuilder0.replaceFirst("0mbo9cM&ST{e j:]']", "~|g");
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, strBuilder0);
      assertEquals(3, strBuilder0.size());
      assertEquals(3, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("<I4*e<g,1C:");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals(11, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(43, strBuilder0.capacity());
      
      StrBuilder strBuilder1 = new StrBuilder((String) null);
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'e');
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder((-2402));
      // Undeclared exception!
      try { 
        strBuilder0.delete((-19), (-2402));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -19
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.delete((-1), 815);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("0mbo9cM&ST{e j:]']");
      StrBuilder strBuilder1 = strBuilder0.replaceFirst("0mbo9cM&ST{e j:]']", "~|g");
      // Undeclared exception!
      try { 
        strBuilder1.delete((-1), (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Properties properties0 = new Properties();
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.put(strBuilder0, strSubstitutor0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.put(strBuilder0, strSubstitutor0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("", (-627), (-627));
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
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      // Undeclared exception!
      try { 
        strBuilder0.delete('$', 102);
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@6d8691c8");
      strSubstitutor0.replace(stringBuffer0);
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(100, 1790);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      Integer integer0 = new Integer(9);
      strBuilder0.appendFixedWidthPadRight((Object) integer0, 9, '\"');
      strBuilder0.replaceFirst("org.apache.commons.lang3.text.StrSubstitutor@5b48d6f6", "org.apache.commons.lang3.text.StrSubstitutor@5b48d6f6");
      // Undeclared exception!
      try { 
        strBuilder0.insert(82, "mus");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 82
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("java.lang.Object@10a671c8", "loop").when(strLookup0).toString();
      doReturn("java.lang.Object@10a671c8", (String) null).when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'e');
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@10a671c8");
      stringBuffer0.append("Variable prefix must not be null!");
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("s17oLy@");
      // Undeclared exception!
      try { 
        strBuilder0.delete(30, (-3374));
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@659813a2");
      strBuilder0.insert(0, (String) null);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("\"\"y", 45, 31);
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
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      char[] charArray0 = new char[3];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'R');
      StrBuilder strBuilder0 = new StrBuilder("sDNkSa2q\"o:jF&Qzp%v");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals('R', strSubstitutor0.getEscapeChar());
      assertEquals(51, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals(19, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("");
      // Undeclared exception!
      try { 
        strBuilder0.delete(1, 3);
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
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@6d8691c8");
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(100, 1790);
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
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.put(strBuilder0, strSubstitutor0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(0, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(strLookup0).toString();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'e');
      StrBuilder strBuilder0 = new StrBuilder();
      strSubstitutor0.replaceIn(strBuilder0);
      strBuilder0.ensureCapacity(1823);
      strSubstitutor0.replaceIn(strBuilder0, 1823, (int) 'e');
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Properties properties0 = new Properties();
      properties0.put("", "");
      String string0 = StrSubstitutor.replace((Object) null, properties0);
      assertNull(string0);
      
      StrBuilder strBuilder0 = new StrBuilder(" ");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(1, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals(33, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@5b40ceba");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(85, strBuilder0.capacity());
      assertEquals(53, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(0);
      strBuilder0.insert(0, (long) 0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("e`+xD", 0, 17);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.put("", "");
      StrSubstitutor.replace((Object) null, properties0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert(658, (char[]) null, (-2172), 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 658
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@ae87e98");
      StrBuilder strBuilder1 = strBuilder0.insert(0, (String) null);
      Integer integer0 = new Integer(9);
      strBuilder0.appendFixedWidthPadRight((Object) integer0, 9, '\"');
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0, "org.apache.commons.lang3.text.StrSubstitutor@ae87e98", "HP-UX");
      strSubstitutor0.replaceIn(strBuilder1);
      assertEquals(61, strBuilder0.size());
      assertEquals(61, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "8KL}{dskpE*mV", "8KL}{dskpE*mV", 'f');
      StringBuffer stringBuffer0 = new StringBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('f', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      
      StrBuilder strBuilder0 = new StrBuilder();
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.lastIndexOf((StrMatcher) null);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("!;R|D&S*x1_`V", 15, (-720));
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
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.deleteCharAt((-4628));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -4628
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@5b40ceba");
      char[] charArray0 = strBuilder0.toCharArray(49, 1790);
      assertEquals(4, charArray0.length);
      assertEquals(53, strBuilder0.length());
      assertEquals(85, strBuilder0.capacity());
      assertArrayEquals(new char[] {'c', 'e', 'b', 'a'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("java.lang.Object@72c307c", (String) null, (String) null, (String) null, (String) null).when(strLookup0).toString();
      doReturn("java.lang.Object@72c307c", (String) null, (String) null, (String) null, (String) null).when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'e');
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@72c307c");
      stringBuffer0.append("Vari`le prefix mus not e null!");
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.ensureCapacity(1823);
      strSubstitutor0.replaceIn(strBuilder0, 1823, (int) 'e');
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder((-1943));
      // Undeclared exception!
      try { 
        strBuilder0.delete((-1943), (-1943));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1943
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.setLength(10);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("0mbo9cM&ST{e j:]']");
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      assertEquals("0mbo9cM&ST{e j:]']", stringBuffer0.toString());
      assertEquals(50, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace(" ", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder("<I4*e<g,1C:");
      // Undeclared exception!
      try { 
        strBuilder0.delete((-1), 256);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertFalse(boolean0);
      
      StrBuilder strBuilder0 = new StrBuilder("wM=vl4");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals((-1), int0);
      assertEquals(39, strBuilder0.capacity());
      assertEquals(7, strBuilder0.length());
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(0);
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      objectArray0[0] = object0;
      StrBuilder strBuilder1 = strBuilder0.appendWithSeparators(objectArray0, (String) null);
      strSubstitutor0.replaceIn(strBuilder0);
      int int0 = strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertFalse(strBuilder0.isEmpty());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder("prefix");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(6, strBuilder0.length());
      assertEquals(38, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@6d8691c8");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals(53, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals(85, strBuilder0.capacity());
      
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      char[] charArray0 = new char[3];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'R');
      StrBuilder strBuilder0 = new StrBuilder("sDNkSa2q\"o:jF&Qzp%v");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("java.awt.printerjob", 36, 1518);
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
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@659813a2");
      strBuilder0.insert(0, (String) null);
      StrBuilder strBuilder1 = strBuilder0.replaceFirst("org.apache.commons.lang3.text.StrSubstitutor@659813a2", "org.apache.commons.lang3.text.StrSubstitutor@659813a2");
      assertEquals(53, strBuilder1.length());
      assertEquals(85, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@659813a2");
      StrBuilder strBuilder1 = strBuilder0.insert(0, (String) null);
      assertEquals(85, strBuilder1.capacity());
      assertEquals(53, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(0);
      strBuilder0.insert(0, (long) 0);
      assertFalse(strBuilder0.isEmpty());
      
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replace(stringBuffer0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      StrBuilder strBuilder0 = new StrBuilder("prefix");
      // Undeclared exception!
      try { 
        strBuilder0.delete((-2295), 102);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2295
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'e');
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@65922f96");
      stringBuffer0.append("Variable prefix must not be null!");
      strSubstitutor0.setEnableSubstitutionInVariables(true);
      strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals(57, stringBuffer0.length());
      
      StrBuilder strBuilder0 = new StrBuilder("loop");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace(" ", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder(0);
      strBuilder0.insert(0, (long) 0);
      assertEquals(1, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      String string0 = strSubstitutor0.replace(" ", 0, 0);
      assertEquals("", string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      
      StrBuilder strBuilder0 = new StrBuilder(0);
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null);
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer();
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@5b40ceba");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals(53, strBuilder0.length());
      assertEquals(85, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("0mbo9cM&ST{e j:]']");
      StrBuilder strBuilder1 = strBuilder0.setNullText((String) null);
      assertEquals(18, strBuilder1.length());
      assertEquals(50, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("0mbo9cM&ST{e j:]']");
      StrBuilder strBuilder1 = strBuilder0.replaceFirst("0mbo9cM&ST{e j:]']", "~|g");
      // Undeclared exception!
      try { 
        strBuilder1.toCharArray(915, 350);
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
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@5b40ceba");
      strBuilder0.toCharArray(49, 1790);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("org.apache.commons.lang3.text.StrSubstitutor@5b40ceba", 46, 18);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test53()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(0);
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      objectArray0[0] = object0;
      StrBuilder strBuilder1 = strBuilder0.appendWithSeparators(objectArray0, (String) null);
      strBuilder1.appendSeparator((String) null, "");
      assertEquals(25, strBuilder0.size());
      assertEquals(32, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@48c05f7c");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      // Undeclared exception!
      try { 
        strSubstitutor0.setVariablePrefix((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable prefix must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "<I4*e<g,1C:", "CrK@NcT", '_');
      StrBuilder strBuilder0 = new StrBuilder("<I4*e<g,1C:");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      assertEquals(43, strBuilder0.capacity());
      assertEquals('_', strSubstitutor0.getEscapeChar());
      assertEquals((-1), int0);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("0mbo9cM&ST{e j:]']");
      StrMatcher strMatcher0 = StrMatcher.charMatcher('$');
      strBuilder0.lastIndexOf(strMatcher0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("~|g", (-443), (-1));
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
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      char[] charArray0 = new char[3];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'R');
      StrBuilder strBuilder0 = new StrBuilder("sDNkSa2q\"o:jF&Qzp%v");
      strBuilder0.replaceFirst("java.lang.Object@7b27448c-", "java.lang.Object@7b27448c-");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals(19, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals('R', strSubstitutor0.getEscapeChar());
      assertEquals(51, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("0mbo9cM&ST{e j:]']");
      StrBuilder strBuilder1 = strBuilder0.replaceFirst("0mbo9cM&ST{e j:]']", "~|g");
      StrMatcher strMatcher0 = StrMatcher.charMatcher('$');
      int int0 = strBuilder1.lastIndexOf(strMatcher0);
      assertEquals(3, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("<I4*e<g,1C:");
      // Undeclared exception!
      try { 
        strBuilder0.delete((-1), 256);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test60()  throws Throwable  {
      Object object0 = new Object();
      StrSubstitutor.replace(object0, (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@5b7bcd71");
      Object[] objectArray0 = new Object[6];
      objectArray0[1] = (Object) strBuilder0;
      StrBuilder strBuilder1 = strBuilder0.appendWithSeparators(objectArray0, "2l'@-5Bp87");
      strBuilder1.insert(102, "java.lang.Object@5b7bcd71-");
      assertEquals(136, strBuilder0.length());
      assertEquals(140, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(0);
      strBuilder0.insert(0, (long) 0);
      assertFalse(strBuilder0.isEmpty());
      
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.setNullText("$.h,=z5YhC{R40J)");
      assertEquals(32, strBuilder1.capacity());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace(" ", 0, 0);
      StrBuilder strBuilder0 = new StrBuilder(0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_PREFIX, "java.lang.Object@15f74d5d", 2212, 400, 32);
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "8KL}{dskpE*mV", "8KL}{dskpE*mV", 'f');
      StrBuilder strBuilder0 = new StrBuilder();
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) strSubstitutor0, properties0);
      assertEquals('f', strSubstitutor0.getEscapeChar());
      
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(0);
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      
      int int0 = strBuilder0.lastIndexOf((StrMatcher) null);
      assertEquals((-1), int0);
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder();
      properties0.put(strBuilder0, strSubstitutor0);
      strBuilder0.append("prefixjava.lang.Object@11cc500fnot");
      strBuilder0.replaceFirst("org.apache.commons.lang3.text.StrSubstitutor@86dccdf", "org.apache.commons.lang3.text.StrSubstitutor@86dccdf");
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("java.lang.Object@65922f96", "java.lang.Object@65922f96").when(strLookup0).toString();
      doReturn("java.lang.Object@65922f96", "java.lang.Object@65922f96").when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'e');
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@65922f96");
      stringBuffer0.append("Variable prefix must not be null!");
      strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals(97, stringBuffer0.length());
      
      StrBuilder strBuilder0 = new StrBuilder("loop");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals(4, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("org.apache.commons.lang3.text.StrSubstitutor@5b40ceba");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("org.apache.commons.lang3.text.StrSubstitutor@5b40ceba", 46, 18);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      String string0 = strSubstitutor0.replace(" ", 0, 0);
      assertNotNull(string0);
      assertEquals("", string0);
      
      StrBuilder strBuilder0 = new StrBuilder(" ");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_PREFIX);
      assertEquals(33, strBuilder0.capacity());
      assertEquals(1, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(0);
      strBuilder0.lastIndexOf((StrMatcher) null);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("`rs", (-1), 1805);
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
  public void test71()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("java.lang.Object@5b7bcd71").when(strLookup0).toString();
      doReturn("java.lang.Object@5b7bcd71").when(strLookup0).lookup(anyString());
      char[] charArray0 = new char[3];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0, 'R');
      strSubstitutor0.replace(charArray0);
      StrBuilder strBuilder0 = new StrBuilder("java.lang.Object@5b7bcd71");
      Object[] objectArray0 = new Object[6];
      objectArray0[1] = (Object) strBuilder0;
      StrBuilder strBuilder1 = strBuilder0.appendWithSeparators(objectArray0, "2l'@-5Bp87");
      strBuilder1.insert(102, "java.lang.Object@5b7bcd71-");
      assertEquals(136, strBuilder0.size());
      assertEquals(140, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("java.lang.Object@3831fba", (String) null).when(strLookup0).toString();
      doReturn("java.lang.Object@3831fba", (String) null).when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'e');
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@3831fba");
      stringBuffer0.append("Variable prefix must not be nullp");
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert(658, (char[]) null, (-597), (-3351));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 658
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("java.lang.Object@298b0339", "java.lang.Object@298b0339").when(strLookup0).toString();
      doReturn("java.lang.Object@298b0339", "java.lang.Object@298b0339").when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'e');
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.Object@298b0339");
      stringBuffer0.append("Variable prefix must not be null!");
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("zt3`FJ|n|(JtqCc|");
      // Undeclared exception!
      try { 
        strBuilder0.delete((-1583), 50);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1583
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder(0);
      strBuilder0.insert(0, (long) 0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("@D]", (-1), 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }
}
