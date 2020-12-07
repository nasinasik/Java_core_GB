package lesson5;

import java.io.*;

public class CSVfile {

    static class Table1 implements Serializable {

        private String[] header;
        private int[][] data;

        public Table1(String[] header, int[][] data) {
            this.header = header;
            this.data = data;
        }

        public Table1(String value1, int i, int i1) {
        }


        @Override
        public String toString() {
            return "Table{" +
                    "header='" + header + ";" +
                    "data='" + data + ";" +
                    '}';
        }
    }

    public static void main(String[] args) {
        //File file = new File("serialized.table");
        Table1 table1 = new Table1("Value1", 15, 200);
        Table1 table2 = new Table1("Value2", 200, 300);
        Table1 table3 = new Table1("Value3", 400, 500);


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.csv"))) {
            oos.writeObject(table1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.csv"))) {
            oos.writeObject(table2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.csv"))) {
            oos.writeObject(table3);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.csv"))) {
            Table1 readedTable = (Table1) ois.readObject();
            System.out.println(readedTable.header);
            System.out.println(readedTable.data);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

