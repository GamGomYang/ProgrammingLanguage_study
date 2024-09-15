CC = gcc
CFLAGS = -Wall -Wextra -Werror
OBJS = pr02_02.o subnum.o
LIBS =

all: pr02_02

pr02_02: $(OBJS)
	$(CC) $(CFLAGS) $(OBJS) -o pr02_02 $(LIBS)

pr02_02.o: pr02_02.c
	$(CC) $(CFLAGS) -c pr02_02.c -o pr02_02.o

subnum.o: subnum.c
	$(CC) $(CFLAGS) -c subnum.c -o subnum.o



clean:
	rm -f $(OBJS) pr02_02 *.o core
