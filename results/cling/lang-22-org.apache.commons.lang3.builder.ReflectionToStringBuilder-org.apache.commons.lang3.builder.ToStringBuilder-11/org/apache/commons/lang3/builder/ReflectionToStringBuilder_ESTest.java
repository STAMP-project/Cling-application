/*

 * Tue Mar 03 16:00:06 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
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
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder((Object) null, toStringStyle0);
      ReflectionToStringBuilder reflectionToStringBuilder1 = (ReflectionToStringBuilder)reflectionToStringBuilder0.appendSuper("fdj_%|lee'K");
      assertFalse(reflectionToStringBuilder1.isAppendTransients());
      assertFalse(reflectionToStringBuilder1.isAppendStatics());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder((Object) null, toStringStyle0);
      ReflectionToStringBuilder reflectionToStringBuilder1 = (ReflectionToStringBuilder)reflectionToStringBuilder0.appendSuper((String) null);
      assertFalse(reflectionToStringBuilder1.isAppendStatics());
      assertFalse(reflectionToStringBuilder1.isAppendTransients());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("");
      Class<Object> class0 = Object.class;
      reflectionToStringBuilder0.setUpToClass(class0);
      assertFalse(reflectionToStringBuilder0.isAppendStatics());
      assertFalse(reflectionToStringBuilder0.isAppendTransients());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(toStringStyle0, toStringStyle0, stringBuffer0);
      assertFalse(reflectionToStringBuilder0.isAppendStatics());
      assertFalse(reflectionToStringBuilder0.isAppendTransients());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("java.lang.Object@3fb93f05[]");
      ReflectionToStringBuilder reflectionToStringBuilder1 = (ReflectionToStringBuilder)reflectionToStringBuilder0.appendToString((String) null);
      assertFalse(reflectionToStringBuilder1.isAppendStatics());
      assertFalse(reflectionToStringBuilder1.isAppendTransients());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("java.lang.Object@4dd2af5b[]");
      ReflectionToStringBuilder reflectionToStringBuilder1 = (ReflectionToStringBuilder)reflectionToStringBuilder0.appendToString("java.lang.Object@4dd2af5b[]");
      assertFalse(reflectionToStringBuilder1.isAppendTransients());
      assertFalse(reflectionToStringBuilder1.isAppendStatics());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
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
  public void test8()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder((Object) null, toStringStyle0);
      Boolean boolean0 = new Boolean((String) null);
      ReflectionToStringBuilder.toString((Object) reflectionToStringBuilder0, toStringStyle0, (boolean) boolean0);
      assertFalse(reflectionToStringBuilder0.isAppendTransients());
      assertFalse(reflectionToStringBuilder0.isAppendStatics());
  }
}
