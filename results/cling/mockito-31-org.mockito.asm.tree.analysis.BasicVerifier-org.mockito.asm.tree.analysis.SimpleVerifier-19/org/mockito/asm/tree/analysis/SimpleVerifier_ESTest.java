/*

 * Tue Mar 03 14:01:43 GMT 2020
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
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getReturnType("[C");
      Value value0 = simpleVerifier0.newValue(type0);
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(48, (String) null, "&ZcP+Lq,H|", "&ZcP+Lq,H|");
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.copyOperation(methodInsnNode0, value0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getReturnType("[C");
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(6, (String) null, "[C", "c");
      Value value0 = simpleVerifier0.newValue(type0);
      fieldInsnNode0.setOpcode(33);
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.copyOperation(fieldInsnNode0, value0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Type type0 = Type.getReturnType("[C");
      InsnNode insnNode0 = new InsnNode(46);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier((Type) null, type0, true);
      BasicValue basicValue0 = new BasicValue(type0);
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.CHAR_TYPE;
      Value value0 = simpleVerifier0.newValue(type0);
      IntInsnNode intInsnNode0 = new IntInsnNode(44, 2845);
      Value value1 = simpleVerifier0.copyOperation(intInsnNode0, value0);
      assertSame(value0, value1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getReturnType("[C");
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(6, (String) null, "[C", "c");
      Value value0 = simpleVerifier0.newValue(type0);
      fieldInsnNode0.setOpcode(38);
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.copyOperation(fieldInsnNode0, value0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode((-2084));
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(insnNode0, (Value) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }
}
