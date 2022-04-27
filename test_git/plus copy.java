class Plus{

   static void add(int x,int y){
        int plus = 0;
        for(int i=x;i<=y ;i++){
            plus += i;
        }
        System.out.println(plus);
   }
   
   public static void main(String[] args){
       add(0,5);
       add(1,4);
   }
    
}