/*

 * Tue Mar 03 14:01:03 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Type;
import org.mockito.asm.tree.FieldInsnNode;
import org.mockito.asm.tree.InsnNode;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.JumpInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(43);
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertTrue(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(47, 3);
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(39, 2);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.SHORT_TYPE;
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(27, "Ljava/lang/Object;", "Ljava/lang/Object;", "Internal error.");
      BasicValue basicValue0 = new BasicValue(type0);
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(31, (LabelNode) null);
      Value value0 = simpleVerifier0.copyOperation(jumpInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(29);
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.SHORT_TYPE;
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(48, "First argument", "First argument", "Internal error.");
      BasicValue basicValue0 = new BasicValue(type0);
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(41, 2);
      intInsnNode0.setOpcode(40);
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertTrue(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(46);
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(26);
      Value value0 = simpleVerifier0.copyOperation(insnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(41, 2);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(42, 42);
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertTrue(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(38);
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(28, 3);
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(39, 2);
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
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(45, 45);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }
}
