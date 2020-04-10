/*

 * Tue Mar 03 14:01:35 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
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
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.TypeInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(43);
      BasicValue basicValue0 = new BasicValue(type0);
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(47, (String) null);
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue(type0);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(6, "Ljava/lang/Object;", "Ljava/lang/Object;", "Ljava/lang/Object;");
      fieldInsnNode0.setOpcode(39);
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.copyOperation(fieldInsnNode0, value0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, linkedList0, true);
      InsnNode insnNode0 = new InsnNode(31);
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(119, "[D", "[D", "[D");
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      Value value0 = simpleVerifier0.unaryOperation(methodInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      BasicValue basicValue0 = new BasicValue(type0);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(40, "Ljava/langString;", "Ljava/lang/String;", "Ljava/lang/String;");
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertTrue(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      InsnNode insnNode0 = new InsnNode(46);
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      Value value0 = simpleVerifier0.newValue(type0);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(44, "Ljava/lang/String;", "Ljava/lang/String;", "");
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.copyOperation(fieldInsnNode0, value0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(41);
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      Value value0 = simpleVerifier0.newValue(type0);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(36, "Ljava/lang/String;", "Ljava/lang/String;", "B");
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.copyOperation(fieldInsnNode0, value0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, linkedList0, true);
      IntInsnNode intInsnNode0 = new IntInsnNode(24, 64);
      try { 
        simpleVerifier0.copyOperation(intInsnNode0, (Value) null);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected D, but found null
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Label label0 = new Label();
      LabelNode labelNode0 = new LabelNode(label0);
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(34, labelNode0);
      Value value0 = simpleVerifier0.copyOperation(jumpInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      LabelNode labelNode0 = new LabelNode();
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(42, labelNode0);
      Value value0 = simpleVerifier0.copyOperation(jumpInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(32, "LocalVariableTable", "LocalVariableTable", "LocalVariableTable");
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, linkedList0, false);
      InsnNode insnNode0 = new InsnNode(38);
      BasicValue basicValue0 = new BasicValue(type0);
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      Value value0 = simpleVerifier0.newValue(type0);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(44, "Ljava/lang/String;", "Ljava/lang/String;", "");
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(fieldInsnNode0, value0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }
}
