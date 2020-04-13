/*

 * Tue Mar 03 16:44:04 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.util.ArrayDeque;
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
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-249), 51, "9b4386");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -249
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("Limo8PXQs,{1GBU`jr");
      properties0.put(strBuilder0, "j!fWbO'/>?");
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(50, strBuilder0.capacity());
      assertEquals(18, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0);
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder("=X1");
      // Undeclared exception!
      try { 
        strBuilder0.insert(1754, (float) (-770));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 1754
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("}");
      StrBuilder strBuilder1 = strBuilder0.replaceFirst("}", (String) null);
      // Undeclared exception!
      try { 
        strBuilder1.substring((-2461));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2461
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      assertEquals(32, strBuilder0.capacity());
      
      StrBuilder strBuilder1 = new StrBuilder("user.dir");
      int int0 = strBuilder1.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 928);
      assertEquals(40, strBuilder1.capacity());
      assertEquals((-1), int0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals(8, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replaceIn((StrBuilder) null);
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-755), (-654), "'=cR_7'lBCGpRQtT?");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -755
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      strSubstitutor0.replaceIn(strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-249), 51, "9b4386");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -249
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("Limo8PXQs,{1GBU`jr");
      properties0.put(strBuilder0, "{}");
      assertEquals(18, strBuilder0.length());
      assertEquals(50, strBuilder0.capacity());
      
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) null);
      StrBuilder strBuilder0 = new StrBuilder("qqTGm95cq,");
      Properties properties0 = new Properties();
      properties0.put(strBuilder0, "qqTGm95cq,");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("qqTGm95cq,", (-2772), 9);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator((String) null, (-3301));
      // Undeclared exception!
      try { 
        strBuilder1.substring((-5349));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -5349
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('x');
      char[] charArray0 = new char[2];
      charArray0[0] = '$';
      charArray0[1] = 'x';
      String string0 = strSubstitutor1.replace(charArray0);
      assertEquals("x", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Integer>) hashMap0);
      strSubstitutor0.replace((StringBuffer) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace((int) '$', (int) '$', "njI>1&qNS{*m@");
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
      StrBuilder strBuilder0 = new StrBuilder("+vK1oFUrfL'*|!1Ow");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer("+vK1oFUrfL'*|!1Ow");
      strSubstitutor0.replace(stringBuffer0);
      strBuilder0.replaceFirst("+vK1oFUrfL'*|!1Ow", "tart");
      // Undeclared exception!
      try { 
        strBuilder0.replace(15, 15, "8");
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
      StrSubstitutor.replace((Object) "org.apache.commons.lang3.text.StrSubstitutor@46363c5e", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace(72, 33, "%\"9pBP,s");
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
      StrBuilder strBuilder0 = new StrBuilder("}");
      StrBuilder strBuilder1 = strBuilder0.replaceFirst("}", (String) null);
      // Undeclared exception!
      try { 
        strBuilder1.insert(439, 31);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 439
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("=X1");
      Properties properties0 = new Properties();
      Integer integer0 = new Integer(45);
      properties0.put("=X1", integer0);
      StrSubstitutor.replace((Object) "=X1", properties0);
      // Undeclared exception!
      try { 
        strBuilder0.replace(45, 2093, "Variable suffix must not be null!");
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
  public void test16()  throws Throwable  {
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("Limo8PXQs,{1GBU`jr");
      Properties properties1 = new Properties();
      properties0.put(strBuilder0, "{}");
      String string0 = StrSubstitutor.replace((Object) strBuilder0, properties1);
      assertEquals("Limo8PXQs,{1GBU`jr", string0);
      assertEquals(50, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("+vK1oFUrfL'*|!1Ow");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replaceIn(strBuilder0);
      strBuilder0.replaceFirst("+vK1oFUrfL'*|!1Ow", "tart");
      // Undeclared exception!
      try { 
        strBuilder0.replace(15, 15, "8");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator((String) null, (-3301));
      // Undeclared exception!
      try { 
        strBuilder1.insert(798, (float) (-3301));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 798
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Properties properties0 = new Properties();
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("FORMAT", (String) null).when(strLookup0).toString();
      doReturn((String) null, (String) null).when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("7Ts2s,I^/vlW_7<vP|");
      Locale.Category.valueOf("FORMAT");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'g');
      strSubstitutor0.getVariablePrefixMatcher();
      Object object0 = new Object();
      strSubstitutor0.replace(object0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace(48, 8, "Invalid offset: ");
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
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("FORMAT").when(strLookup0).toString();
      doReturn((String) null).when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("7Ts2s,I^/vlW_7<vP|");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'g');
      Object object0 = new Object();
      strSubstitutor0.replace(object0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.replace(48, 8, "Invalid offset: ");
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
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder("Invalid length: ");
      strBuilder0.insert(5, (Object) hashMap0);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("l{}i", 4, 4);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StringBuffer stringBuffer0 = new StringBuffer(4);
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder("F-");
      // Undeclared exception!
      try { 
        strBuilder0.replace(16, 4, "Infinite loop in property interpolation of ");
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
      StrBuilder strBuilder0 = new StrBuilder("}");
      Integer integer0 = new Integer((-2461));
      StrSubstitutor.replace((Object) integer0, (Properties) null);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-2461));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2461
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("}");
      // Undeclared exception!
      try { 
        strBuilder0.setCharAt((-1465), 'd');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1465
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("}");
      strBuilder0.setLength(5);
      assertEquals(5, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("9");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strBuilder0.replace(1, 671, "9]@F!sI;}\"_ulUf{!6");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("+kpyN$", 1, (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      Properties properties0 = new Properties();
      StrBuilder strBuilder0 = new StrBuilder("Limo8PXQs,{1GBU`jr");
      properties0.put(strBuilder0, "{}");
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("{}", 45, 116);
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
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator('$', 8);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-1888));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1888
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Invalid length: ");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator('$', (-831));
      // Undeclared exception!
      try { 
        strBuilder1.substring((-476));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -476
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder("=X1");
      Properties properties0 = new Properties();
      ArrayDeque<Object> arrayDeque0 = new ArrayDeque<Object>();
      properties0.put(strBuilder0, arrayDeque0);
      StringBuffer stringBuffer0 = new StringBuffer(strBuilder0);
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertEquals(35, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
      assertEquals("=X1", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("+vK1oFUrfL'*|!1Ow");
      strBuilder0.insert(15, 15);
      strBuilder0.replaceFirst("+vK1oFUrfL'*|!1Ow", "%\"9pBP,s<2z<p");
      assertEquals(19, strBuilder0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder("Invalid length: ");
      strBuilder0.insert(5, (Object) hashMap0);
      assertEquals(18, strBuilder0.size());
      
      StringWriter stringWriter0 = new StringWriter(39);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("q=X1");
      Properties properties0 = new Properties();
      Integer integer0 = new Integer(45);
      properties0.put("q=X1", integer0);
      StrSubstitutor.replace((Object) "q=X1", properties0);
      // Undeclared exception!
      try { 
        strBuilder0.substring((-1175));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1175
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("35uFGswM");
      strBuilder0.insert(0, "user.language");
      strBuilder0.appendSeparator('$', 0);
      assertEquals(21, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("file.encoding");
      // Undeclared exception!
      try { 
        strBuilder0.charAt((-332));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -332
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("file.encoding");
      Properties properties0 = new Properties();
      Integer integer0 = new Integer('$');
      properties0.put("file.encoding", integer0);
      strBuilder0.insert(9, 'q');
      assertEquals(14, strBuilder0.size());
      
      String string0 = StrSubstitutor.replace((Object) "file.encoding", properties0);
      assertEquals("file.encoding", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("}");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strBuilder0.replaceFirst("}", (String) null);
      // Undeclared exception!
      try { 
        strBuilder0.replace(strSubstitutor0.DEFAULT_SUFFIX, "org.apache.commons.lang3.text.StrSubstitutor", 32, 32, 32);
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
      StrBuilder strBuilder0 = new StrBuilder("F-");
      StrBuilder strBuilder1 = strBuilder0.replaceFirst("tart", "startIndex must be valid");
      // Undeclared exception!
      try { 
        strBuilder1.replace(16, 4, "Infinite loop in property interpolation of ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("}");
      strBuilder0.appendSeparator("06M^>^");
      assertEquals(7, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("user.dir");
      strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 928);
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("user.timezone", 3, (-831));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // length must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("user.dir");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 928);
      assertEquals((-1), int0);
      
      StrBuilder strBuilder1 = strBuilder0.replaceFirst("Jcu", "4.1");
      assertEquals(40, strBuilder1.capacity());
      assertEquals(8, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer();
      strSubstitutor0.replaceIn(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder((String) null);
      // Undeclared exception!
      try { 
        strBuilder0.replace((-755), (-654), "'=cR_7'lBCGpRQtT?");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -755
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StrSubstitutor.replace((Object) "org.apache.commons.lang3.text.StrSubstitutor@22eeaeeb", (Properties) null);
      StrBuilder strBuilder0 = new StrBuilder("Invalid length: ");
      strBuilder0.insert(13, (float) 13);
      assertEquals(20, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer(928);
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      
      StrBuilder strBuilder0 = new StrBuilder("user.dir");
      int int0 = strBuilder0.lastIndexOf(strSubstitutor0.DEFAULT_SUFFIX, 928);
      assertEquals(8, strBuilder0.length());
      assertEquals((-1), int0);
      assertEquals(40, strBuilder0.capacity());
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("}");
      StrBuilder strBuilder1 = strBuilder0.setNullText("_*mUHfiUkV6O");
      assertEquals(33, strBuilder1.capacity());
      assertEquals(1, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator("org.apache.commons.lang3.text.StrSubstitutor", (-3301));
      // Undeclared exception!
      try { 
        strBuilder0.insert(32, (float) (-3301));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 32
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator("org.apache.commons.lang3.text.StrSubstitutor", (-3301));
      // Undeclared exception!
      try { 
        strBuilder0.replace((-3301), (int) '$', "abHgvg+");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3301
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator('$', 8);
      // Undeclared exception!
      try { 
        strBuilder0.replace(48, 8, "Invalid offset: ");
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
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Properties properties0 = new Properties();
      StrSubstitutor.replace((Object) locale_Category0, properties0);
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("FORMAT").when(strLookup0).toString();
      doReturn((String) null).when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("7Ts2s,I^/vlW_7<vP|");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'g');
      Object object0 = new Object();
      strSubstitutor0.replace(object0);
      StrSubstitutor strSubstitutor1 = new StrSubstitutor();
      strSubstitutor1.setVariableSuffix("7Ts2s,I^/vlW_7<vP|");
      StrBuilder strBuilder0 = new StrBuilder("HP-UX");
      strSubstitutor1.setVariableSuffix('$');
      StrBuilder strBuilder1 = strBuilder0.replaceFirst(strMatcher0, "7Ts2s,I^/vlW_7<vP|");
      strBuilder1.insert(13, (float) 13);
      assertEquals(26, strBuilder0.size());
      assertEquals(26, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StrLookup<Object> strLookup0 = (StrLookup<Object>) mock(StrLookup.class, new ViolatedAssumptionAnswer());
      doReturn("FORMAT", (String) null, ">,c;tN", (String) null, (String) null).when(strLookup0).toString();
      doReturn((String) null, ">,c;tN", ">,c;tN", (String) null, (String) null).when(strLookup0).lookup(anyString());
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("7Ts2s,I^/vlW_7<vP|");
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, strMatcher0, strMatcher0, 'g');
      StringBuffer stringBuffer0 = new StringBuffer("7Ts2s,I^/vlW_7<vP|");
      strSubstitutor0.replace(stringBuffer0);
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring((-2532));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2532
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test51()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder("Invalid length: ");
      strBuilder0.insert(5, (Object) hashMap0);
      assertEquals(18, strBuilder0.size());
      
      String string0 = strSubstitutor0.replace("'}Yy$JuZau`pM", 4, 4);
      assertEquals("$JuZ", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("+vK1oFUrfL'*|!1Ow");
      strBuilder0.insert(15, 15);
      HashMap<String, Locale.Category> hashMap0 = new HashMap<String, Locale.Category>();
      StrLookup<Locale.Category> strLookup0 = StrLookup.mapLookup((Map<String, Locale.Category>) hashMap0);
      StrSubstitutor strSubstitutor0 = new StrSubstitutor(strLookup0, "+vK1oFUrfL'*|!1Ow", "Mew8L!1,BcL-wZY", 'A');
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("ir#v]DNE", 0, (-895));
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, ?>) hashMap0);
      StrBuilder strBuilder0 = new StrBuilder("file.encoding");
      strBuilder0.insert(9, 'q');
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("file.encoding", (int) '$', (-1689));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder("file.encoding");
      strBuilder0.insert(9, 'q');
      // Undeclared exception!
      try { 
        strSubstitutor0.replace("+|73tsD{", (-355), (-355));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }
}
