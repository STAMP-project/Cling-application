/*

 * Tue Mar 03 14:08:14 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.Label;
import org.mockito.asm.Type;
import org.mockito.asm.tree.AbstractInsnNode;
import org.mockito.asm.tree.InsnNode;
import org.mockito.asm.tree.JumpInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.LdcInsnNode;
import org.mockito.asm.tree.LookupSwitchInsnNode;
import org.mockito.asm.tree.MultiANewArrayInsnNode;
import org.mockito.asm.tree.VarInsnNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.SourceValue;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicVerifier_ESTest extends BasicVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      MultiANewArrayInsnNode multiANewArrayInsnNode0 = new MultiANewArrayInsnNode("pit", 153);
      Type type0 = Type.LONG_TYPE;
      BasicValue basicValue0 = new BasicValue(type0);
      basicVerifier0.copyOperation(multiANewArrayInsnNode0, basicValue0);
      LinkedList<SourceValue> linkedList0 = new LinkedList<SourceValue>();
      // Undeclared exception!
      try { 
        basicVerifier0.naryOperation(multiANewArrayInsnNode0, linkedList0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(747).when(abstractInsnNode0).getOpcode();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn("qvdK0[h[C}{-BZG").when(value0).toString();
      basicVerifier0.copyOperation(abstractInsnNode0, value0);
      VarInsnNode varInsnNode0 = new VarInsnNode(218, 2);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(varInsnNode0);
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
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode(basicVerifier0);
      Value value0 = basicVerifier0.newOperation(ldcInsnNode0);
      BasicValue basicValue0 = (BasicValue)basicVerifier0.copyOperation(ldcInsnNode0, value0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      LabelNode labelNode0 = new LabelNode();
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(17, labelNode0);
      basicVerifier0.newOperation(jumpInsnNode0);
      InsnNode insnNode0 = new InsnNode(17);
      BasicValue basicValue1 = (BasicValue)basicVerifier0.copyOperation(insnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Type type0 = Type.BOOLEAN_TYPE;
      Value value0 = basicVerifier0.newValue(type0);
      Label label0 = new Label();
      LabelNode labelNode0 = new LabelNode(label0);
      LabelNode[] labelNodeArray0 = new LabelNode[1];
      LookupSwitchInsnNode lookupSwitchInsnNode0 = new LookupSwitchInsnNode(labelNode0, (int[]) null, labelNodeArray0);
      basicVerifier0.copyOperation(lookupSwitchInsnNode0, value0);
      Value value1 = basicVerifier0.unaryOperation(lookupSwitchInsnNode0, value0);
      assertNull(value1);
  }
}
