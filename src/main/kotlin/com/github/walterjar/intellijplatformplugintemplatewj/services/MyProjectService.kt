package com.github.walterjar.intellijplatformplugintemplatewj.services

import com.intellij.openapi.project.Project
import com.github.walterjar.intellijplatformplugintemplatewj.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
