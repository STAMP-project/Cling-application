/*

 * Tue Mar 03 14:08:00 GMT 2020
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
import org.mockito.asm.tree.FieldInsnNode;
import org.mockito.asm.tree.IincInsnNode;
import org.mockito.asm.tree.JumpInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.TypeInsnNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicVerifier_ESTest extends BasicVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn((-904)).when(abstractInsnNode0).getOpcode();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn("/9KI#").when(value0).toString();
      Value value1 = basicVerifier0.copyOperation(abstractInsnNode0, value0);
      Value value2 = basicVerifier0.getElementValue(value1);
      AbstractInsnNode abstractInsnNode1 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(27).when(abstractInsnNode1).getOpcode();
      BasicValue basicValue0 = (BasicValue)basicVerifier0.copyOperation(abstractInsnNode1, value2);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(168, "~ y");
      basicVerifier0.newOperation(typeInsnNode0);
      LabelNode labelNode0 = new LabelNode();
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(44, labelNode0);
      Value value0 = basicVerifier0.copyOperation(jumpInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn((-3088)).when(abstractInsnNode0).getOpcode();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn("{Rd@&0qTeaiwyhk").when(value0).toString();
      basicVerifier0.copyOperation(abstractInsnNode0, value0);
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(180, "+*T}n ~IzVX<");
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(typeInsnNode0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(2723, "ConstantValue");
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(12, "~ y", "=SY?XRf{ o 1;LRAA", "!q4/U%?j`$6");
      Value value0 = basicVerifier0.newOperation(fieldInsnNode0);
      Value value1 = basicVerifier0.copyOperation(typeInsnNode0, value0);
      assertSame(value1, value0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      IincInsnNode iincInsnNode0 = new IincInsnNode((-1022), (-4442));
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      Value value0 = basicVerifier0.unaryOperation(iincInsnNode0, basicValue0);
      Value value1 = basicVerifier0.copyOperation(iincInsnNode0, value0);
      assertEquals(1, value1.getSize());
  }
}
