/*

 * Tue Mar 03 14:08:04 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.Label;
import org.mockito.asm.Type;
import org.mockito.asm.tree.AbstractInsnNode;
import org.mockito.asm.tree.IincInsnNode;
import org.mockito.asm.tree.InsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.LookupSwitchInsnNode;
import org.mockito.asm.tree.TypeInsnNode;
import org.mockito.asm.tree.VarInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.SourceValue;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicVerifier_ESTest extends BasicVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(24).when(abstractInsnNode0).getOpcode();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn("{EL,|").when(value0).toString();
      try { 
        basicVerifier0.copyOperation(abstractInsnNode0, value0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected D, but found {EL,|
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      LabelNode labelNode0 = new LabelNode();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      basicVerifier0.copyOperation(labelNode0, basicValue0);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(labelNode0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      InsnNode insnNode0 = new InsnNode(197);
      Value value0 = basicVerifier0.newValue((Type) null);
      basicVerifier0.copyOperation(insnNode0, value0);
      LinkedList<SourceValue> linkedList0 = new LinkedList<SourceValue>();
      // Undeclared exception!
      try { 
        basicVerifier0.naryOperation(insnNode0, linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mockito.asm.tree.InsnNode cannot be cast to org.mockito.asm.tree.MultiANewArrayInsnNode
         //
         verifyException("org.mockito.asm.tree.analysis.BasicInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Type type0 = Type.CHAR_TYPE;
      Value value0 = basicVerifier0.newValue(type0);
      VarInsnNode varInsnNode0 = new VarInsnNode(2178, 1634);
      basicVerifier0.copyOperation(varInsnNode0, value0);
      LabelNode labelNode0 = new LabelNode();
      int[] intArray0 = new int[9];
      LookupSwitchInsnNode lookupSwitchInsnNode0 = new LookupSwitchInsnNode(labelNode0, intArray0, (LabelNode[]) null);
      Value value1 = basicVerifier0.unaryOperation(lookupSwitchInsnNode0, value0);
      assertNull(value1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(28).when(abstractInsnNode0).getOpcode();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      basicVerifier0.copyOperation(abstractInsnNode0, basicValue0);
      Label label0 = new Label();
      LabelNode labelNode0 = new LabelNode(label0);
      int[] intArray0 = new int[1];
      LookupSwitchInsnNode lookupSwitchInsnNode0 = new LookupSwitchInsnNode(labelNode0, intArray0, (LabelNode[]) null);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(lookupSwitchInsnNode0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(28).when(abstractInsnNode0).getOpcode();
      basicVerifier0.copyOperation(abstractInsnNode0, (Value) null);
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(13, "Ljava/lang/Synthetic;");
      BasicValue basicValue0 = (BasicValue)basicVerifier0.newOperation(typeInsnNode0);
      assertFalse(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Type type0 = Type.CHAR_TYPE;
      Value value0 = basicVerifier0.newValue(type0);
      VarInsnNode varInsnNode0 = new VarInsnNode(2178, 1634);
      Value value1 = basicVerifier0.copyOperation(varInsnNode0, value0);
      IincInsnNode iincInsnNode0 = new IincInsnNode(7, 0);
      Value value2 = basicVerifier0.unaryOperation(iincInsnNode0, value1);
      assertEquals(1, value2.getSize());
  }
}
