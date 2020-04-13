/*

 * Tue Mar 03 15:53:09 GMT 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.StringWriter;
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
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(317);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(317);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = unicodeEscaper0.translate(88, writer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(869);
      CharBuffer charBuffer0 = CharBuffer.allocate(869);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals(869, charBuffer0.length());
  }
}
