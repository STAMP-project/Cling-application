/*

 * Tue Mar 03 16:10:29 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import java.util.HashMap;
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
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals("ToStringStyle.MultiLineToStringStyle[", stringBuffer0.toString());
      assertEquals(37, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      toStringStyle0.SHORT_PREFIX_STYLE.appendEnd(stringBuffer0, hashMap0);
      toStringStyle0.appendClassName(stringBuffer0, toStringStyle0);
      assertEquals("]ToStringStyle.ShortPrefixToStringStyle", stringBuffer0.toString());
      assertEquals(39, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle0.appendClassName(stringBuffer0, toStringStyle0);
      toStringStyle0.appendInternal(stringBuffer0, "int", toStringStyle0, false);
      assertEquals(118, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = Boolean.FALSE;
      toStringStyle0.append(stringBuffer0, "boolean", (Object) toStringStyle0, boolean0);
      assertEquals(49, stringBuffer0.length());
      assertEquals("boolean=<ToStringStyle.ShortPrefixToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle.register((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(37, stringBuffer0.length());
      assertEquals("ToStringStyle.MultiLineToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendSuper(stringBuffer0, "");
      Boolean boolean0 = Boolean.FALSE;
      toStringStyle0.append(stringBuffer0, "", (Object) toStringStyle0, boolean0);
      assertEquals("<ToStringStyle.SimpleToStringStyle>,", stringBuffer0.toString());
      assertEquals(36, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle0.appendClassName(stringBuffer0, toStringStyle0);
      toStringStyle0.appendEnd(stringBuffer0, "int");
      assertEquals("ToStringStyle.ShortPrefixToStringStyle]", stringBuffer0.toString());
      assertEquals(39, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test7()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle0.appendSuper(stringBuffer0, "LINUX");
      Boolean boolean0 = Boolean.FALSE;
      standardToStringStyle0.append(stringBuffer0, "UZAq7#y;(4)KBK", (Object) toStringStyle0, boolean0);
      assertEquals(95, stringBuffer0.length());
      assertEquals("{", standardToStringStyle0.getArrayStart());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer();
      standardToStringStyle0.appendSuper(stringBuffer0, (String) null);
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      Boolean boolean0 = Boolean.FALSE;
      standardToStringStyle0.append(stringBuffer0, "UZAq7#y;(4)KBK", (Object) toStringStyle0, boolean0);
      assertEquals("UZAq7#y;(4)KBK=<ToStringStyle.ShortPrefixToStringStyle>,", stringBuffer0.toString());
      assertEquals(56, stringBuffer0.length());
  }
}
