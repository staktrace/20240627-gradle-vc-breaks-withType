initscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.24")
    }
}

allprojects {
    pluginManager.withPlugin("org.jetbrains.kotlin.jvm") {
        // this always works as expected
        //tasks.withType<org.gradle.api.tasks.compile.JavaCompile>().configureEach {
        //    logger.quiet("[init] setting java options on $project")
        //}

        // this always works as expected
        //tasks.named("compileKotlin").configure {
        //    logger.quiet("[init] Configuring compileKotlin on $project task type is ${this::class.java}")
        //}

        // this one only works when the version catalog is empty or not present!!!
        tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
            logger.quiet("[init] Configuring KotlinCompile task $this on $project")
        }
    }
}
