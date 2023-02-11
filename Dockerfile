FROM ubuntu:18.04

ENV TZ=Europe/Madrid
ENV PLEXIL_HOME=/plexil

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN apt-get update && apt-get install -y \
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


COPY ./plexil $PLEXIL_HOME

RUN echo "export PLEXIL_HOME=$PLEXIL_HOME" >> /root/.bashrc
RUN echo "export PATH=$PLEXIL_HOME/scripts:$PATH" >> /root/.bashrc
RUN echo "source $PLEXIL_HOME/scripts/plexil-setup.sh" >> /root/.bashrc

RUN ["/bin/bash", "-c", "source ~/.bashrc"]

RUN cd $PLEXIL_HOME && make src/configure
RUN cd $PLEXIL_HOME/src && ./configure --prefix=$PLEXIL_HOME --enable-ipc --enable-module-tests --enable-viewer --enable-sas --enable-test-exec --enable-udp

RUN cd $PLEXIL_HOME
RUN make

