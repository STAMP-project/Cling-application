/*

 * Tue Mar 03 14:38:32 GMT 2020
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
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("()V").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1, signature0, typeArray0);
      Label label0 = new Label();
      codeEmitter0.if_icmp(1, label0);
      assertEquals(104, CodeEmitter.MUL);
  }
}
