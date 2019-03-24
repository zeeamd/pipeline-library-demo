#!/usr/bin/env groovy
package com.cleverbuilder

def call(String workspace) {
  echo "Current Workspace ${workspace}"
  currentworkspace = ${workspace}
  echo "Current Workspace ${currentworkspace}"
}

