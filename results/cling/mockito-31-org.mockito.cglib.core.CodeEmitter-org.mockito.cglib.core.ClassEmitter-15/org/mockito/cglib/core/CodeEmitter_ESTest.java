/*

 * Tue Mar 03 14:35:29 GMT 2020
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
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("iPe_qW", ".V)x");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 135, signature0, typeArray0);
      Label label0 = codeEmitter0.mark();
      codeEmitter0.if_cmp(type0, 127, label0);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("iPe_qW", ".V)x");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 135, signature0, typeArray0);
      Label label0 = codeEmitter0.mark();
      codeEmitter0.if_cmp(type0, 155, label0);
      assertEquals(1, type0.getSize());
  }
}
