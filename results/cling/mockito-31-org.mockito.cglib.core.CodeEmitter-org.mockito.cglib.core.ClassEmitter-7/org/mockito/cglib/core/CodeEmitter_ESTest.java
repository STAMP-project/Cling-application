/*

 * Tue Mar 03 14:37:03 GMT 2020
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
import org.mockito.cglib.core.Block;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;
import org.mockito.cglib.core.Signature;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CodeEmitter_ESTest extends CodeEmitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("`)z$x\"nTz&T>P w041F", "`)z$x\"nTz&T>P w041F");
      Type[] typeArray0 = new Type[19];
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(type0).getSort();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      Block block0 = codeEmitter0.begin_block();
      Label label0 = block0.getStart();
      codeEmitter0.if_cmp(type0, 7, label0);
      assertEquals(126, CodeEmitter.AND);
  }
}
