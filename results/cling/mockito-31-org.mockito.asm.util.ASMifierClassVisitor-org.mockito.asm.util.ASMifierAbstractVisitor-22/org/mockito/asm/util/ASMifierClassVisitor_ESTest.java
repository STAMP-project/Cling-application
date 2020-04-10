/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 08:44:33 GMT 2019
 */

package org.mockito.asm.util;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
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
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(128, "@c32P.)h<", "V1_2", "@c32P.)h<", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(127, 127, "}, 0, null", (String) null, "", (String[]) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16374, ")4Y4x3(xj,K|2}Pe", (String) null, "new Double(\"", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(2848, 16371, "9?]L@H", "9?]L@H", ">EziuU8Ng?Z*,", stringArray0);
      aSMifierClassVisitor0.visitInnerClass("9?]L@H", ">EziuU8Ng?Z*,", "mv.visitIincInsn(", 16371);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("9?]L@H", ">EziuU8Ng?Z*,", "mv.visitIincInsn(", 16371);
      aSMifierClassVisitor0.visit((-2224), (-2224), "ACC_PRIVATE.class.class", ">EziuU8Ng?Z*,", "ACC_PRIVATE.class.class", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(32767, "V1_2.class", "V1_2.class", "V1_2.class", aSMifierClassVisitor0.OPCODES);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(391, 8192, "F`\"5B7P8ZfaW", "n51L2i.class", "F`\"5B7P8ZfaW", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(49, "F", "zn(CkmS;vUEjssLx}", "zn(CkmS;vUEjssLx}", aSMifierClassVisitor0.OPCODES);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "QM";
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
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 8192, "InnerClasses.class", "w.KU&g", "B#=%.J", aSMifierClassVisitor0.TYPES);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "QM";
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
  public void test08()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String[] stringArray0 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "ACC_PRIVATE.class.class", (String) null, (String) null, stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(48, 6040, "n51L2i.class", "n51L2i.class", ".%}`0D R(X4T.class", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(49, "F", "zn(CkmS;vUEjssLx}", "zn(CkmS;vUEjssLx}", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(391, 8192, "F`\"5B7P8ZfaW", "n51L2i.class", "F`\"5B7P8ZfaW", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(391, ".%}`0D R(X4T", ".visitEnd();\n", "w.KU&g", ((AbstractVisitor) methodVisitor0).OPCODES);
      assertNotSame(methodVisitor0, methodVisitor1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(199);
      PrintWriter printWriter0 = new PrintWriter(byteArrayOutputStream0, false);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1448), ",", "ACC_SUPER", "mv.visitVarInsn(", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-300), (-300), "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", " kTX`6`.class.class", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(127, 127, "}, 0, null", (String) null, "", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, ".%}`0D R(X4T", ".%}`0D R(X4T", ".%}`0D R(X4T", ".%}`0D R(X4T");
      Object object0 = new Object();
      FieldVisitor fieldVisitor1 = aSMifierClassVisitor0.visitField(220, "", "", "e%=c :", object0);
      assertNotSame(fieldVisitor1, fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(196653, (-2218), "O~6j]=1U3g13SB", "Y;:U*hPA HYf^ +", "eTable", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-224), "++AS971KQ1GPd", "++AS971KQ1GPd", "*4>l%", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, ".%}`0D R(X4T", ".%}`0D R(X4T", ".%}`0D R(X4T", ".%}`0D R(X4T");
      aSMifierClassVisitor0.visitMethod((-1652), "QMJ^", "V1_4", "k)01N@& NCM&h.2et\"X", aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(49, 3631, "w]Y", "Wr", ".%}`0D R(X4T", ((AbstractVisitor) fieldVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(1000, 1000, "9%an3kH)2rs+v", "", "ed 2E2v=h6wHntr", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "9%an3kH)2rs+v", "}, 0, null", "}, 0, null", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(1000, 1000, "es.TOP", "es.TOP", "es.TOP", aSMifierClassVisitor0.TYPES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-452), "es.TOP", ">=V8~s=QE?\"UORm*Zd5", ">=V8~s=QE?\"UORm*Zd5", (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitField(16384, ".%}`0D R(X4T", ".%}`0D R(X4T", ".%}`0D R(X4T", ".%}`0D R(X4T");
      aSMifierClassVisitor0.visit(16384, 4, "", "", "V1_2", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitField(16384, ".%}`0D R(X4T", ".%}`0D R(X4T", ".%}`0D R(X4T", ".%}`0D R(X4T");
      ASMifierClassVisitor.main(aSMifierMethodVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-300), (-300), "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", " kTX`6`.class.class", aSMifierClassVisitor0.OPCODES);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod((-2049), "Opcodes.TOP", "long", "", aSMifierClassVisitor0.OPCODES);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
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
  public void test23()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod((-2048), "Opcodes.TOP", "long", "", aSMifierClassVisitor0.OPCODES);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
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
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visitMethod(1538, "9?]L@H", "V1_3", "9%an3kH)2rs+v", stringArray0);
      aSMifierClassVisitor0.visit(50, (-1), "-cl/Wpw?<\"", "4u", "V1_3", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2049), "Opcodes.TOP", "long", "", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(46, (-1), "-cl/Wpw?<\"", "Opcodes.TOP", "new Double(\".class", ((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "nMe<G/";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // nMe<G (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "ACC_PRIVATE.class.class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // ACC_PRIVATE.class.class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(48, 127, ";", "n51L2i;class", "cw.visit(", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(47, 47, "Opcodes.TOP.class", "Opcodes.TOP.class", "mv.visitFrame(Opcodes.F_CHOP,", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.appendAccess((-2570));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("9?]L@H", ">EziuU8Ng?Z*,", "mv.visitIincInsn(", 16384);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(131072, "}, 0, null", "Type.getType(\"", "Type.getType(\"", (String[]) null);
      aSMifierClassVisitor0.visitInnerClass("% :ul*, 0, null", "~\"<%rC#P`0E,qy#0{8(", "}\n", 16384);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, ".%}`0D R(X4T", ".%}`0D R(X4T", ".%}`0D R(X4T", ".%}`0D R(X4T");
      aSMifierClassVisitor0.visit(46, 48, "mv.visitTableSwitchInsn(", "Vi)IZ];UtT3uiQ% !", ".%}`0D R(X4T.class", ((AbstractVisitor) fieldVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(2848, 16384, "9?]L@H", "9?]L@H", ">EziuU8Ng?Z*,", stringArray0);
      aSMifierClassVisitor0.visitInnerClass("9?]L@H", ">EziuU8Ng?Z*,", "mv.visitIincInsn(", 16384);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("@Q?Gfkrlr", "O~6j]=1U3g13SB", "n51L2i.class", 16384);
      aSMifierClassVisitor0.visit(196653, 1, "O~6j]=1U3g13SB", "eTable", (String) null, (String[]) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("% :ul*, 0, null", "~\"<%rC#P`0E,qy#0{8(", "}\n", 16384);
      aSMifierClassVisitor0.visitInnerClass("ube(", (String) null, ".%}`0D R(X4T.class", 32);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("9?]L@H", ">EziuU8Ng?Z*,", "mv.visitIincInsn(", 16384);
      aSMifierClassVisitor0.visit(50, (-1), "-cl/Wpw?<\"", "4u", "V1_3", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("% :ul*, 0, null", "~\"<%rC#P`0E,qy#0{8(", "}\n", 16384);
      aSMifierClassVisitor0.appendAccess(200);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, ")4Y4x3(xj,K|2}Pe", (String) null, "new Double(\"", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-300), (-300), "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", " kTX`6`.class.class", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, ")4Y4x3(xj,K|2}Pe", (String) null, "new Double(\"", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visitInnerClass("9?]L@H", ">EziuU8Ng?Z*,", "mv.visitIincInsn(", 16384);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1538, "9?]L@H", "V1_3", "9%an3kH)2rs+v", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(32767, "V1_2.class", "V1_2.class", "V1_2.class", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(46, 1434, "new Double(\".class", "vTJwYloI7%IIInh!|k", "V1_2.class", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("9?]L@H", ">EziuU8Ng?Z*,", "mv.visitIincInsn(", 16384);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1538, "9?]L@H", "V1_3", "9%an3kH)2rs+v", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(127, 127, "}, 0, null", (String) null, "", (String[]) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, ")4Y4x3(xj,K|2}Pe", (String) null, "new Double(\"", (String[]) null);
      assertNotNull(methodVisitor0);
  }
}
