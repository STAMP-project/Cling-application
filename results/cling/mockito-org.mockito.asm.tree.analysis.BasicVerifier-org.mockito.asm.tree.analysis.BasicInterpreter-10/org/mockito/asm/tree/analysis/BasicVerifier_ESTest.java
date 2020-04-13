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
import org.mockito.asm.tree.InsnNode;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.TableSwitchInsnNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicVerifier_ESTest extends BasicVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      InsnNode insnNode0 = new InsnNode(59);
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      basicVerifier0.copyOperation(insnNode0, basicValue0);
      LabelNode labelNode0 = new LabelNode();
      LabelNode[] labelNodeArray0 = new LabelNode[4];
      TableSwitchInsnNode tableSwitchInsnNode0 = new TableSwitchInsnNode((-3464), 8, labelNode0, labelNodeArray0);
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
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      Value value1 = basicVerifier0.getElementValue(value0);
      IntInsnNode intInsnNode0 = new IntInsnNode(199, (-1));
      LabelNode labelNode0 = new LabelNode();
      basicVerifier0.copyOperation(labelNode0, value1);
      Value value2 = basicVerifier0.unaryOperation(intInsnNode0, value1);
      assertNull(value2);
  }
}
