/*

 * Tue Mar 03 14:15:49 GMT 2020
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
import java.io.PrintStream;
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
      aSMifierClassVisitor0.visit(50, 50, "x(\"YW", "x(\"YW", "x(\"YW", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(48, 48, "V]_]", "V]_]", "V]_]", (String[]) null);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-);/e.D3WwM;DG.class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // -);/e.D3WwM;DG.class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(48, 1605, ".visitAnnotation(", ".visitAnnotation(", "new int[] {", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "av0 = cw.visitAnnotation(", "av0 = cw.visitAnnotation(", "r'D 7)J", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(32);
      aSMifierClassVisitor0.appendAccess(65535);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(168, 168, "}+T> Gj!aE\"FF", "}+T> Gj!aE\"FF", "}+T> Gj!aE\"FF", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass((String) null, (String) null, "&xTa*xc\"_IfzAG!`32", 32767);
      aSMifierClassVisitor0.visitInnerClass("", "", "new Character((char)", (-256));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(1605, 1605, "-);/e.D3WwM;DG", "c\"", "new int[] {", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1840700267), " }2uxMW/SzF f$eE`a", "@XXi", "visit(", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "X*I";
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("O7;s5R|ww;#?Gzff)", "", "X*I", (-658));
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
  public void test10()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-860), ".W(=es~<$l({.class", "#h %}", "c\"", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod((-1840700267), " }2uxMW/SzF f$eE`a", "@XXi", "visit(", (String[]) null);
      assertFalse(methodVisitor1.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.appendAccess(65535);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("Q{~R$/z[~.class", "Q{~R$/z[~.class", "Q{~R$/z[~.class", 1152);
      aSMifierClassVisitor0.visit(47, 47, "ACC_PUBLIC", "ACC_PUBLIC", "L:(l>", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(48, (-2423), "tY<{^y U[VkTOVO", "-);/e.D3WwM;DG", "Type(\"", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitInnerClass((String) null, (String) null, "&xTa*xc\"_IfzAG!`32", 32767);
      aSMifierClassVisitor0.visit((-269), (-658), "new Character((char)", (String) null, "new Character((char)", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "ACC_PUBLIC";
      aSMifierClassVisitor0.visit((-2944), 865, "ACC_PUBLIC", "l2ZYm=yeY", "7W&BY-|\"W5u", stringArray0);
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
  public void test16()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(4096, (-1183), "\r", "\r", "", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PrintStream printStream0 = new PrintStream(pipedOutputStream0, false);
      PrintWriter printWriter0 = new PrintWriter(printStream0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(1404, 8, ")&5vvg9[{X}!t1SCo;y", "*PE2t3RD", "%L8sL.9xZ5+Lyg", aSMifierMethodVisitor0.TYPES);
      aSMifierClassVisitor0.visitInnerClass("*PE2t3RD", "#9A3Ui\"gKQ;d~q", "%L8sL.9xZ5+Lyg", (-4096));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(65526);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2493), "Type(\".class", "Q{~R$/z[~", "Q{~R$/z[~", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-443), (-293), "^", "Label offset position has not been resolved yet", "0#0WU'DZ_N3N97W8d", (String[]) null);
      aSMifierClassVisitor0.visit(46, 1856, "#(X)-sS(MkJ=/O\"V9.class", ", ", "^", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(65535);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-543), "~<$l({", (String) null, "-);/e.D3WwM;DG", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-3251), 10, "c\"", "new int[] {", ";et7~(1W/HFh", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1840700267), " }2uxMW/SzF f$eE`a", "@XXi", "visit(", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(224, 224, "new Character((char)", "", "", aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("", "", "new Character((char)", (-256));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(16384, "new Character((char)", "new Character((char)", "", "new intq[] {");
      aSMifierClassVisitor0.visit(16384, (-806), "m<i-wp5g1F^4k{'HUt.class", "new Character((char)", "mv.visitInsn(", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("", "", "", (-658));
      aSMifierClassVisitor0.visit((-658), 16, "V1_4", "x(\"YW", "V1_4", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      ASMifierClassVisitor.main(aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("", "", "new Character((char)", (-256));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 8192, "AnnotationVisitor av", "AnnotationVisitor av", "visit(", aSMifierClassVisitor0.TYPES);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(165, 165, "-debug", ", ", "-debug", (String[]) null);
      aSMifierClassVisitor0.visit(46, 1856, "#(X)-sS(MkJ=/O\"V9.class", ", ", "^", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(50, (-365), "x(\"YW", "V1_4", "V1_4", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      ASMifierClassVisitor.main(aSMifierMethodVisitor0.OPCODES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "new Character((char)", "new Character((char)", "", "new intq[] {");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit((-658), (-658), "new Short((short)", "''3Lz84BzFz{k", "new Short((short)", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      String string0 = "\\u";
      aSMifierClassVisitor0.visitMethod(653, string0, "", (String) null, aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("", "", "new Character((char)", (-256));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(165, 165, "-debug", ", ", "-debug", (String[]) null);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "new intq[] {", "new intq[] {", "Label offset position has not been resolved yet", "SgV07L");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      ASMifierClassVisitor.main(aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass((String) null, (String) null, "&xTa*xc\"_IfzAG!`32", 32767);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      String string0 = "\\u";
      aSMifierClassVisitor0.visitMethod(653, string0, "", (String) null, aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass((String) null, (String) null, "&xTa*xc\"_IfzAG!`32", 32767);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(50, "CG1bUEOK=", "CG1bUEOK=", "CG1bUEOK=", stringArray0);
      aSMifierClassVisitor0.visitMethod((-917), "l5=s1I;x{CPh(Cu_", "U,}3:~u", "l5=s1I;x{CPh(Cu_", ((AbstractVisitor) methodVisitor0).OPCODES);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "Q{~R$/z[~";
      try { 
        ASMifierClassVisitor.main(stringArray1);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Q{~R$/z[~ (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "X*I";
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(65535);
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
  public void test37()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(224, 224, "new Character((char)", "", "", aSMifierMethodVisitor0.OPCODES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "new Character((char)", "new Character((char)", "", "new intq[] {");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(49, 1780, "~<$l({", "av0 = cw.visitAnnotation(", "av0 = cw.visitAnnotation(", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(49, (-2043), "x(\"YW", "Y=fH@iE5bg%", "x(\"YW", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(0, "@Q?RxbfRk_", "@Q?RxbfRk_", "@Q?RxbfRk_", "@Q?RxbfRk_");
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(196653, "W92_/R", "new int[] {", ",", ((AbstractVisitor) fieldVisitor0).TYPES);
      aSMifierClassVisitor0.visit(196653, 128, ", new int[] {", ",", "cw", ((AbstractVisitor) fieldVisitor0).TYPES);
      aSMifierClassVisitor0.visit(128, (-341), "@Q?RxbfRk_", "new int[] {", ".L-|5~G", ((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass((String) null, (String) null, "&xTa*xc\"_IfzAG!`32", 32767);
      aSMifierClassVisitor0.appendAccess(1000);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(224, 224, "new Character((char)", "", "", aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass((String) null, (String) null, "&xTa*xc\"_IfzAG!`32", 32767);
  }
}
