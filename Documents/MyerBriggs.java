package assignment;

import java.util.Objects;
import java.util.Scanner;

public class MyerBriggs {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Briggs();
    }

    public static void Briggs(){
        String[] array = new String[20];
        array[0] = " A. Expand energy, Enjoy groups  B. Conserve energy, Enjoy one on one ";
        array[1] = " A. More outgoing, Think out loud   B. More reserved, Think to yourself ";
        array[2] = " A. Seek many tasks, public activities, interaction with others     B. seek private, solitary activities with quiet to concentrate ";
        array[3] = " A. external, communicative, express yourself   B. internal, reticent, keep to yourself ";
        array[4] = " A. active, initiate    B. reflective, deliberate ";
        array[5] = " A. interpret literally     B. look for means and possibilities ";
        array[6] = " A. practical, realistic, experiential   B. imaginative, innovative, theorotical ";
        array[7] = " A. standard, usual, conventional   B. different, novel, unique ";
        array[8] = " A. focus on here-and-now   B. look to the future, global prospective, big picture ";
        array[9] = " A. facts, things, what is  B. ideas, dreams, what could be, philosophical ";
        array[10] = " A. logical, thinking, questioning     B. empathetic, feeling, accommodating ";
        array[11] = " A. candid, straight forward, frank    B. tactful, kind, encouraging";
        array[12] = " A. firm, tend to criticize, hold the line     B. gentle, tend to appreciate, conciliate";
        array[13] = " A. tough-minded, just,    B. tender-hearted, merciful ";
        array[14] = " A. matter of fact, issue-oriented     B. sensitive, people-oriented, compassionate ";
        array[15] =  " A. organized, orderly    B. flexible, adaptable ";
        array[16] = " A. plan, schedule     B. unplanned, spontaneous ";
        array[17] = " A. regulated, structured      B. easygoing, live and let live ";
        array[18] = " A. preparation, plan ahead    B. go with the flow, adapt as you go";
        array[19] = " A. control, govern    B. latitude, freedom";
        array2(array);
    }

    public static void array2(String[] array) {
        String[] userResponses = new String[20];
        for ( int i = 0; i < array.length; i++){
            System.out.println(array[i]);
            String collection = inputCollector.next();
            userResponses[i] = collection;
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(userResponses[i]);
        }
        for (int i = 0; i < array.length; i = 1 + 4){
            String value = " A ";
            String value2 = " B ";
            int total = 0;
            int total2 = 0;
            if (Objects.equals(userResponses[i].value)) {
                total++;
            }
            else if (Objects.equals(userResponses[i].value2)){
                total2++;
            }
                if (total < total2) {
                    System.out.println(" Extrovert ");
                }
                else
                    System.out.println(" Introvert ");
        }
    }
}
