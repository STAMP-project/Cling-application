/*

 * Tue Mar 03 14:01:32 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Label;
import org.mockito.asm.Type;
import org.mockito.asm.tree.FieldInsnNode;
import org.mockito.asm.tree.InsnNode;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.JumpInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.TypeInsnNode;
import org.mockito.asm.tree.VarInsnNode;
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
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(122, "B", "Lorg.mockito.asm.MethodWriter;", "Lorg.mockito.asm.MethodWriter;");
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(fieldInsnNode0, basicValue0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(43, "@t0", "8@", "h");
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertEquals(2, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      LabelNode labelNode0 = new LabelNode();
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(47, labelNode0);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      SourceValue sourceValue0 = new SourceValue(8, linkedHashSet0);
      Value value0 = basicVerifier0.copyOperation(jumpInsnNode0, sourceValue0);
      assertSame(value0, sourceValue0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(39, "t0", "8@", ":");
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertEquals(2, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(27, 40);
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue((Type) null);
      LabelNode labelNode0 = new LabelNode();
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(31, labelNode0);
      Value value0 = simpleVerifier0.copyOperation(jumpInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(48, "@t0", "8@", "B");
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(34, (-629));
      BasicValue basicValue0 = new BasicValue(type0);
      varInsnNode0.setOpcode(33);
      Value value0 = simpleVerifier0.copyOperation(varInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      Type type0 = Type.BOOLEAN_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, linkedList0, true);
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(40, (String) null);
      Value value0 = simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(46, "Dau)(<", (String) null, "Dau)(<");
      SourceValue sourceValue0 = new SourceValue(9);
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, sourceValue0);
      assertEquals(9, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(26, "t0", "8@", "h");
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertEquals(2, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      InsnNode insnNode0 = new InsnNode(120);
      BasicVerifier basicVerifier0 = new BasicVerifier();
      // Undeclared exception!
      try { 
        basicVerifier0.unaryOperation(insnNode0, basicValue0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(45, 9);
      SourceValue sourceValue0 = new SourceValue(45, varInsnNode0);
      Value value0 = simpleVerifier0.copyOperation(varInsnNode0, sourceValue0);
      assertEquals(45, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(35, 30);
      Value value0 = simpleVerifier0.copyOperation(varInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(41, 41);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      BasicValue basicValue1 = (BasicValue)basicVerifier0.copyOperation(varInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Label label0 = new Label();
      LabelNode labelNode0 = new LabelNode(label0);
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(22, labelNode0);
      SourceValue sourceValue0 = new SourceValue(33);
      try { 
        basicVerifier0.copyOperation(jumpInsnNode0, sourceValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected J, but found org.mockito.asm.tree.analysis.SourceValue@0
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(24, "I/");
      SourceValue sourceValue0 = new SourceValue(3, (Set) null);
      // Undeclared exception!
      try { 
        simpleVerifier0.copyOperation(typeInsnNode0, sourceValue0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.tree.analysis.SourceValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(42, 40);
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(32, 32);
      Value value0 = simpleVerifier0.copyOperation(varInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      SourceValue sourceValue0 = new SourceValue(4);
      VarInsnNode varInsnNode0 = new VarInsnNode(38, 1);
      Value value0 = simpleVerifier0.copyOperation(varInsnNode0, sourceValue0);
      assertSame(sourceValue0, value0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(124, 124);
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(varInsnNode0, basicValue0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(34, (-629));
      BasicValue basicValue0 = new BasicValue(type0);
      Value value0 = simpleVerifier0.copyOperation(varInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.CHAR_TYPE;
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(21, (LabelNode) null);
      BasicValue basicValue0 = new BasicValue(type0);
      try { 
        simpleVerifier0.copyOperation(jumpInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected I, but found C
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }
}
