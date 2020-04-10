/*

 * Tue Mar 03 14:36:47 GMT 2020
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
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
      ClassWriter classWriter0 = new ClassWriter(2248);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "BSLD0l?N70F<'";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(184, "`t>\f#hL`8:^", "BSLD0l?N70F<'", "`t>\f#hL`8:^", stringArray0);
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature(" is not declared in ", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 184, signature0, typeArray0);
      Block block0 = codeEmitter0.begin_block();
      Label label0 = block0.getStart();
      codeEmitter0.if_icmp((-668), label0);
      assertEquals(130, CodeEmitter.XOR);
  }
}
