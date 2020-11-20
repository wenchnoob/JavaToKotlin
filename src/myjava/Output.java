package myjava;

import java.io.BufferedOutputStream;
import java.io.IOException;

// All this just to see how much faster a buffered output works than a regular sys.println
public class Output {

    public static void main(String[] args) throws IOException {
        try {
            Class.forName("myjava.Output");
            int times = 10000;
            long standardPrintTime = time(new sysPrint(), times);
            System.out.println();
            long bufferedPrintTime = time(new bufPrint(), times);

            System.out.printf("\nThe standard time is: %d \nThe buffered time is: %d", standardPrintTime, bufferedPrintTime);
        } catch (ClassNotFoundException e) {
        }

    }

    public static long time(Print p, int j) throws IOException {
        long start = System.nanoTime();
        p.print(j);
        long end = System.nanoTime();
        return end - start;
    }

}

// Also utilized interfaces for passing a method
interface Print {
    public void print(int j) throws IOException;
}

class sysPrint implements Print { // Kind of creates a carrier object for the print method, like I assume python does implicitly
    // because methods are objects in python
    public void print(int j) {
        for(int i = 0; i < j; i++) System.out.print('a');
    }
}

class bufPrint implements Print {
    public void print(int j) throws IOException {
        BufferedOutputStream bo = new BufferedOutputStream(System.out);
        for(int i = 0; i < j; i++) bo.write(97);
        bo.flush();
    }
}

