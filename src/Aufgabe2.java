public class Aufgabe2 {

    //1
    public static int maximalZahl(int[] zahlen){
        int maxim=zahlen[0];
        for (int i=1;i<zahlen.length;i++)
            if (zahlen[i]>maxim)
                maxim=zahlen[i];
        return maxim;
    }

    //2
    public static int minimalZahl(int[] zahlen){
        int minim=zahlen[0];
        for (int i=1;i<zahlen.length;i++)
            if (zahlen[i]<minim)
                minim=zahlen[i];
        return minim;
    }

    //3
    public static int maximalSumme(int[] zahlen){
        int summe=0;
        for(int i=0;i<zahlen.length;i++)
            summe+=zahlen[i];
        summe-=minimalZahl(zahlen);
        return summe;
    }

    //4
    public static int minimalSumme(int[] zahlen){
        int summe=0;
        for(int i=0;i<zahlen.length;i++)
            summe+=zahlen[i];
        summe-=maximalZahl(zahlen);
        return summe;
    }

    public static void main(String[] args) {
        int[] zahlen={15,7,2,6,8,3,11};
        //1
        System.out.println("Die maximal Zahl ist: "+maximalZahl(zahlen));
        System.out.println();
        //2
        System.out.println("Die minimal Zahl ist: "+minimalZahl(zahlen));
        System.out.println();
        //3
        System.out.println("Die maximal Summe ist: "+maximalSumme(zahlen));
        System.out.println();
        //4
        System.out.println("Die minimal Summe ist: "+minimalSumme(zahlen));
        System.out.println();

    }
}
