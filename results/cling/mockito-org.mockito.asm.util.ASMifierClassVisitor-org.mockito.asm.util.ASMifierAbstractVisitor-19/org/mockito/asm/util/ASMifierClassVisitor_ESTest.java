/*

 * Tue Mar 03 14:15:58 GMT 2020
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
      aSMifierClassVisitor0.visit(8, 8, "Label offset position has not been resolved yet", "ACC_LBRIDGE", "Type.getType(\"", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "_OuGikx2|N}rEd1F9.class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // _OuGikx2|N}rEd1F9.class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visitMethod((-71), "ClassWriter cw = new ClassWriter(0);\n", "ClassWriter cw = new ClassWriter(0);\n", "ClassWriter cw = new ClassWriter(0);\n", stringArray0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(8192, "ClassWriter cw = new ClassWriter(0);\n", "-)1]Am-7WEv.class", "ClassWriter cw = new ClassWriter(0);\n", "ClassWriter cw = new ClassWriter(0);\n");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(54, "-(lxT", "-(lxT", ".class", "-(lxT");
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(185, (-2304), ";ZC[.class", (String) null, "qZ", ((AbstractVisitor) fieldVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(65535, "aYfJ9F3JK", ")C+:mhqH(|3'ykt5Z8", "@dk$.^`94nDCp-J]Gf", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[3];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 8192, "DIecz", "j", "Lu", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "j", "j", "AN?{", stringArray0);
      aSMifierClassVisitor0.visit(64, 195, "DIecz", "Lu", "DIecz", ((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(65535);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("attr", (String) null, (String) null, 128);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(181, 179, "BhE9~/06[e+:N|#", " }, new Label[] {", ";,&`+1 /)STibPc", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(2, 8192, ".visitAnnotation(", "{wQmA#7_Ug{B", ";ZC[.class", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(54, "-(lxT", "-(lxT", ".class", "-(lxT");
      aSMifierClassVisitor0.visit(54, 49, "8B3gkIZ.", "-(lxT", "D!x\"<j,", ((AbstractVisitor) fieldVisitor0).TYPES);
      aSMifierClassVisitor0.visit(185, (-2304), ";ZC[.class", (String) null, "qZ", ((AbstractVisitor) fieldVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "V.jnCT6'35/(8q+p";
      aSMifierClassVisitor0.visitMethod(1310, "V.jnCT6'35/(8q+p", "(char)", "F%k{dusj>U", stringArray0);
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // V.jnCT6'35/(8q+p (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(54, "-(lxT", "-(lxT", ".class", "-(lxT");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "RuntimeInvisibleAnnotations";
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
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(688, (-847), "S8\b9Pj=/@dJI", "!|T", ":gah{.\"g%1>&~@Fc", aSMifierMethodVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor.main(stringArray0);
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 8192, "DIecz", "j", "Lu", stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[3];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(8192, 8192, "DIecz", "j", "Lu", stringArray0);
      aSMifierClassVisitor0.visit(8192, (-769), "", "", "", stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(34, (-2120), "PN-$rHZrt@hYxtMc):m", "PN-$rZt@hYxMc):m", "udnx,m7rmpcr{", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(184);
      aSMifierClassVisitor0.visit(2, 8192, ".visitAnnotation(", "{wQmA#7_Ug{B", ";ZC[.class", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(65535);
      aSMifierClassVisitor0.visit(193, 73, "attr", ",/Co", "(char).class", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(20, "4Wqn4", "T", "\n", object0);
      aSMifierClassVisitor0.visitInnerClass(" + ", "ZHL(?veZW`06Wbh}WgD", "ldYxm-/qu~eT%j*e=*%", 65535);
      aSMifierClassVisitor0.visit(46, (-442), "%M%;9lWn&B%A`Fq)qH3", "ldYxm-/qu~eT%j*e=*%", "mv.visitLocalVariable(", ((AbstractVisitor) fieldVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(47, (-1), "av0 = cw.visitAnnotation(", "av0 = cw.visitAnnotation(", "E=@w0", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(47, 2, "DIecz", "av0 = cw.visitAnnotation(", (String) null, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass(" + ", "ZHL(?veZW`06Wbh}WgD", "ldYxm-/qu~eT%j*e=*%", 65535);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(524288, (-5152), "9I_", "V1_2", "?ymCrFJ!>2n", (String[]) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1729, "\n", "\n", "WGh", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-1209), (-1209), "public class ", "mv.visitTypeInsn(", "public class ", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("9n{ec.uT1jTwzHM@", "Exceptions", "9n{ec.uT1jTwzHM@", (-376));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visitMethod(188, "{(FjeDob+_*9[sp6", "; }[#xGU", "; }[#xGU", stringArray0);
      aSMifierClassVisitor0.visit(196653, (-929), "*{hFQ5|by2CF,Vm", "l", "new boolean[] {", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(65535);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(688, ".visitEnd();\n", (String) null, "// ATTRIBUTE ", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(20, "4Wqn4", "T", "\n", object0);
      aSMifierClassVisitor0.visitInnerClass(" + ", "ZHL(?veZW`06Wbh}WgD", "ldYxm-/qu~eT%j*e=*%", 65535);
      aSMifierClassVisitor0.visit(50, (-37), "short", "", (String) null, ((AbstractVisitor) fieldVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "(char)";
      aSMifierClassVisitor0.visitMethod((-881), "F%k{dusj>U", "F%k{dusj>U", "VzjnCT6'35/(q+p", stringArray0);
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
  public void test28()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass(" + ", "ZHL(?veZW`06Wbh}WgD", "ldYxm-/qu~eT%j*e=*%", 65535);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(125, 591, "\n", "o^HXMqZL2", "4Wqn4", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(188, "{(FjeDob+_*9[sp6", "; }[#xGU", "; }[#xGU", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(49, (-919), "V1_3", "{(FjeDob+_*9[sp6", "!|T", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod((-3525), "", "Lu", "E", (String[]) null);
      aSMifierClassVisitor0.visit((-3525), 8192, "R&&(.class", "new Byte((byte)", "*z)#", (String[]) null);
  }
}
