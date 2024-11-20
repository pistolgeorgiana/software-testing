\<dependency\>
    \<groupId\>org.junit.jupiter\</groupId>
    \<artifactId\>junit-jupiter-params\</artifactId\>
    \<version\>5.6.1\</version\>
    \<scope\>test\</scope\>
\</dependency\>

1. Unlink maven project, re-add it and reload maven project from the maven tool window:: https://imgur.com/2bVzAuf
2. Delete the .idea folder and any *.iml files in your project folder and re-import the project from sources (https://www.jetbrains.com/help/idea/import-project-or-module-wizard.html)

If junit jupiter params lib is still not present, download the lib and add it manually like this:
1. Download the jar file: [junit-jupiter-params-5.6.1.jar](https://repo1.maven.org/maven2/org/junit/jupiter/junit-jupiter-params/5.6.1/junit-jupiter-params-5.6.1.jar)
2. ![image](https://github.com/user-attachments/assets/6e17d5e3-90d4-434a-8891-cda896eb78d5)
3. ![image](https://github.com/user-attachments/assets/bc2eb0ba-50cd-429c-b6f6-af83cab08559)
4. Select jar library for jupiter params.
5. ![image](https://github.com/user-attachments/assets/fbb835c7-210b-4889-b85e-69a1ee9f4759)
6. Click OK.


NOTE: more details you can find here https://www.jetbrains.com/help/idea/library.html#lib_levels.
