# This file defines the Nix environment Replit will use to build and run your project.
# It's written in the Nix expression language (a functional configuration language).

{ pkgs }: {

  # `deps` is a list of packages (tools and libraries) that your Replit environment will include.
  deps = [

    # Maven: Java build tool that reads your pom.xml and manages dependencies and plugins.
    pkgs.maven

    # GraalVM 17 CE: A high-performance JDK that fully supports Java 17.
    # This is Replit's latest supported and stable Java runtime.
    pkgs.graalvm17-ce

    # Java Debugger: Enables breakpoints and step-through debugging inside Replit.
    pkgs.replitPackages.java-debug

    # Java Language Server: Provides autocomplete, error highlighting, etc. in Replit's IDE.
    pkgs.replitPackages.jdt-language-server
  ];
}
