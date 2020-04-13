/*

 * Tue Mar 03 14:08:39 GMT 2020
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
import org.mockito.asm.tree.AbstractInsnNode;
import org.mockito.asm.tree.FieldInsnNode;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.JumpInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.LdcInsnNode;
import org.mockito.asm.tree.MultiANewArrayInsnNode;
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
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(33, (LabelNode) null);
      Value value0 = basicVerifier0.copyOperation(jumpInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(22, 22);
      try { 
        basicVerifier0.copyOperation(intInsnNode0, (Value) null);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected J, but found null
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(32).when(abstractInsnNode0).getOpcode();
      basicVerifier0.copyOperation(abstractInsnNode0, basicValue0);
      MultiANewArrayInsnNode multiANewArrayInsnNode0 = new MultiANewArrayInsnNode("", 7);
      LinkedList<FieldInsnNode> linkedList0 = new LinkedList<FieldInsnNode>();
      // Undeclared exception!
      try { 
        basicVerifier0.naryOperation(multiANewArrayInsnNode0, linkedList0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(28).when(abstractInsnNode0).getOpcode();
      basicVerifier0.copyOperation(abstractInsnNode0, basicValue0);
      MultiANewArrayInsnNode multiANewArrayInsnNode0 = new MultiANewArrayInsnNode("[C", (-227));
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(multiANewArrayInsnNode0);
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
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(28).when(abstractInsnNode0).getOpcode();
      basicVerifier0.copyOperation(abstractInsnNode0, basicValue0);
      MultiANewArrayInsnNode multiANewArrayInsnNode0 = new MultiANewArrayInsnNode("[C", (-227));
      LinkedList<SourceValue> linkedList0 = new LinkedList<SourceValue>();
      Value value0 = basicVerifier0.naryOperation(multiANewArrayInsnNode0, linkedList0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(32).when(abstractInsnNode0).getOpcode();
      basicVerifier0.copyOperation(abstractInsnNode0, basicValue0);
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode(value0);
      BasicValue basicValue1 = (BasicValue)basicVerifier0.newOperation(ldcInsnNode0);
      assertTrue(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(32).when(abstractInsnNode0).getOpcode();
      basicVerifier0.copyOperation(abstractInsnNode0, basicValue0);
      LabelNode labelNode0 = new LabelNode();
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
  public void test7()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      Value value1 = basicVerifier0.getElementValue(value0);
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(32).when(abstractInsnNode0).getOpcode();
      Value value2 = basicVerifier0.copyOperation(abstractInsnNode0, value1);
      Value value3 = basicVerifier0.getElementValue(value2);
      basicVerifier0.isSubTypeOf(value2, value0);
      basicVerifier0.isArrayValue(value1);
      basicVerifier0.isArrayValue(value1);
      AbstractInsnNode abstractInsnNode1 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(194, 0).when(abstractInsnNode1).getOpcode();
      // Undeclared exception!
      try { 
        basicVerifier0.unaryOperation(abstractInsnNode1, value3);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicInterpreter", e);
      }
  }
}
