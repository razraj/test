public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        series(5);
     }
     
     public static void series(int n){
         
         for(int i = 0; i < n ; i++){
            int noz = 0;
            int no1 = 0;
            int no1p = 0;
            int nozp = 0;
            int z=0;
            if(n%2 == 0){
                noz=n-i;
                z=n+1;
            }
            else{
                noz = n-i-1;
                z=n;
            }
            for(int j = 0 ; j<z ; j++ ){
                if(noz%2 == 0){
                    //odd rows
                    if(nozp<(noz/2)){
                        System.out.print("_");
                        nozp++;
                    }else{
                        if(no1p<=i){
                            System.out.print("*");
                            no1p++;
                        }else{
                            System.out.print("_");
                        }
                    }
                }else{
                    //even rows
                    if(nozp<(noz/2)){
                        System.out.print("_");
                        nozp++;
                    }else{
                        if(no1p<=i){
                            if(j==z/2){
                                System.out.print("_");
                                nozp++;
                            }
                            else{
                                System.out.print("*");
                                no1p++;
                            }
                        }else{
                            System.out.print("_");
                        }
                    }
                }
            } 
            
             System.out.println("");
         }
         
     }
}
