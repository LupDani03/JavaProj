import java.util.Arrays;

public class Aufgabe1 {

    static int[] nichtAusreichenderNoten(int[] Noten){
        int[] nichtAusreichender = new int[Noten.length];
        int nALength=0;
        for (int i = 0; i < Noten.length; i++)
            if(Noten[i]<38)
                nichtAusreichender[nALength++] = Noten[i];
        nALength--;
        return nichtAusreichender;
    }

    public static void main(String[] args) {
        int[] Noten={21,47,50,65,30,99,87};
        int actualLength=0;
        int[] nichtAusreichenderNoten=nichtAusreichenderNoten(Noten);
        for(int i=0; i<nichtAusreichenderNoten.length; i++)
            if(nichtAusreichenderNoten[i]>0)
                actualLength++;
        System.out.println("Die nicht Ausreichender Noten sind:");
        for(int i=0;i<actualLength;i++)
            System.out.print(nichtAusreichenderNoten[i]+" ");
    }
}
