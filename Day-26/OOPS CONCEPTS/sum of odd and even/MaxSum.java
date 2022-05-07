interface MyInterface{
    int[] arr={1,2,3,4,5};
    void sum();
}
class findsum implements MyInterface{
    int evensum=0;
    int oddsum=0;
    public void sum(){
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                evensum=evensum+arr[i];
            }
            else{
                oddsum=oddsum+arr[i];
            }
        }
        if(evensum>oddsum){
            System.out.println("even sum"+evensum);
        }
        else 
           System.out.println("odd sum"+oddsum);

    }
}
    class MaxSum extends findsum{
        public static void main(String args[]){
           MaxSum fs=new MaxSum();
           fs.sum();
        }
    }

    /* output 
    even sum9
    */