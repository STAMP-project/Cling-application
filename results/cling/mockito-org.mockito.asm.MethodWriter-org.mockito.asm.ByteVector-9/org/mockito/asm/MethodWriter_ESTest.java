/*

 * Tue Mar 03 14:30:20 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.Attribute;
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Label;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1025));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "eW;U*:T)[kWCDO8}7C";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "eW;U*:T)[kWCDO8}7C", "eW;U*:T)[kWCDO8}7C", "%0v>!1UcxsE>WR%wP", stringArray0, true, true);
      Item item0 = classWriter0.newLong((-1025));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, (-752), 255);
      assertEquals(1007, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 68, "Qr*@]9U0V,P|$9dE~", "zX<", "", stringArray0, false, false);
      Item item0 = classWriter0.newDouble(31);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1090));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "org.mockito.asm.ClassReader";
      stringArray0[1] = "LocalVariableTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "k1b", "k1b", "y.~", stringArray0, false, false);
      Item item0 = classWriter0.newDouble((-1090));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "RuntimeVisibleParameterAnnotations";
      stringArray0[2] = "";
      stringArray0[3] = "H?zfePVptuci/|DX'";
      stringArray0[4] = "Qr*@]9U0V,P|$9dE~";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Qr*@]9U0V,P|$9dE~", "-F`{ L", "(L`/jV+%|-j)A", stringArray0, false, false);
      methodWriter0.classReaderOffset = 168;
      int int0 = methodWriter0.getSize();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Label label0 = new Label();
      int[] intArray0 = new int[0];
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "StackMap", "I<;x=; '[5gb#~t'RI", "I<;x=; '[5gb#~t'RI", stringArray0, false, false);
      methodWriter0.visitLdcInsn("RuntimeVisibleAnnotations");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1024);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1810), "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", stringArray0, false, false);
      methodWriter0.visitLdcInsn("RuntimeVisibleAnnotations");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1104, "short", "short", "short", (String[]) null, false, false);
      methodWriter0.visitFieldInsn(2, "short", "short", "Pv(^-JmL");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 68, "Qr*@]9U0V,P|$9dE~", "zX<", "", stringArray0, false, false);
      methodWriter0.classReaderOffset = 68;
      methodWriter0.getSize();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 29, "WW.Ee2", "Qr*@]9U0V,P|$9dE~", ">bX.?#", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "StackMap", "S8O@TD@O6YrBt@7T", stringArray0, false, false);
      methodWriter0.visitFrame(820, 1, stringArray0, 128, stringArray0);
      methodWriter0.visitFrame(8, 1, stringArray0, 1, stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "StackMap", "S8O@TD@O6YrBt@7T", stringArray0, false, false);
      methodWriter0.visitMethodInsn(2, "", "StackMap", "%|*/o$?l EC]rpHR7");
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "S8O@TD@O6YrBt@7T", "%0v>!1UcxsE>WR%wP", "EItUwlC", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1025));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "eW;U*:T)[kWCDO8}7C";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "eW;U*:T)[kWCDO8}7C", "eW;U*:T)[kWCDO8}7C", "%0v>!1UcxsE>WR%wP", stringArray0, true, true);
      Label label0 = new Label();
      label0.position = (-4603);
      int[] intArray0 = new int[2];
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[1];
      MethodWriter.getNewOffset(intArray0, intArray0, 215, (-1366));
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1366), 57).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 262144, "CxxZcw8&gg+]vzbm", "bVQ3Cj/\"e> Qxr4!", "_N)Qh9JiFJP{hqa", (String[]) null, false, false);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-2152), (-2152), 1647, (-2152), (-2152)).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Synthetic", "short", "RuntimeVisibleParameterAnnotations", (String[]) null, false, false);
      ClassWriter classWriter1 = new ClassWriter(44);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Synthetic";
      MethodWriter methodWriter1 = new MethodWriter(classWriter1, (-1795216102), "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "Synthetic", "eg9~).i7", stringArray0, false, false);
      MethodWriter methodWriter2 = new MethodWriter(classWriter1, 1, "eg9~).i7", "#AW,A-", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", (String[]) null, false, false);
      methodWriter0.visitAnnotation("", false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1), "H?zfePVptuci/|DX'", "", " S", (String[]) null, false, false);
      methodWriter0.visitMethodInsn((-1), "", ":Gq1e}hodIYov", "#S9 Rz");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 68, "Qr*@]9U0V,P|$9dE~", "zX<", "", stringArray0, false, false);
      methodWriter0.visitFrame(2, 2, stringArray0, 68, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(1);
      ClassWriter classWriter0 = new ClassWriter(11);
      String[] stringArray0 = new String[3];
      byteVector0.put11(2, 4242);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2, "RuntimeVisibleAnnotations", "-kLO$IYp(7x", "VLwg+`4(r'mze]ClB^", stringArray0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(353);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "9^]~w@rouX-";
      stringArray0[1] = "9^]~w@rouX-";
      stringArray0[2] = "9^]~w@rouX-";
      stringArray0[3] = "9^]~w@rouX-";
      stringArray0[4] = "Qr*@]9U0V,P|$9dE~";
      stringArray0[5] = "S8O@TD@O6YrBt@7T";
      stringArray0[6] = "A2tQ8?r>K";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "9^]~w@rouX-", "(vy{z)3'Tm", "S8O@TD@O6YrBt@7T", stringArray0, false, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-2393), "A2tQ8?r>K", "c\"3 5d!dP-+X)", "StackMap", stringArray0, false, false);
      methodWriter0.visitMethodInsn((-263), "9^]~w@rouX-", ":Gq1e}hodIYov", "Ljava/lang/Synthetic;");
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "S8O@TD@O6YrBt@7T";
      stringArray0[1] = "m8BixvjVDhzsGee7x";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "m8BixvjVDhzsGee7x", "S8O@TD@O6YrBt@7T", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      methodWriter0.visitIincInsn(3679, 76);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1025));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "eW;U*:T)[kWCDO8}7C";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "eW;U*:T)[kWCDO8}7C", "eW;U*:T)[kWCDO8}7C", "%0v>!1UcxsE>WR%wP", stringArray0, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "%0v>!1UcxsE>WR%wP", "eW;U*:T)[kWCDO8}7C", "LineNumberTable", stringArray0, true, true);
      methodWriter1.visitVarInsn(91, (-1025));
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1025));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "eW;U*:T)[kWCDO8}7C";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "eW;U*:T)[kWCDO8}7C", "eW;U*:T)[kWCDO8}7C", "%0v>!1UcxsE>WR%wP", stringArray0, true, true);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("eW;U*:T)[kWCDO8}7C", "i:Q,HCfe]1", "InnerClasses", label0, label0, 16777215);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[0];
      ByteVector byteVector0 = new ByteVector(29);
      byteVector0.length = 29;
      byteVector0.put11(0, 29);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2, "g=oq", "OVoX{@N9&]hN!TB", "OVoX{@N9&]hN!TB", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Qr*@]9U0V,P|$9dE~", "ZX<", "", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(29);
      byteVector0.length = 29;
      byteVector0.put11(0, 29);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2, "g=oq", "OVoX{@N9&]hN!TB", "OVoX{@N9&]hN!TB", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(68);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Qr*@]9U0V,P|$9dE~", "zX<", "RuntimeVisibleParameterAnnotations", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "oIWzvK1W3Ykj6 6VC", "", "$x5h", stringArray0, false, false);
      methodWriter1.visitVarInsn(86, 4096);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "StackMap", "S8O@TD@O6YrBt@7T", stringArray0, false, false);
      methodWriter0.getSize();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2253, "[Ag$-y2`@]", "zX<", "kw'~  eui_Og#Tf7", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(59);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Synthetic";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1795216102), "RuntimeVisibleParameterAnnotations", "Synthetic", "eg9~).i7", stringArray0, false, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "=vl\"", "-LsML ]K<LE<.,{)", "U4[[", (String[]) null, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(29, 29).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 68, "Qr*@]9U0V,P|$9dE~", "zX<", "LocalVariableTypeTable", stringArray0, false, false);
      int[] intArray0 = new int[5];
      intArray0[0] = 2;
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {2, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "StackMap", "S8O@TD@O6YrBt@7T", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      methodWriter0.visitAnnotationDefault();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Qr*@]9U0V,P|$9dE~", "ZX<", "", stringArray0, false, false);
      int int0 = methodWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(177);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "RuntimeVisibleParameterAnnotations";
      stringArray0[1] = "RuntimeVisibleParameterAnnotations";
      stringArray0[2] = "RuntimeVisibleParameterAnnotations";
      stringArray0[3] = "=Yn=i~_ntL";
      stringArray0[4] = "RuntimeVisibleParameterAnnotations";
      stringArray0[5] = "06ZedM#15qJeG&*U7@x";
      stringArray0[6] = "RuntimeVisibleParameterAnnotations";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-1696), "(L`/jV+%|-j)A", "DVmBX", "JSR/RET are not supported with computeFrames option", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "StackMap", "S8O@TD@O6YrBt@7T", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      byteVector0.put12(31, 2253);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2253, "[Ag$-y2`@]", "zX<", "kw'~  eui_Og#Tf7", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 68, "Qr*@]9U0V,P|$9dE~", "zX<", "", stringArray0, false, false);
      methodWriter0.visitInsn(630);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "StackMap";
      Label label0 = new Label();
      int[] intArray0 = new int[2];
      intArray0[0] = 2;
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1, "S8O@TD@O6YrBt@7T", "%0v>!1UcxsE>WR%wP", "EItUwlC", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "StackMap", "S8O@TD@O6YrBt@7T", stringArray0, false, false);
      Label label0 = new Label();
      int[] intArray0 = new int[2];
      intArray0[0] = 2;
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "S8O@TD@O6YrBt@7T", "%0v>!1UcxsE>WR%wP", "EItUwlC", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Qr*@]9U0V,P|$9dE~", "zX<", "", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(29);
      methodWriter0.classReaderOffset = (-933);
      // Undeclared exception!
      try { 
        methodWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(29, 29).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, (String) null, "", (String) null, stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 68, "Qr*@]9U0V,P|$9dE~", "zX<", "", stringArray0, false, false);
      methodWriter0.visitMaxs(251, (-1418));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(59);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Synthetic";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 793, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "Synthetic", "eg9~).i7", stringArray0, false, false);
      Attribute attribute0 = new Attribute("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      methodWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        methodWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1218));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "0*'//";
      stringArray0[1] = "77P6uc9V+-h5/y*";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1), "eW;U*:T)[kWCDO8}7C", "eW;U*:T)[kWCDO8}7C", "9zS!`a{q lpY6F/P{", stringArray0, false, true);
      methodWriter0.visitInsn(4);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter((-879));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Qr*@]9U0V,~P|$9dE~", "Qr*@]9U0V,~P|$9dE~", "RuntimeVisibleParameterAnnotations", stringArray0, false, false);
      classWriter0.newMethodItem("RuntimeVisibleParameterAnnotations", "char", "InnerClasses", false);
      methodWriter0.visitMethodInsn(2, "%|*/o$?l EC]rpHR7", "<init>", "Qr*@]9U0V,~P|$9dE~");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Qr*@]9U0V,P|$9dE~", "Qr*@]9U0V,P|$9dE~", ":", stringArray0, false, false);
      methodWriter0.visitAnnotation("Q", false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4096));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "org.mockito.asm.ClassReader";
      stringArray0[1] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "k1b", "k1b", "y.~", stringArray0, false, false);
      classWriter0.newDouble(219);
      MethodVisitor methodVisitor0 = classWriter0.visitMethod((-3872), "k1b", "y.~", "AM1b|m|w", stringArray0);
      assertNotSame(methodVisitor0, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 68, "Qr*@]9U0V,P|$9dE~", "zX<", "", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(29);
      methodWriter0.visitAnnotationDefault();
      methodWriter0.put(byteVector0);
      classWriter0.newDouble(1.0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-1601), "[|Vk(d>F", "Qr*@]9U0V,P|$9dE~", (String) null, stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Qr*@]9U0V,P|$9dE~", "Qr*@]9U0V,P|$9dE~", ":", stringArray0, false, false);
      methodWriter0.visitFrame(55, 2124, stringArray0, 55, stringArray0);
      methodWriter0.visitMethodInsn(100, "Code", "", "/Oy");
      ByteVector byteVector0 = new ByteVector(182);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1025));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "eW;U*:T)[kWCDO8}7C";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "eW;U*:T)[kWCDO8}7C", "eW;U*:T)[kWCDO8}7C", "%0v>!1UcxsE>WR%wP", stringArray0, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "%0v>!1UcxsE>WR%wP", "eW;U*:T)[kWCDO8}7C", "LineNumberTable", stringArray0, true, true);
      methodWriter1.visitVarInsn(91, 78);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "StackMap", "S8O@TD@O6YrBt@7T", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      methodWriter0.visitAnnotation("(D", true);
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-1995), "Ff^1X.gva:oz#cR#'", "Synthetic", "Wc;C:,EO^i8#l,", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 68, "Qr*@]9U0V,P|$9dE~", "zX<", "", stringArray0, false, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 46, "VLwg+`4(r'mze]ClB^", "VLwg+`4(r'mze]ClB^", "Qr*@]9U0V,P|$9dE~", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(5391, 5391, 5391, 5391, 5391).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-4096), "EnclosingMethod", "k1b", "EnclosingMethod", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector(5391);
      methodWriter0.put(byteVector0);
      ClassWriter classWriter1 = new ClassWriter(1);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter1, 2, "EnclosingMethod", "EnclosingMethod", "EnclosingMethod", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-2152), (-2152), 0, 0, 0).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Synthetic", "Synthetic", "RuntimeVisibleParameterAnnotations", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("RuntimeVisibleParameterAnnotations", "RuntimeVisibleParameterAnnotations", "gU2X|X5OG", label0, label0, 1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(83, (-128)).when(classWriter0).newClass(anyString());
      doReturn(83, 83, (-128), (-128), (-128)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[2];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-128), "", "x`]Af+:hZVnIippGf0", "L", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(12);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-938), "MLX", "Qr*@]9U0V,P|$9dE~", "MLX", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "S8O@TD@O6YrBt@7T";
      stringArray0[1] = "m8BixvjVDhzsGee7x";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "m8BixvjVDhzsGee7x", "S8O@TD@O6YrBt@7T", stringArray0, false, false);
      methodWriter0.visitVarInsn(1, (-3915));
      methodWriter0.getSize();
      String[] stringArray1 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "StackMapTable", "S8O@TD@O6YrBt@7T", "21gQ bq 'P", stringArray1, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "S8O@TD@O6YrBt@7T";
      stringArray0[1] = "m8BixvjVDhzsGee7x";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "m8BixvjVDhzsGee7x", "S8O@TD@O6YrBt@7T", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      String[] stringArray1 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "StackMapTable", "S8O@TD@O6YrBt@7T", "21gQ bq 'P", stringArray1, false, false);
      methodWriter1.put(byteVector0);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "StackMap", "S8O@TD@O6YrBt@7T", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      String[] stringArray1 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1254, "", "+uR9X,%ji7>", "zX<", stringArray1, false, false);
      methodWriter0.put(byteVector0);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "S8O@TD@O6YrBt@7T";
      stringArray0[1] = "m8BixvjVDhzsGee7x";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "m8BixvjVDhzsGee7x", "S8O@TD@O6YrBt@7T", stringArray0, false, false);
      methodWriter0.visitIincInsn(1, 1);
      String[] stringArray1 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "StackMapTable", "S8O@TD@O6YrBt@7T", "21gQ bq 'P", stringArray1, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1218));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "0*'//";
      stringArray0[1] = "77P6uc9V+-h5/y*";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1), "eW;U*:T)[kWCDO8}7C", "eW;U*:T)[kWCDO8}7C", "9zS!`a{q lpY6F/P{", stringArray0, false, true);
      methodWriter0.visitIincInsn(4, 114);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "StackMap", "S8O@TD@O6YrBt@7T", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      methodWriter0.visitFrame(820, 1, stringArray0, 128, stringArray0);
      methodWriter0.visitInsn(1);
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "S8O@TD@O6YrBt@7T", "%0v>!1UcxsE>WR%wP", "EItUwlC", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Qr*@]9U0V,P|$9dE~", "ZX<", "", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(29);
      methodWriter0.visitFieldInsn(16, "i@*9<p>ltlh", "org.mockito.asm.MethodWriter", "");
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2, "g=oq", "OVoX{@N9&]hN!TB", "OVoX{@N9&]hN!TB", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4096));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-4096), "\"]@r}j", " 8+E uE2!2)m6=Y%", "9^]~w@rouX-", stringArray0, true, false);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "RuntimeVisibleParameterAnnotations";
      stringArray0[2] = "";
      stringArray0[3] = "H?zfePVptuci/|DX'";
      stringArray0[4] = "Qr*@]9U0V,P|$9dE~";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Qr*@]9U0V,P|$9dE~", "-F`{ L", "(L`/jV+%|-j)A", stringArray0, false, false);
      methodWriter0.visitMaxs((-879), 46);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "RuntimeVisibleParameterAnnotations";
      stringArray0[2] = "";
      stringArray0[3] = "H?zfePVptuci/|DX'";
      stringArray0[4] = "Qr*@]9U0V,P|$9dE~";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Qr*@]9U0V,P|$9dE~", "-F`{ L", "(L`/jV+%|-j)A", stringArray0, false, false);
      methodWriter0.visitIntInsn(17, 1131);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(29, 29, (-800), (-800), (-800)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 68, "Qr*@]9U0V,P|$9dE~", "D\"K%#jm'KS8DouoEv", "LocalVariableTypeTable", stringArray0, false, false);
      methodWriter0.visitAnnotation("^X}oFg25gbN", true);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4096));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "RuntimeVisibleParameterAnnotations", "k1b", "", (String[]) null, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-3443), "l.Zn;#Z`5IDfPnp60", "k1b", "l.Zn;#Z`5IDfPnp60", (String[]) null, false, false);
      methodWriter1.put(byteVector0);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "StackMap", "S8O@TD@O6YrBt@7T", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("v%<Sv)(F,9sC{%i%12", "0< (%{", "gU2X|X5OG", label0, label0, (-1966));
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 105, "Qr*@]9U0V,P|$9dE~", "", "", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(9);
      methodWriter0.visitIincInsn((-1535), (-1535));
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4096));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "k1b";
      stringArray0[1] = "k1b";
      stringArray0[2] = "k1b";
      stringArray0[3] = "k1b";
      stringArray0[4] = "k1b";
      stringArray0[5] = "k1b";
      stringArray0[6] = "k1b";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1943), "k1b", "k1b", "k1b", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 57, "k1b", "Um}c)\"Nj0.!EZ'q=", "u,t#Ji6&Ng'L", stringArray0, false, true);
      // Undeclared exception!
      try { 
        methodWriter1.visitIincInsn((-346), (-4096));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -346
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "S8O@TD@O6YrBt@7T";
      stringArray0[1] = "m8BixvjVDhzsGee7x";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "m8BixvjVDhzsGee7x", "S8O@TD@O6YrBt@7T", stringArray0, false, false);
      methodWriter0.visitFrame(1, 2, stringArray0, (-3915), stringArray0);
      String[] stringArray1 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "StackMapTable", "S8O@TD@O6YrBt@7T", "21gQ bq 'P", stringArray1, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter((-879));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Qr*@]9U0V,P|$9dE~", "zX<", "RuntimeVisibleParameterAnnotations", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(0, 1, stringArray0, 2, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }
}
