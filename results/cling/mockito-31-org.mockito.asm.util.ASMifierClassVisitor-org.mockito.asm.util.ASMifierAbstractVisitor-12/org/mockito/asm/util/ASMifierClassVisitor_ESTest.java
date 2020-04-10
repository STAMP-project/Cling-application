/*

 * Tue Mar 03 14:15:55 GMT 2020
 */

package org.mockito.asm.util;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.util.ASMifierClassVisitor;
import org.mockito.asm.util.ASMifierMethodVisitor;
import org.mockito.asm.util.AbstractVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ASMifierClassVisitor_ESTest extends ASMifierClassVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-4659), "w%`sQd!JY!aF@v)rR", "b`kp;MwY9u]W}", "b`kp;MwY9u]W}", "w%`sQd!JY!aF@v)rR");
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitMethod(852, "b`kp;MwY9u]W}", "w%`sQd!JY!aF@v)rR", "w%`sQd!JY!aF@v)rR", aSMifierMethodVisitor0.TYPES);
      aSMifierClassVisitor0.visit(49, (-1594), "cw.visitOuterClass(", "cw.visitOuterClass(", "&DC;J", ((AbstractVisitor) fieldVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(3824, "0P", "rf+i", " }, new Label[] {", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.appendAccess(16363);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(1001, 8192, "", "", "}zAB", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.appendAccess(1001);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "1E-wX8A+5 ?.class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // 1E-wX8A+5 ?.class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(48, 48, "'Ebc*1<5i}Tb", "'Ebc*1<5i}Tb", "'Ebc*1<5i}Tb", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(47, (-1010), "qGO", "`*/#SVnK;", "ERFACE", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(3714, 178, "j'/'B]$ET?.#{&HVtC4", "4A", "4A", stringArray0);
      aSMifierClassVisitor0.appendAccess(16363);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(3714, "new Float(\"", "ZI~2", "4A", stringArray0);
      aSMifierClassVisitor0.appendAccess(16363);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-936), (-936), "ACC_FINAL", "AnnotationVisitor av0;\n\n", "ACC_FINAL", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(1001, 8192, "", "", "}zAB", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(2553, 1001, "r*13|Hg1Y/Z*Hm", "}zAB", "r*13|Hg1Y/Z*Hm", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(128);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitMethod(0, "", "ACC_ANNOTATION", "ACC_ANNOTATION", aSMifierMethodVisitor0.TYPES);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Ag";
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
  public void test12()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(1001, 8192, "", "", "}zAB", aSMifierClassVisitor0.OPCODES);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      ASMifierClassVisitor.main(aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(2517);
      aSMifierClassVisitor0.appendAccess(16384);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-631), "b.class", "|X26_^;K'@1P", "djxM,M8cfVW", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(598, "1E-wX8A+5 ?", "1E-wX8A+5 ?", "1E-wX8A+5 ?", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Object object0 = new Object();
      aSMifierClassVisitor0.visitField((-897), "%", "", "", object0);
      aSMifierClassVisitor0.visit(1001, 8192, "", "", "}zAB", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(8192, "}zAB", "}zAB", "", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(2553, 1001, "r*13|Hg1Y/Z*Hm", "}zAB", "r*13|Hg1Y/Z*Hm", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visitInnerClass("Ag.class", "mv.visitTryCatchBlock(", "ACC_INTERFACE", 8192);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\\";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // \\ (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(46, 46, ".<T26G", "value ", "1E-wX8A+5 ?", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(525, "=@aAA?Mv TYV[q)", "", "}\n", "=@aAA?Mv TYV[q)");
      aSMifierClassVisitor0.visit(50, 1496, "=@aAA?Mv TYV[q)", "", "", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(1001, 8192, "", "", "}zAB", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "}zAB", "}zAB", "", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "[[f,_8Q@", "00", (String) null, aSMifierMethodVisitor0.OPCODES);
      assertNotSame(aSMifierMethodVisitor0, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(32);
      aSMifierClassVisitor0.appendAccess((-2003));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-117), 3936, "package asm.", "b", "ERFACE", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-696), "^GuOnS9/aG_(4}Si", "Opcodes.NULL", "DMm?$uDqpVA3.", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1000, "{OYl{@", (String) null, (String) null, stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(50, 1496, "=@aAA?Mv TYV[q)", "", "", stringArray0);
      aSMifierClassVisitor0.appendAccess((-887));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-4659), "w%`sQd!JY!aF@v)rR", "b`kp;MwY9u]W}", "b`kp;MwY9u]W}", "w%`sQd!JY!aF@v)rR");
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(16384, 16384, "ERFACE", "ACC_INTERFACE.class", "ACC_INTERFACE.class.class", aSMifierMethodVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-4659), "byte", "ERFACE", "", ((AbstractVisitor) fieldVisitor0).TYPES);
      assertNotSame(methodVisitor0, aSMifierMethodVisitor0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField((-4659), "w%`sQd!JY!aF@v)rR", "b`kp;MwY9u]W}", "b`kp;MwY9u]W}", "w%`sQd!JY!aF@v)rR");
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      ASMifierClassVisitor.main(aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit((-2478), (-2478), "", "", "00", aSMifierMethodVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "[[f,_8Q@", "00", (String) null, aSMifierMethodVisitor0.OPCODES);
      assertNotSame(aSMifierMethodVisitor0, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2504), (String) null, (String) null, "B|1.r+)$<fNsr", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "ACC_INTERFACE";
      aSMifierClassVisitor0.visit((-936), (-936), ",up%t/cG3", ",up%t/cG3", ",up%t/cG3", stringArray0);
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
  public void test34()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(16384);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(186, "000", "[]", "9 G'(!]d", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(47, (-1045), "V1_2", "Y<o7Qn/7Aw}", (String) null, (String[]) null);
      aSMifierClassVisitor0.appendAccess(16384);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-696), 192, "Opcodes.NULL", "Opcodes.NULL", "", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(196653, (-2729), "\"", "double", "b`kp;MwY9u]W}", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(196653, (-2729), "\"", "double", "b`kp;MwY9u]W}", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visitInnerClass("Ag.class", "mv.visitTryCatchBlock(", "ACC_INTERFACE", 8192);
  }
}
