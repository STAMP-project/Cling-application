/*

 * Tue Mar 03 16:37:54 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.text.StrMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrBuilder$StrBuilderReader_ESTest extends StrBuilder$StrBuilderReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert(327, (float) 327);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 327
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateRange('4', '4');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      assertFalse(strBuilder_StrBuilderReader0.ready());
      
      int int0 = strBuilder_StrBuilderReader0.read();
      assertEquals(32, strBuilder0.capacity());
      assertEquals(0, strBuilder0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('~');
      strBuilder0.deleteAll((StrMatcher) strMatcher_CharMatcher0);
      // Undeclared exception!
      try { 
        strBuilder0.charAt('~');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 126
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.replaceAll((StrMatcher) null, "9");
      assertEquals(32, strBuilder1.capacity());
      
      StrBuilder strBuilder2 = strBuilder0.minimizeCapacity();
      strBuilder2.minimizeCapacity();
      assertEquals(0, strBuilder0.capacity());
      assertEquals(0, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.insert(0, (long) 0);
      assertFalse(strBuilder0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert((-2142005372), (-2142005372));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2142005372
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      strBuilder0.appendSeparator(")zDQ$#!(M", ")zDQ$#!(M");
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      strBuilder0.replaceAll(strMatcher0, ")zDQ$#!(M");
      int int0 = strBuilder_StrBuilderReader0.read();
      assertEquals(9, strBuilder0.length());
      assertEquals(41, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.replaceAll((StrMatcher) null, "?5|&ErE}i;B4Xe");
      // Undeclared exception!
      try { 
        strBuilder0.charAt((-297));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -297
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-1159));
      // Undeclared exception!
      try { 
        strBuilder0.replace((-1159), (-1159), "a");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1159
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("#yH-UX");
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
      strBuilder0.replaceAll((StrMatcher) strMatcher_NoMatcher0, "#yH-UX");
      strBuilder0.appendSeparator("#yH-UX", "#yH-UX");
      assertEquals(12, strBuilder0.size());
  }
}
