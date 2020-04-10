/*

 * Tue Mar 03 14:15:12 GMT 2020
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
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.util.ASMifierClassVisitor;
import org.mockito.asm.util.ASMifierMethodVisitor;
import org.mockito.asm.util.AbstractVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ASMifierClassVisitor_ESTest extends ASMifierClassVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitInnerClass("// ATTRIBUTE ", "*", "V1_3", 182);
      aSMifierClassVisitor0.visit(50, (-1260), "/pwYXsum:Y9.class", "Opcodes.NULL", "Opcodes.NULL", aSMifierMethodVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(48, 1024, "?Q{U.mA\u0007}VNjdYz!", "r_'!$Knud$", "Nj407SHjR8Qc7&L", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1169), "", "", "c", (String[]) null);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(8192, "", "n-p3#+.R", "(2I@xoYjy;,+h^#9+Ed", ((AbstractVisitor) methodVisitor0).TYPES);
      assertFalse(methodVisitor1.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitMethod(5, "", "", "2 };g", aSMifierMethodVisitor0.TYPES);
      aSMifierClassVisitor0.visitInnerClass("Y2", "Y2", "ACC_VOLATILE", 32767);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "/pwYXsum:Y9";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // /pwYXsum:Y9 (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("MY-g8pOEB[_|}__ks5", "mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {", "Y2", 16384);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "// ATTRIBUTE ", "t]aeipQ~rr cd2l&0v%", "t]aeipQ~rr cd2l&0v%", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(128, "rl'VE`", "AC_STRICT", "rl'VE`", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visitMethod(16384, "// ATTRIBUTE ", "t]aeipQ~rr cd2l&0v%", "t]aeipQ~rr cd2l&0v%", stringArray0);
      aSMifierClassVisitor0.visitInnerClass("MY-g8pOEB[_|}__ks5", "mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {", "Y2", 16384);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-debug";
      stringArray0[1] = "#NB}LD";
      aSMifierClassVisitor0.visitInnerClass("V3$OE+=4f", "V3$OE+=4f", "If&b>CP)", 46);
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
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(47, 47, "OpJod1s.I%TEGER", "OpJod1s.I%TEGER", "OpJod1s.I%TEGER", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-298), "OpJod1s.I%TEGER", "OpJod1s.I%TEGER", "OpJod1s.I%TEGER", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(3535);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-debug";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess((-2577));
      aSMifierClassVisitor0.visitInnerClass(".*", "pb5s", ".*", 16384);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(46, (-3794), "Opcodes.DOUBLE", "", "", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(54, "", "75#@H#pH.R:", "r_'!$Knud$", (String[]) null);
      aSMifierClassVisitor0.visit(48, 1024, "?Q{U.mA\u0007}VNjdYz!", "r_'!$Knud$", "Nj407SHjR8Qc7&L", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "// ATTRIBUTE ", "t]aeipQ~rr cd2l&0v%", "t]aeipQ~rr cd2l&0v%", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(8, "t]aeipQ~rr cd2l&0v%", "pb5s", "&d|url'VE`", ((AbstractVisitor) methodVisitor0).OPCODES);
      assertFalse(methodVisitor1.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess((-1260));
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation(";b", false);
      aSMifierClassVisitor0.visit(183, (-2706), "sum:Y9", (String) null, ";b", ((AbstractVisitor) annotationVisitor0).OPCODES);
      aSMifierClassVisitor0.appendAccess(2424);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod((-422), "@=]:8$|qBhuZn", "import java.util.*;\n", "ations", aSMifierClassVisitor0.TYPES);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1024, "(ddV[MtT ", "// ATTRIBUTE ", "(ddV[MtT ", stringArray0);
      aSMifierClassVisitor0.visit(1024, 64, "// ATTRIBUTE ", "// ATTRIBUTE ", "(ddV[MtT ", ((AbstractVisitor) methodVisitor0).TYPES);
      aSMifierClassVisitor0.appendAccess(65535);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("O-fGwG", "RuntimeInvisibleParameterAnnotations", "NS!euKwM<", 32767);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation(";b", false);
      aSMifierClassVisitor0.visit(1956, 32, "new Byte((byte)", ", ", ", ", ((AbstractVisitor) annotationVisitor0).TYPES);
      aSMifierClassVisitor0.visit(183, (-2706), "sum:Y9", (String) null, ";b", ((AbstractVisitor) annotationVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess((-2040));
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-436), "Eo;K", "TtNV9yEY!]xqLTlPUZ", "", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String[] stringArray0 = new String[2];
      aSMifierClassVisitor0.visitMethod(16384, "N", "E}'vmcvs=?jlL", "/pwYXsum:Y9", aSMifierClassVisitor0.TYPES);
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(50, (-1260), "/pwYXsum:Y9.class", "Opcodes.NULL", "Opcodes.NULL", aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("O-fGwG", "RuntimeInvisibleParameterAnnotations", "NS!euKwM<", 32767);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visitMethod(16384, "// ATTRIBUTE ", "t]aeipQ~rr cd2l&0v%", "t]aeipQ~rr cd2l&0v%", stringArray0);
      aSMifierClassVisitor0.visit(16384, 16384, "Y2", "t]aeipQ~rr cd2l&0v%", (String) null, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "// ATTRIBUTE ", "t]aeipQ~rr cd2l&0v%", "t]aeipQ~rr cd2l&0v%", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit((-61), 2074, "zPg^(:n:", ".*", "t]aeipQ~rr cd2l&0v%", ((AbstractVisitor) methodVisitor0).OPCODES);
      aSMifierClassVisitor0.visitInnerClass("MY-g8pOEB[_|}__ks5", "mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {", "Y2", 16384);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-654), (-654), "00", "Opcdes.NULL", "Opcdes.NULL", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[1];
      aSMifierClassVisitor0.visit(1429, 3724, "-debLg", "-debLg", "OK|~YJ", stringArray0);
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod((-422), "@=]:8$|qBhuZn", "import java.util.*;\n", "ations", aSMifierClassVisitor0.OPCODES);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "OK|~YJ";
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
      aSMifierClassVisitor0.appendAccess((-2577));
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "// ATTRIBUTE ", "t]aeipQ~rr cd2l&0v%", "t]aeipQ~rr cd2l&0v%", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitInnerClass("Y2", "Y2", "ACC_VOLATILE", 32767);
      aSMifierClassVisitor0.visit(32767, 5, "Y2", ");\n", "fO$q8UA3kv<~#q.", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(46, 46, "hI6XqF/n, H d!", "2l&0v%", "gVu+-s", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1431, "hI6XqF/n, H d!", "gVu+-s", ")#]b", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }
}
