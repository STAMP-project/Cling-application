/*

 * Tue Mar 03 14:08:02 GMT 2020
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
import org.mockito.asm.Type;
import org.mockito.asm.tree.AbstractInsnNode;
import org.mockito.asm.tree.IincInsnNode;
import org.mockito.asm.tree.MultiANewArrayInsnNode;
import org.mockito.asm.tree.TypeInsnNode;
import org.mockito.asm.tree.VarInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicVerifier_ESTest extends BasicVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Value value0 = basicVerifier0.getElementValue((Value) null);
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(22).when(abstractInsnNode0).getOpcode();
      try { 
        basicVerifier0.copyOperation(abstractInsnNode0, value0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected J, but found R
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Type type0 = Type.BOOLEAN_TYPE;
      BasicValue basicValue0 = new BasicValue(type0);
      VarInsnNode varInsnNode0 = new VarInsnNode(679, 8);
      MultiANewArrayInsnNode multiANewArrayInsnNode0 = new MultiANewArrayInsnNode((String) null, 679);
      basicVerifier0.copyOperation(varInsnNode0, basicValue0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        basicVerifier0.naryOperation(multiANewArrayInsnNode0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(30).when(abstractInsnNode0).getOpcode();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(value0).toString();
      basicVerifier0.copyOperation(abstractInsnNode0, value0);
      MultiANewArrayInsnNode multiANewArrayInsnNode0 = new MultiANewArrayInsnNode((String) null, 679);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        basicVerifier0.naryOperation(multiANewArrayInsnNode0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(12, 10);
      basicVerifier0.copyOperation(varInsnNode0, (Value) null);
      Value value0 = basicVerifier0.newOperation(varInsnNode0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      Value value1 = basicVerifier0.getElementValue(value0);
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn((-2838)).when(abstractInsnNode0).getOpcode();
      basicVerifier0.copyOperation(abstractInsnNode0, value1);
      TypeInsnNode typeInsnNode0 = new TypeInsnNode((-1907), "9i&]U");
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
  public void test5()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Type type0 = Type.SHORT_TYPE;
      Value value0 = basicVerifier0.newValue(type0);
      IincInsnNode iincInsnNode0 = new IincInsnNode(5, 8);
      Value value1 = basicVerifier0.unaryOperation(iincInsnNode0, value0);
      BasicValue basicValue0 = (BasicValue)basicVerifier0.copyOperation(iincInsnNode0, value1);
      assertFalse(basicValue0.isReference());
  }
}
