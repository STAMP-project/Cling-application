/*

 * Tue Mar 03 14:01:05 GMT 2020
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
import org.mockito.asm.tree.TypeInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(30);
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertTrue(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(43, "", "", "J");
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(27, "2;7pELA4=lc_Hr");
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(31, "", "", "Ljava/l5ng/Object;");
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertEquals(2, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(33, "-", "-", "Ljava/lang/Object;");
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(40);
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(41, "6IB", "6IB", "Ljava/l5ng/Object;");
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertEquals(2, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(25, "", "", "Ljava/lang/Object;");
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      try { 
        simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected an object reference, but found J
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(128, (-4154));
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(intInsnNode0, (Value) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(22, "-", "-", "Ljava/lang/Object;");
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(42, "5", "5", "5");
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(32, "2;7pELA4=lc_Hr");
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(119, (-4156));
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(intInsnNode0, (Value) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.tree.analysis.SimpleVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      LabelNode labelNode0 = new LabelNode();
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(47, labelNode0);
      Value value0 = simpleVerifier0.newValue((Type) null);
      Value value1 = simpleVerifier0.copyOperation(jumpInsnNode0, value0);
      assertSame(value0, value1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(21, "-", "-", "Ljava/l5ng/Object;");
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      try { 
        simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected I, but found J
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }
}
