/*

 * Tue Mar 03 16:10:22 GMT 2020
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
      ToStringStyle.unregister((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = Boolean.FALSE;
      toStringStyle0.append(stringBuffer0, (String) null, (Object) toStringStyle0, boolean0);
      assertEquals(41, stringBuffer0.length());
      assertEquals("<ToStringStyle.MultiLineToStringStyle>\n  ", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      Boolean boolean0 = Boolean.valueOf("[org.apache.commons.lang3.builder.StandardToStringStyle");
      toStringStyle0.append(stringBuffer0, "[org.apache.commons.lang3.builder.StandardToStringStyle", (Object) toStringStyle0, boolean0);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.MULTI_LINE_STYLE.appendEnd(stringBuffer0, boolean0);
      assertEquals("[org.apache.commons.lang3.builder.StandardToStringStyle=<ToStringStyle.ShortPrefixToStringStyle>,\n]", stringBuffer0.toString());
      assertEquals("<null>", standardToStringStyle0.getNullText());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringStyle.register((Object) null);
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(39, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "[");
      toStringStyle0.DEFAULT_STYLE.appendToString(stringBuffer0, "[");
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals("[ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
      assertEquals(40, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer();
      standardToStringStyle0.appendToString(stringBuffer0, "]");
      Boolean boolean0 = Boolean.FALSE;
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      standardToStringStyle0.append(stringBuffer0, "]", (Object) toStringStyle0, boolean0);
      assertEquals(43, stringBuffer0.length());
      assertEquals("]=<ToStringStyle.ShortPrefixToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendToString((StringBuffer) null, (String) null);
      Boolean boolean0 = Boolean.FALSE;
      toStringStyle0.append(stringBuffer0, (String) null, (Object) toStringStyle0, boolean0);
      assertEquals(41, stringBuffer0.length());
      assertEquals("<ToStringStyle.MultiLineToStringStyle>\n  ", stringBuffer0.toString());
  }
}
