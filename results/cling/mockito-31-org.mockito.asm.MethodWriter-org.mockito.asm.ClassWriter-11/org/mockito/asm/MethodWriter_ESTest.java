/*

 * Tue Mar 03 14:32:49 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Z9sMt|Y)Hw";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH;", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitIntInsn(3727, 1493);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(4382, (-739)).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "8i+DA1Z8;M`Kkj`7U", "8i+DA1Z8;M`Kkj`7U", "8i+DA1Z8;M`Kkj`7U", (String[]) null, false, false);
      methodWriter0.visitVarInsn(1, (-739));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-545));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "JSR/RET are not supported with computeFrames option", "aPRn", "Z9sMt|Y)Hw", (String[]) null, false, false);
      methodWriter0.visitFieldInsn((-545), "JSR/RET are not supported with computeFrames option", "aPRn", "Z9sMt|Y)Hw");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "SourceDebugExtension", "Z9sMt|Y)Hw", "R@d`/O,\"YhipI~n", (String[]) null, true, true);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "^#bovGKjfH;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH;", stringArray0, true, true);
      classWriter0.newConstItem("^#bovGKjfH;");
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("5T,Z)>_teB0d", "]K25st!W", "^#bovGKjfH;", label0, label0, 495);
      methodWriter0.visitVarInsn(53, 495);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "^#bovGKjfH;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH;", stringArray0, true, true);
      methodWriter0.visitTypeInsn(2, "Z9sMt|Y)Hw");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2481));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 20, "a*P", "a*P", "Synthetic", (String[]) null, false, false);
      methodWriter0.visitTypeInsn(20, "");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Z9sMt|Y)Hw";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", stringArray0, true, true);
      methodWriter0.visitVarInsn(53, 53);
      classWriter0.addUninitializedType("Z9sMt|Y)Hw", 592);
      methodWriter0.visitMultiANewArrayInsn("'7u/vn", 53);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "^#bovGKjfH;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH;", stringArray0, true, true);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("5T,Z)>_teB0d", "]K25st!W", "^#bovGKjfH;", label0, label0, 495);
      methodWriter0.visitVarInsn(53, 495);
      Item item0 = classWriter0.newDouble(0.0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "^#bovGKjfH;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH;", stringArray0, true, true);
      classWriter0.newConstItem("^#bovGKjfH;");
      methodWriter0.visitVarInsn(53, 495);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-545));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "JSR/RET are not supported with computeFrames option", "aPRn", "Z9sMt|Y)Hw", (String[]) null, false, false);
      methodWriter0.visitFieldInsn((-545), "JSR/RET are not supported with computeFrames option", "aPRn", "JSR/RET are not supported with computeFrames option");
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(3726, label0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "^#bovGKjfH;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH;", stringArray0, true, true);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("5T,Z)>_teB0d", "]K25st!W", "^#bovGKjfH;", label0, label0, 495);
      methodWriter0.visitVarInsn(53, 495);
      // Undeclared exception!
      try { 
        methodWriter0.visitJumpInsn(495, label0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Z9sMt|Y)Hw";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH;", stringArray0, true, false);
      methodWriter0.visitIntInsn(2235, (-190));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "^#bovGKjfH;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH;", stringArray0, true, true);
      Label label0 = new Label();
      methodWriter0.visitVarInsn(53, 495);
      // Undeclared exception!
      try { 
        methodWriter0.visitJumpInsn(495, label0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Z9sMt|Y)Hw";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH;", stringArray0, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-102), "Z9sMt|Y)Hw", "Class not found", "SourceFile", stringArray0, false, false);
      methodWriter0.visitVarInsn(53, 53);
      Label label0 = new Label();
      methodWriter1.visitJumpInsn(55, label0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "^#bovGKjfH;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH;", stringArray0, true, true);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("5T,Z)>_teB0d", "]K25st!W", "^#bovGKjfH;", label0, label0, 495);
      methodWriter0.visitVarInsn(53, 495);
      int int0 = classWriter0.addUninitializedType("9iXT{JcHr|?", 6);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Z9sMt|Y)Hw";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH;", stringArray0, true, true);
      methodWriter0.visitFieldInsn(86, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "(^");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Z9sMt|Y)Hw";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH;", stringArray0, true, true);
      methodWriter0.visitVarInsn(3, 7);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 3, "R<>l?i jZr", "Z9sMt|Y)Hw", "A>GnM&%pC.G/B#/bqU", stringArray0, true, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Z9sMt|Y)Hw";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", stringArray0, true, true);
      methodWriter0.visitVarInsn(53, 53);
      int[] intArray0 = new int[4];
      intArray0[1] = 592;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 66, 592);
      assertEquals(1118, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Z9sMt|Y)Hw";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 22, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH", stringArray0, true, true);
      methodWriter0.visitVarInsn(53, 53);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 9, "Z9sMt|Y)Hw", "^#bovGKjfH", "Z9sMt|Y)Hw", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter1.visitLabel(label0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2481));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 20, "a*P", "a*P", "Synthetic", (String[]) null, false, false);
      methodWriter0.visitVarInsn(93, (-482));
      methodWriter0.visitMaxs((-198), (-1103));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Z9sMt|Y)Hw";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", stringArray0, true, true);
      methodWriter0.visitVarInsn(53, 53);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 53, "Z9sMt|Y)Hw", "boolean", "RuntimeInvisibleAnnotations", stringArray0, false, false);
      methodWriter1.visitMaxs(285212676, 1);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "^#bovGKjfH;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH;", stringArray0, true, true);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("5T,Z)>_teB0d", "]K25st!W", "^#bovGKjfH;", label0, label0, 495);
      methodWriter0.visitVarInsn(53, 495);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(24, 50);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "^#bovGKjfH;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH;", stringArray0, true, true);
      methodWriter0.visitVarInsn(53, 495);
      Item item0 = classWriter0.newDouble(0.0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2481));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "RuntimeInvisibleAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "dIV", "U &HDX9O4>).vs", "Y(", stringArray0, false, true);
      methodWriter0.visitVarInsn(125, 37);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(53);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Z9sMt|Y)Hw";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 22, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH", stringArray0, true, true);
      methodWriter0.visitVarInsn(53, 53);
      methodWriter0.visitMethodInsn(5, "Z9sMt|Y)Hw", "Z9sMt|Y)Hw", "^#bovGKjfH");
  }
}
