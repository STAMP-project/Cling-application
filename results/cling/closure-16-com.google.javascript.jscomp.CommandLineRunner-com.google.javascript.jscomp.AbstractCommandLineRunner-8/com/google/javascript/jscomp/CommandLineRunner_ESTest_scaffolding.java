/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jul 24 03:47:19 GMT 2019
 */

package com.google.javascript.jscomp;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CommandLineRunner_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

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
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CommandLineRunner_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.javascript.jscomp.WarningLevel",
      "com.google.javascript.jscomp.CompilerOptions$TweakProcessing",
      "com.google.common.collect.Hashing",
      "com.google.javascript.jscomp.type.ReverseAbstractInterpreter",
      "com.google.javascript.jscomp.SourceMap$Format",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.Collections2",
      "com.google.javascript.jscomp.SourceMap$Format$4",
      "com.google.javascript.jscomp.CommandLineRunner$Flags$WarningGuardErrorOptionHandler",
      "com.google.javascript.jscomp.SourceMap$Format$3",
      "com.google.common.collect.PeekingIterator",
      "com.google.javascript.jscomp.SourceMap$Format$2",
      "com.google.javascript.jscomp.SourceMap$Format$1",
      "com.google.javascript.jscomp.NodeTraversal$Callback",
      "org.kohsuke.args4j.spi.FileOptionHandler",
      "com.google.javascript.jscomp.SourceAst",
      "com.google.common.collect.RegularImmutableList",
      "org.kohsuke.args4j.Argument",
      "com.google.javascript.jscomp.MessageBundle",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.jscomp.SourceExcerptProvider",
      "com.google.javascript.jscomp.CodingConventions$Proxy",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "org.kohsuke.args4j.spi.CharOptionHandler",
      "com.google.javascript.jscomp.PassFactory",
      "com.google.common.collect.Sets$2",
      "com.google.javascript.jscomp.JSModule",
      "com.google.common.collect.Sets$3",
      "com.google.common.collect.Sets$1",
      "com.google.javascript.rhino.jstype.ObjectType",
      "org.kohsuke.args4j.spi.LongOptionHandler",
      "org.kohsuke.args4j.CmdLineParser",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.javascript.jscomp.ComposeWarningsGuard",
      "com.google.javascript.jscomp.CompilationLevel",
      "com.google.javascript.jscomp.CommandLineRunner$Flags",
      "com.google.javascript.jscomp.AbstractCommandLineRunner$WarningGuardSpec",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.Iterators$12",
      "com.google.common.collect.Iterators$11",
      "com.google.javascript.jscomp.ClosureCodingConvention",
      "com.google.javascript.jscomp.AbstractCommandLineRunner",
      "com.google.common.base.Predicate",
      "com.google.javascript.jscomp.CodingConvention",
      "org.kohsuke.args4j.spi.DoubleOptionHandler",
      "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter",
      "com.google.javascript.jscomp.SourceMap$DetailLevel",
      "com.google.javascript.jscomp.WarningsGuard",
      "com.google.common.io.CharStreams$2",
      "com.google.common.base.Joiner",
      "org.kohsuke.args4j.spi.EnumOptionHandler",
      "com.google.javascript.jscomp.CompilerOptions",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.jscomp.CleanupPasses",
      "com.google.common.collect.ImmutableAsList",
      "org.kohsuke.args4j.OptionDef",
      "org.kohsuke.args4j.Messages",
      "com.google.javascript.jscomp.AbstractCommandLineRunner$RunTimeStats",
      "com.google.common.collect.Sets$SetView",
      "org.kohsuke.args4j.spi.ShortOptionHandler",
      "com.google.javascript.jscomp.PassConfig",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.Iterators$14",
      "com.google.common.collect.Iterators$13",
      "com.google.javascript.jscomp.DiagnosticGroups",
      "com.google.common.collect.Lists$Partition",
      "com.google.javascript.jscomp.ScopeCreator",
      "com.google.javascript.jscomp.CommandLineRunner",
      "com.google.common.collect.Lists",
      "org.kohsuke.args4j.IllegalAnnotationError",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.EmptyImmutableList$1",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.javascript.jscomp.deps.SortedDependencies$CircularDependencyException",
      "org.kohsuke.args4j.spi.Setter",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.javascript.jscomp.DiagnosticType",
      "org.kohsuke.args4j.spi.Parameters",
      "com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException",
      "org.kohsuke.args4j.spi.URLOptionHandler",
      "com.google.common.collect.MapDifference",
      "com.google.common.io.OutputSupplier",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.jscomp.AbstractCompiler",
      "org.kohsuke.args4j.spi.BooleanOptionHandler",
      "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter",
      "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "org.kohsuke.args4j.CmdLineParser$1",
      "com.google.javascript.jscomp.Compiler",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.javascript.jscomp.CommandLineRunner$Flags$WarningGuardOffOptionHandler",
      "org.kohsuke.args4j.CmdLineParser$CmdLineImpl",
      "com.google.common.io.InputSupplier",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.javascript.jscomp.ErrorHandler",
      "org.kohsuke.args4j.MultiValueFieldSetter",
      "com.google.common.collect.ImmutableCollection",
      "org.kohsuke.args4j.spi.OptionHandler",
      "com.google.common.io.Files$1",
      "com.google.common.io.AppendableWriter",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.io.CharStreams",
      "com.google.javascript.jscomp.Result",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.javascript.jscomp.ShowByPathWarningsGuard",
      "com.google.javascript.jscomp.CompilerPass",
      "com.google.javascript.jscomp.ErrorManager",
      "com.google.common.collect.SingletonImmutableList",
      "org.kohsuke.args4j.FieldSetter",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Iterators$7",
      "com.google.common.base.Function",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.javascript.jscomp.CodeChangeHandler",
      "org.kohsuke.args4j.spi.ByteOptionHandler",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.javascript.jscomp.JSModuleGraph",
      "org.kohsuke.args4j.Option",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators$3",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention",
      "org.kohsuke.args4j.CmdLineException",
      "org.kohsuke.args4j.spi.StringOptionHandler",
      "com.google.javascript.jscomp.CommandLineRunner$Flags$WarningGuardWarningOptionHandler",
      "com.google.common.io.LimitInputStream",
      "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig",
      "com.google.common.collect.RegularImmutableList$1",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "com.google.javascript.jscomp.ProcessCommonJSModules",
      "org.kohsuke.args4j.NamedOptionDef",
      "org.kohsuke.args4j.spi.FloatOptionHandler",
      "com.google.javascript.jscomp.CodingConventions",
      "com.google.javascript.jscomp.DefaultPassConfig",
      "com.google.common.collect.Lists$1",
      "org.kohsuke.args4j.spi.IntOptionHandler",
      "com.google.javascript.jscomp.Compiler$3",
      "com.google.javascript.jscomp.CommandLineRunner$FormattingOption",
      "com.google.common.collect.SingletonImmutableList$1",
      "com.google.common.base.Supplier",
      "org.kohsuke.args4j.spi.MapOptionHandler",
      "com.google.javascript.jscomp.SourceMap$DetailLevel$2",
      "com.google.javascript.jscomp.SourceMap$DetailLevel$1",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.common.collect.Iterators",
      "org.kohsuke.args4j.spi.URIOptionHandler",
      "org.kohsuke.args4j.spi.OneArgumentOptionHandler",
      "com.google.javascript.jscomp.CompilerOptions$DevMode",
      "com.google.common.collect.ImmutableList",
      "com.google.common.io.Files",
      "com.google.javascript.jscomp.CommandLineRunner$Flags$BooleanOptionHandler",
      "com.google.javascript.rhino.jstype.StaticSymbolTable",
      "com.google.javascript.jscomp.JSModuleGraph$ModuleDependenceException",
      "com.google.javascript.jscomp.CommandLineRunner$Flags$WarningGuardSetter",
      "com.google.javascript.jscomp.deps.DependencyInfo",
      "com.google.common.collect.Maps",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.javascript.jscomp.deps.SortedDependencies$MissingProvideException"
    );
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
      "org.kohsuke.args4j.CmdLineException",
      "org.kohsuke.args4j.Messages",
      "com.google.protobuf.ByteString",
      "com.google.javascript.jscomp.JSModule",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.common.base.Charsets",
      "com.google.javascript.jscomp.SourceFile$Generated",
      "com.google.javascript.jscomp.CheckMissingGetCssName",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.jscomp.NodeTraversal",
      "com.google.javascript.jscomp.SyntacticScopeCreator",
      "com.google.javascript.jscomp.NodeUtil",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.javascript.jscomp.Compiler",
      "com.google.protobuf.ExtensionRegistryLite",
      "com.google.protobuf.ExtensionRegistry",
      "com.google.protobuf.GeneratedMessage",
      "com.google.protobuf.UnknownFieldSet",
      "com.google.protobuf.DescriptorProtos$FileDescriptorSet",
      "com.google.javascript.jscomp.JqueryCodingConvention",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.jscomp.TypedScopeCreator",
      "com.google.javascript.jscomp.SourceFile$OnDisk",
      "com.google.common.io.Files",
      "com.google.common.io.CharStreams"
    );
  }
}
