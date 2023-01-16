public class NombreNegativeException extends Exception {
    private int val;
    public NombreNegativeException(String message){
        super(message);
    }
    public NombreNegativeException(String message, int val){
        super(message);
        this.val=val;
    }
    public int getValErr(){
        return this.val;
    }
}
