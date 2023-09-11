public class demenagement {
    int nbCarton;
    int truckSize;

    public demenagement(int carton, int truck){
        nbCarton= carton;
        truckSize= truck;
    }

    public void voyage(){
        while (nbCarton!=0) {
            if (nbCarton >= truckSize) {
                System.out.println("Un voyage de " + truckSize + " cartons");
                nbCarton -= truckSize;
            } else {
                System.out.println("Un voyage de " + nbCarton + " cartons");
                nbCarton=0;
            }
        }
    }
    public static void main(String[] args){
        demenagement company= new demenagement(34,9);

        company.voyage();
    }
}
