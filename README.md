Steps to reproduce:

1. Run `./gradlew -I ./init.gradle.kts classes`
2. Observe that the `logger.quiet` line from the `init.gradle.kts` file produces no output. This is because the `configureEach` block is not getting executed.
3. Delete the `key = "value"` entry in `gradle/libs.versions.toml`
4. Run `./gradlew -I ./init.gradle.kts classes` again
5. Observe that now the `logger.quiet` line *does* output things.

Expected:
- In step 1 the `logger.quiet` line should be getting run!
