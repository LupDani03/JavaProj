public class Aufgabe4 {

    //1
    public static int billigsteTastatur(int[] tastatur){
        int mini=tastatur[0];
        for(int i=0;i<tastatur.length;i++){
            if(tastatur[i]<mini){
                mini=tastatur[i];
            }
        }
        return mini;
    }

    //2
    public static int teuersteProdukt(int[] tastatur,int[] usb){
        int maxi=tastatur[0];
        for(int i=0;i<tastatur.length;i++){
            if(tastatur[i]>maxi){
                maxi=tastatur[i];
            }
        }
        for(int i=0;i<usb.length;i++){
            if(usb[i]>maxi){
                maxi=usb[i];
            }
        }
        return maxi;
    }

    //3
    public static int teuersteInBudget(int[] preise,int budget){
        int maxi=preise[0];
        for(int i=0;i<preise.length;i++){
            if(budget<=preise[i]){
                if(preise[i]>maxi){
                    maxi=preise[i];
                }
            }
        }
        return maxi;
    }

    //4
    public static int maximalenGeldbetrag(int[] tastatur,int[] usb,int budget){
        int summe=0,maxi=0;
        for(int i=0;i<tastatur.length;i++){
            for(int j=0;j<usb.length;j++){
                summe=tastatur[i]+usb[j];
                if(summe<budget && summe>maxi){
                    maxi=summe;
                }
            }
        }
        if(maxi==0)
            return -1;
        else
            return maxi;
    }


    public static void main(String[] args) {
        //1
        int[] tastaturen={40,35,70,15,45};
        System.out.println("Die billigste Tastatur ist "+
                billigsteTastatur(tastaturen)+" euro");
        System.out.println();

        //2
        int[] tastatur={15,20,10,35},usbs={20,15,40,15};
        System.out.println("Die teuerste Gegenstand ist "+
                teuersteProdukt(tastatur,usbs)+" euro");
        System.out.println();

        //3
        int[] preise={15,10,45,20};
        int budget=30;
        System.out.println("Die teuerste USB in Budget ist "+
                teuersteInBudget(preise,budget)+" euro");
        System.out.println();

        //4
        int[] tastature={40,50,60},usb={8,12};
        budget=60;
        System.out.println("Die teuerste Setup ist "+
                maximalenGeldbetrag(tastature,usb,budget)+" euro");
        System.out.println();
    }
}
