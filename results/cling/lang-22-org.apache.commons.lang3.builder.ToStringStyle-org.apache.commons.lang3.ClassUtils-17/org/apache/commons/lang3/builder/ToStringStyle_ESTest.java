/*

 * Tue Mar 03 16:11:34 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ToStringStyle_ESTest extends ToStringStyle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle.register(object0);
      ToStringStyle.isRegistered(object0);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = new Boolean("[");
      standardToStringStyle0.append(stringBuffer0, "[", (Object) toStringStyle0, boolean0);
      assertEquals("[=<ToStringStyle.DefaultToStringStyle>,", stringBuffer0.toString());
      assertEquals(39, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringStyle.register((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(39, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendSuper(stringBuffer0, "]");
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(39, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle.unregister(toStringStyle0);
      Boolean boolean0 = new Boolean("[");
      standardToStringStyle0.append(stringBuffer0, "[", (Object) toStringStyle0, boolean0);
      assertEquals("[=<ToStringStyle.DefaultToStringStyle>,", stringBuffer0.toString());
      assertEquals(39, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle0.appendSuper(stringBuffer0, ">");
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(37, stringBuffer0.length());
      assertEquals("ToStringStyle.MultiLineToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendToString(stringBuffer0, (String) null);
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(39, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
  }
}
