/*

 * Tue Mar 03 14:01:20 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.TypeInsnNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(47, "A");
      Value value0 = simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(48, "", "", "");
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(25, "M", "M", "M");
      // Undeclared exception!
      try { 
        simpleVerifier0.copyOperation(methodInsnNode0, (Value) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(9, 9);
      // Undeclared exception!
      try { 
        basicVerifier0.unaryOperation(intInsnNode0, (Value) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }
}
