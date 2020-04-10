/*

 * Tue Mar 03 14:08:00 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.Type;
import org.mockito.asm.tree.AbstractInsnNode;
import org.mockito.asm.tree.IincInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.LdcInsnNode;
import org.mockito.asm.tree.LineNumberNode;
import org.mockito.asm.tree.TypeInsnNode;
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
      Type type0 = Type.INT_TYPE;
      Value value0 = basicVerifier0.newValue(type0);
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(21, "b-Vs'j");
      Value value1 = basicVerifier0.copyOperation(typeInsnNode0, value0);
      assertEquals(1, value1.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(23).when(abstractInsnNode0).getOpcode();
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(value0).toString();
      try { 
        basicVerifier0.copyOperation(abstractInsnNode0, value0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected F, but found null
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      IincInsnNode iincInsnNode0 = new IincInsnNode(28, 28);
      Value value0 = mock(Value.class, new ViolatedAssumptionAnswer());
      doReturn("b-Vs'j").when(value0).toString();
      basicVerifier0.copyOperation(iincInsnNode0, value0);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(iincInsnNode0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LabelNode labelNode0 = new LabelNode();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(10).when(abstractInsnNode0).getOpcode();
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Value value0 = basicVerifier0.newOperation(abstractInsnNode0);
      Value value1 = basicVerifier0.copyOperation(labelNode0, value0);
      assertSame(value0, value1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode(basicVerifier0);
      Value value0 = basicVerifier0.newOperation(ldcInsnNode0);
      BasicValue basicValue0 = (BasicValue)basicVerifier0.copyOperation(ldcInsnNode0, value0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(28).when(abstractInsnNode0).getOpcode();
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      SourceValue sourceValue0 = new SourceValue((-250), linkedHashSet0);
      basicVerifier0.copyOperation(abstractInsnNode0, sourceValue0);
      IincInsnNode iincInsnNode0 = new IincInsnNode(5, 4);
      // Undeclared exception!
      try { 
        basicVerifier0.newOperation(iincInsnNode0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AbstractInsnNode abstractInsnNode0 = mock(AbstractInsnNode.class, new ViolatedAssumptionAnswer());
      doReturn(12).when(abstractInsnNode0).getOpcode();
      BasicVerifier basicVerifier0 = new BasicVerifier();
      Value value0 = basicVerifier0.newOperation(abstractInsnNode0);
      LabelNode labelNode0 = new LabelNode();
      LineNumberNode lineNumberNode0 = new LineNumberNode(0, labelNode0);
      Value value1 = basicVerifier0.copyOperation(lineNumberNode0, value0);
      assertEquals(1, value1.getSize());
  }
}
