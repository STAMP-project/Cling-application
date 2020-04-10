/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 12:26:02 GMT 2019
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class UnicodeEscaper_ESTest extends UnicodeEscaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(Integer.MAX_VALUE, 0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = unicodeEscaper0.translate(120, writer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(35);
      UnicodeEscaper unicodeEscaper1 = UnicodeEscaper.below(35);
      CharBuffer charBuffer0 = CharBuffer.allocate(1607);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      assertNotNull(string0);
      
      String string1 = unicodeEscaper1.translate((CharSequence) string0);
      assertFalse(string1.equals((Object)string0));
  }
}
