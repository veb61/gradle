package com.code4reference.gradle;

import org.gradle.api.*;

class Code4ReferencePlugin implements Plugin {
    
    def void apply(project) {
        //c4rTask task has been defined below.
        project.task('c4rTask') << {
            println 'Hi from Code4Reference plugin!'
        }
    }
}