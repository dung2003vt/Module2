

import java.io.*;
import java.util.List;

public class IOFile {
    public static void writeAccount(List<Account> accounts) {
        File file = new File("C:\\Modul2\\CaseStudy\\CaseStudy\\src\\account");
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Account account : accounts) {
                bufferedWriter.write(account.toString() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("lỗi: " + e);
        }
    }

    public static void readAccount(List<Account> accounts) {
        try {
            File file = new File("C:\\Modul2\\CaseStudy\\CaseStudy\\src\\account");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String c;
            String[] str;
            while ((c = bufferedReader.readLine()) != null) {
                str = c.split(",");
                accounts.add(new Account(str[1], str[2], str[3], (str[4]), str[5]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Lỗi: " + e);
        }
    }

    public void readProduct(List<Product> productList, TypeManage typeManage) {
        File file = new File("C:\\Modul2\\CaseStudy\\CaseStudy\\src\\product");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                String[] arrProduct = string.split(",");
                Type type = typeManage.getByNameType(arrProduct[5]);
                Product product = new Product(arrProduct[1], Double.parseDouble(arrProduct[2]),
                        arrProduct[4], Double.parseDouble(arrProduct[3]), type);
                productList.add(product);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println();
        }

    }

    public void writeProduct(List<Product> productList) {
        File file = new File("C:\\Modul2\\CaseStudy\\CaseStudy\\src\\product");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Product p : productList) {
                bufferedWriter.write(p.toString() + "\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeType(List<Type> types) {
        File file = new File("C:\\Modul2\\CaseStudy\\CaseStudy\\src\\type");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Type t : types) {
                bufferedWriter.write(t.toString() + "\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readType(List<Type> types) {
        File file = new File("C:\\Modul2\\CaseStudy\\CaseStudy\\src\\type");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                String[] arrType = string.split(",");
                Type type = new Type(arrType[1]);
                types.add(type);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

