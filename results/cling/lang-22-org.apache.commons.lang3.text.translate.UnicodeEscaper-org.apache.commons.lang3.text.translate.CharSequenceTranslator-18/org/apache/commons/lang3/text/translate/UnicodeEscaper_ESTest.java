/*

 * Tue Mar 03 15:53:01 GMT 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class UnicodeEscaper_ESTest extends UnicodeEscaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(35);
      String string0 = unicodeEscaper0.translate((CharSequence) "FFFFFFFF");
      assertNotNull(string0);
      assertEquals("\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046\\u0046", string0);
  }
}
