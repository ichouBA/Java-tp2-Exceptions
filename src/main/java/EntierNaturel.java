public class EntierNaturel {
    private int val;
    private String message ="please try to use a positive Number";
    public EntierNaturel(int nbr) throws NombreNegativeException{
       this.throwError(nbr);
        val = nbr;
    }

    public int getVal(){
        return this.val;
    }

    public void setVal(int val) throws NombreNegativeException {
        if(val<0) throw new NombreNegativeException(this.message);
        this.val = val;
    }

    public void decrementer() throws NombreNegativeException{
        if(this.val<0) throw new NombreNegativeException("the value can't be decremented anymore");
        this.val+=1;
    }
    public void throwError(int nbr) throws NombreNegativeException{
        if(nbr<0) throw new NombreNegativeException(this.message);
        else return ;
     }
}
