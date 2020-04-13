/*

 * Tue Mar 03 14:15:44 GMT 2020
 */

package org.mockito.asm.util;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.AnnotationVisitor;
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.util.ASMifierClassVisitor;
import org.mockito.asm.util.ASMifierMethodVisitor;
import org.mockito.asm.util.AbstractVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ASMifierClassVisitor_ESTest extends ASMifierClassVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(0, 315, "", "", "", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-336), "", "&BW`$K_\u0003m", "", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-4062), 220, "ACC_SUPER", "ACC_SUPER", "ACC_SUPER", (String[]) null);
      aSMifierClassVisitor0.visitInnerClass("#s8C/4&Ztp", "xL%tjpW=7D[~.class", "#s8C/4&Ztp", (-2489));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(47, 47, ", new int[] {", "w`", "", aSMifierMethodVisitor0.TYPES);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Ljava/lang/Synthetic;";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Ljava/lang/Synthetic; (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("}, ", false);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "new char[] {", ")o23r;wH{", "}, ", ((AbstractVisitor) annotationVisitor0).OPCODES);
      aSMifierClassVisitor0.visit(1344, 8192, "/4&Ztp", ";\n", ".visitEnum(.class", ((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("MlV&&?", "z.class", ">}K/x[AF&;2", 128);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(33, 33, "L", "gV76x*", "Ugk", aSMifierClassVisitor0.TYPES);
      String[] stringArray0 = new String[2];
      stringArray0[0] = " });\n";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Class not found
         //
         verifyException("org.mockito.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(0, (-4720), "Ljava/lang/Synthetic;", "&BW`$K_\u0003m", "", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(168, (-1944), "[fX!0NUl&,+K&}<SIt", "[fX!0NUl&,+K&}<SIt", (String) null, aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(797, 8192, "public class ", "-RI.", "pn)dDK^", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess((-331));
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(47, 47, ", new int[] {", "w`", "", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess((-331));
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("}, ", false);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, ";\n", ")o23r;wH{", "}, ", ((AbstractVisitor) annotationVisitor0).OPCODES);
      ASMifierClassVisitor.main(((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[3];
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PrintWriter printWriter0 = new PrintWriter(pipedOutputStream0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("", (String) null, (String) null, 191);
      aSMifierClassVisitor0.visit(46, (-559), ":M", (String) null, (String) null, stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(50, 102, "[]", ".visitAnnotation(", ".class", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1054, "gX @R4W|DaU", ".visitEnum(", ".visitAnnotation(", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(8192, "e7", "By,dgm>p", "ACC_PRIVATE", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(47, 92, "&VS3n2", "new int[] {", "mv.visitLookupSwitchInsn(", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(2039, 1256, "A", "l", "A", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-4102), "=$#Ck-y51H~2'A7TQ*x", "new short[] {", "!dJD(_a@~pJ.ZRDL^9", (String[]) null);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(224, "new short[] {", ".visitAnnotation(.class", (String) null, methodVisitor0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(437, 176, "5", "", "Zv0", stringArray0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(32767, "Zv0", "Zv0", (String) null, "+8MFbG2i^.class");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-1123), "'{PDF|gy", "'{PDF|gy", "'{PDF|gy", "'{PDF|gy");
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1123), "mv.visitJumpInsn(", "-debug", "-debug", ((AbstractVisitor) fieldVisitor0).TYPES);
      aSMifierClassVisitor0.visit(48, 154, "-debug", (String) null, (String) null, ((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(437, 176, "5", "", "Zv0", aSMifierClassVisitor0.OPCODES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(32767, "Zv0", "Zv0", (String) null, "+8MFbG2i^.class");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(196653, 8, "hetic;", "&VS3n2", "ZRjhA]7", stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(458, "mv.visitJumpInsn(", "'{PDF|gy", "'{PDF|gy", (String[]) null);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod((-2589), "mv.visitJumpInsn(", "z", "mv.visitJumpInsn(", (String[]) null);
      aSMifierClassVisitor0.visit(128, 8192, "z", "'{PDF|gy", "mv.visitVarInsn(", ((AbstractVisitor) methodVisitor0).TYPES);
      assertNotSame(methodVisitor0, methodVisitor1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(49, (-226), ":9M", "+b4gW/\";A`6dW0~T", ":9M", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(49, 8, ":5S3Ht0oW&*", ":5S3Ht0oW&*", ":5S3Ht0oW&*", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("}, ", false);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(952, "=$#Ck-y51H~2'A7TQ*x", ";\n", "}, ", ((AbstractVisitor) annotationVisitor0).OPCODES);
      aSMifierClassVisitor0.visit(1344, 8192, "/4&Ztp", ";\n", ".visitEnum(.class", ((AbstractVisitor) methodVisitor0).OPCODES);
  }
}
