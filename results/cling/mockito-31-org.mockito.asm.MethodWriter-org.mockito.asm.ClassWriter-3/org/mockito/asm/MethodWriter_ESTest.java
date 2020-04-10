/*

 * Tue Mar 03 14:30:18 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-9), "F[?\"0jln?$0H", "R 5Oro4&9_oY>?B)C", "StackMap", stringArray0, true, true);
      methodWriter0.visitTypeInsn(1, ";;y");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      classWriter0.newFloat(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-9), "F[?\"0jln?$0H", "R 5Oro4&9_oY>?B)C", "StackMap", stringArray0, true, false);
      methodWriter0.visitFieldInsn((-1649), "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJ^IIIIIIIIIIIIIIIIII", "R 5Oro4&9_oY>?B)C", "_Z(cT");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "g@";
      stringArray0[1] = "LineNumberTable";
      stringArray0[2] = ")j)~i~,";
      stringArray0[3] = "AnnotationDefault";
      stringArray0[4] = "g@";
      stringArray0[5] = "LineNumberTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 159, "AnnotationDefault", ")j)~i~,", "g@", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitIntInsn(1744, 159);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "", "", (String[]) null, false, false);
      methodWriter0.visitFieldInsn(168, "~O{m^Qf]", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-9), "F[?\"0jln?$0H", "R 5Oro4&9_oY>?B)C", "StackMap", stringArray0, true, false);
      methodWriter0.visitFieldInsn(3, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "!v<!BsTNf*&p<`M@E", "_Z(cT");
      methodWriter0.visitIntInsn(4096, (-106));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3752));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 54, "Ye17ye", "Xv2Aa6)\nmW_:!Y]l=F", "Ye17ye", stringArray0, false, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitVarInsn((-1394), 127);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-9), "F[?\"0jln?$0H", "R 5Oro4&9_oY>?B)C", "StackMap", stringArray0, true, false);
      classWriter0.newConstItem("TcR];6\"BWIM3%");
      methodWriter0.visitFieldInsn((-39), "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "R 5Oro4&9_oY>?B)C", "_Z(cT");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-9), "F[?\"0jln?$0H", "R 5Oro4&9_oY>?B)C", "StackMap", stringArray0, true, false);
      methodWriter0.visitFieldInsn((-39), "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "R 5Oro4&9_oY>?B)C", "_Z(cT");
      methodWriter0.visitMaxs(1, (-2400));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "", "", (String[]) null, false, false);
      methodWriter0.visitMaxs((-1513), 2);
      methodWriter0.visitVarInsn(2, (-1513));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "", "", (String[]) null, false, false);
      methodWriter0.visitTypeInsn(1, "+gN67og:'4U");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-9), "F[?\"0jln?$0H", "R 5Oro4&9_oY>?B)C", "StackMap", stringArray0, true, false);
      methodWriter0.visitIntInsn(4096, (-106));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-9), "F[?\"0jln?$0H", "R 5Oro4&9_oY>?B)C", "StackMap", stringArray0, true, false);
      Label label0 = new Label();
      methodWriter0.visitFieldInsn((-1649), "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJ^IIIIIIIIIIIIIIIIII", "R 5Oro4&9_oY>?B)C", "_Z(cT");
      // Undeclared exception!
      try { 
        methodWriter0.visitJumpInsn(441, label0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 441
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-9), "F[?\"0jln?$0H", "R 5Oro4&9_oY>?B)C", "StackMap", stringArray0, true, false);
      methodWriter0.visitFieldInsn(3, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "!v<!BsTNf*&p<`M@E", "_Z(cT");
      classWriter0.addType("LocalVariableTable");
      int int0 = classWriter0.addType("7R.?#@)}P\"");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-9), "F[?\"0jln?$0H", "R 5Oro4&9_oY>?B)C", "StackMap", stringArray0, true, true);
      methodWriter0.visitFieldInsn(3, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJ^IIIIIIIIIIIIIIIIII", "R 5Oro4&9_oY>?B)C", "_Z(cT");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-9), "F[?\"0jln?$0H", "R 5Oro4&9_oY>?B)C", "StackMap", stringArray0, true, false);
      Label label0 = new Label();
      Label label1 = label0.getFirst();
      label1.status = 1679;
      methodWriter0.visitLabel(label1);
      methodWriter0.visitFieldInsn((-1649), "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJ^IIIIIIIIIIIIIIIIII", "R 5Oro4&9_oY>?B)C", "_Z(cT");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      classWriter0.newInteger(2);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "g@";
      stringArray0[1] = "LineNumberTable";
      stringArray0[2] = ")j)~i~,";
      stringArray0[3] = "LineNumberTable";
      stringArray0[4] = "g@";
      stringArray0[5] = "LineNumberTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777227, "LineNumberTable", ")j)~i~,", "g@", stringArray0, true, false);
      methodWriter0.visitVarInsn(1, 16777227);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      classWriter0.newInteger((-3751));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "g@";
      stringArray0[1] = "LineNumberTable";
      stringArray0[2] = ")j)~i~,";
      stringArray0[3] = "LineNumberTable";
      stringArray0[4] = "g@";
      stringArray0[5] = "LineNumberTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3751), "LineNumberTable", ")j)~i~,", "g@", stringArray0, true, false);
      methodWriter0.visitVarInsn(1, (-3751));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "", "", (String[]) null, false, false);
      methodWriter0.visitVarInsn(168, 46);
      methodWriter0.visitMaxs((-1513), 2);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      classWriter0.newInteger((-3721));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-9), "F[?\"0jln?$0H", "R 5Oro4&9_oY>?B)C", "StackMap", stringArray0, true, false);
      methodWriter0.visitFieldInsn((-39), "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "R 5Oro4&9_oY>?B)C", "_Z(cT");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-9), "F[?\"0jln?$0H", "R 5Oro4&9_oY>?B)C", "StackMap", stringArray0, true, false);
      Label label0 = new Label();
      methodWriter0.visitLabel(label0);
      methodWriter0.visitFieldInsn((-1649), "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJ^IIIIIIIIIIIIIIIIII", "R 5Oro4&9_oY>?B)C", "_Z(cT");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-9), "F[?\"0jln?$0H", "R 5Oro4&9_oY>?B)C", "StackMap", stringArray0, true, false);
      Label label0 = new Label();
      Label label1 = label0.getFirst();
      label1.status = 1679;
      methodWriter0.visitLabel(label1);
      methodWriter0.visitTypeInsn(1, ";;y");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-9), "F[?\"0jln?$0H", "R 5Oro4&9_oY>?B)C", "StackMap", stringArray0, true, false);
      methodWriter0.visitTypeInsn(1, ";;y");
      methodWriter0.visitMaxs(1, (-2400));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777227);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-9), "F[?\"0jln?$0H", "R 5Oro4&9_oY>?B)C", "StackMap", stringArray0, true, false);
      methodWriter0.visitFieldInsn((-39), "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "R 5Oro4&9_oY>?B)C", "_Z(cT");
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn((-9), "InnerClasses", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "'%s.Hn>I\"<y:yDzTdN");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
