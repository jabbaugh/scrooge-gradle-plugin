scrooge-gradle-plugin
=====================

A gradle plugin to compile thrift files into Scala code.  

It can be configured as follows:
```Groovy
compileScrooge {
    thriftFiles = fileTree(dir: "src/main/thrift", include: "**/*.thrift")
    dest = file("src/gen/scala")
    opts = ["--finagle"]
}
```

## Build
```
./gradlew clean build
```

## Install
```
./gradlew clean build install
```

