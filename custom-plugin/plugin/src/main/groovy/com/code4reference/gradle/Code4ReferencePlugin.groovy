package com.code4reference.gradle;

import org.gradle.api.*;

class C4RNestedPluginExtension
{
	String receiver = 'Admin'
	String email = "admin@code4reference.com"
}

class Code4ReferencePluginExtension
{
	String message = "Hello from Code4Reference"
	String sender = "Code4Reference"
	C4RNestedPluginExtension nested = new C4RNestedPluginExtension()
}

class Code4ReferencePlugin implements Plugin {
    
    def void apply(project) {
    	project.extensions.create('c4Args',Code4ReferencePluginExtension)
    	project.c4Args.extensions.create('nestedArgs',C4RNestedPluginExtension)
    	project.task('cr4Task1', type:Code4ReferenceTask)
    }
}