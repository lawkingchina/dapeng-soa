#!/bin/sh

export JVM_HOME='opt/oracle-server-jre'
export PATH=$JVM_HOME/bin:$PATH

PRGNAME=soa-service
ADATE=`date +%Y%m%d%H%M%S`
PRGDIR=`pwd`
dirname $0|grep "^/" >/dev/null
if [ $? -eq 0 ];then
   PRGDIR=`dirname $0`
else
    dirname $0|grep "^\." >/dev/null
    retval=$?
    if [ $retval -eq 0 ];then
        PRGDIR=`dirname $0|sed "s#^.#$PRGDIR#"`
    else
        PRGDIR=`dirname $0|sed "s#^#$PRGDIR/#"`
    fi
fi

LOGDIR=$PRGDIR/../logs
if [ ! -d "$LOGDIR" ]; then
        mkdir "$LOGDIR"
fi

CLASSPATH=$PRGDIR/classes

filelist=`find $PRGDIR/lib/* -type f -name "*.jar"`
for filename in $filelist
do
  CLASSPATH=$CLASSPATH:$filename
done

#DEBUG="-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=9997"
JMX="-Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=1091 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false"
JVM_OPTS="-Dfile.encoding=UTF-8 -Dsun.jun.encoding=UTF-8 -Dname=$PRGNAME -Xms512M -Xmx1024M -XX:+HeapDumpOnOutOfMemoryError -XX:+PrintGCDateStamps -Xloggc:$LOGDIR/gc-$PRGNAME-$ADATE.log -XX:+PrintGCDetails -XX:NewRatio=1 -XX:SurvivorRatio=30 -XX:+UseParallelGC -XX:+UseParallelOldGC -Dlog.dir=$PRGDIR/.."
SOA_BASE="-Dsoa.base=$PRGDIR/../ -Dsoa.run.mode=native"

process_exit() {
 ps -ef| grep ${PRGNAME} |grep -v grep |awk '{print $1}' | xargs kill
}

trap 'process_exit' SIGTERM SIGINT

nohup java -server $JVM_OPTS $SOA_BASE $DEBUG_OPTS $USER_OPTS  $E_JAVA_OPTS -cp ./dapeng-bootstrap.jar com.github.dapeng.bootstrap.Bootstrap >> $logdir/console.log 2>&1 &
echo $! > $logdir/pid.txt

nohup sh /opt/fluent-bit/fluent-bit.sh >> $logdir/fluent-bit.log 2>&1 &

## use while loop to prevent the bash exit..
while [ 1 == 1 ];do
    sleep 3;
done;