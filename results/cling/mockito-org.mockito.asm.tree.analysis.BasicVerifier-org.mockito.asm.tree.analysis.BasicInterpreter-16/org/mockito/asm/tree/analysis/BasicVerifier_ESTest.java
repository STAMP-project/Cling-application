/*

 * Tue Mar 03 14:08:17 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.tree.FrameNode;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.VarInsnNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicVerifier_ESTest extends BasicVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      FrameNode frameNode0 = new FrameNode(18, 5, (Object[]) null, 0, (Object[]) null);
      basicVerifier0.copyOperation(frameNode0, (Value) null);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(frameNode0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(8, 9);
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      Value value0 = basicVerifier0.copyOperation(varInsnNode0, basicValue0);
      varInsnNode0.setOpcode(14);
      Value value1 = basicVerifier0.newOperation(varInsnNode0);
      assertNotSame(value1, value0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Object[] objectArray0 = new Object[1];
      FrameNode frameNode0 = new FrameNode((-90), 2195, objectArray0, 2195, objectArray0);
      IntInsnNode intInsnNode0 = new IntInsnNode(13, 151);
      Value value0 = basicVerifier0.newOperation(intInsnNode0);
      Value value1 = basicVerifier0.copyOperation(frameNode0, value0);
      assertSame(value1, value0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(178, "null", "Second argument", "null");
      basicVerifier0.copyOperation(methodInsnNode0, (Value) null);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(methodInsnNode0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mockito.asm.tree.MethodInsnNode cannot be cast to org.mockito.asm.tree.FieldInsnNode
         //
         verifyException("org.mockito.asm.tree.analysis.BasicInterpreter", e);
      }
  }
}
