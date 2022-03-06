class Problem_6_3{

    public static void main(String args[]){

      for (char i = 'A'; i <='E'; i++) {
          for (char j = 'A'; j <= i; j++) {
            System.out.print('*');
          }
          System.out.println(" ");
      }  
    }
}