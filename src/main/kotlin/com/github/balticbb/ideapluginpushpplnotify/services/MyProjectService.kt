package com.github.balticbb.ideapluginpushpplnotify.services

import com.intellij.openapi.project.Project
import com.github.balticbb.ideapluginpushpplnotify.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
