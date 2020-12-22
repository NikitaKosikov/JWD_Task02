package by.epam_training.homework02.entity;

import java.io.*;
import java.util.*;

public class ApplianceReader implements Iterator<String> {

    public Iterator<String> iterator() throws IOException {
        return takeLimit(10).iterator();
    }

    public Iterator<String> iterator(int count) throws IOException {
        return takeLimit(count).iterator();
    }
    public List<String> takeLimit(final int count ) throws IOException {
        List<String> stringsOfFile = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(
                    getClass().getResource("/appliances_db.txt").getPath()));
            String stringOfFile;
            for (int i = 0; i < count && (stringOfFile = bufferedReader.readLine()) != null; i++) {
                stringsOfFile.add(stringOfFile);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }
        return stringsOfFile;
    }

    public List<String> takeData() throws IOException {
        List<String> stringsOfFile = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(
                    getClass().getResource("/appliances_db.txt").getPath()));
            String stringOfFile;
            while ((stringOfFile = bufferedReader.readLine()) != null) {
                stringsOfFile.add(stringOfFile);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }
        return stringsOfFile;
    }

    public List<String> take(String applianceType) throws IOException {
        List<String> stringsOfFile = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(
                    getClass().getResource("/appliances_db.txt").getPath()));
            String stringOfFile;
            String[] ds;
            while ((stringOfFile = bufferedReader.readLine()) != null) {
                ds = stringOfFile.split(" : ");
                if (ds[0].equals(applianceType)) {
                    stringsOfFile.add(stringOfFile);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }
        return stringsOfFile;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }
}
