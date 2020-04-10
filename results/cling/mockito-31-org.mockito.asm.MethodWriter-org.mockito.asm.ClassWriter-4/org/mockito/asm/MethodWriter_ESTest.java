/*

 * Tue Mar 03 14:32:35 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2505));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2505), "<init>", "v\"n{b<D%6l_3%)V.", ";]HISu79B]zN", (String[]) null, false, true);
      methodWriter0.visitTypeInsn(933, "Deprecated");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2505));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "mUcK-4.3 zz*3sg1", "mUcK-4.3 zz*3sg1", "mUcK-4.3 zz*3sg1", (String[]) null, false, false);
      methodWriter0.visitFieldInsn(1180, "mUcK-4.3 zz*3sg1", "LineNumberTable", "mUcK-4.3 zz*3sg1");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2501));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "f-1,aN^EJ", "f-1,aN^EJ", "f-1,aN^EJ", stringArray0, false, false);
      methodWriter0.visitVarInsn(32, 2047);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2505));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-23), "wQ[w,VRSH3X", "~`)1^x8", "nlNE1}Srz#Oe1q", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 451, "nlNE1}Srz#Oe1q", "zml<)y", "w7hv$\"&$ztu'.5=", stringArray0, true, false);
      methodWriter0.visitMethodInsn((-23), "Gk'lS!JA}M8wd%@", "g0", "i8Xf& #;8F=O");
      methodWriter1.visitVarInsn(200, 7);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      methodWriter0.visitVarInsn(1, 169);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("#3P(@+Ed\r#+m`]", "org.mockito.asm.MethodWriter", "#3P(@+Ed\r#+m`]", label0, label0, 4);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2505));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 451, "nlNE1}Srz#Oe1q", "zml<)y", "w7hv$\"&$ztu'.5=", stringArray0, true, false);
      methodWriter0.visitVarInsn(200, 7);
      Item item0 = classWriter0.newFloat(0.0F);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2505));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "|o`&IhjR";
      stringArray0[1] = "|o`&IhjR";
      stringArray0[2] = "|o`&IhjR";
      stringArray0[3] = "|o`&IhjR";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 31, "?`PHyB!v}'88As7Nj3", "org.mockito.asm.Frame", "getSuppressed", stringArray0, false, false);
      methodWriter0.visitVarInsn(192, 90);
      methodWriter0.visitMaxs(73, (-82));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2505));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "java/lang/Throwable";
      stringArray0[1] = "java/lang/Throwable";
      stringArray0[2] = "'iSN";
      stringArray0[3] = "java/lang/Throwable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2505), "'iSN", "4Zz=Q<Ei([dE6p", "java/lang/Throwable", stringArray0, false, false);
      methodWriter0.visitTypeInsn(1, "l9 -i[:@2Z-");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      classWriter0.newInteger(8);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      methodWriter0.visitVarInsn(1, (-3037));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      methodWriter0.visitVarInsn(1, 169);
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(4, label0);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(2, 177);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2505));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-23), "wQ[w,VRSH3X", "getSuppressed", "nlNE1}Srz#Oe1q", stringArray0, false, false);
      methodWriter0.visitVarInsn((-2505), (-2505));
      methodWriter0.visitMaxs(0, (-1882968934));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      methodWriter0.visitVarInsn(1, (-3037));
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("RuntimeVisibleParameterAnnotations", ":B#[c\"aZ:wR", "RuntimeVisibleParameterAnnotations", label0, label0, (-3037));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      MethodWriter methodWriter1 = methodWriter0.next;
      methodWriter1.visitVarInsn(1, 169);
      methodWriter1.visitMaxs(2, 177);
      methodWriter1.visitMaxs(1, 177);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      methodWriter0.visitVarInsn(1, (-3037));
      methodWriter0.visitFieldInsn((-3378), "java/lang/Throwable", "java/lang/Throwable", "java/lang/Throwable");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2505));
      classWriter0.newDouble((-3897.59098));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 451, "nlNE1}Srz#Oe1q", "zml<)y", "w7hv$\"&$ztu'.5=", stringArray0, true, false);
      methodWriter0.visitVarInsn(200, 7);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(4801);
      classReader0.accept((ClassVisitor) classWriter0, 2);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }
}
