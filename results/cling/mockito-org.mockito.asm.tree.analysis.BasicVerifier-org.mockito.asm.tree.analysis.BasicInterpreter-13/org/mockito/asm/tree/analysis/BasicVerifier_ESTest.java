/*

 * Tue Mar 03 14:08:08 GMT 2020
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
import org.mockito.asm.tree.FrameNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.TableSwitchInsnNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicVerifier_ESTest extends BasicVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      Value value1 = basicVerifier0.getElementValue(value0);
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(33).when(abstractInsnNode0).getOpcode();
      Value value2 = basicVerifier0.copyOperation(abstractInsnNode0, value1);
      assertEquals(1, value2.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      LabelNode[] labelNodeArray0 = new LabelNode[0];
      TableSwitchInsnNode tableSwitchInsnNode0 = new TableSwitchInsnNode((-5991), (-5991), (LabelNode) null, labelNodeArray0);
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      basicVerifier0.copyOperation(tableSwitchInsnNode0, basicValue0);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(tableSwitchInsnNode0);
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
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(29, "java/lang/Class", "java/lang/Class", "java/lang/Class");
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      BasicValue basicValue1 = (BasicValue)basicVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      Value value1 = basicVerifier0.getElementValue(value0);
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(31).when(abstractInsnNode0).getOpcode();
      basicVerifier0.copyOperation(abstractInsnNode0, value1);
      Object[] objectArray0 = new Object[5];
      FrameNode frameNode0 = new FrameNode(6, 10, objectArray0, 11, objectArray0);
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
}
