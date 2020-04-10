/*

 * Tue Mar 03 14:08:03 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.tree.AbstractInsnNode;
import org.mockito.asm.tree.FieldInsnNode;
import org.mockito.asm.tree.LdcInsnNode;
import org.mockito.asm.tree.MultiANewArrayInsnNode;
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
      doReturn(0).when(abstractInsnNode0).getOpcode();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn("java/lang/Throwable").when(value0).toString();
      basicVerifier0.copyOperation(abstractInsnNode0, value0);
      MultiANewArrayInsnNode multiANewArrayInsnNode0 = new MultiANewArrayInsnNode("java/lang/Throwable", 1);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        basicVerifier0.naryOperation(multiANewArrayInsnNode0, linkedList0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 19
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(abstractInsnNode0).getOpcode();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn("java/lang/Throwable").when(value0).toString();
      basicVerifier0.copyOperation(abstractInsnNode0, value0);
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(11, "java/lang/Throwable");
      Value value1 = basicVerifier0.newOperation(typeInsnNode0);
      assertEquals(1, value1.getSize());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn((-1422), 1242).when(abstractInsnNode0).getOpcode();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn("an array reference").when(value0).toString();
      basicVerifier0.copyOperation(abstractInsnNode0, value0);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(abstractInsnNode0);
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
      HashMap<FieldInsnNode, Integer> hashMap0 = new HashMap<FieldInsnNode, Integer>();
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode(hashMap0);
      Value value0 = basicVerifier0.newOperation(ldcInsnNode0);
      BasicValue basicValue0 = (BasicValue)basicVerifier0.copyOperation(ldcInsnNode0, value0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(13, "java/lang/Throwable");
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      Value value0 = basicVerifier0.copyOperation(typeInsnNode0, basicValue0);
      Value value1 = basicVerifier0.newOperation(typeInsnNode0);
      assertNotSame(value1, value0);
  }
}
