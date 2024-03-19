### 1. deleting and creating target directory
`rm -rf target && mkdir target`

### 2. set the destination directory for class files
``javac `find . -name "*.java"` -d ./target``

### 3. specify where to find user class files
`java -classpath ./target edu.school21.printer.app.Program PATH_TO_THE_FILE`

`example: java -classpath ./target edu.school21.printer.app.Program /home/regulusb/java/it.bmp`