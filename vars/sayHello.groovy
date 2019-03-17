#!/usr/bin/env groovy
package com.cleverbuilder

def call(String name = 'human') {
  echo "Hello, ${name}."
  echo "THIS IS MY GPL"
  echo "CONSTANT SRC" GlobalVars.foo
}

