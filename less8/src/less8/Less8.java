/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less8;

import java.io.*;
import java.util.*;
/**
 *
 * @author 1cadmin
 */
public class Less8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        FileInputStream fileIn = null;
//        FileOutputStream fileOut = null;
//        
//        try{
//           
//            fileIn = new FileInputStream("./src/less8/file.txt");
//            fileOut = new FileOutputStream("./src/less8/copied_file.txt");
//            
//            int a;
//            
//            while((a = fileIn.read()) != -1){
//                fileOut.write(a);
//            }
//        } finally {
//            if(fileIn != null) {
//                fileIn.close();
//            }
//            if(fileOut != null) {
//                fileOut.close();
//            }
//        }
    {//1
        File f = null;
        String[] strs = {"First.txt", "Second.txt"};

        try {
            for(String s: strs) {
                f = new File(s);
                boolean bool = f.canExecute();
                String a = f.getAbsolutePath();
                System.out.print(a);
                System.out.println(" исполняется: " + bool);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    {//2
        File file = new File("Example.txt");
        file.createNewFile();
        
        FileWriter writer = new FileWriter(file);
        
        writer.write("Это простой пример,\n в котором мы осуществляем\n "
                + "с помощью языка Java\n запись в файл\n и чтение из файла\n");
        writer.flush();
        writer.close();
        
        FileReader fr = new FileReader(file);
        char[] a = new char[200];
        fr.read(a);
        
        for(char c: a){
            System.out.print(c);
        }
        fr.close();
    }
    {//3
        int i;
        double d;
        String s;
        char c;
        FileWriter fw = new FileWriter("test.txt");
        fw.write("a abdcd 10 12,1 wwe");
        fw.close();
        
        FileReader fr = new FileReader("test.txt");
        Scanner sc = new Scanner(fr);
        
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                i = sc.nextInt();
                System.out.println("int: " + i);
            } else if(sc.hasNextDouble()){
                d = sc.nextDouble();
                System.out.println("Double: " + d);
            } else if(sc.hasNextLine()){
                s = sc.next();
                System.out.println("String: " + s);
            } else {
                c = sc.next().trim().charAt(0);
                System.out.println("char: " + c);
            }
        }
        
    }
    {//4
        ByteArrayOutputStream outputByte = new ByteArrayOutputStream(12);
        
        while(outputByte.size() != 5){
            outputByte.write("hello".getBytes());
        }
        
        byte a[] = outputByte.toByteArray();
        System.out.println("Вывод содержимого:");
        
        for(int i = 0; i < a.length; i++){
            System.out.print((char)a[i] + " ");
        }
        System.out.println();
        
        int b;
        ByteArrayInputStream inputByte = new ByteArrayInputStream(a);
        System.out.println("Преобразование символов в верхний регистр:");
        
        for(int j = 0; j < 1; j++){
            while((b = inputByte.read()) != -1) {
                System.out.println(Character.toUpperCase((char) b));
            }
            inputByte.reset();
        }
    }
    }
    
}
