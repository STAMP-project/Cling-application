/*

 * Tue Mar 03 14:01:11 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Type;
import org.mockito.asm.tree.InsnNode;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.TypeInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.SourceValue;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      IntInsnNode intInsnNode0 = new IntInsnNode(47, 4707);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(27, (String) null);
      SourceValue sourceValue0 = new SourceValue(5);
      Value value0 = simpleVerifier0.copyOperation(typeInsnNode0, sourceValue0);
      assertEquals(5, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IntInsnNode intInsnNode0 = new IntInsnNode(31, 31);
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(23, 23);
      try { 
        simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected F, but found A
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      LabelNode labelNode0 = new LabelNode();
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
  public void test05()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      InsnNode insnNode0 = new InsnNode(33);
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      InsnNode insnNode0 = new InsnNode(46);
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertTrue(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(26, (String) null);
      SourceValue sourceValue0 = new SourceValue(5);
      SourceValue sourceValue1 = (SourceValue)simpleVerifier0.copyOperation(typeInsnNode0, sourceValue0);
      assertEquals(5, sourceValue1.size);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IntInsnNode intInsnNode0 = new IntInsnNode(35, 35);
      Type type0 = Type.BOOLEAN_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, false);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(41, (String) null);
      SourceValue sourceValue0 = new SourceValue(5);
      SourceValue sourceValue1 = (SourceValue)simpleVerifier0.copyOperation(typeInsnNode0, sourceValue0);
      assertEquals(5, sourceValue1.size);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      InsnNode insnNode0 = new InsnNode(25);
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(22, 22);
      try { 
        simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected J, but found A
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      InsnNode insnNode0 = new InsnNode(34);
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertTrue(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(42);
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      InsnNode insnNode0 = new InsnNode(38);
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(28, 28);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(126, "R", "Lnull;", "~tY@");
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(methodInsnNode0, basicValue0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      InsnNode insnNode0 = new InsnNode(48);
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertTrue(basicValue1.isReference());
  }
}
