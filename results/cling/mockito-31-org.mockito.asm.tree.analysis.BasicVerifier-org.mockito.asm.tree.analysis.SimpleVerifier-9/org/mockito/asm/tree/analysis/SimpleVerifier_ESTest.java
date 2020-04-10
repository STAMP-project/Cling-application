/*

 * Tue Mar 03 14:01:17 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Type;
import org.mockito.asm.tree.FieldInsnNode;
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
  public void test0()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(23, "Argument ");
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      try { 
        simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected F, but found A
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.LONG_TYPE;
      Value value0 = simpleVerifier0.newValue(type0);
      LabelNode labelNode0 = new LabelNode();
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(26, labelNode0);
      Value value1 = simpleVerifier0.copyOperation(jumpInsnNode0, value0);
      assertEquals(2, value1.getSize());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier((Type) null, (Type) null, linkedList0, false);
      IntInsnNode intInsnNode0 = new IntInsnNode(22, 197);
      SourceValue sourceValue0 = new SourceValue((-3282));
      try { 
        simpleVerifier0.copyOperation(intInsnNode0, sourceValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected J, but found org.mockito.asm.tree.analysis.SourceValue@0
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(34, "");
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<MethodInsnNode> class0 = MethodInsnNode.class;
      Type type0 = Type.getType(class0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(32, 331);
      Value value0 = simpleVerifier0.newValue(type0);
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.copyOperation(varInsnNode0, value0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LabelNode labelNode0 = new LabelNode();
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
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
  public void test6()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue(type0);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(28, "Internal error.", (String) null, (String) null);
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.copyOperation(fieldInsnNode0, value0);
      assertFalse(basicValue0.isReference());
  }
}
