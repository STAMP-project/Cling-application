/*

 * Tue Mar 03 16:10:09 GMT 2020
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
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("}");
      ToStringStyle.unregister((Object) null);
      toStringStyle0.appendInternal(stringBuffer0, "}", toStringStyle0, false);
      assertEquals("}<ToStringStyle.MultiLineToStringStyle>", stringBuffer0.toString());
      assertEquals(39, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringStyle.unregister(toStringStyle0);
      StringBuffer stringBuffer0 = new StringBuffer("}");
      toStringStyle0.appendInternal(stringBuffer0, "}", toStringStyle0, false);
      assertEquals("}<ToStringStyle.MultiLineToStringStyle>", stringBuffer0.toString());
      assertEquals(39, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ToStringStyle.register((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = new Boolean(false);
      toStringStyle0.append(stringBuffer0, (String) null, (Object) toStringStyle0, boolean0);
      assertEquals("<ToStringStyle.SimpleToStringStyle>,", stringBuffer0.toString());
      assertEquals(36, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.appendToString(stringBuffer0, "]");
      standardToStringStyle0.appendInternal(stringBuffer0, "wJ=QOS:`U(.F.R", toStringStyle0, false);
      assertEquals(35, stringBuffer0.length());
      assertEquals("<ToStringStyle.SimpleToStringStyle>", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendInternal(stringBuffer0, "}", toStringStyle0, false);
      toStringStyle0.appendSuper(stringBuffer0, "}");
      assertEquals(38, stringBuffer0.length());
      assertEquals("<ToStringStyle.MultiLineToStringStyle>", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendToString(stringBuffer0, (String) null);
      Boolean boolean0 = new Boolean(false);
      toStringStyle0.append(stringBuffer0, (String) null, (Object) toStringStyle0, boolean0);
      assertEquals("<ToStringStyle.SimpleToStringStyle>,", stringBuffer0.toString());
      assertEquals(36, stringBuffer0.length());
  }
}
