/*

 * Tue Mar 03 14:08:17 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.tree.AbstractInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.LdcInsnNode;
import org.mockito.asm.tree.MultiANewArrayInsnNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicVerifier_ESTest extends BasicVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      LabelNode labelNode0 = new LabelNode();
      basicVerifier0.copyOperation(labelNode0, (Value) null);
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
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode(basicVerifier0);
      Value value0 = basicVerifier0.newOperation(ldcInsnNode0);
      BasicValue basicValue0 = (BasicValue)basicVerifier0.copyOperation(ldcInsnNode0, value0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      MultiANewArrayInsnNode multiANewArrayInsnNode0 = new MultiANewArrayInsnNode("", 13);
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      basicVerifier0.copyOperation(multiANewArrayInsnNode0, basicValue0);
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(13).when(abstractInsnNode0).getOpcode();
      Value value0 = basicVerifier0.newOperation(abstractInsnNode0);
      assertNotSame(value0, basicValue0);
  }
}
