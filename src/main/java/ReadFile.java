import java.io.*;

public class ReadFile {

//    public void readFile() {
//        BufferedReader reader = null;
//        reader = new BufferedReader(new FileReader(args[0]));
//    }

    public static void main(String[] args) {
        ReadFile instance = new ReadFile();

        InputStream is = instance.getFileAsIOStream("demofile.txt");
        try{
            instance.printFileContent(is);

        }catch (IOException e  ) {
            e.getMessage();
        }
    }

    private InputStream getFileAsIOStream(final String filename) {
        InputStream ioStream = this.getClass().getClassLoader().getResourceAsStream(filename);

        if(ioStream == null) {
            throw new IllegalArgumentException(filename + " niet gevonden");
        }
        return ioStream;
    }

    private void printFileContent(InputStream inputStream) throws IOException {
        try(InputStreamReader isr = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(isr);) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            isr.close();
        }
    }

}
