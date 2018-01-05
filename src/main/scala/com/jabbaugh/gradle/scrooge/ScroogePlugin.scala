package com.jabbaugh.gradle.scrooge

import org.gradle.api.Plugin
import org.gradle.api.Project

class ScroogePlugin extends Plugin[Project] {

  def apply(project: Project): Unit = {
    project.getTasks.create("compileScrooge", classOf[ScroogeCompileTask])
  }
}
