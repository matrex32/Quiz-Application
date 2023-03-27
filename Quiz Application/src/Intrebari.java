public class Intrebari {

    //Incepem declararea principalelor variabile de tip String, deoarece le vom folosi pentru a formula intrebarile si raspunsurile
    private String intrebare;
    private String optiune1;
    private String optiune2;
    private String optiune3;
    private String optiune4;

   //Cream constructorul unde vom scrie intrebarile si raspunsurile
    public Intrebari(String intrebare, String optiune1, String optiune2, String optiune3, String optiune4){
        this.intrebare = intrebare;
        this.optiune1 = optiune1;
        this.optiune2 = optiune2;
        this.optiune3 = optiune3;
        this.optiune4 = optiune4;
    }

   //Vom face un getter si setter pentru fiecare variabila declarata de tip String.
    //Getterul il vom folosi pentru afisarea intrebarilor si raspunsurilor
    //Setterul poate fi folosit pentru schimbarea valorii acestor intrebari sau raspunsuri, fara a mai modifica ceva in constructor
    public String getIntrebare(){
        return intrebare;
    }
    public void setIntrebare(String intrebare){
        this.intrebare = intrebare;
    }

    public String getOptiune1(){
        return optiune1;
    }
    public void setOptiune1(String optiune1){
        this.optiune1 = optiune1;
    }

    public String getOptiune2(){
        return optiune2;
    }
    public void setOptiune2(String optiune2){
        this.optiune2 = optiune2;
    }

    public String getOptiune3(){
        return optiune3;
    }
    public void setOptiune3(String optiune3){
        this.optiune3 = optiune3;
    }

    public String getOptiune4(){
        return optiune4;
    }
    public void setOptiune4(String optiune4){
        this.optiune4 = optiune4;
    }
}
