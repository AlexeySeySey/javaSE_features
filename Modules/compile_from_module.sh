#!/bin/bash

# $1 - module name
# $2 - path to class inside module
# example: sh compile_from_module.sh FooModule com/Main.java

javac $1/module-info.java $1/$2