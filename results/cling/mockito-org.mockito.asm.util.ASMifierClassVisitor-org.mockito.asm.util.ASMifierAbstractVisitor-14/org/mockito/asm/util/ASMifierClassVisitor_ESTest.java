/*

 * Tue Mar 03 14:16:13 GMT 2020
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
      aSMifierClassVisitor0.visit(196653, 196653, "Q@HsI=HYGIa1:f", "l3^OtR2PX'g:", "tsG|L|j,NAiZiE3|yIz", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.appendAccess((-58));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(9, 8192, "F&ZP\"a4nmm)F`=/", "c_Fq+", "F&ZP\"a4nmm)F`=/", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[2];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 8192, "short)", "AnnotationDefault", (String) null, stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "~vN@g%Xi6B(.lymya";
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
  @Ignore
  public void test03()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "QWNVWQ>4)+Z/]qq\"_HN";
      aSMifierClassVisitor0.visitField(1344, "1`2H,o2", "1`2H,o2", "\"w }t-4-", "l3^OtR2PX'g:");
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // QWNVWQ>4)+Z/]qq\"_HN (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(65535, "new Double(\"", "HG", "QWNVWQ>4)+Z/]qq\"_HN", "new Byte((byte)");
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(65535, 65535, "QWNVWQ>4)+Z/]qq\"_HN", "new Float(\"", "new Float(\"", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "7Q~[";
      aSMifierClassVisitor0.visit((-3826), (-3826), "7Q~[", "LocalVariableTable", "7Q~[", stringArray0);
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
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(192, 8192, "ACC_FINAL", ", new int[] {", "3.class", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(291, "Type(\"", "U]&", "+ oN-g`h{`1D:)J", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(16384, 16384, ".visitEnum(", "-debug", ".visitEnum(", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[2];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 8192, "short)", "AnnotationDefault", (String) null, stringArray0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(196, "ACC_SUPER", "AnnotationDefault", "q_&~Fi91&}~", "");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass((String) null, "uyUkN%;cS8 a xf>b", (String) null, 65535);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(128, "ACC_DEPRECATED", " }, new Label[] {", "mv.visitLineNumber(", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(65535);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(65535, "new Double(\"", "new Double(\"", "QWNVWQ>4)+Z/]qq\"_HN", "new Byte((byte)");
      aSMifierClassVisitor0.visitInnerClass((String) null, "uyUkN%;cS8 a xf>b", (String) null, 65535);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(1024, 92, "#i `LHE-~!oK.class", "R8'K&`mF%6", (String) null, aSMifierClassVisitor0.OPCODES);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Opcodes.TOP.class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Opcodes.TOP.class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(196653, 196653, "ACC_BRIDGE", "ACC_BRIDGE", "`>@`sy^.c|#Te{", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(8192, 8192, "", "5Vtjg(!yC$0#VQ'Z&", "Type.getType(\"", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(65535, "new Double(\"", "HG", "QWNVWQ>4)+Z/]qq\"_HN", "new Double(\"");
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-995), "3.class", " Y", ">ov|:IEbz#B1dst0", aSMifierMethodVisitor0.OPCODES);
      assertNotSame(aSMifierMethodVisitor0, methodVisitor0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "QWNVWQ>4)+Z/]qq\"_HN";
      aSMifierClassVisitor0.visitMethod(0, "QQ[=P%FpO", "ACC_ANNOTATION", "QWNVWQ>4)+Z/]qq\"_HN", stringArray0);
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // QWNVWQ>4)+Z/]qq\"_HN (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      Object object0 = new Object();
      aSMifierClassVisitor0.visitField(185, "", "QWNVWQ>4)+Z/]qq\"_HN.class", ")V", object0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "~vN@g%Xi6B(.lymya";
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
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(490, "w]g|tA#Q:05DEt ", "qq\"_HN", "A 9:&F`'IU+", (String[]) null);
      aSMifierClassVisitor0.visitMethod(16, "mGwFXYWD", (String) null, "7Q~[", ((AbstractVisitor) methodVisitor0).OPCODES);
      aSMifierClassVisitor0.visitInnerClass("A 9:&F`'IU+", "]A23LXBg93!u", (String) null, 16384);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(16384, 16384, "QWNVWQ>4)+Z/]qq\"_HN", "%Dc p~g4J5?*Gr", "7;@2|3Fd{e~E%", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-2895), (-2895), "SI5=wxei(&DDr", "SI5=wxei(&DDr", (String) null, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-debug";
      ASMifierClassVisitor.main(stringArray0);
      aSMifierClassVisitor0.appendAccess(1024);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(76, "c|#Te{", "L)", "c|#Te{", aSMifierClassVisitor0.TYPES);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-debug";
      ASMifierClassVisitor.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(48, 8192, "mv.visitFieldInsn(", "Opcodes.TOP", "double", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(10, (-1404), "#i `LHE-~!oK.class", "#i `LHE-~!oK.class", "R8'K&`mF%6", aSMifierClassVisitor0.TYPES);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Opcodes.TOP.class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Opcodes.TOP.class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(59, "k", "void", "void", "void");
      String[] stringArray0 = new String[3];
      aSMifierClassVisitor0.visitInnerClass("VY;", "z3hS;d[\" SCSG\"1%", stringArray0[1], 16384);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[2];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 8192, "short)", "AnnotationDefault", (String) null, stringArray0);
      aSMifierClassVisitor0.visit(248, 248, "E-~!oK", "", "short)", stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("'", true);
      aSMifierClassVisitor0.visit(48, 8192, "mv.visitFieldInsn(", "Opcodes.TOP", "double", ((AbstractVisitor) annotationVisitor0).OPCODES);
      aSMifierClassVisitor0.visit(49, 49, ";\n.class", "LJV", ")V", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[8];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(46, 46, ".visiAnnotation(", ";\n", "Q@HsI=HYGIa1:f", stringArray0);
      aSMifierClassVisitor0.appendAccess((-1));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("'", true);
      aSMifierClassVisitor0.visit(48, 8192, "mv.visitFieldInsn(", "Opcodes.TOP", "double", ((AbstractVisitor) annotationVisitor0).TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(13, ")V", "mv.visitTypeInsn(", "ACC_BRIDGE", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-2964), (-3065), "", "~vN@g%Xi6B(.lymya", "~vN@g%Xi6B(.lymya", (String[]) null);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(65535, "", "~vN@g%Xi6B(.lymya", "HG", (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-3065), "", "~vN@g%Xi6B(.lymya", "~vN@g%Xi6B(.lymya", "");
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "", "Z4|.Q?", ")V.class", ((AbstractVisitor) fieldVisitor0).OPCODES);
      aSMifierClassVisitor0.visit((-3065), 16384, "P", "P", "mv.visitLocalVariable(", ((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(16384, 224, "aaiTb0qA~.l.;;L>\r", "0y", "aaiTb0qA~.l.;;L>\r", (String[]) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1), "[Oe\"':2Wv'vAkl", "?Nu/7]Lt B6q#TZ4{}", "$5Ze)9Aj", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[9];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(47, (-2296), "'>c", "13", "5,p.class", stringArray0);
      aSMifierClassVisitor0.visitInnerClass("G,R$*:@:", "ACC_ABSTRACT", "QMuNxS*E[2&mUKk>G", 4099);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit((-3826), (-3826), "3", "aLr#oP4xl;LE", "2<<oI;_pf2zmx=P", stringArray0);
      aSMifierClassVisitor0.appendAccess(8192);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(196653, 16384, "DOEX", (String) null, "1OMh<Dqd2)Le", aSMifierMethodVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(196653, 196653, "Q@HsI=HYGIa1:f", "l3^OtR2PX'g:", "tsG|L|j,NAiZiE3|yIz", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "#K=w@bBf4>;E:", "new char[] {", "):Xz*C0#j", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "w]g|tA#Q:05DEt ", "pqU1KL%L", "pqU1KL%L", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("w]g|tA#Q:05DEt ", "w]g|tA#Q:05DEt ", (String) null, 16384);
      aSMifierClassVisitor0.visit(16384, (-1350), "w]g|tA#Q:05DEt ", "ACC_STRICT", "mv.visitTryCatchBlock(", ((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-3065), "", "~vN@g%Xi6B(.lymya", "~vN@g%Xi6B(.lymya", "");
      aSMifierClassVisitor0.visit((-2964), (-3065), "", "~vN@g%Xi6B(.lymya", "~vN@g%Xi6B(.lymya", (String[]) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "", "Z4|.Q?", ")V.class", ((AbstractVisitor) fieldVisitor0).OPCODES);
      aSMifierClassVisitor0.visit((-3065), 16384, "P", "P", "mv.visitLocalVariable(", ((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(65535, "new Double(\"", "HG", "QWNVWQ>4)+Z/]qq\"_HN", "new Double(\"");
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2895), "Q! a$W1z", "a)xW", (String) null, stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-1), (-1), "LocalVariableTypeTable", "V]TZM-zH.`", "LocalVariableTypeTable", (String[]) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "[]", "[]", "[]", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "QWNVWQ>4)+Z/]qq\"_HN";
      aSMifierClassVisitor0.visit((-3826), (-3826), "QWNVWQ>4)+Z/]qq\"_HN", "7Q~[", "QWNVWQ>4)+Z/]qq\"_HN", stringArray0);
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // QWNVWQ>4)+Z/]qq\"_HN (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = ")V";
      aSMifierClassVisitor0.visitField(65535, "br", ")V", "aN\"N3tXL.zAgI:J>^g", "mv.visitFrame(Opcodes.F_NEW, ");
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
  public void test44()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod((-2964), "~vN@g%Xi6B(.lymya", "<ciB^$JAMHSHk", ");\n", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(49, 507, "", "AnnotationVisitor av", "", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(65535, "new Double(\"", "HG", "QWNVWQ>4)+Z/]qq\"_HN", "new Double(\"");
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(48, 48, "3.class", "loat(\".class", "+,YG%5", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(48, 48, "3.class", "loat(\".class", "+,YG%5", aSMifierMethodVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-995), "3.class", " Y", ">ov|:IEbz#B1dst0", aSMifierMethodVisitor0.OPCODES);
      assertFalse(methodVisitor0.equals((Object)aSMifierMethodVisitor0));
  }
}
