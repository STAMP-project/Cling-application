/*

 * Tue Mar 03 14:08:06 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.Type;
import org.mockito.asm.tree.AbstractInsnNode;
import org.mockito.asm.tree.FieldInsnNode;
import org.mockito.asm.tree.IincInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.LdcInsnNode;
import org.mockito.asm.tree.LineNumberNode;
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.MultiANewArrayInsnNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.SourceValue;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicVerifier_ESTest extends BasicVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(27, "", "", "");
      Value value0 = basicVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      LabelNode labelNode0 = new LabelNode();
      LineNumberNode lineNumberNode0 = new LineNumberNode(9, labelNode0);
      basicVerifier0.copyOperation(lineNumberNode0, basicValue0);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(lineNumberNode0);
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
      doReturn(31).when(abstractInsnNode0).getOpcode();
      LinkedHashSet<MethodInsnNode> linkedHashSet0 = new LinkedHashSet<MethodInsnNode>();
      SourceValue sourceValue0 = new SourceValue(14, linkedHashSet0);
      Value value0 = basicVerifier0.copyOperation(abstractInsnNode0, sourceValue0);
      assertEquals(14, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn((-2571)).when(abstractInsnNode0).getOpcode();
      basicVerifier0.copyOperation(abstractInsnNode0, (Value) null);
      MultiANewArrayInsnNode multiANewArrayInsnNode0 = new MultiANewArrayInsnNode("Argument ", 49);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        basicVerifier0.naryOperation(multiANewArrayInsnNode0, linkedList0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(30).when(abstractInsnNode0).getOpcode();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Class<Object> class0 = Object.class;
      Type type0 = Type.getType(class0);
      Value value0 = basicVerifier0.newValue(type0);
      basicVerifier0.copyOperation(abstractInsnNode0, value0);
      MultiANewArrayInsnNode multiANewArrayInsnNode0 = new MultiANewArrayInsnNode("'", 11);
      // Undeclared exception!
      try { 
        basicVerifier0.naryOperation(multiANewArrayInsnNode0, linkedList0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(30).when(abstractInsnNode0).getOpcode();
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      basicVerifier0.copyOperation(abstractInsnNode0, basicValue0);
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode((Object) null);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(ldcInsnNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.tree.analysis.BasicInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(32).when(abstractInsnNode0).getOpcode();
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      Value value0 = basicVerifier0.copyOperation(abstractInsnNode0, basicValue0);
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode(value0);
      BasicValue basicValue1 = (BasicValue)basicVerifier0.newOperation(ldcInsnNode0);
      assertTrue(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(30).when(abstractInsnNode0).getOpcode();
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      basicVerifier0.copyOperation(abstractInsnNode0, basicValue0);
      LabelNode labelNode0 = new LabelNode();
      LineNumberNode lineNumberNode0 = new LineNumberNode(9, labelNode0);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(lineNumberNode0);
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
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      IincInsnNode iincInsnNode0 = new IincInsnNode(72, 34);
      basicVerifier0.copyOperation(iincInsnNode0, basicValue0);
      BasicValue basicValue1 = (BasicValue)basicVerifier0.unaryOperation(iincInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }
}
