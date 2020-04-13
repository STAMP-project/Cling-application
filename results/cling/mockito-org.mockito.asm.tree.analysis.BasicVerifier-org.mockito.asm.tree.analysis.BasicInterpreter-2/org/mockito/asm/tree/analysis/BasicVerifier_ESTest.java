/*

 * Tue Mar 03 14:07:56 GMT 2020
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
import org.mockito.asm.tree.IincInsnNode;
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
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
      doReturn(23).when(abstractInsnNode0).getOpcode();
      try { 
        basicVerifier0.copyOperation(abstractInsnNode0, value1);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected F, but found R
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(33, "org.mockito.asm.Edge", "org.mockito.asm.Edge", "org.mockito.asm.Edge");
      methodInsnNode0.setOpcode(42);
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      basicVerifier0.copyOperation(methodInsnNode0, basicValue0);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(methodInsnNode0);
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
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(33, "org.mockito.asm.Edge", "org.mockito.asm.Edge", "org.mockito.asm.Edge");
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      basicVerifier0.copyOperation(methodInsnNode0, basicValue0);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(methodInsnNode0);
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
      IincInsnNode iincInsnNode0 = new IincInsnNode(1, 141);
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      Value value0 = basicVerifier0.copyOperation(iincInsnNode0, basicValue0);
      Value value1 = basicVerifier0.unaryOperation(iincInsnNode0, value0);
      assertSame(value1, basicValue0);
  }
}
