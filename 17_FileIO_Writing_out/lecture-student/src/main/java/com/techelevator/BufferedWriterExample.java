package com.techelevator;

import java.io.*;

public class BufferedWriterExample {

    public static void main(String[] args) throws IOException {

        /*
         * Create a file and PrintWriter
         */
        String pathToNewFile= "C:\\Users\\Student\\source\\repos\\filmonghirmatzion-java-blue\\module-1\\17_FileIO_Writing_out\\lecture-student\\buffered.txt";
        File fileToWriteTo = new File(pathToNewFile);



        /*
         * To add buffering a Print Writer is still needed and will still do the writing.
         * A BufferedWriter is added and passed the Print Writer.  The Print Writer will still
         * write to the file and the buffered writer will provide buffering.
         *
         *      */

        try (PrintWriter printWriter = new PrintWriter(fileToWriteTo);
             BufferedWriter bufferedWriter = new BufferedWriter(printWriter)) {



            bufferedWriter.write( "write tsuing the but \n");



        }

    }
}
