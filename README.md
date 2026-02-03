# [PENDU](https://github.com/Herra-dev/Pendu)
### by [Heriniaina RANDRIAMANANTSOA](https://github.com/Herra-dev)

***Pendu is a simple console game written in Java :+1: :***

- [Add new language](#add-new-language)
- [Play with your friend](#play-with-your-friend)
- [Clone Pendu](#how-to-clone-repository)
- [Compilation and execution](#how-to-compile-and-execute-pendu)
- [Download Pendu](#how-to-download-pendu)
- [See few screenShots](#some-screenshots)
    
## Add new Language:
- **To <ins>add new language</ins> in the game:**
    - Name your file language as you want as long as its a readable file:**if your file isn't readable, Pendu will set the hidden word as "pendu"**
    - Copy it to : directory/where/you/clone/game/ressources/files/here or directory/where/you/decompressed/game/ressources/files/here
    - That's all, Pendu 


## Play with your friend:
- **To <ins>Play with your friend</ins>: *(One of you must set the hidden word and the another one guess it)***
    - When game start, choose **TWO** players

## How to clone repository:
- to clone Pendu execute this command: 
    git clone https://github.com/Herra-dev/Pendu directory/

## How to compile and execute Pendu:
- **First**, you must have: openjdk on your computer, to install it:
    - ***<ins>Windows</ins>***: you can be downloaded [here](https://learn.microsoft.com/fr-fr/java/openjdk/install?tabs=exe%2Chomebrew%2Cubuntu), after install it
    - ***<ins>Linux</ins>***: (change xx with the version you want to install)
        - *<ins>Debian/Ubuntu/Mint/..</ins>*: 
            - sudo apt update
            - sudo apt install openjdk-xx-jdk
        - *<ins>Fedora/CentOS/AlmaLinux/..</ins>*:
            - sudo dnf install java-xx-openjdk-devel
        - *<ins>ArchLinux/Manjaro/..</ins>*:
            - sudo pacman -S jdkxx-openjdk
- **After**, to compile **java** program:
    - javac Name.java -d classFolder 
    *#example for [PENDU](https://github.com/Herra-dev/Pendu):*
        - go to the directory <ins>src</ins>
        - execute: javac *.java -d directory/you/want/java/to/put/your/class/file (#this code compile all files with .java extension, generate classes files and put them into directory -> ***directory/you/want/java/to/put/your/class/file***)
- **Finally**, execute the output file:
    - go to: directory/where/have/put/your/class/file
    - execute: java App (Pay attention with this command: java + space + App :point_right: ***no extension .class*** :point_left: (<ins**>**App**</ins> is the class name containing the method main()))
    
## How to download Pendu:
- ***Work In Progress***

## Some screenshots:
1. ![Pendu introduction](https://github.com/Herra-dev/Pendu/blob/main/ressources/screenShots/Pendu0.png)
2. ![User has selected ONE player](https://github.com/Herra-dev/Pendu/blob/main/ressources/screenShots/Pendu1.png)
3. ![User failed](https://github.com/Herra-dev/Pendu/blob/main/ressources/screenShots/Pendu2Over.png)
4. ![User win](https://github.com/Herra-dev/Pendu/blob/main/ressources/screenShots/Pendu2Win.png)
