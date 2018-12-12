package com.eric.example.java8.chapter03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.function.Consumer;

/**
 * 环绕执行模式
 */
public class ExecuteAroundPattern {


    public static void main(String[] args) throws Exception{

        processFile((BufferedReader ::readLine));
    }

    public static String processFile(BufferReaderProcessor processor) throws Exception {
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return processor.process(br);
        }
    }
}

@FunctionalInterface
interface BufferReaderProcessor {

    String process(BufferedReader bufferedReader) throws Exception;

}