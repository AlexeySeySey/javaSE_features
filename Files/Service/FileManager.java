package Service;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.nio.file.Files;
import Contract.Lambda.FileLineReaderClosure;
import java.nio.file.Paths;
import java.nio.file.Path;

public final class FileManager {

    private File file;

    private String filepath;

    public FileManager setFilePath(String filepath) {
        this.filepath = filepath;
        return this;
    }

    public FileManager setFile() throws Exception {

        this.file = new File(this.filepath);

        boolean fileExists = file.createNewFile();

        return this;
    }

    public FileManager write(String data) throws Exception {

        var writer = new FileWriter(this.filepath, false);
        writer.write(data);
        writer.close();

        return this;
    }

    public boolean delete() {
        return this.file.delete();
    }

    public FileManager clear() throws Exception {

        new FileWriter(this.filepath, false).close();

        return this;
    }

    public FileManager append(String data) throws Exception {

        var writer = new FileWriter(this.filepath, true);

        var bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(data);
        bufferedWriter.close();

        writer.close();

        return this;
    }

    public FileManager move(String to) {

        this.file.renameTo(new File(to));

        return this;
    }

    public FileManager copy(String to) throws Exception {

        Files.copy(Paths.get(this.filepath), Paths.get(to));

        return this;
    }

    public String read() throws Exception {
        return Files.readString(Paths.get(this.filepath));
    }

    public FileManager lineByLine(FileLineReaderClosure closure) throws Exception {

        FileReader freader = new FileReader(this.file);
        BufferedReader breader = new BufferedReader(freader);

        String line;
        while ((line = breader.readLine()) != null) {
            closure.handle(line);
        }
        breader.close();
        freader.close();

        return this;
    }
}