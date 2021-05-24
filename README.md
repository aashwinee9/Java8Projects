# Java8Projects

branch staging

**Overview**
Java provides a new additional package in Java 8 called java.util.stream. This package consists of classes, interfaces, and an enum to allows functional-style operations on the elements. You can use stream by importing java.util.stream package in your programs.

**Java Stream features**
Stream does not store elements. It simply conveys elements from a source such as a data structure, an array, or an I/O channel, through a pipeline of computational operations.
Stream is functional in nature. Operations performed on a stream does not modify its source. For example, filtering a Stream obtained from a collection produces a new Stream without the filtered elements, rather than removing elements from the source collection.
Stream is lazy and evaluates code only when required.
The elements of a stream are only visited once during the life of a stream. Like an Iterator, a new stream must be generated to revisit the same elements of the source.
You can use Stream to filter, collect, print, and convert from one data structure to other, etc.
