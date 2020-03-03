import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BraccioMeccanico bm = new BraccioMeccanico();
        Bottiglia<Acqua> acquaBottiglia = new Bottiglia<>(new Acqua());
        Bottiglia<Vino> vinoBottiglia = new Bottiglia<>(new Vino());

        bm.prendiBottiglia(acquaBottiglia);
        bm.prendiBottiglia(vinoBottiglia);
        String[] array = new String[10];
        List<String> lista = new ArrayList<>();

        for(String el : lista){
            System.out.println(el);
        }


        for(int i = 0; i<array.length; i++){

        }
        File f = new File("C:\\Users\\Tony\\Documents\\intellij-ws\\study-prj\\test.txt");
        try {
            FileOutputStream fileOutputStream  = new FileOutputStream(f);
            String frase = " Meeglio soli che \n mal'accompagnati";

            fileOutputStream.write(frase.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();

            /*
            FileInputStream inputStream = new FileInputStream(f);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            int i;
            while((i = inputStream.read())>-1){
                System.out.print((char)i);
            }
            */
            BufferedReader bufferedReader = new BufferedReader(new FileReader(f));

            String st;
            while ((st = bufferedReader.readLine()) != null){
                    System.out.println(st);
            }
//            bufferedReader.lines().forEach(line->{
//                System.out.print(line);
//            });

        }catch (Exception e ){

        }




    }
}
