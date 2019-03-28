# Delete-Unwanted-Word-using-Naive-formula
image:https://img.shields.io/badge/License-MIT-brightgreen.svg["LICENSE", link="https://github.com/Jahidul007/Delete-Unwanted-Word-using-Naive-formula/blob/master/LICENSE"] </br>
**Prerequisite : Printerwriter, BufferedReader**</br>

Given two files input.txt and delete.txt. Our Task is to perform file extraction(Input-Delete) and save the output in file say output.txt</br>
**Example**</br>
![example](https://user-images.githubusercontent.com/26745548/55197707-83100c00-51dd-11e9-93bc-8bd6d6a96fdc.png)</br>
**Naive Algorithm**</br>
```java
1. Create PrintWriter object for output.txt
2. Open BufferedReader for input.txt
3. Run a loop for each line of input.txt
   3.1 flag = false
   3.2 Open BufferedReader for delete.txt
   3.3 Run a loop for each line of delete.txt
      ->  If  line of delete.txt is equal to current line of input.txt 
            -> flag = true
            -> break loop

4. Check flag, if false
     -> write current line of input.txt to output.txt
5. Flush PrintWriter stream and close resources.
```
