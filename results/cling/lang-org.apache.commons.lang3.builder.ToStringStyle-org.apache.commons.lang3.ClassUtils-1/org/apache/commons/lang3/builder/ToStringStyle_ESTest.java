/*

 * Tue Mar 03 16:09:59 GMT 2020
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
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      toStringStyle0.appendEnd(stringBuffer0, (Object) null);
      assertEquals(40, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[]", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = new Boolean("USu|`i\"&");
      toStringStyle0.append(stringBuffer0, "USu|`i\"&", (Object) toStringStyle0, boolean0);
      ToStringStyle.unregister("USu|`i\"&");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) toStringStyle0;
      toStringStyle0.append(stringBuffer0, "'jM[/|g9vGI2CI", objectArray0, (Boolean) null);
      assertEquals(136, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle.register((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = Boolean.FALSE;
      toStringStyle0.append(stringBuffer0, "I", (Object) toStringStyle0, boolean0);
      assertEquals("<ToStringStyle.NoFieldNameToStringStyle>,", stringBuffer0.toString());
      assertEquals(41, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      toStringStyle0.appendSuper(stringBuffer0, "java.lang.Integer");
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
      assertEquals(39, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, stringBuffer0);
      Boolean boolean0 = Boolean.valueOf("[]");
      toStringStyle0.append(stringBuffer0, "[]", (Object) toStringStyle0, boolean0);
      assertEquals("StringBuffer[[]=<ToStringStyle.ShortPrefixToStringStyle>,", stringBuffer0.toString());
      assertEquals(57, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendSuper(stringBuffer0, "[]");
      Boolean boolean0 = Boolean.valueOf("[]");
      toStringStyle0.append(stringBuffer0, "[]", (Object) toStringStyle0, boolean0);
      assertEquals(44, stringBuffer0.length());
      assertEquals("[]=<ToStringStyle.ShortPrefixToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendSuper(stringBuffer0, (String) null);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      Boolean boolean0 = new Boolean((String) null);
      standardToStringStyle0.append(stringBuffer0, (String) null, (Object) toStringStyle0, boolean0);
      assertEquals("<ToStringStyle.NoFieldNameToStringStyle>,", stringBuffer0.toString());
      assertEquals(41, stringBuffer0.length());
  }
}
