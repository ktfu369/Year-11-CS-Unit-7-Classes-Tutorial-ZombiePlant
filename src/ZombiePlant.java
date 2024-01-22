public class ZombiePlant {
    int potency;
    int successTreat;

    public ZombiePlant(int a,int b){
        potency = a;
        successTreat = b;
    }
    public int getPotency(){
        return potency;
    }

    public int treatmentsNeeded(){
        return successTreat;
    }

    public boolean isDangerous(){
        return successTreat >= 1;
    }

    public void treat(int po){
        if(po <= 0){

        }
        else if(po <= potency){
            successTreat = Math.max(0,successTreat-1);
        }else{
            successTreat ++ ;
        }
    }

}
