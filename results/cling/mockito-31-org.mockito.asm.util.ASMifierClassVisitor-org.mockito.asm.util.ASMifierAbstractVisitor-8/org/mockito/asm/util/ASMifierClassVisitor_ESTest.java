/*

 * Tue Mar 03 14:15:27 GMT 2020
 */

package org.mockito.asm.util;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PrintStream;
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
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16379, "attr", "\")", "L", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(48, "ACC_PRIVATE", "new Double(\"", "ACC_SYNTHETIC", aSMifierClassVisitor0.OPCODES);
      assertFalse(methodVisitor1.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(16384, "mv.visitLdcInsn(", "4", "4", stringArray0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(96, (String) null, "/Zgsw)", "h_YXnE*hexQb7", "mv.visitLdcInsn(");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // .class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(48, 48, "mc5#o++.class", "Iz()?K^3DB\"q/W>k", "icv", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      Object object0 = new Object();
      aSMifierClassVisitor0.visitField(32767, "int", "mv.visitIincInsn(", "5#o++", object0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-506), "mv.visitIntInsn(", "srSkTT2Jx", (String) null, aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "/";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // / (Is a directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[5];
      ASMifierClassVisitor.main(stringArray0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "", "9)2?:y}dk=V^.class", "2+`!j`B78", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField((-451), "|} ./=Y%*usC)", "|} ./=Y%*usC)", (String) null, (Object) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(3, "iKdK)0Oz(U", "c", "public static byte[] dump () throws Exception {\n\n", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      PrintStream printStream0 = new PrintStream(bufferedOutputStream0);
      PrintWriter printWriter0 = new PrintWriter(printStream0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      Integer integer0 = new Integer(2);
      aSMifierClassVisitor0.visitField(16384, "/", (String) null, ".class", integer0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, ".class", ".class", "av0 = .class", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(128, (String) null, (String) null, "e6Z", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(4764, "", "org.mockito.asm.ClassReader", "", aSMifierClassVisitor0.TYPES);
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
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintWriter printWriter0 = new PrintWriter(byteArrayOutputStream0, false);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(16384, "mv.visitLdcInsn(", "`e4qA_r'y_]\"", "mv.visitLdcInsn(", stringArray0);
      aSMifierClassVisitor0.visitInnerClass("mv.visitFrame(Opcodes.F_APPEND,", "@(7!7U\"B)-&;e0Uh`g%", "mv.visitLocalVariable(", 248);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-451), "|} ./=Y%*usC)", "|} ./=Y%*usC)", (String) null, (Object) null);
      aSMifierClassVisitor0.visit(3, 10, "|} ./=Y%*usC)", (String) null, "attr", ((AbstractVisitor) fieldVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("ConstantValue", "ACC_SYNCHRONIZED", "ACC_SYNCHRONIZED", (-660));
      aSMifierClassVisitor0.visitInnerClass("/", "", "ACC_SYNTHETIC.class", 16384);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(206, "", "", "^`Z]l9EK0L|G/wwU\"P", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("\r", "5PStNpf>2775Mt8(we", (String) null, 16384);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(16384, "mv.visitLdcInsn(", "4", "4", stringArray0);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-557), " ", "kOyS'xaZ1(7oPm)4n}", "*8ag puYx*ttg)5P", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("", "", "/", 16384);
      aSMifierClassVisitor0.appendAccess(179);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(46, (-1952), "public static byte[] dump () throws Exception {\n\n", "mv.visitIntInsn(", "StackMap", aSMifierMethodVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(46, 8, "?Z0gyy", "1/{", " });\n", aSMifierMethodVisitor0.TYPES);
      aSMifierClassVisitor0.visitInnerClass((String) null, "kf.ijD*F", "fr !Qyjd0ePz V$Qy", 16384);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(524272, "z\"<u}RjS0r%S}^{w8", (String) null, "M^zK", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16379, "attr", "\")", "L", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod((-1345), ">@4PJbWI._RtsX", "ACC_STRICT", ",<74zz:S !Gw", (String[]) null);
      aSMifierClassVisitor0.visit(49, 49, "ACC_STRICT", "new float[] {", "", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(47, 2048, "ch\"o|ckv4`[Gfu", "ACC_PROTECTED", "aH3N]y{*aw@l@'\"[", aSMifierMethodVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-debug";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Object object0 = new Object();
      aSMifierClassVisitor0.visitField((-1831), "3)`1", " = av", "&xJ\"`7<@@9E0Z", object0);
      aSMifierClassVisitor0.visit(50, 1768, ">@4PJbWI._RtsX", "&xJ\"`7<@@9E0Z", "IJ\"", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[5];
      ASMifierClassVisitor.main(stringArray0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "", "", (String) null, "");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visitInnerClass("\r", "5PStNpf>2775Mt8(we", (String) null, 16384);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "mv.visitLdcInsn(", "4", "4", stringArray0);
      aSMifierClassVisitor0.visitMethod((-4082), "^ .class", (String) null, "9#c,BUQ+GxC1la:,", ((AbstractVisitor) methodVisitor0).OPCODES);
      aSMifierClassVisitor0.visit(1744, 512, "n1S-(tF)6s)k*wff", "attr.class", (String) null, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(46, 5664, "1/{", "kf.ijD*F", "0'", stringArray0);
      aSMifierClassVisitor0.visitInnerClass((String) null, "kf.ijD*F", "fr !Qyjd0ePz V$Qy", 16384);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(16, 6, "", "new Long(", "new Long(", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visitInnerClass("\r", "5PStNpf>2775Mt8(we", (String) null, 16384);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField((-451), "|} ./=Y%*usC)", "|} ./=Y%*usC)", (String) null, (Object) null);
      aSMifierClassVisitor0.visit(3, 255, "NgDX4v", "_XP:5-9.", "Sq@", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor.main(stringArray0);
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "mv.visitLdcInsn(", "4", "4", stringArray0);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod((-260), "-debug", "new String[] {", ".class.class", ((AbstractVisitor) methodVisitor0).OPCODES);
      assertNotSame(methodVisitor0, methodVisitor1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "mv.visitLdcInsn(", "4", "4", stringArray0);
      aSMifierClassVisitor0.visit(4096, 512, "mv.visitLdcInsn(", "mv.visitLdcInsn(", "new String[] {", ((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-1952), (String) null, "&w&w:eKx%Y,+", " = av", "&w&w:eKx%Y,+");
      aSMifierClassVisitor0.visit(196653, 5996, "mv.visitJumpInsn(", "mv.visitIntInsn(", "IJ\"", ((AbstractVisitor) fieldVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(32767, "int", "mv.visitIincInsn(", "5#o++", object0);
      aSMifierClassVisitor0.visit((-1142), 180, "WC)),ll?<*U=3Ci", "srSkTT2Jx", "StackMap", ((AbstractVisitor) fieldVisitor0).TYPES);
  }
}
