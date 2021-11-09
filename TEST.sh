#!/bin/bash

n=$'\n'

declare -a expectedData
expectedData[1]="the${n}quick${n}brown${n}fox${n}jumps${n}over${n}the${n}lazy${n}dog"
expectedData[2]="brown${n}dog${n}fox${n}jumps${n}lazy${n}over${n}quick${n}the${n}the"
expectedData[3]="brown${n}dog${n}fox${n}jumps${n}lazy${n}over${n}quick${n}the"
expectedData[4]="brown=1${n}dog=1${n}fox=1${n}jumps=1${n}lazy=1${n}over=1${n}quick=1${n}the=2"
expectedData[5]="the=2${n}brown=1${n}dog=1${n}fox=1${n}jumps=1${n}lazy=1${n}over=1${n}quick=1"
expectedData[6]="the=2${n}brown=1${n}dog=1${n}fox=1${n}jumps=1${n}lazy=1${n}over=1${n}quick=1"
DataTest="the quick brown fox jumps over the lazy dog"
count=0
for (( i=1; i <= 6; i++ ))
do
    printf "task$i test\n"
    printf "input data: %s\n" "$DataTest"
    out=$(java -jar task$i.jar $DataTest)

    if [[ "${expectedData[$i]}" != "$out" ]];
     then
       printf "\ntest$i failed\n"
       ((count++))
     else
       printf "\n test$i passed\n"
    fi

    printf "\noutput data:\n\n$out"
    echo -e "\n"
    echo -e "${expectedData[$i]}"
done

if [[ $count != 0 ]];
 then
  printf "\nError occurred during test running\n"
  exit 1
 else
  printf "\nTest succsessful\n"
  exit 0
fi