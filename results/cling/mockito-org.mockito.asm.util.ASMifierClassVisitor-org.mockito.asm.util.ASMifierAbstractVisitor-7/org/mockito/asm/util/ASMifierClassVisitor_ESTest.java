/*

 * Tue Mar 03 14:15:23 GMT 2020
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
      aSMifierClassVisitor0.visitMethod(16384, "35WT[Y<P6", (String) null, (String) null, aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(83, 1757, "R\"", "ACC_INTERFACE", "C|Ic4Pv66@%1[kb5=-T", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1), ").S^|]Y1OnA&", "=&UbiOJZJLr}k[Ky:", "", (String[]) null);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(32767, "=&UbiOJZJLr}k[Ky:", "", "", (String[]) null);
      assertFalse(methodVisitor1.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(47, 47, "SourceFile", "SourceFile", "ACC_FINAL.class", (String[]) null);
      aSMifierClassVisitor0.visit(47, 8192, "SourceFile", "new Character((char)", "ACC_STRICT", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("SourceFile", true);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-751), "av0 = ", "=&UbiOJZJLr}k[Ky:", ", new Object[] {", (String[]) null);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(32767, "", "av0 = ", "Cq5:C~w[!", ((AbstractVisitor) annotationVisitor0).TYPES);
      assertFalse(methodVisitor1.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "mk.class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // mk.class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(48, 48, "ACCSUPE", "ACCSUPE", "new Float(\"", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(47, (-220), "ACC_FINAL.class", "java/lang/Object", "ACC_FINAL.class", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("SourceFile", true);
      aSMifierClassVisitor0.appendAccess(48);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32767, "", "av0 = ", "Cq5:C~w[!", ((AbstractVisitor) annotationVisitor0).TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "V#%`)pAk)I@/{(";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // V#%`)pAk)I@/{( (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(224, "AnnotationDefault", "&nY>EN>R/{/.e^_", "&nY>EN>R/{/.e^_", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visitInnerClass("av0 = .class", "AnnotationDefault", "nv%e:XdgL", 16384);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(47, 47, "java/lang/Object", "", "=nOA>U9|MnR([i:IFaJ", (String[]) null);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, " = av", "ZTzXR1", "5UV-A`%W73,7:0n", ", new Object[] {");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod((-1932), "Opcodes.NULL", ":b=AWY!U8JmC]", "BMc-s_ {~2e^$uh4SQT", (String[]) null);
      aSMifierClassVisitor0.visitInnerClass("mk", "dInsn(", "mk", 16384);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(1773, 1632, ", new Object[] {.class", ", new Object[] {.class", ", new Object[] {.class", stringArray0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-1694), (String) null, "uWkNU", "9>[5;", "EKZo:)S$~2m*_Cn");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(128, "O7kZ[v(eSg^Cf", "dInsn(", "/;'QoP", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("fv", "fv", "fv", 16384);
      aSMifierClassVisitor0.visit((-1599), (-1599), "\"F_~Wp^4G>tv0@JN", "dInsn(", "\"F_~Wp^4G>tv0@JN", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, ", new Object[] {", (String) null, (String) null, ", new Object[] {");
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "eb;W7BN0R@H=0jN", "ACC_SYNCHRONIZED", "PP", ((AbstractVisitor) fieldVisitor0).TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("", "Boolean.TRUE.class", "w41k-Z=X5:p", 32767);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, ":XQ`!gWl;1V}RNtt=4", "ePLdLKL'hZm,h:`:2.class", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "8Z";
      aSMifierClassVisitor0.visit((-545), (-32768), "8Z", "8Z", "8Z", stringArray0);
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
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[5];
      aSMifierClassVisitor0.visit(49, 2, "av0 = mv.visitParameterAnnotation(", "Boolean.TRUE", (String) null, stringArray0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "&nY>EN>R/{/.e^_", "Boolean.TRUE", "Ls)3./7iKjZ", stringArray0[1]);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, ", new Object[] {", (String) null, (String) null, ", new Object[] {");
      aSMifierClassVisitor0.visit((-28), 240, "mv.visitJumpInsn(", ",F", ",F", ((AbstractVisitor) fieldVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("EnclosingMethod", "EnclosingMethod", "EnclosingMethod", 16384);
      aSMifierClassVisitor0.visit(16384, 1272, "EnclosingMethod", (String) null, (String) null, aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-545), (-545), "8Z", "8Z", "8Z", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(46, 1923, "+k", "e2k}prs*&^3qy", "new Character((char)", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(44, "JzX", "JzX", "JzX", (String[]) null);
      aSMifierClassVisitor0.visit(8192, 8192, "java/lang/Object", "EUn'mFr]?Es-#s30Ku", "T\"NS;OW>SEc\"ESf+,M.", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16392, ", new Object[] {", (String) null, (String) null, ", new Object[] {");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("uoLvRa+W[$56o", "uoLvRa+W[$56o", "@;`Y/(+lL]XqX@z>@", 16392);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(1, 8192, "C|Ic4Pv66@%1[kb5=-T", "C|Ic4Pv66@%1[kb5=-T", "C|Ic4Pv66@%1[kb5=-T", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(83, 1757, "R\"", "ACC_INTERFACE", "C|Ic4Pv66@%1[kb5=-T", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod((-751), "av0 = ", "=&UbiOJZJLr}k[Ky:", ", new Object[] {", (String[]) null);
      aSMifierClassVisitor0.appendAccess(48);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(1, 8192, "C|Ic4Pv66@%1[kb5=-T", "C|Ic4Pv66@%1[kb5=-T", "C|Ic4Pv66@%1[kb5=-T", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(5328, (String) null, "C|Ic4Pv66@%1[kb5=-T", "ACC_STRICT", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32767, "", ":XQ`!gWl;1V}RNtt=4", ":XQ`!gWl;1V}RNtt=4", aSMifierClassVisitor0.TYPES);
      ASMifierClassVisitor.main(((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("av0 = ", "dInsn(", "av0 = ", 16384);
      aSMifierClassVisitor0.visit(16384, 16384, " +564UE?/xA>p?,", (String) null, "b#dP", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(46, 226, ", new Object[] {.class", "Q$Wr/ZFS", "", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(Integer.MAX_VALUE, Integer.MAX_VALUE, "\"\"K", "\"\"K", "^M", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(50, 32, "|Vfi93?/z?occU", "fvi%[B'!'V`", "", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(1, 8192, "C|Ic4Pv66@%1[kb5=-T", "C|Ic4Pv66@%1[kb5=-T", "C|Ic4Pv66@%1[kb5=-T", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "35WT[Y<P6", (String) null, (String) null, aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(22, "C|Ic4Pv66@%1[kb5=-T", "C|Ic4Pv66@%1[kb5=-T", "mv.visitLocalVariable(", ((AbstractVisitor) methodVisitor0).TYPES);
      assertNotSame(methodVisitor0, methodVisitor1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor.main(stringArray0);
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, stringArray0[2], (String) null, (String) null, "new boolean[] {");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("fv", "fv", "fv", 16384);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-600), (-600), "new Character((char)", "new Character((char)", "new Character((char)", (String[]) null);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(8192, "new Character((char)", (String) null, "new Character((char)", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(1773, 1632, ", new Object[] {.class", ", new Object[] {.class", ", new Object[] {.class", stringArray0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(1623, 16384, "", "", "d", aSMifierMethodVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor.main(stringArray0);
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-155), (-155), "ePLdLKL'hZm,h:`:42", "ePLdLKL'hZm,h:`:42", "}@D", stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String[] stringArray0 = new String[3];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-155), (-155), "ePLdLKL'hZm,h:`:42", "ePLdLKL'hZm,h:`:42", "}@D", stringArray0);
      String[] stringArray1 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(267, "ePLdLKL'hZm,h:`:2.class", (String) null, ");\n", stringArray1);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[3];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(16384, stringArray0[2], (String) null, (String) null, "new boolean[] {");
      String[] stringArray1 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(267, "ePLdLKL'hZm,h:`:2.class", (String) null, ");\n", stringArray1);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      aSMifierClassVisitor0.visitMethod((-4390), "{31CW^;)F3Xw,+U.class", "", "new Integer(", stringArray0);
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
  public void test41()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, ", new Object[] {", (String) null, (String) null, ", new Object[] {");
      FieldVisitor fieldVisitor1 = aSMifierClassVisitor0.visitField(190, "/?\"TJVFKuW6}", ", new Object[] {", "Label ", (Object) null);
      assertFalse(fieldVisitor1.equals((Object)fieldVisitor0));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String[] stringArray0 = new String[3];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-155), (-155), "ePLdLKL'hZm,h:`:42", "ePLdLKL'hZm,h:`:42", "}@D", stringArray0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, stringArray0[2], (String) null, (String) null, "new boolean[] {");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(49, 16384, "l", "~7", "~7", (String[]) null);
      aSMifierClassVisitor0.visit(196653, (-50), "~7", "l", "m5y'j>&jcps<yoqpFR-", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("", "Boolean.TRUE.class", "w41k-Z=X5:p", 32767);
      aSMifierClassVisitor0.visit(127, (-1664), "Boolean.TRUE.class", "ePLdLKL'hZm,h:`:2.class", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", aSMifierClassVisitor0.TYPES);
  }
}
