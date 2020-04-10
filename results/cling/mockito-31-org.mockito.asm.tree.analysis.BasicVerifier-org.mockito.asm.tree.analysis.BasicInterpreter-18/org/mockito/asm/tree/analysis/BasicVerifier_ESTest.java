/*

 * Tue Mar 03 14:08:41 GMT 2020
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
import org.mockito.asm.tree.InsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.LdcInsnNode;
import org.mockito.asm.tree.LookupSwitchInsnNode;
import org.mockito.asm.tree.TableSwitchInsnNode;
import org.mockito.asm.tree.TypeInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.SourceValue;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicVerifier_ESTest extends BasicVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(21).when(abstractInsnNode0).getOpcode();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(value0).toString();
      try { 
        basicVerifier0.copyOperation(abstractInsnNode0, value0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected I, but found null
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      LabelNode labelNode0 = new LabelNode();
      int[] intArray0 = new int[0];
      LabelNode[] labelNodeArray0 = new LabelNode[0];
      LookupSwitchInsnNode lookupSwitchInsnNode0 = new LookupSwitchInsnNode(labelNode0, intArray0, labelNodeArray0);
      SourceValue sourceValue0 = new SourceValue(3);
      basicVerifier0.copyOperation(lookupSwitchInsnNode0, sourceValue0);
      TableSwitchInsnNode tableSwitchInsnNode0 = new TableSwitchInsnNode(7, 2, labelNode0, labelNodeArray0);
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
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(28).when(abstractInsnNode0).getOpcode();
      LabelNode labelNode0 = new LabelNode();
      LabelNode[] labelNodeArray0 = new LabelNode[4];
      TableSwitchInsnNode tableSwitchInsnNode0 = new TableSwitchInsnNode(28, 4, labelNode0, labelNodeArray0);
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      basicVerifier0.unaryOperation(tableSwitchInsnNode0, basicValue0);
      Value value0 = basicVerifier0.copyOperation(abstractInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(28).when(abstractInsnNode0).getOpcode();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn("OM(").when(value0).toString();
      basicVerifier0.copyOperation(abstractInsnNode0, value0);
      LabelNode labelNode0 = new LabelNode();
      LabelNode[] labelNodeArray0 = new LabelNode[0];
      TableSwitchInsnNode tableSwitchInsnNode0 = new TableSwitchInsnNode(7, 2, labelNode0, labelNodeArray0);
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
  public void test4()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn((-473)).when(abstractInsnNode0).getOpcode();
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      basicVerifier0.copyOperation(abstractInsnNode0, basicValue0);
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(12, "o6C?/);");
      Value value0 = basicVerifier0.newOperation(typeInsnNode0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode(basicVerifier0);
      Value value0 = basicVerifier0.newOperation(ldcInsnNode0);
      BasicValue basicValue0 = (BasicValue)basicVerifier0.copyOperation(ldcInsnNode0, value0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      LabelNode labelNode0 = new LabelNode();
      LabelNode[] labelNodeArray0 = new LabelNode[4];
      TableSwitchInsnNode tableSwitchInsnNode0 = new TableSwitchInsnNode(146, 4, labelNode0, labelNodeArray0);
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      basicVerifier0.unaryOperation(tableSwitchInsnNode0, basicValue0);
      InsnNode insnNode0 = new InsnNode(2);
      BasicValue basicValue1 = (BasicValue)basicVerifier0.copyOperation(insnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }
}
