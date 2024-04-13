package H0B;

public class Dessert {
    int flavor;
    int price;
    public Dessert(int flavor,int price){
        this.flavor = flavor;
        this.price = price;
        numDesserts = numDesserts +1;
    }
//One static variable int numDesserts that keeps track of the number of desserts created so far
    //static修饰的变量，赋值不跟对象走，一个类就一个值
    static int numDesserts;
    public void printDessert(){
        System.out.println(""+ this.flavor + "," + this.price + "," + numDesserts);
    }

    public static void main(String[] args){
        Dessert dessert1 = new Dessert(11,12);
        dessert1.printDessert();
        Dessert dessert2 = new Dessert(14,17);
        dessert2.printDessert();
    }
}
