# ガイド
https://maven.apache.org/guides/mini/guide-creating-archetypes.html

# add Mojo
https://books.sonatype.com/mvnref-book/reference/writing-plugins-sect-custom-plugin.html

# archetypeカタログの所在
http://repo.maven.apache.org/maven2/

# 配置コマンド
 cp -p  /Users/Aki/gitJavaEE7/jameba-archetype/archetype-catalog.xml /Users/Aki/gitJavaEE7/jameba-archetype/archetype-catalog.xml.bk
 rm -i /Users/Aki/gitJavaEE7/jameba-archetype/archetype-catalog.xml
 cd ~/.m2
 ln -s /Users/Aki/gitJavaEE7/jameba-archetype/archetype-catalog.xml archetype-catalog.xml

# archetypeより生成

## Run Configrationの設定
Base Directory:
${workspace_loc}

Goals:
archetype:generate

ParameterName	Value
groupId	com.mycompany.app
artifactId	my-app

interactiveMode	false

archetypeGroupId	org.jameba.archetype
archetypeArtifactId	jameba-archetype
archetypeVersion	0.1.0-SNAPSHOT

## カタログファイルの設定
/Users/Aki/.m2/archetype-catalog.xml
JBDSの環境設定にも設定 Preference->Maven->archetype

$ cat archetype-catalog.xml 
<archetype-catalog>
  <archetypes>
    <archetype>
      <groupId>org.jameba.archetype</groupId>
      <artifactId>jameba-archetype</artifactId>
      <version>0.1.0-SNAPSHOT</version>
      <description>Blank Project for React.js</description>
    </archetype>
  </archetypes>
</archetype-catalog>

## 生成したmavenプロジェクトのJDBSへの読込
archetype:generateで生成したMavenプロジェクトは自動では読み込まれないため
ファイル->Import->Maevn->Exsitng Maven Projectを選択する

## 使い方
### archetypeのビルド
clean install

### archetypeのビルド
Run ConfigrationのMainタブのGoalsに以下を記述
archetype:generate ¥
-DarchetypeGroupId=org.jameba.archetype -DarchetypeArtifactId=jameba-archetype -DarchetypeVersion=0.1.0-SNAPSHOT ¥
-DinteractiveMode=false ¥
-DgroupId=com.mycompany.app -DartifactId=my-app2

例1:
archetype:generate -DarchetypeGroupId=org.jameba.archetype -DarchetypeArtifactId=jameba-archetype -DarchetypeVersion=0.1.0-SNAPSHOT -DinteractiveMode=false -DgroupId=com.mycompany.app -DartifactId=my-app2 -Dversion=1.0.0-SNAPSHOT

例2(帳票 プロトタイプ):
archetype:generate -DarchetypeGroupId=org.jameba.archetype -DarchetypeArtifactId=report-sample-archetype -DarchetypeVersion=0.1.0 -DinteractiveMode=false -DgroupId=com.mycompany.print -DartifactId=my-print1 -Dversion=1.0.0-SNAPSHOT

例2(帳票):
archetype:generate -DarchetypeGroupId=org.ent4j.archetype -DarchetypeArtifactId=ent4j-print-sample -DarchetypeVersion=0.1.0 -DinteractiveMode=false -DgroupId=com.mycompany.print -DartifactId=my-print1 -Dversion=1.0.0-SNAPSHOT

archetype:generate -DarchetypeGroupId=org.ent4j.archetype -DarchetypeArtifactId=ent4j-archetype-print -DarchetypeVersion=0.1.0 -DinteractiveMode=false -DgroupId=com.mycompany.print -DartifactId=my-print2 -Dpackage=com.mycompany.print -Dversion=1.0.0-SNAPSHOT

例3(バッチ):
archetype:generate -DarchetypeGroupId=org.ent4j.archetype -DarchetypeArtifactId=ent4j-archetype-batch -DarchetypeVersion=0.1.0 -DinteractiveMode=false -DgroupId=com.mycompany.batch -DartifactId=my-batch2 -Dpackage=com.mycompany.batch -Dversion=1.0.0-SNAPSHOT

archetype:generate -DarchetypeGroupId=org.ent4j.archetype -DarchetypeArtifactId=ent4j-archetype-batch-war -DarchetypeVersion=0.1.0 -DinteractiveMode=false -DgroupId=com.mycompany.batch -DartifactId=my-batch3 -Dpackage=com.mycompany.batch -Dversion=1.0.0-SNAPSHOT


#(参考)雛形の作り方
project-new
project-set-compiler-version

# 実行エラーの例
[INFO] Generating project in Batch mode
[INFO] Archetype repository not defined. Using the one from [org.jameba.archetype:report-sample-archetype:0.1.0-SNAPSHOT] found in catalog local
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Old (1.x) Archetype: report-sample-archetype:0.1.0
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: basedir, Value: /Users/Aki/workspace900_20151017
[INFO] Parameter: package, Value: com.mycompany.app
[INFO] Parameter: groupId, Value: com.mycompany.app
[INFO] Parameter: artifactId, Value: my-app2
[INFO] Parameter: packageName, Value: com.mycompany.app
[INFO] Parameter: version, Value: 1.0.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 02:40 min
[INFO] Finished at: 2016-03-14T20:00:02+09:00
[INFO] Final Memory: 14M/139M
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-archetype-plugin:2.4:generate (default-cli) on project standalone-pom: Directory my-app2 already exists - please run from a clean directory -> [Help 1]

# font link
https://osdn.jp/projects/ipafonts/releases/