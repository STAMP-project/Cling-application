/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 08:45:18 GMT 2019
 */

package org.mockito.asm.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.AnnotationVisitor;
import org.mockito.asm.Attribute;
import org.mockito.asm.Type;
import org.mockito.asm.util.ASMifierAbstractVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ASMifierAbstractVisitor_ESTest extends ASMifierAbstractVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double double0 = new Double(1499.09);
      // Undeclared exception!
      try { 
        ASMifierAbstractVisitor.appendConstant((StringBuffer) null, double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.util.ASMifierAbstractVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Long long0 = new Long(2221L);
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, long0);
      assertEquals("new Long(2221L)", stringBuffer0.toString());
      assertEquals(15, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Float float0 = new Float(2078.1F);
      // Undeclared exception!
      try { 
        ASMifierAbstractVisitor.appendConstant((StringBuffer) null, float0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.util.ASMifierAbstractVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Integer integer0 = new Integer(592);
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, integer0);
      assertEquals(16, stringBuffer0.length());
      assertEquals("new Integer(592)", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Character character0 = Character.valueOf('*');
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, character0);
      assertEquals(23, stringBuffer0.length());
      assertEquals("new Character((char)42)", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Short short0 = new Short((short) (-994));
      // Undeclared exception!
      try { 
        ASMifierAbstractVisitor.appendConstant((StringBuffer) null, short0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.util.ASMifierAbstractVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = Boolean.FALSE;
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, boolean0);
      assertEquals("Boolean.FALSE", stringBuffer0.toString());
      assertEquals(13, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      // Undeclared exception!
      try { 
        ASMifierAbstractVisitor.appendConstant((StringBuffer) null, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.util.ASMifierAbstractVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Byte byte0 = new Byte((byte)60);
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, byte0);
      assertEquals("new Byte((byte)60)", stringBuffer0.toString());
      assertEquals(18, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Type type0 = Type.SHORT_TYPE;
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, type0);
      assertEquals("Type.getType(\"S\")", stringBuffer0.toString());
      assertEquals(17, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ASMifierAbstractVisitor.appendConstant(stringBuffer0, stringBuffer0);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ASMifierAbstractVisitor.appendConstant((StringBuffer) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.util.ASMifierAbstractVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ASMifierAbstractVisitor aSMifierAbstractVisitor0 = new ASMifierAbstractVisitor("AwI5a");
      Attribute attribute0 = mock(Attribute.class, new ViolatedAssumptionAnswer());
      aSMifierAbstractVisitor0.visitAttribute(attribute0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ASMifierAbstractVisitor aSMifierAbstractVisitor0 = new ASMifierAbstractVisitor("eax");
      AnnotationVisitor annotationVisitor0 = aSMifierAbstractVisitor0.visitAnnotation("eax", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ASMifierAbstractVisitor aSMifierAbstractVisitor0 = new ASMifierAbstractVisitor("");
      aSMifierAbstractVisitor0.visitEnd();
  }
}
