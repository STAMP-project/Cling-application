/*

 * Tue Mar 03 16:10:59 GMT 2020
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
      ToStringStyle.unregister((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = Boolean.valueOf("9Z;5g{({NK>%]Jc");
      standardToStringStyle0.append(stringBuffer0, "9Z;5g{({NK>%]Jc", (Object) toStringStyle0, boolean0);
      assertEquals("9Z;5g{({NK>%]Jc=<ToStringStyle.NoFieldNameToStringStyle>,", stringBuffer0.toString());
      assertEquals(57, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringStyle.unregister("java.awt.grphCcsenp");
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.awt.grphCcsenp");
      Boolean boolean0 = Boolean.FALSE;
      toStringStyle0.append(stringBuffer0, "java.awt.grphCcsenp", (Object) toStringStyle0, boolean0);
      assertEquals(60, stringBuffer0.length());
      assertEquals("java.awt.grphCcsenp<ToStringStyle.NoFieldNameToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      ToStringStyle.register((Object) null);
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      Boolean boolean0 = new Boolean((String) null);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.append(stringBuffer0, "J", (Object) toStringStyle0, boolean0);
      assertEquals(79, stringBuffer0.length());
      assertEquals("<size=", standardToStringStyle0.getSizeStartText());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer();
      standardToStringStyle0.appendSuper(stringBuffer0, "]");
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      standardToStringStyle0.appendInternal(stringBuffer0, "]", toStringStyle0, false);
      assertEquals(36, stringBuffer0.length());
      assertEquals("<ToStringStyle.DefaultToStringStyle>", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test4()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle0.appendClassName(stringBuffer0, toStringStyle0);
      ToStringStyle.register(stringBuffer0);
      Object[] objectArray0 = new Object[7];
      objectArray0[1] = (Object) stringBuffer0;
      Boolean boolean0 = Boolean.TRUE;
      toStringStyle0.append(stringBuffer0, "Mac", objectArray0, boolean0);
      assertEquals(118, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.MULTI_LINE_STYLE.appendToString(stringBuffer0, "[org.apache.commons.lang3.builder.ToStringStyleSimpleToStringStyle");
      Boolean boolean0 = new Boolean("[org.apache.commons.lang3.builder.ToStringStyleSimpleToStringStyle");
      standardToStringStyle0.append(stringBuffer0, "[org.apache.commons.lang3.builder.ToStringStyleSimpleToStringStyle", (Object) toStringStyle0, boolean0);
      assertEquals("[org.apache.commons.lang3.builder.ToStringStyleSimpleToStringStyle=<ToStringStyle.MultiLineToStringStyle>,", stringBuffer0.toString());
      assertEquals(106, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      toStringStyle0.appendSuper(stringBuffer0, (String) null);
      Boolean boolean0 = Boolean.FALSE;
      toStringStyle0.append(stringBuffer0, (String) null, (Object) toStringStyle0, boolean0);
      assertEquals(36, stringBuffer0.length());
      assertEquals("<ToStringStyle.SimpleToStringStyle>,", stringBuffer0.toString());
  }
}
