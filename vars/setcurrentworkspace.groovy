#!/usr/bin/env groovy
package com.cleverbuilder
import com.cleverbuilder.GlobalVars

def call(String workspace) {
  echo "Branch ${workspace}"
  println GlobalVars.currentworkspace
  GlobalVars.currentworkspace = ${workspace}
}

