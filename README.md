# [PENDU](https://github.com/Herra-dev/Pendu)
### by [Heriniaina RANDRIAMANANTSOA](https://github.com/Herra-dev)

***![#FF0000]Pendu is a simple console game written in Java :+1: :***

- [Add new language](#add-new-language)
- [Play with your friend](#play-with-your-friend)
- [Clone Pendu](#how-to-clone-repository)
- [Compilation and execution](#how-to-compile-and-execute-pendu)
- [Download Pendu](#how-to-download-pendu)
- [See few screenShots](#some-screenshots)
    
## Add new Language:
- **To <ins>add new language</ins> in the game:**
    - Name your file language as you want
    - Copy it to : directory/where/you/clone/game/assets/files/here or directory/where/you/decompressed/game/assets/files/here
    - That's all


## Play with your friend:
- **To <ins>Play with your friend</ins>: *(One of you set the hidden word and the another one guess it)***
    - When game start, choose **TWO** players

## How to clone repository:
- to clone Pendu execute this command: 
    git clone https://github.com/Herra-dev/Pendu directory/

## How to compile and execute Pendu:
- First, you must have: openjdk on your computer, to install it:
    - Windows: you can download it [here](https://learn.microsoft.com/fr-fr/java/openjdk/install?tabs=exe%2Chomebrew%2Cubuntu), after install it
    - Linux: 
        - Debian/Ubuntu/Mint: 
            - sudo apt update
            - sudo apt install openjdk-xx-jdk  *#sudo apt install openjdk-17-jdk for openjdk 17 for example*
        - Fedora/CentOS/AlmaLinux:
            - sudo dnf install java-xx-openjdk-devel
        - ArchLinux/Manjaro:
            - sudo pacman -S jdkxx-openjdk
- After, to compile **java** program:
    - javac Main.java -d classFolder 
    *#example for [PENDU](https://github.com/Herra-dev/Pendu):*
        - go to <ins>src</ins> directory
        - execute: javac *.java -d ../class (#this code compile all files with .java extension, generate classes files and put them into directory ../class)
- Finally, execute the output file:
    - java Main (Pay attention with this command: java + Main ***:point_right: no extension .class :point_left:*** (<ins>Main</ins> is the class name containing the method main()))
    
## How to download Pendu:
- ***Work In Progress***

## Some screenshots:
1. ![Pendu introduction](https://github.com/Herra-dev/Pendu/blob/main/assets/screenShots/Pendu0.png)
2. ![User has selected ONE player](https://github.com/Herra-dev/Pendu/blob/main/assets/screenShots/Pendu1.png)
3. ![User failed](https://github.com/Herra-dev/Pendu/blob/main/assets/screenShots/Pendu2Over.png)
4. ![User win](https://github.com/Herra-dev/Pendu/blob/main/assets/screenShots/Pendu2Win.png)
