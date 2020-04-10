/*

 * Tue Mar 03 14:01:31 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Label;
import org.mockito.asm.Type;
import org.mockito.asm.tree.InsnNode;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.JumpInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.TypeInsnNode;
import org.mockito.asm.tree.VarInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.SourceValue;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(47, "[I", "[I", "Owl");
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(27);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Label label0 = new Label();
      LabelNode labelNode0 = new LabelNode(label0);
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(23, labelNode0);
      try { 
        simpleVerifier0.copyOperation(jumpInsnNode0, (Value) null);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected F, but found null
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(29, "org.mockito.asm.tree.analysis.BasicValue", "org.mockito.asm.tree.analysis.BasicValue", "org.mockito.asm.tree.analysis.BasicValue");
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VarInsnNode varInsnNode0 = new VarInsnNode(33, 197);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      SourceValue sourceValue0 = new SourceValue(10);
      Value value0 = simpleVerifier0.copyOperation(varInsnNode0, sourceValue0);
      assertSame(sourceValue0, value0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(46);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(44);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(45, "[Ljava/lang/Object\";");
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
      assertEquals(2, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(41);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(36, 9);
      Type type0 = Type.BYTE_TYPE;
      Value value0 = simpleVerifier0.newValue(type0);
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.copyOperation(intInsnNode0, value0);
      assertFalse(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(24, 24);
      Type type0 = Type.BYTE_TYPE;
      Value value0 = simpleVerifier0.newValue(type0);
      try { 
        simpleVerifier0.copyOperation(intInsnNode0, value0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected D, but found I
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(32);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(38);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(28, (-2517));
      Value value0 = simpleVerifier0.copyOperation(varInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      LabelNode labelNode0 = new LabelNode();
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(labelNode0, basicValue0);
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
      IntInsnNode intInsnNode0 = new IntInsnNode(39, 9);
      Type type0 = Type.BYTE_TYPE;
      Value value0 = simpleVerifier0.newValue(type0);
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.copyOperation(intInsnNode0, value0);
      assertFalse(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(21);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      try { 
        simpleVerifier0.copyOperation(insnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected I, but found .
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }
}
