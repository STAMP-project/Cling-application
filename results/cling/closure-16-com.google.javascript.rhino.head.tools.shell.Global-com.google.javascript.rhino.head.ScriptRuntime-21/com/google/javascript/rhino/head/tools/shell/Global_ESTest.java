/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 08:39:16 GMT 2019
 */

package com.google.javascript.rhino.head.tools.shell;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Function;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.tools.shell.Global;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Global_ESTest extends Global_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(importerTopLevel0, importerTopLevel0, scriptableObject0, (Object) null, scriptableObject0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Object[] objectArray0 = new Object[3];
      objectArray0[2] = (Object) scriptable0;
      Global global0 = new Global();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        Global.runCommand(context0, global0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Global global0 = new Global();
      InputStream inputStream0 = global0.getIn();
      InputStream inputStream1 = global0.getIn();
      assertSame(inputStream1, inputStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = Context.enter();
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.spawn(context0, (Scriptable) null, context0.emptyArgs, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      try { 
        Global.readFile(context0, (Scriptable) null, objectArray0, (Function) null);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File not found: null
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      Delegator delegator0 = new Delegator(global0);
      // Undeclared exception!
      try { 
        Global.sync(context0, global0, context0.emptyArgs, delegator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global.seal(context0, (Scriptable) null, context0.emptyArgs, (Function) null);
      assertEquals((-1), Context.VERSION_UNKNOWN);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("language version", classLoader0);
      Global global0 = new Global(context0);
      int int0 = global0.runDoctest(context0, nativeJavaPackage0, "error reporter", "error reporter", (-1240));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Global global0 = new Global();
      PrintStream printStream0 = global0.getOut();
      Global.pipe(false, byteArrayInputStream0, printStream0);
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      Global.pipe(false, inputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[4];
      objectArray0[3] = (Object) nativeArray0;
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      // Undeclared exception!
      try { 
        Global.runCommand(context0, nativeArray0, objectArray0, synchronizer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      Global.pipe(true, inputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(function0).getParentScope();
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Global.runCommand((Context) null, function0, objectArray0, function0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Global global0 = new Global();
      Synchronizer synchronizer0 = new Synchronizer(global0);
      // Undeclared exception!
      try { 
        Global.runCommand(context0, global0, context0.emptyArgs, synchronizer0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // The first argument to runCommand must be a command name.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(function0).getParentScope();
      // Undeclared exception!
      try { 
        Global.doctest((Context) null, scriptable0, objectArray0, function0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        Global.sync(context0, (Scriptable) null, objectArray0, (Function) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = Context.enter();
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[1];
      try { 
        Global.readUrl(context0, function0, objectArray0, function0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: null
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.spawn((Context) null, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Context context1 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context1.initStandardObjects();
      ClassLoader classLoader0 = context1.getApplicationClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("language version", classLoader0);
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(function0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Global global0 = new Global(context1);
      Object[] objectArray0 = new Object[8];
      objectArray0[7] = (Object) function0;
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Array;
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      // Undeclared exception!
      try { 
        Global.runCommand(context0, scriptableObject0, objectArray0, baseFunction0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot convert null to an object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      Context context0 = Context.getCurrentContext();
      Object object0 = Global.toint32(context0, function0, context0.emptyArgs, function0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Global global0 = new Global(context0);
      // Undeclared exception!
      try { 
        global0.runDoctest(context0, scriptableObject0, "js>error reporter", (String) null, 2);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // doctest failure running:
         // error reporter
         // expected: actual: js: \"doctest input\", line 1: missing ; before statement
         // js: error reporter
         // js: .............^
         // js: \"doctest input\", line 1: Compilation produced 1 syntax errors.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }
}
