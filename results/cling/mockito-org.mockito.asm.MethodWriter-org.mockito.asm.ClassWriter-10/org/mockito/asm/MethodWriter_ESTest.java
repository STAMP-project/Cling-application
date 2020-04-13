/*

 * Tue Mar 03 14:32:08 GMT 2020
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
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(94);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Ds!", "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", stringArray0, true, true);
      methodWriter0.visitTypeInsn(2, "Ds!");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131078);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"9/~)!%:G`4A:Na";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", "^d!v", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitIntInsn((-612), (-726));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131078);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"9/~)!%:G`4A:Na";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", "^d!v", stringArray0, true, false);
      methodWriter0.visitVarInsn(169, 3085);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1012), "Deprecated", "\"eV--n<~sDI_\"M", "Deprecated", stringArray0, false, false);
      methodWriter0.visitVarInsn(24117207, 169);
      methodWriter1.visitMaxs((-1324), 1);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131078);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"9/~)!%:G`4A:Na";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", "<.6j/zwc7XwZ", stringArray0, true, false);
      methodWriter0.visitVarInsn(169, 3085);
      methodWriter0.visitVarInsn(1052, 0);
      methodWriter0.visitLdcInsn("fZYHZ");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131078);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"9/~)!%:G`4A:Na";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", "<.6j/zwc7XwZ", stringArray0, true, false);
      methodWriter0.visitVarInsn(169, 2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(94);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-191), "h(Vg-b&7Kx<", "h(Vg-b&7Kx<", "h(Vg-b&7Kx<", stringArray0, false, false);
      methodWriter0.visitVarInsn((-177), (-975));
      methodWriter0.visitMaxs(2, 17);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(94);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Ds!", "Ds!", "value ", stringArray0, false, false);
      methodWriter0.visitTypeInsn(94, "value ");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131078);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"9/~)!%:G`4A:Na";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", "^d!v", stringArray0, true, false);
      classWriter0.newLong(1);
      methodWriter0.visitVarInsn(169, 3085);
      methodWriter0.visitVarInsn(24117207, 169);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131078);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"9/~)!%:G`4A:Na";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", "^d!v", stringArray0, true, false);
      methodWriter0.visitIntInsn(1906, 1906);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131078);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"9/~)!%:G`4A:Na";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", "^d!v", stringArray0, true, false);
      methodWriter0.visitVarInsn(169, 3085);
      Label label0 = new Label();
      int[] intArray0 = new int[1];
      intArray0[0] = 2;
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131078);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"9/~)!%:G`4A:Na";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", "^d!v", stringArray0, true, false);
      methodWriter0.visitVarInsn(169, 3085);
      Label label0 = new Label();
      int[] intArray0 = new int[1];
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-2057)).when(classWriter0).newClass(anyString());
      doReturn((-2057), 131079).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", "<.6j/zwc7XwZ", stringArray0, true, false);
      methodWriter0.visitVarInsn(70, (-509));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131078);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"9/~)!%:G`4A:Na";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", "<.6j/zwc7XwZ", stringArray0, true, false);
      methodWriter0.visitVarInsn(169, 3085);
      methodWriter0.visitFieldInsn(585, "mX^{ezCEB|&rk++T", "tfgq>Ge6FW)9cm&u,c0", "\"9/~)!%:G`4A:Na");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131078);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"9/~)!%:G`4A:Na";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", stringArray0, true, false);
      methodWriter0.visitVarInsn(169, 3085);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("hFlW<!drfR\"v2", "Code", (String) null, label0, label0, 16777220);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131078);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"9/~)!%:G`4A:Na";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", "^d!v", stringArray0, true, false);
      methodWriter0.visitVarInsn(169, 3085);
      methodWriter0.visitVarInsn(24117207, 169);
      methodWriter0.visitMaxs((-1324), 1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131078);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"9/~)!%:G`4A:Na";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", "<.6j/zwc7XwZ", stringArray0, true, false);
      classWriter0.newDouble(16777220);
      methodWriter0.visitVarInsn(169, 3085);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131078);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"9/~)!%:G`4A:Na";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777220, "\"9/~)!%:G`4A:Na", "\"9/~)!%:G`4A:Na", "<.6j/zwc7XwZ", stringArray0, true, false);
      methodWriter0.visitTypeInsn((-1517), "%Z2X?qc'S0;4{");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ByteVector byteVector0 = new ByteVector(60);
      ClassWriter classWriter0 = new ClassWriter(94);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Ds!", "Ds!", "value ", stringArray0, false, false);
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 117, "DfK>uA(*/-['UF*[", "\"9/~)!%:G`Aa", ">19", stringArray0, true, true);
      methodWriter1.visitVarInsn(9, 2092);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }
}
