//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

        Rettangolo rettangolo1 = new Rettangolo(10,5);
Rettangolo rettangolo2 = new Rettangolo(8,4);

//PRIMA PARTE ES
System.out.println("Dati rettangolo 1");
rettangolo1.stampaRettangolo(rettangolo1);
        System.out.println("");
        System.out.println("Dati rettangolo 2");
        rettangolo1.stampaRettangolo(rettangolo2);
        System.out.println("");

        //SECONDA PARTE ES
        System.out.println("Dati rettangoli sommati");
        rettangolo1.stampaDueRettangoli(rettangolo1,rettangolo2);
    }
}