/*

 * Tue Mar 03 18:53:36 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.FunctionObject;
import com.google.javascript.rhino.head.IdFunctionCall;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaMembers;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FunctionObject_ESTest extends FunctionObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.checkValidAttributes(160);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 160
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Object object0 = ScriptableObject.getProperty((Scriptable) importerTopLevel0, 110);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      assertFalse(importerTopLevel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = nativeIterator_StopIteration0.isConst(".~(-N6lH#");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) topLevel0, 8);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.String;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      // Undeclared exception!
      try { 
        importerTopLevel0.setGetterOrSetter("g^tp7pBj", 3, baseFunction0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // g^tp7pBj
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      IdFunctionObject idFunctionObject0 = null;
      try {
        idFunctionObject0 = new IdFunctionObject((IdFunctionCall) null, importerTopLevel0, (-1574), "language version", (-667), (Scriptable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      BaseFunction baseFunction0 = new BaseFunction();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(baseFunction0, context0.FEATURE_E4X, 5687, 5);
      BoundFunction boundFunction0 = new BoundFunction(context0, baseFunction0, baseFunction0, idFunctionObject0, context0.emptyArgs);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject.defineConstProperty(nativeIterator_StopIteration0, "v:B=(3@MSj");
      assertEquals("StopIteration", nativeIterator_StopIteration0.getClassName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage((ClassLoader) null);
      nativeBoolean0.put(11, (Scriptable) nativeBoolean0, (Object) nativeJavaTopPackage0);
      assertEquals("JavaPackage", nativeJavaTopPackage0.getClassName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      importerTopLevel0.putConst("getAlIds", baseFunction0, "getAlIds");
      assertFalse(importerTopLevel0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeString nativeString0 = new NativeString("getCla");
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        nativeString0.put((-1727), (Scriptable) null, (Object) nativeError0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeArray nativeArray0 = new NativeArray(0L);
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor(context0, nativeError0);
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
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) null, false);
      Class<FunctionObject> class0 = FunctionObject.class;
      JavaMembers javaMembers0 = new JavaMembers(scriptableObject0, class0);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      // Undeclared exception!
      try { 
        nativeJavaMethod0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.FunctionObject
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }
}
