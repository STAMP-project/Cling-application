/*

 * Tue Mar 03 14:08:18 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.LdcInsnNode;
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicVerifier_ESTest extends BasicVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(29, 53);
      Value value0 = basicVerifier0.copyOperation(intInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode(basicVerifier0);
      Value value0 = basicVerifier0.newOperation(ldcInsnNode0);
      BasicValue basicValue0 = (BasicValue)basicVerifier0.copyOperation(ldcInsnNode0, value0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(53, 187);
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      basicVerifier0.copyOperation(intInsnNode0, basicValue0);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(intInsnNode0);
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
      IntInsnNode intInsnNode0 = new IntInsnNode(187, 187);
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      basicVerifier0.copyOperation(intInsnNode0, basicValue0);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(intInsnNode0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mockito.asm.tree.IntInsnNode cannot be cast to org.mockito.asm.tree.TypeInsnNode
         //
         verifyException("org.mockito.asm.tree.analysis.BasicInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(141, "}6<.QDr&(sb03OCH", "}6<.QDr&(sb03OCH", "}6<.QDr&(sb03OCH");
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      basicVerifier0.unaryOperation(methodInsnNode0, basicValue0);
      BasicValue basicValue1 = (BasicValue)basicVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }
}
