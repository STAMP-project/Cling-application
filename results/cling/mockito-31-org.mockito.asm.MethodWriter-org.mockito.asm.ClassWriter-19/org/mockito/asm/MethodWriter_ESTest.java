/*

 * Tue Mar 03 14:34:44 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", (String[]) null, true, true);
      methodWriter0.visitTypeInsn((-2230), "gwMHqV{!");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", (String[]) null, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1899), "gwMHqV{!", "gwMHqV{!", "gwMHqV{!", (String[]) null, false, false);
      methodWriter1.visitMaxs(256, 1);
      methodWriter0.visitTypeInsn(2, "mL -2j0h^]'h`");
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(2, "/0C>)PF'jApnV-x8U", "-)iX#X%ov-f:pA\u0004K", "gwMHqV{!");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1899), "gwMHqV{!", "gwMHqV{!", "gwMHqV{!", (String[]) null, false, false);
      methodWriter1.visitMaxs(256, 1);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "1){V", "/0C>)PF'jApnV-x8U", "1){V", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(2, "/0C>)PF'jApnV-x8U", "-)iX#X%ov-f:pA\u0004K", "gwMHqV{!");
      methodWriter0.visitMaxs(2, (-157599528));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(960);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "L", "X7N(Ds", "X7N(Ds", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitFieldInsn(389, "-)iX#X%ov-f:pA\u0004K", "-)iX#X%ov-f:pA\u0004K", "@\"p%L9F3");
      methodWriter0.visitLabel(label0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(891, 891).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "EnclosingMethod", "EnclosingMethod", stringArray0, false, false);
      methodWriter0.visitVarInsn(41, 891);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "-)iX#X%ov-f:pA\u0004K", "U=c#;(Ejl k(?", "pt9c~^ritW5", (String[]) null, false, false);
      methodWriter0.visitMaxs(28, 1);
      methodWriter0.visitVarInsn(24117248, (-1002));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "-)iX#X%ov-f:pA\u0004K", "U=c#;(Ejl k(?", "pt9c~^ritW5", (String[]) null, false, false);
      methodWriter0.visitMaxs(28, 1);
      methodWriter0.visitVarInsn(83, 83);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(891);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "", "", stringArray0, false, false);
      methodWriter0.visitTypeInsn(2, "");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "1){V", "/0C>)PF'jApnV-x8U", "1){V", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(2, "/0C>)PF'jApnV-x8U", "-)iX#X%ov-f:pA\u0004K", "gwMHqV{!");
      methodWriter0.next = methodWriter0;
      methodWriter0.next.visitLdcInsn("-)iX#X%ov-f:pA\u0004K");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(960);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "L", "X7N(Ds", "X7N(Ds", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitFieldInsn(389, "-)iX#X%ov-f:pA\u0004K", "-)iX#X%ov-f:pA\u0004K", "@\"p%L9F3");
      methodWriter0.visitJumpInsn(132, label0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3203);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "3{vqZaBeW:k[HfLm(", "-)iX#X%ov-f:pA\u0004K", "", stringArray0, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 16, "-)iX#X%ov-f:pA\u0004K", "-)iX#X%ov-fIpA\u0004K", "{aS;mpP=A", stringArray0, false, true);
      methodWriter0.visitVarInsn(1, 16);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(2, "/0C>)PF'jApnV-x8U", "-)iX#X%ov-f:pA\u0004K", "gwMHqV{!");
      Item item0 = classWriter0.newLong(1);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3203);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte) (-59), "RuntimeInvisibleParameterAnnotations", "Signature", (String) null, (String[]) null, false, false);
      methodWriter0.visitIntInsn(2, (-1588));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "1){V", "/0C>)PF'jApnV-x8U", "1){V", (String[]) null, true, false);
      methodWriter0.visitMaxs(2, (-157599528));
      methodWriter0.visitTypeInsn(1, ",~Q)D lc1;V");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(2, "/0C>)PF'jApnV-x8U", "-)iX#X%ov-f:pA\u0004K", "gwMHqV{!");
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(3, label0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.addType("/0C>)PF'jApnV-x8U");
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "1){V", "/0C>)PF'jApnV-x8U", "1){V", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(2, "/0C>)PF'jApnV-x8U", "-)iX#X%ov-f:pA\u0004K", "gwMHqV{!");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 12, "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", "`*P9F]O", (String[]) null, true, true);
      methodWriter1.visitMethodInsn(2709, "1){V", "<init>", "(Ni@h6@'.vGzq");
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", (String[]) null, true, true);
      methodWriter0.visitFieldInsn(2, "/0C>)PF'jApnV-x8U", "-)iX#X%ov-f:pA\u0004K", "gwMHqV{!");
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(0, label0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "1){V", "/0C>)PF'jApnV-x8U", "1){V", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(2, "/0C>)PF'jApnV-x8U", "-)iX#X%ov-f:pA\u0004K", "gwMHqV{!");
      int[] intArray0 = new int[7];
      intArray0[2] = 522;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 63, 2);
      assertEquals((-61), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "1){V", "/0C>)PF'jApnV-x8U", "1){V", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(2, "/0C>)PF'jApnV-x8U", "-)iX#X%ov-f:pA\u0004K", "gwMHqV{!");
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1999, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(2, "/0C>)PF'jApnV-x8U", "-)iX#X%ov-f:pA\u0004K", "gwMHqV{!");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1899), "gwMHqV{!", "gwMHqV{!", "gwMHqV{!", (String[]) null, false, false);
      methodWriter1.visitMethodInsn(123, "-)iX#X%ov-f:pA\u0004K", "RRTJaHKKi9FRn", "&Me\"i");
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "1){V", "/0C>)PF'jApnV-x8U", "1){V", (String[]) null, true, false);
      methodWriter0.visitTypeInsn(83, "1){V");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 522, "/0C>)PF'jApnV-x8U", "1){V", "`*P9F]O", (String[]) null, false, true);
      methodWriter1.visitMaxs(9, 1);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(2, "/0C>)PF'jApnV-x8U", "-)iX#X%ov-f:pA\u0004K", "gwMHqV{!");
      Label label0 = new Label();
      methodWriter0.visitLineNumber(0, label0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "double", "/0C>)PF'jApnV-x8U", "double", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(2, "/0C>)PF'jApnV-x8U", "-)iX#X%ov-f:pA\u0004K", "gwMHqV{!");
      Item item0 = classWriter0.newInteger(1);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3203);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "3{vqZaBeW:k[HfLm(", "-)iX#X%ov-f:pA\u0004K", "", stringArray0, true, false);
      classWriter0.newMethodItem("JSR/RET are not supported with computeFrames option", "JSR/RET are not supported with computeFrames option", "X:w7U/FvW2c4q", false);
      methodWriter0.visitVarInsn(1, 16);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "/0C>)PF'jApV-x8U", "/0C>)PF'jApV-x8U", "/0C>)PF'jApV-x8U", (String[]) null, true, true);
      methodWriter0.visitVarInsn(2, 2);
      methodWriter0.visitLdcInsn("/0C>)PF'jApV-x8U");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", "/0C>)PF'jApnV-x8U", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(2, "/0C>)PF'jApnV-x8U", "-)iX#X%ov-f:pA\u0004K", "gwMHqV{!");
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn(2, "/0C>)PF'jApnV-x8U", "-+DZ", "\u0006=>&`RW$~");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3203);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "3{vqZaBeW:k[HfLm(", "-)iX#X%ov-f:pA\u0004K", "", stringArray0, true, false);
      methodWriter0.visitVarInsn(1, 16);
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn(1731, "-)iX#X%ov-fIpA\u0004K", "", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
