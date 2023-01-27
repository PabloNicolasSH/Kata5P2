package kata5.loader.impl;

import kata5.loader.Loader;

import java.io.*;
import java.util.Iterator;

public class FileLoader implements Loader {
    private final File file;

    public FileLoader(File file) {
        this.file = file;
    }

    @Override
    public Iterable<String> items() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return createIterator();
            }
        };
    }

    private Iterator<String> createIterator() {
        return new Iterator<String>() {
            final BufferedReader reader = createReader();
            String nextLine = nextLine();

            @Override
            public boolean hasNext() {
                return nextLine != null;
            }

            @Override
            public String next() {
                String line = nextLine;
                nextLine = nextLine();
                return line;
            }

            private BufferedReader createReader() {
                try {
                    return new BufferedReader(new FileReader(file));
                } catch (FileNotFoundException ex) {
                    return null;
                }
            }

            private String nextLine() {
                try {
                    return reader.readLine();
                } catch (IOException ex) {
                    return null;
                }
            }
        };
    }

}
