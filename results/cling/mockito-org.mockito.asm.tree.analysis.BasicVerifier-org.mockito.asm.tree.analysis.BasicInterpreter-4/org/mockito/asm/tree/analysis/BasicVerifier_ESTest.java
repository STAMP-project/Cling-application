/*

 * Tue Mar 03 14:08:03 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Label;
import org.mockito.asm.Type;
import org.mockito.asm.tree.FieldInsnNode;
import org.mockito.asm.tree.IincInsnNode;
import org.mockito.asm.tree.JumpInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.LdcInsnNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicVerifier_ESTest extends BasicVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      IincInsnNode iincInsnNode0 = new IincInsnNode(184, 184);
      basicVerifier0.copyOperation(iincInsnNode0, (Value) null);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(11, "", "", "7L!+?ih");
      BasicValue basicValue0 = (BasicValue)basicVerifier0.newOperation(fieldInsnNode0);
      assertFalse(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Label label0 = new Label();
      LabelNode labelNode0 = new LabelNode(label0);
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(13, labelNode0);
      Value value0 = basicVerifier0.newOperation(jumpInsnNode0);
      Value value1 = basicVerifier0.copyOperation(jumpInsnNode0, value0);
      assertEquals(1, value1.getSize());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode("org.mockito.asm.Label");
      Value value0 = basicVerifier0.newOperation(ldcInsnNode0);
      Label label0 = new Label();
      LabelNode labelNode0 = new LabelNode(label0);
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(13, labelNode0);
      BasicValue basicValue0 = (BasicValue)basicVerifier0.copyOperation(jumpInsnNode0, value0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Type type0 = Type.BYTE_TYPE;
      Value value0 = basicVerifier0.newValue(type0);
      LabelNode labelNode0 = new LabelNode();
      basicVerifier0.copyOperation(labelNode0, value0);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(labelNode0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicInterpreter", e);
      }
  }
}
