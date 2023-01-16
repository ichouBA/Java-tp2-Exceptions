
public class Application {
    public static void main(String[] args) {
       try {
           EntierNaturel entier = new EntierNaturel(1);
           System.out.println("val = "+ entier.getVal());
           entier.decrementer();
           entier.decrementer();
           entier.setVal(-1);
       }catch (NombreNegativeException e){
           System.out.println(e.getMessage());
           System.out.println("Value causes the Error "+e.getValErr());
       }
    }
}
