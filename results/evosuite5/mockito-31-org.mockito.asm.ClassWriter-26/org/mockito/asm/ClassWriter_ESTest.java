/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 09:29:38 GMT 2019
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Attribute;
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(155);
      Item item0 = classWriter0.newLong(0L);
      classWriter0.threshold = 1;
      Item item1 = classWriter0.newConstItem(classWriter0.COMPUTE_MAXS);
      assertNotSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1094));
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.AnnotationWriter", "java/lang/String");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      String string0 = classWriter0.getCommonSuperClass("java/lang/String", "java/lang/String");
      assertEquals("java/lang/String", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(247);
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.AnnotationWriter", "java/lang/Object");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1094));
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-298), 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1097));
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addType("java/lang/String");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(47);
      classWriter0.addUninitializedType(".QpwQbxx", 47);
      int int0 = classWriter0.addUninitializedType(".QpwQbxx", 47);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1105));
      Item item0 = classWriter0.newDouble((-1105));
      Item item1 = classWriter0.newDouble((-1105));
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(47);
      Item item0 = classWriter0.newLong(47);
      Item item1 = classWriter0.newLong(47);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1094));
      Item item0 = classWriter0.newFloat((-659));
      Item item1 = classWriter0.newFloat((-659));
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Item item0 = classWriter0.newMethodItem("org.mockito.asm.ClassWriter", "org.mockito.asm.ClassWriter", "org.mockito.asm.ClassWriter", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassWriter classWriter0 = new ClassWriter(1);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(155);
      // Undeclared exception!
      try { 
        classWriter0.newConstItem((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1448));
      Type type0 = Type.getObjectType("org.mockito.asm.AnnotationWriter");
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1437);
      Double double0 = new Double(1437);
      Item item0 = classWriter0.newConstItem(double0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1105));
      Long long0 = new Long(2);
      Item item0 = classWriter0.newConstItem(long0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      Boolean boolean0 = Boolean.TRUE;
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1097));
      Boolean boolean0 = Boolean.valueOf("");
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(132);
      Short short0 = new Short((short) (-2306));
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(141);
      Character character0 = new Character('#');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-610));
      Byte byte0 = new Byte((byte) (-98));
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      classWriter0.invalidFrames = true;
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1094));
      Attribute attribute0 = new Attribute("<init>");
      byte[] byteArray0 = new byte[5];
      attribute0.value = byteArray0;
      classWriter0.visitAttribute(attribute0);
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(44, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1221);
      classWriter0.visitAnnotation("void", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1105));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visit(684, (-298), "", "l.:_EMd", "l.:_EMd", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1094));
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1094));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visit(2, (-298), "", "l.:_EMd", "l.:_EMd", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(102, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      classWriter0.visitMethod((-1659), "Class not found", "org.mockito.asm.Attribute", "org.mockito.asm.Attribute", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(135, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1094));
      classWriter0.visitField((-659), "", "", (String) null, (Object) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1097));
      classWriter0.visitInnerClass("", "", "", 798);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(61, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1168));
      classWriter0.visitInnerClass((String) null, (String) null, (String) null, (-1168));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(155);
      classWriter0.visitInnerClass("92xZ!WUIF{CB", "92xZ!WUIF{CB", (String) null, 165);
      classWriter0.visitInnerClass("", "-1>bhULh!ck_wG`", (String) null, 2);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      classWriter0.visitAnnotation("au", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-612));
      classWriter0.visitOuterClass("Hb3G`5", "+KV.+8W(:U^W`{", "+KV.+8W(:U^W`{");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-614));
      classWriter0.visitOuterClass("", "n", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33);
      classWriter0.visitOuterClass("", (String) null, "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      classWriter0.visitSource((String) null, "|\"I;@H#[@");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2235);
      classWriter0.visit(2235, (-1474), "", "", "", (String[]) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3718));
      String[] stringArray0 = new String[0];
      classWriter0.visit((-3718), (-3718), "", (String) null, (String) null, stringArray0);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      Float float0 = new Float((double) 2);
      int int0 = classWriter0.newConst(float0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(155);
      // Undeclared exception!
      try { 
        classWriter0.newMethod((String) null, "r`oYw72t{DrskqJ4!", "r`oYw72t{DrskqJ4!", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      int int0 = classWriter0.newField("org.mockito.asm.Attribute", "org.mockito.asm.Attribute", "org.mockito.asm.Attribute");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.FieldWriter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 4);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(546);
      ClassReader classReader0 = new ClassReader("org.mockito.asm.FieldWriter");
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 40);
      assertEquals(48, classReader0.getAccess());
  }
}
