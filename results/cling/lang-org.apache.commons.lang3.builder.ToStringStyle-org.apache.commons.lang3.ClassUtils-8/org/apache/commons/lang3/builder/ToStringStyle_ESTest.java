/*

 * Tue Mar 03 16:10:51 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import org.junit.Ignore;
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
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringStyle.unregister((Object) null);
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals("ToStringStyle.DefaultToStringStyle[", stringBuffer0.toString());
      assertEquals(35, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringStyle.unregister(standardToStringStyle0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) ",");
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      Boolean boolean0 = new Boolean("$]");
      standardToStringStyle0.append(stringBuffer0, "G", (Object) toStringStyle0, boolean0);
      assertEquals(",G=<ToStringStyle.ShortPrefixToStringStyle>,", stringBuffer0.toString());
      assertEquals(44, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("yh*$sg");
      Object object0 = new Object();
      toStringStyle0.appendStart(stringBuffer0, object0);
      ToStringStyle.isRegistered(object0);
      Boolean boolean0 = Boolean.valueOf("8X#B\"ElUE1{I[`");
      toStringStyle0.append(stringBuffer0, "<null>", (Object) toStringStyle0, boolean0);
      assertEquals(76, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle.register((Object) null);
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(39, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer((byte)89);
      standardToStringStyle0.appendInternal(stringBuffer0, "", toStringStyle0, false);
      toStringStyle0.appendToString(stringBuffer0, "");
      assertEquals(75, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = Boolean.FALSE;
      standardToStringStyle0.appendSuper(stringBuffer0, "{");
      standardToStringStyle0.append(stringBuffer0, "{", (Object) toStringStyle0, boolean0);
      assertEquals("{=<ToStringStyle.SimpleToStringStyle>,", stringBuffer0.toString());
      assertEquals(38, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer((byte)89);
      standardToStringStyle0.appendInternal(stringBuffer0, "", toStringStyle0, false);
      toStringStyle0.appendToString(stringBuffer0, (String) null);
      assertEquals("<ToStringStyle.SimpleToStringStyle>", stringBuffer0.toString());
      assertEquals(35, stringBuffer0.length());
  }
}
