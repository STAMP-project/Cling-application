/*

 * Tue Mar 03 16:38:11 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.text.StrMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrBuilder$StrBuilderReader_ESTest extends StrBuilder$StrBuilderReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("en8jd < sMbart");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.contains(strBuilder0);
      assertEquals(46, strBuilder0.capacity());
      assertEquals(14, strBuilder0.length());
      assertEquals(14, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert(682, "\"PA0Md$LihbR4");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 682
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
      assertEquals((-1), int0);
      assertEquals(0, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("end < start");
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      String string0 = strBuilder0.substring(2);
      assertEquals("d < start", string0);
      
      int int0 = strBuilder_StrBuilderReader0.read();
      assertEquals(43, strBuilder0.capacity());
      assertEquals(11, strBuilder0.size());
      assertEquals(101, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator("en8rd < Mbt");
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(2807, 2807);
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
      StrBuilder strBuilder0 = new StrBuilder("en8jd < sMbart");
      strBuilder0.appendSeparator("en8jd < sMbart");
      // Undeclared exception!
      try { 
        strBuilder0.validateRange(2851, 2851);
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
      strBuilder0.minimizeCapacity();
      StrBuilder strBuilder1 = strBuilder0.minimizeCapacity();
      // Undeclared exception!
      try { 
        strBuilder1.validateRange(685, 685);
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
      StrBuilder strBuilder0 = new StrBuilder("=nd < s'M{tart");
      strBuilder0.insert(3, 3);
      assertEquals(15, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateIndex((-3695));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3695
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      StrBuilder strBuilder1 = strBuilder0.deleteFirst(strMatcher0);
      // Undeclared exception!
      try { 
        strBuilder1.charAt((-2093));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2093
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring((-1309));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1309
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
      strBuilder0.replaceAll((StrMatcher) strMatcher_NoMatcher0, "startIndex must be valid");
      // Undeclared exception!
      try { 
        strBuilder0.charAt(0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 0
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }
}
