import java.util.Arrays;

public class Aufgabe1 {

    //1
    public static int[] nichtAusreichenderNoten(int[] Noten){
        int[] nichtAusreichender=new int[Noten.length];
        int nALength=0;
        for (int i = 0; i < Noten.length; i++)
            if(Noten[i]<40)
                nichtAusreichender[nALength++] = Noten[i];
        return nichtAusreichender;
    }

    //2
    public static float durschnittsWert(int[] Noten){
        float average=0f;
        for(int i=0; i<Noten.length; i++)
            average+=Noten[i];
        average/=Noten.length;
        return average;
    }

    //3
    public static int[] notenRunden(int[] Noten){
        int[] notenRunden = new int[Noten.length];
        for(int i=0; i<Noten.length; i++)
            if(Noten[i]>37)
                if(Noten[i]%5>2)
                    notenRunden[i]=Noten[i]+(5-Noten[i]%5);
                else
                    notenRunden[i]=Noten[i];
            else
                notenRunden[i]=Noten[i];
        return notenRunden;
    }

    //4
    public static int maximalNote(int[] Noten){
        int max=0;
        for(int i=0; i<Noten.length; i++)
            if(Noten[i]>max)
                max=Noten[i];
        return max;
    }

    public static void main(String[] args) {
        int[] Noten={29,37,38,41,84,67};
        System.out.println("Die Noten Array ist: ");
        for(int i=0; i<Noten.length; i++)
            System.out.print(Noten[i]+" ");
        System.out.println();
        System.out.println();

        //1
        int[] nichtAusreichenderNoten=nichtAusreichenderNoten(notenRunden(Noten));
        int actualLength=0;
        for(int i=0; i<nichtAusreichenderNoten.length; i++)
            if(nichtAusreichenderNoten[i]>0)
                actualLength++;
        System.out.println("Die nicht Ausreichender Noten sind: ");
        for(int i=0;i<actualLength;i++)
            System.out.print(nichtAusreichenderNoten[i]+" ");
        System.out.println();
        System.out.println();

        //2
        float average=durschnittsWert(Noten);
        System.out.println("Die Durschnittwert des Notens ist: " + average);
        System.out.println();

        //3
        int[] gerundeteNoten=notenRunden(Noten);
        System.out.println("Die gerundete Noten sind:");
        for(int i=0;i<gerundeteNoten.length;i++)
            System.out.print(gerundeteNoten[i]+" ");
        System.out.println();
        System.out.println();
        /*for(int i=0; i<Noten.length; i++)
            System.out.print(Noten[i]+" ");*/

        //4
        int maxi=maximalNote(gerundeteNoten);
        System.out.println("Die maximale Note nach der Rundung ist: "+maxi);
        System.out.println();
    }
}
