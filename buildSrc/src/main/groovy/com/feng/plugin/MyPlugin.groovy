package com.feng.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        def extension = project.extensions.create("feng", MyConfig)
        project.afterEvaluate {
            println("config feng = ${extension.name}")
        }
    }
}
