

## 用 linux shell 写一个杀死 java 进程的脚本

以下是一个简单的 shell 脚本，用于杀死所有的 Java 进程：

```
#!/bin/bash
# 查找所有的 Java 进程 ID，并杀死它们
ps -ef | grep java | grep -v grep | awk '{print $2}' | xargs kill -9
```

解释一下脚本的内容：

- `ps -ef`：查找所有的进程列表
- `grep java`：筛选包含“java”关键字的进程
- `grep -v grep`：去除掉 grep 进程本身
- `awk '{print $2}'`：提取出第二列（进程 ID）
- `xargs kill -9`：将进程 ID 作为参数传给 `kill -9` 命令，将进程杀死

执行 `chmod +x script.sh` 命令将脚本变为可执行文件，然后执行 `./script.sh` 即可杀死所有的 Java 进程。     