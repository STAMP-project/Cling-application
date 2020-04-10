/*

 * Tue Mar 03 15:58:48 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ReflectionToStringBuilder_ESTest extends ReflectionToStringBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = ReflectionToStringBuilder.toString((Object) null);
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = ReflectionToStringBuilder.toString((Object) standardToStringStyle0);
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(string0);
      ReflectionToStringBuilder reflectionToStringBuilder1 = (ReflectionToStringBuilder)reflectionToStringBuilder0.appendSuper(string0);
      assertFalse(reflectionToStringBuilder1.isAppendStatics());
      assertFalse(reflectionToStringBuilder1.isAppendTransients());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = ReflectionToStringBuilder.toString((Object) standardToStringStyle0);
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(string0);
      ReflectionToStringBuilder reflectionToStringBuilder1 = (ReflectionToStringBuilder)reflectionToStringBuilder0.appendSuper((String) null);
      assertFalse(reflectionToStringBuilder1.isAppendTransients());
      assertFalse(reflectionToStringBuilder1.isAppendStatics());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("b9*\"-l,o5D&@UiM");
      Class<String> class0 = String.class;
      reflectionToStringBuilder0.setUpToClass(class0);
      assertFalse(reflectionToStringBuilder0.isAppendStatics());
      assertFalse(reflectionToStringBuilder0.isAppendTransients());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      String string0 = ReflectionToStringBuilder.toString((Object) toStringStyle0);
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(string0);
      ReflectionToStringBuilder reflectionToStringBuilder1 = (ReflectionToStringBuilder)reflectionToStringBuilder0.appendToString((String) null);
      assertFalse(reflectionToStringBuilder1.isAppendTransients());
      assertFalse(reflectionToStringBuilder1.isAppendStatics());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      String string0 = ReflectionToStringBuilder.toString((Object) toStringStyle0);
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(string0);
      ReflectionToStringBuilder reflectionToStringBuilder1 = (ReflectionToStringBuilder)reflectionToStringBuilder0.appendToString(string0);
      assertFalse(reflectionToStringBuilder1.isAppendStatics());
      assertFalse(reflectionToStringBuilder1.isAppendTransients());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        ToStringBuilder.setDefaultStyle((ToStringStyle) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The style must not be null
         //
         verifyException("org.apache.commons.lang3.builder.ToStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test7()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      String string0 = ReflectionToStringBuilder.toString((Object) toStringStyle0, toStringStyle0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) string0);
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(string0, toStringStyle0, stringBuffer0);
      assertEquals(8462, stringBuffer0.length());
  }
}
