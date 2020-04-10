/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 19:08:42 GMT 2020
 */

package com.google.javascript.jscomp;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class CommandLineRunner_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.jscomp.CommandLineRunner"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/botsing-integration-experiment"); 
    java.lang.System.setProperty("user.home", "/home/pderakhshanfar"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CommandLineRunner_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.javascript.jscomp.WarningLevel",
      "com.google.javascript.jscomp.type.ReverseAbstractInterpreter",
      "com.google.javascript.jscomp.CompilerOptions$LanguageMode",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.Collections2",
      "com.google.javascript.jscomp.CommandLineRunner$Flags$WarningGuardErrorOptionHandler",
      "com.google.common.collect.PeekingIterator",
      "com.google.javascript.jscomp.NodeTraversal$Callback",
      "com.google.javascript.jscomp.CheckSideEffects",
      "com.google.javascript.jscomp.graph.Graph",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.jscomp.PassFactory",
      "com.google.common.collect.Sets$2",
      "com.google.javascript.jscomp.JSModule",
      "com.google.common.collect.Sets$3",
      "com.google.common.collect.Sets$1",
      "com.google.javascript.rhino.jstype.ObjectType",
      "org.kohsuke.args4j.CmdLineParser",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.javascript.jscomp.ControlFlowGraph",
      "com.google.javascript.jscomp.graph.GraphvizGraph",
      "com.google.javascript.jscomp.AbstractCommandLineRunner$WarningGuardSpec",
      "com.google.javascript.jscomp.HotSwapCompilerPass",
      "com.google.javascript.jscomp.SourceFile$Builder",
      "com.google.common.collect.Iterators$12",
      "com.google.common.collect.Iterators$11",
      "com.google.javascript.jscomp.ClosureCodingConvention",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.common.base.Predicate",
      "com.google.javascript.jscomp.AbstractCommandLineRunner$1",
      "com.google.javascript.jscomp.CodingConvention",
      "com.google.javascript.jscomp.ControlStructureCheck",
      "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter",
      "com.google.javascript.jscomp.SourceMap$DetailLevel",
      "com.google.javascript.jscomp.VariableReferenceCheck",
      "com.google.javascript.jscomp.WarningsGuard",
      "com.google.common.io.CharStreams$2",
      "com.google.javascript.jscomp.CompilerOptions$1",
      "com.google.common.base.Joiner",
      "com.google.javascript.jscomp.CheckAccessControls",
      "com.google.javascript.jscomp.CheckDebuggerStatement",
      "com.google.javascript.jscomp.CompilerOptions",
      "com.google.javascript.jscomp.CleanupPasses",
      "org.kohsuke.args4j.OptionDef",
      "org.kohsuke.args4j.Messages",
      "com.google.javascript.jscomp.CompilerOptions$Reach",
      "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy",
      "com.google.common.collect.Iterators$14",
      "com.google.common.collect.Iterators$13",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.javascript.jscomp.CheckProvides",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.jscomp.RhinoErrorReporter",
      "com.google.javascript.jscomp.CompilerOptions$AliasTransformation",
      "org.kohsuke.args4j.spi.Setter",
      "com.google.common.base.Charsets",
      "com.google.javascript.jscomp.CheckGlobalNames",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.javascript.jscomp.CheckRegExp",
      "org.kohsuke.args4j.spi.Parameters",
      "com.google.javascript.jscomp.CssRenamingMap",
      "com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException",
      "com.google.common.base.CharMatcher$5",
      "com.google.common.base.CharMatcher$4",
      "com.google.javascript.jscomp.CheckGlobalThis",
      "com.google.common.base.CharMatcher$3",
      "com.google.common.base.CharMatcher$2",
      "com.google.common.base.CharMatcher$9",
      "com.google.common.base.CharMatcher$8",
      "com.google.common.base.CharMatcher$7",
      "com.google.common.base.CharMatcher$6",
      "org.kohsuke.args4j.spi.BooleanOptionHandler",
      "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter",
      "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard",
      "com.google.common.base.Preconditions",
      "com.google.javascript.jscomp.MessageFormatter",
      "com.google.common.base.CharMatcher$1",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.javascript.jscomp.CommandLineRunner$Flags$WarningGuardOffOptionHandler",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.javascript.jscomp.ErrorHandler",
      "org.kohsuke.args4j.MultiValueFieldSetter",
      "com.google.javascript.jscomp.SourceFile$Preloaded",
      "com.google.common.collect.ImmutableCollection",
      "com.google.javascript.jscomp.ComposeWarningsGuard$GuardComparator",
      "com.google.javascript.jscomp.ProcessDefines",
      "com.google.javascript.jscomp.StrictModeCheck",
      "com.google.javascript.jscomp.Result",
      "com.google.javascript.jscomp.ShowByPathWarningsGuard",
      "com.google.javascript.jscomp.CompilerPass",
      "com.google.javascript.jscomp.VariableRenamingPolicy",
      "org.kohsuke.args4j.FieldSetter",
      "com.google.common.collect.Iterators$6",
      "com.google.javascript.jscomp.ErrorFormat$2",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Iterators$7",
      "com.google.javascript.jscomp.ErrorFormat$3",
      "com.google.javascript.jscomp.ErrorFormat$4",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.javascript.jscomp.CodeChangeHandler",
      "com.google.javascript.jscomp.FunctionTypeBuilder",
      "com.google.common.collect.Iterators$1",
      "com.google.javascript.jscomp.DisambiguateProperties$Warnings",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators$3",
      "com.google.javascript.jscomp.JsMessageVisitor$MalformedException",
      "com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention",
      "org.kohsuke.args4j.CmdLineException",
      "org.kohsuke.args4j.spi.StringOptionHandler",
      "com.google.javascript.jscomp.CompilationLevel$1",
      "com.google.common.base.CharMatcher$LookupTable",
      "com.google.common.collect.RegularImmutableList$1",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "com.google.javascript.jscomp.ProcessTweaks",
      "org.kohsuke.args4j.spi.FloatOptionHandler",
      "com.google.javascript.jscomp.CodingConventions",
      "com.google.common.collect.Lists$1",
      "com.google.javascript.jscomp.ErrorFormat$1",
      "com.google.javascript.jscomp.Compiler$3",
      "com.google.common.collect.SingletonImmutableList$1",
      "com.google.common.base.Supplier",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph",
      "com.google.javascript.jscomp.TypeValidator",
      "com.google.common.collect.ImmutableList",
      "com.google.common.io.Files",
      "com.google.javascript.jscomp.CommandLineRunner$Flags$BooleanOptionHandler",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.javascript.jscomp.deps.SortedDependencies$MissingProvideException",
      "com.google.javascript.jscomp.SyntacticScopeCreator",
      "com.google.javascript.jscomp.CompilerOptions$TweakProcessing",
      "com.google.common.collect.Hashing",
      "com.google.javascript.jscomp.SourceMap$Format",
      "com.google.javascript.rhino.TokenStream",
      "com.google.javascript.jscomp.SourceMap$Format$4",
      "com.google.javascript.jscomp.SourceMap$Format$3",
      "com.google.javascript.jscomp.SourceMap$Format$2",
      "com.google.javascript.jscomp.SourceMap$Format$1",
      "org.kohsuke.args4j.spi.FileOptionHandler",
      "com.google.javascript.jscomp.SourceAst",
      "com.google.common.collect.RegularImmutableList",
      "org.kohsuke.args4j.Argument",
      "com.google.javascript.jscomp.WarningLevel$1",
      "com.google.javascript.jscomp.MessageBundle",
      "com.google.javascript.jscomp.CheckUnreachableCode",
      "com.google.javascript.jscomp.SourceExcerptProvider",
      "com.google.javascript.jscomp.CodingConventions$Proxy",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.javascript.jscomp.ReferenceCollectingCallback$Behavior",
      "org.kohsuke.args4j.spi.CharOptionHandler",
      "org.kohsuke.args4j.spi.LongOptionHandler",
      "com.google.javascript.jscomp.ComposeWarningsGuard",
      "com.google.javascript.jscomp.CompilationLevel",
      "com.google.javascript.rhino.head.ErrorReporter",
      "com.google.javascript.jscomp.CommandLineRunner$Flags",
      "com.google.javascript.jscomp.PhaseOptimizer$Loop",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.javascript.jscomp.JsMessageVisitor",
      "com.google.javascript.jscomp.ErrorFormat",
      "com.google.javascript.jscomp.AbstractCommandLineRunner",
      "com.google.javascript.jscomp.JqueryCodingConvention",
      "org.kohsuke.args4j.spi.DoubleOptionHandler",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler",
      "org.kohsuke.args4j.spi.EnumOptionHandler",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.common.collect.ImmutableAsList",
      "com.google.javascript.jscomp.AbstractCommandLineRunner$RunTimeStats",
      "com.google.common.collect.Sets$SetView",
      "org.kohsuke.args4j.spi.ShortOptionHandler",
      "com.google.javascript.jscomp.PassConfig",
      "com.google.javascript.jscomp.PhaseOptimizer",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.javascript.jscomp.DiagnosticGroups",
      "com.google.javascript.jscomp.ScopeCreator",
      "com.google.javascript.jscomp.CommandLineRunner",
      "org.kohsuke.args4j.IllegalAnnotationError",
      "com.google.javascript.jscomp.graph.AdjacencyGraph",
      "com.google.common.collect.EmptyImmutableList$1",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.javascript.jscomp.deps.SortedDependencies$CircularDependencyException",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.javascript.jscomp.PropertyRenamingPolicy",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.CharMatcher$And",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler$NullAliasTransformation",
      "org.kohsuke.args4j.spi.URLOptionHandler",
      "com.google.common.collect.MapDifference",
      "com.google.javascript.jscomp.CompilerOptions$AliasTransformationHandler",
      "com.google.common.io.OutputSupplier",
      "com.google.javascript.jscomp.SourceFile$Generated",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.common.collect.UnmodifiableIterator",
      "org.kohsuke.args4j.CmdLineParser$1",
      "com.google.javascript.jscomp.Compiler",
      "org.kohsuke.args4j.CmdLineParser$CmdLineImpl",
      "com.google.common.io.InputSupplier",
      "com.google.javascript.jscomp.DiagnosticGroup",
      "com.google.javascript.jscomp.NodeTraversal$ScopedCallback",
      "com.google.javascript.jscomp.TypedScopeCreator",
      "com.google.javascript.jscomp.SyntacticScopeCreator$RedeclarationHandler",
      "com.google.common.base.CharMatcher$12",
      "org.kohsuke.args4j.spi.OptionHandler",
      "com.google.common.base.CharMatcher$11",
      "com.google.common.base.CharMatcher$10",
      "com.google.javascript.jscomp.PhaseOptimizer$LoopInternal",
      "com.google.common.io.Files$1",
      "com.google.common.io.AppendableWriter",
      "com.google.common.base.CharMatcher$15",
      "com.google.common.base.CharMatcher$14",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.base.CharMatcher$13",
      "com.google.common.base.Platform",
      "com.google.javascript.jscomp.TypedScopeCreator$GlobalScopeBuilder",
      "com.google.common.io.CharStreams",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.javascript.jscomp.ErrorManager",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.common.base.Function",
      "org.kohsuke.args4j.spi.ByteOptionHandler",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.javascript.jscomp.JSModuleGraph",
      "org.kohsuke.args4j.Option",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.javascript.jscomp.TypedScopeCreator$LocalScopeBuilder",
      "com.google.javascript.jscomp.CommandLineRunner$Flags$WarningGuardWarningOptionHandler",
      "com.google.common.io.LimitInputStream",
      "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig",
      "com.google.javascript.jscomp.Region",
      "com.google.javascript.jscomp.ProcessCommonJSModules",
      "com.google.javascript.jscomp.NodeTraversal$AbstractPostOrderCallback",
      "org.kohsuke.args4j.NamedOptionDef",
      "com.google.javascript.jscomp.DefaultPassConfig",
      "org.kohsuke.args4j.spi.IntOptionHandler",
      "com.google.javascript.jscomp.CompilerOptions$TracerMode",
      "com.google.javascript.jscomp.CommandLineRunner$FormattingOption",
      "org.kohsuke.args4j.spi.MapOptionHandler",
      "com.google.javascript.jscomp.SourceMap$DetailLevel$2",
      "com.google.common.collect.Multimap",
      "com.google.javascript.jscomp.SourceMap$DetailLevel$1",
      "com.google.common.collect.Iterators",
      "org.kohsuke.args4j.spi.URIOptionHandler",
      "org.kohsuke.args4j.spi.OneArgumentOptionHandler",
      "com.google.javascript.jscomp.VarCheck",
      "com.google.javascript.jscomp.CompilerOptions$DevMode",
      "com.google.javascript.jscomp.TypedScopeCreator$AbstractScopeBuilder",
      "com.google.javascript.jscomp.ProcessTweaks$TweakFunction",
      "com.google.javascript.jscomp.DependencyOptions",
      "com.google.javascript.jscomp.SourceFile$OnDisk",
      "com.google.javascript.rhino.jstype.StaticSymbolTable",
      "com.google.javascript.jscomp.JSModuleGraph$ModuleDependenceException",
      "com.google.javascript.jscomp.graph.DiGraph",
      "com.google.common.base.Platform$1",
      "com.google.javascript.jscomp.CommandLineRunner$Flags$WarningGuardSetter",
      "com.google.javascript.jscomp.ConstCheck",
      "com.google.javascript.jscomp.TypeCheck",
      "com.google.javascript.jscomp.deps.DependencyInfo",
      "com.google.common.collect.Maps",
      "com.google.common.primitives.Ints",
      "com.google.javascript.jscomp.WarningsGuard$Priority",
      "com.google.common.base.CharMatcher$Or"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.google.common.base.Supplier", false, CommandLineRunner_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CommandLineRunner_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.jscomp.AbstractCommandLineRunner",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.common.collect.ImmutableCollection",
      "com.google.javascript.jscomp.CommandLineRunner",
      "com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException",
      "com.google.javascript.jscomp.CommandLineRunner$Flags",
      "com.google.javascript.jscomp.CommandLineRunner$FormattingOption",
      "com.google.common.io.Closeables",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.jscomp.CompilationLevel",
      "com.google.common.collect.Collections2",
      "com.google.javascript.jscomp.CompilerOptions$DevMode",
      "com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention",
      "com.google.javascript.jscomp.SourceMap$DetailLevel",
      "com.google.javascript.jscomp.SourceMap$Format",
      "com.google.javascript.jscomp.CompilerOptions$TweakProcessing",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.javascript.jscomp.ProcessCommonJSModules",
      "com.google.javascript.jscomp.WarningLevel",
      "org.kohsuke.args4j.CmdLineParser",
      "com.google.common.collect.Maps",
      "com.google.javascript.jscomp.CommandLineRunner$Flags$BooleanOptionHandler",
      "org.kohsuke.args4j.spi.BooleanOptionHandler",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.ClosureCodingConvention",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Iterators",
      "com.google.javascript.jscomp.PhaseOptimizer",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler$NullAliasTransformation",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler",
      "com.google.javascript.jscomp.CompilerOptions",
      "com.google.javascript.jscomp.DependencyOptions",
      "com.google.javascript.jscomp.ComposeWarningsGuard",
      "com.google.common.primitives.Ints",
      "com.google.javascript.jscomp.ComposeWarningsGuard$GuardComparator",
      "com.google.javascript.jscomp.CompilerOptions$LanguageMode",
      "com.google.javascript.jscomp.VariableRenamingPolicy",
      "com.google.javascript.jscomp.PropertyRenamingPolicy",
      "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy",
      "com.google.javascript.jscomp.CompilerOptions$TracerMode",
      "com.google.javascript.jscomp.ErrorFormat",
      "com.google.javascript.jscomp.CompilationLevel$1",
      "com.google.javascript.jscomp.CompilerOptions$Reach",
      "com.google.javascript.jscomp.CompilerOptions$1",
      "com.google.javascript.jscomp.CheckGlobalThis",
      "com.google.javascript.jscomp.DiagnosticGroup",
      "com.google.javascript.jscomp.CheckAccessControls",
      "com.google.javascript.jscomp.RhinoErrorReporter",
      "com.google.javascript.jscomp.TypeValidator",
      "com.google.javascript.jscomp.VarCheck",
      "com.google.javascript.jscomp.CheckGlobalNames",
      "com.google.javascript.jscomp.VariableReferenceCheck",
      "com.google.javascript.jscomp.ProcessDefines",
      "com.google.common.base.Platform",
      "com.google.common.base.CharMatcher",
      "com.google.javascript.jscomp.ProcessTweaks$TweakFunction",
      "com.google.javascript.jscomp.ProcessTweaks",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.jscomp.TypedScopeCreator",
      "com.google.javascript.jscomp.FunctionTypeBuilder",
      "com.google.javascript.jscomp.TypeCheck",
      "com.google.javascript.jscomp.CheckDebuggerStatement",
      "com.google.javascript.jscomp.CheckRegExp",
      "com.google.javascript.jscomp.SyntacticScopeCreator",
      "com.google.javascript.jscomp.CheckSideEffects",
      "com.google.javascript.jscomp.CheckUnreachableCode",
      "com.google.javascript.jscomp.ConstCheck",
      "com.google.javascript.jscomp.DisambiguateProperties$Warnings",
      "com.google.javascript.jscomp.ControlStructureCheck",
      "com.google.javascript.jscomp.StrictModeCheck",
      "com.google.javascript.jscomp.CheckProvides",
      "com.google.javascript.jscomp.JsMessageVisitor",
      "com.google.javascript.jscomp.DiagnosticGroups",
      "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard",
      "com.google.javascript.jscomp.WarningsGuard$Priority",
      "com.google.javascript.jscomp.WarningLevel$1",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.common.base.Charsets",
      "com.google.javascript.jscomp.SourceFile$Preloaded",
      "org.kohsuke.args4j.CmdLineException",
      "org.kohsuke.args4j.Messages",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.javascript.jscomp.Compiler",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.ArrayListMultimap",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.rhino.jstype.ObjectType$Property",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.protobuf.ByteString",
      "com.google.javascript.jscomp.SyntheticAst",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.jscomp.NameGenerator",
      "com.google.javascript.jscomp.TightenTypes",
      "com.google.protobuf.GeneratedMessage",
      "com.google.protobuf.UnknownFieldSet",
      "com.google.protobuf.LazyStringArrayList",
      "com.google.protobuf.SmallSortedMap$EmptySet",
      "com.google.protobuf.FieldSet",
      "com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode",
      "com.google.protobuf.DescriptorProtos$FileOptions",
      "com.google.protobuf.DescriptorProtos$SourceCodeInfo",
      "com.google.protobuf.DescriptorProtos$FileDescriptorProto",
      "com.google.javascript.jscomp.JSSourceFile",
      "com.google.javascript.jscomp.SourceFile$OnDisk",
      "com.google.javascript.jscomp.NodeTraversal",
      "com.google.javascript.jscomp.NodeUtil",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.common.collect.LinkedListMultimap",
      "com.google.common.collect.AbstractMapBasedMultiset",
      "com.google.common.collect.LinkedHashMultiset",
      "com.google.javascript.jscomp.LineNumberCheck",
      "com.google.protobuf.ExtensionRegistryLite",
      "com.google.protobuf.ExtensionRegistry",
      "com.google.javascript.jscomp.Tracer",
      "com.google.javascript.jscomp.InlineSimpleMethods",
      "com.google.javascript.jscomp.AbstractMessageFormatter",
      "com.google.javascript.jscomp.LightweightMessageFormatter",
      "com.google.javascript.jscomp.JSModule",
      "com.google.protobuf.CodedInputStream",
      "com.google.protobuf.WireFormat",
      "com.google.protobuf.InvalidProtocolBufferException",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.jscomp.VariableMap",
      "com.google.javascript.jscomp.ObjectPropertyStringPreprocess",
      "com.google.javascript.jscomp.ReplaceMessages",
      "com.google.javascript.jscomp.ReplaceCssNames",
      "com.google.javascript.jscomp.DefaultPassConfig",
      "com.google.javascript.jscomp.JsAst",
      "com.google.javascript.jscomp.GoogleCodingConvention",
      "com.google.javascript.jscomp.PeepholeFoldConstants",
      "com.google.javascript.jscomp.BasicErrorManager$LeveledJSErrorComparator",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.javascript.jscomp.SourceFile$Generated",
      "com.google.javascript.jscomp.WhitelistWarningsGuard",
      "com.google.common.io.Files",
      "com.google.common.io.CharStreams",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.ImmutableListMultimap",
      "com.google.common.collect.ImmutableMultimap$BuilderMultimap",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.protobuf.DescriptorProtos$ServiceOptions",
      "com.google.protobuf.DescriptorProtos$MessageOptions",
      "com.google.protobuf.DescriptorProtos$DescriptorProto",
      "com.google.protobuf.DescriptorProtos$FieldOptions$CType",
      "com.google.protobuf.DescriptorProtos$FieldOptions",
      "com.google.protobuf.DescriptorProtos$FieldDescriptorProto",
      "com.google.protobuf.DescriptorProtos$EnumOptions",
      "com.google.protobuf.DescriptorProtos$EnumDescriptorProto",
      "com.google.protobuf.DescriptorProtos$EnumValueOptions",
      "com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto",
      "com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange",
      "com.google.protobuf.Descriptors$DescriptorPool",
      "com.google.protobuf.WireFormat$JavaType",
      "com.google.protobuf.WireFormat$FieldType",
      "com.google.protobuf.Descriptors$FieldDescriptor$JavaType",
      "com.google.protobuf.Descriptors$FieldDescriptor$Type",
      "com.google.protobuf.Descriptors$FieldDescriptor",
      "com.google.protobuf.Descriptors$1",
      "com.google.protobuf.DescriptorProtos",
      "com.google.javascript.jscomp.JqueryCodingConvention",
      "com.google.javascript.jscomp.FindExportableNodes",
      "com.google.javascript.jscomp.ReferenceCollectingCallback",
      "com.google.javascript.jscomp.LinkedFlowScope",
      "com.google.common.collect.EmptyImmutableMap",
      "com.google.protobuf.DescriptorProtos$FileDescriptorSet",
      "com.google.javascript.jscomp.AstParallelizer",
      "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback",
      "com.google.javascript.jscomp.NameAnalyzer",
      "com.google.common.collect.AbstractSortedSetMultimap",
      "com.google.common.collect.TreeMultimap",
      "com.google.common.collect.ImmutableMultimap$EntryCollection",
      "com.google.common.collect.HashMultimap",
      "com.google.common.collect.ImmutableSetMultimap",
      "com.google.common.collect.ImmutableSetMultimap$BuilderMultimap",
      "com.google.javascript.jscomp.DeadAssignmentsElimination",
      "com.google.javascript.jscomp.AmbiguateProperties",
      "com.google.javascript.jscomp.GlobalNamespace$Name$Type",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.javascript.jscomp.InlineProperties",
      "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax",
      "com.google.common.base.Predicates",
      "com.google.common.base.Predicates$ObjectPredicate",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.protobuf.UnknownFieldSet$Field",
      "com.google.common.collect.ImmutableMultimap$Values",
      "com.google.javascript.jscomp.CompilerInput",
      "com.google.protobuf.DescriptorProtos$ServiceDescriptorProto",
      "com.google.javascript.jscomp.ExpandJqueryAliases",
      "com.google.common.collect.EmptyImmutableListMultimap",
      "com.google.javascript.jscomp.OptimizeArgumentsArray",
      "com.google.javascript.jscomp.CheckMissingGetCssName",
      "com.google.javascript.jscomp.CoalesceVariableNames",
      "com.google.javascript.jscomp.Scope",
      "com.google.common.io.ByteStreams",
      "com.google.javascript.jscomp.XtbMessageBundle",
      "com.google.javascript.jscomp.XtbMessageBundle$Handler"
    );
  }
}
