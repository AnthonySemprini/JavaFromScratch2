//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static void main(String[] args) {

        /* Tableau basic */
        String[] names = new String[]{"Nbates", "Ken", "KEN"};
        System.out.println(names[1]);

        if (names[1].equalsIgnoreCase(names[2])){
            System.out.println("meme pseudo");
        }else{
            System.out.println("pseudo different");
        }

        int[] numbers = new int[]{12, 19, 20};
        System.out.println(numbers.length);
        int calcul =( numbers[0] + numbers[1] + numbers[2]) / numbers.length;
        System.out.println(calcul);

        /* Tableau imbriqué */
        int[][] num = {
                {7, 2, 9},
                {11, 25, 34},
                {55, 78, 98}
        };
        System.out.println(num[0][2]);

        /* Mettre element String dans un tableau*/
        String pseudoss = "elf,sorcier,troll,killer";
        String[] pseudos = pseudoss.split(",");
        System.out.println(pseudos.length);
        System.out.println(pseudos[0]);
        System.out.println(" Fin des tab");

        /* Boucles */
        for (int i = 0; i < 10; i++){
            System.out.println("ceci est le tour de la boucle " + i);
        }
        int[] notes = {9,6,5,4};
        int calc = 0;

        for( int note : notes ){
            calc = calc + note;
        }

        System.out.println("la moyenne est de " + (calc /notes.length));

        int i = 0;
        while (i != 7){
            i++;
            System.out.println("cheese / " + i);
        }

    }
}