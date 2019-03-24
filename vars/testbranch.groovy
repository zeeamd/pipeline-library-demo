#!/usr/bin/env groovy
package com.cleverbuilder

def call(String name, String path) {
  echo "Branch ${name}"
  echo "Clone Dir ${path}"
  def c = "git clone --branch ${name} https://github.com/zeeamd/test4jira.git ${path}"
  println ("[$c]")
  Process p = c.execute()
  p.waitFor()
  println "Process exit code: ${p.exitValue()}"
  println "Std Out: ${p.err.text}"
  println "Std Out: ${p.in.text}"
}

