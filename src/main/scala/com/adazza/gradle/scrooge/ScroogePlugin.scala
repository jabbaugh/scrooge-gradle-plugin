package com.adazza.gradle.scrooge

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
  * Created by danielbarajas on 6/8/17.
  */

class ScroogePlugin extends Plugin[Project] {

  def apply(project: Project): Unit = {
    project.getTasks.create("compileScrooge", classOf[ScroogeCompileTask])
  }
}
