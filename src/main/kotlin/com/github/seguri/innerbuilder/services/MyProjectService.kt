package com.github.seguri.innerbuilder.services

import com.intellij.openapi.project.Project
import com.github.seguri.innerbuilder.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
