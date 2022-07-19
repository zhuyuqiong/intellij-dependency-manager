package com.github.zhuyuqiong.intellijdependencymanager.services

import com.intellij.openapi.project.Project
import com.github.zhuyuqiong.intellijdependencymanager.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
