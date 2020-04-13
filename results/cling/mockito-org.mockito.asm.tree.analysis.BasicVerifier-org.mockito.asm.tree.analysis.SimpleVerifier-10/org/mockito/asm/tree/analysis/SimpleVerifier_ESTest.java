/*

 * Tue Mar 03 14:01:25 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.tree.InsnNode;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.JumpInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.VarInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(30, "org.mockito.asm.Opcodes", "org.mockito.asm.Opcodes", "org.mockito.asm.Opcodes");
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      IntInsnNode intInsnNode0 = new IntInsnNode(47, 47);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      IntInsnNode intInsnNode0 = new IntInsnNode(39, 39);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      IntInsnNode intInsnNode0 = new IntInsnNode(122, 122);
      intInsnNode0.setOpcode(31);
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertTrue(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(29, "org.mockito.asm.Opcodes", "org.mockito.asm.Opcodes", "org.mockito.asm.Opcodes");
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      IntInsnNode intInsnNode0 = new IntInsnNode(122, 122);
      intInsnNode0.setOpcode(37);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      VarInsnNode varInsnNode0 = new VarInsnNode(26, 26);
      Value value0 = simpleVerifier0.copyOperation(varInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(44, 44);
      Value value0 = simpleVerifier0.copyOperation(varInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      IntInsnNode intInsnNode0 = new IntInsnNode(35, 35);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(25, 25);
      // Undeclared exception!
      try { 
        simpleVerifier0.copyOperation(varInsnNode0, (Value) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      IntInsnNode intInsnNode0 = new IntInsnNode(24, 24);
      try { 
        simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected D, but found R
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(34, "org.mockito.asm.Opcodes", "org.mockito.asm.Opcodes", "org.mockito.asm.Opcodes");
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      IntInsnNode intInsnNode0 = new IntInsnNode(28, 28);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      BasicVerifier basicVerifier0 = new BasicVerifier();
      LabelNode labelNode0 = new LabelNode();
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(125, labelNode0);
      // Undeclared exception!
      try { 
        basicVerifier0.unaryOperation(jumpInsnNode0, basicValue0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IntInsnNode intInsnNode0 = new IntInsnNode(122, 122);
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(intInsnNode0, basicValue0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(46);
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }
}
