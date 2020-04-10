/*

 * Tue Mar 03 16:01:54 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
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
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      ReflectionToStringBuilder reflectionToStringBuilder1 = (ReflectionToStringBuilder)reflectionToStringBuilder0.appendSuper("org.apache.commons.lang3.builder.ToStringBuilder");
      assertFalse(reflectionToStringBuilder1.isAppendTransients());
      assertFalse(reflectionToStringBuilder1.isAppendStatics());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("java.class.path", standardToStringStyle0);
      ReflectionToStringBuilder reflectionToStringBuilder1 = (ReflectionToStringBuilder)reflectionToStringBuilder0.appendSuper((String) null);
      assertFalse(reflectionToStringBuilder1.isAppendTransients());
      assertFalse(reflectionToStringBuilder1.isAppendStatics());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("'cuA?Cl");
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("'cuA?Cl", toStringStyle0, stringBuffer0);
      assertFalse(reflectionToStringBuilder0.isAppendTransients());
      assertFalse(reflectionToStringBuilder0.isAppendStatics());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      Class<Object> class0 = Object.class;
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(object0, toStringStyle0, (StringBuffer) null, (Class<? super Object>) class0, false, false);
      ReflectionToStringBuilder reflectionToStringBuilder1 = (ReflectionToStringBuilder)reflectionToStringBuilder0.appendToString((String) null);
      assertFalse(reflectionToStringBuilder1.isAppendStatics());
      assertFalse(reflectionToStringBuilder1.isAppendTransients());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder((Object) null);
      ReflectionToStringBuilder reflectionToStringBuilder1 = (ReflectionToStringBuilder)reflectionToStringBuilder0.appendToString("<null>");
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
  public void test7()  throws Throwable  {
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      ReflectionToStringBuilder.toString((Object) reflectionToStringBuilder0);
      assertFalse(reflectionToStringBuilder0.isAppendStatics());
      assertFalse(reflectionToStringBuilder0.isAppendTransients());
  }
}
