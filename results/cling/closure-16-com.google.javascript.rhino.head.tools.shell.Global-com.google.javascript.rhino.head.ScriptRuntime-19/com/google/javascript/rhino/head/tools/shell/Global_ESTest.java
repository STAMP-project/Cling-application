/*

 * Tue Mar 03 20:48:21 GMT 2020
 */

package com.google.javascript.rhino.head.tools.shell;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Function;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeJavaObject;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.WrapFactory;
import com.google.javascript.rhino.head.tools.shell.Global;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Global_ESTest extends Global_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Global.sync((Context) null, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      Context context0 = Context.getCurrentContext();
      Object[] objectArray0 = new Object[7];
      BaseFunction baseFunction0 = new BaseFunction(scriptable0, scriptable0);
      // Undeclared exception!
      try { 
        Global.seal(context0, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function can only be applied to objects
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Array;
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      assertNotNull(baseFunction0);
      
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) baseFunction0;
      Object object0 = Global.toint32(context0, baseFunction0, objectArray0, baseFunction0);
      assertEquals(0, object0);
      assertFalse(baseFunction0.isSealed());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[1];
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        Global.doctest(context0, (Scriptable) null, objectArray0, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Context context0 = Context.getCurrentContext();
          Global global0 = new Global();
          BaseFunction baseFunction0 = new BaseFunction(global0, global0);
          Object[] objectArray0 = new Object[1];
          // Undeclared exception!
          try { 
            Global.runCommand(context0, (Scriptable) null, objectArray0, baseFunction0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"<<ALL FILES>>\" \"execute\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkExec(SecurityManager.java:799)
             // java.lang.ProcessBuilder.start(ProcessBuilder.java:1018)
             // java.lang.Runtime.exec(Runtime.java:621)
             // java.lang.Runtime.exec(Runtime.java:486)
             // com.google.javascript.rhino.head.tools.shell.Global.runProcess(Global.java:930)
             // com.google.javascript.rhino.head.tools.shell.Global.runCommand(Global.java:760)
             // sun.reflect.GeneratedMethodAccessor191.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = new Context();
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.spawn(context0, baseFunction0, context0.emptyArgs, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = new Context();
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.runCommand(context0, baseFunction0, context0.emptyArgs, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // The first argument to runCommand must be a command name.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Global global0 = new Global();
      InputStream inputStream0 = global0.getIn();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      try { 
        Global.pipe(false, inputStream0, byteArrayOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
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
  public void test09()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) scriptable0;
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.seal((Context) null, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function supports only sealing of ScriptableObject instances
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      Object[] objectArray0 = new Object[8];
      objectArray0[7] = (Object) scriptable0;
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Global.runCommand(context0, scriptable0, objectArray0, function0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot convert null to an object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      context0.getElements(nativeArray0);
      Global global0 = new Global(context0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      BaseFunction baseFunction0 = new BaseFunction();
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      context0.initStandardObjects((ScriptableObject) baseFunction0, false);
      Object[] objectArray1 = context0.getElements(nativeArray0);
      assertEquals(2, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global();
      BaseFunction baseFunction0 = new BaseFunction(global0, global0);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) baseFunction0;
      Thread thread0 = (Thread)Global.spawn(context0, (Scriptable) null, objectArray0, baseFunction0);
      assertFalse(thread0.isInterrupted());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      Global global0 = new Global();
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      // Undeclared exception!
      try { 
        global0.runDoctest(context0, nativeJavaObject0, "js>vTk.ew%{fSz9+V", "", 9);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // doctest failure running:
         // vTk.ew%{fSz9+V
         // expected: actual: js: \"doctest input\", line 1: missing : after property id
         // js: vTk.ew%{fSz9+V
         // js: .............^
         // js: \"doctest input\", line 1: Compilation produced 1 syntax errors.
         // 
         // 
         //  (#9)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Global global0 = new Global();
      BaseFunction baseFunction0 = new BaseFunction(global0, global0);
      Context context0 = Context.getCurrentContext();
      Global.seal(context0, global0, context0.emptyArgs, baseFunction0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Context context0 = new Context();
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[4];
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Global.sync(context0, scriptable0, objectArray0, function0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = new Context();
      Global global0 = new Global(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.RegExp;
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      // Undeclared exception!
      try { 
        Global.sync(context0, baseFunction0, context0.emptyArgs, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      Global.pipe(false, inputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Array;
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      Global.toint32(context0, scriptable0, context0.emptyArgs, baseFunction0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[1];
      try { 
        Global.readFile((Context) null, scriptable0, objectArray0, baseFunction0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File not found: null
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(2);
      context0.initStandardObjects((ScriptableObject) nativeArray0, false);
      WrapFactory wrapFactory0 = new WrapFactory();
      Class<NativeJavaPackage> class0 = NativeJavaPackage.class;
      Scriptable scriptable0 = wrapFactory0.wrapAsJavaObject(context0, nativeArray0, context0, class0);
      context0.getElements(scriptable0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = new Context();
      Global global0 = new Global();
      int int0 = global0.runDoctest(context0, (Scriptable) null, "language version", "^ddrd<a'dp/fR{6%", 140);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[9];
      objectArray0[8] = (Object) baseFunction0;
      // Undeclared exception!
      try { 
        Global.runCommand(context0, global0, objectArray0, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = new Context();
      try { 
        Global.readUrl(context0, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: null
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        context0.compileString("OpenJDK 64Bit SZrver VM", "OpenJDK 64Bit SZrver VM", 4, (Object) null);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // missing ; before statement (OpenJDK 64Bit SZrver VM#4)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }
}
