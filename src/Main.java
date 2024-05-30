import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //NIZOVI

        int[] x;
        int y[];

//        int [] array = new int [4];
//        int array[] = new int [4];
//        array[0]=1;
//        array[1]=8;
//        array[2]=4;
//        array[3]=17;
//        array[4]=22;
//        int[] array = {1, 8, 4, 17, 22};
//        System.out.println(array[3]);

        //double [] niz = {17, "string neki", 3.758}; - nije dozvoljeno
        Object[] niz1 = {17, "string neki", 3.758}; // Može ovako ali izbegavajte ;)

        //Vežba 18

//        String[] pojmovi = {"Hearth", "Cherry", "Coin", "Melon", "Joker"};
//        System.out.println("Combination is:");
//
//        String[] combination = new String[5];
//        for (int i = 0; i < combination.length; i++) {
//            Random random = new Random();
//            int rand = random.nextInt(combination.length);
//            combination[i] = pojmovi[rand];
//            System.out.print(combination[i] + " ");
//        }

        /*
        prva iteracija: generiše se random broj od 0 do 4 npr 3]
                        combination[0] = pojmovi[3];
        druga iteracija:generiše se random broj od 0 do 4 npr 1]
                        combination[1] = pojmovi[1];
         */


        //preko FOR petlje:
//        String [] gradovi = {"Beograd","Zrenjanin", "Novi Sad", "Niš", "Leskovac"};
//        for(int i=0;i<gradovi.length;i++){
//            System.out.println(gradovi[i]);
//        }

        //preko FOREACH petlje
//        String [] gradovi = {"Beograd","Zrenjanin", "Novi Sad", "Niš", "Leskovac"};
//        for (String grad : gradovi) {
//            System.out.println(grad);
//        }

        //preko WHILE petlje
//        String [] gradovi = {"Beograd","Zrenjanin", "Novi Sad", "Niš", "Leskovac"};
//        int counter = 0;
//        while (counter< gradovi.length){
//            System.out.println(gradovi[counter++]);
//
//        }

        //Vežba 19

//        String[] pojam = {"bicikl", "automobil", "mobilni telefon"};
//        String[] naziv = {"Poni", "Audi", "Samsung Galaxy S24 Ultra"};
//        double[] cena = {50, 15000, 2000};
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(naziv[i] + " je tipa " + pojam[i] + " i njegova cena je: " + cena[i] + " EUR");
//        }


        int[][] multiArray = new int[5][3];
      //int[] array = {1, 8, 4, 17, 22};
        int[][] multiArray1 = {
                {2,3,8},
                {1,7,9}
        };

//        for(int i = 0;i< multiArray1.length;i++){
//            System.out.print (multiArray1[i][0]+"\t");
//            System.out.print (multiArray1[i][1]+"\t");
//            System.out.print (multiArray1[i][2]+"\n");
//        }
        for(int i = 0;i<multiArray1.length;i++){
            for(int j = 0;j<multiArray1[i].length;j++){
                System.out.print(multiArray1[i][j]+"\t");
            }
            System.out.println();
        }

//        System.out.println(multiArray1[1][2]);
//
//        int[][] multiArray2 = new int[3][];
//        multiArray2[0]= new int[3];
//        multiArray2[1]= new int[3];
//        multiArray2[2]= new int[3];


    }
}