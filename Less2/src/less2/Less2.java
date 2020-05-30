/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less2;

/**
 *
 * @author 1cadmin
 */
public class Less2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1
        {
            int num1 = 3;
            int num2 = 3;
            
            if (num1 > num2){
                System.out.println("Первое число больше второго");
            }
            else if(num1 < num2){
                System.out.println("Первое число меньше второго");
            } 
            else{
                System.out.println("Числа равны");
            }
            
        }
        
        //2
        {
            int month = 3;
            String monthString;
            switch(month){
                case 1: monthString = "Январь";
                break;
                case 2: monthString = "Февраль";
                break;
                case 3: monthString = "Март";
                break;
                case 4: monthString = "Апрель";
                break;
                case 5: monthString = "Май";
                break;
                case 6: monthString = "Июнь";
                break;
                case 7: monthString = "Июль";
                break;
                case 8: monthString = "Август";
                break;
                case 9: monthString = "Сентябрь";
                break;
                case 10: monthString = "Октябрь";
                break;
                case 11: monthString = "Ноябрь";
                break;
                case 12: monthString = "Декабрь";
                break;
                default: monthString = "Неизвестный месяц";
            }
            System.out.println(monthString);
        }
        
        //3
        {
            int month = 4;
            String season;
            switch(month){
                case 12:
                case 1:
                case 2:
                    season = "Зима";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Весна";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Лето";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Осень";
                    break;
                default:
                    season = "Нет такого месяца";
            }
            System.out.println("Апрель - это " + season + ".");
        }
    }
    
}
