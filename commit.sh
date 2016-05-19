#!/bin/bash
for i in {1..144}
do
	git add .
	git commit -m 'Cracking the Coding Interview Algorithms Chapter 2'
	git push
	sleep 300
done
