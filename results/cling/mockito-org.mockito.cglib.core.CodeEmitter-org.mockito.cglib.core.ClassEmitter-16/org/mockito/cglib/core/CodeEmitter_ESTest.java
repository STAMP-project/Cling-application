/*

 * Tue Mar 03 14:35:16 GMT 2020
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.Label;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;
import org.mockito.cglib.core.Signature;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CodeEmitter_ESTest extends CodeEmitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("b)/LfLQfLX <L53i'._", "b)/LfLQfLX <L53i'._");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, (Type[]) null);
      Label label0 = codeEmitter0.make_label();
      codeEmitter0.if_icmp(116, label0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("4Hqfb?GECZ+", "b)/LfLQfLX <L53i'._");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-516), signature0, (Type[]) null);
      Label label0 = codeEmitter0.mark();
      codeEmitter0.if_icmp(155, label0);
      assertEquals(158, CodeEmitter.LE);
  }
}
