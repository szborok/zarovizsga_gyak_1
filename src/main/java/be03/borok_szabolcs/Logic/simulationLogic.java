package be03.borok_szabolcs.Logic;

import java.util.Random;
import be03.borok_szabolcs.UI.input;

public class simulationLogic {

    public static Integer milyenHozamVarhato(Integer buza) {
        //2.  Írjon egy függvényt  „milyenHozamVarhato”  néven, amely  egy véletlenszerűen generált, az időjárási 
        //viszonyokat jelző számot (intervalluma: [5-15]) Az év meghatározása: 9 alatt-átlag alatti, 12 felett-átlag 
        //feletti,  a köztes értékek  esetén-átlagos év várható)  és  az  elvetett  búza  mennyiségét  kapja  meg  bemeneti 
        //értékként. Ezek alapján, a két szám szorzataként, visszaadja a várható hozamot.

        Random rnd = new Random();
        return rnd.nextInt(5,16) * buza;
    }

    public static String milyenEvVarhato(Integer buza) {
        //3. Írjon egy újabb függvényt „milyenEvVarhato” néven, amely a várható hozam és az elvetett búza alapján 
        //visszaadja, hogy milyen év („átlag alatti”, „átlagos” vagy „átlag feletti” a 2. feladatban megfogalmazottak 
        //alapján) várható. A vizsgálatokat a függvény törzsében valósítsa meg a bemeneti paraméterek hányadosa alapján. 
        Integer hozam = milyenHozamVarhato(buza);

        if (hozam < 9) {
            return "átlag alatti";
        }
        else if (hozam > 12) {
            return "átlag feletti";
        }
        else {
            return "átlagos";
        }
    }

    public static void milyenHozamVarhatoUserInput() {
        //5. A várható hozamot a „milyenHozamVarhato” függvény felhasználásával, jelenítse meg a mintán látható formátumban. 

        //Add meg az elvetett búza mennyiségét tonnában! 6 
        //A várható hozam 60 tonna. 
        //A hozam alapján átlagos év várható. 
        //Add meg az elvetett búza mennyiségét tonnában! 8 
        //A várható hozam 104 tonna. 
        //A hozam alapján átlag feletti év várható. 
        //Add meg az elvetett búza mennyiségét tonnában! 7 
        //A várható hozam 42 tonna. 
        //A hozam alapján átlag alatti év várható. 
        //Add meg az elvetett búza mennyiségét tonnában! 

        Integer wheat = 0;
        String inputStr = null;

        System.out.println("Add meg az elvetett buza mennyiseget tonnaban!");

        while (wheat < 1) {
            
            try {
                inputStr = input.userInput();
                wheat = Integer.parseInt(inputStr);
            } catch (Exception e) {
                System.out.println("Egesz szamot pls.");
            }
        }
        
        Integer hozam = milyenHozamVarhato(wheat);
        System.out.println("A várható hozam " + hozam + " tonna.");
        System.out.println("A hozam alapján" + milyenEvVarhato(wheat) + " év várható.");
    }

}
