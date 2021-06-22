#!/bin/bash

# $1 - module name
# $2 - path to class inside module
# example: sh run_from_module.sh FooModule com.Main

java -p $1 -m $1/$2