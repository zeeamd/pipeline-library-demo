#!/usr/bin/env groovy
package com.cleverbuilder

def call(String workspace) {
  echo "Current Workspace ${workspace}"
  String currentworkspace = ${workspace}
  echo "Current Workspace : " currentworkspace
}

