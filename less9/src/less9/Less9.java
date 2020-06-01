/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less9;

/**
 *
 * @author 1cadmin
 */
public class Less9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
            //1
            String[] auto = {"Волга", "Чайка", "Жигули"};
            String result = "В гараже стоят машины: ";
            
            for(int i = 0; i < auto.length; i++){
                if(i != auto.length - 1)
                    result += auto[i] + ",";
                else
                    result += auto[i] + ".";
            }
            System.out.println(result);
        }
        {
            //2
            String str = "Строка из букв, цифр 492 и специальных символов %*;№?";
            int length = str.length();
            System.out.println("Длина строки = " + length);
        }
        {
            //3
            String str = "1 000 000 000";
            char[] chArray = str.toCharArray();
            
            for(int i = 0; i < chArray.length; i++){
                if(chArray[i] == ' '){
                    chArray[i] = '.';
                }
            }
            System.out.println(chArray);
            
        }
        {
            //4
            
        }
    }
    
}
