/*

 * Tue Mar 03 14:08:00 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Label;
import org.mockito.asm.tree.JumpInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.LdcInsnNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicVerifier_ESTest extends BasicVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode(basicVerifier0);
      basicVerifier0.copyOperation(ldcInsnNode0, basicValue0);
      BasicValue basicValue1 = (BasicValue)basicVerifier0.newOperation(ldcInsnNode0);
      assertTrue(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      Label label0 = new Label();
      LabelNode labelNode0 = new LabelNode(label0);
      basicVerifier0.copyOperation(labelNode0, basicValue0);
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

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode(basicVerifier0);
      basicVerifier0.copyOperation(ldcInsnNode0, basicValue0);
      Label label0 = new Label();
      LabelNode labelNode0 = new LabelNode(label0);
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(178, labelNode0);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(jumpInsnNode0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mockito.asm.tree.JumpInsnNode cannot be cast to org.mockito.asm.tree.FieldInsnNode
         //
         verifyException("org.mockito.asm.tree.analysis.BasicInterpreter", e);
      }
  }
}
