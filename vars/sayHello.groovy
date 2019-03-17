#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
  echo "THIS IS MY GPL"
  echo "CONSTANT SRC ${GlobalVars.foo}"
}

