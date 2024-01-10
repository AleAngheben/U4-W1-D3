public class Rettangolo {

    private int latoLungo;
    private int latoCorto;


    //COSTRUTTORE
public Rettangolo(int latoLungo, int latoCorto){
    this.latoLungo = latoLungo;
    this.latoCorto = latoCorto;
}

//METODI

    public int getPerimetro(int latoLungo, int latoCorto){
    int a = latoLungo*2;
    int b = latoCorto*2;
    return a+b;
    }


    public int getArea(int latoLungo, int latoCorto){
    return latoLungo * latoCorto;
    }

    public void stampaRettangolo(Rettangolo rettangolo){

    System.out.println("Perimentro del rettangolo è di " + getPerimetro(rettangolo.latoLungo, rettangolo.latoCorto));
        System.out.println("Area del rettangolo è di " + getArea(rettangolo.latoLungo, rettangolo.latoCorto));
    }

    public void stampaDueRettangoli(Rettangolo ret1, Rettangolo ret2){

    int sommaArea = ret1.getArea(ret2.latoLungo, ret1.latoCorto) + ret2.getArea(ret2.latoLungo, ret2.latoCorto);
    int sommaPerimetro= ret1.getPerimetro(ret1.latoLungo, ret1.latoCorto) + ret2.getPerimetro(ret2.latoLungo, ret2.latoCorto);

    System.out.println("Somma delle aree dei due rettangoli = " + sommaArea );
        System.out.println("Somma dei perimetri dei due rettangoli = " + sommaPerimetro );
    }


}
