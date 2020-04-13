/*

 * Tue Mar 03 14:08:47 GMT 2020
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
import org.mockito.asm.Opcodes;
import org.mockito.asm.Type;
import org.mockito.asm.tree.AbstractInsnNode;
import org.mockito.asm.tree.IincInsnNode;
import org.mockito.asm.tree.InsnNode;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.LdcInsnNode;
import org.mockito.asm.tree.MultiANewArrayInsnNode;
import org.mockito.asm.tree.TableSwitchInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicVerifier_ESTest extends BasicVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(33).when(abstractInsnNode0).getOpcode();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn(".~[e").when(value0).toString();
      basicVerifier0.copyOperation(abstractInsnNode0, value0);
      Integer integer0 = Opcodes.DOUBLE;
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode(integer0);
      BasicValue basicValue0 = (BasicValue)basicVerifier0.newOperation(ldcInsnNode0);
      assertFalse(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Type type0 = Type.BOOLEAN_TYPE;
      Value value0 = basicVerifier0.newValue(type0);
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(23).when(abstractInsnNode0).getOpcode();
      try { 
        basicVerifier0.copyOperation(abstractInsnNode0, value0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected F, but found I
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Type type0 = Type.LONG_TYPE;
      Value value0 = basicVerifier0.newValue(type0);
      IntInsnNode intInsnNode0 = new IntInsnNode(30, 5);
      Value value1 = basicVerifier0.copyOperation(intInsnNode0, value0);
      assertEquals(2, value1.getSize());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(28).when(abstractInsnNode0).getOpcode();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn("").when(value0).toString();
      basicVerifier0.copyOperation(abstractInsnNode0, value0);
      Label label0 = new Label();
      LabelNode labelNode0 = new LabelNode(label0);
      LabelNode[] labelNodeArray0 = new LabelNode[8];
      TableSwitchInsnNode tableSwitchInsnNode0 = new TableSwitchInsnNode(13, 157, labelNode0, labelNodeArray0);
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
      InsnNode insnNode0 = new InsnNode(32);
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn("/").when(value0).toString();
      Value value1 = basicVerifier0.copyOperation(insnNode0, value0);
      assertEquals(0, value1.getSize());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Type type0 = Type.LONG_TYPE;
      MultiANewArrayInsnNode multiANewArrayInsnNode0 = new MultiANewArrayInsnNode("", 2);
      BasicValue basicValue0 = new BasicValue(type0);
      basicVerifier0.copyOperation(multiANewArrayInsnNode0, basicValue0);
      LinkedList<BasicValue> linkedList0 = new LinkedList<BasicValue>();
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
  public void test6()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Type type0 = Type.LONG_TYPE;
      Value value0 = basicVerifier0.newValue(type0);
      IincInsnNode iincInsnNode0 = new IincInsnNode(1, 3);
      basicVerifier0.copyOperation(iincInsnNode0, value0);
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
      Type type0 = Type.LONG_TYPE;
      Value value0 = basicVerifier0.newValue(type0);
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(33).when(abstractInsnNode0).getOpcode();
      basicVerifier0.copyOperation(abstractInsnNode0, value0);
      Label label0 = new Label();
      LabelNode labelNode0 = new LabelNode(label0);
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
  public void test8()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(28).when(abstractInsnNode0).getOpcode();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn("").when(value0).toString();
      basicVerifier0.copyOperation(abstractInsnNode0, value0);
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode("");
      BasicValue basicValue0 = (BasicValue)basicVerifier0.newOperation(ldcInsnNode0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(7, (-283));
      Value value0 = basicVerifier0.newOperation(intInsnNode0);
      LabelNode labelNode0 = new LabelNode();
      LabelNode[] labelNodeArray0 = new LabelNode[15];
      TableSwitchInsnNode tableSwitchInsnNode0 = new TableSwitchInsnNode(133, (-283), labelNode0, labelNodeArray0);
      basicVerifier0.unaryOperation(tableSwitchInsnNode0, value0);
      Value value1 = basicVerifier0.copyOperation(labelNode0, (Value) null);
      assertNull(value1);
  }
}
