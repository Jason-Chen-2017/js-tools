#批量 kill全部chrome进程
ps -ef|grep chrome|awk '{print $2}'| xargs kill -9
#批量 kill全部java进程
ps -ef|grep java|awk '{print $2}'| xargs kill -9