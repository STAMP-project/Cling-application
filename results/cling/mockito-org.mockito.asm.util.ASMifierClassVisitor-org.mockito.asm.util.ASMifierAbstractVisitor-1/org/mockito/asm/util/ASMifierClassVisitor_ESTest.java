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
import java.io.PrintWriter;
import java.io.StringWriter;
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
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(198);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(32767, "ytzs;Qo!/I>$y6%$0L", "oMM0;d/jYq.@bgH(H", "ytzs;Qo!/I>$y6%$0L", "oMM0;d/jYq.@bgH(H");
      aSMifierClassVisitor0.visit(64, (-1944), "ytzs;Qo!/I>$y6%$0L", "cw.visitSource(", "cw.visitSource(", ((AbstractVisitor) fieldVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(64, 8192, "V1_4", "oMM0;d/jYq.@bgH(H", "}N}'<npB", stringArray0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(49, "J{%!oeZ`P^pujk{ZP}", "V1_4", "}N}'<npB", "oMM0;d/jYq.@bgH(H");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(32);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32767, ":5cYX$", "Ry!VS<Dt:B-C(dA{t", "=#=o ", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("if:5cYX$.class", true);
      aSMifierClassVisitor0.visit((-1), 8192, "m&zHq!z=#", "oMM0;d/jYq.@bgH(H.class", "mv.visitFrame(Opcodes.F_NEW, ", ((AbstractVisitor) annotationVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "mv.visitFrame(Opcodes.F_CHOP,.class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // mv.visitFrame(Opcodes.F_CHOP,.class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(48, 48, "g?0N+Q:\">l", "mv.visitLdcInsn(", "9_)yg31 O1", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("@bgH(H", "mv.visitFrame(Opcodes.F_CHOP,", "mv.visitFrame(Opcodes.F_CHOP,", 193);
      aSMifierClassVisitor0.visit(47, 3543, "UBnTW,:QqAsfV'ReMZ ", (String) null, "public static byte[] dump () throws Exception {\n\n", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(1542, 2214, "O*M\"r<cnb", "/C,SK>]I-%9.=Sc", "mv.visitJumpInsn(", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "_:Oao%fm3p4,Q7", "", "V,n7k*n+N+7uD", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("if:5cYX$.class", "if:5cYX$.class", "}N}'<npB", (-2816));
      aSMifierClassVisitor0.visit(47, 1912, "h;O&\"", "}N}'<npB", "oMM0;d/jYq.@bgH(H.class", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod((-2816), "ytzs;Qo!/I>$y6%$0L", "5zcYX$", "5zcYX$", stringArray0);
      aSMifierClassVisitor0.visit((-2816), 171, "oMM0;d/jYq.@bgH(H", "ytzs;Qo!/I>$y6%$0L", "ytzs;Qo!/I>$y6%$0L", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visitInnerClass("if:5cYX$.class", "if:5cYX$.class", "}N}'<npB", (-2816));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-2816), 171, "oMM0;d/jYq.@bgH(H", "ytzs;Qo!/I>$y6%$0L", "ytzs;Qo!/I>$y6%$0L", stringArray0);
      aSMifierClassVisitor0.visit(64, 8192, "V1_4", "oMM0;d/jYq.@bgH(H", "ytzs;Qo!/I>$y6%$0L", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "oMM0;d/jYq.@bgH(H";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // oMM0;d/jYq.@bgH(H (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("if:5cYX$.class", (String) null, "if:5cYX$.class", 1097);
      aSMifierClassVisitor0.visit(64, 8192, "V1_4", "oMM0;d/jYq.@bgH(H", "}N}'<npB", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32767, (String) null, (String) null, "Label offset position has not been resolved yet", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(128, "ijjB", "_CHOP,", "2YJWCN<hqIZd0uI", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(48, (-933), "g?0N+Q:\">l", ", new Label[] {", "Z w$Vr[]-Vr\"`wZ9[", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor.main(stringArray0);
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(64, 8192, "V1_4", "oMM0;d/jYq.@bgH(H", "ytzs;Qo!/I>$y6%$0L", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("*", "*", (String) null, 32767);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32767, ":5cYX$", "Ry!VS<Dt:B-C(dA{t", "=#=o ", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[7];
      aSMifierClassVisitor0.visitMethod(32767, "ytzs;Qo!/I>$y6%$0L", "", "ytzs;Qo!/I>$y6%$0L", stringArray0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(32767, stringArray0[2], "oMM0;d/jYq.@bgH(H", "", (Object) null);
      aSMifierClassVisitor0.visit(49, (-252), "Vs", "mX7<dpd", "4UZ|/N9oQ@$t >rQq", ((AbstractVisitor) fieldVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess((-1288));
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(32767, "ytzs;Qo!/I>$y6%$0L", "oMM0;d/jYq.@bgH(H", "ytzs;Qo!/I>$y6%$0L", "oMM0;d/jYq.@bgH(H");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("if:5cYX$.class", "if:5cYX$.class", "}N}'<npB", (-2816));
      aSMifierClassVisitor0.visitInnerClass("1dvY}GH.", "%=FS[B*2GjyZB", "W", 127);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(50, (-2081), "P.class", "", "P.class", aSMifierClassVisitor0.OPCODES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(32767, "", "oMM0;d/jYq.@bgH(H", "", (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-3615), "3$T{aHC] j*Ik1^", "3$T{aHC] j*Ik1^", "Nau", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("mv.visitMaxs(", "mv.visitMaxs(", "otn7V\"L ", 32);
      aSMifierClassVisitor0.visit(32, (-1868), "oMM0;d/jYq.@bgH(H.class", "oMM0;d/jYq.@bgH(H.class", ",if:5zcY3$", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-3455), (-3455), "", "", ".class", (String[]) null);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(32767, "ytzs;Qo!/I>$y6%$0L", "ytzs;Qo!/I>$y6%$0L", "ytzs;Qo!/I>$y6%$0L", aSMifierClassVisitor0.TYPES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(32767, "ytzs;Qo!/I>$y6%$0L", "oMM0;d/jYq.@bgH(H", "ytzs;Qo!/I>$y6%$0L", "oMM0;d/jYq.@bgH(H");
      aSMifierClassVisitor0.visit(64, (-1944), "ytzs;Qo!/I>$y6%$0L", "cw.visitSource(", "cw.visitSource(", ((AbstractVisitor) fieldVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(64, 8192, "V1_4", "oMM0;d/jYq.@bgH(H", "ytzs;Qo!/I>$y6%$0L", stringArray0);
      aSMifierClassVisitor0.visitInnerClass("oMM0;d/jYq.@bgH(H", "5zcYX$", ".visitEnd();\n", (-1414));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess((-1288));
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32767, "ytzs;Qo!/I>$y6%$0L", "ytzs;Qo!/I>$y6%$0L", "ytzs;Qo!/I>$y6%$0L", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "if:5cYX$";
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
  public void test30()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("", "", (String) null, 32767);
      aSMifierClassVisitor0.visit(32, 32, "V1_4", "ow", "", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("mv.visitMaxs(", "JY+3fN{PU", "JY+3fN{PU", 16384);
      aSMifierClassVisitor0.visit((-3615), (-3615), "9wd.=p/:", "mv.visitIincInsn(", "mv.visitIincInsn(", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.appendAccess(3647);
      aSMifierClassVisitor0.visit(46, 46, "if:5cYX$", "if:5cYX$", "2YJWCN<hqIZd0uI", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(46, 46, "if:5cYX$", "if:5cYX$", "2YJWCN<hqIZd0uI", aSMifierMethodVisitor0.TYPES);
      ASMifierClassVisitor.main(aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("@bgH(H", "mv.visitFrame(Opcodes.F_CHOP,", "mv.visitFrame(Opcodes.F_CHOP,", (-2443));
      aSMifierClassVisitor0.visit(47, 3543, "UBnTW,:QqAsfV'ReMZ ", (String) null, "public static byte[] dump () throws Exception {\n\n", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(50, (-2081), "P.class", "", "P.class", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32767, "ytzs;Qo!/I>$y6%$0L", "", "ytzs;Qo!/I>$y6%$0L", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(50, 50, "FieldVisitor fv;\n", (String) null, (String) null, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-3455), (-3455), "", "", ".class", (String[]) null);
      aSMifierClassVisitor0.appendAccess(8192);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32767, "ytzs;Qo!/I>$y6%$0L", "ytzs;Qo!/I>$y6%$0L", "Label offset position has not been resolved yet", aSMifierClassVisitor0.OPCODES);
      ASMifierClassVisitor.main(((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(8192, (String) null, (String) null, "oMM0;d/jYq.@bgH(H.class", "oMM0;d/jYq.@bgH(H.class");
      aSMifierClassVisitor0.visitField((-677), "fD_36\tiwM0$`4o", (String) null, "new Byte((byte)", fieldVisitor0);
      String[] stringArray0 = new String[2];
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("if:5cYX$.class", "if:5cYX$.class", "}N}'<npB", (-2816));
      aSMifierClassVisitor0.visit(196653, (-2430), "1dvY}GH.", (String) null, "v=%kUdApkb", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(49, (-252), "Xb-$1{(f<uWM71", "fj(}u8(@0w@", "2l6+4]|)e&X8", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      Object object0 = new Object();
      aSMifierClassVisitor0.visitField(3985, (String) null, (String) null, (String) null, object0);
      String[] stringArray0 = new String[2];
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2816), "ytzs;Qo!/I>$y6%$0L", "5zcYX$", "5zcYX$", stringArray0);
      aSMifierClassVisitor0.visit(64, 8192, "V1_4", "oMM0;d/jYq.@bgH(H", "ytzs;Qo!/I>$y6%$0L", stringArray0);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod((-888), "oMM0;d/jYq.@bgH(H.class", "mv.visitFrame(Opcodes.F_NEW, ", "if:5cYX$.class", ((AbstractVisitor) methodVisitor0).TYPES);
      assertNotSame(methodVisitor1, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32767, "ytzs;Qo!/I>$y6%$0L", ":^\\[|[z@4i", "C5WDkfM3GJ7ksY", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("1dvY}GH.", "%=FS[B*2GjyZB", "W", 127);
      aSMifierClassVisitor0.visit(196653, (-2430), "1dvY}GH.", (String) null, "v=%kUdApkb", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[7];
      aSMifierClassVisitor0.visitInnerClass(" 0B", " 0B", "A?&YJ rA=yN\"@5B.y~", 2);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(32767, stringArray0[2], "oMM0;d/jYq.@bgH(H", "", (Object) null);
      aSMifierClassVisitor0.visit(49, (-252), "Vs", "mX7<dpd", "4UZ|/N9oQ@$t >rQq", ((AbstractVisitor) fieldVisitor0).OPCODES);
  }
}
