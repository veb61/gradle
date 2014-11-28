package com.code4reference.gradle;

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class Code4ReferenceTask extends DefaultTask {

    @TaskAction
    def showMessage() {
        println '----------showMessage-------------'
        printInfo()
    }

    def printInfo()
    {
    	println "From : $project.c4Args.sender ,  Message: $project.c4Args.message" 
    	printNestedInfo()
    }

    def printNestedInfo()
    {
    	println "Reciver : $project.c4Args.nestedArgs.receiver   Email: $project.c4Args.nestedArgs.email"
    }
}