interface Case{
    public static void move(){
        String str="VirithaVarma";
        String low="";
        String upr="";
        int len=str.length();
        char ch;
        for(int i=0;i<len;i++){
            ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                upr=upr+ch;
            }
            else{
                low=low+ch;
            }
        }
        
        String result=low+upr;
        System.out.println(result);
        return;
    }
}
public class EndofString implements Case{
    public static void move(){

    }
    public static void main(String[] args) {
        Case.move();
    }

}

// output
//irithaarmaVV