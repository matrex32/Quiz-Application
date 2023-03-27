//Importam pachetele pe care le vom folosi
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {

    //Incepem scrierea metodei
    public void test(){
        //Cream un obiect de tip Scanner pentru a-l lasa pe utilizator sa introduca raspunsul de la tastatura
        Scanner scanner = new Scanner(System.in);

        int raspunsuriCorecte = 0;//declaram variabila care va reprezenta raspunsurile corecte
        int raspunsuriGresite = 0;//declaram variabila care va reprezenta raspunsurile gresite

        //Incepem initierea obiectelor Intrebari
       Intrebari i1 = new Intrebari("Care este capitala Spaniei?", "A) Barcelona", "B) Madrid", "C) Roma", "D) Lisabona" );
       Intrebari i2 = new Intrebari("Care este cel mai mare oras din Romania?", "A) Craiova", "B) Iasi", "C) Bucuresti", "C) Cluj");
       Intrebari i3 = new Intrebari("In ce an a murit Mihai Viteazul?", "A) 1848", "B) 1601", "C) 1504", "D) 2013");
       Intrebari i4 = new Intrebari("Cine a fost Traian Basescu?", "A) Domnitor", "B) Director la BNR", "C) Presedinte", "D) Decan la UPB");
       Intrebari i5 = new Intrebari("Cand a avut loc batalia de la Waterloo?", "A) 1859", "B) 1916", "C) 1815", "D) 1595");

       //Folosim clasa HashMap pentru a stoca raspunsurile in memorie
       Map<Intrebari, Character> hmap = new HashMap<>();
       hmap.put(i1, 'B');
       hmap.put(i2, 'C');
       hmap.put(i3, 'B');
       hmap.put(i4, 'C');
       hmap.put(i5, 'C');

       for(Map.Entry<Intrebari,Character> map: hmap.entrySet()){
           System.out.println(map.getKey().getIntrebare());// Incepand cu linie 32 si terminand cu linia 36 vom afisa in ordine mai intai intrebarea si dupa raspunsurile,
           System.out.println(map.getKey().getOptiune1());//pentru fiecare obiect de tip Intrebari in parte
           System.out.println(map.getKey().getOptiune2());
           System.out.println(map.getKey().getOptiune3());
           System.out.println(map.getKey().getOptiune4());

           System.out.println("Introduceti raspunsul dumneavoastra: "); // Facem prima afisare in care ii zicem utilizatorului sa introduca raspunsul lui
           Character raspunsUtilizator = scanner.next().charAt(0);// Declaram variabila raspunsUtilizator de tip Character, folosim obiectul scanner creat mai devreme alaturi de functia next()
                                                                  //pentru a citi raspunsul introdus de utilizator, oferindu-i valoarea A,B,C sau D introdus de utilizator, iar folosirea functiei
                                                                  // charAt() ne ajuta sa obtinem caracterul dupa pozitia 0
           raspunsUtilizator = Character.toUpperCase(raspunsUtilizator);//Aceasta linie ne permite sa introducem de la tastatura si litera mica corespunzatoare raspunsului corect
           int raspuns = Character.compare(raspunsUtilizator,map.getValue()); //Comparam 2 variabile de tip char si stocam rezultatul in variabila raspuns

           if(raspuns == 0){
               System.out.println("Raspunsul este corect");//Am pus conditia ca daca variabila raspuns va avea valoarea 0, in urma compararii, ne va fi afist acest mesaj, ceea ce inseamna ca
                                                           //utilizatorul a raspuns corect la intrebare
               raspunsuriCorecte++;//Variabila raspunsuriCorecte se incrementeaza
           }else {
               System.out.println("Raspunsul este gresit");//In acest caz, daca variabila raspuns nu are valoarea 0, ne va fi afisat acest mesaj, ceea ce inseamna ca utilizatorul a raspuns gresit
               raspunsuriGresite++;// valoarea raspunsuriGresite se incrementeaza
           }

       }
        //Incepem sa facem afisarile aferente
        System.out.println();
        System.out.println("  ---  !! Rezultate !!  ---  ");
        System.out.println("Numarul de intrebari adresate este: " + hmap.size());//ne afiseaa numarul de intrebari care i-au fost puse utilizatorului

        if(raspunsuriCorecte == 1) {
            System.out.println("Ati raspuns corect la o singura intrebare intrebari");//ne afiseaza nr de raspunsuri corect
        }else{
            System.out.println("Ati raspuns corect la " + raspunsuriCorecte + " intrebari");//ne afiseaza nr de raspunsuri corect
        }

        if(raspunsuriGresite == 1){
            System.out.println("Ati raspuns gresit la o singura intrebare");//ne afiseaza nr de raspunsuri gresite
        }else {
            System.out.println("Ati raspuns gresit la " + raspunsuriGresite + " intrebari");//ne afiseaza nr de raspunsuri gresite
        }

        int procentaj = (100*raspunsuriCorecte)/hmap.size();//initiem de tip int variabila procentaj, care ne calculeaza procentajul testului obtinut de utilizator

        System.out.println("Procentajul testului este: " + procentaj + "%");//ne afiseaza care este procentajul testului

        if(procentaj >= 80){   //daca procentajul nostru este mai mare sau egal cu 80 ne este afisat mesajul de mai jos
            System.out.println("Aveti trecut testul cu o nota foarte buna");
        }else if(procentaj < 80 && procentaj >= 60){ //daca procenajul este mai mic sau egal cu 80 si mai mare sau egal cu 60 ne este afisat mesajul de mai jos
            System.out.println("Ati promovat, rezultatul este satisfacator");
        }else if(procentaj < 60){   //daca procentajul este mai mic decat 60 ne este afisat mesajul de mai jos
            System.out.println("Din pacate, nu ati promovat acest test");
        }
    }

}
