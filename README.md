# System
System utils is a library that helps you do impossible tasks easily. you can fetch hardware, operating system, logged in user information easily.

## Documentation

[Documentation](https://www.google.com)


## Authors

- [Mehdi Lavasani](https://github.com/mehdiprgm)


## Features

- Access installed memeory.
- Access CPU information.
- Fetch operating system information.
- Fetch current logged in user information.
- Access all system partitions.
- Access keyboard and system local information.
- Fetch installed jvm information from operating system.


## Installation

- Clone repository.
- Create new java project.
- Copy content of src folder project.
- Add libs folder to your project.

```bash
  git clone https://github.com/mehdiprgm/System.git
  cd System
  cp -r scr/ project_src_folder
  cp -r libs/ project_folder
```

## Usage/Examples

```java
package org.zendev.lib.system;

import org.zendev.lib.system.hardware.CPU;
import org.zendev.lib.system.hardware.Memory;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("OS");
        System.out.println("------------------------------");
        print("Name: %s\n", OS.getName());
        print("Kernel: %s\n", OS.getKernelModel());
        print("BIOS: %s\n", OS.getBIOSVersion());
        print("Local: %s\n", OS.getSystemLocale());

        System.out.println();
        System.out.println("User");
        System.out.println("------------------------------");
        print("Username: %s\n", User.getUsername());
        print("Home directory: %s\n", User.getHomeDirectory());
        print("Execute path: %s\n", User.getRunPath());

        System.out.println();
        System.out.println("CPU");
        System.out.println("------------------------------");
        print("Architecture: %s\n", CPU.getArchitecture());
        print("Name: %s\n", CPU.getName());
        print("Core(s): %d\n", CPU.getNumberOfCores());

        System.out.println();
        System.out.println("Memory");
        System.out.println("------------------------------");
        print("Total space: %s\n", Memory.getTotalSpace());
        print("Free space: %s\n", Memory.getFreeSpace());
        print("Used space: %d\n", Memory.getUsedSpace());

    }
    
    private static void print(String format, Object input) {
        System.out.printf(format, input);
    }
}

```

# 💫 About Me:
🌴 I'm 24 years old software engineer from Karaj, Iran<br><br>My skills<br><br>🍓 Android (Jetpack compose, Kotlin)<br>🍍 Web developer (Wordpress)<br>🍇 Desktop developer (Java, Swing)<br><br>I'm interested in computer and science technology.<br>I like going to gym, finding friends and programming. 


## 🌐 Socials:
[![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?logo=Instagram&logoColor=white)](https://instagram.com/mehdi.la.79) [![YouTube](https://img.shields.io/badge/YouTube-%23FF0000.svg?logo=YouTube&logoColor=white)](https://youtube.com/@@zendev_mehdi)

# 💻 Tech Stack:
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat-square&logo=openjdk&logoColor=white) ![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=flat-square&logo=kotlin&logoColor=white) ![Windows Terminal](https://img.shields.io/badge/Windows%20Terminal-%234D4D4D.svg?style=flat-square&logo=windows-terminal&logoColor=white) ![WordPress](https://img.shields.io/badge/WordPress-%23117AC9.svg?style=flat-square&logo=WordPress&logoColor=white) ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=flat-square&logo=mysql&logoColor=white) ![SQLite](https://img.shields.io/badge/sqlite-%2307405e.svg?style=flat-square&logo=sqlite&logoColor=white)

# 📊 GitHub Stats:
![](https://github-readme-stats.vercel.app/api?username=mehdiprgm&theme=radical&hide_border=false&include_all_commits=false&count_private=false)

![](https://github-readme-streak-stats.herokuapp.com/?user=mehdiprgm&theme=radical&hide_border=false)

![](https://github-readme-stats.vercel.app/api/top-langs/?username=mehdiprgm&theme=radical&hide_border=false&include_all_commits=false&count_private=false&layout=compact)

---
[![](https://visitcount.itsvg.in/api?id=mehdiprgm&icon=0&color=0)](https://visitcount.itsvg.in)

