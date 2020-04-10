/*

 * Tue Mar 03 14:00:59 GMT 2020
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
import org.mockito.asm.Label;
import org.mockito.asm.Type;
import org.mockito.asm.tree.InsnNode;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.JumpInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.TypeInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.SourceValue;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      IntInsnNode intInsnNode0 = new IntInsnNode(30, 6);
      BasicValue basicValue0 = new BasicValue(type0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertEquals(2, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      LinkedHashSet<BasicValue> linkedHashSet0 = new LinkedHashSet<BasicValue>();
      SourceValue sourceValue0 = new SourceValue((-446), linkedHashSet0);
      Value value0 = basicVerifier0.getElementValue(sourceValue0);
      LabelNode labelNode0 = new LabelNode();
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(43, labelNode0);
      Value value1 = basicVerifier0.copyOperation(jumpInsnNode0, value0);
      assertEquals(1, value1.getSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Type type0 = Type.VOID_TYPE;
      IntInsnNode intInsnNode0 = new IntInsnNode(47, 6);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      LabelNode labelNode0 = new LabelNode();
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(29, labelNode0);
      Value value0 = simpleVerifier0.copyOperation(jumpInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(126);
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(insnNode0, basicValue0);
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
      Type type0 = Type.DOUBLE_TYPE;
      IntInsnNode intInsnNode0 = new IntInsnNode(37, 6);
      BasicValue basicValue0 = new BasicValue(type0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      IntInsnNode intInsnNode0 = new IntInsnNode(33, 6);
      BasicValue basicValue0 = new BasicValue(type0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(46, "B");
      SourceValue sourceValue0 = new SourceValue((-567), typeInsnNode0);
      Value value0 = simpleVerifier0.copyOperation(typeInsnNode0, sourceValue0);
      assertSame(value0, sourceValue0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue(type0);
      InsnNode insnNode0 = new InsnNode(123);
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(insnNode0, value0);
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
      Type type0 = Type.FLOAT_TYPE;
      IntInsnNode intInsnNode0 = new IntInsnNode(45, 6);
      BasicValue basicValue0 = new BasicValue(type0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Label label0 = new Label();
      LabelNode labelNode0 = new LabelNode(label0);
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(35, labelNode0);
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(jumpInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      IntInsnNode intInsnNode0 = new IntInsnNode(36, 6);
      BasicValue basicValue0 = new BasicValue(type0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, false);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, linkedList0, false);
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      IntInsnNode intInsnNode0 = new IntInsnNode(127, 623);
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
  public void test13()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(24);
      try { 
        simpleVerifier0.copyOperation(insnNode0, (Value) null);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected D, but found null
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      IntInsnNode intInsnNode0 = new IntInsnNode(42, 334);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      IntInsnNode intInsnNode0 = new IntInsnNode(38, 6);
      BasicValue basicValue0 = new BasicValue(type0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Label label0 = new Label();
      LabelNode labelNode0 = new LabelNode(label0);
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(31, labelNode0);
      SourceValue sourceValue0 = new SourceValue(8);
      SourceValue sourceValue1 = (SourceValue)simpleVerifier0.copyOperation(jumpInsnNode0, sourceValue0);
      assertEquals(8, sourceValue1.size);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      IntInsnNode intInsnNode0 = new IntInsnNode(28, 334);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }
}
