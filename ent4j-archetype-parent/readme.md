#build error 1
Description	Resource	Path	Location	Type
Plugin execution not covered by lifecycle configuration: org.apache.maven.plugins:maven-plugin-plugin:3.2:descriptor (execution: default-descriptor, phase: process-classes)	pom.xml	/ent4j-archetype-batch-javase	line 14	Maven Project Build Lifecycle Mapping Problem

->install maven development tool 

#build error 2
[INFO] --- maven-gpg-plugin:1.6:sign (sign-artifacts) @ ent4j-archetype-print ---
gpg: no default secret key: 秘密鍵が得られません
gpg: signing failed: 秘密鍵が得られません
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 14.787 s
[INFO] Finished at: 2016-03-29T02:56:47+09:00
[INFO] Final Memory: 22M/60M
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-gpg-plugin:1.6:sign (sign-artifacts) on project ent4j-archetype-print: Exit code: 2 -> [Help 1]

need to gpg --gen-key