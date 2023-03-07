FROM ubuntu:18.04

ENV TZ=Europe/Madrid
ENV PLEXIL_HOME=/plexil

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN apt-get update && apt-get install -y \
    git \
    make \
    autotools-dev \
    autoconf \
    libtool \
    g++ \
    ant \
    gperf \
    openjdk-8-jdk \
    freeglut3-dev \
    libxi-dev \
    libxmu-dev

RUN git clone https://git.code.sf.net/p/plexil/git plexil
RUN git clone https://github.com/plexil-rwl-support/semantic-tests.git semantic-tests

RUN echo "export PLEXIL_HOME=$PLEXIL_HOME" >> /root/.bashrc
RUN echo "export PATH=$PLEXIL_HOME/scripts:$PATH" >> /root/.bashrc
RUN echo "source $PLEXIL_HOME/scripts/plexil-setup.sh" >> /root/.bashrc

RUN ["/bin/bash", "-c", "source ~/.bashrc"]

RUN cd $PLEXIL_HOME && make src/configure
RUN cd $PLEXIL_HOME/src && ./configure --prefix=$PLEXIL_HOME --enable-ipc --enable-module-tests --enable-viewer --enable-sas --enable-test-exec --enable-udp

RUN cd $PLEXIL_HOME && grep -lR "#if defined(HAVE_CSTRING)" . | xargs sed -i s/"#if defined(HAVE_CSTRING)"/"#include <cstring>\n#if defined(HAVE_CSTRING)"/g

COPY check-regression-errors.sh plexil/test/TestExec-regression-test/

RUN cd $PLEXIL_HOME && printf "\ncheck-regression-errors.sh\n" >>test/TestExec-regression-test/run-tests && chmod +x test/TestExec-regression-test/check-regression-errors.sh
RUN cd $PLEXIL_HOME && make

