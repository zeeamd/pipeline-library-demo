#!/usr/bin/env groovy
package com.cleverbuilder

def call(String name) {
  echo "Branch ${name}"
  def command = "git --version"
  println ("[$command]")
  Process p = command.execute()
  def outputStream = new StringBuffer();
  p.waitForProcessOutput(outputStream, System.err)
}

