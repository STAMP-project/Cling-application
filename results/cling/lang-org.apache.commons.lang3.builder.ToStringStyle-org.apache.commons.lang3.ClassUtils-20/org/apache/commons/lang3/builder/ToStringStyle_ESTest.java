/*

 * Tue Mar 03 16:12:11 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ToStringStyle_ESTest extends ToStringStyle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ToStringStyle.unregister((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      Boolean boolean0 = new Boolean("[org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer(86);
      standardToStringStyle0.append(stringBuffer0, "[org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle", (Object) toStringStyle0, boolean0);
      assertEquals(112, stringBuffer0.length());
      assertEquals("[", standardToStringStyle0.getContentStart());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringStyle.unregister(standardToStringStyle0);
      Boolean boolean0 = new Boolean((String) null);
      standardToStringStyle0.append(stringBuffer0, (String) null, (Object) toStringStyle0, boolean0);
      assertEquals("<ToStringStyle.DefaultToStringStyle>,", stringBuffer0.toString());
      assertTrue(standardToStringStyle0.isUseClassName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("[java.lang.Double");
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.appendInternal(stringBuffer0, "/#2*", toStringStyle0, false);
      Boolean boolean0 = Boolean.TRUE;
      standardToStringStyle0.append(stringBuffer0, "java.lang.Long", (Object) "[java.lang.Double", boolean0);
      assertEquals(85, stringBuffer0.length());
      assertEquals("[java.lang.Double<ToStringStyle.SimpleToStringStyle>java.lang.Long=[java.lang.Double,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle.register((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "}");
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      Boolean boolean0 = new Boolean(false);
      standardToStringStyle0.append(stringBuffer0, "}", (Object) toStringStyle0, boolean0);
      assertEquals(40, stringBuffer0.length());
      assertEquals("}}=<ToStringStyle.DefaultToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("[java.lang.Double");
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.appendInternal(stringBuffer0, "/#2*", toStringStyle0, false);
      standardToStringStyle0.appendToString(stringBuffer0, "[java.lang.Double");
      assertEquals("[java.lang.Double<ToStringStyle.SimpleToStringStyle>", stringBuffer0.toString());
      assertEquals(52, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("");
      toStringStyle0.appendSuper(stringBuffer0, "");
      toStringStyle0.appendStart(stringBuffer0, "");
      Boolean boolean0 = new Boolean("[java.lang.String");
      ToStringStyle toStringStyle1 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      toStringStyle1.append(stringBuffer0, "SunOS", (Object) toStringStyle0, boolean0);
      Short short0 = new Short((short)2156);
      // Undeclared exception!
      try { 
        toStringStyle0.reflectionAppendArrayDetail(stringBuffer0, "uRN", short0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument is not an array
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendSuper(stringBuffer0, (String) null);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      Boolean boolean0 = new Boolean((String) null);
      standardToStringStyle0.append(stringBuffer0, (String) null, (Object) toStringStyle0, boolean0);
      assertEquals("<ToStringStyle.DefaultToStringStyle>,", stringBuffer0.toString());
      assertTrue(standardToStringStyle0.isUseIdentityHashCode());
  }
}
