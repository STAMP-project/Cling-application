/*

 * Tue Mar 03 20:11:33 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaMembers;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ScriptRuntime_ESTest extends ScriptRuntime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<TopLevel> class0 = TopLevel.class;
      boolean boolean0 = ScriptRuntime.isRhinoRuntimeType(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(scriptable0).toString();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      doReturn((Scriptable) null).when(context0).newArray(any(com.google.javascript.rhino.head.Scriptable.class) , anyInt());
      ScriptableObject scriptableObject0 = ScriptRuntime.getGlobal(context0);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.setObjectProp((Object) scriptableObject0, "language version", (Object) scriptable0, context1);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      long long0 = ScriptRuntime.testUint32String("error reporter");
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharSequence charSequence0 = ScriptRuntime.add((CharSequence) "language version", (Object) null);
      assertEquals(20, charSequence0.length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyInt() , any(com.google.javascript.rhino.head.Scriptable.class));
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.getObjectIndex(scriptable0, 2828, context0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ScriptRuntime.isRhinoRuntimeType(class0);
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Long long0 = new Long((-2639L));
      ScriptRuntime.toUint16(long0);
      NativeError nativeError0 = new NativeError();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeError0, false);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.setObjectElem((Object) null, (Object) nativeGenerator0, (Object) long0, context0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot set property \"com.google.javascript.rhino.head.NativeGenerator@5175fe6\" of null to \"-2639\"
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).getDefaultValue(nullable(java.lang.Class.class));
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((String) null).when(scriptable0).toString();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.setObjectElem(scriptable0, (Object) scriptable0, (Object) scriptable0, context0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      Object object0 = ScriptRuntime.name(context0, scriptable0, "'wx`_,J");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Byte byte0 = new Byte((byte)60);
      boolean boolean0 = ScriptRuntime.toBoolean(byte0);
      Context context0 = Context.getCurrentContext();
      ClassLoader classLoader0 = mock(ClassLoader.class, new ViolatedAssumptionAnswer());
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      boolean boolean1 = ScriptRuntime.in(nativeJavaTopPackage0, nativeJavaTopPackage0, context0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassLoader classLoader0 = mock(ClassLoader.class, new ViolatedAssumptionAnswer());
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      assertFalse(nativeJavaTopPackage0.isSealed());
      
      Object object0 = ScriptRuntime.delete((Object) nativeJavaTopPackage0, (Object) nativeJavaTopPackage0, (Context) null, true);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(context0).getOptimizationLevel();
      doReturn(false).when(context0).hasFeature(anyInt());
      NativeObject nativeObject0 = (NativeObject)ScriptRuntime.initStandardObjects(context0, (ScriptableObject) null, true);
      assertFalse(nativeObject0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Class<BaseFunction> class0 = BaseFunction.class;
      JavaMembers javaMembers0 = new JavaMembers(importerTopLevel0, class0, false);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      Class<Integer> class1 = Integer.class;
      // Undeclared exception!
      try { 
        ScriptRuntime.toPrimitive((Object) nativeJavaMethod0, (Class<?>) class1);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("nX^9\u0004#");
      boolean boolean0 = ScriptRuntime.eqNumber((-610.31114873113), nativeJavaPackage0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      ScriptRuntime.getArrayElements(scriptable0);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable1 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable1).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable1).getParentScope();
      doReturn((String) null, (String) null).when(scriptable1).toString();
      // Undeclared exception!
      try { 
        ScriptRuntime.getPropFunctionAndThis((Object) ")-&9", "T", context0, scriptable1);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Context context1 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context1.initStandardObjects();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(scriptableObject0, false);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(nativeGenerator0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn(nativeGenerator0).when(scriptable0).getParentScope();
      NativeGenerator nativeGenerator1 = (NativeGenerator)ScriptRuntime.name(context0, scriptable0, "'wx`_,J");
      assertTrue(nativeGenerator1.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(context0).toString();
      ScriptRuntime.cmp_LT((Object) null, context0);
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("@3d+kwMVzp;1Pvm");
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ScriptRuntime.setObjectIndex((Object) nativeContinuation0, (double) 7, (Object) nativeJavaPackage0, context0);
      assertFalse(nativeContinuation0.isEmpty());
      assertTrue(nativeJavaPackage0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      String string0 = ScriptRuntime.toString((Object) importerTopLevel0);
      assertEquals("[object global]", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      context0.initStandardObjects();
      ClassLoader classLoader0 = mock(ClassLoader.class, new ViolatedAssumptionAnswer());
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      ScriptRuntime.in(nativeJavaTopPackage0, nativeJavaTopPackage0, context0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      Byte byte0 = new Byte((byte)60);
      ScriptRuntime.toBoolean(byte0);
      Context context0 = Context.getCurrentContext();
      context0.initStandardObjects();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Short short0 = new Short((short) (-635));
      Class<TopLevel> class0 = TopLevel.class;
      Object object0 = ScriptRuntime.toPrimitive((Object) short0, (Class<?>) class0);
      assertEquals((short) (-635), object0);
  }
}
