#!/usr/bin/env groovy
package com.cleverbuilder

def call(String name = 'dev') {
  echo "Branch ${name}."
}

