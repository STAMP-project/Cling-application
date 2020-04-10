/*

 * Tue Mar 03 14:33:11 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter(2689);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "AnnotationDefault", "!dbZok~}2?#\"q$5u", "!dbZok~}2?#\"q$5u", (String[]) null, false, false);
      methodWriter0.visitVarInsn(1, (-630));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(118);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "\u0000Mtb7?z>[)sI6F+p{!";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 87, "", "\u0000Mtb7?z>[)sI6F+p{!", "", stringArray0, true, false);
      methodWriter0.visitVarInsn(87, (-3150));
      // Undeclared exception!
      try { 
        methodWriter0.visitLineNumber(2, (Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(126);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 87, "", "\u0000Mtb7?z>[)sI6F+p{!", "", stringArray0, true, false);
      methodWriter0.visitMaxs((-7092), 2);
      methodWriter0.visitFieldInsn((-7092), "", "", "&HPIzfh#Z`R]$!}tG");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2689);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 412, "AnnoationDeault", "AnnoationDeault", "AnnoationDeault", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitLabel(label0);
      methodWriter0.visitFieldInsn(1, "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "I!'x<(tF]#Y", "\"\"()~NB0'mVB");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(126);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 87, "", "\u0000Mtb7?z>[)sI6F+p{!", "", stringArray0, true, false);
      methodWriter0.visitMultiANewArrayInsn("", (-7092));
      methodWriter0.visitFieldInsn((-7092), "", "", "&HPIzfh#Z`R]$!}tG");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(126);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1555, "v-&\"+9D@dR&]+*?M3x", "v-&\"+9D@dR&]+*?M3x", "", (String[]) null, false, false);
      methodWriter0.visitMaxs(77, (-4817));
      methodWriter0.visitVarInsn(1555, 1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2689);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 412, "AnnoationDeault", "AnnoationDeault", "AnnoationDeault", (String[]) null, false, false);
      methodWriter0.visitTypeInsn(1, "AnnoationDeault");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(126);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 66, "", "\u0000Mtb7?z>[)sI6F+p{!", "", stringArray0, true, false);
      methodWriter0.visitVarInsn(16, 16777218);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2689);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 412, "AnnoationDeault", "AnnoationDeault", "AnnoationDeault", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(2689, label0);
      methodWriter0.visitFieldInsn(1, "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "I!'x<(tF]#Y", "\"\"()~NB0'mVB");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2671);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 412, "AnnotationDefault", "AnnotationDefault", "AnnotationDefault", (String[]) null, false, false);
      methodWriter0.visitIntInsn(1199, (-253));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(118);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "\u0000Mtb7?z>[)sI6F+p{!";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 87, "", "\u0000Mtb7?z>[)sI6F+p{!", "", stringArray0, true, false);
      methodWriter0.visitTypeInsn(6, "");
      methodWriter0.visitMaxs(24, 2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2689);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2689, "AnnotationDefault", "AnnotationDefault", "AnnotationDefault", (String[]) null, false, false);
      methodWriter0.visitVarInsn(171, 41);
      methodWriter0.visitMaxs(Integer.MAX_VALUE, 1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(118);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "\u0000Mtb7?z>[)sI6F+p{!";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 87, "", "\u0000Mtb7?z>[)sI6F+p{!", "", stringArray0, true, false);
      methodWriter0.visitVarInsn(87, (-3150));
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn((-454), "[w#3om#8ihyX:", "[w#3om#8ihyX:", ".s.IFJDCS");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(118);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "\u0000Mtb7?z>[)sI6F+p{!";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 87, "", "\u0000Mtb7?z>[)sI6F+p{!", "", stringArray0, true, false);
      methodWriter0.visitTypeInsn(6, "");
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(6, label0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(118);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 87, "", "\u0000Mtb7?z>[)sI6F+p{!", "", stringArray0, true, true);
      methodWriter0.visitVarInsn(87, (-3150));
      methodWriter0.visitMethodInsn((-454), "[w#3om#8ihyX:", "[w#3om#8ihyX:", ".s.IFJDCS");
  }
}
