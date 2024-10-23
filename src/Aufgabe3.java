public class Aufgabe3 {

    //1
    public static int[] summe(int[] s1, int[] s2) {
        int[] result = new int[s1.length + 1];
        int carry=0;
        for(int i=s1.length-1; i>=0; i--) {
            int summe=s1[i]+s2[i]+carry;
            carry=summe / 10;
            result[i+1] = summe % 10;
        }
        result[0] = carry;
        return result;
    }

    //2
    public static int[] differenz(int[] d1, int[] d2) {
        int[] result = new int[d1.length];
        int borrow=0,diff;
        for(int i=d1.length-1; i>=0; i--) {
            if(i>0){
                diff=d1[i]-d2[i]-borrow;
                if(diff<0) {
                    diff=diff+10;
                    borrow=1;
                }else {
                    borrow = 0;
                }
                result[i] = diff;
            }
            else {
                if(d1[i]-d2[i]<0) {
                    result[i]=10+d1[i]-d2[i];
                    result[i]=result[i]*-1;
                }
                else{
                    diff=d1[i]-d2[i]-borrow;
                    if(diff<0) {
                        diff=diff+10;
                        borrow=1;
                    }else {
                        borrow = 0;
                    }
                    result[i] = diff;
                }
            }
        }
        return result;
    }

    //3
    public static int[] produkt(int[] p1, int number) {
        int[] result = new int[p1.length + 1];
        int carry=0,negativeFlag=0;
        if(number==0)
            return result;
        else if(number<0) {
            negativeFlag = 1;
            number = -number;
        }
        for(int i=p1.length-1; i>=0; i--) {
            int prod=p1[i]*number+carry;
            carry=prod / 10;
            result[i+1] = prod % 10;
        }
        result[0] = carry;
        if(negativeFlag==1)
            for(int i=0; i< result.length; i++) {
                if(result[i]!=0) {
                    result[i] *= -1;
                    break;
                }
            }
        return result;
    }

    //4
    public static int[] division(int[] div1, int number) {
        int[] result = new int[div1.length];
        int rest=0,negativeFlag=0;
        if(number==0)
            return result;
        else if(number<0) {
            negativeFlag = 1;
            number = -number;
        }
        for(int i=0; i< div1.length; i++) {
            int current=rest*10+div1[i];
            result[i]=current/number;
            rest=current%number;
        }
        if(negativeFlag==1)
            for(int i=0; i< result.length; i++) {
                if(result[i]!=0) {
                    result[i] *= -1;
                    break;
                }
            }
        return result;
    }

    public static void main(String[] args) {
        //1
        int[] s1={1,3,0,0,0,0,0,0,0},s2={8,7,0,0,0,0,0,0,0};
        int[] result1 = summe(s1,s2);
        System.out.println("Die Summe Array ist: ");
        for(int i=0; i<result1.length; i++) {
            System.out.print(result1[i]+" ");
        }
        System.out.println();

        //2
        int[] d1={8,3,0,0,0,0,0,0,0},d2={5,4,0,0,0,0,0,0,0};
        int[] result2 = differenz(d1,d2);
        System.out.println("Die Differenz Array ist: ");
        for(int i=0; i<result2.length; i++) {
            System.out.print(result2[i]+" ");
        }
        System.out.println();

        //3
        int[] p1={2,3,6,0,0,0,0,0,0};
        int[] result3 = produkt(p1,2);
        System.out.println("Die Produkt Array ist: ");
        for(int i=0; i<result3.length; i++) {
            System.out.print(result3[i]+" ");
        }
        System.out.println();

        //4
        int[] div1={2,3,6,0,0,0,0,0,0};
        int[] result4 = division(div1,2);
        System.out.println("Die Divisions Array ist: ");
        for(int i=0; i<result4.length; i++) {
            System.out.print(result4[i]+" ");
        }
        System.out.println();
    }
}
