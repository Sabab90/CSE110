
public class Practice1{
    public static void main(String [] args){
        for (int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                if(j > i) {
                    
                    continue; //outer;
                }
                System.out.print(" " + (i * j));
            }
            System.out.println();
        }
        
    }
}
        
        
//        for(int i=1; i<=9; i++){
//            int count=0;
//            for(int j=0; count<=i; j++){
//                if(j%i==0){
//                    System.out.print(j+" ");
//                    count++;
//                }
//            }
//           System.out.println(); 
//        }
//    }
//}