/*

 * Tue Mar 03 14:15:18 GMT 2020
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
import org.mockito.asm.util.AbstractVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ASMifierClassVisitor_ESTest extends ASMifierClassVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "gn", "9\"h9!j;tM;U\"'z]x", "", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-1208), "}\n", ", new Label[] {", ", new Label[] {", ", new Label[] {");
      aSMifierClassVisitor0.visit(5084, 8192, "}\n", "BRIDGE", "ay();\n", ((AbstractVisitor) fieldVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[3];
      aSMifierClassVisitor0.visit(46, 46, "gyP:p,b", "gyP:p,b", "gyP:p,b", stringArray0);
      aSMifierClassVisitor0.visitInnerClass("-;F#zPlL7N[b\"jnM", stringArray0[2], "7BTSX", (-869));
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField((-2304), "vn1&gd:{ev", "tTA4Oz*S&;7zi", "tTA4Oz*S&;7zi", "S5$CAqr6o#");
      aSMifierClassVisitor0.visit(0, 200, "G@7OQ+", "mv.visitFrame(Opcodes.F_NEW, ", (String) null, aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(44, "&9q-Mj=?s$+`X(", ".visitEnd();\n.class", "&9q-Mj=?s$+`X(", (String[]) null);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-2304), ".visitEnd();\n.class", "&9q-Mj=?s$+`X(", ".visitEnd();\n.class", (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(1024, 16384, "D", "X&*Y N<2|Qld_?7U", ")-|$!LH?RY[", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "IZemx;m}t@@l%", "IZemx;m}t@@l%", "`V2fGTvi0Dp0", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visitMethod((-1160), (String) null, (String) null, "&9q-Mj=?s$+`X(", stringArray0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-2304), "&9q-Mj=?s$+`X(", "&9q-Mj=?s$+`X(", (String) null, "vn1&gd:{ev");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(128, "L87:z(", "sIKx-Hfi", "r?0YgwwsG@7OQ+.class", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(90, 170, "2;ia#Y}", "2;ia#Y}", "x]ldQ-Ch", (String[]) null);
      aSMifierClassVisitor0.visit(5714, 8192, "/M*Ihnu2LtTb$U", "{iLV", "2;ia#Y}", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField((-1208), "}\n", ", new Label[] {", ", new Label[] {", ", new Label[] {");
      aSMifierClassVisitor0.visit(5714, 8192, "/M*Ihnu2LtTb$U", "{iLV", "2;ia#Y}", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-3253), "", "", "", stringArray0);
      aSMifierClassVisitor0.visit((-3253), 49, "9zVeDvPW0 ,PF.class", "Y9Wn{fa,G`p!fil..", "%FzJ^pB-|Xqq+x", ((AbstractVisitor) methodVisitor0).TYPES);
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
      String[] stringArray0 = new String[2];
      stringArray0[0] = "0 ,PF";
      aSMifierClassVisitor0.visit((-2863), (-2863), "0 ,PF", "XxU|n", "0 ,PF", stringArray0);
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
  public void test13()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(194, 1754, "Zj]XLp@!19wL", "2$(_{.class", "Zj]XLp@!19wL", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-32768), "vEq{p?z`b1x3$", "G@7OQ+", "Nv;TzB*xna6QT", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod((-1703), "&9q-Mj=?s$+`X(", (String) null, "&9q-Mj=?s$+`X(", aSMifierClassVisitor0.TYPES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-2304), "vn1&gd:{ev", "exlM:P7BTSX.class", "ACC_STRICT", aSMifierClassVisitor0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(102, 102, ".visitEnum(", "Wzc7ECw(Dc+aZQ", "]C$~:J!yT.class", aSMifierClassVisitor0.OPCODES);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-2304), "Wzc7ECw(Dc+aZQ", "gyP:p,b", "\r", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(5714, 8192, "/M*Ihnu2LtTb$U", "{iLV", "2;ia#Y}", (String[]) null);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[1];
      aSMifierClassVisitor0.visitInnerClass("elIz.)S^?jKYRa*[oj", "n}}J", "elIz.)S^?jKYRa*[oj", (-3253));
      stringArray0[0] = "2$(_{.class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // 2$(_{.class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(65535, "ClassWriter cw = new ClassWriter(0);\n", "ERFACE", "Nv;TzB*xna6QT", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("ERFACE", "Class(", "ERFACE", (-352));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(5084, "d", "2;ia#Y}", "/M*Ihnu2LtTb$U", (String[]) null);
      aSMifierClassVisitor0.visit(5714, 8192, "/M*Ihnu2LtTb$U", "{iLV", "2;ia#Y}", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(65535, "ClassWriter cw = new ClassWriter(0);\n", "ERFACE", "Nv;TzB*xna6QT", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(65535, 50, "ClassWriter cw = new ClassWriter(0);\n", "public static byte[] dump () throws Exception {\n\n", "ClassWriter cw = new ClassWriter(0);\n", ((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(65535, "lassWriter cw = new ClassWriter(0O;\n", "ERFACE", "Nv;TzB*xna6QT", aSMifierClassVisitor0.TYPES);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(4345, "exlM:P7BTSX", "Y9Wn{fa,G`p!fil..", "t}W>VPj@h", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(91, 2288, "2$(_{.class", "exlM:P7BTSX", "Prints the ASM code to generate the given class.", ((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(5714, 8192, "/M*Ihnu2LtTb$U", "{iLV", "2;ia#Y}", (String[]) null);
      aSMifierClassVisitor0.visitInnerClass("", "{iLV", "2;ia#Y}", 11);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(168, "exlM:P7BTSX", "exlM:P7BTSX", "exlM:P7BTSX", (String[]) null);
      aSMifierClassVisitor0.visit(47, 199, "mv.visitFieldInsn(", "mv.visitFieldInsn(", "mv.visitFieldInsn(", ((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(50, (-4347), "+f/", ".visitEnd();\n", " u17", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(50, 32, "exlM:P7BTSX", "exlM:P7BTSX", "exlM:P7BTSX", (String[]) null);
      String string0 = "_oE93M\\u#x";
      aSMifierClassVisitor0.visit(50, 8192, "V1_2", "cw.visitOuterClass(.class", string0, (String[]) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(65535, 65535, "2$(_{.class", "2$(_{.class", "``y!;X", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visitMethod(65535, "ClassWriter cw = new ClassWriter(0);\n", "ERFACE", "Nv;TzB*xna6QT", stringArray0);
      aSMifierClassVisitor0.visit(194, 1754, "Zj]XLp@!19wL", "2$(_{.class", "Zj]XLp@!19wL", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(46, 46, "gyP:p,b", "gyP:p,b", "gyP:p,b", aSMifierClassVisitor0.TYPES);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-2304), "Wzc7ECw(Dc+aZQ", "gyP:p,b", "\r", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(10, 10, "5'PN,?pAQP,", "}\n", "\")", (String[]) null);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-2304), "S5$CAqr6o#", "Q('#Ed8caq;W&_4|}", "mv.visitFieldInsn(", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField((-1208), "}\n", ", new Label[] {", ", new Label[] {", ", new Label[] {");
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String[] stringArray0 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(65535, "ClassWriter cw = new ClassWriter(0);\n", "ERFACE", "Nv;TzB*xna6QT", stringArray0);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod((-1160), "&9q-Mj=?s$+`X(", "Eh=sdv4I}V1%W!{@", "Nv;TzB*xna6QT", ((AbstractVisitor) methodVisitor0).TYPES);
      assertFalse(methodVisitor1.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(382, "cw.visit(", "cw.visit(", "ACC_PROTECTED", (String[]) null);
      aSMifierClassVisitor0.visit(196653, (-405), ",~j{?e1,gsU'4a@2", "mv.visitFieldInsn(", "Lgl7 XE}i%bd]4H", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(49, 194, "new Integer(", "r?0YgwwsG@7OQ+", "G@7OQ+", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(49, (-2939), "-", ",~j{?e1,gsU'4a@2", "L", aSMifierClassVisitor0.OPCODES);
  }
}
