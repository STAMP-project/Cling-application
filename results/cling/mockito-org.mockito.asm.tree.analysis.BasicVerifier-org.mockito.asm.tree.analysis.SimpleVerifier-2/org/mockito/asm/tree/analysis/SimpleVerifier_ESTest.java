/*

 * Tue Mar 03 14:01:02 GMT 2020
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
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.VarInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(46, "Internal error.", "Internal error.", "?s5Rj");
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, (Type) null, linkedList0, true);
      BasicValue basicValue0 = new BasicValue(type0);
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(22, "a! @", "a! @", "a! @");
      try { 
        simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected J, but found I
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(28, 28);
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      BasicVerifier basicVerifier0 = new BasicVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode((-75), (-75));
      // Undeclared exception!
      try { 
        basicVerifier0.unaryOperation(varInsnNode0, basicValue0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, (Type) null, linkedList0, false);
      Value value0 = simpleVerifier0.newValue((Type) null);
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(37, "a! @", "a! @", "a! @");
      Value value1 = simpleVerifier0.copyOperation(methodInsnNode0, value0);
      assertSame(value0, value1);
  }
}
