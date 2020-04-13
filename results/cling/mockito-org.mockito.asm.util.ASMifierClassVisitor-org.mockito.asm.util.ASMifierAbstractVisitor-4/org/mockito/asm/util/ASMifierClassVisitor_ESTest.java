/*

 * Tue Mar 03 14:15:28 GMT 2020
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
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.util.ASMifierClassVisitor;
import org.mockito.asm.util.ASMifierMethodVisitor;
import org.mockito.asm.util.AbstractVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ASMifierClassVisitor_ESTest extends ASMifierClassVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-2300), 183, "ACC_SYNTxETIC", "ACC_SYNTxETIC", "ACC_SYNTxETIC", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit((-315), 8192, "80teqa", "3l)F~tS=", "ACC_SYNTxETIC", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(192);
      PrintWriter printWriter0 = new PrintWriter(stringWriter0, true);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(48, 192, "return cw.toByteArray();\n", "Class not found", "Class not found", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(1024, 1024, "ACC_SYNTHETIC", "-5&-nM=", "ACC_SYNTHETIC", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(86, 16384, "n{#mT2*o.class", "x=|gEP", "000", aSMifierClassVisitor0.OPCODES);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-1816), "_CHOP,", (String) null, (String) null, object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "org.mockito.asm.ClassReader", (String) null, "ACC_DEPRECATED", object0);
      FieldVisitor fieldVisitor1 = aSMifierClassVisitor0.visitField(166, "org.mockito.asm.ClassReader", (String) null, "Opcodes.UNINITIALIZED_THIS", object0);
      assertFalse(fieldVisitor1.equals((Object)fieldVisitor0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(4139, "mv.visitFrame(Opcodes.F_CHOP,", "b6giqag2W", "(@i4x$EjcDj^Scnk_", "_n");
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-485415192), "_n", "SWKot&uO*)x", "^`uTN_E25&", ((AbstractVisitor) fieldVisitor0).OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ")/^c1R@fkwoz{_Kh#bx";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // )/^c1R@fkwoz{_Kh#bx (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(65535, "4FwCmC#Lxtt5/?*W", "ePkBCRq{f!1;:*gg", "{\n", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("@_ [p|WmiQGT`%", "@_ [p|WmiQGT`%", "@_ [p|WmiQGT`%", 16384);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1024, " }", "ct[] {", " }", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(128, "#mT2*o", "e%p87f3%)Y%3x`w5k`", "4FwCmC#Lxtt5/?*W", ((AbstractVisitor) methodVisitor0).OPCODES);
      assertNotSame(methodVisitor0, methodVisitor1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visitMethod(16384, ", new Label[] {", ", new Label[] {", ", new Label[] {", stringArray0);
      aSMifierClassVisitor0.visitInnerClass(", new Label[] {", ", new Label[] {", ", new Label[] {", 16384);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(65535);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1318), "", ".visitAttribute(attr);\n.class", "9>!DeJ8%P)", aSMifierMethodVisitor0.OPCODES);
      assertFalse(methodVisitor0.equals((Object)aSMifierMethodVisitor0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("Opcodes.UNINITIALIZED_THIS", "Opcodes.UNINITIALIZED_THIS", "Opcodes.UNINITIALIZED_THIS", 65535);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass(", new Label[] {", ", new Label[] {", ", new Label[] {", 16384);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2875), "", "cw.visitInnerClass(", ", new Label[] {", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass(", new Label[] {", ", new Label[] {", ", new Label[] {", 16384);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-3668), " ", (String) null, "T/zw5T(Ql", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(65535);
      aSMifierClassVisitor0.appendAccess(2104);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(16384, 86, "Opcodes.UNINITIALIZED_THIS", "_CHOP,", "ations", aSMifierClassVisitor0.OPCODES);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "org.mockito.asm.ClassReader", (String) null, "ACC_DEPRECATED", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit((-315), 8192, "80teqa", "3l)F~tS=", "ACC_SYNTxETIC", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitField((-5198), ", null, 0, null", "org.mockito.asm.ClassWriter", "org.mockito.asm.ClassWriter", (Object) null);
      aSMifierClassVisitor0.visitInnerClass("=<RFl\"", "org.mockito.asm.ClassWriter", "", 96);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(16384, ", new Label[] {", "ARARGS", ", new Label[] {", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(1491, 72, "n{#mT2*o", "", "ARARGS", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(65535, 8192, "+3 c.@L>MurNOc[m` \"", "av0 = ", "{\n", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.appendAccess(2104);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(65535);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(12);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, "RuntimeInvisibleParameterAnnotations.class", "THETIC.class", "THETIC.class", "av0 = ");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(47, 311, "#JpG!4W.-cX[iL.class", "#JpG!4W.-cX[iL.class", "(short)", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(65535, 8192, "+3 c.@L>MurNOc[m` \"", "av0 = ", "{\n", aSMifierClassVisitor0.TYPES);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1318), "", ".visitAttribute(attr);\n.class", "9>!DeJ8%P)", aSMifierMethodVisitor0.OPCODES);
      assertNotSame(aSMifierMethodVisitor0, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(188, 188, "n{#mT2*o.class", "@zy!9/Me(h", ", new Label[] {", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-813), "fR", "@zy!9/Me(h", "@zy!9/Me(h", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass(", new Label[] {", ", new Label[] {", ", new Label[] {", 16384);
      aSMifierClassVisitor0.visit((-1936150543), 2099, "ACC_VARARGS", "5{|", "ACC_VARARGS", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(1727, 59, " ", "\n", " ", (String[]) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2028), "ACC_VARARGS", "dU;[:V", "}%;H6u/Ry", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1024, " }", "ct[] {", " }", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(49, (-173), "ct[] {", "av0 = cw.visitAnnotation(", "y)s Pp3{7 I", ((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visitMethod(16384, ", new Label[] {", ", new Label[] {", ", new Label[] {", stringArray0);
      aSMifierClassVisitor0.visit(192, 524288, "RWD4QG|/P _nd", "A", ", new Label[] {", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod((-3368), "/OBbc~g", "/OBbc~g", "/OBbc~g", stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = ".visitAttribute(attr);\n";
      try { 
        ASMifierClassVisitor.main(stringArray1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Class not found
         //
         verifyException("org.mockito.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(12, 32, "+3 c.@L>MurNOc[m` \"", ".*$`S#O:ITT$S", ".*$`S#O:ITT$S", aSMifierClassVisitor0.OPCODES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, "RuntimeInvisibleParameterAnnotations.class", "THETIC.class", "THETIC.class", "av0 = ");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(16384, ", new Label[] {", ", new Label[] {", ", new Label[] {", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit((-1936150543), 2099, "ACC_VARARGS", "5{|", "ACC_VARARGS", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("Opcodes.UNINITIALIZED_THIS", "Opcodes.UNINITIALIZED_THIS", "ations", (-801));
      aSMifierClassVisitor0.visit(196653, 168, "1/,E,Xlsxc*2L@J", ", new Label[] {", "!|F1v$\"Rto", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1024, " }", "ct[] {", " }", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visitField(49, "(short)", "av0 = cw.visitAnnotation(", (String) null, "(short)");
      aSMifierClassVisitor0.visit(49, (-173), "ct[] {", "av0 = cw.visitAnnotation(", "y)s Pp3{7 I", ((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(65535);
      aSMifierClassVisitor0.visit(65535, 8192, "+3 c.@L>MurNOc[m` \"", "av0 = ", "{\n", aSMifierClassVisitor0.TYPES);
  }
}
