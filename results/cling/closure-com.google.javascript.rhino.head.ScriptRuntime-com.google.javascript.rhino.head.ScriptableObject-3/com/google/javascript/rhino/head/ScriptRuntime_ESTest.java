/*

 * Tue Mar 03 20:04:15 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.WrappedException;
import com.google.javascript.rhino.head.xml.XMLLib;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ScriptRuntime_ESTest extends ScriptRuntime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((String) null).when(scriptable0).toString();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.setConst(scriptable0, scriptable0, context0, "error reporter");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassLoader classLoader0 = mock(ClassLoader.class, new ViolatedAssumptionAnswer());
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      StringBuilder stringBuilder0 = new StringBuilder();
      CharSequence charSequence0 = ScriptRuntime.add((Object) nativeJavaTopPackage0, (CharSequence) stringBuilder0);
      assertEquals(14, charSequence0.length());
      assertTrue(nativeJavaTopPackage0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.getObjectPropNoWarn(nativeContinuation0, "error reporter", context0);
      Double double0 = ScriptRuntime.NaNobj;
      boolean boolean0 = ScriptRuntime.cmp_LE(object0, double0);
      assertTrue(nativeContinuation0.isExtensible());
      assertTrue(nativeContinuation0.isEmpty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      // Undeclared exception!
      try { 
        ScriptRuntime.getNameFunctionAndThis("-yA^d,r(R6xX", context0, scriptable0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: -yA^d,r(R6xX is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = ScriptRuntime.getIndexObject("language version");
      assertEquals("language version", object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = ScriptRuntime.isJSWhitespaceOrLineTerminator(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(context0).getOptimizationLevel();
      doReturn(false).when(context0).hasFeature(anyInt());
      BaseFunction baseFunction0 = new BaseFunction();
      assertFalse(baseFunction0.isSealed());
      
      ScriptableObject scriptableObject0 = ScriptRuntime.initStandardObjects(context0, baseFunction0, true);
      String string0 = ScriptRuntime.uneval(context0, scriptableObject0, scriptableObject0);
      assertEquals("({})", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Scriptable scriptable1 = ScriptRuntime.bind(context0, scriptable0, "msg.bad.getter.parms");
      assertNull(scriptable1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(context0).newObject(any(com.google.javascript.rhino.head.Scriptable.class));
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.newObjectLiteral(objectArray0, (Object[]) null, context0, scriptable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ScriptRuntime.indexFromString("(Ljava/lang/Object;)D");
      EcmaError ecmaError0 = ScriptRuntime.constructError("(Ljava/lang/Object;)D", "zr`r", "", 0, "zr`r", 0);
      WrappedException wrappedException0 = new WrappedException(ecmaError0);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.add((Object) wrappedException0, (Object) wrappedException0, context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      BaseFunction baseFunction0 = new BaseFunction();
      ScriptableObject scriptableObject0 = ScriptRuntime.initStandardObjects(context0, baseFunction0, true);
      String string0 = ScriptRuntime.uneval(context0, scriptableObject0, scriptableObject0);
      assertEquals("({})", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((XMLLib.Factory) null).when(context0).getE4xImplementationFactory();
      doReturn((-474)).when(context0).getOptimizationLevel();
      doReturn(true).when(context0).hasFeature(anyInt());
      BaseFunction baseFunction0 = new BaseFunction();
      ScriptableObject scriptableObject0 = ScriptRuntime.initStandardObjects(context0, baseFunction0, true);
      String string0 = ScriptRuntime.uneval(context0, scriptableObject0, scriptableObject0);
      assertEquals("({})", string0);
  }
}
