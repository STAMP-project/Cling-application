/*

 * Tue Mar 03 14:01:14 GMT 2020
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
      Type type0 = Type.DOUBLE_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(43, "[F", "D", "D");
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(47, (-3467));
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(23, "R");
      try { 
        simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected F, but found D
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Type type0 = Type.getReturnType("[F");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(29, "[F", "[F", "[F");
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = Type.getReturnType("[F");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(46, "[F", "[F", "[F");
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(26, 44);
      SourceValue sourceValue0 = new SourceValue((-34), intInsnNode0);
      SourceValue sourceValue1 = (SourceValue)simpleVerifier0.copyOperation(intInsnNode0, sourceValue0);
      assertEquals((-34), sourceValue1.size);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(25, "[U", "D", "D");
      try { 
        simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected an object reference, but found D
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = Type.getReturnType("[F");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(34, "[F", "[F", "[F");
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(32, ";La ;", ";La ;", "LocalVariableTypeTable");
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      InsnNode insnNode0 = new InsnNode(38);
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(28, "La ;", "La ;", "LocalVariableTypeTable");
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(43, "[F", "D", "D");
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
  public void test12()  throws Throwable  {
      Type type0 = Type.getType("[F");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, false);
      Value value0 = simpleVerifier0.newValue(type0);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(24, "[F", "[F", "I");
      try { 
        simpleVerifier0.copyOperation(fieldInsnNode0, value0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected D, but found [F
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }
}
