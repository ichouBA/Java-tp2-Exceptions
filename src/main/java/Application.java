
public class Application {
    public static void main(String[] args) {
       try {
           EntierNaturel entier = new EntierNaturel(12);
           System.out.println("val = "+ entier.getVal());
           entier.decrementer();
           entier.setVal(-12);
       }catch (NombreNegativeException e){
           System.out.printf(e.getMessage());
       }
    }
}
