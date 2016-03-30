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

# setup workspace for eclipse
ln -s /home/jboss/git/ent4j-archetype/ent4j-archetype-parent/settings.xml settings.xml

ln -s /home/jboss/git/ent4j-archetype/ent4j-archetype-parent/archetype-catalog.xml archetype-catalog.xml

# Generate print applicaton from archetype
Maven-> Run configration -> Main tab

## Base Directory
${workspace_loc}

## Goals
archetype:generate -DarchetypeGroupId=org.ent4j.archetype -DarchetypeArtifactId=ent4j-archetype-print -DarchetypeVersion=0.1.0 -DinteractiveMode=false -DgroupId=com.mycompany.print -DartifactId=my-print2 -Dpackage=com.mycompany.print -Dversion=1.0.0-SNAPSHOT
 
### Import Maven Project
import and build and go

### for batch war
archetype:generate -DarchetypeGroupId=org.ent4j.archetype -DarchetypeArtifactId=ent4j-archetype-batch-war -DarchetypeVersion=0.2.0 -DinteractiveMode=false -DgroupId=com.mycompany.print -DartifactId=my-batchwar1 -Dpackage=com.mycompany.print -Dversion=1.0.0-SNAPSHOT