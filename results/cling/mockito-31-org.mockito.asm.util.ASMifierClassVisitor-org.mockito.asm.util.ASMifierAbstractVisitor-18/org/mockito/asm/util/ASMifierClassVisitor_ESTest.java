/*

 * Tue Mar 03 14:16:30 GMT 2020
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
      aSMifierClassVisitor0.visit(50, 50, "-debug", "0IV{:)'!#;T  < 0t", "En9S6p2Y4|]J(0,VzL", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "D{12x[k5178N<m13s.class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // D{12x[k5178N<m13s.class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(852, 852, "-debug", (String) null, "-debug", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(48, (-2261), "bU}~n1Zx_41*D4h;yy", "$`R5$ZVkc]2X", "]oo7Fp;Z[=n!", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitField((-3966), ".visit(", ".visit(", "@6&5MOs5]", ".visit(");
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit((-3966), 8192, "-debug", "-debug", (String) null, aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(13, 1024, ":=", "D{12x[k5178N<m13s", ".visitAttribute(attr);\n", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod((-168), "ACC_ABSTRACT", "ACC_ABSTRACT", "StackMap", aSMifierClassVisitor0.OPCODES);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("NPDYw;TG3(}DN;", false);
      aSMifierClassVisitor0.visit((-2068), 128, "?I-/4", "StackMap", "ACC_ABSTRACT", ((AbstractVisitor) annotationVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(102);
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1002), (String) null, "C,L[XzU", "C,L[XzU", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("V1_2", "VHE3N:&/|<", "rouo|]fP>W8D&-}U%4_", 32767);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(128);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(32767, "r'", "r'", "// ATTRIBUTE ", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visitInnerClass("V1_2", "N:ho[CGYpw&c-3E\"", "rouo|]fP>W8D&-}U%4_", 32767);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "opS_z!,+u4{&@K=";
      aSMifierClassVisitor0.visitMethod(20, "opS_z!,+u4{&@K=", "opS_z!,+u4{&@K=", "", stringArray0);
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
  public void test11()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(102);
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(102, "", "g3skM2-", "g3skM2-", aSMifierClassVisitor0.TYPES);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(102, (-967), "g3skM2-", "D{12x[k5178N<m13s", "D{12x[k5178N<m13s", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(12, "", "-debug", "", "");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-debug";
      ASMifierClassVisitor.main(stringArray0);
      aSMifierClassVisitor0.visit(92, 1384, "new Integer(", "new Integer(", "g3skM2-.class", ((AbstractVisitor) fieldVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(120);
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("", "*,Qr3F1Qe_b^{", "E`[`==", (-3576));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32767, "r'", "r'", "// ATTRIBUTE ", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(2369, 0, ",7cO@hB9y", "s.7G>%RB", (String) null, aSMifierMethodVisitor0.OPCODES);
      assertFalse(aSMifierMethodVisitor0.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitInnerClass("V1_2", "VHE3N:&/|<", "rouo|]fP>W8D&-}U%4_", 32767);
      aSMifierClassVisitor0.visit(2369, 0, ",7cO@hB9y", "s.7G>%RB", (String) null, aSMifierMethodVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32767, "VHE3N:&/|<", "V1_2", "7SEw &[xEij7p", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(102, "*k6P0h#", "-8{W0A34", "U8#", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(48, (-2261), "bU}~n1Zx_41*D4h;yy", "$`R5$ZVkc]2X", "]oo7Fp;Z[=n!", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("Opcodes.INTEGER", false);
      aSMifierClassVisitor0.visitMethod(92, "Opcodes.INTEGER", "", "", ((AbstractVisitor) annotationVisitor0).TYPES);
      aSMifierClassVisitor0.visit(181, 8192, "mv.visitMethodInsn(", "SA", "PS5c,A\u000188r~", ((AbstractVisitor) annotationVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("Opcodes.INTEGER", false);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(181, 8192, "mv.visitMethodInsn(", "SA", "PS5c,A\u000188r~", ((AbstractVisitor) annotationVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32767, "r'", "r'", "// ATTRIBUTE ", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit((-833), 3653, "VHE3N:&/|<", "FCcdI", "", ((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitInnerClass("V1_2", "N:ho[CGYpw&c-3E\"", "rouo|]fP>W8D&-}U%4_", 32767);
      aSMifierClassVisitor0.visit((-833), 3653, "VHE3N:&/|<", "FCcdI", "", aSMifierMethodVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitInnerClass("V1_2", "N:ho[CGYpw&c-3E\"", "rouo|]fP>W8D&-}U%4_", 32767);
      aSMifierClassVisitor0.visit(32767, (-273), "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "@BNXa: K5y9Xr1~VA", "Opcodes.NULL", aSMifierMethodVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(50, (-746), "Mj.^5uJX3}(\"aD", "0IV{:)'!#;T  < 0t", "-debug", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("Opcodes.INTEGER", false);
      aSMifierClassVisitor0.visitMethod(8, "Opcodes.INTEGER", "", "SA", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(181, 8192, "mv.visitMethodInsn(", "SA", "PS5c,A\u000188r~", ((AbstractVisitor) annotationVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod((-168), "ACC_ABSTRACT", "ACC_ABSTRACT", "ACC_ABSTRACT", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("ACC_ABSTRACT", (String) null, "qcYeB", 224);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(102);
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(102, (-3647), "Opcodes.INTEGER", "Opcodes.INTEGER", "Opcodes.INTEGER", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(32767, "r'", "r'", "// ATTRIBUTE ", aSMifierClassVisitor0.TYPES);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[6];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitField(185, "// ATTRIBUTE ", "Om8KtL-G>7-p=>K", "V1_2", stringArray0[2]);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(102);
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(102, "", "g3skM2-", "g3skM2-", stringArray0);
      aSMifierClassVisitor0.visit(102, (-967), "g3skM2-", "D{12x[k5178N<m13s", "D{12x[k5178N<m13s", ((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "D{12x[k5178N<m13s";
      aSMifierClassVisitor0.visitMethod((-551), "opS_z!,+u4{&@K=", "D{12x[k5178N<m13s", "", stringArray0);
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
  public void test32()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32767, "r'", "r'", "// ATTRIBUTE ", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(32767, (-273), "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "@BNXa: K5y9Xr1~VA", "Opcodes.NULL", aSMifierMethodVisitor0.OPCODES);
      assertFalse(aSMifierMethodVisitor0.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod((-168), "ACC_ABSTRACT", "ACC_ABSTRACT", "StackMap", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(196653, 0, "{5A", "{5A", "", aSMifierClassVisitor0.TYPES);
  }
}
